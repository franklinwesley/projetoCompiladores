/**
 */
package org.xtext.example.simpleJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.simpleJava.SimpleJavaPackage;
import org.xtext.example.simpleJava.class_declaration;
import org.xtext.example.simpleJava.interface_declaration;
import org.xtext.example.simpleJava.type_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.type_declarationImpl#getDeclaracaoClasse <em>Declaracao Classe</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.type_declarationImpl#getDeclaracaoInterface <em>Declaracao Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class type_declarationImpl extends MinimalEObjectImpl.Container implements type_declaration
{
  /**
   * The cached value of the '{@link #getDeclaracaoClasse() <em>Declaracao Classe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaracaoClasse()
   * @generated
   * @ordered
   */
  protected class_declaration declaracaoClasse;

  /**
   * The cached value of the '{@link #getDeclaracaoInterface() <em>Declaracao Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaracaoInterface()
   * @generated
   * @ordered
   */
  protected interface_declaration declaracaoInterface;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected type_declarationImpl()
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
    return SimpleJavaPackage.Literals.TYPE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public class_declaration getDeclaracaoClasse()
  {
    return declaracaoClasse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaracaoClasse(class_declaration newDeclaracaoClasse, NotificationChain msgs)
  {
    class_declaration oldDeclaracaoClasse = declaracaoClasse;
    declaracaoClasse = newDeclaracaoClasse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_CLASSE, oldDeclaracaoClasse, newDeclaracaoClasse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaracaoClasse(class_declaration newDeclaracaoClasse)
  {
    if (newDeclaracaoClasse != declaracaoClasse)
    {
      NotificationChain msgs = null;
      if (declaracaoClasse != null)
        msgs = ((InternalEObject)declaracaoClasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_CLASSE, null, msgs);
      if (newDeclaracaoClasse != null)
        msgs = ((InternalEObject)newDeclaracaoClasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_CLASSE, null, msgs);
      msgs = basicSetDeclaracaoClasse(newDeclaracaoClasse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_CLASSE, newDeclaracaoClasse, newDeclaracaoClasse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interface_declaration getDeclaracaoInterface()
  {
    return declaracaoInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaracaoInterface(interface_declaration newDeclaracaoInterface, NotificationChain msgs)
  {
    interface_declaration oldDeclaracaoInterface = declaracaoInterface;
    declaracaoInterface = newDeclaracaoInterface;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_INTERFACE, oldDeclaracaoInterface, newDeclaracaoInterface);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaracaoInterface(interface_declaration newDeclaracaoInterface)
  {
    if (newDeclaracaoInterface != declaracaoInterface)
    {
      NotificationChain msgs = null;
      if (declaracaoInterface != null)
        msgs = ((InternalEObject)declaracaoInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_INTERFACE, null, msgs);
      if (newDeclaracaoInterface != null)
        msgs = ((InternalEObject)newDeclaracaoInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_INTERFACE, null, msgs);
      msgs = basicSetDeclaracaoInterface(newDeclaracaoInterface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_INTERFACE, newDeclaracaoInterface, newDeclaracaoInterface));
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
      case SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_CLASSE:
        return basicSetDeclaracaoClasse(null, msgs);
      case SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_INTERFACE:
        return basicSetDeclaracaoInterface(null, msgs);
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
      case SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_CLASSE:
        return getDeclaracaoClasse();
      case SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_INTERFACE:
        return getDeclaracaoInterface();
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
      case SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_CLASSE:
        setDeclaracaoClasse((class_declaration)newValue);
        return;
      case SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_INTERFACE:
        setDeclaracaoInterface((interface_declaration)newValue);
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
      case SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_CLASSE:
        setDeclaracaoClasse((class_declaration)null);
        return;
      case SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_INTERFACE:
        setDeclaracaoInterface((interface_declaration)null);
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
      case SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_CLASSE:
        return declaracaoClasse != null;
      case SimpleJavaPackage.TYPE_DECLARATION__DECLARACAO_INTERFACE:
        return declaracaoInterface != null;
    }
    return super.eIsSet(featureID);
  }

} //type_declarationImpl
