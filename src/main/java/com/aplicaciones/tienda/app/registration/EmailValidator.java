package com.aplicaciones.tienda.app.registration;

import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service

public class EmailValidator implements Predicate<String> {

	@Override
	public boolean test(String t) {
		// TODO Regex to validate email
		return true;
	}
	
}
