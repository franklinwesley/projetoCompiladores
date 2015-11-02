/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>package statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.package_statement#getNoomePacote <em>Noome Pacote</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getpackage_statement()
 * @model
 * @generated
 */
public interface package_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Noome Pacote</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Noome Pacote</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Noome Pacote</em>' containment reference.
   * @see #setNoomePacote(name)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getpackage_statement_NoomePacote()
   * @model containment="true"
   * @generated
   */
  name getNoomePacote();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.package_statement#getNoomePacote <em>Noome Pacote</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Noome Pacote</em>' containment reference.
   * @see #getNoomePacote()
   * @generated
   */
  void setNoomePacote(name value);

} // package_statement
