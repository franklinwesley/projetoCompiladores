/**
 */
package org.xtext.example.simpleJava.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
   * The cached value of the '{@link #getCorpo() <em>Corpo</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorpo()
   * @generated
   * @ordered
   */
  protected EList<statement> corpo;

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
  public EList<statement> getCorpo()
  {
    if (corpo == null)
    {
      corpo = new EObjectContainmentEList<statement>(statement.class, this, SimpleJavaPackage.STATEMENT_BLOCK__CORPO);
    }
    return corpo;
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
        return ((InternalEList<?>)getCorpo()).basicRemove(otherEnd, msgs);
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimpleJavaPackage.STATEMENT_BLOCK__CORPO:
        getCorpo().clear();
        getCorpo().addAll((Collection<? extends statement>)newValue);
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
        getCorpo().clear();
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
        return corpo != null && !corpo.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //statement_blockImpl
