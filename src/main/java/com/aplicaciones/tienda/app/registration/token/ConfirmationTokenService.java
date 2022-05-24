package com.aplicaciones.tienda.app.registration.token;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {
	
	private ConfirmationTokenRepository confirmationTokenRepository;

	public void saveConfirmationToken(ConfirmationToken token) {
	        confirmationTokenRepository.save(token);
	    }
	
	 public Optional<ConfirmationToken> getToken(String token) {
	        return confirmationTokenRepository.findByToken(token);
	    }
	 
	  public int setConfirmedAt(String token) {
		  return confirmationTokenRepository.updateConfirmedAt(
				  token, LocalDateTime.now());
	    }

	



}
