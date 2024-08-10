package com.panel.admin_panel.service;

import com.panel.admin_panel.entity.User;
import com.panel.admin_panel.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
