package br.com.brq.teste.enteties;

public class Usuario {

	private String name;
	
	private int idade;
	
	private String email;

	public Usuario(String name, int idade, String email) {

		this.name = name;
		this.idade = idade;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
