/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.class_declaration#getModificadores <em>Modificadores</em>}</li>
 *   <li>{@link org.xtext.simpleJava.class_declaration#getNomeClasse <em>Nome Classe</em>}</li>
 *   <li>{@link org.xtext.simpleJava.class_declaration#getSuperclasse <em>Superclasse</em>}</li>
 *   <li>{@link org.xtext.simpleJava.class_declaration#getImplementosClasse <em>Implementos Classe</em>}</li>
 *   <li>{@link org.xtext.simpleJava.class_declaration#getCorpoClasse <em>Corpo Classe</em>}</li>
 *   <li>{@link org.xtext.simpleJava.class_declaration#getDeclaracaoClasse <em>Declaracao Classe</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getclass_declaration()
 * @model
 * @generated
 */
public interface class_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Modificadores</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simpleJava.MODIFIER}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modificadores</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modificadores</em>' containment reference list.
   * @see org.xtext.simpleJava.SimpleJavaPackage#getclass_declaration_Modificadores()
   * @model containment="true"
   * @generated
   */
  EList<MODIFIER> getModificadores();

  /**
   * Returns the value of the '<em><b>Nome Classe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome Classe</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome Classe</em>' attribute.
   * @see #setNomeClasse(String)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getclass_declaration_NomeClasse()
   * @model
   * @generated
   */
  String getNomeClasse();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.class_declaration#getNomeClasse <em>Nome Classe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome Classe</em>' attribute.
   * @see #getNomeClasse()
   * @generated
   */
  void setNomeClasse(String value);

  /**
   * Returns the value of the '<em><b>Superclasse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Superclasse</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Superclasse</em>' containment reference.
   * @see #setSuperclasse(name)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getclass_declaration_Superclasse()
   * @model containment="true"
   * @generated
   */
  name getSuperclasse();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.class_declaration#getSuperclasse <em>Superclasse</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Superclasse</em>' containment reference.
   * @see #getSuperclasse()
   * @generated
   */
  void setSuperclasse(name value);

  /**
   * Returns the value of the '<em><b>Implementos Classe</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simpleJava.name}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implementos Classe</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implementos Classe</em>' containment reference list.
   * @see org.xtext.simpleJava.SimpleJavaPackage#getclass_declaration_ImplementosClasse()
   * @model containment="true"
   * @generated
   */
  EList<name> getImplementosClasse();

  /**
   * Returns the value of the '<em><b>Corpo Classe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Corpo Classe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Corpo Classe</em>' containment reference.
   * @see #setCorpoClasse(field_declaration)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getclass_declaration_CorpoClasse()
   * @model containment="true"
   * @generated
   */
  field_declaration getCorpoClasse();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.class_declaration#getCorpoClasse <em>Corpo Classe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Corpo Classe</em>' containment reference.
   * @see #getCorpoClasse()
   * @generated
   */
  void setCorpoClasse(field_declaration value);

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
   * @see org.xtext.simpleJava.SimpleJavaPackage#getclass_declaration_DeclaracaoClasse()
   * @model containment="true"
   * @generated
   */
  class_declaration getDeclaracaoClasse();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.class_declaration#getDeclaracaoClasse <em>Declaracao Classe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaracao Classe</em>' containment reference.
   * @see #getDeclaracaoClasse()
   * @generated
   */
  void setDeclaracaoClasse(class_declaration value);

} // class_declaration
