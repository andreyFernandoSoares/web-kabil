package br.com.jogo.web.kabilweb.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

@Configuration
public class ConfigBean {
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public Gson gson() {
		return new Gson();
	}
}
