package com.example.api.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.domain.Category;
import com.example.api.services.CategoryService;

// controller rest
@RestController
// respond with this endpoint
@RequestMapping(value="/categories")
public class CategoryResources {

	@Autowired
	private CategoryService service;
	
	// /categories/:id
	@RequestMapping(value="/{id}", method=RequestMethod.GET) // é preciso relacionar a função com o método http
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Category cat = service.find(id);		
		
		return ResponseEntity.ok().body(cat);
	}
}
