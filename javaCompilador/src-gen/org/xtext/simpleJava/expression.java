/**
 */
package org.xtext.simpleJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.expression#getTipoLogical <em>Tipo Logical</em>}</li>
 *   <li>{@link org.xtext.simpleJava.expression#getTipoNumeric <em>Tipo Numeric</em>}</li>
 *   <li>{@link org.xtext.simpleJava.expression#getTipoBit <em>Tipo Bit</em>}</li>
 *   <li>{@link org.xtext.simpleJava.expression#getNew <em>New</em>}</li>
 *   <li>{@link org.xtext.simpleJava.expression#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.simpleJava.expression#getIdentificador <em>Identificador</em>}</li>
 *   <li>{@link org.xtext.simpleJava.expression#getExpressao <em>Expressao</em>}</li>
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
   * Returns the value of the '<em><b>Tipo Logical</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo Logical</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Logical</em>' containment reference.
   * @see #setTipoLogical(logical_expression)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_TipoLogical()
   * @model containment="true"
   * @generated
   */
  logical_expression getTipoLogical();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.expression#getTipoLogical <em>Tipo Logical</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Logical</em>' containment reference.
   * @see #getTipoLogical()
   * @generated
   */
  void setTipoLogical(logical_expression value);

  /**
   * Returns the value of the '<em><b>Tipo Numeric</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo Numeric</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Numeric</em>' containment reference.
   * @see #setTipoNumeric(numeric_expression)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_TipoNumeric()
   * @model containment="true"
   * @generated
   */
  numeric_expression getTipoNumeric();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.expression#getTipoNumeric <em>Tipo Numeric</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Numeric</em>' containment reference.
   * @see #getTipoNumeric()
   * @generated
   */
  void setTipoNumeric(numeric_expression value);

  /**
   * Returns the value of the '<em><b>Tipo Bit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo Bit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Bit</em>' containment reference.
   * @see #setTipoBit(bit_expression)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_TipoBit()
   * @model containment="true"
   * @generated
   */
  bit_expression getTipoBit();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.expression#getTipoBit <em>Tipo Bit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Bit</em>' containment reference.
   * @see #getTipoBit()
   * @generated
   */
  void setTipoBit(bit_expression value);

  /**
   * Returns the value of the '<em><b>New</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New</em>' containment reference.
   * @see #setNew(creating_expression)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_New()
   * @model containment="true"
   * @generated
   */
  creating_expression getNew();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.expression#getNew <em>New</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New</em>' containment reference.
   * @see #getNew()
   * @generated
   */
  void setNew(creating_expression value);

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
   * @see org.xtext.simpleJava.SimpleJavaPackage#getexpression_Expressao()
   * @model containment="true"
   * @generated
   */
  expression getExpressao();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.expression#getExpressao <em>Expressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao</em>' containment reference.
   * @see #getExpressao()
   * @generated
   */
  void setExpressao(expression value);

} // expression
