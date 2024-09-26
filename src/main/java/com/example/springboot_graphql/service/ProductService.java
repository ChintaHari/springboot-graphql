package com.example.springboot_graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_graphql.entity.Product;
import com.example.springboot_graphql.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public Product updateStock(int productId, int quantity) {
        Product product = productRepository.findById(productId).get();
        product.setStock(quantity);
        return productRepository.save(product);
    }

    public Product addNewShipment(int productId, int quantity) {
        Product product = productRepository.findById(productId).get();
        product.setStock(product.getStock() + quantity);
        return productRepository.save(product);
    }
    
}
