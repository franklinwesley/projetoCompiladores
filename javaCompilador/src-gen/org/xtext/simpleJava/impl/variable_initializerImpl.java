/**
 */
package org.xtext.simpleJava.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.simpleJava.SimpleJavaPackage;
import org.xtext.simpleJava.expression;
import org.xtext.simpleJava.variable_initializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.variable_initializerImpl#getExpressaoVariavel <em>Expressao Variavel</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.variable_initializerImpl#getValorVariaveis <em>Valor Variaveis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class variable_initializerImpl extends MinimalEObjectImpl.Container implements variable_initializer
{
  /**
   * The cached value of the '{@link #getExpressaoVariavel() <em>Expressao Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressaoVariavel()
   * @generated
   * @ordered
   */
  protected expression expressaoVariavel;

  /**
   * The cached value of the '{@link #getValorVariaveis() <em>Valor Variaveis</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorVariaveis()
   * @generated
   * @ordered
   */
  protected EList<variable_initializer> valorVariaveis;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variable_initializerImpl()
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
    return SimpleJavaPackage.Literals.VARIABLE_INITIALIZER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpressaoVariavel()
  {
    return expressaoVariavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressaoVariavel(expression newExpressaoVariavel, NotificationChain msgs)
  {
    expression oldExpressaoVariavel = expressaoVariavel;
    expressaoVariavel = newExpressaoVariavel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.VARIABLE_INITIALIZER__EXPRESSAO_VARIAVEL, oldExpressaoVariavel, newExpressaoVariavel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressaoVariavel(expression newExpressaoVariavel)
  {
    if (newExpressaoVariavel != expressaoVariavel)
    {
      NotificationChain msgs = null;
      if (expressaoVariavel != null)
        msgs = ((InternalEObject)expressaoVariavel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.VARIABLE_INITIALIZER__EXPRESSAO_VARIAVEL, null, msgs);
      if (newExpressaoVariavel != null)
        msgs = ((InternalEObject)newExpressaoVariavel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.VARIABLE_INITIALIZER__EXPRESSAO_VARIAVEL, null, msgs);
      msgs = basicSetExpressaoVariavel(newExpressaoVariavel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.VARIABLE_INITIALIZER__EXPRESSAO_VARIAVEL, newExpressaoVariavel, newExpressaoVariavel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variable_initializer> getValorVariaveis()
  {
    if (valorVariaveis == null)
    {
      valorVariaveis = new EObjectContainmentEList<variable_initializer>(variable_initializer.class, this, SimpleJavaPackage.VARIABLE_INITIALIZER__VALOR_VARIAVEIS);
    }
    return valorVariaveis;
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
      case SimpleJavaPackage.VARIABLE_INITIALIZER__EXPRESSAO_VARIAVEL:
        return basicSetExpressaoVariavel(null, msgs);
      case SimpleJavaPackage.VARIABLE_INITIALIZER__VALOR_VARIAVEIS:
        return ((InternalEList<?>)getValorVariaveis()).basicRemove(otherEnd, msgs);
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
      case SimpleJavaPackage.VARIABLE_INITIALIZER__EXPRESSAO_VARIAVEL:
        return getExpressaoVariavel();
      case SimpleJavaPackage.VARIABLE_INITIALIZER__VALOR_VARIAVEIS:
        return getValorVariaveis();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimpleJavaPackage.VARIABLE_INITIALIZER__EXPRESSAO_VARIAVEL:
        setExpressaoVariavel((expression)newValue);
        return;
      case SimpleJavaPackage.VARIABLE_INITIALIZER__VALOR_VARIAVEIS:
        getValorVariaveis().clear();
        getValorVariaveis().addAll((Collection<? extends variable_initializer>)newValue);
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
      case SimpleJavaPackage.VARIABLE_INITIALIZER__EXPRESSAO_VARIAVEL:
        setExpressaoVariavel((expression)null);
        return;
      case SimpleJavaPackage.VARIABLE_INITIALIZER__VALOR_VARIAVEIS:
        getValorVariaveis().clear();
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
      case SimpleJavaPackage.VARIABLE_INITIALIZER__EXPRESSAO_VARIAVEL:
        return expressaoVariavel != null;
      case SimpleJavaPackage.VARIABLE_INITIALIZER__VALOR_VARIAVEIS:
        return valorVariaveis != null && !valorVariaveis.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //variable_initializerImpl
