package com.aplicaciones.tienda.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.aplicaciones.tienda.app.entity.Product;

public interface ProductService {
	//MUESTRA TODOS LOS PRODUCTOS
	public Iterable<Product> findAll();
	
	public Page<Product> findAll(Pageable pageable);
	
	public Optional<Product> findById(Long id);
	//Actualiza y registra
	public Product save(Product product);
	//Borrar
	public void deleteById(Long id);
}
