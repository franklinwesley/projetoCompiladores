package org.xtext.example.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.SimpleJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSimpleJavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_IDENTIFIER", "RULE_DECIMAL_DIGITS", "RULE_INTEGER_LITERAL", "RULE_FLOAT_LITERAL", "RULE_EXPONENT_PART", "RULE_FLOAT_TYPE_SUFFIX", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.*;'", "'/**'", "'*/'", "'class'", "'extends'", "'implements'", "','", "'{'", "'}'", "'interface'", "'('", "')'", "'['", "']'", "'synchronized'", "'return'", "'throw'", "':'", "'break'", "'continue'", "'void'", "'='", "'if'", "'else'", "'do'", "'while'", "'for'", "'try'", "'catch'", "'finally'", "'switch'", "'case'", "'default'", "'static'", "'new'", "'null'", "'super'", "'this'", "'.'", "'instanceof'", "'++'", "'--'", "'-'", "'-='", "'*'", "'*='", "'/'", "'/='", "'%'", "'%='", "'&'", "'&='", "'|'", "'|='", "'^'", "'^='", "'&&'", "'||'", "'||='", "'?'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'>>='", "'<<'", "'>>'", "'>>>'", "'+'", "'+='", "'!'", "'true'", "'false'", "'~'", "'\"'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'public'", "'private'", "'protected'", "'final'", "'native'", "'abstract'", "'threadsafe'", "'transient'"
    };
    public static final int RULE_FLOAT_TYPE_SUFFIX=10;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=12;
    public static final int RULE_INTEGER_LITERAL=7;
    public static final int RULE_INT=11;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_EXPONENT_PART=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_DECIMAL_DIGITS=6;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_IDENTIFIER=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_FLOAT_LITERAL=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalSimpleJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpleJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpleJavaParser.tokenNames; }
    public String getGrammarFileName() { return "../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private SimpleJavaGrammarAccess grammarAccess;
     	
        public InternalSimpleJavaParser(TokenStream input, SimpleJavaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SimpleJavaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:74:2: (iv_ruleModel= ruleModel EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:75:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:82:1: ruleModel returns [EObject current=null] : this_compilation_unit_0= rulecompilation_unit ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_compilation_unit_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:85:28: (this_compilation_unit_0= rulecompilation_unit )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:87:2: this_compilation_unit_0= rulecompilation_unit
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModelAccess().getCompilation_unitParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulecompilation_unit_in_ruleModel140);
            this_compilation_unit_0=rulecompilation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_compilation_unit_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulecompilation_unit"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:106:1: entryRulecompilation_unit returns [EObject current=null] : iv_rulecompilation_unit= rulecompilation_unit EOF ;
    public final EObject entryRulecompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompilation_unit = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:107:2: (iv_rulecompilation_unit= rulecompilation_unit EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:108:2: iv_rulecompilation_unit= rulecompilation_unit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompilation_unitRule()); 
            }
            pushFollow(FOLLOW_rulecompilation_unit_in_entryRulecompilation_unit174);
            iv_rulecompilation_unit=rulecompilation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompilation_unit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecompilation_unit184); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompilation_unit"


    // $ANTLR start "rulecompilation_unit"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:115:1: rulecompilation_unit returns [EObject current=null] : ( ( (lv_pacote_0_0= rulepackage_statement ) )? ( (lv_importes_1_0= ruleimport_statement ) )* ( (lv_declaracao_2_0= ruletype_declaration ) )* ) ;
    public final EObject rulecompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject lv_pacote_0_0 = null;

        EObject lv_importes_1_0 = null;

        EObject lv_declaracao_2_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:118:28: ( ( ( (lv_pacote_0_0= rulepackage_statement ) )? ( (lv_importes_1_0= ruleimport_statement ) )* ( (lv_declaracao_2_0= ruletype_declaration ) )* ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:119:1: ( ( (lv_pacote_0_0= rulepackage_statement ) )? ( (lv_importes_1_0= ruleimport_statement ) )* ( (lv_declaracao_2_0= ruletype_declaration ) )* )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:119:1: ( ( (lv_pacote_0_0= rulepackage_statement ) )? ( (lv_importes_1_0= ruleimport_statement ) )* ( (lv_declaracao_2_0= ruletype_declaration ) )* )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:119:2: ( (lv_pacote_0_0= rulepackage_statement ) )? ( (lv_importes_1_0= ruleimport_statement ) )* ( (lv_declaracao_2_0= ruletype_declaration ) )*
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:119:2: ( (lv_pacote_0_0= rulepackage_statement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:120:1: (lv_pacote_0_0= rulepackage_statement )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:120:1: (lv_pacote_0_0= rulepackage_statement )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:121:3: lv_pacote_0_0= rulepackage_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getPacotePackage_statementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulepackage_statement_in_rulecompilation_unit230);
                    lv_pacote_0_0=rulepackage_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
                      	        }
                             		set(
                             			current, 
                             			"pacote",
                              		lv_pacote_0_0, 
                              		"package_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:137:3: ( (lv_importes_1_0= ruleimport_statement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:138:1: (lv_importes_1_0= ruleimport_statement )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:138:1: (lv_importes_1_0= ruleimport_statement )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:139:3: lv_importes_1_0= ruleimport_statement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getImportesImport_statementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleimport_statement_in_rulecompilation_unit252);
            	    lv_importes_1_0=ruleimport_statement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"importes",
            	              		lv_importes_1_0, 
            	              		"import_statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:155:3: ( (lv_declaracao_2_0= ruletype_declaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21||LA3_0==23||LA3_0==29||LA3_0==34||LA3_0==53||(LA3_0>=105 && LA3_0<=112)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:156:1: (lv_declaracao_2_0= ruletype_declaration )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:156:1: (lv_declaracao_2_0= ruletype_declaration )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:157:3: lv_declaracao_2_0= ruletype_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getDeclaracaoType_declarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruletype_declaration_in_rulecompilation_unit274);
            	    lv_declaracao_2_0=ruletype_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declaracao",
            	              		lv_declaracao_2_0, 
            	              		"type_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompilation_unit"


    // $ANTLR start "entryRulepackage_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:181:1: entryRulepackage_statement returns [EObject current=null] : iv_rulepackage_statement= rulepackage_statement EOF ;
    public final EObject entryRulepackage_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepackage_statement = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:182:2: (iv_rulepackage_statement= rulepackage_statement EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:183:2: iv_rulepackage_statement= rulepackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_rulepackage_statement_in_entryRulepackage_statement311);
            iv_rulepackage_statement=rulepackage_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepackage_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepackage_statement321); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepackage_statement"


    // $ANTLR start "rulepackage_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:190:1: rulepackage_statement returns [EObject current=null] : (otherlv_0= 'package' ( (lv_noomePacote_1_0= rulename ) ) otherlv_2= ';' ) ;
    public final EObject rulepackage_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_noomePacote_1_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:193:28: ( (otherlv_0= 'package' ( (lv_noomePacote_1_0= rulename ) ) otherlv_2= ';' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:194:1: (otherlv_0= 'package' ( (lv_noomePacote_1_0= rulename ) ) otherlv_2= ';' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:194:1: (otherlv_0= 'package' ( (lv_noomePacote_1_0= rulename ) ) otherlv_2= ';' )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:194:3: otherlv_0= 'package' ( (lv_noomePacote_1_0= rulename ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulepackage_statement358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackage_statementAccess().getPackageKeyword_0());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:198:1: ( (lv_noomePacote_1_0= rulename ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:199:1: (lv_noomePacote_1_0= rulename )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:199:1: (lv_noomePacote_1_0= rulename )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:200:3: lv_noomePacote_1_0= rulename
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackage_statementAccess().getNoomePacoteNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulename_in_rulepackage_statement379);
            lv_noomePacote_1_0=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackage_statementRule());
              	        }
                     		set(
                     			current, 
                     			"noomePacote",
                      		lv_noomePacote_1_0, 
                      		"name");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulepackage_statement391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepackage_statement"


    // $ANTLR start "entryRuleimport_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:228:1: entryRuleimport_statement returns [EObject current=null] : iv_ruleimport_statement= ruleimport_statement EOF ;
    public final EObject entryRuleimport_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleimport_statement = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:229:2: (iv_ruleimport_statement= ruleimport_statement EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:230:2: iv_ruleimport_statement= ruleimport_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_ruleimport_statement_in_entryRuleimport_statement427);
            iv_ruleimport_statement=ruleimport_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleimport_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleimport_statement437); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleimport_statement"


    // $ANTLR start "ruleimport_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:237:1: ruleimport_statement returns [EObject current=null] : (otherlv_0= 'import' ( (lv_nomeImporte_1_0= rulename ) ) (otherlv_2= '.*;' | otherlv_3= ';' ) ) ;
    public final EObject ruleimport_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_nomeImporte_1_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:240:28: ( (otherlv_0= 'import' ( (lv_nomeImporte_1_0= rulename ) ) (otherlv_2= '.*;' | otherlv_3= ';' ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:241:1: (otherlv_0= 'import' ( (lv_nomeImporte_1_0= rulename ) ) (otherlv_2= '.*;' | otherlv_3= ';' ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:241:1: (otherlv_0= 'import' ( (lv_nomeImporte_1_0= rulename ) ) (otherlv_2= '.*;' | otherlv_3= ';' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:241:3: otherlv_0= 'import' ( (lv_nomeImporte_1_0= rulename ) ) (otherlv_2= '.*;' | otherlv_3= ';' )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleimport_statement474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImport_statementAccess().getImportKeyword_0());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:245:1: ( (lv_nomeImporte_1_0= rulename ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:246:1: (lv_nomeImporte_1_0= rulename )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:246:1: (lv_nomeImporte_1_0= rulename )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:247:3: lv_nomeImporte_1_0= rulename
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImport_statementAccess().getNomeImporteNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulename_in_ruleimport_statement495);
            lv_nomeImporte_1_0=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImport_statementRule());
              	        }
                     		set(
                     			current, 
                     			"nomeImporte",
                      		lv_nomeImporte_1_0, 
                      		"name");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:263:2: (otherlv_2= '.*;' | otherlv_3= ';' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:263:4: otherlv_2= '.*;'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleimport_statement508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_2_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:268:7: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleimport_statement526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getImport_statementAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleimport_statement"


    // $ANTLR start "entryRuletype_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:280:1: entryRuletype_declaration returns [EObject current=null] : iv_ruletype_declaration= ruletype_declaration EOF ;
    public final EObject entryRuletype_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_declaration = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:281:2: (iv_ruletype_declaration= ruletype_declaration EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:282:2: iv_ruletype_declaration= ruletype_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_declarationRule()); 
            }
            pushFollow(FOLLOW_ruletype_declaration_in_entryRuletype_declaration563);
            iv_ruletype_declaration=ruletype_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_declaration573); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_declaration"


    // $ANTLR start "ruletype_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:289:1: ruletype_declaration returns [EObject current=null] : ( (this_doc_comment_0= ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) ) ) ;
    public final EObject ruletype_declaration() throws RecognitionException {
        EObject current = null;

        EObject this_doc_comment_0 = null;

        EObject lv_declaracaoClasse_1_0 = null;

        EObject lv_declaracaoInterface_2_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:292:28: ( ( (this_doc_comment_0= ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:293:1: ( (this_doc_comment_0= ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:293:1: ( (this_doc_comment_0= ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:293:2: (this_doc_comment_0= ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:293:2: (this_doc_comment_0= ruledoc_comment )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:294:2: this_doc_comment_0= ruledoc_comment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_declarationAccess().getDoc_commentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruledoc_comment_in_ruletype_declaration624);
                    this_doc_comment_0=ruledoc_comment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_doc_comment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:305:3: ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:305:4: ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:305:4: ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:306:1: (lv_declaracaoClasse_1_0= ruleclass_declaration )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:306:1: (lv_declaracaoClasse_1_0= ruleclass_declaration )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:307:3: lv_declaracaoClasse_1_0= ruleclass_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getDeclaracaoClasseClass_declarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleclass_declaration_in_ruletype_declaration647);
                    lv_declaracaoClasse_1_0=ruleclass_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getType_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"declaracaoClasse",
                              		lv_declaracaoClasse_1_0, 
                              		"class_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:324:6: ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:324:6: ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:325:1: (lv_declaracaoInterface_2_0= ruleinterface_declaration )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:325:1: (lv_declaracaoInterface_2_0= ruleinterface_declaration )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:326:3: lv_declaracaoInterface_2_0= ruleinterface_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getDeclaracaoInterfaceInterface_declarationParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleinterface_declaration_in_ruletype_declaration674);
                    lv_declaracaoInterface_2_0=ruleinterface_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getType_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"declaracaoInterface",
                              		lv_declaracaoInterface_2_0, 
                              		"interface_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_declaration"


    // $ANTLR start "entryRuledoc_comment"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:350:1: entryRuledoc_comment returns [EObject current=null] : iv_ruledoc_comment= ruledoc_comment EOF ;
    public final EObject entryRuledoc_comment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledoc_comment = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:351:2: (iv_ruledoc_comment= ruledoc_comment EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:352:2: iv_ruledoc_comment= ruledoc_comment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoc_commentRule()); 
            }
            pushFollow(FOLLOW_ruledoc_comment_in_entryRuledoc_comment711);
            iv_ruledoc_comment=ruledoc_comment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledoc_comment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledoc_comment721); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledoc_comment"


    // $ANTLR start "ruledoc_comment"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:359:1: ruledoc_comment returns [EObject current=null] : (otherlv_0= '/**' ( (lv_comentario_1_0= RULE_STRING ) ) otherlv_2= '*/' ) ;
    public final EObject ruledoc_comment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_comentario_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:362:28: ( (otherlv_0= '/**' ( (lv_comentario_1_0= RULE_STRING ) ) otherlv_2= '*/' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:363:1: (otherlv_0= '/**' ( (lv_comentario_1_0= RULE_STRING ) ) otherlv_2= '*/' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:363:1: (otherlv_0= '/**' ( (lv_comentario_1_0= RULE_STRING ) ) otherlv_2= '*/' )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:363:3: otherlv_0= '/**' ( (lv_comentario_1_0= RULE_STRING ) ) otherlv_2= '*/'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruledoc_comment758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDoc_commentAccess().getSolidusAsteriskAsteriskKeyword_0());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:367:1: ( (lv_comentario_1_0= RULE_STRING ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:368:1: (lv_comentario_1_0= RULE_STRING )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:368:1: (lv_comentario_1_0= RULE_STRING )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:369:3: lv_comentario_1_0= RULE_STRING
            {
            lv_comentario_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruledoc_comment775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_comentario_1_0, grammarAccess.getDoc_commentAccess().getComentarioSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDoc_commentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"comentario",
                      		lv_comentario_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruledoc_comment792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDoc_commentAccess().getAsteriskSolidusKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledoc_comment"


    // $ANTLR start "entryRuleclass_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:397:1: entryRuleclass_declaration returns [EObject current=null] : iv_ruleclass_declaration= ruleclass_declaration EOF ;
    public final EObject entryRuleclass_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleclass_declaration = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:398:2: (iv_ruleclass_declaration= ruleclass_declaration EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:399:2: iv_ruleclass_declaration= ruleclass_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleclass_declaration_in_entryRuleclass_declaration828);
            iv_ruleclass_declaration=ruleclass_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleclass_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleclass_declaration838); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleclass_declaration"


    // $ANTLR start "ruleclass_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:406:1: ruleclass_declaration returns [EObject current=null] : ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleclass_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nomeClasse_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_modificadores_0_0 = null;

        EObject lv_superclasse_4_0 = null;

        EObject lv_implementosClasse_6_0 = null;

        EObject lv_implementosClasse_8_0 = null;

        EObject lv_corpoClasse_10_0 = null;

        EObject lv_declaracaoClasse_11_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:409:28: ( ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:410:1: ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:410:1: ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}' )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:410:2: ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}'
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:410:2: ( (lv_modificadores_0_0= ruleMODIFIER ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34||LA7_0==53||(LA7_0>=105 && LA7_0<=112)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:411:1: (lv_modificadores_0_0= ruleMODIFIER )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:411:1: (lv_modificadores_0_0= ruleMODIFIER )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:412:3: lv_modificadores_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getModificadoresMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_ruleclass_declaration884);
            	    lv_modificadores_0_0=ruleMODIFIER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modificadores",
            	              		lv_modificadores_0_0, 
            	              		"MODIFIER");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleclass_declaration897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClass_declarationAccess().getClassKeyword_1());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:432:1: ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:433:1: (lv_nomeClasse_2_0= RULE_IDENTIFIER )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:433:1: (lv_nomeClasse_2_0= RULE_IDENTIFIER )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:434:3: lv_nomeClasse_2_0= RULE_IDENTIFIER
            {
            lv_nomeClasse_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleclass_declaration914); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nomeClasse_2_0, grammarAccess.getClass_declarationAccess().getNomeClasseIDENTIFIERTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClass_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nomeClasse",
                      		lv_nomeClasse_2_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:450:2: (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:450:4: otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleclass_declaration932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:454:1: ( (lv_superclasse_4_0= rulename ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:455:1: (lv_superclasse_4_0= rulename )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:455:1: (lv_superclasse_4_0= rulename )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:456:3: lv_superclasse_4_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getSuperclasseNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_ruleclass_declaration953);
                    lv_superclasse_4_0=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"superclasse",
                              		lv_superclasse_4_0, 
                              		"name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:472:4: (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:472:6: otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )*
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleclass_declaration968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:476:1: ( (lv_implementosClasse_6_0= rulename ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:477:1: (lv_implementosClasse_6_0= rulename )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:477:1: (lv_implementosClasse_6_0= rulename )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:478:3: lv_implementosClasse_6_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementosClasseNameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_ruleclass_declaration989);
                    lv_implementosClasse_6_0=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
                      	        }
                             		add(
                             			current, 
                             			"implementosClasse",
                              		lv_implementosClasse_6_0, 
                              		"name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:494:2: (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==26) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:494:4: otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) )
                    	    {
                    	    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleclass_declaration1002); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:498:1: ( (lv_implementosClasse_8_0= rulename ) )
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:499:1: (lv_implementosClasse_8_0= rulename )
                    	    {
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:499:1: (lv_implementosClasse_8_0= rulename )
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:500:3: lv_implementosClasse_8_0= rulename
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementosClasseNameParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulename_in_ruleclass_declaration1023);
                    	    lv_implementosClasse_8_0=rulename();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"implementosClasse",
                    	              		lv_implementosClasse_8_0, 
                    	              		"name");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleclass_declaration1039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:520:1: ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )*
            loop11:
            do {
                int alt11=3;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:520:2: ( (lv_corpoClasse_10_0= rulefield_declaration ) )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:520:2: ( (lv_corpoClasse_10_0= rulefield_declaration ) )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:521:1: (lv_corpoClasse_10_0= rulefield_declaration )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:521:1: (lv_corpoClasse_10_0= rulefield_declaration )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:522:3: lv_corpoClasse_10_0= rulefield_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getCorpoClasseField_declarationParserRuleCall_6_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulefield_declaration_in_ruleclass_declaration1061);
            	    lv_corpoClasse_10_0=rulefield_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"corpoClasse",
            	              		lv_corpoClasse_10_0, 
            	              		"field_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:539:6: ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:539:6: ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:540:1: (lv_declaracaoClasse_11_0= ruleclass_declaration )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:540:1: (lv_declaracaoClasse_11_0= ruleclass_declaration )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:541:3: lv_declaracaoClasse_11_0= ruleclass_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getDeclaracaoClasseClass_declarationParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleclass_declaration_in_ruleclass_declaration1088);
            	    lv_declaracaoClasse_11_0=ruleclass_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declaracaoClasse",
            	              		lv_declaracaoClasse_11_0, 
            	              		"class_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleclass_declaration1102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleclass_declaration"


    // $ANTLR start "entryRuleinterface_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:569:1: entryRuleinterface_declaration returns [EObject current=null] : iv_ruleinterface_declaration= ruleinterface_declaration EOF ;
    public final EObject entryRuleinterface_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinterface_declaration = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:570:2: (iv_ruleinterface_declaration= ruleinterface_declaration EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:571:2: iv_ruleinterface_declaration= ruleinterface_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleinterface_declaration_in_entryRuleinterface_declaration1138);
            iv_ruleinterface_declaration=ruleinterface_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinterface_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleinterface_declaration1148); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinterface_declaration"


    // $ANTLR start "ruleinterface_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:578:1: ruleinterface_declaration returns [EObject current=null] : ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}' ) ;
    public final EObject ruleinterface_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nomeInterface_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_modificadores_0_0 = null;

        EObject lv_superinterfaces_4_0 = null;

        EObject lv_superinterfaces_6_0 = null;

        EObject lv_corpoInterface_8_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:581:28: ( ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:582:1: ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:582:1: ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}' )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:582:2: ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}'
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:582:2: ( (lv_modificadores_0_0= ruleMODIFIER ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34||LA12_0==53||(LA12_0>=105 && LA12_0<=112)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:583:1: (lv_modificadores_0_0= ruleMODIFIER )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:583:1: (lv_modificadores_0_0= ruleMODIFIER )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:584:3: lv_modificadores_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getModificadoresMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_ruleinterface_declaration1194);
            	    lv_modificadores_0_0=ruleMODIFIER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modificadores",
            	              		lv_modificadores_0_0, 
            	              		"MODIFIER");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleinterface_declaration1207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:604:1: ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:605:1: (lv_nomeInterface_2_0= RULE_IDENTIFIER )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:605:1: (lv_nomeInterface_2_0= RULE_IDENTIFIER )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:606:3: lv_nomeInterface_2_0= RULE_IDENTIFIER
            {
            lv_nomeInterface_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleinterface_declaration1224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nomeInterface_2_0, grammarAccess.getInterface_declarationAccess().getNomeInterfaceIDENTIFIERTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInterface_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nomeInterface",
                      		lv_nomeInterface_2_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:622:2: (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:622:4: otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )*
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleinterface_declaration1242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:626:1: ( (lv_superinterfaces_4_0= rulename ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:627:1: (lv_superinterfaces_4_0= rulename )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:627:1: (lv_superinterfaces_4_0= rulename )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:628:3: lv_superinterfaces_4_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getSuperinterfacesNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_ruleinterface_declaration1263);
                    lv_superinterfaces_4_0=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
                      	        }
                             		add(
                             			current, 
                             			"superinterfaces",
                              		lv_superinterfaces_4_0, 
                              		"name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:644:2: (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==26) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:644:4: otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleinterface_declaration1276); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:648:1: ( (lv_superinterfaces_6_0= rulename ) )
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:649:1: (lv_superinterfaces_6_0= rulename )
                    	    {
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:649:1: (lv_superinterfaces_6_0= rulename )
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:650:3: lv_superinterfaces_6_0= rulename
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getSuperinterfacesNameParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulename_in_ruleinterface_declaration1297);
                    	    lv_superinterfaces_6_0=rulename();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"superinterfaces",
                    	              		lv_superinterfaces_6_0, 
                    	              		"name");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleinterface_declaration1313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:670:1: ( (lv_corpoInterface_8_0= rulefield_declaration ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_IDENTIFIER||LA15_0==18||LA15_0==21||LA15_0==30||LA15_0==34||LA15_0==40||LA15_0==53||(LA15_0>=97 && LA15_0<=112)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:671:1: (lv_corpoInterface_8_0= rulefield_declaration )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:671:1: (lv_corpoInterface_8_0= rulefield_declaration )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:672:3: lv_corpoInterface_8_0= rulefield_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getCorpoInterfaceField_declarationParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulefield_declaration_in_ruleinterface_declaration1334);
            	    lv_corpoInterface_8_0=rulefield_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"corpoInterface",
            	              		lv_corpoInterface_8_0, 
            	              		"field_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleinterface_declaration1347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinterface_declaration"


    // $ANTLR start "entryRulefield_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:700:1: entryRulefield_declaration returns [EObject current=null] : iv_rulefield_declaration= rulefield_declaration EOF ;
    public final EObject entryRulefield_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_declaration = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:701:2: (iv_rulefield_declaration= rulefield_declaration EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:702:2: iv_rulefield_declaration= rulefield_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_declarationRule()); 
            }
            pushFollow(FOLLOW_rulefield_declaration_in_entryRulefield_declaration1383);
            iv_rulefield_declaration=rulefield_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefield_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_declaration1393); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefield_declaration"


    // $ANTLR start "rulefield_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:709:1: rulefield_declaration returns [EObject current=null] : ( ( ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) ) | ( (lv_estatico_4_0= rulestatic_initializer ) ) | otherlv_5= ';' ) ;
    public final EObject rulefield_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject lv_comentario_0_0 = null;

        EObject lv_declaracaoMetodo_1_0 = null;

        EObject lv_declaracaoConstrutor_2_0 = null;

        EObject lv_declaracaoVariavel_3_0 = null;

        EObject lv_estatico_4_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:712:28: ( ( ( ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) ) | ( (lv_estatico_4_0= rulestatic_initializer ) ) | otherlv_5= ';' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:713:1: ( ( ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) ) | ( (lv_estatico_4_0= rulestatic_initializer ) ) | otherlv_5= ';' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:713:1: ( ( ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) ) | ( (lv_estatico_4_0= rulestatic_initializer ) ) | otherlv_5= ';' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
            case 21:
            case 30:
            case 34:
            case 40:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
                {
                alt18=1;
                }
                break;
            case 53:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==RULE_IDENTIFIER||LA18_2==30||LA18_2==34||LA18_2==40||LA18_2==53||(LA18_2>=97 && LA18_2<=112)) ) {
                    alt18=1;
                }
                else if ( (LA18_2==27) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:713:2: ( ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:713:2: ( ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:713:3: ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:713:3: ( (lv_comentario_0_0= ruledoc_comment ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==21) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:714:1: (lv_comentario_0_0= ruledoc_comment )
                    	    {
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:714:1: (lv_comentario_0_0= ruledoc_comment )
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:715:3: lv_comentario_0_0= ruledoc_comment
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getField_declarationAccess().getComentarioDoc_commentParserRuleCall_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruledoc_comment_in_rulefield_declaration1440);
                    	    lv_comentario_0_0=ruledoc_comment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"comentario",
                    	              		lv_comentario_0_0, 
                    	              		"doc_comment");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:731:3: ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) )
                    int alt17=3;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:731:4: ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:731:4: ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:732:1: (lv_declaracaoMetodo_1_0= rulemethod_declaration )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:732:1: (lv_declaracaoMetodo_1_0= rulemethod_declaration )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:733:3: lv_declaracaoMetodo_1_0= rulemethod_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoMetodoMethod_declarationParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulemethod_declaration_in_rulefield_declaration1463);
                            lv_declaracaoMetodo_1_0=rulemethod_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"declaracaoMetodo",
                                      		lv_declaracaoMetodo_1_0, 
                                      		"method_declaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:750:6: ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:750:6: ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:751:1: (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:751:1: (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:752:3: lv_declaracaoConstrutor_2_0= ruleconstructor_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoConstrutorConstructor_declarationParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleconstructor_declaration_in_rulefield_declaration1490);
                            lv_declaracaoConstrutor_2_0=ruleconstructor_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"declaracaoConstrutor",
                                      		lv_declaracaoConstrutor_2_0, 
                                      		"constructor_declaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:769:6: ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:769:6: ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:770:1: (lv_declaracaoVariavel_3_0= rulevariable_declaration )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:770:1: (lv_declaracaoVariavel_3_0= rulevariable_declaration )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:771:3: lv_declaracaoVariavel_3_0= rulevariable_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulevariable_declaration_in_rulefield_declaration1517);
                            lv_declaracaoVariavel_3_0=rulevariable_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"declaracaoVariavel",
                                      		lv_declaracaoVariavel_3_0, 
                                      		"variable_declaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:788:6: ( (lv_estatico_4_0= rulestatic_initializer ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:788:6: ( (lv_estatico_4_0= rulestatic_initializer ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:789:1: (lv_estatico_4_0= rulestatic_initializer )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:789:1: (lv_estatico_4_0= rulestatic_initializer )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:790:3: lv_estatico_4_0= rulestatic_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getField_declarationAccess().getEstaticoStatic_initializerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatic_initializer_in_rulefield_declaration1546);
                    lv_estatico_4_0=rulestatic_initializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"estatico",
                              		lv_estatico_4_0, 
                              		"static_initializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:807:7: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulefield_declaration1564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getField_declarationAccess().getSemicolonKeyword_2());
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefield_declaration"


    // $ANTLR start "entryRulemethod_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:819:1: entryRulemethod_declaration returns [EObject current=null] : iv_rulemethod_declaration= rulemethod_declaration EOF ;
    public final EObject entryRulemethod_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemethod_declaration = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:820:2: (iv_rulemethod_declaration= rulemethod_declaration EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:821:2: iv_rulemethod_declaration= rulemethod_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            }
            pushFollow(FOLLOW_rulemethod_declaration_in_entryRulemethod_declaration1600);
            iv_rulemethod_declaration=rulemethod_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemethod_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemethod_declaration1610); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemethod_declaration"


    // $ANTLR start "rulemethod_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:828:1: rulemethod_declaration returns [EObject current=null] : ( ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' ) ) ;
    public final EObject rulemethod_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_nomeMetodo_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_modificadorMetodo_0_0 = null;

        EObject lv_tipoRetorno_1_0 = null;

        EObject lv_parametrosMetodo_4_0 = null;

        EObject lv_blocoMetodo_8_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:831:28: ( ( ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:832:1: ( ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:832:1: ( ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:832:2: ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:832:2: ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34||LA19_0==53||(LA19_0>=105 && LA19_0<=112)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:833:1: (lv_modificadorMetodo_0_0= ruleMODIFIER )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:833:1: (lv_modificadorMetodo_0_0= ruleMODIFIER )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:834:3: lv_modificadorMetodo_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getModificadorMetodoMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_rulemethod_declaration1656);
            	    lv_modificadorMetodo_0_0=ruleMODIFIER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"modificadorMetodo",
            	              		lv_modificadorMetodo_0_0, 
            	              		"MODIFIER");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:850:3: ( (lv_tipoRetorno_1_0= ruletype ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:851:1: (lv_tipoRetorno_1_0= ruletype )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:851:1: (lv_tipoRetorno_1_0= ruletype )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:852:3: lv_tipoRetorno_1_0= ruletype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getTipoRetornoTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_in_rulemethod_declaration1678);
            lv_tipoRetorno_1_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"tipoRetorno",
                      		lv_tipoRetorno_1_0, 
                      		"type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:868:2: ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:869:1: (lv_nomeMetodo_2_0= RULE_IDENTIFIER )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:869:1: (lv_nomeMetodo_2_0= RULE_IDENTIFIER )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:870:3: lv_nomeMetodo_2_0= RULE_IDENTIFIER
            {
            lv_nomeMetodo_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulemethod_declaration1695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nomeMetodo_2_0, grammarAccess.getMethod_declarationAccess().getNomeMetodoIDENTIFIERTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethod_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nomeMetodo",
                      		lv_nomeMetodo_2_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_rulemethod_declaration1712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:890:1: ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENTIFIER||(LA20_0>=97 && LA20_0<=104)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:891:1: (lv_parametrosMetodo_4_0= ruleparameter_list )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:891:1: (lv_parametrosMetodo_4_0= ruleparameter_list )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:892:3: lv_parametrosMetodo_4_0= ruleparameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getParametrosMetodoParameter_listParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleparameter_list_in_rulemethod_declaration1733);
                    lv_parametrosMetodo_4_0=ruleparameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"parametrosMetodo",
                              		lv_parametrosMetodo_4_0, 
                              		"parameter_list");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_rulemethod_declaration1746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:912:1: (otherlv_6= '[' otherlv_7= ']' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:912:3: otherlv_6= '[' otherlv_7= ']'
            	    {
            	    otherlv_6=(Token)match(input,32,FOLLOW_32_in_rulemethod_declaration1759); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketKeyword_6_0());
            	          
            	    }
            	    otherlv_7=(Token)match(input,33,FOLLOW_33_in_rulemethod_declaration1771); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMethod_declarationAccess().getRightSquareBracketKeyword_6_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:920:3: ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            else if ( (LA22_0==18) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:920:4: ( (lv_blocoMetodo_8_0= rulestatement_block ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:920:4: ( (lv_blocoMetodo_8_0= rulestatement_block ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:921:1: (lv_blocoMetodo_8_0= rulestatement_block )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:921:1: (lv_blocoMetodo_8_0= rulestatement_block )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:922:3: lv_blocoMetodo_8_0= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getBlocoMetodoStatement_blockParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_rulemethod_declaration1795);
                    lv_blocoMetodo_8_0=rulestatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"blocoMetodo",
                              		lv_blocoMetodo_8_0, 
                              		"statement_block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:939:7: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_rulemethod_declaration1813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getMethod_declarationAccess().getSemicolonKeyword_7_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemethod_declaration"


    // $ANTLR start "entryRuleparameter"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:951:1: entryRuleparameter returns [EObject current=null] : iv_ruleparameter= ruleparameter EOF ;
    public final EObject entryRuleparameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:952:2: (iv_ruleparameter= ruleparameter EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:953:2: iv_ruleparameter= ruleparameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleparameter_in_entryRuleparameter1850);
            iv_ruleparameter=ruleparameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter1860); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameter"


    // $ANTLR start "ruleparameter"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:960:1: ruleparameter returns [EObject current=null] : ( ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )* ) ;
    public final EObject ruleparameter() throws RecognitionException {
        EObject current = null;

        Token lv_nomeParametro_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_tipoParametro_0_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:963:28: ( ( ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )* ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:964:1: ( ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:964:1: ( ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:964:2: ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )*
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:964:2: ( (lv_tipoParametro_0_0= ruletype ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:965:1: (lv_tipoParametro_0_0= ruletype )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:965:1: (lv_tipoParametro_0_0= ruletype )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:966:3: lv_tipoParametro_0_0= ruletype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTipoParametroTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_in_ruleparameter1906);
            lv_tipoParametro_0_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"tipoParametro",
                      		lv_tipoParametro_0_0, 
                      		"type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:982:2: ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:983:1: (lv_nomeParametro_1_0= RULE_IDENTIFIER )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:983:1: (lv_nomeParametro_1_0= RULE_IDENTIFIER )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:984:3: lv_nomeParametro_1_0= RULE_IDENTIFIER
            {
            lv_nomeParametro_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleparameter1923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nomeParametro_1_0, grammarAccess.getParameterAccess().getNomeParametroIDENTIFIERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nomeParametro",
                      		lv_nomeParametro_1_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1000:2: (otherlv_2= '[' otherlv_3= ']' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1000:4: otherlv_2= '[' otherlv_3= ']'
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleparameter1941); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleparameter1953); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameter"


    // $ANTLR start "entryRuleparameter_list"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1016:1: entryRuleparameter_list returns [EObject current=null] : iv_ruleparameter_list= ruleparameter_list EOF ;
    public final EObject entryRuleparameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_list = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1017:2: (iv_ruleparameter_list= ruleparameter_list EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1018:2: iv_ruleparameter_list= ruleparameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_ruleparameter_list_in_entryRuleparameter_list1991);
            iv_ruleparameter_list=ruleparameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_list2001); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameter_list"


    // $ANTLR start "ruleparameter_list"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1025:1: ruleparameter_list returns [EObject current=null] : ( ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )* ) ;
    public final EObject ruleparameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parametros_0_0 = null;

        EObject lv_parametros_2_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1028:28: ( ( ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )* ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1029:1: ( ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )* )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1029:1: ( ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )* )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1029:2: ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )*
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1029:2: ( (lv_parametros_0_0= ruleparameter ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1030:1: (lv_parametros_0_0= ruleparameter )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1030:1: (lv_parametros_0_0= ruleparameter )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1031:3: lv_parametros_0_0= ruleparameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametrosParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparameter_in_ruleparameter_list2047);
            lv_parametros_0_0=ruleparameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameter_listRule());
              	        }
                     		add(
                     			current, 
                     			"parametros",
                      		lv_parametros_0_0, 
                      		"parameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1047:2: (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==26) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1047:4: otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleparameter_list2060); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1051:1: ( (lv_parametros_2_0= ruleparameter ) )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1052:1: (lv_parametros_2_0= ruleparameter )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1052:1: (lv_parametros_2_0= ruleparameter )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1053:3: lv_parametros_2_0= ruleparameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametrosParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleparameter_in_ruleparameter_list2081);
            	    lv_parametros_2_0=ruleparameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParameter_listRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parametros",
            	              		lv_parametros_2_0, 
            	              		"parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameter_list"


    // $ANTLR start "entryRulestatement_block"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1077:1: entryRulestatement_block returns [EObject current=null] : iv_rulestatement_block= rulestatement_block EOF ;
    public final EObject entryRulestatement_block() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_block = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1078:2: (iv_rulestatement_block= rulestatement_block EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1079:2: iv_rulestatement_block= rulestatement_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_blockRule()); 
            }
            pushFollow(FOLLOW_rulestatement_block_in_entryRulestatement_block2119);
            iv_rulestatement_block=rulestatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement_block; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_block2129); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement_block"


    // $ANTLR start "rulestatement_block"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1086:1: rulestatement_block returns [EObject current=null] : (otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}' ) ;
    public final EObject rulestatement_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_corpo_1_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1089:28: ( (otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1090:1: (otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1090:1: (otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}' )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1090:3: otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulestatement_block2166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1094:1: ( (lv_corpo_1_0= rulestatement ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_FLOAT_LITERAL)||LA25_0==18||LA25_0==27||LA25_0==30||(LA25_0>=34 && LA25_0<=36)||(LA25_0>=38 && LA25_0<=40)||LA25_0==42||(LA25_0>=44 && LA25_0<=47)||LA25_0==50||(LA25_0>=53 && LA25_0<=57)||(LA25_0>=60 && LA25_0<=62)||(LA25_0>=92 && LA25_0<=95)||(LA25_0>=97 && LA25_0<=112)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1095:1: (lv_corpo_1_0= rulestatement )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1095:1: (lv_corpo_1_0= rulestatement )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1096:3: lv_corpo_1_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatement_blockAccess().getCorpoStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_block2187);
            	    lv_corpo_1_0=rulestatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatement_blockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"corpo",
            	              		lv_corpo_1_0, 
            	              		"statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulestatement_block2200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_block"


    // $ANTLR start "entryRulestatement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1124:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1125:2: (iv_rulestatement= rulestatement EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1126:2: iv_rulestatement= rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement2236);
            iv_rulestatement=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement2246); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1133:1: rulestatement returns [EObject current=null] : ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_newbloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token this_IDENTIFIER_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token lv_break_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_continue_28_0=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        EObject lv_declaracaoVariavel_0_0 = null;

        EObject lv_expressao_1_0 = null;

        EObject lv_newbloco_3_0 = null;

        EObject lv_corpoIf_4_0 = null;

        EObject lv_corpoDoWhile_5_0 = null;

        EObject lv_corpoWhile_6_0 = null;

        EObject lv_corpoFor_7_0 = null;

        EObject lv_corpoTryCatch_8_0 = null;

        EObject lv_corpoSwitchCase_9_0 = null;

        EObject lv_expressaoSynchronized_12_0 = null;

        EObject lv_corpoSynchronize_14_0 = null;

        EObject lv_return_16_0 = null;

        EObject lv_exececao_19_0 = null;

        EObject this_statement_23 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1136:28: ( ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_newbloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1137:1: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_newbloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1137:1: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_newbloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' )
            int alt29=16;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1137:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1137:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1137:3: ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1148:1: (lv_declaracaoVariavel_0_0= rulevariable_declaration )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1149:3: lv_declaracaoVariavel_0_0= rulevariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulevariable_declaration_in_rulestatement2362);
                    lv_declaracaoVariavel_0_0=rulevariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"declaracaoVariavel",
                              		lv_declaracaoVariavel_0_0, 
                              		"variable_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1166:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1166:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1166:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';'
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1166:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1166:8: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1179:1: (lv_expressao_1_0= ruleexpression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1180:3: lv_expressao_1_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressaoExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement2499);
                    lv_expressao_1_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expressao",
                              		lv_expressao_1_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulestatement2511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1201:6: ( (lv_newbloco_3_0= rulestatement_block ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1201:6: ( (lv_newbloco_3_0= rulestatement_block ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1202:1: (lv_newbloco_3_0= rulestatement_block )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1202:1: (lv_newbloco_3_0= rulestatement_block )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1203:3: lv_newbloco_3_0= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getNewblocoStatement_blockParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_rulestatement2539);
                    lv_newbloco_3_0=rulestatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"newbloco",
                              		lv_newbloco_3_0, 
                              		"statement_block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1220:6: ( (lv_corpoIf_4_0= ruleif_statement ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1220:6: ( (lv_corpoIf_4_0= ruleif_statement ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1221:1: (lv_corpoIf_4_0= ruleif_statement )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1221:1: (lv_corpoIf_4_0= ruleif_statement )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1222:3: lv_corpoIf_4_0= ruleif_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoIfIf_statementParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleif_statement_in_rulestatement2566);
                    lv_corpoIf_4_0=ruleif_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"corpoIf",
                              		lv_corpoIf_4_0, 
                              		"if_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1239:6: ( (lv_corpoDoWhile_5_0= ruledo_statement ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1239:6: ( (lv_corpoDoWhile_5_0= ruledo_statement ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1240:1: (lv_corpoDoWhile_5_0= ruledo_statement )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1240:1: (lv_corpoDoWhile_5_0= ruledo_statement )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1241:3: lv_corpoDoWhile_5_0= ruledo_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoDoWhileDo_statementParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledo_statement_in_rulestatement2593);
                    lv_corpoDoWhile_5_0=ruledo_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"corpoDoWhile",
                              		lv_corpoDoWhile_5_0, 
                              		"do_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1258:6: ( (lv_corpoWhile_6_0= rulewhile_statement ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1258:6: ( (lv_corpoWhile_6_0= rulewhile_statement ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1259:1: (lv_corpoWhile_6_0= rulewhile_statement )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1259:1: (lv_corpoWhile_6_0= rulewhile_statement )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1260:3: lv_corpoWhile_6_0= rulewhile_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoWhileWhile_statementParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulewhile_statement_in_rulestatement2620);
                    lv_corpoWhile_6_0=rulewhile_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"corpoWhile",
                              		lv_corpoWhile_6_0, 
                              		"while_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1277:6: ( (lv_corpoFor_7_0= rulefor_statement ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1277:6: ( (lv_corpoFor_7_0= rulefor_statement ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1278:1: (lv_corpoFor_7_0= rulefor_statement )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1278:1: (lv_corpoFor_7_0= rulefor_statement )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1279:3: lv_corpoFor_7_0= rulefor_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoForFor_statementParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefor_statement_in_rulestatement2647);
                    lv_corpoFor_7_0=rulefor_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"corpoFor",
                              		lv_corpoFor_7_0, 
                              		"for_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1296:6: ( (lv_corpoTryCatch_8_0= ruletry_statement ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1296:6: ( (lv_corpoTryCatch_8_0= ruletry_statement ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1297:1: (lv_corpoTryCatch_8_0= ruletry_statement )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1297:1: (lv_corpoTryCatch_8_0= ruletry_statement )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1298:3: lv_corpoTryCatch_8_0= ruletry_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoTryCatchTry_statementParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletry_statement_in_rulestatement2674);
                    lv_corpoTryCatch_8_0=ruletry_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"corpoTryCatch",
                              		lv_corpoTryCatch_8_0, 
                              		"try_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1315:6: ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1315:6: ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1316:1: (lv_corpoSwitchCase_9_0= ruleswitch_statement )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1316:1: (lv_corpoSwitchCase_9_0= ruleswitch_statement )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1317:3: lv_corpoSwitchCase_9_0= ruleswitch_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoSwitchCaseSwitch_statementParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleswitch_statement_in_rulestatement2701);
                    lv_corpoSwitchCase_9_0=ruleswitch_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"corpoSwitchCase",
                              		lv_corpoSwitchCase_9_0, 
                              		"switch_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1334:6: (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1334:6: (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1334:8: otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) )
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_34_in_rulestatement2720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getSynchronizedKeyword_9_0());
                          
                    }
                    otherlv_11=(Token)match(input,30,FOLLOW_30_in_rulestatement2732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_9_1());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1342:1: ( (lv_expressaoSynchronized_12_0= ruleexpression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1343:1: (lv_expressaoSynchronized_12_0= ruleexpression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1343:1: (lv_expressaoSynchronized_12_0= ruleexpression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1344:3: lv_expressaoSynchronized_12_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressaoSynchronizedExpressionParserRuleCall_9_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement2753);
                    lv_expressaoSynchronized_12_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expressaoSynchronized",
                              		lv_expressaoSynchronized_12_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,31,FOLLOW_31_in_rulestatement2765); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getRightParenthesisKeyword_9_3());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1364:1: ( (lv_corpoSynchronize_14_0= rulestatement ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1365:1: (lv_corpoSynchronize_14_0= rulestatement )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1365:1: (lv_corpoSynchronize_14_0= rulestatement )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1366:3: lv_corpoSynchronize_14_0= rulestatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoSynchronizeStatementParserRuleCall_9_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement2786);
                    lv_corpoSynchronize_14_0=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"corpoSynchronize",
                              		lv_corpoSynchronize_14_0, 
                              		"statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1383:6: (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1383:6: (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1383:8: otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';'
                    {
                    otherlv_15=(Token)match(input,35,FOLLOW_35_in_rulestatement2806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getReturnKeyword_10_0());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1387:1: ( (lv_return_16_0= ruleexpression ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_FLOAT_LITERAL)||LA26_0==30||(LA26_0>=54 && LA26_0<=57)||(LA26_0>=60 && LA26_0<=62)||(LA26_0>=92 && LA26_0<=95)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1388:1: (lv_return_16_0= ruleexpression )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1388:1: (lv_return_16_0= ruleexpression )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1389:3: lv_return_16_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getReturnExpressionParserRuleCall_10_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpression_in_rulestatement2827);
                            lv_return_16_0=ruleexpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"return",
                                      		lv_return_16_0, 
                                      		"expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,18,FOLLOW_18_in_rulestatement2840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getStatementAccess().getSemicolonKeyword_10_2());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1410:6: (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1410:6: (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1410:8: otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';'
                    {
                    otherlv_18=(Token)match(input,36,FOLLOW_36_in_rulestatement2860); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getStatementAccess().getThrowKeyword_11_0());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1414:1: ( (lv_exececao_19_0= ruleexpression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1415:1: (lv_exececao_19_0= ruleexpression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1415:1: (lv_exececao_19_0= ruleexpression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1416:3: lv_exececao_19_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExececaoExpressionParserRuleCall_11_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement2881);
                    lv_exececao_19_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"exececao",
                              		lv_exececao_19_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,18,FOLLOW_18_in_rulestatement2893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getStatementAccess().getSemicolonKeyword_11_2());
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1437:6: (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1437:6: (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1437:7: this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement
                    {
                    this_IDENTIFIER_21=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement2912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENTIFIER_21, grammarAccess.getStatementAccess().getIDENTIFIERTerminalRuleCall_12_0()); 
                          
                    }
                    otherlv_22=(Token)match(input,37,FOLLOW_37_in_rulestatement2923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getStatementAccess().getColonKeyword_12_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatementParserRuleCall_12_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement2948);
                    this_statement_23=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_statement_23; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1458:6: (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1458:6: (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1458:8: otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';'
                    {
                    otherlv_24=(Token)match(input,38,FOLLOW_38_in_rulestatement2967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getStatementAccess().getBreakKeyword_13_0());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1462:1: ( (lv_break_25_0= RULE_IDENTIFIER ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_IDENTIFIER) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1463:1: (lv_break_25_0= RULE_IDENTIFIER )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1463:1: (lv_break_25_0= RULE_IDENTIFIER )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1464:3: lv_break_25_0= RULE_IDENTIFIER
                            {
                            lv_break_25_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement2984); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_break_25_0, grammarAccess.getStatementAccess().getBreakIDENTIFIERTerminalRuleCall_13_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"break",
                                      		lv_break_25_0, 
                                      		"IDENTIFIER");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_26=(Token)match(input,18,FOLLOW_18_in_rulestatement3002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getStatementAccess().getSemicolonKeyword_13_2());
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1485:6: (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1485:6: (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1485:8: otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';'
                    {
                    otherlv_27=(Token)match(input,39,FOLLOW_39_in_rulestatement3022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getStatementAccess().getContinueKeyword_14_0());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1489:1: ( (lv_continue_28_0= RULE_IDENTIFIER ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_IDENTIFIER) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1490:1: (lv_continue_28_0= RULE_IDENTIFIER )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1490:1: (lv_continue_28_0= RULE_IDENTIFIER )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1491:3: lv_continue_28_0= RULE_IDENTIFIER
                            {
                            lv_continue_28_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement3039); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_continue_28_0, grammarAccess.getStatementAccess().getContinueIDENTIFIERTerminalRuleCall_14_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"continue",
                                      		lv_continue_28_0, 
                                      		"IDENTIFIER");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_29=(Token)match(input,18,FOLLOW_18_in_rulestatement3057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getStatementAccess().getSemicolonKeyword_14_2());
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1512:7: otherlv_30= ';'
                    {
                    otherlv_30=(Token)match(input,18,FOLLOW_18_in_rulestatement3076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getStatementAccess().getSemicolonKeyword_15());
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulevariable_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1524:1: entryRulevariable_declaration returns [EObject current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final EObject entryRulevariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1525:2: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1526:2: iv_rulevariable_declaration= rulevariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration3112);
            iv_rulevariable_declaration=rulevariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration3122); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_declaration"


    // $ANTLR start "rulevariable_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1533:1: rulevariable_declaration returns [EObject current=null] : ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) ) ) ;
    public final EObject rulevariable_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_modificador_0_0 = null;

        EObject lv_tipoVariavel_1_0 = null;

        EObject lv_declaracaoVariaveis_3_0 = null;

        EObject lv_declaracaoVariaveis_5_0 = null;

        EObject lv_blocoVariavel_7_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1536:28: ( ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1537:1: ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1537:1: ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1537:2: ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1537:2: ( (lv_modificador_0_0= ruleMODIFIER ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34||LA30_0==53||(LA30_0>=105 && LA30_0<=112)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1538:1: (lv_modificador_0_0= ruleMODIFIER )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1538:1: (lv_modificador_0_0= ruleMODIFIER )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1539:3: lv_modificador_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getModificadorMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_rulevariable_declaration3168);
            	    lv_modificador_0_0=ruleMODIFIER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"modificador",
            	              		lv_modificador_0_0, 
            	              		"MODIFIER");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1555:3: ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )?
            int alt31=3;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1555:4: ( (lv_tipoVariavel_1_0= ruletype ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1555:4: ( (lv_tipoVariavel_1_0= ruletype ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1556:1: (lv_tipoVariavel_1_0= ruletype )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1556:1: (lv_tipoVariavel_1_0= ruletype )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1557:3: lv_tipoVariavel_1_0= ruletype
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getTipoVariavelTypeParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_in_rulevariable_declaration3191);
                    lv_tipoVariavel_1_0=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"tipoVariavel",
                              		lv_tipoVariavel_1_0, 
                              		"type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1574:7: otherlv_2= 'void'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_rulevariable_declaration3209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getVariable_declarationAccess().getVoidKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1578:3: ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1579:1: (lv_declaracaoVariaveis_3_0= rulevariable_declarator )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1579:1: (lv_declaracaoVariaveis_3_0= rulevariable_declarator )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1580:3: lv_declaracaoVariaveis_3_0= rulevariable_declarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getDeclaracaoVariaveisVariable_declaratorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulevariable_declarator_in_rulevariable_declaration3232);
            lv_declaracaoVariaveis_3_0=rulevariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
              	        }
                     		add(
                     			current, 
                     			"declaracaoVariaveis",
                      		lv_declaracaoVariaveis_3_0, 
                      		"variable_declarator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1596:2: (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1596:4: otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_rulevariable_declaration3245); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1600:1: ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1601:1: (lv_declaracaoVariaveis_5_0= rulevariable_declarator )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1601:1: (lv_declaracaoVariaveis_5_0= rulevariable_declarator )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1602:3: lv_declaracaoVariaveis_5_0= rulevariable_declarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getDeclaracaoVariaveisVariable_declaratorParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulevariable_declarator_in_rulevariable_declaration3266);
            	    lv_declaracaoVariaveis_5_0=rulevariable_declarator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declaracaoVariaveis",
            	              		lv_declaracaoVariaveis_5_0, 
            	              		"variable_declarator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1618:4: (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) ) {
                alt33=1;
            }
            else if ( (LA33_0==27) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1618:6: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_rulevariable_declaration3281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1623:6: ( (lv_blocoVariavel_7_0= rulestatement_block ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1623:6: ( (lv_blocoVariavel_7_0= rulestatement_block ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1624:1: (lv_blocoVariavel_7_0= rulestatement_block )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1624:1: (lv_blocoVariavel_7_0= rulestatement_block )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1625:3: lv_blocoVariavel_7_0= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getBlocoVariavelStatement_blockParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_rulevariable_declaration3308);
                    lv_blocoVariavel_7_0=rulestatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"blocoVariavel",
                              		lv_blocoVariavel_7_0, 
                              		"statement_block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_declaration"


    // $ANTLR start "entryRulevariable_declarator"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1649:1: entryRulevariable_declarator returns [EObject current=null] : iv_rulevariable_declarator= rulevariable_declarator EOF ;
    public final EObject entryRulevariable_declarator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declarator = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1650:2: (iv_rulevariable_declarator= rulevariable_declarator EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1651:2: iv_rulevariable_declarator= rulevariable_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaratorRule()); 
            }
            pushFollow(FOLLOW_rulevariable_declarator_in_entryRulevariable_declarator3345);
            iv_rulevariable_declarator=rulevariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_declarator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declarator3355); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_declarator"


    // $ANTLR start "rulevariable_declarator"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1658:1: rulevariable_declarator returns [EObject current=null] : ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* ( ( (lv_op_6_0= '=' ) ) ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? ) ) ;
    public final EObject rulevariable_declarator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_nomeVariavel_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_op_6_0=null;
        EObject this_arglist_1 = null;

        EObject lv_valorVariavel_7_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1661:28: ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* ( ( (lv_op_6_0= '=' ) ) ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1662:1: ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* ( ( (lv_op_6_0= '=' ) ) ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1662:1: ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* ( ( (lv_op_6_0= '=' ) ) ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_IDENTIFIER) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1662:2: (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1662:2: (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1662:4: otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulevariable_declarator3393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVariable_declaratorAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1666:1: (this_arglist_1= rulearglist )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_FLOAT_LITERAL)||LA34_0==30||(LA34_0>=54 && LA34_0<=57)||(LA34_0>=60 && LA34_0<=62)||(LA34_0>=92 && LA34_0<=104)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1667:2: this_arglist_1= rulearglist
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getVariable_declaratorAccess().getArglistParserRuleCall_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_rulearglist_in_rulevariable_declarator3419);
                            this_arglist_1=rulearglist();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_arglist_1; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulevariable_declarator3432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getVariable_declaratorAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1683:6: ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* ( ( (lv_op_6_0= '=' ) ) ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1683:6: ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* ( ( (lv_op_6_0= '=' ) ) ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1683:7: ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* ( ( (lv_op_6_0= '=' ) ) ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )?
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1683:7: ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1684:1: (lv_nomeVariavel_3_0= RULE_IDENTIFIER )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1684:1: (lv_nomeVariavel_3_0= RULE_IDENTIFIER )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1685:3: lv_nomeVariavel_3_0= RULE_IDENTIFIER
                    {
                    lv_nomeVariavel_3_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariable_declarator3457); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_nomeVariavel_3_0, grammarAccess.getVariable_declaratorAccess().getNomeVariavelIDENTIFIERTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariable_declaratorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"nomeVariavel",
                              		lv_nomeVariavel_3_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1701:2: (otherlv_4= '[' otherlv_5= ']' )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==32) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1701:4: otherlv_4= '[' otherlv_5= ']'
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_rulevariable_declarator3475); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketKeyword_1_1_0());
                    	          
                    	    }
                    	    otherlv_5=(Token)match(input,33,FOLLOW_33_in_rulevariable_declarator3487); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getVariable_declaratorAccess().getRightSquareBracketKeyword_1_1_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1709:3: ( ( (lv_op_6_0= '=' ) ) ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==41) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1709:4: ( (lv_op_6_0= '=' ) ) ( (lv_valorVariavel_7_0= rulevariable_initializer ) )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1709:4: ( (lv_op_6_0= '=' ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1710:1: (lv_op_6_0= '=' )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1710:1: (lv_op_6_0= '=' )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1711:3: lv_op_6_0= '='
                            {
                            lv_op_6_0=(Token)match(input,41,FOLLOW_41_in_rulevariable_declarator3508); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_6_0, grammarAccess.getVariable_declaratorAccess().getOpEqualsSignKeyword_1_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVariable_declaratorRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_6_0, "=");
                              	    
                            }

                            }


                            }

                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1724:2: ( (lv_valorVariavel_7_0= rulevariable_initializer ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1725:1: (lv_valorVariavel_7_0= rulevariable_initializer )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1725:1: (lv_valorVariavel_7_0= rulevariable_initializer )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1726:3: lv_valorVariavel_7_0= rulevariable_initializer
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariable_declaratorAccess().getValorVariavelVariable_initializerParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_declarator3542);
                            lv_valorVariavel_7_0=rulevariable_initializer();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getVariable_declaratorRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"valorVariavel",
                                      		lv_valorVariavel_7_0, 
                                      		"variable_initializer");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_declarator"


    // $ANTLR start "entryRulevariable_initializer"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1750:1: entryRulevariable_initializer returns [EObject current=null] : iv_rulevariable_initializer= rulevariable_initializer EOF ;
    public final EObject entryRulevariable_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_initializer = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1751:2: (iv_rulevariable_initializer= rulevariable_initializer EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1752:2: iv_rulevariable_initializer= rulevariable_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_initializerRule()); 
            }
            pushFollow(FOLLOW_rulevariable_initializer_in_entryRulevariable_initializer3581);
            iv_rulevariable_initializer=rulevariable_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_initializer3591); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_initializer"


    // $ANTLR start "rulevariable_initializer"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1759:1: rulevariable_initializer returns [EObject current=null] : ( ( (lv_expressaoVariavel_0_0= ruleexpression ) ) | (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) ) ;
    public final EObject rulevariable_initializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_expressaoVariavel_0_0 = null;

        EObject lv_valorVariaveis_2_0 = null;

        EObject lv_valorVariaveis_4_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1762:28: ( ( ( (lv_expressaoVariavel_0_0= ruleexpression ) ) | (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1763:1: ( ( (lv_expressaoVariavel_0_0= ruleexpression ) ) | (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1763:1: ( ( (lv_expressaoVariavel_0_0= ruleexpression ) ) | (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_FLOAT_LITERAL)||LA41_0==30||(LA41_0>=54 && LA41_0<=57)||(LA41_0>=60 && LA41_0<=62)||(LA41_0>=92 && LA41_0<=95)) ) {
                alt41=1;
            }
            else if ( (LA41_0==27) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1763:2: ( (lv_expressaoVariavel_0_0= ruleexpression ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1763:2: ( (lv_expressaoVariavel_0_0= ruleexpression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1764:1: (lv_expressaoVariavel_0_0= ruleexpression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1764:1: (lv_expressaoVariavel_0_0= ruleexpression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1765:3: lv_expressaoVariavel_0_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getExpressaoVariavelExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulevariable_initializer3637);
                    lv_expressaoVariavel_0_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable_initializerRule());
                      	        }
                             		set(
                             			current, 
                             			"expressaoVariavel",
                              		lv_expressaoVariavel_0_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1782:6: (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1782:6: (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1782:8: otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_rulevariable_initializer3656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariable_initializerAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1786:1: ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_FLOAT_LITERAL)||LA40_0==27||LA40_0==30||(LA40_0>=54 && LA40_0<=57)||(LA40_0>=60 && LA40_0<=62)||(LA40_0>=92 && LA40_0<=95)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1786:2: ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )?
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1786:2: ( (lv_valorVariaveis_2_0= rulevariable_initializer ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1787:1: (lv_valorVariaveis_2_0= rulevariable_initializer )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1787:1: (lv_valorVariaveis_2_0= rulevariable_initializer )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1788:3: lv_valorVariaveis_2_0= rulevariable_initializer
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getValorVariaveisVariable_initializerParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_initializer3678);
                            lv_valorVariaveis_2_0=rulevariable_initializer();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getVariable_initializerRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"valorVariaveis",
                                      		lv_valorVariaveis_2_0, 
                                      		"variable_initializer");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1804:2: (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==26) ) {
                                    int LA38_1 = input.LA(2);

                                    if ( ((LA38_1>=RULE_STRING && LA38_1<=RULE_FLOAT_LITERAL)||LA38_1==27||LA38_1==30||(LA38_1>=54 && LA38_1<=57)||(LA38_1>=60 && LA38_1<=62)||(LA38_1>=92 && LA38_1<=95)) ) {
                                        alt38=1;
                                    }


                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1804:4: otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) )
                            	    {
                            	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_rulevariable_initializer3691); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getVariable_initializerAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1808:1: ( (lv_valorVariaveis_4_0= rulevariable_initializer ) )
                            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1809:1: (lv_valorVariaveis_4_0= rulevariable_initializer )
                            	    {
                            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1809:1: (lv_valorVariaveis_4_0= rulevariable_initializer )
                            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1810:3: lv_valorVariaveis_4_0= rulevariable_initializer
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getValorVariaveisVariable_initializerParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_initializer3712);
                            	    lv_valorVariaveis_4_0=rulevariable_initializer();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getVariable_initializerRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"valorVariaveis",
                            	              		lv_valorVariaveis_4_0, 
                            	              		"variable_initializer");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);

                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1826:4: (otherlv_5= ',' )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==26) ) {
                                alt39=1;
                            }
                            switch (alt39) {
                                case 1 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1826:6: otherlv_5= ','
                                    {
                                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_rulevariable_initializer3727); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_5, grammarAccess.getVariable_initializerAccess().getCommaKeyword_1_1_2());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_rulevariable_initializer3743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getVariable_initializerAccess().getRightCurlyBracketKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_initializer"


    // $ANTLR start "entryRuleif_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1842:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1843:2: (iv_ruleif_statement= ruleif_statement EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1844:2: iv_ruleif_statement= ruleif_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_statementRule()); 
            }
            pushFollow(FOLLOW_ruleif_statement_in_entryRuleif_statement3780);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleif_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_statement3790); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleif_statement"


    // $ANTLR start "ruleif_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1851:1: ruleif_statement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )? ) ;
    public final EObject ruleif_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_espressaoIf_2_0 = null;

        EObject lv_blcoIf_4_0 = null;

        EObject lv_blocoElse_6_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1854:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )? ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1855:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )? )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1855:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )? )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1855:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleif_statement3827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleif_statement3839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIf_statementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1863:1: ( (lv_espressaoIf_2_0= ruleexpression ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1864:1: (lv_espressaoIf_2_0= ruleexpression )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1864:1: (lv_espressaoIf_2_0= ruleexpression )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1865:3: lv_espressaoIf_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_statementAccess().getEspressaoIfExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleif_statement3860);
            lv_espressaoIf_2_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
              	        }
                     		set(
                     			current, 
                     			"espressaoIf",
                      		lv_espressaoIf_2_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleif_statement3872); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIf_statementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1885:1: ( (lv_blcoIf_4_0= rulestatement ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1886:1: (lv_blcoIf_4_0= rulestatement )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1886:1: (lv_blcoIf_4_0= rulestatement )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1887:3: lv_blcoIf_4_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_statementAccess().getBlcoIfStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_ruleif_statement3893);
            lv_blcoIf_4_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
              	        }
                     		set(
                     			current, 
                     			"blcoIf",
                      		lv_blcoIf_4_0, 
                      		"statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1903:2: ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred87_InternalSimpleJava()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1903:3: ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1908:6: (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1908:8: otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) )
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleif_statement3925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIf_statementAccess().getElseKeyword_5_0_0());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1912:1: ( (lv_blocoElse_6_0= rulestatement ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1913:1: (lv_blocoElse_6_0= rulestatement )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1913:1: (lv_blocoElse_6_0= rulestatement )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1914:3: lv_blocoElse_6_0= rulestatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIf_statementAccess().getBlocoElseStatementParserRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_ruleif_statement3946);
                    lv_blocoElse_6_0=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"blocoElse",
                              		lv_blocoElse_6_0, 
                              		"statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleif_statement"


    // $ANTLR start "entryRuledo_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1938:1: entryRuledo_statement returns [EObject current=null] : iv_ruledo_statement= ruledo_statement EOF ;
    public final EObject entryRuledo_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledo_statement = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1939:2: (iv_ruledo_statement= ruledo_statement EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1940:2: iv_ruledo_statement= ruledo_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDo_statementRule()); 
            }
            pushFollow(FOLLOW_ruledo_statement_in_entryRuledo_statement3985);
            iv_ruledo_statement=ruledo_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledo_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledo_statement3995); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledo_statement"


    // $ANTLR start "ruledo_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1947:1: ruledo_statement returns [EObject current=null] : (otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruledo_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_blocoDo_1_0 = null;

        EObject lv_expressaoWhile_4_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1950:28: ( (otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1951:1: (otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1951:1: (otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';' )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1951:3: otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruledo_statement4032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDo_statementAccess().getDoKeyword_0());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1955:1: ( (lv_blocoDo_1_0= rulestatement ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1956:1: (lv_blocoDo_1_0= rulestatement )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1956:1: (lv_blocoDo_1_0= rulestatement )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1957:3: lv_blocoDo_1_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_statementAccess().getBlocoDoStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_ruledo_statement4053);
            lv_blocoDo_1_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDo_statementRule());
              	        }
                     		set(
                     			current, 
                     			"blocoDo",
                      		lv_blocoDo_1_0, 
                      		"statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruledo_statement4065); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDo_statementAccess().getWhileKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruledo_statement4077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDo_statementAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1981:1: ( (lv_expressaoWhile_4_0= ruleexpression ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1982:1: (lv_expressaoWhile_4_0= ruleexpression )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1982:1: (lv_expressaoWhile_4_0= ruleexpression )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1983:3: lv_expressaoWhile_4_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_statementAccess().getExpressaoWhileExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruledo_statement4098);
            lv_expressaoWhile_4_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDo_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expressaoWhile",
                      		lv_expressaoWhile_4_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruledo_statement4110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDo_statementAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruledo_statement4122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDo_statementAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledo_statement"


    // $ANTLR start "entryRulewhile_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2015:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2016:2: (iv_rulewhile_statement= rulewhile_statement EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2017:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_statementRule()); 
            }
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement4158);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulewhile_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement4168); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewhile_statement"


    // $ANTLR start "rulewhile_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2024:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressaoWhile_2_0 = null;

        EObject lv_blocoWhile_4_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2027:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2028:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2028:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2028:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_rulewhile_statement4205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulewhile_statement4217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhile_statementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2036:1: ( (lv_expressaoWhile_2_0= ruleexpression ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2037:1: (lv_expressaoWhile_2_0= ruleexpression )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2037:1: (lv_expressaoWhile_2_0= ruleexpression )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2038:3: lv_expressaoWhile_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressaoWhileExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulewhile_statement4238);
            lv_expressaoWhile_2_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expressaoWhile",
                      		lv_expressaoWhile_2_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_rulewhile_statement4250); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhile_statementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2058:1: ( (lv_blocoWhile_4_0= rulestatement ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2059:1: (lv_blocoWhile_4_0= rulestatement )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2059:1: (lv_blocoWhile_4_0= rulestatement )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2060:3: lv_blocoWhile_4_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_statementAccess().getBlocoWhileStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_rulewhile_statement4271);
            lv_blocoWhile_4_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_statementRule());
              	        }
                     		set(
                     			current, 
                     			"blocoWhile",
                      		lv_blocoWhile_4_0, 
                      		"statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewhile_statement"


    // $ANTLR start "entryRulefor_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2084:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2085:2: (iv_rulefor_statement= rulefor_statement EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2086:2: iv_rulefor_statement= rulefor_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_statementRule()); 
            }
            pushFollow(FOLLOW_rulefor_statement_in_entryRulefor_statement4307);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefor_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_statement4317); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefor_statement"


    // $ANTLR start "rulefor_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2093:1: rulefor_statement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) ) ) ;
    public final EObject rulefor_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_declaracaoVariavel_2_0 = null;

        EObject lv_expressaoDeclaracao_3_0 = null;

        EObject lv_expressaoFor_6_0 = null;

        EObject lv_expressaoIncremento_8_0 = null;

        EObject lv_blocoFor_10_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2096:28: ( (otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2097:1: (otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2097:1: (otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2097:3: otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_rulefor_statement4354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulefor_statement4366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFor_statementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2105:1: ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' )
            int alt43=3;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2105:2: ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2105:2: ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2105:3: ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2110:1: (lv_declaracaoVariavel_2_0= rulevariable_declaration )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2111:3: lv_declaracaoVariavel_2_0= rulevariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_statementAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulevariable_declaration_in_rulefor_statement4398);
                    lv_declaracaoVariavel_2_0=rulevariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"declaracaoVariavel",
                              		lv_declaracaoVariavel_2_0, 
                              		"variable_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2128:6: ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2128:6: ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2128:7: ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';'
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2128:7: ( (lv_expressaoDeclaracao_3_0= ruleexpression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2129:1: (lv_expressaoDeclaracao_3_0= ruleexpression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2129:1: (lv_expressaoDeclaracao_3_0= ruleexpression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2130:3: lv_expressaoDeclaracao_3_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressaoDeclaracaoExpressionParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4426);
                    lv_expressaoDeclaracao_3_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"expressaoDeclaracao",
                              		lv_expressaoDeclaracao_3_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulefor_statement4438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFor_statementAccess().getSemicolonKeyword_2_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2151:7: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulefor_statement4457); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getSemicolonKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2155:2: ( (lv_expressaoFor_6_0= ruleexpression ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_FLOAT_LITERAL)||LA44_0==30||(LA44_0>=54 && LA44_0<=57)||(LA44_0>=60 && LA44_0<=62)||(LA44_0>=92 && LA44_0<=95)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2156:1: (lv_expressaoFor_6_0= ruleexpression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2156:1: (lv_expressaoFor_6_0= ruleexpression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2157:3: lv_expressaoFor_6_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressaoForExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4479);
                    lv_expressaoFor_6_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"expressaoFor",
                              		lv_expressaoFor_6_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_rulefor_statement4492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFor_statementAccess().getSemicolonKeyword_4());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2177:1: ( (lv_expressaoIncremento_8_0= ruleexpression ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_FLOAT_LITERAL)||LA45_0==30||(LA45_0>=54 && LA45_0<=57)||(LA45_0>=60 && LA45_0<=62)||(LA45_0>=92 && LA45_0<=95)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2178:1: (lv_expressaoIncremento_8_0= ruleexpression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2178:1: (lv_expressaoIncremento_8_0= ruleexpression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2179:3: lv_expressaoIncremento_8_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressaoIncrementoExpressionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4513);
                    lv_expressaoIncremento_8_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"expressaoIncremento",
                              		lv_expressaoIncremento_8_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,31,FOLLOW_31_in_rulefor_statement4526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFor_statementAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2199:1: ( (lv_blocoFor_10_0= rulestatement ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2200:1: (lv_blocoFor_10_0= rulestatement )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2200:1: (lv_blocoFor_10_0= rulestatement )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2201:3: lv_blocoFor_10_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFor_statementAccess().getBlocoForStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_rulefor_statement4547);
            lv_blocoFor_10_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
              	        }
                     		set(
                     			current, 
                     			"blocoFor",
                      		lv_blocoFor_10_0, 
                      		"statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefor_statement"


    // $ANTLR start "entryRuletry_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2225:1: entryRuletry_statement returns [EObject current=null] : iv_ruletry_statement= ruletry_statement EOF ;
    public final EObject entryRuletry_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletry_statement = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2226:2: (iv_ruletry_statement= ruletry_statement EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2227:2: iv_ruletry_statement= ruletry_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruletry_statement_in_entryRuletry_statement4583);
            iv_ruletry_statement=ruletry_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletry_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletry_statement4593); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletry_statement"


    // $ANTLR start "ruletry_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2234:1: ruletry_statement returns [EObject current=null] : (otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )? ) ;
    public final EObject ruletry_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_blocoTry_1_0 = null;

        EObject lv_parametroCatch_4_0 = null;

        EObject lv_blocoCatch_6_0 = null;

        EObject lv_blocoFinally_8_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2237:28: ( (otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )? ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2238:1: (otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )? )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2238:1: (otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )? )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2238:3: otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruletry_statement4630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTry_statementAccess().getTryKeyword_0());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2242:1: ( (lv_blocoTry_1_0= rulestatement_block ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2243:1: (lv_blocoTry_1_0= rulestatement_block )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2243:1: (lv_blocoTry_1_0= rulestatement_block )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2244:3: lv_blocoTry_1_0= rulestatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTry_statementAccess().getBlocoTryStatement_blockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_block_in_ruletry_statement4651);
            lv_blocoTry_1_0=rulestatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
              	        }
                     		set(
                     			current, 
                     			"blocoTry",
                      		lv_blocoTry_1_0, 
                      		"statement_block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2260:2: ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==48) && (synpred93_InternalSimpleJava())) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2260:3: ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2271:6: (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2271:8: otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) )
            	    {
            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruletry_statement4700); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTry_statementAccess().getCatchKeyword_2_0_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruletry_statement4712); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_0_1());
            	          
            	    }
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2279:1: ( (lv_parametroCatch_4_0= ruleparameter ) )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2280:1: (lv_parametroCatch_4_0= ruleparameter )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2280:1: (lv_parametroCatch_4_0= ruleparameter )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2281:3: lv_parametroCatch_4_0= ruleparameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getParametroCatchParameterParserRuleCall_2_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleparameter_in_ruletry_statement4733);
            	    lv_parametroCatch_4_0=ruleparameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"parametroCatch",
            	              		lv_parametroCatch_4_0, 
            	              		"parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruletry_statement4745); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_0_3());
            	          
            	    }
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2301:1: ( (lv_blocoCatch_6_0= rulestatement_block ) )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2302:1: (lv_blocoCatch_6_0= rulestatement_block )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2302:1: (lv_blocoCatch_6_0= rulestatement_block )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2303:3: lv_blocoCatch_6_0= rulestatement_block
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getBlocoCatchStatement_blockParserRuleCall_2_0_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_block_in_ruletry_statement4766);
            	    lv_blocoCatch_6_0=rulestatement_block();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"blocoCatch",
            	              		lv_blocoCatch_6_0, 
            	              		"statement_block");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2319:5: ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) && (synpred94_InternalSimpleJava())) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2319:6: ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2324:6: (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2324:8: otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruletry_statement4801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0_0());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2328:1: ( (lv_blocoFinally_8_0= rulestatement_block ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2329:1: (lv_blocoFinally_8_0= rulestatement_block )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2329:1: (lv_blocoFinally_8_0= rulestatement_block )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2330:3: lv_blocoFinally_8_0= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTry_statementAccess().getBlocoFinallyStatement_blockParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_ruletry_statement4822);
                    lv_blocoFinally_8_0=rulestatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"blocoFinally",
                              		lv_blocoFinally_8_0, 
                              		"statement_block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletry_statement"


    // $ANTLR start "entryRuleswitch_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2354:1: entryRuleswitch_statement returns [EObject current=null] : iv_ruleswitch_statement= ruleswitch_statement EOF ;
    public final EObject entryRuleswitch_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleswitch_statement = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2355:2: (iv_ruleswitch_statement= ruleswitch_statement EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2356:2: iv_ruleswitch_statement= ruleswitch_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitch_statementRule()); 
            }
            pushFollow(FOLLOW_ruleswitch_statement_in_entryRuleswitch_statement4861);
            iv_ruleswitch_statement=ruleswitch_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleswitch_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleswitch_statement4871); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleswitch_statement"


    // $ANTLR start "ruleswitch_statement"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2363:1: ruleswitch_statement returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleswitch_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_expressaoSwitch_2_0 = null;

        EObject lv_expressaoCases_6_0 = null;

        EObject lv_blocoSwitch_10_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2366:28: ( (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2367:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2367:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}' )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2367:3: otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleswitch_statement4908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitch_statementAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleswitch_statement4920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitch_statementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2375:1: ( (lv_expressaoSwitch_2_0= ruleexpression ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2376:1: (lv_expressaoSwitch_2_0= ruleexpression )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2376:1: (lv_expressaoSwitch_2_0= ruleexpression )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2377:3: lv_expressaoSwitch_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpressaoSwitchExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleswitch_statement4941);
            lv_expressaoSwitch_2_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitch_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expressaoSwitch",
                      		lv_expressaoSwitch_2_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleswitch_statement4953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitch_statementAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleswitch_statement4965); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitch_statementAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2401:1: ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )*
            loop48:
            do {
                int alt48=4;
                switch ( input.LA(1) ) {
                case 51:
                    {
                    alt48=1;
                    }
                    break;
                case 52:
                    {
                    alt48=2;
                    }
                    break;
                case RULE_STRING:
                case RULE_IDENTIFIER:
                case RULE_DECIMAL_DIGITS:
                case RULE_INTEGER_LITERAL:
                case RULE_FLOAT_LITERAL:
                case 18:
                case 27:
                case 30:
                case 34:
                case 35:
                case 36:
                case 38:
                case 39:
                case 40:
                case 42:
                case 44:
                case 45:
                case 46:
                case 47:
                case 50:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 60:
                case 61:
                case 62:
                case 92:
                case 93:
                case 94:
                case 95:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                    {
                    alt48=3;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2401:2: (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2401:2: (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2401:4: otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':'
            	    {
            	    otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleswitch_statement4979); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getSwitch_statementAccess().getCaseKeyword_5_0_0());
            	          
            	    }
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2405:1: ( (lv_expressaoCases_6_0= ruleexpression ) )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2406:1: (lv_expressaoCases_6_0= ruleexpression )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2406:1: (lv_expressaoCases_6_0= ruleexpression )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2407:3: lv_expressaoCases_6_0= ruleexpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpressaoCasesExpressionParserRuleCall_5_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleexpression_in_ruleswitch_statement5000);
            	    lv_expressaoCases_6_0=ruleexpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitch_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressaoCases",
            	              		lv_expressaoCases_6_0, 
            	              		"expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleswitch_statement5012); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getSwitch_statementAccess().getColonKeyword_5_0_2());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2428:6: (otherlv_8= 'default' otherlv_9= ':' )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2428:6: (otherlv_8= 'default' otherlv_9= ':' )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2428:8: otherlv_8= 'default' otherlv_9= ':'
            	    {
            	    otherlv_8=(Token)match(input,52,FOLLOW_52_in_ruleswitch_statement5032); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getSwitch_statementAccess().getDefaultKeyword_5_1_0());
            	          
            	    }
            	    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleswitch_statement5044); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getSwitch_statementAccess().getColonKeyword_5_1_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2437:6: ( (lv_blocoSwitch_10_0= rulestatement ) )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2437:6: ( (lv_blocoSwitch_10_0= rulestatement ) )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2438:1: (lv_blocoSwitch_10_0= rulestatement )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2438:1: (lv_blocoSwitch_10_0= rulestatement )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2439:3: lv_blocoSwitch_10_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getBlocoSwitchStatementParserRuleCall_5_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_ruleswitch_statement5072);
            	    lv_blocoSwitch_10_0=rulestatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitch_statementRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"blocoSwitch",
            	              		lv_blocoSwitch_10_0, 
            	              		"statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleswitch_statement5086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getSwitch_statementAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleswitch_statement"


    // $ANTLR start "entryRuleconstructor_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2467:1: entryRuleconstructor_declaration returns [EObject current=null] : iv_ruleconstructor_declaration= ruleconstructor_declaration EOF ;
    public final EObject entryRuleconstructor_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstructor_declaration = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2468:2: (iv_ruleconstructor_declaration= ruleconstructor_declaration EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2469:2: iv_ruleconstructor_declaration= ruleconstructor_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleconstructor_declaration_in_entryRuleconstructor_declaration5122);
            iv_ruleconstructor_declaration=ruleconstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstructor_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstructor_declaration5132); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstructor_declaration"


    // $ANTLR start "ruleconstructor_declaration"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2476:1: ruleconstructor_declaration returns [EObject current=null] : ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( (lv_nomeContrutor_1_0= RULE_IDENTIFIER ) ) otherlv_2= '(' ( (lv_parametrosContrutor_3_0= ruleparameter_list ) )? otherlv_4= ')' ( (lv_blocoConstrutor_5_0= rulestatement_block ) ) ) ;
    public final EObject ruleconstructor_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_nomeContrutor_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_modificador_0_0 = null;

        EObject lv_parametrosContrutor_3_0 = null;

        EObject lv_blocoConstrutor_5_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2479:28: ( ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( (lv_nomeContrutor_1_0= RULE_IDENTIFIER ) ) otherlv_2= '(' ( (lv_parametrosContrutor_3_0= ruleparameter_list ) )? otherlv_4= ')' ( (lv_blocoConstrutor_5_0= rulestatement_block ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2480:1: ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( (lv_nomeContrutor_1_0= RULE_IDENTIFIER ) ) otherlv_2= '(' ( (lv_parametrosContrutor_3_0= ruleparameter_list ) )? otherlv_4= ')' ( (lv_blocoConstrutor_5_0= rulestatement_block ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2480:1: ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( (lv_nomeContrutor_1_0= RULE_IDENTIFIER ) ) otherlv_2= '(' ( (lv_parametrosContrutor_3_0= ruleparameter_list ) )? otherlv_4= ')' ( (lv_blocoConstrutor_5_0= rulestatement_block ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2480:2: ( (lv_modificador_0_0= ruleMODIFIER ) )* ( (lv_nomeContrutor_1_0= RULE_IDENTIFIER ) ) otherlv_2= '(' ( (lv_parametrosContrutor_3_0= ruleparameter_list ) )? otherlv_4= ')' ( (lv_blocoConstrutor_5_0= rulestatement_block ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2480:2: ( (lv_modificador_0_0= ruleMODIFIER ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==34||LA49_0==53||(LA49_0>=105 && LA49_0<=112)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2481:1: (lv_modificador_0_0= ruleMODIFIER )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2481:1: (lv_modificador_0_0= ruleMODIFIER )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2482:3: lv_modificador_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getModificadorMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_ruleconstructor_declaration5178);
            	    lv_modificador_0_0=ruleMODIFIER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"modificador",
            	              		lv_modificador_0_0, 
            	              		"MODIFIER");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2498:3: ( (lv_nomeContrutor_1_0= RULE_IDENTIFIER ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2499:1: (lv_nomeContrutor_1_0= RULE_IDENTIFIER )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2499:1: (lv_nomeContrutor_1_0= RULE_IDENTIFIER )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2500:3: lv_nomeContrutor_1_0= RULE_IDENTIFIER
            {
            lv_nomeContrutor_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstructor_declaration5196); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nomeContrutor_1_0, grammarAccess.getConstructor_declarationAccess().getNomeContrutorIDENTIFIERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstructor_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nomeContrutor",
                      		lv_nomeContrutor_1_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleconstructor_declaration5213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2520:1: ( (lv_parametrosContrutor_3_0= ruleparameter_list ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_IDENTIFIER||(LA50_0>=97 && LA50_0<=104)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2521:1: (lv_parametrosContrutor_3_0= ruleparameter_list )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2521:1: (lv_parametrosContrutor_3_0= ruleparameter_list )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2522:3: lv_parametrosContrutor_3_0= ruleparameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParametrosContrutorParameter_listParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleparameter_list_in_ruleconstructor_declaration5234);
                    lv_parametrosContrutor_3_0=ruleparameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"parametrosContrutor",
                              		lv_parametrosContrutor_3_0, 
                              		"parameter_list");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleconstructor_declaration5247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2542:1: ( (lv_blocoConstrutor_5_0= rulestatement_block ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2543:1: (lv_blocoConstrutor_5_0= rulestatement_block )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2543:1: (lv_blocoConstrutor_5_0= rulestatement_block )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2544:3: lv_blocoConstrutor_5_0= rulestatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getBlocoConstrutorStatement_blockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_block_in_ruleconstructor_declaration5268);
            lv_blocoConstrutor_5_0=rulestatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"blocoConstrutor",
                      		lv_blocoConstrutor_5_0, 
                      		"statement_block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstructor_declaration"


    // $ANTLR start "entryRulestatic_initializer"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2568:1: entryRulestatic_initializer returns [EObject current=null] : iv_rulestatic_initializer= rulestatic_initializer EOF ;
    public final EObject entryRulestatic_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatic_initializer = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2569:2: (iv_rulestatic_initializer= rulestatic_initializer EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2570:2: iv_rulestatic_initializer= rulestatic_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            }
            pushFollow(FOLLOW_rulestatic_initializer_in_entryRulestatic_initializer5304);
            iv_rulestatic_initializer=rulestatic_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatic_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatic_initializer5314); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatic_initializer"


    // $ANTLR start "rulestatic_initializer"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2577:1: rulestatic_initializer returns [EObject current=null] : (otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) ) ) ;
    public final EObject rulestatic_initializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_blocoEstatico_1_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2580:28: ( (otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2581:1: (otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2581:1: (otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2581:3: otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_rulestatic_initializer5351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatic_initializerAccess().getStaticKeyword_0());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2585:1: ( (lv_blocoEstatico_1_0= rulestatement_block ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2586:1: (lv_blocoEstatico_1_0= rulestatement_block )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2586:1: (lv_blocoEstatico_1_0= rulestatement_block )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2587:3: lv_blocoEstatico_1_0= rulestatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatic_initializerAccess().getBlocoEstaticoStatement_blockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_block_in_rulestatic_initializer5372);
            lv_blocoEstatico_1_0=rulestatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatic_initializerRule());
              	        }
                     		set(
                     			current, 
                     			"blocoEstatico",
                      		lv_blocoEstatico_1_0, 
                      		"statement_block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatic_initializer"


    // $ANTLR start "entryRulecreating_expression"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2611:1: entryRulecreating_expression returns [EObject current=null] : iv_rulecreating_expression= rulecreating_expression EOF ;
    public final EObject entryRulecreating_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecreating_expression = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2612:2: (iv_rulecreating_expression= rulecreating_expression EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2613:2: iv_rulecreating_expression= rulecreating_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreating_expressionRule()); 
            }
            pushFollow(FOLLOW_rulecreating_expression_in_entryRulecreating_expression5408);
            iv_rulecreating_expression=rulecreating_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecreating_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecreating_expression5418); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecreating_expression"


    // $ANTLR start "rulecreating_expression"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2620:1: rulecreating_expression returns [EObject current=null] : (otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenewBlock ) )* ) ;
    public final EObject rulecreating_expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_novoObjeto_1_0 = null;

        EObject lv_parametros_2_0 = null;

        EObject lv_tipoObjeto_3_0 = null;

        EObject lv_parametros_4_0 = null;

        EObject lv_expressaoNew_8_0 = null;

        EObject lv_novo_10_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2623:28: ( (otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenewBlock ) )* ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2624:1: (otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenewBlock ) )* )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2624:1: (otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenewBlock ) )* )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2624:3: otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenewBlock ) )*
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_rulecreating_expression5455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreating_expressionAccess().getNewKeyword_0());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2628:1: ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt53=1;
                }
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
                {
                alt53=2;
                }
                break;
            case 30:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2628:2: ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2628:2: ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2628:3: ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2628:3: ( (lv_novoObjeto_1_0= rulename ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2629:1: (lv_novoObjeto_1_0= rulename )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2629:1: (lv_novoObjeto_1_0= rulename )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2630:3: lv_novoObjeto_1_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getNovoObjetoNameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_rulecreating_expression5478);
                    lv_novoObjeto_1_0=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"novoObjeto",
                              		lv_novoObjeto_1_0, 
                              		"name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2646:2: ( (lv_parametros_2_0= rulecreating_aux ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2647:1: (lv_parametros_2_0= rulecreating_aux )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2647:1: (lv_parametros_2_0= rulecreating_aux )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2648:3: lv_parametros_2_0= rulecreating_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getParametrosCreating_auxParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecreating_aux_in_rulecreating_expression5499);
                    lv_parametros_2_0=rulecreating_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"parametros",
                              		lv_parametros_2_0, 
                              		"creating_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2665:6: ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2665:6: ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2665:7: ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )*
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2665:7: ( (lv_tipoObjeto_3_0= ruletype_specifier ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2666:1: (lv_tipoObjeto_3_0= ruletype_specifier )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2666:1: (lv_tipoObjeto_3_0= ruletype_specifier )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2667:3: lv_tipoObjeto_3_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getTipoObjetoType_specifierParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulecreating_expression5528);
                    lv_tipoObjeto_3_0=ruletype_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"tipoObjeto",
                              		lv_tipoObjeto_3_0, 
                              		"type_specifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2683:2: ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )?
                    int alt51=2;
                    alt51 = dfa51.predict(input);
                    switch (alt51) {
                        case 1 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2683:3: ( '[' )=> ( (lv_parametros_4_0= ruleaux ) )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2684:4: ( (lv_parametros_4_0= ruleaux ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2685:1: (lv_parametros_4_0= ruleaux )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2685:1: (lv_parametros_4_0= ruleaux )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2686:3: lv_parametros_4_0= ruleaux
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getParametrosAuxParserRuleCall_1_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleaux_in_rulecreating_expression5557);
                            lv_parametros_4_0=ruleaux();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCreating_expressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"parametros",
                                      		lv_parametros_4_0, 
                                      		"aux");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2702:4: (otherlv_5= '[' otherlv_6= ']' )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==32) ) {
                            int LA52_2 = input.LA(2);

                            if ( (LA52_2==33) ) {
                                alt52=1;
                            }


                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2702:6: otherlv_5= '[' otherlv_6= ']'
                    	    {
                    	    otherlv_5=(Token)match(input,32,FOLLOW_32_in_rulecreating_expression5572); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getCreating_expressionAccess().getLeftSquareBracketKeyword_1_1_2_0());
                    	          
                    	    }
                    	    otherlv_6=(Token)match(input,33,FOLLOW_33_in_rulecreating_expression5584); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getCreating_expressionAccess().getRightSquareBracketKeyword_1_1_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2711:6: (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2711:6: (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2711:8: otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_rulecreating_expression5606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCreating_expressionAccess().getLeftParenthesisKeyword_1_2_0());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2715:1: ( (lv_expressaoNew_8_0= ruleexpression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2716:1: (lv_expressaoNew_8_0= ruleexpression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2716:1: (lv_expressaoNew_8_0= ruleexpression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2717:3: lv_expressaoNew_8_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getExpressaoNewExpressionParserRuleCall_1_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulecreating_expression5627);
                    lv_expressaoNew_8_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expressaoNew",
                              		lv_expressaoNew_8_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_rulecreating_expression5639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getCreating_expressionAccess().getRightParenthesisKeyword_1_2_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2737:3: ( (lv_novo_10_0= rulenewBlock ) )*
            loop54:
            do {
                int alt54=2;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2738:1: (lv_novo_10_0= rulenewBlock )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2738:1: (lv_novo_10_0= rulenewBlock )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2739:3: lv_novo_10_0= rulenewBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getNovoNewBlockParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulenewBlock_in_rulecreating_expression5662);
            	    lv_novo_10_0=rulenewBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCreating_expressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"novo",
            	              		lv_novo_10_0, 
            	              		"newBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecreating_expression"


    // $ANTLR start "entryRuleexp_aux"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2763:1: entryRuleexp_aux returns [EObject current=null] : iv_ruleexp_aux= ruleexp_aux EOF ;
    public final EObject entryRuleexp_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexp_aux = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2764:2: (iv_ruleexp_aux= ruleexp_aux EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2765:2: iv_ruleexp_aux= ruleexp_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExp_auxRule()); 
            }
            pushFollow(FOLLOW_ruleexp_aux_in_entryRuleexp_aux5699);
            iv_ruleexp_aux=ruleexp_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexp_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexp_aux5709); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexp_aux"


    // $ANTLR start "ruleexp_aux"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2772:1: ruleexp_aux returns [EObject current=null] : ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) ) ;
    public final EObject ruleexp_aux() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressao_0_0 = null;

        EObject this_type_2 = null;

        EObject lv_expressao_4_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2775:28: ( ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2776:1: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2776:1: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) )
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2776:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2776:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2776:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')'
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2776:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2776:4: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2789:1: (lv_expressao_0_0= ruleexpression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2790:3: lv_expressao_0_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExp_auxAccess().getExpressaoExpressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleexp_aux5865);
                    lv_expressao_0_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExp_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expressao",
                              		lv_expressao_0_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleexp_aux5877); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExp_auxAccess().getRightParenthesisKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2811:6: (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2811:6: (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2812:2: this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExp_auxAccess().getTypeParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruletype_in_ruleexp_aux5910);
                    this_type_2=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_type_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleexp_aux5921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExp_auxAccess().getRightParenthesisKeyword_1_1());
                          
                    }
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2827:1: ( (lv_expressao_4_0= ruleexpression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2828:1: (lv_expressao_4_0= ruleexpression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2828:1: (lv_expressao_4_0= ruleexpression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2829:3: lv_expressao_4_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExp_auxAccess().getExpressaoExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleexp_aux5942);
                    lv_expressao_4_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExp_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expressao",
                              		lv_expressao_4_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexp_aux"


    // $ANTLR start "entryRuleexpression"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2853:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2854:2: (iv_ruleexpression= ruleexpression EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2855:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression5979);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression5989); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2862:1: ruleexpression returns [EObject current=null] : ( ( ( (lv_logical_0_0= rulelogical_expression ) ) | ( (lv_numeric_1_0= rulenumeric_expression ) ) | ( (lv_bit_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) ) ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_identificador_8_0=null;
        Token otherlv_9=null;
        EObject lv_logical_0_0 = null;

        EObject lv_numeric_1_0 = null;

        EObject lv_bit_2_0 = null;

        EObject lv_novo_3_0 = null;

        EObject lv_literal_4_0 = null;

        EObject this_exp_aux_10 = null;

        EObject lv_expressoes_11_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2865:28: ( ( ( ( (lv_logical_0_0= rulelogical_expression ) ) | ( (lv_numeric_1_0= rulenumeric_expression ) ) | ( (lv_bit_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2866:1: ( ( ( (lv_logical_0_0= rulelogical_expression ) ) | ( (lv_numeric_1_0= rulenumeric_expression ) ) | ( (lv_bit_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2866:1: ( ( ( (lv_logical_0_0= rulelogical_expression ) ) | ( (lv_numeric_1_0= rulenumeric_expression ) ) | ( (lv_bit_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2866:2: ( ( (lv_logical_0_0= rulelogical_expression ) ) | ( (lv_numeric_1_0= rulenumeric_expression ) ) | ( (lv_bit_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2866:2: ( ( (lv_logical_0_0= rulelogical_expression ) ) | ( (lv_numeric_1_0= rulenumeric_expression ) ) | ( (lv_bit_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) )
            int alt56=10;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2866:3: ( (lv_logical_0_0= rulelogical_expression ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2866:3: ( (lv_logical_0_0= rulelogical_expression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2867:1: (lv_logical_0_0= rulelogical_expression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2867:1: (lv_logical_0_0= rulelogical_expression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2868:3: lv_logical_0_0= rulelogical_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getLogicalLogical_expressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulelogical_expression_in_ruleexpression6036);
                    lv_logical_0_0=rulelogical_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"logical",
                              		lv_logical_0_0, 
                              		"logical_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2885:6: ( (lv_numeric_1_0= rulenumeric_expression ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2885:6: ( (lv_numeric_1_0= rulenumeric_expression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2886:1: (lv_numeric_1_0= rulenumeric_expression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2886:1: (lv_numeric_1_0= rulenumeric_expression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2887:3: lv_numeric_1_0= rulenumeric_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getNumericNumeric_expressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulenumeric_expression_in_ruleexpression6063);
                    lv_numeric_1_0=rulenumeric_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"numeric",
                              		lv_numeric_1_0, 
                              		"numeric_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2904:6: ( (lv_bit_2_0= rulebit_expression ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2904:6: ( (lv_bit_2_0= rulebit_expression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2905:1: (lv_bit_2_0= rulebit_expression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2905:1: (lv_bit_2_0= rulebit_expression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2906:3: lv_bit_2_0= rulebit_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getBitBit_expressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulebit_expression_in_ruleexpression6090);
                    lv_bit_2_0=rulebit_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"bit",
                              		lv_bit_2_0, 
                              		"bit_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2923:6: ( (lv_novo_3_0= rulecreating_expression ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2923:6: ( (lv_novo_3_0= rulecreating_expression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2924:1: (lv_novo_3_0= rulecreating_expression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2924:1: (lv_novo_3_0= rulecreating_expression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2925:3: lv_novo_3_0= rulecreating_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getNovoCreating_expressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecreating_expression_in_ruleexpression6117);
                    lv_novo_3_0=rulecreating_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"novo",
                              		lv_novo_3_0, 
                              		"creating_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2942:6: ( (lv_literal_4_0= ruleliteral_expression ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2942:6: ( (lv_literal_4_0= ruleliteral_expression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2943:1: (lv_literal_4_0= ruleliteral_expression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2943:1: (lv_literal_4_0= ruleliteral_expression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2944:3: lv_literal_4_0= ruleliteral_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getLiteralLiteral_expressionParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleliteral_expression_in_ruleexpression6144);
                    lv_literal_4_0=ruleliteral_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_4_0, 
                              		"literal_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2961:7: otherlv_5= 'null'
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_55_in_ruleexpression6162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getNullKeyword_0_5());
                          
                    }

                    }
                    break;
                case 7 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2966:7: otherlv_6= 'super'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleexpression6180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getSuperKeyword_0_6());
                          
                    }

                    }
                    break;
                case 8 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2971:7: otherlv_7= 'this'
                    {
                    otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleexpression6198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getThisKeyword_0_7());
                          
                    }

                    }
                    break;
                case 9 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2976:6: ( (lv_identificador_8_0= RULE_IDENTIFIER ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2976:6: ( (lv_identificador_8_0= RULE_IDENTIFIER ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2977:1: (lv_identificador_8_0= RULE_IDENTIFIER )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2977:1: (lv_identificador_8_0= RULE_IDENTIFIER )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2978:3: lv_identificador_8_0= RULE_IDENTIFIER
                    {
                    lv_identificador_8_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleexpression6221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identificador_8_0, grammarAccess.getExpressionAccess().getIdentificadorIDENTIFIERTerminalRuleCall_0_8_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identificador",
                              		lv_identificador_8_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2995:6: (otherlv_9= '(' this_exp_aux_10= ruleexp_aux )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2995:6: (otherlv_9= '(' this_exp_aux_10= ruleexp_aux )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2995:8: otherlv_9= '(' this_exp_aux_10= ruleexp_aux
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleexpression6245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_9_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getExp_auxParserRuleCall_0_9_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexp_aux_in_ruleexpression6270);
                    this_exp_aux_10=ruleexp_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_exp_aux_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3011:3: ( (lv_expressoes_11_0= ruleexpression_aux ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3012:1: (lv_expressoes_11_0= ruleexpression_aux )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3012:1: (lv_expressoes_11_0= ruleexpression_aux )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3013:3: lv_expressoes_11_0= ruleexpression_aux
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressoesExpression_auxParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression6292);
            lv_expressoes_11_0=ruleexpression_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expressoes",
                      		lv_expressoes_11_0, 
                      		"expression_aux");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRuleexpression_aux"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3037:1: entryRuleexpression_aux returns [EObject current=null] : iv_ruleexpression_aux= ruleexpression_aux EOF ;
    public final EObject entryRuleexpression_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_aux = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3038:2: (iv_ruleexpression_aux= ruleexpression_aux EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3039:2: iv_ruleexpression_aux= ruleexpression_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_auxRule()); 
            }
            pushFollow(FOLLOW_ruleexpression_aux_in_entryRuleexpression_aux6328);
            iv_ruleexpression_aux=ruleexpression_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression_aux6338); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression_aux"


    // $ANTLR start "ruleexpression_aux"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3046:1: ruleexpression_aux returns [EObject current=null] : ( ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) ) )? ;
    public final EObject ruleexpression_aux() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_operador_12_1=null;
        Token lv_operador_12_2=null;
        Token lv_operador_14_0=null;
        Token lv_operador_15_0=null;
        Token lv_operador_16_0=null;
        Token lv_operador_17_0=null;
        Token lv_operador_18_0=null;
        Token lv_operador_19_0=null;
        Token lv_operador_20_0=null;
        Token lv_operador_21_0=null;
        Token lv_operador_23_1=null;
        Token lv_operador_23_2=null;
        Token lv_operador_23_3=null;
        Token lv_operador_23_4=null;
        Token lv_operador_23_5=null;
        Token lv_operador_23_6=null;
        Token lv_operador_23_7=null;
        Token lv_operador_23_8=null;
        Token lv_operador_23_9=null;
        Token lv_operador_23_10=null;
        Token lv_operador_23_11=null;
        Token lv_operador_25_0=null;
        Token lv_operador_27_0=null;
        Token lv_operador_29_1=null;
        Token lv_operador_29_2=null;
        Token lv_operador_29_3=null;
        Token lv_operador_29_4=null;
        Token lv_operador_29_5=null;
        Token lv_operador_29_6=null;
        Token lv_operador_31_1=null;
        Token lv_operador_31_2=null;
        Token lv_operador_31_3=null;
        Token lv_operador_31_4=null;
        EObject lv_parametros_1_0 = null;

        EObject this_aux_3 = null;

        EObject lv_exp_5_0 = null;

        EObject this_expression_7 = null;

        EObject this_name_9 = null;

        EObject lv_op_10_0 = null;

        EObject lv_exp_11_0 = null;

        EObject lv_op_13_0 = null;

        EObject lv_exp_22_0 = null;

        EObject lv_exp_24_0 = null;

        EObject lv_exp_26_0 = null;

        EObject lv_exp_28_0 = null;

        EObject lv_exp_30_0 = null;

        EObject lv_exp_32_0 = null;

        EObject lv_expressoes_33_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3049:28: ( ( ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) ) )? )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:1: ( ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) ) )?
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:1: ( ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:2: ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:2: ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) )
                    int alt65=5;
                    alt65 = dfa65.predict(input);
                    switch (alt65) {
                        case 1 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:3: ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:3: ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                            int alt58=5;
                            switch ( input.LA(1) ) {
                            case 30:
                                {
                                alt58=1;
                                }
                                break;
                            case 32:
                                {
                                alt58=2;
                                }
                                break;
                            case 58:
                                {
                                alt58=3;
                                }
                                break;
                            case 26:
                                {
                                alt58=4;
                                }
                                break;
                            case 59:
                                {
                                alt58=5;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 58, 0, input);

                                throw nvae;
                            }

                            switch (alt58) {
                                case 1 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:4: (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:4: (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:6: otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')'
                                    {
                                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleexpression_aux6378); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_0, grammarAccess.getExpression_auxAccess().getLeftParenthesisKeyword_0_0_0_0());
                                          
                                    }
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3054:1: ( (lv_parametros_1_0= rulearglist ) )?
                                    int alt57=2;
                                    int LA57_0 = input.LA(1);

                                    if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_FLOAT_LITERAL)||LA57_0==30||(LA57_0>=54 && LA57_0<=57)||(LA57_0>=60 && LA57_0<=62)||(LA57_0>=92 && LA57_0<=104)) ) {
                                        alt57=1;
                                    }
                                    switch (alt57) {
                                        case 1 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3055:1: (lv_parametros_1_0= rulearglist )
                                            {
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3055:1: (lv_parametros_1_0= rulearglist )
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3056:3: lv_parametros_1_0= rulearglist
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getParametrosArglistParserRuleCall_0_0_0_1_0()); 
                                              	    
                                            }
                                            pushFollow(FOLLOW_rulearglist_in_ruleexpression_aux6399);
                                            lv_parametros_1_0=rulearglist();

                                            state._fsp--;
                                            if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		set(
                                                     			current, 
                                                     			"parametros",
                                                      		lv_parametros_1_0, 
                                                      		"arglist");
                                              	        afterParserOrEnumRuleCall();
                                              	    
                                            }

                                            }


                                            }
                                            break;

                                    }

                                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleexpression_aux6412); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_2, grammarAccess.getExpression_auxAccess().getRightParenthesisKeyword_0_0_0_2());
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3078:2: this_aux_3= ruleaux
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxParserRuleCall_0_0_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleaux_in_ruleexpression_aux6444);
                                    this_aux_3=ruleaux();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                              current = this_aux_3; 
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }
                                    break;
                                case 3 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3090:6: (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3090:6: (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3090:8: otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) )
                                    {
                                    otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleexpression_aux6462); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_4, grammarAccess.getExpression_auxAccess().getFullStopKeyword_0_0_2_0());
                                          
                                    }
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3094:1: ( (lv_exp_5_0= ruleexpression ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3095:1: (lv_exp_5_0= ruleexpression )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3095:1: (lv_exp_5_0= ruleexpression )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3096:3: lv_exp_5_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_0_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux6483);
                                    lv_exp_5_0=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"exp",
                                              		lv_exp_5_0, 
                                              		"expression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }


                                    }
                                    break;
                                case 4 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3113:6: (otherlv_6= ',' this_expression_7= ruleexpression )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3113:6: (otherlv_6= ',' this_expression_7= ruleexpression )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3113:8: otherlv_6= ',' this_expression_7= ruleexpression
                                    {
                                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleexpression_aux6503); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_6, grammarAccess.getExpression_auxAccess().getCommaKeyword_0_0_3_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_0_3_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux6528);
                                    this_expression_7=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                              current = this_expression_7; 
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 5 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3130:6: (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3130:6: (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3130:8: otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                                    {
                                    otherlv_8=(Token)match(input,59,FOLLOW_59_in_ruleexpression_aux6547); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_8, grammarAccess.getExpression_auxAccess().getInstanceofKeyword_0_0_4_0());
                                          
                                    }
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3134:1: ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3134:2: ( RULE_IDENTIFIER )=>this_name_9= rulename
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getNameParserRuleCall_0_0_4_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_rulename_in_ruleexpression_aux6578);
                                    this_name_9=rulename();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                              current = this_name_9; 
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:6: ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:6: ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:7: ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:7: ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:8: ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3150:1: (lv_op_10_0= rulemais_aux )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3151:3: lv_op_10_0= rulemais_aux
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getOpMais_auxParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulemais_aux_in_ruleexpression_aux6622);
                            lv_op_10_0=rulemais_aux();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_10_0, 
                                      		"mais_aux");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3167:2: ( (lv_exp_11_0= ruleexpression ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3168:1: (lv_exp_11_0= ruleexpression )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3168:1: (lv_exp_11_0= ruleexpression )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3169:3: lv_exp_11_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux6643);
                            lv_exp_11_0=ruleexpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"exp",
                                      		lv_exp_11_0, 
                                      		"expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3186:6: ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3186:6: ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3187:1: ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3187:1: ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3188:1: (lv_operador_12_1= '++' | lv_operador_12_2= '--' )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3188:1: (lv_operador_12_1= '++' | lv_operador_12_2= '--' )
                            int alt59=2;
                            int LA59_0 = input.LA(1);

                            if ( (LA59_0==60) ) {
                                alt59=1;
                            }
                            else if ( (LA59_0==61) ) {
                                alt59=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 59, 0, input);

                                throw nvae;
                            }
                            switch (alt59) {
                                case 1 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3189:3: lv_operador_12_1= '++'
                                    {
                                    lv_operador_12_1=(Token)match(input,60,FOLLOW_60_in_ruleexpression_aux6670); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_operador_12_1, grammarAccess.getExpression_auxAccess().getOperadorPlusSignPlusSignKeyword_0_2_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "operador", lv_operador_12_1, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3201:8: lv_operador_12_2= '--'
                                    {
                                    lv_operador_12_2=(Token)match(input,61,FOLLOW_61_in_ruleexpression_aux6699); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_operador_12_2, grammarAccess.getExpression_auxAccess().getOperadorHyphenMinusHyphenMinusKeyword_0_2_0_1());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "operador", lv_operador_12_2, null);
                                      	    
                                    }

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:6: ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:6: ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) )
                            int alt60=9;
                            alt60 = dfa60.predict(input);
                            switch (alt60) {
                                case 1 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:8: ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:8: ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:9: ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3220:1: (lv_op_13_0= rulemais_aux )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3221:3: lv_op_13_0= rulemais_aux
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getOpMais_auxParserRuleCall_0_3_0_0_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_rulemais_aux_in_ruleexpression_aux6758);
                                    lv_op_13_0=rulemais_aux();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"op",
                                              		lv_op_13_0, 
                                              		"mais_aux");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3238:6: ( (lv_operador_14_0= '-' ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3238:6: ( (lv_operador_14_0= '-' ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3239:1: (lv_operador_14_0= '-' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3239:1: (lv_operador_14_0= '-' )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3240:3: lv_operador_14_0= '-'
                                    {
                                    lv_operador_14_0=(Token)match(input,62,FOLLOW_62_in_ruleexpression_aux6782); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_operador_14_0, grammarAccess.getExpression_auxAccess().getOperadorHyphenMinusKeyword_0_3_0_1_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "operador", lv_operador_14_0, "-");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 3 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3254:6: ( (lv_operador_15_0= '-=' ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3254:6: ( (lv_operador_15_0= '-=' ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3255:1: (lv_operador_15_0= '-=' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3255:1: (lv_operador_15_0= '-=' )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3256:3: lv_operador_15_0= '-='
                                    {
                                    lv_operador_15_0=(Token)match(input,63,FOLLOW_63_in_ruleexpression_aux6819); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_operador_15_0, grammarAccess.getExpression_auxAccess().getOperadorHyphenMinusEqualsSignKeyword_0_3_0_2_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "operador", lv_operador_15_0, "-=");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 4 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3270:6: ( (lv_operador_16_0= '*' ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3270:6: ( (lv_operador_16_0= '*' ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3271:1: (lv_operador_16_0= '*' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3271:1: (lv_operador_16_0= '*' )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3272:3: lv_operador_16_0= '*'
                                    {
                                    lv_operador_16_0=(Token)match(input,64,FOLLOW_64_in_ruleexpression_aux6856); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_operador_16_0, grammarAccess.getExpression_auxAccess().getOperadorAsteriskKeyword_0_3_0_3_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "operador", lv_operador_16_0, "*");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 5 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3286:6: ( (lv_operador_17_0= '*=' ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3286:6: ( (lv_operador_17_0= '*=' ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3287:1: (lv_operador_17_0= '*=' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3287:1: (lv_operador_17_0= '*=' )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3288:3: lv_operador_17_0= '*='
                                    {
                                    lv_operador_17_0=(Token)match(input,65,FOLLOW_65_in_ruleexpression_aux6893); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_operador_17_0, grammarAccess.getExpression_auxAccess().getOperadorAsteriskEqualsSignKeyword_0_3_0_4_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "operador", lv_operador_17_0, "*=");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 6 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3302:6: ( (lv_operador_18_0= '/' ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3302:6: ( (lv_operador_18_0= '/' ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3303:1: (lv_operador_18_0= '/' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3303:1: (lv_operador_18_0= '/' )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3304:3: lv_operador_18_0= '/'
                                    {
                                    lv_operador_18_0=(Token)match(input,66,FOLLOW_66_in_ruleexpression_aux6930); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_operador_18_0, grammarAccess.getExpression_auxAccess().getOperadorSolidusKeyword_0_3_0_5_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "operador", lv_operador_18_0, "/");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 7 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3318:6: ( (lv_operador_19_0= '/=' ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3318:6: ( (lv_operador_19_0= '/=' ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3319:1: (lv_operador_19_0= '/=' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3319:1: (lv_operador_19_0= '/=' )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3320:3: lv_operador_19_0= '/='
                                    {
                                    lv_operador_19_0=(Token)match(input,67,FOLLOW_67_in_ruleexpression_aux6967); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_operador_19_0, grammarAccess.getExpression_auxAccess().getOperadorSolidusEqualsSignKeyword_0_3_0_6_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "operador", lv_operador_19_0, "/=");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 8 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3334:6: ( (lv_operador_20_0= '%' ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3334:6: ( (lv_operador_20_0= '%' ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3335:1: (lv_operador_20_0= '%' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3335:1: (lv_operador_20_0= '%' )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3336:3: lv_operador_20_0= '%'
                                    {
                                    lv_operador_20_0=(Token)match(input,68,FOLLOW_68_in_ruleexpression_aux7004); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_operador_20_0, grammarAccess.getExpression_auxAccess().getOperadorPercentSignKeyword_0_3_0_7_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "operador", lv_operador_20_0, "%");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 9 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3350:6: ( (lv_operador_21_0= '%=' ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3350:6: ( (lv_operador_21_0= '%=' ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3351:1: (lv_operador_21_0= '%=' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3351:1: (lv_operador_21_0= '%=' )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3352:3: lv_operador_21_0= '%='
                                    {
                                    lv_operador_21_0=(Token)match(input,69,FOLLOW_69_in_ruleexpression_aux7041); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_operador_21_0, grammarAccess.getExpression_auxAccess().getOperadorPercentSignEqualsSignKeyword_0_3_0_8_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "operador", lv_operador_21_0, "%=");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3365:3: ( (lv_exp_22_0= ruleexpression ) )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3366:1: (lv_exp_22_0= ruleexpression )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3366:1: (lv_exp_22_0= ruleexpression )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3367:3: lv_exp_22_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7076);
                            lv_exp_22_0=ruleexpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"exp",
                                      		lv_exp_22_0, 
                                      		"expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3384:6: ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3384:6: ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) )
                            int alt64=4;
                            switch ( input.LA(1) ) {
                            case 68:
                            case 69:
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                            case 76:
                            case 77:
                            case 78:
                                {
                                alt64=1;
                                }
                                break;
                            case 79:
                                {
                                alt64=2;
                                }
                                break;
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                                {
                                alt64=3;
                                }
                                break;
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                                {
                                alt64=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 64, 0, input);

                                throw nvae;
                            }

                            switch (alt64) {
                                case 1 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3384:7: ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3384:7: ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3384:8: ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3384:8: ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3385:1: ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3385:1: ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3386:1: (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3386:1: (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' )
                                    int alt61=11;
                                    switch ( input.LA(1) ) {
                                    case 70:
                                        {
                                        alt61=1;
                                        }
                                        break;
                                    case 71:
                                        {
                                        alt61=2;
                                        }
                                        break;
                                    case 72:
                                        {
                                        alt61=3;
                                        }
                                        break;
                                    case 73:
                                        {
                                        alt61=4;
                                        }
                                        break;
                                    case 74:
                                        {
                                        alt61=5;
                                        }
                                        break;
                                    case 75:
                                        {
                                        alt61=6;
                                        }
                                        break;
                                    case 76:
                                        {
                                        alt61=7;
                                        }
                                        break;
                                    case 77:
                                        {
                                        alt61=8;
                                        }
                                        break;
                                    case 78:
                                        {
                                        alt61=9;
                                        }
                                        break;
                                    case 68:
                                        {
                                        alt61=10;
                                        }
                                        break;
                                    case 69:
                                        {
                                        alt61=11;
                                        }
                                        break;
                                    default:
                                        if (state.backtracking>0) {state.failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 61, 0, input);

                                        throw nvae;
                                    }

                                    switch (alt61) {
                                        case 1 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3387:3: lv_operador_23_1= '&'
                                            {
                                            lv_operador_23_1=(Token)match(input,70,FOLLOW_70_in_ruleexpression_aux7105); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_1, grammarAccess.getExpression_auxAccess().getOperadorAmpersandKeyword_0_4_0_0_0_0());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_23_1, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3399:8: lv_operador_23_2= '&='
                                            {
                                            lv_operador_23_2=(Token)match(input,71,FOLLOW_71_in_ruleexpression_aux7134); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_2, grammarAccess.getExpression_auxAccess().getOperadorAmpersandEqualsSignKeyword_0_4_0_0_0_1());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_23_2, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 3 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3411:8: lv_operador_23_3= '|'
                                            {
                                            lv_operador_23_3=(Token)match(input,72,FOLLOW_72_in_ruleexpression_aux7163); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_3, grammarAccess.getExpression_auxAccess().getOperadorVerticalLineKeyword_0_4_0_0_0_2());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_23_3, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 4 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3423:8: lv_operador_23_4= '|='
                                            {
                                            lv_operador_23_4=(Token)match(input,73,FOLLOW_73_in_ruleexpression_aux7192); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_4, grammarAccess.getExpression_auxAccess().getOperadorVerticalLineEqualsSignKeyword_0_4_0_0_0_3());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_23_4, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 5 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3435:8: lv_operador_23_5= '^'
                                            {
                                            lv_operador_23_5=(Token)match(input,74,FOLLOW_74_in_ruleexpression_aux7221); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_5, grammarAccess.getExpression_auxAccess().getOperadorCircumflexAccentKeyword_0_4_0_0_0_4());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_23_5, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 6 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3447:8: lv_operador_23_6= '^='
                                            {
                                            lv_operador_23_6=(Token)match(input,75,FOLLOW_75_in_ruleexpression_aux7250); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_6, grammarAccess.getExpression_auxAccess().getOperadorCircumflexAccentEqualsSignKeyword_0_4_0_0_0_5());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_23_6, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 7 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3459:8: lv_operador_23_7= '&&'
                                            {
                                            lv_operador_23_7=(Token)match(input,76,FOLLOW_76_in_ruleexpression_aux7279); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_7, grammarAccess.getExpression_auxAccess().getOperadorAmpersandAmpersandKeyword_0_4_0_0_0_6());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_23_7, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 8 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3471:8: lv_operador_23_8= '||'
                                            {
                                            lv_operador_23_8=(Token)match(input,77,FOLLOW_77_in_ruleexpression_aux7308); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_8, grammarAccess.getExpression_auxAccess().getOperadorVerticalLineVerticalLineKeyword_0_4_0_0_0_7());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_23_8, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 9 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3483:8: lv_operador_23_9= '||='
                                            {
                                            lv_operador_23_9=(Token)match(input,78,FOLLOW_78_in_ruleexpression_aux7337); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_9, grammarAccess.getExpression_auxAccess().getOperadorVerticalLineVerticalLineEqualsSignKeyword_0_4_0_0_0_8());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_23_9, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 10 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3495:8: lv_operador_23_10= '%'
                                            {
                                            lv_operador_23_10=(Token)match(input,68,FOLLOW_68_in_ruleexpression_aux7366); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_10, grammarAccess.getExpression_auxAccess().getOperadorPercentSignKeyword_0_4_0_0_0_9());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_23_10, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 11 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3507:8: lv_operador_23_11= '%='
                                            {
                                            lv_operador_23_11=(Token)match(input,69,FOLLOW_69_in_ruleexpression_aux7395); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_11, grammarAccess.getExpression_auxAccess().getOperadorPercentSignEqualsSignKeyword_0_4_0_0_0_10());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_23_11, null);
                                              	    
                                            }

                                            }
                                            break;

                                    }


                                    }


                                    }

                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3522:2: ( (lv_exp_24_0= ruleexpression ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3523:1: (lv_exp_24_0= ruleexpression )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3523:1: (lv_exp_24_0= ruleexpression )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3524:3: lv_exp_24_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_0_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7432);
                                    lv_exp_24_0=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"exp",
                                              		lv_exp_24_0, 
                                              		"expression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3541:6: ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3541:6: ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3541:7: ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3541:7: ( (lv_operador_25_0= '?' ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3542:1: (lv_operador_25_0= '?' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3542:1: (lv_operador_25_0= '?' )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3543:3: lv_operador_25_0= '?'
                                    {
                                    lv_operador_25_0=(Token)match(input,79,FOLLOW_79_in_ruleexpression_aux7458); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_operador_25_0, grammarAccess.getExpression_auxAccess().getOperadorQuestionMarkKeyword_0_4_1_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "operador", lv_operador_25_0, "?");
                                      	    
                                    }

                                    }


                                    }

                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3556:2: ( (lv_exp_26_0= ruleexpression ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3557:1: (lv_exp_26_0= ruleexpression )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3557:1: (lv_exp_26_0= ruleexpression )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3558:3: lv_exp_26_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_1_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7492);
                                    lv_exp_26_0=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"exp",
                                              		lv_exp_26_0, 
                                              		"expression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3574:2: ( (lv_operador_27_0= ':' ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3575:1: (lv_operador_27_0= ':' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3575:1: (lv_operador_27_0= ':' )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3576:3: lv_operador_27_0= ':'
                                    {
                                    lv_operador_27_0=(Token)match(input,37,FOLLOW_37_in_ruleexpression_aux7510); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_operador_27_0, grammarAccess.getExpression_auxAccess().getOperadorColonKeyword_0_4_1_2_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "operador", lv_operador_27_0, ":");
                                      	    
                                    }

                                    }


                                    }

                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3589:2: ( (lv_exp_28_0= ruleexpression ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3590:1: (lv_exp_28_0= ruleexpression )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3590:1: (lv_exp_28_0= ruleexpression )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3591:3: lv_exp_28_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_1_3_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7544);
                                    lv_exp_28_0=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"exp",
                                              		lv_exp_28_0, 
                                              		"expression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }


                                    }
                                    break;
                                case 3 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3608:6: ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3608:6: ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3608:7: ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3608:7: ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3609:1: ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3609:1: ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3610:1: (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3610:1: (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' )
                                    int alt62=6;
                                    switch ( input.LA(1) ) {
                                    case 80:
                                        {
                                        alt62=1;
                                        }
                                        break;
                                    case 81:
                                        {
                                        alt62=2;
                                        }
                                        break;
                                    case 82:
                                        {
                                        alt62=3;
                                        }
                                        break;
                                    case 83:
                                        {
                                        alt62=4;
                                        }
                                        break;
                                    case 84:
                                        {
                                        alt62=5;
                                        }
                                        break;
                                    case 85:
                                        {
                                        alt62=6;
                                        }
                                        break;
                                    default:
                                        if (state.backtracking>0) {state.failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 62, 0, input);

                                        throw nvae;
                                    }

                                    switch (alt62) {
                                        case 1 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3611:3: lv_operador_29_1= '>'
                                            {
                                            lv_operador_29_1=(Token)match(input,80,FOLLOW_80_in_ruleexpression_aux7572); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_29_1, grammarAccess.getExpression_auxAccess().getOperadorGreaterThanSignKeyword_0_4_2_0_0_0());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_29_1, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3623:8: lv_operador_29_2= '<'
                                            {
                                            lv_operador_29_2=(Token)match(input,81,FOLLOW_81_in_ruleexpression_aux7601); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_29_2, grammarAccess.getExpression_auxAccess().getOperadorLessThanSignKeyword_0_4_2_0_0_1());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_29_2, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 3 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3635:8: lv_operador_29_3= '>='
                                            {
                                            lv_operador_29_3=(Token)match(input,82,FOLLOW_82_in_ruleexpression_aux7630); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_29_3, grammarAccess.getExpression_auxAccess().getOperadorGreaterThanSignEqualsSignKeyword_0_4_2_0_0_2());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_29_3, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 4 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3647:8: lv_operador_29_4= '<='
                                            {
                                            lv_operador_29_4=(Token)match(input,83,FOLLOW_83_in_ruleexpression_aux7659); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_29_4, grammarAccess.getExpression_auxAccess().getOperadorLessThanSignEqualsSignKeyword_0_4_2_0_0_3());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_29_4, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 5 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3659:8: lv_operador_29_5= '=='
                                            {
                                            lv_operador_29_5=(Token)match(input,84,FOLLOW_84_in_ruleexpression_aux7688); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_29_5, grammarAccess.getExpression_auxAccess().getOperadorEqualsSignEqualsSignKeyword_0_4_2_0_0_4());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_29_5, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 6 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3671:8: lv_operador_29_6= '!='
                                            {
                                            lv_operador_29_6=(Token)match(input,85,FOLLOW_85_in_ruleexpression_aux7717); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_29_6, grammarAccess.getExpression_auxAccess().getOperadorExclamationMarkEqualsSignKeyword_0_4_2_0_0_5());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_29_6, null);
                                              	    
                                            }

                                            }
                                            break;

                                    }


                                    }


                                    }

                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3686:2: ( (lv_exp_30_0= ruleexpression ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3687:1: (lv_exp_30_0= ruleexpression )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3687:1: (lv_exp_30_0= ruleexpression )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3688:3: lv_exp_30_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7754);
                                    lv_exp_30_0=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"exp",
                                              		lv_exp_30_0, 
                                              		"expression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }


                                    }
                                    break;
                                case 4 :
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3705:6: ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3705:6: ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3705:7: ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3705:7: ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3706:1: ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3706:1: ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3707:1: (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3707:1: (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' )
                                    int alt63=4;
                                    switch ( input.LA(1) ) {
                                    case 86:
                                        {
                                        alt63=1;
                                        }
                                        break;
                                    case 87:
                                        {
                                        alt63=2;
                                        }
                                        break;
                                    case 88:
                                        {
                                        alt63=3;
                                        }
                                        break;
                                    case 89:
                                        {
                                        alt63=4;
                                        }
                                        break;
                                    default:
                                        if (state.backtracking>0) {state.failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 63, 0, input);

                                        throw nvae;
                                    }

                                    switch (alt63) {
                                        case 1 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3708:3: lv_operador_31_1= '>>='
                                            {
                                            lv_operador_31_1=(Token)match(input,86,FOLLOW_86_in_ruleexpression_aux7782); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_31_1, grammarAccess.getExpression_auxAccess().getOperadorGreaterThanSignGreaterThanSignEqualsSignKeyword_0_4_3_0_0_0());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_31_1, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3720:8: lv_operador_31_2= '<<'
                                            {
                                            lv_operador_31_2=(Token)match(input,87,FOLLOW_87_in_ruleexpression_aux7811); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_31_2, grammarAccess.getExpression_auxAccess().getOperadorLessThanSignLessThanSignKeyword_0_4_3_0_0_1());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_31_2, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 3 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3732:8: lv_operador_31_3= '>>'
                                            {
                                            lv_operador_31_3=(Token)match(input,88,FOLLOW_88_in_ruleexpression_aux7840); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_31_3, grammarAccess.getExpression_auxAccess().getOperadorGreaterThanSignGreaterThanSignKeyword_0_4_3_0_0_2());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_31_3, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 4 :
                                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3744:8: lv_operador_31_4= '>>>'
                                            {
                                            lv_operador_31_4=(Token)match(input,89,FOLLOW_89_in_ruleexpression_aux7869); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_31_4, grammarAccess.getExpression_auxAccess().getOperadorGreaterThanSignGreaterThanSignGreaterThanSignKeyword_0_4_3_0_0_3());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_31_4, null);
                                              	    
                                            }

                                            }
                                            break;

                                    }


                                    }


                                    }

                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3759:2: ( (lv_exp_32_0= ruleexpression ) )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3760:1: (lv_exp_32_0= ruleexpression )
                                    {
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3760:1: (lv_exp_32_0= ruleexpression )
                                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3761:3: lv_exp_32_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_3_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7906);
                                    lv_exp_32_0=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"exp",
                                              		lv_exp_32_0, 
                                              		"expression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3777:5: ( (lv_expressoes_33_0= ruleexpression_aux ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3778:1: (lv_expressoes_33_0= ruleexpression_aux )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3778:1: (lv_expressoes_33_0= ruleexpression_aux )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3779:3: lv_expressoes_33_0= ruleexpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressoesExpression_auxParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression_aux7930);
                    lv_expressoes_33_0=ruleexpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expressoes",
                              		lv_expressoes_33_0, 
                              		"expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression_aux"


    // $ANTLR start "entryRulemais_aux"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3803:1: entryRulemais_aux returns [EObject current=null] : iv_rulemais_aux= rulemais_aux EOF ;
    public final EObject entryRulemais_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemais_aux = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3804:2: (iv_rulemais_aux= rulemais_aux EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3805:2: iv_rulemais_aux= rulemais_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMais_auxRule()); 
            }
            pushFollow(FOLLOW_rulemais_aux_in_entryRulemais_aux7967);
            iv_rulemais_aux=rulemais_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemais_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemais_aux7977); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemais_aux"


    // $ANTLR start "rulemais_aux"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3812:1: rulemais_aux returns [EObject current=null] : ( ( (lv_operador_0_0= '+' ) ) | ( (lv_operador_1_0= '+=' ) ) ) ;
    public final EObject rulemais_aux() throws RecognitionException {
        EObject current = null;

        Token lv_operador_0_0=null;
        Token lv_operador_1_0=null;

         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3815:28: ( ( ( (lv_operador_0_0= '+' ) ) | ( (lv_operador_1_0= '+=' ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3816:1: ( ( (lv_operador_0_0= '+' ) ) | ( (lv_operador_1_0= '+=' ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3816:1: ( ( (lv_operador_0_0= '+' ) ) | ( (lv_operador_1_0= '+=' ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==90) ) {
                alt67=1;
            }
            else if ( (LA67_0==91) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3816:2: ( (lv_operador_0_0= '+' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3816:2: ( (lv_operador_0_0= '+' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3817:1: (lv_operador_0_0= '+' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3817:1: (lv_operador_0_0= '+' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3818:3: lv_operador_0_0= '+'
                    {
                    lv_operador_0_0=(Token)match(input,90,FOLLOW_90_in_rulemais_aux8020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_operador_0_0, grammarAccess.getMais_auxAccess().getOperadorPlusSignKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMais_auxRule());
                      	        }
                             		setWithLastConsumed(current, "operador", lv_operador_0_0, "+");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3832:6: ( (lv_operador_1_0= '+=' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3832:6: ( (lv_operador_1_0= '+=' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3833:1: (lv_operador_1_0= '+=' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3833:1: (lv_operador_1_0= '+=' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3834:3: lv_operador_1_0= '+='
                    {
                    lv_operador_1_0=(Token)match(input,91,FOLLOW_91_in_rulemais_aux8057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_operador_1_0, grammarAccess.getMais_auxAccess().getOperadorPlusSignEqualsSignKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMais_auxRule());
                      	        }
                             		setWithLastConsumed(current, "operador", lv_operador_1_0, "+=");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemais_aux"


    // $ANTLR start "entryRulenewBlock"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3855:1: entryRulenewBlock returns [EObject current=null] : iv_rulenewBlock= rulenewBlock EOF ;
    public final EObject entryRulenewBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenewBlock = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3856:2: (iv_rulenewBlock= rulenewBlock EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3857:2: iv_rulenewBlock= rulenewBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewBlockRule()); 
            }
            pushFollow(FOLLOW_rulenewBlock_in_entryRulenewBlock8106);
            iv_rulenewBlock=rulenewBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenewBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenewBlock8116); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenewBlock"


    // $ANTLR start "rulenewBlock"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3864:1: rulenewBlock returns [EObject current=null] : (otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}' ) ;
    public final EObject rulenewBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_constructor_declaration_1 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3867:28: ( (otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3868:1: (otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3868:1: (otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}' )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3868:3: otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulenewBlock8153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNewBlockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNewBlockAccess().getConstructor_declarationParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleconstructor_declaration_in_rulenewBlock8178);
            this_constructor_declaration_1=ruleconstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_constructor_declaration_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulenewBlock8189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNewBlockAccess().getRightCurlyBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenewBlock"


    // $ANTLR start "entryRulecreating_aux"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3896:1: entryRulecreating_aux returns [EObject current=null] : iv_rulecreating_aux= rulecreating_aux EOF ;
    public final EObject entryRulecreating_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecreating_aux = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3897:2: (iv_rulecreating_aux= rulecreating_aux EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3898:2: iv_rulecreating_aux= rulecreating_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreating_auxRule()); 
            }
            pushFollow(FOLLOW_rulecreating_aux_in_entryRulecreating_aux8225);
            iv_rulecreating_aux=rulecreating_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecreating_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecreating_aux8235); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecreating_aux"


    // $ANTLR start "rulecreating_aux"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3905:1: rulecreating_aux returns [EObject current=null] : ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) ) ;
    public final EObject rulecreating_aux() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_argumentos_1_0 = null;

        EObject this_aux_3 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3908:28: ( ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3909:1: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3909:1: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) )
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3909:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3909:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3909:3: ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')'
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3909:3: ( ( '(' )=>otherlv_0= '(' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3909:4: ( '(' )=>otherlv_0= '('
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulecreating_aux8281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCreating_auxAccess().getLeftParenthesisKeyword_0_0());
                          
                    }

                    }

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3914:2: ( (lv_argumentos_1_0= rulearglist ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( ((LA68_0>=RULE_STRING && LA68_0<=RULE_FLOAT_LITERAL)||LA68_0==30||(LA68_0>=54 && LA68_0<=57)||(LA68_0>=60 && LA68_0<=62)||(LA68_0>=92 && LA68_0<=104)) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3915:1: (lv_argumentos_1_0= rulearglist )
                            {
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3915:1: (lv_argumentos_1_0= rulearglist )
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3916:3: lv_argumentos_1_0= rulearglist
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCreating_auxAccess().getArgumentosArglistParserRuleCall_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulearglist_in_rulecreating_aux8303);
                            lv_argumentos_1_0=rulearglist();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCreating_auxRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"argumentos",
                                      		lv_argumentos_1_0, 
                                      		"arglist");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulecreating_aux8316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCreating_auxAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3937:6: ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3937:6: ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3937:7: ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )*
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3937:7: ( ( '[' )=>this_aux_3= ruleaux )?
                    int alt69=2;
                    alt69 = dfa69.predict(input);
                    switch (alt69) {
                        case 1 :
                            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3937:8: ( '[' )=>this_aux_3= ruleaux
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCreating_auxAccess().getAuxParserRuleCall_1_0_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleaux_in_rulecreating_aux8357);
                            this_aux_3=ruleaux();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_aux_3; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3950:3: (otherlv_4= '[' otherlv_5= ']' )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==32) ) {
                            int LA70_2 = input.LA(2);

                            if ( (LA70_2==33) ) {
                                alt70=1;
                            }


                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3950:5: otherlv_4= '[' otherlv_5= ']'
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_rulecreating_aux8371); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getCreating_auxAccess().getLeftSquareBracketKeyword_1_1_0());
                    	          
                    	    }
                    	    otherlv_5=(Token)match(input,33,FOLLOW_33_in_rulecreating_aux8383); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getCreating_auxAccess().getRightSquareBracketKeyword_1_1_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecreating_aux"


    // $ANTLR start "entryRuleaux"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3966:1: entryRuleaux returns [EObject current=null] : iv_ruleaux= ruleaux EOF ;
    public final EObject entryRuleaux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaux = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3967:2: (iv_ruleaux= ruleaux EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3968:2: iv_ruleaux= ruleaux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAuxRule()); 
            }
            pushFollow(FOLLOW_ruleaux_in_entryRuleaux8422);
            iv_ruleaux=ruleaux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleaux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleaux8432); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleaux"


    // $ANTLR start "ruleaux"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3975:1: ruleaux returns [EObject current=null] : (otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']' ) ;
    public final EObject ruleaux() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_espressao_1_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3978:28: ( (otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3979:1: (otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3979:1: (otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']' )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3979:3: otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleaux8469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAuxAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3983:1: ( (lv_espressao_1_0= ruleexpression ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3984:1: (lv_espressao_1_0= ruleexpression )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3984:1: (lv_espressao_1_0= ruleexpression )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3985:3: lv_espressao_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAuxAccess().getEspressaoExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleaux8490);
            lv_espressao_1_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAuxRule());
              	        }
                     		set(
                     			current, 
                     			"espressao",
                      		lv_espressao_1_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleaux8502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAuxAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleaux"


    // $ANTLR start "entryRuleliteral_expression"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4013:1: entryRuleliteral_expression returns [EObject current=null] : iv_ruleliteral_expression= ruleliteral_expression EOF ;
    public final EObject entryRuleliteral_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleliteral_expression = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4014:2: (iv_ruleliteral_expression= ruleliteral_expression EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4015:2: iv_ruleliteral_expression= ruleliteral_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteral_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleliteral_expression_in_entryRuleliteral_expression8538);
            iv_ruleliteral_expression=ruleliteral_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleliteral_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleliteral_expression8548); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleliteral_expression"


    // $ANTLR start "ruleliteral_expression"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4022:1: ruleliteral_expression returns [EObject current=null] : ( ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) ) | ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) ) | ( (lv_l_float_2_0= RULE_FLOAT_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleliteral_expression() throws RecognitionException {
        EObject current = null;

        Token lv_decimal_0_0=null;
        Token lv_inteiro_1_0=null;
        Token lv_l_float_2_0=null;
        Token lv_string_3_0=null;

         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4025:28: ( ( ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) ) | ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) ) | ( (lv_l_float_2_0= RULE_FLOAT_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4026:1: ( ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) ) | ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) ) | ( (lv_l_float_2_0= RULE_FLOAT_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4026:1: ( ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) ) | ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) ) | ( (lv_l_float_2_0= RULE_FLOAT_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) )
            int alt72=4;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL_DIGITS:
                {
                alt72=1;
                }
                break;
            case RULE_INTEGER_LITERAL:
                {
                alt72=2;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt72=3;
                }
                break;
            case RULE_STRING:
                {
                alt72=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4026:2: ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4026:2: ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4026:3: ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4027:1: (lv_decimal_0_0= RULE_DECIMAL_DIGITS )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4028:3: lv_decimal_0_0= RULE_DECIMAL_DIGITS
                    {
                    lv_decimal_0_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleliteral_expression8595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_decimal_0_0, grammarAccess.getLiteral_expressionAccess().getDecimalDECIMAL_DIGITSTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteral_expressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"decimal",
                              		lv_decimal_0_0, 
                              		"DECIMAL_DIGITS");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4045:6: ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4045:6: ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4046:1: (lv_inteiro_1_0= RULE_INTEGER_LITERAL )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4046:1: (lv_inteiro_1_0= RULE_INTEGER_LITERAL )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4047:3: lv_inteiro_1_0= RULE_INTEGER_LITERAL
                    {
                    lv_inteiro_1_0=(Token)match(input,RULE_INTEGER_LITERAL,FOLLOW_RULE_INTEGER_LITERAL_in_ruleliteral_expression8623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_inteiro_1_0, grammarAccess.getLiteral_expressionAccess().getInteiroINTEGER_LITERALTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteral_expressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"inteiro",
                              		lv_inteiro_1_0, 
                              		"INTEGER_LITERAL");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4064:6: ( (lv_l_float_2_0= RULE_FLOAT_LITERAL ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4064:6: ( (lv_l_float_2_0= RULE_FLOAT_LITERAL ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4065:1: (lv_l_float_2_0= RULE_FLOAT_LITERAL )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4065:1: (lv_l_float_2_0= RULE_FLOAT_LITERAL )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4066:3: lv_l_float_2_0= RULE_FLOAT_LITERAL
                    {
                    lv_l_float_2_0=(Token)match(input,RULE_FLOAT_LITERAL,FOLLOW_RULE_FLOAT_LITERAL_in_ruleliteral_expression8651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_l_float_2_0, grammarAccess.getLiteral_expressionAccess().getL_floatFLOAT_LITERALTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteral_expressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"l_float",
                              		lv_l_float_2_0, 
                              		"FLOAT_LITERAL");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4083:6: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4083:6: ( (lv_string_3_0= RULE_STRING ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4084:1: (lv_string_3_0= RULE_STRING )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4084:1: (lv_string_3_0= RULE_STRING )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4085:3: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleliteral_expression8679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_string_3_0, grammarAccess.getLiteral_expressionAccess().getStringSTRINGTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteral_expressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"string",
                              		lv_string_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleliteral_expression"


    // $ANTLR start "entryRulelogical_expression"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4109:1: entryRulelogical_expression returns [EObject current=null] : iv_rulelogical_expression= rulelogical_expression EOF ;
    public final EObject entryRulelogical_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelogical_expression = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4110:2: (iv_rulelogical_expression= rulelogical_expression EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4111:2: iv_rulelogical_expression= rulelogical_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_expressionRule()); 
            }
            pushFollow(FOLLOW_rulelogical_expression_in_entryRulelogical_expression8720);
            iv_rulelogical_expression=rulelogical_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelogical_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelogical_expression8730); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelogical_expression"


    // $ANTLR start "rulelogical_expression"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4118:1: rulelogical_expression returns [EObject current=null] : ( ( ( (lv_operador_0_0= '!' ) ) ( (lv_exp_1_0= ruleexpression ) ) ) | ( (lv_operador_2_0= 'true' ) ) | ( (lv_operador_3_0= 'false' ) ) ) ;
    public final EObject rulelogical_expression() throws RecognitionException {
        EObject current = null;

        Token lv_operador_0_0=null;
        Token lv_operador_2_0=null;
        Token lv_operador_3_0=null;
        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4121:28: ( ( ( ( (lv_operador_0_0= '!' ) ) ( (lv_exp_1_0= ruleexpression ) ) ) | ( (lv_operador_2_0= 'true' ) ) | ( (lv_operador_3_0= 'false' ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4122:1: ( ( ( (lv_operador_0_0= '!' ) ) ( (lv_exp_1_0= ruleexpression ) ) ) | ( (lv_operador_2_0= 'true' ) ) | ( (lv_operador_3_0= 'false' ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4122:1: ( ( ( (lv_operador_0_0= '!' ) ) ( (lv_exp_1_0= ruleexpression ) ) ) | ( (lv_operador_2_0= 'true' ) ) | ( (lv_operador_3_0= 'false' ) ) )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt73=1;
                }
                break;
            case 93:
                {
                alt73=2;
                }
                break;
            case 94:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4122:2: ( ( (lv_operador_0_0= '!' ) ) ( (lv_exp_1_0= ruleexpression ) ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4122:2: ( ( (lv_operador_0_0= '!' ) ) ( (lv_exp_1_0= ruleexpression ) ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4122:3: ( (lv_operador_0_0= '!' ) ) ( (lv_exp_1_0= ruleexpression ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4122:3: ( (lv_operador_0_0= '!' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4123:1: (lv_operador_0_0= '!' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4123:1: (lv_operador_0_0= '!' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4124:3: lv_operador_0_0= '!'
                    {
                    lv_operador_0_0=(Token)match(input,92,FOLLOW_92_in_rulelogical_expression8774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_operador_0_0, grammarAccess.getLogical_expressionAccess().getOperadorExclamationMarkKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogical_expressionRule());
                      	        }
                             		setWithLastConsumed(current, "operador", lv_operador_0_0, "!");
                      	    
                    }

                    }


                    }

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4137:2: ( (lv_exp_1_0= ruleexpression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4138:1: (lv_exp_1_0= ruleexpression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4138:1: (lv_exp_1_0= ruleexpression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4139:3: lv_exp_1_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogical_expressionAccess().getExpExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulelogical_expression8808);
                    lv_exp_1_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogical_expressionRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_1_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4156:6: ( (lv_operador_2_0= 'true' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4156:6: ( (lv_operador_2_0= 'true' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4157:1: (lv_operador_2_0= 'true' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4157:1: (lv_operador_2_0= 'true' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4158:3: lv_operador_2_0= 'true'
                    {
                    lv_operador_2_0=(Token)match(input,93,FOLLOW_93_in_rulelogical_expression8833); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_operador_2_0, grammarAccess.getLogical_expressionAccess().getOperadorTrueKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogical_expressionRule());
                      	        }
                             		setWithLastConsumed(current, "operador", lv_operador_2_0, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4172:6: ( (lv_operador_3_0= 'false' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4172:6: ( (lv_operador_3_0= 'false' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4173:1: (lv_operador_3_0= 'false' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4173:1: (lv_operador_3_0= 'false' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4174:3: lv_operador_3_0= 'false'
                    {
                    lv_operador_3_0=(Token)match(input,94,FOLLOW_94_in_rulelogical_expression8870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_operador_3_0, grammarAccess.getLogical_expressionAccess().getOperadorFalseKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogical_expressionRule());
                      	        }
                             		setWithLastConsumed(current, "operador", lv_operador_3_0, "false");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelogical_expression"


    // $ANTLR start "entryRulebit_expression"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4195:1: entryRulebit_expression returns [EObject current=null] : iv_rulebit_expression= rulebit_expression EOF ;
    public final EObject entryRulebit_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebit_expression = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4196:2: (iv_rulebit_expression= rulebit_expression EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4197:2: iv_rulebit_expression= rulebit_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBit_expressionRule()); 
            }
            pushFollow(FOLLOW_rulebit_expression_in_entryRulebit_expression8919);
            iv_rulebit_expression=rulebit_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebit_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulebit_expression8929); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebit_expression"


    // $ANTLR start "rulebit_expression"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4204:1: rulebit_expression returns [EObject current=null] : ( ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) ;
    public final EObject rulebit_expression() throws RecognitionException {
        EObject current = null;

        Token lv_operador_0_0=null;
        EObject lv_expressao_1_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4207:28: ( ( ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4208:1: ( ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4208:1: ( ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4208:2: ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4208:2: ( (lv_operador_0_0= '~' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4209:1: (lv_operador_0_0= '~' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4209:1: (lv_operador_0_0= '~' )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4210:3: lv_operador_0_0= '~'
            {
            lv_operador_0_0=(Token)match(input,95,FOLLOW_95_in_rulebit_expression8972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_operador_0_0, grammarAccess.getBit_expressionAccess().getOperadorTildeKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBit_expressionRule());
              	        }
                     		setWithLastConsumed(current, "operador", lv_operador_0_0, "~");
              	    
            }

            }


            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4223:2: ( (lv_expressao_1_0= ruleexpression ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4224:1: (lv_expressao_1_0= ruleexpression )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4224:1: (lv_expressao_1_0= ruleexpression )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4225:3: lv_expressao_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBit_expressionAccess().getExpressaoExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulebit_expression9006);
            lv_expressao_1_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBit_expressionRule());
              	        }
                     		set(
                     			current, 
                     			"expressao",
                      		lv_expressao_1_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebit_expression"


    // $ANTLR start "entryRulenumeric_expression"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4249:1: entryRulenumeric_expression returns [EObject current=null] : iv_rulenumeric_expression= rulenumeric_expression EOF ;
    public final EObject entryRulenumeric_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumeric_expression = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4250:2: (iv_rulenumeric_expression= rulenumeric_expression EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4251:2: iv_rulenumeric_expression= rulenumeric_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_expressionRule()); 
            }
            pushFollow(FOLLOW_rulenumeric_expression_in_entryRulenumeric_expression9042);
            iv_rulenumeric_expression=rulenumeric_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenumeric_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenumeric_expression9052); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumeric_expression"


    // $ANTLR start "rulenumeric_expression"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4258:1: rulenumeric_expression returns [EObject current=null] : ( ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) ;
    public final EObject rulenumeric_expression() throws RecognitionException {
        EObject current = null;

        Token lv_operador_0_1=null;
        Token lv_operador_0_2=null;
        Token lv_operador_0_3=null;
        EObject lv_expressao_1_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4261:28: ( ( ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4262:1: ( ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4262:1: ( ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4262:2: ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4262:2: ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4263:1: ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4263:1: ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4264:1: (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4264:1: (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt74=1;
                }
                break;
            case 60:
                {
                alt74=2;
                }
                break;
            case 61:
                {
                alt74=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4265:3: lv_operador_0_1= '-'
                    {
                    lv_operador_0_1=(Token)match(input,62,FOLLOW_62_in_rulenumeric_expression9097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_operador_0_1, grammarAccess.getNumeric_expressionAccess().getOperadorHyphenMinusKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_expressionRule());
                      	        }
                             		setWithLastConsumed(current, "operador", lv_operador_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4277:8: lv_operador_0_2= '++'
                    {
                    lv_operador_0_2=(Token)match(input,60,FOLLOW_60_in_rulenumeric_expression9126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_operador_0_2, grammarAccess.getNumeric_expressionAccess().getOperadorPlusSignPlusSignKeyword_0_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_expressionRule());
                      	        }
                             		setWithLastConsumed(current, "operador", lv_operador_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4289:8: lv_operador_0_3= '--'
                    {
                    lv_operador_0_3=(Token)match(input,61,FOLLOW_61_in_rulenumeric_expression9155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_operador_0_3, grammarAccess.getNumeric_expressionAccess().getOperadorHyphenMinusHyphenMinusKeyword_0_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_expressionRule());
                      	        }
                             		setWithLastConsumed(current, "operador", lv_operador_0_3, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4304:2: ( (lv_expressao_1_0= ruleexpression ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4305:1: (lv_expressao_1_0= ruleexpression )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4305:1: (lv_expressao_1_0= ruleexpression )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4306:3: lv_expressao_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumeric_expressionAccess().getExpressaoExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulenumeric_expression9192);
            lv_expressao_1_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumeric_expressionRule());
              	        }
                     		set(
                     			current, 
                     			"expressao",
                      		lv_expressao_1_0, 
                      		"expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumeric_expression"


    // $ANTLR start "entryRulearglist"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4330:1: entryRulearglist returns [EObject current=null] : iv_rulearglist= rulearglist EOF ;
    public final EObject entryRulearglist() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearglist = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4331:2: (iv_rulearglist= rulearglist EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4332:2: iv_rulearglist= rulearglist EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArglistRule()); 
            }
            pushFollow(FOLLOW_rulearglist_in_entryRulearglist9228);
            iv_rulearglist=rulearglist();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearglist; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulearglist9238); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearglist"


    // $ANTLR start "rulearglist"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4339:1: rulearglist returns [EObject current=null] : ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) ) ;
    public final EObject rulearglist() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_STRING_4=null;
        Token otherlv_5=null;
        Token lv_nomeParametro_7_0=null;
        Token otherlv_8=null;
        Token lv_nomeParametro_10_0=null;
        EObject lv_expressoesArgumentos_0_0 = null;

        EObject lv_expressoesArgumentos_2_0 = null;

        EObject lv_tipoParametro_6_0 = null;

        EObject lv_tipoParametro_9_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4342:28: ( ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4343:1: ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4343:1: ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) )
            int alt77=3;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4343:2: ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4343:2: ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4343:3: ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )*
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4343:3: ( (lv_expressoesArgumentos_0_0= ruleexpression ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4344:1: (lv_expressoesArgumentos_0_0= ruleexpression )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4344:1: (lv_expressoesArgumentos_0_0= ruleexpression )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4345:3: lv_expressoesArgumentos_0_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArglistAccess().getExpressoesArgumentosExpressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulearglist9285);
                    lv_expressoesArgumentos_0_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArglistRule());
                      	        }
                             		add(
                             			current, 
                             			"expressoesArgumentos",
                              		lv_expressoesArgumentos_0_0, 
                              		"expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4361:2: (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==26) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4361:4: otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) )
                    	    {
                    	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_rulearglist9298); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_1, grammarAccess.getArglistAccess().getCommaKeyword_0_1_0());
                    	          
                    	    }
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4365:1: ( (lv_expressoesArgumentos_2_0= ruleexpression ) )
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4366:1: (lv_expressoesArgumentos_2_0= ruleexpression )
                    	    {
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4366:1: (lv_expressoesArgumentos_2_0= ruleexpression )
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4367:3: lv_expressoesArgumentos_2_0= ruleexpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArglistAccess().getExpressoesArgumentosExpressionParserRuleCall_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleexpression_in_rulearglist9319);
                    	    lv_expressoesArgumentos_2_0=ruleexpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArglistRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"expressoesArgumentos",
                    	              		lv_expressoesArgumentos_2_0, 
                    	              		"expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4384:6: (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4384:6: (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4384:8: otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"'
                    {
                    otherlv_3=(Token)match(input,96,FOLLOW_96_in_rulearglist9341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArglistAccess().getQuotationMarkKeyword_1_0());
                          
                    }
                    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulearglist9352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_4, grammarAccess.getArglistAccess().getSTRINGTerminalRuleCall_1_1()); 
                          
                    }
                    otherlv_5=(Token)match(input,96,FOLLOW_96_in_rulearglist9363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getArglistAccess().getQuotationMarkKeyword_1_2());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4397:6: ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4397:6: ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4397:7: ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )*
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4397:7: ( (lv_tipoParametro_6_0= ruletype ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4398:1: (lv_tipoParametro_6_0= ruletype )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4398:1: (lv_tipoParametro_6_0= ruletype )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4399:3: lv_tipoParametro_6_0= ruletype
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArglistAccess().getTipoParametroTypeParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_in_rulearglist9392);
                    lv_tipoParametro_6_0=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArglistRule());
                      	        }
                             		add(
                             			current, 
                             			"tipoParametro",
                              		lv_tipoParametro_6_0, 
                              		"type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4415:2: ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4416:1: (lv_nomeParametro_7_0= RULE_IDENTIFIER )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4416:1: (lv_nomeParametro_7_0= RULE_IDENTIFIER )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4417:3: lv_nomeParametro_7_0= RULE_IDENTIFIER
                    {
                    lv_nomeParametro_7_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulearglist9409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_nomeParametro_7_0, grammarAccess.getArglistAccess().getNomeParametroIDENTIFIERTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArglistRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"nomeParametro",
                              		lv_nomeParametro_7_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }

                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4433:2: (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==26) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4433:4: otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) )
                    	    {
                    	    otherlv_8=(Token)match(input,26,FOLLOW_26_in_rulearglist9427); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getArglistAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4437:1: ( (lv_tipoParametro_9_0= ruletype ) )
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4438:1: (lv_tipoParametro_9_0= ruletype )
                    	    {
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4438:1: (lv_tipoParametro_9_0= ruletype )
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4439:3: lv_tipoParametro_9_0= ruletype
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArglistAccess().getTipoParametroTypeParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruletype_in_rulearglist9448);
                    	    lv_tipoParametro_9_0=ruletype();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArglistRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"tipoParametro",
                    	              		lv_tipoParametro_9_0, 
                    	              		"type");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4455:2: ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) )
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4456:1: (lv_nomeParametro_10_0= RULE_IDENTIFIER )
                    	    {
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4456:1: (lv_nomeParametro_10_0= RULE_IDENTIFIER )
                    	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4457:3: lv_nomeParametro_10_0= RULE_IDENTIFIER
                    	    {
                    	    lv_nomeParametro_10_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulearglist9465); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_nomeParametro_10_0, grammarAccess.getArglistAccess().getNomeParametroIDENTIFIERTerminalRuleCall_2_2_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getArglistRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"nomeParametro",
                    	              		lv_nomeParametro_10_0, 
                    	              		"IDENTIFIER");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearglist"


    // $ANTLR start "entryRulename"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4481:1: entryRulename returns [EObject current=null] : iv_rulename= rulename EOF ;
    public final EObject entryRulename() throws RecognitionException {
        EObject current = null;

        EObject iv_rulename = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4482:2: (iv_rulename= rulename EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4483:2: iv_rulename= rulename EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_rulename_in_entryRulename9509);
            iv_rulename=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulename; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulename9519); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulename"


    // $ANTLR start "rulename"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4490:1: rulename returns [EObject current=null] : ( ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) ) ) ;
    public final EObject rulename() throws RecognitionException {
        EObject current = null;

        Token lv_nome_0_0=null;
        EObject lv_pacote_1_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4493:28: ( ( ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4494:1: ( ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4494:1: ( ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4494:2: ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4494:2: ( (lv_nome_0_0= RULE_IDENTIFIER ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4495:1: (lv_nome_0_0= RULE_IDENTIFIER )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4495:1: (lv_nome_0_0= RULE_IDENTIFIER )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4496:3: lv_nome_0_0= RULE_IDENTIFIER
            {
            lv_nome_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulename9561); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nome_0_0, grammarAccess.getNameAccess().getNomeIDENTIFIERTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNameRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nome",
                      		lv_nome_0_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4512:2: ( (lv_pacote_1_0= rulepackage_name_aux ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4513:1: (lv_pacote_1_0= rulepackage_name_aux )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4513:1: (lv_pacote_1_0= rulepackage_name_aux )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4514:3: lv_pacote_1_0= rulepackage_name_aux
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameAccess().getPacotePackage_name_auxParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulepackage_name_aux_in_rulename9587);
            lv_pacote_1_0=rulepackage_name_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNameRule());
              	        }
                     		set(
                     			current, 
                     			"pacote",
                      		lv_pacote_1_0, 
                      		"package_name_aux");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulename"


    // $ANTLR start "entryRulepackage_name_aux"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4538:1: entryRulepackage_name_aux returns [EObject current=null] : iv_rulepackage_name_aux= rulepackage_name_aux EOF ;
    public final EObject entryRulepackage_name_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepackage_name_aux = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4539:2: (iv_rulepackage_name_aux= rulepackage_name_aux EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4540:2: iv_rulepackage_name_aux= rulepackage_name_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_name_auxRule()); 
            }
            pushFollow(FOLLOW_rulepackage_name_aux_in_entryRulepackage_name_aux9623);
            iv_rulepackage_name_aux=rulepackage_name_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepackage_name_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepackage_name_aux9633); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepackage_name_aux"


    // $ANTLR start "rulepackage_name_aux"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4547:1: rulepackage_name_aux returns [EObject current=null] : (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )* ;
    public final EObject rulepackage_name_aux() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nomePacote_1_0=null;
        EObject lv_pacote_2_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4550:28: ( (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )* )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4551:1: (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )*
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4551:1: (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==58) ) {
                    int LA78_2 = input.LA(2);

                    if ( (synpred195_InternalSimpleJava()) ) {
                        alt78=1;
                    }


                }


                switch (alt78) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4551:3: otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) )
            	    {
            	    otherlv_0=(Token)match(input,58,FOLLOW_58_in_rulepackage_name_aux9670); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_0, grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0());
            	          
            	    }
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4555:1: ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4556:1: (lv_nomePacote_1_0= RULE_IDENTIFIER )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4556:1: (lv_nomePacote_1_0= RULE_IDENTIFIER )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4557:3: lv_nomePacote_1_0= RULE_IDENTIFIER
            	    {
            	    lv_nomePacote_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulepackage_name_aux9687); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_nomePacote_1_0, grammarAccess.getPackage_name_auxAccess().getNomePacoteIDENTIFIERTerminalRuleCall_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getPackage_name_auxRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"nomePacote",
            	              		lv_nomePacote_1_0, 
            	              		"IDENTIFIER");
            	      	    
            	    }

            	    }


            	    }

            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4573:2: ( (lv_pacote_2_0= rulepackage_name_aux ) )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4574:1: (lv_pacote_2_0= rulepackage_name_aux )
            	    {
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4574:1: (lv_pacote_2_0= rulepackage_name_aux )
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4575:3: lv_pacote_2_0= rulepackage_name_aux
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackage_name_auxAccess().getPacotePackage_name_auxParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulepackage_name_aux_in_rulepackage_name_aux9713);
            	    lv_pacote_2_0=rulepackage_name_aux();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackage_name_auxRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"pacote",
            	              		lv_pacote_2_0, 
            	              		"package_name_aux");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepackage_name_aux"


    // $ANTLR start "entryRuletype_specifier"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4599:1: entryRuletype_specifier returns [EObject current=null] : iv_ruletype_specifier= ruletype_specifier EOF ;
    public final EObject entryRuletype_specifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_specifier = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4600:2: (iv_ruletype_specifier= ruletype_specifier EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4601:2: iv_ruletype_specifier= ruletype_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruletype_specifier_in_entryRuletype_specifier9750);
            iv_ruletype_specifier=ruletype_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_specifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_specifier9760); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_specifier"


    // $ANTLR start "ruletype_specifier"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4608:1: ruletype_specifier returns [EObject current=null] : ( ( (lv_nome_0_0= 'boolean' ) ) | ( (lv_nome_1_0= 'byte' ) ) | ( (lv_nome_2_0= 'char' ) ) | ( (lv_nome_3_0= 'short' ) ) | ( (lv_nome_4_0= 'int' ) ) | ( (lv_nome_5_0= 'float' ) ) | ( (lv_nome_6_0= 'long' ) ) | ( (lv_nome_7_0= 'double' ) ) ) ;
    public final EObject ruletype_specifier() throws RecognitionException {
        EObject current = null;

        Token lv_nome_0_0=null;
        Token lv_nome_1_0=null;
        Token lv_nome_2_0=null;
        Token lv_nome_3_0=null;
        Token lv_nome_4_0=null;
        Token lv_nome_5_0=null;
        Token lv_nome_6_0=null;
        Token lv_nome_7_0=null;

         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4611:28: ( ( ( (lv_nome_0_0= 'boolean' ) ) | ( (lv_nome_1_0= 'byte' ) ) | ( (lv_nome_2_0= 'char' ) ) | ( (lv_nome_3_0= 'short' ) ) | ( (lv_nome_4_0= 'int' ) ) | ( (lv_nome_5_0= 'float' ) ) | ( (lv_nome_6_0= 'long' ) ) | ( (lv_nome_7_0= 'double' ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4612:1: ( ( (lv_nome_0_0= 'boolean' ) ) | ( (lv_nome_1_0= 'byte' ) ) | ( (lv_nome_2_0= 'char' ) ) | ( (lv_nome_3_0= 'short' ) ) | ( (lv_nome_4_0= 'int' ) ) | ( (lv_nome_5_0= 'float' ) ) | ( (lv_nome_6_0= 'long' ) ) | ( (lv_nome_7_0= 'double' ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4612:1: ( ( (lv_nome_0_0= 'boolean' ) ) | ( (lv_nome_1_0= 'byte' ) ) | ( (lv_nome_2_0= 'char' ) ) | ( (lv_nome_3_0= 'short' ) ) | ( (lv_nome_4_0= 'int' ) ) | ( (lv_nome_5_0= 'float' ) ) | ( (lv_nome_6_0= 'long' ) ) | ( (lv_nome_7_0= 'double' ) ) )
            int alt79=8;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt79=1;
                }
                break;
            case 98:
                {
                alt79=2;
                }
                break;
            case 99:
                {
                alt79=3;
                }
                break;
            case 100:
                {
                alt79=4;
                }
                break;
            case 101:
                {
                alt79=5;
                }
                break;
            case 102:
                {
                alt79=6;
                }
                break;
            case 103:
                {
                alt79=7;
                }
                break;
            case 104:
                {
                alt79=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4612:2: ( (lv_nome_0_0= 'boolean' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4612:2: ( (lv_nome_0_0= 'boolean' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4613:1: (lv_nome_0_0= 'boolean' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4613:1: (lv_nome_0_0= 'boolean' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4614:3: lv_nome_0_0= 'boolean'
                    {
                    lv_nome_0_0=(Token)match(input,97,FOLLOW_97_in_ruletype_specifier9803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nome_0_0, grammarAccess.getType_specifierAccess().getNomeBooleanKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getType_specifierRule());
                      	        }
                             		setWithLastConsumed(current, "nome", lv_nome_0_0, "boolean");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4628:6: ( (lv_nome_1_0= 'byte' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4628:6: ( (lv_nome_1_0= 'byte' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4629:1: (lv_nome_1_0= 'byte' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4629:1: (lv_nome_1_0= 'byte' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4630:3: lv_nome_1_0= 'byte'
                    {
                    lv_nome_1_0=(Token)match(input,98,FOLLOW_98_in_ruletype_specifier9840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nome_1_0, grammarAccess.getType_specifierAccess().getNomeByteKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getType_specifierRule());
                      	        }
                             		setWithLastConsumed(current, "nome", lv_nome_1_0, "byte");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4644:6: ( (lv_nome_2_0= 'char' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4644:6: ( (lv_nome_2_0= 'char' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4645:1: (lv_nome_2_0= 'char' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4645:1: (lv_nome_2_0= 'char' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4646:3: lv_nome_2_0= 'char'
                    {
                    lv_nome_2_0=(Token)match(input,99,FOLLOW_99_in_ruletype_specifier9877); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nome_2_0, grammarAccess.getType_specifierAccess().getNomeCharKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getType_specifierRule());
                      	        }
                             		setWithLastConsumed(current, "nome", lv_nome_2_0, "char");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4660:6: ( (lv_nome_3_0= 'short' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4660:6: ( (lv_nome_3_0= 'short' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4661:1: (lv_nome_3_0= 'short' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4661:1: (lv_nome_3_0= 'short' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4662:3: lv_nome_3_0= 'short'
                    {
                    lv_nome_3_0=(Token)match(input,100,FOLLOW_100_in_ruletype_specifier9914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nome_3_0, grammarAccess.getType_specifierAccess().getNomeShortKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getType_specifierRule());
                      	        }
                             		setWithLastConsumed(current, "nome", lv_nome_3_0, "short");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4676:6: ( (lv_nome_4_0= 'int' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4676:6: ( (lv_nome_4_0= 'int' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4677:1: (lv_nome_4_0= 'int' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4677:1: (lv_nome_4_0= 'int' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4678:3: lv_nome_4_0= 'int'
                    {
                    lv_nome_4_0=(Token)match(input,101,FOLLOW_101_in_ruletype_specifier9951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nome_4_0, grammarAccess.getType_specifierAccess().getNomeIntKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getType_specifierRule());
                      	        }
                             		setWithLastConsumed(current, "nome", lv_nome_4_0, "int");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4692:6: ( (lv_nome_5_0= 'float' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4692:6: ( (lv_nome_5_0= 'float' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4693:1: (lv_nome_5_0= 'float' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4693:1: (lv_nome_5_0= 'float' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4694:3: lv_nome_5_0= 'float'
                    {
                    lv_nome_5_0=(Token)match(input,102,FOLLOW_102_in_ruletype_specifier9988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nome_5_0, grammarAccess.getType_specifierAccess().getNomeFloatKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getType_specifierRule());
                      	        }
                             		setWithLastConsumed(current, "nome", lv_nome_5_0, "float");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4708:6: ( (lv_nome_6_0= 'long' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4708:6: ( (lv_nome_6_0= 'long' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4709:1: (lv_nome_6_0= 'long' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4709:1: (lv_nome_6_0= 'long' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4710:3: lv_nome_6_0= 'long'
                    {
                    lv_nome_6_0=(Token)match(input,103,FOLLOW_103_in_ruletype_specifier10025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nome_6_0, grammarAccess.getType_specifierAccess().getNomeLongKeyword_6_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getType_specifierRule());
                      	        }
                             		setWithLastConsumed(current, "nome", lv_nome_6_0, "long");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4724:6: ( (lv_nome_7_0= 'double' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4724:6: ( (lv_nome_7_0= 'double' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4725:1: (lv_nome_7_0= 'double' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4725:1: (lv_nome_7_0= 'double' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4726:3: lv_nome_7_0= 'double'
                    {
                    lv_nome_7_0=(Token)match(input,104,FOLLOW_104_in_ruletype_specifier10062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nome_7_0, grammarAccess.getType_specifierAccess().getNomeDoubleKeyword_7_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getType_specifierRule());
                      	        }
                             		setWithLastConsumed(current, "nome", lv_nome_7_0, "double");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_specifier"


    // $ANTLR start "entryRuletype"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4747:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4748:2: (iv_ruletype= ruletype EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4749:2: iv_ruletype= ruletype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruletype_in_entryRuletype10111);
            iv_ruletype=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype10121); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4756:1: ruletype returns [EObject current=null] : ( ( ( (lv_primitivo_0_0= ruletype_specifier ) ) | ( (lv_objeto_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )* ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_primitivo_0_0 = null;

        EObject lv_objeto_1_0 = null;


         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4759:28: ( ( ( ( (lv_primitivo_0_0= ruletype_specifier ) ) | ( (lv_objeto_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )* ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4760:1: ( ( ( (lv_primitivo_0_0= ruletype_specifier ) ) | ( (lv_objeto_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4760:1: ( ( ( (lv_primitivo_0_0= ruletype_specifier ) ) | ( (lv_objeto_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4760:2: ( ( (lv_primitivo_0_0= ruletype_specifier ) ) | ( (lv_objeto_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )*
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4760:2: ( ( (lv_primitivo_0_0= ruletype_specifier ) ) | ( (lv_objeto_1_0= rulename ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=97 && LA80_0<=104)) ) {
                alt80=1;
            }
            else if ( (LA80_0==RULE_IDENTIFIER) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4760:3: ( (lv_primitivo_0_0= ruletype_specifier ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4760:3: ( (lv_primitivo_0_0= ruletype_specifier ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4761:1: (lv_primitivo_0_0= ruletype_specifier )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4761:1: (lv_primitivo_0_0= ruletype_specifier )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4762:3: lv_primitivo_0_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getPrimitivoType_specifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_ruletype10168);
                    lv_primitivo_0_0=ruletype_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"primitivo",
                              		lv_primitivo_0_0, 
                              		"type_specifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4779:6: ( (lv_objeto_1_0= rulename ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4779:6: ( (lv_objeto_1_0= rulename ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4780:1: (lv_objeto_1_0= rulename )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4780:1: (lv_objeto_1_0= rulename )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4781:3: lv_objeto_1_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getObjetoNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_ruletype10195);
                    lv_objeto_1_0=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"objeto",
                              		lv_objeto_1_0, 
                              		"name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4797:3: (otherlv_2= '[' otherlv_3= ']' )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==32) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4797:5: otherlv_2= '[' otherlv_3= ']'
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruletype10209); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruletype10221); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRuleMODIFIER"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4813:1: entryRuleMODIFIER returns [EObject current=null] : iv_ruleMODIFIER= ruleMODIFIER EOF ;
    public final EObject entryRuleMODIFIER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODIFIER = null;


        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4814:2: (iv_ruleMODIFIER= ruleMODIFIER EOF )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4815:2: iv_ruleMODIFIER= ruleMODIFIER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMODIFIERRule()); 
            }
            pushFollow(FOLLOW_ruleMODIFIER_in_entryRuleMODIFIER10259);
            iv_ruleMODIFIER=ruleMODIFIER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMODIFIER; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODIFIER10269); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMODIFIER"


    // $ANTLR start "ruleMODIFIER"
    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4822:1: ruleMODIFIER returns [EObject current=null] : ( ( (lv_modificador_0_0= 'public' ) ) | ( (lv_modificador_1_0= 'private' ) ) | ( (lv_modificador_2_0= 'protected' ) ) | ( (lv_modificador_3_0= 'static' ) ) | ( (lv_modificador_4_0= 'final' ) ) | ( (lv_modificador_5_0= 'native' ) ) | ( (lv_modificador_6_0= 'synchronized' ) ) | ( (lv_modificador_7_0= 'abstract' ) ) | ( (lv_modificador_8_0= 'threadsafe' ) ) | ( (lv_modificador_9_0= 'transient' ) ) ) ;
    public final EObject ruleMODIFIER() throws RecognitionException {
        EObject current = null;

        Token lv_modificador_0_0=null;
        Token lv_modificador_1_0=null;
        Token lv_modificador_2_0=null;
        Token lv_modificador_3_0=null;
        Token lv_modificador_4_0=null;
        Token lv_modificador_5_0=null;
        Token lv_modificador_6_0=null;
        Token lv_modificador_7_0=null;
        Token lv_modificador_8_0=null;
        Token lv_modificador_9_0=null;

         enterRule(); 
            
        try {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4825:28: ( ( ( (lv_modificador_0_0= 'public' ) ) | ( (lv_modificador_1_0= 'private' ) ) | ( (lv_modificador_2_0= 'protected' ) ) | ( (lv_modificador_3_0= 'static' ) ) | ( (lv_modificador_4_0= 'final' ) ) | ( (lv_modificador_5_0= 'native' ) ) | ( (lv_modificador_6_0= 'synchronized' ) ) | ( (lv_modificador_7_0= 'abstract' ) ) | ( (lv_modificador_8_0= 'threadsafe' ) ) | ( (lv_modificador_9_0= 'transient' ) ) ) )
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4826:1: ( ( (lv_modificador_0_0= 'public' ) ) | ( (lv_modificador_1_0= 'private' ) ) | ( (lv_modificador_2_0= 'protected' ) ) | ( (lv_modificador_3_0= 'static' ) ) | ( (lv_modificador_4_0= 'final' ) ) | ( (lv_modificador_5_0= 'native' ) ) | ( (lv_modificador_6_0= 'synchronized' ) ) | ( (lv_modificador_7_0= 'abstract' ) ) | ( (lv_modificador_8_0= 'threadsafe' ) ) | ( (lv_modificador_9_0= 'transient' ) ) )
            {
            // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4826:1: ( ( (lv_modificador_0_0= 'public' ) ) | ( (lv_modificador_1_0= 'private' ) ) | ( (lv_modificador_2_0= 'protected' ) ) | ( (lv_modificador_3_0= 'static' ) ) | ( (lv_modificador_4_0= 'final' ) ) | ( (lv_modificador_5_0= 'native' ) ) | ( (lv_modificador_6_0= 'synchronized' ) ) | ( (lv_modificador_7_0= 'abstract' ) ) | ( (lv_modificador_8_0= 'threadsafe' ) ) | ( (lv_modificador_9_0= 'transient' ) ) )
            int alt82=10;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt82=1;
                }
                break;
            case 106:
                {
                alt82=2;
                }
                break;
            case 107:
                {
                alt82=3;
                }
                break;
            case 53:
                {
                alt82=4;
                }
                break;
            case 108:
                {
                alt82=5;
                }
                break;
            case 109:
                {
                alt82=6;
                }
                break;
            case 34:
                {
                alt82=7;
                }
                break;
            case 110:
                {
                alt82=8;
                }
                break;
            case 111:
                {
                alt82=9;
                }
                break;
            case 112:
                {
                alt82=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4826:2: ( (lv_modificador_0_0= 'public' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4826:2: ( (lv_modificador_0_0= 'public' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4827:1: (lv_modificador_0_0= 'public' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4827:1: (lv_modificador_0_0= 'public' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4828:3: lv_modificador_0_0= 'public'
                    {
                    lv_modificador_0_0=(Token)match(input,105,FOLLOW_105_in_ruleMODIFIER10312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_modificador_0_0, grammarAccess.getMODIFIERAccess().getModificadorPublicKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMODIFIERRule());
                      	        }
                             		setWithLastConsumed(current, "modificador", lv_modificador_0_0, "public");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4842:6: ( (lv_modificador_1_0= 'private' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4842:6: ( (lv_modificador_1_0= 'private' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4843:1: (lv_modificador_1_0= 'private' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4843:1: (lv_modificador_1_0= 'private' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4844:3: lv_modificador_1_0= 'private'
                    {
                    lv_modificador_1_0=(Token)match(input,106,FOLLOW_106_in_ruleMODIFIER10349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_modificador_1_0, grammarAccess.getMODIFIERAccess().getModificadorPrivateKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMODIFIERRule());
                      	        }
                             		setWithLastConsumed(current, "modificador", lv_modificador_1_0, "private");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4858:6: ( (lv_modificador_2_0= 'protected' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4858:6: ( (lv_modificador_2_0= 'protected' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4859:1: (lv_modificador_2_0= 'protected' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4859:1: (lv_modificador_2_0= 'protected' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4860:3: lv_modificador_2_0= 'protected'
                    {
                    lv_modificador_2_0=(Token)match(input,107,FOLLOW_107_in_ruleMODIFIER10386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_modificador_2_0, grammarAccess.getMODIFIERAccess().getModificadorProtectedKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMODIFIERRule());
                      	        }
                             		setWithLastConsumed(current, "modificador", lv_modificador_2_0, "protected");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4874:6: ( (lv_modificador_3_0= 'static' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4874:6: ( (lv_modificador_3_0= 'static' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4875:1: (lv_modificador_3_0= 'static' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4875:1: (lv_modificador_3_0= 'static' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4876:3: lv_modificador_3_0= 'static'
                    {
                    lv_modificador_3_0=(Token)match(input,53,FOLLOW_53_in_ruleMODIFIER10423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_modificador_3_0, grammarAccess.getMODIFIERAccess().getModificadorStaticKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMODIFIERRule());
                      	        }
                             		setWithLastConsumed(current, "modificador", lv_modificador_3_0, "static");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4890:6: ( (lv_modificador_4_0= 'final' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4890:6: ( (lv_modificador_4_0= 'final' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4891:1: (lv_modificador_4_0= 'final' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4891:1: (lv_modificador_4_0= 'final' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4892:3: lv_modificador_4_0= 'final'
                    {
                    lv_modificador_4_0=(Token)match(input,108,FOLLOW_108_in_ruleMODIFIER10460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_modificador_4_0, grammarAccess.getMODIFIERAccess().getModificadorFinalKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMODIFIERRule());
                      	        }
                             		setWithLastConsumed(current, "modificador", lv_modificador_4_0, "final");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4906:6: ( (lv_modificador_5_0= 'native' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4906:6: ( (lv_modificador_5_0= 'native' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4907:1: (lv_modificador_5_0= 'native' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4907:1: (lv_modificador_5_0= 'native' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4908:3: lv_modificador_5_0= 'native'
                    {
                    lv_modificador_5_0=(Token)match(input,109,FOLLOW_109_in_ruleMODIFIER10497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_modificador_5_0, grammarAccess.getMODIFIERAccess().getModificadorNativeKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMODIFIERRule());
                      	        }
                             		setWithLastConsumed(current, "modificador", lv_modificador_5_0, "native");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4922:6: ( (lv_modificador_6_0= 'synchronized' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4922:6: ( (lv_modificador_6_0= 'synchronized' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4923:1: (lv_modificador_6_0= 'synchronized' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4923:1: (lv_modificador_6_0= 'synchronized' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4924:3: lv_modificador_6_0= 'synchronized'
                    {
                    lv_modificador_6_0=(Token)match(input,34,FOLLOW_34_in_ruleMODIFIER10534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_modificador_6_0, grammarAccess.getMODIFIERAccess().getModificadorSynchronizedKeyword_6_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMODIFIERRule());
                      	        }
                             		setWithLastConsumed(current, "modificador", lv_modificador_6_0, "synchronized");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4938:6: ( (lv_modificador_7_0= 'abstract' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4938:6: ( (lv_modificador_7_0= 'abstract' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4939:1: (lv_modificador_7_0= 'abstract' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4939:1: (lv_modificador_7_0= 'abstract' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4940:3: lv_modificador_7_0= 'abstract'
                    {
                    lv_modificador_7_0=(Token)match(input,110,FOLLOW_110_in_ruleMODIFIER10571); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_modificador_7_0, grammarAccess.getMODIFIERAccess().getModificadorAbstractKeyword_7_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMODIFIERRule());
                      	        }
                             		setWithLastConsumed(current, "modificador", lv_modificador_7_0, "abstract");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4954:6: ( (lv_modificador_8_0= 'threadsafe' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4954:6: ( (lv_modificador_8_0= 'threadsafe' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4955:1: (lv_modificador_8_0= 'threadsafe' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4955:1: (lv_modificador_8_0= 'threadsafe' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4956:3: lv_modificador_8_0= 'threadsafe'
                    {
                    lv_modificador_8_0=(Token)match(input,111,FOLLOW_111_in_ruleMODIFIER10608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_modificador_8_0, grammarAccess.getMODIFIERAccess().getModificadorThreadsafeKeyword_8_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMODIFIERRule());
                      	        }
                             		setWithLastConsumed(current, "modificador", lv_modificador_8_0, "threadsafe");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4970:6: ( (lv_modificador_9_0= 'transient' ) )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4970:6: ( (lv_modificador_9_0= 'transient' ) )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4971:1: (lv_modificador_9_0= 'transient' )
                    {
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4971:1: (lv_modificador_9_0= 'transient' )
                    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4972:3: lv_modificador_9_0= 'transient'
                    {
                    lv_modificador_9_0=(Token)match(input,112,FOLLOW_112_in_ruleMODIFIER10645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_modificador_9_0, grammarAccess.getMODIFIERAccess().getModificadorTransientKeyword_9_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMODIFIERRule());
                      	        }
                             		setWithLastConsumed(current, "modificador", lv_modificador_9_0, "transient");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMODIFIER"

    // $ANTLR start synpred18_InternalSimpleJava
    public final void synpred18_InternalSimpleJava_fragment() throws RecognitionException {   
        EObject lv_declaracaoMetodo_1_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:731:4: ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:731:4: ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:731:4: ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:732:1: (lv_declaracaoMetodo_1_0= rulemethod_declaration )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:732:1: (lv_declaracaoMetodo_1_0= rulemethod_declaration )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:733:3: lv_declaracaoMetodo_1_0= rulemethod_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoMetodoMethod_declarationParserRuleCall_0_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulemethod_declaration_in_synpred18_InternalSimpleJava1463);
        lv_declaracaoMetodo_1_0=rulemethod_declaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalSimpleJava

    // $ANTLR start synpred19_InternalSimpleJava
    public final void synpred19_InternalSimpleJava_fragment() throws RecognitionException {   
        EObject lv_declaracaoConstrutor_2_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:750:6: ( ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:750:6: ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:750:6: ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:751:1: (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:751:1: (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:752:3: lv_declaracaoConstrutor_2_0= ruleconstructor_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoConstrutorConstructor_declarationParserRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleconstructor_declaration_in_synpred19_InternalSimpleJava1490);
        lv_declaracaoConstrutor_2_0=ruleconstructor_declaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalSimpleJava

    // $ANTLR start synpred39_InternalSimpleJava
    public final void synpred39_InternalSimpleJava_fragment() throws RecognitionException {   
        EObject lv_declaracaoVariavel_0_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1137:2: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1137:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1137:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1137:3: ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1148:1: (lv_declaracaoVariavel_0_0= rulevariable_declaration )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1149:3: lv_declaracaoVariavel_0_0= rulevariable_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulevariable_declaration_in_synpred39_InternalSimpleJava2362);
        lv_declaracaoVariavel_0_0=rulevariable_declaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred39_InternalSimpleJava

    // $ANTLR start synpred57_InternalSimpleJava
    public final void synpred57_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_expressao_1_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1166:6: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1166:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1166:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1166:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';'
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1166:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1166:8: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1179:1: (lv_expressao_1_0= ruleexpression )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1180:3: lv_expressao_1_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getExpressaoExpressionParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred57_InternalSimpleJava2499);
        lv_expressao_1_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,18,FOLLOW_18_in_synpred57_InternalSimpleJava2511); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred57_InternalSimpleJava

    // $ANTLR start synpred65_InternalSimpleJava
    public final void synpred65_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_expressaoSynchronized_12_0 = null;

        EObject lv_corpoSynchronize_14_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1334:6: ( (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1334:6: (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1334:6: (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1334:8: otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) )
        {
        otherlv_10=(Token)match(input,34,FOLLOW_34_in_synpred65_InternalSimpleJava2720); if (state.failed) return ;
        otherlv_11=(Token)match(input,30,FOLLOW_30_in_synpred65_InternalSimpleJava2732); if (state.failed) return ;
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1342:1: ( (lv_expressaoSynchronized_12_0= ruleexpression ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1343:1: (lv_expressaoSynchronized_12_0= ruleexpression )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1343:1: (lv_expressaoSynchronized_12_0= ruleexpression )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1344:3: lv_expressaoSynchronized_12_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getExpressaoSynchronizedExpressionParserRuleCall_9_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred65_InternalSimpleJava2753);
        lv_expressaoSynchronized_12_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_13=(Token)match(input,31,FOLLOW_31_in_synpred65_InternalSimpleJava2765); if (state.failed) return ;
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1364:1: ( (lv_corpoSynchronize_14_0= rulestatement ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1365:1: (lv_corpoSynchronize_14_0= rulestatement )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1365:1: (lv_corpoSynchronize_14_0= rulestatement )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1366:3: lv_corpoSynchronize_14_0= rulestatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoSynchronizeStatementParserRuleCall_9_4_0()); 
          	    
        }
        pushFollow(FOLLOW_rulestatement_in_synpred65_InternalSimpleJava2786);
        lv_corpoSynchronize_14_0=rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred65_InternalSimpleJava

    // $ANTLR start synpred69_InternalSimpleJava
    public final void synpred69_InternalSimpleJava_fragment() throws RecognitionException {   
        Token this_IDENTIFIER_21=null;
        Token otherlv_22=null;
        EObject this_statement_23 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1437:6: ( (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1437:6: (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1437:6: (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1437:7: this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement
        {
        this_IDENTIFIER_21=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_synpred69_InternalSimpleJava2912); if (state.failed) return ;
        otherlv_22=(Token)match(input,37,FOLLOW_37_in_synpred69_InternalSimpleJava2923); if (state.failed) return ;
        pushFollow(FOLLOW_rulestatement_in_synpred69_InternalSimpleJava2948);
        this_statement_23=rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred69_InternalSimpleJava

    // $ANTLR start synpred87_InternalSimpleJava
    public final void synpred87_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1903:3: ( ( 'else' ( ( rulestatement ) ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1903:4: ( 'else' ( ( rulestatement ) ) )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1903:4: ( 'else' ( ( rulestatement ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1903:6: 'else' ( ( rulestatement ) )
        {
        match(input,43,FOLLOW_43_in_synpred87_InternalSimpleJava3906); if (state.failed) return ;
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1904:1: ( ( rulestatement ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1905:1: ( rulestatement )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1905:1: ( rulestatement )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:1906:1: rulestatement
        {
        pushFollow(FOLLOW_rulestatement_in_synpred87_InternalSimpleJava3913);
        rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred87_InternalSimpleJava

    // $ANTLR start synpred89_InternalSimpleJava
    public final void synpred89_InternalSimpleJava_fragment() throws RecognitionException {   
        EObject lv_declaracaoVariavel_2_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2105:2: ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2105:2: ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2105:2: ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2105:3: ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2110:1: (lv_declaracaoVariavel_2_0= rulevariable_declaration )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2111:3: lv_declaracaoVariavel_2_0= rulevariable_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFor_statementAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulevariable_declaration_in_synpred89_InternalSimpleJava4398);
        lv_declaracaoVariavel_2_0=rulevariable_declaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred89_InternalSimpleJava

    // $ANTLR start synpred90_InternalSimpleJava
    public final void synpred90_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_expressaoDeclaracao_3_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2128:6: ( ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2128:6: ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2128:6: ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2128:7: ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';'
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2128:7: ( (lv_expressaoDeclaracao_3_0= ruleexpression ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2129:1: (lv_expressaoDeclaracao_3_0= ruleexpression )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2129:1: (lv_expressaoDeclaracao_3_0= ruleexpression )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2130:3: lv_expressaoDeclaracao_3_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressaoDeclaracaoExpressionParserRuleCall_2_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred90_InternalSimpleJava4426);
        lv_expressaoDeclaracao_3_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,18,FOLLOW_18_in_synpred90_InternalSimpleJava4438); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred90_InternalSimpleJava

    // $ANTLR start synpred93_InternalSimpleJava
    public final void synpred93_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2260:3: ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2260:4: ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2260:4: ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2260:6: 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) )
        {
        match(input,48,FOLLOW_48_in_synpred93_InternalSimpleJava4664); if (state.failed) return ;
        match(input,30,FOLLOW_30_in_synpred93_InternalSimpleJava4668); if (state.failed) return ;
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2262:1: ( ( ruleparameter ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2263:1: ( ruleparameter )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2263:1: ( ruleparameter )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2264:1: ruleparameter
        {
        pushFollow(FOLLOW_ruleparameter_in_synpred93_InternalSimpleJava4675);
        ruleparameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,31,FOLLOW_31_in_synpred93_InternalSimpleJava4681); if (state.failed) return ;
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2267:1: ( ( rulestatement_block ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2268:1: ( rulestatement_block )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2268:1: ( rulestatement_block )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2269:1: rulestatement_block
        {
        pushFollow(FOLLOW_rulestatement_block_in_synpred93_InternalSimpleJava4688);
        rulestatement_block();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred93_InternalSimpleJava

    // $ANTLR start synpred94_InternalSimpleJava
    public final void synpred94_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2319:6: ( ( 'finally' ( ( rulestatement_block ) ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2319:7: ( 'finally' ( ( rulestatement_block ) ) )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2319:7: ( 'finally' ( ( rulestatement_block ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2319:9: 'finally' ( ( rulestatement_block ) )
        {
        match(input,49,FOLLOW_49_in_synpred94_InternalSimpleJava4782); if (state.failed) return ;
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2320:1: ( ( rulestatement_block ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2321:1: ( rulestatement_block )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2321:1: ( rulestatement_block )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2322:1: rulestatement_block
        {
        pushFollow(FOLLOW_rulestatement_block_in_synpred94_InternalSimpleJava4789);
        rulestatement_block();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred94_InternalSimpleJava

    // $ANTLR start synpred101_InternalSimpleJava
    public final void synpred101_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2683:3: ( '[' )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2683:5: '['
        {
        match(input,32,FOLLOW_32_in_synpred101_InternalSimpleJava5540); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_InternalSimpleJava

    // $ANTLR start synpred104_InternalSimpleJava
    public final void synpred104_InternalSimpleJava_fragment() throws RecognitionException {   
        EObject lv_novo_10_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2738:1: ( (lv_novo_10_0= rulenewBlock ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2738:1: (lv_novo_10_0= rulenewBlock )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2738:1: (lv_novo_10_0= rulenewBlock )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2739:3: lv_novo_10_0= rulenewBlock
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getNovoNewBlockParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_rulenewBlock_in_synpred104_InternalSimpleJava5662);
        lv_novo_10_0=rulenewBlock();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred104_InternalSimpleJava

    // $ANTLR start synpred122_InternalSimpleJava
    public final void synpred122_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_expressao_0_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2776:2: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2776:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2776:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2776:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')'
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2776:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2776:4: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2789:1: (lv_expressao_0_0= ruleexpression )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:2790:3: lv_expressao_0_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExp_auxAccess().getExpressaoExpressionParserRuleCall_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred122_InternalSimpleJava5865);
        lv_expressao_0_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_1=(Token)match(input,31,FOLLOW_31_in_synpred122_InternalSimpleJava5877); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred122_InternalSimpleJava

    // $ANTLR start synpred141_InternalSimpleJava
    public final void synpred141_InternalSimpleJava_fragment() throws RecognitionException {   
        EObject lv_op_10_0 = null;

        EObject lv_exp_11_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:6: ( ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:6: ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:6: ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:7: ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:7: ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:8: ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3150:1: (lv_op_10_0= rulemais_aux )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3151:3: lv_op_10_0= rulemais_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getOpMais_auxParserRuleCall_0_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulemais_aux_in_synpred141_InternalSimpleJava6622);
        lv_op_10_0=rulemais_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3167:2: ( (lv_exp_11_0= ruleexpression ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3168:1: (lv_exp_11_0= ruleexpression )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3168:1: (lv_exp_11_0= ruleexpression )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3169:3: lv_exp_11_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred141_InternalSimpleJava6643);
        lv_exp_11_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred141_InternalSimpleJava

    // $ANTLR start synpred154_InternalSimpleJava
    public final void synpred154_InternalSimpleJava_fragment() throws RecognitionException {   
        Token lv_operador_14_0=null;
        Token lv_operador_15_0=null;
        Token lv_operador_16_0=null;
        Token lv_operador_17_0=null;
        Token lv_operador_18_0=null;
        Token lv_operador_19_0=null;
        Token lv_operador_20_0=null;
        Token lv_operador_21_0=null;
        EObject lv_op_13_0 = null;

        EObject lv_exp_22_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:6: ( ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:6: ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:6: ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) )
        int alt99=9;
        alt99 = dfa99.predict(input);
        switch (alt99) {
            case 1 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:8: ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:8: ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:9: ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3220:1: (lv_op_13_0= rulemais_aux )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3221:3: lv_op_13_0= rulemais_aux
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getOpMais_auxParserRuleCall_0_3_0_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_rulemais_aux_in_synpred154_InternalSimpleJava6758);
                lv_op_13_0=rulemais_aux();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3238:6: ( (lv_operador_14_0= '-' ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3238:6: ( (lv_operador_14_0= '-' ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3239:1: (lv_operador_14_0= '-' )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3239:1: (lv_operador_14_0= '-' )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3240:3: lv_operador_14_0= '-'
                {
                lv_operador_14_0=(Token)match(input,62,FOLLOW_62_in_synpred154_InternalSimpleJava6782); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3254:6: ( (lv_operador_15_0= '-=' ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3254:6: ( (lv_operador_15_0= '-=' ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3255:1: (lv_operador_15_0= '-=' )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3255:1: (lv_operador_15_0= '-=' )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3256:3: lv_operador_15_0= '-='
                {
                lv_operador_15_0=(Token)match(input,63,FOLLOW_63_in_synpred154_InternalSimpleJava6819); if (state.failed) return ;

                }


                }


                }
                break;
            case 4 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3270:6: ( (lv_operador_16_0= '*' ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3270:6: ( (lv_operador_16_0= '*' ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3271:1: (lv_operador_16_0= '*' )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3271:1: (lv_operador_16_0= '*' )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3272:3: lv_operador_16_0= '*'
                {
                lv_operador_16_0=(Token)match(input,64,FOLLOW_64_in_synpred154_InternalSimpleJava6856); if (state.failed) return ;

                }


                }


                }
                break;
            case 5 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3286:6: ( (lv_operador_17_0= '*=' ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3286:6: ( (lv_operador_17_0= '*=' ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3287:1: (lv_operador_17_0= '*=' )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3287:1: (lv_operador_17_0= '*=' )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3288:3: lv_operador_17_0= '*='
                {
                lv_operador_17_0=(Token)match(input,65,FOLLOW_65_in_synpred154_InternalSimpleJava6893); if (state.failed) return ;

                }


                }


                }
                break;
            case 6 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3302:6: ( (lv_operador_18_0= '/' ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3302:6: ( (lv_operador_18_0= '/' ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3303:1: (lv_operador_18_0= '/' )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3303:1: (lv_operador_18_0= '/' )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3304:3: lv_operador_18_0= '/'
                {
                lv_operador_18_0=(Token)match(input,66,FOLLOW_66_in_synpred154_InternalSimpleJava6930); if (state.failed) return ;

                }


                }


                }
                break;
            case 7 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3318:6: ( (lv_operador_19_0= '/=' ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3318:6: ( (lv_operador_19_0= '/=' ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3319:1: (lv_operador_19_0= '/=' )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3319:1: (lv_operador_19_0= '/=' )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3320:3: lv_operador_19_0= '/='
                {
                lv_operador_19_0=(Token)match(input,67,FOLLOW_67_in_synpred154_InternalSimpleJava6967); if (state.failed) return ;

                }


                }


                }
                break;
            case 8 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3334:6: ( (lv_operador_20_0= '%' ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3334:6: ( (lv_operador_20_0= '%' ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3335:1: (lv_operador_20_0= '%' )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3335:1: (lv_operador_20_0= '%' )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3336:3: lv_operador_20_0= '%'
                {
                lv_operador_20_0=(Token)match(input,68,FOLLOW_68_in_synpred154_InternalSimpleJava7004); if (state.failed) return ;

                }


                }


                }
                break;
            case 9 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3350:6: ( (lv_operador_21_0= '%=' ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3350:6: ( (lv_operador_21_0= '%=' ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3351:1: (lv_operador_21_0= '%=' )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3351:1: (lv_operador_21_0= '%=' )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3352:3: lv_operador_21_0= '%='
                {
                lv_operador_21_0=(Token)match(input,69,FOLLOW_69_in_synpred154_InternalSimpleJava7041); if (state.failed) return ;

                }


                }


                }
                break;

        }

        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3365:3: ( (lv_exp_22_0= ruleexpression ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3366:1: (lv_exp_22_0= ruleexpression )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3366:1: (lv_exp_22_0= ruleexpression )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3367:3: lv_exp_22_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred154_InternalSimpleJava7076);
        lv_exp_22_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred154_InternalSimpleJava

    // $ANTLR start synpred176_InternalSimpleJava
    public final void synpred176_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_operador_12_1=null;
        Token lv_operador_12_2=null;
        Token lv_operador_14_0=null;
        Token lv_operador_15_0=null;
        Token lv_operador_16_0=null;
        Token lv_operador_17_0=null;
        Token lv_operador_18_0=null;
        Token lv_operador_19_0=null;
        Token lv_operador_20_0=null;
        Token lv_operador_21_0=null;
        Token lv_operador_23_1=null;
        Token lv_operador_23_2=null;
        Token lv_operador_23_3=null;
        Token lv_operador_23_4=null;
        Token lv_operador_23_5=null;
        Token lv_operador_23_6=null;
        Token lv_operador_23_7=null;
        Token lv_operador_23_8=null;
        Token lv_operador_23_9=null;
        Token lv_operador_23_10=null;
        Token lv_operador_23_11=null;
        Token lv_operador_25_0=null;
        Token lv_operador_27_0=null;
        Token lv_operador_29_1=null;
        Token lv_operador_29_2=null;
        Token lv_operador_29_3=null;
        Token lv_operador_29_4=null;
        Token lv_operador_29_5=null;
        Token lv_operador_29_6=null;
        Token lv_operador_31_1=null;
        Token lv_operador_31_2=null;
        Token lv_operador_31_3=null;
        Token lv_operador_31_4=null;
        EObject lv_parametros_1_0 = null;

        EObject this_aux_3 = null;

        EObject lv_exp_5_0 = null;

        EObject this_expression_7 = null;

        EObject this_name_9 = null;

        EObject lv_op_10_0 = null;

        EObject lv_exp_11_0 = null;

        EObject lv_op_13_0 = null;

        EObject lv_exp_22_0 = null;

        EObject lv_exp_24_0 = null;

        EObject lv_exp_26_0 = null;

        EObject lv_exp_28_0 = null;

        EObject lv_exp_30_0 = null;

        EObject lv_exp_32_0 = null;

        EObject lv_expressoes_33_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:2: ( ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:2: ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:2: ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) )
        int alt110=5;
        alt110 = dfa110.predict(input);
        switch (alt110) {
            case 1 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:3: ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:3: ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                int alt103=5;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt103=1;
                    }
                    break;
                case 32:
                    {
                    alt103=2;
                    }
                    break;
                case 58:
                    {
                    alt103=3;
                    }
                    break;
                case 26:
                    {
                    alt103=4;
                    }
                    break;
                case 59:
                    {
                    alt103=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 0, input);

                    throw nvae;
                }

                switch (alt103) {
                    case 1 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:4: (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:4: (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3050:6: otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')'
                        {
                        otherlv_0=(Token)match(input,30,FOLLOW_30_in_synpred176_InternalSimpleJava6378); if (state.failed) return ;
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3054:1: ( (lv_parametros_1_0= rulearglist ) )?
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( ((LA102_0>=RULE_STRING && LA102_0<=RULE_FLOAT_LITERAL)||LA102_0==30||(LA102_0>=54 && LA102_0<=57)||(LA102_0>=60 && LA102_0<=62)||(LA102_0>=92 && LA102_0<=104)) ) {
                            alt102=1;
                        }
                        switch (alt102) {
                            case 1 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3055:1: (lv_parametros_1_0= rulearglist )
                                {
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3055:1: (lv_parametros_1_0= rulearglist )
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3056:3: lv_parametros_1_0= rulearglist
                                {
                                if ( state.backtracking==0 ) {
                                   
                                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getParametrosArglistParserRuleCall_0_0_0_1_0()); 
                                  	    
                                }
                                pushFollow(FOLLOW_rulearglist_in_synpred176_InternalSimpleJava6399);
                                lv_parametros_1_0=rulearglist();

                                state._fsp--;
                                if (state.failed) return ;

                                }


                                }
                                break;

                        }

                        otherlv_2=(Token)match(input,31,FOLLOW_31_in_synpred176_InternalSimpleJava6412); if (state.failed) return ;

                        }


                        }
                        break;
                    case 2 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3078:2: this_aux_3= ruleaux
                        {
                        pushFollow(FOLLOW_ruleaux_in_synpred176_InternalSimpleJava6444);
                        this_aux_3=ruleaux();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3090:6: (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3090:6: (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3090:8: otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) )
                        {
                        otherlv_4=(Token)match(input,58,FOLLOW_58_in_synpred176_InternalSimpleJava6462); if (state.failed) return ;
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3094:1: ( (lv_exp_5_0= ruleexpression ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3095:1: (lv_exp_5_0= ruleexpression )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3095:1: (lv_exp_5_0= ruleexpression )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3096:3: lv_exp_5_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_0_2_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava6483);
                        lv_exp_5_0=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }


                        }
                        break;
                    case 4 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3113:6: (otherlv_6= ',' this_expression_7= ruleexpression )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3113:6: (otherlv_6= ',' this_expression_7= ruleexpression )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3113:8: otherlv_6= ',' this_expression_7= ruleexpression
                        {
                        otherlv_6=(Token)match(input,26,FOLLOW_26_in_synpred176_InternalSimpleJava6503); if (state.failed) return ;
                        pushFollow(FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava6528);
                        this_expression_7=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;
                    case 5 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3130:6: (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3130:6: (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3130:8: otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                        {
                        otherlv_8=(Token)match(input,59,FOLLOW_59_in_synpred176_InternalSimpleJava6547); if (state.failed) return ;
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3134:1: ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3134:2: ( RULE_IDENTIFIER )=>this_name_9= rulename
                        {
                        pushFollow(FOLLOW_rulename_in_synpred176_InternalSimpleJava6578);
                        this_name_9=rulename();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }
                        break;

                }


                }
                break;
            case 2 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:6: ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:6: ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:7: ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:7: ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3147:8: ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3150:1: (lv_op_10_0= rulemais_aux )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3151:3: lv_op_10_0= rulemais_aux
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getOpMais_auxParserRuleCall_0_1_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_rulemais_aux_in_synpred176_InternalSimpleJava6622);
                lv_op_10_0=rulemais_aux();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3167:2: ( (lv_exp_11_0= ruleexpression ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3168:1: (lv_exp_11_0= ruleexpression )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3168:1: (lv_exp_11_0= ruleexpression )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3169:3: lv_exp_11_0= ruleexpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_1_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava6643);
                lv_exp_11_0=ruleexpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }


                }
                break;
            case 3 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3186:6: ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3186:6: ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3187:1: ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3187:1: ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3188:1: (lv_operador_12_1= '++' | lv_operador_12_2= '--' )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3188:1: (lv_operador_12_1= '++' | lv_operador_12_2= '--' )
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==60) ) {
                    alt104=1;
                }
                else if ( (LA104_0==61) ) {
                    alt104=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 0, input);

                    throw nvae;
                }
                switch (alt104) {
                    case 1 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3189:3: lv_operador_12_1= '++'
                        {
                        lv_operador_12_1=(Token)match(input,60,FOLLOW_60_in_synpred176_InternalSimpleJava6670); if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3201:8: lv_operador_12_2= '--'
                        {
                        lv_operador_12_2=(Token)match(input,61,FOLLOW_61_in_synpred176_InternalSimpleJava6699); if (state.failed) return ;

                        }
                        break;

                }


                }


                }


                }
                break;
            case 4 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:6: ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:6: ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) )
                int alt105=9;
                alt105 = dfa105.predict(input);
                switch (alt105) {
                    case 1 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:8: ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:8: ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3217:9: ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3220:1: (lv_op_13_0= rulemais_aux )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3221:3: lv_op_13_0= rulemais_aux
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getOpMais_auxParserRuleCall_0_3_0_0_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_rulemais_aux_in_synpred176_InternalSimpleJava6758);
                        lv_op_13_0=rulemais_aux();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 2 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3238:6: ( (lv_operador_14_0= '-' ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3238:6: ( (lv_operador_14_0= '-' ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3239:1: (lv_operador_14_0= '-' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3239:1: (lv_operador_14_0= '-' )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3240:3: lv_operador_14_0= '-'
                        {
                        lv_operador_14_0=(Token)match(input,62,FOLLOW_62_in_synpred176_InternalSimpleJava6782); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 3 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3254:6: ( (lv_operador_15_0= '-=' ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3254:6: ( (lv_operador_15_0= '-=' ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3255:1: (lv_operador_15_0= '-=' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3255:1: (lv_operador_15_0= '-=' )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3256:3: lv_operador_15_0= '-='
                        {
                        lv_operador_15_0=(Token)match(input,63,FOLLOW_63_in_synpred176_InternalSimpleJava6819); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 4 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3270:6: ( (lv_operador_16_0= '*' ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3270:6: ( (lv_operador_16_0= '*' ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3271:1: (lv_operador_16_0= '*' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3271:1: (lv_operador_16_0= '*' )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3272:3: lv_operador_16_0= '*'
                        {
                        lv_operador_16_0=(Token)match(input,64,FOLLOW_64_in_synpred176_InternalSimpleJava6856); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 5 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3286:6: ( (lv_operador_17_0= '*=' ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3286:6: ( (lv_operador_17_0= '*=' ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3287:1: (lv_operador_17_0= '*=' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3287:1: (lv_operador_17_0= '*=' )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3288:3: lv_operador_17_0= '*='
                        {
                        lv_operador_17_0=(Token)match(input,65,FOLLOW_65_in_synpred176_InternalSimpleJava6893); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 6 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3302:6: ( (lv_operador_18_0= '/' ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3302:6: ( (lv_operador_18_0= '/' ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3303:1: (lv_operador_18_0= '/' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3303:1: (lv_operador_18_0= '/' )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3304:3: lv_operador_18_0= '/'
                        {
                        lv_operador_18_0=(Token)match(input,66,FOLLOW_66_in_synpred176_InternalSimpleJava6930); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 7 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3318:6: ( (lv_operador_19_0= '/=' ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3318:6: ( (lv_operador_19_0= '/=' ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3319:1: (lv_operador_19_0= '/=' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3319:1: (lv_operador_19_0= '/=' )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3320:3: lv_operador_19_0= '/='
                        {
                        lv_operador_19_0=(Token)match(input,67,FOLLOW_67_in_synpred176_InternalSimpleJava6967); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 8 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3334:6: ( (lv_operador_20_0= '%' ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3334:6: ( (lv_operador_20_0= '%' ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3335:1: (lv_operador_20_0= '%' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3335:1: (lv_operador_20_0= '%' )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3336:3: lv_operador_20_0= '%'
                        {
                        lv_operador_20_0=(Token)match(input,68,FOLLOW_68_in_synpred176_InternalSimpleJava7004); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 9 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3350:6: ( (lv_operador_21_0= '%=' ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3350:6: ( (lv_operador_21_0= '%=' ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3351:1: (lv_operador_21_0= '%=' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3351:1: (lv_operador_21_0= '%=' )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3352:3: lv_operador_21_0= '%='
                        {
                        lv_operador_21_0=(Token)match(input,69,FOLLOW_69_in_synpred176_InternalSimpleJava7041); if (state.failed) return ;

                        }


                        }


                        }
                        break;

                }

                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3365:3: ( (lv_exp_22_0= ruleexpression ) )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3366:1: (lv_exp_22_0= ruleexpression )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3366:1: (lv_exp_22_0= ruleexpression )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3367:3: lv_exp_22_0= ruleexpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_3_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava7076);
                lv_exp_22_0=ruleexpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }


                }
                break;
            case 5 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3384:6: ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3384:6: ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) )
                int alt109=4;
                switch ( input.LA(1) ) {
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                    {
                    alt109=1;
                    }
                    break;
                case 79:
                    {
                    alt109=2;
                    }
                    break;
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                    {
                    alt109=3;
                    }
                    break;
                case 86:
                case 87:
                case 88:
                case 89:
                    {
                    alt109=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 109, 0, input);

                    throw nvae;
                }

                switch (alt109) {
                    case 1 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3384:7: ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3384:7: ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3384:8: ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3384:8: ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3385:1: ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3385:1: ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3386:1: (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3386:1: (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' )
                        int alt106=11;
                        switch ( input.LA(1) ) {
                        case 70:
                            {
                            alt106=1;
                            }
                            break;
                        case 71:
                            {
                            alt106=2;
                            }
                            break;
                        case 72:
                            {
                            alt106=3;
                            }
                            break;
                        case 73:
                            {
                            alt106=4;
                            }
                            break;
                        case 74:
                            {
                            alt106=5;
                            }
                            break;
                        case 75:
                            {
                            alt106=6;
                            }
                            break;
                        case 76:
                            {
                            alt106=7;
                            }
                            break;
                        case 77:
                            {
                            alt106=8;
                            }
                            break;
                        case 78:
                            {
                            alt106=9;
                            }
                            break;
                        case 68:
                            {
                            alt106=10;
                            }
                            break;
                        case 69:
                            {
                            alt106=11;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 106, 0, input);

                            throw nvae;
                        }

                        switch (alt106) {
                            case 1 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3387:3: lv_operador_23_1= '&'
                                {
                                lv_operador_23_1=(Token)match(input,70,FOLLOW_70_in_synpred176_InternalSimpleJava7105); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3399:8: lv_operador_23_2= '&='
                                {
                                lv_operador_23_2=(Token)match(input,71,FOLLOW_71_in_synpred176_InternalSimpleJava7134); if (state.failed) return ;

                                }
                                break;
                            case 3 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3411:8: lv_operador_23_3= '|'
                                {
                                lv_operador_23_3=(Token)match(input,72,FOLLOW_72_in_synpred176_InternalSimpleJava7163); if (state.failed) return ;

                                }
                                break;
                            case 4 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3423:8: lv_operador_23_4= '|='
                                {
                                lv_operador_23_4=(Token)match(input,73,FOLLOW_73_in_synpred176_InternalSimpleJava7192); if (state.failed) return ;

                                }
                                break;
                            case 5 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3435:8: lv_operador_23_5= '^'
                                {
                                lv_operador_23_5=(Token)match(input,74,FOLLOW_74_in_synpred176_InternalSimpleJava7221); if (state.failed) return ;

                                }
                                break;
                            case 6 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3447:8: lv_operador_23_6= '^='
                                {
                                lv_operador_23_6=(Token)match(input,75,FOLLOW_75_in_synpred176_InternalSimpleJava7250); if (state.failed) return ;

                                }
                                break;
                            case 7 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3459:8: lv_operador_23_7= '&&'
                                {
                                lv_operador_23_7=(Token)match(input,76,FOLLOW_76_in_synpred176_InternalSimpleJava7279); if (state.failed) return ;

                                }
                                break;
                            case 8 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3471:8: lv_operador_23_8= '||'
                                {
                                lv_operador_23_8=(Token)match(input,77,FOLLOW_77_in_synpred176_InternalSimpleJava7308); if (state.failed) return ;

                                }
                                break;
                            case 9 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3483:8: lv_operador_23_9= '||='
                                {
                                lv_operador_23_9=(Token)match(input,78,FOLLOW_78_in_synpred176_InternalSimpleJava7337); if (state.failed) return ;

                                }
                                break;
                            case 10 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3495:8: lv_operador_23_10= '%'
                                {
                                lv_operador_23_10=(Token)match(input,68,FOLLOW_68_in_synpred176_InternalSimpleJava7366); if (state.failed) return ;

                                }
                                break;
                            case 11 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3507:8: lv_operador_23_11= '%='
                                {
                                lv_operador_23_11=(Token)match(input,69,FOLLOW_69_in_synpred176_InternalSimpleJava7395); if (state.failed) return ;

                                }
                                break;

                        }


                        }


                        }

                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3522:2: ( (lv_exp_24_0= ruleexpression ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3523:1: (lv_exp_24_0= ruleexpression )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3523:1: (lv_exp_24_0= ruleexpression )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3524:3: lv_exp_24_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_0_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava7432);
                        lv_exp_24_0=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }


                        }
                        break;
                    case 2 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3541:6: ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3541:6: ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3541:7: ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3541:7: ( (lv_operador_25_0= '?' ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3542:1: (lv_operador_25_0= '?' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3542:1: (lv_operador_25_0= '?' )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3543:3: lv_operador_25_0= '?'
                        {
                        lv_operador_25_0=(Token)match(input,79,FOLLOW_79_in_synpred176_InternalSimpleJava7458); if (state.failed) return ;

                        }


                        }

                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3556:2: ( (lv_exp_26_0= ruleexpression ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3557:1: (lv_exp_26_0= ruleexpression )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3557:1: (lv_exp_26_0= ruleexpression )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3558:3: lv_exp_26_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_1_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava7492);
                        lv_exp_26_0=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }

                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3574:2: ( (lv_operador_27_0= ':' ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3575:1: (lv_operador_27_0= ':' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3575:1: (lv_operador_27_0= ':' )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3576:3: lv_operador_27_0= ':'
                        {
                        lv_operador_27_0=(Token)match(input,37,FOLLOW_37_in_synpred176_InternalSimpleJava7510); if (state.failed) return ;

                        }


                        }

                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3589:2: ( (lv_exp_28_0= ruleexpression ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3590:1: (lv_exp_28_0= ruleexpression )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3590:1: (lv_exp_28_0= ruleexpression )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3591:3: lv_exp_28_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_1_3_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava7544);
                        lv_exp_28_0=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }


                        }
                        break;
                    case 3 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3608:6: ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3608:6: ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3608:7: ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3608:7: ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3609:1: ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3609:1: ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3610:1: (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3610:1: (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' )
                        int alt107=6;
                        switch ( input.LA(1) ) {
                        case 80:
                            {
                            alt107=1;
                            }
                            break;
                        case 81:
                            {
                            alt107=2;
                            }
                            break;
                        case 82:
                            {
                            alt107=3;
                            }
                            break;
                        case 83:
                            {
                            alt107=4;
                            }
                            break;
                        case 84:
                            {
                            alt107=5;
                            }
                            break;
                        case 85:
                            {
                            alt107=6;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 107, 0, input);

                            throw nvae;
                        }

                        switch (alt107) {
                            case 1 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3611:3: lv_operador_29_1= '>'
                                {
                                lv_operador_29_1=(Token)match(input,80,FOLLOW_80_in_synpred176_InternalSimpleJava7572); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3623:8: lv_operador_29_2= '<'
                                {
                                lv_operador_29_2=(Token)match(input,81,FOLLOW_81_in_synpred176_InternalSimpleJava7601); if (state.failed) return ;

                                }
                                break;
                            case 3 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3635:8: lv_operador_29_3= '>='
                                {
                                lv_operador_29_3=(Token)match(input,82,FOLLOW_82_in_synpred176_InternalSimpleJava7630); if (state.failed) return ;

                                }
                                break;
                            case 4 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3647:8: lv_operador_29_4= '<='
                                {
                                lv_operador_29_4=(Token)match(input,83,FOLLOW_83_in_synpred176_InternalSimpleJava7659); if (state.failed) return ;

                                }
                                break;
                            case 5 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3659:8: lv_operador_29_5= '=='
                                {
                                lv_operador_29_5=(Token)match(input,84,FOLLOW_84_in_synpred176_InternalSimpleJava7688); if (state.failed) return ;

                                }
                                break;
                            case 6 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3671:8: lv_operador_29_6= '!='
                                {
                                lv_operador_29_6=(Token)match(input,85,FOLLOW_85_in_synpred176_InternalSimpleJava7717); if (state.failed) return ;

                                }
                                break;

                        }


                        }


                        }

                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3686:2: ( (lv_exp_30_0= ruleexpression ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3687:1: (lv_exp_30_0= ruleexpression )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3687:1: (lv_exp_30_0= ruleexpression )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3688:3: lv_exp_30_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_2_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava7754);
                        lv_exp_30_0=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }


                        }
                        break;
                    case 4 :
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3705:6: ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3705:6: ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3705:7: ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3705:7: ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3706:1: ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3706:1: ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3707:1: (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3707:1: (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' )
                        int alt108=4;
                        switch ( input.LA(1) ) {
                        case 86:
                            {
                            alt108=1;
                            }
                            break;
                        case 87:
                            {
                            alt108=2;
                            }
                            break;
                        case 88:
                            {
                            alt108=3;
                            }
                            break;
                        case 89:
                            {
                            alt108=4;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 108, 0, input);

                            throw nvae;
                        }

                        switch (alt108) {
                            case 1 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3708:3: lv_operador_31_1= '>>='
                                {
                                lv_operador_31_1=(Token)match(input,86,FOLLOW_86_in_synpred176_InternalSimpleJava7782); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3720:8: lv_operador_31_2= '<<'
                                {
                                lv_operador_31_2=(Token)match(input,87,FOLLOW_87_in_synpred176_InternalSimpleJava7811); if (state.failed) return ;

                                }
                                break;
                            case 3 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3732:8: lv_operador_31_3= '>>'
                                {
                                lv_operador_31_3=(Token)match(input,88,FOLLOW_88_in_synpred176_InternalSimpleJava7840); if (state.failed) return ;

                                }
                                break;
                            case 4 :
                                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3744:8: lv_operador_31_4= '>>>'
                                {
                                lv_operador_31_4=(Token)match(input,89,FOLLOW_89_in_synpred176_InternalSimpleJava7869); if (state.failed) return ;

                                }
                                break;

                        }


                        }


                        }

                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3759:2: ( (lv_exp_32_0= ruleexpression ) )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3760:1: (lv_exp_32_0= ruleexpression )
                        {
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3760:1: (lv_exp_32_0= ruleexpression )
                        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3761:3: lv_exp_32_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_3_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava7906);
                        lv_exp_32_0=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }


                        }
                        break;

                }


                }
                break;

        }

        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3777:5: ( (lv_expressoes_33_0= ruleexpression_aux ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3778:1: (lv_expressoes_33_0= ruleexpression_aux )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3778:1: (lv_expressoes_33_0= ruleexpression_aux )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3779:3: lv_expressoes_33_0= ruleexpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressoesExpression_auxParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_aux_in_synpred176_InternalSimpleJava7930);
        lv_expressoes_33_0=ruleexpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred176_InternalSimpleJava

    // $ANTLR start synpred180_InternalSimpleJava
    public final void synpred180_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_argumentos_1_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3909:2: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3909:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3909:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3909:3: ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')'
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3909:3: ( ( '(' )=>otherlv_0= '(' )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3909:4: ( '(' )=>otherlv_0= '('
        {
        otherlv_0=(Token)match(input,30,FOLLOW_30_in_synpred180_InternalSimpleJava8281); if (state.failed) return ;

        }

        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3914:2: ( (lv_argumentos_1_0= rulearglist ) )?
        int alt111=2;
        int LA111_0 = input.LA(1);

        if ( ((LA111_0>=RULE_STRING && LA111_0<=RULE_FLOAT_LITERAL)||LA111_0==30||(LA111_0>=54 && LA111_0<=57)||(LA111_0>=60 && LA111_0<=62)||(LA111_0>=92 && LA111_0<=104)) ) {
            alt111=1;
        }
        switch (alt111) {
            case 1 :
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3915:1: (lv_argumentos_1_0= rulearglist )
                {
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3915:1: (lv_argumentos_1_0= rulearglist )
                // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3916:3: lv_argumentos_1_0= rulearglist
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getCreating_auxAccess().getArgumentosArglistParserRuleCall_0_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_rulearglist_in_synpred180_InternalSimpleJava8303);
                lv_argumentos_1_0=rulearglist();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_2=(Token)match(input,31,FOLLOW_31_in_synpred180_InternalSimpleJava8316); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred180_InternalSimpleJava

    // $ANTLR start synpred181_InternalSimpleJava
    public final void synpred181_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3937:8: ( '[' )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:3937:10: '['
        {
        match(input,32,FOLLOW_32_in_synpred181_InternalSimpleJava8336); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred181_InternalSimpleJava

    // $ANTLR start synpred192_InternalSimpleJava
    public final void synpred192_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_expressoesArgumentos_0_0 = null;

        EObject lv_expressoesArgumentos_2_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4343:2: ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4343:2: ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4343:2: ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4343:3: ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )*
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4343:3: ( (lv_expressoesArgumentos_0_0= ruleexpression ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4344:1: (lv_expressoesArgumentos_0_0= ruleexpression )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4344:1: (lv_expressoesArgumentos_0_0= ruleexpression )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4345:3: lv_expressoesArgumentos_0_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getArglistAccess().getExpressoesArgumentosExpressionParserRuleCall_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred192_InternalSimpleJava9285);
        lv_expressoesArgumentos_0_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4361:2: (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )*
        loop112:
        do {
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==26) ) {
                alt112=1;
            }


            switch (alt112) {
        	case 1 :
        	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4361:4: otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) )
        	    {
        	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_synpred192_InternalSimpleJava9298); if (state.failed) return ;
        	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4365:1: ( (lv_expressoesArgumentos_2_0= ruleexpression ) )
        	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4366:1: (lv_expressoesArgumentos_2_0= ruleexpression )
        	    {
        	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4366:1: (lv_expressoesArgumentos_2_0= ruleexpression )
        	    // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4367:3: lv_expressoesArgumentos_2_0= ruleexpression
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getArglistAccess().getExpressoesArgumentosExpressionParserRuleCall_0_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleexpression_in_synpred192_InternalSimpleJava9319);
        	    lv_expressoesArgumentos_2_0=ruleexpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop112;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred192_InternalSimpleJava

    // $ANTLR start synpred195_InternalSimpleJava
    public final void synpred195_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token lv_nomePacote_1_0=null;
        EObject lv_pacote_2_0 = null;


        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4551:3: (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4551:3: otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) )
        {
        otherlv_0=(Token)match(input,58,FOLLOW_58_in_synpred195_InternalSimpleJava9670); if (state.failed) return ;
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4555:1: ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4556:1: (lv_nomePacote_1_0= RULE_IDENTIFIER )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4556:1: (lv_nomePacote_1_0= RULE_IDENTIFIER )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4557:3: lv_nomePacote_1_0= RULE_IDENTIFIER
        {
        lv_nomePacote_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_synpred195_InternalSimpleJava9687); if (state.failed) return ;

        }


        }

        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4573:2: ( (lv_pacote_2_0= rulepackage_name_aux ) )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4574:1: (lv_pacote_2_0= rulepackage_name_aux )
        {
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4574:1: (lv_pacote_2_0= rulepackage_name_aux )
        // ../compiladores/src-gen/org/xtext/example/parser/antlr/internal/InternalSimpleJava.g:4575:3: lv_pacote_2_0= rulepackage_name_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPackage_name_auxAccess().getPacotePackage_name_auxParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_rulepackage_name_aux_in_synpred195_InternalSimpleJava9713);
        lv_pacote_2_0=rulepackage_name_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred195_InternalSimpleJava

    // Delegated rules

    public final boolean synpred90_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred154_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred192_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred192_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred141_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred176_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred176_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred122_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred122_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred195_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred195_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred181_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred181_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred180_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred180_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA99 dfa99 = new DFA99(this);
    protected DFA110 dfa110 = new DFA110(this);
    protected DFA105 dfa105 = new DFA105(this);
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\13\27\2\uffff";
    static final String DFA6_maxS =
        "\13\160\2\uffff";
    static final String DFA6_acceptS =
        "\13\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\63\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\63\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\63\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\63\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\63\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\63\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\63\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\63\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\63\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\63\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\63\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "305:3: ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) )";
        }
    }
    static final String DFA11_eotS =
        "\17\uffff";
    static final String DFA11_eofS =
        "\17\uffff";
    static final String DFA11_minS =
        "\1\5\2\uffff\12\5\1\uffff\1\5";
    static final String DFA11_maxS =
        "\1\160\2\uffff\12\160\1\uffff\1\160";
    static final String DFA11_acceptS =
        "\1\uffff\1\3\1\1\12\uffff\1\2\1\uffff";
    static final String DFA11_specialS =
        "\17\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\14\uffff\1\2\2\uffff\1\2\1\uffff\1\15\4\uffff\1\1\1\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\6\53\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "",
            "",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\53\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\53\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\53\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\3\uffff\1\2\2\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\53\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\53\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\53\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\53\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\53\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\53\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\53\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\53\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 520:1: ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )*";
        }
    }
    static final String DFA17_eotS =
        "\30\uffff";
    static final String DFA17_eofS =
        "\30\uffff";
    static final String DFA17_minS =
        "\1\5\23\0\4\uffff";
    static final String DFA17_maxS =
        "\1\160\23\0\4\uffff";
    static final String DFA17_acceptS =
        "\24\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA17_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\23\30\uffff\1\24\3\uffff\1\7\5\uffff\1\24\14\uffff\1\4\53\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "731:3: ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_10 = input.LA(1);

                         
                        int index17_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_11 = input.LA(1);

                         
                        int index17_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_12 = input.LA(1);

                         
                        int index17_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_13 = input.LA(1);

                         
                        int index17_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_14 = input.LA(1);

                         
                        int index17_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_15 = input.LA(1);

                         
                        int index17_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_16 = input.LA(1);

                         
                        int index17_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_17 = input.LA(1);

                         
                        int index17_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_18 = input.LA(1);

                         
                        int index17_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_19 = input.LA(1);

                         
                        int index17_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\63\uffff";
    static final String DFA29_eofS =
        "\63\uffff";
    static final String DFA29_minS =
        "\1\4\6\uffff\1\0\13\uffff\1\0\1\uffff\1\0\35\uffff";
    static final String DFA29_maxS =
        "\1\160\6\uffff\1\0\13\uffff\1\0\1\uffff\1\0\35\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\24\uffff\1\2\16\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14\1\16\1\17\1\20\1\12\1\15";
    static final String DFA29_specialS =
        "\7\uffff\1\0\13\uffff\1\1\1\uffff\1\2\35\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\26\1\23\3\26\11\uffff\1\60\10\uffff\1\45\2\uffff\1\25\3\uffff\1\7\1\54\1\55\1\uffff\1\56\1\57\1\1\1\uffff\1\46\1\uffff\1\47\1\50\1\51\1\52\2\uffff\1\53\2\uffff\1\1\4\26\2\uffff\3\26\35\uffff\4\26\1\uffff\20\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1137:1: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_newbloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_7 = input.LA(1);

                         
                        int index29_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalSimpleJava()) ) {s = 1;}

                        else if ( (synpred65_InternalSimpleJava()) ) {s = 49;}

                         
                        input.seek(index29_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_19 = input.LA(1);

                         
                        int index29_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalSimpleJava()) ) {s = 1;}

                        else if ( (synpred57_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred69_InternalSimpleJava()) ) {s = 50;}

                         
                        input.seek(index29_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_21 = input.LA(1);

                         
                        int index29_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalSimpleJava()) ) {s = 1;}

                        else if ( (synpred57_InternalSimpleJava()) ) {s = 22;}

                         
                        input.seek(index29_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\7\uffff";
    static final String DFA31_eofS =
        "\7\uffff";
    static final String DFA31_minS =
        "\1\5\1\uffff\1\5\2\uffff\1\41\1\5";
    static final String DFA31_maxS =
        "\1\150\1\uffff\1\72\2\uffff\1\41\1\51";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\2\uffff";
    static final String DFA31_specialS =
        "\7\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\2\30\uffff\1\4\11\uffff\1\3\70\uffff\10\1",
            "",
            "\1\1\14\uffff\1\4\7\uffff\2\4\2\uffff\1\1\1\uffff\1\5\10\uffff\1\4\20\uffff\1\1",
            "",
            "",
            "\1\6",
            "\1\1\14\uffff\1\4\7\uffff\2\4\2\uffff\1\1\1\uffff\1\5\10\uffff\1\4"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1555:3: ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )?";
        }
    }
    static final String DFA43_eotS =
        "\46\uffff";
    static final String DFA43_eofS =
        "\46\uffff";
    static final String DFA43_minS =
        "\1\4\22\uffff\1\0\1\uffff\1\0\20\uffff";
    static final String DFA43_maxS =
        "\1\160\22\uffff\1\0\1\uffff\1\0\20\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\1\24\uffff\1\2\16\uffff\1\3";
    static final String DFA43_specialS =
        "\23\uffff\1\0\1\uffff\1\1\20\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\26\1\23\3\26\11\uffff\1\45\13\uffff\1\25\3\uffff\1\1\5\uffff\1\1\14\uffff\1\1\4\26\2\uffff\3\26\35\uffff\4\26\1\uffff\20\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "2105:1: ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_19 = input.LA(1);

                         
                        int index43_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalSimpleJava()) ) {s = 1;}

                        else if ( (synpred90_InternalSimpleJava()) ) {s = 22;}

                         
                        input.seek(index43_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_21 = input.LA(1);

                         
                        int index43_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalSimpleJava()) ) {s = 1;}

                        else if ( (synpred90_InternalSimpleJava()) ) {s = 22;}

                         
                        input.seek(index43_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\56\uffff";
    static final String DFA51_eofS =
        "\1\2\55\uffff";
    static final String DFA51_minS =
        "\1\22\1\0\54\uffff";
    static final String DFA51_maxS =
        "\1\133\1\0\54\uffff";
    static final String DFA51_acceptS =
        "\2\uffff\1\2\52\uffff\1\1";
    static final String DFA51_specialS =
        "\1\uffff\1\0\54\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\2\7\uffff\3\2\1\uffff\2\2\1\1\1\2\3\uffff\1\2\24\uffff\42\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "2683:2: ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_1 = input.LA(1);

                         
                        int index51_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalSimpleJava()) ) {s = 45;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index51_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\56\uffff";
    static final String DFA54_eofS =
        "\1\1\55\uffff";
    static final String DFA54_minS =
        "\1\22\50\uffff\1\0\4\uffff";
    static final String DFA54_maxS =
        "\1\133\50\uffff\1\0\4\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\1\2\53\uffff\1\1";
    static final String DFA54_specialS =
        "\51\uffff\1\0\4\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\1\7\uffff\1\1\1\51\1\1\1\uffff\4\1\3\uffff\1\1\24\uffff\42\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "()* loopback of 2737:3: ( (lv_novo_10_0= rulenewBlock ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_41 = input.LA(1);

                         
                        int index54_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalSimpleJava()) ) {s = 45;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_41);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\32\uffff";
    static final String DFA55_eofS =
        "\32\uffff";
    static final String DFA55_minS =
        "\1\4\17\uffff\1\0\11\uffff";
    static final String DFA55_maxS =
        "\1\150\17\uffff\1\0\11\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\1\20\uffff\1\2\7\uffff";
    static final String DFA55_specialS =
        "\20\uffff\1\0\11\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\1\1\20\3\1\25\uffff\1\1\27\uffff\4\1\2\uffff\3\1\35\uffff\4\1\1\uffff\10\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "2776:1: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_16 = input.LA(1);

                         
                        int index55_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_InternalSimpleJava()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index55_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\13\uffff";
    static final String DFA56_eofS =
        "\13\uffff";
    static final String DFA56_minS =
        "\1\4\12\uffff";
    static final String DFA56_maxS =
        "\1\137\12\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA56_specialS =
        "\13\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\5\1\11\3\5\25\uffff\1\12\27\uffff\1\4\1\6\1\7\1\10\2\uffff\3\2\35\uffff\3\1\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "2866:2: ( ( (lv_logical_0_0= rulelogical_expression ) ) | ( (lv_numeric_1_0= rulenumeric_expression ) ) | ( (lv_bit_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) )";
        }
    }
    static final String DFA66_eotS =
        "\50\uffff";
    static final String DFA66_eofS =
        "\1\46\47\uffff";
    static final String DFA66_minS =
        "\1\22\45\0\2\uffff";
    static final String DFA66_maxS =
        "\1\133\45\0\2\uffff";
    static final String DFA66_acceptS =
        "\46\uffff\1\2\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\11\1\44\1\22\1\12\1\4\1\37\1\40\1\43\1\36\1\31\1\5\1\0\1\21\1\13\1\26\1\41\1\23\1\14\1\32\1\15\1\33\1\16\1\34\1\17\1\35\1\20\1\30\1\1\1\24\1\2\1\25\1\3\1\6\1\7\1\27\1\10\1\42\2\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\46\7\uffff\1\4\2\46\1\uffff\1\1\1\46\1\2\1\46\3\uffff\1\46\24\uffff\1\3\1\5\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\6\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3050:1: ( ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_12 = input.LA(1);

                         
                        int index66_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_28 = input.LA(1);

                         
                        int index66_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_28);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_30 = input.LA(1);

                         
                        int index66_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_30);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA66_32 = input.LA(1);

                         
                        int index66_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_32);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA66_5 = input.LA(1);

                         
                        int index66_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA66_11 = input.LA(1);

                         
                        int index66_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA66_33 = input.LA(1);

                         
                        int index66_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_33);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA66_34 = input.LA(1);

                         
                        int index66_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_34);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA66_36 = input.LA(1);

                         
                        int index66_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_36);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA66_4 = input.LA(1);

                         
                        int index66_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_4);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA66_14 = input.LA(1);

                         
                        int index66_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_14);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA66_18 = input.LA(1);

                         
                        int index66_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_18);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA66_20 = input.LA(1);

                         
                        int index66_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_20);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA66_22 = input.LA(1);

                         
                        int index66_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_22);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA66_24 = input.LA(1);

                         
                        int index66_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_24);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA66_26 = input.LA(1);

                         
                        int index66_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_26);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA66_13 = input.LA(1);

                         
                        int index66_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_13);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA66_3 = input.LA(1);

                         
                        int index66_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_3);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA66_17 = input.LA(1);

                         
                        int index66_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_17);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA66_29 = input.LA(1);

                         
                        int index66_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_29);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA66_31 = input.LA(1);

                         
                        int index66_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_31);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA66_15 = input.LA(1);

                         
                        int index66_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_15);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA66_35 = input.LA(1);

                         
                        int index66_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_35);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA66_27 = input.LA(1);

                         
                        int index66_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_27);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA66_10 = input.LA(1);

                         
                        int index66_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_10);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA66_19 = input.LA(1);

                         
                        int index66_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_19);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA66_21 = input.LA(1);

                         
                        int index66_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_21);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA66_23 = input.LA(1);

                         
                        int index66_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_23);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA66_25 = input.LA(1);

                         
                        int index66_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_25);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA66_9 = input.LA(1);

                         
                        int index66_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_9);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA66_6 = input.LA(1);

                         
                        int index66_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_6);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA66_7 = input.LA(1);

                         
                        int index66_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_7);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA66_16 = input.LA(1);

                         
                        int index66_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_16);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA66_37 = input.LA(1);

                         
                        int index66_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_37);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA66_8 = input.LA(1);

                         
                        int index66_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_8);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSimpleJava()) ) {s = 39;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index66_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\47\uffff";
    static final String DFA65_eofS =
        "\47\uffff";
    static final String DFA65_minS =
        "\1\32\5\uffff\2\0\10\uffff\2\0\25\uffff";
    static final String DFA65_maxS =
        "\1\133\5\uffff\2\0\10\uffff\2\0\25\uffff";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\6\uffff\1\3\1\uffff\1\4\7\uffff\1\5\23\uffff\1\2";
    static final String DFA65_specialS =
        "\6\uffff\1\0\1\1\10\uffff\1\2\1\3\25\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\1\3\uffff\1\1\1\uffff\1\1\31\uffff\2\1\2\10\6\12\1\20\1\21\24\22\1\6\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3050:2: ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_6 = input.LA(1);

                         
                        int index65_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred141_InternalSimpleJava()) ) {s = 38;}

                        else if ( (synpred154_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index65_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_7 = input.LA(1);

                         
                        int index65_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred141_InternalSimpleJava()) ) {s = 38;}

                        else if ( (synpred154_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index65_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_16 = input.LA(1);

                         
                        int index65_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalSimpleJava()) ) {s = 10;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index65_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA65_17 = input.LA(1);

                         
                        int index65_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalSimpleJava()) ) {s = 10;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index65_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\12\uffff";
    static final String DFA60_eofS =
        "\12\uffff";
    static final String DFA60_minS =
        "\1\76\11\uffff";
    static final String DFA60_maxS =
        "\1\133\11\uffff";
    static final String DFA60_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA60_specialS =
        "\12\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\24\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3217:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) )";
        }
    }
    static final String DFA71_eotS =
        "\56\uffff";
    static final String DFA71_eofS =
        "\1\2\55\uffff";
    static final String DFA71_minS =
        "\1\22\1\0\54\uffff";
    static final String DFA71_maxS =
        "\1\133\1\0\54\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\52\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\54\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\2\7\uffff\3\2\1\uffff\1\1\3\2\3\uffff\1\2\24\uffff\42\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "3909:1: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSimpleJava()) ) {s = 45;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\56\uffff";
    static final String DFA69_eofS =
        "\1\2\55\uffff";
    static final String DFA69_minS =
        "\1\22\1\0\54\uffff";
    static final String DFA69_maxS =
        "\1\133\1\0\54\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\52\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\54\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\2\7\uffff\3\2\1\uffff\2\2\1\1\1\2\3\uffff\1\2\24\uffff\42\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "3937:7: ( ( '[' )=>this_aux_3= ruleaux )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred181_InternalSimpleJava()) ) {s = 45;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\33\uffff";
    static final String DFA77_eofS =
        "\33\uffff";
    static final String DFA77_minS =
        "\1\4\17\uffff\1\0\12\uffff";
    static final String DFA77_maxS =
        "\1\150\17\uffff\1\0\12\uffff";
    static final String DFA77_acceptS =
        "\1\uffff\1\1\20\uffff\1\2\1\3\7\uffff";
    static final String DFA77_specialS =
        "\20\uffff\1\0\12\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\1\1\20\3\1\25\uffff\1\1\27\uffff\4\1\2\uffff\3\1\35\uffff\4\1\1\22\10\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "4343:1: ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_16 = input.LA(1);

                         
                        int index77_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred192_InternalSimpleJava()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index77_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA99_eotS =
        "\12\uffff";
    static final String DFA99_eofS =
        "\12\uffff";
    static final String DFA99_minS =
        "\1\76\11\uffff";
    static final String DFA99_maxS =
        "\1\133\11\uffff";
    static final String DFA99_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA99_specialS =
        "\12\uffff}>";
    static final String[] DFA99_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\24\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA99_eot = DFA.unpackEncodedString(DFA99_eotS);
    static final short[] DFA99_eof = DFA.unpackEncodedString(DFA99_eofS);
    static final char[] DFA99_min = DFA.unpackEncodedStringToUnsignedChars(DFA99_minS);
    static final char[] DFA99_max = DFA.unpackEncodedStringToUnsignedChars(DFA99_maxS);
    static final short[] DFA99_accept = DFA.unpackEncodedString(DFA99_acceptS);
    static final short[] DFA99_special = DFA.unpackEncodedString(DFA99_specialS);
    static final short[][] DFA99_transition;

    static {
        int numStates = DFA99_transitionS.length;
        DFA99_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA99_transition[i] = DFA.unpackEncodedString(DFA99_transitionS[i]);
        }
    }

    class DFA99 extends DFA {

        public DFA99(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 99;
            this.eot = DFA99_eot;
            this.eof = DFA99_eof;
            this.min = DFA99_min;
            this.max = DFA99_max;
            this.accept = DFA99_accept;
            this.special = DFA99_special;
            this.transition = DFA99_transition;
        }
        public String getDescription() {
            return "3217:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) )";
        }
    }
    static final String DFA110_eotS =
        "\47\uffff";
    static final String DFA110_eofS =
        "\47\uffff";
    static final String DFA110_minS =
        "\1\32\5\uffff\2\0\10\uffff\2\0\25\uffff";
    static final String DFA110_maxS =
        "\1\133\5\uffff\2\0\10\uffff\2\0\25\uffff";
    static final String DFA110_acceptS =
        "\1\uffff\1\1\6\uffff\1\3\1\uffff\1\4\7\uffff\1\5\23\uffff\1\2";
    static final String DFA110_specialS =
        "\6\uffff\1\0\1\1\10\uffff\1\2\1\3\25\uffff}>";
    static final String[] DFA110_transitionS = {
            "\1\1\3\uffff\1\1\1\uffff\1\1\31\uffff\2\1\2\10\6\12\1\20\1\21\24\22\1\6\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA110_eot = DFA.unpackEncodedString(DFA110_eotS);
    static final short[] DFA110_eof = DFA.unpackEncodedString(DFA110_eofS);
    static final char[] DFA110_min = DFA.unpackEncodedStringToUnsignedChars(DFA110_minS);
    static final char[] DFA110_max = DFA.unpackEncodedStringToUnsignedChars(DFA110_maxS);
    static final short[] DFA110_accept = DFA.unpackEncodedString(DFA110_acceptS);
    static final short[] DFA110_special = DFA.unpackEncodedString(DFA110_specialS);
    static final short[][] DFA110_transition;

    static {
        int numStates = DFA110_transitionS.length;
        DFA110_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA110_transition[i] = DFA.unpackEncodedString(DFA110_transitionS[i]);
        }
    }

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = DFA110_eot;
            this.eof = DFA110_eof;
            this.min = DFA110_min;
            this.max = DFA110_max;
            this.accept = DFA110_accept;
            this.special = DFA110_special;
            this.transition = DFA110_transition;
        }
        public String getDescription() {
            return "3050:2: ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= '&' | lv_operador_23_2= '&=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= '&&' | lv_operador_23_8= '||' | lv_operador_23_9= '||=' | lv_operador_23_10= '%' | lv_operador_23_11= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_6 = input.LA(1);

                         
                        int index110_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred141_InternalSimpleJava()) ) {s = 38;}

                        else if ( (synpred154_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index110_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA110_7 = input.LA(1);

                         
                        int index110_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred141_InternalSimpleJava()) ) {s = 38;}

                        else if ( (synpred154_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index110_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA110_16 = input.LA(1);

                         
                        int index110_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalSimpleJava()) ) {s = 10;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index110_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA110_17 = input.LA(1);

                         
                        int index110_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalSimpleJava()) ) {s = 10;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index110_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 110, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA105_eotS =
        "\12\uffff";
    static final String DFA105_eofS =
        "\12\uffff";
    static final String DFA105_minS =
        "\1\76\11\uffff";
    static final String DFA105_maxS =
        "\1\133\11\uffff";
    static final String DFA105_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA105_specialS =
        "\12\uffff}>";
    static final String[] DFA105_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\24\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA105_eot = DFA.unpackEncodedString(DFA105_eotS);
    static final short[] DFA105_eof = DFA.unpackEncodedString(DFA105_eofS);
    static final char[] DFA105_min = DFA.unpackEncodedStringToUnsignedChars(DFA105_minS);
    static final char[] DFA105_max = DFA.unpackEncodedStringToUnsignedChars(DFA105_maxS);
    static final short[] DFA105_accept = DFA.unpackEncodedString(DFA105_acceptS);
    static final short[] DFA105_special = DFA.unpackEncodedString(DFA105_specialS);
    static final short[][] DFA105_transition;

    static {
        int numStates = DFA105_transitionS.length;
        DFA105_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA105_transition[i] = DFA.unpackEncodedString(DFA105_transitionS[i]);
        }
    }

    class DFA105 extends DFA {

        public DFA105(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 105;
            this.eot = DFA105_eot;
            this.eof = DFA105_eof;
            this.min = DFA105_min;
            this.max = DFA105_max;
            this.accept = DFA105_accept;
            this.special = DFA105_special;
            this.transition = DFA105_transition;
        }
        public String getDescription() {
            return "3217:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompilation_unit_in_ruleModel140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompilation_unit_in_entryRulecompilation_unit174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompilation_unit184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepackage_statement_in_rulecompilation_unit230 = new BitSet(new long[]{0x0020000420A80002L,0x0001FE0000000000L});
    public static final BitSet FOLLOW_ruleimport_statement_in_rulecompilation_unit252 = new BitSet(new long[]{0x0020000420A80002L,0x0001FE0000000000L});
    public static final BitSet FOLLOW_ruletype_declaration_in_rulecompilation_unit274 = new BitSet(new long[]{0x0020000420A00002L,0x0001FE0000000000L});
    public static final BitSet FOLLOW_rulepackage_statement_in_entryRulepackage_statement311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepackage_statement321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulepackage_statement358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_rulepackage_statement379 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulepackage_statement391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimport_statement_in_entryRuleimport_statement427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimport_statement437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleimport_statement474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleimport_statement495 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_20_in_ruleimport_statement508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleimport_statement526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_declaration_in_entryRuletype_declaration563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_declaration573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_ruletype_declaration624 = new BitSet(new long[]{0x0020000420A00000L,0x0001FE0000000000L});
    public static final BitSet FOLLOW_ruleclass_declaration_in_ruletype_declaration647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinterface_declaration_in_ruletype_declaration674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_entryRuledoc_comment711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledoc_comment721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruledoc_comment758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruledoc_comment775 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruledoc_comment792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclass_declaration_in_entryRuleclass_declaration828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclass_declaration838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_ruleclass_declaration884 = new BitSet(new long[]{0x0020000400800000L,0x0001FE0000000000L});
    public static final BitSet FOLLOW_23_in_ruleclass_declaration897 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleclass_declaration914 = new BitSet(new long[]{0x000000000B000000L});
    public static final BitSet FOLLOW_24_in_ruleclass_declaration932 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleclass_declaration953 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_25_in_ruleclass_declaration968 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleclass_declaration989 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleclass_declaration1002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleclass_declaration1023 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleclass_declaration1039 = new BitSet(new long[]{0x0020010450A40020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_rulefield_declaration_in_ruleclass_declaration1061 = new BitSet(new long[]{0x0020010450A40020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_ruleclass_declaration_in_ruleclass_declaration1088 = new BitSet(new long[]{0x0020010450A40020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_28_in_ruleclass_declaration1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinterface_declaration_in_entryRuleinterface_declaration1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinterface_declaration1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_ruleinterface_declaration1194 = new BitSet(new long[]{0x0020000420000000L,0x0001FE0000000000L});
    public static final BitSet FOLLOW_29_in_ruleinterface_declaration1207 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleinterface_declaration1224 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_24_in_ruleinterface_declaration1242 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleinterface_declaration1263 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleinterface_declaration1276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleinterface_declaration1297 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleinterface_declaration1313 = new BitSet(new long[]{0x0020010450240020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_rulefield_declaration_in_ruleinterface_declaration1334 = new BitSet(new long[]{0x0020010450240020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_28_in_ruleinterface_declaration1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_declaration_in_entryRulefield_declaration1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_declaration1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_rulefield_declaration1440 = new BitSet(new long[]{0x0020010440200020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_rulefield_declaration1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_rulefield_declaration1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulefield_declaration1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatic_initializer_in_rulefield_declaration1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulefield_declaration1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_entryRulemethod_declaration1600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemethod_declaration1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_rulemethod_declaration1656 = new BitSet(new long[]{0x0020000400000020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_ruletype_in_rulemethod_declaration1678 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulemethod_declaration1695 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulemethod_declaration1712 = new BitSet(new long[]{0x0020000480000020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_ruleparameter_list_in_rulemethod_declaration1733 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulemethod_declaration1746 = new BitSet(new long[]{0x0000000108040000L});
    public static final BitSet FOLLOW_32_in_rulemethod_declaration1759 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulemethod_declaration1771 = new BitSet(new long[]{0x0000000108040000L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulemethod_declaration1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulemethod_declaration1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_in_entryRuleparameter1850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleparameter1906 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleparameter1923 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleparameter1941 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleparameter1953 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleparameter_list_in_entryRuleparameter_list1991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_list2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_in_ruleparameter_list2047 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleparameter_list2060 = new BitSet(new long[]{0x0020000400000020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_ruleparameter_in_ruleparameter_list2081 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_entryRulestatement_block2119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_block2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulestatement_block2166 = new BitSet(new long[]{0x73E4F5DC582401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_block2187 = new BitSet(new long[]{0x73E4F5DC582401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_28_in_rulestatement_block2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement2236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulestatement2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement2499 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulestatement2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_rulestatement2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledo_statement_in_rulestatement2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rulestatement2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rulestatement2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletry_statement_in_rulestatement2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitch_statement_in_rulestatement2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulestatement2720 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulestatement2732 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement2753 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulestatement2765 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulestatement2806 = new BitSet(new long[]{0x73C00000400401F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement2827 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulestatement2860 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement2881 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement2912 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulestatement2923 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulestatement2967 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement2984 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulestatement3022 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement3039 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulestatement3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration3112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_rulevariable_declaration3168 = new BitSet(new long[]{0x0020010440200020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_ruletype_in_rulevariable_declaration3191 = new BitSet(new long[]{0x0020010440200020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_40_in_rulevariable_declaration3209 = new BitSet(new long[]{0x0020010440200020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_rulevariable_declarator_in_rulevariable_declaration3232 = new BitSet(new long[]{0x000000000C040000L});
    public static final BitSet FOLLOW_26_in_rulevariable_declaration3245 = new BitSet(new long[]{0x0020010440200020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_rulevariable_declarator_in_rulevariable_declaration3266 = new BitSet(new long[]{0x000000000C040000L});
    public static final BitSet FOLLOW_18_in_rulevariable_declaration3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulevariable_declaration3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declarator_in_entryRulevariable_declarator3345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declarator3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulevariable_declarator3393 = new BitSet(new long[]{0x73E00004C00001F0L,0x0001FFFFF0000000L});
    public static final BitSet FOLLOW_rulearglist_in_rulevariable_declarator3419 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulevariable_declarator3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariable_declarator3457 = new BitSet(new long[]{0x0000020100000002L});
    public static final BitSet FOLLOW_32_in_rulevariable_declarator3475 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulevariable_declarator3487 = new BitSet(new long[]{0x0000020100000002L});
    public static final BitSet FOLLOW_41_in_rulevariable_declarator3508 = new BitSet(new long[]{0x73C00000480001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_declarator3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_entryRulevariable_initializer3581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_initializer3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulevariable_initializer3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulevariable_initializer3656 = new BitSet(new long[]{0x73C00000580001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_initializer3678 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_26_in_rulevariable_initializer3691 = new BitSet(new long[]{0x73C00000480001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_initializer3712 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_26_in_rulevariable_initializer3727 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulevariable_initializer3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_entryRuleif_statement3780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_statement3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleif_statement3827 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleif_statement3839 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleif_statement3860 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleif_statement3872 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement3893 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleif_statement3925 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledo_statement_in_entryRuledo_statement3985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledo_statement3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruledo_statement4032 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruledo_statement4053 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruledo_statement4065 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruledo_statement4077 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruledo_statement4098 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruledo_statement4110 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruledo_statement4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement4158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulewhile_statement4205 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulewhile_statement4217 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulewhile_statement4238 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulewhile_statement4250 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulewhile_statement4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_entryRulefor_statement4307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_statement4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulefor_statement4354 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulefor_statement4366 = new BitSet(new long[]{0x73E00104402401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulefor_statement4398 = new BitSet(new long[]{0x73C00000400401F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4426 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulefor_statement4438 = new BitSet(new long[]{0x73C00000400401F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_18_in_rulefor_statement4457 = new BitSet(new long[]{0x73C00000400401F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4479 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulefor_statement4492 = new BitSet(new long[]{0x73C00000C00001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4513 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulefor_statement4526 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulefor_statement4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletry_statement_in_entryRuletry_statement4583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletry_statement4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruletry_statement4630 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruletry_statement4651 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_48_in_ruletry_statement4700 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruletry_statement4712 = new BitSet(new long[]{0x0020000400000020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_ruleparameter_in_ruletry_statement4733 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruletry_statement4745 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruletry_statement4766 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_49_in_ruletry_statement4801 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruletry_statement4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitch_statement_in_entryRuleswitch_statement4861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleswitch_statement4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleswitch_statement4908 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleswitch_statement4920 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleswitch_statement4941 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleswitch_statement4953 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleswitch_statement4965 = new BitSet(new long[]{0x73FCF5DC582401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_51_in_ruleswitch_statement4979 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleswitch_statement5000 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleswitch_statement5012 = new BitSet(new long[]{0x73FCF5DC582401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_52_in_ruleswitch_statement5032 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleswitch_statement5044 = new BitSet(new long[]{0x73FCF5DC582401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleswitch_statement5072 = new BitSet(new long[]{0x73FCF5DC582401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_28_in_ruleswitch_statement5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_entryRuleconstructor_declaration5122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstructor_declaration5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_ruleconstructor_declaration5178 = new BitSet(new long[]{0x0020000400000020L,0x0001FE0000000000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstructor_declaration5196 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleconstructor_declaration5213 = new BitSet(new long[]{0x0020000480000020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_ruleparameter_list_in_ruleconstructor_declaration5234 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleconstructor_declaration5247 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruleconstructor_declaration5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatic_initializer_in_entryRulestatic_initializer5304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatic_initializer5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulestatic_initializer5351 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulestatic_initializer5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecreating_expression_in_entryRulecreating_expression5408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecreating_expression5418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulecreating_expression5455 = new BitSet(new long[]{0x0000000040000020L,0x000001FE00000000L});
    public static final BitSet FOLLOW_rulename_in_rulecreating_expression5478 = new BitSet(new long[]{0x0000000148000000L});
    public static final BitSet FOLLOW_rulecreating_aux_in_rulecreating_expression5499 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulecreating_expression5528 = new BitSet(new long[]{0x0000000108000002L});
    public static final BitSet FOLLOW_ruleaux_in_rulecreating_expression5557 = new BitSet(new long[]{0x0000000108000002L});
    public static final BitSet FOLLOW_32_in_rulecreating_expression5572 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulecreating_expression5584 = new BitSet(new long[]{0x0000000108000002L});
    public static final BitSet FOLLOW_30_in_rulecreating_expression5606 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulecreating_expression5627 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulecreating_expression5639 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rulenewBlock_in_rulecreating_expression5662 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleexp_aux_in_entryRuleexp_aux5699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexp_aux5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexp_aux5865 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleexp_aux5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleexp_aux5910 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleexp_aux5921 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexp_aux5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression5979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogical_expression_in_ruleexpression6036 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_rulenumeric_expression_in_ruleexpression6063 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_rulebit_expression_in_ruleexpression6090 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_rulecreating_expression_in_ruleexpression6117 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_ruleliteral_expression_in_ruleexpression6144 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_55_in_ruleexpression6162 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_56_in_ruleexpression6180 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_57_in_ruleexpression6198 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleexpression6221 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_30_in_ruleexpression6245 = new BitSet(new long[]{0x73E00004400001F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_ruleexp_aux_in_ruleexpression6270 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_entryRuleexpression_aux6328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_aux6338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleexpression_aux6378 = new BitSet(new long[]{0x73E00004C00001F0L,0x0001FFFFF0000000L});
    public static final BitSet FOLLOW_rulearglist_in_ruleexpression_aux6399 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleexpression_aux6412 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_ruleaux_in_ruleexpression_aux6444 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_58_in_ruleexpression_aux6462 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux6483 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_26_in_ruleexpression_aux6503 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux6528 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_59_in_ruleexpression_aux6547 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleexpression_aux6578 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_ruleexpression_aux6622 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux6643 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_60_in_ruleexpression_aux6670 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_61_in_ruleexpression_aux6699 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_ruleexpression_aux6758 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_62_in_ruleexpression_aux6782 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_63_in_ruleexpression_aux6819 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_64_in_ruleexpression_aux6856 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_65_in_ruleexpression_aux6893 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_66_in_ruleexpression_aux6930 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_67_in_ruleexpression_aux6967 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_68_in_ruleexpression_aux7004 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_69_in_ruleexpression_aux7041 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7076 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_70_in_ruleexpression_aux7105 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_71_in_ruleexpression_aux7134 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_72_in_ruleexpression_aux7163 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_73_in_ruleexpression_aux7192 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_74_in_ruleexpression_aux7221 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_75_in_ruleexpression_aux7250 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_76_in_ruleexpression_aux7279 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_77_in_ruleexpression_aux7308 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_78_in_ruleexpression_aux7337 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_68_in_ruleexpression_aux7366 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_69_in_ruleexpression_aux7395 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7432 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_79_in_ruleexpression_aux7458 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7492 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleexpression_aux7510 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7544 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_80_in_ruleexpression_aux7572 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_81_in_ruleexpression_aux7601 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_82_in_ruleexpression_aux7630 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_83_in_ruleexpression_aux7659 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_84_in_ruleexpression_aux7688 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_85_in_ruleexpression_aux7717 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7754 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_86_in_ruleexpression_aux7782 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_87_in_ruleexpression_aux7811 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_88_in_ruleexpression_aux7840 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_89_in_ruleexpression_aux7869 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7906 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression_aux7930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemais_aux_in_entryRulemais_aux7967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemais_aux7977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rulemais_aux8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rulemais_aux8057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenewBlock_in_entryRulenewBlock8106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenewBlock8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulenewBlock8153 = new BitSet(new long[]{0x0020000400000020L,0x0001FE0000000000L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_rulenewBlock8178 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulenewBlock8189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecreating_aux_in_entryRulecreating_aux8225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecreating_aux8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulecreating_aux8281 = new BitSet(new long[]{0x73E00004C00001F0L,0x0001FFFFF0000000L});
    public static final BitSet FOLLOW_rulearglist_in_rulecreating_aux8303 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulecreating_aux8316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaux_in_rulecreating_aux8357 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_rulecreating_aux8371 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulecreating_aux8383 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleaux_in_entryRuleaux8422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaux8432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleaux8469 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleaux8490 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleaux8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleliteral_expression_in_entryRuleliteral_expression8538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleliteral_expression8548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleliteral_expression8595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_LITERAL_in_ruleliteral_expression8623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_LITERAL_in_ruleliteral_expression8651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleliteral_expression8679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogical_expression_in_entryRulelogical_expression8720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogical_expression8730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rulelogical_expression8774 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulelogical_expression8808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rulelogical_expression8833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rulelogical_expression8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebit_expression_in_entryRulebit_expression8919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebit_expression8929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rulebit_expression8972 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulebit_expression9006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumeric_expression_in_entryRulenumeric_expression9042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumeric_expression9052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulenumeric_expression9097 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_60_in_rulenumeric_expression9126 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_61_in_rulenumeric_expression9155 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulenumeric_expression9192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearglist_in_entryRulearglist9228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearglist9238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulearglist9285 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_rulearglist9298 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulearglist9319 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_96_in_rulearglist9341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulearglist9352 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_rulearglist9363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rulearglist9392 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulearglist9409 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_rulearglist9427 = new BitSet(new long[]{0x0020000400000020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_ruletype_in_rulearglist9448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulearglist9465 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rulename_in_entryRulename9509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulename9519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulename9561 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_rulename9587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_entryRulepackage_name_aux9623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepackage_name_aux9633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulepackage_name_aux9670 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulepackage_name_aux9687 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_rulepackage_name_aux9713 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_entryRuletype_specifier9750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_specifier9760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruletype_specifier9803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruletype_specifier9840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruletype_specifier9877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruletype_specifier9914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruletype_specifier9951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruletype_specifier9988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruletype_specifier10025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruletype_specifier10062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype10111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype10121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_ruletype10168 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rulename_in_ruletype10195 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruletype10209 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruletype10221 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_entryRuleMODIFIER10259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODIFIER10269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleMODIFIER10312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleMODIFIER10349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleMODIFIER10386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleMODIFIER10423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleMODIFIER10460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleMODIFIER10497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMODIFIER10534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleMODIFIER10571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleMODIFIER10608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleMODIFIER10645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_synpred18_InternalSimpleJava1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_synpred19_InternalSimpleJava1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_synpred39_InternalSimpleJava2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred57_InternalSimpleJava2499 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred57_InternalSimpleJava2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred65_InternalSimpleJava2720 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred65_InternalSimpleJava2732 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred65_InternalSimpleJava2753 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred65_InternalSimpleJava2765 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_rulestatement_in_synpred65_InternalSimpleJava2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_synpred69_InternalSimpleJava2912 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred69_InternalSimpleJava2923 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_rulestatement_in_synpred69_InternalSimpleJava2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred87_InternalSimpleJava3906 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0001FFFEF0000000L});
    public static final BitSet FOLLOW_rulestatement_in_synpred87_InternalSimpleJava3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_synpred89_InternalSimpleJava4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred90_InternalSimpleJava4426 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred90_InternalSimpleJava4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred93_InternalSimpleJava4664 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred93_InternalSimpleJava4668 = new BitSet(new long[]{0x0020000400000020L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_ruleparameter_in_synpred93_InternalSimpleJava4675 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred93_InternalSimpleJava4681 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_synpred93_InternalSimpleJava4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred94_InternalSimpleJava4782 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_synpred94_InternalSimpleJava4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred101_InternalSimpleJava5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenewBlock_in_synpred104_InternalSimpleJava5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred122_InternalSimpleJava5865 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred122_InternalSimpleJava5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred141_InternalSimpleJava6622 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred141_InternalSimpleJava6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred154_InternalSimpleJava6758 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_62_in_synpred154_InternalSimpleJava6782 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_63_in_synpred154_InternalSimpleJava6819 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_64_in_synpred154_InternalSimpleJava6856 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_65_in_synpred154_InternalSimpleJava6893 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_66_in_synpred154_InternalSimpleJava6930 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_67_in_synpred154_InternalSimpleJava6967 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_68_in_synpred154_InternalSimpleJava7004 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_69_in_synpred154_InternalSimpleJava7041 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred154_InternalSimpleJava7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred176_InternalSimpleJava6378 = new BitSet(new long[]{0x73E00004C00001F0L,0x0001FFFFF0000000L});
    public static final BitSet FOLLOW_rulearglist_in_synpred176_InternalSimpleJava6399 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred176_InternalSimpleJava6412 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_ruleaux_in_synpred176_InternalSimpleJava6444 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_58_in_synpred176_InternalSimpleJava6462 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava6483 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_26_in_synpred176_InternalSimpleJava6503 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava6528 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_59_in_synpred176_InternalSimpleJava6547 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_synpred176_InternalSimpleJava6578 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred176_InternalSimpleJava6622 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava6643 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_60_in_synpred176_InternalSimpleJava6670 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_61_in_synpred176_InternalSimpleJava6699 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred176_InternalSimpleJava6758 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_62_in_synpred176_InternalSimpleJava6782 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_63_in_synpred176_InternalSimpleJava6819 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_64_in_synpred176_InternalSimpleJava6856 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_65_in_synpred176_InternalSimpleJava6893 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_66_in_synpred176_InternalSimpleJava6930 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_67_in_synpred176_InternalSimpleJava6967 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_68_in_synpred176_InternalSimpleJava7004 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_69_in_synpred176_InternalSimpleJava7041 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava7076 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_70_in_synpred176_InternalSimpleJava7105 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_71_in_synpred176_InternalSimpleJava7134 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_72_in_synpred176_InternalSimpleJava7163 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_73_in_synpred176_InternalSimpleJava7192 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_74_in_synpred176_InternalSimpleJava7221 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_75_in_synpred176_InternalSimpleJava7250 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_76_in_synpred176_InternalSimpleJava7279 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_77_in_synpred176_InternalSimpleJava7308 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_78_in_synpred176_InternalSimpleJava7337 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_68_in_synpred176_InternalSimpleJava7366 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_69_in_synpred176_InternalSimpleJava7395 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava7432 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_79_in_synpred176_InternalSimpleJava7458 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava7492 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred176_InternalSimpleJava7510 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava7544 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_80_in_synpred176_InternalSimpleJava7572 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_81_in_synpred176_InternalSimpleJava7601 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_82_in_synpred176_InternalSimpleJava7630 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_83_in_synpred176_InternalSimpleJava7659 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_84_in_synpred176_InternalSimpleJava7688 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_85_in_synpred176_InternalSimpleJava7717 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava7754 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_86_in_synpred176_InternalSimpleJava7782 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_87_in_synpred176_InternalSimpleJava7811 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_88_in_synpred176_InternalSimpleJava7840 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_89_in_synpred176_InternalSimpleJava7869 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred176_InternalSimpleJava7906 = new BitSet(new long[]{0xFC00000144000000L,0x000000000FFFFFFFL});
    public static final BitSet FOLLOW_ruleexpression_aux_in_synpred176_InternalSimpleJava7930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred180_InternalSimpleJava8281 = new BitSet(new long[]{0x73E00004C00001F0L,0x0001FFFFF0000000L});
    public static final BitSet FOLLOW_rulearglist_in_synpred180_InternalSimpleJava8303 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred180_InternalSimpleJava8316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred181_InternalSimpleJava8336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred192_InternalSimpleJava9285 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_synpred192_InternalSimpleJava9298 = new BitSet(new long[]{0x73C00000400001F0L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred192_InternalSimpleJava9319 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_58_in_synpred195_InternalSimpleJava9670 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_synpred195_InternalSimpleJava9687 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_synpred195_InternalSimpleJava9713 = new BitSet(new long[]{0x0000000000000002L});

}