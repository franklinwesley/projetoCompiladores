/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.type_specifier#getNomeTipo <em>Nome Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#gettype_specifier()
 * @model
 * @generated
 */
public interface type_specifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Nome Tipo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome Tipo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome Tipo</em>' attribute.
   * @see #setNomeTipo(String)
   * @see org.xtext.simpleJava.SimpleJavaPackage#gettype_specifier_NomeTipo()
   * @model
   * @generated
   */
  String getNomeTipo();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.type_specifier#getNomeTipo <em>Nome Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome Tipo</em>' attribute.
   * @see #getNomeTipo()
   * @generated
   */
  void setNomeTipo(String value);

} // type_specifier
