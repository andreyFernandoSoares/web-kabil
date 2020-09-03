package br.com.jogo.web.kabilweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.jogo.web.kabilweb.dtos.UsuarioDto;
import br.com.jogo.web.kabilweb.services.UsuarioService;

@Controller
@RequestMapping("/")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public String home() {
		return "login";
	}
	
	@GetMapping("/cadastro")
	public String cadastro() {
		return "cadastro";
	}
	
	@PostMapping("/cadastrar")
	public String cadastrar(UsuarioDto usuario) {
		usuarioService.cadastro(usuario);
		return "redirect:/";
	}
	
	@PostMapping("/logar")
	@ResponseBody
	public String logar(UsuarioDto usuario) {
		return usuarioService.login(usuario);
	}
}
