package com.everest.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiSpringBootReferenciaApplication {
	
	@Value("${paginacao.quantidade_por_pagina}")
	private int quantidadePorPagina;

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringBootReferenciaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println(">>>> A quantidade linhas por pagina eh: " + this.quantidadePorPagina);
		};
	}
	
}
