package br.com.jogo.web.kabilweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import br.com.jogo.web.kabilweb.dtos.TokenDto;
import br.com.jogo.web.kabilweb.dtos.UsuarioDto;

@Service
public class UsuarioService {
 
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	Gson gson;
	
	public Integer cadastro(UsuarioDto usuario) {
		String url = "http://localhost:8080/usuario/cadastro";
		System.out.println(usuario);
		return restTemplate.postForEntity(url, usuario, String.class).getStatusCode().value();
	}

	public String login(UsuarioDto usuario) {
		String url = "http://localhost:8080/auth";
		String resposta = restTemplate.postForEntity(url, usuario, String.class).getBody();
		TokenDto tokenDto = gson.fromJson(resposta, TokenDto.class);
		return tokenDto.getToken().substring(0, 10);
	}
}
