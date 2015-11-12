/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>for statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.for_statement#getDeclaracaoVariavel <em>Declaracao Variavel</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.for_statement#getExpressaoDeclaracao <em>Expressao Declaracao</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.for_statement#getExpressaoFor <em>Expressao For</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.for_statement#getExpressaoIncremento <em>Expressao Incremento</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.for_statement#getBlocoFor <em>Bloco For</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getfor_statement()
 * @model
 * @generated
 */
public interface for_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaracao Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaracao Variavel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaracao Variavel</em>' containment reference.
   * @see #setDeclaracaoVariavel(variable_declaration)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getfor_statement_DeclaracaoVariavel()
   * @model containment="true"
   * @generated
   */
  variable_declaration getDeclaracaoVariavel();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.for_statement#getDeclaracaoVariavel <em>Declaracao Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaracao Variavel</em>' containment reference.
   * @see #getDeclaracaoVariavel()
   * @generated
   */
  void setDeclaracaoVariavel(variable_declaration value);

  /**
   * Returns the value of the '<em><b>Expressao Declaracao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressao Declaracao</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressao Declaracao</em>' containment reference.
   * @see #setExpressaoDeclaracao(expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getfor_statement_ExpressaoDeclaracao()
   * @model containment="true"
   * @generated
   */
  expression getExpressaoDeclaracao();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.for_statement#getExpressaoDeclaracao <em>Expressao Declaracao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao Declaracao</em>' containment reference.
   * @see #getExpressaoDeclaracao()
   * @generated
   */
  void setExpressaoDeclaracao(expression value);

  /**
   * Returns the value of the '<em><b>Expressao For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressao For</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressao For</em>' containment reference.
   * @see #setExpressaoFor(expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getfor_statement_ExpressaoFor()
   * @model containment="true"
   * @generated
   */
  expression getExpressaoFor();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.for_statement#getExpressaoFor <em>Expressao For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao For</em>' containment reference.
   * @see #getExpressaoFor()
   * @generated
   */
  void setExpressaoFor(expression value);

  /**
   * Returns the value of the '<em><b>Expressao Incremento</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressao Incremento</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressao Incremento</em>' containment reference.
   * @see #setExpressaoIncremento(expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getfor_statement_ExpressaoIncremento()
   * @model containment="true"
   * @generated
   */
  expression getExpressaoIncremento();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.for_statement#getExpressaoIncremento <em>Expressao Incremento</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao Incremento</em>' containment reference.
   * @see #getExpressaoIncremento()
   * @generated
   */
  void setExpressaoIncremento(expression value);

  /**
   * Returns the value of the '<em><b>Bloco For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco For</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco For</em>' containment reference.
   * @see #setBlocoFor(statement)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getfor_statement_BlocoFor()
   * @model containment="true"
   * @generated
   */
  statement getBlocoFor();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.for_statement#getBlocoFor <em>Bloco For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco For</em>' containment reference.
   * @see #getBlocoFor()
   * @generated
   */
  void setBlocoFor(statement value);

} // for_statement
