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
import org.xtext.example.simpleJava.statement;
import org.xtext.example.simpleJava.while_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>while statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.while_statementImpl#getExpressaoWhile <em>Expressao While</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.while_statementImpl#getBlocoWhile <em>Bloco While</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class while_statementImpl extends MinimalEObjectImpl.Container implements while_statement
{
  /**
   * The cached value of the '{@link #getExpressaoWhile() <em>Expressao While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressaoWhile()
   * @generated
   * @ordered
   */
  protected expression expressaoWhile;

  /**
   * The cached value of the '{@link #getBlocoWhile() <em>Bloco While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocoWhile()
   * @generated
   * @ordered
   */
  protected statement blocoWhile;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected while_statementImpl()
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
    return SimpleJavaPackage.Literals.WHILE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpressaoWhile()
  {
    return expressaoWhile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressaoWhile(expression newExpressaoWhile, NotificationChain msgs)
  {
    expression oldExpressaoWhile = expressaoWhile;
    expressaoWhile = newExpressaoWhile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.WHILE_STATEMENT__EXPRESSAO_WHILE, oldExpressaoWhile, newExpressaoWhile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressaoWhile(expression newExpressaoWhile)
  {
    if (newExpressaoWhile != expressaoWhile)
    {
      NotificationChain msgs = null;
      if (expressaoWhile != null)
        msgs = ((InternalEObject)expressaoWhile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.WHILE_STATEMENT__EXPRESSAO_WHILE, null, msgs);
      if (newExpressaoWhile != null)
        msgs = ((InternalEObject)newExpressaoWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.WHILE_STATEMENT__EXPRESSAO_WHILE, null, msgs);
      msgs = basicSetExpressaoWhile(newExpressaoWhile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.WHILE_STATEMENT__EXPRESSAO_WHILE, newExpressaoWhile, newExpressaoWhile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getBlocoWhile()
  {
    return blocoWhile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocoWhile(statement newBlocoWhile, NotificationChain msgs)
  {
    statement oldBlocoWhile = blocoWhile;
    blocoWhile = newBlocoWhile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.WHILE_STATEMENT__BLOCO_WHILE, oldBlocoWhile, newBlocoWhile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocoWhile(statement newBlocoWhile)
  {
    if (newBlocoWhile != blocoWhile)
    {
      NotificationChain msgs = null;
      if (blocoWhile != null)
        msgs = ((InternalEObject)blocoWhile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.WHILE_STATEMENT__BLOCO_WHILE, null, msgs);
      if (newBlocoWhile != null)
        msgs = ((InternalEObject)newBlocoWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.WHILE_STATEMENT__BLOCO_WHILE, null, msgs);
      msgs = basicSetBlocoWhile(newBlocoWhile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.WHILE_STATEMENT__BLOCO_WHILE, newBlocoWhile, newBlocoWhile));
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
      case SimpleJavaPackage.WHILE_STATEMENT__EXPRESSAO_WHILE:
        return basicSetExpressaoWhile(null, msgs);
      case SimpleJavaPackage.WHILE_STATEMENT__BLOCO_WHILE:
        return basicSetBlocoWhile(null, msgs);
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
      case SimpleJavaPackage.WHILE_STATEMENT__EXPRESSAO_WHILE:
        return getExpressaoWhile();
      case SimpleJavaPackage.WHILE_STATEMENT__BLOCO_WHILE:
        return getBlocoWhile();
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
      case SimpleJavaPackage.WHILE_STATEMENT__EXPRESSAO_WHILE:
        setExpressaoWhile((expression)newValue);
        return;
      case SimpleJavaPackage.WHILE_STATEMENT__BLOCO_WHILE:
        setBlocoWhile((statement)newValue);
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
      case SimpleJavaPackage.WHILE_STATEMENT__EXPRESSAO_WHILE:
        setExpressaoWhile((expression)null);
        return;
      case SimpleJavaPackage.WHILE_STATEMENT__BLOCO_WHILE:
        setBlocoWhile((statement)null);
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
      case SimpleJavaPackage.WHILE_STATEMENT__EXPRESSAO_WHILE:
        return expressaoWhile != null;
      case SimpleJavaPackage.WHILE_STATEMENT__BLOCO_WHILE:
        return blocoWhile != null;
    }
    return super.eIsSet(featureID);
  }

} //while_statementImpl
