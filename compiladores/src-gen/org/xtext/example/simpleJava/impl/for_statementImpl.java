/**
 */
package org.xtext.example.simpleJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.simpleJava.SimpleJavaPackage;
import org.xtext.example.simpleJava.expression;
import org.xtext.example.simpleJava.for_statement;
import org.xtext.example.simpleJava.statement;
import org.xtext.example.simpleJava.variable_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>for statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.for_statementImpl#getDeclaracaoVariavel <em>Declaracao Variavel</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.for_statementImpl#getExpressaoDeclaracao <em>Expressao Declaracao</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.for_statementImpl#getExpressaoFor <em>Expressao For</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.for_statementImpl#getExpressaoIncremento <em>Expressao Incremento</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.for_statementImpl#getBlocoFor <em>Bloco For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class for_statementImpl extends MinimalEObjectImpl.Container implements for_statement
{
  /**
   * The cached value of the '{@link #getDeclaracaoVariavel() <em>Declaracao Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaracaoVariavel()
   * @generated
   * @ordered
   */
  protected variable_declaration declaracaoVariavel;

  /**
   * The cached value of the '{@link #getExpressaoDeclaracao() <em>Expressao Declaracao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressaoDeclaracao()
   * @generated
   * @ordered
   */
  protected expression expressaoDeclaracao;

  /**
   * The cached value of the '{@link #getExpressaoFor() <em>Expressao For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressaoFor()
   * @generated
   * @ordered
   */
  protected expression expressaoFor;

  /**
   * The cached value of the '{@link #getExpressaoIncremento() <em>Expressao Incremento</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressaoIncremento()
   * @generated
   * @ordered
   */
  protected expression expressaoIncremento;

  /**
   * The cached value of the '{@link #getBlocoFor() <em>Bloco For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocoFor()
   * @generated
   * @ordered
   */
  protected statement blocoFor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected for_statementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimpleJavaPackage.Literals.FOR_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_declaration getDeclaracaoVariavel()
  {
    return declaracaoVariavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaracaoVariavel(variable_declaration newDeclaracaoVariavel, NotificationChain msgs)
  {
    variable_declaration oldDeclaracaoVariavel = declaracaoVariavel;
    declaracaoVariavel = newDeclaracaoVariavel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FOR_STATEMENT__DECLARACAO_VARIAVEL, oldDeclaracaoVariavel, newDeclaracaoVariavel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaracaoVariavel(variable_declaration newDeclaracaoVariavel)
  {
    if (newDeclaracaoVariavel != declaracaoVariavel)
    {
      NotificationChain msgs = null;
      if (declaracaoVariavel != null)
        msgs = ((InternalEObject)declaracaoVariavel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FOR_STATEMENT__DECLARACAO_VARIAVEL, null, msgs);
      if (newDeclaracaoVariavel != null)
        msgs = ((InternalEObject)newDeclaracaoVariavel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FOR_STATEMENT__DECLARACAO_VARIAVEL, null, msgs);
      msgs = basicSetDeclaracaoVariavel(newDeclaracaoVariavel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FOR_STATEMENT__DECLARACAO_VARIAVEL, newDeclaracaoVariavel, newDeclaracaoVariavel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpressaoDeclaracao()
  {
    return expressaoDeclaracao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressaoDeclaracao(expression newExpressaoDeclaracao, NotificationChain msgs)
  {
    expression oldExpressaoDeclaracao = expressaoDeclaracao;
    expressaoDeclaracao = newExpressaoDeclaracao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_DECLARACAO, oldExpressaoDeclaracao, newExpressaoDeclaracao);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressaoDeclaracao(expression newExpressaoDeclaracao)
  {
    if (newExpressaoDeclaracao != expressaoDeclaracao)
    {
      NotificationChain msgs = null;
      if (expressaoDeclaracao != null)
        msgs = ((InternalEObject)expressaoDeclaracao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_DECLARACAO, null, msgs);
      if (newExpressaoDeclaracao != null)
        msgs = ((InternalEObject)newExpressaoDeclaracao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_DECLARACAO, null, msgs);
      msgs = basicSetExpressaoDeclaracao(newExpressaoDeclaracao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_DECLARACAO, newExpressaoDeclaracao, newExpressaoDeclaracao));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpressaoFor()
  {
    return expressaoFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressaoFor(expression newExpressaoFor, NotificationChain msgs)
  {
    expression oldExpressaoFor = expressaoFor;
    expressaoFor = newExpressaoFor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_FOR, oldExpressaoFor, newExpressaoFor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressaoFor(expression newExpressaoFor)
  {
    if (newExpressaoFor != expressaoFor)
    {
      NotificationChain msgs = null;
      if (expressaoFor != null)
        msgs = ((InternalEObject)expressaoFor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_FOR, null, msgs);
      if (newExpressaoFor != null)
        msgs = ((InternalEObject)newExpressaoFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_FOR, null, msgs);
      msgs = basicSetExpressaoFor(newExpressaoFor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_FOR, newExpressaoFor, newExpressaoFor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpressaoIncremento()
  {
    return expressaoIncremento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressaoIncremento(expression newExpressaoIncremento, NotificationChain msgs)
  {
    expression oldExpressaoIncremento = expressaoIncremento;
    expressaoIncremento = newExpressaoIncremento;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_INCREMENTO, oldExpressaoIncremento, newExpressaoIncremento);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressaoIncremento(expression newExpressaoIncremento)
  {
    if (newExpressaoIncremento != expressaoIncremento)
    {
      NotificationChain msgs = null;
      if (expressaoIncremento != null)
        msgs = ((InternalEObject)expressaoIncremento).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_INCREMENTO, null, msgs);
      if (newExpressaoIncremento != null)
        msgs = ((InternalEObject)newExpressaoIncremento).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_INCREMENTO, null, msgs);
      msgs = basicSetExpressaoIncremento(newExpressaoIncremento, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_INCREMENTO, newExpressaoIncremento, newExpressaoIncremento));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getBlocoFor()
  {
    return blocoFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocoFor(statement newBlocoFor, NotificationChain msgs)
  {
    statement oldBlocoFor = blocoFor;
    blocoFor = newBlocoFor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FOR_STATEMENT__BLOCO_FOR, oldBlocoFor, newBlocoFor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocoFor(statement newBlocoFor)
  {
    if (newBlocoFor != blocoFor)
    {
      NotificationChain msgs = null;
      if (blocoFor != null)
        msgs = ((InternalEObject)blocoFor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FOR_STATEMENT__BLOCO_FOR, null, msgs);
      if (newBlocoFor != null)
        msgs = ((InternalEObject)newBlocoFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FOR_STATEMENT__BLOCO_FOR, null, msgs);
      msgs = basicSetBlocoFor(newBlocoFor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FOR_STATEMENT__BLOCO_FOR, newBlocoFor, newBlocoFor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimpleJavaPackage.FOR_STATEMENT__DECLARACAO_VARIAVEL:
        return basicSetDeclaracaoVariavel(null, msgs);
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_DECLARACAO:
        return basicSetExpressaoDeclaracao(null, msgs);
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_FOR:
        return basicSetExpressaoFor(null, msgs);
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_INCREMENTO:
        return basicSetExpressaoIncremento(null, msgs);
      case SimpleJavaPackage.FOR_STATEMENT__BLOCO_FOR:
        return basicSetBlocoFor(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimpleJavaPackage.FOR_STATEMENT__DECLARACAO_VARIAVEL:
        return getDeclaracaoVariavel();
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_DECLARACAO:
        return getExpressaoDeclaracao();
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_FOR:
        return getExpressaoFor();
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_INCREMENTO:
        return getExpressaoIncremento();
      case SimpleJavaPackage.FOR_STATEMENT__BLOCO_FOR:
        return getBlocoFor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimpleJavaPackage.FOR_STATEMENT__DECLARACAO_VARIAVEL:
        setDeclaracaoVariavel((variable_declaration)newValue);
        return;
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_DECLARACAO:
        setExpressaoDeclaracao((expression)newValue);
        return;
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_FOR:
        setExpressaoFor((expression)newValue);
        return;
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_INCREMENTO:
        setExpressaoIncremento((expression)newValue);
        return;
      case SimpleJavaPackage.FOR_STATEMENT__BLOCO_FOR:
        setBlocoFor((statement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimpleJavaPackage.FOR_STATEMENT__DECLARACAO_VARIAVEL:
        setDeclaracaoVariavel((variable_declaration)null);
        return;
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_DECLARACAO:
        setExpressaoDeclaracao((expression)null);
        return;
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_FOR:
        setExpressaoFor((expression)null);
        return;
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_INCREMENTO:
        setExpressaoIncremento((expression)null);
        return;
      case SimpleJavaPackage.FOR_STATEMENT__BLOCO_FOR:
        setBlocoFor((statement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimpleJavaPackage.FOR_STATEMENT__DECLARACAO_VARIAVEL:
        return declaracaoVariavel != null;
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_DECLARACAO:
        return expressaoDeclaracao != null;
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_FOR:
        return expressaoFor != null;
      case SimpleJavaPackage.FOR_STATEMENT__EXPRESSAO_INCREMENTO:
        return expressaoIncremento != null;
      case SimpleJavaPackage.FOR_STATEMENT__BLOCO_FOR:
        return blocoFor != null;
    }
    return super.eIsSet(featureID);
  }

} //for_statementImpl
