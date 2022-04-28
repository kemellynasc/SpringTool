package com.helloworld.bsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/nObjetivos")
public class objetivo {
@GetMapping
public String objetivo () {
	return "Meu maior objetivo durante a semana é adiquirir os ensinamentos passados, conseguir "
			+ "cinsilhiar o tempo e realizar as atividades.";
}
}
