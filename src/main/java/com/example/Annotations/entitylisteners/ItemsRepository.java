package com.example.Annotations.entitylisteners;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<Items, Integer> {
}