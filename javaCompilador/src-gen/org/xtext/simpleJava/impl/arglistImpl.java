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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.simpleJava.SimpleJavaPackage;
import org.xtext.simpleJava.arglist;
import org.xtext.simpleJava.expression;
import org.xtext.simpleJava.expression_aux;
import org.xtext.simpleJava.type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>arglist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.arglistImpl#getOpedador <em>Opedador</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.arglistImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.arglistImpl#getOperador <em>Operador</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.arglistImpl#getExpressoes <em>Expressoes</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.arglistImpl#getExpressoesArgumentos <em>Expressoes Argumentos</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.arglistImpl#getTipoParametro <em>Tipo Parametro</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.arglistImpl#getNomeParametro <em>Nome Parametro</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class arglistImpl extends variable_declaratorImpl implements arglist
{
  /**
   * The default value of the '{@link #getOpedador() <em>Opedador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpedador()
   * @generated
   * @ordered
   */
  protected static final String OPEDADOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpedador() <em>Opedador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpedador()
   * @generated
   * @ordered
   */
  protected String opedador = OPEDADOR_EDEFAULT;

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
  public String getOpedador()
  {
    return opedador;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpedador(String newOpedador)
  {
    String oldOpedador = opedador;
    opedador = newOpedador;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.ARGLIST__OPEDADOR, oldOpedador, opedador));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.ARGLIST__EXP, oldExp, newExp);
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
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.ARGLIST__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.ARGLIST__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.ARGLIST__EXP, newExp, newExp));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.ARGLIST__OPERADOR, oldOperador, operador));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.ARGLIST__EXPRESSOES, oldExpressoes, newExpressoes);
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
        msgs = ((InternalEObject)expressoes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.ARGLIST__EXPRESSOES, null, msgs);
      if (newExpressoes != null)
        msgs = ((InternalEObject)newExpressoes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.ARGLIST__EXPRESSOES, null, msgs);
      msgs = basicSetExpressoes(newExpressoes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.ARGLIST__EXPRESSOES, newExpressoes, newExpressoes));
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
      case SimpleJavaPackage.ARGLIST__EXP:
        return basicSetExp(null, msgs);
      case SimpleJavaPackage.ARGLIST__EXPRESSOES:
        return basicSetExpressoes(null, msgs);
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
      case SimpleJavaPackage.ARGLIST__OPEDADOR:
        return getOpedador();
      case SimpleJavaPackage.ARGLIST__EXP:
        return getExp();
      case SimpleJavaPackage.ARGLIST__OPERADOR:
        return getOperador();
      case SimpleJavaPackage.ARGLIST__EXPRESSOES:
        return getExpressoes();
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
      case SimpleJavaPackage.ARGLIST__OPEDADOR:
        setOpedador((String)newValue);
        return;
      case SimpleJavaPackage.ARGLIST__EXP:
        setExp((expression)newValue);
        return;
      case SimpleJavaPackage.ARGLIST__OPERADOR:
        setOperador((String)newValue);
        return;
      case SimpleJavaPackage.ARGLIST__EXPRESSOES:
        setExpressoes((expression_aux)newValue);
        return;
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
      case SimpleJavaPackage.ARGLIST__OPEDADOR:
        setOpedador(OPEDADOR_EDEFAULT);
        return;
      case SimpleJavaPackage.ARGLIST__EXP:
        setExp((expression)null);
        return;
      case SimpleJavaPackage.ARGLIST__OPERADOR:
        setOperador(OPERADOR_EDEFAULT);
        return;
      case SimpleJavaPackage.ARGLIST__EXPRESSOES:
        setExpressoes((expression_aux)null);
        return;
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
      case SimpleJavaPackage.ARGLIST__OPEDADOR:
        return OPEDADOR_EDEFAULT == null ? opedador != null : !OPEDADOR_EDEFAULT.equals(opedador);
      case SimpleJavaPackage.ARGLIST__EXP:
        return exp != null;
      case SimpleJavaPackage.ARGLIST__OPERADOR:
        return OPERADOR_EDEFAULT == null ? operador != null : !OPERADOR_EDEFAULT.equals(operador);
      case SimpleJavaPackage.ARGLIST__EXPRESSOES:
        return expressoes != null;
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
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == expression_aux.class)
    {
      switch (derivedFeatureID)
      {
        case SimpleJavaPackage.ARGLIST__OPEDADOR: return SimpleJavaPackage.EXPRESSION_AUX__OPEDADOR;
        case SimpleJavaPackage.ARGLIST__EXP: return SimpleJavaPackage.EXPRESSION_AUX__EXP;
        case SimpleJavaPackage.ARGLIST__OPERADOR: return SimpleJavaPackage.EXPRESSION_AUX__OPERADOR;
        case SimpleJavaPackage.ARGLIST__EXPRESSOES: return SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == expression_aux.class)
    {
      switch (baseFeatureID)
      {
        case SimpleJavaPackage.EXPRESSION_AUX__OPEDADOR: return SimpleJavaPackage.ARGLIST__OPEDADOR;
        case SimpleJavaPackage.EXPRESSION_AUX__EXP: return SimpleJavaPackage.ARGLIST__EXP;
        case SimpleJavaPackage.EXPRESSION_AUX__OPERADOR: return SimpleJavaPackage.ARGLIST__OPERADOR;
        case SimpleJavaPackage.EXPRESSION_AUX__EXPRESSOES: return SimpleJavaPackage.ARGLIST__EXPRESSOES;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (opedador: ");
    result.append(opedador);
    result.append(", operador: ");
    result.append(operador);
    result.append(", nomeParametro: ");
    result.append(nomeParametro);
    result.append(')');
    return result.toString();
  }

} //arglistImpl
