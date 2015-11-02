package org.xtext.validation;

public class Tipo {
	String nome;
	boolean primitivo;
	
	public Tipo(String nome, boolean primitivo) {
		this.nome = nome;
		this.primitivo = primitivo;
	}
	
	public Tipo(String nome) {
		this.nome = nome;
		this.primitivo = false;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isPrimitivo() {
		return primitivo;
	}
	
	public void setPrimitivo(boolean primitivo) {
		this.primitivo = primitivo;
	}
}
