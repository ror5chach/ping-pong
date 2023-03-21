package com.apanicker.pingpong.service;

import com.apanicker.pingpong.model.AddUserRequest;
import com.apanicker.pingpong.model.User;
import com.apanicker.pingpong.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getBookById(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new RuntimeException(String.format("No user found for id: %s", userId)));
    }

    public User addUser(AddUserRequest request) {
        User user = new User();
        BeanUtils.copyProperties(request, user);
        return userRepository.save(user);
    }
}
