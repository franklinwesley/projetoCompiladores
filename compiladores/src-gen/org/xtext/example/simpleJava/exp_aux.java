/**
 */
package org.xtext.example.simpleJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>exp aux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.exp_aux#getExpressao <em>Expressao</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getexp_aux()
 * @model
 * @generated
 */
public interface exp_aux extends expression
{
  /**
   * Returns the value of the '<em><b>Expressao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressao</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressao</em>' containment reference.
   * @see #setExpressao(expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getexp_aux_Expressao()
   * @model containment="true"
   * @generated
   */
  expression getExpressao();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.exp_aux#getExpressao <em>Expressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao</em>' containment reference.
   * @see #getExpressao()
   * @generated
   */
  void setExpressao(expression value);

} // exp_aux
