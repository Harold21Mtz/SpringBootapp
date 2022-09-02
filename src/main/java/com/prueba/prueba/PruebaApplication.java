package com.prueba.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class PruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam (value = "name", defaultValue = "Osquitar, el duro de las mujeres casadas") String name){
		return String.format("Hola %s!", name);
	}
}
