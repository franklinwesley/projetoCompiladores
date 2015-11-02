/**
 */
package org.xtext.simpleJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.simpleJava.SimpleJavaPackage;
import org.xtext.simpleJava.arglist;
import org.xtext.simpleJava.aux;
import org.xtext.simpleJava.creating_aux;
import org.xtext.simpleJava.expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>aux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.auxImpl#getArgumentos <em>Argumentos</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.auxImpl#getEspressao <em>Espressao</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class auxImpl extends expression_auxImpl implements aux
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
   * The cached value of the '{@link #getEspressao() <em>Espressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEspressao()
   * @generated
   * @ordered
   */
  protected expression espressao;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected auxImpl()
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
    return SimpleJavaPackage.Literals.AUX;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.AUX__ARGUMENTOS, oldArgumentos, newArgumentos);
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
        msgs = ((InternalEObject)argumentos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.AUX__ARGUMENTOS, null, msgs);
      if (newArgumentos != null)
        msgs = ((InternalEObject)newArgumentos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.AUX__ARGUMENTOS, null, msgs);
      msgs = basicSetArgumentos(newArgumentos, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.AUX__ARGUMENTOS, newArgumentos, newArgumentos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getEspressao()
  {
    return espressao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEspressao(expression newEspressao, NotificationChain msgs)
  {
    expression oldEspressao = espressao;
    espressao = newEspressao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.AUX__ESPRESSAO, oldEspressao, newEspressao);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEspressao(expression newEspressao)
  {
    if (newEspressao != espressao)
    {
      NotificationChain msgs = null;
      if (espressao != null)
        msgs = ((InternalEObject)espressao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.AUX__ESPRESSAO, null, msgs);
      if (newEspressao != null)
        msgs = ((InternalEObject)newEspressao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.AUX__ESPRESSAO, null, msgs);
      msgs = basicSetEspressao(newEspressao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.AUX__ESPRESSAO, newEspressao, newEspressao));
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
      case SimpleJavaPackage.AUX__ARGUMENTOS:
        return basicSetArgumentos(null, msgs);
      case SimpleJavaPackage.AUX__ESPRESSAO:
        return basicSetEspressao(null, msgs);
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
      case SimpleJavaPackage.AUX__ARGUMENTOS:
        return getArgumentos();
      case SimpleJavaPackage.AUX__ESPRESSAO:
        return getEspressao();
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
      case SimpleJavaPackage.AUX__ARGUMENTOS:
        setArgumentos((arglist)newValue);
        return;
      case SimpleJavaPackage.AUX__ESPRESSAO:
        setEspressao((expression)newValue);
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
      case SimpleJavaPackage.AUX__ARGUMENTOS:
        setArgumentos((arglist)null);
        return;
      case SimpleJavaPackage.AUX__ESPRESSAO:
        setEspressao((expression)null);
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
      case SimpleJavaPackage.AUX__ARGUMENTOS:
        return argumentos != null;
      case SimpleJavaPackage.AUX__ESPRESSAO:
        return espressao != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == creating_aux.class)
    {
      switch (derivedFeatureID)
      {
        case SimpleJavaPackage.AUX__ARGUMENTOS: return SimpleJavaPackage.CREATING_AUX__ARGUMENTOS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == creating_aux.class)
    {
      switch (baseFeatureID)
      {
        case SimpleJavaPackage.CREATING_AUX__ARGUMENTOS: return SimpleJavaPackage.AUX__ARGUMENTOS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //auxImpl
