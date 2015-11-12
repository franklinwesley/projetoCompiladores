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
import org.xtext.example.simpleJava.expression;
import org.xtext.example.simpleJava.if_statement;
import org.xtext.example.simpleJava.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>if statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.if_statementImpl#getEspressaoIf <em>Espressao If</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.if_statementImpl#getBlcoIf <em>Blco If</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.if_statementImpl#getBlocoElse <em>Bloco Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class if_statementImpl extends MinimalEObjectImpl.Container implements if_statement
{
  /**
   * The cached value of the '{@link #getEspressaoIf() <em>Espressao If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEspressaoIf()
   * @generated
   * @ordered
   */
  protected expression espressaoIf;

  /**
   * The cached value of the '{@link #getBlcoIf() <em>Blco If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlcoIf()
   * @generated
   * @ordered
   */
  protected statement blcoIf;

  /**
   * The cached value of the '{@link #getBlocoElse() <em>Bloco Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocoElse()
   * @generated
   * @ordered
   */
  protected statement blocoElse;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected if_statementImpl()
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
    return SimpleJavaPackage.Literals.IF_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getEspressaoIf()
  {
    return espressaoIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEspressaoIf(expression newEspressaoIf, NotificationChain msgs)
  {
    expression oldEspressaoIf = espressaoIf;
    espressaoIf = newEspressaoIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.IF_STATEMENT__ESPRESSAO_IF, oldEspressaoIf, newEspressaoIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEspressaoIf(expression newEspressaoIf)
  {
    if (newEspressaoIf != espressaoIf)
    {
      NotificationChain msgs = null;
      if (espressaoIf != null)
        msgs = ((InternalEObject)espressaoIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.IF_STATEMENT__ESPRESSAO_IF, null, msgs);
      if (newEspressaoIf != null)
        msgs = ((InternalEObject)newEspressaoIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.IF_STATEMENT__ESPRESSAO_IF, null, msgs);
      msgs = basicSetEspressaoIf(newEspressaoIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.IF_STATEMENT__ESPRESSAO_IF, newEspressaoIf, newEspressaoIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getBlcoIf()
  {
    return blcoIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlcoIf(statement newBlcoIf, NotificationChain msgs)
  {
    statement oldBlcoIf = blcoIf;
    blcoIf = newBlcoIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.IF_STATEMENT__BLCO_IF, oldBlcoIf, newBlcoIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlcoIf(statement newBlcoIf)
  {
    if (newBlcoIf != blcoIf)
    {
      NotificationChain msgs = null;
      if (blcoIf != null)
        msgs = ((InternalEObject)blcoIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.IF_STATEMENT__BLCO_IF, null, msgs);
      if (newBlcoIf != null)
        msgs = ((InternalEObject)newBlcoIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.IF_STATEMENT__BLCO_IF, null, msgs);
      msgs = basicSetBlcoIf(newBlcoIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.IF_STATEMENT__BLCO_IF, newBlcoIf, newBlcoIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getBlocoElse()
  {
    return blocoElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocoElse(statement newBlocoElse, NotificationChain msgs)
  {
    statement oldBlocoElse = blocoElse;
    blocoElse = newBlocoElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.IF_STATEMENT__BLOCO_ELSE, oldBlocoElse, newBlocoElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocoElse(statement newBlocoElse)
  {
    if (newBlocoElse != blocoElse)
    {
      NotificationChain msgs = null;
      if (blocoElse != null)
        msgs = ((InternalEObject)blocoElse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.IF_STATEMENT__BLOCO_ELSE, null, msgs);
      if (newBlocoElse != null)
        msgs = ((InternalEObject)newBlocoElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.IF_STATEMENT__BLOCO_ELSE, null, msgs);
      msgs = basicSetBlocoElse(newBlocoElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.IF_STATEMENT__BLOCO_ELSE, newBlocoElse, newBlocoElse));
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
      case SimpleJavaPackage.IF_STATEMENT__ESPRESSAO_IF:
        return basicSetEspressaoIf(null, msgs);
      case SimpleJavaPackage.IF_STATEMENT__BLCO_IF:
        return basicSetBlcoIf(null, msgs);
      case SimpleJavaPackage.IF_STATEMENT__BLOCO_ELSE:
        return basicSetBlocoElse(null, msgs);
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
      case SimpleJavaPackage.IF_STATEMENT__ESPRESSAO_IF:
        return getEspressaoIf();
      case SimpleJavaPackage.IF_STATEMENT__BLCO_IF:
        return getBlcoIf();
      case SimpleJavaPackage.IF_STATEMENT__BLOCO_ELSE:
        return getBlocoElse();
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
      case SimpleJavaPackage.IF_STATEMENT__ESPRESSAO_IF:
        setEspressaoIf((expression)newValue);
        return;
      case SimpleJavaPackage.IF_STATEMENT__BLCO_IF:
        setBlcoIf((statement)newValue);
        return;
      case SimpleJavaPackage.IF_STATEMENT__BLOCO_ELSE:
        setBlocoElse((statement)newValue);
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
      case SimpleJavaPackage.IF_STATEMENT__ESPRESSAO_IF:
        setEspressaoIf((expression)null);
        return;
      case SimpleJavaPackage.IF_STATEMENT__BLCO_IF:
        setBlcoIf((statement)null);
        return;
      case SimpleJavaPackage.IF_STATEMENT__BLOCO_ELSE:
        setBlocoElse((statement)null);
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
      case SimpleJavaPackage.IF_STATEMENT__ESPRESSAO_IF:
        return espressaoIf != null;
      case SimpleJavaPackage.IF_STATEMENT__BLCO_IF:
        return blcoIf != null;
      case SimpleJavaPackage.IF_STATEMENT__BLOCO_ELSE:
        return blocoElse != null;
    }
    return super.eIsSet(featureID);
  }

} //if_statementImpl
