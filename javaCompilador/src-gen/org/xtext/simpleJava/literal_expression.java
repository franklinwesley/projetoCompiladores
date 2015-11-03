/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>literal expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.literal_expression#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.xtext.simpleJava.literal_expression#getInteiro <em>Inteiro</em>}</li>
 *   <li>{@link org.xtext.simpleJava.literal_expression#getFloat <em>Float</em>}</li>
 *   <li>{@link org.xtext.simpleJava.literal_expression#getString <em>String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getliteral_expression()
 * @model
 * @generated
 */
public interface literal_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Decimal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decimal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decimal</em>' attribute.
   * @see #setDecimal(String)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getliteral_expression_Decimal()
   * @model
   * @generated
   */
  String getDecimal();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.literal_expression#getDecimal <em>Decimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decimal</em>' attribute.
   * @see #getDecimal()
   * @generated
   */
  void setDecimal(String value);

  /**
   * Returns the value of the '<em><b>Inteiro</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inteiro</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inteiro</em>' attribute.
   * @see #setInteiro(String)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getliteral_expression_Inteiro()
   * @model
   * @generated
   */
  String getInteiro();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.literal_expression#getInteiro <em>Inteiro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inteiro</em>' attribute.
   * @see #getInteiro()
   * @generated
   */
  void setInteiro(String value);

  /**
   * Returns the value of the '<em><b>Float</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Float</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Float</em>' attribute.
   * @see #setFloat(String)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getliteral_expression_Float()
   * @model
   * @generated
   */
  String getFloat();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.literal_expression#getFloat <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float</em>' attribute.
   * @see #getFloat()
   * @generated
   */
  void setFloat(String value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getliteral_expression_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.literal_expression#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

} // literal_expression
