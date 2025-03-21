package com.aktie.spring_security_jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.aktie.spring_security_jwt.model.User;
import com.aktie.spring_security_jwt.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    public void createUser(User user) {
        var pass = user.getPassword();

        user.setPassword(encode(pass));

        repository.save(user);
    }

    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public List<User> listAll() {
        return repository.findAll();
    }

    public String encode(String value) {
        return encoder.encode(value);
    }

    public boolean validUserPassword(String userPass, String payloadPass) {
        return encoder.matches(payloadPass, userPass);
    }
    
}
