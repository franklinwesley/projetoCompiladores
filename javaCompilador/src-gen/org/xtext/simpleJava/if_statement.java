/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>if statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.if_statement#getEspressaoIf <em>Espressao If</em>}</li>
 *   <li>{@link org.xtext.simpleJava.if_statement#getBlcoIf <em>Blco If</em>}</li>
 *   <li>{@link org.xtext.simpleJava.if_statement#getBlocoElse <em>Bloco Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getif_statement()
 * @model
 * @generated
 */
public interface if_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Espressao If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Espressao If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Espressao If</em>' containment reference.
   * @see #setEspressaoIf(expression)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getif_statement_EspressaoIf()
   * @model containment="true"
   * @generated
   */
  expression getEspressaoIf();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.if_statement#getEspressaoIf <em>Espressao If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Espressao If</em>' containment reference.
   * @see #getEspressaoIf()
   * @generated
   */
  void setEspressaoIf(expression value);

  /**
   * Returns the value of the '<em><b>Blco If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blco If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blco If</em>' containment reference.
   * @see #setBlcoIf(statement)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getif_statement_BlcoIf()
   * @model containment="true"
   * @generated
   */
  statement getBlcoIf();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.if_statement#getBlcoIf <em>Blco If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Blco If</em>' containment reference.
   * @see #getBlcoIf()
   * @generated
   */
  void setBlcoIf(statement value);

  /**
   * Returns the value of the '<em><b>Bloco Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco Else</em>' containment reference.
   * @see #setBlocoElse(statement)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getif_statement_BlocoElse()
   * @model containment="true"
   * @generated
   */
  statement getBlocoElse();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.if_statement#getBlocoElse <em>Bloco Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco Else</em>' containment reference.
   * @see #getBlocoElse()
   * @generated
   */
  void setBlocoElse(statement value);

} // if_statement
