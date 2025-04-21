package com.example.demo.service;

import com.example.demo.domain.User;  // Correct import for User
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticateUser(String username, String password) {
        User user = userRepository.findByUsername(username);  // Using User class here
        return user != null && user.getPassword().equals(password);  // Ensure getPassword() exists
    }
}
