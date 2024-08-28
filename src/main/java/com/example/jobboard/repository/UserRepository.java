package com.example.jobboard.repository;


import com.example.jobboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);//TODO implement optional interface
}
