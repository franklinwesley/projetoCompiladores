package org.xtext.example.validation;

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
	 @Override
	public boolean equals(Object obj) {
		 if (!(obj instanceof Tipo)) {
			 return false;
		 }
		 Tipo t = (Tipo) obj;
		 if (t.getNome().equals(this.nome)) {
			 return true;
		 }
		 return false;
	 }
}
