package org.xtext.example.validation;

import java.util.HashMap;
import java.util.Map;

public class Metodo {
	
	private String nome;
	private Tipo tipoRetorno;
	private Map<String, Tipo> parametros = new HashMap<String, Tipo>();
	
	public Metodo(String nome, Tipo tipo, Map<String, Tipo> parametros) {
		this.nome = nome;
		this.tipoRetorno = tipo;
		this.parametros = parametros;
	}

	public Tipo getTipoRetorno() {
		return tipoRetorno;
	}

	public void setTipoRetorno(Tipo tipoRetorno) {
		this.tipoRetorno = tipoRetorno;
	}

	public Map<String, Tipo> getParametros() {
		return parametros;
	}

	public void setParametros(Map<String, Tipo> parametros) {
		this.parametros = parametros;
	}
}
