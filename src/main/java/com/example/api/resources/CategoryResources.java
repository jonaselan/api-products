package com.example.api.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.domain.Category;

// controller rest
@RestController
// respond with this endpoint
@RequestMapping(value="/categories")
public class CategoryResources {

	// é preciso relacionar a função com o método http
	@RequestMapping(method=RequestMethod.GET)
	public List index() {
		Category cat1 = new Category(1, "Sim");
		Category cat2 = new Category(1, "Não");
		
		List<Category> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
		
		return list;
	}
}
