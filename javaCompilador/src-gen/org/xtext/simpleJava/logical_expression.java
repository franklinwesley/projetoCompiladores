/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>logical expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.logical_expression#getOperador <em>Operador</em>}</li>
 *   <li>{@link org.xtext.simpleJava.logical_expression#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getlogical_expression()
 * @model
 * @generated
 */
public interface logical_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operador</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operador</em>' attribute.
   * @see #setOperador(String)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getlogical_expression_Operador()
   * @model
   * @generated
   */
  String getOperador();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.logical_expression#getOperador <em>Operador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador</em>' attribute.
   * @see #getOperador()
   * @generated
   */
  void setOperador(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(expression)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getlogical_expression_Exp()
   * @model containment="true"
   * @generated
   */
  expression getExp();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.logical_expression#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(expression value);

} // logical_expression
