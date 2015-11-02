/**
 * generated by Xtext
 */
package org.xtext.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.xtext.simpleJava.class_declaration;
import org.xtext.simpleJava.compilation_unit;
import org.xtext.simpleJava.expression;
import org.xtext.simpleJava.field_declaration;
import org.xtext.simpleJava.interface_declaration;
import org.xtext.simpleJava.logical_expression;
import org.xtext.simpleJava.method_declaration;
import org.xtext.simpleJava.statement;
import org.xtext.simpleJava.statement_block;
import org.xtext.simpleJava.type_declaration;
import org.xtext.simpleJava.while_statement;
import org.xtext.validation.AbstractSimpleJavaValidator;
import org.xtext.validation.Tipo;
import org.xtext.validation.Variavel;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class SimpleJavaValidator extends AbstractSimpleJavaValidator {
  private final List<Tipo> tipos = new ArrayList<Tipo>();
  
  private final List<Variavel> variaveis = new ArrayList<Variavel>();
  
  @Check
  public Object runChecks(final compilation_unit comp) {
    Object _xblockexpression = null;
    {
      EList<type_declaration> _declaracao = comp.getDeclaracao();
      this.checkTypeDeclaration(_declaracao);
      EList<type_declaration> _declaracao_1 = comp.getDeclaracao();
      type_declaration _get = _declaracao_1.get(0);
      class_declaration _declaracaoClasse = _get.getDeclaracaoClasse();
      field_declaration _corpoClasse = _declaracaoClasse.getCorpoClasse();
      method_declaration _declaracaoMetodo = _corpoClasse.getDeclaracaoMetodo();
      statement_block _blocoMetodo = _declaracaoMetodo.getBlocoMetodo();
      statement _corpo = _blocoMetodo.getCorpo();
      while_statement _corpoWhile = _corpo.getCorpoWhile();
      _xblockexpression = this.checkWhile(_corpoWhile);
    }
    return _xblockexpression;
  }
  
  public Object checkWhile(final while_statement statement) {
    Object _xblockexpression = null;
    {
      expression _expressaoWhile = statement.getExpressaoWhile();
      logical_expression logico = _expressaoWhile.getTipoLogical();
      Object _xifexpression = null;
      boolean _equals = Objects.equal(logico, null);
      if (_equals) {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean checkTypeDeclaration(final EList<type_declaration> list) {
    boolean _xblockexpression = false;
    {
      type_declaration type_declaration = list.get(0);
      boolean _xifexpression = false;
      class_declaration _declaracaoClasse = type_declaration.getDeclaracaoClasse();
      boolean _notEquals = (!Objects.equal(_declaracaoClasse, null));
      if (_notEquals) {
        class_declaration _declaracaoClasse_1 = type_declaration.getDeclaracaoClasse();
        String _nomeClasse = _declaracaoClasse_1.getNomeClasse();
        _xifexpression = this.addType(_nomeClasse);
      } else {
        interface_declaration _declaracaoInterface = type_declaration.getDeclaracaoInterface();
        String _nomeInterface = _declaracaoInterface.getNomeInterface();
        _xifexpression = this.addType(_nomeInterface);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean addType(final String tipo) {
    boolean _xblockexpression = false;
    {
      Tipo t = new Tipo(tipo);
      boolean _xifexpression = false;
      boolean _contains = this.tipos.contains(t);
      boolean _not = (!_contains);
      if (_not) {
        _xifexpression = this.tipos.add(t);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
