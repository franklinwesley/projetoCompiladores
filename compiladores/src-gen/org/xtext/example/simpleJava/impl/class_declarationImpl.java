/**
 */
package org.xtext.example.simpleJava.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.simpleJava.MODIFIER;
import org.xtext.example.simpleJava.SimpleJavaPackage;
import org.xtext.example.simpleJava.class_declaration;
import org.xtext.example.simpleJava.field_declaration;
import org.xtext.example.simpleJava.name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>class declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.class_declarationImpl#getModificadores <em>Modificadores</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.class_declarationImpl#getNomeClasse <em>Nome Classe</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.class_declarationImpl#getSuperclasse <em>Superclasse</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.class_declarationImpl#getImplementosClasse <em>Implementos Classe</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.class_declarationImpl#getCorpoClasse <em>Corpo Classe</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.class_declarationImpl#getDeclaracaoClasse <em>Declaracao Classe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class class_declarationImpl extends MinimalEObjectImpl.Container implements class_declaration
{
  /**
   * The cached value of the '{@link #getModificadores() <em>Modificadores</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModificadores()
   * @generated
   * @ordered
   */
  protected EList<MODIFIER> modificadores;

  /**
   * The default value of the '{@link #getNomeClasse() <em>Nome Classe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeClasse()
   * @generated
   * @ordered
   */
  protected static final String NOME_CLASSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNomeClasse() <em>Nome Classe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeClasse()
   * @generated
   * @ordered
   */
  protected String nomeClasse = NOME_CLASSE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperclasse() <em>Superclasse</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperclasse()
   * @generated
   * @ordered
   */
  protected name superclasse;

  /**
   * The cached value of the '{@link #getImplementosClasse() <em>Implementos Classe</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementosClasse()
   * @generated
   * @ordered
   */
  protected EList<name> implementosClasse;

  /**
   * The cached value of the '{@link #getCorpoClasse() <em>Corpo Classe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorpoClasse()
   * @generated
   * @ordered
   */
  protected field_declaration corpoClasse;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected class_declarationImpl()
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
    return SimpleJavaPackage.Literals.CLASS_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MODIFIER> getModificadores()
  {
    if (modificadores == null)
    {
      modificadores = new EObjectContainmentEList<MODIFIER>(MODIFIER.class, this, SimpleJavaPackage.CLASS_DECLARATION__MODIFICADORES);
    }
    return modificadores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNomeClasse()
  {
    return nomeClasse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNomeClasse(String newNomeClasse)
  {
    String oldNomeClasse = nomeClasse;
    nomeClasse = newNomeClasse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CLASS_DECLARATION__NOME_CLASSE, oldNomeClasse, nomeClasse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public name getSuperclasse()
  {
    return superclasse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperclasse(name newSuperclasse, NotificationChain msgs)
  {
    name oldSuperclasse = superclasse;
    superclasse = newSuperclasse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CLASS_DECLARATION__SUPERCLASSE, oldSuperclasse, newSuperclasse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperclasse(name newSuperclasse)
  {
    if (newSuperclasse != superclasse)
    {
      NotificationChain msgs = null;
      if (superclasse != null)
        msgs = ((InternalEObject)superclasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CLASS_DECLARATION__SUPERCLASSE, null, msgs);
      if (newSuperclasse != null)
        msgs = ((InternalEObject)newSuperclasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CLASS_DECLARATION__SUPERCLASSE, null, msgs);
      msgs = basicSetSuperclasse(newSuperclasse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CLASS_DECLARATION__SUPERCLASSE, newSuperclasse, newSuperclasse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<name> getImplementosClasse()
  {
    if (implementosClasse == null)
    {
      implementosClasse = new EObjectContainmentEList<name>(name.class, this, SimpleJavaPackage.CLASS_DECLARATION__IMPLEMENTOS_CLASSE);
    }
    return implementosClasse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public field_declaration getCorpoClasse()
  {
    return corpoClasse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCorpoClasse(field_declaration newCorpoClasse, NotificationChain msgs)
  {
    field_declaration oldCorpoClasse = corpoClasse;
    corpoClasse = newCorpoClasse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CLASS_DECLARATION__CORPO_CLASSE, oldCorpoClasse, newCorpoClasse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCorpoClasse(field_declaration newCorpoClasse)
  {
    if (newCorpoClasse != corpoClasse)
    {
      NotificationChain msgs = null;
      if (corpoClasse != null)
        msgs = ((InternalEObject)corpoClasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CLASS_DECLARATION__CORPO_CLASSE, null, msgs);
      if (newCorpoClasse != null)
        msgs = ((InternalEObject)newCorpoClasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CLASS_DECLARATION__CORPO_CLASSE, null, msgs);
      msgs = basicSetCorpoClasse(newCorpoClasse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CLASS_DECLARATION__CORPO_CLASSE, newCorpoClasse, newCorpoClasse));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CLASS_DECLARATION__DECLARACAO_CLASSE, oldDeclaracaoClasse, newDeclaracaoClasse);
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
        msgs = ((InternalEObject)declaracaoClasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CLASS_DECLARATION__DECLARACAO_CLASSE, null, msgs);
      if (newDeclaracaoClasse != null)
        msgs = ((InternalEObject)newDeclaracaoClasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.CLASS_DECLARATION__DECLARACAO_CLASSE, null, msgs);
      msgs = basicSetDeclaracaoClasse(newDeclaracaoClasse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.CLASS_DECLARATION__DECLARACAO_CLASSE, newDeclaracaoClasse, newDeclaracaoClasse));
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
      case SimpleJavaPackage.CLASS_DECLARATION__MODIFICADORES:
        return ((InternalEList<?>)getModificadores()).basicRemove(otherEnd, msgs);
      case SimpleJavaPackage.CLASS_DECLARATION__SUPERCLASSE:
        return basicSetSuperclasse(null, msgs);
      case SimpleJavaPackage.CLASS_DECLARATION__IMPLEMENTOS_CLASSE:
        return ((InternalEList<?>)getImplementosClasse()).basicRemove(otherEnd, msgs);
      case SimpleJavaPackage.CLASS_DECLARATION__CORPO_CLASSE:
        return basicSetCorpoClasse(null, msgs);
      case SimpleJavaPackage.CLASS_DECLARATION__DECLARACAO_CLASSE:
        return basicSetDeclaracaoClasse(null, msgs);
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
      case SimpleJavaPackage.CLASS_DECLARATION__MODIFICADORES:
        return getModificadores();
      case SimpleJavaPackage.CLASS_DECLARATION__NOME_CLASSE:
        return getNomeClasse();
      case SimpleJavaPackage.CLASS_DECLARATION__SUPERCLASSE:
        return getSuperclasse();
      case SimpleJavaPackage.CLASS_DECLARATION__IMPLEMENTOS_CLASSE:
        return getImplementosClasse();
      case SimpleJavaPackage.CLASS_DECLARATION__CORPO_CLASSE:
        return getCorpoClasse();
      case SimpleJavaPackage.CLASS_DECLARATION__DECLARACAO_CLASSE:
        return getDeclaracaoClasse();
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
      case SimpleJavaPackage.CLASS_DECLARATION__MODIFICADORES:
        getModificadores().clear();
        getModificadores().addAll((Collection<? extends MODIFIER>)newValue);
        return;
      case SimpleJavaPackage.CLASS_DECLARATION__NOME_CLASSE:
        setNomeClasse((String)newValue);
        return;
      case SimpleJavaPackage.CLASS_DECLARATION__SUPERCLASSE:
        setSuperclasse((name)newValue);
        return;
      case SimpleJavaPackage.CLASS_DECLARATION__IMPLEMENTOS_CLASSE:
        getImplementosClasse().clear();
        getImplementosClasse().addAll((Collection<? extends name>)newValue);
        return;
      case SimpleJavaPackage.CLASS_DECLARATION__CORPO_CLASSE:
        setCorpoClasse((field_declaration)newValue);
        return;
      case SimpleJavaPackage.CLASS_DECLARATION__DECLARACAO_CLASSE:
        setDeclaracaoClasse((class_declaration)newValue);
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
      case SimpleJavaPackage.CLASS_DECLARATION__MODIFICADORES:
        getModificadores().clear();
        return;
      case SimpleJavaPackage.CLASS_DECLARATION__NOME_CLASSE:
        setNomeClasse(NOME_CLASSE_EDEFAULT);
        return;
      case SimpleJavaPackage.CLASS_DECLARATION__SUPERCLASSE:
        setSuperclasse((name)null);
        return;
      case SimpleJavaPackage.CLASS_DECLARATION__IMPLEMENTOS_CLASSE:
        getImplementosClasse().clear();
        return;
      case SimpleJavaPackage.CLASS_DECLARATION__CORPO_CLASSE:
        setCorpoClasse((field_declaration)null);
        return;
      case SimpleJavaPackage.CLASS_DECLARATION__DECLARACAO_CLASSE:
        setDeclaracaoClasse((class_declaration)null);
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
      case SimpleJavaPackage.CLASS_DECLARATION__MODIFICADORES:
        return modificadores != null && !modificadores.isEmpty();
      case SimpleJavaPackage.CLASS_DECLARATION__NOME_CLASSE:
        return NOME_CLASSE_EDEFAULT == null ? nomeClasse != null : !NOME_CLASSE_EDEFAULT.equals(nomeClasse);
      case SimpleJavaPackage.CLASS_DECLARATION__SUPERCLASSE:
        return superclasse != null;
      case SimpleJavaPackage.CLASS_DECLARATION__IMPLEMENTOS_CLASSE:
        return implementosClasse != null && !implementosClasse.isEmpty();
      case SimpleJavaPackage.CLASS_DECLARATION__CORPO_CLASSE:
        return corpoClasse != null;
      case SimpleJavaPackage.CLASS_DECLARATION__DECLARACAO_CLASSE:
        return declaracaoClasse != null;
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
    result.append(" (nomeClasse: ");
    result.append(nomeClasse);
    result.append(')');
    return result.toString();
  }

} //class_declarationImpl
