package br.com.jogo.web.kabilweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ams")
public class AmostraController {
	
	@GetMapping("/professor")
	public String mostraTelaProf() {
		return "professor";
	}
	
	@GetMapping("/aluno")
	public String mostraTelaAluno() {
		return "aluno";
	}
}
