package com.example.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.domain.Category;
import com.example.api.repositories.CategoryRepository;

@Service
public class CategoryService {

	// Instanciar automaticamente pelo spring  
	@Autowired
	private CategoryRepository repo;
	
	public Category find(Integer id) {
		Optional<Category> obj = repo.findById(id);
		
		return obj.orElse(null);
	}
}
