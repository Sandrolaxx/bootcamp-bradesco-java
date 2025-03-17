package com.aktie.knowingspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aktie.knowingspring.model.User;
import com.aktie.knowingspring.repository.UserRepository;


@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserRepository repository;

    @GetMapping()
    @PreAuthorize("hasAnyRole('managers','users')")
    public List<User> getUsers() {
        return repository.listAll();
    }
    
    @GetMapping("/{username}")
    @PreAuthorize("hasRole('managers')")
    public User getOne(@PathVariable String username) {
        return repository.finByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.remove(id);
    }

    @PostMapping()
    public void create(@RequestBody User user) {
        repository.save(user);
    }

}
