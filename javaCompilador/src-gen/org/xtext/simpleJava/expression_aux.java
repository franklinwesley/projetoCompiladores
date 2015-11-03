/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression aux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.expression_aux#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.simpleJava.expression_aux#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.simpleJava.expression_aux#getOperador <em>Operador</em>}</li>
 *   <li>{@link org.xtext.simpleJava.expression_aux#getExpressoes <em>Expressoes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_aux()
 * @model
 * @generated
 */
public interface expression_aux extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(mais_aux)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_aux_Op()
   * @model containment="true"
   * @generated
   */
  mais_aux getOp();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.expression_aux#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(mais_aux value);

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
   * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_aux_Exp()
   * @model containment="true"
   * @generated
   */
  expression getExp();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.expression_aux#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(expression value);

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
   * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_aux_Operador()
   * @model
   * @generated
   */
  String getOperador();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.expression_aux#getOperador <em>Operador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador</em>' attribute.
   * @see #getOperador()
   * @generated
   */
  void setOperador(String value);

  /**
   * Returns the value of the '<em><b>Expressoes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressoes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressoes</em>' containment reference.
   * @see #setExpressoes(expression_aux)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_aux_Expressoes()
   * @model containment="true"
   * @generated
   */
  expression_aux getExpressoes();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.expression_aux#getExpressoes <em>Expressoes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressoes</em>' containment reference.
   * @see #getExpressoes()
   * @generated
   */
  void setExpressoes(expression_aux value);

} // expression_aux
