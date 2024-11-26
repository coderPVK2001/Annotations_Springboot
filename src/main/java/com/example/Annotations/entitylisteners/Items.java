package com.example.Annotations.entitylisteners;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "items")
@Data
@EntityListeners(value = ItemListener.class)
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String itemname;
    private int price;

}