/**
 */
package org.xtext.simpleJava.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.simpleJava.SimpleJavaPackage;
import org.xtext.simpleJava.parameter;
import org.xtext.simpleJava.parameter_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>parameter list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.parameter_listImpl#getParametros <em>Parametros</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class parameter_listImpl extends MinimalEObjectImpl.Container implements parameter_list
{
  /**
   * The cached value of the '{@link #getParametros() <em>Parametros</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParametros()
   * @generated
   * @ordered
   */
  protected EList<parameter> parametros;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected parameter_listImpl()
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
    return SimpleJavaPackage.Literals.PARAMETER_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<parameter> getParametros()
  {
    if (parametros == null)
    {
      parametros = new EObjectContainmentEList<parameter>(parameter.class, this, SimpleJavaPackage.PARAMETER_LIST__PARAMETROS);
    }
    return parametros;
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
      case SimpleJavaPackage.PARAMETER_LIST__PARAMETROS:
        return ((InternalEList<?>)getParametros()).basicRemove(otherEnd, msgs);
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
      case SimpleJavaPackage.PARAMETER_LIST__PARAMETROS:
        return getParametros();
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
      case SimpleJavaPackage.PARAMETER_LIST__PARAMETROS:
        getParametros().clear();
        getParametros().addAll((Collection<? extends parameter>)newValue);
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
      case SimpleJavaPackage.PARAMETER_LIST__PARAMETROS:
        getParametros().clear();
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
      case SimpleJavaPackage.PARAMETER_LIST__PARAMETROS:
        return parametros != null && !parametros.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //parameter_listImpl
