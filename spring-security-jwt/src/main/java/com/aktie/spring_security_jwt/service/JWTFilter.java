package com.aktie.spring_security_jwt.service;

import java.io.IOException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.aktie.spring_security_jwt.security.SecurityConfig;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JWTFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
    
        String token = request.getHeader(JWTCreator.HEADER_AUTHORIZATION);

        try {
            
            if (token != null && !token.isEmpty()) {
                var tokenObject = JWTCreator.create(token, SecurityConfig.PREFIX, SecurityConfig.KEY);
                
                List<SimpleGrantedAuthority> authorities = authorities(tokenObject.getRoles());

                var userToken = new UsernamePasswordAuthenticationToken(tokenObject.getSubject(), null, authorities);

                SecurityContextHolder.getContext().setAuthentication(userToken);
            } else {
                SecurityContextHolder.clearContext();
            }

            filterChain.doFilter(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();

            response.setStatus(HttpStatus.FORBIDDEN.value());

            return;
        }

    }

    private List<SimpleGrantedAuthority> authorities(List<String> roles) {
        return roles.stream()
            .map(SimpleGrantedAuthority::new)
            .toList();     
    }


}
