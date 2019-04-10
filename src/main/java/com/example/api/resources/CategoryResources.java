package com.example.api.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// controller rest
@RestController
// respond with this endpoint
@RequestMapping(value="/categories")
public class CategoryResources {

	// é preciso relacionar a função com o método http
	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		return "sim";
	}
}
