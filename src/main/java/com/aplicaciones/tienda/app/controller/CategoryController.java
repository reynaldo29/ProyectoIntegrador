package com.aplicaciones.tienda.app.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplicaciones.tienda.app.entity.Category;
import com.aplicaciones.tienda.app.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	//INYECCIÓN DE DEPENDENCIAS
	@Autowired
	private CategoryService categoryService;
	
	//CREATE A NEW CATEGORY
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Category category){
		return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.save(category));
	}
	
	//READ ALL CATEGORIES
	@GetMapping
	public List<Category> readAll(){
		List<Category> categories = StreamSupport
				.stream(categoryService.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return categories;
	}
}
