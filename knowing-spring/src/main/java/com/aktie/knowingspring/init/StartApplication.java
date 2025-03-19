package com.aktie.knowingspring.init;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aktie.knowingspring.model.User;
import com.aktie.knowingspring.repository.UserRepository;

@Component
public class StartApplication implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        User user = repository.findByUsername("admin");

        if (user == null) {
            user = new User("admin", "master123");
            user.setName("ADMIN");
            user.getRoles().add("MANAGERS");

            repository.save(user);
        }

        user = repository.findByUsername("user");

        if (user == null) {
            user = new User("user", "user123");
            user.setName("USER");
            user.getRoles().add("USERS");

            repository.save(user);
        }
        
    }
}
