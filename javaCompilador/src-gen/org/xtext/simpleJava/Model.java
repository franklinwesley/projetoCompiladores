/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.Model#getComp <em>Comp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Comp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp</em>' containment reference.
   * @see #setComp(compilation_unit)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getModel_Comp()
   * @model containment="true"
   * @generated
   */
  compilation_unit getComp();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.Model#getComp <em>Comp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comp</em>' containment reference.
   * @see #getComp()
   * @generated
   */
  void setComp(compilation_unit value);

} // Model
