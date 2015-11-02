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
import org.xtext.simpleJava.statement_block;
import org.xtext.simpleJava.static_initializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>static initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.static_initializerImpl#getBlocoEstatico <em>Bloco Estatico</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class static_initializerImpl extends MinimalEObjectImpl.Container implements static_initializer
{
  /**
   * The cached value of the '{@link #getBlocoEstatico() <em>Bloco Estatico</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocoEstatico()
   * @generated
   * @ordered
   */
  protected statement_block blocoEstatico;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static_initializerImpl()
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
    return SimpleJavaPackage.Literals.STATIC_INITIALIZER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_block getBlocoEstatico()
  {
    return blocoEstatico;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocoEstatico(statement_block newBlocoEstatico, NotificationChain msgs)
  {
    statement_block oldBlocoEstatico = blocoEstatico;
    blocoEstatico = newBlocoEstatico;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATIC_INITIALIZER__BLOCO_ESTATICO, oldBlocoEstatico, newBlocoEstatico);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocoEstatico(statement_block newBlocoEstatico)
  {
    if (newBlocoEstatico != blocoEstatico)
    {
      NotificationChain msgs = null;
      if (blocoEstatico != null)
        msgs = ((InternalEObject)blocoEstatico).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATIC_INITIALIZER__BLOCO_ESTATICO, null, msgs);
      if (newBlocoEstatico != null)
        msgs = ((InternalEObject)newBlocoEstatico).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATIC_INITIALIZER__BLOCO_ESTATICO, null, msgs);
      msgs = basicSetBlocoEstatico(newBlocoEstatico, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATIC_INITIALIZER__BLOCO_ESTATICO, newBlocoEstatico, newBlocoEstatico));
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
      case SimpleJavaPackage.STATIC_INITIALIZER__BLOCO_ESTATICO:
        return basicSetBlocoEstatico(null, msgs);
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
      case SimpleJavaPackage.STATIC_INITIALIZER__BLOCO_ESTATICO:
        return getBlocoEstatico();
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
      case SimpleJavaPackage.STATIC_INITIALIZER__BLOCO_ESTATICO:
        setBlocoEstatico((statement_block)newValue);
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
      case SimpleJavaPackage.STATIC_INITIALIZER__BLOCO_ESTATICO:
        setBlocoEstatico((statement_block)null);
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
      case SimpleJavaPackage.STATIC_INITIALIZER__BLOCO_ESTATICO:
        return blocoEstatico != null;
    }
    return super.eIsSet(featureID);
  }

} //static_initializerImpl
