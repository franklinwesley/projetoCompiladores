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
import org.xtext.simpleJava.arglist;
import org.xtext.simpleJava.creating_aux;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>creating aux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.creating_auxImpl#getArgumentos <em>Argumentos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class creating_auxImpl extends MinimalEObjectImpl.Container implements creating_aux
{
  /**
   * The cached value of the '{@link #getArgumentos() <em>Argumentos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgumentos()
   * @generated
   * @ordered
   */
  protected arglist argumentos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected creating_auxImpl()
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
    return SimpleJavaPackage.Literals.CREATING_AUX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arglist getArgumentos()
  {
    return argumentos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgumentos(arglist newArgumentos, NotificationChain msgs)
  {
    arglist oldArgumentos = argumentos;
    argumentos = newArgumentos;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CREATING_AUX__ARGUMENTOS, oldArgumentos, newArgumentos);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgumentos(arglist newArgumentos)
  {
    if (newArgumentos != argumentos)
    {
      NotificationChain msgs = null;
      if (argumentos != null)
        msgs = ((InternalEObject)argumentos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CREATING_AUX__ARGUMENTOS, null, msgs);
      if (newArgumentos != null)
        msgs = ((InternalEObject)newArgumentos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CREATING_AUX__ARGUMENTOS, null, msgs);
      msgs = basicSetArgumentos(newArgumentos, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CREATING_AUX__ARGUMENTOS, newArgumentos, newArgumentos));
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
      case SimpleJavaPackage.CREATING_AUX__ARGUMENTOS:
        return basicSetArgumentos(null, msgs);
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
      case SimpleJavaPackage.CREATING_AUX__ARGUMENTOS:
        return getArgumentos();
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
      case SimpleJavaPackage.CREATING_AUX__ARGUMENTOS:
        setArgumentos((arglist)newValue);
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
      case SimpleJavaPackage.CREATING_AUX__ARGUMENTOS:
        setArgumentos((arglist)null);
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
      case SimpleJavaPackage.CREATING_AUX__ARGUMENTOS:
        return argumentos != null;
    }
    return super.eIsSet(featureID);
  }

} //creating_auxImpl
