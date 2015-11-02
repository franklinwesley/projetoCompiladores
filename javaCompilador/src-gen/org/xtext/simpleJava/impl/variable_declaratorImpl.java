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
import org.xtext.simpleJava.variable_declarator;
import org.xtext.simpleJava.variable_initializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.variable_declaratorImpl#getNomeVariavel <em>Nome Variavel</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.variable_declaratorImpl#getValorVariavel <em>Valor Variavel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class variable_declaratorImpl extends MinimalEObjectImpl.Container implements variable_declarator
{
  /**
   * The default value of the '{@link #getNomeVariavel() <em>Nome Variavel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeVariavel()
   * @generated
   * @ordered
   */
  protected static final String NOME_VARIAVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNomeVariavel() <em>Nome Variavel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeVariavel()
   * @generated
   * @ordered
   */
  protected String nomeVariavel = NOME_VARIAVEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getValorVariavel() <em>Valor Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorVariavel()
   * @generated
   * @ordered
   */
  protected variable_initializer valorVariavel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variable_declaratorImpl()
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
    return SimpleJavaPackage.Literals.VARIABLE_DECLARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNomeVariavel()
  {
    return nomeVariavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNomeVariavel(String newNomeVariavel)
  {
    String oldNomeVariavel = nomeVariavel;
    nomeVariavel = newNomeVariavel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.VARIABLE_DECLARATOR__NOME_VARIAVEL, oldNomeVariavel, nomeVariavel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_initializer getValorVariavel()
  {
    return valorVariavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValorVariavel(variable_initializer newValorVariavel, NotificationChain msgs)
  {
    variable_initializer oldValorVariavel = valorVariavel;
    valorVariavel = newValorVariavel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.VARIABLE_DECLARATOR__VALOR_VARIAVEL, oldValorVariavel, newValorVariavel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValorVariavel(variable_initializer newValorVariavel)
  {
    if (newValorVariavel != valorVariavel)
    {
      NotificationChain msgs = null;
      if (valorVariavel != null)
        msgs = ((InternalEObject)valorVariavel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.VARIABLE_DECLARATOR__VALOR_VARIAVEL, null, msgs);
      if (newValorVariavel != null)
        msgs = ((InternalEObject)newValorVariavel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.VARIABLE_DECLARATOR__VALOR_VARIAVEL, null, msgs);
      msgs = basicSetValorVariavel(newValorVariavel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.VARIABLE_DECLARATOR__VALOR_VARIAVEL, newValorVariavel, newValorVariavel));
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
      case SimpleJavaPackage.VARIABLE_DECLARATOR__VALOR_VARIAVEL:
        return basicSetValorVariavel(null, msgs);
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
      case SimpleJavaPackage.VARIABLE_DECLARATOR__NOME_VARIAVEL:
        return getNomeVariavel();
      case SimpleJavaPackage.VARIABLE_DECLARATOR__VALOR_VARIAVEL:
        return getValorVariavel();
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
      case SimpleJavaPackage.VARIABLE_DECLARATOR__NOME_VARIAVEL:
        setNomeVariavel((String)newValue);
        return;
      case SimpleJavaPackage.VARIABLE_DECLARATOR__VALOR_VARIAVEL:
        setValorVariavel((variable_initializer)newValue);
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
      case SimpleJavaPackage.VARIABLE_DECLARATOR__NOME_VARIAVEL:
        setNomeVariavel(NOME_VARIAVEL_EDEFAULT);
        return;
      case SimpleJavaPackage.VARIABLE_DECLARATOR__VALOR_VARIAVEL:
        setValorVariavel((variable_initializer)null);
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
      case SimpleJavaPackage.VARIABLE_DECLARATOR__NOME_VARIAVEL:
        return NOME_VARIAVEL_EDEFAULT == null ? nomeVariavel != null : !NOME_VARIAVEL_EDEFAULT.equals(nomeVariavel);
      case SimpleJavaPackage.VARIABLE_DECLARATOR__VALOR_VARIAVEL:
        return valorVariavel != null;
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
    result.append(" (nomeVariavel: ");
    result.append(nomeVariavel);
    result.append(')');
    return result.toString();
  }

} //variable_declaratorImpl
