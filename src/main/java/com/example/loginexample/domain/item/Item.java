package com.example.loginexample.domain.item;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    private Long id;
    private String name;
    private String price;
}
