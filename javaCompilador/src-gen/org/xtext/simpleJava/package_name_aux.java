/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>package name aux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.package_name_aux#getNomePacote <em>Nome Pacote</em>}</li>
 *   <li>{@link org.xtext.simpleJava.package_name_aux#getPacote <em>Pacote</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getpackage_name_aux()
 * @model
 * @generated
 */
public interface package_name_aux extends EObject
{
  /**
   * Returns the value of the '<em><b>Nome Pacote</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome Pacote</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome Pacote</em>' attribute.
   * @see #setNomePacote(String)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getpackage_name_aux_NomePacote()
   * @model
   * @generated
   */
  String getNomePacote();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.package_name_aux#getNomePacote <em>Nome Pacote</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome Pacote</em>' attribute.
   * @see #getNomePacote()
   * @generated
   */
  void setNomePacote(String value);

  /**
   * Returns the value of the '<em><b>Pacote</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pacote</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pacote</em>' containment reference.
   * @see #setPacote(package_name_aux)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getpackage_name_aux_Pacote()
   * @model containment="true"
   * @generated
   */
  package_name_aux getPacote();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.package_name_aux#getPacote <em>Pacote</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pacote</em>' containment reference.
   * @see #getPacote()
   * @generated
   */
  void setPacote(package_name_aux value);

} // package_name_aux
