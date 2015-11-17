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
import org.xtext.example.simpleJava.do_statement;
import org.xtext.example.simpleJava.expression;
import org.xtext.example.simpleJava.for_statement;
import org.xtext.example.simpleJava.if_statement;
import org.xtext.example.simpleJava.statement;
import org.xtext.example.simpleJava.statement_block;
import org.xtext.example.simpleJava.switch_statement;
import org.xtext.example.simpleJava.try_statement;
import org.xtext.example.simpleJava.variable_declaration;
import org.xtext.example.simpleJava.while_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getDeclaracaoVariavel <em>Declaracao Variavel</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getExpressao <em>Expressao</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getNewbloco <em>Newbloco</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getCorpoIf <em>Corpo If</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getCorpoDoWhile <em>Corpo Do While</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getCorpoWhile <em>Corpo While</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getCorpoFor <em>Corpo For</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getCorpoTryCatch <em>Corpo Try Catch</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getCorpoSwitchCase <em>Corpo Switch Case</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getExpressaoSynchronized <em>Expressao Synchronized</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getCorpoSynchronize <em>Corpo Synchronize</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getExececao <em>Exececao</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getBreak <em>Break</em>}</li>
 *   <li>{@link org.xtext.example.simpleJava.impl.statementImpl#getContinue <em>Continue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class statementImpl extends MinimalEObjectImpl.Container implements statement
{
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
   * The cached value of the '{@link #getExpressao() <em>Expressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressao()
   * @generated
   * @ordered
   */
  protected expression expressao;

  /**
   * The cached value of the '{@link #getNewbloco() <em>Newbloco</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewbloco()
   * @generated
   * @ordered
   */
  protected statement_block newbloco;

  /**
   * The cached value of the '{@link #getCorpoIf() <em>Corpo If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorpoIf()
   * @generated
   * @ordered
   */
  protected if_statement corpoIf;

  /**
   * The cached value of the '{@link #getCorpoDoWhile() <em>Corpo Do While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorpoDoWhile()
   * @generated
   * @ordered
   */
  protected do_statement corpoDoWhile;

  /**
   * The cached value of the '{@link #getCorpoWhile() <em>Corpo While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorpoWhile()
   * @generated
   * @ordered
   */
  protected while_statement corpoWhile;

  /**
   * The cached value of the '{@link #getCorpoFor() <em>Corpo For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorpoFor()
   * @generated
   * @ordered
   */
  protected for_statement corpoFor;

  /**
   * The cached value of the '{@link #getCorpoTryCatch() <em>Corpo Try Catch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorpoTryCatch()
   * @generated
   * @ordered
   */
  protected try_statement corpoTryCatch;

  /**
   * The cached value of the '{@link #getCorpoSwitchCase() <em>Corpo Switch Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorpoSwitchCase()
   * @generated
   * @ordered
   */
  protected switch_statement corpoSwitchCase;

  /**
   * The cached value of the '{@link #getExpressaoSynchronized() <em>Expressao Synchronized</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressaoSynchronized()
   * @generated
   * @ordered
   */
  protected expression expressaoSynchronized;

  /**
   * The cached value of the '{@link #getCorpoSynchronize() <em>Corpo Synchronize</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorpoSynchronize()
   * @generated
   * @ordered
   */
  protected statement corpoSynchronize;

  /**
   * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected expression return_;

  /**
   * The cached value of the '{@link #getExececao() <em>Exececao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExececao()
   * @generated
   * @ordered
   */
  protected expression exececao;

  /**
   * The default value of the '{@link #getBreak() <em>Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBreak()
   * @generated
   * @ordered
   */
  protected static final String BREAK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBreak() <em>Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBreak()
   * @generated
   * @ordered
   */
  protected String break_ = BREAK_EDEFAULT;

  /**
   * The default value of the '{@link #getContinue() <em>Continue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContinue()
   * @generated
   * @ordered
   */
  protected static final String CONTINUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContinue() <em>Continue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContinue()
   * @generated
   * @ordered
   */
  protected String continue_ = CONTINUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected statementImpl()
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
    return SimpleJavaPackage.Literals.STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__DECLARACAO_VARIAVEL, oldDeclaracaoVariavel, newDeclaracaoVariavel);
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
        msgs = ((InternalEObject)declaracaoVariavel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__DECLARACAO_VARIAVEL, null, msgs);
      if (newDeclaracaoVariavel != null)
        msgs = ((InternalEObject)newDeclaracaoVariavel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__DECLARACAO_VARIAVEL, null, msgs);
      msgs = basicSetDeclaracaoVariavel(newDeclaracaoVariavel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__DECLARACAO_VARIAVEL, newDeclaracaoVariavel, newDeclaracaoVariavel));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__EXPRESSAO, oldExpressao, newExpressao);
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
        msgs = ((InternalEObject)expressao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__EXPRESSAO, null, msgs);
      if (newExpressao != null)
        msgs = ((InternalEObject)newExpressao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__EXPRESSAO, null, msgs);
      msgs = basicSetExpressao(newExpressao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__EXPRESSAO, newExpressao, newExpressao));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_block getNewbloco()
  {
    return newbloco;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNewbloco(statement_block newNewbloco, NotificationChain msgs)
  {
    statement_block oldNewbloco = newbloco;
    newbloco = newNewbloco;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__NEWBLOCO, oldNewbloco, newNewbloco);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewbloco(statement_block newNewbloco)
  {
    if (newNewbloco != newbloco)
    {
      NotificationChain msgs = null;
      if (newbloco != null)
        msgs = ((InternalEObject)newbloco).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__NEWBLOCO, null, msgs);
      if (newNewbloco != null)
        msgs = ((InternalEObject)newNewbloco).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__NEWBLOCO, null, msgs);
      msgs = basicSetNewbloco(newNewbloco, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__NEWBLOCO, newNewbloco, newNewbloco));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public if_statement getCorpoIf()
  {
    return corpoIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCorpoIf(if_statement newCorpoIf, NotificationChain msgs)
  {
    if_statement oldCorpoIf = corpoIf;
    corpoIf = newCorpoIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_IF, oldCorpoIf, newCorpoIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCorpoIf(if_statement newCorpoIf)
  {
    if (newCorpoIf != corpoIf)
    {
      NotificationChain msgs = null;
      if (corpoIf != null)
        msgs = ((InternalEObject)corpoIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_IF, null, msgs);
      if (newCorpoIf != null)
        msgs = ((InternalEObject)newCorpoIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_IF, null, msgs);
      msgs = basicSetCorpoIf(newCorpoIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_IF, newCorpoIf, newCorpoIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public do_statement getCorpoDoWhile()
  {
    return corpoDoWhile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCorpoDoWhile(do_statement newCorpoDoWhile, NotificationChain msgs)
  {
    do_statement oldCorpoDoWhile = corpoDoWhile;
    corpoDoWhile = newCorpoDoWhile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_DO_WHILE, oldCorpoDoWhile, newCorpoDoWhile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCorpoDoWhile(do_statement newCorpoDoWhile)
  {
    if (newCorpoDoWhile != corpoDoWhile)
    {
      NotificationChain msgs = null;
      if (corpoDoWhile != null)
        msgs = ((InternalEObject)corpoDoWhile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_DO_WHILE, null, msgs);
      if (newCorpoDoWhile != null)
        msgs = ((InternalEObject)newCorpoDoWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_DO_WHILE, null, msgs);
      msgs = basicSetCorpoDoWhile(newCorpoDoWhile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_DO_WHILE, newCorpoDoWhile, newCorpoDoWhile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public while_statement getCorpoWhile()
  {
    return corpoWhile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCorpoWhile(while_statement newCorpoWhile, NotificationChain msgs)
  {
    while_statement oldCorpoWhile = corpoWhile;
    corpoWhile = newCorpoWhile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_WHILE, oldCorpoWhile, newCorpoWhile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCorpoWhile(while_statement newCorpoWhile)
  {
    if (newCorpoWhile != corpoWhile)
    {
      NotificationChain msgs = null;
      if (corpoWhile != null)
        msgs = ((InternalEObject)corpoWhile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_WHILE, null, msgs);
      if (newCorpoWhile != null)
        msgs = ((InternalEObject)newCorpoWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_WHILE, null, msgs);
      msgs = basicSetCorpoWhile(newCorpoWhile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_WHILE, newCorpoWhile, newCorpoWhile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public for_statement getCorpoFor()
  {
    return corpoFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCorpoFor(for_statement newCorpoFor, NotificationChain msgs)
  {
    for_statement oldCorpoFor = corpoFor;
    corpoFor = newCorpoFor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_FOR, oldCorpoFor, newCorpoFor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCorpoFor(for_statement newCorpoFor)
  {
    if (newCorpoFor != corpoFor)
    {
      NotificationChain msgs = null;
      if (corpoFor != null)
        msgs = ((InternalEObject)corpoFor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_FOR, null, msgs);
      if (newCorpoFor != null)
        msgs = ((InternalEObject)newCorpoFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_FOR, null, msgs);
      msgs = basicSetCorpoFor(newCorpoFor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_FOR, newCorpoFor, newCorpoFor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public try_statement getCorpoTryCatch()
  {
    return corpoTryCatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCorpoTryCatch(try_statement newCorpoTryCatch, NotificationChain msgs)
  {
    try_statement oldCorpoTryCatch = corpoTryCatch;
    corpoTryCatch = newCorpoTryCatch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_TRY_CATCH, oldCorpoTryCatch, newCorpoTryCatch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCorpoTryCatch(try_statement newCorpoTryCatch)
  {
    if (newCorpoTryCatch != corpoTryCatch)
    {
      NotificationChain msgs = null;
      if (corpoTryCatch != null)
        msgs = ((InternalEObject)corpoTryCatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_TRY_CATCH, null, msgs);
      if (newCorpoTryCatch != null)
        msgs = ((InternalEObject)newCorpoTryCatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_TRY_CATCH, null, msgs);
      msgs = basicSetCorpoTryCatch(newCorpoTryCatch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_TRY_CATCH, newCorpoTryCatch, newCorpoTryCatch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public switch_statement getCorpoSwitchCase()
  {
    return corpoSwitchCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCorpoSwitchCase(switch_statement newCorpoSwitchCase, NotificationChain msgs)
  {
    switch_statement oldCorpoSwitchCase = corpoSwitchCase;
    corpoSwitchCase = newCorpoSwitchCase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_SWITCH_CASE, oldCorpoSwitchCase, newCorpoSwitchCase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCorpoSwitchCase(switch_statement newCorpoSwitchCase)
  {
    if (newCorpoSwitchCase != corpoSwitchCase)
    {
      NotificationChain msgs = null;
      if (corpoSwitchCase != null)
        msgs = ((InternalEObject)corpoSwitchCase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_SWITCH_CASE, null, msgs);
      if (newCorpoSwitchCase != null)
        msgs = ((InternalEObject)newCorpoSwitchCase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_SWITCH_CASE, null, msgs);
      msgs = basicSetCorpoSwitchCase(newCorpoSwitchCase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_SWITCH_CASE, newCorpoSwitchCase, newCorpoSwitchCase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpressaoSynchronized()
  {
    return expressaoSynchronized;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressaoSynchronized(expression newExpressaoSynchronized, NotificationChain msgs)
  {
    expression oldExpressaoSynchronized = expressaoSynchronized;
    expressaoSynchronized = newExpressaoSynchronized;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__EXPRESSAO_SYNCHRONIZED, oldExpressaoSynchronized, newExpressaoSynchronized);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressaoSynchronized(expression newExpressaoSynchronized)
  {
    if (newExpressaoSynchronized != expressaoSynchronized)
    {
      NotificationChain msgs = null;
      if (expressaoSynchronized != null)
        msgs = ((InternalEObject)expressaoSynchronized).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__EXPRESSAO_SYNCHRONIZED, null, msgs);
      if (newExpressaoSynchronized != null)
        msgs = ((InternalEObject)newExpressaoSynchronized).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__EXPRESSAO_SYNCHRONIZED, null, msgs);
      msgs = basicSetExpressaoSynchronized(newExpressaoSynchronized, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__EXPRESSAO_SYNCHRONIZED, newExpressaoSynchronized, newExpressaoSynchronized));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getCorpoSynchronize()
  {
    return corpoSynchronize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCorpoSynchronize(statement newCorpoSynchronize, NotificationChain msgs)
  {
    statement oldCorpoSynchronize = corpoSynchronize;
    corpoSynchronize = newCorpoSynchronize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_SYNCHRONIZE, oldCorpoSynchronize, newCorpoSynchronize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCorpoSynchronize(statement newCorpoSynchronize)
  {
    if (newCorpoSynchronize != corpoSynchronize)
    {
      NotificationChain msgs = null;
      if (corpoSynchronize != null)
        msgs = ((InternalEObject)corpoSynchronize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_SYNCHRONIZE, null, msgs);
      if (newCorpoSynchronize != null)
        msgs = ((InternalEObject)newCorpoSynchronize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__CORPO_SYNCHRONIZE, null, msgs);
      msgs = basicSetCorpoSynchronize(newCorpoSynchronize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CORPO_SYNCHRONIZE, newCorpoSynchronize, newCorpoSynchronize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getReturn()
  {
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturn(expression newReturn, NotificationChain msgs)
  {
    expression oldReturn = return_;
    return_ = newReturn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__RETURN, oldReturn, newReturn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn(expression newReturn)
  {
    if (newReturn != return_)
    {
      NotificationChain msgs = null;
      if (return_ != null)
        msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__RETURN, null, msgs);
      if (newReturn != null)
        msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__RETURN, null, msgs);
      msgs = basicSetReturn(newReturn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__RETURN, newReturn, newReturn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExececao()
  {
    return exececao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExececao(expression newExececao, NotificationChain msgs)
  {
    expression oldExececao = exececao;
    exececao = newExececao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__EXECECAO, oldExececao, newExececao);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExececao(expression newExececao)
  {
    if (newExececao != exececao)
    {
      NotificationChain msgs = null;
      if (exececao != null)
        msgs = ((InternalEObject)exececao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__EXECECAO, null, msgs);
      if (newExececao != null)
        msgs = ((InternalEObject)newExececao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleJavaPackage.STATEMENT__EXECECAO, null, msgs);
      msgs = basicSetExececao(newExececao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__EXECECAO, newExececao, newExececao));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBreak()
  {
    return break_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBreak(String newBreak)
  {
    String oldBreak = break_;
    break_ = newBreak;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__BREAK, oldBreak, break_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContinue()
  {
    return continue_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContinue(String newContinue)
  {
    String oldContinue = continue_;
    continue_ = newContinue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.STATEMENT__CONTINUE, oldContinue, continue_));
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
      case SimpleJavaPackage.STATEMENT__DECLARACAO_VARIAVEL:
        return basicSetDeclaracaoVariavel(null, msgs);
      case SimpleJavaPackage.STATEMENT__EXPRESSAO:
        return basicSetExpressao(null, msgs);
      case SimpleJavaPackage.STATEMENT__NEWBLOCO:
        return basicSetNewbloco(null, msgs);
      case SimpleJavaPackage.STATEMENT__CORPO_IF:
        return basicSetCorpoIf(null, msgs);
      case SimpleJavaPackage.STATEMENT__CORPO_DO_WHILE:
        return basicSetCorpoDoWhile(null, msgs);
      case SimpleJavaPackage.STATEMENT__CORPO_WHILE:
        return basicSetCorpoWhile(null, msgs);
      case SimpleJavaPackage.STATEMENT__CORPO_FOR:
        return basicSetCorpoFor(null, msgs);
      case SimpleJavaPackage.STATEMENT__CORPO_TRY_CATCH:
        return basicSetCorpoTryCatch(null, msgs);
      case SimpleJavaPackage.STATEMENT__CORPO_SWITCH_CASE:
        return basicSetCorpoSwitchCase(null, msgs);
      case SimpleJavaPackage.STATEMENT__EXPRESSAO_SYNCHRONIZED:
        return basicSetExpressaoSynchronized(null, msgs);
      case SimpleJavaPackage.STATEMENT__CORPO_SYNCHRONIZE:
        return basicSetCorpoSynchronize(null, msgs);
      case SimpleJavaPackage.STATEMENT__RETURN:
        return basicSetReturn(null, msgs);
      case SimpleJavaPackage.STATEMENT__EXECECAO:
        return basicSetExececao(null, msgs);
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
      case SimpleJavaPackage.STATEMENT__DECLARACAO_VARIAVEL:
        return getDeclaracaoVariavel();
      case SimpleJavaPackage.STATEMENT__EXPRESSAO:
        return getExpressao();
      case SimpleJavaPackage.STATEMENT__NEWBLOCO:
        return getNewbloco();
      case SimpleJavaPackage.STATEMENT__CORPO_IF:
        return getCorpoIf();
      case SimpleJavaPackage.STATEMENT__CORPO_DO_WHILE:
        return getCorpoDoWhile();
      case SimpleJavaPackage.STATEMENT__CORPO_WHILE:
        return getCorpoWhile();
      case SimpleJavaPackage.STATEMENT__CORPO_FOR:
        return getCorpoFor();
      case SimpleJavaPackage.STATEMENT__CORPO_TRY_CATCH:
        return getCorpoTryCatch();
      case SimpleJavaPackage.STATEMENT__CORPO_SWITCH_CASE:
        return getCorpoSwitchCase();
      case SimpleJavaPackage.STATEMENT__EXPRESSAO_SYNCHRONIZED:
        return getExpressaoSynchronized();
      case SimpleJavaPackage.STATEMENT__CORPO_SYNCHRONIZE:
        return getCorpoSynchronize();
      case SimpleJavaPackage.STATEMENT__RETURN:
        return getReturn();
      case SimpleJavaPackage.STATEMENT__EXECECAO:
        return getExececao();
      case SimpleJavaPackage.STATEMENT__BREAK:
        return getBreak();
      case SimpleJavaPackage.STATEMENT__CONTINUE:
        return getContinue();
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
      case SimpleJavaPackage.STATEMENT__DECLARACAO_VARIAVEL:
        setDeclaracaoVariavel((variable_declaration)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__EXPRESSAO:
        setExpressao((expression)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__NEWBLOCO:
        setNewbloco((statement_block)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_IF:
        setCorpoIf((if_statement)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_DO_WHILE:
        setCorpoDoWhile((do_statement)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_WHILE:
        setCorpoWhile((while_statement)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_FOR:
        setCorpoFor((for_statement)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_TRY_CATCH:
        setCorpoTryCatch((try_statement)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_SWITCH_CASE:
        setCorpoSwitchCase((switch_statement)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__EXPRESSAO_SYNCHRONIZED:
        setExpressaoSynchronized((expression)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_SYNCHRONIZE:
        setCorpoSynchronize((statement)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__RETURN:
        setReturn((expression)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__EXECECAO:
        setExececao((expression)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__BREAK:
        setBreak((String)newValue);
        return;
      case SimpleJavaPackage.STATEMENT__CONTINUE:
        setContinue((String)newValue);
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
      case SimpleJavaPackage.STATEMENT__DECLARACAO_VARIAVEL:
        setDeclaracaoVariavel((variable_declaration)null);
        return;
      case SimpleJavaPackage.STATEMENT__EXPRESSAO:
        setExpressao((expression)null);
        return;
      case SimpleJavaPackage.STATEMENT__NEWBLOCO:
        setNewbloco((statement_block)null);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_IF:
        setCorpoIf((if_statement)null);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_DO_WHILE:
        setCorpoDoWhile((do_statement)null);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_WHILE:
        setCorpoWhile((while_statement)null);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_FOR:
        setCorpoFor((for_statement)null);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_TRY_CATCH:
        setCorpoTryCatch((try_statement)null);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_SWITCH_CASE:
        setCorpoSwitchCase((switch_statement)null);
        return;
      case SimpleJavaPackage.STATEMENT__EXPRESSAO_SYNCHRONIZED:
        setExpressaoSynchronized((expression)null);
        return;
      case SimpleJavaPackage.STATEMENT__CORPO_SYNCHRONIZE:
        setCorpoSynchronize((statement)null);
        return;
      case SimpleJavaPackage.STATEMENT__RETURN:
        setReturn((expression)null);
        return;
      case SimpleJavaPackage.STATEMENT__EXECECAO:
        setExececao((expression)null);
        return;
      case SimpleJavaPackage.STATEMENT__BREAK:
        setBreak(BREAK_EDEFAULT);
        return;
      case SimpleJavaPackage.STATEMENT__CONTINUE:
        setContinue(CONTINUE_EDEFAULT);
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
      case SimpleJavaPackage.STATEMENT__DECLARACAO_VARIAVEL:
        return declaracaoVariavel != null;
      case SimpleJavaPackage.STATEMENT__EXPRESSAO:
        return expressao != null;
      case SimpleJavaPackage.STATEMENT__NEWBLOCO:
        return newbloco != null;
      case SimpleJavaPackage.STATEMENT__CORPO_IF:
        return corpoIf != null;
      case SimpleJavaPackage.STATEMENT__CORPO_DO_WHILE:
        return corpoDoWhile != null;
      case SimpleJavaPackage.STATEMENT__CORPO_WHILE:
        return corpoWhile != null;
      case SimpleJavaPackage.STATEMENT__CORPO_FOR:
        return corpoFor != null;
      case SimpleJavaPackage.STATEMENT__CORPO_TRY_CATCH:
        return corpoTryCatch != null;
      case SimpleJavaPackage.STATEMENT__CORPO_SWITCH_CASE:
        return corpoSwitchCase != null;
      case SimpleJavaPackage.STATEMENT__EXPRESSAO_SYNCHRONIZED:
        return expressaoSynchronized != null;
      case SimpleJavaPackage.STATEMENT__CORPO_SYNCHRONIZE:
        return corpoSynchronize != null;
      case SimpleJavaPackage.STATEMENT__RETURN:
        return return_ != null;
      case SimpleJavaPackage.STATEMENT__EXECECAO:
        return exececao != null;
      case SimpleJavaPackage.STATEMENT__BREAK:
        return BREAK_EDEFAULT == null ? break_ != null : !BREAK_EDEFAULT.equals(break_);
      case SimpleJavaPackage.STATEMENT__CONTINUE:
        return CONTINUE_EDEFAULT == null ? continue_ != null : !CONTINUE_EDEFAULT.equals(continue_);
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
    result.append(" (break: ");
    result.append(break_);
    result.append(", continue: ");
    result.append(continue_);
    result.append(')');
    return result.toString();
  }

} //statementImpl
