/**
 */
package org.xtext.example.simpleJava.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.simpleJava.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.simpleJava.SimpleJavaPackage
 * @generated
 */
public class SimpleJavaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SimpleJavaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleJavaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SimpleJavaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleJavaSwitch<Adapter> modelSwitch =
    new SimpleJavaSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casecompilation_unit(compilation_unit object)
      {
        return createcompilation_unitAdapter();
      }
      @Override
      public Adapter casepackage_statement(package_statement object)
      {
        return createpackage_statementAdapter();
      }
      @Override
      public Adapter caseimport_statement(import_statement object)
      {
        return createimport_statementAdapter();
      }
      @Override
      public Adapter casetype_declaration(type_declaration object)
      {
        return createtype_declarationAdapter();
      }
      @Override
      public Adapter casedoc_comment(doc_comment object)
      {
        return createdoc_commentAdapter();
      }
      @Override
      public Adapter caseclass_declaration(class_declaration object)
      {
        return createclass_declarationAdapter();
      }
      @Override
      public Adapter caseinterface_declaration(interface_declaration object)
      {
        return createinterface_declarationAdapter();
      }
      @Override
      public Adapter casefield_declaration(field_declaration object)
      {
        return createfield_declarationAdapter();
      }
      @Override
      public Adapter casemethod_declaration(method_declaration object)
      {
        return createmethod_declarationAdapter();
      }
      @Override
      public Adapter caseparameter(parameter object)
      {
        return createparameterAdapter();
      }
      @Override
      public Adapter caseparameter_list(parameter_list object)
      {
        return createparameter_listAdapter();
      }
      @Override
      public Adapter casestatement_block(statement_block object)
      {
        return createstatement_blockAdapter();
      }
      @Override
      public Adapter casestatement(statement object)
      {
        return createstatementAdapter();
      }
      @Override
      public Adapter casevariable_declaration(variable_declaration object)
      {
        return createvariable_declarationAdapter();
      }
      @Override
      public Adapter casevariable_declarator(variable_declarator object)
      {
        return createvariable_declaratorAdapter();
      }
      @Override
      public Adapter casevariable_initializer(variable_initializer object)
      {
        return createvariable_initializerAdapter();
      }
      @Override
      public Adapter caseif_statement(if_statement object)
      {
        return createif_statementAdapter();
      }
      @Override
      public Adapter casedo_statement(do_statement object)
      {
        return createdo_statementAdapter();
      }
      @Override
      public Adapter casewhile_statement(while_statement object)
      {
        return createwhile_statementAdapter();
      }
      @Override
      public Adapter casefor_statement(for_statement object)
      {
        return createfor_statementAdapter();
      }
      @Override
      public Adapter casetry_statement(try_statement object)
      {
        return createtry_statementAdapter();
      }
      @Override
      public Adapter caseswitch_statement(switch_statement object)
      {
        return createswitch_statementAdapter();
      }
      @Override
      public Adapter caseconstructor_declaration(constructor_declaration object)
      {
        return createconstructor_declarationAdapter();
      }
      @Override
      public Adapter casestatic_initializer(static_initializer object)
      {
        return createstatic_initializerAdapter();
      }
      @Override
      public Adapter casecreating_expression(creating_expression object)
      {
        return createcreating_expressionAdapter();
      }
      @Override
      public Adapter caseexp_aux(exp_aux object)
      {
        return createexp_auxAdapter();
      }
      @Override
      public Adapter caseexpression(expression object)
      {
        return createexpressionAdapter();
      }
      @Override
      public Adapter caseexpression_aux(expression_aux object)
      {
        return createexpression_auxAdapter();
      }
      @Override
      public Adapter casemais_aux(mais_aux object)
      {
        return createmais_auxAdapter();
      }
      @Override
      public Adapter casenewBlock(newBlock object)
      {
        return createnewBlockAdapter();
      }
      @Override
      public Adapter casecreating_aux(creating_aux object)
      {
        return createcreating_auxAdapter();
      }
      @Override
      public Adapter caseaux(aux object)
      {
        return createauxAdapter();
      }
      @Override
      public Adapter caseliteral_expression(literal_expression object)
      {
        return createliteral_expressionAdapter();
      }
      @Override
      public Adapter caselogical_expression(logical_expression object)
      {
        return createlogical_expressionAdapter();
      }
      @Override
      public Adapter casebit_expression(bit_expression object)
      {
        return createbit_expressionAdapter();
      }
      @Override
      public Adapter casenumeric_expression(numeric_expression object)
      {
        return createnumeric_expressionAdapter();
      }
      @Override
      public Adapter casearglist(arglist object)
      {
        return createarglistAdapter();
      }
      @Override
      public Adapter casename(name object)
      {
        return createnameAdapter();
      }
      @Override
      public Adapter casepackage_name_aux(package_name_aux object)
      {
        return createpackage_name_auxAdapter();
      }
      @Override
      public Adapter casetype_specifier(type_specifier object)
      {
        return createtype_specifierAdapter();
      }
      @Override
      public Adapter casetype(type object)
      {
        return createtypeAdapter();
      }
      @Override
      public Adapter caseMODIFIER(MODIFIER object)
      {
        return createMODIFIERAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.compilation_unit <em>compilation unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.compilation_unit
   * @generated
   */
  public Adapter createcompilation_unitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.package_statement <em>package statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.package_statement
   * @generated
   */
  public Adapter createpackage_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.import_statement <em>import statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.import_statement
   * @generated
   */
  public Adapter createimport_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.type_declaration <em>type declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.type_declaration
   * @generated
   */
  public Adapter createtype_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.doc_comment <em>doc comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.doc_comment
   * @generated
   */
  public Adapter createdoc_commentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.class_declaration <em>class declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.class_declaration
   * @generated
   */
  public Adapter createclass_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.interface_declaration <em>interface declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.interface_declaration
   * @generated
   */
  public Adapter createinterface_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.field_declaration <em>field declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.field_declaration
   * @generated
   */
  public Adapter createfield_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.method_declaration <em>method declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.method_declaration
   * @generated
   */
  public Adapter createmethod_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.parameter <em>parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.parameter
   * @generated
   */
  public Adapter createparameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.parameter_list <em>parameter list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.parameter_list
   * @generated
   */
  public Adapter createparameter_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.statement_block <em>statement block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.statement_block
   * @generated
   */
  public Adapter createstatement_blockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.statement
   * @generated
   */
  public Adapter createstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.variable_declaration <em>variable declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.variable_declaration
   * @generated
   */
  public Adapter createvariable_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.variable_declarator <em>variable declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.variable_declarator
   * @generated
   */
  public Adapter createvariable_declaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.variable_initializer <em>variable initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.variable_initializer
   * @generated
   */
  public Adapter createvariable_initializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.if_statement <em>if statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.if_statement
   * @generated
   */
  public Adapter createif_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.do_statement <em>do statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.do_statement
   * @generated
   */
  public Adapter createdo_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.while_statement <em>while statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.while_statement
   * @generated
   */
  public Adapter createwhile_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.for_statement <em>for statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.for_statement
   * @generated
   */
  public Adapter createfor_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.try_statement <em>try statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.try_statement
   * @generated
   */
  public Adapter createtry_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.switch_statement <em>switch statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.switch_statement
   * @generated
   */
  public Adapter createswitch_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.constructor_declaration <em>constructor declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.constructor_declaration
   * @generated
   */
  public Adapter createconstructor_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.static_initializer <em>static initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.static_initializer
   * @generated
   */
  public Adapter createstatic_initializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.creating_expression <em>creating expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.creating_expression
   * @generated
   */
  public Adapter createcreating_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.exp_aux <em>exp aux</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.exp_aux
   * @generated
   */
  public Adapter createexp_auxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.expression
   * @generated
   */
  public Adapter createexpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.expression_aux <em>expression aux</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.expression_aux
   * @generated
   */
  public Adapter createexpression_auxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.mais_aux <em>mais aux</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.mais_aux
   * @generated
   */
  public Adapter createmais_auxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.newBlock <em>new Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.newBlock
   * @generated
   */
  public Adapter createnewBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.creating_aux <em>creating aux</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.creating_aux
   * @generated
   */
  public Adapter createcreating_auxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.aux <em>aux</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.aux
   * @generated
   */
  public Adapter createauxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.literal_expression <em>literal expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.literal_expression
   * @generated
   */
  public Adapter createliteral_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.logical_expression <em>logical expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.logical_expression
   * @generated
   */
  public Adapter createlogical_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.bit_expression <em>bit expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.bit_expression
   * @generated
   */
  public Adapter createbit_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.numeric_expression <em>numeric expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.numeric_expression
   * @generated
   */
  public Adapter createnumeric_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.arglist <em>arglist</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.arglist
   * @generated
   */
  public Adapter createarglistAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.name <em>name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.name
   * @generated
   */
  public Adapter createnameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.package_name_aux <em>package name aux</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.package_name_aux
   * @generated
   */
  public Adapter createpackage_name_auxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.type_specifier <em>type specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.type_specifier
   * @generated
   */
  public Adapter createtype_specifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.type <em>type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.type
   * @generated
   */
  public Adapter createtypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.simpleJava.MODIFIER <em>MODIFIER</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.simpleJava.MODIFIER
   * @generated
   */
  public Adapter createMODIFIERAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SimpleJavaAdapterFactory
