/**
 */
package org.xtext.simpleJava.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.simpleJava.SimpleJavaPackage;
import org.xtext.simpleJava.literal_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>literal expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.literal_expressionImpl#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.literal_expressionImpl#getInteiro <em>Inteiro</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.literal_expressionImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.literal_expressionImpl#getString <em>String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class literal_expressionImpl extends MinimalEObjectImpl.Container implements literal_expression
{
  /**
   * The default value of the '{@link #getDecimal() <em>Decimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimal()
   * @generated
   * @ordered
   */
  protected static final String DECIMAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDecimal() <em>Decimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimal()
   * @generated
   * @ordered
   */
  protected String decimal = DECIMAL_EDEFAULT;

  /**
   * The default value of the '{@link #getInteiro() <em>Inteiro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteiro()
   * @generated
   * @ordered
   */
  protected static final String INTEIRO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInteiro() <em>Inteiro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteiro()
   * @generated
   * @ordered
   */
  protected String inteiro = INTEIRO_EDEFAULT;

  /**
   * The default value of the '{@link #getFloat() <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloat()
   * @generated
   * @ordered
   */
  protected static final String FLOAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFloat() <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloat()
   * @generated
   * @ordered
   */
  protected String float_ = FLOAT_EDEFAULT;

  /**
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected literal_expressionImpl()
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
    return SimpleJavaPackage.Literals.LITERAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDecimal()
  {
    return decimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecimal(String newDecimal)
  {
    String oldDecimal = decimal;
    decimal = newDecimal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.LITERAL_EXPRESSION__DECIMAL, oldDecimal, decimal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInteiro()
  {
    return inteiro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteiro(String newInteiro)
  {
    String oldInteiro = inteiro;
    inteiro = newInteiro;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.LITERAL_EXPRESSION__INTEIRO, oldInteiro, inteiro));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFloat()
  {
    return float_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFloat(String newFloat)
  {
    String oldFloat = float_;
    float_ = newFloat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.LITERAL_EXPRESSION__FLOAT, oldFloat, float_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.LITERAL_EXPRESSION__STRING, oldString, string));
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
      case SimpleJavaPackage.LITERAL_EXPRESSION__DECIMAL:
        return getDecimal();
      case SimpleJavaPackage.LITERAL_EXPRESSION__INTEIRO:
        return getInteiro();
      case SimpleJavaPackage.LITERAL_EXPRESSION__FLOAT:
        return getFloat();
      case SimpleJavaPackage.LITERAL_EXPRESSION__STRING:
        return getString();
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
      case SimpleJavaPackage.LITERAL_EXPRESSION__DECIMAL:
        setDecimal((String)newValue);
        return;
      case SimpleJavaPackage.LITERAL_EXPRESSION__INTEIRO:
        setInteiro((String)newValue);
        return;
      case SimpleJavaPackage.LITERAL_EXPRESSION__FLOAT:
        setFloat((String)newValue);
        return;
      case SimpleJavaPackage.LITERAL_EXPRESSION__STRING:
        setString((String)newValue);
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
      case SimpleJavaPackage.LITERAL_EXPRESSION__DECIMAL:
        setDecimal(DECIMAL_EDEFAULT);
        return;
      case SimpleJavaPackage.LITERAL_EXPRESSION__INTEIRO:
        setInteiro(INTEIRO_EDEFAULT);
        return;
      case SimpleJavaPackage.LITERAL_EXPRESSION__FLOAT:
        setFloat(FLOAT_EDEFAULT);
        return;
      case SimpleJavaPackage.LITERAL_EXPRESSION__STRING:
        setString(STRING_EDEFAULT);
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
      case SimpleJavaPackage.LITERAL_EXPRESSION__DECIMAL:
        return DECIMAL_EDEFAULT == null ? decimal != null : !DECIMAL_EDEFAULT.equals(decimal);
      case SimpleJavaPackage.LITERAL_EXPRESSION__INTEIRO:
        return INTEIRO_EDEFAULT == null ? inteiro != null : !INTEIRO_EDEFAULT.equals(inteiro);
      case SimpleJavaPackage.LITERAL_EXPRESSION__FLOAT:
        return FLOAT_EDEFAULT == null ? float_ != null : !FLOAT_EDEFAULT.equals(float_);
      case SimpleJavaPackage.LITERAL_EXPRESSION__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
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
    result.append(" (decimal: ");
    result.append(decimal);
    result.append(", inteiro: ");
    result.append(inteiro);
    result.append(", float: ");
    result.append(float_);
    result.append(", string: ");
    result.append(string);
    result.append(')');
    return result.toString();
  }

} //literal_expressionImpl
