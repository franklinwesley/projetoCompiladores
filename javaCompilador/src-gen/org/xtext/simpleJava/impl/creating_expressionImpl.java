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
import org.xtext.simpleJava.creating_aux;
import org.xtext.simpleJava.creating_expression;
import org.xtext.simpleJava.expression;
import org.xtext.simpleJava.name;
import org.xtext.simpleJava.newBlock;
import org.xtext.simpleJava.type_specifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>creating expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.creating_expressionImpl#getNovoObjeto <em>Novo Objeto</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.creating_expressionImpl#getParametros <em>Parametros</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.creating_expressionImpl#getTipoObjeto <em>Tipo Objeto</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.creating_expressionImpl#getExpressaoNew <em>Expressao New</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.creating_expressionImpl#getNovo <em>Novo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class creating_expressionImpl extends MinimalEObjectImpl.Container implements creating_expression
{
  /**
   * The cached value of the '{@link #getNovoObjeto() <em>Novo Objeto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNovoObjeto()
   * @generated
   * @ordered
   */
  protected name novoObjeto;

  /**
   * The cached value of the '{@link #getParametros() <em>Parametros</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParametros()
   * @generated
   * @ordered
   */
  protected creating_aux parametros;

  /**
   * The cached value of the '{@link #getTipoObjeto() <em>Tipo Objeto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoObjeto()
   * @generated
   * @ordered
   */
  protected type_specifier tipoObjeto;

  /**
   * The cached value of the '{@link #getExpressaoNew() <em>Expressao New</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressaoNew()
   * @generated
   * @ordered
   */
  protected expression expressaoNew;

  /**
   * The cached value of the '{@link #getNovo() <em>Novo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNovo()
   * @generated
   * @ordered
   */
  protected newBlock novo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected creating_expressionImpl()
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
    return SimpleJavaPackage.Literals.CREATING_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public name getNovoObjeto()
  {
    return novoObjeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNovoObjeto(name newNovoObjeto, NotificationChain msgs)
  {
    name oldNovoObjeto = novoObjeto;
    novoObjeto = newNovoObjeto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CREATING_EXPRESSION__NOVO_OBJETO, oldNovoObjeto, newNovoObjeto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNovoObjeto(name newNovoObjeto)
  {
    if (newNovoObjeto != novoObjeto)
    {
      NotificationChain msgs = null;
      if (novoObjeto != null)
        msgs = ((InternalEObject)novoObjeto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CREATING_EXPRESSION__NOVO_OBJETO, null, msgs);
      if (newNovoObjeto != null)
        msgs = ((InternalEObject)newNovoObjeto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CREATING_EXPRESSION__NOVO_OBJETO, null, msgs);
      msgs = basicSetNovoObjeto(newNovoObjeto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CREATING_EXPRESSION__NOVO_OBJETO, newNovoObjeto, newNovoObjeto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public creating_aux getParametros()
  {
    return parametros;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParametros(creating_aux newParametros, NotificationChain msgs)
  {
    creating_aux oldParametros = parametros;
    parametros = newParametros;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CREATING_EXPRESSION__PARAMETROS, oldParametros, newParametros);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParametros(creating_aux newParametros)
  {
    if (newParametros != parametros)
    {
      NotificationChain msgs = null;
      if (parametros != null)
        msgs = ((InternalEObject)parametros).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CREATING_EXPRESSION__PARAMETROS, null, msgs);
      if (newParametros != null)
        msgs = ((InternalEObject)newParametros).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CREATING_EXPRESSION__PARAMETROS, null, msgs);
      msgs = basicSetParametros(newParametros, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CREATING_EXPRESSION__PARAMETROS, newParametros, newParametros));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_specifier getTipoObjeto()
  {
    return tipoObjeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipoObjeto(type_specifier newTipoObjeto, NotificationChain msgs)
  {
    type_specifier oldTipoObjeto = tipoObjeto;
    tipoObjeto = newTipoObjeto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CREATING_EXPRESSION__TIPO_OBJETO, oldTipoObjeto, newTipoObjeto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipoObjeto(type_specifier newTipoObjeto)
  {
    if (newTipoObjeto != tipoObjeto)
    {
      NotificationChain msgs = null;
      if (tipoObjeto != null)
        msgs = ((InternalEObject)tipoObjeto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CREATING_EXPRESSION__TIPO_OBJETO, null, msgs);
      if (newTipoObjeto != null)
        msgs = ((InternalEObject)newTipoObjeto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CREATING_EXPRESSION__TIPO_OBJETO, null, msgs);
      msgs = basicSetTipoObjeto(newTipoObjeto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CREATING_EXPRESSION__TIPO_OBJETO, newTipoObjeto, newTipoObjeto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpressaoNew()
  {
    return expressaoNew;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressaoNew(expression newExpressaoNew, NotificationChain msgs)
  {
    expression oldExpressaoNew = expressaoNew;
    expressaoNew = newExpressaoNew;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CREATING_EXPRESSION__EXPRESSAO_NEW, oldExpressaoNew, newExpressaoNew);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressaoNew(expression newExpressaoNew)
  {
    if (newExpressaoNew != expressaoNew)
    {
      NotificationChain msgs = null;
      if (expressaoNew != null)
        msgs = ((InternalEObject)expressaoNew).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CREATING_EXPRESSION__EXPRESSAO_NEW, null, msgs);
      if (newExpressaoNew != null)
        msgs = ((InternalEObject)newExpressaoNew).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CREATING_EXPRESSION__EXPRESSAO_NEW, null, msgs);
      msgs = basicSetExpressaoNew(newExpressaoNew, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CREATING_EXPRESSION__EXPRESSAO_NEW, newExpressaoNew, newExpressaoNew));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public newBlock getNovo()
  {
    return novo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNovo(newBlock newNovo, NotificationChain msgs)
  {
    newBlock oldNovo = novo;
    novo = newNovo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CREATING_EXPRESSION__NOVO, oldNovo, newNovo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNovo(newBlock newNovo)
  {
    if (newNovo != novo)
    {
      NotificationChain msgs = null;
      if (novo != null)
        msgs = ((InternalEObject)novo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CREATING_EXPRESSION__NOVO, null, msgs);
      if (newNovo != null)
        msgs = ((InternalEObject)newNovo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CREATING_EXPRESSION__NOVO, null, msgs);
      msgs = basicSetNovo(newNovo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CREATING_EXPRESSION__NOVO, newNovo, newNovo));
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
      case SimpleJavaPackage.CREATING_EXPRESSION__NOVO_OBJETO:
        return basicSetNovoObjeto(null, msgs);
      case SimpleJavaPackage.CREATING_EXPRESSION__PARAMETROS:
        return basicSetParametros(null, msgs);
      case SimpleJavaPackage.CREATING_EXPRESSION__TIPO_OBJETO:
        return basicSetTipoObjeto(null, msgs);
      case SimpleJavaPackage.CREATING_EXPRESSION__EXPRESSAO_NEW:
        return basicSetExpressaoNew(null, msgs);
      case SimpleJavaPackage.CREATING_EXPRESSION__NOVO:
        return basicSetNovo(null, msgs);
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
      case SimpleJavaPackage.CREATING_EXPRESSION__NOVO_OBJETO:
        return getNovoObjeto();
      case SimpleJavaPackage.CREATING_EXPRESSION__PARAMETROS:
        return getParametros();
      case SimpleJavaPackage.CREATING_EXPRESSION__TIPO_OBJETO:
        return getTipoObjeto();
      case SimpleJavaPackage.CREATING_EXPRESSION__EXPRESSAO_NEW:
        return getExpressaoNew();
      case SimpleJavaPackage.CREATING_EXPRESSION__NOVO:
        return getNovo();
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
      case SimpleJavaPackage.CREATING_EXPRESSION__NOVO_OBJETO:
        setNovoObjeto((name)newValue);
        return;
      case SimpleJavaPackage.CREATING_EXPRESSION__PARAMETROS:
        setParametros((creating_aux)newValue);
        return;
      case SimpleJavaPackage.CREATING_EXPRESSION__TIPO_OBJETO:
        setTipoObjeto((type_specifier)newValue);
        return;
      case SimpleJavaPackage.CREATING_EXPRESSION__EXPRESSAO_NEW:
        setExpressaoNew((expression)newValue);
        return;
      case SimpleJavaPackage.CREATING_EXPRESSION__NOVO:
        setNovo((newBlock)newValue);
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
      case SimpleJavaPackage.CREATING_EXPRESSION__NOVO_OBJETO:
        setNovoObjeto((name)null);
        return;
      case SimpleJavaPackage.CREATING_EXPRESSION__PARAMETROS:
        setParametros((creating_aux)null);
        return;
      case SimpleJavaPackage.CREATING_EXPRESSION__TIPO_OBJETO:
        setTipoObjeto((type_specifier)null);
        return;
      case SimpleJavaPackage.CREATING_EXPRESSION__EXPRESSAO_NEW:
        setExpressaoNew((expression)null);
        return;
      case SimpleJavaPackage.CREATING_EXPRESSION__NOVO:
        setNovo((newBlock)null);
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
      case SimpleJavaPackage.CREATING_EXPRESSION__NOVO_OBJETO:
        return novoObjeto != null;
      case SimpleJavaPackage.CREATING_EXPRESSION__PARAMETROS:
        return parametros != null;
      case SimpleJavaPackage.CREATING_EXPRESSION__TIPO_OBJETO:
        return tipoObjeto != null;
      case SimpleJavaPackage.CREATING_EXPRESSION__EXPRESSAO_NEW:
        return expressaoNew != null;
      case SimpleJavaPackage.CREATING_EXPRESSION__NOVO:
        return novo != null;
    }
    return super.eIsSet(featureID);
  }

} //creating_expressionImpl
