package org.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.SimpleJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSimpleJavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_IDENTIFIER", "RULE_DECIMAL_DIGITS", "RULE_INTEGER_LITERAL", "RULE_FLOAT_LITERAL", "RULE_EXPONENT_PART", "RULE_FLOAT_TYPE_SUFFIX", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.*;'", "'/**'", "'*/'", "'class'", "'extends'", "'implements'", "','", "'{'", "'}'", "'interface'", "'('", "')'", "'['", "']'", "'synchronized'", "'return'", "'throw'", "':'", "'break'", "'continue'", "'void'", "'='", "'if'", "'else'", "'do'", "'while'", "'for'", "'try'", "'catch'", "'finally'", "'switch'", "'case'", "'default'", "'static'", "'new'", "'null'", "'super'", "'this'", "'.'", "'instanceof'", "'++'", "'--'", "'-'", "'-='", "'*'", "'*='", "'/'", "'/='", "'%'", "'%='", "'ampersand'", "'ampersand='", "'|'", "'|='", "'^'", "'^='", "'ampersand ampersand'", "'||='", "'?'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'>>='", "'<<'", "'>>'", "'>>>'", "'+'", "'+='", "'!'", "'true'", "'false'", "'~'", "'\"'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'public'", "'private'", "'protected'", "'final'", "'native'", "'abstract'", "'threadsafe'", "'transient'"
    };
    public static final int RULE_ID=12;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_STRING=4;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_DECIMAL_DIGITS=6;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_INTEGER_LITERAL=7;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_EXPONENT_PART=9;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=11;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_IDENTIFIER=5;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_FLOAT_TYPE_SUFFIX=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=15;
    public static final int RULE_FLOAT_LITERAL=8;

    // delegates
    // delegators


        public InternalSimpleJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpleJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpleJavaParser.tokenNames; }
    public String getGrammarFileName() { return "../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g"; }



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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:74:2: (iv_ruleModel= ruleModel EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:75:2: iv_ruleModel= ruleModel EOF
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:82:1: ruleModel returns [EObject current=null] : ( (lv_comp_0_0= rulecompilation_unit ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_comp_0_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:85:28: ( ( (lv_comp_0_0= rulecompilation_unit ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:86:1: ( (lv_comp_0_0= rulecompilation_unit ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:86:1: ( (lv_comp_0_0= rulecompilation_unit ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:87:1: (lv_comp_0_0= rulecompilation_unit )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:87:1: (lv_comp_0_0= rulecompilation_unit )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:88:3: lv_comp_0_0= rulecompilation_unit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getCompCompilation_unitParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_rulecompilation_unit_in_ruleModel136);
            lv_comp_0_0=rulecompilation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		add(
                     			current, 
                     			"comp",
                      		lv_comp_0_0, 
                      		"compilation_unit");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulecompilation_unit"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:112:1: entryRulecompilation_unit returns [EObject current=null] : iv_rulecompilation_unit= rulecompilation_unit EOF ;
    public final EObject entryRulecompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompilation_unit = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:113:2: (iv_rulecompilation_unit= rulecompilation_unit EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:114:2: iv_rulecompilation_unit= rulecompilation_unit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompilation_unitRule()); 
            }
            pushFollow(FOLLOW_rulecompilation_unit_in_entryRulecompilation_unit171);
            iv_rulecompilation_unit=rulecompilation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompilation_unit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecompilation_unit181); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:121:1: rulecompilation_unit returns [EObject current=null] : ( ( (lv_pacote_0_0= rulepackage_statement ) )? ( (lv_importes_1_0= ruleimport_statement ) )* ( (lv_declaracao_2_0= ruletype_declaration ) )* ) ;
    public final EObject rulecompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject lv_pacote_0_0 = null;

        EObject lv_importes_1_0 = null;

        EObject lv_declaracao_2_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:124:28: ( ( ( (lv_pacote_0_0= rulepackage_statement ) )? ( (lv_importes_1_0= ruleimport_statement ) )* ( (lv_declaracao_2_0= ruletype_declaration ) )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:125:1: ( ( (lv_pacote_0_0= rulepackage_statement ) )? ( (lv_importes_1_0= ruleimport_statement ) )* ( (lv_declaracao_2_0= ruletype_declaration ) )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:125:1: ( ( (lv_pacote_0_0= rulepackage_statement ) )? ( (lv_importes_1_0= ruleimport_statement ) )* ( (lv_declaracao_2_0= ruletype_declaration ) )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:125:2: ( (lv_pacote_0_0= rulepackage_statement ) )? ( (lv_importes_1_0= ruleimport_statement ) )* ( (lv_declaracao_2_0= ruletype_declaration ) )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:125:2: ( (lv_pacote_0_0= rulepackage_statement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:126:1: (lv_pacote_0_0= rulepackage_statement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:126:1: (lv_pacote_0_0= rulepackage_statement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:127:3: lv_pacote_0_0= rulepackage_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getPacotePackage_statementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulepackage_statement_in_rulecompilation_unit227);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:143:3: ( (lv_importes_1_0= ruleimport_statement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:144:1: (lv_importes_1_0= ruleimport_statement )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:144:1: (lv_importes_1_0= ruleimport_statement )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:145:3: lv_importes_1_0= ruleimport_statement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getImportesImport_statementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleimport_statement_in_rulecompilation_unit249);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:161:3: ( (lv_declaracao_2_0= ruletype_declaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21||LA3_0==23||LA3_0==29||LA3_0==34||LA3_0==53||(LA3_0>=104 && LA3_0<=111)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:162:1: (lv_declaracao_2_0= ruletype_declaration )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:162:1: (lv_declaracao_2_0= ruletype_declaration )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:163:3: lv_declaracao_2_0= ruletype_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getDeclaracaoType_declarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruletype_declaration_in_rulecompilation_unit271);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:187:1: entryRulepackage_statement returns [EObject current=null] : iv_rulepackage_statement= rulepackage_statement EOF ;
    public final EObject entryRulepackage_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepackage_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:188:2: (iv_rulepackage_statement= rulepackage_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:189:2: iv_rulepackage_statement= rulepackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_rulepackage_statement_in_entryRulepackage_statement308);
            iv_rulepackage_statement=rulepackage_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepackage_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepackage_statement318); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:196:1: rulepackage_statement returns [EObject current=null] : (otherlv_0= 'package' ( (lv_noomePacote_1_0= rulename ) ) otherlv_2= ';' ) ;
    public final EObject rulepackage_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_noomePacote_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:199:28: ( (otherlv_0= 'package' ( (lv_noomePacote_1_0= rulename ) ) otherlv_2= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:200:1: (otherlv_0= 'package' ( (lv_noomePacote_1_0= rulename ) ) otherlv_2= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:200:1: (otherlv_0= 'package' ( (lv_noomePacote_1_0= rulename ) ) otherlv_2= ';' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:200:3: otherlv_0= 'package' ( (lv_noomePacote_1_0= rulename ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulepackage_statement355); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackage_statementAccess().getPackageKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:204:1: ( (lv_noomePacote_1_0= rulename ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:205:1: (lv_noomePacote_1_0= rulename )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:205:1: (lv_noomePacote_1_0= rulename )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:206:3: lv_noomePacote_1_0= rulename
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackage_statementAccess().getNoomePacoteNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulename_in_rulepackage_statement376);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulepackage_statement388); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:234:1: entryRuleimport_statement returns [EObject current=null] : iv_ruleimport_statement= ruleimport_statement EOF ;
    public final EObject entryRuleimport_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleimport_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:235:2: (iv_ruleimport_statement= ruleimport_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:236:2: iv_ruleimport_statement= ruleimport_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_ruleimport_statement_in_entryRuleimport_statement424);
            iv_ruleimport_statement=ruleimport_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleimport_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleimport_statement434); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:243:1: ruleimport_statement returns [EObject current=null] : (otherlv_0= 'import' ( (lv_nomeImporte_1_0= rulename ) ) (otherlv_2= '.*;' | otherlv_3= ';' ) ) ;
    public final EObject ruleimport_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_nomeImporte_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:246:28: ( (otherlv_0= 'import' ( (lv_nomeImporte_1_0= rulename ) ) (otherlv_2= '.*;' | otherlv_3= ';' ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:247:1: (otherlv_0= 'import' ( (lv_nomeImporte_1_0= rulename ) ) (otherlv_2= '.*;' | otherlv_3= ';' ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:247:1: (otherlv_0= 'import' ( (lv_nomeImporte_1_0= rulename ) ) (otherlv_2= '.*;' | otherlv_3= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:247:3: otherlv_0= 'import' ( (lv_nomeImporte_1_0= rulename ) ) (otherlv_2= '.*;' | otherlv_3= ';' )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleimport_statement471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImport_statementAccess().getImportKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:251:1: ( (lv_nomeImporte_1_0= rulename ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:252:1: (lv_nomeImporte_1_0= rulename )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:252:1: (lv_nomeImporte_1_0= rulename )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:253:3: lv_nomeImporte_1_0= rulename
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImport_statementAccess().getNomeImporteNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulename_in_ruleimport_statement492);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:269:2: (otherlv_2= '.*;' | otherlv_3= ';' )
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:269:4: otherlv_2= '.*;'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleimport_statement505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_2_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:274:7: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleimport_statement523); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:286:1: entryRuletype_declaration returns [EObject current=null] : iv_ruletype_declaration= ruletype_declaration EOF ;
    public final EObject entryRuletype_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:287:2: (iv_ruletype_declaration= ruletype_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:288:2: iv_ruletype_declaration= ruletype_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_declarationRule()); 
            }
            pushFollow(FOLLOW_ruletype_declaration_in_entryRuletype_declaration560);
            iv_ruletype_declaration=ruletype_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_declaration570); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:295:1: ruletype_declaration returns [EObject current=null] : ( (this_doc_comment_0= ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) ) ) ;
    public final EObject ruletype_declaration() throws RecognitionException {
        EObject current = null;

        EObject this_doc_comment_0 = null;

        EObject lv_declaracaoClasse_1_0 = null;

        EObject lv_declaracaoInterface_2_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:298:28: ( ( (this_doc_comment_0= ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:299:1: ( (this_doc_comment_0= ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:299:1: ( (this_doc_comment_0= ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:299:2: (this_doc_comment_0= ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:299:2: (this_doc_comment_0= ruledoc_comment )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:300:2: this_doc_comment_0= ruledoc_comment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_declarationAccess().getDoc_commentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruledoc_comment_in_ruletype_declaration621);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:311:3: ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:311:4: ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:311:4: ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:312:1: (lv_declaracaoClasse_1_0= ruleclass_declaration )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:312:1: (lv_declaracaoClasse_1_0= ruleclass_declaration )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:313:3: lv_declaracaoClasse_1_0= ruleclass_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getDeclaracaoClasseClass_declarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleclass_declaration_in_ruletype_declaration644);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:330:6: ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:330:6: ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:331:1: (lv_declaracaoInterface_2_0= ruleinterface_declaration )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:331:1: (lv_declaracaoInterface_2_0= ruleinterface_declaration )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:332:3: lv_declaracaoInterface_2_0= ruleinterface_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getDeclaracaoInterfaceInterface_declarationParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleinterface_declaration_in_ruletype_declaration671);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:356:1: entryRuledoc_comment returns [EObject current=null] : iv_ruledoc_comment= ruledoc_comment EOF ;
    public final EObject entryRuledoc_comment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledoc_comment = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:357:2: (iv_ruledoc_comment= ruledoc_comment EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:358:2: iv_ruledoc_comment= ruledoc_comment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoc_commentRule()); 
            }
            pushFollow(FOLLOW_ruledoc_comment_in_entryRuledoc_comment708);
            iv_ruledoc_comment=ruledoc_comment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledoc_comment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledoc_comment718); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:365:1: ruledoc_comment returns [EObject current=null] : (otherlv_0= '/**' ( (lv_comentario_1_0= RULE_STRING ) ) otherlv_2= '*/' ) ;
    public final EObject ruledoc_comment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_comentario_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:368:28: ( (otherlv_0= '/**' ( (lv_comentario_1_0= RULE_STRING ) ) otherlv_2= '*/' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:369:1: (otherlv_0= '/**' ( (lv_comentario_1_0= RULE_STRING ) ) otherlv_2= '*/' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:369:1: (otherlv_0= '/**' ( (lv_comentario_1_0= RULE_STRING ) ) otherlv_2= '*/' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:369:3: otherlv_0= '/**' ( (lv_comentario_1_0= RULE_STRING ) ) otherlv_2= '*/'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruledoc_comment755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDoc_commentAccess().getSolidusAsteriskAsteriskKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:373:1: ( (lv_comentario_1_0= RULE_STRING ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:374:1: (lv_comentario_1_0= RULE_STRING )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:374:1: (lv_comentario_1_0= RULE_STRING )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:375:3: lv_comentario_1_0= RULE_STRING
            {
            lv_comentario_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruledoc_comment772); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruledoc_comment789); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:403:1: entryRuleclass_declaration returns [EObject current=null] : iv_ruleclass_declaration= ruleclass_declaration EOF ;
    public final EObject entryRuleclass_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleclass_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:404:2: (iv_ruleclass_declaration= ruleclass_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:405:2: iv_ruleclass_declaration= ruleclass_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleclass_declaration_in_entryRuleclass_declaration825);
            iv_ruleclass_declaration=ruleclass_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleclass_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleclass_declaration835); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:412:1: ruleclass_declaration returns [EObject current=null] : ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}' ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:415:28: ( ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:416:1: ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:416:1: ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:416:2: ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}'
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:416:2: ( (lv_modificadores_0_0= ruleMODIFIER ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34||LA7_0==53||(LA7_0>=104 && LA7_0<=111)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:417:1: (lv_modificadores_0_0= ruleMODIFIER )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:417:1: (lv_modificadores_0_0= ruleMODIFIER )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:418:3: lv_modificadores_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getModificadoresMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_ruleclass_declaration881);
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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleclass_declaration894); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClass_declarationAccess().getClassKeyword_1());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:438:1: ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:439:1: (lv_nomeClasse_2_0= RULE_IDENTIFIER )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:439:1: (lv_nomeClasse_2_0= RULE_IDENTIFIER )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:440:3: lv_nomeClasse_2_0= RULE_IDENTIFIER
            {
            lv_nomeClasse_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleclass_declaration911); if (state.failed) return current;
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:456:2: (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:456:4: otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleclass_declaration929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:460:1: ( (lv_superclasse_4_0= rulename ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:461:1: (lv_superclasse_4_0= rulename )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:461:1: (lv_superclasse_4_0= rulename )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:462:3: lv_superclasse_4_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getSuperclasseNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_ruleclass_declaration950);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:478:4: (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:478:6: otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )*
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleclass_declaration965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:482:1: ( (lv_implementosClasse_6_0= rulename ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:483:1: (lv_implementosClasse_6_0= rulename )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:483:1: (lv_implementosClasse_6_0= rulename )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:484:3: lv_implementosClasse_6_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementosClasseNameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_ruleclass_declaration986);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:500:2: (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==26) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:500:4: otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) )
                    	    {
                    	    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleclass_declaration999); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:504:1: ( (lv_implementosClasse_8_0= rulename ) )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:505:1: (lv_implementosClasse_8_0= rulename )
                    	    {
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:505:1: (lv_implementosClasse_8_0= rulename )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:506:3: lv_implementosClasse_8_0= rulename
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementosClasseNameParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulename_in_ruleclass_declaration1020);
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

            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleclass_declaration1036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:526:1: ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )*
            loop11:
            do {
                int alt11=3;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:526:2: ( (lv_corpoClasse_10_0= rulefield_declaration ) )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:526:2: ( (lv_corpoClasse_10_0= rulefield_declaration ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:527:1: (lv_corpoClasse_10_0= rulefield_declaration )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:527:1: (lv_corpoClasse_10_0= rulefield_declaration )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:528:3: lv_corpoClasse_10_0= rulefield_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getCorpoClasseField_declarationParserRuleCall_6_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulefield_declaration_in_ruleclass_declaration1058);
            	    lv_corpoClasse_10_0=rulefield_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
            	      	        }
            	             		set(
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
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:545:6: ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:545:6: ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:546:1: (lv_declaracaoClasse_11_0= ruleclass_declaration )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:546:1: (lv_declaracaoClasse_11_0= ruleclass_declaration )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:547:3: lv_declaracaoClasse_11_0= ruleclass_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getDeclaracaoClasseClass_declarationParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleclass_declaration_in_ruleclass_declaration1085);
            	    lv_declaracaoClasse_11_0=ruleclass_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
            	      	        }
            	             		set(
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

            otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleclass_declaration1099); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:575:1: entryRuleinterface_declaration returns [EObject current=null] : iv_ruleinterface_declaration= ruleinterface_declaration EOF ;
    public final EObject entryRuleinterface_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinterface_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:576:2: (iv_ruleinterface_declaration= ruleinterface_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:577:2: iv_ruleinterface_declaration= ruleinterface_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleinterface_declaration_in_entryRuleinterface_declaration1135);
            iv_ruleinterface_declaration=ruleinterface_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinterface_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleinterface_declaration1145); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:584:1: ruleinterface_declaration returns [EObject current=null] : ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}' ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:587:28: ( ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:588:1: ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:588:1: ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:588:2: ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}'
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:588:2: ( (lv_modificadores_0_0= ruleMODIFIER ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34||LA12_0==53||(LA12_0>=104 && LA12_0<=111)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:589:1: (lv_modificadores_0_0= ruleMODIFIER )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:589:1: (lv_modificadores_0_0= ruleMODIFIER )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:590:3: lv_modificadores_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getModificadoresMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_ruleinterface_declaration1191);
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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleinterface_declaration1204); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:610:1: ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:611:1: (lv_nomeInterface_2_0= RULE_IDENTIFIER )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:611:1: (lv_nomeInterface_2_0= RULE_IDENTIFIER )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:612:3: lv_nomeInterface_2_0= RULE_IDENTIFIER
            {
            lv_nomeInterface_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleinterface_declaration1221); if (state.failed) return current;
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:628:2: (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:628:4: otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )*
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleinterface_declaration1239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:632:1: ( (lv_superinterfaces_4_0= rulename ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:633:1: (lv_superinterfaces_4_0= rulename )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:633:1: (lv_superinterfaces_4_0= rulename )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:634:3: lv_superinterfaces_4_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getSuperinterfacesNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_ruleinterface_declaration1260);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:650:2: (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==26) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:650:4: otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleinterface_declaration1273); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:654:1: ( (lv_superinterfaces_6_0= rulename ) )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:655:1: (lv_superinterfaces_6_0= rulename )
                    	    {
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:655:1: (lv_superinterfaces_6_0= rulename )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:656:3: lv_superinterfaces_6_0= rulename
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getSuperinterfacesNameParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulename_in_ruleinterface_declaration1294);
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

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleinterface_declaration1310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:676:1: ( (lv_corpoInterface_8_0= rulefield_declaration ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_IDENTIFIER||LA15_0==18||LA15_0==21||LA15_0==30||LA15_0==34||LA15_0==40||LA15_0==53||(LA15_0>=96 && LA15_0<=111)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:677:1: (lv_corpoInterface_8_0= rulefield_declaration )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:677:1: (lv_corpoInterface_8_0= rulefield_declaration )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:678:3: lv_corpoInterface_8_0= rulefield_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getCorpoInterfaceField_declarationParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulefield_declaration_in_ruleinterface_declaration1331);
            	    lv_corpoInterface_8_0=rulefield_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
            	      	        }
            	             		set(
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

            otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleinterface_declaration1344); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:706:1: entryRulefield_declaration returns [EObject current=null] : iv_rulefield_declaration= rulefield_declaration EOF ;
    public final EObject entryRulefield_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:707:2: (iv_rulefield_declaration= rulefield_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:708:2: iv_rulefield_declaration= rulefield_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_declarationRule()); 
            }
            pushFollow(FOLLOW_rulefield_declaration_in_entryRulefield_declaration1380);
            iv_rulefield_declaration=rulefield_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefield_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_declaration1390); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:715:1: rulefield_declaration returns [EObject current=null] : ( ( ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) ) | ( (lv_estatico_4_0= rulestatic_initializer ) ) | otherlv_5= ';' ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:718:28: ( ( ( ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) ) | ( (lv_estatico_4_0= rulestatic_initializer ) ) | otherlv_5= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:719:1: ( ( ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) ) | ( (lv_estatico_4_0= rulestatic_initializer ) ) | otherlv_5= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:719:1: ( ( ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) ) | ( (lv_estatico_4_0= rulestatic_initializer ) ) | otherlv_5= ';' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
            case 21:
            case 30:
            case 34:
            case 40:
            case 96:
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
                {
                alt18=1;
                }
                break;
            case 53:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==27) ) {
                    alt18=2;
                }
                else if ( (LA18_2==RULE_IDENTIFIER||LA18_2==30||LA18_2==34||LA18_2==40||LA18_2==53||(LA18_2>=96 && LA18_2<=111)) ) {
                    alt18=1;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:719:2: ( ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:719:2: ( ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:719:3: ( (lv_comentario_0_0= ruledoc_comment ) )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:719:3: ( (lv_comentario_0_0= ruledoc_comment ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==21) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:720:1: (lv_comentario_0_0= ruledoc_comment )
                    	    {
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:720:1: (lv_comentario_0_0= ruledoc_comment )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:721:3: lv_comentario_0_0= ruledoc_comment
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getField_declarationAccess().getComentarioDoc_commentParserRuleCall_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruledoc_comment_in_rulefield_declaration1437);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:737:3: ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) )
                    int alt17=3;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:737:4: ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:737:4: ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:738:1: (lv_declaracaoMetodo_1_0= rulemethod_declaration )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:738:1: (lv_declaracaoMetodo_1_0= rulemethod_declaration )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:739:3: lv_declaracaoMetodo_1_0= rulemethod_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoMetodoMethod_declarationParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulemethod_declaration_in_rulefield_declaration1460);
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
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:756:6: ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:756:6: ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:757:1: (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:757:1: (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:758:3: lv_declaracaoConstrutor_2_0= ruleconstructor_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoConstrutorConstructor_declarationParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleconstructor_declaration_in_rulefield_declaration1487);
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
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:775:6: ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:775:6: ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:776:1: (lv_declaracaoVariavel_3_0= rulevariable_declaration )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:776:1: (lv_declaracaoVariavel_3_0= rulevariable_declaration )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:777:3: lv_declaracaoVariavel_3_0= rulevariable_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulevariable_declaration_in_rulefield_declaration1514);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:794:6: ( (lv_estatico_4_0= rulestatic_initializer ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:794:6: ( (lv_estatico_4_0= rulestatic_initializer ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:795:1: (lv_estatico_4_0= rulestatic_initializer )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:795:1: (lv_estatico_4_0= rulestatic_initializer )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:796:3: lv_estatico_4_0= rulestatic_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getField_declarationAccess().getEstaticoStatic_initializerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatic_initializer_in_rulefield_declaration1543);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:813:7: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulefield_declaration1561); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:825:1: entryRulemethod_declaration returns [EObject current=null] : iv_rulemethod_declaration= rulemethod_declaration EOF ;
    public final EObject entryRulemethod_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemethod_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:826:2: (iv_rulemethod_declaration= rulemethod_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:827:2: iv_rulemethod_declaration= rulemethod_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            }
            pushFollow(FOLLOW_rulemethod_declaration_in_entryRulemethod_declaration1597);
            iv_rulemethod_declaration=rulemethod_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemethod_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemethod_declaration1607); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:834:1: rulemethod_declaration returns [EObject current=null] : ( ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:837:28: ( ( ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:838:1: ( ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:838:1: ( ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:838:2: ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:838:2: ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34||LA19_0==53||(LA19_0>=104 && LA19_0<=111)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:839:1: (lv_modificadorMetodo_0_0= ruleMODIFIER )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:839:1: (lv_modificadorMetodo_0_0= ruleMODIFIER )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:840:3: lv_modificadorMetodo_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getModificadorMetodoMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_rulemethod_declaration1653);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:856:3: ( (lv_tipoRetorno_1_0= ruletype ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:857:1: (lv_tipoRetorno_1_0= ruletype )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:857:1: (lv_tipoRetorno_1_0= ruletype )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:858:3: lv_tipoRetorno_1_0= ruletype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getTipoRetornoTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_in_rulemethod_declaration1675);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:874:2: ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:875:1: (lv_nomeMetodo_2_0= RULE_IDENTIFIER )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:875:1: (lv_nomeMetodo_2_0= RULE_IDENTIFIER )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:876:3: lv_nomeMetodo_2_0= RULE_IDENTIFIER
            {
            lv_nomeMetodo_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulemethod_declaration1692); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_rulemethod_declaration1709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:896:1: ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENTIFIER||(LA20_0>=96 && LA20_0<=103)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:897:1: (lv_parametrosMetodo_4_0= ruleparameter_list )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:897:1: (lv_parametrosMetodo_4_0= ruleparameter_list )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:898:3: lv_parametrosMetodo_4_0= ruleparameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getParametrosMetodoParameter_listParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleparameter_list_in_rulemethod_declaration1730);
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

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_rulemethod_declaration1743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:918:1: (otherlv_6= '[' otherlv_7= ']' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:918:3: otherlv_6= '[' otherlv_7= ']'
            	    {
            	    otherlv_6=(Token)match(input,32,FOLLOW_32_in_rulemethod_declaration1756); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketKeyword_6_0());
            	          
            	    }
            	    otherlv_7=(Token)match(input,33,FOLLOW_33_in_rulemethod_declaration1768); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMethod_declarationAccess().getRightSquareBracketKeyword_6_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:926:3: ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' )
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:926:4: ( (lv_blocoMetodo_8_0= rulestatement_block ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:926:4: ( (lv_blocoMetodo_8_0= rulestatement_block ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:927:1: (lv_blocoMetodo_8_0= rulestatement_block )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:927:1: (lv_blocoMetodo_8_0= rulestatement_block )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:928:3: lv_blocoMetodo_8_0= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getBlocoMetodoStatement_blockParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_rulemethod_declaration1792);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:945:7: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_rulemethod_declaration1810); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:957:1: entryRuleparameter returns [EObject current=null] : iv_ruleparameter= ruleparameter EOF ;
    public final EObject entryRuleparameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:958:2: (iv_ruleparameter= ruleparameter EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:959:2: iv_ruleparameter= ruleparameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleparameter_in_entryRuleparameter1847);
            iv_ruleparameter=ruleparameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter1857); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:966:1: ruleparameter returns [EObject current=null] : ( ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )* ) ;
    public final EObject ruleparameter() throws RecognitionException {
        EObject current = null;

        Token lv_nomeParametro_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_tipoParametro_0_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:969:28: ( ( ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:970:1: ( ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:970:1: ( ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:970:2: ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:970:2: ( (lv_tipoParametro_0_0= ruletype ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:971:1: (lv_tipoParametro_0_0= ruletype )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:971:1: (lv_tipoParametro_0_0= ruletype )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:972:3: lv_tipoParametro_0_0= ruletype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTipoParametroTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_in_ruleparameter1903);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:988:2: ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:989:1: (lv_nomeParametro_1_0= RULE_IDENTIFIER )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:989:1: (lv_nomeParametro_1_0= RULE_IDENTIFIER )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:990:3: lv_nomeParametro_1_0= RULE_IDENTIFIER
            {
            lv_nomeParametro_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleparameter1920); if (state.failed) return current;
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1006:2: (otherlv_2= '[' otherlv_3= ']' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1006:4: otherlv_2= '[' otherlv_3= ']'
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleparameter1938); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleparameter1950); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1022:1: entryRuleparameter_list returns [EObject current=null] : iv_ruleparameter_list= ruleparameter_list EOF ;
    public final EObject entryRuleparameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_list = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1023:2: (iv_ruleparameter_list= ruleparameter_list EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1024:2: iv_ruleparameter_list= ruleparameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_ruleparameter_list_in_entryRuleparameter_list1988);
            iv_ruleparameter_list=ruleparameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_list1998); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1031:1: ruleparameter_list returns [EObject current=null] : ( ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )* ) ;
    public final EObject ruleparameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parametros_0_0 = null;

        EObject lv_parametros_2_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1034:28: ( ( ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1035:1: ( ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1035:1: ( ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1035:2: ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1035:2: ( (lv_parametros_0_0= ruleparameter ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1036:1: (lv_parametros_0_0= ruleparameter )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1036:1: (lv_parametros_0_0= ruleparameter )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1037:3: lv_parametros_0_0= ruleparameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametrosParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparameter_in_ruleparameter_list2044);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1053:2: (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==26) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1053:4: otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleparameter_list2057); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1057:1: ( (lv_parametros_2_0= ruleparameter ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1058:1: (lv_parametros_2_0= ruleparameter )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1058:1: (lv_parametros_2_0= ruleparameter )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1059:3: lv_parametros_2_0= ruleparameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametrosParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleparameter_in_ruleparameter_list2078);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1083:1: entryRulestatement_block returns [EObject current=null] : iv_rulestatement_block= rulestatement_block EOF ;
    public final EObject entryRulestatement_block() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_block = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1084:2: (iv_rulestatement_block= rulestatement_block EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1085:2: iv_rulestatement_block= rulestatement_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_blockRule()); 
            }
            pushFollow(FOLLOW_rulestatement_block_in_entryRulestatement_block2116);
            iv_rulestatement_block=rulestatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement_block; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_block2126); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1092:1: rulestatement_block returns [EObject current=null] : (otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}' ) ;
    public final EObject rulestatement_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_corpo_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1095:28: ( (otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1096:1: (otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1096:1: (otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1096:3: otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulestatement_block2163); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1100:1: ( (lv_corpo_1_0= rulestatement ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_FLOAT_LITERAL)||LA25_0==18||LA25_0==27||LA25_0==30||(LA25_0>=34 && LA25_0<=36)||(LA25_0>=38 && LA25_0<=40)||LA25_0==42||(LA25_0>=44 && LA25_0<=47)||LA25_0==50||(LA25_0>=53 && LA25_0<=57)||(LA25_0>=60 && LA25_0<=62)||(LA25_0>=91 && LA25_0<=94)||(LA25_0>=96 && LA25_0<=111)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1101:1: (lv_corpo_1_0= rulestatement )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1101:1: (lv_corpo_1_0= rulestatement )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1102:3: lv_corpo_1_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatement_blockAccess().getCorpoStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_block2184);
            	    lv_corpo_1_0=rulestatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatement_blockRule());
            	      	        }
            	             		set(
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulestatement_block2197); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1130:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1131:2: (iv_rulestatement= rulestatement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1132:2: iv_rulestatement= rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement2233);
            iv_rulestatement=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement2243); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1139:1: rulestatement returns [EObject current=null] : ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_bloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' ) ;
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

        EObject lv_bloco_3_0 = null;

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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1142:28: ( ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_bloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1143:1: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_bloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1143:1: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_bloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' )
            int alt29=16;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1143:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1143:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1143:3: ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1154:1: (lv_declaracaoVariavel_0_0= rulevariable_declaration )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1155:3: lv_declaracaoVariavel_0_0= rulevariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulevariable_declaration_in_rulestatement2359);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';'
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:8: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1185:1: (lv_expressao_1_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1186:3: lv_expressao_1_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressaoExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement2496);
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

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulestatement2508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1207:6: ( (lv_bloco_3_0= rulestatement_block ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1207:6: ( (lv_bloco_3_0= rulestatement_block ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1208:1: (lv_bloco_3_0= rulestatement_block )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1208:1: (lv_bloco_3_0= rulestatement_block )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1209:3: lv_bloco_3_0= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getBlocoStatement_blockParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_rulestatement2536);
                    lv_bloco_3_0=rulestatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"bloco",
                              		lv_bloco_3_0, 
                              		"statement_block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1226:6: ( (lv_corpoIf_4_0= ruleif_statement ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1226:6: ( (lv_corpoIf_4_0= ruleif_statement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1227:1: (lv_corpoIf_4_0= ruleif_statement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1227:1: (lv_corpoIf_4_0= ruleif_statement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1228:3: lv_corpoIf_4_0= ruleif_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoIfIf_statementParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleif_statement_in_rulestatement2563);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1245:6: ( (lv_corpoDoWhile_5_0= ruledo_statement ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1245:6: ( (lv_corpoDoWhile_5_0= ruledo_statement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1246:1: (lv_corpoDoWhile_5_0= ruledo_statement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1246:1: (lv_corpoDoWhile_5_0= ruledo_statement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1247:3: lv_corpoDoWhile_5_0= ruledo_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoDoWhileDo_statementParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledo_statement_in_rulestatement2590);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1264:6: ( (lv_corpoWhile_6_0= rulewhile_statement ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1264:6: ( (lv_corpoWhile_6_0= rulewhile_statement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1265:1: (lv_corpoWhile_6_0= rulewhile_statement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1265:1: (lv_corpoWhile_6_0= rulewhile_statement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1266:3: lv_corpoWhile_6_0= rulewhile_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoWhileWhile_statementParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulewhile_statement_in_rulestatement2617);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1283:6: ( (lv_corpoFor_7_0= rulefor_statement ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1283:6: ( (lv_corpoFor_7_0= rulefor_statement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1284:1: (lv_corpoFor_7_0= rulefor_statement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1284:1: (lv_corpoFor_7_0= rulefor_statement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1285:3: lv_corpoFor_7_0= rulefor_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoForFor_statementParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefor_statement_in_rulestatement2644);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1302:6: ( (lv_corpoTryCatch_8_0= ruletry_statement ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1302:6: ( (lv_corpoTryCatch_8_0= ruletry_statement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1303:1: (lv_corpoTryCatch_8_0= ruletry_statement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1303:1: (lv_corpoTryCatch_8_0= ruletry_statement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1304:3: lv_corpoTryCatch_8_0= ruletry_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoTryCatchTry_statementParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletry_statement_in_rulestatement2671);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1321:6: ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1321:6: ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1322:1: (lv_corpoSwitchCase_9_0= ruleswitch_statement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1322:1: (lv_corpoSwitchCase_9_0= ruleswitch_statement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1323:3: lv_corpoSwitchCase_9_0= ruleswitch_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoSwitchCaseSwitch_statementParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleswitch_statement_in_rulestatement2698);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1340:6: (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1340:6: (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1340:8: otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) )
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_34_in_rulestatement2717); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getSynchronizedKeyword_9_0());
                          
                    }
                    otherlv_11=(Token)match(input,30,FOLLOW_30_in_rulestatement2729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_9_1());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1348:1: ( (lv_expressaoSynchronized_12_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1349:1: (lv_expressaoSynchronized_12_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1349:1: (lv_expressaoSynchronized_12_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1350:3: lv_expressaoSynchronized_12_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressaoSynchronizedExpressionParserRuleCall_9_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement2750);
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

                    otherlv_13=(Token)match(input,31,FOLLOW_31_in_rulestatement2762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getRightParenthesisKeyword_9_3());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1370:1: ( (lv_corpoSynchronize_14_0= rulestatement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1371:1: (lv_corpoSynchronize_14_0= rulestatement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1371:1: (lv_corpoSynchronize_14_0= rulestatement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1372:3: lv_corpoSynchronize_14_0= rulestatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoSynchronizeStatementParserRuleCall_9_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement2783);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1389:6: (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1389:6: (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1389:8: otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';'
                    {
                    otherlv_15=(Token)match(input,35,FOLLOW_35_in_rulestatement2803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getReturnKeyword_10_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1393:1: ( (lv_return_16_0= ruleexpression ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_FLOAT_LITERAL)||LA26_0==30||(LA26_0>=54 && LA26_0<=57)||(LA26_0>=60 && LA26_0<=62)||(LA26_0>=91 && LA26_0<=94)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1394:1: (lv_return_16_0= ruleexpression )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1394:1: (lv_return_16_0= ruleexpression )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1395:3: lv_return_16_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getReturnExpressionParserRuleCall_10_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpression_in_rulestatement2824);
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

                    otherlv_17=(Token)match(input,18,FOLLOW_18_in_rulestatement2837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getStatementAccess().getSemicolonKeyword_10_2());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1416:6: (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1416:6: (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1416:8: otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';'
                    {
                    otherlv_18=(Token)match(input,36,FOLLOW_36_in_rulestatement2857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getStatementAccess().getThrowKeyword_11_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1420:1: ( (lv_exececao_19_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1421:1: (lv_exececao_19_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1421:1: (lv_exececao_19_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1422:3: lv_exececao_19_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExececaoExpressionParserRuleCall_11_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement2878);
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

                    otherlv_20=(Token)match(input,18,FOLLOW_18_in_rulestatement2890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getStatementAccess().getSemicolonKeyword_11_2());
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1443:6: (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1443:6: (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1443:7: this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement
                    {
                    this_IDENTIFIER_21=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement2909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENTIFIER_21, grammarAccess.getStatementAccess().getIDENTIFIERTerminalRuleCall_12_0()); 
                          
                    }
                    otherlv_22=(Token)match(input,37,FOLLOW_37_in_rulestatement2920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getStatementAccess().getColonKeyword_12_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatementParserRuleCall_12_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement2945);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1464:6: (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1464:6: (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1464:8: otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';'
                    {
                    otherlv_24=(Token)match(input,38,FOLLOW_38_in_rulestatement2964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getStatementAccess().getBreakKeyword_13_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1468:1: ( (lv_break_25_0= RULE_IDENTIFIER ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_IDENTIFIER) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1469:1: (lv_break_25_0= RULE_IDENTIFIER )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1469:1: (lv_break_25_0= RULE_IDENTIFIER )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1470:3: lv_break_25_0= RULE_IDENTIFIER
                            {
                            lv_break_25_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement2981); if (state.failed) return current;
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

                    otherlv_26=(Token)match(input,18,FOLLOW_18_in_rulestatement2999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getStatementAccess().getSemicolonKeyword_13_2());
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1491:6: (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1491:6: (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1491:8: otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';'
                    {
                    otherlv_27=(Token)match(input,39,FOLLOW_39_in_rulestatement3019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getStatementAccess().getContinueKeyword_14_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1495:1: ( (lv_continue_28_0= RULE_IDENTIFIER ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_IDENTIFIER) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1496:1: (lv_continue_28_0= RULE_IDENTIFIER )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1496:1: (lv_continue_28_0= RULE_IDENTIFIER )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1497:3: lv_continue_28_0= RULE_IDENTIFIER
                            {
                            lv_continue_28_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement3036); if (state.failed) return current;
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

                    otherlv_29=(Token)match(input,18,FOLLOW_18_in_rulestatement3054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getStatementAccess().getSemicolonKeyword_14_2());
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1518:7: otherlv_30= ';'
                    {
                    otherlv_30=(Token)match(input,18,FOLLOW_18_in_rulestatement3073); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1530:1: entryRulevariable_declaration returns [EObject current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final EObject entryRulevariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1531:2: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1532:2: iv_rulevariable_declaration= rulevariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration3109);
            iv_rulevariable_declaration=rulevariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration3119); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1539:1: rulevariable_declaration returns [EObject current=null] : ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1542:28: ( ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1543:1: ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1543:1: ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1543:2: ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1543:2: ( (lv_modificador_0_0= ruleMODIFIER ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34||LA30_0==53||(LA30_0>=104 && LA30_0<=111)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1544:1: (lv_modificador_0_0= ruleMODIFIER )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1544:1: (lv_modificador_0_0= ruleMODIFIER )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1545:3: lv_modificador_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getModificadorMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_rulevariable_declaration3165);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1561:3: ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )?
            int alt31=3;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1561:4: ( (lv_tipoVariavel_1_0= ruletype ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1561:4: ( (lv_tipoVariavel_1_0= ruletype ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1562:1: (lv_tipoVariavel_1_0= ruletype )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1562:1: (lv_tipoVariavel_1_0= ruletype )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1563:3: lv_tipoVariavel_1_0= ruletype
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getTipoVariavelTypeParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_in_rulevariable_declaration3188);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1580:7: otherlv_2= 'void'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_rulevariable_declaration3206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getVariable_declarationAccess().getVoidKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1584:3: ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1585:1: (lv_declaracaoVariaveis_3_0= rulevariable_declarator )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1585:1: (lv_declaracaoVariaveis_3_0= rulevariable_declarator )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1586:3: lv_declaracaoVariaveis_3_0= rulevariable_declarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getDeclaracaoVariaveisVariable_declaratorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulevariable_declarator_in_rulevariable_declaration3229);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1602:2: (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1602:4: otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_rulevariable_declaration3242); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1606:1: ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1607:1: (lv_declaracaoVariaveis_5_0= rulevariable_declarator )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1607:1: (lv_declaracaoVariaveis_5_0= rulevariable_declarator )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1608:3: lv_declaracaoVariaveis_5_0= rulevariable_declarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getDeclaracaoVariaveisVariable_declaratorParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulevariable_declarator_in_rulevariable_declaration3263);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1624:4: (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) )
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1624:6: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_rulevariable_declaration3278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1629:6: ( (lv_blocoVariavel_7_0= rulestatement_block ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1629:6: ( (lv_blocoVariavel_7_0= rulestatement_block ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1630:1: (lv_blocoVariavel_7_0= rulestatement_block )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1630:1: (lv_blocoVariavel_7_0= rulestatement_block )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1631:3: lv_blocoVariavel_7_0= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getBlocoVariavelStatement_blockParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_rulevariable_declaration3305);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1655:1: entryRulevariable_declarator returns [EObject current=null] : iv_rulevariable_declarator= rulevariable_declarator EOF ;
    public final EObject entryRulevariable_declarator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declarator = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1656:2: (iv_rulevariable_declarator= rulevariable_declarator EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1657:2: iv_rulevariable_declarator= rulevariable_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaratorRule()); 
            }
            pushFollow(FOLLOW_rulevariable_declarator_in_entryRulevariable_declarator3342);
            iv_rulevariable_declarator=rulevariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_declarator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declarator3352); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1664:1: rulevariable_declarator returns [EObject current=null] : ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? ) ) ;
    public final EObject rulevariable_declarator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_nomeVariavel_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject this_arglist_1 = null;

        EObject lv_valorVariavel_7_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1667:28: ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1668:1: ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1668:1: ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? ) )
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1668:2: (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1668:2: (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1668:4: otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulevariable_declarator3390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVariable_declaratorAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1672:1: (this_arglist_1= rulearglist )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_FLOAT_LITERAL)||LA34_0==30||(LA34_0>=54 && LA34_0<=57)||(LA34_0>=60 && LA34_0<=62)||(LA34_0>=91 && LA34_0<=103)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1673:2: this_arglist_1= rulearglist
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getVariable_declaratorAccess().getArglistParserRuleCall_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_rulearglist_in_rulevariable_declarator3416);
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

                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulevariable_declarator3429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getVariable_declaratorAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1689:6: ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1689:6: ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1689:7: ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )?
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1689:7: ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1690:1: (lv_nomeVariavel_3_0= RULE_IDENTIFIER )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1690:1: (lv_nomeVariavel_3_0= RULE_IDENTIFIER )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1691:3: lv_nomeVariavel_3_0= RULE_IDENTIFIER
                    {
                    lv_nomeVariavel_3_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariable_declarator3454); if (state.failed) return current;
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1707:2: (otherlv_4= '[' otherlv_5= ']' )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==32) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1707:4: otherlv_4= '[' otherlv_5= ']'
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_rulevariable_declarator3472); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketKeyword_1_1_0());
                    	          
                    	    }
                    	    otherlv_5=(Token)match(input,33,FOLLOW_33_in_rulevariable_declarator3484); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getVariable_declaratorAccess().getRightSquareBracketKeyword_1_1_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1715:3: (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==41) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1715:5: otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) )
                            {
                            otherlv_6=(Token)match(input,41,FOLLOW_41_in_rulevariable_declarator3499); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getVariable_declaratorAccess().getEqualsSignKeyword_1_2_0());
                                  
                            }
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1719:1: ( (lv_valorVariavel_7_0= rulevariable_initializer ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1720:1: (lv_valorVariavel_7_0= rulevariable_initializer )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1720:1: (lv_valorVariavel_7_0= rulevariable_initializer )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1721:3: lv_valorVariavel_7_0= rulevariable_initializer
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariable_declaratorAccess().getValorVariavelVariable_initializerParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_declarator3520);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1745:1: entryRulevariable_initializer returns [EObject current=null] : iv_rulevariable_initializer= rulevariable_initializer EOF ;
    public final EObject entryRulevariable_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_initializer = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1746:2: (iv_rulevariable_initializer= rulevariable_initializer EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1747:2: iv_rulevariable_initializer= rulevariable_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_initializerRule()); 
            }
            pushFollow(FOLLOW_rulevariable_initializer_in_entryRulevariable_initializer3559);
            iv_rulevariable_initializer=rulevariable_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_initializer3569); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1754:1: rulevariable_initializer returns [EObject current=null] : ( ( (lv_expressaoVariavel_0_0= ruleexpression ) ) | (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1757:28: ( ( ( (lv_expressaoVariavel_0_0= ruleexpression ) ) | (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1758:1: ( ( (lv_expressaoVariavel_0_0= ruleexpression ) ) | (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1758:1: ( ( (lv_expressaoVariavel_0_0= ruleexpression ) ) | (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_FLOAT_LITERAL)||LA41_0==30||(LA41_0>=54 && LA41_0<=57)||(LA41_0>=60 && LA41_0<=62)||(LA41_0>=91 && LA41_0<=94)) ) {
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1758:2: ( (lv_expressaoVariavel_0_0= ruleexpression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1758:2: ( (lv_expressaoVariavel_0_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1759:1: (lv_expressaoVariavel_0_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1759:1: (lv_expressaoVariavel_0_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1760:3: lv_expressaoVariavel_0_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getExpressaoVariavelExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulevariable_initializer3615);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1777:6: (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1777:6: (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1777:8: otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_rulevariable_initializer3634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariable_initializerAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1781:1: ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_FLOAT_LITERAL)||LA40_0==27||LA40_0==30||(LA40_0>=54 && LA40_0<=57)||(LA40_0>=60 && LA40_0<=62)||(LA40_0>=91 && LA40_0<=94)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1781:2: ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )?
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1781:2: ( (lv_valorVariaveis_2_0= rulevariable_initializer ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1782:1: (lv_valorVariaveis_2_0= rulevariable_initializer )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1782:1: (lv_valorVariaveis_2_0= rulevariable_initializer )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1783:3: lv_valorVariaveis_2_0= rulevariable_initializer
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getValorVariaveisVariable_initializerParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_initializer3656);
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

                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1799:2: (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==26) ) {
                                    int LA38_1 = input.LA(2);

                                    if ( ((LA38_1>=RULE_STRING && LA38_1<=RULE_FLOAT_LITERAL)||LA38_1==27||LA38_1==30||(LA38_1>=54 && LA38_1<=57)||(LA38_1>=60 && LA38_1<=62)||(LA38_1>=91 && LA38_1<=94)) ) {
                                        alt38=1;
                                    }


                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1799:4: otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) )
                            	    {
                            	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_rulevariable_initializer3669); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getVariable_initializerAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1803:1: ( (lv_valorVariaveis_4_0= rulevariable_initializer ) )
                            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1804:1: (lv_valorVariaveis_4_0= rulevariable_initializer )
                            	    {
                            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1804:1: (lv_valorVariaveis_4_0= rulevariable_initializer )
                            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1805:3: lv_valorVariaveis_4_0= rulevariable_initializer
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getValorVariaveisVariable_initializerParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_initializer3690);
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

                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1821:4: (otherlv_5= ',' )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==26) ) {
                                alt39=1;
                            }
                            switch (alt39) {
                                case 1 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1821:6: otherlv_5= ','
                                    {
                                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_rulevariable_initializer3705); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_5, grammarAccess.getVariable_initializerAccess().getCommaKeyword_1_1_2());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_rulevariable_initializer3721); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1837:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1838:2: (iv_ruleif_statement= ruleif_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1839:2: iv_ruleif_statement= ruleif_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_statementRule()); 
            }
            pushFollow(FOLLOW_ruleif_statement_in_entryRuleif_statement3758);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleif_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_statement3768); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1846:1: ruleif_statement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )? ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1849:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1850:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1850:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1850:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleif_statement3805); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleif_statement3817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIf_statementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1858:1: ( (lv_espressaoIf_2_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1859:1: (lv_espressaoIf_2_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1859:1: (lv_espressaoIf_2_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1860:3: lv_espressaoIf_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_statementAccess().getEspressaoIfExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleif_statement3838);
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

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleif_statement3850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIf_statementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1880:1: ( (lv_blcoIf_4_0= rulestatement ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1881:1: (lv_blcoIf_4_0= rulestatement )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1881:1: (lv_blcoIf_4_0= rulestatement )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1882:3: lv_blcoIf_4_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_statementAccess().getBlcoIfStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_ruleif_statement3871);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1898:2: ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )?
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1898:3: ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1903:6: (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1903:8: otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) )
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleif_statement3903); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIf_statementAccess().getElseKeyword_5_0_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1907:1: ( (lv_blocoElse_6_0= rulestatement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1908:1: (lv_blocoElse_6_0= rulestatement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1908:1: (lv_blocoElse_6_0= rulestatement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1909:3: lv_blocoElse_6_0= rulestatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIf_statementAccess().getBlocoElseStatementParserRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_ruleif_statement3924);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1933:1: entryRuledo_statement returns [EObject current=null] : iv_ruledo_statement= ruledo_statement EOF ;
    public final EObject entryRuledo_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledo_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1934:2: (iv_ruledo_statement= ruledo_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1935:2: iv_ruledo_statement= ruledo_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDo_statementRule()); 
            }
            pushFollow(FOLLOW_ruledo_statement_in_entryRuledo_statement3963);
            iv_ruledo_statement=ruledo_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledo_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledo_statement3973); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1942:1: ruledo_statement returns [EObject current=null] : (otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';' ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1945:28: ( (otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1946:1: (otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1946:1: (otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1946:3: otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruledo_statement4010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDo_statementAccess().getDoKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1950:1: ( (lv_blocoDo_1_0= rulestatement ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1951:1: (lv_blocoDo_1_0= rulestatement )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1951:1: (lv_blocoDo_1_0= rulestatement )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1952:3: lv_blocoDo_1_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_statementAccess().getBlocoDoStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_ruledo_statement4031);
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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruledo_statement4043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDo_statementAccess().getWhileKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruledo_statement4055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDo_statementAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1976:1: ( (lv_expressaoWhile_4_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1977:1: (lv_expressaoWhile_4_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1977:1: (lv_expressaoWhile_4_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1978:3: lv_expressaoWhile_4_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_statementAccess().getExpressaoWhileExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruledo_statement4076);
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

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruledo_statement4088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDo_statementAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruledo_statement4100); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2010:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2011:2: (iv_rulewhile_statement= rulewhile_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2012:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_statementRule()); 
            }
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement4136);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulewhile_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement4146); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2019:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressaoWhile_2_0 = null;

        EObject lv_blocoWhile_4_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2022:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2023:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2023:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2023:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_rulewhile_statement4183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulewhile_statement4195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhile_statementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2031:1: ( (lv_expressaoWhile_2_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2032:1: (lv_expressaoWhile_2_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2032:1: (lv_expressaoWhile_2_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2033:3: lv_expressaoWhile_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressaoWhileExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulewhile_statement4216);
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

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_rulewhile_statement4228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhile_statementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2053:1: ( (lv_blocoWhile_4_0= rulestatement ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2054:1: (lv_blocoWhile_4_0= rulestatement )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2054:1: (lv_blocoWhile_4_0= rulestatement )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2055:3: lv_blocoWhile_4_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_statementAccess().getBlocoWhileStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_rulewhile_statement4249);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2079:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2080:2: (iv_rulefor_statement= rulefor_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2081:2: iv_rulefor_statement= rulefor_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_statementRule()); 
            }
            pushFollow(FOLLOW_rulefor_statement_in_entryRulefor_statement4285);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefor_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_statement4295); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2088:1: rulefor_statement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2091:28: ( (otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2092:1: (otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2092:1: (otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2092:3: otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_rulefor_statement4332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulefor_statement4344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFor_statementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2100:1: ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' )
            int alt43=3;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2100:2: ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2100:2: ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2100:3: ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2105:1: (lv_declaracaoVariavel_2_0= rulevariable_declaration )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2106:3: lv_declaracaoVariavel_2_0= rulevariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_statementAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulevariable_declaration_in_rulefor_statement4376);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2123:6: ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2123:6: ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2123:7: ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';'
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2123:7: ( (lv_expressaoDeclaracao_3_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2124:1: (lv_expressaoDeclaracao_3_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2124:1: (lv_expressaoDeclaracao_3_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2125:3: lv_expressaoDeclaracao_3_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressaoDeclaracaoExpressionParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4404);
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

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulefor_statement4416); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFor_statementAccess().getSemicolonKeyword_2_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2146:7: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulefor_statement4435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getSemicolonKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2150:2: ( (lv_expressaoFor_6_0= ruleexpression ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_FLOAT_LITERAL)||LA44_0==30||(LA44_0>=54 && LA44_0<=57)||(LA44_0>=60 && LA44_0<=62)||(LA44_0>=91 && LA44_0<=94)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2151:1: (lv_expressaoFor_6_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2151:1: (lv_expressaoFor_6_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2152:3: lv_expressaoFor_6_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressaoForExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4457);
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

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_rulefor_statement4470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFor_statementAccess().getSemicolonKeyword_4());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2172:1: ( (lv_expressaoIncremento_8_0= ruleexpression ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_FLOAT_LITERAL)||LA45_0==30||(LA45_0>=54 && LA45_0<=57)||(LA45_0>=60 && LA45_0<=62)||(LA45_0>=91 && LA45_0<=94)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2173:1: (lv_expressaoIncremento_8_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2173:1: (lv_expressaoIncremento_8_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2174:3: lv_expressaoIncremento_8_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressaoIncrementoExpressionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4491);
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

            otherlv_9=(Token)match(input,31,FOLLOW_31_in_rulefor_statement4504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFor_statementAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2194:1: ( (lv_blocoFor_10_0= rulestatement ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2195:1: (lv_blocoFor_10_0= rulestatement )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2195:1: (lv_blocoFor_10_0= rulestatement )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2196:3: lv_blocoFor_10_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFor_statementAccess().getBlocoForStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_rulefor_statement4525);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2220:1: entryRuletry_statement returns [EObject current=null] : iv_ruletry_statement= ruletry_statement EOF ;
    public final EObject entryRuletry_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletry_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2221:2: (iv_ruletry_statement= ruletry_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2222:2: iv_ruletry_statement= ruletry_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruletry_statement_in_entryRuletry_statement4561);
            iv_ruletry_statement=ruletry_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletry_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletry_statement4571); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2229:1: ruletry_statement returns [EObject current=null] : (otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )? ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2232:28: ( (otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2233:1: (otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2233:1: (otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2233:3: otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruletry_statement4608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTry_statementAccess().getTryKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2237:1: ( (lv_blocoTry_1_0= rulestatement_block ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2238:1: (lv_blocoTry_1_0= rulestatement_block )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2238:1: (lv_blocoTry_1_0= rulestatement_block )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2239:3: lv_blocoTry_1_0= rulestatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTry_statementAccess().getBlocoTryStatement_blockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_block_in_ruletry_statement4629);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2255:2: ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==48) && (synpred93_InternalSimpleJava())) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2255:3: ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2266:6: (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2266:8: otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) )
            	    {
            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruletry_statement4678); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTry_statementAccess().getCatchKeyword_2_0_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruletry_statement4690); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_0_1());
            	          
            	    }
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2274:1: ( (lv_parametroCatch_4_0= ruleparameter ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2275:1: (lv_parametroCatch_4_0= ruleparameter )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2275:1: (lv_parametroCatch_4_0= ruleparameter )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2276:3: lv_parametroCatch_4_0= ruleparameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getParametroCatchParameterParserRuleCall_2_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleparameter_in_ruletry_statement4711);
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

            	    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruletry_statement4723); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_0_3());
            	          
            	    }
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2296:1: ( (lv_blocoCatch_6_0= rulestatement_block ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2297:1: (lv_blocoCatch_6_0= rulestatement_block )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2297:1: (lv_blocoCatch_6_0= rulestatement_block )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2298:3: lv_blocoCatch_6_0= rulestatement_block
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getBlocoCatchStatement_blockParserRuleCall_2_0_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_block_in_ruletry_statement4744);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2314:5: ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) && (synpred94_InternalSimpleJava())) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2314:6: ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2319:6: (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2319:8: otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruletry_statement4779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2323:1: ( (lv_blocoFinally_8_0= rulestatement_block ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2324:1: (lv_blocoFinally_8_0= rulestatement_block )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2324:1: (lv_blocoFinally_8_0= rulestatement_block )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2325:3: lv_blocoFinally_8_0= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTry_statementAccess().getBlocoFinallyStatement_blockParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_ruletry_statement4800);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2349:1: entryRuleswitch_statement returns [EObject current=null] : iv_ruleswitch_statement= ruleswitch_statement EOF ;
    public final EObject entryRuleswitch_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleswitch_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2350:2: (iv_ruleswitch_statement= ruleswitch_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2351:2: iv_ruleswitch_statement= ruleswitch_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitch_statementRule()); 
            }
            pushFollow(FOLLOW_ruleswitch_statement_in_entryRuleswitch_statement4839);
            iv_ruleswitch_statement=ruleswitch_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleswitch_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleswitch_statement4849); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2358:1: ruleswitch_statement returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}' ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2361:28: ( (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2362:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2362:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2362:3: otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleswitch_statement4886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitch_statementAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleswitch_statement4898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitch_statementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2370:1: ( (lv_expressaoSwitch_2_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2371:1: (lv_expressaoSwitch_2_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2371:1: (lv_expressaoSwitch_2_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2372:3: lv_expressaoSwitch_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpressaoSwitchExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleswitch_statement4919);
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

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleswitch_statement4931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitch_statementAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleswitch_statement4943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitch_statementAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2396:1: ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )*
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
                case 91:
                case 92:
                case 93:
                case 94:
                case 96:
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
                    {
                    alt48=3;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2396:2: (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2396:2: (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2396:4: otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':'
            	    {
            	    otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleswitch_statement4957); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getSwitch_statementAccess().getCaseKeyword_5_0_0());
            	          
            	    }
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2400:1: ( (lv_expressaoCases_6_0= ruleexpression ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2401:1: (lv_expressaoCases_6_0= ruleexpression )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2401:1: (lv_expressaoCases_6_0= ruleexpression )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2402:3: lv_expressaoCases_6_0= ruleexpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpressaoCasesExpressionParserRuleCall_5_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleexpression_in_ruleswitch_statement4978);
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

            	    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleswitch_statement4990); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getSwitch_statementAccess().getColonKeyword_5_0_2());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2423:6: (otherlv_8= 'default' otherlv_9= ':' )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2423:6: (otherlv_8= 'default' otherlv_9= ':' )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2423:8: otherlv_8= 'default' otherlv_9= ':'
            	    {
            	    otherlv_8=(Token)match(input,52,FOLLOW_52_in_ruleswitch_statement5010); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getSwitch_statementAccess().getDefaultKeyword_5_1_0());
            	          
            	    }
            	    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleswitch_statement5022); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getSwitch_statementAccess().getColonKeyword_5_1_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2432:6: ( (lv_blocoSwitch_10_0= rulestatement ) )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2432:6: ( (lv_blocoSwitch_10_0= rulestatement ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2433:1: (lv_blocoSwitch_10_0= rulestatement )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2433:1: (lv_blocoSwitch_10_0= rulestatement )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2434:3: lv_blocoSwitch_10_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getBlocoSwitchStatementParserRuleCall_5_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_ruleswitch_statement5050);
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

            otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleswitch_statement5064); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2462:1: entryRuleconstructor_declaration returns [EObject current=null] : iv_ruleconstructor_declaration= ruleconstructor_declaration EOF ;
    public final EObject entryRuleconstructor_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstructor_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2463:2: (iv_ruleconstructor_declaration= ruleconstructor_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2464:2: iv_ruleconstructor_declaration= ruleconstructor_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleconstructor_declaration_in_entryRuleconstructor_declaration5100);
            iv_ruleconstructor_declaration=ruleconstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstructor_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstructor_declaration5110); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2471:1: ruleconstructor_declaration returns [EObject current=null] : ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipo_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_nomeContrutor_3_0= RULE_IDENTIFIER ) ) otherlv_4= '(' ( (lv_parametrosContrutor_5_0= ruleparameter_list ) )? otherlv_6= ')' ( (lv_blocoConstrutor_7_0= rulestatement_block ) ) ) ;
    public final EObject ruleconstructor_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_nomeContrutor_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_modificador_0_0 = null;

        EObject lv_tipo_1_0 = null;

        EObject lv_parametrosContrutor_5_0 = null;

        EObject lv_blocoConstrutor_7_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2474:28: ( ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipo_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_nomeContrutor_3_0= RULE_IDENTIFIER ) ) otherlv_4= '(' ( (lv_parametrosContrutor_5_0= ruleparameter_list ) )? otherlv_6= ')' ( (lv_blocoConstrutor_7_0= rulestatement_block ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2475:1: ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipo_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_nomeContrutor_3_0= RULE_IDENTIFIER ) ) otherlv_4= '(' ( (lv_parametrosContrutor_5_0= ruleparameter_list ) )? otherlv_6= ')' ( (lv_blocoConstrutor_7_0= rulestatement_block ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2475:1: ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipo_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_nomeContrutor_3_0= RULE_IDENTIFIER ) ) otherlv_4= '(' ( (lv_parametrosContrutor_5_0= ruleparameter_list ) )? otherlv_6= ')' ( (lv_blocoConstrutor_7_0= rulestatement_block ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2475:2: ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipo_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_nomeContrutor_3_0= RULE_IDENTIFIER ) ) otherlv_4= '(' ( (lv_parametrosContrutor_5_0= ruleparameter_list ) )? otherlv_6= ')' ( (lv_blocoConstrutor_7_0= rulestatement_block ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2475:2: ( (lv_modificador_0_0= ruleMODIFIER ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==34||LA49_0==53||(LA49_0>=104 && LA49_0<=111)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2476:1: (lv_modificador_0_0= ruleMODIFIER )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2476:1: (lv_modificador_0_0= ruleMODIFIER )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2477:3: lv_modificador_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getModificadorMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_ruleconstructor_declaration5156);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2493:3: ( ( (lv_tipo_1_0= ruletype ) ) | otherlv_2= 'void' )?
            int alt50=3;
            switch ( input.LA(1) ) {
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                    {
                    alt50=1;
                    }
                    break;
                case RULE_IDENTIFIER:
                    {
                    int LA50_2 = input.LA(2);

                    if ( (LA50_2==RULE_IDENTIFIER||LA50_2==32||LA50_2==58) ) {
                        alt50=1;
                    }
                    }
                    break;
                case 40:
                    {
                    alt50=2;
                    }
                    break;
            }

            switch (alt50) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2493:4: ( (lv_tipo_1_0= ruletype ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2493:4: ( (lv_tipo_1_0= ruletype ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2494:1: (lv_tipo_1_0= ruletype )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2494:1: (lv_tipo_1_0= ruletype )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2495:3: lv_tipo_1_0= ruletype
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getTipoTypeParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_in_ruleconstructor_declaration5179);
                    lv_tipo_1_0=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"tipo",
                              		lv_tipo_1_0, 
                              		"type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2512:7: otherlv_2= 'void'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleconstructor_declaration5197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConstructor_declarationAccess().getVoidKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2516:3: ( (lv_nomeContrutor_3_0= RULE_IDENTIFIER ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2517:1: (lv_nomeContrutor_3_0= RULE_IDENTIFIER )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2517:1: (lv_nomeContrutor_3_0= RULE_IDENTIFIER )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2518:3: lv_nomeContrutor_3_0= RULE_IDENTIFIER
            {
            lv_nomeContrutor_3_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstructor_declaration5216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nomeContrutor_3_0, grammarAccess.getConstructor_declarationAccess().getNomeContrutorIDENTIFIERTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstructor_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nomeContrutor",
                      		lv_nomeContrutor_3_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleconstructor_declaration5233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2538:1: ( (lv_parametrosContrutor_5_0= ruleparameter_list ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_IDENTIFIER||(LA51_0>=96 && LA51_0<=103)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2539:1: (lv_parametrosContrutor_5_0= ruleparameter_list )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2539:1: (lv_parametrosContrutor_5_0= ruleparameter_list )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2540:3: lv_parametrosContrutor_5_0= ruleparameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParametrosContrutorParameter_listParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleparameter_list_in_ruleconstructor_declaration5254);
                    lv_parametrosContrutor_5_0=ruleparameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"parametrosContrutor",
                              		lv_parametrosContrutor_5_0, 
                              		"parameter_list");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleconstructor_declaration5267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2560:1: ( (lv_blocoConstrutor_7_0= rulestatement_block ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2561:1: (lv_blocoConstrutor_7_0= rulestatement_block )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2561:1: (lv_blocoConstrutor_7_0= rulestatement_block )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2562:3: lv_blocoConstrutor_7_0= rulestatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getBlocoConstrutorStatement_blockParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_block_in_ruleconstructor_declaration5288);
            lv_blocoConstrutor_7_0=rulestatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"blocoConstrutor",
                      		lv_blocoConstrutor_7_0, 
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2586:1: entryRulestatic_initializer returns [EObject current=null] : iv_rulestatic_initializer= rulestatic_initializer EOF ;
    public final EObject entryRulestatic_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatic_initializer = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2587:2: (iv_rulestatic_initializer= rulestatic_initializer EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2588:2: iv_rulestatic_initializer= rulestatic_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            }
            pushFollow(FOLLOW_rulestatic_initializer_in_entryRulestatic_initializer5324);
            iv_rulestatic_initializer=rulestatic_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatic_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatic_initializer5334); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2595:1: rulestatic_initializer returns [EObject current=null] : (otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) ) ) ;
    public final EObject rulestatic_initializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_blocoEstatico_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2598:28: ( (otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2599:1: (otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2599:1: (otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2599:3: otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_rulestatic_initializer5371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatic_initializerAccess().getStaticKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2603:1: ( (lv_blocoEstatico_1_0= rulestatement_block ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2604:1: (lv_blocoEstatico_1_0= rulestatement_block )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2604:1: (lv_blocoEstatico_1_0= rulestatement_block )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2605:3: lv_blocoEstatico_1_0= rulestatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatic_initializerAccess().getBlocoEstaticoStatement_blockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_block_in_rulestatic_initializer5392);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2629:1: entryRulecreating_expression returns [EObject current=null] : iv_rulecreating_expression= rulecreating_expression EOF ;
    public final EObject entryRulecreating_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecreating_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2630:2: (iv_rulecreating_expression= rulecreating_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2631:2: iv_rulecreating_expression= rulecreating_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreating_expressionRule()); 
            }
            pushFollow(FOLLOW_rulecreating_expression_in_entryRulecreating_expression5428);
            iv_rulecreating_expression=rulecreating_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecreating_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecreating_expression5438); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2638:1: rulecreating_expression returns [EObject current=null] : (otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenewBlock ) )* ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2641:28: ( (otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenewBlock ) )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2642:1: (otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenewBlock ) )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2642:1: (otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenewBlock ) )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2642:3: otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenewBlock ) )*
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_rulecreating_expression5475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreating_expressionAccess().getNewKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2646:1: ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) )
            int alt54=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt54=1;
                }
                break;
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
                {
                alt54=2;
                }
                break;
            case 30:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2646:2: ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2646:2: ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2646:3: ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2646:3: ( (lv_novoObjeto_1_0= rulename ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2647:1: (lv_novoObjeto_1_0= rulename )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2647:1: (lv_novoObjeto_1_0= rulename )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2648:3: lv_novoObjeto_1_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getNovoObjetoNameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_rulecreating_expression5498);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2664:2: ( (lv_parametros_2_0= rulecreating_aux ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2665:1: (lv_parametros_2_0= rulecreating_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2665:1: (lv_parametros_2_0= rulecreating_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2666:3: lv_parametros_2_0= rulecreating_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getParametrosCreating_auxParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecreating_aux_in_rulecreating_expression5519);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2683:6: ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2683:6: ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2683:7: ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )*
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2683:7: ( (lv_tipoObjeto_3_0= ruletype_specifier ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2684:1: (lv_tipoObjeto_3_0= ruletype_specifier )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2684:1: (lv_tipoObjeto_3_0= ruletype_specifier )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2685:3: lv_tipoObjeto_3_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getTipoObjetoType_specifierParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulecreating_expression5548);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2701:2: ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )?
                    int alt52=2;
                    alt52 = dfa52.predict(input);
                    switch (alt52) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2701:3: ( '[' )=> ( (lv_parametros_4_0= ruleaux ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2702:4: ( (lv_parametros_4_0= ruleaux ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2703:1: (lv_parametros_4_0= ruleaux )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2703:1: (lv_parametros_4_0= ruleaux )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2704:3: lv_parametros_4_0= ruleaux
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getParametrosAuxParserRuleCall_1_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleaux_in_rulecreating_expression5577);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2720:4: (otherlv_5= '[' otherlv_6= ']' )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==32) ) {
                            int LA53_2 = input.LA(2);

                            if ( (LA53_2==33) ) {
                                alt53=1;
                            }


                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2720:6: otherlv_5= '[' otherlv_6= ']'
                    	    {
                    	    otherlv_5=(Token)match(input,32,FOLLOW_32_in_rulecreating_expression5592); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getCreating_expressionAccess().getLeftSquareBracketKeyword_1_1_2_0());
                    	          
                    	    }
                    	    otherlv_6=(Token)match(input,33,FOLLOW_33_in_rulecreating_expression5604); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getCreating_expressionAccess().getRightSquareBracketKeyword_1_1_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2729:6: (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2729:6: (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2729:8: otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_rulecreating_expression5626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCreating_expressionAccess().getLeftParenthesisKeyword_1_2_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2733:1: ( (lv_expressaoNew_8_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2734:1: (lv_expressaoNew_8_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2734:1: (lv_expressaoNew_8_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2735:3: lv_expressaoNew_8_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getExpressaoNewExpressionParserRuleCall_1_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulecreating_expression5647);
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

                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_rulecreating_expression5659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getCreating_expressionAccess().getRightParenthesisKeyword_1_2_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2755:3: ( (lv_novo_10_0= rulenewBlock ) )*
            loop55:
            do {
                int alt55=2;
                alt55 = dfa55.predict(input);
                switch (alt55) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2756:1: (lv_novo_10_0= rulenewBlock )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2756:1: (lv_novo_10_0= rulenewBlock )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2757:3: lv_novo_10_0= rulenewBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getNovoNewBlockParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulenewBlock_in_rulecreating_expression5682);
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
            	    break loop55;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2781:1: entryRuleexp_aux returns [EObject current=null] : iv_ruleexp_aux= ruleexp_aux EOF ;
    public final EObject entryRuleexp_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexp_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2782:2: (iv_ruleexp_aux= ruleexp_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2783:2: iv_ruleexp_aux= ruleexp_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExp_auxRule()); 
            }
            pushFollow(FOLLOW_ruleexp_aux_in_entryRuleexp_aux5719);
            iv_ruleexp_aux=ruleexp_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexp_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexp_aux5729); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2790:1: ruleexp_aux returns [EObject current=null] : ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) ) ;
    public final EObject ruleexp_aux() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressao_0_0 = null;

        EObject this_type_2 = null;

        EObject lv_expressao_4_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2793:28: ( ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2794:1: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2794:1: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) )
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2794:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2794:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2794:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')'
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2794:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2794:4: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2807:1: (lv_expressao_0_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2808:3: lv_expressao_0_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExp_auxAccess().getExpressaoExpressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleexp_aux5885);
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

                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleexp_aux5897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExp_auxAccess().getRightParenthesisKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2829:6: (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2829:6: (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2830:2: this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExp_auxAccess().getTypeParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruletype_in_ruleexp_aux5930);
                    this_type_2=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_type_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleexp_aux5941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExp_auxAccess().getRightParenthesisKeyword_1_1());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2845:1: ( (lv_expressao_4_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2846:1: (lv_expressao_4_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2846:1: (lv_expressao_4_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2847:3: lv_expressao_4_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExp_auxAccess().getExpressaoExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleexp_aux5962);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2871:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2872:2: (iv_ruleexpression= ruleexpression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2873:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression5999);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression6009); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2880:1: ruleexpression returns [EObject current=null] : ( ( ( (lv_tipo_0_0= rulelogical_expression ) ) | ( (lv_tipo_1_0= rulenumeric_expression ) ) | ( (lv_tipo_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) ) ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_identificador_8_0=null;
        Token otherlv_9=null;
        EObject lv_tipo_0_0 = null;

        EObject lv_tipo_1_0 = null;

        EObject lv_tipo_2_0 = null;

        EObject lv_novo_3_0 = null;

        EObject lv_literal_4_0 = null;

        EObject this_exp_aux_10 = null;

        EObject lv_expressoes_11_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2883:28: ( ( ( ( (lv_tipo_0_0= rulelogical_expression ) ) | ( (lv_tipo_1_0= rulenumeric_expression ) ) | ( (lv_tipo_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2884:1: ( ( ( (lv_tipo_0_0= rulelogical_expression ) ) | ( (lv_tipo_1_0= rulenumeric_expression ) ) | ( (lv_tipo_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2884:1: ( ( ( (lv_tipo_0_0= rulelogical_expression ) ) | ( (lv_tipo_1_0= rulenumeric_expression ) ) | ( (lv_tipo_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2884:2: ( ( (lv_tipo_0_0= rulelogical_expression ) ) | ( (lv_tipo_1_0= rulenumeric_expression ) ) | ( (lv_tipo_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2884:2: ( ( (lv_tipo_0_0= rulelogical_expression ) ) | ( (lv_tipo_1_0= rulenumeric_expression ) ) | ( (lv_tipo_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) )
            int alt57=10;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2884:3: ( (lv_tipo_0_0= rulelogical_expression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2884:3: ( (lv_tipo_0_0= rulelogical_expression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2885:1: (lv_tipo_0_0= rulelogical_expression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2885:1: (lv_tipo_0_0= rulelogical_expression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2886:3: lv_tipo_0_0= rulelogical_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getTipoLogical_expressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulelogical_expression_in_ruleexpression6056);
                    lv_tipo_0_0=rulelogical_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"tipo",
                              		lv_tipo_0_0, 
                              		"logical_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2903:6: ( (lv_tipo_1_0= rulenumeric_expression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2903:6: ( (lv_tipo_1_0= rulenumeric_expression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2904:1: (lv_tipo_1_0= rulenumeric_expression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2904:1: (lv_tipo_1_0= rulenumeric_expression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2905:3: lv_tipo_1_0= rulenumeric_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getTipoNumeric_expressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulenumeric_expression_in_ruleexpression6083);
                    lv_tipo_1_0=rulenumeric_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"tipo",
                              		lv_tipo_1_0, 
                              		"numeric_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2922:6: ( (lv_tipo_2_0= rulebit_expression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2922:6: ( (lv_tipo_2_0= rulebit_expression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2923:1: (lv_tipo_2_0= rulebit_expression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2923:1: (lv_tipo_2_0= rulebit_expression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2924:3: lv_tipo_2_0= rulebit_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getTipoBit_expressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulebit_expression_in_ruleexpression6110);
                    lv_tipo_2_0=rulebit_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"tipo",
                              		lv_tipo_2_0, 
                              		"bit_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2941:6: ( (lv_novo_3_0= rulecreating_expression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2941:6: ( (lv_novo_3_0= rulecreating_expression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2942:1: (lv_novo_3_0= rulecreating_expression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2942:1: (lv_novo_3_0= rulecreating_expression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2943:3: lv_novo_3_0= rulecreating_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getNovoCreating_expressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecreating_expression_in_ruleexpression6137);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2960:6: ( (lv_literal_4_0= ruleliteral_expression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2960:6: ( (lv_literal_4_0= ruleliteral_expression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2961:1: (lv_literal_4_0= ruleliteral_expression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2961:1: (lv_literal_4_0= ruleliteral_expression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2962:3: lv_literal_4_0= ruleliteral_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getLiteralLiteral_expressionParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleliteral_expression_in_ruleexpression6164);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2979:7: otherlv_5= 'null'
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_55_in_ruleexpression6182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getNullKeyword_0_5());
                          
                    }

                    }
                    break;
                case 7 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2984:7: otherlv_6= 'super'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleexpression6200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getSuperKeyword_0_6());
                          
                    }

                    }
                    break;
                case 8 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2989:7: otherlv_7= 'this'
                    {
                    otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleexpression6218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getThisKeyword_0_7());
                          
                    }

                    }
                    break;
                case 9 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2994:6: ( (lv_identificador_8_0= RULE_IDENTIFIER ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2994:6: ( (lv_identificador_8_0= RULE_IDENTIFIER ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2995:1: (lv_identificador_8_0= RULE_IDENTIFIER )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2995:1: (lv_identificador_8_0= RULE_IDENTIFIER )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2996:3: lv_identificador_8_0= RULE_IDENTIFIER
                    {
                    lv_identificador_8_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleexpression6241); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3013:6: (otherlv_9= '(' this_exp_aux_10= ruleexp_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3013:6: (otherlv_9= '(' this_exp_aux_10= ruleexp_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3013:8: otherlv_9= '(' this_exp_aux_10= ruleexp_aux
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleexpression6265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_9_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getExp_auxParserRuleCall_0_9_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexp_aux_in_ruleexpression6290);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3029:3: ( (lv_expressoes_11_0= ruleexpression_aux ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3030:1: (lv_expressoes_11_0= ruleexpression_aux )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3030:1: (lv_expressoes_11_0= ruleexpression_aux )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3031:3: lv_expressoes_11_0= ruleexpression_aux
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressoesExpression_auxParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression6312);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3055:1: entryRuleexpression_aux returns [EObject current=null] : iv_ruleexpression_aux= ruleexpression_aux EOF ;
    public final EObject entryRuleexpression_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3056:2: (iv_ruleexpression_aux= ruleexpression_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3057:2: iv_ruleexpression_aux= ruleexpression_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_auxRule()); 
            }
            pushFollow(FOLLOW_ruleexpression_aux_in_entryRuleexpression_aux6348);
            iv_ruleexpression_aux=ruleexpression_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression_aux6358); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3064:1: ruleexpression_aux returns [EObject current=null] : ( ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) ) )? ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3067:28: ( ( ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) ) )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:1: ( ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) ) )?
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:1: ( ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) ) )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:2: ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:2: ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) )
                    int alt66=5;
                    alt66 = dfa66.predict(input);
                    switch (alt66) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:3: ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:3: ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                            int alt59=5;
                            switch ( input.LA(1) ) {
                            case 30:
                                {
                                alt59=1;
                                }
                                break;
                            case 32:
                                {
                                alt59=2;
                                }
                                break;
                            case 58:
                                {
                                alt59=3;
                                }
                                break;
                            case 26:
                                {
                                alt59=4;
                                }
                                break;
                            case 59:
                                {
                                alt59=5;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 59, 0, input);

                                throw nvae;
                            }

                            switch (alt59) {
                                case 1 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:4: (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:4: (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:6: otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')'
                                    {
                                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleexpression_aux6398); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_0, grammarAccess.getExpression_auxAccess().getLeftParenthesisKeyword_0_0_0_0());
                                          
                                    }
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3072:1: ( (lv_parametros_1_0= rulearglist ) )?
                                    int alt58=2;
                                    int LA58_0 = input.LA(1);

                                    if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_FLOAT_LITERAL)||LA58_0==30||(LA58_0>=54 && LA58_0<=57)||(LA58_0>=60 && LA58_0<=62)||(LA58_0>=91 && LA58_0<=103)) ) {
                                        alt58=1;
                                    }
                                    switch (alt58) {
                                        case 1 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3073:1: (lv_parametros_1_0= rulearglist )
                                            {
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3073:1: (lv_parametros_1_0= rulearglist )
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3074:3: lv_parametros_1_0= rulearglist
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getParametrosArglistParserRuleCall_0_0_0_1_0()); 
                                              	    
                                            }
                                            pushFollow(FOLLOW_rulearglist_in_ruleexpression_aux6419);
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

                                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleexpression_aux6432); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_2, grammarAccess.getExpression_auxAccess().getRightParenthesisKeyword_0_0_0_2());
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3096:2: this_aux_3= ruleaux
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxParserRuleCall_0_0_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleaux_in_ruleexpression_aux6464);
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3108:6: (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3108:6: (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3108:8: otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) )
                                    {
                                    otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleexpression_aux6482); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_4, grammarAccess.getExpression_auxAccess().getFullStopKeyword_0_0_2_0());
                                          
                                    }
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3112:1: ( (lv_exp_5_0= ruleexpression ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3113:1: (lv_exp_5_0= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3113:1: (lv_exp_5_0= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3114:3: lv_exp_5_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_0_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux6503);
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3131:6: (otherlv_6= ',' this_expression_7= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3131:6: (otherlv_6= ',' this_expression_7= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3131:8: otherlv_6= ',' this_expression_7= ruleexpression
                                    {
                                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleexpression_aux6523); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_6, grammarAccess.getExpression_auxAccess().getCommaKeyword_0_0_3_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_0_3_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux6548);
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3148:6: (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3148:6: (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3148:8: otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                                    {
                                    otherlv_8=(Token)match(input,59,FOLLOW_59_in_ruleexpression_aux6567); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_8, grammarAccess.getExpression_auxAccess().getInstanceofKeyword_0_0_4_0());
                                          
                                    }
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3152:1: ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3152:2: ( RULE_IDENTIFIER )=>this_name_9= rulename
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getNameParserRuleCall_0_0_4_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_rulename_in_ruleexpression_aux6598);
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
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:6: ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:6: ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:7: ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:7: ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:8: ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3168:1: (lv_op_10_0= rulemais_aux )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3169:3: lv_op_10_0= rulemais_aux
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getOpMais_auxParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulemais_aux_in_ruleexpression_aux6642);
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

                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3185:2: ( (lv_exp_11_0= ruleexpression ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3186:1: (lv_exp_11_0= ruleexpression )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3186:1: (lv_exp_11_0= ruleexpression )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:3: lv_exp_11_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux6663);
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
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3204:6: ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3204:6: ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3205:1: ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3205:1: ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3206:1: (lv_operador_12_1= '++' | lv_operador_12_2= '--' )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3206:1: (lv_operador_12_1= '++' | lv_operador_12_2= '--' )
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==60) ) {
                                alt60=1;
                            }
                            else if ( (LA60_0==61) ) {
                                alt60=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 60, 0, input);

                                throw nvae;
                            }
                            switch (alt60) {
                                case 1 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3207:3: lv_operador_12_1= '++'
                                    {
                                    lv_operador_12_1=(Token)match(input,60,FOLLOW_60_in_ruleexpression_aux6690); if (state.failed) return current;
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3219:8: lv_operador_12_2= '--'
                                    {
                                    lv_operador_12_2=(Token)match(input,61,FOLLOW_61_in_ruleexpression_aux6719); if (state.failed) return current;
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
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:6: ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:6: ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) )
                            int alt61=9;
                            alt61 = dfa61.predict(input);
                            switch (alt61) {
                                case 1 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:8: ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:8: ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:9: ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3238:1: (lv_op_13_0= rulemais_aux )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3239:3: lv_op_13_0= rulemais_aux
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getOpMais_auxParserRuleCall_0_3_0_0_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_rulemais_aux_in_ruleexpression_aux6778);
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3256:6: ( (lv_operador_14_0= '-' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3256:6: ( (lv_operador_14_0= '-' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3257:1: (lv_operador_14_0= '-' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3257:1: (lv_operador_14_0= '-' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3258:3: lv_operador_14_0= '-'
                                    {
                                    lv_operador_14_0=(Token)match(input,62,FOLLOW_62_in_ruleexpression_aux6802); if (state.failed) return current;
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3272:6: ( (lv_operador_15_0= '-=' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3272:6: ( (lv_operador_15_0= '-=' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3273:1: (lv_operador_15_0= '-=' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3273:1: (lv_operador_15_0= '-=' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3274:3: lv_operador_15_0= '-='
                                    {
                                    lv_operador_15_0=(Token)match(input,63,FOLLOW_63_in_ruleexpression_aux6839); if (state.failed) return current;
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3288:6: ( (lv_operador_16_0= '*' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3288:6: ( (lv_operador_16_0= '*' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3289:1: (lv_operador_16_0= '*' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3289:1: (lv_operador_16_0= '*' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3290:3: lv_operador_16_0= '*'
                                    {
                                    lv_operador_16_0=(Token)match(input,64,FOLLOW_64_in_ruleexpression_aux6876); if (state.failed) return current;
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3304:6: ( (lv_operador_17_0= '*=' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3304:6: ( (lv_operador_17_0= '*=' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3305:1: (lv_operador_17_0= '*=' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3305:1: (lv_operador_17_0= '*=' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3306:3: lv_operador_17_0= '*='
                                    {
                                    lv_operador_17_0=(Token)match(input,65,FOLLOW_65_in_ruleexpression_aux6913); if (state.failed) return current;
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3320:6: ( (lv_operador_18_0= '/' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3320:6: ( (lv_operador_18_0= '/' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3321:1: (lv_operador_18_0= '/' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3321:1: (lv_operador_18_0= '/' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3322:3: lv_operador_18_0= '/'
                                    {
                                    lv_operador_18_0=(Token)match(input,66,FOLLOW_66_in_ruleexpression_aux6950); if (state.failed) return current;
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3336:6: ( (lv_operador_19_0= '/=' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3336:6: ( (lv_operador_19_0= '/=' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3337:1: (lv_operador_19_0= '/=' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3337:1: (lv_operador_19_0= '/=' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3338:3: lv_operador_19_0= '/='
                                    {
                                    lv_operador_19_0=(Token)match(input,67,FOLLOW_67_in_ruleexpression_aux6987); if (state.failed) return current;
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3352:6: ( (lv_operador_20_0= '%' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3352:6: ( (lv_operador_20_0= '%' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3353:1: (lv_operador_20_0= '%' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3353:1: (lv_operador_20_0= '%' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3354:3: lv_operador_20_0= '%'
                                    {
                                    lv_operador_20_0=(Token)match(input,68,FOLLOW_68_in_ruleexpression_aux7024); if (state.failed) return current;
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3368:6: ( (lv_operador_21_0= '%=' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3368:6: ( (lv_operador_21_0= '%=' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3369:1: (lv_operador_21_0= '%=' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3369:1: (lv_operador_21_0= '%=' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3370:3: lv_operador_21_0= '%='
                                    {
                                    lv_operador_21_0=(Token)match(input,69,FOLLOW_69_in_ruleexpression_aux7061); if (state.failed) return current;
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

                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3383:3: ( (lv_exp_22_0= ruleexpression ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3384:1: (lv_exp_22_0= ruleexpression )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3384:1: (lv_exp_22_0= ruleexpression )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3385:3: lv_exp_22_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7096);
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
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3402:6: ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3402:6: ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) )
                            int alt65=4;
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
                                {
                                alt65=1;
                                }
                                break;
                            case 78:
                                {
                                alt65=2;
                                }
                                break;
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                                {
                                alt65=3;
                                }
                                break;
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                                {
                                alt65=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 65, 0, input);

                                throw nvae;
                            }

                            switch (alt65) {
                                case 1 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3402:7: ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3402:7: ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3402:8: ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3402:8: ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3403:1: ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3403:1: ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3404:1: (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3404:1: (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' )
                                    int alt62=10;
                                    switch ( input.LA(1) ) {
                                    case 70:
                                        {
                                        alt62=1;
                                        }
                                        break;
                                    case 71:
                                        {
                                        alt62=2;
                                        }
                                        break;
                                    case 72:
                                        {
                                        alt62=3;
                                        }
                                        break;
                                    case 73:
                                        {
                                        alt62=4;
                                        }
                                        break;
                                    case 74:
                                        {
                                        alt62=5;
                                        }
                                        break;
                                    case 75:
                                        {
                                        alt62=6;
                                        }
                                        break;
                                    case 76:
                                        {
                                        alt62=7;
                                        }
                                        break;
                                    case 77:
                                        {
                                        alt62=8;
                                        }
                                        break;
                                    case 68:
                                        {
                                        alt62=9;
                                        }
                                        break;
                                    case 69:
                                        {
                                        alt62=10;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3405:3: lv_operador_23_1= 'ampersand'
                                            {
                                            lv_operador_23_1=(Token)match(input,70,FOLLOW_70_in_ruleexpression_aux7125); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3417:8: lv_operador_23_2= 'ampersand='
                                            {
                                            lv_operador_23_2=(Token)match(input,71,FOLLOW_71_in_ruleexpression_aux7154); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_2, grammarAccess.getExpression_auxAccess().getOperadorAmpersandKeyword_0_4_0_0_0_1());
                                                  
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3429:8: lv_operador_23_3= '|'
                                            {
                                            lv_operador_23_3=(Token)match(input,72,FOLLOW_72_in_ruleexpression_aux7183); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3441:8: lv_operador_23_4= '|='
                                            {
                                            lv_operador_23_4=(Token)match(input,73,FOLLOW_73_in_ruleexpression_aux7212); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3453:8: lv_operador_23_5= '^'
                                            {
                                            lv_operador_23_5=(Token)match(input,74,FOLLOW_74_in_ruleexpression_aux7241); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3465:8: lv_operador_23_6= '^='
                                            {
                                            lv_operador_23_6=(Token)match(input,75,FOLLOW_75_in_ruleexpression_aux7270); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3477:8: lv_operador_23_7= 'ampersand ampersand'
                                            {
                                            lv_operador_23_7=(Token)match(input,76,FOLLOW_76_in_ruleexpression_aux7299); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3489:8: lv_operador_23_8= '||='
                                            {
                                            lv_operador_23_8=(Token)match(input,77,FOLLOW_77_in_ruleexpression_aux7328); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_8, grammarAccess.getExpression_auxAccess().getOperadorVerticalLineVerticalLineEqualsSignKeyword_0_4_0_0_0_7());
                                                  
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3501:8: lv_operador_23_9= '%'
                                            {
                                            lv_operador_23_9=(Token)match(input,68,FOLLOW_68_in_ruleexpression_aux7357); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_9, grammarAccess.getExpression_auxAccess().getOperadorPercentSignKeyword_0_4_0_0_0_8());
                                                  
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3513:8: lv_operador_23_10= '%='
                                            {
                                            lv_operador_23_10=(Token)match(input,69,FOLLOW_69_in_ruleexpression_aux7386); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_23_10, grammarAccess.getExpression_auxAccess().getOperadorPercentSignEqualsSignKeyword_0_4_0_0_0_9());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_23_10, null);
                                              	    
                                            }

                                            }
                                            break;

                                    }


                                    }


                                    }

                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3528:2: ( (lv_exp_24_0= ruleexpression ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3529:1: (lv_exp_24_0= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3529:1: (lv_exp_24_0= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3530:3: lv_exp_24_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_0_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7423);
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3547:6: ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3547:6: ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3547:7: ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3547:7: ( (lv_operador_25_0= '?' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3548:1: (lv_operador_25_0= '?' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3548:1: (lv_operador_25_0= '?' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3549:3: lv_operador_25_0= '?'
                                    {
                                    lv_operador_25_0=(Token)match(input,78,FOLLOW_78_in_ruleexpression_aux7449); if (state.failed) return current;
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

                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3562:2: ( (lv_exp_26_0= ruleexpression ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3563:1: (lv_exp_26_0= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3563:1: (lv_exp_26_0= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3564:3: lv_exp_26_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_1_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7483);
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

                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3580:2: ( (lv_operador_27_0= ':' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3581:1: (lv_operador_27_0= ':' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3581:1: (lv_operador_27_0= ':' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3582:3: lv_operador_27_0= ':'
                                    {
                                    lv_operador_27_0=(Token)match(input,37,FOLLOW_37_in_ruleexpression_aux7501); if (state.failed) return current;
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

                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3595:2: ( (lv_exp_28_0= ruleexpression ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3596:1: (lv_exp_28_0= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3596:1: (lv_exp_28_0= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3597:3: lv_exp_28_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_1_3_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7535);
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3614:6: ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3614:6: ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3614:7: ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3614:7: ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3615:1: ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3615:1: ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3616:1: (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3616:1: (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' )
                                    int alt63=6;
                                    switch ( input.LA(1) ) {
                                    case 79:
                                        {
                                        alt63=1;
                                        }
                                        break;
                                    case 80:
                                        {
                                        alt63=2;
                                        }
                                        break;
                                    case 81:
                                        {
                                        alt63=3;
                                        }
                                        break;
                                    case 82:
                                        {
                                        alt63=4;
                                        }
                                        break;
                                    case 83:
                                        {
                                        alt63=5;
                                        }
                                        break;
                                    case 84:
                                        {
                                        alt63=6;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3617:3: lv_operador_29_1= '>'
                                            {
                                            lv_operador_29_1=(Token)match(input,79,FOLLOW_79_in_ruleexpression_aux7563); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3629:8: lv_operador_29_2= '<'
                                            {
                                            lv_operador_29_2=(Token)match(input,80,FOLLOW_80_in_ruleexpression_aux7592); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3641:8: lv_operador_29_3= '>='
                                            {
                                            lv_operador_29_3=(Token)match(input,81,FOLLOW_81_in_ruleexpression_aux7621); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3653:8: lv_operador_29_4= '<='
                                            {
                                            lv_operador_29_4=(Token)match(input,82,FOLLOW_82_in_ruleexpression_aux7650); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3665:8: lv_operador_29_5= '=='
                                            {
                                            lv_operador_29_5=(Token)match(input,83,FOLLOW_83_in_ruleexpression_aux7679); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3677:8: lv_operador_29_6= '!='
                                            {
                                            lv_operador_29_6=(Token)match(input,84,FOLLOW_84_in_ruleexpression_aux7708); if (state.failed) return current;
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

                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3692:2: ( (lv_exp_30_0= ruleexpression ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3693:1: (lv_exp_30_0= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3693:1: (lv_exp_30_0= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3694:3: lv_exp_30_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7745);
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3711:6: ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3711:6: ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3711:7: ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3711:7: ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3712:1: ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3712:1: ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3713:1: (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3713:1: (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' )
                                    int alt64=4;
                                    switch ( input.LA(1) ) {
                                    case 85:
                                        {
                                        alt64=1;
                                        }
                                        break;
                                    case 86:
                                        {
                                        alt64=2;
                                        }
                                        break;
                                    case 87:
                                        {
                                        alt64=3;
                                        }
                                        break;
                                    case 88:
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3714:3: lv_operador_31_1= '>>='
                                            {
                                            lv_operador_31_1=(Token)match(input,85,FOLLOW_85_in_ruleexpression_aux7773); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3726:8: lv_operador_31_2= '<<'
                                            {
                                            lv_operador_31_2=(Token)match(input,86,FOLLOW_86_in_ruleexpression_aux7802); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3738:8: lv_operador_31_3= '>>'
                                            {
                                            lv_operador_31_3=(Token)match(input,87,FOLLOW_87_in_ruleexpression_aux7831); if (state.failed) return current;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3750:8: lv_operador_31_4= '>>>'
                                            {
                                            lv_operador_31_4=(Token)match(input,88,FOLLOW_88_in_ruleexpression_aux7860); if (state.failed) return current;
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

                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3765:2: ( (lv_exp_32_0= ruleexpression ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3766:1: (lv_exp_32_0= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3766:1: (lv_exp_32_0= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3767:3: lv_exp_32_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_3_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7897);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3783:5: ( (lv_expressoes_33_0= ruleexpression_aux ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3784:1: (lv_expressoes_33_0= ruleexpression_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3784:1: (lv_expressoes_33_0= ruleexpression_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3785:3: lv_expressoes_33_0= ruleexpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressoesExpression_auxParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression_aux7921);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3809:1: entryRulemais_aux returns [EObject current=null] : iv_rulemais_aux= rulemais_aux EOF ;
    public final EObject entryRulemais_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemais_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3810:2: (iv_rulemais_aux= rulemais_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3811:2: iv_rulemais_aux= rulemais_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMais_auxRule()); 
            }
            pushFollow(FOLLOW_rulemais_aux_in_entryRulemais_aux7958);
            iv_rulemais_aux=rulemais_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemais_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemais_aux7968); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3818:1: rulemais_aux returns [EObject current=null] : ( ( (lv_operador_0_0= '+' ) ) | ( (lv_operador_1_0= '+=' ) ) ) ;
    public final EObject rulemais_aux() throws RecognitionException {
        EObject current = null;

        Token lv_operador_0_0=null;
        Token lv_operador_1_0=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3821:28: ( ( ( (lv_operador_0_0= '+' ) ) | ( (lv_operador_1_0= '+=' ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3822:1: ( ( (lv_operador_0_0= '+' ) ) | ( (lv_operador_1_0= '+=' ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3822:1: ( ( (lv_operador_0_0= '+' ) ) | ( (lv_operador_1_0= '+=' ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==89) ) {
                alt68=1;
            }
            else if ( (LA68_0==90) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3822:2: ( (lv_operador_0_0= '+' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3822:2: ( (lv_operador_0_0= '+' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3823:1: (lv_operador_0_0= '+' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3823:1: (lv_operador_0_0= '+' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3824:3: lv_operador_0_0= '+'
                    {
                    lv_operador_0_0=(Token)match(input,89,FOLLOW_89_in_rulemais_aux8011); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3838:6: ( (lv_operador_1_0= '+=' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3838:6: ( (lv_operador_1_0= '+=' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3839:1: (lv_operador_1_0= '+=' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3839:1: (lv_operador_1_0= '+=' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3840:3: lv_operador_1_0= '+='
                    {
                    lv_operador_1_0=(Token)match(input,90,FOLLOW_90_in_rulemais_aux8048); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3861:1: entryRulenewBlock returns [EObject current=null] : iv_rulenewBlock= rulenewBlock EOF ;
    public final EObject entryRulenewBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenewBlock = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3862:2: (iv_rulenewBlock= rulenewBlock EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3863:2: iv_rulenewBlock= rulenewBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewBlockRule()); 
            }
            pushFollow(FOLLOW_rulenewBlock_in_entryRulenewBlock8097);
            iv_rulenewBlock=rulenewBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenewBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenewBlock8107); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3870:1: rulenewBlock returns [EObject current=null] : (otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}' ) ;
    public final EObject rulenewBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_constructor_declaration_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3873:28: ( (otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3874:1: (otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3874:1: (otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3874:3: otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulenewBlock8144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNewBlockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNewBlockAccess().getConstructor_declarationParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleconstructor_declaration_in_rulenewBlock8169);
            this_constructor_declaration_1=ruleconstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_constructor_declaration_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulenewBlock8180); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3902:1: entryRulecreating_aux returns [EObject current=null] : iv_rulecreating_aux= rulecreating_aux EOF ;
    public final EObject entryRulecreating_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecreating_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3903:2: (iv_rulecreating_aux= rulecreating_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3904:2: iv_rulecreating_aux= rulecreating_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreating_auxRule()); 
            }
            pushFollow(FOLLOW_rulecreating_aux_in_entryRulecreating_aux8216);
            iv_rulecreating_aux=rulecreating_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecreating_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecreating_aux8226); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3911:1: rulecreating_aux returns [EObject current=null] : ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3914:28: ( ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3915:1: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3915:1: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) )
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3915:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3915:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3915:3: ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')'
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3915:3: ( ( '(' )=>otherlv_0= '(' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3915:4: ( '(' )=>otherlv_0= '('
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulecreating_aux8272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCreating_auxAccess().getLeftParenthesisKeyword_0_0());
                          
                    }

                    }

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3920:2: ( (lv_argumentos_1_0= rulearglist ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_FLOAT_LITERAL)||LA69_0==30||(LA69_0>=54 && LA69_0<=57)||(LA69_0>=60 && LA69_0<=62)||(LA69_0>=91 && LA69_0<=103)) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3921:1: (lv_argumentos_1_0= rulearglist )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3921:1: (lv_argumentos_1_0= rulearglist )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3922:3: lv_argumentos_1_0= rulearglist
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCreating_auxAccess().getArgumentosArglistParserRuleCall_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulearglist_in_rulecreating_aux8294);
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

                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulecreating_aux8307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCreating_auxAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3943:6: ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3943:6: ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3943:7: ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )*
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3943:7: ( ( '[' )=>this_aux_3= ruleaux )?
                    int alt70=2;
                    alt70 = dfa70.predict(input);
                    switch (alt70) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3943:8: ( '[' )=>this_aux_3= ruleaux
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCreating_auxAccess().getAuxParserRuleCall_1_0_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleaux_in_rulecreating_aux8348);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3956:3: (otherlv_4= '[' otherlv_5= ']' )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==32) ) {
                            int LA71_2 = input.LA(2);

                            if ( (LA71_2==33) ) {
                                alt71=1;
                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3956:5: otherlv_4= '[' otherlv_5= ']'
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_rulecreating_aux8362); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getCreating_auxAccess().getLeftSquareBracketKeyword_1_1_0());
                    	          
                    	    }
                    	    otherlv_5=(Token)match(input,33,FOLLOW_33_in_rulecreating_aux8374); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getCreating_auxAccess().getRightSquareBracketKeyword_1_1_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3972:1: entryRuleaux returns [EObject current=null] : iv_ruleaux= ruleaux EOF ;
    public final EObject entryRuleaux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3973:2: (iv_ruleaux= ruleaux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3974:2: iv_ruleaux= ruleaux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAuxRule()); 
            }
            pushFollow(FOLLOW_ruleaux_in_entryRuleaux8413);
            iv_ruleaux=ruleaux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleaux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleaux8423); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3981:1: ruleaux returns [EObject current=null] : (otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']' ) ;
    public final EObject ruleaux() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_espressao_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3984:28: ( (otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3985:1: (otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3985:1: (otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3985:3: otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleaux8460); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAuxAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3989:1: ( (lv_espressao_1_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3990:1: (lv_espressao_1_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3990:1: (lv_espressao_1_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3991:3: lv_espressao_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAuxAccess().getEspressaoExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleaux8481);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleaux8493); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4019:1: entryRuleliteral_expression returns [EObject current=null] : iv_ruleliteral_expression= ruleliteral_expression EOF ;
    public final EObject entryRuleliteral_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleliteral_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4020:2: (iv_ruleliteral_expression= ruleliteral_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4021:2: iv_ruleliteral_expression= ruleliteral_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteral_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleliteral_expression_in_entryRuleliteral_expression8529);
            iv_ruleliteral_expression=ruleliteral_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleliteral_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleliteral_expression8539); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4028:1: ruleliteral_expression returns [EObject current=null] : ( ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) ) | ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) ) | ( (lv_float_2_0= RULE_FLOAT_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleliteral_expression() throws RecognitionException {
        EObject current = null;

        Token lv_decimal_0_0=null;
        Token lv_inteiro_1_0=null;
        Token lv_float_2_0=null;
        Token lv_string_3_0=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4031:28: ( ( ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) ) | ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) ) | ( (lv_float_2_0= RULE_FLOAT_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4032:1: ( ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) ) | ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) ) | ( (lv_float_2_0= RULE_FLOAT_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4032:1: ( ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) ) | ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) ) | ( (lv_float_2_0= RULE_FLOAT_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL_DIGITS:
                {
                alt73=1;
                }
                break;
            case RULE_INTEGER_LITERAL:
                {
                alt73=2;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt73=3;
                }
                break;
            case RULE_STRING:
                {
                alt73=4;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4032:2: ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4032:2: ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4032:3: ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4033:1: (lv_decimal_0_0= RULE_DECIMAL_DIGITS )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4034:3: lv_decimal_0_0= RULE_DECIMAL_DIGITS
                    {
                    lv_decimal_0_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleliteral_expression8586); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4051:6: ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4051:6: ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4052:1: (lv_inteiro_1_0= RULE_INTEGER_LITERAL )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4052:1: (lv_inteiro_1_0= RULE_INTEGER_LITERAL )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4053:3: lv_inteiro_1_0= RULE_INTEGER_LITERAL
                    {
                    lv_inteiro_1_0=(Token)match(input,RULE_INTEGER_LITERAL,FOLLOW_RULE_INTEGER_LITERAL_in_ruleliteral_expression8614); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4070:6: ( (lv_float_2_0= RULE_FLOAT_LITERAL ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4070:6: ( (lv_float_2_0= RULE_FLOAT_LITERAL ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4071:1: (lv_float_2_0= RULE_FLOAT_LITERAL )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4071:1: (lv_float_2_0= RULE_FLOAT_LITERAL )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4072:3: lv_float_2_0= RULE_FLOAT_LITERAL
                    {
                    lv_float_2_0=(Token)match(input,RULE_FLOAT_LITERAL,FOLLOW_RULE_FLOAT_LITERAL_in_ruleliteral_expression8642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_float_2_0, grammarAccess.getLiteral_expressionAccess().getFloatFLOAT_LITERALTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteral_expressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"float",
                              		lv_float_2_0, 
                              		"FLOAT_LITERAL");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4089:6: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4089:6: ( (lv_string_3_0= RULE_STRING ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4090:1: (lv_string_3_0= RULE_STRING )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4090:1: (lv_string_3_0= RULE_STRING )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4091:3: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleliteral_expression8670); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4115:1: entryRulelogical_expression returns [EObject current=null] : iv_rulelogical_expression= rulelogical_expression EOF ;
    public final EObject entryRulelogical_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelogical_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4116:2: (iv_rulelogical_expression= rulelogical_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4117:2: iv_rulelogical_expression= rulelogical_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_expressionRule()); 
            }
            pushFollow(FOLLOW_rulelogical_expression_in_entryRulelogical_expression8711);
            iv_rulelogical_expression=rulelogical_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelogical_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelogical_expression8721); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4124:1: rulelogical_expression returns [EObject current=null] : ( ( ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) | ( (lv_operador_2_0= 'true' ) ) | ( (lv_operador_3_0= 'false' ) ) ) ;
    public final EObject rulelogical_expression() throws RecognitionException {
        EObject current = null;

        Token lv_operador_0_0=null;
        Token lv_operador_2_0=null;
        Token lv_operador_3_0=null;
        EObject lv_expressao_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4127:28: ( ( ( ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) | ( (lv_operador_2_0= 'true' ) ) | ( (lv_operador_3_0= 'false' ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4128:1: ( ( ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) | ( (lv_operador_2_0= 'true' ) ) | ( (lv_operador_3_0= 'false' ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4128:1: ( ( ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) | ( (lv_operador_2_0= 'true' ) ) | ( (lv_operador_3_0= 'false' ) ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt74=1;
                }
                break;
            case 92:
                {
                alt74=2;
                }
                break;
            case 93:
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4128:2: ( ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4128:2: ( ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4128:3: ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4128:3: ( (lv_operador_0_0= '!' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4129:1: (lv_operador_0_0= '!' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4129:1: (lv_operador_0_0= '!' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4130:3: lv_operador_0_0= '!'
                    {
                    lv_operador_0_0=(Token)match(input,91,FOLLOW_91_in_rulelogical_expression8765); if (state.failed) return current;
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4143:2: ( (lv_expressao_1_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4144:1: (lv_expressao_1_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4144:1: (lv_expressao_1_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4145:3: lv_expressao_1_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogical_expressionAccess().getExpressaoExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulelogical_expression8799);
                    lv_expressao_1_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogical_expressionRule());
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
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4162:6: ( (lv_operador_2_0= 'true' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4162:6: ( (lv_operador_2_0= 'true' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4163:1: (lv_operador_2_0= 'true' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4163:1: (lv_operador_2_0= 'true' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4164:3: lv_operador_2_0= 'true'
                    {
                    lv_operador_2_0=(Token)match(input,92,FOLLOW_92_in_rulelogical_expression8824); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4178:6: ( (lv_operador_3_0= 'false' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4178:6: ( (lv_operador_3_0= 'false' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4179:1: (lv_operador_3_0= 'false' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4179:1: (lv_operador_3_0= 'false' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4180:3: lv_operador_3_0= 'false'
                    {
                    lv_operador_3_0=(Token)match(input,93,FOLLOW_93_in_rulelogical_expression8861); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4201:1: entryRulebit_expression returns [EObject current=null] : iv_rulebit_expression= rulebit_expression EOF ;
    public final EObject entryRulebit_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebit_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4202:2: (iv_rulebit_expression= rulebit_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4203:2: iv_rulebit_expression= rulebit_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBit_expressionRule()); 
            }
            pushFollow(FOLLOW_rulebit_expression_in_entryRulebit_expression8910);
            iv_rulebit_expression=rulebit_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebit_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulebit_expression8920); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4210:1: rulebit_expression returns [EObject current=null] : ( ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) ;
    public final EObject rulebit_expression() throws RecognitionException {
        EObject current = null;

        Token lv_operador_0_0=null;
        EObject lv_expressao_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4213:28: ( ( ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4214:1: ( ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4214:1: ( ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4214:2: ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4214:2: ( (lv_operador_0_0= '~' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4215:1: (lv_operador_0_0= '~' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4215:1: (lv_operador_0_0= '~' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4216:3: lv_operador_0_0= '~'
            {
            lv_operador_0_0=(Token)match(input,94,FOLLOW_94_in_rulebit_expression8963); if (state.failed) return current;
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4229:2: ( (lv_expressao_1_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4230:1: (lv_expressao_1_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4230:1: (lv_expressao_1_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4231:3: lv_expressao_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBit_expressionAccess().getExpressaoExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulebit_expression8997);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4255:1: entryRulenumeric_expression returns [EObject current=null] : iv_rulenumeric_expression= rulenumeric_expression EOF ;
    public final EObject entryRulenumeric_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumeric_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4256:2: (iv_rulenumeric_expression= rulenumeric_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4257:2: iv_rulenumeric_expression= rulenumeric_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_expressionRule()); 
            }
            pushFollow(FOLLOW_rulenumeric_expression_in_entryRulenumeric_expression9033);
            iv_rulenumeric_expression=rulenumeric_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenumeric_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenumeric_expression9043); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4264:1: rulenumeric_expression returns [EObject current=null] : ( ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) ;
    public final EObject rulenumeric_expression() throws RecognitionException {
        EObject current = null;

        Token lv_operador_0_1=null;
        Token lv_operador_0_2=null;
        Token lv_operador_0_3=null;
        EObject lv_expressao_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4267:28: ( ( ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4268:1: ( ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4268:1: ( ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4268:2: ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4268:2: ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4269:1: ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4269:1: ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4270:1: (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4270:1: (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt75=1;
                }
                break;
            case 60:
                {
                alt75=2;
                }
                break;
            case 61:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4271:3: lv_operador_0_1= '-'
                    {
                    lv_operador_0_1=(Token)match(input,62,FOLLOW_62_in_rulenumeric_expression9088); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4283:8: lv_operador_0_2= '++'
                    {
                    lv_operador_0_2=(Token)match(input,60,FOLLOW_60_in_rulenumeric_expression9117); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4295:8: lv_operador_0_3= '--'
                    {
                    lv_operador_0_3=(Token)match(input,61,FOLLOW_61_in_rulenumeric_expression9146); if (state.failed) return current;
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4310:2: ( (lv_expressao_1_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4311:1: (lv_expressao_1_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4311:1: (lv_expressao_1_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4312:3: lv_expressao_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumeric_expressionAccess().getExpressaoExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulenumeric_expression9183);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4336:1: entryRulearglist returns [EObject current=null] : iv_rulearglist= rulearglist EOF ;
    public final EObject entryRulearglist() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearglist = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4337:2: (iv_rulearglist= rulearglist EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4338:2: iv_rulearglist= rulearglist EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArglistRule()); 
            }
            pushFollow(FOLLOW_rulearglist_in_entryRulearglist9219);
            iv_rulearglist=rulearglist();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearglist; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulearglist9229); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4345:1: rulearglist returns [EObject current=null] : ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4348:28: ( ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4349:1: ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4349:1: ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) )
            int alt78=3;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4349:2: ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4349:2: ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4349:3: ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )*
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4349:3: ( (lv_expressoesArgumentos_0_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4350:1: (lv_expressoesArgumentos_0_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4350:1: (lv_expressoesArgumentos_0_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4351:3: lv_expressoesArgumentos_0_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArglistAccess().getExpressoesArgumentosExpressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulearglist9276);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4367:2: (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==26) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4367:4: otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) )
                    	    {
                    	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_rulearglist9289); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_1, grammarAccess.getArglistAccess().getCommaKeyword_0_1_0());
                    	          
                    	    }
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4371:1: ( (lv_expressoesArgumentos_2_0= ruleexpression ) )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4372:1: (lv_expressoesArgumentos_2_0= ruleexpression )
                    	    {
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4372:1: (lv_expressoesArgumentos_2_0= ruleexpression )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4373:3: lv_expressoesArgumentos_2_0= ruleexpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArglistAccess().getExpressoesArgumentosExpressionParserRuleCall_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleexpression_in_rulearglist9310);
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
                    	    break loop76;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4390:6: (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4390:6: (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4390:8: otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"'
                    {
                    otherlv_3=(Token)match(input,95,FOLLOW_95_in_rulearglist9332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArglistAccess().getQuotationMarkKeyword_1_0());
                          
                    }
                    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulearglist9343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_4, grammarAccess.getArglistAccess().getSTRINGTerminalRuleCall_1_1()); 
                          
                    }
                    otherlv_5=(Token)match(input,95,FOLLOW_95_in_rulearglist9354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getArglistAccess().getQuotationMarkKeyword_1_2());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4403:6: ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4403:6: ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4403:7: ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )*
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4403:7: ( (lv_tipoParametro_6_0= ruletype ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4404:1: (lv_tipoParametro_6_0= ruletype )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4404:1: (lv_tipoParametro_6_0= ruletype )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4405:3: lv_tipoParametro_6_0= ruletype
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArglistAccess().getTipoParametroTypeParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_in_rulearglist9383);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4421:2: ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4422:1: (lv_nomeParametro_7_0= RULE_IDENTIFIER )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4422:1: (lv_nomeParametro_7_0= RULE_IDENTIFIER )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4423:3: lv_nomeParametro_7_0= RULE_IDENTIFIER
                    {
                    lv_nomeParametro_7_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulearglist9400); if (state.failed) return current;
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4439:2: (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==26) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4439:4: otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) )
                    	    {
                    	    otherlv_8=(Token)match(input,26,FOLLOW_26_in_rulearglist9418); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getArglistAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4443:1: ( (lv_tipoParametro_9_0= ruletype ) )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4444:1: (lv_tipoParametro_9_0= ruletype )
                    	    {
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4444:1: (lv_tipoParametro_9_0= ruletype )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4445:3: lv_tipoParametro_9_0= ruletype
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArglistAccess().getTipoParametroTypeParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruletype_in_rulearglist9439);
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

                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4461:2: ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4462:1: (lv_nomeParametro_10_0= RULE_IDENTIFIER )
                    	    {
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4462:1: (lv_nomeParametro_10_0= RULE_IDENTIFIER )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4463:3: lv_nomeParametro_10_0= RULE_IDENTIFIER
                    	    {
                    	    lv_nomeParametro_10_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulearglist9456); if (state.failed) return current;
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
                    	    break loop77;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4487:1: entryRulename returns [EObject current=null] : iv_rulename= rulename EOF ;
    public final EObject entryRulename() throws RecognitionException {
        EObject current = null;

        EObject iv_rulename = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4488:2: (iv_rulename= rulename EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4489:2: iv_rulename= rulename EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_rulename_in_entryRulename9500);
            iv_rulename=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulename; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulename9510); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4496:1: rulename returns [EObject current=null] : ( ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) ) ) ;
    public final EObject rulename() throws RecognitionException {
        EObject current = null;

        Token lv_nome_0_0=null;
        EObject lv_pacote_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4499:28: ( ( ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4500:1: ( ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4500:1: ( ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4500:2: ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4500:2: ( (lv_nome_0_0= RULE_IDENTIFIER ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4501:1: (lv_nome_0_0= RULE_IDENTIFIER )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4501:1: (lv_nome_0_0= RULE_IDENTIFIER )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4502:3: lv_nome_0_0= RULE_IDENTIFIER
            {
            lv_nome_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulename9552); if (state.failed) return current;
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4518:2: ( (lv_pacote_1_0= rulepackage_name_aux ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4519:1: (lv_pacote_1_0= rulepackage_name_aux )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4519:1: (lv_pacote_1_0= rulepackage_name_aux )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4520:3: lv_pacote_1_0= rulepackage_name_aux
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameAccess().getPacotePackage_name_auxParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulepackage_name_aux_in_rulename9578);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4544:1: entryRulepackage_name_aux returns [EObject current=null] : iv_rulepackage_name_aux= rulepackage_name_aux EOF ;
    public final EObject entryRulepackage_name_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepackage_name_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4545:2: (iv_rulepackage_name_aux= rulepackage_name_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4546:2: iv_rulepackage_name_aux= rulepackage_name_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_name_auxRule()); 
            }
            pushFollow(FOLLOW_rulepackage_name_aux_in_entryRulepackage_name_aux9614);
            iv_rulepackage_name_aux=rulepackage_name_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepackage_name_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepackage_name_aux9624); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4553:1: rulepackage_name_aux returns [EObject current=null] : (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )* ;
    public final EObject rulepackage_name_aux() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nomePacote_1_0=null;
        EObject lv_pacote_2_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4556:28: ( (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4557:1: (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4557:1: (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==58) ) {
                    int LA79_2 = input.LA(2);

                    if ( (synpred196_InternalSimpleJava()) ) {
                        alt79=1;
                    }


                }


                switch (alt79) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4557:3: otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) )
            	    {
            	    otherlv_0=(Token)match(input,58,FOLLOW_58_in_rulepackage_name_aux9661); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_0, grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0());
            	          
            	    }
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4561:1: ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4562:1: (lv_nomePacote_1_0= RULE_IDENTIFIER )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4562:1: (lv_nomePacote_1_0= RULE_IDENTIFIER )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4563:3: lv_nomePacote_1_0= RULE_IDENTIFIER
            	    {
            	    lv_nomePacote_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulepackage_name_aux9678); if (state.failed) return current;
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

            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4579:2: ( (lv_pacote_2_0= rulepackage_name_aux ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4580:1: (lv_pacote_2_0= rulepackage_name_aux )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4580:1: (lv_pacote_2_0= rulepackage_name_aux )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4581:3: lv_pacote_2_0= rulepackage_name_aux
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackage_name_auxAccess().getPacotePackage_name_auxParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulepackage_name_aux_in_rulepackage_name_aux9704);
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
            	    break loop79;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4605:1: entryRuletype_specifier returns [EObject current=null] : iv_ruletype_specifier= ruletype_specifier EOF ;
    public final EObject entryRuletype_specifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_specifier = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4606:2: (iv_ruletype_specifier= ruletype_specifier EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4607:2: iv_ruletype_specifier= ruletype_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruletype_specifier_in_entryRuletype_specifier9741);
            iv_ruletype_specifier=ruletype_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_specifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_specifier9751); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4614:1: ruletype_specifier returns [EObject current=null] : ( ( (lv_nome_0_0= 'boolean' ) ) | ( (lv_nome_1_0= 'byte' ) ) | ( (lv_nome_2_0= 'char' ) ) | ( (lv_nome_3_0= 'short' ) ) | ( (lv_nome_4_0= 'int' ) ) | ( (lv_nome_5_0= 'float' ) ) | ( (lv_nome_6_0= 'long' ) ) | ( (lv_nome_7_0= 'double' ) ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4617:28: ( ( ( (lv_nome_0_0= 'boolean' ) ) | ( (lv_nome_1_0= 'byte' ) ) | ( (lv_nome_2_0= 'char' ) ) | ( (lv_nome_3_0= 'short' ) ) | ( (lv_nome_4_0= 'int' ) ) | ( (lv_nome_5_0= 'float' ) ) | ( (lv_nome_6_0= 'long' ) ) | ( (lv_nome_7_0= 'double' ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4618:1: ( ( (lv_nome_0_0= 'boolean' ) ) | ( (lv_nome_1_0= 'byte' ) ) | ( (lv_nome_2_0= 'char' ) ) | ( (lv_nome_3_0= 'short' ) ) | ( (lv_nome_4_0= 'int' ) ) | ( (lv_nome_5_0= 'float' ) ) | ( (lv_nome_6_0= 'long' ) ) | ( (lv_nome_7_0= 'double' ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4618:1: ( ( (lv_nome_0_0= 'boolean' ) ) | ( (lv_nome_1_0= 'byte' ) ) | ( (lv_nome_2_0= 'char' ) ) | ( (lv_nome_3_0= 'short' ) ) | ( (lv_nome_4_0= 'int' ) ) | ( (lv_nome_5_0= 'float' ) ) | ( (lv_nome_6_0= 'long' ) ) | ( (lv_nome_7_0= 'double' ) ) )
            int alt80=8;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt80=1;
                }
                break;
            case 97:
                {
                alt80=2;
                }
                break;
            case 98:
                {
                alt80=3;
                }
                break;
            case 99:
                {
                alt80=4;
                }
                break;
            case 100:
                {
                alt80=5;
                }
                break;
            case 101:
                {
                alt80=6;
                }
                break;
            case 102:
                {
                alt80=7;
                }
                break;
            case 103:
                {
                alt80=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4618:2: ( (lv_nome_0_0= 'boolean' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4618:2: ( (lv_nome_0_0= 'boolean' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4619:1: (lv_nome_0_0= 'boolean' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4619:1: (lv_nome_0_0= 'boolean' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4620:3: lv_nome_0_0= 'boolean'
                    {
                    lv_nome_0_0=(Token)match(input,96,FOLLOW_96_in_ruletype_specifier9794); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4634:6: ( (lv_nome_1_0= 'byte' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4634:6: ( (lv_nome_1_0= 'byte' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4635:1: (lv_nome_1_0= 'byte' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4635:1: (lv_nome_1_0= 'byte' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4636:3: lv_nome_1_0= 'byte'
                    {
                    lv_nome_1_0=(Token)match(input,97,FOLLOW_97_in_ruletype_specifier9831); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4650:6: ( (lv_nome_2_0= 'char' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4650:6: ( (lv_nome_2_0= 'char' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4651:1: (lv_nome_2_0= 'char' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4651:1: (lv_nome_2_0= 'char' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4652:3: lv_nome_2_0= 'char'
                    {
                    lv_nome_2_0=(Token)match(input,98,FOLLOW_98_in_ruletype_specifier9868); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4666:6: ( (lv_nome_3_0= 'short' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4666:6: ( (lv_nome_3_0= 'short' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4667:1: (lv_nome_3_0= 'short' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4667:1: (lv_nome_3_0= 'short' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4668:3: lv_nome_3_0= 'short'
                    {
                    lv_nome_3_0=(Token)match(input,99,FOLLOW_99_in_ruletype_specifier9905); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4682:6: ( (lv_nome_4_0= 'int' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4682:6: ( (lv_nome_4_0= 'int' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4683:1: (lv_nome_4_0= 'int' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4683:1: (lv_nome_4_0= 'int' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4684:3: lv_nome_4_0= 'int'
                    {
                    lv_nome_4_0=(Token)match(input,100,FOLLOW_100_in_ruletype_specifier9942); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4698:6: ( (lv_nome_5_0= 'float' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4698:6: ( (lv_nome_5_0= 'float' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4699:1: (lv_nome_5_0= 'float' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4699:1: (lv_nome_5_0= 'float' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4700:3: lv_nome_5_0= 'float'
                    {
                    lv_nome_5_0=(Token)match(input,101,FOLLOW_101_in_ruletype_specifier9979); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4714:6: ( (lv_nome_6_0= 'long' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4714:6: ( (lv_nome_6_0= 'long' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4715:1: (lv_nome_6_0= 'long' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4715:1: (lv_nome_6_0= 'long' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4716:3: lv_nome_6_0= 'long'
                    {
                    lv_nome_6_0=(Token)match(input,102,FOLLOW_102_in_ruletype_specifier10016); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4730:6: ( (lv_nome_7_0= 'double' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4730:6: ( (lv_nome_7_0= 'double' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4731:1: (lv_nome_7_0= 'double' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4731:1: (lv_nome_7_0= 'double' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4732:3: lv_nome_7_0= 'double'
                    {
                    lv_nome_7_0=(Token)match(input,103,FOLLOW_103_in_ruletype_specifier10053); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4753:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4754:2: (iv_ruletype= ruletype EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4755:2: iv_ruletype= ruletype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruletype_in_entryRuletype10102);
            iv_ruletype=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype10112); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4762:1: ruletype returns [EObject current=null] : ( ( ( (lv_tipo_0_0= ruletype_specifier ) ) | ( (lv_tipo_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )* ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_tipo_0_0 = null;

        EObject lv_tipo_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4765:28: ( ( ( ( (lv_tipo_0_0= ruletype_specifier ) ) | ( (lv_tipo_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4766:1: ( ( ( (lv_tipo_0_0= ruletype_specifier ) ) | ( (lv_tipo_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4766:1: ( ( ( (lv_tipo_0_0= ruletype_specifier ) ) | ( (lv_tipo_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4766:2: ( ( (lv_tipo_0_0= ruletype_specifier ) ) | ( (lv_tipo_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4766:2: ( ( (lv_tipo_0_0= ruletype_specifier ) ) | ( (lv_tipo_1_0= rulename ) ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=96 && LA81_0<=103)) ) {
                alt81=1;
            }
            else if ( (LA81_0==RULE_IDENTIFIER) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4766:3: ( (lv_tipo_0_0= ruletype_specifier ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4766:3: ( (lv_tipo_0_0= ruletype_specifier ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4767:1: (lv_tipo_0_0= ruletype_specifier )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4767:1: (lv_tipo_0_0= ruletype_specifier )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4768:3: lv_tipo_0_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getTipoType_specifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_ruletype10159);
                    lv_tipo_0_0=ruletype_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"tipo",
                              		lv_tipo_0_0, 
                              		"type_specifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4785:6: ( (lv_tipo_1_0= rulename ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4785:6: ( (lv_tipo_1_0= rulename ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4786:1: (lv_tipo_1_0= rulename )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4786:1: (lv_tipo_1_0= rulename )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4787:3: lv_tipo_1_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getTipoNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_ruletype10186);
                    lv_tipo_1_0=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"tipo",
                              		lv_tipo_1_0, 
                              		"name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4803:3: (otherlv_2= '[' otherlv_3= ']' )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==32) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4803:5: otherlv_2= '[' otherlv_3= ']'
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruletype10200); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruletype10212); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop82;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4819:1: entryRuleMODIFIER returns [EObject current=null] : iv_ruleMODIFIER= ruleMODIFIER EOF ;
    public final EObject entryRuleMODIFIER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODIFIER = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4820:2: (iv_ruleMODIFIER= ruleMODIFIER EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4821:2: iv_ruleMODIFIER= ruleMODIFIER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMODIFIERRule()); 
            }
            pushFollow(FOLLOW_ruleMODIFIER_in_entryRuleMODIFIER10250);
            iv_ruleMODIFIER=ruleMODIFIER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMODIFIER; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODIFIER10260); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4828:1: ruleMODIFIER returns [EObject current=null] : ( ( (lv_modificador_0_0= 'public' ) ) | ( (lv_modificador_1_0= 'private' ) ) | ( (lv_modificador_2_0= 'protected' ) ) | ( (lv_modificador_3_0= 'static' ) ) | ( (lv_modificador_4_0= 'final' ) ) | ( (lv_modificador_5_0= 'native' ) ) | ( (lv_modificador_6_0= 'synchronized' ) ) | ( (lv_modificador_7_0= 'abstract' ) ) | ( (lv_modificador_8_0= 'threadsafe' ) ) | ( (lv_modificador_9_0= 'transient' ) ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4831:28: ( ( ( (lv_modificador_0_0= 'public' ) ) | ( (lv_modificador_1_0= 'private' ) ) | ( (lv_modificador_2_0= 'protected' ) ) | ( (lv_modificador_3_0= 'static' ) ) | ( (lv_modificador_4_0= 'final' ) ) | ( (lv_modificador_5_0= 'native' ) ) | ( (lv_modificador_6_0= 'synchronized' ) ) | ( (lv_modificador_7_0= 'abstract' ) ) | ( (lv_modificador_8_0= 'threadsafe' ) ) | ( (lv_modificador_9_0= 'transient' ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4832:1: ( ( (lv_modificador_0_0= 'public' ) ) | ( (lv_modificador_1_0= 'private' ) ) | ( (lv_modificador_2_0= 'protected' ) ) | ( (lv_modificador_3_0= 'static' ) ) | ( (lv_modificador_4_0= 'final' ) ) | ( (lv_modificador_5_0= 'native' ) ) | ( (lv_modificador_6_0= 'synchronized' ) ) | ( (lv_modificador_7_0= 'abstract' ) ) | ( (lv_modificador_8_0= 'threadsafe' ) ) | ( (lv_modificador_9_0= 'transient' ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4832:1: ( ( (lv_modificador_0_0= 'public' ) ) | ( (lv_modificador_1_0= 'private' ) ) | ( (lv_modificador_2_0= 'protected' ) ) | ( (lv_modificador_3_0= 'static' ) ) | ( (lv_modificador_4_0= 'final' ) ) | ( (lv_modificador_5_0= 'native' ) ) | ( (lv_modificador_6_0= 'synchronized' ) ) | ( (lv_modificador_7_0= 'abstract' ) ) | ( (lv_modificador_8_0= 'threadsafe' ) ) | ( (lv_modificador_9_0= 'transient' ) ) )
            int alt83=10;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt83=1;
                }
                break;
            case 105:
                {
                alt83=2;
                }
                break;
            case 106:
                {
                alt83=3;
                }
                break;
            case 53:
                {
                alt83=4;
                }
                break;
            case 107:
                {
                alt83=5;
                }
                break;
            case 108:
                {
                alt83=6;
                }
                break;
            case 34:
                {
                alt83=7;
                }
                break;
            case 109:
                {
                alt83=8;
                }
                break;
            case 110:
                {
                alt83=9;
                }
                break;
            case 111:
                {
                alt83=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4832:2: ( (lv_modificador_0_0= 'public' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4832:2: ( (lv_modificador_0_0= 'public' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4833:1: (lv_modificador_0_0= 'public' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4833:1: (lv_modificador_0_0= 'public' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4834:3: lv_modificador_0_0= 'public'
                    {
                    lv_modificador_0_0=(Token)match(input,104,FOLLOW_104_in_ruleMODIFIER10303); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4848:6: ( (lv_modificador_1_0= 'private' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4848:6: ( (lv_modificador_1_0= 'private' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4849:1: (lv_modificador_1_0= 'private' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4849:1: (lv_modificador_1_0= 'private' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4850:3: lv_modificador_1_0= 'private'
                    {
                    lv_modificador_1_0=(Token)match(input,105,FOLLOW_105_in_ruleMODIFIER10340); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4864:6: ( (lv_modificador_2_0= 'protected' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4864:6: ( (lv_modificador_2_0= 'protected' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4865:1: (lv_modificador_2_0= 'protected' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4865:1: (lv_modificador_2_0= 'protected' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4866:3: lv_modificador_2_0= 'protected'
                    {
                    lv_modificador_2_0=(Token)match(input,106,FOLLOW_106_in_ruleMODIFIER10377); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4880:6: ( (lv_modificador_3_0= 'static' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4880:6: ( (lv_modificador_3_0= 'static' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4881:1: (lv_modificador_3_0= 'static' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4881:1: (lv_modificador_3_0= 'static' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4882:3: lv_modificador_3_0= 'static'
                    {
                    lv_modificador_3_0=(Token)match(input,53,FOLLOW_53_in_ruleMODIFIER10414); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4896:6: ( (lv_modificador_4_0= 'final' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4896:6: ( (lv_modificador_4_0= 'final' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4897:1: (lv_modificador_4_0= 'final' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4897:1: (lv_modificador_4_0= 'final' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4898:3: lv_modificador_4_0= 'final'
                    {
                    lv_modificador_4_0=(Token)match(input,107,FOLLOW_107_in_ruleMODIFIER10451); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4912:6: ( (lv_modificador_5_0= 'native' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4912:6: ( (lv_modificador_5_0= 'native' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4913:1: (lv_modificador_5_0= 'native' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4913:1: (lv_modificador_5_0= 'native' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4914:3: lv_modificador_5_0= 'native'
                    {
                    lv_modificador_5_0=(Token)match(input,108,FOLLOW_108_in_ruleMODIFIER10488); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4928:6: ( (lv_modificador_6_0= 'synchronized' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4928:6: ( (lv_modificador_6_0= 'synchronized' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4929:1: (lv_modificador_6_0= 'synchronized' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4929:1: (lv_modificador_6_0= 'synchronized' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4930:3: lv_modificador_6_0= 'synchronized'
                    {
                    lv_modificador_6_0=(Token)match(input,34,FOLLOW_34_in_ruleMODIFIER10525); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4944:6: ( (lv_modificador_7_0= 'abstract' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4944:6: ( (lv_modificador_7_0= 'abstract' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4945:1: (lv_modificador_7_0= 'abstract' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4945:1: (lv_modificador_7_0= 'abstract' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4946:3: lv_modificador_7_0= 'abstract'
                    {
                    lv_modificador_7_0=(Token)match(input,109,FOLLOW_109_in_ruleMODIFIER10562); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4960:6: ( (lv_modificador_8_0= 'threadsafe' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4960:6: ( (lv_modificador_8_0= 'threadsafe' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4961:1: (lv_modificador_8_0= 'threadsafe' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4961:1: (lv_modificador_8_0= 'threadsafe' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4962:3: lv_modificador_8_0= 'threadsafe'
                    {
                    lv_modificador_8_0=(Token)match(input,110,FOLLOW_110_in_ruleMODIFIER10599); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4976:6: ( (lv_modificador_9_0= 'transient' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4976:6: ( (lv_modificador_9_0= 'transient' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4977:1: (lv_modificador_9_0= 'transient' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4977:1: (lv_modificador_9_0= 'transient' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4978:3: lv_modificador_9_0= 'transient'
                    {
                    lv_modificador_9_0=(Token)match(input,111,FOLLOW_111_in_ruleMODIFIER10636); if (state.failed) return current;
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:737:4: ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:737:4: ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:737:4: ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:738:1: (lv_declaracaoMetodo_1_0= rulemethod_declaration )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:738:1: (lv_declaracaoMetodo_1_0= rulemethod_declaration )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:739:3: lv_declaracaoMetodo_1_0= rulemethod_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoMetodoMethod_declarationParserRuleCall_0_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulemethod_declaration_in_synpred18_InternalSimpleJava1460);
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:756:6: ( ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:756:6: ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:756:6: ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:757:1: (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:757:1: (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:758:3: lv_declaracaoConstrutor_2_0= ruleconstructor_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoConstrutorConstructor_declarationParserRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleconstructor_declaration_in_synpred19_InternalSimpleJava1487);
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1143:2: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1143:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1143:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1143:3: ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1154:1: (lv_declaracaoVariavel_0_0= rulevariable_declaration )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1155:3: lv_declaracaoVariavel_0_0= rulevariable_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulevariable_declaration_in_synpred39_InternalSimpleJava2359);
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:6: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';'
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:8: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1185:1: (lv_expressao_1_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1186:3: lv_expressao_1_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getExpressaoExpressionParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred57_InternalSimpleJava2496);
        lv_expressao_1_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,18,FOLLOW_18_in_synpred57_InternalSimpleJava2508); if (state.failed) return ;

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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1340:6: ( (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1340:6: (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1340:6: (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1340:8: otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) )
        {
        otherlv_10=(Token)match(input,34,FOLLOW_34_in_synpred65_InternalSimpleJava2717); if (state.failed) return ;
        otherlv_11=(Token)match(input,30,FOLLOW_30_in_synpred65_InternalSimpleJava2729); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1348:1: ( (lv_expressaoSynchronized_12_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1349:1: (lv_expressaoSynchronized_12_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1349:1: (lv_expressaoSynchronized_12_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1350:3: lv_expressaoSynchronized_12_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getExpressaoSynchronizedExpressionParserRuleCall_9_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred65_InternalSimpleJava2750);
        lv_expressaoSynchronized_12_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_13=(Token)match(input,31,FOLLOW_31_in_synpred65_InternalSimpleJava2762); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1370:1: ( (lv_corpoSynchronize_14_0= rulestatement ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1371:1: (lv_corpoSynchronize_14_0= rulestatement )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1371:1: (lv_corpoSynchronize_14_0= rulestatement )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1372:3: lv_corpoSynchronize_14_0= rulestatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoSynchronizeStatementParserRuleCall_9_4_0()); 
          	    
        }
        pushFollow(FOLLOW_rulestatement_in_synpred65_InternalSimpleJava2783);
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1443:6: ( (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1443:6: (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1443:6: (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1443:7: this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement
        {
        this_IDENTIFIER_21=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_synpred69_InternalSimpleJava2909); if (state.failed) return ;
        otherlv_22=(Token)match(input,37,FOLLOW_37_in_synpred69_InternalSimpleJava2920); if (state.failed) return ;
        pushFollow(FOLLOW_rulestatement_in_synpred69_InternalSimpleJava2945);
        this_statement_23=rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred69_InternalSimpleJava

    // $ANTLR start synpred87_InternalSimpleJava
    public final void synpred87_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1898:3: ( ( 'else' ( ( rulestatement ) ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1898:4: ( 'else' ( ( rulestatement ) ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1898:4: ( 'else' ( ( rulestatement ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1898:6: 'else' ( ( rulestatement ) )
        {
        match(input,43,FOLLOW_43_in_synpred87_InternalSimpleJava3884); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1899:1: ( ( rulestatement ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1900:1: ( rulestatement )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1900:1: ( rulestatement )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1901:1: rulestatement
        {
        pushFollow(FOLLOW_rulestatement_in_synpred87_InternalSimpleJava3891);
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2100:2: ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2100:2: ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2100:2: ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2100:3: ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2105:1: (lv_declaracaoVariavel_2_0= rulevariable_declaration )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2106:3: lv_declaracaoVariavel_2_0= rulevariable_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFor_statementAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulevariable_declaration_in_synpred89_InternalSimpleJava4376);
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2123:6: ( ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2123:6: ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2123:6: ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2123:7: ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';'
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2123:7: ( (lv_expressaoDeclaracao_3_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2124:1: (lv_expressaoDeclaracao_3_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2124:1: (lv_expressaoDeclaracao_3_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2125:3: lv_expressaoDeclaracao_3_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressaoDeclaracaoExpressionParserRuleCall_2_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred90_InternalSimpleJava4404);
        lv_expressaoDeclaracao_3_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,18,FOLLOW_18_in_synpred90_InternalSimpleJava4416); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred90_InternalSimpleJava

    // $ANTLR start synpred93_InternalSimpleJava
    public final void synpred93_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2255:3: ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2255:4: ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2255:4: ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2255:6: 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) )
        {
        match(input,48,FOLLOW_48_in_synpred93_InternalSimpleJava4642); if (state.failed) return ;
        match(input,30,FOLLOW_30_in_synpred93_InternalSimpleJava4646); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2257:1: ( ( ruleparameter ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2258:1: ( ruleparameter )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2258:1: ( ruleparameter )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2259:1: ruleparameter
        {
        pushFollow(FOLLOW_ruleparameter_in_synpred93_InternalSimpleJava4653);
        ruleparameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,31,FOLLOW_31_in_synpred93_InternalSimpleJava4659); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2262:1: ( ( rulestatement_block ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2263:1: ( rulestatement_block )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2263:1: ( rulestatement_block )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2264:1: rulestatement_block
        {
        pushFollow(FOLLOW_rulestatement_block_in_synpred93_InternalSimpleJava4666);
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
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2314:6: ( ( 'finally' ( ( rulestatement_block ) ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2314:7: ( 'finally' ( ( rulestatement_block ) ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2314:7: ( 'finally' ( ( rulestatement_block ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2314:9: 'finally' ( ( rulestatement_block ) )
        {
        match(input,49,FOLLOW_49_in_synpred94_InternalSimpleJava4760); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2315:1: ( ( rulestatement_block ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2316:1: ( rulestatement_block )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2316:1: ( rulestatement_block )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2317:1: rulestatement_block
        {
        pushFollow(FOLLOW_rulestatement_block_in_synpred94_InternalSimpleJava4767);
        rulestatement_block();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred94_InternalSimpleJava

    // $ANTLR start synpred103_InternalSimpleJava
    public final void synpred103_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2701:3: ( '[' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2701:5: '['
        {
        match(input,32,FOLLOW_32_in_synpred103_InternalSimpleJava5560); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_InternalSimpleJava

    // $ANTLR start synpred106_InternalSimpleJava
    public final void synpred106_InternalSimpleJava_fragment() throws RecognitionException {   
        EObject lv_novo_10_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2756:1: ( (lv_novo_10_0= rulenewBlock ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2756:1: (lv_novo_10_0= rulenewBlock )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2756:1: (lv_novo_10_0= rulenewBlock )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2757:3: lv_novo_10_0= rulenewBlock
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getNovoNewBlockParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_rulenewBlock_in_synpred106_InternalSimpleJava5682);
        lv_novo_10_0=rulenewBlock();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred106_InternalSimpleJava

    // $ANTLR start synpred124_InternalSimpleJava
    public final void synpred124_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_expressao_0_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2794:2: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2794:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2794:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2794:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')'
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2794:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2794:4: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2807:1: (lv_expressao_0_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2808:3: lv_expressao_0_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExp_auxAccess().getExpressaoExpressionParserRuleCall_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred124_InternalSimpleJava5885);
        lv_expressao_0_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_1=(Token)match(input,31,FOLLOW_31_in_synpred124_InternalSimpleJava5897); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred124_InternalSimpleJava

    // $ANTLR start synpred143_InternalSimpleJava
    public final void synpred143_InternalSimpleJava_fragment() throws RecognitionException {   
        EObject lv_op_10_0 = null;

        EObject lv_exp_11_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:6: ( ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:6: ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:6: ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:7: ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:7: ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:8: ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3168:1: (lv_op_10_0= rulemais_aux )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3169:3: lv_op_10_0= rulemais_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getOpMais_auxParserRuleCall_0_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulemais_aux_in_synpred143_InternalSimpleJava6642);
        lv_op_10_0=rulemais_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3185:2: ( (lv_exp_11_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3186:1: (lv_exp_11_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3186:1: (lv_exp_11_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:3: lv_exp_11_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred143_InternalSimpleJava6663);
        lv_exp_11_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred143_InternalSimpleJava

    // $ANTLR start synpred156_InternalSimpleJava
    public final void synpred156_InternalSimpleJava_fragment() throws RecognitionException {   
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:6: ( ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:6: ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:6: ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) )
        int alt100=9;
        alt100 = dfa100.predict(input);
        switch (alt100) {
            case 1 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:8: ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:8: ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:9: ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3238:1: (lv_op_13_0= rulemais_aux )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3239:3: lv_op_13_0= rulemais_aux
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getOpMais_auxParserRuleCall_0_3_0_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_rulemais_aux_in_synpred156_InternalSimpleJava6778);
                lv_op_13_0=rulemais_aux();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3256:6: ( (lv_operador_14_0= '-' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3256:6: ( (lv_operador_14_0= '-' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3257:1: (lv_operador_14_0= '-' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3257:1: (lv_operador_14_0= '-' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3258:3: lv_operador_14_0= '-'
                {
                lv_operador_14_0=(Token)match(input,62,FOLLOW_62_in_synpred156_InternalSimpleJava6802); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3272:6: ( (lv_operador_15_0= '-=' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3272:6: ( (lv_operador_15_0= '-=' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3273:1: (lv_operador_15_0= '-=' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3273:1: (lv_operador_15_0= '-=' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3274:3: lv_operador_15_0= '-='
                {
                lv_operador_15_0=(Token)match(input,63,FOLLOW_63_in_synpred156_InternalSimpleJava6839); if (state.failed) return ;

                }


                }


                }
                break;
            case 4 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3288:6: ( (lv_operador_16_0= '*' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3288:6: ( (lv_operador_16_0= '*' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3289:1: (lv_operador_16_0= '*' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3289:1: (lv_operador_16_0= '*' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3290:3: lv_operador_16_0= '*'
                {
                lv_operador_16_0=(Token)match(input,64,FOLLOW_64_in_synpred156_InternalSimpleJava6876); if (state.failed) return ;

                }


                }


                }
                break;
            case 5 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3304:6: ( (lv_operador_17_0= '*=' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3304:6: ( (lv_operador_17_0= '*=' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3305:1: (lv_operador_17_0= '*=' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3305:1: (lv_operador_17_0= '*=' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3306:3: lv_operador_17_0= '*='
                {
                lv_operador_17_0=(Token)match(input,65,FOLLOW_65_in_synpred156_InternalSimpleJava6913); if (state.failed) return ;

                }


                }


                }
                break;
            case 6 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3320:6: ( (lv_operador_18_0= '/' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3320:6: ( (lv_operador_18_0= '/' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3321:1: (lv_operador_18_0= '/' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3321:1: (lv_operador_18_0= '/' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3322:3: lv_operador_18_0= '/'
                {
                lv_operador_18_0=(Token)match(input,66,FOLLOW_66_in_synpred156_InternalSimpleJava6950); if (state.failed) return ;

                }


                }


                }
                break;
            case 7 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3336:6: ( (lv_operador_19_0= '/=' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3336:6: ( (lv_operador_19_0= '/=' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3337:1: (lv_operador_19_0= '/=' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3337:1: (lv_operador_19_0= '/=' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3338:3: lv_operador_19_0= '/='
                {
                lv_operador_19_0=(Token)match(input,67,FOLLOW_67_in_synpred156_InternalSimpleJava6987); if (state.failed) return ;

                }


                }


                }
                break;
            case 8 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3352:6: ( (lv_operador_20_0= '%' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3352:6: ( (lv_operador_20_0= '%' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3353:1: (lv_operador_20_0= '%' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3353:1: (lv_operador_20_0= '%' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3354:3: lv_operador_20_0= '%'
                {
                lv_operador_20_0=(Token)match(input,68,FOLLOW_68_in_synpred156_InternalSimpleJava7024); if (state.failed) return ;

                }


                }


                }
                break;
            case 9 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3368:6: ( (lv_operador_21_0= '%=' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3368:6: ( (lv_operador_21_0= '%=' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3369:1: (lv_operador_21_0= '%=' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3369:1: (lv_operador_21_0= '%=' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3370:3: lv_operador_21_0= '%='
                {
                lv_operador_21_0=(Token)match(input,69,FOLLOW_69_in_synpred156_InternalSimpleJava7061); if (state.failed) return ;

                }


                }


                }
                break;

        }

        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3383:3: ( (lv_exp_22_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3384:1: (lv_exp_22_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3384:1: (lv_exp_22_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3385:3: lv_exp_22_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred156_InternalSimpleJava7096);
        lv_exp_22_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred156_InternalSimpleJava

    // $ANTLR start synpred177_InternalSimpleJava
    public final void synpred177_InternalSimpleJava_fragment() throws RecognitionException {   
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:2: ( ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:2: ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:2: ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) )
        int alt111=5;
        alt111 = dfa111.predict(input);
        switch (alt111) {
            case 1 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:3: ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:3: ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                int alt104=5;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt104=1;
                    }
                    break;
                case 32:
                    {
                    alt104=2;
                    }
                    break;
                case 58:
                    {
                    alt104=3;
                    }
                    break;
                case 26:
                    {
                    alt104=4;
                    }
                    break;
                case 59:
                    {
                    alt104=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 0, input);

                    throw nvae;
                }

                switch (alt104) {
                    case 1 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:4: (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:4: (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:6: otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')'
                        {
                        otherlv_0=(Token)match(input,30,FOLLOW_30_in_synpred177_InternalSimpleJava6398); if (state.failed) return ;
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3072:1: ( (lv_parametros_1_0= rulearglist ) )?
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( ((LA103_0>=RULE_STRING && LA103_0<=RULE_FLOAT_LITERAL)||LA103_0==30||(LA103_0>=54 && LA103_0<=57)||(LA103_0>=60 && LA103_0<=62)||(LA103_0>=91 && LA103_0<=103)) ) {
                            alt103=1;
                        }
                        switch (alt103) {
                            case 1 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3073:1: (lv_parametros_1_0= rulearglist )
                                {
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3073:1: (lv_parametros_1_0= rulearglist )
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3074:3: lv_parametros_1_0= rulearglist
                                {
                                if ( state.backtracking==0 ) {
                                   
                                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getParametrosArglistParserRuleCall_0_0_0_1_0()); 
                                  	    
                                }
                                pushFollow(FOLLOW_rulearglist_in_synpred177_InternalSimpleJava6419);
                                lv_parametros_1_0=rulearglist();

                                state._fsp--;
                                if (state.failed) return ;

                                }


                                }
                                break;

                        }

                        otherlv_2=(Token)match(input,31,FOLLOW_31_in_synpred177_InternalSimpleJava6432); if (state.failed) return ;

                        }


                        }
                        break;
                    case 2 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3096:2: this_aux_3= ruleaux
                        {
                        pushFollow(FOLLOW_ruleaux_in_synpred177_InternalSimpleJava6464);
                        this_aux_3=ruleaux();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3108:6: (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3108:6: (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3108:8: otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) )
                        {
                        otherlv_4=(Token)match(input,58,FOLLOW_58_in_synpred177_InternalSimpleJava6482); if (state.failed) return ;
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3112:1: ( (lv_exp_5_0= ruleexpression ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3113:1: (lv_exp_5_0= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3113:1: (lv_exp_5_0= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3114:3: lv_exp_5_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_0_2_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava6503);
                        lv_exp_5_0=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }


                        }
                        break;
                    case 4 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3131:6: (otherlv_6= ',' this_expression_7= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3131:6: (otherlv_6= ',' this_expression_7= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3131:8: otherlv_6= ',' this_expression_7= ruleexpression
                        {
                        otherlv_6=(Token)match(input,26,FOLLOW_26_in_synpred177_InternalSimpleJava6523); if (state.failed) return ;
                        pushFollow(FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava6548);
                        this_expression_7=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;
                    case 5 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3148:6: (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3148:6: (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3148:8: otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                        {
                        otherlv_8=(Token)match(input,59,FOLLOW_59_in_synpred177_InternalSimpleJava6567); if (state.failed) return ;
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3152:1: ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3152:2: ( RULE_IDENTIFIER )=>this_name_9= rulename
                        {
                        pushFollow(FOLLOW_rulename_in_synpred177_InternalSimpleJava6598);
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
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:6: ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:6: ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:7: ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:7: ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3165:8: ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3168:1: (lv_op_10_0= rulemais_aux )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3169:3: lv_op_10_0= rulemais_aux
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getOpMais_auxParserRuleCall_0_1_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_rulemais_aux_in_synpred177_InternalSimpleJava6642);
                lv_op_10_0=rulemais_aux();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3185:2: ( (lv_exp_11_0= ruleexpression ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3186:1: (lv_exp_11_0= ruleexpression )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3186:1: (lv_exp_11_0= ruleexpression )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:3: lv_exp_11_0= ruleexpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_1_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava6663);
                lv_exp_11_0=ruleexpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }


                }
                break;
            case 3 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3204:6: ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3204:6: ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3205:1: ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3205:1: ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3206:1: (lv_operador_12_1= '++' | lv_operador_12_2= '--' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3206:1: (lv_operador_12_1= '++' | lv_operador_12_2= '--' )
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==60) ) {
                    alt105=1;
                }
                else if ( (LA105_0==61) ) {
                    alt105=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 105, 0, input);

                    throw nvae;
                }
                switch (alt105) {
                    case 1 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3207:3: lv_operador_12_1= '++'
                        {
                        lv_operador_12_1=(Token)match(input,60,FOLLOW_60_in_synpred177_InternalSimpleJava6690); if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3219:8: lv_operador_12_2= '--'
                        {
                        lv_operador_12_2=(Token)match(input,61,FOLLOW_61_in_synpred177_InternalSimpleJava6719); if (state.failed) return ;

                        }
                        break;

                }


                }


                }


                }
                break;
            case 4 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:6: ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:6: ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) )
                int alt106=9;
                alt106 = dfa106.predict(input);
                switch (alt106) {
                    case 1 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:8: ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:8: ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:9: ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3238:1: (lv_op_13_0= rulemais_aux )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3239:3: lv_op_13_0= rulemais_aux
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getOpMais_auxParserRuleCall_0_3_0_0_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_rulemais_aux_in_synpred177_InternalSimpleJava6778);
                        lv_op_13_0=rulemais_aux();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 2 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3256:6: ( (lv_operador_14_0= '-' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3256:6: ( (lv_operador_14_0= '-' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3257:1: (lv_operador_14_0= '-' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3257:1: (lv_operador_14_0= '-' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3258:3: lv_operador_14_0= '-'
                        {
                        lv_operador_14_0=(Token)match(input,62,FOLLOW_62_in_synpred177_InternalSimpleJava6802); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 3 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3272:6: ( (lv_operador_15_0= '-=' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3272:6: ( (lv_operador_15_0= '-=' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3273:1: (lv_operador_15_0= '-=' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3273:1: (lv_operador_15_0= '-=' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3274:3: lv_operador_15_0= '-='
                        {
                        lv_operador_15_0=(Token)match(input,63,FOLLOW_63_in_synpred177_InternalSimpleJava6839); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 4 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3288:6: ( (lv_operador_16_0= '*' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3288:6: ( (lv_operador_16_0= '*' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3289:1: (lv_operador_16_0= '*' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3289:1: (lv_operador_16_0= '*' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3290:3: lv_operador_16_0= '*'
                        {
                        lv_operador_16_0=(Token)match(input,64,FOLLOW_64_in_synpred177_InternalSimpleJava6876); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 5 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3304:6: ( (lv_operador_17_0= '*=' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3304:6: ( (lv_operador_17_0= '*=' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3305:1: (lv_operador_17_0= '*=' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3305:1: (lv_operador_17_0= '*=' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3306:3: lv_operador_17_0= '*='
                        {
                        lv_operador_17_0=(Token)match(input,65,FOLLOW_65_in_synpred177_InternalSimpleJava6913); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 6 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3320:6: ( (lv_operador_18_0= '/' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3320:6: ( (lv_operador_18_0= '/' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3321:1: (lv_operador_18_0= '/' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3321:1: (lv_operador_18_0= '/' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3322:3: lv_operador_18_0= '/'
                        {
                        lv_operador_18_0=(Token)match(input,66,FOLLOW_66_in_synpred177_InternalSimpleJava6950); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 7 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3336:6: ( (lv_operador_19_0= '/=' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3336:6: ( (lv_operador_19_0= '/=' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3337:1: (lv_operador_19_0= '/=' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3337:1: (lv_operador_19_0= '/=' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3338:3: lv_operador_19_0= '/='
                        {
                        lv_operador_19_0=(Token)match(input,67,FOLLOW_67_in_synpred177_InternalSimpleJava6987); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 8 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3352:6: ( (lv_operador_20_0= '%' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3352:6: ( (lv_operador_20_0= '%' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3353:1: (lv_operador_20_0= '%' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3353:1: (lv_operador_20_0= '%' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3354:3: lv_operador_20_0= '%'
                        {
                        lv_operador_20_0=(Token)match(input,68,FOLLOW_68_in_synpred177_InternalSimpleJava7024); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 9 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3368:6: ( (lv_operador_21_0= '%=' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3368:6: ( (lv_operador_21_0= '%=' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3369:1: (lv_operador_21_0= '%=' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3369:1: (lv_operador_21_0= '%=' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3370:3: lv_operador_21_0= '%='
                        {
                        lv_operador_21_0=(Token)match(input,69,FOLLOW_69_in_synpred177_InternalSimpleJava7061); if (state.failed) return ;

                        }


                        }


                        }
                        break;

                }

                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3383:3: ( (lv_exp_22_0= ruleexpression ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3384:1: (lv_exp_22_0= ruleexpression )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3384:1: (lv_exp_22_0= ruleexpression )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3385:3: lv_exp_22_0= ruleexpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_3_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava7096);
                lv_exp_22_0=ruleexpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }


                }
                break;
            case 5 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3402:6: ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3402:6: ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) )
                int alt110=4;
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
                    {
                    alt110=1;
                    }
                    break;
                case 78:
                    {
                    alt110=2;
                    }
                    break;
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                    {
                    alt110=3;
                    }
                    break;
                case 85:
                case 86:
                case 87:
                case 88:
                    {
                    alt110=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 110, 0, input);

                    throw nvae;
                }

                switch (alt110) {
                    case 1 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3402:7: ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3402:7: ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3402:8: ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3402:8: ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3403:1: ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3403:1: ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3404:1: (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3404:1: (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' )
                        int alt107=10;
                        switch ( input.LA(1) ) {
                        case 70:
                            {
                            alt107=1;
                            }
                            break;
                        case 71:
                            {
                            alt107=2;
                            }
                            break;
                        case 72:
                            {
                            alt107=3;
                            }
                            break;
                        case 73:
                            {
                            alt107=4;
                            }
                            break;
                        case 74:
                            {
                            alt107=5;
                            }
                            break;
                        case 75:
                            {
                            alt107=6;
                            }
                            break;
                        case 76:
                            {
                            alt107=7;
                            }
                            break;
                        case 77:
                            {
                            alt107=8;
                            }
                            break;
                        case 68:
                            {
                            alt107=9;
                            }
                            break;
                        case 69:
                            {
                            alt107=10;
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
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3405:3: lv_operador_23_1= 'ampersand'
                                {
                                lv_operador_23_1=(Token)match(input,70,FOLLOW_70_in_synpred177_InternalSimpleJava7125); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3417:8: lv_operador_23_2= 'ampersand='
                                {
                                lv_operador_23_2=(Token)match(input,71,FOLLOW_71_in_synpred177_InternalSimpleJava7154); if (state.failed) return ;

                                }
                                break;
                            case 3 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3429:8: lv_operador_23_3= '|'
                                {
                                lv_operador_23_3=(Token)match(input,72,FOLLOW_72_in_synpred177_InternalSimpleJava7183); if (state.failed) return ;

                                }
                                break;
                            case 4 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3441:8: lv_operador_23_4= '|='
                                {
                                lv_operador_23_4=(Token)match(input,73,FOLLOW_73_in_synpred177_InternalSimpleJava7212); if (state.failed) return ;

                                }
                                break;
                            case 5 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3453:8: lv_operador_23_5= '^'
                                {
                                lv_operador_23_5=(Token)match(input,74,FOLLOW_74_in_synpred177_InternalSimpleJava7241); if (state.failed) return ;

                                }
                                break;
                            case 6 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3465:8: lv_operador_23_6= '^='
                                {
                                lv_operador_23_6=(Token)match(input,75,FOLLOW_75_in_synpred177_InternalSimpleJava7270); if (state.failed) return ;

                                }
                                break;
                            case 7 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3477:8: lv_operador_23_7= 'ampersand ampersand'
                                {
                                lv_operador_23_7=(Token)match(input,76,FOLLOW_76_in_synpred177_InternalSimpleJava7299); if (state.failed) return ;

                                }
                                break;
                            case 8 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3489:8: lv_operador_23_8= '||='
                                {
                                lv_operador_23_8=(Token)match(input,77,FOLLOW_77_in_synpred177_InternalSimpleJava7328); if (state.failed) return ;

                                }
                                break;
                            case 9 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3501:8: lv_operador_23_9= '%'
                                {
                                lv_operador_23_9=(Token)match(input,68,FOLLOW_68_in_synpred177_InternalSimpleJava7357); if (state.failed) return ;

                                }
                                break;
                            case 10 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3513:8: lv_operador_23_10= '%='
                                {
                                lv_operador_23_10=(Token)match(input,69,FOLLOW_69_in_synpred177_InternalSimpleJava7386); if (state.failed) return ;

                                }
                                break;

                        }


                        }


                        }

                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3528:2: ( (lv_exp_24_0= ruleexpression ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3529:1: (lv_exp_24_0= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3529:1: (lv_exp_24_0= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3530:3: lv_exp_24_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_0_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava7423);
                        lv_exp_24_0=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }


                        }
                        break;
                    case 2 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3547:6: ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3547:6: ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3547:7: ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3547:7: ( (lv_operador_25_0= '?' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3548:1: (lv_operador_25_0= '?' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3548:1: (lv_operador_25_0= '?' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3549:3: lv_operador_25_0= '?'
                        {
                        lv_operador_25_0=(Token)match(input,78,FOLLOW_78_in_synpred177_InternalSimpleJava7449); if (state.failed) return ;

                        }


                        }

                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3562:2: ( (lv_exp_26_0= ruleexpression ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3563:1: (lv_exp_26_0= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3563:1: (lv_exp_26_0= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3564:3: lv_exp_26_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_1_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava7483);
                        lv_exp_26_0=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }

                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3580:2: ( (lv_operador_27_0= ':' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3581:1: (lv_operador_27_0= ':' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3581:1: (lv_operador_27_0= ':' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3582:3: lv_operador_27_0= ':'
                        {
                        lv_operador_27_0=(Token)match(input,37,FOLLOW_37_in_synpred177_InternalSimpleJava7501); if (state.failed) return ;

                        }


                        }

                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3595:2: ( (lv_exp_28_0= ruleexpression ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3596:1: (lv_exp_28_0= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3596:1: (lv_exp_28_0= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3597:3: lv_exp_28_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_1_3_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava7535);
                        lv_exp_28_0=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }


                        }
                        break;
                    case 3 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3614:6: ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3614:6: ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3614:7: ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3614:7: ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3615:1: ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3615:1: ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3616:1: (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3616:1: (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' )
                        int alt108=6;
                        switch ( input.LA(1) ) {
                        case 79:
                            {
                            alt108=1;
                            }
                            break;
                        case 80:
                            {
                            alt108=2;
                            }
                            break;
                        case 81:
                            {
                            alt108=3;
                            }
                            break;
                        case 82:
                            {
                            alt108=4;
                            }
                            break;
                        case 83:
                            {
                            alt108=5;
                            }
                            break;
                        case 84:
                            {
                            alt108=6;
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
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3617:3: lv_operador_29_1= '>'
                                {
                                lv_operador_29_1=(Token)match(input,79,FOLLOW_79_in_synpred177_InternalSimpleJava7563); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3629:8: lv_operador_29_2= '<'
                                {
                                lv_operador_29_2=(Token)match(input,80,FOLLOW_80_in_synpred177_InternalSimpleJava7592); if (state.failed) return ;

                                }
                                break;
                            case 3 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3641:8: lv_operador_29_3= '>='
                                {
                                lv_operador_29_3=(Token)match(input,81,FOLLOW_81_in_synpred177_InternalSimpleJava7621); if (state.failed) return ;

                                }
                                break;
                            case 4 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3653:8: lv_operador_29_4= '<='
                                {
                                lv_operador_29_4=(Token)match(input,82,FOLLOW_82_in_synpred177_InternalSimpleJava7650); if (state.failed) return ;

                                }
                                break;
                            case 5 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3665:8: lv_operador_29_5= '=='
                                {
                                lv_operador_29_5=(Token)match(input,83,FOLLOW_83_in_synpred177_InternalSimpleJava7679); if (state.failed) return ;

                                }
                                break;
                            case 6 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3677:8: lv_operador_29_6= '!='
                                {
                                lv_operador_29_6=(Token)match(input,84,FOLLOW_84_in_synpred177_InternalSimpleJava7708); if (state.failed) return ;

                                }
                                break;

                        }


                        }


                        }

                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3692:2: ( (lv_exp_30_0= ruleexpression ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3693:1: (lv_exp_30_0= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3693:1: (lv_exp_30_0= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3694:3: lv_exp_30_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_2_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava7745);
                        lv_exp_30_0=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }


                        }
                        break;
                    case 4 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3711:6: ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3711:6: ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3711:7: ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3711:7: ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3712:1: ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3712:1: ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3713:1: (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3713:1: (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' )
                        int alt109=4;
                        switch ( input.LA(1) ) {
                        case 85:
                            {
                            alt109=1;
                            }
                            break;
                        case 86:
                            {
                            alt109=2;
                            }
                            break;
                        case 87:
                            {
                            alt109=3;
                            }
                            break;
                        case 88:
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
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3714:3: lv_operador_31_1= '>>='
                                {
                                lv_operador_31_1=(Token)match(input,85,FOLLOW_85_in_synpred177_InternalSimpleJava7773); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3726:8: lv_operador_31_2= '<<'
                                {
                                lv_operador_31_2=(Token)match(input,86,FOLLOW_86_in_synpred177_InternalSimpleJava7802); if (state.failed) return ;

                                }
                                break;
                            case 3 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3738:8: lv_operador_31_3= '>>'
                                {
                                lv_operador_31_3=(Token)match(input,87,FOLLOW_87_in_synpred177_InternalSimpleJava7831); if (state.failed) return ;

                                }
                                break;
                            case 4 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3750:8: lv_operador_31_4= '>>>'
                                {
                                lv_operador_31_4=(Token)match(input,88,FOLLOW_88_in_synpred177_InternalSimpleJava7860); if (state.failed) return ;

                                }
                                break;

                        }


                        }


                        }

                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3765:2: ( (lv_exp_32_0= ruleexpression ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3766:1: (lv_exp_32_0= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3766:1: (lv_exp_32_0= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3767:3: lv_exp_32_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_3_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava7897);
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

        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3783:5: ( (lv_expressoes_33_0= ruleexpression_aux ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3784:1: (lv_expressoes_33_0= ruleexpression_aux )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3784:1: (lv_expressoes_33_0= ruleexpression_aux )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3785:3: lv_expressoes_33_0= ruleexpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressoesExpression_auxParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_aux_in_synpred177_InternalSimpleJava7921);
        lv_expressoes_33_0=ruleexpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred177_InternalSimpleJava

    // $ANTLR start synpred181_InternalSimpleJava
    public final void synpred181_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_argumentos_1_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3915:2: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3915:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3915:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3915:3: ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')'
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3915:3: ( ( '(' )=>otherlv_0= '(' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3915:4: ( '(' )=>otherlv_0= '('
        {
        otherlv_0=(Token)match(input,30,FOLLOW_30_in_synpred181_InternalSimpleJava8272); if (state.failed) return ;

        }

        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3920:2: ( (lv_argumentos_1_0= rulearglist ) )?
        int alt112=2;
        int LA112_0 = input.LA(1);

        if ( ((LA112_0>=RULE_STRING && LA112_0<=RULE_FLOAT_LITERAL)||LA112_0==30||(LA112_0>=54 && LA112_0<=57)||(LA112_0>=60 && LA112_0<=62)||(LA112_0>=91 && LA112_0<=103)) ) {
            alt112=1;
        }
        switch (alt112) {
            case 1 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3921:1: (lv_argumentos_1_0= rulearglist )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3921:1: (lv_argumentos_1_0= rulearglist )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3922:3: lv_argumentos_1_0= rulearglist
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getCreating_auxAccess().getArgumentosArglistParserRuleCall_0_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_rulearglist_in_synpred181_InternalSimpleJava8294);
                lv_argumentos_1_0=rulearglist();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_2=(Token)match(input,31,FOLLOW_31_in_synpred181_InternalSimpleJava8307); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred181_InternalSimpleJava

    // $ANTLR start synpred182_InternalSimpleJava
    public final void synpred182_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3943:8: ( '[' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3943:10: '['
        {
        match(input,32,FOLLOW_32_in_synpred182_InternalSimpleJava8327); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred182_InternalSimpleJava

    // $ANTLR start synpred193_InternalSimpleJava
    public final void synpred193_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_expressoesArgumentos_0_0 = null;

        EObject lv_expressoesArgumentos_2_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4349:2: ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4349:2: ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4349:2: ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4349:3: ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )*
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4349:3: ( (lv_expressoesArgumentos_0_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4350:1: (lv_expressoesArgumentos_0_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4350:1: (lv_expressoesArgumentos_0_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4351:3: lv_expressoesArgumentos_0_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getArglistAccess().getExpressoesArgumentosExpressionParserRuleCall_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred193_InternalSimpleJava9276);
        lv_expressoesArgumentos_0_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4367:2: (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )*
        loop113:
        do {
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==26) ) {
                alt113=1;
            }


            switch (alt113) {
        	case 1 :
        	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4367:4: otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) )
        	    {
        	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_synpred193_InternalSimpleJava9289); if (state.failed) return ;
        	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4371:1: ( (lv_expressoesArgumentos_2_0= ruleexpression ) )
        	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4372:1: (lv_expressoesArgumentos_2_0= ruleexpression )
        	    {
        	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4372:1: (lv_expressoesArgumentos_2_0= ruleexpression )
        	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4373:3: lv_expressoesArgumentos_2_0= ruleexpression
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getArglistAccess().getExpressoesArgumentosExpressionParserRuleCall_0_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleexpression_in_synpred193_InternalSimpleJava9310);
        	    lv_expressoesArgumentos_2_0=ruleexpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop113;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred193_InternalSimpleJava

    // $ANTLR start synpred196_InternalSimpleJava
    public final void synpred196_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token lv_nomePacote_1_0=null;
        EObject lv_pacote_2_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4557:3: (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4557:3: otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) )
        {
        otherlv_0=(Token)match(input,58,FOLLOW_58_in_synpred196_InternalSimpleJava9661); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4561:1: ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4562:1: (lv_nomePacote_1_0= RULE_IDENTIFIER )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4562:1: (lv_nomePacote_1_0= RULE_IDENTIFIER )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4563:3: lv_nomePacote_1_0= RULE_IDENTIFIER
        {
        lv_nomePacote_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_synpred196_InternalSimpleJava9678); if (state.failed) return ;

        }


        }

        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4579:2: ( (lv_pacote_2_0= rulepackage_name_aux ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4580:1: (lv_pacote_2_0= rulepackage_name_aux )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4580:1: (lv_pacote_2_0= rulepackage_name_aux )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4581:3: lv_pacote_2_0= rulepackage_name_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPackage_name_auxAccess().getPacotePackage_name_auxParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_rulepackage_name_aux_in_synpred196_InternalSimpleJava9704);
        lv_pacote_2_0=rulepackage_name_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred196_InternalSimpleJava

    // Delegated rules

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
    public final boolean synpred193_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred193_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred124_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred124_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred156_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred156_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred106_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred103_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred182_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred182_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred196_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred196_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred177_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred177_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred143_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred143_InternalSimpleJava_fragment(); // can never throw exception
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
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA111 dfa111 = new DFA111(this);
    protected DFA106 dfa106 = new DFA106(this);
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\13\27\2\uffff";
    static final String DFA6_maxS =
        "\13\157\2\uffff";
    static final String DFA6_acceptS =
        "\13\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\62\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\62\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\62\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\62\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\62\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\62\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\62\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\62\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\62\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\62\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\62\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
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
            return "311:3: ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) )";
        }
    }
    static final String DFA11_eotS =
        "\17\uffff";
    static final String DFA11_eofS =
        "\17\uffff";
    static final String DFA11_minS =
        "\1\5\2\uffff\12\5\1\uffff\1\5";
    static final String DFA11_maxS =
        "\1\157\2\uffff\12\157\1\uffff\1\157";
    static final String DFA11_acceptS =
        "\1\uffff\1\3\1\1\12\uffff\1\2\1\uffff";
    static final String DFA11_specialS =
        "\17\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\14\uffff\1\2\2\uffff\1\2\1\uffff\1\15\4\uffff\1\1\1\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\6\52\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "",
            "",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\52\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\52\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\52\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\3\uffff\1\2\2\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\52\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\52\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\52\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\52\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\52\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\52\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\52\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "",
            "\1\2\21\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\52\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14"
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
            return "()* loopback of 526:1: ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )*";
        }
    }
    static final String DFA17_eotS =
        "\30\uffff";
    static final String DFA17_eofS =
        "\30\uffff";
    static final String DFA17_minS =
        "\1\5\24\0\3\uffff";
    static final String DFA17_maxS =
        "\1\157\24\0\3\uffff";
    static final String DFA17_acceptS =
        "\25\uffff\1\3\1\1\1\2";
    static final String DFA17_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\3\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\23\30\uffff\1\25\3\uffff\1\7\5\uffff\1\24\14\uffff\1\4\52\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
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
            return "737:3: ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) )";
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

                        else if ( (true) ) {s = 21;}

                         
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

                        else if ( (true) ) {s = 21;}

                         
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

                        else if ( (true) ) {s = 21;}

                         
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

                        else if ( (true) ) {s = 21;}

                         
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

                        else if ( (true) ) {s = 21;}

                         
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

                        else if ( (true) ) {s = 21;}

                         
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

                        else if ( (true) ) {s = 21;}

                         
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

                        else if ( (true) ) {s = 21;}

                         
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

                        else if ( (true) ) {s = 21;}

                         
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

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index17_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_11 = input.LA(1);

                         
                        int index17_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index17_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_12 = input.LA(1);

                         
                        int index17_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index17_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_13 = input.LA(1);

                         
                        int index17_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index17_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_14 = input.LA(1);

                         
                        int index17_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index17_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_15 = input.LA(1);

                         
                        int index17_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index17_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_16 = input.LA(1);

                         
                        int index17_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index17_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_17 = input.LA(1);

                         
                        int index17_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index17_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_18 = input.LA(1);

                         
                        int index17_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 21;}

                         
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

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index17_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA17_20 = input.LA(1);

                         
                        int index17_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 23;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index17_20);
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
        "\1\157\6\uffff\1\0\13\uffff\1\0\1\uffff\1\0\35\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\24\uffff\1\2\16\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14\1\16\1\17\1\20\1\12\1\15";
    static final String DFA29_specialS =
        "\7\uffff\1\0\13\uffff\1\1\1\uffff\1\2\35\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\26\1\23\3\26\11\uffff\1\60\10\uffff\1\45\2\uffff\1\25\3\uffff\1\7\1\54\1\55\1\uffff\1\56\1\57\1\1\1\uffff\1\46\1\uffff\1\47\1\50\1\51\1\52\2\uffff\1\53\2\uffff\1\1\4\26\2\uffff\3\26\34\uffff\4\26\1\uffff\20\1",
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
            return "1143:1: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_bloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' )";
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
        "\1\147\1\uffff\1\72\2\uffff\1\41\1\51";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\2\uffff";
    static final String DFA31_specialS =
        "\7\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\2\30\uffff\1\4\11\uffff\1\3\67\uffff\10\1",
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
            return "1561:3: ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )?";
        }
    }
    static final String DFA43_eotS =
        "\46\uffff";
    static final String DFA43_eofS =
        "\46\uffff";
    static final String DFA43_minS =
        "\1\4\22\uffff\1\0\1\uffff\1\0\20\uffff";
    static final String DFA43_maxS =
        "\1\157\22\uffff\1\0\1\uffff\1\0\20\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\1\24\uffff\1\2\16\uffff\1\3";
    static final String DFA43_specialS =
        "\23\uffff\1\0\1\uffff\1\1\20\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\26\1\23\3\26\11\uffff\1\45\13\uffff\1\25\3\uffff\1\1\5\uffff\1\1\14\uffff\1\1\4\26\2\uffff\3\26\34\uffff\4\26\1\uffff\20\1",
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
            return "2100:1: ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' )";
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
    static final String DFA52_eotS =
        "\55\uffff";
    static final String DFA52_eofS =
        "\1\2\54\uffff";
    static final String DFA52_minS =
        "\1\22\1\0\53\uffff";
    static final String DFA52_maxS =
        "\1\132\1\0\53\uffff";
    static final String DFA52_acceptS =
        "\2\uffff\1\2\51\uffff\1\1";
    static final String DFA52_specialS =
        "\1\uffff\1\0\53\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\2\7\uffff\3\2\1\uffff\2\2\1\1\1\2\3\uffff\1\2\24\uffff\41\2",
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
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "2701:2: ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_1 = input.LA(1);

                         
                        int index52_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_InternalSimpleJava()) ) {s = 44;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index52_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\55\uffff";
    static final String DFA55_eofS =
        "\1\1\54\uffff";
    static final String DFA55_minS =
        "\1\22\47\uffff\1\0\4\uffff";
    static final String DFA55_maxS =
        "\1\132\47\uffff\1\0\4\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\2\52\uffff\1\1";
    static final String DFA55_specialS =
        "\50\uffff\1\0\4\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\1\7\uffff\1\1\1\50\1\1\1\uffff\4\1\3\uffff\1\1\24\uffff\41\1",
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
            return "()* loopback of 2755:3: ( (lv_novo_10_0= rulenewBlock ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_40 = input.LA(1);

                         
                        int index55_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_InternalSimpleJava()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_40);
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
        "\32\uffff";
    static final String DFA56_eofS =
        "\32\uffff";
    static final String DFA56_minS =
        "\1\4\17\uffff\1\0\11\uffff";
    static final String DFA56_maxS =
        "\1\147\17\uffff\1\0\11\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\1\20\uffff\1\2\7\uffff";
    static final String DFA56_specialS =
        "\20\uffff\1\0\11\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\1\1\20\3\1\25\uffff\1\1\27\uffff\4\1\2\uffff\3\1\34\uffff\4\1\1\uffff\10\22",
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
            return "2794:1: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_16 = input.LA(1);

                         
                        int index56_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_InternalSimpleJava()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index56_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\13\uffff";
    static final String DFA57_eofS =
        "\13\uffff";
    static final String DFA57_minS =
        "\1\4\12\uffff";
    static final String DFA57_maxS =
        "\1\136\12\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA57_specialS =
        "\13\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\5\1\11\3\5\25\uffff\1\12\27\uffff\1\4\1\6\1\7\1\10\2\uffff\3\2\34\uffff\3\1\1\3",
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

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "2884:2: ( ( (lv_tipo_0_0= rulelogical_expression ) ) | ( (lv_tipo_1_0= rulenumeric_expression ) ) | ( (lv_tipo_2_0= rulebit_expression ) ) | ( (lv_novo_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | ( (lv_identificador_8_0= RULE_IDENTIFIER ) ) | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) )";
        }
    }
    static final String DFA67_eotS =
        "\47\uffff";
    static final String DFA67_eofS =
        "\1\45\46\uffff";
    static final String DFA67_minS =
        "\1\22\44\0\2\uffff";
    static final String DFA67_maxS =
        "\1\132\44\0\2\uffff";
    static final String DFA67_acceptS =
        "\45\uffff\1\2\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\41\1\22\1\13\1\34\1\20\1\30\1\42\1\12\1\16\1\17\1\27\1\25\1\10\1\23\1\36\1\14\1\2\1\3\1\35\1\6\1\26\1\40\1\4\1\37\1\1\1\11\1\21\1\43\1\15\1\7\1\32\1\33\1\31\1\0\1\24\1\5\2\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\45\7\uffff\1\4\2\45\1\uffff\1\1\1\45\1\2\1\45\3\uffff\1\45\24\uffff\1\3\1\5\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\6\1\7",
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

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3068:1: ( ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_33_0= ruleexpression_aux ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_34 = input.LA(1);

                         
                        int index67_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_34);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_25 = input.LA(1);

                         
                        int index67_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_25);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_17 = input.LA(1);

                         
                        int index67_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_17);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA67_18 = input.LA(1);

                         
                        int index67_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_18);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA67_23 = input.LA(1);

                         
                        int index67_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA67_36 = input.LA(1);

                         
                        int index67_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_36);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA67_20 = input.LA(1);

                         
                        int index67_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_20);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA67_30 = input.LA(1);

                         
                        int index67_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_30);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA67_13 = input.LA(1);

                         
                        int index67_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_13);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA67_26 = input.LA(1);

                         
                        int index67_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_26);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA67_8 = input.LA(1);

                         
                        int index67_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_8);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA67_3 = input.LA(1);

                         
                        int index67_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_3);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA67_16 = input.LA(1);

                         
                        int index67_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_16);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA67_29 = input.LA(1);

                         
                        int index67_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_29);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA67_9 = input.LA(1);

                         
                        int index67_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_9);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA67_10 = input.LA(1);

                         
                        int index67_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_10);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA67_5 = input.LA(1);

                         
                        int index67_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_5);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA67_27 = input.LA(1);

                         
                        int index67_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_27);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA67_14 = input.LA(1);

                         
                        int index67_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_14);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA67_35 = input.LA(1);

                         
                        int index67_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_35);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA67_12 = input.LA(1);

                         
                        int index67_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_12);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA67_21 = input.LA(1);

                         
                        int index67_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_21);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA67_11 = input.LA(1);

                         
                        int index67_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_11);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA67_6 = input.LA(1);

                         
                        int index67_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_6);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA67_33 = input.LA(1);

                         
                        int index67_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_33);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA67_31 = input.LA(1);

                         
                        int index67_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_31);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA67_32 = input.LA(1);

                         
                        int index67_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_32);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA67_4 = input.LA(1);

                         
                        int index67_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_4);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA67_19 = input.LA(1);

                         
                        int index67_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_19);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA67_15 = input.LA(1);

                         
                        int index67_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_15);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA67_24 = input.LA(1);

                         
                        int index67_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_24);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA67_22 = input.LA(1);

                         
                        int index67_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_22);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA67_7 = input.LA(1);

                         
                        int index67_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_7);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA67_28 = input.LA(1);

                         
                        int index67_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_InternalSimpleJava()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index67_28);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\46\uffff";
    static final String DFA66_eofS =
        "\46\uffff";
    static final String DFA66_minS =
        "\1\32\5\uffff\2\0\10\uffff\2\0\24\uffff";
    static final String DFA66_maxS =
        "\1\132\5\uffff\2\0\10\uffff\2\0\24\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\6\uffff\1\3\1\uffff\1\4\7\uffff\1\5\22\uffff\1\2";
    static final String DFA66_specialS =
        "\6\uffff\1\0\1\1\10\uffff\1\2\1\3\24\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\1\3\uffff\1\1\1\uffff\1\1\31\uffff\2\1\2\10\6\12\1\20\1\21\23\22\1\6\1\7",
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
            return "3068:2: ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_6 = input.LA(1);

                         
                        int index66_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred143_InternalSimpleJava()) ) {s = 37;}

                        else if ( (synpred156_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index66_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_7 = input.LA(1);

                         
                        int index66_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred143_InternalSimpleJava()) ) {s = 37;}

                        else if ( (synpred156_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index66_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_16 = input.LA(1);

                         
                        int index66_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred156_InternalSimpleJava()) ) {s = 10;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index66_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA66_17 = input.LA(1);

                         
                        int index66_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred156_InternalSimpleJava()) ) {s = 10;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index66_17);
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
    static final String DFA61_eotS =
        "\12\uffff";
    static final String DFA61_eofS =
        "\12\uffff";
    static final String DFA61_minS =
        "\1\76\11\uffff";
    static final String DFA61_maxS =
        "\1\132\11\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA61_specialS =
        "\12\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\23\uffff\2\1",
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

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "3235:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) )";
        }
    }
    static final String DFA72_eotS =
        "\55\uffff";
    static final String DFA72_eofS =
        "\1\2\54\uffff";
    static final String DFA72_minS =
        "\1\22\1\0\53\uffff";
    static final String DFA72_maxS =
        "\1\132\1\0\53\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\51\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\53\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\2\7\uffff\3\2\1\uffff\1\1\3\2\3\uffff\1\2\24\uffff\41\2",
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
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "3915:1: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred181_InternalSimpleJava()) ) {s = 44;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\55\uffff";
    static final String DFA70_eofS =
        "\1\2\54\uffff";
    static final String DFA70_minS =
        "\1\22\1\0\53\uffff";
    static final String DFA70_maxS =
        "\1\132\1\0\53\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\51\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\53\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\2\7\uffff\3\2\1\uffff\2\2\1\1\1\2\3\uffff\1\2\24\uffff\41\2",
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
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "3943:7: ( ( '[' )=>this_aux_3= ruleaux )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_InternalSimpleJava()) ) {s = 44;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\33\uffff";
    static final String DFA78_eofS =
        "\33\uffff";
    static final String DFA78_minS =
        "\1\4\17\uffff\1\0\12\uffff";
    static final String DFA78_maxS =
        "\1\147\17\uffff\1\0\12\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\20\uffff\1\2\1\3\7\uffff";
    static final String DFA78_specialS =
        "\20\uffff\1\0\12\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\1\1\20\3\1\25\uffff\1\1\27\uffff\4\1\2\uffff\3\1\34\uffff\4\1\1\22\10\23",
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

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "4349:1: ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_16 = input.LA(1);

                         
                        int index78_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred193_InternalSimpleJava()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index78_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA100_eotS =
        "\12\uffff";
    static final String DFA100_eofS =
        "\12\uffff";
    static final String DFA100_minS =
        "\1\76\11\uffff";
    static final String DFA100_maxS =
        "\1\132\11\uffff";
    static final String DFA100_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA100_specialS =
        "\12\uffff}>";
    static final String[] DFA100_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\23\uffff\2\1",
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

    static final short[] DFA100_eot = DFA.unpackEncodedString(DFA100_eotS);
    static final short[] DFA100_eof = DFA.unpackEncodedString(DFA100_eofS);
    static final char[] DFA100_min = DFA.unpackEncodedStringToUnsignedChars(DFA100_minS);
    static final char[] DFA100_max = DFA.unpackEncodedStringToUnsignedChars(DFA100_maxS);
    static final short[] DFA100_accept = DFA.unpackEncodedString(DFA100_acceptS);
    static final short[] DFA100_special = DFA.unpackEncodedString(DFA100_specialS);
    static final short[][] DFA100_transition;

    static {
        int numStates = DFA100_transitionS.length;
        DFA100_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA100_transition[i] = DFA.unpackEncodedString(DFA100_transitionS[i]);
        }
    }

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = DFA100_eot;
            this.eof = DFA100_eof;
            this.min = DFA100_min;
            this.max = DFA100_max;
            this.accept = DFA100_accept;
            this.special = DFA100_special;
            this.transition = DFA100_transition;
        }
        public String getDescription() {
            return "3235:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) )";
        }
    }
    static final String DFA111_eotS =
        "\46\uffff";
    static final String DFA111_eofS =
        "\46\uffff";
    static final String DFA111_minS =
        "\1\32\5\uffff\2\0\10\uffff\2\0\24\uffff";
    static final String DFA111_maxS =
        "\1\132\5\uffff\2\0\10\uffff\2\0\24\uffff";
    static final String DFA111_acceptS =
        "\1\uffff\1\1\6\uffff\1\3\1\uffff\1\4\7\uffff\1\5\22\uffff\1\2";
    static final String DFA111_specialS =
        "\6\uffff\1\0\1\1\10\uffff\1\2\1\3\24\uffff}>";
    static final String[] DFA111_transitionS = {
            "\1\1\3\uffff\1\1\1\uffff\1\1\31\uffff\2\1\2\10\6\12\1\20\1\21\23\22\1\6\1\7",
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
            ""
    };

    static final short[] DFA111_eot = DFA.unpackEncodedString(DFA111_eotS);
    static final short[] DFA111_eof = DFA.unpackEncodedString(DFA111_eofS);
    static final char[] DFA111_min = DFA.unpackEncodedStringToUnsignedChars(DFA111_minS);
    static final char[] DFA111_max = DFA.unpackEncodedStringToUnsignedChars(DFA111_maxS);
    static final short[] DFA111_accept = DFA.unpackEncodedString(DFA111_acceptS);
    static final short[] DFA111_special = DFA.unpackEncodedString(DFA111_specialS);
    static final short[][] DFA111_transition;

    static {
        int numStates = DFA111_transitionS.length;
        DFA111_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA111_transition[i] = DFA.unpackEncodedString(DFA111_transitionS[i]);
        }
    }

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = DFA111_eot;
            this.eof = DFA111_eof;
            this.min = DFA111_min;
            this.max = DFA111_max;
            this.accept = DFA111_accept;
            this.special = DFA111_special;
            this.transition = DFA111_transition;
        }
        public String getDescription() {
            return "3068:2: ( ( (otherlv_0= '(' ( (lv_parametros_1_0= rulearglist ) )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' ( (lv_exp_5_0= ruleexpression ) ) ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=> (lv_op_10_0= rulemais_aux ) ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_operador_12_1= '++' | lv_operador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( ( ( (lv_operador_23_1= 'ampersand' | lv_operador_23_2= 'ampersand=' | lv_operador_23_3= '|' | lv_operador_23_4= '|=' | lv_operador_23_5= '^' | lv_operador_23_6= '^=' | lv_operador_23_7= 'ampersand ampersand' | lv_operador_23_8= '||=' | lv_operador_23_9= '%' | lv_operador_23_10= '%=' ) ) ) ( (lv_exp_24_0= ruleexpression ) ) ) | ( ( (lv_operador_25_0= '?' ) ) ( (lv_exp_26_0= ruleexpression ) ) ( (lv_operador_27_0= ':' ) ) ( (lv_exp_28_0= ruleexpression ) ) ) | ( ( ( (lv_operador_29_1= '>' | lv_operador_29_2= '<' | lv_operador_29_3= '>=' | lv_operador_29_4= '<=' | lv_operador_29_5= '==' | lv_operador_29_6= '!=' ) ) ) ( (lv_exp_30_0= ruleexpression ) ) ) | ( ( ( (lv_operador_31_1= '>>=' | lv_operador_31_2= '<<' | lv_operador_31_3= '>>' | lv_operador_31_4= '>>>' ) ) ) ( (lv_exp_32_0= ruleexpression ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA111_6 = input.LA(1);

                         
                        int index111_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred143_InternalSimpleJava()) ) {s = 37;}

                        else if ( (synpred156_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index111_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA111_7 = input.LA(1);

                         
                        int index111_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred143_InternalSimpleJava()) ) {s = 37;}

                        else if ( (synpred156_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index111_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA111_16 = input.LA(1);

                         
                        int index111_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred156_InternalSimpleJava()) ) {s = 10;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index111_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA111_17 = input.LA(1);

                         
                        int index111_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred156_InternalSimpleJava()) ) {s = 10;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index111_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 111, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA106_eotS =
        "\12\uffff";
    static final String DFA106_eofS =
        "\12\uffff";
    static final String DFA106_minS =
        "\1\76\11\uffff";
    static final String DFA106_maxS =
        "\1\132\11\uffff";
    static final String DFA106_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA106_specialS =
        "\12\uffff}>";
    static final String[] DFA106_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\23\uffff\2\1",
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

    static final short[] DFA106_eot = DFA.unpackEncodedString(DFA106_eotS);
    static final short[] DFA106_eof = DFA.unpackEncodedString(DFA106_eofS);
    static final char[] DFA106_min = DFA.unpackEncodedStringToUnsignedChars(DFA106_minS);
    static final char[] DFA106_max = DFA.unpackEncodedStringToUnsignedChars(DFA106_maxS);
    static final short[] DFA106_accept = DFA.unpackEncodedString(DFA106_acceptS);
    static final short[] DFA106_special = DFA.unpackEncodedString(DFA106_specialS);
    static final short[][] DFA106_transition;

    static {
        int numStates = DFA106_transitionS.length;
        DFA106_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA106_transition[i] = DFA.unpackEncodedString(DFA106_transitionS[i]);
        }
    }

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = DFA106_eot;
            this.eof = DFA106_eof;
            this.min = DFA106_min;
            this.max = DFA106_max;
            this.accept = DFA106_accept;
            this.special = DFA106_special;
            this.transition = DFA106_transition;
        }
        public String getDescription() {
            return "3235:7: ( ( ( '+' | '+=' )=> (lv_op_13_0= rulemais_aux ) ) | ( (lv_operador_14_0= '-' ) ) | ( (lv_operador_15_0= '-=' ) ) | ( (lv_operador_16_0= '*' ) ) | ( (lv_operador_17_0= '*=' ) ) | ( (lv_operador_18_0= '/' ) ) | ( (lv_operador_19_0= '/=' ) ) | ( (lv_operador_20_0= '%' ) ) | ( (lv_operador_21_0= '%=' ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompilation_unit_in_ruleModel136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompilation_unit_in_entryRulecompilation_unit171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompilation_unit181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepackage_statement_in_rulecompilation_unit227 = new BitSet(new long[]{0x0020000420A80002L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_ruleimport_statement_in_rulecompilation_unit249 = new BitSet(new long[]{0x0020000420A80002L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_ruletype_declaration_in_rulecompilation_unit271 = new BitSet(new long[]{0x0020000420A00002L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_rulepackage_statement_in_entryRulepackage_statement308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepackage_statement318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulepackage_statement355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_rulepackage_statement376 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulepackage_statement388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimport_statement_in_entryRuleimport_statement424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimport_statement434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleimport_statement471 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleimport_statement492 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_20_in_ruleimport_statement505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleimport_statement523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_declaration_in_entryRuletype_declaration560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_declaration570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_ruletype_declaration621 = new BitSet(new long[]{0x0020000420A00000L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_ruleclass_declaration_in_ruletype_declaration644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinterface_declaration_in_ruletype_declaration671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_entryRuledoc_comment708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledoc_comment718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruledoc_comment755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruledoc_comment772 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruledoc_comment789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclass_declaration_in_entryRuleclass_declaration825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclass_declaration835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_ruleclass_declaration881 = new BitSet(new long[]{0x0020000400800000L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_23_in_ruleclass_declaration894 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleclass_declaration911 = new BitSet(new long[]{0x000000000B000000L});
    public static final BitSet FOLLOW_24_in_ruleclass_declaration929 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleclass_declaration950 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_25_in_ruleclass_declaration965 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleclass_declaration986 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleclass_declaration999 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleclass_declaration1020 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleclass_declaration1036 = new BitSet(new long[]{0x0020010450A40020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulefield_declaration_in_ruleclass_declaration1058 = new BitSet(new long[]{0x0020010450A40020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleclass_declaration_in_ruleclass_declaration1085 = new BitSet(new long[]{0x0020010450A40020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_28_in_ruleclass_declaration1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinterface_declaration_in_entryRuleinterface_declaration1135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinterface_declaration1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_ruleinterface_declaration1191 = new BitSet(new long[]{0x0020000420000000L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_29_in_ruleinterface_declaration1204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleinterface_declaration1221 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_24_in_ruleinterface_declaration1239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleinterface_declaration1260 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleinterface_declaration1273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleinterface_declaration1294 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleinterface_declaration1310 = new BitSet(new long[]{0x0020010450240020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulefield_declaration_in_ruleinterface_declaration1331 = new BitSet(new long[]{0x0020010450240020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_28_in_ruleinterface_declaration1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_declaration_in_entryRulefield_declaration1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_declaration1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_rulefield_declaration1437 = new BitSet(new long[]{0x0020010440200020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_rulefield_declaration1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_rulefield_declaration1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulefield_declaration1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatic_initializer_in_rulefield_declaration1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulefield_declaration1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_entryRulemethod_declaration1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemethod_declaration1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_rulemethod_declaration1653 = new BitSet(new long[]{0x0020000400000020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruletype_in_rulemethod_declaration1675 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulemethod_declaration1692 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulemethod_declaration1709 = new BitSet(new long[]{0x0020000480000020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleparameter_list_in_rulemethod_declaration1730 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulemethod_declaration1743 = new BitSet(new long[]{0x0000000108040000L});
    public static final BitSet FOLLOW_32_in_rulemethod_declaration1756 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulemethod_declaration1768 = new BitSet(new long[]{0x0000000108040000L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulemethod_declaration1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulemethod_declaration1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_in_entryRuleparameter1847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleparameter1903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleparameter1920 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleparameter1938 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleparameter1950 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleparameter_list_in_entryRuleparameter_list1988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_list1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_in_ruleparameter_list2044 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleparameter_list2057 = new BitSet(new long[]{0x0020000400000020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleparameter_in_ruleparameter_list2078 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_entryRulestatement_block2116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_block2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulestatement_block2163 = new BitSet(new long[]{0x73E4F5DC582401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_block2184 = new BitSet(new long[]{0x73E4F5DC582401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_28_in_rulestatement_block2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement2233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulestatement2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement2496 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulestatement2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_rulestatement2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledo_statement_in_rulestatement2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rulestatement2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rulestatement2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletry_statement_in_rulestatement2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitch_statement_in_rulestatement2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulestatement2717 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulestatement2729 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement2750 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulestatement2762 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulestatement2803 = new BitSet(new long[]{0x73C00000400401F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement2824 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulestatement2857 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement2878 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement2909 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulestatement2920 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulestatement2964 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement2981 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulestatement3019 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement3036 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulestatement3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration3109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_rulevariable_declaration3165 = new BitSet(new long[]{0x0020010440200020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruletype_in_rulevariable_declaration3188 = new BitSet(new long[]{0x0020010440200020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_40_in_rulevariable_declaration3206 = new BitSet(new long[]{0x0020010440200020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulevariable_declarator_in_rulevariable_declaration3229 = new BitSet(new long[]{0x000000000C040000L});
    public static final BitSet FOLLOW_26_in_rulevariable_declaration3242 = new BitSet(new long[]{0x0020010440200020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulevariable_declarator_in_rulevariable_declaration3263 = new BitSet(new long[]{0x000000000C040000L});
    public static final BitSet FOLLOW_18_in_rulevariable_declaration3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulevariable_declaration3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declarator_in_entryRulevariable_declarator3342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declarator3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulevariable_declarator3390 = new BitSet(new long[]{0x73E00004C00001F0L,0x0000FFFFF8000000L});
    public static final BitSet FOLLOW_rulearglist_in_rulevariable_declarator3416 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulevariable_declarator3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariable_declarator3454 = new BitSet(new long[]{0x0000020100000002L});
    public static final BitSet FOLLOW_32_in_rulevariable_declarator3472 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulevariable_declarator3484 = new BitSet(new long[]{0x0000020100000002L});
    public static final BitSet FOLLOW_41_in_rulevariable_declarator3499 = new BitSet(new long[]{0x73C00000480001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_declarator3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_entryRulevariable_initializer3559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_initializer3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulevariable_initializer3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulevariable_initializer3634 = new BitSet(new long[]{0x73C00000580001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_initializer3656 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_26_in_rulevariable_initializer3669 = new BitSet(new long[]{0x73C00000480001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_initializer3690 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_26_in_rulevariable_initializer3705 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulevariable_initializer3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_entryRuleif_statement3758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_statement3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleif_statement3805 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleif_statement3817 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleif_statement3838 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleif_statement3850 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement3871 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleif_statement3903 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledo_statement_in_entryRuledo_statement3963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledo_statement3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruledo_statement4010 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruledo_statement4031 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruledo_statement4043 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruledo_statement4055 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruledo_statement4076 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruledo_statement4088 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruledo_statement4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement4136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulewhile_statement4183 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulewhile_statement4195 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulewhile_statement4216 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulewhile_statement4228 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulewhile_statement4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_entryRulefor_statement4285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_statement4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulefor_statement4332 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulefor_statement4344 = new BitSet(new long[]{0x73E00104402401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulefor_statement4376 = new BitSet(new long[]{0x73C00000400401F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4404 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulefor_statement4416 = new BitSet(new long[]{0x73C00000400401F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_18_in_rulefor_statement4435 = new BitSet(new long[]{0x73C00000400401F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4457 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulefor_statement4470 = new BitSet(new long[]{0x73C00000C00001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4491 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulefor_statement4504 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulefor_statement4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletry_statement_in_entryRuletry_statement4561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletry_statement4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruletry_statement4608 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruletry_statement4629 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_48_in_ruletry_statement4678 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruletry_statement4690 = new BitSet(new long[]{0x0020000400000020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleparameter_in_ruletry_statement4711 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruletry_statement4723 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruletry_statement4744 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_49_in_ruletry_statement4779 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruletry_statement4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitch_statement_in_entryRuleswitch_statement4839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleswitch_statement4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleswitch_statement4886 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleswitch_statement4898 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleswitch_statement4919 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleswitch_statement4931 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleswitch_statement4943 = new BitSet(new long[]{0x73FCF5DC582401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_51_in_ruleswitch_statement4957 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleswitch_statement4978 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleswitch_statement4990 = new BitSet(new long[]{0x73FCF5DC582401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_52_in_ruleswitch_statement5010 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleswitch_statement5022 = new BitSet(new long[]{0x73FCF5DC582401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleswitch_statement5050 = new BitSet(new long[]{0x73FCF5DC582401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_28_in_ruleswitch_statement5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_entryRuleconstructor_declaration5100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstructor_declaration5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_ruleconstructor_declaration5156 = new BitSet(new long[]{0x0020010400000020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruletype_in_ruleconstructor_declaration5179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40_in_ruleconstructor_declaration5197 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstructor_declaration5216 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleconstructor_declaration5233 = new BitSet(new long[]{0x0020000480000020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleparameter_list_in_ruleconstructor_declaration5254 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleconstructor_declaration5267 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruleconstructor_declaration5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatic_initializer_in_entryRulestatic_initializer5324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatic_initializer5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulestatic_initializer5371 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulestatic_initializer5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecreating_expression_in_entryRulecreating_expression5428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecreating_expression5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulecreating_expression5475 = new BitSet(new long[]{0x0000000040000020L,0x000000FF00000000L});
    public static final BitSet FOLLOW_rulename_in_rulecreating_expression5498 = new BitSet(new long[]{0x0000000148000000L});
    public static final BitSet FOLLOW_rulecreating_aux_in_rulecreating_expression5519 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulecreating_expression5548 = new BitSet(new long[]{0x0000000108000002L});
    public static final BitSet FOLLOW_ruleaux_in_rulecreating_expression5577 = new BitSet(new long[]{0x0000000108000002L});
    public static final BitSet FOLLOW_32_in_rulecreating_expression5592 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulecreating_expression5604 = new BitSet(new long[]{0x0000000108000002L});
    public static final BitSet FOLLOW_30_in_rulecreating_expression5626 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulecreating_expression5647 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulecreating_expression5659 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rulenewBlock_in_rulecreating_expression5682 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleexp_aux_in_entryRuleexp_aux5719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexp_aux5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexp_aux5885 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleexp_aux5897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleexp_aux5930 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleexp_aux5941 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexp_aux5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression5999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogical_expression_in_ruleexpression6056 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulenumeric_expression_in_ruleexpression6083 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulebit_expression_in_ruleexpression6110 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulecreating_expression_in_ruleexpression6137 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_ruleliteral_expression_in_ruleexpression6164 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_55_in_ruleexpression6182 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_56_in_ruleexpression6200 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_57_in_ruleexpression6218 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleexpression6241 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_30_in_ruleexpression6265 = new BitSet(new long[]{0x73E00004400001F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_ruleexp_aux_in_ruleexpression6290 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_entryRuleexpression_aux6348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_aux6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleexpression_aux6398 = new BitSet(new long[]{0x73E00004C00001F0L,0x0000FFFFF8000000L});
    public static final BitSet FOLLOW_rulearglist_in_ruleexpression_aux6419 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleexpression_aux6432 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_ruleaux_in_ruleexpression_aux6464 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_58_in_ruleexpression_aux6482 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux6503 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_26_in_ruleexpression_aux6523 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux6548 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_59_in_ruleexpression_aux6567 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_ruleexpression_aux6598 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_ruleexpression_aux6642 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux6663 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_60_in_ruleexpression_aux6690 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_61_in_ruleexpression_aux6719 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_ruleexpression_aux6778 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_62_in_ruleexpression_aux6802 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_63_in_ruleexpression_aux6839 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_64_in_ruleexpression_aux6876 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_65_in_ruleexpression_aux6913 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_66_in_ruleexpression_aux6950 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_67_in_ruleexpression_aux6987 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_68_in_ruleexpression_aux7024 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_69_in_ruleexpression_aux7061 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7096 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_70_in_ruleexpression_aux7125 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_71_in_ruleexpression_aux7154 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_72_in_ruleexpression_aux7183 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_73_in_ruleexpression_aux7212 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_74_in_ruleexpression_aux7241 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_75_in_ruleexpression_aux7270 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_76_in_ruleexpression_aux7299 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_77_in_ruleexpression_aux7328 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_68_in_ruleexpression_aux7357 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_69_in_ruleexpression_aux7386 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7423 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_78_in_ruleexpression_aux7449 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7483 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleexpression_aux7501 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7535 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_79_in_ruleexpression_aux7563 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_80_in_ruleexpression_aux7592 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_81_in_ruleexpression_aux7621 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_82_in_ruleexpression_aux7650 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_83_in_ruleexpression_aux7679 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_84_in_ruleexpression_aux7708 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7745 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_85_in_ruleexpression_aux7773 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_86_in_ruleexpression_aux7802 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_87_in_ruleexpression_aux7831 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_88_in_ruleexpression_aux7860 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7897 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression_aux7921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemais_aux_in_entryRulemais_aux7958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemais_aux7968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rulemais_aux8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rulemais_aux8048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenewBlock_in_entryRulenewBlock8097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenewBlock8107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulenewBlock8144 = new BitSet(new long[]{0x0020010400000020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_rulenewBlock8169 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulenewBlock8180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecreating_aux_in_entryRulecreating_aux8216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecreating_aux8226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulecreating_aux8272 = new BitSet(new long[]{0x73E00004C00001F0L,0x0000FFFFF8000000L});
    public static final BitSet FOLLOW_rulearglist_in_rulecreating_aux8294 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulecreating_aux8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaux_in_rulecreating_aux8348 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_rulecreating_aux8362 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulecreating_aux8374 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleaux_in_entryRuleaux8413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaux8423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleaux8460 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleaux8481 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleaux8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleliteral_expression_in_entryRuleliteral_expression8529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleliteral_expression8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleliteral_expression8586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_LITERAL_in_ruleliteral_expression8614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_LITERAL_in_ruleliteral_expression8642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleliteral_expression8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogical_expression_in_entryRulelogical_expression8711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogical_expression8721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rulelogical_expression8765 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulelogical_expression8799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rulelogical_expression8824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rulelogical_expression8861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebit_expression_in_entryRulebit_expression8910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebit_expression8920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rulebit_expression8963 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulebit_expression8997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumeric_expression_in_entryRulenumeric_expression9033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumeric_expression9043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulenumeric_expression9088 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_60_in_rulenumeric_expression9117 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_61_in_rulenumeric_expression9146 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulenumeric_expression9183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearglist_in_entryRulearglist9219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearglist9229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulearglist9276 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_rulearglist9289 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulearglist9310 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_95_in_rulearglist9332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulearglist9343 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_rulearglist9354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rulearglist9383 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulearglist9400 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_rulearglist9418 = new BitSet(new long[]{0x0020000400000020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruletype_in_rulearglist9439 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulearglist9456 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rulename_in_entryRulename9500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulename9510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulename9552 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_rulename9578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_entryRulepackage_name_aux9614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepackage_name_aux9624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulepackage_name_aux9661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulepackage_name_aux9678 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_rulepackage_name_aux9704 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_entryRuletype_specifier9741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_specifier9751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruletype_specifier9794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruletype_specifier9831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruletype_specifier9868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruletype_specifier9905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruletype_specifier9942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruletype_specifier9979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruletype_specifier10016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruletype_specifier10053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype10102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype10112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_ruletype10159 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rulename_in_ruletype10186 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruletype10200 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruletype10212 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_entryRuleMODIFIER10250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODIFIER10260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleMODIFIER10303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleMODIFIER10340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleMODIFIER10377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleMODIFIER10414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleMODIFIER10451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleMODIFIER10488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMODIFIER10525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleMODIFIER10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleMODIFIER10599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleMODIFIER10636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_synpred18_InternalSimpleJava1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_synpred19_InternalSimpleJava1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_synpred39_InternalSimpleJava2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred57_InternalSimpleJava2496 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred57_InternalSimpleJava2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred65_InternalSimpleJava2717 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred65_InternalSimpleJava2729 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred65_InternalSimpleJava2750 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred65_InternalSimpleJava2762 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_synpred65_InternalSimpleJava2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_synpred69_InternalSimpleJava2909 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred69_InternalSimpleJava2920 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_synpred69_InternalSimpleJava2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred87_InternalSimpleJava3884 = new BitSet(new long[]{0x73E4F5DC482401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_synpred87_InternalSimpleJava3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_synpred89_InternalSimpleJava4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred90_InternalSimpleJava4404 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred90_InternalSimpleJava4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred93_InternalSimpleJava4642 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred93_InternalSimpleJava4646 = new BitSet(new long[]{0x0020000400000020L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleparameter_in_synpred93_InternalSimpleJava4653 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred93_InternalSimpleJava4659 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_synpred93_InternalSimpleJava4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred94_InternalSimpleJava4760 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_synpred94_InternalSimpleJava4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred103_InternalSimpleJava5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenewBlock_in_synpred106_InternalSimpleJava5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred124_InternalSimpleJava5885 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred124_InternalSimpleJava5897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred143_InternalSimpleJava6642 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred143_InternalSimpleJava6663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred156_InternalSimpleJava6778 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_62_in_synpred156_InternalSimpleJava6802 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_63_in_synpred156_InternalSimpleJava6839 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_64_in_synpred156_InternalSimpleJava6876 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_65_in_synpred156_InternalSimpleJava6913 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_66_in_synpred156_InternalSimpleJava6950 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_67_in_synpred156_InternalSimpleJava6987 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_68_in_synpred156_InternalSimpleJava7024 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_69_in_synpred156_InternalSimpleJava7061 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred156_InternalSimpleJava7096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred177_InternalSimpleJava6398 = new BitSet(new long[]{0x73E00004C00001F0L,0x0000FFFFF8000000L});
    public static final BitSet FOLLOW_rulearglist_in_synpred177_InternalSimpleJava6419 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred177_InternalSimpleJava6432 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_ruleaux_in_synpred177_InternalSimpleJava6464 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_58_in_synpred177_InternalSimpleJava6482 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava6503 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_26_in_synpred177_InternalSimpleJava6523 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava6548 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_59_in_synpred177_InternalSimpleJava6567 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulename_in_synpred177_InternalSimpleJava6598 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred177_InternalSimpleJava6642 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava6663 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_60_in_synpred177_InternalSimpleJava6690 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_61_in_synpred177_InternalSimpleJava6719 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred177_InternalSimpleJava6778 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_62_in_synpred177_InternalSimpleJava6802 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_63_in_synpred177_InternalSimpleJava6839 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_64_in_synpred177_InternalSimpleJava6876 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_65_in_synpred177_InternalSimpleJava6913 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_66_in_synpred177_InternalSimpleJava6950 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_67_in_synpred177_InternalSimpleJava6987 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_68_in_synpred177_InternalSimpleJava7024 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_69_in_synpred177_InternalSimpleJava7061 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava7096 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_70_in_synpred177_InternalSimpleJava7125 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_71_in_synpred177_InternalSimpleJava7154 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_72_in_synpred177_InternalSimpleJava7183 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_73_in_synpred177_InternalSimpleJava7212 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_74_in_synpred177_InternalSimpleJava7241 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_75_in_synpred177_InternalSimpleJava7270 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_76_in_synpred177_InternalSimpleJava7299 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_77_in_synpred177_InternalSimpleJava7328 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_68_in_synpred177_InternalSimpleJava7357 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_69_in_synpred177_InternalSimpleJava7386 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava7423 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_78_in_synpred177_InternalSimpleJava7449 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava7483 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred177_InternalSimpleJava7501 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava7535 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_79_in_synpred177_InternalSimpleJava7563 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_80_in_synpred177_InternalSimpleJava7592 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_81_in_synpred177_InternalSimpleJava7621 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_82_in_synpred177_InternalSimpleJava7650 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_83_in_synpred177_InternalSimpleJava7679 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_84_in_synpred177_InternalSimpleJava7708 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava7745 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_85_in_synpred177_InternalSimpleJava7773 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_86_in_synpred177_InternalSimpleJava7802 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_87_in_synpred177_InternalSimpleJava7831 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_88_in_synpred177_InternalSimpleJava7860 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred177_InternalSimpleJava7897 = new BitSet(new long[]{0xFC00000144000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_ruleexpression_aux_in_synpred177_InternalSimpleJava7921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred181_InternalSimpleJava8272 = new BitSet(new long[]{0x73E00004C00001F0L,0x0000FFFFF8000000L});
    public static final BitSet FOLLOW_rulearglist_in_synpred181_InternalSimpleJava8294 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred181_InternalSimpleJava8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred182_InternalSimpleJava8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred193_InternalSimpleJava9276 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_synpred193_InternalSimpleJava9289 = new BitSet(new long[]{0x73C00000400001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred193_InternalSimpleJava9310 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_58_in_synpred196_InternalSimpleJava9661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_synpred196_InternalSimpleJava9678 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_synpred196_InternalSimpleJava9704 = new BitSet(new long[]{0x0000000000000002L});

}