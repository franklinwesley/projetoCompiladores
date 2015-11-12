/**
 */
package org.xtext.example.simpleJava.impl;

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

import org.xtext.example.simpleJava.SimpleJavaPackage;
import org.xtext.example.simpleJava.expression;
import org.xtext.example.simpleJava.statement;
import org.xtext.example.simpleJava.switch_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>switch statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.switch_statementImpl#getExpressaoSwitch <em>Expressao Switch</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.switch_statementImpl#getExpressaoCases <em>Expressao Cases</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.switch_statementImpl#getBlocoSwitch <em>Bloco Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class switch_statementImpl extends MinimalEObjectImpl.Container implements switch_statement
{
  /**
   * The cached value of the '{@link #getExpressaoSwitch() <em>Expressao Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressaoSwitch()
   * @generated
   * @ordered
   */
  protected expression expressaoSwitch;

  /**
   * The cached value of the '{@link #getExpressaoCases() <em>Expressao Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressaoCases()
   * @generated
   * @ordered
   */
  protected EList<expression> expressaoCases;

  /**
   * The cached value of the '{@link #getBlocoSwitch() <em>Bloco Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocoSwitch()
   * @generated
   * @ordered
   */
  protected statement blocoSwitch;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected switch_statementImpl()
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
    return SimpleJavaPackage.Literals.SWITCH_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpressaoSwitch()
  {
    return expressaoSwitch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressaoSwitch(expression newExpressaoSwitch, NotificationChain msgs)
  {
    expression oldExpressaoSwitch = expressaoSwitch;
    expressaoSwitch = newExpressaoSwitch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_SWITCH, oldExpressaoSwitch, newExpressaoSwitch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressaoSwitch(expression newExpressaoSwitch)
  {
    if (newExpressaoSwitch != expressaoSwitch)
    {
      NotificationChain msgs = null;
      if (expressaoSwitch != null)
        msgs = ((InternalEObject)expressaoSwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_SWITCH, null, msgs);
      if (newExpressaoSwitch != null)
        msgs = ((InternalEObject)newExpressaoSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_SWITCH, null, msgs);
      msgs = basicSetExpressaoSwitch(newExpressaoSwitch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_SWITCH, newExpressaoSwitch, newExpressaoSwitch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expression> getExpressaoCases()
  {
    if (expressaoCases == null)
    {
      expressaoCases = new EObjectContainmentEList<expression>(expression.class, this, SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_CASES);
    }
    return expressaoCases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getBlocoSwitch()
  {
    return blocoSwitch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocoSwitch(statement newBlocoSwitch, NotificationChain msgs)
  {
    statement oldBlocoSwitch = blocoSwitch;
    blocoSwitch = newBlocoSwitch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.SWITCH_STATEMENT__BLOCO_SWITCH, oldBlocoSwitch, newBlocoSwitch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocoSwitch(statement newBlocoSwitch)
  {
    if (newBlocoSwitch != blocoSwitch)
    {
      NotificationChain msgs = null;
      if (blocoSwitch != null)
        msgs = ((InternalEObject)blocoSwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.SWITCH_STATEMENT__BLOCO_SWITCH, null, msgs);
      if (newBlocoSwitch != null)
        msgs = ((InternalEObject)newBlocoSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.SWITCH_STATEMENT__BLOCO_SWITCH, null, msgs);
      msgs = basicSetBlocoSwitch(newBlocoSwitch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.SWITCH_STATEMENT__BLOCO_SWITCH, newBlocoSwitch, newBlocoSwitch));
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
      case SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_SWITCH:
        return basicSetExpressaoSwitch(null, msgs);
      case SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_CASES:
        return ((InternalEList<?>)getExpressaoCases()).basicRemove(otherEnd, msgs);
      case SimpleJavaPackage.SWITCH_STATEMENT__BLOCO_SWITCH:
        return basicSetBlocoSwitch(null, msgs);
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
      case SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_SWITCH:
        return getExpressaoSwitch();
      case SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_CASES:
        return getExpressaoCases();
      case SimpleJavaPackage.SWITCH_STATEMENT__BLOCO_SWITCH:
        return getBlocoSwitch();
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
      case SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_SWITCH:
        setExpressaoSwitch((expression)newValue);
        return;
      case SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_CASES:
        getExpressaoCases().clear();
        getExpressaoCases().addAll((Collection<? extends expression>)newValue);
        return;
      case SimpleJavaPackage.SWITCH_STATEMENT__BLOCO_SWITCH:
        setBlocoSwitch((statement)newValue);
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
      case SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_SWITCH:
        setExpressaoSwitch((expression)null);
        return;
      case SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_CASES:
        getExpressaoCases().clear();
        return;
      case SimpleJavaPackage.SWITCH_STATEMENT__BLOCO_SWITCH:
        setBlocoSwitch((statement)null);
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
      case SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_SWITCH:
        return expressaoSwitch != null;
      case SimpleJavaPackage.SWITCH_STATEMENT__EXPRESSAO_CASES:
        return expressaoCases != null && !expressaoCases.isEmpty();
      case SimpleJavaPackage.SWITCH_STATEMENT__BLOCO_SWITCH:
        return blocoSwitch != null;
    }
    return super.eIsSet(featureID);
  }

} //switch_statementImpl
