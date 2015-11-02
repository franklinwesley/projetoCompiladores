/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>compilation unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.compilation_unit#getPacote <em>Pacote</em>}</li>
 *   <li>{@link org.xtext.simpleJava.compilation_unit#getImportes <em>Importes</em>}</li>
 *   <li>{@link org.xtext.simpleJava.compilation_unit#getDeclaracao <em>Declaracao</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getcompilation_unit()
 * @model
 * @generated
 */
public interface compilation_unit extends EObject
{
  /**
   * Returns the value of the '<em><b>Pacote</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pacote</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pacote</em>' containment reference.
   * @see #setPacote(package_statement)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getcompilation_unit_Pacote()
   * @model containment="true"
   * @generated
   */
  package_statement getPacote();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.compilation_unit#getPacote <em>Pacote</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pacote</em>' containment reference.
   * @see #getPacote()
   * @generated
   */
  void setPacote(package_statement value);

  /**
   * Returns the value of the '<em><b>Importes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simpleJava.import_statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Importes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Importes</em>' containment reference list.
   * @see org.xtext.simpleJava.SimpleJavaPackage#getcompilation_unit_Importes()
   * @model containment="true"
   * @generated
   */
  EList<import_statement> getImportes();

  /**
   * Returns the value of the '<em><b>Declaracao</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simpleJava.type_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaracao</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaracao</em>' containment reference list.
   * @see org.xtext.simpleJava.SimpleJavaPackage#getcompilation_unit_Declaracao()
   * @model containment="true"
   * @generated
   */
  EList<type_declaration> getDeclaracao();

} // compilation_unit
