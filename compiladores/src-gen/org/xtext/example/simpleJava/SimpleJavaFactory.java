/**
 */
package org.xtext.example.simpleJava;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.simpleJava.SimpleJavaPackage
 * @generated
 */
public interface SimpleJavaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimpleJavaFactory eINSTANCE = org.xtext.example.simpleJava.impl.SimpleJavaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>compilation unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>compilation unit</em>'.
   * @generated
   */
  compilation_unit createcompilation_unit();

  /**
   * Returns a new object of class '<em>package statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>package statement</em>'.
   * @generated
   */
  package_statement createpackage_statement();

  /**
   * Returns a new object of class '<em>import statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>import statement</em>'.
   * @generated
   */
  import_statement createimport_statement();

  /**
   * Returns a new object of class '<em>type declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type declaration</em>'.
   * @generated
   */
  type_declaration createtype_declaration();

  /**
   * Returns a new object of class '<em>doc comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>doc comment</em>'.
   * @generated
   */
  doc_comment createdoc_comment();

  /**
   * Returns a new object of class '<em>class declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>class declaration</em>'.
   * @generated
   */
  class_declaration createclass_declaration();

  /**
   * Returns a new object of class '<em>interface declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>interface declaration</em>'.
   * @generated
   */
  interface_declaration createinterface_declaration();

  /**
   * Returns a new object of class '<em>field declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>field declaration</em>'.
   * @generated
   */
  field_declaration createfield_declaration();

  /**
   * Returns a new object of class '<em>method declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>method declaration</em>'.
   * @generated
   */
  method_declaration createmethod_declaration();

  /**
   * Returns a new object of class '<em>parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter</em>'.
   * @generated
   */
  parameter createparameter();

  /**
   * Returns a new object of class '<em>parameter list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter list</em>'.
   * @generated
   */
  parameter_list createparameter_list();

  /**
   * Returns a new object of class '<em>statement block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statement block</em>'.
   * @generated
   */
  statement_block createstatement_block();

  /**
   * Returns a new object of class '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statement</em>'.
   * @generated
   */
  statement createstatement();

  /**
   * Returns a new object of class '<em>variable declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable declaration</em>'.
   * @generated
   */
  variable_declaration createvariable_declaration();

  /**
   * Returns a new object of class '<em>variable declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable declarator</em>'.
   * @generated
   */
  variable_declarator createvariable_declarator();

  /**
   * Returns a new object of class '<em>variable initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable initializer</em>'.
   * @generated
   */
  variable_initializer createvariable_initializer();

  /**
   * Returns a new object of class '<em>if statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>if statement</em>'.
   * @generated
   */
  if_statement createif_statement();

  /**
   * Returns a new object of class '<em>do statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>do statement</em>'.
   * @generated
   */
  do_statement createdo_statement();

  /**
   * Returns a new object of class '<em>while statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>while statement</em>'.
   * @generated
   */
  while_statement createwhile_statement();

  /**
   * Returns a new object of class '<em>for statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>for statement</em>'.
   * @generated
   */
  for_statement createfor_statement();

  /**
   * Returns a new object of class '<em>try statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>try statement</em>'.
   * @generated
   */
  try_statement createtry_statement();

  /**
   * Returns a new object of class '<em>switch statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>switch statement</em>'.
   * @generated
   */
  switch_statement createswitch_statement();

  /**
   * Returns a new object of class '<em>constructor declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constructor declaration</em>'.
   * @generated
   */
  constructor_declaration createconstructor_declaration();

  /**
   * Returns a new object of class '<em>static initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>static initializer</em>'.
   * @generated
   */
  static_initializer createstatic_initializer();

  /**
   * Returns a new object of class '<em>creating expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>creating expression</em>'.
   * @generated
   */
  creating_expression createcreating_expression();

  /**
   * Returns a new object of class '<em>exp aux</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>exp aux</em>'.
   * @generated
   */
  exp_aux createexp_aux();

  /**
   * Returns a new object of class '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression</em>'.
   * @generated
   */
  expression createexpression();

  /**
   * Returns a new object of class '<em>expression aux</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression aux</em>'.
   * @generated
   */
  expression_aux createexpression_aux();

  /**
   * Returns a new object of class '<em>mais aux</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>mais aux</em>'.
   * @generated
   */
  mais_aux createmais_aux();

  /**
   * Returns a new object of class '<em>new Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>new Block</em>'.
   * @generated
   */
  newBlock createnewBlock();

  /**
   * Returns a new object of class '<em>creating aux</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>creating aux</em>'.
   * @generated
   */
  creating_aux createcreating_aux();

  /**
   * Returns a new object of class '<em>aux</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>aux</em>'.
   * @generated
   */
  aux createaux();

  /**
   * Returns a new object of class '<em>literal expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>literal expression</em>'.
   * @generated
   */
  literal_expression createliteral_expression();

  /**
   * Returns a new object of class '<em>logical expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical expression</em>'.
   * @generated
   */
  logical_expression createlogical_expression();

  /**
   * Returns a new object of class '<em>bit expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bit expression</em>'.
   * @generated
   */
  bit_expression createbit_expression();

  /**
   * Returns a new object of class '<em>numeric expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>numeric expression</em>'.
   * @generated
   */
  numeric_expression createnumeric_expression();

  /**
   * Returns a new object of class '<em>arglist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>arglist</em>'.
   * @generated
   */
  arglist createarglist();

  /**
   * Returns a new object of class '<em>name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>name</em>'.
   * @generated
   */
  name createname();

  /**
   * Returns a new object of class '<em>package name aux</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>package name aux</em>'.
   * @generated
   */
  package_name_aux createpackage_name_aux();

  /**
   * Returns a new object of class '<em>type specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type specifier</em>'.
   * @generated
   */
  type_specifier createtype_specifier();

  /**
   * Returns a new object of class '<em>type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type</em>'.
   * @generated
   */
  type createtype();

  /**
   * Returns a new object of class '<em>MODIFIER</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MODIFIER</em>'.
   * @generated
   */
  MODIFIER createMODIFIER();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimpleJavaPackage getSimpleJavaPackage();

} //SimpleJavaFactory
