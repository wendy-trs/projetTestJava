package fr.isika.testprojet.java;

import org.springframework.stereotype.Service;

@Service
public class TestProjetService {
	
	public String getMessage(String saisie) {
	     return String.format("Votre saisie : %s", saisie);
		
	  }

}
