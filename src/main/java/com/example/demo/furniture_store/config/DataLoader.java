package com.example.demo.furniture_store.config;

import com.example.demo.furniture_store.model.Product;
import com.example.demo.furniture_store.repository.ProductRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(ProductRepository repo) {
        return args -> {

            System.out.println("=== DATA LOADER RUNNING ===");

            repo.save(new Product(null, "Modular Kitchen", "Kitchen", 120000, "Premium kitchen setup"));
            repo.save(new Product(null, "Cabinet Design", "Storage", 40000, "Custom cabinets"));
            repo.save(new Product(null, "Steel Trolleys", "Kitchen", 15000, "Durable solutions"));

            System.out.println("=== DATA INSERTED ===");
        };
    }
}