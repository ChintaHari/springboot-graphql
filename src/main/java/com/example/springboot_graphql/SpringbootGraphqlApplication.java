package com.example.springboot_graphql;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springboot_graphql.entity.Product;
import com.example.springboot_graphql.repository.ProductRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootGraphqlApplication {

	@Autowired
	public ProductRepository productRepository;

	// @PostConstruct
	// public void initDB(){
	// 	List<Product> products = Stream.of(
	// 		new Product(101, "Laptop", "Electronics", 1000f, 10),
	// 		new Product(102, "Mobile", "Electronics", 500f, 20),
	// 		new Product(103, "Shirt", "Fashion", 250f, 30),
	// 		new Product(104, "Shoe", "Fashion", 100f, 40),
	// 		new Product(105, "TV", "Electronics", 2000f, 5)
	// 	).collect(Collectors.toList());

	// 	productRepository.saveAll(products);
	// }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootGraphqlApplication.class, args);
	}

}
