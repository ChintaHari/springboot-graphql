package com.example.springboot_graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboot_graphql.entity.Product;
import com.example.springboot_graphql.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @QueryMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @QueryMapping
    public List<Product> getProductByCategory(@Argument String category) {
        return productService.getProductByCategory(category);
    }

    @MutationMapping
    public Product updateStock(@Argument int productId, @Argument int stock) {
        return productService.updateStock(productId, stock);
    }

    @MutationMapping
    public Product addNewShipment(@Argument int productId, @Argument int quantity) {
        return productService.addNewShipment(productId, quantity);
    }
}
