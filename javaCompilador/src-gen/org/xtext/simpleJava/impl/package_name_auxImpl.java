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
import org.xtext.simpleJava.package_name_aux;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>package name aux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.package_name_auxImpl#getNomePacote <em>Nome Pacote</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.package_name_auxImpl#getPacote <em>Pacote</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class package_name_auxImpl extends MinimalEObjectImpl.Container implements package_name_aux
{
  /**
   * The default value of the '{@link #getNomePacote() <em>Nome Pacote</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomePacote()
   * @generated
   * @ordered
   */
  protected static final String NOME_PACOTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNomePacote() <em>Nome Pacote</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomePacote()
   * @generated
   * @ordered
   */
  protected String nomePacote = NOME_PACOTE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPacote() <em>Pacote</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPacote()
   * @generated
   * @ordered
   */
  protected package_name_aux pacote;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected package_name_auxImpl()
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
    return SimpleJavaPackage.Literals.PACKAGE_NAME_AUX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNomePacote()
  {
    return nomePacote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNomePacote(String newNomePacote)
  {
    String oldNomePacote = nomePacote;
    nomePacote = newNomePacote;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.PACKAGE_NAME_AUX__NOME_PACOTE, oldNomePacote, nomePacote));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public package_name_aux getPacote()
  {
    return pacote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPacote(package_name_aux newPacote, NotificationChain msgs)
  {
    package_name_aux oldPacote = pacote;
    pacote = newPacote;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.PACKAGE_NAME_AUX__PACOTE, oldPacote, newPacote);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPacote(package_name_aux newPacote)
  {
    if (newPacote != pacote)
    {
      NotificationChain msgs = null;
      if (pacote != null)
        msgs = ((InternalEObject)pacote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.PACKAGE_NAME_AUX__PACOTE, null, msgs);
      if (newPacote != null)
        msgs = ((InternalEObject)newPacote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.PACKAGE_NAME_AUX__PACOTE, null, msgs);
      msgs = basicSetPacote(newPacote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.PACKAGE_NAME_AUX__PACOTE, newPacote, newPacote));
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
      case SimpleJavaPackage.PACKAGE_NAME_AUX__PACOTE:
        return basicSetPacote(null, msgs);
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
      case SimpleJavaPackage.PACKAGE_NAME_AUX__NOME_PACOTE:
        return getNomePacote();
      case SimpleJavaPackage.PACKAGE_NAME_AUX__PACOTE:
        return getPacote();
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
      case SimpleJavaPackage.PACKAGE_NAME_AUX__NOME_PACOTE:
        setNomePacote((String)newValue);
        return;
      case SimpleJavaPackage.PACKAGE_NAME_AUX__PACOTE:
        setPacote((package_name_aux)newValue);
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
      case SimpleJavaPackage.PACKAGE_NAME_AUX__NOME_PACOTE:
        setNomePacote(NOME_PACOTE_EDEFAULT);
        return;
      case SimpleJavaPackage.PACKAGE_NAME_AUX__PACOTE:
        setPacote((package_name_aux)null);
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
      case SimpleJavaPackage.PACKAGE_NAME_AUX__NOME_PACOTE:
        return NOME_PACOTE_EDEFAULT == null ? nomePacote != null : !NOME_PACOTE_EDEFAULT.equals(nomePacote);
      case SimpleJavaPackage.PACKAGE_NAME_AUX__PACOTE:
        return pacote != null;
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
    result.append(" (nomePacote: ");
    result.append(nomePacote);
    result.append(')');
    return result.toString();
  }

} //package_name_auxImpl
