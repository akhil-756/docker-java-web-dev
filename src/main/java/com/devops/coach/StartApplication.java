package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class EcommerceApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Welcome to Our E-commerce Store");
        model.addAttribute("msg", "Browse our products and start shopping!");
        return "index";
    }

    @GetMapping("/products")
    public String productList(final Model model) {
        // Retrieve a list of products from your database or service
        // Add the list of products to the model
        return "product-list";
    }

    @GetMapping("/product/{id}")
    public String productDetail(final Model model, @PathVariable Long id) {
        // Retrieve product details based on the given ID
        // Add product details to the model
        return "product-detail";
    }

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }
}
