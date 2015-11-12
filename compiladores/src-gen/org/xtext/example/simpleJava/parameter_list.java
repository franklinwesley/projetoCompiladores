/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parameter list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.parameter_list#getParametros <em>Parametros</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getparameter_list()
 * @model
 * @generated
 */
public interface parameter_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Parametros</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.simpleJava.parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parametros</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parametros</em>' containment reference list.
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getparameter_list_Parametros()
   * @model containment="true"
   * @generated
   */
  EList<parameter> getParametros();

} // parameter_list
