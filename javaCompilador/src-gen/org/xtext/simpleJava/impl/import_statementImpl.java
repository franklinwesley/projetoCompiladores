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
import org.xtext.simpleJava.import_statement;
import org.xtext.simpleJava.name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>import statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.import_statementImpl#getNomeImporte <em>Nome Importe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class import_statementImpl extends MinimalEObjectImpl.Container implements import_statement
{
  /**
   * The cached value of the '{@link #getNomeImporte() <em>Nome Importe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeImporte()
   * @generated
   * @ordered
   */
  protected name nomeImporte;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected import_statementImpl()
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
    return SimpleJavaPackage.Literals.IMPORT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public name getNomeImporte()
  {
    return nomeImporte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNomeImporte(name newNomeImporte, NotificationChain msgs)
  {
    name oldNomeImporte = nomeImporte;
    nomeImporte = newNomeImporte;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.IMPORT_STATEMENT__NOME_IMPORTE, oldNomeImporte, newNomeImporte);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNomeImporte(name newNomeImporte)
  {
    if (newNomeImporte != nomeImporte)
    {
      NotificationChain msgs = null;
      if (nomeImporte != null)
        msgs = ((InternalEObject)nomeImporte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.IMPORT_STATEMENT__NOME_IMPORTE, null, msgs);
      if (newNomeImporte != null)
        msgs = ((InternalEObject)newNomeImporte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.IMPORT_STATEMENT__NOME_IMPORTE, null, msgs);
      msgs = basicSetNomeImporte(newNomeImporte, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.IMPORT_STATEMENT__NOME_IMPORTE, newNomeImporte, newNomeImporte));
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
      case SimpleJavaPackage.IMPORT_STATEMENT__NOME_IMPORTE:
        return basicSetNomeImporte(null, msgs);
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
      case SimpleJavaPackage.IMPORT_STATEMENT__NOME_IMPORTE:
        return getNomeImporte();
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
      case SimpleJavaPackage.IMPORT_STATEMENT__NOME_IMPORTE:
        setNomeImporte((name)newValue);
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
      case SimpleJavaPackage.IMPORT_STATEMENT__NOME_IMPORTE:
        setNomeImporte((name)null);
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
      case SimpleJavaPackage.IMPORT_STATEMENT__NOME_IMPORTE:
        return nomeImporte != null;
    }
    return super.eIsSet(featureID);
  }

} //import_statementImpl
