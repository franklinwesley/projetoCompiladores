/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.variable_declaration#getModificador <em>Modificador</em>}</li>
 *   <li>{@link org.xtext.simpleJava.variable_declaration#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.xtext.simpleJava.variable_declaration#getDeclaracaoVariaveis <em>Declaracao Variaveis</em>}</li>
 *   <li>{@link org.xtext.simpleJava.variable_declaration#getBlocoVariavel <em>Bloco Variavel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getvariable_declaration()
 * @model
 * @generated
 */
public interface variable_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Modificador</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modificador</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modificador</em>' containment reference.
   * @see #setModificador(MODIFIER)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getvariable_declaration_Modificador()
   * @model containment="true"
   * @generated
   */
  MODIFIER getModificador();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.variable_declaration#getModificador <em>Modificador</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modificador</em>' containment reference.
   * @see #getModificador()
   * @generated
   */
  void setModificador(MODIFIER value);

  /**
   * Returns the value of the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' containment reference.
   * @see #setTipo(type)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getvariable_declaration_Tipo()
   * @model containment="true"
   * @generated
   */
  type getTipo();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.variable_declaration#getTipo <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' containment reference.
   * @see #getTipo()
   * @generated
   */
  void setTipo(type value);

  /**
   * Returns the value of the '<em><b>Declaracao Variaveis</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simpleJava.variable_declarator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaracao Variaveis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaracao Variaveis</em>' containment reference list.
   * @see org.xtext.simpleJava.SimpleJavaPackage#getvariable_declaration_DeclaracaoVariaveis()
   * @model containment="true"
   * @generated
   */
  EList<variable_declarator> getDeclaracaoVariaveis();

  /**
   * Returns the value of the '<em><b>Bloco Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco Variavel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco Variavel</em>' containment reference.
   * @see #setBlocoVariavel(statement_block)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getvariable_declaration_BlocoVariavel()
   * @model containment="true"
   * @generated
   */
  statement_block getBlocoVariavel();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.variable_declaration#getBlocoVariavel <em>Bloco Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco Variavel</em>' containment reference.
   * @see #getBlocoVariavel()
   * @generated
   */
  void setBlocoVariavel(statement_block value);

} // variable_declaration
