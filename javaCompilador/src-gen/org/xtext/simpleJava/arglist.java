/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>arglist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.arglist#getExpressoesArgumentos <em>Expressoes Argumentos</em>}</li>
 *   <li>{@link org.xtext.simpleJava.arglist#getTipoParametro <em>Tipo Parametro</em>}</li>
 *   <li>{@link org.xtext.simpleJava.arglist#getNomeParametro <em>Nome Parametro</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getarglist()
 * @model
 * @generated
 */
public interface arglist extends variable_declarator, expression_aux
{
  /**
   * Returns the value of the '<em><b>Expressoes Argumentos</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simpleJava.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressoes Argumentos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressoes Argumentos</em>' containment reference list.
   * @see org.xtext.simpleJava.SimpleJavaPackage#getarglist_ExpressoesArgumentos()
   * @model containment="true"
   * @generated
   */
  EList<expression> getExpressoesArgumentos();

  /**
   * Returns the value of the '<em><b>Tipo Parametro</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simpleJava.type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo Parametro</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Parametro</em>' containment reference list.
   * @see org.xtext.simpleJava.SimpleJavaPackage#getarglist_TipoParametro()
   * @model containment="true"
   * @generated
   */
  EList<type> getTipoParametro();

  /**
   * Returns the value of the '<em><b>Nome Parametro</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome Parametro</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome Parametro</em>' attribute list.
   * @see org.xtext.simpleJava.SimpleJavaPackage#getarglist_NomeParametro()
   * @model unique="false"
   * @generated
   */
  EList<String> getNomeParametro();

} // arglist
