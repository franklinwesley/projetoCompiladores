/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>creating aux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.creating_aux#getArgumentos <em>Argumentos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getcreating_aux()
 * @model
 * @generated
 */
public interface creating_aux extends EObject
{
  /**
   * Returns the value of the '<em><b>Argumentos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argumentos</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argumentos</em>' containment reference.
   * @see #setArgumentos(arglist)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getcreating_aux_Argumentos()
   * @model containment="true"
   * @generated
   */
  arglist getArgumentos();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.creating_aux#getArgumentos <em>Argumentos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argumentos</em>' containment reference.
   * @see #getArgumentos()
   * @generated
   */
  void setArgumentos(arglist value);

} // creating_aux
