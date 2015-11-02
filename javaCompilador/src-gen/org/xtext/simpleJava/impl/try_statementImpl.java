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
import org.xtext.simpleJava.parameter;
import org.xtext.simpleJava.statement_block;
import org.xtext.simpleJava.try_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>try statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.try_statementImpl#getBlocoTry <em>Bloco Try</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.try_statementImpl#getParametroCatch <em>Parametro Catch</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.try_statementImpl#getBlocoCatch <em>Bloco Catch</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.try_statementImpl#getBlocoFinally <em>Bloco Finally</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class try_statementImpl extends MinimalEObjectImpl.Container implements try_statement
{
  /**
   * The cached value of the '{@link #getBlocoTry() <em>Bloco Try</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocoTry()
   * @generated
   * @ordered
   */
  protected statement_block blocoTry;

  /**
   * The cached value of the '{@link #getParametroCatch() <em>Parametro Catch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParametroCatch()
   * @generated
   * @ordered
   */
  protected parameter parametroCatch;

  /**
   * The cached value of the '{@link #getBlocoCatch() <em>Bloco Catch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocoCatch()
   * @generated
   * @ordered
   */
  protected statement_block blocoCatch;

  /**
   * The cached value of the '{@link #getBlocoFinally() <em>Bloco Finally</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocoFinally()
   * @generated
   * @ordered
   */
  protected statement_block blocoFinally;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected try_statementImpl()
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
    return SimpleJavaPackage.Literals.TRY_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_block getBlocoTry()
  {
    return blocoTry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocoTry(statement_block newBlocoTry, NotificationChain msgs)
  {
    statement_block oldBlocoTry = blocoTry;
    blocoTry = newBlocoTry;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TRY_STATEMENT__BLOCO_TRY, oldBlocoTry, newBlocoTry);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocoTry(statement_block newBlocoTry)
  {
    if (newBlocoTry != blocoTry)
    {
      NotificationChain msgs = null;
      if (blocoTry != null)
        msgs = ((InternalEObject)blocoTry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TRY_STATEMENT__BLOCO_TRY, null, msgs);
      if (newBlocoTry != null)
        msgs = ((InternalEObject)newBlocoTry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TRY_STATEMENT__BLOCO_TRY, null, msgs);
      msgs = basicSetBlocoTry(newBlocoTry, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TRY_STATEMENT__BLOCO_TRY, newBlocoTry, newBlocoTry));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter getParametroCatch()
  {
    return parametroCatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParametroCatch(parameter newParametroCatch, NotificationChain msgs)
  {
    parameter oldParametroCatch = parametroCatch;
    parametroCatch = newParametroCatch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TRY_STATEMENT__PARAMETRO_CATCH, oldParametroCatch, newParametroCatch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParametroCatch(parameter newParametroCatch)
  {
    if (newParametroCatch != parametroCatch)
    {
      NotificationChain msgs = null;
      if (parametroCatch != null)
        msgs = ((InternalEObject)parametroCatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TRY_STATEMENT__PARAMETRO_CATCH, null, msgs);
      if (newParametroCatch != null)
        msgs = ((InternalEObject)newParametroCatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TRY_STATEMENT__PARAMETRO_CATCH, null, msgs);
      msgs = basicSetParametroCatch(newParametroCatch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TRY_STATEMENT__PARAMETRO_CATCH, newParametroCatch, newParametroCatch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_block getBlocoCatch()
  {
    return blocoCatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocoCatch(statement_block newBlocoCatch, NotificationChain msgs)
  {
    statement_block oldBlocoCatch = blocoCatch;
    blocoCatch = newBlocoCatch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TRY_STATEMENT__BLOCO_CATCH, oldBlocoCatch, newBlocoCatch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocoCatch(statement_block newBlocoCatch)
  {
    if (newBlocoCatch != blocoCatch)
    {
      NotificationChain msgs = null;
      if (blocoCatch != null)
        msgs = ((InternalEObject)blocoCatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TRY_STATEMENT__BLOCO_CATCH, null, msgs);
      if (newBlocoCatch != null)
        msgs = ((InternalEObject)newBlocoCatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TRY_STATEMENT__BLOCO_CATCH, null, msgs);
      msgs = basicSetBlocoCatch(newBlocoCatch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TRY_STATEMENT__BLOCO_CATCH, newBlocoCatch, newBlocoCatch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_block getBlocoFinally()
  {
    return blocoFinally;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocoFinally(statement_block newBlocoFinally, NotificationChain msgs)
  {
    statement_block oldBlocoFinally = blocoFinally;
    blocoFinally = newBlocoFinally;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TRY_STATEMENT__BLOCO_FINALLY, oldBlocoFinally, newBlocoFinally);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocoFinally(statement_block newBlocoFinally)
  {
    if (newBlocoFinally != blocoFinally)
    {
      NotificationChain msgs = null;
      if (blocoFinally != null)
        msgs = ((InternalEObject)blocoFinally).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TRY_STATEMENT__BLOCO_FINALLY, null, msgs);
      if (newBlocoFinally != null)
        msgs = ((InternalEObject)newBlocoFinally).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TRY_STATEMENT__BLOCO_FINALLY, null, msgs);
      msgs = basicSetBlocoFinally(newBlocoFinally, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TRY_STATEMENT__BLOCO_FINALLY, newBlocoFinally, newBlocoFinally));
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
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_TRY:
        return basicSetBlocoTry(null, msgs);
      case SimpleJavaPackage.TRY_STATEMENT__PARAMETRO_CATCH:
        return basicSetParametroCatch(null, msgs);
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_CATCH:
        return basicSetBlocoCatch(null, msgs);
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_FINALLY:
        return basicSetBlocoFinally(null, msgs);
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
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_TRY:
        return getBlocoTry();
      case SimpleJavaPackage.TRY_STATEMENT__PARAMETRO_CATCH:
        return getParametroCatch();
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_CATCH:
        return getBlocoCatch();
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_FINALLY:
        return getBlocoFinally();
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
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_TRY:
        setBlocoTry((statement_block)newValue);
        return;
      case SimpleJavaPackage.TRY_STATEMENT__PARAMETRO_CATCH:
        setParametroCatch((parameter)newValue);
        return;
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_CATCH:
        setBlocoCatch((statement_block)newValue);
        return;
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_FINALLY:
        setBlocoFinally((statement_block)newValue);
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
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_TRY:
        setBlocoTry((statement_block)null);
        return;
      case SimpleJavaPackage.TRY_STATEMENT__PARAMETRO_CATCH:
        setParametroCatch((parameter)null);
        return;
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_CATCH:
        setBlocoCatch((statement_block)null);
        return;
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_FINALLY:
        setBlocoFinally((statement_block)null);
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
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_TRY:
        return blocoTry != null;
      case SimpleJavaPackage.TRY_STATEMENT__PARAMETRO_CATCH:
        return parametroCatch != null;
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_CATCH:
        return blocoCatch != null;
      case SimpleJavaPackage.TRY_STATEMENT__BLOCO_FINALLY:
        return blocoFinally != null;
    }
    return super.eIsSet(featureID);
  }

} //try_statementImpl
