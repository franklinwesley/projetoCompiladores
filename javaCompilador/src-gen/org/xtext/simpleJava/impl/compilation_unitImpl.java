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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.simpleJava.SimpleJavaPackage;
import org.xtext.simpleJava.compilation_unit;
import org.xtext.simpleJava.import_statement;
import org.xtext.simpleJava.package_statement;
import org.xtext.simpleJava.type_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>compilation unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simpleJava.impl.compilation_unitImpl#getPacote <em>Pacote</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.compilation_unitImpl#getImportes <em>Importes</em>}</li>
 *   <li>{@link org.xtext.simpleJava.impl.compilation_unitImpl#getDeclaracao <em>Declaracao</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class compilation_unitImpl extends MinimalEObjectImpl.Container implements compilation_unit
{
  /**
   * The cached value of the '{@link #getPacote() <em>Pacote</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPacote()
   * @generated
   * @ordered
   */
  protected package_statement pacote;

  /**
   * The cached value of the '{@link #getImportes() <em>Importes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportes()
   * @generated
   * @ordered
   */
  protected EList<import_statement> importes;

  /**
   * The cached value of the '{@link #getDeclaracao() <em>Declaracao</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaracao()
   * @generated
   * @ordered
   */
  protected EList<type_declaration> declaracao;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected compilation_unitImpl()
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
    return SimpleJavaPackage.Literals.COMPILATION_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public package_statement getPacote()
  {
    return pacote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPacote(package_statement newPacote, NotificationChain msgs)
  {
    package_statement oldPacote = pacote;
    pacote = newPacote;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.COMPILATION_UNIT__PACOTE, oldPacote, newPacote);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPacote(package_statement newPacote)
  {
    if (newPacote != pacote)
    {
      NotificationChain msgs = null;
      if (pacote != null)
        msgs = ((InternalEObject)pacote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.COMPILATION_UNIT__PACOTE, null, msgs);
      if (newPacote != null)
        msgs = ((InternalEObject)newPacote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.COMPILATION_UNIT__PACOTE, null, msgs);
      msgs = basicSetPacote(newPacote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.COMPILATION_UNIT__PACOTE, newPacote, newPacote));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<import_statement> getImportes()
  {
    if (importes == null)
    {
      importes = new EObjectContainmentEList<import_statement>(import_statement.class, this, SimpleJavaPackage.COMPILATION_UNIT__IMPORTES);
    }
    return importes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<type_declaration> getDeclaracao()
  {
    if (declaracao == null)
    {
      declaracao = new EObjectContainmentEList<type_declaration>(type_declaration.class, this, SimpleJavaPackage.COMPILATION_UNIT__DECLARACAO);
    }
    return declaracao;
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
      case SimpleJavaPackage.COMPILATION_UNIT__PACOTE:
        return basicSetPacote(null, msgs);
      case SimpleJavaPackage.COMPILATION_UNIT__IMPORTES:
        return ((InternalEList<?>)getImportes()).basicRemove(otherEnd, msgs);
      case SimpleJavaPackage.COMPILATION_UNIT__DECLARACAO:
        return ((InternalEList<?>)getDeclaracao()).basicRemove(otherEnd, msgs);
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
      case SimpleJavaPackage.COMPILATION_UNIT__PACOTE:
        return getPacote();
      case SimpleJavaPackage.COMPILATION_UNIT__IMPORTES:
        return getImportes();
      case SimpleJavaPackage.COMPILATION_UNIT__DECLARACAO:
        return getDeclaracao();
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
      case SimpleJavaPackage.COMPILATION_UNIT__PACOTE:
        setPacote((package_statement)newValue);
        return;
      case SimpleJavaPackage.COMPILATION_UNIT__IMPORTES:
        getImportes().clear();
        getImportes().addAll((Collection<? extends import_statement>)newValue);
        return;
      case SimpleJavaPackage.COMPILATION_UNIT__DECLARACAO:
        getDeclaracao().clear();
        getDeclaracao().addAll((Collection<? extends type_declaration>)newValue);
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
      case SimpleJavaPackage.COMPILATION_UNIT__PACOTE:
        setPacote((package_statement)null);
        return;
      case SimpleJavaPackage.COMPILATION_UNIT__IMPORTES:
        getImportes().clear();
        return;
      case SimpleJavaPackage.COMPILATION_UNIT__DECLARACAO:
        getDeclaracao().clear();
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
      case SimpleJavaPackage.COMPILATION_UNIT__PACOTE:
        return pacote != null;
      case SimpleJavaPackage.COMPILATION_UNIT__IMPORTES:
        return importes != null && !importes.isEmpty();
      case SimpleJavaPackage.COMPILATION_UNIT__DECLARACAO:
        return declaracao != null && !declaracao.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //compilation_unitImpl
