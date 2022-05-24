package com.aplicaciones.tienda.app.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String password;

}
