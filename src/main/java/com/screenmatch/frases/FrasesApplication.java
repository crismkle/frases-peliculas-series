package com.screenmatch.frases;

import com.screenmatch.frases.repositorio.FraseRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrasesApplication {

	@Autowired
	private FraseRepositorio repository;
	public static void main(String[] args) {
		SpringApplication.run(FrasesApplication.class, args);
	}

}
