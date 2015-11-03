/*
 * generated by Xtext
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.services.SimpleJavaGrammarAccess;

@SuppressWarnings("all")
public class SimpleJavaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SimpleJavaGrammarAccess grammarAccess;
	protected AbstractElementAlias match_constructor_declaration_VoidKeyword_1_1_q;
	protected AbstractElementAlias match_creating_aux___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q_or___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a;
	protected AbstractElementAlias match_creating_aux___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a;
	protected AbstractElementAlias match_creating_expression___LeftSquareBracketKeyword_1_1_2_0_RightSquareBracketKeyword_1_1_2_1__a;
	protected AbstractElementAlias match_expression_NullKeyword_0_5_or_SuperKeyword_0_6_or_ThisKeyword_0_7;
	protected AbstractElementAlias match_expression_aux___AmpersandKeyword_0_4_0_0_0_or_AmpersandKeyword_0_4_0_0_1_or_CircumflexAccentEqualsSignKeyword_0_4_0_0_5_or_CircumflexAccentKeyword_0_4_0_0_4_or_CommaKeyword_0_0_3_0_or_PercentSignEqualsSignKeyword_0_4_0_0_9_or_PercentSignKeyword_0_4_0_0_8_or_QuestionMarkKeyword_0_4_1_0_or_VerticalLineEqualsSignKeyword_0_4_0_0_3_or_VerticalLineKeyword_0_4_0_0_2_or_VerticalLineVerticalLineEqualsSignKeyword_0_4_0_0_7___or___AmpersandKeyword_0_4_0_0_6_0_AmpersandKeyword_0_4_0_0_6_1__;
	protected AbstractElementAlias match_field_declaration_Doc_commentParserRuleCall_0_0_a;
	protected AbstractElementAlias match_import_statement_FullStopAsteriskSemicolonKeyword_2_0_or_SemicolonKeyword_2_1;
	protected AbstractElementAlias match_method_declaration___LeftSquareBracketKeyword_6_0_RightSquareBracketKeyword_6_1__a;
	protected AbstractElementAlias match_parameter___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_1__a;
	protected AbstractElementAlias match_statement_SemicolonKeyword_15_or___BreakKeyword_13_0_SemicolonKeyword_13_2___or___ContinueKeyword_14_0_SemicolonKeyword_14_2___or___ReturnKeyword_10_0_SemicolonKeyword_10_2__;
	protected AbstractElementAlias match_statement___IDENTIFIERTerminalRuleCall_12_0_ColonKeyword_12_1__a;
	protected AbstractElementAlias match_switch_statement___DefaultKeyword_5_1_0_ColonKeyword_5_1_1__a;
	protected AbstractElementAlias match_type___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_1__a;
	protected AbstractElementAlias match_type_declaration_Doc_commentParserRuleCall_0_q;
	protected AbstractElementAlias match_variable_declaration_VoidKeyword_1_1_q;
	protected AbstractElementAlias match_variable_declarator___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a;
	protected AbstractElementAlias match_variable_initializer_CommaKeyword_1_1_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SimpleJavaGrammarAccess) access;
		match_constructor_declaration_VoidKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getConstructor_declarationAccess().getVoidKeyword_1_1());
		match_creating_aux___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q_or___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a = new AlternativeAlias(false, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCreating_auxAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getCreating_auxAccess().getRightParenthesisKeyword_0_2())), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getCreating_auxAccess().getLeftSquareBracketKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getCreating_auxAccess().getRightSquareBracketKeyword_1_1_1())));
		match_creating_aux___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getCreating_auxAccess().getLeftSquareBracketKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getCreating_auxAccess().getRightSquareBracketKeyword_1_1_1()));
		match_creating_expression___LeftSquareBracketKeyword_1_1_2_0_RightSquareBracketKeyword_1_1_2_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getCreating_expressionAccess().getLeftSquareBracketKeyword_1_1_2_0()), new TokenAlias(false, false, grammarAccess.getCreating_expressionAccess().getRightSquareBracketKeyword_1_1_2_1()));
		match_expression_NullKeyword_0_5_or_SuperKeyword_0_6_or_ThisKeyword_0_7 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getNullKeyword_0_5()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getSuperKeyword_0_6()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getThisKeyword_0_7()));
		match_expression_aux___AmpersandKeyword_0_4_0_0_0_or_AmpersandKeyword_0_4_0_0_1_or_CircumflexAccentEqualsSignKeyword_0_4_0_0_5_or_CircumflexAccentKeyword_0_4_0_0_4_or_CommaKeyword_0_0_3_0_or_PercentSignEqualsSignKeyword_0_4_0_0_9_or_PercentSignKeyword_0_4_0_0_8_or_QuestionMarkKeyword_0_4_1_0_or_VerticalLineEqualsSignKeyword_0_4_0_0_3_or_VerticalLineKeyword_0_4_0_0_2_or_VerticalLineVerticalLineEqualsSignKeyword_0_4_0_0_7___or___AmpersandKeyword_0_4_0_0_6_0_AmpersandKeyword_0_4_0_0_6_1__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpression_auxAccess().getAmpersandKeyword_0_4_0_0_0()), new TokenAlias(false, false, grammarAccess.getExpression_auxAccess().getAmpersandKeyword_0_4_0_0_1()), new TokenAlias(false, false, grammarAccess.getExpression_auxAccess().getCircumflexAccentEqualsSignKeyword_0_4_0_0_5()), new TokenAlias(false, false, grammarAccess.getExpression_auxAccess().getCircumflexAccentKeyword_0_4_0_0_4()), new TokenAlias(false, false, grammarAccess.getExpression_auxAccess().getCommaKeyword_0_0_3_0()), new TokenAlias(false, false, grammarAccess.getExpression_auxAccess().getPercentSignEqualsSignKeyword_0_4_0_0_9()), new TokenAlias(false, false, grammarAccess.getExpression_auxAccess().getPercentSignKeyword_0_4_0_0_8()), new TokenAlias(false, false, grammarAccess.getExpression_auxAccess().getQuestionMarkKeyword_0_4_1_0()), new TokenAlias(false, false, grammarAccess.getExpression_auxAccess().getVerticalLineEqualsSignKeyword_0_4_0_0_3()), new TokenAlias(false, false, grammarAccess.getExpression_auxAccess().getVerticalLineKeyword_0_4_0_0_2()), new TokenAlias(false, false, grammarAccess.getExpression_auxAccess().getVerticalLineVerticalLineEqualsSignKeyword_0_4_0_0_7())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpression_auxAccess().getAmpersandKeyword_0_4_0_0_6_0()), new TokenAlias(false, false, grammarAccess.getExpression_auxAccess().getAmpersandKeyword_0_4_0_0_6_1())));
		match_field_declaration_Doc_commentParserRuleCall_0_0_a = new TokenAlias(true, true, grammarAccess.getField_declarationAccess().getDoc_commentParserRuleCall_0_0());
		match_import_statement_FullStopAsteriskSemicolonKeyword_2_0_or_SemicolonKeyword_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getImport_statementAccess().getSemicolonKeyword_2_1()));
		match_method_declaration___LeftSquareBracketKeyword_6_0_RightSquareBracketKeyword_6_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getMethod_declarationAccess().getRightSquareBracketKeyword_6_1()));
		match_parameter___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_1()));
		match_statement_SemicolonKeyword_15_or___BreakKeyword_13_0_SemicolonKeyword_13_2___or___ContinueKeyword_14_0_SemicolonKeyword_14_2___or___ReturnKeyword_10_0_SemicolonKeyword_10_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getBreakKeyword_13_0()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_13_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getContinueKeyword_14_0()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_14_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getReturnKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_10_2())), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_15()));
		match_statement___IDENTIFIERTerminalRuleCall_12_0_ColonKeyword_12_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStatementAccess().getIDENTIFIERTerminalRuleCall_12_0()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getColonKeyword_12_1()));
		match_switch_statement___DefaultKeyword_5_1_0_ColonKeyword_5_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getSwitch_statementAccess().getDefaultKeyword_5_1_0()), new TokenAlias(false, false, grammarAccess.getSwitch_statementAccess().getColonKeyword_5_1_1()));
		match_type___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1()));
		match_type_declaration_Doc_commentParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getType_declarationAccess().getDoc_commentParserRuleCall_0());
		match_variable_declaration_VoidKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getVariable_declarationAccess().getVoidKeyword_1_1());
		match_variable_declarator___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getVariable_declaratorAccess().getRightSquareBracketKeyword_1_1_1()));
		match_variable_initializer_CommaKeyword_1_1_2_q = new TokenAlias(false, true, grammarAccess.getVariable_initializerAccess().getCommaKeyword_1_1_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDENTIFIERRule())
			return getIDENTIFIERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDoc_commentRule())
			return getdoc_commentToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal IDENTIFIER: ID;
	 */
	protected String getIDENTIFIERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * doc_comment: "/**" "... text ..." "*/";
	 */
	protected String getdoc_commentToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/**... text ...*/";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_constructor_declaration_VoidKeyword_1_1_q.equals(syntax))
				emit_constructor_declaration_VoidKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_creating_aux___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q_or___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a.equals(syntax))
				emit_creating_aux___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q_or___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_creating_aux___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a.equals(syntax))
				emit_creating_aux___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_creating_expression___LeftSquareBracketKeyword_1_1_2_0_RightSquareBracketKeyword_1_1_2_1__a.equals(syntax))
				emit_creating_expression___LeftSquareBracketKeyword_1_1_2_0_RightSquareBracketKeyword_1_1_2_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_expression_NullKeyword_0_5_or_SuperKeyword_0_6_or_ThisKeyword_0_7.equals(syntax))
				emit_expression_NullKeyword_0_5_or_SuperKeyword_0_6_or_ThisKeyword_0_7(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_expression_aux___AmpersandKeyword_0_4_0_0_0_or_AmpersandKeyword_0_4_0_0_1_or_CircumflexAccentEqualsSignKeyword_0_4_0_0_5_or_CircumflexAccentKeyword_0_4_0_0_4_or_CommaKeyword_0_0_3_0_or_PercentSignEqualsSignKeyword_0_4_0_0_9_or_PercentSignKeyword_0_4_0_0_8_or_QuestionMarkKeyword_0_4_1_0_or_VerticalLineEqualsSignKeyword_0_4_0_0_3_or_VerticalLineKeyword_0_4_0_0_2_or_VerticalLineVerticalLineEqualsSignKeyword_0_4_0_0_7___or___AmpersandKeyword_0_4_0_0_6_0_AmpersandKeyword_0_4_0_0_6_1__.equals(syntax))
				emit_expression_aux___AmpersandKeyword_0_4_0_0_0_or_AmpersandKeyword_0_4_0_0_1_or_CircumflexAccentEqualsSignKeyword_0_4_0_0_5_or_CircumflexAccentKeyword_0_4_0_0_4_or_CommaKeyword_0_0_3_0_or_PercentSignEqualsSignKeyword_0_4_0_0_9_or_PercentSignKeyword_0_4_0_0_8_or_QuestionMarkKeyword_0_4_1_0_or_VerticalLineEqualsSignKeyword_0_4_0_0_3_or_VerticalLineKeyword_0_4_0_0_2_or_VerticalLineVerticalLineEqualsSignKeyword_0_4_0_0_7___or___AmpersandKeyword_0_4_0_0_6_0_AmpersandKeyword_0_4_0_0_6_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_field_declaration_Doc_commentParserRuleCall_0_0_a.equals(syntax))
				emit_field_declaration_Doc_commentParserRuleCall_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_import_statement_FullStopAsteriskSemicolonKeyword_2_0_or_SemicolonKeyword_2_1.equals(syntax))
				emit_import_statement_FullStopAsteriskSemicolonKeyword_2_0_or_SemicolonKeyword_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_method_declaration___LeftSquareBracketKeyword_6_0_RightSquareBracketKeyword_6_1__a.equals(syntax))
				emit_method_declaration___LeftSquareBracketKeyword_6_0_RightSquareBracketKeyword_6_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_parameter___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_1__a.equals(syntax))
				emit_parameter___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_statement_SemicolonKeyword_15_or___BreakKeyword_13_0_SemicolonKeyword_13_2___or___ContinueKeyword_14_0_SemicolonKeyword_14_2___or___ReturnKeyword_10_0_SemicolonKeyword_10_2__.equals(syntax))
				emit_statement_SemicolonKeyword_15_or___BreakKeyword_13_0_SemicolonKeyword_13_2___or___ContinueKeyword_14_0_SemicolonKeyword_14_2___or___ReturnKeyword_10_0_SemicolonKeyword_10_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_statement___IDENTIFIERTerminalRuleCall_12_0_ColonKeyword_12_1__a.equals(syntax))
				emit_statement___IDENTIFIERTerminalRuleCall_12_0_ColonKeyword_12_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_switch_statement___DefaultKeyword_5_1_0_ColonKeyword_5_1_1__a.equals(syntax))
				emit_switch_statement___DefaultKeyword_5_1_0_ColonKeyword_5_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_type___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_1__a.equals(syntax))
				emit_type___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_type_declaration_Doc_commentParserRuleCall_0_q.equals(syntax))
				emit_type_declaration_Doc_commentParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_variable_declaration_VoidKeyword_1_1_q.equals(syntax))
				emit_variable_declaration_VoidKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_variable_declarator___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a.equals(syntax))
				emit_variable_declarator___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_variable_initializer_CommaKeyword_1_1_2_q.equals(syntax))
				emit_variable_initializer_CommaKeyword_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'void'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '{' (ambiguity) nomeContrutor=IDENTIFIER
	 *     (rule start) (ambiguity) nomeContrutor=IDENTIFIER
	 *     modificador=MODIFIER (ambiguity) nomeContrutor=IDENTIFIER
	 */
	protected void emit_constructor_declaration_VoidKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')? | ('[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_creating_aux___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q_or___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     espressao=expression ']' (ambiguity) (rule end)
	 */
	protected void emit_creating_aux___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     parametros=aux (ambiguity) (rule end)
	 *     parametros=aux (ambiguity) novo=new
	 *     tipoObjeto=type_specifier (ambiguity) (rule end)
	 *     tipoObjeto=type_specifier (ambiguity) novo=new
	 */
	protected void emit_creating_expression___LeftSquareBracketKeyword_1_1_2_0_RightSquareBracketKeyword_1_1_2_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'null' | 'super' | 'this'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (('ampersand' 'ampersand') | (',' | 'ampersand' | 'ampersand=' | '|' | '|=' | '^' | '^=' | '||=' | '%' | '%=' | '?')) (ambiguity) expressoes=expression_aux
	 *     (rule start) (ambiguity) expressoes=expression_aux
	 */
	protected void emit_expression_NullKeyword_0_5_or_SuperKeyword_0_6_or_ThisKeyword_0_7(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         ('ampersand' 'ampersand') | 
	  *         (
	  *             ',' | 
	  *             'ampersand' | 
	  *             'ampersand=' | 
	  *             '|' | 
	  *             '|=' | 
	  *             '^' | 
	  *             '^=' | 
	  *             '||=' | 
	  *             '%' | 
	  *             '%=' | 
	  *             '?'
	  *         )
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' expressao=expression
	 *     (rule start) (ambiguity) '(' tipo=name
	 *     (rule start) (ambiguity) '(' tipo=type_specifier
	 *     (rule start) (ambiguity) ('null' | 'super' | 'this') expressoes=expression_aux
	 *     (rule start) (ambiguity) identificador=IDENTIFIER
	 *     (rule start) (ambiguity) literal=literal_expression
	 *     (rule start) (ambiguity) new=creating_expression
	 *     (rule start) (ambiguity) tipoBit=bit_expression
	 *     (rule start) (ambiguity) tipoLogical=logical_expression
	 *     (rule start) (ambiguity) tipoNumeric=numeric_expression
	 */
	protected void emit_expression_aux___AmpersandKeyword_0_4_0_0_0_or_AmpersandKeyword_0_4_0_0_1_or_CircumflexAccentEqualsSignKeyword_0_4_0_0_5_or_CircumflexAccentKeyword_0_4_0_0_4_or_CommaKeyword_0_0_3_0_or_PercentSignEqualsSignKeyword_0_4_0_0_9_or_PercentSignKeyword_0_4_0_0_8_or_QuestionMarkKeyword_0_4_1_0_or_VerticalLineEqualsSignKeyword_0_4_0_0_3_or_VerticalLineKeyword_0_4_0_0_2_or_VerticalLineVerticalLineEqualsSignKeyword_0_4_0_0_7___or___AmpersandKeyword_0_4_0_0_6_0_AmpersandKeyword_0_4_0_0_6_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     doc_comment*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) declaracaoConstrutor=constructor_declaration
	 *     (rule start) (ambiguity) declaracaoMetodo=method_declaration
	 *     (rule start) (ambiguity) declaracaoVariavel=variable_declaration
	 */
	protected void emit_field_declaration_Doc_commentParserRuleCall_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '.*;' | ';'
	 *
	 * This ambiguous syntax occurs at:
	 *     nomeImporte=name (ambiguity) (rule end)
	 */
	protected void emit_import_statement_FullStopAsteriskSemicolonKeyword_2_0_or_SemicolonKeyword_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     nomeMetodo=IDENTIFIER '(' ')' (ambiguity) ';' (rule end)
	 *     nomeMetodo=IDENTIFIER '(' ')' (ambiguity) blocoMetodo=statement_block
	 *     parametrosMetodo=parameter_list ')' (ambiguity) ';' (rule end)
	 *     parametrosMetodo=parameter_list ')' (ambiguity) blocoMetodo=statement_block
	 */
	protected void emit_method_declaration___LeftSquareBracketKeyword_6_0_RightSquareBracketKeyword_6_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     nomeParametro=IDENTIFIER (ambiguity) (rule end)
	 */
	protected void emit_parameter___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';' | ('return' ';') | ('break' ';') | ('continue' ';')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (IDENTIFIER ':')* (ambiguity) (rule start)
	 */
	protected void emit_statement_SemicolonKeyword_15_or___BreakKeyword_13_0_SemicolonKeyword_13_2___or___ContinueKeyword_14_0_SemicolonKeyword_14_2___or___ReturnKeyword_10_0_SemicolonKeyword_10_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (IDENTIFIER ':')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'break' break=IDENTIFIER
	 *     (rule start) (ambiguity) 'continue' continue=IDENTIFIER
	 *     (rule start) (ambiguity) 'return' return=expression
	 *     (rule start) (ambiguity) 'synchronized' '(' expressaoSynchronized=expression
	 *     (rule start) (ambiguity) 'throw' exececao=expression
	 *     (rule start) (ambiguity) (';' | ('return' ';') | ('break' ';') | ('continue' ';')) (rule start)
	 *     (rule start) (ambiguity) bloco=statement_block
	 *     (rule start) (ambiguity) corpoDoWhile=do_statement
	 *     (rule start) (ambiguity) corpoFor=for_statement
	 *     (rule start) (ambiguity) corpoIf=if_statement
	 *     (rule start) (ambiguity) corpoSwitchCase=switch_statement
	 *     (rule start) (ambiguity) corpoTryCatch=try_statement
	 *     (rule start) (ambiguity) corpoWhile=while_statement
	 *     (rule start) (ambiguity) declaracaoVariavel=variable_declaration
	 *     (rule start) (ambiguity) expressao=expression
	 */
	protected void emit_statement___IDENTIFIERTerminalRuleCall_12_0_ColonKeyword_12_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('default' ':')*
	 *
	 * This ambiguous syntax occurs at:
	 *     blocoSwitch=statement (ambiguity) 'case' expressaoCases+=expression
	 *     blocoSwitch=statement (ambiguity) '}' (rule end)
	 *     blocoSwitch=statement (ambiguity) blocoSwitch=statement
	 *     expressaoCases+=expression ':' (ambiguity) 'case' expressaoCases+=expression
	 *     expressaoCases+=expression ':' (ambiguity) '}' (rule end)
	 *     expressaoCases+=expression ':' (ambiguity) blocoSwitch=statement
	 *     expressaoSwitch=expression ')' '{' (ambiguity) 'case' expressaoCases+=expression
	 *     expressaoSwitch=expression ')' '{' (ambiguity) '}' (rule end)
	 *     expressaoSwitch=expression ')' '{' (ambiguity) blocoSwitch=statement
	 */
	protected void emit_switch_statement___DefaultKeyword_5_1_0_ColonKeyword_5_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     tipo=name (ambiguity) ')' expressao=expression
	 *     tipo=name (ambiguity) (rule end)
	 *     tipo=type_specifier (ambiguity) ')' expressao=expression
	 *     tipo=type_specifier (ambiguity) (rule end)
	 */
	protected void emit_type___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     doc_comment?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) declaracaoClasse=class_declaration
	 *     (rule start) (ambiguity) declaracaoInterface=interface_declaration
	 */
	protected void emit_type_declaration_Doc_commentParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'void'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) declaracaoVariaveis+=variable_declarator
	 *     modificador=MODIFIER (ambiguity) declaracaoVariaveis+=variable_declarator
	 */
	protected void emit_variable_declaration_VoidKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     nomeVariavel=IDENTIFIER (ambiguity) '=' valorVariavel=variable_initializer
	 *     nomeVariavel=IDENTIFIER (ambiguity) (rule end)
	 */
	protected void emit_variable_declarator___LeftSquareBracketKeyword_1_1_0_RightSquareBracketKeyword_1_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     valorVariaveis+=variable_initializer (ambiguity) '}' (rule end)
	 */
	protected void emit_variable_initializer_CommaKeyword_1_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
