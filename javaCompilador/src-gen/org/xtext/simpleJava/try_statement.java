/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>try statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.try_statement#getBlocoTry <em>Bloco Try</em>}</li>
 *   <li>{@link org.xtext.simpleJava.try_statement#getParametroCatch <em>Parametro Catch</em>}</li>
 *   <li>{@link org.xtext.simpleJava.try_statement#getBlocoCatch <em>Bloco Catch</em>}</li>
 *   <li>{@link org.xtext.simpleJava.try_statement#getBlocoFinally <em>Bloco Finally</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#gettry_statement()
 * @model
 * @generated
 */
public interface try_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Bloco Try</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco Try</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco Try</em>' containment reference.
   * @see #setBlocoTry(statement_block)
   * @see org.xtext.simpleJava.SimpleJavaPackage#gettry_statement_BlocoTry()
   * @model containment="true"
   * @generated
   */
  statement_block getBlocoTry();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.try_statement#getBlocoTry <em>Bloco Try</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco Try</em>' containment reference.
   * @see #getBlocoTry()
   * @generated
   */
  void setBlocoTry(statement_block value);

  /**
   * Returns the value of the '<em><b>Parametro Catch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parametro Catch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parametro Catch</em>' containment reference.
   * @see #setParametroCatch(parameter)
   * @see org.xtext.simpleJava.SimpleJavaPackage#gettry_statement_ParametroCatch()
   * @model containment="true"
   * @generated
   */
  parameter getParametroCatch();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.try_statement#getParametroCatch <em>Parametro Catch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parametro Catch</em>' containment reference.
   * @see #getParametroCatch()
   * @generated
   */
  void setParametroCatch(parameter value);

  /**
   * Returns the value of the '<em><b>Bloco Catch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco Catch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco Catch</em>' containment reference.
   * @see #setBlocoCatch(statement_block)
   * @see org.xtext.simpleJava.SimpleJavaPackage#gettry_statement_BlocoCatch()
   * @model containment="true"
   * @generated
   */
  statement_block getBlocoCatch();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.try_statement#getBlocoCatch <em>Bloco Catch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco Catch</em>' containment reference.
   * @see #getBlocoCatch()
   * @generated
   */
  void setBlocoCatch(statement_block value);

  /**
   * Returns the value of the '<em><b>Bloco Finally</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco Finally</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco Finally</em>' containment reference.
   * @see #setBlocoFinally(statement_block)
   * @see org.xtext.simpleJava.SimpleJavaPackage#gettry_statement_BlocoFinally()
   * @model containment="true"
   * @generated
   */
  statement_block getBlocoFinally();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.try_statement#getBlocoFinally <em>Bloco Finally</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco Finally</em>' containment reference.
   * @see #getBlocoFinally()
   * @generated
   */
  void setBlocoFinally(statement_block value);

} // try_statement
