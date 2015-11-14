/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.variable_declarator#getNomeVariavel <em>Nome Variavel</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.variable_declarator#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.variable_declarator#getValorVariavel <em>Valor Variavel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getvariable_declarator()
 * @model
 * @generated
 */
public interface variable_declarator extends EObject
{
  /**
   * Returns the value of the '<em><b>Nome Variavel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome Variavel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome Variavel</em>' attribute.
   * @see #setNomeVariavel(String)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getvariable_declarator_NomeVariavel()
   * @model
   * @generated
   */
  String getNomeVariavel();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.variable_declarator#getNomeVariavel <em>Nome Variavel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome Variavel</em>' attribute.
   * @see #getNomeVariavel()
   * @generated
   */
  void setNomeVariavel(String value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getvariable_declarator_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.variable_declarator#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Valor Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor Variavel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor Variavel</em>' containment reference.
   * @see #setValorVariavel(variable_initializer)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getvariable_declarator_ValorVariavel()
   * @model containment="true"
   * @generated
   */
  variable_initializer getValorVariavel();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.variable_declarator#getValorVariavel <em>Valor Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor Variavel</em>' containment reference.
   * @see #getValorVariavel()
   * @generated
   */
  void setValorVariavel(variable_initializer value);

} // variable_declarator
