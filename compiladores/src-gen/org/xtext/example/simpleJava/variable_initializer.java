/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.variable_initializer#getExpressaoVariavel <em>Expressao Variavel</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.variable_initializer#getValorVariaveis <em>Valor Variaveis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getvariable_initializer()
 * @model
 * @generated
 */
public interface variable_initializer extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressao Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressao Variavel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressao Variavel</em>' containment reference.
   * @see #setExpressaoVariavel(expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getvariable_initializer_ExpressaoVariavel()
   * @model containment="true"
   * @generated
   */
  expression getExpressaoVariavel();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.variable_initializer#getExpressaoVariavel <em>Expressao Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao Variavel</em>' containment reference.
   * @see #getExpressaoVariavel()
   * @generated
   */
  void setExpressaoVariavel(expression value);

  /**
   * Returns the value of the '<em><b>Valor Variaveis</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.simpleJava.variable_initializer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor Variaveis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor Variaveis</em>' containment reference list.
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getvariable_initializer_ValorVariaveis()
   * @model containment="true"
   * @generated
   */
  EList<variable_initializer> getValorVariaveis();

} // variable_initializer
