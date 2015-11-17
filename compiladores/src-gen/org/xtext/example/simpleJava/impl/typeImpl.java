/**
 */
package org.xtext.example.simpleJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.simpleJava.SimpleJavaPackage;
import org.xtext.example.simpleJava.name;
import org.xtext.example.simpleJava.type;
import org.xtext.example.simpleJava.type_specifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.typeImpl#getPrimitivo <em>Primitivo</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.typeImpl#getObjeto <em>Objeto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class typeImpl extends exp_auxImpl implements type
{
  /**
   * The cached value of the '{@link #getPrimitivo() <em>Primitivo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitivo()
   * @generated
   * @ordered
   */
  protected type_specifier primitivo;

  /**
   * The cached value of the '{@link #getObjeto() <em>Objeto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjeto()
   * @generated
   * @ordered
   */
  protected name objeto;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected typeImpl()
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
    return SimpleJavaPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_specifier getPrimitivo()
  {
    return primitivo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimitivo(type_specifier newPrimitivo, NotificationChain msgs)
  {
    type_specifier oldPrimitivo = primitivo;
    primitivo = newPrimitivo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TYPE__PRIMITIVO, oldPrimitivo, newPrimitivo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimitivo(type_specifier newPrimitivo)
  {
    if (newPrimitivo != primitivo)
    {
      NotificationChain msgs = null;
      if (primitivo != null)
        msgs = ((InternalEObject)primitivo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TYPE__PRIMITIVO, null, msgs);
      if (newPrimitivo != null)
        msgs = ((InternalEObject)newPrimitivo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TYPE__PRIMITIVO, null, msgs);
      msgs = basicSetPrimitivo(newPrimitivo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TYPE__PRIMITIVO, newPrimitivo, newPrimitivo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public name getObjeto()
  {
    return objeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjeto(name newObjeto, NotificationChain msgs)
  {
    name oldObjeto = objeto;
    objeto = newObjeto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TYPE__OBJETO, oldObjeto, newObjeto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjeto(name newObjeto)
  {
    if (newObjeto != objeto)
    {
      NotificationChain msgs = null;
      if (objeto != null)
        msgs = ((InternalEObject)objeto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TYPE__OBJETO, null, msgs);
      if (newObjeto != null)
        msgs = ((InternalEObject)newObjeto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TYPE__OBJETO, null, msgs);
      msgs = basicSetObjeto(newObjeto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TYPE__OBJETO, newObjeto, newObjeto));
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
      case SimpleJavaPackage.TYPE__PRIMITIVO:
        return basicSetPrimitivo(null, msgs);
      case SimpleJavaPackage.TYPE__OBJETO:
        return basicSetObjeto(null, msgs);
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
      case SimpleJavaPackage.TYPE__PRIMITIVO:
        return getPrimitivo();
      case SimpleJavaPackage.TYPE__OBJETO:
        return getObjeto();
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
      case SimpleJavaPackage.TYPE__PRIMITIVO:
        setPrimitivo((type_specifier)newValue);
        return;
      case SimpleJavaPackage.TYPE__OBJETO:
        setObjeto((name)newValue);
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
      case SimpleJavaPackage.TYPE__PRIMITIVO:
        setPrimitivo((type_specifier)null);
        return;
      case SimpleJavaPackage.TYPE__OBJETO:
        setObjeto((name)null);
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
      case SimpleJavaPackage.TYPE__PRIMITIVO:
        return primitivo != null;
      case SimpleJavaPackage.TYPE__OBJETO:
        return objeto != null;
    }
    return super.eIsSet(featureID);
  }

} //typeImpl
