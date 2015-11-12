/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>import statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.import_statement#getNomeImporte <em>Nome Importe</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getimport_statement()
 * @model
 * @generated
 */
public interface import_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Nome Importe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome Importe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome Importe</em>' containment reference.
   * @see #setNomeImporte(name)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getimport_statement_NomeImporte()
   * @model containment="true"
   * @generated
   */
  name getNomeImporte();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.import_statement#getNomeImporte <em>Nome Importe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome Importe</em>' containment reference.
   * @see #getNomeImporte()
   * @generated
   */
  void setNomeImporte(name value);

} // import_statement
