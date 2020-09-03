package br.com.jogo.web.kabilweb.dtos;

public class UsuarioDto {
	
	private String nome;
	private String email;
	private String senha;
	
	public UsuarioDto(String nome, String senha) {
		this.nome = nome;
		this.email = senha;
	}
	
	public UsuarioDto(String nome, String senha, String email) {
		this.nome = nome;
		this.email = senha;
		this.senha = email;
		
	}

	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}
}
