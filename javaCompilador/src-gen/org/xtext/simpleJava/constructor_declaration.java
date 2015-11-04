/**
 */
package org.xtext.simpleJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>constructor declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.constructor_declaration#getModificador <em>Modificador</em>}</li>
 *   <li>{@link org.xtext.simpleJava.constructor_declaration#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.xtext.simpleJava.constructor_declaration#getNomeContrutor <em>Nome Contrutor</em>}</li>
 *   <li>{@link org.xtext.simpleJava.constructor_declaration#getParametrosContrutor <em>Parametros Contrutor</em>}</li>
 *   <li>{@link org.xtext.simpleJava.constructor_declaration#getBlocoConstrutor <em>Bloco Construtor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getconstructor_declaration()
 * @model
 * @generated
 */
public interface constructor_declaration extends newBlock
{
  /**
   * Returns the value of the '<em><b>Modificador</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modificador</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modificador</em>' containment reference.
   * @see #setModificador(MODIFIER)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getconstructor_declaration_Modificador()
   * @model containment="true"
   * @generated
   */
  MODIFIER getModificador();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.constructor_declaration#getModificador <em>Modificador</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modificador</em>' containment reference.
   * @see #getModificador()
   * @generated
   */
  void setModificador(MODIFIER value);

  /**
   * Returns the value of the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' containment reference.
   * @see #setTipo(type)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getconstructor_declaration_Tipo()
   * @model containment="true"
   * @generated
   */
  type getTipo();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.constructor_declaration#getTipo <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' containment reference.
   * @see #getTipo()
   * @generated
   */
  void setTipo(type value);

  /**
   * Returns the value of the '<em><b>Nome Contrutor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome Contrutor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome Contrutor</em>' attribute.
   * @see #setNomeContrutor(String)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getconstructor_declaration_NomeContrutor()
   * @model
   * @generated
   */
  String getNomeContrutor();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.constructor_declaration#getNomeContrutor <em>Nome Contrutor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome Contrutor</em>' attribute.
   * @see #getNomeContrutor()
   * @generated
   */
  void setNomeContrutor(String value);

  /**
   * Returns the value of the '<em><b>Parametros Contrutor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parametros Contrutor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parametros Contrutor</em>' containment reference.
   * @see #setParametrosContrutor(parameter_list)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getconstructor_declaration_ParametrosContrutor()
   * @model containment="true"
   * @generated
   */
  parameter_list getParametrosContrutor();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.constructor_declaration#getParametrosContrutor <em>Parametros Contrutor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parametros Contrutor</em>' containment reference.
   * @see #getParametrosContrutor()
   * @generated
   */
  void setParametrosContrutor(parameter_list value);

  /**
   * Returns the value of the '<em><b>Bloco Construtor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco Construtor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco Construtor</em>' containment reference.
   * @see #setBlocoConstrutor(statement_block)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getconstructor_declaration_BlocoConstrutor()
   * @model containment="true"
   * @generated
   */
  statement_block getBlocoConstrutor();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.constructor_declaration#getBlocoConstrutor <em>Bloco Construtor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco Construtor</em>' containment reference.
   * @see #getBlocoConstrutor()
   * @generated
   */
  void setBlocoConstrutor(statement_block value);

} // constructor_declaration
