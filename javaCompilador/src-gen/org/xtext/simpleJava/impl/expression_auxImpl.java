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
import org.xtext.simpleJava.arglist;
import org.xtext.simpleJava.expression;
import org.xtext.simpleJava.expression_aux;
import org.xtext.simpleJava.mais_aux;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression aux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.expression_auxImpl#getParametros <em>Parametros</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.expression_auxImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.expression_auxImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.expression_auxImpl#getOperador <em>Operador</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.expression_auxImpl#getExpressoes <em>Expressoes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class expression_auxImpl extends MinimalEObjectImpl.Container implements expression_aux
{
  /**
   * The cached value of the '{@link #getParametros() <em>Parametros</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParametros()
   * @generated
   * @ordered
   */
  protected arglist parametros;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected expression exp;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected mais_aux op;

  /**
   * The default value of the '{@link #getOperador() <em>Operador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperador()
   * @generated
   * @ordered
   */
  protected static final String OPERADOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperador() <em>Operador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperador()
   * @generated
   * @ordered
   */
  protected String operador = OPERADOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpressoes() <em>Expressoes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressoes()
   * @generated
   * @ordered
   */
  protected expression_aux expressoes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected expression_auxImpl()
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
    return SimpleJavaPackage.Literals.EXPRESSION_AUX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arglist getParametros()
  {
    return parametros;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParametros(arglist newParametros, NotificationChain msgs)
  {
    arglist oldParametros = parametros;
    parametros = newParametros;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION_AUX__PARAMETROS, oldParametros, newParametros);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParametros(arglist newParametros)
  {
    if (newParametros != parametros)
    {
      NotificationChain msgs = null;
      if (parametros != null)
        msgs = ((InternalEObject)parametros).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION_AUX__PARAMETROS, null, msgs);
      if (newParametros != null)
        msgs = ((InternalEObject)newParametros).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION_AUX__PARAMETROS, null, msgs);
      msgs = basicSetParametros(newParametros, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION_AUX__PARAMETROS, newParametros, newParametros));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(expression newExp, NotificationChain msgs)
  {
    expression oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION_AUX__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(expression newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION_AUX__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION_AUX__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION_AUX__EXP, newExp, newExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mais_aux getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp(mais_aux newOp, NotificationChain msgs)
  {
    mais_aux oldOp = op;
    op = newOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION_AUX__OP, oldOp, newOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(mais_aux newOp)
  {
    if (newOp != op)
    {
      NotificationChain msgs = null;
      if (op != null)
        msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION_AUX__OP, null, msgs);
      if (newOp != null)
        msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION_AUX__OP, null, msgs);
      msgs = basicSetOp(newOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION_AUX__OP, newOp, newOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperador()
  {
    return operador;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperador(String newOperador)
  {
    String oldOperador = operador;
    operador = newOperador;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION_AUX__OPERADOR, oldOperador, operador));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_aux getExpressoes()
  {
    return expressoes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressoes(expression_aux newExpressoes, NotificationChain msgs)
  {
    expression_aux oldExpressoes = expressoes;
    expressoes = newExpressoes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES, oldExpressoes, newExpressoes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressoes(expression_aux newExpressoes)
  {
    if (newExpressoes != expressoes)
    {
      NotificationChain msgs = null;
      if (expressoes != null)
        msgs = ((InternalEObject)expressoes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES, null, msgs);
      if (newExpressoes != null)
        msgs = ((InternalEObject)newExpressoes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES, null, msgs);
      msgs = basicSetExpressoes(newExpressoes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES, newExpressoes, newExpressoes));
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
      case SimpleJavaPackage.EXPRESSION_AUX__PARAMETROS:
        return basicSetParametros(null, msgs);
      case SimpleJavaPackage.EXPRESSION_AUX__EXP:
        return basicSetExp(null, msgs);
      case SimpleJavaPackage.EXPRESSION_AUX__OP:
        return basicSetOp(null, msgs);
      case SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES:
        return basicSetExpressoes(null, msgs);
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
      case SimpleJavaPackage.EXPRESSION_AUX__PARAMETROS:
        return getParametros();
      case SimpleJavaPackage.EXPRESSION_AUX__EXP:
        return getExp();
      case SimpleJavaPackage.EXPRESSION_AUX__OP:
        return getOp();
      case SimpleJavaPackage.EXPRESSION_AUX__OPERADOR:
        return getOperador();
      case SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES:
        return getExpressoes();
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
      case SimpleJavaPackage.EXPRESSION_AUX__PARAMETROS:
        setParametros((arglist)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION_AUX__EXP:
        setExp((expression)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION_AUX__OP:
        setOp((mais_aux)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION_AUX__OPERADOR:
        setOperador((String)newValue);
        return;
      case SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES:
        setExpressoes((expression_aux)newValue);
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
      case SimpleJavaPackage.EXPRESSION_AUX__PARAMETROS:
        setParametros((arglist)null);
        return;
      case SimpleJavaPackage.EXPRESSION_AUX__EXP:
        setExp((expression)null);
        return;
      case SimpleJavaPackage.EXPRESSION_AUX__OP:
        setOp((mais_aux)null);
        return;
      case SimpleJavaPackage.EXPRESSION_AUX__OPERADOR:
        setOperador(OPERADOR_EDEFAULT);
        return;
      case SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES:
        setExpressoes((expression_aux)null);
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
      case SimpleJavaPackage.EXPRESSION_AUX__PARAMETROS:
        return parametros != null;
      case SimpleJavaPackage.EXPRESSION_AUX__EXP:
        return exp != null;
      case SimpleJavaPackage.EXPRESSION_AUX__OP:
        return op != null;
      case SimpleJavaPackage.EXPRESSION_AUX__OPERADOR:
        return OPERADOR_EDEFAULT == null ? operador != null : !OPERADOR_EDEFAULT.equals(operador);
      case SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES:
        return expressoes != null;
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
    result.append(" (operador: ");
    result.append(operador);
    result.append(')');
    return result.toString();
  }

} //expression_auxImpl
