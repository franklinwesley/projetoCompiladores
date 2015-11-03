/**
 */
package org.xtext.simpleJava.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.simpleJava.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.simpleJava.SimpleJavaPackage
 * @generated
 */
public class SimpleJavaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SimpleJavaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleJavaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SimpleJavaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SimpleJavaPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.COMPILATION_UNIT:
      {
        compilation_unit compilation_unit = (compilation_unit)theEObject;
        T result = casecompilation_unit(compilation_unit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.PACKAGE_STATEMENT:
      {
        package_statement package_statement = (package_statement)theEObject;
        T result = casepackage_statement(package_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.IMPORT_STATEMENT:
      {
        import_statement import_statement = (import_statement)theEObject;
        T result = caseimport_statement(import_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.TYPE_DECLARATION:
      {
        type_declaration type_declaration = (type_declaration)theEObject;
        T result = casetype_declaration(type_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.CLASS_DECLARATION:
      {
        class_declaration class_declaration = (class_declaration)theEObject;
        T result = caseclass_declaration(class_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.INTERFACE_DECLARATION:
      {
        interface_declaration interface_declaration = (interface_declaration)theEObject;
        T result = caseinterface_declaration(interface_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.FIELD_DECLARATION:
      {
        field_declaration field_declaration = (field_declaration)theEObject;
        T result = casefield_declaration(field_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.METHOD_DECLARATION:
      {
        method_declaration method_declaration = (method_declaration)theEObject;
        T result = casemethod_declaration(method_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.PARAMETER:
      {
        parameter parameter = (parameter)theEObject;
        T result = caseparameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.PARAMETER_LIST:
      {
        parameter_list parameter_list = (parameter_list)theEObject;
        T result = caseparameter_list(parameter_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.STATEMENT_BLOCK:
      {
        statement_block statement_block = (statement_block)theEObject;
        T result = casestatement_block(statement_block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.STATEMENT:
      {
        statement statement = (statement)theEObject;
        T result = casestatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.VARIABLE_DECLARATION:
      {
        variable_declaration variable_declaration = (variable_declaration)theEObject;
        T result = casevariable_declaration(variable_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.VARIABLE_DECLARATOR:
      {
        variable_declarator variable_declarator = (variable_declarator)theEObject;
        T result = casevariable_declarator(variable_declarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.VARIABLE_INITIALIZER:
      {
        variable_initializer variable_initializer = (variable_initializer)theEObject;
        T result = casevariable_initializer(variable_initializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.IF_STATEMENT:
      {
        if_statement if_statement = (if_statement)theEObject;
        T result = caseif_statement(if_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.DO_STATEMENT:
      {
        do_statement do_statement = (do_statement)theEObject;
        T result = casedo_statement(do_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.WHILE_STATEMENT:
      {
        while_statement while_statement = (while_statement)theEObject;
        T result = casewhile_statement(while_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.FOR_STATEMENT:
      {
        for_statement for_statement = (for_statement)theEObject;
        T result = casefor_statement(for_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.TRY_STATEMENT:
      {
        try_statement try_statement = (try_statement)theEObject;
        T result = casetry_statement(try_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.SWITCH_STATEMENT:
      {
        switch_statement switch_statement = (switch_statement)theEObject;
        T result = caseswitch_statement(switch_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION:
      {
        constructor_declaration constructor_declaration = (constructor_declaration)theEObject;
        T result = caseconstructor_declaration(constructor_declaration);
        if (result == null) result = casenew(constructor_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.STATIC_INITIALIZER:
      {
        static_initializer static_initializer = (static_initializer)theEObject;
        T result = casestatic_initializer(static_initializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.CREATING_EXPRESSION:
      {
        creating_expression creating_expression = (creating_expression)theEObject;
        T result = casecreating_expression(creating_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.EXP_AUX:
      {
        exp_aux exp_aux = (exp_aux)theEObject;
        T result = caseexp_aux(exp_aux);
        if (result == null) result = caseexpression(exp_aux);
        if (result == null) result = caseexpression_aux(exp_aux);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.EXPRESSION:
      {
        expression expression = (expression)theEObject;
        T result = caseexpression(expression);
        if (result == null) result = caseexpression_aux(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.EXPRESSION_AUX:
      {
        expression_aux expression_aux = (expression_aux)theEObject;
        T result = caseexpression_aux(expression_aux);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.MAIS_AUX:
      {
        mais_aux mais_aux = (mais_aux)theEObject;
        T result = casemais_aux(mais_aux);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.NEW:
      {
        new new_ = (new)theEObject;
        T result = casenew(new_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.CREATING_AUX:
      {
        creating_aux creating_aux = (creating_aux)theEObject;
        T result = casecreating_aux(creating_aux);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.AUX:
      {
        aux aux = (aux)theEObject;
        T result = caseaux(aux);
        if (result == null) result = caseexpression_aux(aux);
        if (result == null) result = casecreating_aux(aux);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.LITERAL_EXPRESSION:
      {
        literal_expression literal_expression = (literal_expression)theEObject;
        T result = caseliteral_expression(literal_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.LOGICAL_EXPRESSION:
      {
        logical_expression logical_expression = (logical_expression)theEObject;
        T result = caselogical_expression(logical_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.BIT_EXPRESSION:
      {
        bit_expression bit_expression = (bit_expression)theEObject;
        T result = casebit_expression(bit_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.NUMERIC_EXPRESSION:
      {
        numeric_expression numeric_expression = (numeric_expression)theEObject;
        T result = casenumeric_expression(numeric_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.ARGLIST:
      {
        arglist arglist = (arglist)theEObject;
        T result = casearglist(arglist);
        if (result == null) result = casevariable_declarator(arglist);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.NAME:
      {
        name name = (name)theEObject;
        T result = casename(name);
        if (result == null) result = caseexpression_aux(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.PACKAGE_NAME_AUX:
      {
        package_name_aux package_name_aux = (package_name_aux)theEObject;
        T result = casepackage_name_aux(package_name_aux);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.TYPE_SPECIFIER:
      {
        type_specifier type_specifier = (type_specifier)theEObject;
        T result = casetype_specifier(type_specifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.TYPE:
      {
        type type = (type)theEObject;
        T result = casetype(type);
        if (result == null) result = caseexp_aux(type);
        if (result == null) result = caseexpression(type);
        if (result == null) result = caseexpression_aux(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleJavaPackage.MODIFIER:
      {
        MODIFIER modifier = (MODIFIER)theEObject;
        T result = caseMODIFIER(modifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>compilation unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>compilation unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecompilation_unit(compilation_unit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>package statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>package statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepackage_statement(package_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>import statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>import statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseimport_statement(import_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetype_declaration(type_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>class declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>class declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseclass_declaration(class_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>interface declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>interface declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinterface_declaration(interface_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>field declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>field declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefield_declaration(field_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>method declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>method declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemethod_declaration(method_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparameter(parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parameter list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parameter list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparameter_list(parameter_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>statement block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>statement block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatement_block(statement_block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatement(statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variable declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variable declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariable_declaration(variable_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variable declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variable declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariable_declarator(variable_declarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variable initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variable initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariable_initializer(variable_initializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>if statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>if statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseif_statement(if_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>do statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>do statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedo_statement(do_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>while statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>while statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casewhile_statement(while_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>for statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>for statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefor_statement(for_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>try statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>try statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetry_statement(try_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>switch statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>switch statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseswitch_statement(switch_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constructor declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constructor declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstructor_declaration(constructor_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>static initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>static initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatic_initializer(static_initializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>creating expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>creating expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecreating_expression(creating_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>exp aux</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>exp aux</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexp_aux(exp_aux object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpression(expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expression aux</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression aux</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpression_aux(expression_aux object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>mais aux</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>mais aux</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemais_aux(mais_aux object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>new</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>new</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenew(new object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>creating aux</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>creating aux</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecreating_aux(creating_aux object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>aux</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>aux</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaux(aux object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>literal expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>literal expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseliteral_expression(literal_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>logical expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>logical expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogical_expression(logical_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bit expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bit expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebit_expression(bit_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>numeric expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>numeric expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenumeric_expression(numeric_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>arglist</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>arglist</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casearglist(arglist object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casename(name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>package name aux</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>package name aux</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepackage_name_aux(package_name_aux object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetype_specifier(type_specifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetype(type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MODIFIER</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MODIFIER</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMODIFIER(MODIFIER object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SimpleJavaSwitch
