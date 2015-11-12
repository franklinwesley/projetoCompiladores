/**
 */
package org.xtext.example.simpleJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.simpleJava.SimpleJavaPackage;
import org.xtext.example.simpleJava.bit_expression;
import org.xtext.example.simpleJava.creating_expression;
import org.xtext.example.simpleJava.expression;
import org.xtext.example.simpleJava.literal_expression;
import org.xtext.example.simpleJava.logical_expression;
import org.xtext.example.simpleJava.numeric_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.expressionImpl#getLogical <em>Logical</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.expressionImpl#getNumeric <em>Numeric</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.expressionImpl#getBit <em>Bit</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.expressionImpl#getNovo <em>Novo</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.expressionImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.expressionImpl#getIdentificador <em>Identificador</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class expressionImpl extends expression_auxImpl implements expression
{
  /**
   * The cached value of the '{@link #getLogical() <em>Logical</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogical()
   * @generated
   * @ordered
   */
  protected logical_expression logical;

  /**
   * The cached value of the '{@link #getNumeric() <em>Numeric</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumeric()
   * @generated
   * @ordered
   */
  protected numeric_expression numeric;

  /**
   * The cached value of the '{@link #getBit() <em>Bit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBit()
   * @generated
   * @ordered
   */
  protected bit_expression bit;

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
  public logical_expression getLogical()
  {
    return logical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLogical(logical_expression newLogical, NotificationChain msgs)
  {
    logical_expression oldLogical = logical;
    logical = newLogical;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__LOGICAL, oldLogical, newLogical);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogical(logical_expression newLogical)
  {
    if (newLogical != logical)
    {
      NotificationChain msgs = null;
      if (logical != null)
        msgs = ((InternalEObject)logical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__LOGICAL, null, msgs);
      if (newLogical != null)
        msgs = ((InternalEObject)newLogical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__LOGICAL, null, msgs);
      msgs = basicSetLogical(newLogical, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__LOGICAL, newLogical, newLogical));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public numeric_expression getNumeric()
  {
    return numeric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumeric(numeric_expression newNumeric, NotificationChain msgs)
  {
    numeric_expression oldNumeric = numeric;
    numeric = newNumeric;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__NUMERIC, oldNumeric, newNumeric);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumeric(numeric_expression newNumeric)
  {
    if (newNumeric != numeric)
    {
      NotificationChain msgs = null;
      if (numeric != null)
        msgs = ((InternalEObject)numeric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__NUMERIC, null, msgs);
      if (newNumeric != null)
        msgs = ((InternalEObject)newNumeric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__NUMERIC, null, msgs);
      msgs = basicSetNumeric(newNumeric, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__NUMERIC, newNumeric, newNumeric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bit_expression getBit()
  {
    return bit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBit(bit_expression newBit, NotificationChain msgs)
  {
    bit_expression oldBit = bit;
    bit = newBit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__BIT, oldBit, newBit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBit(bit_expression newBit)
  {
    if (newBit != bit)
    {
      NotificationChain msgs = null;
      if (bit != null)
        msgs = ((InternalEObject)bit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__BIT, null, msgs);
      if (newBit != null)
        msgs = ((InternalEObject)newBit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION__BIT, null, msgs);
      msgs = basicSetBit(newBit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION__BIT, newBit, newBit));
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
      case SimpleJavaPackage.EXPRESSION__LOGICAL:
        return basicSetLogical(null, msgs);
      case SimpleJavaPackage.EXPRESSION__NUMERIC:
        return basicSetNumeric(null, msgs);
      case SimpleJavaPackage.EXPRESSION__BIT:
        return basicSetBit(null, msgs);
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
      case SimpleJavaPackage.EXPRESSION__LOGICAL:
        return getLogical();
      case SimpleJavaPackage.EXPRESSION__NUMERIC:
        return getNumeric();
      case SimpleJavaPackage.EXPRESSION__BIT:
        return getBit();
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
      case SimpleJavaPackage.EXPRESSION__LOGICAL:
        setLogical((logical_expression)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION__NUMERIC:
        setNumeric((numeric_expression)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION__BIT:
        setBit((bit_expression)newValue);
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
      case SimpleJavaPackage.EXPRESSION__LOGICAL:
        setLogical((logical_expression)null);
        return;
      case SimpleJavaPackage.EXPRESSION__NUMERIC:
        setNumeric((numeric_expression)null);
        return;
      case SimpleJavaPackage.EXPRESSION__BIT:
        setBit((bit_expression)null);
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
      case SimpleJavaPackage.EXPRESSION__LOGICAL:
        return logical != null;
      case SimpleJavaPackage.EXPRESSION__NUMERIC:
        return numeric != null;
      case SimpleJavaPackage.EXPRESSION__BIT:
        return bit != null;
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
