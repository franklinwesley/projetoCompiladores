/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.expression#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.xtext.simpleJava.expression#getNovo <em>Novo</em>}</li>
 *   <li>{@link org.xtext.simpleJava.expression#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.simpleJava.expression#getIdentificador <em>Identificador</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression()
 * @model
 * @generated
 */
public interface expression extends expression_aux
{
  /**
   * Returns the value of the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' containment reference.
   * @see #setTipo(EObject)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_Tipo()
   * @model containment="true"
   * @generated
   */
  EObject getTipo();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.expression#getTipo <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' containment reference.
   * @see #getTipo()
   * @generated
   */
  void setTipo(EObject value);

  /**
   * Returns the value of the '<em><b>Novo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Novo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Novo</em>' containment reference.
   * @see #setNovo(creating_expression)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_Novo()
   * @model containment="true"
   * @generated
   */
  creating_expression getNovo();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.expression#getNovo <em>Novo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Novo</em>' containment reference.
   * @see #getNovo()
   * @generated
   */
  void setNovo(creating_expression value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(literal_expression)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_Literal()
   * @model containment="true"
   * @generated
   */
  literal_expression getLiteral();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.expression#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(literal_expression value);

  /**
   * Returns the value of the '<em><b>Identificador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identificador</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identificador</em>' attribute.
   * @see #setIdentificador(String)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_Identificador()
   * @model
   * @generated
   */
  String getIdentificador();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.expression#getIdentificador <em>Identificador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identificador</em>' attribute.
   * @see #getIdentificador()
   * @generated
   */
  void setIdentificador(String value);

} // expression
