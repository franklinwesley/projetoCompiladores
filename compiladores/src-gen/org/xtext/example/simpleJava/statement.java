/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.statement#getDeclaracaoVariavel <em>Declaracao Variavel</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getExpressao <em>Expressao</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getBloco <em>Bloco</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getCorpoIf <em>Corpo If</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getCorpoDoWhile <em>Corpo Do While</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getCorpoWhile <em>Corpo While</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getCorpoFor <em>Corpo For</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getCorpoTryCatch <em>Corpo Try Catch</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getCorpoSwitchCase <em>Corpo Switch Case</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getExpressaoSynchronized <em>Expressao Synchronized</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getCorpoSynchronize <em>Corpo Synchronize</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getReturn <em>Return</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getExececao <em>Exececao</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getBreak <em>Break</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.statement#getContinue <em>Continue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement()
 * @model
 * @generated
 */
public interface statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaracao Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaracao Variavel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaracao Variavel</em>' containment reference.
   * @see #setDeclaracaoVariavel(variable_declaration)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_DeclaracaoVariavel()
   * @model containment="true"
   * @generated
   */
  variable_declaration getDeclaracaoVariavel();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getDeclaracaoVariavel <em>Declaracao Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaracao Variavel</em>' containment reference.
   * @see #getDeclaracaoVariavel()
   * @generated
   */
  void setDeclaracaoVariavel(variable_declaration value);

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
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_Expressao()
   * @model containment="true"
   * @generated
   */
  expression getExpressao();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getExpressao <em>Expressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao</em>' containment reference.
   * @see #getExpressao()
   * @generated
   */
  void setExpressao(expression value);

  /**
   * Returns the value of the '<em><b>Bloco</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco</em>' containment reference.
   * @see #setBloco(statement_block)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_Bloco()
   * @model containment="true"
   * @generated
   */
  statement_block getBloco();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getBloco <em>Bloco</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco</em>' containment reference.
   * @see #getBloco()
   * @generated
   */
  void setBloco(statement_block value);

  /**
   * Returns the value of the '<em><b>Corpo If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Corpo If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Corpo If</em>' containment reference.
   * @see #setCorpoIf(if_statement)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_CorpoIf()
   * @model containment="true"
   * @generated
   */
  if_statement getCorpoIf();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getCorpoIf <em>Corpo If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Corpo If</em>' containment reference.
   * @see #getCorpoIf()
   * @generated
   */
  void setCorpoIf(if_statement value);

  /**
   * Returns the value of the '<em><b>Corpo Do While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Corpo Do While</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Corpo Do While</em>' containment reference.
   * @see #setCorpoDoWhile(do_statement)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_CorpoDoWhile()
   * @model containment="true"
   * @generated
   */
  do_statement getCorpoDoWhile();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getCorpoDoWhile <em>Corpo Do While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Corpo Do While</em>' containment reference.
   * @see #getCorpoDoWhile()
   * @generated
   */
  void setCorpoDoWhile(do_statement value);

  /**
   * Returns the value of the '<em><b>Corpo While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Corpo While</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Corpo While</em>' containment reference.
   * @see #setCorpoWhile(while_statement)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_CorpoWhile()
   * @model containment="true"
   * @generated
   */
  while_statement getCorpoWhile();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getCorpoWhile <em>Corpo While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Corpo While</em>' containment reference.
   * @see #getCorpoWhile()
   * @generated
   */
  void setCorpoWhile(while_statement value);

  /**
   * Returns the value of the '<em><b>Corpo For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Corpo For</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Corpo For</em>' containment reference.
   * @see #setCorpoFor(for_statement)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_CorpoFor()
   * @model containment="true"
   * @generated
   */
  for_statement getCorpoFor();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getCorpoFor <em>Corpo For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Corpo For</em>' containment reference.
   * @see #getCorpoFor()
   * @generated
   */
  void setCorpoFor(for_statement value);

  /**
   * Returns the value of the '<em><b>Corpo Try Catch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Corpo Try Catch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Corpo Try Catch</em>' containment reference.
   * @see #setCorpoTryCatch(try_statement)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_CorpoTryCatch()
   * @model containment="true"
   * @generated
   */
  try_statement getCorpoTryCatch();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getCorpoTryCatch <em>Corpo Try Catch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Corpo Try Catch</em>' containment reference.
   * @see #getCorpoTryCatch()
   * @generated
   */
  void setCorpoTryCatch(try_statement value);

  /**
   * Returns the value of the '<em><b>Corpo Switch Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Corpo Switch Case</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Corpo Switch Case</em>' containment reference.
   * @see #setCorpoSwitchCase(switch_statement)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_CorpoSwitchCase()
   * @model containment="true"
   * @generated
   */
  switch_statement getCorpoSwitchCase();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getCorpoSwitchCase <em>Corpo Switch Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Corpo Switch Case</em>' containment reference.
   * @see #getCorpoSwitchCase()
   * @generated
   */
  void setCorpoSwitchCase(switch_statement value);

  /**
   * Returns the value of the '<em><b>Expressao Synchronized</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressao Synchronized</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressao Synchronized</em>' containment reference.
   * @see #setExpressaoSynchronized(expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_ExpressaoSynchronized()
   * @model containment="true"
   * @generated
   */
  expression getExpressaoSynchronized();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getExpressaoSynchronized <em>Expressao Synchronized</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao Synchronized</em>' containment reference.
   * @see #getExpressaoSynchronized()
   * @generated
   */
  void setExpressaoSynchronized(expression value);

  /**
   * Returns the value of the '<em><b>Corpo Synchronize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Corpo Synchronize</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Corpo Synchronize</em>' containment reference.
   * @see #setCorpoSynchronize(statement)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_CorpoSynchronize()
   * @model containment="true"
   * @generated
   */
  statement getCorpoSynchronize();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getCorpoSynchronize <em>Corpo Synchronize</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Corpo Synchronize</em>' containment reference.
   * @see #getCorpoSynchronize()
   * @generated
   */
  void setCorpoSynchronize(statement value);

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_Return()
   * @model containment="true"
   * @generated
   */
  expression getReturn();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(expression value);

  /**
   * Returns the value of the '<em><b>Exececao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exececao</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exececao</em>' containment reference.
   * @see #setExececao(expression)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_Exececao()
   * @model containment="true"
   * @generated
   */
  expression getExececao();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getExececao <em>Exececao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exececao</em>' containment reference.
   * @see #getExececao()
   * @generated
   */
  void setExececao(expression value);

  /**
   * Returns the value of the '<em><b>Break</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Break</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Break</em>' attribute.
   * @see #setBreak(String)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_Break()
   * @model
   * @generated
   */
  String getBreak();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getBreak <em>Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Break</em>' attribute.
   * @see #getBreak()
   * @generated
   */
  void setBreak(String value);

  /**
   * Returns the value of the '<em><b>Continue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Continue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Continue</em>' attribute.
   * @see #setContinue(String)
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#getstatement_Continue()
   * @model
   * @generated
   */
  String getContinue();

  /**
   * Sets the value of the '{@link org.xtext.example.simpleJava.statement#getContinue <em>Continue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continue</em>' attribute.
   * @see #getContinue()
   * @generated
   */
  void setContinue(String value);

} // statement
