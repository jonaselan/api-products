package com.example.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.api.domain.Category;
import com.example.api.domain.Product;
import com.example.api.repositories.CategoryRepository;
import com.example.api.repositories.ProductRepository;

@SpringBootApplication
public class FirstApiApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstApiApplication.class, args);
	}
	
	@Override
	public void run(String...  args) throws Exception {
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		Product p1 = new Product(null, "Computador", 2.000);
		Product p2 = new Product(null, "Mouse", 80.00);
		
		Product p3 = new Product(null, "Impressora", 200.00);
		Product p4 = new Product(null, "Lapís", 2.00);
		
		cat1.getProducts().addAll(Arrays.asList(p1, p2));
		cat2.getProducts().addAll(Arrays.asList(p3, p4));
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1));
		p3.getCategories().addAll(Arrays.asList(cat2));
		p4.getCategories().addAll(Arrays.asList(cat2));
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
	}
}
