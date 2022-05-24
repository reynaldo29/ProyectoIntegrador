package com.aplicaciones.tienda.app.service;

import com.aplicaciones.tienda.app.entity.Country;

public interface CountryService {
	public Iterable<Country> findAll();
	public Country save(Country country);
}
