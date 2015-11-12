/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>creating expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.creating_expression#getNovoObjeto <em>Novo Objeto</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.creating_expression#getParametros <em>Parametros</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.creating_expression#getTipoObjeto <em>Tipo Objeto</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.creating_expression#getExpressaoNew <em>Expressao New</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.creating_expression#getNovo <em>Novo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getcreating_expression()
 * @model
 * @generated
 */
public interface creating_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Novo Objeto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Novo Objeto</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Novo Objeto</em>' containment reference.
   * @see #setNovoObjeto(name)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getcreating_expression_NovoObjeto()
   * @model containment="true"
   * @generated
   */
  name getNovoObjeto();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.creating_expression#getNovoObjeto <em>Novo Objeto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Novo Objeto</em>' containment reference.
   * @see #getNovoObjeto()
   * @generated
   */
  void setNovoObjeto(name value);

  /**
   * Returns the value of the '<em><b>Parametros</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parametros</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parametros</em>' containment reference.
   * @see #setParametros(creating_aux)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getcreating_expression_Parametros()
   * @model containment="true"
   * @generated
   */
  creating_aux getParametros();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.creating_expression#getParametros <em>Parametros</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parametros</em>' containment reference.
   * @see #getParametros()
   * @generated
   */
  void setParametros(creating_aux value);

  /**
   * Returns the value of the '<em><b>Tipo Objeto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo Objeto</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Objeto</em>' containment reference.
   * @see #setTipoObjeto(type_specifier)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getcreating_expression_TipoObjeto()
   * @model containment="true"
   * @generated
   */
  type_specifier getTipoObjeto();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.creating_expression#getTipoObjeto <em>Tipo Objeto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Objeto</em>' containment reference.
   * @see #getTipoObjeto()
   * @generated
   */
  void setTipoObjeto(type_specifier value);

  /**
   * Returns the value of the '<em><b>Expressao New</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressao New</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressao New</em>' containment reference.
   * @see #setExpressaoNew(expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getcreating_expression_ExpressaoNew()
   * @model containment="true"
   * @generated
   */
  expression getExpressaoNew();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.creating_expression#getExpressaoNew <em>Expressao New</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao New</em>' containment reference.
   * @see #getExpressaoNew()
   * @generated
   */
  void setExpressaoNew(expression value);

  /**
   * Returns the value of the '<em><b>Novo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Novo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Novo</em>' containment reference.
   * @see #setNovo(newBlock)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getcreating_expression_Novo()
   * @model containment="true"
   * @generated
   */
  newBlock getNovo();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.creating_expression#getNovo <em>Novo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Novo</em>' containment reference.
   * @see #getNovo()
   * @generated
   */
  void setNovo(newBlock value);

} // creating_expression
