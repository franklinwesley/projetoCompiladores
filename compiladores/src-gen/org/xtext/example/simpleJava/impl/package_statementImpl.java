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
import org.xtext.example.simpleJava.name;
import org.xtext.example.simpleJava.package_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>package statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.package_statementImpl#getNoomePacote <em>Noome Pacote</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class package_statementImpl extends MinimalEObjectImpl.Container implements package_statement
{
  /**
   * The cached value of the '{@link #getNoomePacote() <em>Noome Pacote</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNoomePacote()
   * @generated
   * @ordered
   */
  protected name noomePacote;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected package_statementImpl()
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
    return SimpleJavaPackage.Literals.PACKAGE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public name getNoomePacote()
  {
    return noomePacote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNoomePacote(name newNoomePacote, NotificationChain msgs)
  {
    name oldNoomePacote = noomePacote;
    noomePacote = newNoomePacote;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.PACKAGE_STATEMENT__NOOME_PACOTE, oldNoomePacote, newNoomePacote);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoomePacote(name newNoomePacote)
  {
    if (newNoomePacote != noomePacote)
    {
      NotificationChain msgs = null;
      if (noomePacote != null)
        msgs = ((InternalEObject)noomePacote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.PACKAGE_STATEMENT__NOOME_PACOTE, null, msgs);
      if (newNoomePacote != null)
        msgs = ((InternalEObject)newNoomePacote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.PACKAGE_STATEMENT__NOOME_PACOTE, null, msgs);
      msgs = basicSetNoomePacote(newNoomePacote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.PACKAGE_STATEMENT__NOOME_PACOTE, newNoomePacote, newNoomePacote));
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
      case SimpleJavaPackage.PACKAGE_STATEMENT__NOOME_PACOTE:
        return basicSetNoomePacote(null, msgs);
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
      case SimpleJavaPackage.PACKAGE_STATEMENT__NOOME_PACOTE:
        return getNoomePacote();
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
      case SimpleJavaPackage.PACKAGE_STATEMENT__NOOME_PACOTE:
        setNoomePacote((name)newValue);
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
      case SimpleJavaPackage.PACKAGE_STATEMENT__NOOME_PACOTE:
        setNoomePacote((name)null);
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
      case SimpleJavaPackage.PACKAGE_STATEMENT__NOOME_PACOTE:
        return noomePacote != null;
    }
    return super.eIsSet(featureID);
  }

} //package_statementImpl
