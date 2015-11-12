/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.type_specifier#getNome <em>Nome</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#gettype_specifier()
 * @model
 * @generated
 */
public interface type_specifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#gettype_specifier_Nome()
   * @model
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.type_specifier#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

} // type_specifier
