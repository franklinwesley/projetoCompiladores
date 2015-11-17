/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interface declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.interface_declaration#getModificadores <em>Modificadores</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.interface_declaration#getNomeInterface <em>Nome Interface</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.interface_declaration#getSuperinterfaces <em>Superinterfaces</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.interface_declaration#getCorpoInterface <em>Corpo Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getinterface_declaration()
 * @model
 * @generated
 */
public interface interface_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Modificadores</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.simpleJava.MODIFIER}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modificadores</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modificadores</em>' containment reference list.
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getinterface_declaration_Modificadores()
   * @model containment="true"
   * @generated
   */
  EList<MODIFIER> getModificadores();

  /**
   * Returns the value of the '<em><b>Nome Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome Interface</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome Interface</em>' attribute.
   * @see #setNomeInterface(String)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getinterface_declaration_NomeInterface()
   * @model
   * @generated
   */
  String getNomeInterface();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.interface_declaration#getNomeInterface <em>Nome Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome Interface</em>' attribute.
   * @see #getNomeInterface()
   * @generated
   */
  void setNomeInterface(String value);

  /**
   * Returns the value of the '<em><b>Superinterfaces</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.simpleJava.name}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Superinterfaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Superinterfaces</em>' containment reference list.
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getinterface_declaration_Superinterfaces()
   * @model containment="true"
   * @generated
   */
  EList<name> getSuperinterfaces();

  /**
   * Returns the value of the '<em><b>Corpo Interface</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.simpleJava.field_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Corpo Interface</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Corpo Interface</em>' containment reference list.
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getinterface_declaration_CorpoInterface()
   * @model containment="true"
   * @generated
   */
  EList<field_declaration> getCorpoInterface();

} // interface_declaration
