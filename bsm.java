package com.helloworld.bsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/bsm")
public class bsm {
@GetMapping
public String Bsm () {
	
	return "Lista de Bsm's: \r\n"
			+ "Orientação ao Futuro\r\n"
			+ "Responsabilidade Pessoal\r\n"
			+ "Mentalidade de Crescimento\r\n"
			+ "Persistência\r\n"
			+ "Habilidades\r\n"
			+ "Trabalho em Equipe\r\n"
			+ "Atenção aos Detalhes\r\n"
			+ "Proatividade\r\n"
			+ "Comunicação ";
}
}
