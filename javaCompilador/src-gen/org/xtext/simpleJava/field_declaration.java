/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>field declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.field_declaration#getComentario <em>Comentario</em>}</li>
 *   <li>{@link org.xtext.simpleJava.field_declaration#getDeclaracaoMetodo <em>Declaracao Metodo</em>}</li>
 *   <li>{@link org.xtext.simpleJava.field_declaration#getDeclaracaoConstrutor <em>Declaracao Construtor</em>}</li>
 *   <li>{@link org.xtext.simpleJava.field_declaration#getDeclaracaoVariavel <em>Declaracao Variavel</em>}</li>
 *   <li>{@link org.xtext.simpleJava.field_declaration#getEstatico <em>Estatico</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getfield_declaration()
 * @model
 * @generated
 */
public interface field_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Comentario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comentario</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comentario</em>' containment reference.
   * @see #setComentario(doc_comment)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getfield_declaration_Comentario()
   * @model containment="true"
   * @generated
   */
  doc_comment getComentario();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.field_declaration#getComentario <em>Comentario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comentario</em>' containment reference.
   * @see #getComentario()
   * @generated
   */
  void setComentario(doc_comment value);

  /**
   * Returns the value of the '<em><b>Declaracao Metodo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaracao Metodo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaracao Metodo</em>' containment reference.
   * @see #setDeclaracaoMetodo(method_declaration)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getfield_declaration_DeclaracaoMetodo()
   * @model containment="true"
   * @generated
   */
  method_declaration getDeclaracaoMetodo();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.field_declaration#getDeclaracaoMetodo <em>Declaracao Metodo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaracao Metodo</em>' containment reference.
   * @see #getDeclaracaoMetodo()
   * @generated
   */
  void setDeclaracaoMetodo(method_declaration value);

  /**
   * Returns the value of the '<em><b>Declaracao Construtor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaracao Construtor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaracao Construtor</em>' containment reference.
   * @see #setDeclaracaoConstrutor(constructor_declaration)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getfield_declaration_DeclaracaoConstrutor()
   * @model containment="true"
   * @generated
   */
  constructor_declaration getDeclaracaoConstrutor();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.field_declaration#getDeclaracaoConstrutor <em>Declaracao Construtor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaracao Construtor</em>' containment reference.
   * @see #getDeclaracaoConstrutor()
   * @generated
   */
  void setDeclaracaoConstrutor(constructor_declaration value);

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
   * @see org.xtext.simpleJava.SimpleJavaPackage#getfield_declaration_DeclaracaoVariavel()
   * @model containment="true"
   * @generated
   */
  variable_declaration getDeclaracaoVariavel();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.field_declaration#getDeclaracaoVariavel <em>Declaracao Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaracao Variavel</em>' containment reference.
   * @see #getDeclaracaoVariavel()
   * @generated
   */
  void setDeclaracaoVariavel(variable_declaration value);

  /**
   * Returns the value of the '<em><b>Estatico</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estatico</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estatico</em>' containment reference.
   * @see #setEstatico(static_initializer)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getfield_declaration_Estatico()
   * @model containment="true"
   * @generated
   */
  static_initializer getEstatico();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.field_declaration#getEstatico <em>Estatico</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Estatico</em>' containment reference.
   * @see #getEstatico()
   * @generated
   */
  void setEstatico(static_initializer value);

} // field_declaration
