package com.example.demo.furniture_store.repository;

import com.example.demo.furniture_store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}