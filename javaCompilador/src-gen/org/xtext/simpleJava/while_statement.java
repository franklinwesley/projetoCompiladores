/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>while statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.while_statement#getExpressaoWhile <em>Expressao While</em>}</li>
 *   <li>{@link org.xtext.simpleJava.while_statement#getBlocoWhile <em>Bloco While</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getwhile_statement()
 * @model
 * @generated
 */
public interface while_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressao While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressao While</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressao While</em>' containment reference.
   * @see #setExpressaoWhile(expression)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getwhile_statement_ExpressaoWhile()
   * @model containment="true"
   * @generated
   */
  expression getExpressaoWhile();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.while_statement#getExpressaoWhile <em>Expressao While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao While</em>' containment reference.
   * @see #getExpressaoWhile()
   * @generated
   */
  void setExpressaoWhile(expression value);

  /**
   * Returns the value of the '<em><b>Bloco While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco While</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco While</em>' containment reference.
   * @see #setBlocoWhile(statement)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getwhile_statement_BlocoWhile()
   * @model containment="true"
   * @generated
   */
  statement getBlocoWhile();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.while_statement#getBlocoWhile <em>Bloco While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco While</em>' containment reference.
   * @see #getBlocoWhile()
   * @generated
   */
  void setBlocoWhile(statement value);

} // while_statement
