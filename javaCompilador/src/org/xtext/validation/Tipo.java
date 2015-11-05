package org.xtext.validation;

public class Tipo {
	private String nome;
	private Tipo herdado;
	
	public Tipo(String nome, Tipo herdado) {
		this.nome = nome;
		this.herdado = herdado;
	}
	
	public Tipo(String nome) {
		this.nome = nome;
		this.herdado = this;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getHerdado() {
		return herdado;
	}

	public void setHerdado(Tipo herdado) {
		this.herdado = herdado;
	}
}
