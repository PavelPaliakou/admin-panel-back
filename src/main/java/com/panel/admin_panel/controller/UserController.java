package com.panel.admin_panel.controller;

import com.panel.admin_panel.entity.User;
import com.panel.admin_panel.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/users", produces = "application/json")
@CrossOrigin(origins = "http://admin-panel:8080")
public class UserController {
    private UserService userService;

    @GetMapping(path = "/all")
    public Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
