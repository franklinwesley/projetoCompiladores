/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>method declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.method_declaration#getModificadorMetodo <em>Modificador Metodo</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.method_declaration#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.method_declaration#getNomeMetodo <em>Nome Metodo</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.method_declaration#getParametrosMetodo <em>Parametros Metodo</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.method_declaration#getBlocoMetodo <em>Bloco Metodo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getmethod_declaration()
 * @model
 * @generated
 */
public interface method_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Modificador Metodo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modificador Metodo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modificador Metodo</em>' containment reference.
   * @see #setModificadorMetodo(MODIFIER)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getmethod_declaration_ModificadorMetodo()
   * @model containment="true"
   * @generated
   */
  MODIFIER getModificadorMetodo();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.method_declaration#getModificadorMetodo <em>Modificador Metodo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modificador Metodo</em>' containment reference.
   * @see #getModificadorMetodo()
   * @generated
   */
  void setModificadorMetodo(MODIFIER value);

  /**
   * Returns the value of the '<em><b>Tipo Retorno</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo Retorno</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Retorno</em>' containment reference.
   * @see #setTipoRetorno(type)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getmethod_declaration_TipoRetorno()
   * @model containment="true"
   * @generated
   */
  type getTipoRetorno();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.method_declaration#getTipoRetorno <em>Tipo Retorno</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Retorno</em>' containment reference.
   * @see #getTipoRetorno()
   * @generated
   */
  void setTipoRetorno(type value);

  /**
   * Returns the value of the '<em><b>Nome Metodo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome Metodo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome Metodo</em>' attribute.
   * @see #setNomeMetodo(String)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getmethod_declaration_NomeMetodo()
   * @model
   * @generated
   */
  String getNomeMetodo();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.method_declaration#getNomeMetodo <em>Nome Metodo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome Metodo</em>' attribute.
   * @see #getNomeMetodo()
   * @generated
   */
  void setNomeMetodo(String value);

  /**
   * Returns the value of the '<em><b>Parametros Metodo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parametros Metodo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parametros Metodo</em>' containment reference.
   * @see #setParametrosMetodo(parameter_list)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getmethod_declaration_ParametrosMetodo()
   * @model containment="true"
   * @generated
   */
  parameter_list getParametrosMetodo();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.method_declaration#getParametrosMetodo <em>Parametros Metodo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parametros Metodo</em>' containment reference.
   * @see #getParametrosMetodo()
   * @generated
   */
  void setParametrosMetodo(parameter_list value);

  /**
   * Returns the value of the '<em><b>Bloco Metodo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco Metodo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco Metodo</em>' containment reference.
   * @see #setBlocoMetodo(statement_block)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getmethod_declaration_BlocoMetodo()
   * @model containment="true"
   * @generated
   */
  statement_block getBlocoMetodo();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.method_declaration#getBlocoMetodo <em>Bloco Metodo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco Metodo</em>' containment reference.
   * @see #getBlocoMetodo()
   * @generated
   */
  void setBlocoMetodo(statement_block value);

} // method_declaration
