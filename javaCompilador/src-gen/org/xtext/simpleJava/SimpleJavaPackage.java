/**
 */
package org.xtext.simpleJava;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.simpleJava.SimpleJavaFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleJavaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simpleJava";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/SimpleJava";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simpleJava";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimpleJavaPackage eINSTANCE = org.xtext.simpleJava.impl.SimpleJavaPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.ModelImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Comp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMP = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.compilation_unitImpl <em>compilation unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.compilation_unitImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getcompilation_unit()
   * @generated
   */
  int COMPILATION_UNIT = 1;

  /**
   * The feature id for the '<em><b>Pacote</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__PACOTE = 0;

  /**
   * The feature id for the '<em><b>Importes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__IMPORTES = 1;

  /**
   * The feature id for the '<em><b>Declaracao</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__DECLARACAO = 2;

  /**
   * The number of structural features of the '<em>compilation unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.package_statementImpl <em>package statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.package_statementImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getpackage_statement()
   * @generated
   */
  int PACKAGE_STATEMENT = 2;

  /**
   * The feature id for the '<em><b>Noome Pacote</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_STATEMENT__NOOME_PACOTE = 0;

  /**
   * The number of structural features of the '<em>package statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.import_statementImpl <em>import statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.import_statementImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getimport_statement()
   * @generated
   */
  int IMPORT_STATEMENT = 3;

  /**
   * The feature id for the '<em><b>Nome Importe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT__NOME_IMPORTE = 0;

  /**
   * The number of structural features of the '<em>import statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.type_declarationImpl <em>type declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.type_declarationImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#gettype_declaration()
   * @generated
   */
  int TYPE_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Declaracao Classe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__DECLARACAO_CLASSE = 0;

  /**
   * The feature id for the '<em><b>Declaracao Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__DECLARACAO_INTERFACE = 1;

  /**
   * The number of structural features of the '<em>type declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.class_declarationImpl <em>class declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.class_declarationImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getclass_declaration()
   * @generated
   */
  int CLASS_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Modificadores</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__MODIFICADORES = 0;

  /**
   * The feature id for the '<em><b>Nome Classe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__NOME_CLASSE = 1;

  /**
   * The feature id for the '<em><b>Superclasse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__SUPERCLASSE = 2;

  /**
   * The feature id for the '<em><b>Implementos Classe</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__IMPLEMENTOS_CLASSE = 3;

  /**
   * The feature id for the '<em><b>Corpo Classe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__CORPO_CLASSE = 4;

  /**
   * The feature id for the '<em><b>Declaracao Classe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__DECLARACAO_CLASSE = 5;

  /**
   * The number of structural features of the '<em>class declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.interface_declarationImpl <em>interface declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.interface_declarationImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getinterface_declaration()
   * @generated
   */
  int INTERFACE_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Modificadores</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__MODIFICADORES = 0;

  /**
   * The feature id for the '<em><b>Nome Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__NOME_INTERFACE = 1;

  /**
   * The feature id for the '<em><b>Superinterfaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__SUPERINTERFACES = 2;

  /**
   * The feature id for the '<em><b>Corpo Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__CORPO_INTERFACE = 3;

  /**
   * The number of structural features of the '<em>interface declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.field_declarationImpl <em>field declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.field_declarationImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getfield_declaration()
   * @generated
   */
  int FIELD_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Declaracao Metodo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__DECLARACAO_METODO = 0;

  /**
   * The feature id for the '<em><b>Declaracao Construtor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__DECLARACAO_CONSTRUTOR = 1;

  /**
   * The feature id for the '<em><b>Declaracao Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__DECLARACAO_VARIAVEL = 2;

  /**
   * The feature id for the '<em><b>Estatico</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__ESTATICO = 3;

  /**
   * The number of structural features of the '<em>field declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.method_declarationImpl <em>method declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.method_declarationImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getmethod_declaration()
   * @generated
   */
  int METHOD_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Modificador Metodo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__MODIFICADOR_METODO = 0;

  /**
   * The feature id for the '<em><b>Tipo Retorno</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__TIPO_RETORNO = 1;

  /**
   * The feature id for the '<em><b>Nome Metodo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__NOME_METODO = 2;

  /**
   * The feature id for the '<em><b>Parametros Metodo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__PARAMETROS_METODO = 3;

  /**
   * The feature id for the '<em><b>Bloco Metodo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__BLOCO_METODO = 4;

  /**
   * The number of structural features of the '<em>method declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.parameterImpl <em>parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.parameterImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getparameter()
   * @generated
   */
  int PARAMETER = 9;

  /**
   * The feature id for the '<em><b>Tipo Parametro</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TIPO_PARAMETRO = 0;

  /**
   * The feature id for the '<em><b>Nome Parametro</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NOME_PARAMETRO = 1;

  /**
   * The number of structural features of the '<em>parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.parameter_listImpl <em>parameter list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.parameter_listImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getparameter_list()
   * @generated
   */
  int PARAMETER_LIST = 10;

  /**
   * The feature id for the '<em><b>Parametros</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAMETROS = 0;

  /**
   * The number of structural features of the '<em>parameter list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.statement_blockImpl <em>statement block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.statement_blockImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getstatement_block()
   * @generated
   */
  int STATEMENT_BLOCK = 11;

  /**
   * The feature id for the '<em><b>Corpo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__CORPO = 0;

  /**
   * The number of structural features of the '<em>statement block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.statementImpl <em>statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.statementImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getstatement()
   * @generated
   */
  int STATEMENT = 12;

  /**
   * The feature id for the '<em><b>Declaracao Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__DECLARACAO_VARIAVEL = 0;

  /**
   * The feature id for the '<em><b>Expressao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EXPRESSAO = 1;

  /**
   * The feature id for the '<em><b>Bloco</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__BLOCO = 2;

  /**
   * The feature id for the '<em><b>Corpo If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CORPO_IF = 3;

  /**
   * The feature id for the '<em><b>Corpo Do While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CORPO_DO_WHILE = 4;

  /**
   * The feature id for the '<em><b>Corpo While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CORPO_WHILE = 5;

  /**
   * The feature id for the '<em><b>Corpo For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CORPO_FOR = 6;

  /**
   * The feature id for the '<em><b>Corpo Try Catch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CORPO_TRY_CATCH = 7;

  /**
   * The feature id for the '<em><b>Corpo Switch Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CORPO_SWITCH_CASE = 8;

  /**
   * The feature id for the '<em><b>Expressao Synchronized</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EXPRESSAO_SYNCHRONIZED = 9;

  /**
   * The feature id for the '<em><b>Corpo Synchronize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CORPO_SYNCHRONIZE = 10;

  /**
   * The feature id for the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__RETURN = 11;

  /**
   * The feature id for the '<em><b>Exececao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EXECECAO = 12;

  /**
   * The feature id for the '<em><b>Break</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__BREAK = 13;

  /**
   * The feature id for the '<em><b>Continue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CONTINUE = 14;

  /**
   * The number of structural features of the '<em>statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 15;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.variable_declarationImpl <em>variable declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.variable_declarationImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getvariable_declaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Modificador</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__MODIFICADOR = 0;

  /**
   * The feature id for the '<em><b>Tipo Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TIPO_VARIAVEL = 1;

  /**
   * The feature id for the '<em><b>Declaracao Variaveis</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__DECLARACAO_VARIAVEIS = 2;

  /**
   * The feature id for the '<em><b>Bloco Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__BLOCO_VARIAVEL = 3;

  /**
   * The number of structural features of the '<em>variable declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.variable_declaratorImpl <em>variable declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.variable_declaratorImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getvariable_declarator()
   * @generated
   */
  int VARIABLE_DECLARATOR = 14;

  /**
   * The feature id for the '<em><b>Nome Variavel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR__NOME_VARIAVEL = 0;

  /**
   * The feature id for the '<em><b>Valor Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR__VALOR_VARIAVEL = 1;

  /**
   * The number of structural features of the '<em>variable declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.variable_initializerImpl <em>variable initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.variable_initializerImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getvariable_initializer()
   * @generated
   */
  int VARIABLE_INITIALIZER = 15;

  /**
   * The feature id for the '<em><b>Expressao Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER__EXPRESSAO_VARIAVEL = 0;

  /**
   * The feature id for the '<em><b>Valor Variaveis</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER__VALOR_VARIAVEIS = 1;

  /**
   * The number of structural features of the '<em>variable initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.if_statementImpl <em>if statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.if_statementImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getif_statement()
   * @generated
   */
  int IF_STATEMENT = 16;

  /**
   * The feature id for the '<em><b>Espressao If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ESPRESSAO_IF = 0;

  /**
   * The feature id for the '<em><b>Blco If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__BLCO_IF = 1;

  /**
   * The feature id for the '<em><b>Bloco Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__BLOCO_ELSE = 2;

  /**
   * The number of structural features of the '<em>if statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.do_statementImpl <em>do statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.do_statementImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getdo_statement()
   * @generated
   */
  int DO_STATEMENT = 17;

  /**
   * The feature id for the '<em><b>Bloco Do</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__BLOCO_DO = 0;

  /**
   * The feature id for the '<em><b>Expressao While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__EXPRESSAO_WHILE = 1;

  /**
   * The number of structural features of the '<em>do statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.while_statementImpl <em>while statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.while_statementImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getwhile_statement()
   * @generated
   */
  int WHILE_STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Expressao While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__EXPRESSAO_WHILE = 0;

  /**
   * The feature id for the '<em><b>Bloco While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__BLOCO_WHILE = 1;

  /**
   * The number of structural features of the '<em>while statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.for_statementImpl <em>for statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.for_statementImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getfor_statement()
   * @generated
   */
  int FOR_STATEMENT = 19;

  /**
   * The feature id for the '<em><b>Declaracao Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__DECLARACAO_VARIAVEL = 0;

  /**
   * The feature id for the '<em><b>Expressao Declaracao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__EXPRESSAO_DECLARACAO = 1;

  /**
   * The feature id for the '<em><b>Expressao For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__EXPRESSAO_FOR = 2;

  /**
   * The feature id for the '<em><b>Expressao Incremento</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__EXPRESSAO_INCREMENTO = 3;

  /**
   * The feature id for the '<em><b>Bloco For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__BLOCO_FOR = 4;

  /**
   * The number of structural features of the '<em>for statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.try_statementImpl <em>try statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.try_statementImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#gettry_statement()
   * @generated
   */
  int TRY_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Bloco Try</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__BLOCO_TRY = 0;

  /**
   * The feature id for the '<em><b>Parametro Catch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__PARAMETRO_CATCH = 1;

  /**
   * The feature id for the '<em><b>Bloco Catch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__BLOCO_CATCH = 2;

  /**
   * The feature id for the '<em><b>Bloco Finally</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__BLOCO_FINALLY = 3;

  /**
   * The number of structural features of the '<em>try statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.switch_statementImpl <em>switch statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.switch_statementImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getswitch_statement()
   * @generated
   */
  int SWITCH_STATEMENT = 21;

  /**
   * The feature id for the '<em><b>Expressao Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__EXPRESSAO_SWITCH = 0;

  /**
   * The feature id for the '<em><b>Expressao Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__EXPRESSAO_CASES = 1;

  /**
   * The feature id for the '<em><b>Bloco Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__BLOCO_SWITCH = 2;

  /**
   * The number of structural features of the '<em>switch statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.newImpl <em>new</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.newImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getnew()
   * @generated
   */
  int NEW = 29;

  /**
   * The number of structural features of the '<em>new</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.constructor_declarationImpl <em>constructor declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.constructor_declarationImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getconstructor_declaration()
   * @generated
   */
  int CONSTRUCTOR_DECLARATION = 22;

  /**
   * The feature id for the '<em><b>Modificador</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__MODIFICADOR = NEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__TIPO = NEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Nome Contrutor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__NOME_CONTRUTOR = NEW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parametros Contrutor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__PARAMETROS_CONTRUTOR = NEW_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Bloco Construtor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__BLOCO_CONSTRUTOR = NEW_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>constructor declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION_FEATURE_COUNT = NEW_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.static_initializerImpl <em>static initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.static_initializerImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getstatic_initializer()
   * @generated
   */
  int STATIC_INITIALIZER = 23;

  /**
   * The feature id for the '<em><b>Bloco Estatico</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INITIALIZER__BLOCO_ESTATICO = 0;

  /**
   * The number of structural features of the '<em>static initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INITIALIZER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.creating_expressionImpl <em>creating expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.creating_expressionImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getcreating_expression()
   * @generated
   */
  int CREATING_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Novo Objeto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION__NOVO_OBJETO = 0;

  /**
   * The feature id for the '<em><b>Parametros</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION__PARAMETROS = 1;

  /**
   * The feature id for the '<em><b>Tipo Objeto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION__TIPO_OBJETO = 2;

  /**
   * The feature id for the '<em><b>Expressao New</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION__EXPRESSAO_NEW = 3;

  /**
   * The feature id for the '<em><b>Novo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION__NOVO = 4;

  /**
   * The number of structural features of the '<em>creating expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.expression_auxImpl <em>expression aux</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.expression_auxImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getexpression_aux()
   * @generated
   */
  int EXPRESSION_AUX = 27;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__OP = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__EXP = 1;

  /**
   * The feature id for the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__OPERADOR = 2;

  /**
   * The feature id for the '<em><b>Expressoes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__EXPRESSOES = 3;

  /**
   * The number of structural features of the '<em>expression aux</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.expressionImpl <em>expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.expressionImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getexpression()
   * @generated
   */
  int EXPRESSION = 26;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OP = EXPRESSION_AUX__OP;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXP = EXPRESSION_AUX__EXP;

  /**
   * The feature id for the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERADOR = EXPRESSION_AUX__OPERADOR;

  /**
   * The feature id for the '<em><b>Expressoes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPRESSOES = EXPRESSION_AUX__EXPRESSOES;

  /**
   * The feature id for the '<em><b>Tipo Logical</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TIPO_LOGICAL = EXPRESSION_AUX_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tipo Numeric</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TIPO_NUMERIC = EXPRESSION_AUX_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tipo Bit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TIPO_BIT = EXPRESSION_AUX_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>New</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NEW = EXPRESSION_AUX_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LITERAL = EXPRESSION_AUX_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Identificador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__IDENTIFICADOR = EXPRESSION_AUX_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Expressao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPRESSAO = EXPRESSION_AUX_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = EXPRESSION_AUX_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.exp_auxImpl <em>exp aux</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.exp_auxImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getexp_aux()
   * @generated
   */
  int EXP_AUX = 25;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_AUX__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_AUX__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_AUX__OPERADOR = EXPRESSION__OPERADOR;

  /**
   * The feature id for the '<em><b>Expressoes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_AUX__EXPRESSOES = EXPRESSION__EXPRESSOES;

  /**
   * The feature id for the '<em><b>Tipo Logical</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_AUX__TIPO_LOGICAL = EXPRESSION__TIPO_LOGICAL;

  /**
   * The feature id for the '<em><b>Tipo Numeric</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_AUX__TIPO_NUMERIC = EXPRESSION__TIPO_NUMERIC;

  /**
   * The feature id for the '<em><b>Tipo Bit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_AUX__TIPO_BIT = EXPRESSION__TIPO_BIT;

  /**
   * The feature id for the '<em><b>New</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_AUX__NEW = EXPRESSION__NEW;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_AUX__LITERAL = EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>Identificador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_AUX__IDENTIFICADOR = EXPRESSION__IDENTIFICADOR;

  /**
   * The feature id for the '<em><b>Expressao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_AUX__EXPRESSAO = EXPRESSION__EXPRESSAO;

  /**
   * The number of structural features of the '<em>exp aux</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_AUX_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.mais_auxImpl <em>mais aux</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.mais_auxImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getmais_aux()
   * @generated
   */
  int MAIS_AUX = 28;

  /**
   * The feature id for the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIS_AUX__OPERADOR = 0;

  /**
   * The number of structural features of the '<em>mais aux</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIS_AUX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.creating_auxImpl <em>creating aux</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.creating_auxImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getcreating_aux()
   * @generated
   */
  int CREATING_AUX = 30;

  /**
   * The feature id for the '<em><b>Argumentos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_AUX__ARGUMENTOS = 0;

  /**
   * The number of structural features of the '<em>creating aux</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_AUX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.auxImpl <em>aux</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.auxImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getaux()
   * @generated
   */
  int AUX = 31;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUX__OP = EXPRESSION_AUX__OP;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUX__EXP = EXPRESSION_AUX__EXP;

  /**
   * The feature id for the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUX__OPERADOR = EXPRESSION_AUX__OPERADOR;

  /**
   * The feature id for the '<em><b>Expressoes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUX__EXPRESSOES = EXPRESSION_AUX__EXPRESSOES;

  /**
   * The feature id for the '<em><b>Argumentos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUX__ARGUMENTOS = EXPRESSION_AUX_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Espressao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUX__ESPRESSAO = EXPRESSION_AUX_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>aux</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUX_FEATURE_COUNT = EXPRESSION_AUX_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.literal_expressionImpl <em>literal expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.literal_expressionImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getliteral_expression()
   * @generated
   */
  int LITERAL_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Decimal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION__DECIMAL = 0;

  /**
   * The feature id for the '<em><b>Inteiro</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION__INTEIRO = 1;

  /**
   * The feature id for the '<em><b>Float</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION__FLOAT = 2;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION__STRING = 3;

  /**
   * The number of structural features of the '<em>literal expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.logical_expressionImpl <em>logical expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.logical_expressionImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getlogical_expression()
   * @generated
   */
  int LOGICAL_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION__OPERADOR = 0;

  /**
   * The feature id for the '<em><b>Expressao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION__EXPRESSAO = 1;

  /**
   * The number of structural features of the '<em>logical expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.bit_expressionImpl <em>bit expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.bit_expressionImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getbit_expression()
   * @generated
   */
  int BIT_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_EXPRESSION__OPERADOR = 0;

  /**
   * The feature id for the '<em><b>Expressao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_EXPRESSION__EXPRESSAO = 1;

  /**
   * The number of structural features of the '<em>bit expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.numeric_expressionImpl <em>numeric expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.numeric_expressionImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getnumeric_expression()
   * @generated
   */
  int NUMERIC_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION__OPERADOR = 0;

  /**
   * The feature id for the '<em><b>Expressao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION__EXPRESSAO = 1;

  /**
   * The number of structural features of the '<em>numeric expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.arglistImpl <em>arglist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.arglistImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getarglist()
   * @generated
   */
  int ARGLIST = 36;

  /**
   * The feature id for the '<em><b>Nome Variavel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGLIST__NOME_VARIAVEL = VARIABLE_DECLARATOR__NOME_VARIAVEL;

  /**
   * The feature id for the '<em><b>Valor Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGLIST__VALOR_VARIAVEL = VARIABLE_DECLARATOR__VALOR_VARIAVEL;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGLIST__OP = VARIABLE_DECLARATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGLIST__EXP = VARIABLE_DECLARATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGLIST__OPERADOR = VARIABLE_DECLARATOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expressoes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGLIST__EXPRESSOES = VARIABLE_DECLARATOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expressoes Argumentos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGLIST__EXPRESSOES_ARGUMENTOS = VARIABLE_DECLARATOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Tipo Parametro</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGLIST__TIPO_PARAMETRO = VARIABLE_DECLARATOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Nome Parametro</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGLIST__NOME_PARAMETRO = VARIABLE_DECLARATOR_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>arglist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGLIST_FEATURE_COUNT = VARIABLE_DECLARATOR_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.nameImpl <em>name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.nameImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getname()
   * @generated
   */
  int NAME = 37;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__OP = EXPRESSION_AUX__OP;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__EXP = EXPRESSION_AUX__EXP;

  /**
   * The feature id for the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__OPERADOR = EXPRESSION_AUX__OPERADOR;

  /**
   * The feature id for the '<em><b>Expressoes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__EXPRESSOES = EXPRESSION_AUX__EXPRESSOES;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__NOME = EXPRESSION_AUX_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pacote</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__PACOTE = EXPRESSION_AUX_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = EXPRESSION_AUX_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.package_name_auxImpl <em>package name aux</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.package_name_auxImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getpackage_name_aux()
   * @generated
   */
  int PACKAGE_NAME_AUX = 38;

  /**
   * The feature id for the '<em><b>Nome Pacote</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_NAME_AUX__NOME_PACOTE = 0;

  /**
   * The feature id for the '<em><b>Pacote</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_NAME_AUX__PACOTE = 1;

  /**
   * The number of structural features of the '<em>package name aux</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_NAME_AUX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.type_specifierImpl <em>type specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.type_specifierImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#gettype_specifier()
   * @generated
   */
  int TYPE_SPECIFIER = 39;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFIER__NOME = 0;

  /**
   * The number of structural features of the '<em>type specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.typeImpl <em>type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.typeImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#gettype()
   * @generated
   */
  int TYPE = 40;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__OP = EXP_AUX__OP;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__EXP = EXP_AUX__EXP;

  /**
   * The feature id for the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__OPERADOR = EXP_AUX__OPERADOR;

  /**
   * The feature id for the '<em><b>Expressoes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__EXPRESSOES = EXP_AUX__EXPRESSOES;

  /**
   * The feature id for the '<em><b>Tipo Logical</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TIPO_LOGICAL = EXP_AUX__TIPO_LOGICAL;

  /**
   * The feature id for the '<em><b>Tipo Numeric</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TIPO_NUMERIC = EXP_AUX__TIPO_NUMERIC;

  /**
   * The feature id for the '<em><b>Tipo Bit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TIPO_BIT = EXP_AUX__TIPO_BIT;

  /**
   * The feature id for the '<em><b>New</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NEW = EXP_AUX__NEW;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__LITERAL = EXP_AUX__LITERAL;

  /**
   * The feature id for the '<em><b>Identificador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__IDENTIFICADOR = EXP_AUX__IDENTIFICADOR;

  /**
   * The feature id for the '<em><b>Expressao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__EXPRESSAO = EXP_AUX__EXPRESSAO;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TIPO = EXP_AUX_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = EXP_AUX_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.simpleJava.impl.MODIFIERImpl <em>MODIFIER</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simpleJava.impl.MODIFIERImpl
   * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getMODIFIER()
   * @generated
   */
  int MODIFIER = 41;

  /**
   * The feature id for the '<em><b>Modificador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__MODIFICADOR = 0;

  /**
   * The number of structural features of the '<em>MODIFIER</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.simpleJava.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simpleJava.Model#getComp <em>Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comp</em>'.
   * @see org.xtext.simpleJava.Model#getComp()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Comp();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.compilation_unit <em>compilation unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>compilation unit</em>'.
   * @see org.xtext.simpleJava.compilation_unit
   * @generated
   */
  EClass getcompilation_unit();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.compilation_unit#getPacote <em>Pacote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pacote</em>'.
   * @see org.xtext.simpleJava.compilation_unit#getPacote()
   * @see #getcompilation_unit()
   * @generated
   */
  EReference getcompilation_unit_Pacote();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simpleJava.compilation_unit#getImportes <em>Importes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Importes</em>'.
   * @see org.xtext.simpleJava.compilation_unit#getImportes()
   * @see #getcompilation_unit()
   * @generated
   */
  EReference getcompilation_unit_Importes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simpleJava.compilation_unit#getDeclaracao <em>Declaracao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declaracao</em>'.
   * @see org.xtext.simpleJava.compilation_unit#getDeclaracao()
   * @see #getcompilation_unit()
   * @generated
   */
  EReference getcompilation_unit_Declaracao();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.package_statement <em>package statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>package statement</em>'.
   * @see org.xtext.simpleJava.package_statement
   * @generated
   */
  EClass getpackage_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.package_statement#getNoomePacote <em>Noome Pacote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Noome Pacote</em>'.
   * @see org.xtext.simpleJava.package_statement#getNoomePacote()
   * @see #getpackage_statement()
   * @generated
   */
  EReference getpackage_statement_NoomePacote();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.import_statement <em>import statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>import statement</em>'.
   * @see org.xtext.simpleJava.import_statement
   * @generated
   */
  EClass getimport_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.import_statement#getNomeImporte <em>Nome Importe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nome Importe</em>'.
   * @see org.xtext.simpleJava.import_statement#getNomeImporte()
   * @see #getimport_statement()
   * @generated
   */
  EReference getimport_statement_NomeImporte();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.type_declaration <em>type declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type declaration</em>'.
   * @see org.xtext.simpleJava.type_declaration
   * @generated
   */
  EClass gettype_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.type_declaration#getDeclaracaoClasse <em>Declaracao Classe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaracao Classe</em>'.
   * @see org.xtext.simpleJava.type_declaration#getDeclaracaoClasse()
   * @see #gettype_declaration()
   * @generated
   */
  EReference gettype_declaration_DeclaracaoClasse();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.type_declaration#getDeclaracaoInterface <em>Declaracao Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaracao Interface</em>'.
   * @see org.xtext.simpleJava.type_declaration#getDeclaracaoInterface()
   * @see #gettype_declaration()
   * @generated
   */
  EReference gettype_declaration_DeclaracaoInterface();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.class_declaration <em>class declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>class declaration</em>'.
   * @see org.xtext.simpleJava.class_declaration
   * @generated
   */
  EClass getclass_declaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simpleJava.class_declaration#getModificadores <em>Modificadores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modificadores</em>'.
   * @see org.xtext.simpleJava.class_declaration#getModificadores()
   * @see #getclass_declaration()
   * @generated
   */
  EReference getclass_declaration_Modificadores();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.class_declaration#getNomeClasse <em>Nome Classe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome Classe</em>'.
   * @see org.xtext.simpleJava.class_declaration#getNomeClasse()
   * @see #getclass_declaration()
   * @generated
   */
  EAttribute getclass_declaration_NomeClasse();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.class_declaration#getSuperclasse <em>Superclasse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Superclasse</em>'.
   * @see org.xtext.simpleJava.class_declaration#getSuperclasse()
   * @see #getclass_declaration()
   * @generated
   */
  EReference getclass_declaration_Superclasse();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simpleJava.class_declaration#getImplementosClasse <em>Implementos Classe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Implementos Classe</em>'.
   * @see org.xtext.simpleJava.class_declaration#getImplementosClasse()
   * @see #getclass_declaration()
   * @generated
   */
  EReference getclass_declaration_ImplementosClasse();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.class_declaration#getCorpoClasse <em>Corpo Classe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Corpo Classe</em>'.
   * @see org.xtext.simpleJava.class_declaration#getCorpoClasse()
   * @see #getclass_declaration()
   * @generated
   */
  EReference getclass_declaration_CorpoClasse();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.class_declaration#getDeclaracaoClasse <em>Declaracao Classe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaracao Classe</em>'.
   * @see org.xtext.simpleJava.class_declaration#getDeclaracaoClasse()
   * @see #getclass_declaration()
   * @generated
   */
  EReference getclass_declaration_DeclaracaoClasse();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.interface_declaration <em>interface declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>interface declaration</em>'.
   * @see org.xtext.simpleJava.interface_declaration
   * @generated
   */
  EClass getinterface_declaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simpleJava.interface_declaration#getModificadores <em>Modificadores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modificadores</em>'.
   * @see org.xtext.simpleJava.interface_declaration#getModificadores()
   * @see #getinterface_declaration()
   * @generated
   */
  EReference getinterface_declaration_Modificadores();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.interface_declaration#getNomeInterface <em>Nome Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome Interface</em>'.
   * @see org.xtext.simpleJava.interface_declaration#getNomeInterface()
   * @see #getinterface_declaration()
   * @generated
   */
  EAttribute getinterface_declaration_NomeInterface();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simpleJava.interface_declaration#getSuperinterfaces <em>Superinterfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Superinterfaces</em>'.
   * @see org.xtext.simpleJava.interface_declaration#getSuperinterfaces()
   * @see #getinterface_declaration()
   * @generated
   */
  EReference getinterface_declaration_Superinterfaces();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.interface_declaration#getCorpoInterface <em>Corpo Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Corpo Interface</em>'.
   * @see org.xtext.simpleJava.interface_declaration#getCorpoInterface()
   * @see #getinterface_declaration()
   * @generated
   */
  EReference getinterface_declaration_CorpoInterface();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.field_declaration <em>field declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>field declaration</em>'.
   * @see org.xtext.simpleJava.field_declaration
   * @generated
   */
  EClass getfield_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.field_declaration#getDeclaracaoMetodo <em>Declaracao Metodo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaracao Metodo</em>'.
   * @see org.xtext.simpleJava.field_declaration#getDeclaracaoMetodo()
   * @see #getfield_declaration()
   * @generated
   */
  EReference getfield_declaration_DeclaracaoMetodo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.field_declaration#getDeclaracaoConstrutor <em>Declaracao Construtor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaracao Construtor</em>'.
   * @see org.xtext.simpleJava.field_declaration#getDeclaracaoConstrutor()
   * @see #getfield_declaration()
   * @generated
   */
  EReference getfield_declaration_DeclaracaoConstrutor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.field_declaration#getDeclaracaoVariavel <em>Declaracao Variavel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaracao Variavel</em>'.
   * @see org.xtext.simpleJava.field_declaration#getDeclaracaoVariavel()
   * @see #getfield_declaration()
   * @generated
   */
  EReference getfield_declaration_DeclaracaoVariavel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.field_declaration#getEstatico <em>Estatico</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Estatico</em>'.
   * @see org.xtext.simpleJava.field_declaration#getEstatico()
   * @see #getfield_declaration()
   * @generated
   */
  EReference getfield_declaration_Estatico();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.method_declaration <em>method declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>method declaration</em>'.
   * @see org.xtext.simpleJava.method_declaration
   * @generated
   */
  EClass getmethod_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.method_declaration#getModificadorMetodo <em>Modificador Metodo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modificador Metodo</em>'.
   * @see org.xtext.simpleJava.method_declaration#getModificadorMetodo()
   * @see #getmethod_declaration()
   * @generated
   */
  EReference getmethod_declaration_ModificadorMetodo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.method_declaration#getTipoRetorno <em>Tipo Retorno</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo Retorno</em>'.
   * @see org.xtext.simpleJava.method_declaration#getTipoRetorno()
   * @see #getmethod_declaration()
   * @generated
   */
  EReference getmethod_declaration_TipoRetorno();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.method_declaration#getNomeMetodo <em>Nome Metodo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome Metodo</em>'.
   * @see org.xtext.simpleJava.method_declaration#getNomeMetodo()
   * @see #getmethod_declaration()
   * @generated
   */
  EAttribute getmethod_declaration_NomeMetodo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.method_declaration#getParametrosMetodo <em>Parametros Metodo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parametros Metodo</em>'.
   * @see org.xtext.simpleJava.method_declaration#getParametrosMetodo()
   * @see #getmethod_declaration()
   * @generated
   */
  EReference getmethod_declaration_ParametrosMetodo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.method_declaration#getBlocoMetodo <em>Bloco Metodo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloco Metodo</em>'.
   * @see org.xtext.simpleJava.method_declaration#getBlocoMetodo()
   * @see #getmethod_declaration()
   * @generated
   */
  EReference getmethod_declaration_BlocoMetodo();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.parameter <em>parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameter</em>'.
   * @see org.xtext.simpleJava.parameter
   * @generated
   */
  EClass getparameter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.parameter#getTipoParametro <em>Tipo Parametro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo Parametro</em>'.
   * @see org.xtext.simpleJava.parameter#getTipoParametro()
   * @see #getparameter()
   * @generated
   */
  EReference getparameter_TipoParametro();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.parameter#getNomeParametro <em>Nome Parametro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome Parametro</em>'.
   * @see org.xtext.simpleJava.parameter#getNomeParametro()
   * @see #getparameter()
   * @generated
   */
  EAttribute getparameter_NomeParametro();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.parameter_list <em>parameter list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameter list</em>'.
   * @see org.xtext.simpleJava.parameter_list
   * @generated
   */
  EClass getparameter_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simpleJava.parameter_list#getParametros <em>Parametros</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parametros</em>'.
   * @see org.xtext.simpleJava.parameter_list#getParametros()
   * @see #getparameter_list()
   * @generated
   */
  EReference getparameter_list_Parametros();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.statement_block <em>statement block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement block</em>'.
   * @see org.xtext.simpleJava.statement_block
   * @generated
   */
  EClass getstatement_block();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement_block#getCorpo <em>Corpo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Corpo</em>'.
   * @see org.xtext.simpleJava.statement_block#getCorpo()
   * @see #getstatement_block()
   * @generated
   */
  EReference getstatement_block_Corpo();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement</em>'.
   * @see org.xtext.simpleJava.statement
   * @generated
   */
  EClass getstatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement#getDeclaracaoVariavel <em>Declaracao Variavel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaracao Variavel</em>'.
   * @see org.xtext.simpleJava.statement#getDeclaracaoVariavel()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_DeclaracaoVariavel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement#getExpressao <em>Expressao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao</em>'.
   * @see org.xtext.simpleJava.statement#getExpressao()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Expressao();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement#getBloco <em>Bloco</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloco</em>'.
   * @see org.xtext.simpleJava.statement#getBloco()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Bloco();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement#getCorpoIf <em>Corpo If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Corpo If</em>'.
   * @see org.xtext.simpleJava.statement#getCorpoIf()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_CorpoIf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement#getCorpoDoWhile <em>Corpo Do While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Corpo Do While</em>'.
   * @see org.xtext.simpleJava.statement#getCorpoDoWhile()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_CorpoDoWhile();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement#getCorpoWhile <em>Corpo While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Corpo While</em>'.
   * @see org.xtext.simpleJava.statement#getCorpoWhile()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_CorpoWhile();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement#getCorpoFor <em>Corpo For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Corpo For</em>'.
   * @see org.xtext.simpleJava.statement#getCorpoFor()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_CorpoFor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement#getCorpoTryCatch <em>Corpo Try Catch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Corpo Try Catch</em>'.
   * @see org.xtext.simpleJava.statement#getCorpoTryCatch()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_CorpoTryCatch();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement#getCorpoSwitchCase <em>Corpo Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Corpo Switch Case</em>'.
   * @see org.xtext.simpleJava.statement#getCorpoSwitchCase()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_CorpoSwitchCase();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement#getExpressaoSynchronized <em>Expressao Synchronized</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao Synchronized</em>'.
   * @see org.xtext.simpleJava.statement#getExpressaoSynchronized()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_ExpressaoSynchronized();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement#getCorpoSynchronize <em>Corpo Synchronize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Corpo Synchronize</em>'.
   * @see org.xtext.simpleJava.statement#getCorpoSynchronize()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_CorpoSynchronize();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return</em>'.
   * @see org.xtext.simpleJava.statement#getReturn()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Return();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.statement#getExececao <em>Exececao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exececao</em>'.
   * @see org.xtext.simpleJava.statement#getExececao()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Exececao();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.statement#getBreak <em>Break</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Break</em>'.
   * @see org.xtext.simpleJava.statement#getBreak()
   * @see #getstatement()
   * @generated
   */
  EAttribute getstatement_Break();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.statement#getContinue <em>Continue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Continue</em>'.
   * @see org.xtext.simpleJava.statement#getContinue()
   * @see #getstatement()
   * @generated
   */
  EAttribute getstatement_Continue();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.variable_declaration <em>variable declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable declaration</em>'.
   * @see org.xtext.simpleJava.variable_declaration
   * @generated
   */
  EClass getvariable_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.variable_declaration#getModificador <em>Modificador</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modificador</em>'.
   * @see org.xtext.simpleJava.variable_declaration#getModificador()
   * @see #getvariable_declaration()
   * @generated
   */
  EReference getvariable_declaration_Modificador();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.variable_declaration#getTipoVariavel <em>Tipo Variavel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo Variavel</em>'.
   * @see org.xtext.simpleJava.variable_declaration#getTipoVariavel()
   * @see #getvariable_declaration()
   * @generated
   */
  EReference getvariable_declaration_TipoVariavel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simpleJava.variable_declaration#getDeclaracaoVariaveis <em>Declaracao Variaveis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declaracao Variaveis</em>'.
   * @see org.xtext.simpleJava.variable_declaration#getDeclaracaoVariaveis()
   * @see #getvariable_declaration()
   * @generated
   */
  EReference getvariable_declaration_DeclaracaoVariaveis();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.variable_declaration#getBlocoVariavel <em>Bloco Variavel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloco Variavel</em>'.
   * @see org.xtext.simpleJava.variable_declaration#getBlocoVariavel()
   * @see #getvariable_declaration()
   * @generated
   */
  EReference getvariable_declaration_BlocoVariavel();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.variable_declarator <em>variable declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable declarator</em>'.
   * @see org.xtext.simpleJava.variable_declarator
   * @generated
   */
  EClass getvariable_declarator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.variable_declarator#getNomeVariavel <em>Nome Variavel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome Variavel</em>'.
   * @see org.xtext.simpleJava.variable_declarator#getNomeVariavel()
   * @see #getvariable_declarator()
   * @generated
   */
  EAttribute getvariable_declarator_NomeVariavel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.variable_declarator#getValorVariavel <em>Valor Variavel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Valor Variavel</em>'.
   * @see org.xtext.simpleJava.variable_declarator#getValorVariavel()
   * @see #getvariable_declarator()
   * @generated
   */
  EReference getvariable_declarator_ValorVariavel();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.variable_initializer <em>variable initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable initializer</em>'.
   * @see org.xtext.simpleJava.variable_initializer
   * @generated
   */
  EClass getvariable_initializer();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.variable_initializer#getExpressaoVariavel <em>Expressao Variavel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao Variavel</em>'.
   * @see org.xtext.simpleJava.variable_initializer#getExpressaoVariavel()
   * @see #getvariable_initializer()
   * @generated
   */
  EReference getvariable_initializer_ExpressaoVariavel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simpleJava.variable_initializer#getValorVariaveis <em>Valor Variaveis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Valor Variaveis</em>'.
   * @see org.xtext.simpleJava.variable_initializer#getValorVariaveis()
   * @see #getvariable_initializer()
   * @generated
   */
  EReference getvariable_initializer_ValorVariaveis();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.if_statement <em>if statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>if statement</em>'.
   * @see org.xtext.simpleJava.if_statement
   * @generated
   */
  EClass getif_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.if_statement#getEspressaoIf <em>Espressao If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Espressao If</em>'.
   * @see org.xtext.simpleJava.if_statement#getEspressaoIf()
   * @see #getif_statement()
   * @generated
   */
  EReference getif_statement_EspressaoIf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.if_statement#getBlcoIf <em>Blco If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Blco If</em>'.
   * @see org.xtext.simpleJava.if_statement#getBlcoIf()
   * @see #getif_statement()
   * @generated
   */
  EReference getif_statement_BlcoIf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.if_statement#getBlocoElse <em>Bloco Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloco Else</em>'.
   * @see org.xtext.simpleJava.if_statement#getBlocoElse()
   * @see #getif_statement()
   * @generated
   */
  EReference getif_statement_BlocoElse();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.do_statement <em>do statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>do statement</em>'.
   * @see org.xtext.simpleJava.do_statement
   * @generated
   */
  EClass getdo_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.do_statement#getBlocoDo <em>Bloco Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloco Do</em>'.
   * @see org.xtext.simpleJava.do_statement#getBlocoDo()
   * @see #getdo_statement()
   * @generated
   */
  EReference getdo_statement_BlocoDo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.do_statement#getExpressaoWhile <em>Expressao While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao While</em>'.
   * @see org.xtext.simpleJava.do_statement#getExpressaoWhile()
   * @see #getdo_statement()
   * @generated
   */
  EReference getdo_statement_ExpressaoWhile();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.while_statement <em>while statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>while statement</em>'.
   * @see org.xtext.simpleJava.while_statement
   * @generated
   */
  EClass getwhile_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.while_statement#getExpressaoWhile <em>Expressao While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao While</em>'.
   * @see org.xtext.simpleJava.while_statement#getExpressaoWhile()
   * @see #getwhile_statement()
   * @generated
   */
  EReference getwhile_statement_ExpressaoWhile();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.while_statement#getBlocoWhile <em>Bloco While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloco While</em>'.
   * @see org.xtext.simpleJava.while_statement#getBlocoWhile()
   * @see #getwhile_statement()
   * @generated
   */
  EReference getwhile_statement_BlocoWhile();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.for_statement <em>for statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>for statement</em>'.
   * @see org.xtext.simpleJava.for_statement
   * @generated
   */
  EClass getfor_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.for_statement#getDeclaracaoVariavel <em>Declaracao Variavel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaracao Variavel</em>'.
   * @see org.xtext.simpleJava.for_statement#getDeclaracaoVariavel()
   * @see #getfor_statement()
   * @generated
   */
  EReference getfor_statement_DeclaracaoVariavel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.for_statement#getExpressaoDeclaracao <em>Expressao Declaracao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao Declaracao</em>'.
   * @see org.xtext.simpleJava.for_statement#getExpressaoDeclaracao()
   * @see #getfor_statement()
   * @generated
   */
  EReference getfor_statement_ExpressaoDeclaracao();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.for_statement#getExpressaoFor <em>Expressao For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao For</em>'.
   * @see org.xtext.simpleJava.for_statement#getExpressaoFor()
   * @see #getfor_statement()
   * @generated
   */
  EReference getfor_statement_ExpressaoFor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.for_statement#getExpressaoIncremento <em>Expressao Incremento</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao Incremento</em>'.
   * @see org.xtext.simpleJava.for_statement#getExpressaoIncremento()
   * @see #getfor_statement()
   * @generated
   */
  EReference getfor_statement_ExpressaoIncremento();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.for_statement#getBlocoFor <em>Bloco For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloco For</em>'.
   * @see org.xtext.simpleJava.for_statement#getBlocoFor()
   * @see #getfor_statement()
   * @generated
   */
  EReference getfor_statement_BlocoFor();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.try_statement <em>try statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>try statement</em>'.
   * @see org.xtext.simpleJava.try_statement
   * @generated
   */
  EClass gettry_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.try_statement#getBlocoTry <em>Bloco Try</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloco Try</em>'.
   * @see org.xtext.simpleJava.try_statement#getBlocoTry()
   * @see #gettry_statement()
   * @generated
   */
  EReference gettry_statement_BlocoTry();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.try_statement#getParametroCatch <em>Parametro Catch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parametro Catch</em>'.
   * @see org.xtext.simpleJava.try_statement#getParametroCatch()
   * @see #gettry_statement()
   * @generated
   */
  EReference gettry_statement_ParametroCatch();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.try_statement#getBlocoCatch <em>Bloco Catch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloco Catch</em>'.
   * @see org.xtext.simpleJava.try_statement#getBlocoCatch()
   * @see #gettry_statement()
   * @generated
   */
  EReference gettry_statement_BlocoCatch();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.try_statement#getBlocoFinally <em>Bloco Finally</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloco Finally</em>'.
   * @see org.xtext.simpleJava.try_statement#getBlocoFinally()
   * @see #gettry_statement()
   * @generated
   */
  EReference gettry_statement_BlocoFinally();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.switch_statement <em>switch statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>switch statement</em>'.
   * @see org.xtext.simpleJava.switch_statement
   * @generated
   */
  EClass getswitch_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.switch_statement#getExpressaoSwitch <em>Expressao Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao Switch</em>'.
   * @see org.xtext.simpleJava.switch_statement#getExpressaoSwitch()
   * @see #getswitch_statement()
   * @generated
   */
  EReference getswitch_statement_ExpressaoSwitch();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simpleJava.switch_statement#getExpressaoCases <em>Expressao Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressao Cases</em>'.
   * @see org.xtext.simpleJava.switch_statement#getExpressaoCases()
   * @see #getswitch_statement()
   * @generated
   */
  EReference getswitch_statement_ExpressaoCases();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.switch_statement#getBlocoSwitch <em>Bloco Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloco Switch</em>'.
   * @see org.xtext.simpleJava.switch_statement#getBlocoSwitch()
   * @see #getswitch_statement()
   * @generated
   */
  EReference getswitch_statement_BlocoSwitch();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.constructor_declaration <em>constructor declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constructor declaration</em>'.
   * @see org.xtext.simpleJava.constructor_declaration
   * @generated
   */
  EClass getconstructor_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.constructor_declaration#getModificador <em>Modificador</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modificador</em>'.
   * @see org.xtext.simpleJava.constructor_declaration#getModificador()
   * @see #getconstructor_declaration()
   * @generated
   */
  EReference getconstructor_declaration_Modificador();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.constructor_declaration#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo</em>'.
   * @see org.xtext.simpleJava.constructor_declaration#getTipo()
   * @see #getconstructor_declaration()
   * @generated
   */
  EReference getconstructor_declaration_Tipo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.constructor_declaration#getNomeContrutor <em>Nome Contrutor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome Contrutor</em>'.
   * @see org.xtext.simpleJava.constructor_declaration#getNomeContrutor()
   * @see #getconstructor_declaration()
   * @generated
   */
  EAttribute getconstructor_declaration_NomeContrutor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.constructor_declaration#getParametrosContrutor <em>Parametros Contrutor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parametros Contrutor</em>'.
   * @see org.xtext.simpleJava.constructor_declaration#getParametrosContrutor()
   * @see #getconstructor_declaration()
   * @generated
   */
  EReference getconstructor_declaration_ParametrosContrutor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.constructor_declaration#getBlocoConstrutor <em>Bloco Construtor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloco Construtor</em>'.
   * @see org.xtext.simpleJava.constructor_declaration#getBlocoConstrutor()
   * @see #getconstructor_declaration()
   * @generated
   */
  EReference getconstructor_declaration_BlocoConstrutor();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.static_initializer <em>static initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>static initializer</em>'.
   * @see org.xtext.simpleJava.static_initializer
   * @generated
   */
  EClass getstatic_initializer();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.static_initializer#getBlocoEstatico <em>Bloco Estatico</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloco Estatico</em>'.
   * @see org.xtext.simpleJava.static_initializer#getBlocoEstatico()
   * @see #getstatic_initializer()
   * @generated
   */
  EReference getstatic_initializer_BlocoEstatico();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.creating_expression <em>creating expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>creating expression</em>'.
   * @see org.xtext.simpleJava.creating_expression
   * @generated
   */
  EClass getcreating_expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.creating_expression#getNovoObjeto <em>Novo Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Novo Objeto</em>'.
   * @see org.xtext.simpleJava.creating_expression#getNovoObjeto()
   * @see #getcreating_expression()
   * @generated
   */
  EReference getcreating_expression_NovoObjeto();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.creating_expression#getParametros <em>Parametros</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parametros</em>'.
   * @see org.xtext.simpleJava.creating_expression#getParametros()
   * @see #getcreating_expression()
   * @generated
   */
  EReference getcreating_expression_Parametros();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.creating_expression#getTipoObjeto <em>Tipo Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo Objeto</em>'.
   * @see org.xtext.simpleJava.creating_expression#getTipoObjeto()
   * @see #getcreating_expression()
   * @generated
   */
  EReference getcreating_expression_TipoObjeto();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.creating_expression#getExpressaoNew <em>Expressao New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao New</em>'.
   * @see org.xtext.simpleJava.creating_expression#getExpressaoNew()
   * @see #getcreating_expression()
   * @generated
   */
  EReference getcreating_expression_ExpressaoNew();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.creating_expression#getNovo <em>Novo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Novo</em>'.
   * @see org.xtext.simpleJava.creating_expression#getNovo()
   * @see #getcreating_expression()
   * @generated
   */
  EReference getcreating_expression_Novo();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.exp_aux <em>exp aux</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>exp aux</em>'.
   * @see org.xtext.simpleJava.exp_aux
   * @generated
   */
  EClass getexp_aux();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expression</em>'.
   * @see org.xtext.simpleJava.expression
   * @generated
   */
  EClass getexpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.expression#getTipoLogical <em>Tipo Logical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo Logical</em>'.
   * @see org.xtext.simpleJava.expression#getTipoLogical()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_TipoLogical();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.expression#getTipoNumeric <em>Tipo Numeric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo Numeric</em>'.
   * @see org.xtext.simpleJava.expression#getTipoNumeric()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_TipoNumeric();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.expression#getTipoBit <em>Tipo Bit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo Bit</em>'.
   * @see org.xtext.simpleJava.expression#getTipoBit()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_TipoBit();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.expression#getNew <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New</em>'.
   * @see org.xtext.simpleJava.expression#getNew()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_New();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.expression#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see org.xtext.simpleJava.expression#getLiteral()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_Literal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.expression#getIdentificador <em>Identificador</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identificador</em>'.
   * @see org.xtext.simpleJava.expression#getIdentificador()
   * @see #getexpression()
   * @generated
   */
  EAttribute getexpression_Identificador();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.expression#getExpressao <em>Expressao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao</em>'.
   * @see org.xtext.simpleJava.expression#getExpressao()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_Expressao();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.expression_aux <em>expression aux</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expression aux</em>'.
   * @see org.xtext.simpleJava.expression_aux
   * @generated
   */
  EClass getexpression_aux();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.expression_aux#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see org.xtext.simpleJava.expression_aux#getOp()
   * @see #getexpression_aux()
   * @generated
   */
  EReference getexpression_aux_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.expression_aux#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.simpleJava.expression_aux#getExp()
   * @see #getexpression_aux()
   * @generated
   */
  EReference getexpression_aux_Exp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.expression_aux#getOperador <em>Operador</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operador</em>'.
   * @see org.xtext.simpleJava.expression_aux#getOperador()
   * @see #getexpression_aux()
   * @generated
   */
  EAttribute getexpression_aux_Operador();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.expression_aux#getExpressoes <em>Expressoes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressoes</em>'.
   * @see org.xtext.simpleJava.expression_aux#getExpressoes()
   * @see #getexpression_aux()
   * @generated
   */
  EReference getexpression_aux_Expressoes();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.mais_aux <em>mais aux</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>mais aux</em>'.
   * @see org.xtext.simpleJava.mais_aux
   * @generated
   */
  EClass getmais_aux();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.mais_aux#getOperador <em>Operador</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operador</em>'.
   * @see org.xtext.simpleJava.mais_aux#getOperador()
   * @see #getmais_aux()
   * @generated
   */
  EAttribute getmais_aux_Operador();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.new <em>new</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>new</em>'.
   * @see org.xtext.simpleJava.new
   * @generated
   */
  EClass getnew();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.creating_aux <em>creating aux</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>creating aux</em>'.
   * @see org.xtext.simpleJava.creating_aux
   * @generated
   */
  EClass getcreating_aux();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.creating_aux#getArgumentos <em>Argumentos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argumentos</em>'.
   * @see org.xtext.simpleJava.creating_aux#getArgumentos()
   * @see #getcreating_aux()
   * @generated
   */
  EReference getcreating_aux_Argumentos();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.aux <em>aux</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aux</em>'.
   * @see org.xtext.simpleJava.aux
   * @generated
   */
  EClass getaux();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.aux#getEspressao <em>Espressao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Espressao</em>'.
   * @see org.xtext.simpleJava.aux#getEspressao()
   * @see #getaux()
   * @generated
   */
  EReference getaux_Espressao();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.literal_expression <em>literal expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>literal expression</em>'.
   * @see org.xtext.simpleJava.literal_expression
   * @generated
   */
  EClass getliteral_expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.literal_expression#getDecimal <em>Decimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decimal</em>'.
   * @see org.xtext.simpleJava.literal_expression#getDecimal()
   * @see #getliteral_expression()
   * @generated
   */
  EAttribute getliteral_expression_Decimal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.literal_expression#getInteiro <em>Inteiro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inteiro</em>'.
   * @see org.xtext.simpleJava.literal_expression#getInteiro()
   * @see #getliteral_expression()
   * @generated
   */
  EAttribute getliteral_expression_Inteiro();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.literal_expression#getFloat <em>Float</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Float</em>'.
   * @see org.xtext.simpleJava.literal_expression#getFloat()
   * @see #getliteral_expression()
   * @generated
   */
  EAttribute getliteral_expression_Float();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.literal_expression#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.xtext.simpleJava.literal_expression#getString()
   * @see #getliteral_expression()
   * @generated
   */
  EAttribute getliteral_expression_String();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.logical_expression <em>logical expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>logical expression</em>'.
   * @see org.xtext.simpleJava.logical_expression
   * @generated
   */
  EClass getlogical_expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.logical_expression#getOperador <em>Operador</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operador</em>'.
   * @see org.xtext.simpleJava.logical_expression#getOperador()
   * @see #getlogical_expression()
   * @generated
   */
  EAttribute getlogical_expression_Operador();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.logical_expression#getExpressao <em>Expressao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao</em>'.
   * @see org.xtext.simpleJava.logical_expression#getExpressao()
   * @see #getlogical_expression()
   * @generated
   */
  EReference getlogical_expression_Expressao();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.bit_expression <em>bit expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bit expression</em>'.
   * @see org.xtext.simpleJava.bit_expression
   * @generated
   */
  EClass getbit_expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.bit_expression#getOperador <em>Operador</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operador</em>'.
   * @see org.xtext.simpleJava.bit_expression#getOperador()
   * @see #getbit_expression()
   * @generated
   */
  EAttribute getbit_expression_Operador();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.bit_expression#getExpressao <em>Expressao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao</em>'.
   * @see org.xtext.simpleJava.bit_expression#getExpressao()
   * @see #getbit_expression()
   * @generated
   */
  EReference getbit_expression_Expressao();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.numeric_expression <em>numeric expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>numeric expression</em>'.
   * @see org.xtext.simpleJava.numeric_expression
   * @generated
   */
  EClass getnumeric_expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.numeric_expression#getOperador <em>Operador</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operador</em>'.
   * @see org.xtext.simpleJava.numeric_expression#getOperador()
   * @see #getnumeric_expression()
   * @generated
   */
  EAttribute getnumeric_expression_Operador();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.numeric_expression#getExpressao <em>Expressao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressao</em>'.
   * @see org.xtext.simpleJava.numeric_expression#getExpressao()
   * @see #getnumeric_expression()
   * @generated
   */
  EReference getnumeric_expression_Expressao();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.arglist <em>arglist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>arglist</em>'.
   * @see org.xtext.simpleJava.arglist
   * @generated
   */
  EClass getarglist();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simpleJava.arglist#getExpressoesArgumentos <em>Expressoes Argumentos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressoes Argumentos</em>'.
   * @see org.xtext.simpleJava.arglist#getExpressoesArgumentos()
   * @see #getarglist()
   * @generated
   */
  EReference getarglist_ExpressoesArgumentos();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simpleJava.arglist#getTipoParametro <em>Tipo Parametro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tipo Parametro</em>'.
   * @see org.xtext.simpleJava.arglist#getTipoParametro()
   * @see #getarglist()
   * @generated
   */
  EReference getarglist_TipoParametro();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.simpleJava.arglist#getNomeParametro <em>Nome Parametro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Nome Parametro</em>'.
   * @see org.xtext.simpleJava.arglist#getNomeParametro()
   * @see #getarglist()
   * @generated
   */
  EAttribute getarglist_NomeParametro();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.name <em>name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>name</em>'.
   * @see org.xtext.simpleJava.name
   * @generated
   */
  EClass getname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.name#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see org.xtext.simpleJava.name#getNome()
   * @see #getname()
   * @generated
   */
  EAttribute getname_Nome();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.name#getPacote <em>Pacote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pacote</em>'.
   * @see org.xtext.simpleJava.name#getPacote()
   * @see #getname()
   * @generated
   */
  EReference getname_Pacote();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.package_name_aux <em>package name aux</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>package name aux</em>'.
   * @see org.xtext.simpleJava.package_name_aux
   * @generated
   */
  EClass getpackage_name_aux();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.package_name_aux#getNomePacote <em>Nome Pacote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome Pacote</em>'.
   * @see org.xtext.simpleJava.package_name_aux#getNomePacote()
   * @see #getpackage_name_aux()
   * @generated
   */
  EAttribute getpackage_name_aux_NomePacote();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.package_name_aux#getPacote <em>Pacote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pacote</em>'.
   * @see org.xtext.simpleJava.package_name_aux#getPacote()
   * @see #getpackage_name_aux()
   * @generated
   */
  EReference getpackage_name_aux_Pacote();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.type_specifier <em>type specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type specifier</em>'.
   * @see org.xtext.simpleJava.type_specifier
   * @generated
   */
  EClass gettype_specifier();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.type_specifier#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see org.xtext.simpleJava.type_specifier#getNome()
   * @see #gettype_specifier()
   * @generated
   */
  EAttribute gettype_specifier_Nome();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.type <em>type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type</em>'.
   * @see org.xtext.simpleJava.type
   * @generated
   */
  EClass gettype();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simpleJava.type#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo</em>'.
   * @see org.xtext.simpleJava.type#getTipo()
   * @see #gettype()
   * @generated
   */
  EReference gettype_Tipo();

  /**
   * Returns the meta object for class '{@link org.xtext.simpleJava.MODIFIER <em>MODIFIER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MODIFIER</em>'.
   * @see org.xtext.simpleJava.MODIFIER
   * @generated
   */
  EClass getMODIFIER();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simpleJava.MODIFIER#getModificador <em>Modificador</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modificador</em>'.
   * @see org.xtext.simpleJava.MODIFIER#getModificador()
   * @see #getMODIFIER()
   * @generated
   */
  EAttribute getMODIFIER_Modificador();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimpleJavaFactory getSimpleJavaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.ModelImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Comp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMP = eINSTANCE.getModel_Comp();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.compilation_unitImpl <em>compilation unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.compilation_unitImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getcompilation_unit()
     * @generated
     */
    EClass COMPILATION_UNIT = eINSTANCE.getcompilation_unit();

    /**
     * The meta object literal for the '<em><b>Pacote</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__PACOTE = eINSTANCE.getcompilation_unit_Pacote();

    /**
     * The meta object literal for the '<em><b>Importes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__IMPORTES = eINSTANCE.getcompilation_unit_Importes();

    /**
     * The meta object literal for the '<em><b>Declaracao</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__DECLARACAO = eINSTANCE.getcompilation_unit_Declaracao();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.package_statementImpl <em>package statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.package_statementImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getpackage_statement()
     * @generated
     */
    EClass PACKAGE_STATEMENT = eINSTANCE.getpackage_statement();

    /**
     * The meta object literal for the '<em><b>Noome Pacote</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_STATEMENT__NOOME_PACOTE = eINSTANCE.getpackage_statement_NoomePacote();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.import_statementImpl <em>import statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.import_statementImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getimport_statement()
     * @generated
     */
    EClass IMPORT_STATEMENT = eINSTANCE.getimport_statement();

    /**
     * The meta object literal for the '<em><b>Nome Importe</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT_STATEMENT__NOME_IMPORTE = eINSTANCE.getimport_statement_NomeImporte();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.type_declarationImpl <em>type declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.type_declarationImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#gettype_declaration()
     * @generated
     */
    EClass TYPE_DECLARATION = eINSTANCE.gettype_declaration();

    /**
     * The meta object literal for the '<em><b>Declaracao Classe</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__DECLARACAO_CLASSE = eINSTANCE.gettype_declaration_DeclaracaoClasse();

    /**
     * The meta object literal for the '<em><b>Declaracao Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__DECLARACAO_INTERFACE = eINSTANCE.gettype_declaration_DeclaracaoInterface();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.class_declarationImpl <em>class declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.class_declarationImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getclass_declaration()
     * @generated
     */
    EClass CLASS_DECLARATION = eINSTANCE.getclass_declaration();

    /**
     * The meta object literal for the '<em><b>Modificadores</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__MODIFICADORES = eINSTANCE.getclass_declaration_Modificadores();

    /**
     * The meta object literal for the '<em><b>Nome Classe</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__NOME_CLASSE = eINSTANCE.getclass_declaration_NomeClasse();

    /**
     * The meta object literal for the '<em><b>Superclasse</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__SUPERCLASSE = eINSTANCE.getclass_declaration_Superclasse();

    /**
     * The meta object literal for the '<em><b>Implementos Classe</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__IMPLEMENTOS_CLASSE = eINSTANCE.getclass_declaration_ImplementosClasse();

    /**
     * The meta object literal for the '<em><b>Corpo Classe</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__CORPO_CLASSE = eINSTANCE.getclass_declaration_CorpoClasse();

    /**
     * The meta object literal for the '<em><b>Declaracao Classe</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__DECLARACAO_CLASSE = eINSTANCE.getclass_declaration_DeclaracaoClasse();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.interface_declarationImpl <em>interface declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.interface_declarationImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getinterface_declaration()
     * @generated
     */
    EClass INTERFACE_DECLARATION = eINSTANCE.getinterface_declaration();

    /**
     * The meta object literal for the '<em><b>Modificadores</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECLARATION__MODIFICADORES = eINSTANCE.getinterface_declaration_Modificadores();

    /**
     * The meta object literal for the '<em><b>Nome Interface</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DECLARATION__NOME_INTERFACE = eINSTANCE.getinterface_declaration_NomeInterface();

    /**
     * The meta object literal for the '<em><b>Superinterfaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECLARATION__SUPERINTERFACES = eINSTANCE.getinterface_declaration_Superinterfaces();

    /**
     * The meta object literal for the '<em><b>Corpo Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECLARATION__CORPO_INTERFACE = eINSTANCE.getinterface_declaration_CorpoInterface();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.field_declarationImpl <em>field declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.field_declarationImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getfield_declaration()
     * @generated
     */
    EClass FIELD_DECLARATION = eINSTANCE.getfield_declaration();

    /**
     * The meta object literal for the '<em><b>Declaracao Metodo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__DECLARACAO_METODO = eINSTANCE.getfield_declaration_DeclaracaoMetodo();

    /**
     * The meta object literal for the '<em><b>Declaracao Construtor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__DECLARACAO_CONSTRUTOR = eINSTANCE.getfield_declaration_DeclaracaoConstrutor();

    /**
     * The meta object literal for the '<em><b>Declaracao Variavel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__DECLARACAO_VARIAVEL = eINSTANCE.getfield_declaration_DeclaracaoVariavel();

    /**
     * The meta object literal for the '<em><b>Estatico</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__ESTATICO = eINSTANCE.getfield_declaration_Estatico();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.method_declarationImpl <em>method declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.method_declarationImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getmethod_declaration()
     * @generated
     */
    EClass METHOD_DECLARATION = eINSTANCE.getmethod_declaration();

    /**
     * The meta object literal for the '<em><b>Modificador Metodo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__MODIFICADOR_METODO = eINSTANCE.getmethod_declaration_ModificadorMetodo();

    /**
     * The meta object literal for the '<em><b>Tipo Retorno</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__TIPO_RETORNO = eINSTANCE.getmethod_declaration_TipoRetorno();

    /**
     * The meta object literal for the '<em><b>Nome Metodo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECLARATION__NOME_METODO = eINSTANCE.getmethod_declaration_NomeMetodo();

    /**
     * The meta object literal for the '<em><b>Parametros Metodo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__PARAMETROS_METODO = eINSTANCE.getmethod_declaration_ParametrosMetodo();

    /**
     * The meta object literal for the '<em><b>Bloco Metodo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__BLOCO_METODO = eINSTANCE.getmethod_declaration_BlocoMetodo();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.parameterImpl <em>parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.parameterImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getparameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getparameter();

    /**
     * The meta object literal for the '<em><b>Tipo Parametro</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TIPO_PARAMETRO = eINSTANCE.getparameter_TipoParametro();

    /**
     * The meta object literal for the '<em><b>Nome Parametro</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NOME_PARAMETRO = eINSTANCE.getparameter_NomeParametro();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.parameter_listImpl <em>parameter list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.parameter_listImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getparameter_list()
     * @generated
     */
    EClass PARAMETER_LIST = eINSTANCE.getparameter_list();

    /**
     * The meta object literal for the '<em><b>Parametros</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAMETROS = eINSTANCE.getparameter_list_Parametros();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.statement_blockImpl <em>statement block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.statement_blockImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getstatement_block()
     * @generated
     */
    EClass STATEMENT_BLOCK = eINSTANCE.getstatement_block();

    /**
     * The meta object literal for the '<em><b>Corpo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_BLOCK__CORPO = eINSTANCE.getstatement_block_Corpo();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.statementImpl <em>statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.statementImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getstatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getstatement();

    /**
     * The meta object literal for the '<em><b>Declaracao Variavel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__DECLARACAO_VARIAVEL = eINSTANCE.getstatement_DeclaracaoVariavel();

    /**
     * The meta object literal for the '<em><b>Expressao</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EXPRESSAO = eINSTANCE.getstatement_Expressao();

    /**
     * The meta object literal for the '<em><b>Bloco</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__BLOCO = eINSTANCE.getstatement_Bloco();

    /**
     * The meta object literal for the '<em><b>Corpo If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__CORPO_IF = eINSTANCE.getstatement_CorpoIf();

    /**
     * The meta object literal for the '<em><b>Corpo Do While</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__CORPO_DO_WHILE = eINSTANCE.getstatement_CorpoDoWhile();

    /**
     * The meta object literal for the '<em><b>Corpo While</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__CORPO_WHILE = eINSTANCE.getstatement_CorpoWhile();

    /**
     * The meta object literal for the '<em><b>Corpo For</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__CORPO_FOR = eINSTANCE.getstatement_CorpoFor();

    /**
     * The meta object literal for the '<em><b>Corpo Try Catch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__CORPO_TRY_CATCH = eINSTANCE.getstatement_CorpoTryCatch();

    /**
     * The meta object literal for the '<em><b>Corpo Switch Case</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__CORPO_SWITCH_CASE = eINSTANCE.getstatement_CorpoSwitchCase();

    /**
     * The meta object literal for the '<em><b>Expressao Synchronized</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EXPRESSAO_SYNCHRONIZED = eINSTANCE.getstatement_ExpressaoSynchronized();

    /**
     * The meta object literal for the '<em><b>Corpo Synchronize</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__CORPO_SYNCHRONIZE = eINSTANCE.getstatement_CorpoSynchronize();

    /**
     * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__RETURN = eINSTANCE.getstatement_Return();

    /**
     * The meta object literal for the '<em><b>Exececao</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EXECECAO = eINSTANCE.getstatement_Exececao();

    /**
     * The meta object literal for the '<em><b>Break</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__BREAK = eINSTANCE.getstatement_Break();

    /**
     * The meta object literal for the '<em><b>Continue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__CONTINUE = eINSTANCE.getstatement_Continue();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.variable_declarationImpl <em>variable declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.variable_declarationImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getvariable_declaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getvariable_declaration();

    /**
     * The meta object literal for the '<em><b>Modificador</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__MODIFICADOR = eINSTANCE.getvariable_declaration_Modificador();

    /**
     * The meta object literal for the '<em><b>Tipo Variavel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__TIPO_VARIAVEL = eINSTANCE.getvariable_declaration_TipoVariavel();

    /**
     * The meta object literal for the '<em><b>Declaracao Variaveis</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__DECLARACAO_VARIAVEIS = eINSTANCE.getvariable_declaration_DeclaracaoVariaveis();

    /**
     * The meta object literal for the '<em><b>Bloco Variavel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__BLOCO_VARIAVEL = eINSTANCE.getvariable_declaration_BlocoVariavel();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.variable_declaratorImpl <em>variable declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.variable_declaratorImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getvariable_declarator()
     * @generated
     */
    EClass VARIABLE_DECLARATOR = eINSTANCE.getvariable_declarator();

    /**
     * The meta object literal for the '<em><b>Nome Variavel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATOR__NOME_VARIAVEL = eINSTANCE.getvariable_declarator_NomeVariavel();

    /**
     * The meta object literal for the '<em><b>Valor Variavel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATOR__VALOR_VARIAVEL = eINSTANCE.getvariable_declarator_ValorVariavel();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.variable_initializerImpl <em>variable initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.variable_initializerImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getvariable_initializer()
     * @generated
     */
    EClass VARIABLE_INITIALIZER = eINSTANCE.getvariable_initializer();

    /**
     * The meta object literal for the '<em><b>Expressao Variavel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_INITIALIZER__EXPRESSAO_VARIAVEL = eINSTANCE.getvariable_initializer_ExpressaoVariavel();

    /**
     * The meta object literal for the '<em><b>Valor Variaveis</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_INITIALIZER__VALOR_VARIAVEIS = eINSTANCE.getvariable_initializer_ValorVariaveis();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.if_statementImpl <em>if statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.if_statementImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getif_statement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getif_statement();

    /**
     * The meta object literal for the '<em><b>Espressao If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ESPRESSAO_IF = eINSTANCE.getif_statement_EspressaoIf();

    /**
     * The meta object literal for the '<em><b>Blco If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__BLCO_IF = eINSTANCE.getif_statement_BlcoIf();

    /**
     * The meta object literal for the '<em><b>Bloco Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__BLOCO_ELSE = eINSTANCE.getif_statement_BlocoElse();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.do_statementImpl <em>do statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.do_statementImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getdo_statement()
     * @generated
     */
    EClass DO_STATEMENT = eINSTANCE.getdo_statement();

    /**
     * The meta object literal for the '<em><b>Bloco Do</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_STATEMENT__BLOCO_DO = eINSTANCE.getdo_statement_BlocoDo();

    /**
     * The meta object literal for the '<em><b>Expressao While</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_STATEMENT__EXPRESSAO_WHILE = eINSTANCE.getdo_statement_ExpressaoWhile();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.while_statementImpl <em>while statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.while_statementImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getwhile_statement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getwhile_statement();

    /**
     * The meta object literal for the '<em><b>Expressao While</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__EXPRESSAO_WHILE = eINSTANCE.getwhile_statement_ExpressaoWhile();

    /**
     * The meta object literal for the '<em><b>Bloco While</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__BLOCO_WHILE = eINSTANCE.getwhile_statement_BlocoWhile();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.for_statementImpl <em>for statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.for_statementImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getfor_statement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getfor_statement();

    /**
     * The meta object literal for the '<em><b>Declaracao Variavel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__DECLARACAO_VARIAVEL = eINSTANCE.getfor_statement_DeclaracaoVariavel();

    /**
     * The meta object literal for the '<em><b>Expressao Declaracao</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__EXPRESSAO_DECLARACAO = eINSTANCE.getfor_statement_ExpressaoDeclaracao();

    /**
     * The meta object literal for the '<em><b>Expressao For</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__EXPRESSAO_FOR = eINSTANCE.getfor_statement_ExpressaoFor();

    /**
     * The meta object literal for the '<em><b>Expressao Incremento</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__EXPRESSAO_INCREMENTO = eINSTANCE.getfor_statement_ExpressaoIncremento();

    /**
     * The meta object literal for the '<em><b>Bloco For</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__BLOCO_FOR = eINSTANCE.getfor_statement_BlocoFor();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.try_statementImpl <em>try statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.try_statementImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#gettry_statement()
     * @generated
     */
    EClass TRY_STATEMENT = eINSTANCE.gettry_statement();

    /**
     * The meta object literal for the '<em><b>Bloco Try</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__BLOCO_TRY = eINSTANCE.gettry_statement_BlocoTry();

    /**
     * The meta object literal for the '<em><b>Parametro Catch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__PARAMETRO_CATCH = eINSTANCE.gettry_statement_ParametroCatch();

    /**
     * The meta object literal for the '<em><b>Bloco Catch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__BLOCO_CATCH = eINSTANCE.gettry_statement_BlocoCatch();

    /**
     * The meta object literal for the '<em><b>Bloco Finally</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__BLOCO_FINALLY = eINSTANCE.gettry_statement_BlocoFinally();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.switch_statementImpl <em>switch statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.switch_statementImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getswitch_statement()
     * @generated
     */
    EClass SWITCH_STATEMENT = eINSTANCE.getswitch_statement();

    /**
     * The meta object literal for the '<em><b>Expressao Switch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__EXPRESSAO_SWITCH = eINSTANCE.getswitch_statement_ExpressaoSwitch();

    /**
     * The meta object literal for the '<em><b>Expressao Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__EXPRESSAO_CASES = eINSTANCE.getswitch_statement_ExpressaoCases();

    /**
     * The meta object literal for the '<em><b>Bloco Switch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__BLOCO_SWITCH = eINSTANCE.getswitch_statement_BlocoSwitch();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.constructor_declarationImpl <em>constructor declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.constructor_declarationImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getconstructor_declaration()
     * @generated
     */
    EClass CONSTRUCTOR_DECLARATION = eINSTANCE.getconstructor_declaration();

    /**
     * The meta object literal for the '<em><b>Modificador</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_DECLARATION__MODIFICADOR = eINSTANCE.getconstructor_declaration_Modificador();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_DECLARATION__TIPO = eINSTANCE.getconstructor_declaration_Tipo();

    /**
     * The meta object literal for the '<em><b>Nome Contrutor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR_DECLARATION__NOME_CONTRUTOR = eINSTANCE.getconstructor_declaration_NomeContrutor();

    /**
     * The meta object literal for the '<em><b>Parametros Contrutor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_DECLARATION__PARAMETROS_CONTRUTOR = eINSTANCE.getconstructor_declaration_ParametrosContrutor();

    /**
     * The meta object literal for the '<em><b>Bloco Construtor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_DECLARATION__BLOCO_CONSTRUTOR = eINSTANCE.getconstructor_declaration_BlocoConstrutor();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.static_initializerImpl <em>static initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.static_initializerImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getstatic_initializer()
     * @generated
     */
    EClass STATIC_INITIALIZER = eINSTANCE.getstatic_initializer();

    /**
     * The meta object literal for the '<em><b>Bloco Estatico</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_INITIALIZER__BLOCO_ESTATICO = eINSTANCE.getstatic_initializer_BlocoEstatico();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.creating_expressionImpl <em>creating expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.creating_expressionImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getcreating_expression()
     * @generated
     */
    EClass CREATING_EXPRESSION = eINSTANCE.getcreating_expression();

    /**
     * The meta object literal for the '<em><b>Novo Objeto</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATING_EXPRESSION__NOVO_OBJETO = eINSTANCE.getcreating_expression_NovoObjeto();

    /**
     * The meta object literal for the '<em><b>Parametros</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATING_EXPRESSION__PARAMETROS = eINSTANCE.getcreating_expression_Parametros();

    /**
     * The meta object literal for the '<em><b>Tipo Objeto</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATING_EXPRESSION__TIPO_OBJETO = eINSTANCE.getcreating_expression_TipoObjeto();

    /**
     * The meta object literal for the '<em><b>Expressao New</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATING_EXPRESSION__EXPRESSAO_NEW = eINSTANCE.getcreating_expression_ExpressaoNew();

    /**
     * The meta object literal for the '<em><b>Novo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATING_EXPRESSION__NOVO = eINSTANCE.getcreating_expression_Novo();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.exp_auxImpl <em>exp aux</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.exp_auxImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getexp_aux()
     * @generated
     */
    EClass EXP_AUX = eINSTANCE.getexp_aux();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.expressionImpl <em>expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.expressionImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getexpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getexpression();

    /**
     * The meta object literal for the '<em><b>Tipo Logical</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__TIPO_LOGICAL = eINSTANCE.getexpression_TipoLogical();

    /**
     * The meta object literal for the '<em><b>Tipo Numeric</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__TIPO_NUMERIC = eINSTANCE.getexpression_TipoNumeric();

    /**
     * The meta object literal for the '<em><b>Tipo Bit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__TIPO_BIT = eINSTANCE.getexpression_TipoBit();

    /**
     * The meta object literal for the '<em><b>New</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__NEW = eINSTANCE.getexpression_New();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LITERAL = eINSTANCE.getexpression_Literal();

    /**
     * The meta object literal for the '<em><b>Identificador</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__IDENTIFICADOR = eINSTANCE.getexpression_Identificador();

    /**
     * The meta object literal for the '<em><b>Expressao</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPRESSAO = eINSTANCE.getexpression_Expressao();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.expression_auxImpl <em>expression aux</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.expression_auxImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getexpression_aux()
     * @generated
     */
    EClass EXPRESSION_AUX = eINSTANCE.getexpression_aux();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AUX__OP = eINSTANCE.getexpression_aux_Op();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AUX__EXP = eINSTANCE.getexpression_aux_Exp();

    /**
     * The meta object literal for the '<em><b>Operador</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_AUX__OPERADOR = eINSTANCE.getexpression_aux_Operador();

    /**
     * The meta object literal for the '<em><b>Expressoes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AUX__EXPRESSOES = eINSTANCE.getexpression_aux_Expressoes();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.mais_auxImpl <em>mais aux</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.mais_auxImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getmais_aux()
     * @generated
     */
    EClass MAIS_AUX = eINSTANCE.getmais_aux();

    /**
     * The meta object literal for the '<em><b>Operador</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIS_AUX__OPERADOR = eINSTANCE.getmais_aux_Operador();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.newImpl <em>new</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.newImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getnew()
     * @generated
     */
    EClass NEW = eINSTANCE.getnew();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.creating_auxImpl <em>creating aux</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.creating_auxImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getcreating_aux()
     * @generated
     */
    EClass CREATING_AUX = eINSTANCE.getcreating_aux();

    /**
     * The meta object literal for the '<em><b>Argumentos</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATING_AUX__ARGUMENTOS = eINSTANCE.getcreating_aux_Argumentos();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.auxImpl <em>aux</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.auxImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getaux()
     * @generated
     */
    EClass AUX = eINSTANCE.getaux();

    /**
     * The meta object literal for the '<em><b>Espressao</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUX__ESPRESSAO = eINSTANCE.getaux_Espressao();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.literal_expressionImpl <em>literal expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.literal_expressionImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getliteral_expression()
     * @generated
     */
    EClass LITERAL_EXPRESSION = eINSTANCE.getliteral_expression();

    /**
     * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_EXPRESSION__DECIMAL = eINSTANCE.getliteral_expression_Decimal();

    /**
     * The meta object literal for the '<em><b>Inteiro</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_EXPRESSION__INTEIRO = eINSTANCE.getliteral_expression_Inteiro();

    /**
     * The meta object literal for the '<em><b>Float</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_EXPRESSION__FLOAT = eINSTANCE.getliteral_expression_Float();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_EXPRESSION__STRING = eINSTANCE.getliteral_expression_String();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.logical_expressionImpl <em>logical expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.logical_expressionImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getlogical_expression()
     * @generated
     */
    EClass LOGICAL_EXPRESSION = eINSTANCE.getlogical_expression();

    /**
     * The meta object literal for the '<em><b>Operador</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGICAL_EXPRESSION__OPERADOR = eINSTANCE.getlogical_expression_Operador();

    /**
     * The meta object literal for the '<em><b>Expressao</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_EXPRESSION__EXPRESSAO = eINSTANCE.getlogical_expression_Expressao();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.bit_expressionImpl <em>bit expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.bit_expressionImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getbit_expression()
     * @generated
     */
    EClass BIT_EXPRESSION = eINSTANCE.getbit_expression();

    /**
     * The meta object literal for the '<em><b>Operador</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIT_EXPRESSION__OPERADOR = eINSTANCE.getbit_expression_Operador();

    /**
     * The meta object literal for the '<em><b>Expressao</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIT_EXPRESSION__EXPRESSAO = eINSTANCE.getbit_expression_Expressao();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.numeric_expressionImpl <em>numeric expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.numeric_expressionImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getnumeric_expression()
     * @generated
     */
    EClass NUMERIC_EXPRESSION = eINSTANCE.getnumeric_expression();

    /**
     * The meta object literal for the '<em><b>Operador</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_EXPRESSION__OPERADOR = eINSTANCE.getnumeric_expression_Operador();

    /**
     * The meta object literal for the '<em><b>Expressao</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMERIC_EXPRESSION__EXPRESSAO = eINSTANCE.getnumeric_expression_Expressao();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.arglistImpl <em>arglist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.arglistImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getarglist()
     * @generated
     */
    EClass ARGLIST = eINSTANCE.getarglist();

    /**
     * The meta object literal for the '<em><b>Expressoes Argumentos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGLIST__EXPRESSOES_ARGUMENTOS = eINSTANCE.getarglist_ExpressoesArgumentos();

    /**
     * The meta object literal for the '<em><b>Tipo Parametro</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGLIST__TIPO_PARAMETRO = eINSTANCE.getarglist_TipoParametro();

    /**
     * The meta object literal for the '<em><b>Nome Parametro</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGLIST__NOME_PARAMETRO = eINSTANCE.getarglist_NomeParametro();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.nameImpl <em>name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.nameImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getname()
     * @generated
     */
    EClass NAME = eINSTANCE.getname();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__NOME = eINSTANCE.getname_Nome();

    /**
     * The meta object literal for the '<em><b>Pacote</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME__PACOTE = eINSTANCE.getname_Pacote();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.package_name_auxImpl <em>package name aux</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.package_name_auxImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getpackage_name_aux()
     * @generated
     */
    EClass PACKAGE_NAME_AUX = eINSTANCE.getpackage_name_aux();

    /**
     * The meta object literal for the '<em><b>Nome Pacote</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_NAME_AUX__NOME_PACOTE = eINSTANCE.getpackage_name_aux_NomePacote();

    /**
     * The meta object literal for the '<em><b>Pacote</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_NAME_AUX__PACOTE = eINSTANCE.getpackage_name_aux_Pacote();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.type_specifierImpl <em>type specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.type_specifierImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#gettype_specifier()
     * @generated
     */
    EClass TYPE_SPECIFIER = eINSTANCE.gettype_specifier();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SPECIFIER__NOME = eINSTANCE.gettype_specifier_Nome();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.typeImpl <em>type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.typeImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#gettype()
     * @generated
     */
    EClass TYPE = eINSTANCE.gettype();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__TIPO = eINSTANCE.gettype_Tipo();

    /**
     * The meta object literal for the '{@link org.xtext.simpleJava.impl.MODIFIERImpl <em>MODIFIER</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simpleJava.impl.MODIFIERImpl
     * @see org.xtext.simpleJava.impl.SimpleJavaPackageImpl#getMODIFIER()
     * @generated
     */
    EClass MODIFIER = eINSTANCE.getMODIFIER();

    /**
     * The meta object literal for the '<em><b>Modificador</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__MODIFICADOR = eINSTANCE.getMODIFIER_Modificador();

  }

} //SimpleJavaPackage
