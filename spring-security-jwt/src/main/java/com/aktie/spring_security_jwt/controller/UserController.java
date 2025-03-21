package com.aktie.spring_security_jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aktie.spring_security_jwt.model.User;
import com.aktie.spring_security_jwt.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService service;

    @PostMapping()
    public void create(@RequestBody User user) {
        service.createUser(user);
    }

    @GetMapping()
    public List<User> listAll() {
        return service.listAll();
    }
    
    
}
