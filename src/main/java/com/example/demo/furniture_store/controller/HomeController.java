package com.example.demo.furniture_store.controller;

import com.example.demo.furniture_store.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("shopName", "Shivam Steel Art Modular Furniture");
        model.addAttribute("tagline", "Modular Kitchen & Storage Experts in Dadar");
        model.addAttribute("phone", "09930659427");
        model.addAttribute("address",
                "Shop No. 2, Safalya Building, SK Bole Rd, Dadar West, Mumbai - 400028"
        );

        List<Product> products = List.of(
                new Product(1L, "Modular Kitchen Setup", "Kitchen", 120000, "Complete modular kitchen with premium finish"),
                new Product(2L, "Kitchen Cabinets", "Storage", 40000, "Custom cabinets with smart space utilization"),
                new Product(3L, "Trolley Systems", "Kitchen", 15000, "Durable stainless steel kitchen trolley systems"),
                new Product(4L, "Wardrobe & Storage", "Storage", 55000, "Modern wardrobe with maximum storage efficiency")
        );

        model.addAttribute("products", products);

        return "index";
    }
}