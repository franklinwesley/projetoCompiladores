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
import org.xtext.example.simpleJava.statement;
import org.xtext.example.simpleJava.statement_block;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>statement block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.statement_blockImpl#getCorpo <em>Corpo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class statement_blockImpl extends MinimalEObjectImpl.Container implements statement_block
{
  /**
   * The cached value of the '{@link #getCorpo() <em>Corpo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorpo()
   * @generated
   * @ordered
   */
  protected statement corpo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected statement_blockImpl()
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
    return SimpleJavaPackage.Literals.STATEMENT_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getCorpo()
  {
    return corpo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCorpo(statement newCorpo, NotificationChain msgs)
  {
    statement oldCorpo = corpo;
    corpo = newCorpo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT_BLOCK__CORPO, oldCorpo, newCorpo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCorpo(statement newCorpo)
  {
    if (newCorpo != corpo)
    {
      NotificationChain msgs = null;
      if (corpo != null)
        msgs = ((InternalEObject)corpo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT_BLOCK__CORPO, null, msgs);
      if (newCorpo != null)
        msgs = ((InternalEObject)newCorpo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT_BLOCK__CORPO, null, msgs);
      msgs = basicSetCorpo(newCorpo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT_BLOCK__CORPO, newCorpo, newCorpo));
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
      case SimpleJavaPackage.STATEMENT_BLOCK__CORPO:
        return basicSetCorpo(null, msgs);
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
      case SimpleJavaPackage.STATEMENT_BLOCK__CORPO:
        return getCorpo();
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
      case SimpleJavaPackage.STATEMENT_BLOCK__CORPO:
        setCorpo((statement)newValue);
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
      case SimpleJavaPackage.STATEMENT_BLOCK__CORPO:
        setCorpo((statement)null);
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
      case SimpleJavaPackage.STATEMENT_BLOCK__CORPO:
        return corpo != null;
    }
    return super.eIsSet(featureID);
  }

} //statement_blockImpl
