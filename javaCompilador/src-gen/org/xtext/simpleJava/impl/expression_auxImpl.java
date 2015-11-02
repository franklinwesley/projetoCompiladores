/**
 */
package org.xtext.simpleJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.simpleJava.SimpleJavaPackage;
import org.xtext.simpleJava.expression_aux;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression aux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.expression_auxImpl#getExpressoes <em>Expressoes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class expression_auxImpl extends MinimalEObjectImpl.Container implements expression_aux
{
  /**
   * The cached value of the '{@link #getExpressoes() <em>Expressoes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressoes()
   * @generated
   * @ordered
   */
  protected expression_aux expressoes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected expression_auxImpl()
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
    return SimpleJavaPackage.Literals.EXPRESSION_AUX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_aux getExpressoes()
  {
    return expressoes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressoes(expression_aux newExpressoes, NotificationChain msgs)
  {
    expression_aux oldExpressoes = expressoes;
    expressoes = newExpressoes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES, oldExpressoes, newExpressoes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressoes(expression_aux newExpressoes)
  {
    if (newExpressoes != expressoes)
    {
      NotificationChain msgs = null;
      if (expressoes != null)
        msgs = ((InternalEObject)expressoes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES, null, msgs);
      if (newExpressoes != null)
        msgs = ((InternalEObject)newExpressoes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES, null, msgs);
      msgs = basicSetExpressoes(newExpressoes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES, newExpressoes, newExpressoes));
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
      case SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES:
        return basicSetExpressoes(null, msgs);
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
      case SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES:
        return getExpressoes();
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
      case SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES:
        setExpressoes((expression_aux)newValue);
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
      case SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES:
        setExpressoes((expression_aux)null);
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
      case SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES:
        return expressoes != null;
    }
    return super.eIsSet(featureID);
  }

} //expression_auxImpl
