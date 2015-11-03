/*
 * generated by Xtext
 */
package org.xtext.validation

import org.eclipse.xtext.validation.Check
import org.xtext.simpleJava.compilation_unit
import org.xtext.simpleJava.type_declaration
import org.eclipse.emf.common.util.EList
import java.util.List
import java.util.ArrayList
import org.xtext.simpleJava.while_statement
import org.xtext.simpleJava.variable_declaration
import org.xtext.simpleJava.variable_declarator
import org.xtext.simpleJava.expression
import org.xtext.simpleJava.statement
import java.util.Map
import java.util.HashMap
import org.xtext.simpleJava.method_declaration
import org.xtext.simpleJava.parameter_list
import org.xtext.simpleJava.parameter
import org.xtext.simpleJava.arglist

//import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SimpleJavaValidator extends AbstractSimpleJavaValidator {

	private final List<Tipo> tipos = new ArrayList<Tipo>();
	private final Map<String, Variavel> variaveis = new HashMap<String, Variavel>();
	private final Map<String, Metodo> metodos = new HashMap<String, Metodo>();

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	@Check
	def runChecks (compilation_unit comp) {
		checkTypeDeclaration(comp.declaracao);
		checkVariableDeclaration(comp.declaracao);
		//incompleto
		checkVariableInitializer(comp.declaracao);
		checkInterativeWhile(comp.declaracao);
		//incompleto
		checkAritmeticExpression(comp.declaracao);
		//incompleto
		checkBooleanExpression(comp.declaracao);
		//incompleto
		checkLiterals(comp.declaracao);
		//incompleto
		checkVariableUsed(comp.declaracao);
		checkMetodDeclaration(comp.declaracao);
		checkMetodoUsed(comp.declaracao);
//		checkExpression();
	}
	
	def checkMetodoUsed(EList<type_declaration> list) {
		for (type_declaration td: list) {
			checkUsoMetodo(td.declaracaoClasse.corpoClasse.declaracaoMetodo);
		}
	}
	
	def checkUsoMetodo(method_declaration declaration) {
		if (declaration.blocoMetodo.corpo.expressao.identificador != null &&
			declaration.blocoMetodo.corpo.expressao.expressoes.parametros != null) {
			if (metodos.containsKey(declaration.blocoMetodo.corpo.expressao.identificador)) {
				var m = metodos.get(declaration.blocoMetodo.corpo.expressao.identificador);
				if (verificaParametros(m, declaration.blocoMetodo.corpo.expressao.expressoes.parametros)) {
					//check tipo retorno
				} else {
					//erro parametros errados
				}
			} else {
				// erro metodo inexistente
			}
		}
	}
	
	def Map<String,Tipo> getparametros(arglist list) {
		var p = new HashMap<String,Tipo>();
		var i = 0
		while (i < list.tipoParametro.length){
			p.put(list.nomeParametro.get(i), new Tipo (String.valueOf(list.tipoParametro.get(i))));
			i++;
		}
		return p;
	}
	
	def boolean verificaParametros(Metodo metodo, arglist arglist) {
		if (metodo.parametros.equals(getparametros(arglist))) {
			return true;
		} else {
			return false;
		}
	}
	
	def checkMetodDeclaration(EList<type_declaration> list) {
		for (type_declaration td: list) {
			checkDeclaracaoMetodo(td.declaracaoClasse.corpoClasse.declaracaoMetodo);
		}
	}
	
	def checkDeclaracaoMetodo(method_declaration declaration) {
		var tipo = new Tipo(String.valueOf(declaration.tipoRetorno.tipo));
		var parametros = getparametros(declaration.parametrosMetodo);
		var metodo =new Metodo(declaration.nomeMetodo, tipo, parametros);
		metodos.put(declaration.nomeMetodo, metodo);
	}
	
	def Map<String,Tipo> getparametros(parameter_list list) {
		var p = new HashMap<String,Tipo>();
		for (parameter parametro: list.parametros) {
			p.put(parametro.nomeParametro, new Tipo (String.valueOf(parametro.tipoParametro.tipo)));
		}
		return p;
	}
	
	def checkVariableUsed(EList<type_declaration> list) {
		for (type_declaration td: list) {
			checkUsoVariaveis(td.declaracaoClasse.corpoClasse.declaracaoMetodo.blocoMetodo.corpo);
		}
	}
	
	def checkUsoVariaveis(statement statement) {
		var variavel = statement.expressao.identificador
		if (!variaveis.containsKey(variavel)) {
			//erro variavel nao exite
		} else {
			//check tipo
		}
	}
	
	def checkLiterals(EList<type_declaration> list) {
		for (type_declaration td: list) {
			checkLiterais(td.declaracaoClasse.corpoClasse.declaracaoMetodo.blocoMetodo.corpo.expressao);
		}
	}
	
	def checkLiterais(expression expression) {
		//check literais
		if (expression.literal != null) {
			//check
		}
	}
	
	def checkBooleanExpression(EList<type_declaration> list) {
		for (type_declaration td: list) {
			checkBoolean(td.declaracaoClasse.corpoClasse.declaracaoMetodo.blocoMetodo.corpo.expressao);
		}
	}
	
	def checkBoolean(expression expression) {
		//checar espressao booleana
		if (expression.tipoLogical != null) {
			//check
		} if (expression.operador == ">" || expression.operador == "<" 
			|| expression.operador == ">=" || expression.operador == "<=" 
			|| expression.operador == "==" || expression.operador == "!=" 
			|| expression.operador == ">>=" || expression.operador == "<<" 
			|| expression.operador == ">>" || expression.operador == ">>>") {
			//check
		} 
	}
	
	def checkAritmeticExpression(EList<type_declaration> list) {
		for (type_declaration td: list) {
			checkArimetic(td.declaracaoClasse.corpoClasse.declaracaoMetodo.blocoMetodo.corpo.expressao);
		}
	}
	
	def checkArimetic(expression expression) {
		//checar espressao aritimetrica
		if (expression.tipoNumeric != null) {
			//check
		} if (expression.expressoes.op != null || expression.expressoes == "++" 
			|| expression.expressoes == "--" || expression.expressoes == "-" 
			|| expression.expressoes == "-=" || expression.expressoes == "*" 
			|| expression.expressoes == "*=" || expression.expressoes == "/" 
			|| expression.expressoes == "/=" || expression.expressoes == "%" 
			|| expression.expressoes == "%=") {
			//check
		}
	}
	
	def checkInterativeWhile(EList<type_declaration> list) {
		for (type_declaration declaracoes : list) {
			checkWhile(declaracoes.declaracaoClasse.corpoClasse.declaracaoMetodo.blocoMetodo.corpo.corpoWhile);	
		} 
	}
	
	def checkVariableDeclaration(EList<type_declaration> list) {
		for (type_declaration declaracoes : list) {
			checkDeclaracaoVariavel(declaracoes.declaracaoClasse.corpoClasse.declaracaoVariavel);
			checkDeclaracaoVariavel(declaracoes.declaracaoInterface.corpoInterface.declaracaoVariavel);	
		}
	}
	
	def checkDeclaracaoVariavel(variable_declaration declaration) {
		//TODO ver se esse new tipo pega
		var tipo = new Tipo(String.valueOf(declaration.tipoVariavel.tipo));
		if (!tipos.contains(tipo)) {
			//error tipo naum existe
		} else {
			//add variavel
			var vars = declaration.declaracaoVariaveis;
			for (variable_declarator variable: vars) {	
				var variavel = new Variavel(variable.nomeVariavel, tipo);
				if (!variaveis.containsKey(variable.nomeVariavel)) {
					variaveis.put(variable.nomeVariavel, variavel);
				} else {
					//erro variavel ja existe
				}
			}
		}
	}
	
	
	def checkWhile(while_statement statement) {
		var logico = statement.expressaoWhile.tipoLogical;
		var operador = statement.expressaoWhile.expressoes.operador
		var metodo = metodos.get(statement.expressaoWhile.identificador);
		if (logico == null && operador != ">" && operador != "<" && operador != ">=" 
			&& operador != "<=" && operador != "==" && operador != "!=" && operador != ">>=" && operador != "<<" 
			&& operador != ">>" && operador != ">>>" && metodo.getTipoRetorno().equals(new Tipo ("boolean"))) {
			//erro expressao invalida
		} else {
			if (statement.blocoWhile.bloco.corpo.corpoWhile != null) {
				checkWhile(statement.blocoWhile.bloco.corpo.corpoWhile);
			}
		}
	}
	
	
	def checkVariableInitializer(EList<type_declaration> list) {
		for (type_declaration td: list) {
			//TODO ver se esse new tipo pega
			var tipo = new Tipo(String.valueOf(td.declaracaoClasse.corpoClasse.declaracaoVariavel.tipoVariavel.tipo));
			checkInicializacaoVariavel(td.declaracaoClasse.corpoClasse.declaracaoVariavel.declaracaoVariaveis, tipo);
			checkInicializacaoVariavel(td.declaracaoInterface.corpoInterface.declaracaoVariavel.declaracaoVariaveis, tipo);
		}
	}
	
	def checkInicializacaoVariavel(EList<variable_declarator> list, Tipo tipo) {
		for (variable_declarator vd : list) {
			var variavel = new Variavel(vd.nomeVariavel, tipo);
			if (!variaveis.containsKey(vd.nomeVariavel)) {
				//error variavel naum exite
			} else {
				var v = variaveis.get(vd.nomeVariavel);
				//TODO checkar o tipo se esta certo
			}	
		}
	}
	
	def checkTypeDeclaration(EList<type_declaration> list) {
		for (type_declaration td: list) {
			if (td.declaracaoClasse != null) {
			//salvar o tipo
			addType(td.declaracaoClasse.nomeClasse);
		} else {
			//salva o tipo
			addType(td.declaracaoInterface.nomeInterface);
		}
		}		
	}
	
	def addType(String tipo) {
		//adicionar na tabela de simbolos caso naum exista
		var t = new Tipo (tipo);
		if (!tipos.contains(t)) {
			tipos.add(t);
		}
	}
}