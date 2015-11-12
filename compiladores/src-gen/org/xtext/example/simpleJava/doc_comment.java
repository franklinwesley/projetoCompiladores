/**
 */
package org.xtext.example.simpleJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>doc comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.doc_comment#getComentario <em>Comentario</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getdoc_comment()
 * @model
 * @generated
 */
public interface doc_comment extends type_declaration
{
  /**
   * Returns the value of the '<em><b>Comentario</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comentario</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comentario</em>' attribute.
   * @see #setComentario(String)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getdoc_comment_Comentario()
   * @model
   * @generated
   */
  String getComentario();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.doc_comment#getComentario <em>Comentario</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comentario</em>' attribute.
   * @see #getComentario()
   * @generated
   */
  void setComentario(String value);

} // doc_comment
