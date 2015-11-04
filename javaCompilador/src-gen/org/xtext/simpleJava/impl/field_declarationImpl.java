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
import org.xtext.simpleJava.constructor_declaration;
import org.xtext.simpleJava.doc_comment;
import org.xtext.simpleJava.field_declaration;
import org.xtext.simpleJava.method_declaration;
import org.xtext.simpleJava.static_initializer;
import org.xtext.simpleJava.variable_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>field declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.field_declarationImpl#getComentario <em>Comentario</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.field_declarationImpl#getDeclaracaoMetodo <em>Declaracao Metodo</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.field_declarationImpl#getDeclaracaoConstrutor <em>Declaracao Construtor</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.field_declarationImpl#getDeclaracaoVariavel <em>Declaracao Variavel</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.field_declarationImpl#getEstatico <em>Estatico</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class field_declarationImpl extends MinimalEObjectImpl.Container implements field_declaration
{
  /**
   * The cached value of the '{@link #getComentario() <em>Comentario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComentario()
   * @generated
   * @ordered
   */
  protected doc_comment comentario;

  /**
   * The cached value of the '{@link #getDeclaracaoMetodo() <em>Declaracao Metodo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaracaoMetodo()
   * @generated
   * @ordered
   */
  protected method_declaration declaracaoMetodo;

  /**
   * The cached value of the '{@link #getDeclaracaoConstrutor() <em>Declaracao Construtor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaracaoConstrutor()
   * @generated
   * @ordered
   */
  protected constructor_declaration declaracaoConstrutor;

  /**
   * The cached value of the '{@link #getDeclaracaoVariavel() <em>Declaracao Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaracaoVariavel()
   * @generated
   * @ordered
   */
  protected variable_declaration declaracaoVariavel;

  /**
   * The cached value of the '{@link #getEstatico() <em>Estatico</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstatico()
   * @generated
   * @ordered
   */
  protected static_initializer estatico;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected field_declarationImpl()
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
    return SimpleJavaPackage.Literals.FIELD_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public doc_comment getComentario()
  {
    return comentario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComentario(doc_comment newComentario, NotificationChain msgs)
  {
    doc_comment oldComentario = comentario;
    comentario = newComentario;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FIELD_DECLARATION__COMENTARIO, oldComentario, newComentario);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComentario(doc_comment newComentario)
  {
    if (newComentario != comentario)
    {
      NotificationChain msgs = null;
      if (comentario != null)
        msgs = ((InternalEObject)comentario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FIELD_DECLARATION__COMENTARIO, null, msgs);
      if (newComentario != null)
        msgs = ((InternalEObject)newComentario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FIELD_DECLARATION__COMENTARIO, null, msgs);
      msgs = basicSetComentario(newComentario, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FIELD_DECLARATION__COMENTARIO, newComentario, newComentario));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public method_declaration getDeclaracaoMetodo()
  {
    return declaracaoMetodo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaracaoMetodo(method_declaration newDeclaracaoMetodo, NotificationChain msgs)
  {
    method_declaration oldDeclaracaoMetodo = declaracaoMetodo;
    declaracaoMetodo = newDeclaracaoMetodo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_METODO, oldDeclaracaoMetodo, newDeclaracaoMetodo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaracaoMetodo(method_declaration newDeclaracaoMetodo)
  {
    if (newDeclaracaoMetodo != declaracaoMetodo)
    {
      NotificationChain msgs = null;
      if (declaracaoMetodo != null)
        msgs = ((InternalEObject)declaracaoMetodo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_METODO, null, msgs);
      if (newDeclaracaoMetodo != null)
        msgs = ((InternalEObject)newDeclaracaoMetodo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_METODO, null, msgs);
      msgs = basicSetDeclaracaoMetodo(newDeclaracaoMetodo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_METODO, newDeclaracaoMetodo, newDeclaracaoMetodo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constructor_declaration getDeclaracaoConstrutor()
  {
    return declaracaoConstrutor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaracaoConstrutor(constructor_declaration newDeclaracaoConstrutor, NotificationChain msgs)
  {
    constructor_declaration oldDeclaracaoConstrutor = declaracaoConstrutor;
    declaracaoConstrutor = newDeclaracaoConstrutor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_CONSTRUTOR, oldDeclaracaoConstrutor, newDeclaracaoConstrutor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaracaoConstrutor(constructor_declaration newDeclaracaoConstrutor)
  {
    if (newDeclaracaoConstrutor != declaracaoConstrutor)
    {
      NotificationChain msgs = null;
      if (declaracaoConstrutor != null)
        msgs = ((InternalEObject)declaracaoConstrutor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_CONSTRUTOR, null, msgs);
      if (newDeclaracaoConstrutor != null)
        msgs = ((InternalEObject)newDeclaracaoConstrutor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_CONSTRUTOR, null, msgs);
      msgs = basicSetDeclaracaoConstrutor(newDeclaracaoConstrutor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_CONSTRUTOR, newDeclaracaoConstrutor, newDeclaracaoConstrutor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_declaration getDeclaracaoVariavel()
  {
    return declaracaoVariavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaracaoVariavel(variable_declaration newDeclaracaoVariavel, NotificationChain msgs)
  {
    variable_declaration oldDeclaracaoVariavel = declaracaoVariavel;
    declaracaoVariavel = newDeclaracaoVariavel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_VARIAVEL, oldDeclaracaoVariavel, newDeclaracaoVariavel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaracaoVariavel(variable_declaration newDeclaracaoVariavel)
  {
    if (newDeclaracaoVariavel != declaracaoVariavel)
    {
      NotificationChain msgs = null;
      if (declaracaoVariavel != null)
        msgs = ((InternalEObject)declaracaoVariavel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_VARIAVEL, null, msgs);
      if (newDeclaracaoVariavel != null)
        msgs = ((InternalEObject)newDeclaracaoVariavel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_VARIAVEL, null, msgs);
      msgs = basicSetDeclaracaoVariavel(newDeclaracaoVariavel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_VARIAVEL, newDeclaracaoVariavel, newDeclaracaoVariavel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static_initializer getEstatico()
  {
    return estatico;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEstatico(static_initializer newEstatico, NotificationChain msgs)
  {
    static_initializer oldEstatico = estatico;
    estatico = newEstatico;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FIELD_DECLARATION__ESTATICO, oldEstatico, newEstatico);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEstatico(static_initializer newEstatico)
  {
    if (newEstatico != estatico)
    {
      NotificationChain msgs = null;
      if (estatico != null)
        msgs = ((InternalEObject)estatico).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FIELD_DECLARATION__ESTATICO, null, msgs);
      if (newEstatico != null)
        msgs = ((InternalEObject)newEstatico).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.FIELD_DECLARATION__ESTATICO, null, msgs);
      msgs = basicSetEstatico(newEstatico, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.FIELD_DECLARATION__ESTATICO, newEstatico, newEstatico));
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
      case SimpleJavaPackage.FIELD_DECLARATION__COMENTARIO:
        return basicSetComentario(null, msgs);
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_METODO:
        return basicSetDeclaracaoMetodo(null, msgs);
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_CONSTRUTOR:
        return basicSetDeclaracaoConstrutor(null, msgs);
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_VARIAVEL:
        return basicSetDeclaracaoVariavel(null, msgs);
      case SimpleJavaPackage.FIELD_DECLARATION__ESTATICO:
        return basicSetEstatico(null, msgs);
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
      case SimpleJavaPackage.FIELD_DECLARATION__COMENTARIO:
        return getComentario();
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_METODO:
        return getDeclaracaoMetodo();
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_CONSTRUTOR:
        return getDeclaracaoConstrutor();
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_VARIAVEL:
        return getDeclaracaoVariavel();
      case SimpleJavaPackage.FIELD_DECLARATION__ESTATICO:
        return getEstatico();
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
      case SimpleJavaPackage.FIELD_DECLARATION__COMENTARIO:
        setComentario((doc_comment)newValue);
        return;
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_METODO:
        setDeclaracaoMetodo((method_declaration)newValue);
        return;
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_CONSTRUTOR:
        setDeclaracaoConstrutor((constructor_declaration)newValue);
        return;
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_VARIAVEL:
        setDeclaracaoVariavel((variable_declaration)newValue);
        return;
      case SimpleJavaPackage.FIELD_DECLARATION__ESTATICO:
        setEstatico((static_initializer)newValue);
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
      case SimpleJavaPackage.FIELD_DECLARATION__COMENTARIO:
        setComentario((doc_comment)null);
        return;
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_METODO:
        setDeclaracaoMetodo((method_declaration)null);
        return;
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_CONSTRUTOR:
        setDeclaracaoConstrutor((constructor_declaration)null);
        return;
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_VARIAVEL:
        setDeclaracaoVariavel((variable_declaration)null);
        return;
      case SimpleJavaPackage.FIELD_DECLARATION__ESTATICO:
        setEstatico((static_initializer)null);
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
      case SimpleJavaPackage.FIELD_DECLARATION__COMENTARIO:
        return comentario != null;
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_METODO:
        return declaracaoMetodo != null;
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_CONSTRUTOR:
        return declaracaoConstrutor != null;
      case SimpleJavaPackage.FIELD_DECLARATION__DECLARACAO_VARIAVEL:
        return declaracaoVariavel != null;
      case SimpleJavaPackage.FIELD_DECLARATION__ESTATICO:
        return estatico != null;
    }
    return super.eIsSet(featureID);
  }

} //field_declarationImpl
