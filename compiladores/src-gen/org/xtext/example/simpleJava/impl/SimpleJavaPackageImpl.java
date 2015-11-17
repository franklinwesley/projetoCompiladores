/**
 */
package org.xtext.example.simpleJava.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.simpleJava.Model;
import org.xtext.example.simpleJava.SimpleJavaFactory;
import org.xtext.example.simpleJava.SimpleJavaPackage;
import org.xtext.example.simpleJava.arglist;
import org.xtext.example.simpleJava.aux;
import org.xtext.example.simpleJava.bit_expression;
import org.xtext.example.simpleJava.class_declaration;
import org.xtext.example.simpleJava.compilation_unit;
import org.xtext.example.simpleJava.constructor_declaration;
import org.xtext.example.simpleJava.creating_aux;
import org.xtext.example.simpleJava.creating_expression;
import org.xtext.example.simpleJava.do_statement;
import org.xtext.example.simpleJava.doc_comment;
import org.xtext.example.simpleJava.exp_aux;
import org.xtext.example.simpleJava.expression;
import org.xtext.example.simpleJava.expression_aux;
import org.xtext.example.simpleJava.field_declaration;
import org.xtext.example.simpleJava.for_statement;
import org.xtext.example.simpleJava.if_statement;
import org.xtext.example.simpleJava.import_statement;
import org.xtext.example.simpleJava.interface_declaration;
import org.xtext.example.simpleJava.literal_expression;
import org.xtext.example.simpleJava.logical_expression;
import org.xtext.example.simpleJava.mais_aux;
import org.xtext.example.simpleJava.method_declaration;
import org.xtext.example.simpleJava.name;
import org.xtext.example.simpleJava.newBlock;
import org.xtext.example.simpleJava.numeric_expression;
import org.xtext.example.simpleJava.package_name_aux;
import org.xtext.example.simpleJava.package_statement;
import org.xtext.example.simpleJava.parameter;
import org.xtext.example.simpleJava.parameter_list;
import org.xtext.example.simpleJava.statement;
import org.xtext.example.simpleJava.statement_block;
import org.xtext.example.simpleJava.static_initializer;
import org.xtext.example.simpleJava.switch_statement;
import org.xtext.example.simpleJava.try_statement;
import org.xtext.example.simpleJava.type;
import org.xtext.example.simpleJava.type_declaration;
import org.xtext.example.simpleJava.type_specifier;
import org.xtext.example.simpleJava.variable_declaration;
import org.xtext.example.simpleJava.variable_declarator;
import org.xtext.example.simpleJava.variable_initializer;
import org.xtext.example.simpleJava.while_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleJavaPackageImpl extends EPackageImpl implements SimpleJavaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compilation_unitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass package_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass import_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doc_commentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass class_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass field_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass method_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameter_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statement_blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_declaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_initializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass if_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass do_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass while_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass try_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switch_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructor_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass static_initializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass creating_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exp_auxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_auxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mais_auxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass creating_auxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass auxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literal_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logical_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bit_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numeric_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arglistEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass package_name_auxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_specifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifierEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.simpleJava.SimpleJavaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimpleJavaPackageImpl()
  {
    super(eNS_URI, SimpleJavaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SimpleJavaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimpleJavaPackage init()
  {
    if (isInited) return (SimpleJavaPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleJavaPackage.eNS_URI);

    // Obtain or create and register package
    SimpleJavaPackageImpl theSimpleJavaPackage = (SimpleJavaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleJavaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleJavaPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSimpleJavaPackage.createPackageContents();

    // Initialize created meta-data
    theSimpleJavaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimpleJavaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SimpleJavaPackage.eNS_URI, theSimpleJavaPackage);
    return theSimpleJavaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcompilation_unit()
  {
    return compilation_unitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompilation_unit_Pacote()
  {
    return (EReference)compilation_unitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompilation_unit_Importes()
  {
    return (EReference)compilation_unitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompilation_unit_Declaracao()
  {
    return (EReference)compilation_unitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpackage_statement()
  {
    return package_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpackage_statement_NoomePacote()
  {
    return (EReference)package_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getimport_statement()
  {
    return import_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getimport_statement_NomeImporte()
  {
    return (EReference)import_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype_declaration()
  {
    return type_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_declaration_DeclaracaoClasse()
  {
    return (EReference)type_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_declaration_DeclaracaoInterface()
  {
    return (EReference)type_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdoc_comment()
  {
    return doc_commentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdoc_comment_Comentario()
  {
    return (EAttribute)doc_commentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getclass_declaration()
  {
    return class_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getclass_declaration_Modificadores()
  {
    return (EReference)class_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getclass_declaration_NomeClasse()
  {
    return (EAttribute)class_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getclass_declaration_Superclasse()
  {
    return (EReference)class_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getclass_declaration_ImplementosClasse()
  {
    return (EReference)class_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getclass_declaration_CorpoClasse()
  {
    return (EReference)class_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getclass_declaration_DeclaracaoClasse()
  {
    return (EReference)class_declarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinterface_declaration()
  {
    return interface_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinterface_declaration_Modificadores()
  {
    return (EReference)interface_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinterface_declaration_NomeInterface()
  {
    return (EAttribute)interface_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinterface_declaration_Superinterfaces()
  {
    return (EReference)interface_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinterface_declaration_CorpoInterface()
  {
    return (EReference)interface_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfield_declaration()
  {
    return field_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfield_declaration_Comentario()
  {
    return (EReference)field_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfield_declaration_DeclaracaoMetodo()
  {
    return (EReference)field_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfield_declaration_DeclaracaoConstrutor()
  {
    return (EReference)field_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfield_declaration_DeclaracaoVariavel()
  {
    return (EReference)field_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfield_declaration_Estatico()
  {
    return (EReference)field_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmethod_declaration()
  {
    return method_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmethod_declaration_ModificadorMetodo()
  {
    return (EReference)method_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmethod_declaration_TipoRetorno()
  {
    return (EReference)method_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmethod_declaration_NomeMetodo()
  {
    return (EAttribute)method_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmethod_declaration_ParametrosMetodo()
  {
    return (EReference)method_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmethod_declaration_BlocoMetodo()
  {
    return (EReference)method_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getparameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getparameter_TipoParametro()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameter_NomeParametro()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getparameter_list()
  {
    return parameter_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getparameter_list_Parametros()
  {
    return (EReference)parameter_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatement_block()
  {
    return statement_blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_block_Corpo()
  {
    return (EReference)statement_blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_DeclaracaoVariavel()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_Expressao()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_Newbloco()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_CorpoIf()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_CorpoDoWhile()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_CorpoWhile()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_CorpoFor()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_CorpoTryCatch()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_CorpoSwitchCase()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_ExpressaoSynchronized()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_CorpoSynchronize()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_Return()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_Exececao()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstatement_Break()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstatement_Continue()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable_declaration()
  {
    return variable_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_declaration_Modificador()
  {
    return (EReference)variable_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_declaration_TipoVariavel()
  {
    return (EReference)variable_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_declaration_DeclaracaoVariaveis()
  {
    return (EReference)variable_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_declaration_BlocoVariavel()
  {
    return (EReference)variable_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable_declarator()
  {
    return variable_declaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvariable_declarator_NomeVariavel()
  {
    return (EAttribute)variable_declaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvariable_declarator_Op()
  {
    return (EAttribute)variable_declaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_declarator_ValorVariavel()
  {
    return (EReference)variable_declaratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable_initializer()
  {
    return variable_initializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_initializer_ExpressaoVariavel()
  {
    return (EReference)variable_initializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_initializer_ValorVariaveis()
  {
    return (EReference)variable_initializerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getif_statement()
  {
    return if_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getif_statement_EspressaoIf()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getif_statement_BlcoIf()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getif_statement_BlocoElse()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdo_statement()
  {
    return do_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdo_statement_BlocoDo()
  {
    return (EReference)do_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdo_statement_ExpressaoWhile()
  {
    return (EReference)do_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwhile_statement()
  {
    return while_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwhile_statement_ExpressaoWhile()
  {
    return (EReference)while_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwhile_statement_BlocoWhile()
  {
    return (EReference)while_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfor_statement()
  {
    return for_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_statement_DeclaracaoVariavel()
  {
    return (EReference)for_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_statement_ExpressaoDeclaracao()
  {
    return (EReference)for_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_statement_ExpressaoFor()
  {
    return (EReference)for_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_statement_ExpressaoIncremento()
  {
    return (EReference)for_statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_statement_BlocoFor()
  {
    return (EReference)for_statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettry_statement()
  {
    return try_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettry_statement_BlocoTry()
  {
    return (EReference)try_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettry_statement_ParametroCatch()
  {
    return (EReference)try_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettry_statement_BlocoCatch()
  {
    return (EReference)try_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettry_statement_BlocoFinally()
  {
    return (EReference)try_statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getswitch_statement()
  {
    return switch_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getswitch_statement_ExpressaoSwitch()
  {
    return (EReference)switch_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getswitch_statement_ExpressaoCases()
  {
    return (EReference)switch_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getswitch_statement_BlocoSwitch()
  {
    return (EReference)switch_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstructor_declaration()
  {
    return constructor_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstructor_declaration_Modificador()
  {
    return (EReference)constructor_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstructor_declaration_NomeContrutor()
  {
    return (EAttribute)constructor_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstructor_declaration_ParametrosContrutor()
  {
    return (EReference)constructor_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstructor_declaration_BlocoConstrutor()
  {
    return (EReference)constructor_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatic_initializer()
  {
    return static_initializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatic_initializer_BlocoEstatico()
  {
    return (EReference)static_initializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcreating_expression()
  {
    return creating_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcreating_expression_NovoObjeto()
  {
    return (EReference)creating_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcreating_expression_Parametros()
  {
    return (EReference)creating_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcreating_expression_TipoObjeto()
  {
    return (EReference)creating_expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcreating_expression_ExpressaoNew()
  {
    return (EReference)creating_expressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcreating_expression_Novo()
  {
    return (EReference)creating_expressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexp_aux()
  {
    return exp_auxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexp_aux_Expressao()
  {
    return (EReference)exp_auxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Logical()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Numeric()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Bit()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Novo()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Literal()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getexpression_Identificador()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpression_aux()
  {
    return expression_auxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_aux_Parametros()
  {
    return (EReference)expression_auxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_aux_Exp()
  {
    return (EReference)expression_auxEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_aux_Op()
  {
    return (EReference)expression_auxEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getexpression_aux_Operador()
  {
    return (EAttribute)expression_auxEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_aux_Expressoes()
  {
    return (EReference)expression_auxEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmais_aux()
  {
    return mais_auxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmais_aux_Operador()
  {
    return (EAttribute)mais_auxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnewBlock()
  {
    return newBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcreating_aux()
  {
    return creating_auxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcreating_aux_Argumentos()
  {
    return (EReference)creating_auxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaux()
  {
    return auxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getaux_Espressao()
  {
    return (EReference)auxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getliteral_expression()
  {
    return literal_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getliteral_expression_Decimal()
  {
    return (EAttribute)literal_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getliteral_expression_Inteiro()
  {
    return (EAttribute)literal_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getliteral_expression_L_float()
  {
    return (EAttribute)literal_expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getliteral_expression_String()
  {
    return (EAttribute)literal_expressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlogical_expression()
  {
    return logical_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlogical_expression_Operador()
  {
    return (EAttribute)logical_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogical_expression_Exp()
  {
    return (EReference)logical_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbit_expression()
  {
    return bit_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbit_expression_Operador()
  {
    return (EAttribute)bit_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbit_expression_Expressao()
  {
    return (EReference)bit_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnumeric_expression()
  {
    return numeric_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnumeric_expression_Operador()
  {
    return (EAttribute)numeric_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnumeric_expression_Expressao()
  {
    return (EReference)numeric_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getarglist()
  {
    return arglistEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getarglist_ExpressoesArgumentos()
  {
    return (EReference)arglistEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getarglist_TipoParametro()
  {
    return (EReference)arglistEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getarglist_NomeParametro()
  {
    return (EAttribute)arglistEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getname()
  {
    return nameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getname_Nome()
  {
    return (EAttribute)nameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getname_Pacote()
  {
    return (EReference)nameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpackage_name_aux()
  {
    return package_name_auxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpackage_name_aux_NomePacote()
  {
    return (EAttribute)package_name_auxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpackage_name_aux_Pacote()
  {
    return (EReference)package_name_auxEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype_specifier()
  {
    return type_specifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettype_specifier_Nome()
  {
    return (EAttribute)type_specifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_Primitivo()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_Objeto()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMODIFIER()
  {
    return modifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMODIFIER_Modificador()
  {
    return (EAttribute)modifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleJavaFactory getSimpleJavaFactory()
  {
    return (SimpleJavaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);

    compilation_unitEClass = createEClass(COMPILATION_UNIT);
    createEReference(compilation_unitEClass, COMPILATION_UNIT__PACOTE);
    createEReference(compilation_unitEClass, COMPILATION_UNIT__IMPORTES);
    createEReference(compilation_unitEClass, COMPILATION_UNIT__DECLARACAO);

    package_statementEClass = createEClass(PACKAGE_STATEMENT);
    createEReference(package_statementEClass, PACKAGE_STATEMENT__NOOME_PACOTE);

    import_statementEClass = createEClass(IMPORT_STATEMENT);
    createEReference(import_statementEClass, IMPORT_STATEMENT__NOME_IMPORTE);

    type_declarationEClass = createEClass(TYPE_DECLARATION);
    createEReference(type_declarationEClass, TYPE_DECLARATION__DECLARACAO_CLASSE);
    createEReference(type_declarationEClass, TYPE_DECLARATION__DECLARACAO_INTERFACE);

    doc_commentEClass = createEClass(DOC_COMMENT);
    createEAttribute(doc_commentEClass, DOC_COMMENT__COMENTARIO);

    class_declarationEClass = createEClass(CLASS_DECLARATION);
    createEReference(class_declarationEClass, CLASS_DECLARATION__MODIFICADORES);
    createEAttribute(class_declarationEClass, CLASS_DECLARATION__NOME_CLASSE);
    createEReference(class_declarationEClass, CLASS_DECLARATION__SUPERCLASSE);
    createEReference(class_declarationEClass, CLASS_DECLARATION__IMPLEMENTOS_CLASSE);
    createEReference(class_declarationEClass, CLASS_DECLARATION__CORPO_CLASSE);
    createEReference(class_declarationEClass, CLASS_DECLARATION__DECLARACAO_CLASSE);

    interface_declarationEClass = createEClass(INTERFACE_DECLARATION);
    createEReference(interface_declarationEClass, INTERFACE_DECLARATION__MODIFICADORES);
    createEAttribute(interface_declarationEClass, INTERFACE_DECLARATION__NOME_INTERFACE);
    createEReference(interface_declarationEClass, INTERFACE_DECLARATION__SUPERINTERFACES);
    createEReference(interface_declarationEClass, INTERFACE_DECLARATION__CORPO_INTERFACE);

    field_declarationEClass = createEClass(FIELD_DECLARATION);
    createEReference(field_declarationEClass, FIELD_DECLARATION__COMENTARIO);
    createEReference(field_declarationEClass, FIELD_DECLARATION__DECLARACAO_METODO);
    createEReference(field_declarationEClass, FIELD_DECLARATION__DECLARACAO_CONSTRUTOR);
    createEReference(field_declarationEClass, FIELD_DECLARATION__DECLARACAO_VARIAVEL);
    createEReference(field_declarationEClass, FIELD_DECLARATION__ESTATICO);

    method_declarationEClass = createEClass(METHOD_DECLARATION);
    createEReference(method_declarationEClass, METHOD_DECLARATION__MODIFICADOR_METODO);
    createEReference(method_declarationEClass, METHOD_DECLARATION__TIPO_RETORNO);
    createEAttribute(method_declarationEClass, METHOD_DECLARATION__NOME_METODO);
    createEReference(method_declarationEClass, METHOD_DECLARATION__PARAMETROS_METODO);
    createEReference(method_declarationEClass, METHOD_DECLARATION__BLOCO_METODO);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__TIPO_PARAMETRO);
    createEAttribute(parameterEClass, PARAMETER__NOME_PARAMETRO);

    parameter_listEClass = createEClass(PARAMETER_LIST);
    createEReference(parameter_listEClass, PARAMETER_LIST__PARAMETROS);

    statement_blockEClass = createEClass(STATEMENT_BLOCK);
    createEReference(statement_blockEClass, STATEMENT_BLOCK__CORPO);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__DECLARACAO_VARIAVEL);
    createEReference(statementEClass, STATEMENT__EXPRESSAO);
    createEReference(statementEClass, STATEMENT__NEWBLOCO);
    createEReference(statementEClass, STATEMENT__CORPO_IF);
    createEReference(statementEClass, STATEMENT__CORPO_DO_WHILE);
    createEReference(statementEClass, STATEMENT__CORPO_WHILE);
    createEReference(statementEClass, STATEMENT__CORPO_FOR);
    createEReference(statementEClass, STATEMENT__CORPO_TRY_CATCH);
    createEReference(statementEClass, STATEMENT__CORPO_SWITCH_CASE);
    createEReference(statementEClass, STATEMENT__EXPRESSAO_SYNCHRONIZED);
    createEReference(statementEClass, STATEMENT__CORPO_SYNCHRONIZE);
    createEReference(statementEClass, STATEMENT__RETURN);
    createEReference(statementEClass, STATEMENT__EXECECAO);
    createEAttribute(statementEClass, STATEMENT__BREAK);
    createEAttribute(statementEClass, STATEMENT__CONTINUE);

    variable_declarationEClass = createEClass(VARIABLE_DECLARATION);
    createEReference(variable_declarationEClass, VARIABLE_DECLARATION__MODIFICADOR);
    createEReference(variable_declarationEClass, VARIABLE_DECLARATION__TIPO_VARIAVEL);
    createEReference(variable_declarationEClass, VARIABLE_DECLARATION__DECLARACAO_VARIAVEIS);
    createEReference(variable_declarationEClass, VARIABLE_DECLARATION__BLOCO_VARIAVEL);

    variable_declaratorEClass = createEClass(VARIABLE_DECLARATOR);
    createEAttribute(variable_declaratorEClass, VARIABLE_DECLARATOR__NOME_VARIAVEL);
    createEAttribute(variable_declaratorEClass, VARIABLE_DECLARATOR__OP);
    createEReference(variable_declaratorEClass, VARIABLE_DECLARATOR__VALOR_VARIAVEL);

    variable_initializerEClass = createEClass(VARIABLE_INITIALIZER);
    createEReference(variable_initializerEClass, VARIABLE_INITIALIZER__EXPRESSAO_VARIAVEL);
    createEReference(variable_initializerEClass, VARIABLE_INITIALIZER__VALOR_VARIAVEIS);

    if_statementEClass = createEClass(IF_STATEMENT);
    createEReference(if_statementEClass, IF_STATEMENT__ESPRESSAO_IF);
    createEReference(if_statementEClass, IF_STATEMENT__BLCO_IF);
    createEReference(if_statementEClass, IF_STATEMENT__BLOCO_ELSE);

    do_statementEClass = createEClass(DO_STATEMENT);
    createEReference(do_statementEClass, DO_STATEMENT__BLOCO_DO);
    createEReference(do_statementEClass, DO_STATEMENT__EXPRESSAO_WHILE);

    while_statementEClass = createEClass(WHILE_STATEMENT);
    createEReference(while_statementEClass, WHILE_STATEMENT__EXPRESSAO_WHILE);
    createEReference(while_statementEClass, WHILE_STATEMENT__BLOCO_WHILE);

    for_statementEClass = createEClass(FOR_STATEMENT);
    createEReference(for_statementEClass, FOR_STATEMENT__DECLARACAO_VARIAVEL);
    createEReference(for_statementEClass, FOR_STATEMENT__EXPRESSAO_DECLARACAO);
    createEReference(for_statementEClass, FOR_STATEMENT__EXPRESSAO_FOR);
    createEReference(for_statementEClass, FOR_STATEMENT__EXPRESSAO_INCREMENTO);
    createEReference(for_statementEClass, FOR_STATEMENT__BLOCO_FOR);

    try_statementEClass = createEClass(TRY_STATEMENT);
    createEReference(try_statementEClass, TRY_STATEMENT__BLOCO_TRY);
    createEReference(try_statementEClass, TRY_STATEMENT__PARAMETRO_CATCH);
    createEReference(try_statementEClass, TRY_STATEMENT__BLOCO_CATCH);
    createEReference(try_statementEClass, TRY_STATEMENT__BLOCO_FINALLY);

    switch_statementEClass = createEClass(SWITCH_STATEMENT);
    createEReference(switch_statementEClass, SWITCH_STATEMENT__EXPRESSAO_SWITCH);
    createEReference(switch_statementEClass, SWITCH_STATEMENT__EXPRESSAO_CASES);
    createEReference(switch_statementEClass, SWITCH_STATEMENT__BLOCO_SWITCH);

    constructor_declarationEClass = createEClass(CONSTRUCTOR_DECLARATION);
    createEReference(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__MODIFICADOR);
    createEAttribute(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__NOME_CONTRUTOR);
    createEReference(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__PARAMETROS_CONTRUTOR);
    createEReference(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__BLOCO_CONSTRUTOR);

    static_initializerEClass = createEClass(STATIC_INITIALIZER);
    createEReference(static_initializerEClass, STATIC_INITIALIZER__BLOCO_ESTATICO);

    creating_expressionEClass = createEClass(CREATING_EXPRESSION);
    createEReference(creating_expressionEClass, CREATING_EXPRESSION__NOVO_OBJETO);
    createEReference(creating_expressionEClass, CREATING_EXPRESSION__PARAMETROS);
    createEReference(creating_expressionEClass, CREATING_EXPRESSION__TIPO_OBJETO);
    createEReference(creating_expressionEClass, CREATING_EXPRESSION__EXPRESSAO_NEW);
    createEReference(creating_expressionEClass, CREATING_EXPRESSION__NOVO);

    exp_auxEClass = createEClass(EXP_AUX);
    createEReference(exp_auxEClass, EXP_AUX__EXPRESSAO);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__LOGICAL);
    createEReference(expressionEClass, EXPRESSION__NUMERIC);
    createEReference(expressionEClass, EXPRESSION__BIT);
    createEReference(expressionEClass, EXPRESSION__NOVO);
    createEReference(expressionEClass, EXPRESSION__LITERAL);
    createEAttribute(expressionEClass, EXPRESSION__IDENTIFICADOR);

    expression_auxEClass = createEClass(EXPRESSION_AUX);
    createEReference(expression_auxEClass, EXPRESSION_AUX__PARAMETROS);
    createEReference(expression_auxEClass, EXPRESSION_AUX__EXP);
    createEReference(expression_auxEClass, EXPRESSION_AUX__OP);
    createEAttribute(expression_auxEClass, EXPRESSION_AUX__OPERADOR);
    createEReference(expression_auxEClass, EXPRESSION_AUX__EXPRESSOES);

    mais_auxEClass = createEClass(MAIS_AUX);
    createEAttribute(mais_auxEClass, MAIS_AUX__OPERADOR);

    newBlockEClass = createEClass(NEW_BLOCK);

    creating_auxEClass = createEClass(CREATING_AUX);
    createEReference(creating_auxEClass, CREATING_AUX__ARGUMENTOS);

    auxEClass = createEClass(AUX);
    createEReference(auxEClass, AUX__ESPRESSAO);

    literal_expressionEClass = createEClass(LITERAL_EXPRESSION);
    createEAttribute(literal_expressionEClass, LITERAL_EXPRESSION__DECIMAL);
    createEAttribute(literal_expressionEClass, LITERAL_EXPRESSION__INTEIRO);
    createEAttribute(literal_expressionEClass, LITERAL_EXPRESSION__LFLOAT);
    createEAttribute(literal_expressionEClass, LITERAL_EXPRESSION__STRING);

    logical_expressionEClass = createEClass(LOGICAL_EXPRESSION);
    createEAttribute(logical_expressionEClass, LOGICAL_EXPRESSION__OPERADOR);
    createEReference(logical_expressionEClass, LOGICAL_EXPRESSION__EXP);

    bit_expressionEClass = createEClass(BIT_EXPRESSION);
    createEAttribute(bit_expressionEClass, BIT_EXPRESSION__OPERADOR);
    createEReference(bit_expressionEClass, BIT_EXPRESSION__EXPRESSAO);

    numeric_expressionEClass = createEClass(NUMERIC_EXPRESSION);
    createEAttribute(numeric_expressionEClass, NUMERIC_EXPRESSION__OPERADOR);
    createEReference(numeric_expressionEClass, NUMERIC_EXPRESSION__EXPRESSAO);

    arglistEClass = createEClass(ARGLIST);
    createEReference(arglistEClass, ARGLIST__EXPRESSOES_ARGUMENTOS);
    createEReference(arglistEClass, ARGLIST__TIPO_PARAMETRO);
    createEAttribute(arglistEClass, ARGLIST__NOME_PARAMETRO);

    nameEClass = createEClass(NAME);
    createEAttribute(nameEClass, NAME__NOME);
    createEReference(nameEClass, NAME__PACOTE);

    package_name_auxEClass = createEClass(PACKAGE_NAME_AUX);
    createEAttribute(package_name_auxEClass, PACKAGE_NAME_AUX__NOME_PACOTE);
    createEReference(package_name_auxEClass, PACKAGE_NAME_AUX__PACOTE);

    type_specifierEClass = createEClass(TYPE_SPECIFIER);
    createEAttribute(type_specifierEClass, TYPE_SPECIFIER__NOME);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__PRIMITIVO);
    createEReference(typeEClass, TYPE__OBJETO);

    modifierEClass = createEClass(MODIFIER);
    createEAttribute(modifierEClass, MODIFIER__MODIFICADOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    compilation_unitEClass.getESuperTypes().add(this.getModel());
    doc_commentEClass.getESuperTypes().add(this.gettype_declaration());
    constructor_declarationEClass.getESuperTypes().add(this.getnewBlock());
    exp_auxEClass.getESuperTypes().add(this.getexpression());
    expressionEClass.getESuperTypes().add(this.getexpression_aux());
    auxEClass.getESuperTypes().add(this.getexpression_aux());
    auxEClass.getESuperTypes().add(this.getcreating_aux());
    arglistEClass.getESuperTypes().add(this.getvariable_declarator());
    nameEClass.getESuperTypes().add(this.getexpression_aux());
    typeEClass.getESuperTypes().add(this.getexp_aux());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compilation_unitEClass, compilation_unit.class, "compilation_unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcompilation_unit_Pacote(), this.getpackage_statement(), null, "pacote", null, 0, 1, compilation_unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcompilation_unit_Importes(), this.getimport_statement(), null, "importes", null, 0, -1, compilation_unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcompilation_unit_Declaracao(), this.gettype_declaration(), null, "declaracao", null, 0, -1, compilation_unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(package_statementEClass, package_statement.class, "package_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getpackage_statement_NoomePacote(), this.getname(), null, "noomePacote", null, 0, 1, package_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(import_statementEClass, import_statement.class, "import_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getimport_statement_NomeImporte(), this.getname(), null, "nomeImporte", null, 0, 1, import_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_declarationEClass, type_declaration.class, "type_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettype_declaration_DeclaracaoClasse(), this.getclass_declaration(), null, "declaracaoClasse", null, 0, 1, type_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettype_declaration_DeclaracaoInterface(), this.getinterface_declaration(), null, "declaracaoInterface", null, 0, 1, type_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doc_commentEClass, doc_comment.class, "doc_comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdoc_comment_Comentario(), ecorePackage.getEString(), "comentario", null, 0, 1, doc_comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(class_declarationEClass, class_declaration.class, "class_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getclass_declaration_Modificadores(), this.getMODIFIER(), null, "modificadores", null, 0, -1, class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getclass_declaration_NomeClasse(), ecorePackage.getEString(), "nomeClasse", null, 0, 1, class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getclass_declaration_Superclasse(), this.getname(), null, "superclasse", null, 0, 1, class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getclass_declaration_ImplementosClasse(), this.getname(), null, "implementosClasse", null, 0, -1, class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getclass_declaration_CorpoClasse(), this.getfield_declaration(), null, "corpoClasse", null, 0, -1, class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getclass_declaration_DeclaracaoClasse(), this.getclass_declaration(), null, "declaracaoClasse", null, 0, -1, class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_declarationEClass, interface_declaration.class, "interface_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getinterface_declaration_Modificadores(), this.getMODIFIER(), null, "modificadores", null, 0, -1, interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinterface_declaration_NomeInterface(), ecorePackage.getEString(), "nomeInterface", null, 0, 1, interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinterface_declaration_Superinterfaces(), this.getname(), null, "superinterfaces", null, 0, -1, interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinterface_declaration_CorpoInterface(), this.getfield_declaration(), null, "corpoInterface", null, 0, -1, interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(field_declarationEClass, field_declaration.class, "field_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfield_declaration_Comentario(), this.getdoc_comment(), null, "comentario", null, 0, 1, field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfield_declaration_DeclaracaoMetodo(), this.getmethod_declaration(), null, "declaracaoMetodo", null, 0, 1, field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfield_declaration_DeclaracaoConstrutor(), this.getconstructor_declaration(), null, "declaracaoConstrutor", null, 0, 1, field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfield_declaration_DeclaracaoVariavel(), this.getvariable_declaration(), null, "declaracaoVariavel", null, 0, 1, field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfield_declaration_Estatico(), this.getstatic_initializer(), null, "estatico", null, 0, 1, field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(method_declarationEClass, method_declaration.class, "method_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmethod_declaration_ModificadorMetodo(), this.getMODIFIER(), null, "modificadorMetodo", null, 0, 1, method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmethod_declaration_TipoRetorno(), this.gettype(), null, "tipoRetorno", null, 0, 1, method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmethod_declaration_NomeMetodo(), ecorePackage.getEString(), "nomeMetodo", null, 0, 1, method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmethod_declaration_ParametrosMetodo(), this.getparameter_list(), null, "parametrosMetodo", null, 0, 1, method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmethod_declaration_BlocoMetodo(), this.getstatement_block(), null, "blocoMetodo", null, 0, 1, method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, parameter.class, "parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getparameter_TipoParametro(), this.gettype(), null, "tipoParametro", null, 0, 1, parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getparameter_NomeParametro(), ecorePackage.getEString(), "nomeParametro", null, 0, 1, parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameter_listEClass, parameter_list.class, "parameter_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getparameter_list_Parametros(), this.getparameter(), null, "parametros", null, 0, -1, parameter_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statement_blockEClass, statement_block.class, "statement_block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstatement_block_Corpo(), this.getstatement(), null, "corpo", null, 0, -1, statement_block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, statement.class, "statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstatement_DeclaracaoVariavel(), this.getvariable_declaration(), null, "declaracaoVariavel", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_Expressao(), this.getexpression(), null, "expressao", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_Newbloco(), this.getstatement_block(), null, "newbloco", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_CorpoIf(), this.getif_statement(), null, "corpoIf", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_CorpoDoWhile(), this.getdo_statement(), null, "corpoDoWhile", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_CorpoWhile(), this.getwhile_statement(), null, "corpoWhile", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_CorpoFor(), this.getfor_statement(), null, "corpoFor", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_CorpoTryCatch(), this.gettry_statement(), null, "corpoTryCatch", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_CorpoSwitchCase(), this.getswitch_statement(), null, "corpoSwitchCase", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_ExpressaoSynchronized(), this.getexpression(), null, "expressaoSynchronized", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_CorpoSynchronize(), this.getstatement(), null, "corpoSynchronize", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_Return(), this.getexpression(), null, "return", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_Exececao(), this.getexpression(), null, "exececao", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getstatement_Break(), ecorePackage.getEString(), "break", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getstatement_Continue(), ecorePackage.getEString(), "continue", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_declarationEClass, variable_declaration.class, "variable_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariable_declaration_Modificador(), this.getMODIFIER(), null, "modificador", null, 0, 1, variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariable_declaration_TipoVariavel(), this.gettype(), null, "tipoVariavel", null, 0, 1, variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariable_declaration_DeclaracaoVariaveis(), this.getvariable_declarator(), null, "declaracaoVariaveis", null, 0, -1, variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariable_declaration_BlocoVariavel(), this.getstatement_block(), null, "blocoVariavel", null, 0, 1, variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_declaratorEClass, variable_declarator.class, "variable_declarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvariable_declarator_NomeVariavel(), ecorePackage.getEString(), "nomeVariavel", null, 0, 1, variable_declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvariable_declarator_Op(), ecorePackage.getEString(), "op", null, 0, 1, variable_declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariable_declarator_ValorVariavel(), this.getvariable_initializer(), null, "valorVariavel", null, 0, 1, variable_declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_initializerEClass, variable_initializer.class, "variable_initializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariable_initializer_ExpressaoVariavel(), this.getexpression(), null, "expressaoVariavel", null, 0, 1, variable_initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariable_initializer_ValorVariaveis(), this.getvariable_initializer(), null, "valorVariaveis", null, 0, -1, variable_initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(if_statementEClass, if_statement.class, "if_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getif_statement_EspressaoIf(), this.getexpression(), null, "espressaoIf", null, 0, 1, if_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getif_statement_BlcoIf(), this.getstatement(), null, "blcoIf", null, 0, 1, if_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getif_statement_BlocoElse(), this.getstatement(), null, "blocoElse", null, 0, 1, if_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(do_statementEClass, do_statement.class, "do_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getdo_statement_BlocoDo(), this.getstatement(), null, "blocoDo", null, 0, 1, do_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdo_statement_ExpressaoWhile(), this.getexpression(), null, "expressaoWhile", null, 0, 1, do_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(while_statementEClass, while_statement.class, "while_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getwhile_statement_ExpressaoWhile(), this.getexpression(), null, "expressaoWhile", null, 0, 1, while_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getwhile_statement_BlocoWhile(), this.getstatement(), null, "blocoWhile", null, 0, 1, while_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_statementEClass, for_statement.class, "for_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfor_statement_DeclaracaoVariavel(), this.getvariable_declaration(), null, "declaracaoVariavel", null, 0, 1, for_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfor_statement_ExpressaoDeclaracao(), this.getexpression(), null, "expressaoDeclaracao", null, 0, 1, for_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfor_statement_ExpressaoFor(), this.getexpression(), null, "expressaoFor", null, 0, 1, for_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfor_statement_ExpressaoIncremento(), this.getexpression(), null, "expressaoIncremento", null, 0, 1, for_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfor_statement_BlocoFor(), this.getstatement(), null, "blocoFor", null, 0, 1, for_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(try_statementEClass, try_statement.class, "try_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettry_statement_BlocoTry(), this.getstatement_block(), null, "blocoTry", null, 0, 1, try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettry_statement_ParametroCatch(), this.getparameter(), null, "parametroCatch", null, 0, 1, try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettry_statement_BlocoCatch(), this.getstatement_block(), null, "blocoCatch", null, 0, 1, try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettry_statement_BlocoFinally(), this.getstatement_block(), null, "blocoFinally", null, 0, 1, try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switch_statementEClass, switch_statement.class, "switch_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getswitch_statement_ExpressaoSwitch(), this.getexpression(), null, "expressaoSwitch", null, 0, 1, switch_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getswitch_statement_ExpressaoCases(), this.getexpression(), null, "expressaoCases", null, 0, -1, switch_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getswitch_statement_BlocoSwitch(), this.getstatement(), null, "blocoSwitch", null, 0, 1, switch_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructor_declarationEClass, constructor_declaration.class, "constructor_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getconstructor_declaration_Modificador(), this.getMODIFIER(), null, "modificador", null, 0, 1, constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getconstructor_declaration_NomeContrutor(), ecorePackage.getEString(), "nomeContrutor", null, 0, 1, constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconstructor_declaration_ParametrosContrutor(), this.getparameter_list(), null, "parametrosContrutor", null, 0, 1, constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconstructor_declaration_BlocoConstrutor(), this.getstatement_block(), null, "blocoConstrutor", null, 0, 1, constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(static_initializerEClass, static_initializer.class, "static_initializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstatic_initializer_BlocoEstatico(), this.getstatement_block(), null, "blocoEstatico", null, 0, 1, static_initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(creating_expressionEClass, creating_expression.class, "creating_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcreating_expression_NovoObjeto(), this.getname(), null, "novoObjeto", null, 0, 1, creating_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcreating_expression_Parametros(), this.getcreating_aux(), null, "parametros", null, 0, 1, creating_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcreating_expression_TipoObjeto(), this.gettype_specifier(), null, "tipoObjeto", null, 0, 1, creating_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcreating_expression_ExpressaoNew(), this.getexpression(), null, "expressaoNew", null, 0, 1, creating_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcreating_expression_Novo(), this.getnewBlock(), null, "novo", null, 0, 1, creating_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exp_auxEClass, exp_aux.class, "exp_aux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexp_aux_Expressao(), this.getexpression(), null, "expressao", null, 0, 1, exp_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, expression.class, "expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexpression_Logical(), this.getlogical_expression(), null, "logical", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_Numeric(), this.getnumeric_expression(), null, "numeric", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_Bit(), this.getbit_expression(), null, "bit", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_Novo(), this.getcreating_expression(), null, "novo", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_Literal(), this.getliteral_expression(), null, "literal", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getexpression_Identificador(), ecorePackage.getEString(), "identificador", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_auxEClass, expression_aux.class, "expression_aux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexpression_aux_Parametros(), this.getarglist(), null, "parametros", null, 0, 1, expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_aux_Exp(), this.getexpression(), null, "exp", null, 0, 1, expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_aux_Op(), this.getmais_aux(), null, "op", null, 0, 1, expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getexpression_aux_Operador(), ecorePackage.getEString(), "operador", null, 0, 1, expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_aux_Expressoes(), this.getexpression_aux(), null, "expressoes", null, 0, 1, expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mais_auxEClass, mais_aux.class, "mais_aux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getmais_aux_Operador(), ecorePackage.getEString(), "operador", null, 0, 1, mais_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(newBlockEClass, newBlock.class, "newBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(creating_auxEClass, creating_aux.class, "creating_aux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcreating_aux_Argumentos(), this.getarglist(), null, "argumentos", null, 0, 1, creating_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(auxEClass, aux.class, "aux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getaux_Espressao(), this.getexpression(), null, "espressao", null, 0, 1, aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literal_expressionEClass, literal_expression.class, "literal_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getliteral_expression_Decimal(), ecorePackage.getEString(), "decimal", null, 0, 1, literal_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getliteral_expression_Inteiro(), ecorePackage.getEString(), "inteiro", null, 0, 1, literal_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getliteral_expression_L_float(), ecorePackage.getEString(), "l_float", null, 0, 1, literal_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getliteral_expression_String(), ecorePackage.getEString(), "string", null, 0, 1, literal_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logical_expressionEClass, logical_expression.class, "logical_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getlogical_expression_Operador(), ecorePackage.getEString(), "operador", null, 0, 1, logical_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlogical_expression_Exp(), this.getexpression(), null, "exp", null, 0, 1, logical_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bit_expressionEClass, bit_expression.class, "bit_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbit_expression_Operador(), ecorePackage.getEString(), "operador", null, 0, 1, bit_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbit_expression_Expressao(), this.getexpression(), null, "expressao", null, 0, 1, bit_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numeric_expressionEClass, numeric_expression.class, "numeric_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnumeric_expression_Operador(), ecorePackage.getEString(), "operador", null, 0, 1, numeric_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getnumeric_expression_Expressao(), this.getexpression(), null, "expressao", null, 0, 1, numeric_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arglistEClass, arglist.class, "arglist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getarglist_ExpressoesArgumentos(), this.getexpression(), null, "expressoesArgumentos", null, 0, -1, arglist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getarglist_TipoParametro(), this.gettype(), null, "tipoParametro", null, 0, -1, arglist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getarglist_NomeParametro(), ecorePackage.getEString(), "nomeParametro", null, 0, -1, arglist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameEClass, name.class, "name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getname_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getname_Pacote(), this.getpackage_name_aux(), null, "pacote", null, 0, 1, name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(package_name_auxEClass, package_name_aux.class, "package_name_aux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpackage_name_aux_NomePacote(), ecorePackage.getEString(), "nomePacote", null, 0, 1, package_name_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getpackage_name_aux_Pacote(), this.getpackage_name_aux(), null, "pacote", null, 0, 1, package_name_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_specifierEClass, type_specifier.class, "type_specifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettype_specifier_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, type_specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, type.class, "type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettype_Primitivo(), this.gettype_specifier(), null, "primitivo", null, 0, 1, type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettype_Objeto(), this.getname(), null, "objeto", null, 0, 1, type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modifierEClass, org.xtext.example.simpleJava.MODIFIER.class, "MODIFIER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMODIFIER_Modificador(), ecorePackage.getEString(), "modificador", null, 0, 1, org.xtext.example.simpleJava.MODIFIER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SimpleJavaPackageImpl
