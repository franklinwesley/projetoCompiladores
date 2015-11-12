/**
 */
package org.xtext.example.simpleJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.expression#getLogical <em>Logical</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.expression#getNumeric <em>Numeric</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.expression#getBit <em>Bit</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.expression#getNovo <em>Novo</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.expression#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.expression#getIdentificador <em>Identificador</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getexpression()
 * @model
 * @generated
 */
public interface expression extends expression_aux
{
  /**
   * Returns the value of the '<em><b>Logical</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logical</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logical</em>' containment reference.
   * @see #setLogical(logical_expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getexpression_Logical()
   * @model containment="true"
   * @generated
   */
  logical_expression getLogical();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.expression#getLogical <em>Logical</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logical</em>' containment reference.
   * @see #getLogical()
   * @generated
   */
  void setLogical(logical_expression value);

  /**
   * Returns the value of the '<em><b>Numeric</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numeric</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numeric</em>' containment reference.
   * @see #setNumeric(numeric_expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getexpression_Numeric()
   * @model containment="true"
   * @generated
   */
  numeric_expression getNumeric();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.expression#getNumeric <em>Numeric</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numeric</em>' containment reference.
   * @see #getNumeric()
   * @generated
   */
  void setNumeric(numeric_expression value);

  /**
   * Returns the value of the '<em><b>Bit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bit</em>' containment reference.
   * @see #setBit(bit_expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getexpression_Bit()
   * @model containment="true"
   * @generated
   */
  bit_expression getBit();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.expression#getBit <em>Bit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bit</em>' containment reference.
   * @see #getBit()
   * @generated
   */
  void setBit(bit_expression value);

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
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getexpression_Novo()
   * @model containment="true"
   * @generated
   */
  creating_expression getNovo();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.expression#getNovo <em>Novo</em>}' containment reference.
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
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getexpression_Literal()
   * @model containment="true"
   * @generated
   */
  literal_expression getLiteral();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.expression#getLiteral <em>Literal</em>}' containment reference.
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
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getexpression_Identificador()
   * @model
   * @generated
   */
  String getIdentificador();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.expression#getIdentificador <em>Identificador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identificador</em>' attribute.
   * @see #getIdentificador()
   * @generated
   */
  void setIdentificador(String value);

} // expression
