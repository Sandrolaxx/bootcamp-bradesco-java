package com.aktie.aktieapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aktie.aktieapi.dto.UserDTO;
import com.aktie.aktieapi.model.User;
import com.aktie.aktieapi.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public ResponseEntity<User> create(@RequestBody UserDTO dto) {
        var entity = userService.create(dto);

        return ResponseEntity.status(201).body(entity);
    }

    @GetMapping()
    public ResponseEntity<User> findById(@RequestHeader Long id) {
        var entity = userService.findById(id);

        return ResponseEntity.ok(entity);
    }

}
