package com.example.Annotations.indexing.repository;

import com.example.Annotations.indexing.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}