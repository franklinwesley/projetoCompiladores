/**
 */
package org.xtext.example.simpleJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.type#getPrimitivo <em>Primitivo</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.type#getObjeto <em>Objeto</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#gettype()
 * @model
 * @generated
 */
public interface type extends exp_aux
{
  /**
   * Returns the value of the '<em><b>Primitivo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitivo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitivo</em>' containment reference.
   * @see #setPrimitivo(type_specifier)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#gettype_Primitivo()
   * @model containment="true"
   * @generated
   */
  type_specifier getPrimitivo();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.type#getPrimitivo <em>Primitivo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitivo</em>' containment reference.
   * @see #getPrimitivo()
   * @generated
   */
  void setPrimitivo(type_specifier value);

  /**
   * Returns the value of the '<em><b>Objeto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objeto</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objeto</em>' containment reference.
   * @see #setObjeto(name)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#gettype_Objeto()
   * @model containment="true"
   * @generated
   */
  name getObjeto();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.type#getObjeto <em>Objeto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objeto</em>' containment reference.
   * @see #getObjeto()
   * @generated
   */
  void setObjeto(name value);

} // type
