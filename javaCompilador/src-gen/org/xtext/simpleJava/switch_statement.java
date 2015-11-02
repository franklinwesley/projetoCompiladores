/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>switch statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.switch_statement#getExpressaoSwitch <em>Expressao Switch</em>}</li>
 *   <li>{@link org.xtext.simpleJava.switch_statement#getExpressaoCases <em>Expressao Cases</em>}</li>
 *   <li>{@link org.xtext.simpleJava.switch_statement#getBlocoSwitch <em>Bloco Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getswitch_statement()
 * @model
 * @generated
 */
public interface switch_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressao Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressao Switch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressao Switch</em>' containment reference.
   * @see #setExpressaoSwitch(expression)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getswitch_statement_ExpressaoSwitch()
   * @model containment="true"
   * @generated
   */
  expression getExpressaoSwitch();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.switch_statement#getExpressaoSwitch <em>Expressao Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao Switch</em>' containment reference.
   * @see #getExpressaoSwitch()
   * @generated
   */
  void setExpressaoSwitch(expression value);

  /**
   * Returns the value of the '<em><b>Expressao Cases</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simpleJava.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressao Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressao Cases</em>' containment reference list.
   * @see org.xtext.simpleJava.SimpleJavaPackage#getswitch_statement_ExpressaoCases()
   * @model containment="true"
   * @generated
   */
  EList<expression> getExpressaoCases();

  /**
   * Returns the value of the '<em><b>Bloco Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco Switch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco Switch</em>' containment reference.
   * @see #setBlocoSwitch(statement)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getswitch_statement_BlocoSwitch()
   * @model containment="true"
   * @generated
   */
  statement getBlocoSwitch();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.switch_statement#getBlocoSwitch <em>Bloco Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco Switch</em>' containment reference.
   * @see #getBlocoSwitch()
   * @generated
   */
  void setBlocoSwitch(statement value);

} // switch_statement
