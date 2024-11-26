package com.example.Annotations.indexing.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
//@Table(name = "users", indexes = @Index(name = "idx_username", columnList = "username"))
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    // Getters and setters
}
