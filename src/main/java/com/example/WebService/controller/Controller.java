package com.example.WebService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WebService.service.IServicio;
import com.example.WebService.service.Servicio;

@RestController
public class Controller {
	
	@Autowired
	IServicio servicio;
	
	//variale global
	String mensaje ="";
	
	
	@GetMapping("/WebService1")
	public String cadena() {
		System.out.println("Aqui estamos dentro del controler");

		return servicio.metodoNumero1();
	}
	
	
	
}
