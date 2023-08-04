package fr.dawan.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

@SpringBootApplication
public class DemoJenkinsMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsMvcApplication.class, args);
		
		
		Personne personne = new Personne("nom","loe",28);
		System.out.println(personne);
	}
	
	

}
