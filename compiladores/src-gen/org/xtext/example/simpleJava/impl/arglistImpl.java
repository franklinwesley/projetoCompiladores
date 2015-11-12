/**
 */
package org.xtext.example.simpleJava.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.simpleJava.SimpleJavaPackage;
import org.xtext.example.simpleJava.arglist;
import org.xtext.example.simpleJava.expression;
import org.xtext.example.simpleJava.type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>arglist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.arglistImpl#getExpressoesArgumentos <em>Expressoes Argumentos</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.arglistImpl#getTipoParametro <em>Tipo Parametro</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.arglistImpl#getNomeParametro <em>Nome Parametro</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class arglistImpl extends variable_declaratorImpl implements arglist
{
  /**
   * The cached value of the '{@link #getExpressoesArgumentos() <em>Expressoes Argumentos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressoesArgumentos()
   * @generated
   * @ordered
   */
  protected EList<expression> expressoesArgumentos;

  /**
   * The cached value of the '{@link #getTipoParametro() <em>Tipo Parametro</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoParametro()
   * @generated
   * @ordered
   */
  protected EList<type> tipoParametro;

  /**
   * The cached value of the '{@link #getNomeParametro() <em>Nome Parametro</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeParametro()
   * @generated
   * @ordered
   */
  protected EList<String> nomeParametro;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected arglistImpl()
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
    return SimpleJavaPackage.Literals.ARGLIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expression> getExpressoesArgumentos()
  {
    if (expressoesArgumentos == null)
    {
      expressoesArgumentos = new EObjectContainmentEList<expression>(expression.class, this, SimpleJavaPackage.ARGLIST__EXPRESSOES_ARGUMENTOS);
    }
    return expressoesArgumentos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<type> getTipoParametro()
  {
    if (tipoParametro == null)
    {
      tipoParametro = new EObjectContainmentEList<type>(type.class, this, SimpleJavaPackage.ARGLIST__TIPO_PARAMETRO);
    }
    return tipoParametro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNomeParametro()
  {
    if (nomeParametro == null)
    {
      nomeParametro = new EDataTypeEList<String>(String.class, this, SimpleJavaPackage.ARGLIST__NOME_PARAMETRO);
    }
    return nomeParametro;
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
      case SimpleJavaPackage.ARGLIST__EXPRESSOES_ARGUMENTOS:
        return ((InternalEList<?>)getExpressoesArgumentos()).basicRemove(otherEnd, msgs);
      case SimpleJavaPackage.ARGLIST__TIPO_PARAMETRO:
        return ((InternalEList<?>)getTipoParametro()).basicRemove(otherEnd, msgs);
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
      case SimpleJavaPackage.ARGLIST__EXPRESSOES_ARGUMENTOS:
        return getExpressoesArgumentos();
      case SimpleJavaPackage.ARGLIST__TIPO_PARAMETRO:
        return getTipoParametro();
      case SimpleJavaPackage.ARGLIST__NOME_PARAMETRO:
        return getNomeParametro();
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
      case SimpleJavaPackage.ARGLIST__EXPRESSOES_ARGUMENTOS:
        getExpressoesArgumentos().clear();
        getExpressoesArgumentos().addAll((Collection<? extends expression>)newValue);
        return;
      case SimpleJavaPackage.ARGLIST__TIPO_PARAMETRO:
        getTipoParametro().clear();
        getTipoParametro().addAll((Collection<? extends type>)newValue);
        return;
      case SimpleJavaPackage.ARGLIST__NOME_PARAMETRO:
        getNomeParametro().clear();
        getNomeParametro().addAll((Collection<? extends String>)newValue);
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
      case SimpleJavaPackage.ARGLIST__EXPRESSOES_ARGUMENTOS:
        getExpressoesArgumentos().clear();
        return;
      case SimpleJavaPackage.ARGLIST__TIPO_PARAMETRO:
        getTipoParametro().clear();
        return;
      case SimpleJavaPackage.ARGLIST__NOME_PARAMETRO:
        getNomeParametro().clear();
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
      case SimpleJavaPackage.ARGLIST__EXPRESSOES_ARGUMENTOS:
        return expressoesArgumentos != null && !expressoesArgumentos.isEmpty();
      case SimpleJavaPackage.ARGLIST__TIPO_PARAMETRO:
        return tipoParametro != null && !tipoParametro.isEmpty();
      case SimpleJavaPackage.ARGLIST__NOME_PARAMETRO:
        return nomeParametro != null && !nomeParametro.isEmpty();
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
    result.append(" (nomeParametro: ");
    result.append(nomeParametro);
    result.append(')');
    return result.toString();
  }

} //arglistImpl
