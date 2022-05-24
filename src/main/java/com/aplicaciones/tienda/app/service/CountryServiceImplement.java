package com.aplicaciones.tienda.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aplicaciones.tienda.app.entity.Country;
import com.aplicaciones.tienda.app.repository.CountryRepository;
@Service
public class CountryServiceImplement implements CountryService {

	//INYECCIÓN DE DEPENDENCIA
	@Autowired
	private CountryRepository countryRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Country> findAll() {
		
		return countryRepository.findAll();
	}

	@Override
	@Transactional
	public Country save(Country country) {
		
		return countryRepository.save(country);
	}
	
}
