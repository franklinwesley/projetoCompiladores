/**
 */
package org.xtext.simpleJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.simpleJava.SimpleJavaPackage;
import org.xtext.simpleJava.bit_expression;
import org.xtext.simpleJava.creating_expression;
import org.xtext.simpleJava.expression;
import org.xtext.simpleJava.literal_expression;
import org.xtext.simpleJava.logical_expression;
import org.xtext.simpleJava.numeric_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.expressionImpl#getTipoLogical <em>Tipo Logical</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.expressionImpl#getTipoNumeric <em>Tipo Numeric</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.expressionImpl#getTipoBit <em>Tipo Bit</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.expressionImpl#getNew <em>New</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.expressionImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.expressionImpl#getIdentificador <em>Identificador</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.expressionImpl#getExpressao <em>Expressao</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class expressionImpl extends expression_auxImpl implements expression
{
  /**
   * The cached value of the '{@link #getTipoLogical() <em>Tipo Logical</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoLogical()
   * @generated
   * @ordered
   */
  protected logical_expression tipoLogical;

  /**
   * The cached value of the '{@link #getTipoNumeric() <em>Tipo Numeric</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoNumeric()
   * @generated
   * @ordered
   */
  protected numeric_expression tipoNumeric;

  /**
   * The cached value of the '{@link #getTipoBit() <em>Tipo Bit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoBit()
   * @generated
   * @ordered
   */
  protected bit_expression tipoBit;

  /**
   * The cached value of the '{@link #getNew() <em>New</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNew()
   * @generated
   * @ordered
   */
  protected creating_expression new_;

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
   * The cached value of the '{@link #getExpressao() <em>Expressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressao()
   * @generated
   * @ordered
   */
  protected expression expressao;

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
  public logical_expression getTipoLogical()
  {
    return tipoLogical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipoLogical(logical_expression newTipoLogical, NotificationChain msgs)
  {
    logical_expression oldTipoLogical = tipoLogical;
    tipoLogical = newTipoLogical;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__TIPO_LOGICAL, oldTipoLogical, newTipoLogical);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipoLogical(logical_expression newTipoLogical)
  {
    if (newTipoLogical != tipoLogical)
    {
      NotificationChain msgs = null;
      if (tipoLogical != null)
        msgs = ((InternalEObject)tipoLogical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__TIPO_LOGICAL, null, msgs);
      if (newTipoLogical != null)
        msgs = ((InternalEObject)newTipoLogical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__TIPO_LOGICAL, null, msgs);
      msgs = basicSetTipoLogical(newTipoLogical, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__TIPO_LOGICAL, newTipoLogical, newTipoLogical));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public numeric_expression getTipoNumeric()
  {
    return tipoNumeric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipoNumeric(numeric_expression newTipoNumeric, NotificationChain msgs)
  {
    numeric_expression oldTipoNumeric = tipoNumeric;
    tipoNumeric = newTipoNumeric;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__TIPO_NUMERIC, oldTipoNumeric, newTipoNumeric);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipoNumeric(numeric_expression newTipoNumeric)
  {
    if (newTipoNumeric != tipoNumeric)
    {
      NotificationChain msgs = null;
      if (tipoNumeric != null)
        msgs = ((InternalEObject)tipoNumeric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__TIPO_NUMERIC, null, msgs);
      if (newTipoNumeric != null)
        msgs = ((InternalEObject)newTipoNumeric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__TIPO_NUMERIC, null, msgs);
      msgs = basicSetTipoNumeric(newTipoNumeric, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__TIPO_NUMERIC, newTipoNumeric, newTipoNumeric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bit_expression getTipoBit()
  {
    return tipoBit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipoBit(bit_expression newTipoBit, NotificationChain msgs)
  {
    bit_expression oldTipoBit = tipoBit;
    tipoBit = newTipoBit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__TIPO_BIT, oldTipoBit, newTipoBit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipoBit(bit_expression newTipoBit)
  {
    if (newTipoBit != tipoBit)
    {
      NotificationChain msgs = null;
      if (tipoBit != null)
        msgs = ((InternalEObject)tipoBit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__TIPO_BIT, null, msgs);
      if (newTipoBit != null)
        msgs = ((InternalEObject)newTipoBit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__TIPO_BIT, null, msgs);
      msgs = basicSetTipoBit(newTipoBit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__TIPO_BIT, newTipoBit, newTipoBit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public creating_expression getNew()
  {
    return new_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNew(creating_expression newNew, NotificationChain msgs)
  {
    creating_expression oldNew = new_;
    new_ = newNew;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__NEW, oldNew, newNew);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNew(creating_expression newNew)
  {
    if (newNew != new_)
    {
      NotificationChain msgs = null;
      if (new_ != null)
        msgs = ((InternalEObject)new_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__NEW, null, msgs);
      if (newNew != null)
        msgs = ((InternalEObject)newNew).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__NEW, null, msgs);
      msgs = basicSetNew(newNew, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__NEW, newNew, newNew));
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
  public expression getExpressao()
  {
    return expressao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressao(expression newExpressao, NotificationChain msgs)
  {
    expression oldExpressao = expressao;
    expressao = newExpressao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__EXPRESSAO, oldExpressao, newExpressao);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressao(expression newExpressao)
  {
    if (newExpressao != expressao)
    {
      NotificationChain msgs = null;
      if (expressao != null)
        msgs = ((InternalEObject)expressao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__EXPRESSAO, null, msgs);
      if (newExpressao != null)
        msgs = ((InternalEObject)newExpressao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__EXPRESSAO, null, msgs);
      msgs = basicSetExpressao(newExpressao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__EXPRESSAO, newExpressao, newExpressao));
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
      case SimpleJavaPackage.EXPRESSION__TIPO_LOGICAL:
        return basicSetTipoLogical(null, msgs);
      case SimpleJavaPackage.EXPRESSION__TIPO_NUMERIC:
        return basicSetTipoNumeric(null, msgs);
      case SimpleJavaPackage.EXPRESSION__TIPO_BIT:
        return basicSetTipoBit(null, msgs);
      case SimpleJavaPackage.EXPRESSION__NEW:
        return basicSetNew(null, msgs);
      case SimpleJavaPackage.EXPRESSION__LITERAL:
        return basicSetLiteral(null, msgs);
      case SimpleJavaPackage.EXPRESSION__EXPRESSAO:
        return basicSetExpressao(null, msgs);
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
      case SimpleJavaPackage.EXPRESSION__TIPO_LOGICAL:
        return getTipoLogical();
      case SimpleJavaPackage.EXPRESSION__TIPO_NUMERIC:
        return getTipoNumeric();
      case SimpleJavaPackage.EXPRESSION__TIPO_BIT:
        return getTipoBit();
      case SimpleJavaPackage.EXPRESSION__NEW:
        return getNew();
      case SimpleJavaPackage.EXPRESSION__LITERAL:
        return getLiteral();
      case SimpleJavaPackage.EXPRESSION__IDENTIFICADOR:
        return getIdentificador();
      case SimpleJavaPackage.EXPRESSION__EXPRESSAO:
        return getExpressao();
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
      case SimpleJavaPackage.EXPRESSION__TIPO_LOGICAL:
        setTipoLogical((logical_expression)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION__TIPO_NUMERIC:
        setTipoNumeric((numeric_expression)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION__TIPO_BIT:
        setTipoBit((bit_expression)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION__NEW:
        setNew((creating_expression)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION__LITERAL:
        setLiteral((literal_expression)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION__IDENTIFICADOR:
        setIdentificador((String)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION__EXPRESSAO:
        setExpressao((expression)newValue);
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
      case SimpleJavaPackage.EXPRESSION__TIPO_LOGICAL:
        setTipoLogical((logical_expression)null);
        return;
      case SimpleJavaPackage.EXPRESSION__TIPO_NUMERIC:
        setTipoNumeric((numeric_expression)null);
        return;
      case SimpleJavaPackage.EXPRESSION__TIPO_BIT:
        setTipoBit((bit_expression)null);
        return;
      case SimpleJavaPackage.EXPRESSION__NEW:
        setNew((creating_expression)null);
        return;
      case SimpleJavaPackage.EXPRESSION__LITERAL:
        setLiteral((literal_expression)null);
        return;
      case SimpleJavaPackage.EXPRESSION__IDENTIFICADOR:
        setIdentificador(IDENTIFICADOR_EDEFAULT);
        return;
      case SimpleJavaPackage.EXPRESSION__EXPRESSAO:
        setExpressao((expression)null);
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
      case SimpleJavaPackage.EXPRESSION__TIPO_LOGICAL:
        return tipoLogical != null;
      case SimpleJavaPackage.EXPRESSION__TIPO_NUMERIC:
        return tipoNumeric != null;
      case SimpleJavaPackage.EXPRESSION__TIPO_BIT:
        return tipoBit != null;
      case SimpleJavaPackage.EXPRESSION__NEW:
        return new_ != null;
      case SimpleJavaPackage.EXPRESSION__LITERAL:
        return literal != null;
      case SimpleJavaPackage.EXPRESSION__IDENTIFICADOR:
        return IDENTIFICADOR_EDEFAULT == null ? identificador != null : !IDENTIFICADOR_EDEFAULT.equals(identificador);
      case SimpleJavaPackage.EXPRESSION__EXPRESSAO:
        return expressao != null;
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
