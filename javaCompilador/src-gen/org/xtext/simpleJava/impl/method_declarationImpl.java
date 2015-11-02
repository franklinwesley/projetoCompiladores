/**
 */
package org.xtext.simpleJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.simpleJava.MODIFIER;
import org.xtext.simpleJava.SimpleJavaPackage;
import org.xtext.simpleJava.method_declaration;
import org.xtext.simpleJava.parameter_list;
import org.xtext.simpleJava.statement_block;
import org.xtext.simpleJava.type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>method declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.method_declarationImpl#getModificadorMetodo <em>Modificador Metodo</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.method_declarationImpl#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.method_declarationImpl#getNomeMetodo <em>Nome Metodo</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.method_declarationImpl#getParametrosMetodo <em>Parametros Metodo</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.method_declarationImpl#getBlocoMetodo <em>Bloco Metodo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class method_declarationImpl extends MinimalEObjectImpl.Container implements method_declaration
{
  /**
   * The cached value of the '{@link #getModificadorMetodo() <em>Modificador Metodo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModificadorMetodo()
   * @generated
   * @ordered
   */
  protected MODIFIER modificadorMetodo;

  /**
   * The cached value of the '{@link #getTipoRetorno() <em>Tipo Retorno</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoRetorno()
   * @generated
   * @ordered
   */
  protected type tipoRetorno;

  /**
   * The default value of the '{@link #getNomeMetodo() <em>Nome Metodo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeMetodo()
   * @generated
   * @ordered
   */
  protected static final String NOME_METODO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNomeMetodo() <em>Nome Metodo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeMetodo()
   * @generated
   * @ordered
   */
  protected String nomeMetodo = NOME_METODO_EDEFAULT;

  /**
   * The cached value of the '{@link #getParametrosMetodo() <em>Parametros Metodo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParametrosMetodo()
   * @generated
   * @ordered
   */
  protected parameter_list parametrosMetodo;

  /**
   * The cached value of the '{@link #getBlocoMetodo() <em>Bloco Metodo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocoMetodo()
   * @generated
   * @ordered
   */
  protected statement_block blocoMetodo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected method_declarationImpl()
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
    return SimpleJavaPackage.Literals.METHOD_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MODIFIER getModificadorMetodo()
  {
    return modificadorMetodo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModificadorMetodo(MODIFIER newModificadorMetodo, NotificationChain msgs)
  {
    MODIFIER oldModificadorMetodo = modificadorMetodo;
    modificadorMetodo = newModificadorMetodo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.METHOD_DECLARATION__MODIFICADOR_METODO, oldModificadorMetodo, newModificadorMetodo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModificadorMetodo(MODIFIER newModificadorMetodo)
  {
    if (newModificadorMetodo != modificadorMetodo)
    {
      NotificationChain msgs = null;
      if (modificadorMetodo != null)
        msgs = ((InternalEObject)modificadorMetodo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.METHOD_DECLARATION__MODIFICADOR_METODO, null, msgs);
      if (newModificadorMetodo != null)
        msgs = ((InternalEObject)newModificadorMetodo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.METHOD_DECLARATION__MODIFICADOR_METODO, null, msgs);
      msgs = basicSetModificadorMetodo(newModificadorMetodo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.METHOD_DECLARATION__MODIFICADOR_METODO, newModificadorMetodo, newModificadorMetodo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type getTipoRetorno()
  {
    return tipoRetorno;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipoRetorno(type newTipoRetorno, NotificationChain msgs)
  {
    type oldTipoRetorno = tipoRetorno;
    tipoRetorno = newTipoRetorno;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.METHOD_DECLARATION__TIPO_RETORNO, oldTipoRetorno, newTipoRetorno);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipoRetorno(type newTipoRetorno)
  {
    if (newTipoRetorno != tipoRetorno)
    {
      NotificationChain msgs = null;
      if (tipoRetorno != null)
        msgs = ((InternalEObject)tipoRetorno).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.METHOD_DECLARATION__TIPO_RETORNO, null, msgs);
      if (newTipoRetorno != null)
        msgs = ((InternalEObject)newTipoRetorno).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.METHOD_DECLARATION__TIPO_RETORNO, null, msgs);
      msgs = basicSetTipoRetorno(newTipoRetorno, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.METHOD_DECLARATION__TIPO_RETORNO, newTipoRetorno, newTipoRetorno));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNomeMetodo()
  {
    return nomeMetodo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNomeMetodo(String newNomeMetodo)
  {
    String oldNomeMetodo = nomeMetodo;
    nomeMetodo = newNomeMetodo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.METHOD_DECLARATION__NOME_METODO, oldNomeMetodo, nomeMetodo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_list getParametrosMetodo()
  {
    return parametrosMetodo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParametrosMetodo(parameter_list newParametrosMetodo, NotificationChain msgs)
  {
    parameter_list oldParametrosMetodo = parametrosMetodo;
    parametrosMetodo = newParametrosMetodo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.METHOD_DECLARATION__PARAMETROS_METODO, oldParametrosMetodo, newParametrosMetodo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParametrosMetodo(parameter_list newParametrosMetodo)
  {
    if (newParametrosMetodo != parametrosMetodo)
    {
      NotificationChain msgs = null;
      if (parametrosMetodo != null)
        msgs = ((InternalEObject)parametrosMetodo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.METHOD_DECLARATION__PARAMETROS_METODO, null, msgs);
      if (newParametrosMetodo != null)
        msgs = ((InternalEObject)newParametrosMetodo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.METHOD_DECLARATION__PARAMETROS_METODO, null, msgs);
      msgs = basicSetParametrosMetodo(newParametrosMetodo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.METHOD_DECLARATION__PARAMETROS_METODO, newParametrosMetodo, newParametrosMetodo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_block getBlocoMetodo()
  {
    return blocoMetodo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocoMetodo(statement_block newBlocoMetodo, NotificationChain msgs)
  {
    statement_block oldBlocoMetodo = blocoMetodo;
    blocoMetodo = newBlocoMetodo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.METHOD_DECLARATION__BLOCO_METODO, oldBlocoMetodo, newBlocoMetodo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocoMetodo(statement_block newBlocoMetodo)
  {
    if (newBlocoMetodo != blocoMetodo)
    {
      NotificationChain msgs = null;
      if (blocoMetodo != null)
        msgs = ((InternalEObject)blocoMetodo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.METHOD_DECLARATION__BLOCO_METODO, null, msgs);
      if (newBlocoMetodo != null)
        msgs = ((InternalEObject)newBlocoMetodo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.METHOD_DECLARATION__BLOCO_METODO, null, msgs);
      msgs = basicSetBlocoMetodo(newBlocoMetodo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.METHOD_DECLARATION__BLOCO_METODO, newBlocoMetodo, newBlocoMetodo));
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
      case SimpleJavaPackage.METHOD_DECLARATION__MODIFICADOR_METODO:
        return basicSetModificadorMetodo(null, msgs);
      case SimpleJavaPackage.METHOD_DECLARATION__TIPO_RETORNO:
        return basicSetTipoRetorno(null, msgs);
      case SimpleJavaPackage.METHOD_DECLARATION__PARAMETROS_METODO:
        return basicSetParametrosMetodo(null, msgs);
      case SimpleJavaPackage.METHOD_DECLARATION__BLOCO_METODO:
        return basicSetBlocoMetodo(null, msgs);
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
      case SimpleJavaPackage.METHOD_DECLARATION__MODIFICADOR_METODO:
        return getModificadorMetodo();
      case SimpleJavaPackage.METHOD_DECLARATION__TIPO_RETORNO:
        return getTipoRetorno();
      case SimpleJavaPackage.METHOD_DECLARATION__NOME_METODO:
        return getNomeMetodo();
      case SimpleJavaPackage.METHOD_DECLARATION__PARAMETROS_METODO:
        return getParametrosMetodo();
      case SimpleJavaPackage.METHOD_DECLARATION__BLOCO_METODO:
        return getBlocoMetodo();
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
      case SimpleJavaPackage.METHOD_DECLARATION__MODIFICADOR_METODO:
        setModificadorMetodo((MODIFIER)newValue);
        return;
      case SimpleJavaPackage.METHOD_DECLARATION__TIPO_RETORNO:
        setTipoRetorno((type)newValue);
        return;
      case SimpleJavaPackage.METHOD_DECLARATION__NOME_METODO:
        setNomeMetodo((String)newValue);
        return;
      case SimpleJavaPackage.METHOD_DECLARATION__PARAMETROS_METODO:
        setParametrosMetodo((parameter_list)newValue);
        return;
      case SimpleJavaPackage.METHOD_DECLARATION__BLOCO_METODO:
        setBlocoMetodo((statement_block)newValue);
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
      case SimpleJavaPackage.METHOD_DECLARATION__MODIFICADOR_METODO:
        setModificadorMetodo((MODIFIER)null);
        return;
      case SimpleJavaPackage.METHOD_DECLARATION__TIPO_RETORNO:
        setTipoRetorno((type)null);
        return;
      case SimpleJavaPackage.METHOD_DECLARATION__NOME_METODO:
        setNomeMetodo(NOME_METODO_EDEFAULT);
        return;
      case SimpleJavaPackage.METHOD_DECLARATION__PARAMETROS_METODO:
        setParametrosMetodo((parameter_list)null);
        return;
      case SimpleJavaPackage.METHOD_DECLARATION__BLOCO_METODO:
        setBlocoMetodo((statement_block)null);
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
      case SimpleJavaPackage.METHOD_DECLARATION__MODIFICADOR_METODO:
        return modificadorMetodo != null;
      case SimpleJavaPackage.METHOD_DECLARATION__TIPO_RETORNO:
        return tipoRetorno != null;
      case SimpleJavaPackage.METHOD_DECLARATION__NOME_METODO:
        return NOME_METODO_EDEFAULT == null ? nomeMetodo != null : !NOME_METODO_EDEFAULT.equals(nomeMetodo);
      case SimpleJavaPackage.METHOD_DECLARATION__PARAMETROS_METODO:
        return parametrosMetodo != null;
      case SimpleJavaPackage.METHOD_DECLARATION__BLOCO_METODO:
        return blocoMetodo != null;
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
    result.append(" (nomeMetodo: ");
    result.append(nomeMetodo);
    result.append(')');
    return result.toString();
  }

} //method_declarationImpl
