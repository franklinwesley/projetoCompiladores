/**
 */
package org.xtext.simpleJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.simpleJava.MODIFIER;
import org.xtext.simpleJava.SimpleJavaPackage;
import org.xtext.simpleJava.constructor_declaration;
import org.xtext.simpleJava.parameter_list;
import org.xtext.simpleJava.statement_block;
import org.xtext.simpleJava.type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constructor declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.constructor_declarationImpl#getModificador <em>Modificador</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.constructor_declarationImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.constructor_declarationImpl#getNomeContrutor <em>Nome Contrutor</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.constructor_declarationImpl#getParametrosContrutor <em>Parametros Contrutor</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.constructor_declarationImpl#getBlocoConstrutor <em>Bloco Construtor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class constructor_declarationImpl extends newBlockImpl implements constructor_declaration
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
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected type tipo;

  /**
   * The default value of the '{@link #getNomeContrutor() <em>Nome Contrutor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeContrutor()
   * @generated
   * @ordered
   */
  protected static final String NOME_CONTRUTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNomeContrutor() <em>Nome Contrutor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeContrutor()
   * @generated
   * @ordered
   */
  protected String nomeContrutor = NOME_CONTRUTOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getParametrosContrutor() <em>Parametros Contrutor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParametrosContrutor()
   * @generated
   * @ordered
   */
  protected parameter_list parametrosContrutor;

  /**
   * The cached value of the '{@link #getBlocoConstrutor() <em>Bloco Construtor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocoConstrutor()
   * @generated
   * @ordered
   */
  protected statement_block blocoConstrutor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected constructor_declarationImpl()
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
    return SimpleJavaPackage.Literals.CONSTRUCTOR_DECLARATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CONSTRUCTOR_DECLARATION__MODIFICADOR, oldModificador, newModificador);
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
        msgs = ((InternalEObject)modificador).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CONSTRUCTOR_DECLARATION__MODIFICADOR, null, msgs);
      if (newModificador != null)
        msgs = ((InternalEObject)newModificador).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CONSTRUCTOR_DECLARATION__MODIFICADOR, null, msgs);
      msgs = basicSetModificador(newModificador, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CONSTRUCTOR_DECLARATION__MODIFICADOR, newModificador, newModificador));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipo(type newTipo, NotificationChain msgs)
  {
    type oldTipo = tipo;
    tipo = newTipo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CONSTRUCTOR_DECLARATION__TIPO, oldTipo, newTipo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipo(type newTipo)
  {
    if (newTipo != tipo)
    {
      NotificationChain msgs = null;
      if (tipo != null)
        msgs = ((InternalEObject)tipo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CONSTRUCTOR_DECLARATION__TIPO, null, msgs);
      if (newTipo != null)
        msgs = ((InternalEObject)newTipo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CONSTRUCTOR_DECLARATION__TIPO, null, msgs);
      msgs = basicSetTipo(newTipo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CONSTRUCTOR_DECLARATION__TIPO, newTipo, newTipo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNomeContrutor()
  {
    return nomeContrutor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNomeContrutor(String newNomeContrutor)
  {
    String oldNomeContrutor = nomeContrutor;
    nomeContrutor = newNomeContrutor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CONSTRUCTOR_DECLARATION__NOME_CONTRUTOR, oldNomeContrutor, nomeContrutor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_list getParametrosContrutor()
  {
    return parametrosContrutor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParametrosContrutor(parameter_list newParametrosContrutor, NotificationChain msgs)
  {
    parameter_list oldParametrosContrutor = parametrosContrutor;
    parametrosContrutor = newParametrosContrutor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CONSTRUCTOR_DECLARATION__PARAMETROS_CONTRUTOR, oldParametrosContrutor, newParametrosContrutor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParametrosContrutor(parameter_list newParametrosContrutor)
  {
    if (newParametrosContrutor != parametrosContrutor)
    {
      NotificationChain msgs = null;
      if (parametrosContrutor != null)
        msgs = ((InternalEObject)parametrosContrutor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CONSTRUCTOR_DECLARATION__PARAMETROS_CONTRUTOR, null, msgs);
      if (newParametrosContrutor != null)
        msgs = ((InternalEObject)newParametrosContrutor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CONSTRUCTOR_DECLARATION__PARAMETROS_CONTRUTOR, null, msgs);
      msgs = basicSetParametrosContrutor(newParametrosContrutor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CONSTRUCTOR_DECLARATION__PARAMETROS_CONTRUTOR, newParametrosContrutor, newParametrosContrutor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_block getBlocoConstrutor()
  {
    return blocoConstrutor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocoConstrutor(statement_block newBlocoConstrutor, NotificationChain msgs)
  {
    statement_block oldBlocoConstrutor = blocoConstrutor;
    blocoConstrutor = newBlocoConstrutor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CONSTRUCTOR_DECLARATION__BLOCO_CONSTRUTOR, oldBlocoConstrutor, newBlocoConstrutor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocoConstrutor(statement_block newBlocoConstrutor)
  {
    if (newBlocoConstrutor != blocoConstrutor)
    {
      NotificationChain msgs = null;
      if (blocoConstrutor != null)
        msgs = ((InternalEObject)blocoConstrutor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CONSTRUCTOR_DECLARATION__BLOCO_CONSTRUTOR, null, msgs);
      if (newBlocoConstrutor != null)
        msgs = ((InternalEObject)newBlocoConstrutor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CONSTRUCTOR_DECLARATION__BLOCO_CONSTRUTOR, null, msgs);
      msgs = basicSetBlocoConstrutor(newBlocoConstrutor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CONSTRUCTOR_DECLARATION__BLOCO_CONSTRUTOR, newBlocoConstrutor, newBlocoConstrutor));
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
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__MODIFICADOR:
        return basicSetModificador(null, msgs);
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__TIPO:
        return basicSetTipo(null, msgs);
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__PARAMETROS_CONTRUTOR:
        return basicSetParametrosContrutor(null, msgs);
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__BLOCO_CONSTRUTOR:
        return basicSetBlocoConstrutor(null, msgs);
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
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__MODIFICADOR:
        return getModificador();
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__TIPO:
        return getTipo();
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__NOME_CONTRUTOR:
        return getNomeContrutor();
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__PARAMETROS_CONTRUTOR:
        return getParametrosContrutor();
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__BLOCO_CONSTRUTOR:
        return getBlocoConstrutor();
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
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__MODIFICADOR:
        setModificador((MODIFIER)newValue);
        return;
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__TIPO:
        setTipo((type)newValue);
        return;
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__NOME_CONTRUTOR:
        setNomeContrutor((String)newValue);
        return;
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__PARAMETROS_CONTRUTOR:
        setParametrosContrutor((parameter_list)newValue);
        return;
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__BLOCO_CONSTRUTOR:
        setBlocoConstrutor((statement_block)newValue);
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
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__MODIFICADOR:
        setModificador((MODIFIER)null);
        return;
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__TIPO:
        setTipo((type)null);
        return;
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__NOME_CONTRUTOR:
        setNomeContrutor(NOME_CONTRUTOR_EDEFAULT);
        return;
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__PARAMETROS_CONTRUTOR:
        setParametrosContrutor((parameter_list)null);
        return;
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__BLOCO_CONSTRUTOR:
        setBlocoConstrutor((statement_block)null);
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
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__MODIFICADOR:
        return modificador != null;
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__TIPO:
        return tipo != null;
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__NOME_CONTRUTOR:
        return NOME_CONTRUTOR_EDEFAULT == null ? nomeContrutor != null : !NOME_CONTRUTOR_EDEFAULT.equals(nomeContrutor);
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__PARAMETROS_CONTRUTOR:
        return parametrosContrutor != null;
      case SimpleJavaPackage.CONSTRUCTOR_DECLARATION__BLOCO_CONSTRUTOR:
        return blocoConstrutor != null;
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
    result.append(" (nomeContrutor: ");
    result.append(nomeContrutor);
    result.append(')');
    return result.toString();
  }

} //constructor_declarationImpl
