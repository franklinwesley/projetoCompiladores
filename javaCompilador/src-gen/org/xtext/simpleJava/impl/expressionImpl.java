/**
 */
package org.xtext.simpleJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.simpleJava.SimpleJavaPackage;
import org.xtext.simpleJava.creating_expression;
import org.xtext.simpleJava.expression;
import org.xtext.simpleJava.literal_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.expressionImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.expressionImpl#getNovo <em>Novo</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.expressionImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.expressionImpl#getIdentificador <em>Identificador</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class expressionImpl extends expression_auxImpl implements expression
{
  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected EObject tipo;

  /**
   * The cached value of the '{@link #getNovo() <em>Novo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNovo()
   * @generated
   * @ordered
   */
  protected creating_expression novo;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected literal_expression literal;

  /**
   * The default value of the '{@link #getIdentificador() <em>Identificador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentificador()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFICADOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentificador() <em>Identificador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentificador()
   * @generated
   * @ordered
   */
  protected String identificador = IDENTIFICADOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected expressionImpl()
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
    return SimpleJavaPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipo(EObject newTipo, NotificationChain msgs)
  {
    EObject oldTipo = tipo;
    tipo = newTipo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__TIPO, oldTipo, newTipo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipo(EObject newTipo)
  {
    if (newTipo != tipo)
    {
      NotificationChain msgs = null;
      if (tipo != null)
        msgs = ((InternalEObject)tipo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__TIPO, null, msgs);
      if (newTipo != null)
        msgs = ((InternalEObject)newTipo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__TIPO, null, msgs);
      msgs = basicSetTipo(newTipo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__TIPO, newTipo, newTipo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public creating_expression getNovo()
  {
    return novo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNovo(creating_expression newNovo, NotificationChain msgs)
  {
    creating_expression oldNovo = novo;
    novo = newNovo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__NOVO, oldNovo, newNovo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNovo(creating_expression newNovo)
  {
    if (newNovo != novo)
    {
      NotificationChain msgs = null;
      if (novo != null)
        msgs = ((InternalEObject)novo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__NOVO, null, msgs);
      if (newNovo != null)
        msgs = ((InternalEObject)newNovo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__NOVO, null, msgs);
      msgs = basicSetNovo(newNovo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__NOVO, newNovo, newNovo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public literal_expression getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteral(literal_expression newLiteral, NotificationChain msgs)
  {
    literal_expression oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__LITERAL, oldLiteral, newLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(literal_expression newLiteral)
  {
    if (newLiteral != literal)
    {
      NotificationChain msgs = null;
      if (literal != null)
        msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__LITERAL, null, msgs);
      if (newLiteral != null)
        msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__LITERAL, null, msgs);
      msgs = basicSetLiteral(newLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__LITERAL, newLiteral, newLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentificador()
  {
    return identificador;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentificador(String newIdentificador)
  {
    String oldIdentificador = identificador;
    identificador = newIdentificador;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__IDENTIFICADOR, oldIdentificador, identificador));
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
      case SimpleJavaPackage.EXPRESSION__TIPO:
        return basicSetTipo(null, msgs);
      case SimpleJavaPackage.EXPRESSION__NOVO:
        return basicSetNovo(null, msgs);
      case SimpleJavaPackage.EXPRESSION__LITERAL:
        return basicSetLiteral(null, msgs);
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
      case SimpleJavaPackage.EXPRESSION__TIPO:
        return getTipo();
      case SimpleJavaPackage.EXPRESSION__NOVO:
        return getNovo();
      case SimpleJavaPackage.EXPRESSION__LITERAL:
        return getLiteral();
      case SimpleJavaPackage.EXPRESSION__IDENTIFICADOR:
        return getIdentificador();
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
      case SimpleJavaPackage.EXPRESSION__TIPO:
        setTipo((EObject)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION__NOVO:
        setNovo((creating_expression)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION__LITERAL:
        setLiteral((literal_expression)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION__IDENTIFICADOR:
        setIdentificador((String)newValue);
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
      case SimpleJavaPackage.EXPRESSION__TIPO:
        setTipo((EObject)null);
        return;
      case SimpleJavaPackage.EXPRESSION__NOVO:
        setNovo((creating_expression)null);
        return;
      case SimpleJavaPackage.EXPRESSION__LITERAL:
        setLiteral((literal_expression)null);
        return;
      case SimpleJavaPackage.EXPRESSION__IDENTIFICADOR:
        setIdentificador(IDENTIFICADOR_EDEFAULT);
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
      case SimpleJavaPackage.EXPRESSION__TIPO:
        return tipo != null;
      case SimpleJavaPackage.EXPRESSION__NOVO:
        return novo != null;
      case SimpleJavaPackage.EXPRESSION__LITERAL:
        return literal != null;
      case SimpleJavaPackage.EXPRESSION__IDENTIFICADOR:
        return IDENTIFICADOR_EDEFAULT == null ? identificador != null : !IDENTIFICADOR_EDEFAULT.equals(identificador);
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
    result.append(" (identificador: ");
    result.append(identificador);
    result.append(')');
    return result.toString();
  }

} //expressionImpl
