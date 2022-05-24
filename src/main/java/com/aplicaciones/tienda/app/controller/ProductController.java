package com.aplicaciones.tienda.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplicaciones.tienda.app.entity.Product;
import com.aplicaciones.tienda.app.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	//INYECCIÓN DE DEPENDENCIAS
	@Autowired
	private ProductService productService;
	
	//CREATE A NEW PRODUCT
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Product product){
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
	}
	
	//READ A PRODUCT
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value="id") Long productId){
		Optional<Product> oProduct = productService.findById(productId);
		
		if(!oProduct.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oProduct);
	}
	
	//UPDATE AN PRODUCT
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Product productDetail, @PathVariable(value="id") Long productId){
		Optional<Product> product = productService.findById(productId);
		
		if(!product.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		//BeanUtils.copyProperties(productDetail, product.get());
		product.get().setNombre(productDetail.getNombre());
		product.get().setCategoria_id(productDetail.getCategoria_id());
		product.get().setPais_id(productDetail.getPais_id());
		product.get().setPrecio(productDetail.getPrecio());
		product.get().setStock(productDetail.getStock());
		product.get().setMarca(productDetail.getMarca());
		product.get().setTalla(productDetail.getTalla());
		product.get().setGenero(productDetail.getGenero());
		product.get().setImg_delante(productDetail.getImg_delante());
		product.get().setImg_atras(productDetail.getImg_atras());
		product.get().setImg_costado(productDetail.getImg_costado());
		product.get().setDescripcion(productDetail.getDescripcion());
		product.get().setPub_date(productDetail.getPub_date());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product.get()));
	}
	
	//DELETE PRODUCT
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete (@PathVariable(value="id") Long productId){
		if(!productService.findById(productId).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		productService.deleteById(productId);
		return ResponseEntity.ok().build();
	}
	
	//READ ALL PRODUCTS
	@GetMapping
	public List<Product> readAll(){
		List<Product> products = StreamSupport
				.stream(productService.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return products;
	}
}