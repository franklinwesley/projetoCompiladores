/**
 */
package org.xtext.simpleJava.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.simpleJava.SimpleJavaPackage;
import org.xtext.simpleJava.type_specifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.type_specifierImpl#getNomeTipo <em>Nome Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class type_specifierImpl extends MinimalEObjectImpl.Container implements type_specifier
{
  /**
   * The default value of the '{@link #getNomeTipo() <em>Nome Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeTipo()
   * @generated
   * @ordered
   */
  protected static final String NOME_TIPO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNomeTipo() <em>Nome Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeTipo()
   * @generated
   * @ordered
   */
  protected String nomeTipo = NOME_TIPO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected type_specifierImpl()
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
    return SimpleJavaPackage.Literals.TYPE_SPECIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNomeTipo()
  {
    return nomeTipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNomeTipo(String newNomeTipo)
  {
    String oldNomeTipo = nomeTipo;
    nomeTipo = newNomeTipo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TYPE_SPECIFIER__NOME_TIPO, oldNomeTipo, nomeTipo));
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
      case SimpleJavaPackage.TYPE_SPECIFIER__NOME_TIPO:
        return getNomeTipo();
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
      case SimpleJavaPackage.TYPE_SPECIFIER__NOME_TIPO:
        setNomeTipo((String)newValue);
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
      case SimpleJavaPackage.TYPE_SPECIFIER__NOME_TIPO:
        setNomeTipo(NOME_TIPO_EDEFAULT);
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
      case SimpleJavaPackage.TYPE_SPECIFIER__NOME_TIPO:
        return NOME_TIPO_EDEFAULT == null ? nomeTipo != null : !NOME_TIPO_EDEFAULT.equals(nomeTipo);
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
    result.append(" (nomeTipo: ");
    result.append(nomeTipo);
    result.append(')');
    return result.toString();
  }

} //type_specifierImpl
