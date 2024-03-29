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
@RequestMapping("/ping")
public class PingController {

    @GetMapping
    public String getAsset() {
        return "pong";
    }
}
