package com.aktie.aktieapi.service.impl;

import java.util.NoSuchElementException;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.aktie.aktieapi.dto.UserDTO;
import com.aktie.aktieapi.model.User;
import com.aktie.aktieapi.repository.UserRepository;
import com.aktie.aktieapi.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(UserDTO dto) {

        var user = new User();

        BeanUtils.copyProperties(dto, user);

        if (user.getId() != null && repository.existsById(user.getId())) {
            throw new IllegalArgumentException("This User ID already exists.");
        }
        
        if (repository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException("This User email already exists.");
        }

        return repository.save(user);
    }

}
