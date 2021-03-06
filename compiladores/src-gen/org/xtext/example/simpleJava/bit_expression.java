/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>bit expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.bit_expression#getOperador <em>Operador</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.bit_expression#getExpressao <em>Expressao</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getbit_expression()
 * @model
 * @generated
 */
public interface bit_expression extends EObject
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
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getbit_expression_Operador()
   * @model
   * @generated
   */
  String getOperador();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.bit_expression#getOperador <em>Operador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador</em>' attribute.
   * @see #getOperador()
   * @generated
   */
  void setOperador(String value);

  /**
   * Returns the value of the '<em><b>Expressao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressao</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressao</em>' containment reference.
   * @see #setExpressao(expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getbit_expression_Expressao()
   * @model containment="true"
   * @generated
   */
  expression getExpressao();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.bit_expression#getExpressao <em>Expressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao</em>' containment reference.
   * @see #getExpressao()
   * @generated
   */
  void setExpressao(expression value);

} // bit_expression
