package com.leadassignment.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Availability {
    private boolean inStock;
    private int quantity;

    // Constructors, getters, and setters
}

