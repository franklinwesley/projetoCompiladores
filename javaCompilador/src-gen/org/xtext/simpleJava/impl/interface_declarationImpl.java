/**
 */
package org.xtext.simpleJava.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.simpleJava.MODIFIER;
import org.xtext.simpleJava.SimpleJavaPackage;
import org.xtext.simpleJava.field_declaration;
import org.xtext.simpleJava.interface_declaration;
import org.xtext.simpleJava.name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>interface declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.interface_declarationImpl#getModificadores <em>Modificadores</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.interface_declarationImpl#getNomeInterface <em>Nome Interface</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.interface_declarationImpl#getSuperinterfaces <em>Superinterfaces</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.interface_declarationImpl#getCorpoInterface <em>Corpo Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class interface_declarationImpl extends MinimalEObjectImpl.Container implements interface_declaration
{
  /**
   * The cached value of the '{@link #getModificadores() <em>Modificadores</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModificadores()
   * @generated
   * @ordered
   */
  protected EList<MODIFIER> modificadores;

  /**
   * The default value of the '{@link #getNomeInterface() <em>Nome Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeInterface()
   * @generated
   * @ordered
   */
  protected static final String NOME_INTERFACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNomeInterface() <em>Nome Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeInterface()
   * @generated
   * @ordered
   */
  protected String nomeInterface = NOME_INTERFACE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperinterfaces() <em>Superinterfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperinterfaces()
   * @generated
   * @ordered
   */
  protected EList<name> superinterfaces;

  /**
   * The cached value of the '{@link #getCorpoInterface() <em>Corpo Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorpoInterface()
   * @generated
   * @ordered
   */
  protected field_declaration corpoInterface;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected interface_declarationImpl()
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
    return SimpleJavaPackage.Literals.INTERFACE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MODIFIER> getModificadores()
  {
    if (modificadores == null)
    {
      modificadores = new EObjectContainmentEList<MODIFIER>(MODIFIER.class, this, SimpleJavaPackage.INTERFACE_DECLARATION__MODIFICADORES);
    }
    return modificadores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNomeInterface()
  {
    return nomeInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNomeInterface(String newNomeInterface)
  {
    String oldNomeInterface = nomeInterface;
    nomeInterface = newNomeInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.INTERFACE_DECLARATION__NOME_INTERFACE, oldNomeInterface, nomeInterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<name> getSuperinterfaces()
  {
    if (superinterfaces == null)
    {
      superinterfaces = new EObjectContainmentEList<name>(name.class, this, SimpleJavaPackage.INTERFACE_DECLARATION__SUPERINTERFACES);
    }
    return superinterfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public field_declaration getCorpoInterface()
  {
    return corpoInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCorpoInterface(field_declaration newCorpoInterface, NotificationChain msgs)
  {
    field_declaration oldCorpoInterface = corpoInterface;
    corpoInterface = newCorpoInterface;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.INTERFACE_DECLARATION__CORPO_INTERFACE, oldCorpoInterface, newCorpoInterface);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCorpoInterface(field_declaration newCorpoInterface)
  {
    if (newCorpoInterface != corpoInterface)
    {
      NotificationChain msgs = null;
      if (corpoInterface != null)
        msgs = ((InternalEObject)corpoInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.INTERFACE_DECLARATION__CORPO_INTERFACE, null, msgs);
      if (newCorpoInterface != null)
        msgs = ((InternalEObject)newCorpoInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.INTERFACE_DECLARATION__CORPO_INTERFACE, null, msgs);
      msgs = basicSetCorpoInterface(newCorpoInterface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.INTERFACE_DECLARATION__CORPO_INTERFACE, newCorpoInterface, newCorpoInterface));
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
      case SimpleJavaPackage.INTERFACE_DECLARATION__MODIFICADORES:
        return ((InternalEList<?>)getModificadores()).basicRemove(otherEnd, msgs);
      case SimpleJavaPackage.INTERFACE_DECLARATION__SUPERINTERFACES:
        return ((InternalEList<?>)getSuperinterfaces()).basicRemove(otherEnd, msgs);
      case SimpleJavaPackage.INTERFACE_DECLARATION__CORPO_INTERFACE:
        return basicSetCorpoInterface(null, msgs);
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
      case SimpleJavaPackage.INTERFACE_DECLARATION__MODIFICADORES:
        return getModificadores();
      case SimpleJavaPackage.INTERFACE_DECLARATION__NOME_INTERFACE:
        return getNomeInterface();
      case SimpleJavaPackage.INTERFACE_DECLARATION__SUPERINTERFACES:
        return getSuperinterfaces();
      case SimpleJavaPackage.INTERFACE_DECLARATION__CORPO_INTERFACE:
        return getCorpoInterface();
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
      case SimpleJavaPackage.INTERFACE_DECLARATION__MODIFICADORES:
        getModificadores().clear();
        getModificadores().addAll((Collection<? extends MODIFIER>)newValue);
        return;
      case SimpleJavaPackage.INTERFACE_DECLARATION__NOME_INTERFACE:
        setNomeInterface((String)newValue);
        return;
      case SimpleJavaPackage.INTERFACE_DECLARATION__SUPERINTERFACES:
        getSuperinterfaces().clear();
        getSuperinterfaces().addAll((Collection<? extends name>)newValue);
        return;
      case SimpleJavaPackage.INTERFACE_DECLARATION__CORPO_INTERFACE:
        setCorpoInterface((field_declaration)newValue);
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
      case SimpleJavaPackage.INTERFACE_DECLARATION__MODIFICADORES:
        getModificadores().clear();
        return;
      case SimpleJavaPackage.INTERFACE_DECLARATION__NOME_INTERFACE:
        setNomeInterface(NOME_INTERFACE_EDEFAULT);
        return;
      case SimpleJavaPackage.INTERFACE_DECLARATION__SUPERINTERFACES:
        getSuperinterfaces().clear();
        return;
      case SimpleJavaPackage.INTERFACE_DECLARATION__CORPO_INTERFACE:
        setCorpoInterface((field_declaration)null);
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
      case SimpleJavaPackage.INTERFACE_DECLARATION__MODIFICADORES:
        return modificadores != null && !modificadores.isEmpty();
      case SimpleJavaPackage.INTERFACE_DECLARATION__NOME_INTERFACE:
        return NOME_INTERFACE_EDEFAULT == null ? nomeInterface != null : !NOME_INTERFACE_EDEFAULT.equals(nomeInterface);
      case SimpleJavaPackage.INTERFACE_DECLARATION__SUPERINTERFACES:
        return superinterfaces != null && !superinterfaces.isEmpty();
      case SimpleJavaPackage.INTERFACE_DECLARATION__CORPO_INTERFACE:
        return corpoInterface != null;
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
    result.append(" (nomeInterface: ");
    result.append(nomeInterface);
    result.append(')');
    return result.toString();
  }

} //interface_declarationImpl
