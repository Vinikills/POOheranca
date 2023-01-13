package PolimorfismoHeranca;

public class Cliente {
	private String nome;
	private String estado;
	private String telefone;
	public Cliente(String nome, String estado,String telefone) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
