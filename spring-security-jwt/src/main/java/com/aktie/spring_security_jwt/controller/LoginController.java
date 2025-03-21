package com.aktie.spring_security_jwt.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aktie.spring_security_jwt.dto.LoginDTO;
import com.aktie.spring_security_jwt.dto.TokenDTO;
import com.aktie.spring_security_jwt.security.JWTObject;
import com.aktie.spring_security_jwt.security.SecurityConfig;
import com.aktie.spring_security_jwt.service.JWTCreator;
import com.aktie.spring_security_jwt.service.UserService;


@RestController
public class LoginController {
    
    @Autowired
    private UserService service;

    @PostMapping("/login")
    public TokenDTO handleLogin(@RequestBody LoginDTO dto) {

        var user = service.findByUsername(dto.username());

        if (user != null) {
            boolean passwordOk = service.validUserPassword(user.getPassword(), dto.password());

            if (!passwordOk) {
                throw new RuntimeException("Senha inválida para o login: " + dto.username());
            }

            JWTObject jwtObject = new JWTObject();

            jwtObject.setIssuedTime(LocalDateTime.now());
            jwtObject.setExpiration(LocalDateTime.now().plusHours(1));
            jwtObject.setRoles(user.getRoles());
            jwtObject.setSubject(user.getUsername());

            var token = JWTCreator.create(SecurityConfig.PREFIX, SecurityConfig.KEY, jwtObject);

            return new TokenDTO(dto.username(), token);

        }
        
        throw new RuntimeException("Erro ao tentar realizar o login!");
    }
    

}
