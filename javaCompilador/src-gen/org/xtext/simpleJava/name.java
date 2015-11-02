/**
 */
package org.xtext.simpleJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.name#getNome <em>Nome</em>}</li>
 *   <li>{@link org.xtext.simpleJava.name#getPacote <em>Pacote</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simpleJava.SimpleJavaPackage#getname()
 * @model
 * @generated
 */
public interface name extends expression_aux
{
  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getname_Nome()
   * @model
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.name#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>Pacote</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pacote</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pacote</em>' containment reference.
   * @see #setPacote(package_name_aux)
   * @see org.xtext.simpleJava.SimpleJavaPackage#getname_Pacote()
   * @model containment="true"
   * @generated
   */
  package_name_aux getPacote();

  /**
   * Sets the value of the '{@link org.xtext.simpleJava.name#getPacote <em>Pacote</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pacote</em>' containment reference.
   * @see #getPacote()
   * @generated
   */
  void setPacote(package_name_aux value);

} // name
