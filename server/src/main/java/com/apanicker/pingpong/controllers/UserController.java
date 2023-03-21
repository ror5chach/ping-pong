package com.apanicker.pingpong.controllers;

import com.apanicker.pingpong.model.AddUserRequest;
import com.apanicker.pingpong.model.User;
import com.apanicker.pingpong.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getBookById(@PathVariable String id) {
        return ResponseEntity.ok(userService.getBookById(id));
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody AddUserRequest request) {
        return ResponseEntity.ok(userService.addUser(request));
    }
}
