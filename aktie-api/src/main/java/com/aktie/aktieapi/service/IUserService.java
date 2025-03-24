package com.aktie.aktieapi.service;

import com.aktie.aktieapi.dto.UserDTO;
import com.aktie.aktieapi.model.User;

public interface IUserService {
    
    User create(UserDTO user);
    
    User findById(Long id);
    
}
