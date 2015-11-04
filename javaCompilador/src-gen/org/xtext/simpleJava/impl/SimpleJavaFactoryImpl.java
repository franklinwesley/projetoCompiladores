/**
 */
package org.xtext.simpleJava.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.simpleJava.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleJavaFactoryImpl extends EFactoryImpl implements SimpleJavaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimpleJavaFactory init()
  {
    try
    {
      SimpleJavaFactory theSimpleJavaFactory = (SimpleJavaFactory)EPackage.Registry.INSTANCE.getEFactory(SimpleJavaPackage.eNS_URI);
      if (theSimpleJavaFactory != null)
      {
        return theSimpleJavaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimpleJavaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleJavaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SimpleJavaPackage.MODEL: return createModel();
      case SimpleJavaPackage.COMPILATION_UNIT: return createcompilation_unit();
      case SimpleJavaPackage.PACKAGE_STATEMENT: return createpackage_statement();
      case SimpleJavaPackage.IMPORT_STATEMENT: return createimport_statement();
      case SimpleJavaPackage.TYPE_DECLARATION: return createtype_declaration();
      case SimpleJavaPackage.DOC_COMMENT: return createdoc_comment();
      case SimpleJavaPackage.CLASS_DECLARATION: return createclass_declaration();
      case SimpleJavaPackage.INTERFACE_DECLARATION: return createinterface_declaration();
      case SimpleJavaPackage.FIELD_DECLARATION: return createfield_declaration();
      case SimpleJavaPackage.METHOD_DECLARATION: return createmethod_declaration();
      case SimpleJavaPackage.PARAMETER: return createparameter();
      case SimpleJavaPackage.PARAMETER_LIST: return createparameter_list();
      case SimpleJavaPackage.STATEMENT_BLOCK: return createstatement_block();
      case SimpleJavaPackage.STATEMENT: return createstatement();
      case SimpleJavaPackage.VARIABLE_DECLARATION: return createvariable_declaration();
      case SimpleJavaPackage.VARIABLE_DECLARATOR: return createvariable_declarator();
      case SimpleJavaPackage.VARIABLE_INITIALIZER: return createvariable_initializer();
      case SimpleJavaPackage.IF_STATEMENT: return createif_statement();
      case SimpleJavaPackage.DO_STATEMENT: return createdo_statement();
      case SimpleJavaPackage.WHILE_STATEMENT: return createwhile_statement();
      case SimpleJavaPackage.FOR_STATEMENT: return createfor_statement();
      case SimpleJavaPackage.TRY_STATEMENT: return createtry_statement();
      case SimpleJavaPackage.SWITCH_STATEMENT: return createswitch_statement();
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION: return createconstructor_declaration();
      case SimpleJavaPackage.STATIC_INITIALIZER: return createstatic_initializer();
      case SimpleJavaPackage.CREATING_EXPRESSION: return createcreating_expression();
      case SimpleJavaPackage.EXP_AUX: return createexp_aux();
      case SimpleJavaPackage.EXPRESSION: return createexpression();
      case SimpleJavaPackage.EXPRESSION_AUX: return createexpression_aux();
      case SimpleJavaPackage.MAIS_AUX: return createmais_aux();
      case SimpleJavaPackage.NEW_BLOCK: return createnewBlock();
      case SimpleJavaPackage.CREATING_AUX: return createcreating_aux();
      case SimpleJavaPackage.AUX: return createaux();
      case SimpleJavaPackage.LITERAL_EXPRESSION: return createliteral_expression();
      case SimpleJavaPackage.LOGICAL_EXPRESSION: return createlogical_expression();
      case SimpleJavaPackage.BIT_EXPRESSION: return createbit_expression();
      case SimpleJavaPackage.NUMERIC_EXPRESSION: return createnumeric_expression();
      case SimpleJavaPackage.ARGLIST: return createarglist();
      case SimpleJavaPackage.NAME: return createname();
      case SimpleJavaPackage.PACKAGE_NAME_AUX: return createpackage_name_aux();
      case SimpleJavaPackage.TYPE_SPECIFIER: return createtype_specifier();
      case SimpleJavaPackage.TYPE: return createtype();
      case SimpleJavaPackage.MODIFIER: return createMODIFIER();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compilation_unit createcompilation_unit()
  {
    compilation_unitImpl compilation_unit = new compilation_unitImpl();
    return compilation_unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public package_statement createpackage_statement()
  {
    package_statementImpl package_statement = new package_statementImpl();
    return package_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public import_statement createimport_statement()
  {
    import_statementImpl import_statement = new import_statementImpl();
    return import_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_declaration createtype_declaration()
  {
    type_declarationImpl type_declaration = new type_declarationImpl();
    return type_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public doc_comment createdoc_comment()
  {
    doc_commentImpl doc_comment = new doc_commentImpl();
    return doc_comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public class_declaration createclass_declaration()
  {
    class_declarationImpl class_declaration = new class_declarationImpl();
    return class_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interface_declaration createinterface_declaration()
  {
    interface_declarationImpl interface_declaration = new interface_declarationImpl();
    return interface_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public field_declaration createfield_declaration()
  {
    field_declarationImpl field_declaration = new field_declarationImpl();
    return field_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public method_declaration createmethod_declaration()
  {
    method_declarationImpl method_declaration = new method_declarationImpl();
    return method_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter createparameter()
  {
    parameterImpl parameter = new parameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_list createparameter_list()
  {
    parameter_listImpl parameter_list = new parameter_listImpl();
    return parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_block createstatement_block()
  {
    statement_blockImpl statement_block = new statement_blockImpl();
    return statement_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_declaration createvariable_declaration()
  {
    variable_declarationImpl variable_declaration = new variable_declarationImpl();
    return variable_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_declarator createvariable_declarator()
  {
    variable_declaratorImpl variable_declarator = new variable_declaratorImpl();
    return variable_declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_initializer createvariable_initializer()
  {
    variable_initializerImpl variable_initializer = new variable_initializerImpl();
    return variable_initializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public if_statement createif_statement()
  {
    if_statementImpl if_statement = new if_statementImpl();
    return if_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public do_statement createdo_statement()
  {
    do_statementImpl do_statement = new do_statementImpl();
    return do_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public while_statement createwhile_statement()
  {
    while_statementImpl while_statement = new while_statementImpl();
    return while_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public for_statement createfor_statement()
  {
    for_statementImpl for_statement = new for_statementImpl();
    return for_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public try_statement createtry_statement()
  {
    try_statementImpl try_statement = new try_statementImpl();
    return try_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public switch_statement createswitch_statement()
  {
    switch_statementImpl switch_statement = new switch_statementImpl();
    return switch_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constructor_declaration createconstructor_declaration()
  {
    constructor_declarationImpl constructor_declaration = new constructor_declarationImpl();
    return constructor_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static_initializer createstatic_initializer()
  {
    static_initializerImpl static_initializer = new static_initializerImpl();
    return static_initializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public creating_expression createcreating_expression()
  {
    creating_expressionImpl creating_expression = new creating_expressionImpl();
    return creating_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exp_aux createexp_aux()
  {
    exp_auxImpl exp_aux = new exp_auxImpl();
    return exp_aux;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression createexpression()
  {
    expressionImpl expression = new expressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_aux createexpression_aux()
  {
    expression_auxImpl expression_aux = new expression_auxImpl();
    return expression_aux;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mais_aux createmais_aux()
  {
    mais_auxImpl mais_aux = new mais_auxImpl();
    return mais_aux;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public newBlock createnewBlock()
  {
    newBlockImpl newBlock = new newBlockImpl();
    return newBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public creating_aux createcreating_aux()
  {
    creating_auxImpl creating_aux = new creating_auxImpl();
    return creating_aux;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aux createaux()
  {
    auxImpl aux = new auxImpl();
    return aux;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public literal_expression createliteral_expression()
  {
    literal_expressionImpl literal_expression = new literal_expressionImpl();
    return literal_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_expression createlogical_expression()
  {
    logical_expressionImpl logical_expression = new logical_expressionImpl();
    return logical_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bit_expression createbit_expression()
  {
    bit_expressionImpl bit_expression = new bit_expressionImpl();
    return bit_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public numeric_expression createnumeric_expression()
  {
    numeric_expressionImpl numeric_expression = new numeric_expressionImpl();
    return numeric_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arglist createarglist()
  {
    arglistImpl arglist = new arglistImpl();
    return arglist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public name createname()
  {
    nameImpl name = new nameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public package_name_aux createpackage_name_aux()
  {
    package_name_auxImpl package_name_aux = new package_name_auxImpl();
    return package_name_aux;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_specifier createtype_specifier()
  {
    type_specifierImpl type_specifier = new type_specifierImpl();
    return type_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type createtype()
  {
    typeImpl type = new typeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MODIFIER createMODIFIER()
  {
    MODIFIERImpl modifier = new MODIFIERImpl();
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleJavaPackage getSimpleJavaPackage()
  {
    return (SimpleJavaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimpleJavaPackage getPackage()
  {
    return SimpleJavaPackage.eINSTANCE;
  }

} //SimpleJavaFactoryImpl
