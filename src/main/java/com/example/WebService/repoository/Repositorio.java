package com.example.WebService.repoository;

import org.springframework.stereotype.Repository;

@Repository
public class Repositorio implements IRepositorio {
	
	public String metodoRepository1() {
		
		System.out.println("Aqui entramos al Repository");
		
		return "Mensage del metodo Repository1";
		
	}

}
