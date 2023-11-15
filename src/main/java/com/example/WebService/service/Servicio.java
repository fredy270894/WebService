package com.example.WebService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WebService.repoository.IRepositorio;

@Service
public class Servicio implements IServicio{
	
	@Autowired
	IRepositorio repositorio;
	
	@Override
	public String metodoNumero1() {
		
		System.out.println("Aqui entro al service");
		return repositorio.metodoRepository1();
	}

}
  