package com.aktie.spring_security_jwt.service;

import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import com.aktie.spring_security_jwt.security.JWTObject;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTCreator {

    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String ROLES_AUTHORITIES = "authorities";

    public static String create(String prefix, String key, JWTObject jwtObject) {
        var token = Jwts.builder()
                .setSubject(jwtObject.getSubject())
                .setIssuedAt(Date.from(jwtObject.getIssuedTime().atZone(ZoneId.systemDefault()).toInstant()))
                .setExpiration(Date.from(jwtObject.getExpiration().atZone(ZoneId.systemDefault()).toInstant()))
                .claim(ROLES_AUTHORITIES, checkRoles(jwtObject.getRoles()))
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();

        return prefix.concat(" ").concat(token);
    }

    public static JWTObject create(String token, String prefix, String key) {
        var object = new JWTObject();

        token = token.replace(prefix, "").trim();

        Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();

        object.setSubject(claims.getSubject());
        object.setExpiration(claims.getExpiration().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        object.setIssuedTime(claims.getIssuedAt().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        object.setRoles((List) claims.get(ROLES_AUTHORITIES));

        return object;
    }

    private static List<String> checkRoles(List<String> roles) {
        return roles.stream()
                .map(role -> "ROLE_".concat(role.replaceAll("ROLE_", "")))
                .toList();
    }

}
