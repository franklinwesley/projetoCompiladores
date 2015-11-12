/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.type_declaration#getDeclaracaoClasse <em>Declaracao Classe</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.type_declaration#getDeclaracaoInterface <em>Declaracao Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#gettype_declaration()
 * @model
 * @generated
 */
public interface type_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaracao Classe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaracao Classe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaracao Classe</em>' containment reference.
   * @see #setDeclaracaoClasse(class_declaration)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#gettype_declaration_DeclaracaoClasse()
   * @model containment="true"
   * @generated
   */
  class_declaration getDeclaracaoClasse();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.type_declaration#getDeclaracaoClasse <em>Declaracao Classe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaracao Classe</em>' containment reference.
   * @see #getDeclaracaoClasse()
   * @generated
   */
  void setDeclaracaoClasse(class_declaration value);

  /**
   * Returns the value of the '<em><b>Declaracao Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaracao Interface</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaracao Interface</em>' containment reference.
   * @see #setDeclaracaoInterface(interface_declaration)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#gettype_declaration_DeclaracaoInterface()
   * @model containment="true"
   * @generated
   */
  interface_declaration getDeclaracaoInterface();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.type_declaration#getDeclaracaoInterface <em>Declaracao Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaracao Interface</em>' containment reference.
   * @see #getDeclaracaoInterface()
   * @generated
   */
  void setDeclaracaoInterface(interface_declaration value);

} // type_declaration
