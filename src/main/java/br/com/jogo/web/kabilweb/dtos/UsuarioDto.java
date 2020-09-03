package br.com.jogo.web.kabilweb.dtos;

public class UsuarioDto {
	
	private String nome;
	private String email;
	private String senha;
	
	public UsuarioDto() {
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "UsuarioDto [nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
	}
}
