package com.aplicaciones.tienda.app.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	
	private Long categoria_id;
	private Long pais_id;
	
	
	private double precio;
	private int stock;
	
	private String marca;
	
	private String talla;
	
	private String genero;
	
	private String img_delante;
	
	private String img_atras;
	
	private String img_costado;
	
	private String descripcion;
	
	private Date pub_date;

	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getImg_delante() {
		return img_delante;
	}

	public void setImg_delante(String img_delante) {
		this.img_delante = img_delante;
	}

	public String getImg_atras() {
		return img_atras;
	}

	public void setImg_atras(String img_atras) {
		this.img_atras = img_atras;
	}

	public String getImg_costado() {
		return img_costado;
	}

	public void setImg_costado(String img_costado) {
		this.img_costado = img_costado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getPub_date() {
		return pub_date;
	}

	public void setPub_date(Date pub_date) {
		this.pub_date = pub_date;
	}

	public Long getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(Long categoria_id) {
		this.categoria_id = categoria_id;
	}

	public Long getPais_id() {
		return pais_id;
	}

	public void setPais_id(Long pais_id) {
		this.pais_id = pais_id;
	}

}
