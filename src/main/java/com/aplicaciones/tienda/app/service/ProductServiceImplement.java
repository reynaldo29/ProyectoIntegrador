package com.aplicaciones.tienda.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aplicaciones.tienda.app.entity.Product;
import com.aplicaciones.tienda.app.repository.ProductRepository;

@Service
public class ProductServiceImplement implements ProductService{

	//INYECCIÓN DE DEPENDENCIA
	@Autowired
	private ProductRepository productRepository;
	@Override
	@Transactional(readOnly = true)
	public Iterable<Product> findAll() {
		
		return productRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Product> findAll(Pageable pageable) {
		
		return productRepository.findAll(pageable);
	}
	//BUSCA
	@Override
	@Transactional(readOnly = true)
	public Optional<Product> findById(Long id) {
		
		return productRepository.findById(id);
	}
	//REGISTRA
	@Override
	@Transactional
	public Product save(Product product) {
		
		return productRepository.save(product);
	}
	//ELIMINA
	@Override
	@Transactional
	public void deleteById(Long id) {
		productRepository.deleteById(id);
		
	}

}