package br.com.jogo.web.kabilweb.services;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.jogo.web.kabilweb.dtos.UsuarioDto;

@Service
public class UsuarioService {
 
	@Autowired
	RestTemplate restTemplate;
	
	public Integer cadastro(HttpServletRequest req) {
		String url = "http://localhost:8080/usuario/cadastro";
		HttpStatus resp = restTemplate.postForEntity(url, new UsuarioDto(req.getParameter("nome"), 
                                                     req.getParameter("senha"), req.getParameter("email")), 
                                                     String.class).getStatusCode();
		return resp.value();
	}

	public String login(HttpServletRequest req) {
		String url = "http://localhost:8080/auth";
		return restTemplate.postForEntity(url, new UsuarioDto(req.getParameter("nome"), 
				                          req.getParameter("senha")), 
				                          String.class).getBody();
	}
}
