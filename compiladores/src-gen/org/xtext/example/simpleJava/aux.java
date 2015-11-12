/**
 */
package org.xtext.example.simpleJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>aux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.aux#getEspressao <em>Espressao</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getaux()
 * @model
 * @generated
 */
public interface aux extends expression_aux, creating_aux
{
  /**
   * Returns the value of the '<em><b>Espressao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Espressao</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Espressao</em>' containment reference.
   * @see #setEspressao(expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getaux_Espressao()
   * @model containment="true"
   * @generated
   */
  expression getEspressao();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.aux#getEspressao <em>Espressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Espressao</em>' containment reference.
   * @see #getEspressao()
   * @generated
   */
  void setEspressao(expression value);

} // aux
