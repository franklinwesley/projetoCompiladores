/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.common.util.EList;

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
   * Returns the value of the '<em><b>Corpo</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.simpleJava.statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Corpo</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Corpo</em>' containment reference list.
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_block_Corpo()
   * @model containment="true"
   * @generated
   */
  EList<statement> getCorpo();

} // statement_block
