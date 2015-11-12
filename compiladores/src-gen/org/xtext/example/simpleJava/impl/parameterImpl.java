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
import org.xtext.example.simpleJava.parameter;
import org.xtext.example.simpleJava.type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.parameterImpl#getTipoParametro <em>Tipo Parametro</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.parameterImpl#getNomeParametro <em>Nome Parametro</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class parameterImpl extends MinimalEObjectImpl.Container implements parameter
{
  /**
   * The cached value of the '{@link #getTipoParametro() <em>Tipo Parametro</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoParametro()
   * @generated
   * @ordered
   */
  protected type tipoParametro;

  /**
   * The default value of the '{@link #getNomeParametro() <em>Nome Parametro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeParametro()
   * @generated
   * @ordered
   */
  protected static final String NOME_PARAMETRO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNomeParametro() <em>Nome Parametro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeParametro()
   * @generated
   * @ordered
   */
  protected String nomeParametro = NOME_PARAMETRO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected parameterImpl()
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
    return SimpleJavaPackage.Literals.PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type getTipoParametro()
  {
    return tipoParametro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipoParametro(type newTipoParametro, NotificationChain msgs)
  {
    type oldTipoParametro = tipoParametro;
    tipoParametro = newTipoParametro;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.PARAMETER__TIPO_PARAMETRO, oldTipoParametro, newTipoParametro);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipoParametro(type newTipoParametro)
  {
    if (newTipoParametro != tipoParametro)
    {
      NotificationChain msgs = null;
      if (tipoParametro != null)
        msgs = ((InternalEObject)tipoParametro).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.PARAMETER__TIPO_PARAMETRO, null, msgs);
      if (newTipoParametro != null)
        msgs = ((InternalEObject)newTipoParametro).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.PARAMETER__TIPO_PARAMETRO, null, msgs);
      msgs = basicSetTipoParametro(newTipoParametro, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.PARAMETER__TIPO_PARAMETRO, newTipoParametro, newTipoParametro));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNomeParametro()
  {
    return nomeParametro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNomeParametro(String newNomeParametro)
  {
    String oldNomeParametro = nomeParametro;
    nomeParametro = newNomeParametro;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.PARAMETER__NOME_PARAMETRO, oldNomeParametro, nomeParametro));
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
      case SimpleJavaPackage.PARAMETER__TIPO_PARAMETRO:
        return basicSetTipoParametro(null, msgs);
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
      case SimpleJavaPackage.PARAMETER__TIPO_PARAMETRO:
        return getTipoParametro();
      case SimpleJavaPackage.PARAMETER__NOME_PARAMETRO:
        return getNomeParametro();
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
      case SimpleJavaPackage.PARAMETER__TIPO_PARAMETRO:
        setTipoParametro((type)newValue);
        return;
      case SimpleJavaPackage.PARAMETER__NOME_PARAMETRO:
        setNomeParametro((String)newValue);
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
      case SimpleJavaPackage.PARAMETER__TIPO_PARAMETRO:
        setTipoParametro((type)null);
        return;
      case SimpleJavaPackage.PARAMETER__NOME_PARAMETRO:
        setNomeParametro(NOME_PARAMETRO_EDEFAULT);
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
      case SimpleJavaPackage.PARAMETER__TIPO_PARAMETRO:
        return tipoParametro != null;
      case SimpleJavaPackage.PARAMETER__NOME_PARAMETRO:
        return NOME_PARAMETRO_EDEFAULT == null ? nomeParametro != null : !NOME_PARAMETRO_EDEFAULT.equals(nomeParametro);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nomeParametro: ");
    result.append(nomeParametro);
    result.append(')');
    return result.toString();
  }

} //parameterImpl
