package br.com.jogo.web.kabilweb.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String cadastrar(HttpServletRequest req, Model model) {
		if (usuarioService.cadastro(req) == 201)
			model.addAttribute("mensagem", "Usuario cadastrado com sucesso!");
		return "login";
	}
	
	@PostMapping("/logar")
	@ResponseBody
	public String logar(HttpServletRequest req) {
		return usuarioService.login(req);
	}
}
