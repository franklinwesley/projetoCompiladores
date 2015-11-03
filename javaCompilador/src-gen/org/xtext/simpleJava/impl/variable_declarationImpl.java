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
import org.xtext.simpleJava.statement_block;
import org.xtext.simpleJava.type;
import org.xtext.simpleJava.variable_declaration;
import org.xtext.simpleJava.variable_declarator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.variable_declarationImpl#getModificador <em>Modificador</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.variable_declarationImpl#getTipoVariavel <em>Tipo Variavel</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.variable_declarationImpl#getDeclaracaoVariaveis <em>Declaracao Variaveis</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.variable_declarationImpl#getBlocoVariavel <em>Bloco Variavel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class variable_declarationImpl extends MinimalEObjectImpl.Container implements variable_declaration
{
  /**
   * The cached value of the '{@link #getModificador() <em>Modificador</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModificador()
   * @generated
   * @ordered
   */
  protected MODIFIER modificador;

  /**
   * The cached value of the '{@link #getTipoVariavel() <em>Tipo Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoVariavel()
   * @generated
   * @ordered
   */
  protected type tipoVariavel;

  /**
   * The cached value of the '{@link #getDeclaracaoVariaveis() <em>Declaracao Variaveis</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaracaoVariaveis()
   * @generated
   * @ordered
   */
  protected EList<variable_declarator> declaracaoVariaveis;

  /**
   * The cached value of the '{@link #getBlocoVariavel() <em>Bloco Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocoVariavel()
   * @generated
   * @ordered
   */
  protected statement_block blocoVariavel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variable_declarationImpl()
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
    return SimpleJavaPackage.Literals.VARIABLE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MODIFIER getModificador()
  {
    return modificador;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModificador(MODIFIER newModificador, NotificationChain msgs)
  {
    MODIFIER oldModificador = modificador;
    modificador = newModificador;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.VARIABLE_DECLARATION__MODIFICADOR, oldModificador, newModificador);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModificador(MODIFIER newModificador)
  {
    if (newModificador != modificador)
    {
      NotificationChain msgs = null;
      if (modificador != null)
        msgs = ((InternalEObject)modificador).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.VARIABLE_DECLARATION__MODIFICADOR, null, msgs);
      if (newModificador != null)
        msgs = ((InternalEObject)newModificador).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.VARIABLE_DECLARATION__MODIFICADOR, null, msgs);
      msgs = basicSetModificador(newModificador, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.VARIABLE_DECLARATION__MODIFICADOR, newModificador, newModificador));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type getTipoVariavel()
  {
    return tipoVariavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipoVariavel(type newTipoVariavel, NotificationChain msgs)
  {
    type oldTipoVariavel = tipoVariavel;
    tipoVariavel = newTipoVariavel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.VARIABLE_DECLARATION__TIPO_VARIAVEL, oldTipoVariavel, newTipoVariavel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipoVariavel(type newTipoVariavel)
  {
    if (newTipoVariavel != tipoVariavel)
    {
      NotificationChain msgs = null;
      if (tipoVariavel != null)
        msgs = ((InternalEObject)tipoVariavel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.VARIABLE_DECLARATION__TIPO_VARIAVEL, null, msgs);
      if (newTipoVariavel != null)
        msgs = ((InternalEObject)newTipoVariavel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.VARIABLE_DECLARATION__TIPO_VARIAVEL, null, msgs);
      msgs = basicSetTipoVariavel(newTipoVariavel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.VARIABLE_DECLARATION__TIPO_VARIAVEL, newTipoVariavel, newTipoVariavel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variable_declarator> getDeclaracaoVariaveis()
  {
    if (declaracaoVariaveis == null)
    {
      declaracaoVariaveis = new EObjectContainmentEList<variable_declarator>(variable_declarator.class, this, SimpleJavaPackage.VARIABLE_DECLARATION__DECLARACAO_VARIAVEIS);
    }
    return declaracaoVariaveis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_block getBlocoVariavel()
  {
    return blocoVariavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocoVariavel(statement_block newBlocoVariavel, NotificationChain msgs)
  {
    statement_block oldBlocoVariavel = blocoVariavel;
    blocoVariavel = newBlocoVariavel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.VARIABLE_DECLARATION__BLOCO_VARIAVEL, oldBlocoVariavel, newBlocoVariavel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocoVariavel(statement_block newBlocoVariavel)
  {
    if (newBlocoVariavel != blocoVariavel)
    {
      NotificationChain msgs = null;
      if (blocoVariavel != null)
        msgs = ((InternalEObject)blocoVariavel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.VARIABLE_DECLARATION__BLOCO_VARIAVEL, null, msgs);
      if (newBlocoVariavel != null)
        msgs = ((InternalEObject)newBlocoVariavel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.VARIABLE_DECLARATION__BLOCO_VARIAVEL, null, msgs);
      msgs = basicSetBlocoVariavel(newBlocoVariavel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.VARIABLE_DECLARATION__BLOCO_VARIAVEL, newBlocoVariavel, newBlocoVariavel));
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
      case SimpleJavaPackage.VARIABLE_DECLARATION__MODIFICADOR:
        return basicSetModificador(null, msgs);
      case SimpleJavaPackage.VARIABLE_DECLARATION__TIPO_VARIAVEL:
        return basicSetTipoVariavel(null, msgs);
      case SimpleJavaPackage.VARIABLE_DECLARATION__DECLARACAO_VARIAVEIS:
        return ((InternalEList<?>)getDeclaracaoVariaveis()).basicRemove(otherEnd, msgs);
      case SimpleJavaPackage.VARIABLE_DECLARATION__BLOCO_VARIAVEL:
        return basicSetBlocoVariavel(null, msgs);
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
      case SimpleJavaPackage.VARIABLE_DECLARATION__MODIFICADOR:
        return getModificador();
      case SimpleJavaPackage.VARIABLE_DECLARATION__TIPO_VARIAVEL:
        return getTipoVariavel();
      case SimpleJavaPackage.VARIABLE_DECLARATION__DECLARACAO_VARIAVEIS:
        return getDeclaracaoVariaveis();
      case SimpleJavaPackage.VARIABLE_DECLARATION__BLOCO_VARIAVEL:
        return getBlocoVariavel();
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
      case SimpleJavaPackage.VARIABLE_DECLARATION__MODIFICADOR:
        setModificador((MODIFIER)newValue);
        return;
      case SimpleJavaPackage.VARIABLE_DECLARATION__TIPO_VARIAVEL:
        setTipoVariavel((type)newValue);
        return;
      case SimpleJavaPackage.VARIABLE_DECLARATION__DECLARACAO_VARIAVEIS:
        getDeclaracaoVariaveis().clear();
        getDeclaracaoVariaveis().addAll((Collection<? extends variable_declarator>)newValue);
        return;
      case SimpleJavaPackage.VARIABLE_DECLARATION__BLOCO_VARIAVEL:
        setBlocoVariavel((statement_block)newValue);
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
      case SimpleJavaPackage.VARIABLE_DECLARATION__MODIFICADOR:
        setModificador((MODIFIER)null);
        return;
      case SimpleJavaPackage.VARIABLE_DECLARATION__TIPO_VARIAVEL:
        setTipoVariavel((type)null);
        return;
      case SimpleJavaPackage.VARIABLE_DECLARATION__DECLARACAO_VARIAVEIS:
        getDeclaracaoVariaveis().clear();
        return;
      case SimpleJavaPackage.VARIABLE_DECLARATION__BLOCO_VARIAVEL:
        setBlocoVariavel((statement_block)null);
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
      case SimpleJavaPackage.VARIABLE_DECLARATION__MODIFICADOR:
        return modificador != null;
      case SimpleJavaPackage.VARIABLE_DECLARATION__TIPO_VARIAVEL:
        return tipoVariavel != null;
      case SimpleJavaPackage.VARIABLE_DECLARATION__DECLARACAO_VARIAVEIS:
        return declaracaoVariaveis != null && !declaracaoVariaveis.isEmpty();
      case SimpleJavaPackage.VARIABLE_DECLARATION__BLOCO_VARIAVEL:
        return blocoVariavel != null;
    }
    return super.eIsSet(featureID);
  }

} //variable_declarationImpl
