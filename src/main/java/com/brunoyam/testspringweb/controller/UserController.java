package com.brunoyam.testspringweb.controller;

import com.brunoyam.testspringweb.model.User;
import com.brunoyam.testspringweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public int insertUser(@RequestBody User user) {
        return this.userService.insertUser(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    @DeleteMapping
    public int deleteUser(@RequestParam("id") UUID id) {
        return this.userService.deleteUser(id);
    }
}
