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
import org.xtext.example.simpleJava.do_statement;
import org.xtext.example.simpleJava.expression;
import org.xtext.example.simpleJava.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>do statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.do_statementImpl#getBlocoDo <em>Bloco Do</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.do_statementImpl#getExpressaoWhile <em>Expressao While</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class do_statementImpl extends MinimalEObjectImpl.Container implements do_statement
{
  /**
   * The cached value of the '{@link #getBlocoDo() <em>Bloco Do</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocoDo()
   * @generated
   * @ordered
   */
  protected statement blocoDo;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected do_statementImpl()
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
    return SimpleJavaPackage.Literals.DO_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getBlocoDo()
  {
    return blocoDo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocoDo(statement newBlocoDo, NotificationChain msgs)
  {
    statement oldBlocoDo = blocoDo;
    blocoDo = newBlocoDo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.DO_STATEMENT__BLOCO_DO, oldBlocoDo, newBlocoDo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocoDo(statement newBlocoDo)
  {
    if (newBlocoDo != blocoDo)
    {
      NotificationChain msgs = null;
      if (blocoDo != null)
        msgs = ((InternalEObject)blocoDo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.DO_STATEMENT__BLOCO_DO, null, msgs);
      if (newBlocoDo != null)
        msgs = ((InternalEObject)newBlocoDo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.DO_STATEMENT__BLOCO_DO, null, msgs);
      msgs = basicSetBlocoDo(newBlocoDo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.DO_STATEMENT__BLOCO_DO, newBlocoDo, newBlocoDo));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.DO_STATEMENT__EXPRESSAO_WHILE, oldExpressaoWhile, newExpressaoWhile);
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
        msgs = ((InternalEObject)expressaoWhile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.DO_STATEMENT__EXPRESSAO_WHILE, null, msgs);
      if (newExpressaoWhile != null)
        msgs = ((InternalEObject)newExpressaoWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.DO_STATEMENT__EXPRESSAO_WHILE, null, msgs);
      msgs = basicSetExpressaoWhile(newExpressaoWhile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.DO_STATEMENT__EXPRESSAO_WHILE, newExpressaoWhile, newExpressaoWhile));
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
      case SimpleJavaPackage.DO_STATEMENT__BLOCO_DO:
        return basicSetBlocoDo(null, msgs);
      case SimpleJavaPackage.DO_STATEMENT__EXPRESSAO_WHILE:
        return basicSetExpressaoWhile(null, msgs);
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
      case SimpleJavaPackage.DO_STATEMENT__BLOCO_DO:
        return getBlocoDo();
      case SimpleJavaPackage.DO_STATEMENT__EXPRESSAO_WHILE:
        return getExpressaoWhile();
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
      case SimpleJavaPackage.DO_STATEMENT__BLOCO_DO:
        setBlocoDo((statement)newValue);
        return;
      case SimpleJavaPackage.DO_STATEMENT__EXPRESSAO_WHILE:
        setExpressaoWhile((expression)newValue);
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
      case SimpleJavaPackage.DO_STATEMENT__BLOCO_DO:
        setBlocoDo((statement)null);
        return;
      case SimpleJavaPackage.DO_STATEMENT__EXPRESSAO_WHILE:
        setExpressaoWhile((expression)null);
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
      case SimpleJavaPackage.DO_STATEMENT__BLOCO_DO:
        return blocoDo != null;
      case SimpleJavaPackage.DO_STATEMENT__EXPRESSAO_WHILE:
        return expressaoWhile != null;
    }
    return super.eIsSet(featureID);
  }

} //do_statementImpl
