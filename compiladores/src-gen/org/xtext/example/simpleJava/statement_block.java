/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statement block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.statement_block#getCorpo <em>Corpo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_block()
 * @model
 * @generated
 */
public interface statement_block extends EObject
{
  /**
   * Returns the value of the '<em><b>Corpo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Corpo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Corpo</em>' containment reference.
   * @see #setCorpo(statement)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_block_Corpo()
   * @model containment="true"
   * @generated
   */
  statement getCorpo();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement_block#getCorpo <em>Corpo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Corpo</em>' containment reference.
   * @see #getCorpo()
   * @generated
   */
  void setCorpo(statement value);

} // statement_block
