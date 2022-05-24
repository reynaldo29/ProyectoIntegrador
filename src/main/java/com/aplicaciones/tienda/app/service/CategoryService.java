package com.aplicaciones.tienda.app.service;

import com.aplicaciones.tienda.app.entity.Category;

public interface CategoryService {
	public Iterable<Category> findAll();
	public Category save(Category category);
}
