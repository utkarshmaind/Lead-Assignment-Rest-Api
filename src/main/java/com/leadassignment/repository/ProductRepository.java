package com.leadassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leadassignment.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

