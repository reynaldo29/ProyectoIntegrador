package com.aplicaciones.tienda.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aplicaciones.tienda.app.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long>{

}
