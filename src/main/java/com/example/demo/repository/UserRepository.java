package com.example.demo.repository;

import com.example.demo.domain.User;  // Make sure this import is correct
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

