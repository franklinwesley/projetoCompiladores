/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.parameter#getTipoParametro <em>Tipo Parametro</em>}</li>
 *   <li>{@link org.xtext.simpleJava.parameter#getNomeParametro <em>Nome Parametro</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getparameter()
 * @model
 * @generated
 */
public interface parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Tipo Parametro</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo Parametro</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Parametro</em>' containment reference.
   * @see #setTipoParametro(type)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getparameter_TipoParametro()
   * @model containment="true"
   * @generated
   */
  type getTipoParametro();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.parameter#getTipoParametro <em>Tipo Parametro</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Parametro</em>' containment reference.
   * @see #getTipoParametro()
   * @generated
   */
  void setTipoParametro(type value);

  /**
   * Returns the value of the '<em><b>Nome Parametro</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome Parametro</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome Parametro</em>' attribute.
   * @see #setNomeParametro(String)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getparameter_NomeParametro()
   * @model
   * @generated
   */
  String getNomeParametro();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.parameter#getNomeParametro <em>Nome Parametro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome Parametro</em>' attribute.
   * @see #getNomeParametro()
   * @generated
   */
  void setNomeParametro(String value);

} // parameter
