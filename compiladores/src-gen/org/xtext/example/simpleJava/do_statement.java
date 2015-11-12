/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>do statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.do_statement#getBlocoDo <em>Bloco Do</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.do_statement#getExpressaoWhile <em>Expressao While</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getdo_statement()
 * @model
 * @generated
 */
public interface do_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Bloco Do</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco Do</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco Do</em>' containment reference.
   * @see #setBlocoDo(statement)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getdo_statement_BlocoDo()
   * @model containment="true"
   * @generated
   */
  statement getBlocoDo();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.do_statement#getBlocoDo <em>Bloco Do</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco Do</em>' containment reference.
   * @see #getBlocoDo()
   * @generated
   */
  void setBlocoDo(statement value);

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
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getdo_statement_ExpressaoWhile()
   * @model containment="true"
   * @generated
   */
  expression getExpressaoWhile();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.do_statement#getExpressaoWhile <em>Expressao While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao While</em>' containment reference.
   * @see #getExpressaoWhile()
   * @generated
   */
  void setExpressaoWhile(expression value);

} // do_statement
