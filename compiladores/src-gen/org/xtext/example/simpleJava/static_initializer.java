/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>static initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.static_initializer#getBlocoEstatico <em>Bloco Estatico</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatic_initializer()
 * @model
 * @generated
 */
public interface static_initializer extends EObject
{
  /**
   * Returns the value of the '<em><b>Bloco Estatico</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco Estatico</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco Estatico</em>' containment reference.
   * @see #setBlocoEstatico(statement_block)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatic_initializer_BlocoEstatico()
   * @model containment="true"
   * @generated
   */
  statement_block getBlocoEstatico();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.static_initializer#getBlocoEstatico <em>Bloco Estatico</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco Estatico</em>' containment reference.
   * @see #getBlocoEstatico()
   * @generated
   */
  void setBlocoEstatico(statement_block value);

} // static_initializer
