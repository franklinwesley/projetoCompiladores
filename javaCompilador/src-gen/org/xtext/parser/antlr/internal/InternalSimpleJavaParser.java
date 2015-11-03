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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_DECIMAL_DIGITS", "RULE_INTEGER_LITERAL", "RULE_FLOAT_LITERAL", "RULE_STRING", "RULE_EXPONENT_PART", "RULE_FLOAT_TYPE_SUFFIX", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.*;'", "'/**'", "'... text ...'", "'*/'", "'class'", "'extends'", "'implements'", "','", "'{'", "'}'", "'interface'", "'('", "')'", "'['", "']'", "'synchronized'", "'return'", "'throw'", "':'", "'break'", "'continue'", "'void'", "'='", "'if'", "'else'", "'do'", "'while'", "'for'", "'try'", "'catch'", "'finally'", "'switch'", "'case'", "'default'", "'static'", "'new'", "'null'", "'super'", "'this'", "'.'", "'instanceof'", "'++'", "'--'", "'-'", "'-='", "'*'", "'*='", "'/'", "'/='", "'%'", "'%='", "'ampersand'", "'ampersand='", "'|'", "'|='", "'^'", "'^='", "'||='", "'?'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'>>='", "'<<'", "'>>'", "'>>>'", "'+'", "'+='", "'!'", "'true'", "'false'", "'~'", "'\"'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'public'", "'private'", "'protected'", "'final'", "'native'", "'abstract'", "'threadsafe'", "'transient'"
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
    public static final int RULE_STRING=8;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_DECIMAL_DIGITS=5;
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
    public static final int RULE_INTEGER_LITERAL=6;
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
    public static final int RULE_IDENTIFIER=4;
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
    public static final int RULE_FLOAT_LITERAL=7;

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

                if ( (LA3_0==21||LA3_0==24||LA3_0==30||LA3_0==35||LA3_0==54||(LA3_0>=104 && LA3_0<=111)) ) {
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:295:1: ruletype_declaration returns [EObject current=null] : ( ( ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) ) ) ;
    public final EObject ruletype_declaration() throws RecognitionException {
        EObject current = null;

        EObject lv_declaracaoClasse_1_0 = null;

        EObject lv_declaracaoInterface_2_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:298:28: ( ( ( ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:299:1: ( ( ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:299:1: ( ( ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:299:2: ( ruledoc_comment )? ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:299:2: ( ruledoc_comment )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:300:2: ruledoc_comment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_declarationAccess().getDoc_commentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruledoc_comment_in_ruletype_declaration615);
                    ruledoc_comment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:310:3: ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:310:4: ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:310:4: ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:311:1: (lv_declaracaoClasse_1_0= ruleclass_declaration )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:311:1: (lv_declaracaoClasse_1_0= ruleclass_declaration )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:312:3: lv_declaracaoClasse_1_0= ruleclass_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getDeclaracaoClasseClass_declarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleclass_declaration_in_ruletype_declaration638);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:329:6: ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:329:6: ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:330:1: (lv_declaracaoInterface_2_0= ruleinterface_declaration )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:330:1: (lv_declaracaoInterface_2_0= ruleinterface_declaration )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:331:3: lv_declaracaoInterface_2_0= ruleinterface_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getDeclaracaoInterfaceInterface_declarationParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleinterface_declaration_in_ruletype_declaration665);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:355:1: entryRuledoc_comment returns [String current=null] : iv_ruledoc_comment= ruledoc_comment EOF ;
    public final String entryRuledoc_comment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledoc_comment = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:356:2: (iv_ruledoc_comment= ruledoc_comment EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:357:2: iv_ruledoc_comment= ruledoc_comment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoc_commentRule()); 
            }
            pushFollow(FOLLOW_ruledoc_comment_in_entryRuledoc_comment703);
            iv_ruledoc_comment=ruledoc_comment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledoc_comment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledoc_comment714); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:364:1: ruledoc_comment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/**' kw= '... text ...' kw= '*/' ) ;
    public final AntlrDatatypeRuleToken ruledoc_comment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:367:28: ( (kw= '/**' kw= '... text ...' kw= '*/' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:368:1: (kw= '/**' kw= '... text ...' kw= '*/' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:368:1: (kw= '/**' kw= '... text ...' kw= '*/' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:369:2: kw= '/**' kw= '... text ...' kw= '*/'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruledoc_comment752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDoc_commentAccess().getSolidusAsteriskAsteriskKeyword_0()); 
                  
            }
            kw=(Token)match(input,22,FOLLOW_22_in_ruledoc_comment765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDoc_commentAccess().getTextKeyword_1()); 
                  
            }
            kw=(Token)match(input,23,FOLLOW_23_in_ruledoc_comment778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDoc_commentAccess().getAsteriskSolidusKeyword_2()); 
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:394:1: entryRuleclass_declaration returns [EObject current=null] : iv_ruleclass_declaration= ruleclass_declaration EOF ;
    public final EObject entryRuleclass_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleclass_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:395:2: (iv_ruleclass_declaration= ruleclass_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:396:2: iv_ruleclass_declaration= ruleclass_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleclass_declaration_in_entryRuleclass_declaration818);
            iv_ruleclass_declaration=ruleclass_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleclass_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleclass_declaration828); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:403:1: ruleclass_declaration returns [EObject current=null] : ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}' ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:406:28: ( ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:407:1: ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:407:1: ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:407:2: ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'class' ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )? (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )? otherlv_9= '{' ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )* otherlv_12= '}'
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:407:2: ( (lv_modificadores_0_0= ruleMODIFIER ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35||LA7_0==54||(LA7_0>=104 && LA7_0<=111)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:408:1: (lv_modificadores_0_0= ruleMODIFIER )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:408:1: (lv_modificadores_0_0= ruleMODIFIER )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:409:3: lv_modificadores_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getModificadoresMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_ruleclass_declaration874);
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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleclass_declaration887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClass_declarationAccess().getClassKeyword_1());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:429:1: ( (lv_nomeClasse_2_0= RULE_IDENTIFIER ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:430:1: (lv_nomeClasse_2_0= RULE_IDENTIFIER )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:430:1: (lv_nomeClasse_2_0= RULE_IDENTIFIER )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:431:3: lv_nomeClasse_2_0= RULE_IDENTIFIER
            {
            lv_nomeClasse_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleclass_declaration904); if (state.failed) return current;
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:447:2: (otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:447:4: otherlv_3= 'extends' ( (lv_superclasse_4_0= rulename ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleclass_declaration922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:451:1: ( (lv_superclasse_4_0= rulename ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:452:1: (lv_superclasse_4_0= rulename )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:452:1: (lv_superclasse_4_0= rulename )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:453:3: lv_superclasse_4_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getSuperclasseNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_ruleclass_declaration943);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:469:4: (otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:469:6: otherlv_5= 'implements' ( (lv_implementosClasse_6_0= rulename ) ) (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )*
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleclass_declaration958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:473:1: ( (lv_implementosClasse_6_0= rulename ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:474:1: (lv_implementosClasse_6_0= rulename )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:474:1: (lv_implementosClasse_6_0= rulename )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:475:3: lv_implementosClasse_6_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementosClasseNameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_ruleclass_declaration979);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:491:2: (otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==27) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:491:4: otherlv_7= ',' ( (lv_implementosClasse_8_0= rulename ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleclass_declaration992); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:495:1: ( (lv_implementosClasse_8_0= rulename ) )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:496:1: (lv_implementosClasse_8_0= rulename )
                    	    {
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:496:1: (lv_implementosClasse_8_0= rulename )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:497:3: lv_implementosClasse_8_0= rulename
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementosClasseNameParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulename_in_ruleclass_declaration1013);
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

            otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleclass_declaration1029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:517:1: ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )*
            loop11:
            do {
                int alt11=3;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:517:2: ( (lv_corpoClasse_10_0= rulefield_declaration ) )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:517:2: ( (lv_corpoClasse_10_0= rulefield_declaration ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:518:1: (lv_corpoClasse_10_0= rulefield_declaration )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:518:1: (lv_corpoClasse_10_0= rulefield_declaration )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:519:3: lv_corpoClasse_10_0= rulefield_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getCorpoClasseField_declarationParserRuleCall_6_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulefield_declaration_in_ruleclass_declaration1051);
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
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:536:6: ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:536:6: ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:537:1: (lv_declaracaoClasse_11_0= ruleclass_declaration )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:537:1: (lv_declaracaoClasse_11_0= ruleclass_declaration )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:538:3: lv_declaracaoClasse_11_0= ruleclass_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getDeclaracaoClasseClass_declarationParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleclass_declaration_in_ruleclass_declaration1078);
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

            otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleclass_declaration1092); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:566:1: entryRuleinterface_declaration returns [EObject current=null] : iv_ruleinterface_declaration= ruleinterface_declaration EOF ;
    public final EObject entryRuleinterface_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinterface_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:567:2: (iv_ruleinterface_declaration= ruleinterface_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:568:2: iv_ruleinterface_declaration= ruleinterface_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleinterface_declaration_in_entryRuleinterface_declaration1128);
            iv_ruleinterface_declaration=ruleinterface_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinterface_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleinterface_declaration1138); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:575:1: ruleinterface_declaration returns [EObject current=null] : ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}' ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:578:28: ( ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:579:1: ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:579:1: ( ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:579:2: ( (lv_modificadores_0_0= ruleMODIFIER ) )* otherlv_1= 'interface' ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) ) (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )? otherlv_7= '{' ( (lv_corpoInterface_8_0= rulefield_declaration ) )* otherlv_9= '}'
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:579:2: ( (lv_modificadores_0_0= ruleMODIFIER ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==35||LA12_0==54||(LA12_0>=104 && LA12_0<=111)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:580:1: (lv_modificadores_0_0= ruleMODIFIER )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:580:1: (lv_modificadores_0_0= ruleMODIFIER )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:581:3: lv_modificadores_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getModificadoresMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_ruleinterface_declaration1184);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleinterface_declaration1197); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:601:1: ( (lv_nomeInterface_2_0= RULE_IDENTIFIER ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:602:1: (lv_nomeInterface_2_0= RULE_IDENTIFIER )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:602:1: (lv_nomeInterface_2_0= RULE_IDENTIFIER )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:603:3: lv_nomeInterface_2_0= RULE_IDENTIFIER
            {
            lv_nomeInterface_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleinterface_declaration1214); if (state.failed) return current;
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:619:2: (otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:619:4: otherlv_3= 'extends' ( (lv_superinterfaces_4_0= rulename ) ) (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )*
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleinterface_declaration1232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:623:1: ( (lv_superinterfaces_4_0= rulename ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:624:1: (lv_superinterfaces_4_0= rulename )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:624:1: (lv_superinterfaces_4_0= rulename )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:625:3: lv_superinterfaces_4_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getSuperinterfacesNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_ruleinterface_declaration1253);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:641:2: (otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==27) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:641:4: otherlv_5= ',' ( (lv_superinterfaces_6_0= rulename ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleinterface_declaration1266); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:645:1: ( (lv_superinterfaces_6_0= rulename ) )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:646:1: (lv_superinterfaces_6_0= rulename )
                    	    {
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:646:1: (lv_superinterfaces_6_0= rulename )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:647:3: lv_superinterfaces_6_0= rulename
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getSuperinterfacesNameParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulename_in_ruleinterface_declaration1287);
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

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleinterface_declaration1303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:667:1: ( (lv_corpoInterface_8_0= rulefield_declaration ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_IDENTIFIER||LA15_0==18||LA15_0==21||LA15_0==31||LA15_0==35||LA15_0==41||LA15_0==54||(LA15_0>=96 && LA15_0<=111)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:668:1: (lv_corpoInterface_8_0= rulefield_declaration )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:668:1: (lv_corpoInterface_8_0= rulefield_declaration )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:669:3: lv_corpoInterface_8_0= rulefield_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getCorpoInterfaceField_declarationParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulefield_declaration_in_ruleinterface_declaration1324);
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

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleinterface_declaration1337); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:697:1: entryRulefield_declaration returns [EObject current=null] : iv_rulefield_declaration= rulefield_declaration EOF ;
    public final EObject entryRulefield_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:698:2: (iv_rulefield_declaration= rulefield_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:699:2: iv_rulefield_declaration= rulefield_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_declarationRule()); 
            }
            pushFollow(FOLLOW_rulefield_declaration_in_entryRulefield_declaration1373);
            iv_rulefield_declaration=rulefield_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefield_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_declaration1383); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:706:1: rulefield_declaration returns [EObject current=null] : ( ( ( ruledoc_comment )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) ) | ( (lv_estatico_4_0= rulestatic_initializer ) ) | otherlv_5= ';' ) ;
    public final EObject rulefield_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject lv_declaracaoMetodo_1_0 = null;

        EObject lv_declaracaoConstrutor_2_0 = null;

        EObject lv_declaracaoVariavel_3_0 = null;

        EObject lv_estatico_4_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:709:28: ( ( ( ( ruledoc_comment )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) ) | ( (lv_estatico_4_0= rulestatic_initializer ) ) | otherlv_5= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:710:1: ( ( ( ruledoc_comment )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) ) | ( (lv_estatico_4_0= rulestatic_initializer ) ) | otherlv_5= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:710:1: ( ( ( ruledoc_comment )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) ) | ( (lv_estatico_4_0= rulestatic_initializer ) ) | otherlv_5= ';' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
            case 21:
            case 31:
            case 35:
            case 41:
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
            case 54:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==RULE_IDENTIFIER||LA18_2==31||LA18_2==35||LA18_2==41||LA18_2==54||(LA18_2>=96 && LA18_2<=111)) ) {
                    alt18=1;
                }
                else if ( (LA18_2==28) ) {
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:710:2: ( ( ruledoc_comment )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:710:2: ( ( ruledoc_comment )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:710:3: ( ruledoc_comment )* ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:710:3: ( ruledoc_comment )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==21) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:711:2: ruledoc_comment
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getField_declarationAccess().getDoc_commentParserRuleCall_0_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruledoc_comment_in_rulefield_declaration1429);
                    	    ruledoc_comment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:721:3: ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) )
                    int alt17=3;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:721:4: ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:721:4: ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:722:1: (lv_declaracaoMetodo_1_0= rulemethod_declaration )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:722:1: (lv_declaracaoMetodo_1_0= rulemethod_declaration )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:723:3: lv_declaracaoMetodo_1_0= rulemethod_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoMetodoMethod_declarationParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulemethod_declaration_in_rulefield_declaration1452);
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
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:740:6: ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:740:6: ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:741:1: (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:741:1: (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:742:3: lv_declaracaoConstrutor_2_0= ruleconstructor_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoConstrutorConstructor_declarationParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleconstructor_declaration_in_rulefield_declaration1479);
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
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:759:6: ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:759:6: ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:760:1: (lv_declaracaoVariavel_3_0= rulevariable_declaration )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:760:1: (lv_declaracaoVariavel_3_0= rulevariable_declaration )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:761:3: lv_declaracaoVariavel_3_0= rulevariable_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulevariable_declaration_in_rulefield_declaration1506);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:778:6: ( (lv_estatico_4_0= rulestatic_initializer ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:778:6: ( (lv_estatico_4_0= rulestatic_initializer ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:779:1: (lv_estatico_4_0= rulestatic_initializer )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:779:1: (lv_estatico_4_0= rulestatic_initializer )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:780:3: lv_estatico_4_0= rulestatic_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getField_declarationAccess().getEstaticoStatic_initializerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatic_initializer_in_rulefield_declaration1535);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:797:7: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulefield_declaration1553); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:809:1: entryRulemethod_declaration returns [EObject current=null] : iv_rulemethod_declaration= rulemethod_declaration EOF ;
    public final EObject entryRulemethod_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemethod_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:810:2: (iv_rulemethod_declaration= rulemethod_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:811:2: iv_rulemethod_declaration= rulemethod_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            }
            pushFollow(FOLLOW_rulemethod_declaration_in_entryRulemethod_declaration1589);
            iv_rulemethod_declaration=rulemethod_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemethod_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemethod_declaration1599); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:818:1: rulemethod_declaration returns [EObject current=null] : ( ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:821:28: ( ( ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:822:1: ( ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:822:1: ( ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:822:2: ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )* ( (lv_tipoRetorno_1_0= ruletype ) ) ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) ) otherlv_3= '(' ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:822:2: ( (lv_modificadorMetodo_0_0= ruleMODIFIER ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35||LA19_0==54||(LA19_0>=104 && LA19_0<=111)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:823:1: (lv_modificadorMetodo_0_0= ruleMODIFIER )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:823:1: (lv_modificadorMetodo_0_0= ruleMODIFIER )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:824:3: lv_modificadorMetodo_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getModificadorMetodoMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_rulemethod_declaration1645);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:840:3: ( (lv_tipoRetorno_1_0= ruletype ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:841:1: (lv_tipoRetorno_1_0= ruletype )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:841:1: (lv_tipoRetorno_1_0= ruletype )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:842:3: lv_tipoRetorno_1_0= ruletype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getTipoRetornoTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_in_rulemethod_declaration1667);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:858:2: ( (lv_nomeMetodo_2_0= RULE_IDENTIFIER ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:859:1: (lv_nomeMetodo_2_0= RULE_IDENTIFIER )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:859:1: (lv_nomeMetodo_2_0= RULE_IDENTIFIER )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:860:3: lv_nomeMetodo_2_0= RULE_IDENTIFIER
            {
            lv_nomeMetodo_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulemethod_declaration1684); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_rulemethod_declaration1701); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:880:1: ( (lv_parametrosMetodo_4_0= ruleparameter_list ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENTIFIER||(LA20_0>=96 && LA20_0<=103)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:881:1: (lv_parametrosMetodo_4_0= ruleparameter_list )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:881:1: (lv_parametrosMetodo_4_0= ruleparameter_list )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:882:3: lv_parametrosMetodo_4_0= ruleparameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getParametrosMetodoParameter_listParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleparameter_list_in_rulemethod_declaration1722);
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

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_rulemethod_declaration1735); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:902:1: (otherlv_6= '[' otherlv_7= ']' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:902:3: otherlv_6= '[' otherlv_7= ']'
            	    {
            	    otherlv_6=(Token)match(input,33,FOLLOW_33_in_rulemethod_declaration1748); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketKeyword_6_0());
            	          
            	    }
            	    otherlv_7=(Token)match(input,34,FOLLOW_34_in_rulemethod_declaration1760); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMethod_declarationAccess().getRightSquareBracketKeyword_6_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:910:3: ( ( (lv_blocoMetodo_8_0= rulestatement_block ) ) | otherlv_9= ';' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:910:4: ( (lv_blocoMetodo_8_0= rulestatement_block ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:910:4: ( (lv_blocoMetodo_8_0= rulestatement_block ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:911:1: (lv_blocoMetodo_8_0= rulestatement_block )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:911:1: (lv_blocoMetodo_8_0= rulestatement_block )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:912:3: lv_blocoMetodo_8_0= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getBlocoMetodoStatement_blockParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_rulemethod_declaration1784);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:929:7: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_rulemethod_declaration1802); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:941:1: entryRuleparameter returns [EObject current=null] : iv_ruleparameter= ruleparameter EOF ;
    public final EObject entryRuleparameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:942:2: (iv_ruleparameter= ruleparameter EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:943:2: iv_ruleparameter= ruleparameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleparameter_in_entryRuleparameter1839);
            iv_ruleparameter=ruleparameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter1849); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:950:1: ruleparameter returns [EObject current=null] : ( ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )* ) ;
    public final EObject ruleparameter() throws RecognitionException {
        EObject current = null;

        Token lv_nomeParametro_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_tipoParametro_0_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:953:28: ( ( ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:954:1: ( ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:954:1: ( ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:954:2: ( (lv_tipoParametro_0_0= ruletype ) ) ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '[' otherlv_3= ']' )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:954:2: ( (lv_tipoParametro_0_0= ruletype ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:955:1: (lv_tipoParametro_0_0= ruletype )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:955:1: (lv_tipoParametro_0_0= ruletype )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:956:3: lv_tipoParametro_0_0= ruletype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTipoParametroTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletype_in_ruleparameter1895);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:972:2: ( (lv_nomeParametro_1_0= RULE_IDENTIFIER ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:973:1: (lv_nomeParametro_1_0= RULE_IDENTIFIER )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:973:1: (lv_nomeParametro_1_0= RULE_IDENTIFIER )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:974:3: lv_nomeParametro_1_0= RULE_IDENTIFIER
            {
            lv_nomeParametro_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleparameter1912); if (state.failed) return current;
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:990:2: (otherlv_2= '[' otherlv_3= ']' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:990:4: otherlv_2= '[' otherlv_3= ']'
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleparameter1930); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleparameter1942); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1006:1: entryRuleparameter_list returns [EObject current=null] : iv_ruleparameter_list= ruleparameter_list EOF ;
    public final EObject entryRuleparameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_list = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1007:2: (iv_ruleparameter_list= ruleparameter_list EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1008:2: iv_ruleparameter_list= ruleparameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_ruleparameter_list_in_entryRuleparameter_list1980);
            iv_ruleparameter_list=ruleparameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_list1990); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1015:1: ruleparameter_list returns [EObject current=null] : ( ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )* ) ;
    public final EObject ruleparameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parametros_0_0 = null;

        EObject lv_parametros_2_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1018:28: ( ( ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1019:1: ( ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1019:1: ( ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1019:2: ( (lv_parametros_0_0= ruleparameter ) ) (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1019:2: ( (lv_parametros_0_0= ruleparameter ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1020:1: (lv_parametros_0_0= ruleparameter )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1020:1: (lv_parametros_0_0= ruleparameter )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1021:3: lv_parametros_0_0= ruleparameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametrosParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleparameter_in_ruleparameter_list2036);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1037:2: (otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1037:4: otherlv_1= ',' ( (lv_parametros_2_0= ruleparameter ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleparameter_list2049); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1041:1: ( (lv_parametros_2_0= ruleparameter ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1042:1: (lv_parametros_2_0= ruleparameter )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1042:1: (lv_parametros_2_0= ruleparameter )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1043:3: lv_parametros_2_0= ruleparameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametrosParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleparameter_in_ruleparameter_list2070);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1067:1: entryRulestatement_block returns [EObject current=null] : iv_rulestatement_block= rulestatement_block EOF ;
    public final EObject entryRulestatement_block() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_block = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1068:2: (iv_rulestatement_block= rulestatement_block EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1069:2: iv_rulestatement_block= rulestatement_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_blockRule()); 
            }
            pushFollow(FOLLOW_rulestatement_block_in_entryRulestatement_block2108);
            iv_rulestatement_block=rulestatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement_block; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_block2118); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1076:1: rulestatement_block returns [EObject current=null] : (otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}' ) ;
    public final EObject rulestatement_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_corpo_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1079:28: ( (otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1080:1: (otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1080:1: (otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1080:3: otherlv_0= '{' ( (lv_corpo_1_0= rulestatement ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulestatement_block2155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1084:1: ( (lv_corpo_1_0= rulestatement ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_IDENTIFIER && LA25_0<=RULE_STRING)||LA25_0==18||LA25_0==28||LA25_0==31||(LA25_0>=35 && LA25_0<=37)||(LA25_0>=39 && LA25_0<=41)||LA25_0==43||(LA25_0>=45 && LA25_0<=48)||LA25_0==51||(LA25_0>=54 && LA25_0<=58)||(LA25_0>=61 && LA25_0<=63)||(LA25_0>=91 && LA25_0<=94)||(LA25_0>=96 && LA25_0<=111)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1085:1: (lv_corpo_1_0= rulestatement )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1085:1: (lv_corpo_1_0= rulestatement )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1086:3: lv_corpo_1_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatement_blockAccess().getCorpoStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_block2176);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulestatement_block2189); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1114:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1115:2: (iv_rulestatement= rulestatement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1116:2: iv_rulestatement= rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement2225);
            iv_rulestatement=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement2235); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1123:1: rulestatement returns [EObject current=null] : ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_bloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1126:28: ( ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_bloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1127:1: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_bloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1127:1: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_bloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' )
            int alt29=16;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1127:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1127:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1127:3: ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1138:1: (lv_declaracaoVariavel_0_0= rulevariable_declaration )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1139:3: lv_declaracaoVariavel_0_0= rulevariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulevariable_declaration_in_rulestatement2351);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1156:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1156:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1156:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';'
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1156:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1156:8: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1169:1: (lv_expressao_1_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1170:3: lv_expressao_1_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressaoExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement2488);
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

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulestatement2500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1191:6: ( (lv_bloco_3_0= rulestatement_block ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1191:6: ( (lv_bloco_3_0= rulestatement_block ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1192:1: (lv_bloco_3_0= rulestatement_block )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1192:1: (lv_bloco_3_0= rulestatement_block )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1193:3: lv_bloco_3_0= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getBlocoStatement_blockParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_rulestatement2528);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1210:6: ( (lv_corpoIf_4_0= ruleif_statement ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1210:6: ( (lv_corpoIf_4_0= ruleif_statement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1211:1: (lv_corpoIf_4_0= ruleif_statement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1211:1: (lv_corpoIf_4_0= ruleif_statement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1212:3: lv_corpoIf_4_0= ruleif_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoIfIf_statementParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleif_statement_in_rulestatement2555);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1229:6: ( (lv_corpoDoWhile_5_0= ruledo_statement ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1229:6: ( (lv_corpoDoWhile_5_0= ruledo_statement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1230:1: (lv_corpoDoWhile_5_0= ruledo_statement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1230:1: (lv_corpoDoWhile_5_0= ruledo_statement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1231:3: lv_corpoDoWhile_5_0= ruledo_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoDoWhileDo_statementParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledo_statement_in_rulestatement2582);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1248:6: ( (lv_corpoWhile_6_0= rulewhile_statement ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1248:6: ( (lv_corpoWhile_6_0= rulewhile_statement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1249:1: (lv_corpoWhile_6_0= rulewhile_statement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1249:1: (lv_corpoWhile_6_0= rulewhile_statement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1250:3: lv_corpoWhile_6_0= rulewhile_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoWhileWhile_statementParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulewhile_statement_in_rulestatement2609);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1267:6: ( (lv_corpoFor_7_0= rulefor_statement ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1267:6: ( (lv_corpoFor_7_0= rulefor_statement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1268:1: (lv_corpoFor_7_0= rulefor_statement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1268:1: (lv_corpoFor_7_0= rulefor_statement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1269:3: lv_corpoFor_7_0= rulefor_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoForFor_statementParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulefor_statement_in_rulestatement2636);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1286:6: ( (lv_corpoTryCatch_8_0= ruletry_statement ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1286:6: ( (lv_corpoTryCatch_8_0= ruletry_statement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1287:1: (lv_corpoTryCatch_8_0= ruletry_statement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1287:1: (lv_corpoTryCatch_8_0= ruletry_statement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1288:3: lv_corpoTryCatch_8_0= ruletry_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoTryCatchTry_statementParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletry_statement_in_rulestatement2663);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1305:6: ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1305:6: ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1306:1: (lv_corpoSwitchCase_9_0= ruleswitch_statement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1306:1: (lv_corpoSwitchCase_9_0= ruleswitch_statement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1307:3: lv_corpoSwitchCase_9_0= ruleswitch_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoSwitchCaseSwitch_statementParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleswitch_statement_in_rulestatement2690);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1324:6: (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1324:6: (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1324:8: otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) )
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_35_in_rulestatement2709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getSynchronizedKeyword_9_0());
                          
                    }
                    otherlv_11=(Token)match(input,31,FOLLOW_31_in_rulestatement2721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_9_1());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1332:1: ( (lv_expressaoSynchronized_12_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1333:1: (lv_expressaoSynchronized_12_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1333:1: (lv_expressaoSynchronized_12_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1334:3: lv_expressaoSynchronized_12_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressaoSynchronizedExpressionParserRuleCall_9_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement2742);
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

                    otherlv_13=(Token)match(input,32,FOLLOW_32_in_rulestatement2754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getRightParenthesisKeyword_9_3());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1354:1: ( (lv_corpoSynchronize_14_0= rulestatement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1355:1: (lv_corpoSynchronize_14_0= rulestatement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1355:1: (lv_corpoSynchronize_14_0= rulestatement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1356:3: lv_corpoSynchronize_14_0= rulestatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoSynchronizeStatementParserRuleCall_9_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement2775);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1373:6: (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1373:6: (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1373:8: otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';'
                    {
                    otherlv_15=(Token)match(input,36,FOLLOW_36_in_rulestatement2795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getReturnKeyword_10_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1377:1: ( (lv_return_16_0= ruleexpression ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=RULE_IDENTIFIER && LA26_0<=RULE_STRING)||LA26_0==31||(LA26_0>=55 && LA26_0<=58)||(LA26_0>=61 && LA26_0<=63)||(LA26_0>=91 && LA26_0<=94)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1378:1: (lv_return_16_0= ruleexpression )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1378:1: (lv_return_16_0= ruleexpression )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1379:3: lv_return_16_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getReturnExpressionParserRuleCall_10_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpression_in_rulestatement2816);
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

                    otherlv_17=(Token)match(input,18,FOLLOW_18_in_rulestatement2829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getStatementAccess().getSemicolonKeyword_10_2());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1400:6: (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1400:6: (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1400:8: otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';'
                    {
                    otherlv_18=(Token)match(input,37,FOLLOW_37_in_rulestatement2849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getStatementAccess().getThrowKeyword_11_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1404:1: ( (lv_exececao_19_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1405:1: (lv_exececao_19_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1405:1: (lv_exececao_19_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1406:3: lv_exececao_19_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExececaoExpressionParserRuleCall_11_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement2870);
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

                    otherlv_20=(Token)match(input,18,FOLLOW_18_in_rulestatement2882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getStatementAccess().getSemicolonKeyword_11_2());
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1427:6: (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1427:6: (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1427:7: this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement
                    {
                    this_IDENTIFIER_21=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement2901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENTIFIER_21, grammarAccess.getStatementAccess().getIDENTIFIERTerminalRuleCall_12_0()); 
                          
                    }
                    otherlv_22=(Token)match(input,38,FOLLOW_38_in_rulestatement2912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getStatementAccess().getColonKeyword_12_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatementParserRuleCall_12_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement2937);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1448:6: (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1448:6: (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1448:8: otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';'
                    {
                    otherlv_24=(Token)match(input,39,FOLLOW_39_in_rulestatement2956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getStatementAccess().getBreakKeyword_13_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1452:1: ( (lv_break_25_0= RULE_IDENTIFIER ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_IDENTIFIER) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1453:1: (lv_break_25_0= RULE_IDENTIFIER )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1453:1: (lv_break_25_0= RULE_IDENTIFIER )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1454:3: lv_break_25_0= RULE_IDENTIFIER
                            {
                            lv_break_25_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement2973); if (state.failed) return current;
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

                    otherlv_26=(Token)match(input,18,FOLLOW_18_in_rulestatement2991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getStatementAccess().getSemicolonKeyword_13_2());
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1475:6: (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1475:6: (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1475:8: otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';'
                    {
                    otherlv_27=(Token)match(input,40,FOLLOW_40_in_rulestatement3011); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getStatementAccess().getContinueKeyword_14_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1479:1: ( (lv_continue_28_0= RULE_IDENTIFIER ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_IDENTIFIER) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1480:1: (lv_continue_28_0= RULE_IDENTIFIER )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1480:1: (lv_continue_28_0= RULE_IDENTIFIER )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1481:3: lv_continue_28_0= RULE_IDENTIFIER
                            {
                            lv_continue_28_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement3028); if (state.failed) return current;
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

                    otherlv_29=(Token)match(input,18,FOLLOW_18_in_rulestatement3046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getStatementAccess().getSemicolonKeyword_14_2());
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1502:7: otherlv_30= ';'
                    {
                    otherlv_30=(Token)match(input,18,FOLLOW_18_in_rulestatement3065); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1514:1: entryRulevariable_declaration returns [EObject current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final EObject entryRulevariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1515:2: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1516:2: iv_rulevariable_declaration= rulevariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration3101);
            iv_rulevariable_declaration=rulevariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration3111); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1523:1: rulevariable_declaration returns [EObject current=null] : ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1526:28: ( ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1527:1: ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1527:1: ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1527:2: ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) ) (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )* (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1527:2: ( (lv_modificador_0_0= ruleMODIFIER ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==35||LA30_0==54||(LA30_0>=104 && LA30_0<=111)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1528:1: (lv_modificador_0_0= ruleMODIFIER )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1528:1: (lv_modificador_0_0= ruleMODIFIER )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1529:3: lv_modificador_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getModificadorMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_rulevariable_declaration3157);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1545:3: ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )?
            int alt31=3;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1545:4: ( (lv_tipoVariavel_1_0= ruletype ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1545:4: ( (lv_tipoVariavel_1_0= ruletype ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1546:1: (lv_tipoVariavel_1_0= ruletype )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1546:1: (lv_tipoVariavel_1_0= ruletype )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1547:3: lv_tipoVariavel_1_0= ruletype
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getTipoVariavelTypeParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_in_rulevariable_declaration3180);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1564:7: otherlv_2= 'void'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_rulevariable_declaration3198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getVariable_declarationAccess().getVoidKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1568:3: ( (lv_declaracaoVariaveis_3_0= rulevariable_declarator ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1569:1: (lv_declaracaoVariaveis_3_0= rulevariable_declarator )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1569:1: (lv_declaracaoVariaveis_3_0= rulevariable_declarator )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1570:3: lv_declaracaoVariaveis_3_0= rulevariable_declarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getDeclaracaoVariaveisVariable_declaratorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulevariable_declarator_in_rulevariable_declaration3221);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1586:2: (otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1586:4: otherlv_4= ',' ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_rulevariable_declaration3234); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1590:1: ( (lv_declaracaoVariaveis_5_0= rulevariable_declarator ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1591:1: (lv_declaracaoVariaveis_5_0= rulevariable_declarator )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1591:1: (lv_declaracaoVariaveis_5_0= rulevariable_declarator )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1592:3: lv_declaracaoVariaveis_5_0= rulevariable_declarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getDeclaracaoVariaveisVariable_declaratorParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulevariable_declarator_in_rulevariable_declaration3255);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1608:4: (otherlv_6= ';' | ( (lv_blocoVariavel_7_0= rulestatement_block ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) ) {
                alt33=1;
            }
            else if ( (LA33_0==28) ) {
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1608:6: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_rulevariable_declaration3270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1613:6: ( (lv_blocoVariavel_7_0= rulestatement_block ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1613:6: ( (lv_blocoVariavel_7_0= rulestatement_block ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1614:1: (lv_blocoVariavel_7_0= rulestatement_block )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1614:1: (lv_blocoVariavel_7_0= rulestatement_block )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1615:3: lv_blocoVariavel_7_0= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getBlocoVariavelStatement_blockParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_rulevariable_declaration3297);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1639:1: entryRulevariable_declarator returns [EObject current=null] : iv_rulevariable_declarator= rulevariable_declarator EOF ;
    public final EObject entryRulevariable_declarator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declarator = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1640:2: (iv_rulevariable_declarator= rulevariable_declarator EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1641:2: iv_rulevariable_declarator= rulevariable_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaratorRule()); 
            }
            pushFollow(FOLLOW_rulevariable_declarator_in_entryRulevariable_declarator3334);
            iv_rulevariable_declarator=rulevariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_declarator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declarator3344); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1648:1: rulevariable_declarator returns [EObject current=null] : ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1651:28: ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1652:1: ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1652:1: ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1652:2: (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1652:2: (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1652:4: otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_31_in_rulevariable_declarator3382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVariable_declaratorAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1656:1: (this_arglist_1= rulearglist )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=RULE_IDENTIFIER && LA34_0<=RULE_STRING)||LA34_0==31||(LA34_0>=55 && LA34_0<=58)||(LA34_0>=61 && LA34_0<=63)||(LA34_0>=91 && LA34_0<=103)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1657:2: this_arglist_1= rulearglist
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getVariable_declaratorAccess().getArglistParserRuleCall_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_rulearglist_in_rulevariable_declarator3408);
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

                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_rulevariable_declarator3421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getVariable_declaratorAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1673:6: ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1673:6: ( ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )? )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1673:7: ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) ) (otherlv_4= '[' otherlv_5= ']' )* (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )?
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1673:7: ( (lv_nomeVariavel_3_0= RULE_IDENTIFIER ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1674:1: (lv_nomeVariavel_3_0= RULE_IDENTIFIER )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1674:1: (lv_nomeVariavel_3_0= RULE_IDENTIFIER )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1675:3: lv_nomeVariavel_3_0= RULE_IDENTIFIER
                    {
                    lv_nomeVariavel_3_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariable_declarator3446); if (state.failed) return current;
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1691:2: (otherlv_4= '[' otherlv_5= ']' )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==33) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1691:4: otherlv_4= '[' otherlv_5= ']'
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_33_in_rulevariable_declarator3464); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketKeyword_1_1_0());
                    	          
                    	    }
                    	    otherlv_5=(Token)match(input,34,FOLLOW_34_in_rulevariable_declarator3476); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getVariable_declaratorAccess().getRightSquareBracketKeyword_1_1_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1699:3: (otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==42) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1699:5: otherlv_6= '=' ( (lv_valorVariavel_7_0= rulevariable_initializer ) )
                            {
                            otherlv_6=(Token)match(input,42,FOLLOW_42_in_rulevariable_declarator3491); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getVariable_declaratorAccess().getEqualsSignKeyword_1_2_0());
                                  
                            }
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1703:1: ( (lv_valorVariavel_7_0= rulevariable_initializer ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1704:1: (lv_valorVariavel_7_0= rulevariable_initializer )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1704:1: (lv_valorVariavel_7_0= rulevariable_initializer )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1705:3: lv_valorVariavel_7_0= rulevariable_initializer
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariable_declaratorAccess().getValorVariavelVariable_initializerParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_declarator3512);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1729:1: entryRulevariable_initializer returns [EObject current=null] : iv_rulevariable_initializer= rulevariable_initializer EOF ;
    public final EObject entryRulevariable_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_initializer = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1730:2: (iv_rulevariable_initializer= rulevariable_initializer EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1731:2: iv_rulevariable_initializer= rulevariable_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_initializerRule()); 
            }
            pushFollow(FOLLOW_rulevariable_initializer_in_entryRulevariable_initializer3551);
            iv_rulevariable_initializer=rulevariable_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_initializer3561); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1738:1: rulevariable_initializer returns [EObject current=null] : ( ( (lv_expressaoVariavel_0_0= ruleexpression ) ) | (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1741:28: ( ( ( (lv_expressaoVariavel_0_0= ruleexpression ) ) | (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1742:1: ( ( (lv_expressaoVariavel_0_0= ruleexpression ) ) | (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1742:1: ( ( (lv_expressaoVariavel_0_0= ruleexpression ) ) | (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_IDENTIFIER && LA41_0<=RULE_STRING)||LA41_0==31||(LA41_0>=55 && LA41_0<=58)||(LA41_0>=61 && LA41_0<=63)||(LA41_0>=91 && LA41_0<=94)) ) {
                alt41=1;
            }
            else if ( (LA41_0==28) ) {
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1742:2: ( (lv_expressaoVariavel_0_0= ruleexpression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1742:2: ( (lv_expressaoVariavel_0_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1743:1: (lv_expressaoVariavel_0_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1743:1: (lv_expressaoVariavel_0_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1744:3: lv_expressaoVariavel_0_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getExpressaoVariavelExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulevariable_initializer3607);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1761:6: (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1761:6: (otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1761:8: otherlv_1= '{' ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_rulevariable_initializer3626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariable_initializerAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1765:1: ( ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )? )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_IDENTIFIER && LA40_0<=RULE_STRING)||LA40_0==28||LA40_0==31||(LA40_0>=55 && LA40_0<=58)||(LA40_0>=61 && LA40_0<=63)||(LA40_0>=91 && LA40_0<=94)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1765:2: ( (lv_valorVariaveis_2_0= rulevariable_initializer ) ) (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )* (otherlv_5= ',' )?
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1765:2: ( (lv_valorVariaveis_2_0= rulevariable_initializer ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1766:1: (lv_valorVariaveis_2_0= rulevariable_initializer )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1766:1: (lv_valorVariaveis_2_0= rulevariable_initializer )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1767:3: lv_valorVariaveis_2_0= rulevariable_initializer
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getValorVariaveisVariable_initializerParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_initializer3648);
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

                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1783:2: (otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==27) ) {
                                    int LA38_1 = input.LA(2);

                                    if ( ((LA38_1>=RULE_IDENTIFIER && LA38_1<=RULE_STRING)||LA38_1==28||LA38_1==31||(LA38_1>=55 && LA38_1<=58)||(LA38_1>=61 && LA38_1<=63)||(LA38_1>=91 && LA38_1<=94)) ) {
                                        alt38=1;
                                    }


                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1783:4: otherlv_3= ',' ( (lv_valorVariaveis_4_0= rulevariable_initializer ) )
                            	    {
                            	    otherlv_3=(Token)match(input,27,FOLLOW_27_in_rulevariable_initializer3661); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getVariable_initializerAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1787:1: ( (lv_valorVariaveis_4_0= rulevariable_initializer ) )
                            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1788:1: (lv_valorVariaveis_4_0= rulevariable_initializer )
                            	    {
                            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1788:1: (lv_valorVariaveis_4_0= rulevariable_initializer )
                            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1789:3: lv_valorVariaveis_4_0= rulevariable_initializer
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getValorVariaveisVariable_initializerParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_initializer3682);
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

                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1805:4: (otherlv_5= ',' )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==27) ) {
                                alt39=1;
                            }
                            switch (alt39) {
                                case 1 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1805:6: otherlv_5= ','
                                    {
                                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_rulevariable_initializer3697); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_5, grammarAccess.getVariable_initializerAccess().getCommaKeyword_1_1_2());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_rulevariable_initializer3713); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1821:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1822:2: (iv_ruleif_statement= ruleif_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1823:2: iv_ruleif_statement= ruleif_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_statementRule()); 
            }
            pushFollow(FOLLOW_ruleif_statement_in_entryRuleif_statement3750);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleif_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_statement3760); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1830:1: ruleif_statement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )? ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1833:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1834:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1834:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1834:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_espressaoIf_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blcoIf_4_0= rulestatement ) ) ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleif_statement3797); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleif_statement3809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIf_statementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1842:1: ( (lv_espressaoIf_2_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1843:1: (lv_espressaoIf_2_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1843:1: (lv_espressaoIf_2_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1844:3: lv_espressaoIf_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_statementAccess().getEspressaoIfExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleif_statement3830);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleif_statement3842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIf_statementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1864:1: ( (lv_blcoIf_4_0= rulestatement ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1865:1: (lv_blcoIf_4_0= rulestatement )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1865:1: (lv_blcoIf_4_0= rulestatement )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1866:3: lv_blcoIf_4_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_statementAccess().getBlcoIfStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_ruleif_statement3863);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1882:2: ( ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred87_InternalSimpleJava()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1882:3: ( ( 'else' ( ( rulestatement ) ) ) )=> (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1887:6: (otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1887:8: otherlv_5= 'else' ( (lv_blocoElse_6_0= rulestatement ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleif_statement3895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIf_statementAccess().getElseKeyword_5_0_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1891:1: ( (lv_blocoElse_6_0= rulestatement ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1892:1: (lv_blocoElse_6_0= rulestatement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1892:1: (lv_blocoElse_6_0= rulestatement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1893:3: lv_blocoElse_6_0= rulestatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIf_statementAccess().getBlocoElseStatementParserRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_ruleif_statement3916);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1917:1: entryRuledo_statement returns [EObject current=null] : iv_ruledo_statement= ruledo_statement EOF ;
    public final EObject entryRuledo_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledo_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1918:2: (iv_ruledo_statement= ruledo_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1919:2: iv_ruledo_statement= ruledo_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDo_statementRule()); 
            }
            pushFollow(FOLLOW_ruledo_statement_in_entryRuledo_statement3955);
            iv_ruledo_statement=ruledo_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledo_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledo_statement3965); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1926:1: ruledo_statement returns [EObject current=null] : (otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';' ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1929:28: ( (otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1930:1: (otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1930:1: (otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1930:3: otherlv_0= 'do' ( (lv_blocoDo_1_0= rulestatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expressaoWhile_4_0= ruleexpression ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruledo_statement4002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDo_statementAccess().getDoKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1934:1: ( (lv_blocoDo_1_0= rulestatement ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1935:1: (lv_blocoDo_1_0= rulestatement )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1935:1: (lv_blocoDo_1_0= rulestatement )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1936:3: lv_blocoDo_1_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_statementAccess().getBlocoDoStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_ruledo_statement4023);
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

            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruledo_statement4035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDo_statementAccess().getWhileKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruledo_statement4047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDo_statementAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1960:1: ( (lv_expressaoWhile_4_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1961:1: (lv_expressaoWhile_4_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1961:1: (lv_expressaoWhile_4_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1962:3: lv_expressaoWhile_4_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_statementAccess().getExpressaoWhileExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruledo_statement4068);
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

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruledo_statement4080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDo_statementAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruledo_statement4092); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1994:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1995:2: (iv_rulewhile_statement= rulewhile_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1996:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_statementRule()); 
            }
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement4128);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulewhile_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement4138); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2003:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressaoWhile_2_0 = null;

        EObject lv_blocoWhile_4_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2006:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2007:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2007:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2007:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_expressaoWhile_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_blocoWhile_4_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_rulewhile_statement4175); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulewhile_statement4187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhile_statementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2015:1: ( (lv_expressaoWhile_2_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2016:1: (lv_expressaoWhile_2_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2016:1: (lv_expressaoWhile_2_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2017:3: lv_expressaoWhile_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressaoWhileExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulewhile_statement4208);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_rulewhile_statement4220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhile_statementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2037:1: ( (lv_blocoWhile_4_0= rulestatement ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2038:1: (lv_blocoWhile_4_0= rulestatement )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2038:1: (lv_blocoWhile_4_0= rulestatement )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2039:3: lv_blocoWhile_4_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_statementAccess().getBlocoWhileStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_rulewhile_statement4241);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2063:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2064:2: (iv_rulefor_statement= rulefor_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2065:2: iv_rulefor_statement= rulefor_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_statementRule()); 
            }
            pushFollow(FOLLOW_rulefor_statement_in_entryRulefor_statement4277);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefor_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_statement4287); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2072:1: rulefor_statement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2075:28: ( (otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2076:1: (otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2076:1: (otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2076:3: otherlv_0= 'for' otherlv_1= '(' ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_expressaoFor_6_0= ruleexpression ) )? otherlv_7= ';' ( (lv_expressaoIncremento_8_0= ruleexpression ) )? otherlv_9= ')' ( (lv_blocoFor_10_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_rulefor_statement4324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulefor_statement4336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFor_statementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2084:1: ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' )
            int alt43=3;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2084:2: ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2084:2: ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2084:3: ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2089:1: (lv_declaracaoVariavel_2_0= rulevariable_declaration )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2090:3: lv_declaracaoVariavel_2_0= rulevariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_statementAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulevariable_declaration_in_rulefor_statement4368);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2107:6: ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2107:6: ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2107:7: ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';'
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2107:7: ( (lv_expressaoDeclaracao_3_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2108:1: (lv_expressaoDeclaracao_3_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2108:1: (lv_expressaoDeclaracao_3_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2109:3: lv_expressaoDeclaracao_3_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressaoDeclaracaoExpressionParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4396);
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

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulefor_statement4408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFor_statementAccess().getSemicolonKeyword_2_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2130:7: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulefor_statement4427); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getSemicolonKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2134:2: ( (lv_expressaoFor_6_0= ruleexpression ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_IDENTIFIER && LA44_0<=RULE_STRING)||LA44_0==31||(LA44_0>=55 && LA44_0<=58)||(LA44_0>=61 && LA44_0<=63)||(LA44_0>=91 && LA44_0<=94)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2135:1: (lv_expressaoFor_6_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2135:1: (lv_expressaoFor_6_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2136:3: lv_expressaoFor_6_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressaoForExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4449);
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

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_rulefor_statement4462); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFor_statementAccess().getSemicolonKeyword_4());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2156:1: ( (lv_expressaoIncremento_8_0= ruleexpression ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_IDENTIFIER && LA45_0<=RULE_STRING)||LA45_0==31||(LA45_0>=55 && LA45_0<=58)||(LA45_0>=61 && LA45_0<=63)||(LA45_0>=91 && LA45_0<=94)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2157:1: (lv_expressaoIncremento_8_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2157:1: (lv_expressaoIncremento_8_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2158:3: lv_expressaoIncremento_8_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressaoIncrementoExpressionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4483);
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

            otherlv_9=(Token)match(input,32,FOLLOW_32_in_rulefor_statement4496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFor_statementAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2178:1: ( (lv_blocoFor_10_0= rulestatement ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2179:1: (lv_blocoFor_10_0= rulestatement )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2179:1: (lv_blocoFor_10_0= rulestatement )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2180:3: lv_blocoFor_10_0= rulestatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFor_statementAccess().getBlocoForStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_in_rulefor_statement4517);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2204:1: entryRuletry_statement returns [EObject current=null] : iv_ruletry_statement= ruletry_statement EOF ;
    public final EObject entryRuletry_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletry_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2205:2: (iv_ruletry_statement= ruletry_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2206:2: iv_ruletry_statement= ruletry_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruletry_statement_in_entryRuletry_statement4553);
            iv_ruletry_statement=ruletry_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletry_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletry_statement4563); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2213:1: ruletry_statement returns [EObject current=null] : (otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )? ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2216:28: ( (otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2217:1: (otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2217:1: (otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2217:3: otherlv_0= 'try' ( (lv_blocoTry_1_0= rulestatement_block ) ) ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )* ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruletry_statement4600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTry_statementAccess().getTryKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2221:1: ( (lv_blocoTry_1_0= rulestatement_block ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2222:1: (lv_blocoTry_1_0= rulestatement_block )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2222:1: (lv_blocoTry_1_0= rulestatement_block )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2223:3: lv_blocoTry_1_0= rulestatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTry_statementAccess().getBlocoTryStatement_blockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_block_in_ruletry_statement4621);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2239:2: ( ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==49) && (synpred93_InternalSimpleJava())) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2239:3: ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )=> (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2250:6: (otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2250:8: otherlv_2= 'catch' otherlv_3= '(' ( (lv_parametroCatch_4_0= ruleparameter ) ) otherlv_5= ')' ( (lv_blocoCatch_6_0= rulestatement_block ) )
            	    {
            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruletry_statement4670); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTry_statementAccess().getCatchKeyword_2_0_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruletry_statement4682); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_0_1());
            	          
            	    }
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2258:1: ( (lv_parametroCatch_4_0= ruleparameter ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2259:1: (lv_parametroCatch_4_0= ruleparameter )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2259:1: (lv_parametroCatch_4_0= ruleparameter )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2260:3: lv_parametroCatch_4_0= ruleparameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getParametroCatchParameterParserRuleCall_2_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleparameter_in_ruletry_statement4703);
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

            	    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruletry_statement4715); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_0_3());
            	          
            	    }
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2280:1: ( (lv_blocoCatch_6_0= rulestatement_block ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2281:1: (lv_blocoCatch_6_0= rulestatement_block )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2281:1: (lv_blocoCatch_6_0= rulestatement_block )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2282:3: lv_blocoCatch_6_0= rulestatement_block
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getBlocoCatchStatement_blockParserRuleCall_2_0_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_block_in_ruletry_statement4736);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2298:5: ( ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==50) && (synpred94_InternalSimpleJava())) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2298:6: ( ( 'finally' ( ( rulestatement_block ) ) ) )=> (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2303:6: (otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2303:8: otherlv_7= 'finally' ( (lv_blocoFinally_8_0= rulestatement_block ) )
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruletry_statement4771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2307:1: ( (lv_blocoFinally_8_0= rulestatement_block ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2308:1: (lv_blocoFinally_8_0= rulestatement_block )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2308:1: (lv_blocoFinally_8_0= rulestatement_block )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2309:3: lv_blocoFinally_8_0= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTry_statementAccess().getBlocoFinallyStatement_blockParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_ruletry_statement4792);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2333:1: entryRuleswitch_statement returns [EObject current=null] : iv_ruleswitch_statement= ruleswitch_statement EOF ;
    public final EObject entryRuleswitch_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleswitch_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2334:2: (iv_ruleswitch_statement= ruleswitch_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2335:2: iv_ruleswitch_statement= ruleswitch_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitch_statementRule()); 
            }
            pushFollow(FOLLOW_ruleswitch_statement_in_entryRuleswitch_statement4831);
            iv_ruleswitch_statement=ruleswitch_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleswitch_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleswitch_statement4841); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2342:1: ruleswitch_statement returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}' ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2345:28: ( (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2346:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2346:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2346:3: otherlv_0= 'switch' otherlv_1= '(' ( (lv_expressaoSwitch_2_0= ruleexpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleswitch_statement4878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitch_statementAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleswitch_statement4890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitch_statementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2354:1: ( (lv_expressaoSwitch_2_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:1: (lv_expressaoSwitch_2_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:1: (lv_expressaoSwitch_2_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2356:3: lv_expressaoSwitch_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpressaoSwitchExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleswitch_statement4911);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleswitch_statement4923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitch_statementAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleswitch_statement4935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitch_statementAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2380:1: ( (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_blocoSwitch_10_0= rulestatement ) ) )*
            loop48:
            do {
                int alt48=4;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    alt48=1;
                    }
                    break;
                case 53:
                    {
                    alt48=2;
                    }
                    break;
                case RULE_IDENTIFIER:
                case RULE_DECIMAL_DIGITS:
                case RULE_INTEGER_LITERAL:
                case RULE_FLOAT_LITERAL:
                case RULE_STRING:
                case 18:
                case 28:
                case 31:
                case 35:
                case 36:
                case 37:
                case 39:
                case 40:
                case 41:
                case 43:
                case 45:
                case 46:
                case 47:
                case 48:
                case 51:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 61:
                case 62:
                case 63:
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
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2380:2: (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2380:2: (otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':' )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2380:4: otherlv_5= 'case' ( (lv_expressaoCases_6_0= ruleexpression ) ) otherlv_7= ':'
            	    {
            	    otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleswitch_statement4949); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getSwitch_statementAccess().getCaseKeyword_5_0_0());
            	          
            	    }
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2384:1: ( (lv_expressaoCases_6_0= ruleexpression ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2385:1: (lv_expressaoCases_6_0= ruleexpression )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2385:1: (lv_expressaoCases_6_0= ruleexpression )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2386:3: lv_expressaoCases_6_0= ruleexpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpressaoCasesExpressionParserRuleCall_5_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleexpression_in_ruleswitch_statement4970);
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

            	    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleswitch_statement4982); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getSwitch_statementAccess().getColonKeyword_5_0_2());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2407:6: (otherlv_8= 'default' otherlv_9= ':' )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2407:6: (otherlv_8= 'default' otherlv_9= ':' )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2407:8: otherlv_8= 'default' otherlv_9= ':'
            	    {
            	    otherlv_8=(Token)match(input,53,FOLLOW_53_in_ruleswitch_statement5002); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getSwitch_statementAccess().getDefaultKeyword_5_1_0());
            	          
            	    }
            	    otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleswitch_statement5014); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getSwitch_statementAccess().getColonKeyword_5_1_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2416:6: ( (lv_blocoSwitch_10_0= rulestatement ) )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2416:6: ( (lv_blocoSwitch_10_0= rulestatement ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2417:1: (lv_blocoSwitch_10_0= rulestatement )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2417:1: (lv_blocoSwitch_10_0= rulestatement )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2418:3: lv_blocoSwitch_10_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getBlocoSwitchStatementParserRuleCall_5_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_ruleswitch_statement5042);
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

            otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleswitch_statement5056); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2446:1: entryRuleconstructor_declaration returns [EObject current=null] : iv_ruleconstructor_declaration= ruleconstructor_declaration EOF ;
    public final EObject entryRuleconstructor_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstructor_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2447:2: (iv_ruleconstructor_declaration= ruleconstructor_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2448:2: iv_ruleconstructor_declaration= ruleconstructor_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleconstructor_declaration_in_entryRuleconstructor_declaration5092);
            iv_ruleconstructor_declaration=ruleconstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstructor_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstructor_declaration5102); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2455:1: ruleconstructor_declaration returns [EObject current=null] : ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipo_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_nomeContrutor_3_0= RULE_IDENTIFIER ) ) otherlv_4= '(' ( (lv_parametrosContrutor_5_0= ruleparameter_list ) )? otherlv_6= ')' ( (lv_blocoConstrutor_7_0= rulestatement_block ) ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2458:28: ( ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipo_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_nomeContrutor_3_0= RULE_IDENTIFIER ) ) otherlv_4= '(' ( (lv_parametrosContrutor_5_0= ruleparameter_list ) )? otherlv_6= ')' ( (lv_blocoConstrutor_7_0= rulestatement_block ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2459:1: ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipo_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_nomeContrutor_3_0= RULE_IDENTIFIER ) ) otherlv_4= '(' ( (lv_parametrosContrutor_5_0= ruleparameter_list ) )? otherlv_6= ')' ( (lv_blocoConstrutor_7_0= rulestatement_block ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2459:1: ( ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipo_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_nomeContrutor_3_0= RULE_IDENTIFIER ) ) otherlv_4= '(' ( (lv_parametrosContrutor_5_0= ruleparameter_list ) )? otherlv_6= ')' ( (lv_blocoConstrutor_7_0= rulestatement_block ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2459:2: ( (lv_modificador_0_0= ruleMODIFIER ) )* ( ( (lv_tipo_1_0= ruletype ) ) | otherlv_2= 'void' )? ( (lv_nomeContrutor_3_0= RULE_IDENTIFIER ) ) otherlv_4= '(' ( (lv_parametrosContrutor_5_0= ruleparameter_list ) )? otherlv_6= ')' ( (lv_blocoConstrutor_7_0= rulestatement_block ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2459:2: ( (lv_modificador_0_0= ruleMODIFIER ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==35||LA49_0==54||(LA49_0>=104 && LA49_0<=111)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2460:1: (lv_modificador_0_0= ruleMODIFIER )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2460:1: (lv_modificador_0_0= ruleMODIFIER )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2461:3: lv_modificador_0_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getModificadorMODIFIERParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_ruleconstructor_declaration5148);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2477:3: ( ( (lv_tipo_1_0= ruletype ) ) | otherlv_2= 'void' )?
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

                    if ( (LA50_2==RULE_IDENTIFIER||LA50_2==33||LA50_2==59) ) {
                        alt50=1;
                    }
                    }
                    break;
                case 41:
                    {
                    alt50=2;
                    }
                    break;
            }

            switch (alt50) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2477:4: ( (lv_tipo_1_0= ruletype ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2477:4: ( (lv_tipo_1_0= ruletype ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2478:1: (lv_tipo_1_0= ruletype )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2478:1: (lv_tipo_1_0= ruletype )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2479:3: lv_tipo_1_0= ruletype
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getTipoTypeParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_in_ruleconstructor_declaration5171);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2496:7: otherlv_2= 'void'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleconstructor_declaration5189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConstructor_declarationAccess().getVoidKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2500:3: ( (lv_nomeContrutor_3_0= RULE_IDENTIFIER ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2501:1: (lv_nomeContrutor_3_0= RULE_IDENTIFIER )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2501:1: (lv_nomeContrutor_3_0= RULE_IDENTIFIER )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2502:3: lv_nomeContrutor_3_0= RULE_IDENTIFIER
            {
            lv_nomeContrutor_3_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstructor_declaration5208); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleconstructor_declaration5225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2522:1: ( (lv_parametrosContrutor_5_0= ruleparameter_list ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_IDENTIFIER||(LA51_0>=96 && LA51_0<=103)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2523:1: (lv_parametrosContrutor_5_0= ruleparameter_list )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2523:1: (lv_parametrosContrutor_5_0= ruleparameter_list )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2524:3: lv_parametrosContrutor_5_0= ruleparameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParametrosContrutorParameter_listParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleparameter_list_in_ruleconstructor_declaration5246);
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

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleconstructor_declaration5259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2544:1: ( (lv_blocoConstrutor_7_0= rulestatement_block ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2545:1: (lv_blocoConstrutor_7_0= rulestatement_block )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2545:1: (lv_blocoConstrutor_7_0= rulestatement_block )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2546:3: lv_blocoConstrutor_7_0= rulestatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getBlocoConstrutorStatement_blockParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_block_in_ruleconstructor_declaration5280);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2570:1: entryRulestatic_initializer returns [EObject current=null] : iv_rulestatic_initializer= rulestatic_initializer EOF ;
    public final EObject entryRulestatic_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatic_initializer = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2571:2: (iv_rulestatic_initializer= rulestatic_initializer EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2572:2: iv_rulestatic_initializer= rulestatic_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            }
            pushFollow(FOLLOW_rulestatic_initializer_in_entryRulestatic_initializer5316);
            iv_rulestatic_initializer=rulestatic_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatic_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatic_initializer5326); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2579:1: rulestatic_initializer returns [EObject current=null] : (otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) ) ) ;
    public final EObject rulestatic_initializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_blocoEstatico_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2582:28: ( (otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2583:1: (otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2583:1: (otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2583:3: otherlv_0= 'static' ( (lv_blocoEstatico_1_0= rulestatement_block ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_rulestatic_initializer5363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatic_initializerAccess().getStaticKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2587:1: ( (lv_blocoEstatico_1_0= rulestatement_block ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2588:1: (lv_blocoEstatico_1_0= rulestatement_block )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2588:1: (lv_blocoEstatico_1_0= rulestatement_block )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2589:3: lv_blocoEstatico_1_0= rulestatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatic_initializerAccess().getBlocoEstaticoStatement_blockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulestatement_block_in_rulestatic_initializer5384);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2613:1: entryRulecreating_expression returns [EObject current=null] : iv_rulecreating_expression= rulecreating_expression EOF ;
    public final EObject entryRulecreating_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecreating_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2614:2: (iv_rulecreating_expression= rulecreating_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2615:2: iv_rulecreating_expression= rulecreating_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreating_expressionRule()); 
            }
            pushFollow(FOLLOW_rulecreating_expression_in_entryRulecreating_expression5420);
            iv_rulecreating_expression=rulecreating_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecreating_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecreating_expression5430); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2622:1: rulecreating_expression returns [EObject current=null] : (otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenew ) )* ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2625:28: ( (otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenew ) )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2626:1: (otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenew ) )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2626:1: (otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenew ) )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2626:3: otherlv_0= 'new' ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) ) ( (lv_novo_10_0= rulenew ) )*
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_rulecreating_expression5467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreating_expressionAccess().getNewKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2630:1: ( ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) ) | ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* ) | (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' ) )
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
            case 31:
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2630:2: ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2630:2: ( ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2630:3: ( (lv_novoObjeto_1_0= rulename ) ) ( (lv_parametros_2_0= rulecreating_aux ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2630:3: ( (lv_novoObjeto_1_0= rulename ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2631:1: (lv_novoObjeto_1_0= rulename )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2631:1: (lv_novoObjeto_1_0= rulename )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2632:3: lv_novoObjeto_1_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getNovoObjetoNameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_rulecreating_expression5490);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2648:2: ( (lv_parametros_2_0= rulecreating_aux ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2649:1: (lv_parametros_2_0= rulecreating_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2649:1: (lv_parametros_2_0= rulecreating_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2650:3: lv_parametros_2_0= rulecreating_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getParametrosCreating_auxParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecreating_aux_in_rulecreating_expression5511);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2667:6: ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2667:6: ( ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )* )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2667:7: ( (lv_tipoObjeto_3_0= ruletype_specifier ) ) ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )? (otherlv_5= '[' otherlv_6= ']' )*
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2667:7: ( (lv_tipoObjeto_3_0= ruletype_specifier ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2668:1: (lv_tipoObjeto_3_0= ruletype_specifier )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2668:1: (lv_tipoObjeto_3_0= ruletype_specifier )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2669:3: lv_tipoObjeto_3_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getTipoObjetoType_specifierParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulecreating_expression5540);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2685:2: ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )?
                    int alt52=2;
                    alt52 = dfa52.predict(input);
                    switch (alt52) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2685:3: ( '[' )=> ( (lv_parametros_4_0= ruleaux ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2686:4: ( (lv_parametros_4_0= ruleaux ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2687:1: (lv_parametros_4_0= ruleaux )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2687:1: (lv_parametros_4_0= ruleaux )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2688:3: lv_parametros_4_0= ruleaux
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getParametrosAuxParserRuleCall_1_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleaux_in_rulecreating_expression5569);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2704:4: (otherlv_5= '[' otherlv_6= ']' )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==33) ) {
                            int LA53_2 = input.LA(2);

                            if ( (LA53_2==34) ) {
                                alt53=1;
                            }


                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2704:6: otherlv_5= '[' otherlv_6= ']'
                    	    {
                    	    otherlv_5=(Token)match(input,33,FOLLOW_33_in_rulecreating_expression5584); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getCreating_expressionAccess().getLeftSquareBracketKeyword_1_1_2_0());
                    	          
                    	    }
                    	    otherlv_6=(Token)match(input,34,FOLLOW_34_in_rulecreating_expression5596); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2713:6: (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2713:6: (otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2713:8: otherlv_7= '(' ( (lv_expressaoNew_8_0= ruleexpression ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_rulecreating_expression5618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCreating_expressionAccess().getLeftParenthesisKeyword_1_2_0());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2717:1: ( (lv_expressaoNew_8_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2718:1: (lv_expressaoNew_8_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2718:1: (lv_expressaoNew_8_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2719:3: lv_expressaoNew_8_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getExpressaoNewExpressionParserRuleCall_1_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulecreating_expression5639);
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

                    otherlv_9=(Token)match(input,32,FOLLOW_32_in_rulecreating_expression5651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getCreating_expressionAccess().getRightParenthesisKeyword_1_2_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2739:3: ( (lv_novo_10_0= rulenew ) )*
            loop55:
            do {
                int alt55=2;
                alt55 = dfa55.predict(input);
                switch (alt55) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2740:1: (lv_novo_10_0= rulenew )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2740:1: (lv_novo_10_0= rulenew )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2741:3: lv_novo_10_0= rulenew
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getNovoNewParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulenew_in_rulecreating_expression5674);
            	    lv_novo_10_0=rulenew();

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
            	              		"new");
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2765:1: entryRuleexp_aux returns [EObject current=null] : iv_ruleexp_aux= ruleexp_aux EOF ;
    public final EObject entryRuleexp_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexp_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2766:2: (iv_ruleexp_aux= ruleexp_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2767:2: iv_ruleexp_aux= ruleexp_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExp_auxRule()); 
            }
            pushFollow(FOLLOW_ruleexp_aux_in_entryRuleexp_aux5711);
            iv_ruleexp_aux=ruleexp_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexp_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexp_aux5721); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2774:1: ruleexp_aux returns [EObject current=null] : ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) ) ;
    public final EObject ruleexp_aux() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressao_0_0 = null;

        EObject this_type_2 = null;

        EObject lv_expressao_4_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2777:28: ( ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2778:1: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2778:1: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) )
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2778:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2778:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2778:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')'
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2778:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2778:4: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2791:1: (lv_expressao_0_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2792:3: lv_expressao_0_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExp_auxAccess().getExpressaoExpressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleexp_aux5877);
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

                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleexp_aux5889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExp_auxAccess().getRightParenthesisKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2813:6: (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2813:6: (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2814:2: this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExp_auxAccess().getTypeParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruletype_in_ruleexp_aux5922);
                    this_type_2=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_type_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleexp_aux5933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExp_auxAccess().getRightParenthesisKeyword_1_1());
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2829:1: ( (lv_expressao_4_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2830:1: (lv_expressao_4_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2830:1: (lv_expressao_4_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2831:3: lv_expressao_4_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExp_auxAccess().getExpressaoExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleexp_aux5954);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2855:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2856:2: (iv_ruleexpression= ruleexpression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2857:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression5991);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression6001); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2864:1: ruleexpression returns [EObject current=null] : ( ( ( (lv_tipoLogical_0_0= rulelogical_expression ) ) | ( (lv_tipoNumeric_1_0= rulenumeric_expression ) ) | ( (lv_tipoBit_2_0= rulebit_expression ) ) | ( (lv_new_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) ) ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_IDENTIFIER_8=null;
        Token otherlv_9=null;
        EObject lv_tipoLogical_0_0 = null;

        EObject lv_tipoNumeric_1_0 = null;

        EObject lv_tipoBit_2_0 = null;

        EObject lv_new_3_0 = null;

        EObject lv_literal_4_0 = null;

        EObject this_exp_aux_10 = null;

        EObject lv_expressoes_11_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2867:28: ( ( ( ( (lv_tipoLogical_0_0= rulelogical_expression ) ) | ( (lv_tipoNumeric_1_0= rulenumeric_expression ) ) | ( (lv_tipoBit_2_0= rulebit_expression ) ) | ( (lv_new_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2868:1: ( ( ( (lv_tipoLogical_0_0= rulelogical_expression ) ) | ( (lv_tipoNumeric_1_0= rulenumeric_expression ) ) | ( (lv_tipoBit_2_0= rulebit_expression ) ) | ( (lv_new_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2868:1: ( ( ( (lv_tipoLogical_0_0= rulelogical_expression ) ) | ( (lv_tipoNumeric_1_0= rulenumeric_expression ) ) | ( (lv_tipoBit_2_0= rulebit_expression ) ) | ( (lv_new_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2868:2: ( ( (lv_tipoLogical_0_0= rulelogical_expression ) ) | ( (lv_tipoNumeric_1_0= rulenumeric_expression ) ) | ( (lv_tipoBit_2_0= rulebit_expression ) ) | ( (lv_new_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) ) ( (lv_expressoes_11_0= ruleexpression_aux ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2868:2: ( ( (lv_tipoLogical_0_0= rulelogical_expression ) ) | ( (lv_tipoNumeric_1_0= rulenumeric_expression ) ) | ( (lv_tipoBit_2_0= rulebit_expression ) ) | ( (lv_new_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) )
            int alt57=10;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2868:3: ( (lv_tipoLogical_0_0= rulelogical_expression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2868:3: ( (lv_tipoLogical_0_0= rulelogical_expression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2869:1: (lv_tipoLogical_0_0= rulelogical_expression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2869:1: (lv_tipoLogical_0_0= rulelogical_expression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2870:3: lv_tipoLogical_0_0= rulelogical_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getTipoLogicalLogical_expressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulelogical_expression_in_ruleexpression6048);
                    lv_tipoLogical_0_0=rulelogical_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"tipoLogical",
                              		lv_tipoLogical_0_0, 
                              		"logical_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2887:6: ( (lv_tipoNumeric_1_0= rulenumeric_expression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2887:6: ( (lv_tipoNumeric_1_0= rulenumeric_expression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2888:1: (lv_tipoNumeric_1_0= rulenumeric_expression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2888:1: (lv_tipoNumeric_1_0= rulenumeric_expression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2889:3: lv_tipoNumeric_1_0= rulenumeric_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getTipoNumericNumeric_expressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulenumeric_expression_in_ruleexpression6075);
                    lv_tipoNumeric_1_0=rulenumeric_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"tipoNumeric",
                              		lv_tipoNumeric_1_0, 
                              		"numeric_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2906:6: ( (lv_tipoBit_2_0= rulebit_expression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2906:6: ( (lv_tipoBit_2_0= rulebit_expression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2907:1: (lv_tipoBit_2_0= rulebit_expression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2907:1: (lv_tipoBit_2_0= rulebit_expression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2908:3: lv_tipoBit_2_0= rulebit_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getTipoBitBit_expressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulebit_expression_in_ruleexpression6102);
                    lv_tipoBit_2_0=rulebit_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"tipoBit",
                              		lv_tipoBit_2_0, 
                              		"bit_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2925:6: ( (lv_new_3_0= rulecreating_expression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2925:6: ( (lv_new_3_0= rulecreating_expression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2926:1: (lv_new_3_0= rulecreating_expression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2926:1: (lv_new_3_0= rulecreating_expression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2927:3: lv_new_3_0= rulecreating_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getNewCreating_expressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecreating_expression_in_ruleexpression6129);
                    lv_new_3_0=rulecreating_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"new",
                              		lv_new_3_0, 
                              		"creating_expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2944:6: ( (lv_literal_4_0= ruleliteral_expression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2944:6: ( (lv_literal_4_0= ruleliteral_expression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2945:1: (lv_literal_4_0= ruleliteral_expression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2945:1: (lv_literal_4_0= ruleliteral_expression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2946:3: lv_literal_4_0= ruleliteral_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getLiteralLiteral_expressionParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleliteral_expression_in_ruleexpression6156);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2963:7: otherlv_5= 'null'
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_56_in_ruleexpression6174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getNullKeyword_0_5());
                          
                    }

                    }
                    break;
                case 7 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2968:7: otherlv_6= 'super'
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleexpression6192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getSuperKeyword_0_6());
                          
                    }

                    }
                    break;
                case 8 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2973:7: otherlv_7= 'this'
                    {
                    otherlv_7=(Token)match(input,58,FOLLOW_58_in_ruleexpression6210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getThisKeyword_0_7());
                          
                    }

                    }
                    break;
                case 9 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2978:6: this_IDENTIFIER_8= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_8=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleexpression6227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENTIFIER_8, grammarAccess.getExpressionAccess().getIDENTIFIERTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2983:6: (otherlv_9= '(' this_exp_aux_10= ruleexp_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2983:6: (otherlv_9= '(' this_exp_aux_10= ruleexp_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2983:8: otherlv_9= '(' this_exp_aux_10= ruleexp_aux
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleexpression6245); if (state.failed) return current;
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2999:3: ( (lv_expressoes_11_0= ruleexpression_aux ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3000:1: (lv_expressoes_11_0= ruleexpression_aux )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3000:1: (lv_expressoes_11_0= ruleexpression_aux )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3001:3: lv_expressoes_11_0= ruleexpression_aux
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3025:1: entryRuleexpression_aux returns [EObject current=null] : iv_ruleexpression_aux= ruleexpression_aux EOF ;
    public final EObject entryRuleexpression_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3026:2: (iv_ruleexpression_aux= ruleexpression_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3027:2: iv_ruleexpression_aux= ruleexpression_aux EOF
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3034:1: ruleexpression_aux returns [EObject current=null] : ( ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_43_0= ruleexpression_aux ) ) )? ;
    public final EObject ruleexpression_aux() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_opedador_12_1=null;
        Token lv_opedador_12_2=null;
        Token lv_opedador_14_0=null;
        Token lv_opedador_15_0=null;
        Token lv_opedador_16_0=null;
        Token lv_opedador_17_0=null;
        Token lv_opedador_18_0=null;
        Token lv_opedador_19_0=null;
        Token lv_opedador_20_0=null;
        Token lv_opedador_21_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token lv_opedador_39_1=null;
        Token lv_opedador_39_2=null;
        Token lv_opedador_39_3=null;
        Token lv_opedador_39_4=null;
        Token lv_opedador_39_5=null;
        Token lv_opedador_39_6=null;
        Token lv_operador_41_1=null;
        Token lv_operador_41_2=null;
        Token lv_operador_41_3=null;
        Token lv_operador_41_4=null;
        EObject this_arglist_1 = null;

        EObject this_aux_3 = null;

        EObject this_expression_5 = null;

        EObject this_expression_7 = null;

        EObject this_name_9 = null;

        EObject this_mais_aux_10 = null;

        EObject lv_exp_11_0 = null;

        EObject this_mais_aux_13 = null;

        EObject lv_exp_22_0 = null;

        EObject this_expression_34 = null;

        EObject this_expression_36 = null;

        EObject lv_expressao_38_0 = null;

        EObject lv_exp_40_0 = null;

        EObject lv_exp_42_0 = null;

        EObject lv_expressoes_43_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3037:28: ( ( ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_43_0= ruleexpression_aux ) ) )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:1: ( ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_43_0= ruleexpression_aux ) ) )?
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:1: ( ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_43_0= ruleexpression_aux ) ) )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:2: ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_43_0= ruleexpression_aux ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:2: ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) ) )
                    int alt66=5;
                    alt66 = dfa66.predict(input);
                    switch (alt66) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:3: ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:3: ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                            int alt59=5;
                            switch ( input.LA(1) ) {
                            case 31:
                                {
                                alt59=1;
                                }
                                break;
                            case 33:
                                {
                                alt59=2;
                                }
                                break;
                            case 59:
                                {
                                alt59=3;
                                }
                                break;
                            case 27:
                                {
                                alt59=4;
                                }
                                break;
                            case 60:
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:4: (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:4: (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:6: otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')'
                                    {
                                    otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleexpression_aux6378); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_0, grammarAccess.getExpression_auxAccess().getLeftParenthesisKeyword_0_0_0_0());
                                          
                                    }
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3042:1: (this_arglist_1= rulearglist )?
                                    int alt58=2;
                                    int LA58_0 = input.LA(1);

                                    if ( ((LA58_0>=RULE_IDENTIFIER && LA58_0<=RULE_STRING)||LA58_0==31||(LA58_0>=55 && LA58_0<=58)||(LA58_0>=61 && LA58_0<=63)||(LA58_0>=91 && LA58_0<=103)) ) {
                                        alt58=1;
                                    }
                                    switch (alt58) {
                                        case 1 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3043:2: this_arglist_1= rulearglist
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	  /* */ 
                                              	
                                            }
                                            if ( state.backtracking==0 ) {
                                               
                                                      newCompositeNode(grammarAccess.getExpression_auxAccess().getArglistParserRuleCall_0_0_0_1()); 
                                                  
                                            }
                                            pushFollow(FOLLOW_rulearglist_in_ruleexpression_aux6404);
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

                                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleexpression_aux6417); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_2, grammarAccess.getExpression_auxAccess().getRightParenthesisKeyword_0_0_0_2());
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3060:2: this_aux_3= ruleaux
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxParserRuleCall_0_0_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleaux_in_ruleexpression_aux6449);
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3072:6: (otherlv_4= '.' this_expression_5= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3072:6: (otherlv_4= '.' this_expression_5= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3072:8: otherlv_4= '.' this_expression_5= ruleexpression
                                    {
                                    otherlv_4=(Token)match(input,59,FOLLOW_59_in_ruleexpression_aux6467); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_4, grammarAccess.getExpression_auxAccess().getFullStopKeyword_0_0_2_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_0_2_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux6492);
                                    this_expression_5=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                              current = this_expression_5; 
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 4 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3089:6: (otherlv_6= ',' this_expression_7= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3089:6: (otherlv_6= ',' this_expression_7= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3089:8: otherlv_6= ',' this_expression_7= ruleexpression
                                    {
                                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleexpression_aux6511); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_6, grammarAccess.getExpression_auxAccess().getCommaKeyword_0_0_3_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_0_3_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux6536);
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3106:6: (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3106:6: (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3106:8: otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                                    {
                                    otherlv_8=(Token)match(input,60,FOLLOW_60_in_ruleexpression_aux6555); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_8, grammarAccess.getExpression_auxAccess().getInstanceofKeyword_0_0_4_0());
                                          
                                    }
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3110:1: ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3110:2: ( RULE_IDENTIFIER )=>this_name_9= rulename
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getNameParserRuleCall_0_0_4_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_rulename_in_ruleexpression_aux6586);
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
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:6: ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:6: ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:7: ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:7: ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:8: ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getExpression_auxAccess().getMais_auxParserRuleCall_0_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_rulemais_aux_in_ruleexpression_aux6635);
                            this_mais_aux_10=rulemais_aux();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_mais_aux_10; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }

                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3137:2: ( (lv_exp_11_0= ruleexpression ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3138:1: (lv_exp_11_0= ruleexpression )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3138:1: (lv_exp_11_0= ruleexpression )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3139:3: lv_exp_11_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux6656);
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
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3156:6: ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3156:6: ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3157:1: ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3157:1: ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3158:1: (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3158:1: (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' )
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==61) ) {
                                alt60=1;
                            }
                            else if ( (LA60_0==62) ) {
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3159:3: lv_opedador_12_1= '++'
                                    {
                                    lv_opedador_12_1=(Token)match(input,61,FOLLOW_61_in_ruleexpression_aux6683); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_opedador_12_1, grammarAccess.getExpression_auxAccess().getOpedadorPlusSignPlusSignKeyword_0_2_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "opedador", lv_opedador_12_1, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3171:8: lv_opedador_12_2= '--'
                                    {
                                    lv_opedador_12_2=(Token)match(input,62,FOLLOW_62_in_ruleexpression_aux6712); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_opedador_12_2, grammarAccess.getExpression_auxAccess().getOpedadorHyphenMinusHyphenMinusKeyword_0_2_0_1());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "opedador", lv_opedador_12_2, null);
                                      	    
                                    }

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:7: ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:7: ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) )
                            int alt61=9;
                            alt61 = dfa61.predict(input);
                            switch (alt61) {
                                case 1 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:8: ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:8: ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:9: ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getMais_auxParserRuleCall_0_3_0_0()); 
                                          
                                    }
                                    pushFollow(FOLLOW_rulemais_aux_in_ruleexpression_aux6776);
                                    this_mais_aux_13=rulemais_aux();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                              current = this_mais_aux_13; 
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3202:6: ( (lv_opedador_14_0= '-' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3202:6: ( (lv_opedador_14_0= '-' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3203:1: (lv_opedador_14_0= '-' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3203:1: (lv_opedador_14_0= '-' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3204:3: lv_opedador_14_0= '-'
                                    {
                                    lv_opedador_14_0=(Token)match(input,63,FOLLOW_63_in_ruleexpression_aux6800); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_opedador_14_0, grammarAccess.getExpression_auxAccess().getOpedadorHyphenMinusKeyword_0_3_0_1_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "opedador", lv_opedador_14_0, "-");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 3 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3218:6: ( (lv_opedador_15_0= '-=' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3218:6: ( (lv_opedador_15_0= '-=' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3219:1: (lv_opedador_15_0= '-=' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3219:1: (lv_opedador_15_0= '-=' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3220:3: lv_opedador_15_0= '-='
                                    {
                                    lv_opedador_15_0=(Token)match(input,64,FOLLOW_64_in_ruleexpression_aux6837); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_opedador_15_0, grammarAccess.getExpression_auxAccess().getOpedadorHyphenMinusEqualsSignKeyword_0_3_0_2_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "opedador", lv_opedador_15_0, "-=");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 4 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3234:6: ( (lv_opedador_16_0= '*' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3234:6: ( (lv_opedador_16_0= '*' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:1: (lv_opedador_16_0= '*' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:1: (lv_opedador_16_0= '*' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3236:3: lv_opedador_16_0= '*'
                                    {
                                    lv_opedador_16_0=(Token)match(input,65,FOLLOW_65_in_ruleexpression_aux6874); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_opedador_16_0, grammarAccess.getExpression_auxAccess().getOpedadorAsteriskKeyword_0_3_0_3_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "opedador", lv_opedador_16_0, "*");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 5 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3250:6: ( (lv_opedador_17_0= '*=' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3250:6: ( (lv_opedador_17_0= '*=' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3251:1: (lv_opedador_17_0= '*=' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3251:1: (lv_opedador_17_0= '*=' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3252:3: lv_opedador_17_0= '*='
                                    {
                                    lv_opedador_17_0=(Token)match(input,66,FOLLOW_66_in_ruleexpression_aux6911); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_opedador_17_0, grammarAccess.getExpression_auxAccess().getOpedadorAsteriskEqualsSignKeyword_0_3_0_4_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "opedador", lv_opedador_17_0, "*=");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 6 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3266:6: ( (lv_opedador_18_0= '/' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3266:6: ( (lv_opedador_18_0= '/' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3267:1: (lv_opedador_18_0= '/' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3267:1: (lv_opedador_18_0= '/' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3268:3: lv_opedador_18_0= '/'
                                    {
                                    lv_opedador_18_0=(Token)match(input,67,FOLLOW_67_in_ruleexpression_aux6948); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_opedador_18_0, grammarAccess.getExpression_auxAccess().getOpedadorSolidusKeyword_0_3_0_5_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "opedador", lv_opedador_18_0, "/");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 7 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3282:6: ( (lv_opedador_19_0= '/=' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3282:6: ( (lv_opedador_19_0= '/=' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3283:1: (lv_opedador_19_0= '/=' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3283:1: (lv_opedador_19_0= '/=' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3284:3: lv_opedador_19_0= '/='
                                    {
                                    lv_opedador_19_0=(Token)match(input,68,FOLLOW_68_in_ruleexpression_aux6985); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_opedador_19_0, grammarAccess.getExpression_auxAccess().getOpedadorSolidusEqualsSignKeyword_0_3_0_6_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "opedador", lv_opedador_19_0, "/=");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 8 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3298:6: ( (lv_opedador_20_0= '%' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3298:6: ( (lv_opedador_20_0= '%' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3299:1: (lv_opedador_20_0= '%' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3299:1: (lv_opedador_20_0= '%' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3300:3: lv_opedador_20_0= '%'
                                    {
                                    lv_opedador_20_0=(Token)match(input,69,FOLLOW_69_in_ruleexpression_aux7022); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_opedador_20_0, grammarAccess.getExpression_auxAccess().getOpedadorPercentSignKeyword_0_3_0_7_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "opedador", lv_opedador_20_0, "%");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 9 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3314:6: ( (lv_opedador_21_0= '%=' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3314:6: ( (lv_opedador_21_0= '%=' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3315:1: (lv_opedador_21_0= '%=' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3315:1: (lv_opedador_21_0= '%=' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3316:3: lv_opedador_21_0= '%='
                                    {
                                    lv_opedador_21_0=(Token)match(input,70,FOLLOW_70_in_ruleexpression_aux7059); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_opedador_21_0, grammarAccess.getExpression_auxAccess().getOpedadorPercentSignEqualsSignKeyword_0_3_0_8_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(current, "opedador", lv_opedador_21_0, "%=");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3329:3: ( (lv_exp_22_0= ruleexpression ) )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3330:1: (lv_exp_22_0= ruleexpression )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3330:1: (lv_exp_22_0= ruleexpression )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3331:3: lv_exp_22_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7094);
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
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:6: ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:6: ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) )
                            int alt65=4;
                            switch ( input.LA(1) ) {
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:7: ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:7: ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:8: (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:8: (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' )
                                    int alt62=10;
                                    alt62 = dfa62.predict(input);
                                    switch (alt62) {
                                        case 1 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:10: otherlv_23= 'ampersand'
                                            {
                                            otherlv_23=(Token)match(input,71,FOLLOW_71_in_ruleexpression_aux7116); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_23, grammarAccess.getExpression_auxAccess().getAmpersandKeyword_0_4_0_0_0());
                                                  
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3353:7: otherlv_24= 'ampersand='
                                            {
                                            otherlv_24=(Token)match(input,72,FOLLOW_72_in_ruleexpression_aux7134); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_24, grammarAccess.getExpression_auxAccess().getAmpersandKeyword_0_4_0_0_1());
                                                  
                                            }

                                            }
                                            break;
                                        case 3 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3358:7: otherlv_25= '|'
                                            {
                                            otherlv_25=(Token)match(input,73,FOLLOW_73_in_ruleexpression_aux7152); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_25, grammarAccess.getExpression_auxAccess().getVerticalLineKeyword_0_4_0_0_2());
                                                  
                                            }

                                            }
                                            break;
                                        case 4 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3363:7: otherlv_26= '|='
                                            {
                                            otherlv_26=(Token)match(input,74,FOLLOW_74_in_ruleexpression_aux7170); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_26, grammarAccess.getExpression_auxAccess().getVerticalLineEqualsSignKeyword_0_4_0_0_3());
                                                  
                                            }

                                            }
                                            break;
                                        case 5 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3368:7: otherlv_27= '^'
                                            {
                                            otherlv_27=(Token)match(input,75,FOLLOW_75_in_ruleexpression_aux7188); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_27, grammarAccess.getExpression_auxAccess().getCircumflexAccentKeyword_0_4_0_0_4());
                                                  
                                            }

                                            }
                                            break;
                                        case 6 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3373:7: otherlv_28= '^='
                                            {
                                            otherlv_28=(Token)match(input,76,FOLLOW_76_in_ruleexpression_aux7206); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_28, grammarAccess.getExpression_auxAccess().getCircumflexAccentEqualsSignKeyword_0_4_0_0_5());
                                                  
                                            }

                                            }
                                            break;
                                        case 7 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3378:6: (otherlv_29= 'ampersand' otherlv_30= 'ampersand' )
                                            {
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3378:6: (otherlv_29= 'ampersand' otherlv_30= 'ampersand' )
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3378:8: otherlv_29= 'ampersand' otherlv_30= 'ampersand'
                                            {
                                            otherlv_29=(Token)match(input,71,FOLLOW_71_in_ruleexpression_aux7225); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_29, grammarAccess.getExpression_auxAccess().getAmpersandKeyword_0_4_0_0_6_0());
                                                  
                                            }
                                            otherlv_30=(Token)match(input,71,FOLLOW_71_in_ruleexpression_aux7237); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_30, grammarAccess.getExpression_auxAccess().getAmpersandKeyword_0_4_0_0_6_1());
                                                  
                                            }

                                            }


                                            }
                                            break;
                                        case 8 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3387:7: otherlv_31= '||='
                                            {
                                            otherlv_31=(Token)match(input,77,FOLLOW_77_in_ruleexpression_aux7256); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_31, grammarAccess.getExpression_auxAccess().getVerticalLineVerticalLineEqualsSignKeyword_0_4_0_0_7());
                                                  
                                            }

                                            }
                                            break;
                                        case 9 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3392:6: ( ( '%' )=>otherlv_32= '%' )
                                            {
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3392:6: ( ( '%' )=>otherlv_32= '%' )
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3392:7: ( '%' )=>otherlv_32= '%'
                                            {
                                            otherlv_32=(Token)match(input,69,FOLLOW_69_in_ruleexpression_aux7282); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_32, grammarAccess.getExpression_auxAccess().getPercentSignKeyword_0_4_0_0_8());
                                                  
                                            }

                                            }


                                            }
                                            break;
                                        case 10 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3398:7: otherlv_33= '%='
                                            {
                                            otherlv_33=(Token)match(input,70,FOLLOW_70_in_ruleexpression_aux7301); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_33, grammarAccess.getExpression_auxAccess().getPercentSignEqualsSignKeyword_0_4_0_0_9());
                                                  
                                            }

                                            }
                                            break;

                                    }

                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_4_0_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7327);
                                    this_expression_34=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                              current = this_expression_34; 
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3415:6: (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3415:6: (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3415:8: otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) )
                                    {
                                    otherlv_35=(Token)match(input,78,FOLLOW_78_in_ruleexpression_aux7346); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_35, grammarAccess.getExpression_auxAccess().getQuestionMarkKeyword_0_4_1_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_4_1_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7371);
                                    this_expression_36=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                              current = this_expression_36; 
                                              afterParserOrEnumRuleCall();
                                          
                                    }
                                    otherlv_37=(Token)match(input,38,FOLLOW_38_in_ruleexpression_aux7382); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_37, grammarAccess.getExpression_auxAccess().getColonKeyword_0_4_1_2());
                                          
                                    }
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3435:1: ( (lv_expressao_38_0= ruleexpression ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3436:1: (lv_expressao_38_0= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3436:1: (lv_expressao_38_0= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3437:3: lv_expressao_38_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressaoExpressionParserRuleCall_0_4_1_3_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7403);
                                    lv_expressao_38_0=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"expressao",
                                              		lv_expressao_38_0, 
                                              		"expression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }


                                    }
                                    break;
                                case 3 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3454:6: ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3454:6: ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3454:7: ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3454:7: ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3455:1: ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3455:1: ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3456:1: (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3456:1: (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' )
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3457:3: lv_opedador_39_1= '>'
                                            {
                                            lv_opedador_39_1=(Token)match(input,79,FOLLOW_79_in_ruleexpression_aux7431); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_opedador_39_1, grammarAccess.getExpression_auxAccess().getOpedadorGreaterThanSignKeyword_0_4_2_0_0_0());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "opedador", lv_opedador_39_1, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3469:8: lv_opedador_39_2= '<'
                                            {
                                            lv_opedador_39_2=(Token)match(input,80,FOLLOW_80_in_ruleexpression_aux7460); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_opedador_39_2, grammarAccess.getExpression_auxAccess().getOpedadorLessThanSignKeyword_0_4_2_0_0_1());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "opedador", lv_opedador_39_2, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 3 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3481:8: lv_opedador_39_3= '>='
                                            {
                                            lv_opedador_39_3=(Token)match(input,81,FOLLOW_81_in_ruleexpression_aux7489); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_opedador_39_3, grammarAccess.getExpression_auxAccess().getOpedadorGreaterThanSignEqualsSignKeyword_0_4_2_0_0_2());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "opedador", lv_opedador_39_3, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 4 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3493:8: lv_opedador_39_4= '<='
                                            {
                                            lv_opedador_39_4=(Token)match(input,82,FOLLOW_82_in_ruleexpression_aux7518); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_opedador_39_4, grammarAccess.getExpression_auxAccess().getOpedadorLessThanSignEqualsSignKeyword_0_4_2_0_0_3());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "opedador", lv_opedador_39_4, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 5 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3505:8: lv_opedador_39_5= '=='
                                            {
                                            lv_opedador_39_5=(Token)match(input,83,FOLLOW_83_in_ruleexpression_aux7547); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_opedador_39_5, grammarAccess.getExpression_auxAccess().getOpedadorEqualsSignEqualsSignKeyword_0_4_2_0_0_4());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "opedador", lv_opedador_39_5, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 6 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3517:8: lv_opedador_39_6= '!='
                                            {
                                            lv_opedador_39_6=(Token)match(input,84,FOLLOW_84_in_ruleexpression_aux7576); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_opedador_39_6, grammarAccess.getExpression_auxAccess().getOpedadorExclamationMarkEqualsSignKeyword_0_4_2_0_0_5());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "opedador", lv_opedador_39_6, null);
                                              	    
                                            }

                                            }
                                            break;

                                    }


                                    }


                                    }

                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3532:2: ( (lv_exp_40_0= ruleexpression ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3533:1: (lv_exp_40_0= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3533:1: (lv_exp_40_0= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3534:3: lv_exp_40_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7613);
                                    lv_exp_40_0=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"exp",
                                              		lv_exp_40_0, 
                                              		"expression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }


                                    }
                                    break;
                                case 4 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3551:6: ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3551:6: ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3551:7: ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3551:7: ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3552:1: ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3552:1: ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3553:1: (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3553:1: (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' )
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3554:3: lv_operador_41_1= '>>='
                                            {
                                            lv_operador_41_1=(Token)match(input,85,FOLLOW_85_in_ruleexpression_aux7641); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_41_1, grammarAccess.getExpression_auxAccess().getOperadorGreaterThanSignGreaterThanSignEqualsSignKeyword_0_4_3_0_0_0());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_41_1, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3566:8: lv_operador_41_2= '<<'
                                            {
                                            lv_operador_41_2=(Token)match(input,86,FOLLOW_86_in_ruleexpression_aux7670); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_41_2, grammarAccess.getExpression_auxAccess().getOperadorLessThanSignLessThanSignKeyword_0_4_3_0_0_1());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_41_2, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 3 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3578:8: lv_operador_41_3= '>>'
                                            {
                                            lv_operador_41_3=(Token)match(input,87,FOLLOW_87_in_ruleexpression_aux7699); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_41_3, grammarAccess.getExpression_auxAccess().getOperadorGreaterThanSignGreaterThanSignKeyword_0_4_3_0_0_2());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_41_3, null);
                                              	    
                                            }

                                            }
                                            break;
                                        case 4 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3590:8: lv_operador_41_4= '>>>'
                                            {
                                            lv_operador_41_4=(Token)match(input,88,FOLLOW_88_in_ruleexpression_aux7728); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      newLeafNode(lv_operador_41_4, grammarAccess.getExpression_auxAccess().getOperadorGreaterThanSignGreaterThanSignGreaterThanSignKeyword_0_4_3_0_0_3());
                                                  
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                              	        }
                                                     		setWithLastConsumed(current, "operador", lv_operador_41_4, null);
                                              	    
                                            }

                                            }
                                            break;

                                    }


                                    }


                                    }

                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3605:2: ( (lv_exp_42_0= ruleexpression ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3606:1: (lv_exp_42_0= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3606:1: (lv_exp_42_0= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3607:3: lv_exp_42_0= ruleexpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_3_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7765);
                                    lv_exp_42_0=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"exp",
                                              		lv_exp_42_0, 
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3623:5: ( (lv_expressoes_43_0= ruleexpression_aux ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3624:1: (lv_expressoes_43_0= ruleexpression_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3624:1: (lv_expressoes_43_0= ruleexpression_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3625:3: lv_expressoes_43_0= ruleexpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressoesExpression_auxParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression_aux7789);
                    lv_expressoes_43_0=ruleexpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expressoes",
                              		lv_expressoes_43_0, 
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3649:1: entryRulemais_aux returns [EObject current=null] : iv_rulemais_aux= rulemais_aux EOF ;
    public final EObject entryRulemais_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemais_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3650:2: (iv_rulemais_aux= rulemais_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3651:2: iv_rulemais_aux= rulemais_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMais_auxRule()); 
            }
            pushFollow(FOLLOW_rulemais_aux_in_entryRulemais_aux7826);
            iv_rulemais_aux=rulemais_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemais_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemais_aux7836); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3658:1: rulemais_aux returns [EObject current=null] : ( ( (lv_opedador_0_0= '+' ) ) | ( (lv_opedador_1_0= '+=' ) ) ) ;
    public final EObject rulemais_aux() throws RecognitionException {
        EObject current = null;

        Token lv_opedador_0_0=null;
        Token lv_opedador_1_0=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3661:28: ( ( ( (lv_opedador_0_0= '+' ) ) | ( (lv_opedador_1_0= '+=' ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3662:1: ( ( (lv_opedador_0_0= '+' ) ) | ( (lv_opedador_1_0= '+=' ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3662:1: ( ( (lv_opedador_0_0= '+' ) ) | ( (lv_opedador_1_0= '+=' ) ) )
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3662:2: ( (lv_opedador_0_0= '+' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3662:2: ( (lv_opedador_0_0= '+' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3663:1: (lv_opedador_0_0= '+' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3663:1: (lv_opedador_0_0= '+' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3664:3: lv_opedador_0_0= '+'
                    {
                    lv_opedador_0_0=(Token)match(input,89,FOLLOW_89_in_rulemais_aux7879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_opedador_0_0, grammarAccess.getMais_auxAccess().getOpedadorPlusSignKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMais_auxRule());
                      	        }
                             		setWithLastConsumed(current, "opedador", lv_opedador_0_0, "+");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3678:6: ( (lv_opedador_1_0= '+=' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3678:6: ( (lv_opedador_1_0= '+=' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3679:1: (lv_opedador_1_0= '+=' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3679:1: (lv_opedador_1_0= '+=' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3680:3: lv_opedador_1_0= '+='
                    {
                    lv_opedador_1_0=(Token)match(input,90,FOLLOW_90_in_rulemais_aux7916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_opedador_1_0, grammarAccess.getMais_auxAccess().getOpedadorPlusSignEqualsSignKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMais_auxRule());
                      	        }
                             		setWithLastConsumed(current, "opedador", lv_opedador_1_0, "+=");
                      	    
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


    // $ANTLR start "entryRulenew"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3701:1: entryRulenew returns [EObject current=null] : iv_rulenew= rulenew EOF ;
    public final EObject entryRulenew() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenew = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3702:2: (iv_rulenew= rulenew EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3703:2: iv_rulenew= rulenew EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewRule()); 
            }
            pushFollow(FOLLOW_rulenew_in_entryRulenew7965);
            iv_rulenew=rulenew();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenew; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenew7975); if (state.failed) return current;

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
    // $ANTLR end "entryRulenew"


    // $ANTLR start "rulenew"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3710:1: rulenew returns [EObject current=null] : (otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}' ) ;
    public final EObject rulenew() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_constructor_declaration_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3713:28: ( (otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3714:1: (otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3714:1: (otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3714:3: otherlv_0= '{' this_constructor_declaration_1= ruleconstructor_declaration otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulenew8012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNewAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNewAccess().getConstructor_declarationParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleconstructor_declaration_in_rulenew8037);
            this_constructor_declaration_1=ruleconstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_constructor_declaration_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulenew8048); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNewAccess().getRightCurlyBracketKeyword_2());
                  
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
    // $ANTLR end "rulenew"


    // $ANTLR start "entryRulecreating_aux"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3742:1: entryRulecreating_aux returns [EObject current=null] : iv_rulecreating_aux= rulecreating_aux EOF ;
    public final EObject entryRulecreating_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecreating_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3743:2: (iv_rulecreating_aux= rulecreating_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3744:2: iv_rulecreating_aux= rulecreating_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreating_auxRule()); 
            }
            pushFollow(FOLLOW_rulecreating_aux_in_entryRulecreating_aux8084);
            iv_rulecreating_aux=rulecreating_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecreating_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecreating_aux8094); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3751:1: rulecreating_aux returns [EObject current=null] : ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3754:28: ( ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3755:1: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3755:1: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) )
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3755:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3755:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3755:3: ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')'
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3755:3: ( ( '(' )=>otherlv_0= '(' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3755:4: ( '(' )=>otherlv_0= '('
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_31_in_rulecreating_aux8140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCreating_auxAccess().getLeftParenthesisKeyword_0_0());
                          
                    }

                    }

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3760:2: ( (lv_argumentos_1_0= rulearglist ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( ((LA69_0>=RULE_IDENTIFIER && LA69_0<=RULE_STRING)||LA69_0==31||(LA69_0>=55 && LA69_0<=58)||(LA69_0>=61 && LA69_0<=63)||(LA69_0>=91 && LA69_0<=103)) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3761:1: (lv_argumentos_1_0= rulearglist )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3761:1: (lv_argumentos_1_0= rulearglist )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3762:3: lv_argumentos_1_0= rulearglist
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCreating_auxAccess().getArgumentosArglistParserRuleCall_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulearglist_in_rulecreating_aux8162);
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

                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_rulecreating_aux8175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCreating_auxAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3783:6: ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3783:6: ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3783:7: ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )*
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3783:7: ( ( '[' )=>this_aux_3= ruleaux )?
                    int alt70=2;
                    alt70 = dfa70.predict(input);
                    switch (alt70) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3783:8: ( '[' )=>this_aux_3= ruleaux
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCreating_auxAccess().getAuxParserRuleCall_1_0_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleaux_in_rulecreating_aux8216);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3796:3: (otherlv_4= '[' otherlv_5= ']' )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==33) ) {
                            int LA71_2 = input.LA(2);

                            if ( (LA71_2==34) ) {
                                alt71=1;
                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3796:5: otherlv_4= '[' otherlv_5= ']'
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_33_in_rulecreating_aux8230); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getCreating_auxAccess().getLeftSquareBracketKeyword_1_1_0());
                    	          
                    	    }
                    	    otherlv_5=(Token)match(input,34,FOLLOW_34_in_rulecreating_aux8242); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3812:1: entryRuleaux returns [EObject current=null] : iv_ruleaux= ruleaux EOF ;
    public final EObject entryRuleaux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3813:2: (iv_ruleaux= ruleaux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3814:2: iv_ruleaux= ruleaux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAuxRule()); 
            }
            pushFollow(FOLLOW_ruleaux_in_entryRuleaux8281);
            iv_ruleaux=ruleaux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleaux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleaux8291); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3821:1: ruleaux returns [EObject current=null] : (otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']' ) ;
    public final EObject ruleaux() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_espressao_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3824:28: ( (otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3825:1: (otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3825:1: (otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3825:3: otherlv_0= '[' ( (lv_espressao_1_0= ruleexpression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleaux8328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAuxAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3829:1: ( (lv_espressao_1_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3830:1: (lv_espressao_1_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3830:1: (lv_espressao_1_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3831:3: lv_espressao_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAuxAccess().getEspressaoExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleaux8349);
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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleaux8361); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3859:1: entryRuleliteral_expression returns [EObject current=null] : iv_ruleliteral_expression= ruleliteral_expression EOF ;
    public final EObject entryRuleliteral_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleliteral_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3860:2: (iv_ruleliteral_expression= ruleliteral_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3861:2: iv_ruleliteral_expression= ruleliteral_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteral_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleliteral_expression_in_entryRuleliteral_expression8397);
            iv_ruleliteral_expression=ruleliteral_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleliteral_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleliteral_expression8407); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3868:1: ruleliteral_expression returns [EObject current=null] : ( ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) ) | ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) ) | ( (lv_float_2_0= RULE_FLOAT_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleliteral_expression() throws RecognitionException {
        EObject current = null;

        Token lv_decimal_0_0=null;
        Token lv_inteiro_1_0=null;
        Token lv_float_2_0=null;
        Token lv_string_3_0=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3871:28: ( ( ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) ) | ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) ) | ( (lv_float_2_0= RULE_FLOAT_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3872:1: ( ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) ) | ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) ) | ( (lv_float_2_0= RULE_FLOAT_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3872:1: ( ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) ) | ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) ) | ( (lv_float_2_0= RULE_FLOAT_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) )
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3872:2: ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3872:2: ( ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3872:3: ( RULE_DECIMAL_DIGITS )=> (lv_decimal_0_0= RULE_DECIMAL_DIGITS )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3873:1: (lv_decimal_0_0= RULE_DECIMAL_DIGITS )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3874:3: lv_decimal_0_0= RULE_DECIMAL_DIGITS
                    {
                    lv_decimal_0_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleliteral_expression8454); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3891:6: ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3891:6: ( (lv_inteiro_1_0= RULE_INTEGER_LITERAL ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3892:1: (lv_inteiro_1_0= RULE_INTEGER_LITERAL )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3892:1: (lv_inteiro_1_0= RULE_INTEGER_LITERAL )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3893:3: lv_inteiro_1_0= RULE_INTEGER_LITERAL
                    {
                    lv_inteiro_1_0=(Token)match(input,RULE_INTEGER_LITERAL,FOLLOW_RULE_INTEGER_LITERAL_in_ruleliteral_expression8482); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3910:6: ( (lv_float_2_0= RULE_FLOAT_LITERAL ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3910:6: ( (lv_float_2_0= RULE_FLOAT_LITERAL ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3911:1: (lv_float_2_0= RULE_FLOAT_LITERAL )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3911:1: (lv_float_2_0= RULE_FLOAT_LITERAL )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3912:3: lv_float_2_0= RULE_FLOAT_LITERAL
                    {
                    lv_float_2_0=(Token)match(input,RULE_FLOAT_LITERAL,FOLLOW_RULE_FLOAT_LITERAL_in_ruleliteral_expression8510); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3929:6: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3929:6: ( (lv_string_3_0= RULE_STRING ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3930:1: (lv_string_3_0= RULE_STRING )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3930:1: (lv_string_3_0= RULE_STRING )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3931:3: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleliteral_expression8538); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3955:1: entryRulelogical_expression returns [EObject current=null] : iv_rulelogical_expression= rulelogical_expression EOF ;
    public final EObject entryRulelogical_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelogical_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3956:2: (iv_rulelogical_expression= rulelogical_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3957:2: iv_rulelogical_expression= rulelogical_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_expressionRule()); 
            }
            pushFollow(FOLLOW_rulelogical_expression_in_entryRulelogical_expression8579);
            iv_rulelogical_expression=rulelogical_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelogical_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelogical_expression8589); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3964:1: rulelogical_expression returns [EObject current=null] : ( ( ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) | ( (lv_operador_2_0= 'true' ) ) | ( (lv_operador_3_0= 'false' ) ) ) ;
    public final EObject rulelogical_expression() throws RecognitionException {
        EObject current = null;

        Token lv_operador_0_0=null;
        Token lv_operador_2_0=null;
        Token lv_operador_3_0=null;
        EObject lv_expressao_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3967:28: ( ( ( ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) | ( (lv_operador_2_0= 'true' ) ) | ( (lv_operador_3_0= 'false' ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3968:1: ( ( ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) | ( (lv_operador_2_0= 'true' ) ) | ( (lv_operador_3_0= 'false' ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3968:1: ( ( ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) | ( (lv_operador_2_0= 'true' ) ) | ( (lv_operador_3_0= 'false' ) ) )
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3968:2: ( ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3968:2: ( ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3968:3: ( (lv_operador_0_0= '!' ) ) ( (lv_expressao_1_0= ruleexpression ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3968:3: ( (lv_operador_0_0= '!' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3969:1: (lv_operador_0_0= '!' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3969:1: (lv_operador_0_0= '!' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3970:3: lv_operador_0_0= '!'
                    {
                    lv_operador_0_0=(Token)match(input,91,FOLLOW_91_in_rulelogical_expression8633); if (state.failed) return current;
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3983:2: ( (lv_expressao_1_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3984:1: (lv_expressao_1_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3984:1: (lv_expressao_1_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3985:3: lv_expressao_1_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogical_expressionAccess().getExpressaoExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulelogical_expression8667);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4002:6: ( (lv_operador_2_0= 'true' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4002:6: ( (lv_operador_2_0= 'true' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4003:1: (lv_operador_2_0= 'true' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4003:1: (lv_operador_2_0= 'true' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4004:3: lv_operador_2_0= 'true'
                    {
                    lv_operador_2_0=(Token)match(input,92,FOLLOW_92_in_rulelogical_expression8692); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4018:6: ( (lv_operador_3_0= 'false' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4018:6: ( (lv_operador_3_0= 'false' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4019:1: (lv_operador_3_0= 'false' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4019:1: (lv_operador_3_0= 'false' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4020:3: lv_operador_3_0= 'false'
                    {
                    lv_operador_3_0=(Token)match(input,93,FOLLOW_93_in_rulelogical_expression8729); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4041:1: entryRulebit_expression returns [EObject current=null] : iv_rulebit_expression= rulebit_expression EOF ;
    public final EObject entryRulebit_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebit_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4042:2: (iv_rulebit_expression= rulebit_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4043:2: iv_rulebit_expression= rulebit_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBit_expressionRule()); 
            }
            pushFollow(FOLLOW_rulebit_expression_in_entryRulebit_expression8778);
            iv_rulebit_expression=rulebit_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebit_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulebit_expression8788); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4050:1: rulebit_expression returns [EObject current=null] : ( ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) ;
    public final EObject rulebit_expression() throws RecognitionException {
        EObject current = null;

        Token lv_operador_0_0=null;
        EObject lv_expressao_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4053:28: ( ( ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4054:1: ( ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4054:1: ( ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4054:2: ( (lv_operador_0_0= '~' ) ) ( (lv_expressao_1_0= ruleexpression ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4054:2: ( (lv_operador_0_0= '~' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4055:1: (lv_operador_0_0= '~' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4055:1: (lv_operador_0_0= '~' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4056:3: lv_operador_0_0= '~'
            {
            lv_operador_0_0=(Token)match(input,94,FOLLOW_94_in_rulebit_expression8831); if (state.failed) return current;
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4069:2: ( (lv_expressao_1_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4070:1: (lv_expressao_1_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4070:1: (lv_expressao_1_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4071:3: lv_expressao_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBit_expressionAccess().getExpressaoExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulebit_expression8865);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4095:1: entryRulenumeric_expression returns [EObject current=null] : iv_rulenumeric_expression= rulenumeric_expression EOF ;
    public final EObject entryRulenumeric_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumeric_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4096:2: (iv_rulenumeric_expression= rulenumeric_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4097:2: iv_rulenumeric_expression= rulenumeric_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_expressionRule()); 
            }
            pushFollow(FOLLOW_rulenumeric_expression_in_entryRulenumeric_expression8901);
            iv_rulenumeric_expression=rulenumeric_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenumeric_expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenumeric_expression8911); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4104:1: rulenumeric_expression returns [EObject current=null] : ( ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) ;
    public final EObject rulenumeric_expression() throws RecognitionException {
        EObject current = null;

        Token lv_operador_0_1=null;
        Token lv_operador_0_2=null;
        Token lv_operador_0_3=null;
        EObject lv_expressao_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4107:28: ( ( ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4108:1: ( ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4108:1: ( ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4108:2: ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) ) ( (lv_expressao_1_0= ruleexpression ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4108:2: ( ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4109:1: ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4109:1: ( (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4110:1: (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4110:1: (lv_operador_0_1= '-' | lv_operador_0_2= '++' | lv_operador_0_3= '--' )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt75=1;
                }
                break;
            case 61:
                {
                alt75=2;
                }
                break;
            case 62:
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4111:3: lv_operador_0_1= '-'
                    {
                    lv_operador_0_1=(Token)match(input,63,FOLLOW_63_in_rulenumeric_expression8956); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4123:8: lv_operador_0_2= '++'
                    {
                    lv_operador_0_2=(Token)match(input,61,FOLLOW_61_in_rulenumeric_expression8985); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4135:8: lv_operador_0_3= '--'
                    {
                    lv_operador_0_3=(Token)match(input,62,FOLLOW_62_in_rulenumeric_expression9014); if (state.failed) return current;
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4150:2: ( (lv_expressao_1_0= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4151:1: (lv_expressao_1_0= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4151:1: (lv_expressao_1_0= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4152:3: lv_expressao_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumeric_expressionAccess().getExpressaoExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleexpression_in_rulenumeric_expression9051);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4176:1: entryRulearglist returns [EObject current=null] : iv_rulearglist= rulearglist EOF ;
    public final EObject entryRulearglist() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearglist = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4177:2: (iv_rulearglist= rulearglist EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4178:2: iv_rulearglist= rulearglist EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArglistRule()); 
            }
            pushFollow(FOLLOW_rulearglist_in_entryRulearglist9087);
            iv_rulearglist=rulearglist();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearglist; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulearglist9097); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4185:1: rulearglist returns [EObject current=null] : ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4188:28: ( ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4189:1: ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4189:1: ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) )
            int alt78=3;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4189:2: ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4189:2: ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4189:3: ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )*
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4189:3: ( (lv_expressoesArgumentos_0_0= ruleexpression ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4190:1: (lv_expressoesArgumentos_0_0= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4190:1: (lv_expressoesArgumentos_0_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4191:3: lv_expressoesArgumentos_0_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArglistAccess().getExpressoesArgumentosExpressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulearglist9144);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4207:2: (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==27) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4207:4: otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) )
                    	    {
                    	    otherlv_1=(Token)match(input,27,FOLLOW_27_in_rulearglist9157); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_1, grammarAccess.getArglistAccess().getCommaKeyword_0_1_0());
                    	          
                    	    }
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4211:1: ( (lv_expressoesArgumentos_2_0= ruleexpression ) )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4212:1: (lv_expressoesArgumentos_2_0= ruleexpression )
                    	    {
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4212:1: (lv_expressoesArgumentos_2_0= ruleexpression )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4213:3: lv_expressoesArgumentos_2_0= ruleexpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArglistAccess().getExpressoesArgumentosExpressionParserRuleCall_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleexpression_in_rulearglist9178);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4230:6: (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4230:6: (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4230:8: otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"'
                    {
                    otherlv_3=(Token)match(input,95,FOLLOW_95_in_rulearglist9200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArglistAccess().getQuotationMarkKeyword_1_0());
                          
                    }
                    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulearglist9211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_4, grammarAccess.getArglistAccess().getSTRINGTerminalRuleCall_1_1()); 
                          
                    }
                    otherlv_5=(Token)match(input,95,FOLLOW_95_in_rulearglist9222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getArglistAccess().getQuotationMarkKeyword_1_2());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4243:6: ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4243:6: ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4243:7: ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )*
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4243:7: ( (lv_tipoParametro_6_0= ruletype ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4244:1: (lv_tipoParametro_6_0= ruletype )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4244:1: (lv_tipoParametro_6_0= ruletype )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4245:3: lv_tipoParametro_6_0= ruletype
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArglistAccess().getTipoParametroTypeParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_in_rulearglist9251);
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4261:2: ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4262:1: (lv_nomeParametro_7_0= RULE_IDENTIFIER )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4262:1: (lv_nomeParametro_7_0= RULE_IDENTIFIER )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4263:3: lv_nomeParametro_7_0= RULE_IDENTIFIER
                    {
                    lv_nomeParametro_7_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulearglist9268); if (state.failed) return current;
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

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4279:2: (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==27) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4279:4: otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) )
                    	    {
                    	    otherlv_8=(Token)match(input,27,FOLLOW_27_in_rulearglist9286); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getArglistAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4283:1: ( (lv_tipoParametro_9_0= ruletype ) )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4284:1: (lv_tipoParametro_9_0= ruletype )
                    	    {
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4284:1: (lv_tipoParametro_9_0= ruletype )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4285:3: lv_tipoParametro_9_0= ruletype
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArglistAccess().getTipoParametroTypeParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruletype_in_rulearglist9307);
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

                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4301:2: ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4302:1: (lv_nomeParametro_10_0= RULE_IDENTIFIER )
                    	    {
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4302:1: (lv_nomeParametro_10_0= RULE_IDENTIFIER )
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4303:3: lv_nomeParametro_10_0= RULE_IDENTIFIER
                    	    {
                    	    lv_nomeParametro_10_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulearglist9324); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4327:1: entryRulename returns [EObject current=null] : iv_rulename= rulename EOF ;
    public final EObject entryRulename() throws RecognitionException {
        EObject current = null;

        EObject iv_rulename = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4328:2: (iv_rulename= rulename EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4329:2: iv_rulename= rulename EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_rulename_in_entryRulename9368);
            iv_rulename=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulename; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulename9378); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4336:1: rulename returns [EObject current=null] : ( ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) ) ) ;
    public final EObject rulename() throws RecognitionException {
        EObject current = null;

        Token lv_nome_0_0=null;
        EObject lv_pacote_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4339:28: ( ( ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4340:1: ( ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4340:1: ( ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4340:2: ( (lv_nome_0_0= RULE_IDENTIFIER ) ) ( (lv_pacote_1_0= rulepackage_name_aux ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4340:2: ( (lv_nome_0_0= RULE_IDENTIFIER ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4341:1: (lv_nome_0_0= RULE_IDENTIFIER )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4341:1: (lv_nome_0_0= RULE_IDENTIFIER )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4342:3: lv_nome_0_0= RULE_IDENTIFIER
            {
            lv_nome_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulename9420); if (state.failed) return current;
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4358:2: ( (lv_pacote_1_0= rulepackage_name_aux ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4359:1: (lv_pacote_1_0= rulepackage_name_aux )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4359:1: (lv_pacote_1_0= rulepackage_name_aux )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4360:3: lv_pacote_1_0= rulepackage_name_aux
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameAccess().getPacotePackage_name_auxParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulepackage_name_aux_in_rulename9446);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4384:1: entryRulepackage_name_aux returns [EObject current=null] : iv_rulepackage_name_aux= rulepackage_name_aux EOF ;
    public final EObject entryRulepackage_name_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepackage_name_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4385:2: (iv_rulepackage_name_aux= rulepackage_name_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4386:2: iv_rulepackage_name_aux= rulepackage_name_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_name_auxRule()); 
            }
            pushFollow(FOLLOW_rulepackage_name_aux_in_entryRulepackage_name_aux9482);
            iv_rulepackage_name_aux=rulepackage_name_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepackage_name_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepackage_name_aux9492); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4393:1: rulepackage_name_aux returns [EObject current=null] : (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )* ;
    public final EObject rulepackage_name_aux() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nomePacote_1_0=null;
        EObject lv_pacote_2_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4396:28: ( (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4397:1: (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4397:1: (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==59) ) {
                    int LA79_2 = input.LA(2);

                    if ( (synpred197_InternalSimpleJava()) ) {
                        alt79=1;
                    }


                }


                switch (alt79) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4397:3: otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) )
            	    {
            	    otherlv_0=(Token)match(input,59,FOLLOW_59_in_rulepackage_name_aux9529); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_0, grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0());
            	          
            	    }
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4401:1: ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4402:1: (lv_nomePacote_1_0= RULE_IDENTIFIER )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4402:1: (lv_nomePacote_1_0= RULE_IDENTIFIER )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4403:3: lv_nomePacote_1_0= RULE_IDENTIFIER
            	    {
            	    lv_nomePacote_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulepackage_name_aux9546); if (state.failed) return current;
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

            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4419:2: ( (lv_pacote_2_0= rulepackage_name_aux ) )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4420:1: (lv_pacote_2_0= rulepackage_name_aux )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4420:1: (lv_pacote_2_0= rulepackage_name_aux )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4421:3: lv_pacote_2_0= rulepackage_name_aux
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackage_name_auxAccess().getPacotePackage_name_auxParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulepackage_name_aux_in_rulepackage_name_aux9572);
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4445:1: entryRuletype_specifier returns [EObject current=null] : iv_ruletype_specifier= ruletype_specifier EOF ;
    public final EObject entryRuletype_specifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_specifier = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4446:2: (iv_ruletype_specifier= ruletype_specifier EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4447:2: iv_ruletype_specifier= ruletype_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruletype_specifier_in_entryRuletype_specifier9609);
            iv_ruletype_specifier=ruletype_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_specifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_specifier9619); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4454:1: ruletype_specifier returns [EObject current=null] : ( ( (lv_nome_0_0= 'boolean' ) ) | ( (lv_nome_1_0= 'byte' ) ) | ( (lv_nome_2_0= 'char' ) ) | ( (lv_nome_3_0= 'short' ) ) | ( (lv_nome_4_0= 'int' ) ) | ( (lv_nome_5_0= 'float' ) ) | ( (lv_nome_6_0= 'long' ) ) | ( (lv_nome_7_0= 'double' ) ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4457:28: ( ( ( (lv_nome_0_0= 'boolean' ) ) | ( (lv_nome_1_0= 'byte' ) ) | ( (lv_nome_2_0= 'char' ) ) | ( (lv_nome_3_0= 'short' ) ) | ( (lv_nome_4_0= 'int' ) ) | ( (lv_nome_5_0= 'float' ) ) | ( (lv_nome_6_0= 'long' ) ) | ( (lv_nome_7_0= 'double' ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4458:1: ( ( (lv_nome_0_0= 'boolean' ) ) | ( (lv_nome_1_0= 'byte' ) ) | ( (lv_nome_2_0= 'char' ) ) | ( (lv_nome_3_0= 'short' ) ) | ( (lv_nome_4_0= 'int' ) ) | ( (lv_nome_5_0= 'float' ) ) | ( (lv_nome_6_0= 'long' ) ) | ( (lv_nome_7_0= 'double' ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4458:1: ( ( (lv_nome_0_0= 'boolean' ) ) | ( (lv_nome_1_0= 'byte' ) ) | ( (lv_nome_2_0= 'char' ) ) | ( (lv_nome_3_0= 'short' ) ) | ( (lv_nome_4_0= 'int' ) ) | ( (lv_nome_5_0= 'float' ) ) | ( (lv_nome_6_0= 'long' ) ) | ( (lv_nome_7_0= 'double' ) ) )
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4458:2: ( (lv_nome_0_0= 'boolean' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4458:2: ( (lv_nome_0_0= 'boolean' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4459:1: (lv_nome_0_0= 'boolean' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4459:1: (lv_nome_0_0= 'boolean' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4460:3: lv_nome_0_0= 'boolean'
                    {
                    lv_nome_0_0=(Token)match(input,96,FOLLOW_96_in_ruletype_specifier9662); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4474:6: ( (lv_nome_1_0= 'byte' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4474:6: ( (lv_nome_1_0= 'byte' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4475:1: (lv_nome_1_0= 'byte' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4475:1: (lv_nome_1_0= 'byte' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4476:3: lv_nome_1_0= 'byte'
                    {
                    lv_nome_1_0=(Token)match(input,97,FOLLOW_97_in_ruletype_specifier9699); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4490:6: ( (lv_nome_2_0= 'char' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4490:6: ( (lv_nome_2_0= 'char' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4491:1: (lv_nome_2_0= 'char' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4491:1: (lv_nome_2_0= 'char' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4492:3: lv_nome_2_0= 'char'
                    {
                    lv_nome_2_0=(Token)match(input,98,FOLLOW_98_in_ruletype_specifier9736); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4506:6: ( (lv_nome_3_0= 'short' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4506:6: ( (lv_nome_3_0= 'short' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4507:1: (lv_nome_3_0= 'short' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4507:1: (lv_nome_3_0= 'short' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4508:3: lv_nome_3_0= 'short'
                    {
                    lv_nome_3_0=(Token)match(input,99,FOLLOW_99_in_ruletype_specifier9773); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4522:6: ( (lv_nome_4_0= 'int' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4522:6: ( (lv_nome_4_0= 'int' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4523:1: (lv_nome_4_0= 'int' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4523:1: (lv_nome_4_0= 'int' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4524:3: lv_nome_4_0= 'int'
                    {
                    lv_nome_4_0=(Token)match(input,100,FOLLOW_100_in_ruletype_specifier9810); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4538:6: ( (lv_nome_5_0= 'float' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4538:6: ( (lv_nome_5_0= 'float' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4539:1: (lv_nome_5_0= 'float' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4539:1: (lv_nome_5_0= 'float' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4540:3: lv_nome_5_0= 'float'
                    {
                    lv_nome_5_0=(Token)match(input,101,FOLLOW_101_in_ruletype_specifier9847); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4554:6: ( (lv_nome_6_0= 'long' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4554:6: ( (lv_nome_6_0= 'long' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4555:1: (lv_nome_6_0= 'long' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4555:1: (lv_nome_6_0= 'long' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4556:3: lv_nome_6_0= 'long'
                    {
                    lv_nome_6_0=(Token)match(input,102,FOLLOW_102_in_ruletype_specifier9884); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4570:6: ( (lv_nome_7_0= 'double' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4570:6: ( (lv_nome_7_0= 'double' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4571:1: (lv_nome_7_0= 'double' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4571:1: (lv_nome_7_0= 'double' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4572:3: lv_nome_7_0= 'double'
                    {
                    lv_nome_7_0=(Token)match(input,103,FOLLOW_103_in_ruletype_specifier9921); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4593:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4594:2: (iv_ruletype= ruletype EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4595:2: iv_ruletype= ruletype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruletype_in_entryRuletype9970);
            iv_ruletype=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype9980); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4602:1: ruletype returns [EObject current=null] : ( ( ( (lv_tipo_0_0= ruletype_specifier ) ) | ( (lv_tipo_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )* ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_tipo_0_0 = null;

        EObject lv_tipo_1_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4605:28: ( ( ( ( (lv_tipo_0_0= ruletype_specifier ) ) | ( (lv_tipo_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4606:1: ( ( ( (lv_tipo_0_0= ruletype_specifier ) ) | ( (lv_tipo_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4606:1: ( ( ( (lv_tipo_0_0= ruletype_specifier ) ) | ( (lv_tipo_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4606:2: ( ( (lv_tipo_0_0= ruletype_specifier ) ) | ( (lv_tipo_1_0= rulename ) ) ) (otherlv_2= '[' otherlv_3= ']' )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4606:2: ( ( (lv_tipo_0_0= ruletype_specifier ) ) | ( (lv_tipo_1_0= rulename ) ) )
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4606:3: ( (lv_tipo_0_0= ruletype_specifier ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4606:3: ( (lv_tipo_0_0= ruletype_specifier ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4607:1: (lv_tipo_0_0= ruletype_specifier )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4607:1: (lv_tipo_0_0= ruletype_specifier )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4608:3: lv_tipo_0_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getTipoType_specifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_ruletype10027);
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4625:6: ( (lv_tipo_1_0= rulename ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4625:6: ( (lv_tipo_1_0= rulename ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4626:1: (lv_tipo_1_0= rulename )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4626:1: (lv_tipo_1_0= rulename )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4627:3: lv_tipo_1_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getTipoNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulename_in_ruletype10054);
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4643:3: (otherlv_2= '[' otherlv_3= ']' )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==33) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4643:5: otherlv_2= '[' otherlv_3= ']'
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruletype10068); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruletype10080); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4659:1: entryRuleMODIFIER returns [EObject current=null] : iv_ruleMODIFIER= ruleMODIFIER EOF ;
    public final EObject entryRuleMODIFIER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODIFIER = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4660:2: (iv_ruleMODIFIER= ruleMODIFIER EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4661:2: iv_ruleMODIFIER= ruleMODIFIER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMODIFIERRule()); 
            }
            pushFollow(FOLLOW_ruleMODIFIER_in_entryRuleMODIFIER10118);
            iv_ruleMODIFIER=ruleMODIFIER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMODIFIER; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODIFIER10128); if (state.failed) return current;

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4668:1: ruleMODIFIER returns [EObject current=null] : ( ( (lv_modificador_0_0= 'public' ) ) | ( (lv_modificador_1_0= 'private' ) ) | ( (lv_modificador_2_0= 'protected' ) ) | ( (lv_modificador_3_0= 'static' ) ) | ( (lv_modificador_4_0= 'final' ) ) | ( (lv_modificador_5_0= 'native' ) ) | ( (lv_modificador_6_0= 'synchronized' ) ) | ( (lv_modificador_7_0= 'abstract' ) ) | ( (lv_modificador_8_0= 'threadsafe' ) ) | ( (lv_modificador_9_0= 'transient' ) ) ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4671:28: ( ( ( (lv_modificador_0_0= 'public' ) ) | ( (lv_modificador_1_0= 'private' ) ) | ( (lv_modificador_2_0= 'protected' ) ) | ( (lv_modificador_3_0= 'static' ) ) | ( (lv_modificador_4_0= 'final' ) ) | ( (lv_modificador_5_0= 'native' ) ) | ( (lv_modificador_6_0= 'synchronized' ) ) | ( (lv_modificador_7_0= 'abstract' ) ) | ( (lv_modificador_8_0= 'threadsafe' ) ) | ( (lv_modificador_9_0= 'transient' ) ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4672:1: ( ( (lv_modificador_0_0= 'public' ) ) | ( (lv_modificador_1_0= 'private' ) ) | ( (lv_modificador_2_0= 'protected' ) ) | ( (lv_modificador_3_0= 'static' ) ) | ( (lv_modificador_4_0= 'final' ) ) | ( (lv_modificador_5_0= 'native' ) ) | ( (lv_modificador_6_0= 'synchronized' ) ) | ( (lv_modificador_7_0= 'abstract' ) ) | ( (lv_modificador_8_0= 'threadsafe' ) ) | ( (lv_modificador_9_0= 'transient' ) ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4672:1: ( ( (lv_modificador_0_0= 'public' ) ) | ( (lv_modificador_1_0= 'private' ) ) | ( (lv_modificador_2_0= 'protected' ) ) | ( (lv_modificador_3_0= 'static' ) ) | ( (lv_modificador_4_0= 'final' ) ) | ( (lv_modificador_5_0= 'native' ) ) | ( (lv_modificador_6_0= 'synchronized' ) ) | ( (lv_modificador_7_0= 'abstract' ) ) | ( (lv_modificador_8_0= 'threadsafe' ) ) | ( (lv_modificador_9_0= 'transient' ) ) )
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
            case 54:
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
            case 35:
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4672:2: ( (lv_modificador_0_0= 'public' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4672:2: ( (lv_modificador_0_0= 'public' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4673:1: (lv_modificador_0_0= 'public' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4673:1: (lv_modificador_0_0= 'public' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4674:3: lv_modificador_0_0= 'public'
                    {
                    lv_modificador_0_0=(Token)match(input,104,FOLLOW_104_in_ruleMODIFIER10171); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4688:6: ( (lv_modificador_1_0= 'private' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4688:6: ( (lv_modificador_1_0= 'private' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4689:1: (lv_modificador_1_0= 'private' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4689:1: (lv_modificador_1_0= 'private' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4690:3: lv_modificador_1_0= 'private'
                    {
                    lv_modificador_1_0=(Token)match(input,105,FOLLOW_105_in_ruleMODIFIER10208); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4704:6: ( (lv_modificador_2_0= 'protected' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4704:6: ( (lv_modificador_2_0= 'protected' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4705:1: (lv_modificador_2_0= 'protected' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4705:1: (lv_modificador_2_0= 'protected' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4706:3: lv_modificador_2_0= 'protected'
                    {
                    lv_modificador_2_0=(Token)match(input,106,FOLLOW_106_in_ruleMODIFIER10245); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4720:6: ( (lv_modificador_3_0= 'static' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4720:6: ( (lv_modificador_3_0= 'static' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4721:1: (lv_modificador_3_0= 'static' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4721:1: (lv_modificador_3_0= 'static' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4722:3: lv_modificador_3_0= 'static'
                    {
                    lv_modificador_3_0=(Token)match(input,54,FOLLOW_54_in_ruleMODIFIER10282); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4736:6: ( (lv_modificador_4_0= 'final' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4736:6: ( (lv_modificador_4_0= 'final' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4737:1: (lv_modificador_4_0= 'final' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4737:1: (lv_modificador_4_0= 'final' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4738:3: lv_modificador_4_0= 'final'
                    {
                    lv_modificador_4_0=(Token)match(input,107,FOLLOW_107_in_ruleMODIFIER10319); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4752:6: ( (lv_modificador_5_0= 'native' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4752:6: ( (lv_modificador_5_0= 'native' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4753:1: (lv_modificador_5_0= 'native' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4753:1: (lv_modificador_5_0= 'native' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4754:3: lv_modificador_5_0= 'native'
                    {
                    lv_modificador_5_0=(Token)match(input,108,FOLLOW_108_in_ruleMODIFIER10356); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4768:6: ( (lv_modificador_6_0= 'synchronized' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4768:6: ( (lv_modificador_6_0= 'synchronized' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4769:1: (lv_modificador_6_0= 'synchronized' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4769:1: (lv_modificador_6_0= 'synchronized' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4770:3: lv_modificador_6_0= 'synchronized'
                    {
                    lv_modificador_6_0=(Token)match(input,35,FOLLOW_35_in_ruleMODIFIER10393); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4784:6: ( (lv_modificador_7_0= 'abstract' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4784:6: ( (lv_modificador_7_0= 'abstract' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4785:1: (lv_modificador_7_0= 'abstract' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4785:1: (lv_modificador_7_0= 'abstract' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4786:3: lv_modificador_7_0= 'abstract'
                    {
                    lv_modificador_7_0=(Token)match(input,109,FOLLOW_109_in_ruleMODIFIER10430); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4800:6: ( (lv_modificador_8_0= 'threadsafe' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4800:6: ( (lv_modificador_8_0= 'threadsafe' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4801:1: (lv_modificador_8_0= 'threadsafe' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4801:1: (lv_modificador_8_0= 'threadsafe' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4802:3: lv_modificador_8_0= 'threadsafe'
                    {
                    lv_modificador_8_0=(Token)match(input,110,FOLLOW_110_in_ruleMODIFIER10467); if (state.failed) return current;
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4816:6: ( (lv_modificador_9_0= 'transient' ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4816:6: ( (lv_modificador_9_0= 'transient' ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4817:1: (lv_modificador_9_0= 'transient' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4817:1: (lv_modificador_9_0= 'transient' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4818:3: lv_modificador_9_0= 'transient'
                    {
                    lv_modificador_9_0=(Token)match(input,111,FOLLOW_111_in_ruleMODIFIER10504); if (state.failed) return current;
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:721:4: ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:721:4: ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:721:4: ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:722:1: (lv_declaracaoMetodo_1_0= rulemethod_declaration )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:722:1: (lv_declaracaoMetodo_1_0= rulemethod_declaration )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:723:3: lv_declaracaoMetodo_1_0= rulemethod_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoMetodoMethod_declarationParserRuleCall_0_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulemethod_declaration_in_synpred18_InternalSimpleJava1452);
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:740:6: ( ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:740:6: ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:740:6: ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:741:1: (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:741:1: (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:742:3: lv_declaracaoConstrutor_2_0= ruleconstructor_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getField_declarationAccess().getDeclaracaoConstrutorConstructor_declarationParserRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleconstructor_declaration_in_synpred19_InternalSimpleJava1479);
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1127:2: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1127:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1127:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1127:3: ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1138:1: (lv_declaracaoVariavel_0_0= rulevariable_declaration )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1139:3: lv_declaracaoVariavel_0_0= rulevariable_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulevariable_declaration_in_synpred39_InternalSimpleJava2351);
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1156:6: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1156:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1156:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1156:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';'
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1156:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1156:8: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1169:1: (lv_expressao_1_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1170:3: lv_expressao_1_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getExpressaoExpressionParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred57_InternalSimpleJava2488);
        lv_expressao_1_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,18,FOLLOW_18_in_synpred57_InternalSimpleJava2500); if (state.failed) return ;

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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1324:6: ( (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1324:6: (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1324:6: (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1324:8: otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) )
        {
        otherlv_10=(Token)match(input,35,FOLLOW_35_in_synpred65_InternalSimpleJava2709); if (state.failed) return ;
        otherlv_11=(Token)match(input,31,FOLLOW_31_in_synpred65_InternalSimpleJava2721); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1332:1: ( (lv_expressaoSynchronized_12_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1333:1: (lv_expressaoSynchronized_12_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1333:1: (lv_expressaoSynchronized_12_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1334:3: lv_expressaoSynchronized_12_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getExpressaoSynchronizedExpressionParserRuleCall_9_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred65_InternalSimpleJava2742);
        lv_expressaoSynchronized_12_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_13=(Token)match(input,32,FOLLOW_32_in_synpred65_InternalSimpleJava2754); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1354:1: ( (lv_corpoSynchronize_14_0= rulestatement ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1355:1: (lv_corpoSynchronize_14_0= rulestatement )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1355:1: (lv_corpoSynchronize_14_0= rulestatement )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1356:3: lv_corpoSynchronize_14_0= rulestatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getCorpoSynchronizeStatementParserRuleCall_9_4_0()); 
          	    
        }
        pushFollow(FOLLOW_rulestatement_in_synpred65_InternalSimpleJava2775);
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1427:6: ( (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1427:6: (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1427:6: (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1427:7: this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement
        {
        this_IDENTIFIER_21=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_synpred69_InternalSimpleJava2901); if (state.failed) return ;
        otherlv_22=(Token)match(input,38,FOLLOW_38_in_synpred69_InternalSimpleJava2912); if (state.failed) return ;
        pushFollow(FOLLOW_rulestatement_in_synpred69_InternalSimpleJava2937);
        this_statement_23=rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred69_InternalSimpleJava

    // $ANTLR start synpred87_InternalSimpleJava
    public final void synpred87_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1882:3: ( ( 'else' ( ( rulestatement ) ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1882:4: ( 'else' ( ( rulestatement ) ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1882:4: ( 'else' ( ( rulestatement ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1882:6: 'else' ( ( rulestatement ) )
        {
        match(input,44,FOLLOW_44_in_synpred87_InternalSimpleJava3876); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1883:1: ( ( rulestatement ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1884:1: ( rulestatement )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1884:1: ( rulestatement )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1885:1: rulestatement
        {
        pushFollow(FOLLOW_rulestatement_in_synpred87_InternalSimpleJava3883);
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2084:2: ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2084:2: ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2084:2: ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2084:3: ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2089:1: (lv_declaracaoVariavel_2_0= rulevariable_declaration )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2090:3: lv_declaracaoVariavel_2_0= rulevariable_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFor_statementAccess().getDeclaracaoVariavelVariable_declarationParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulevariable_declaration_in_synpred89_InternalSimpleJava4368);
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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2107:6: ( ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2107:6: ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2107:6: ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2107:7: ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';'
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2107:7: ( (lv_expressaoDeclaracao_3_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2108:1: (lv_expressaoDeclaracao_3_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2108:1: (lv_expressaoDeclaracao_3_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2109:3: lv_expressaoDeclaracao_3_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressaoDeclaracaoExpressionParserRuleCall_2_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred90_InternalSimpleJava4396);
        lv_expressaoDeclaracao_3_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,18,FOLLOW_18_in_synpred90_InternalSimpleJava4408); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred90_InternalSimpleJava

    // $ANTLR start synpred93_InternalSimpleJava
    public final void synpred93_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2239:3: ( ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2239:4: ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2239:4: ( 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2239:6: 'catch' '(' ( ( ruleparameter ) ) ')' ( ( rulestatement_block ) )
        {
        match(input,49,FOLLOW_49_in_synpred93_InternalSimpleJava4634); if (state.failed) return ;
        match(input,31,FOLLOW_31_in_synpred93_InternalSimpleJava4638); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2241:1: ( ( ruleparameter ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2242:1: ( ruleparameter )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2242:1: ( ruleparameter )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2243:1: ruleparameter
        {
        pushFollow(FOLLOW_ruleparameter_in_synpred93_InternalSimpleJava4645);
        ruleparameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,32,FOLLOW_32_in_synpred93_InternalSimpleJava4651); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2246:1: ( ( rulestatement_block ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2247:1: ( rulestatement_block )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2247:1: ( rulestatement_block )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2248:1: rulestatement_block
        {
        pushFollow(FOLLOW_rulestatement_block_in_synpred93_InternalSimpleJava4658);
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
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2298:6: ( ( 'finally' ( ( rulestatement_block ) ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2298:7: ( 'finally' ( ( rulestatement_block ) ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2298:7: ( 'finally' ( ( rulestatement_block ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2298:9: 'finally' ( ( rulestatement_block ) )
        {
        match(input,50,FOLLOW_50_in_synpred94_InternalSimpleJava4752); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2299:1: ( ( rulestatement_block ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2300:1: ( rulestatement_block )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2300:1: ( rulestatement_block )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2301:1: rulestatement_block
        {
        pushFollow(FOLLOW_rulestatement_block_in_synpred94_InternalSimpleJava4759);
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
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2685:3: ( '[' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2685:5: '['
        {
        match(input,33,FOLLOW_33_in_synpred103_InternalSimpleJava5552); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_InternalSimpleJava

    // $ANTLR start synpred106_InternalSimpleJava
    public final void synpred106_InternalSimpleJava_fragment() throws RecognitionException {   
        EObject lv_novo_10_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2740:1: ( (lv_novo_10_0= rulenew ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2740:1: (lv_novo_10_0= rulenew )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2740:1: (lv_novo_10_0= rulenew )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2741:3: lv_novo_10_0= rulenew
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_expressionAccess().getNovoNewParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_rulenew_in_synpred106_InternalSimpleJava5674);
        lv_novo_10_0=rulenew();

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


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2778:2: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2778:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2778:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2778:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')'
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2778:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2778:4: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2791:1: (lv_expressao_0_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2792:3: lv_expressao_0_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExp_auxAccess().getExpressaoExpressionParserRuleCall_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred124_InternalSimpleJava5877);
        lv_expressao_0_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_1=(Token)match(input,32,FOLLOW_32_in_synpred124_InternalSimpleJava5889); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred124_InternalSimpleJava

    // $ANTLR start synpred143_InternalSimpleJava
    public final void synpred143_InternalSimpleJava_fragment() throws RecognitionException {   
        EObject this_mais_aux_10 = null;

        EObject lv_exp_11_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:6: ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:6: ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:7: ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:7: ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:8: ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux
        {
        pushFollow(FOLLOW_rulemais_aux_in_synpred143_InternalSimpleJava6635);
        this_mais_aux_10=rulemais_aux();

        state._fsp--;
        if (state.failed) return ;

        }

        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3137:2: ( (lv_exp_11_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3138:1: (lv_exp_11_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3138:1: (lv_exp_11_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3139:3: lv_exp_11_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred143_InternalSimpleJava6656);
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
        Token lv_opedador_14_0=null;
        Token lv_opedador_15_0=null;
        Token lv_opedador_16_0=null;
        Token lv_opedador_17_0=null;
        Token lv_opedador_18_0=null;
        Token lv_opedador_19_0=null;
        Token lv_opedador_20_0=null;
        Token lv_opedador_21_0=null;
        EObject this_mais_aux_13 = null;

        EObject lv_exp_22_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:6: ( ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:7: ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:7: ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) )
        int alt100=9;
        alt100 = dfa100.predict(input);
        switch (alt100) {
            case 1 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:8: ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:8: ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:9: ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux
                {
                pushFollow(FOLLOW_rulemais_aux_in_synpred156_InternalSimpleJava6776);
                this_mais_aux_13=rulemais_aux();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3202:6: ( (lv_opedador_14_0= '-' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3202:6: ( (lv_opedador_14_0= '-' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3203:1: (lv_opedador_14_0= '-' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3203:1: (lv_opedador_14_0= '-' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3204:3: lv_opedador_14_0= '-'
                {
                lv_opedador_14_0=(Token)match(input,63,FOLLOW_63_in_synpred156_InternalSimpleJava6800); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3218:6: ( (lv_opedador_15_0= '-=' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3218:6: ( (lv_opedador_15_0= '-=' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3219:1: (lv_opedador_15_0= '-=' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3219:1: (lv_opedador_15_0= '-=' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3220:3: lv_opedador_15_0= '-='
                {
                lv_opedador_15_0=(Token)match(input,64,FOLLOW_64_in_synpred156_InternalSimpleJava6837); if (state.failed) return ;

                }


                }


                }
                break;
            case 4 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3234:6: ( (lv_opedador_16_0= '*' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3234:6: ( (lv_opedador_16_0= '*' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:1: (lv_opedador_16_0= '*' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:1: (lv_opedador_16_0= '*' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3236:3: lv_opedador_16_0= '*'
                {
                lv_opedador_16_0=(Token)match(input,65,FOLLOW_65_in_synpred156_InternalSimpleJava6874); if (state.failed) return ;

                }


                }


                }
                break;
            case 5 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3250:6: ( (lv_opedador_17_0= '*=' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3250:6: ( (lv_opedador_17_0= '*=' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3251:1: (lv_opedador_17_0= '*=' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3251:1: (lv_opedador_17_0= '*=' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3252:3: lv_opedador_17_0= '*='
                {
                lv_opedador_17_0=(Token)match(input,66,FOLLOW_66_in_synpred156_InternalSimpleJava6911); if (state.failed) return ;

                }


                }


                }
                break;
            case 6 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3266:6: ( (lv_opedador_18_0= '/' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3266:6: ( (lv_opedador_18_0= '/' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3267:1: (lv_opedador_18_0= '/' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3267:1: (lv_opedador_18_0= '/' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3268:3: lv_opedador_18_0= '/'
                {
                lv_opedador_18_0=(Token)match(input,67,FOLLOW_67_in_synpred156_InternalSimpleJava6948); if (state.failed) return ;

                }


                }


                }
                break;
            case 7 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3282:6: ( (lv_opedador_19_0= '/=' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3282:6: ( (lv_opedador_19_0= '/=' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3283:1: (lv_opedador_19_0= '/=' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3283:1: (lv_opedador_19_0= '/=' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3284:3: lv_opedador_19_0= '/='
                {
                lv_opedador_19_0=(Token)match(input,68,FOLLOW_68_in_synpred156_InternalSimpleJava6985); if (state.failed) return ;

                }


                }


                }
                break;
            case 8 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3298:6: ( (lv_opedador_20_0= '%' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3298:6: ( (lv_opedador_20_0= '%' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3299:1: (lv_opedador_20_0= '%' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3299:1: (lv_opedador_20_0= '%' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3300:3: lv_opedador_20_0= '%'
                {
                lv_opedador_20_0=(Token)match(input,69,FOLLOW_69_in_synpred156_InternalSimpleJava7022); if (state.failed) return ;

                }


                }


                }
                break;
            case 9 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3314:6: ( (lv_opedador_21_0= '%=' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3314:6: ( (lv_opedador_21_0= '%=' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3315:1: (lv_opedador_21_0= '%=' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3315:1: (lv_opedador_21_0= '%=' )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3316:3: lv_opedador_21_0= '%='
                {
                lv_opedador_21_0=(Token)match(input,70,FOLLOW_70_in_synpred156_InternalSimpleJava7059); if (state.failed) return ;

                }


                }


                }
                break;

        }

        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3329:3: ( (lv_exp_22_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3330:1: (lv_exp_22_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3330:1: (lv_exp_22_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3331:3: lv_exp_22_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred156_InternalSimpleJava7094);
        lv_exp_22_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred156_InternalSimpleJava

    // $ANTLR start synpred178_InternalSimpleJava
    public final void synpred178_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_opedador_12_1=null;
        Token lv_opedador_12_2=null;
        Token lv_opedador_14_0=null;
        Token lv_opedador_15_0=null;
        Token lv_opedador_16_0=null;
        Token lv_opedador_17_0=null;
        Token lv_opedador_18_0=null;
        Token lv_opedador_19_0=null;
        Token lv_opedador_20_0=null;
        Token lv_opedador_21_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token lv_opedador_39_1=null;
        Token lv_opedador_39_2=null;
        Token lv_opedador_39_3=null;
        Token lv_opedador_39_4=null;
        Token lv_opedador_39_5=null;
        Token lv_opedador_39_6=null;
        Token lv_operador_41_1=null;
        Token lv_operador_41_2=null;
        Token lv_operador_41_3=null;
        Token lv_operador_41_4=null;
        EObject this_arglist_1 = null;

        EObject this_aux_3 = null;

        EObject this_expression_5 = null;

        EObject this_expression_7 = null;

        EObject this_name_9 = null;

        EObject this_mais_aux_10 = null;

        EObject lv_exp_11_0 = null;

        EObject this_mais_aux_13 = null;

        EObject lv_exp_22_0 = null;

        EObject this_expression_34 = null;

        EObject this_expression_36 = null;

        EObject lv_expressao_38_0 = null;

        EObject lv_exp_40_0 = null;

        EObject lv_exp_42_0 = null;

        EObject lv_expressoes_43_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:2: ( ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_43_0= ruleexpression_aux ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:2: ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_43_0= ruleexpression_aux ) )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:2: ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) ) )
        int alt111=5;
        alt111 = dfa111.predict(input);
        switch (alt111) {
            case 1 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:3: ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:3: ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                int alt104=5;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    alt104=1;
                    }
                    break;
                case 33:
                    {
                    alt104=2;
                    }
                    break;
                case 59:
                    {
                    alt104=3;
                    }
                    break;
                case 27:
                    {
                    alt104=4;
                    }
                    break;
                case 60:
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
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:4: (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:4: (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3038:6: otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')'
                        {
                        otherlv_0=(Token)match(input,31,FOLLOW_31_in_synpred178_InternalSimpleJava6378); if (state.failed) return ;
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3042:1: (this_arglist_1= rulearglist )?
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( ((LA103_0>=RULE_IDENTIFIER && LA103_0<=RULE_STRING)||LA103_0==31||(LA103_0>=55 && LA103_0<=58)||(LA103_0>=61 && LA103_0<=63)||(LA103_0>=91 && LA103_0<=103)) ) {
                            alt103=1;
                        }
                        switch (alt103) {
                            case 1 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3043:2: this_arglist_1= rulearglist
                                {
                                pushFollow(FOLLOW_rulearglist_in_synpred178_InternalSimpleJava6404);
                                this_arglist_1=rulearglist();

                                state._fsp--;
                                if (state.failed) return ;

                                }
                                break;

                        }

                        otherlv_2=(Token)match(input,32,FOLLOW_32_in_synpred178_InternalSimpleJava6417); if (state.failed) return ;

                        }


                        }
                        break;
                    case 2 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3060:2: this_aux_3= ruleaux
                        {
                        pushFollow(FOLLOW_ruleaux_in_synpred178_InternalSimpleJava6449);
                        this_aux_3=ruleaux();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3072:6: (otherlv_4= '.' this_expression_5= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3072:6: (otherlv_4= '.' this_expression_5= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3072:8: otherlv_4= '.' this_expression_5= ruleexpression
                        {
                        otherlv_4=(Token)match(input,59,FOLLOW_59_in_synpred178_InternalSimpleJava6467); if (state.failed) return ;
                        pushFollow(FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava6492);
                        this_expression_5=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;
                    case 4 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3089:6: (otherlv_6= ',' this_expression_7= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3089:6: (otherlv_6= ',' this_expression_7= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3089:8: otherlv_6= ',' this_expression_7= ruleexpression
                        {
                        otherlv_6=(Token)match(input,27,FOLLOW_27_in_synpred178_InternalSimpleJava6511); if (state.failed) return ;
                        pushFollow(FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava6536);
                        this_expression_7=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;
                    case 5 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3106:6: (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3106:6: (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3106:8: otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                        {
                        otherlv_8=(Token)match(input,60,FOLLOW_60_in_synpred178_InternalSimpleJava6555); if (state.failed) return ;
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3110:1: ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3110:2: ( RULE_IDENTIFIER )=>this_name_9= rulename
                        {
                        pushFollow(FOLLOW_rulename_in_synpred178_InternalSimpleJava6586);
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
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:6: ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:6: ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:7: ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:7: ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3123:8: ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux
                {
                pushFollow(FOLLOW_rulemais_aux_in_synpred178_InternalSimpleJava6635);
                this_mais_aux_10=rulemais_aux();

                state._fsp--;
                if (state.failed) return ;

                }

                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3137:2: ( (lv_exp_11_0= ruleexpression ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3138:1: (lv_exp_11_0= ruleexpression )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3138:1: (lv_exp_11_0= ruleexpression )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3139:3: lv_exp_11_0= ruleexpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_1_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava6656);
                lv_exp_11_0=ruleexpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }


                }
                break;
            case 3 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3156:6: ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3156:6: ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3157:1: ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3157:1: ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3158:1: (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3158:1: (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' )
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==61) ) {
                    alt105=1;
                }
                else if ( (LA105_0==62) ) {
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
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3159:3: lv_opedador_12_1= '++'
                        {
                        lv_opedador_12_1=(Token)match(input,61,FOLLOW_61_in_synpred178_InternalSimpleJava6683); if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3171:8: lv_opedador_12_2= '--'
                        {
                        lv_opedador_12_2=(Token)match(input,62,FOLLOW_62_in_synpred178_InternalSimpleJava6712); if (state.failed) return ;

                        }
                        break;

                }


                }


                }


                }
                break;
            case 4 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:7: ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:7: ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) )
                int alt106=9;
                alt106 = dfa106.predict(input);
                switch (alt106) {
                    case 1 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:8: ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:8: ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3187:9: ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux
                        {
                        pushFollow(FOLLOW_rulemais_aux_in_synpred178_InternalSimpleJava6776);
                        this_mais_aux_13=rulemais_aux();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;
                    case 2 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3202:6: ( (lv_opedador_14_0= '-' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3202:6: ( (lv_opedador_14_0= '-' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3203:1: (lv_opedador_14_0= '-' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3203:1: (lv_opedador_14_0= '-' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3204:3: lv_opedador_14_0= '-'
                        {
                        lv_opedador_14_0=(Token)match(input,63,FOLLOW_63_in_synpred178_InternalSimpleJava6800); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 3 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3218:6: ( (lv_opedador_15_0= '-=' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3218:6: ( (lv_opedador_15_0= '-=' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3219:1: (lv_opedador_15_0= '-=' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3219:1: (lv_opedador_15_0= '-=' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3220:3: lv_opedador_15_0= '-='
                        {
                        lv_opedador_15_0=(Token)match(input,64,FOLLOW_64_in_synpred178_InternalSimpleJava6837); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 4 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3234:6: ( (lv_opedador_16_0= '*' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3234:6: ( (lv_opedador_16_0= '*' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:1: (lv_opedador_16_0= '*' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3235:1: (lv_opedador_16_0= '*' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3236:3: lv_opedador_16_0= '*'
                        {
                        lv_opedador_16_0=(Token)match(input,65,FOLLOW_65_in_synpred178_InternalSimpleJava6874); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 5 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3250:6: ( (lv_opedador_17_0= '*=' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3250:6: ( (lv_opedador_17_0= '*=' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3251:1: (lv_opedador_17_0= '*=' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3251:1: (lv_opedador_17_0= '*=' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3252:3: lv_opedador_17_0= '*='
                        {
                        lv_opedador_17_0=(Token)match(input,66,FOLLOW_66_in_synpred178_InternalSimpleJava6911); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 6 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3266:6: ( (lv_opedador_18_0= '/' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3266:6: ( (lv_opedador_18_0= '/' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3267:1: (lv_opedador_18_0= '/' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3267:1: (lv_opedador_18_0= '/' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3268:3: lv_opedador_18_0= '/'
                        {
                        lv_opedador_18_0=(Token)match(input,67,FOLLOW_67_in_synpred178_InternalSimpleJava6948); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 7 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3282:6: ( (lv_opedador_19_0= '/=' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3282:6: ( (lv_opedador_19_0= '/=' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3283:1: (lv_opedador_19_0= '/=' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3283:1: (lv_opedador_19_0= '/=' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3284:3: lv_opedador_19_0= '/='
                        {
                        lv_opedador_19_0=(Token)match(input,68,FOLLOW_68_in_synpred178_InternalSimpleJava6985); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 8 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3298:6: ( (lv_opedador_20_0= '%' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3298:6: ( (lv_opedador_20_0= '%' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3299:1: (lv_opedador_20_0= '%' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3299:1: (lv_opedador_20_0= '%' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3300:3: lv_opedador_20_0= '%'
                        {
                        lv_opedador_20_0=(Token)match(input,69,FOLLOW_69_in_synpred178_InternalSimpleJava7022); if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 9 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3314:6: ( (lv_opedador_21_0= '%=' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3314:6: ( (lv_opedador_21_0= '%=' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3315:1: (lv_opedador_21_0= '%=' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3315:1: (lv_opedador_21_0= '%=' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3316:3: lv_opedador_21_0= '%='
                        {
                        lv_opedador_21_0=(Token)match(input,70,FOLLOW_70_in_synpred178_InternalSimpleJava7059); if (state.failed) return ;

                        }


                        }


                        }
                        break;

                }

                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3329:3: ( (lv_exp_22_0= ruleexpression ) )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3330:1: (lv_exp_22_0= ruleexpression )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3330:1: (lv_exp_22_0= ruleexpression )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3331:3: lv_exp_22_0= ruleexpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_3_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava7094);
                lv_exp_22_0=ruleexpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }


                }
                break;
            case 5 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:6: ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:6: ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) )
                int alt110=4;
                switch ( input.LA(1) ) {
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
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:7: ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:7: ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:8: (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:8: (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' )
                        int alt107=10;
                        alt107 = dfa107.predict(input);
                        switch (alt107) {
                            case 1 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:10: otherlv_23= 'ampersand'
                                {
                                otherlv_23=(Token)match(input,71,FOLLOW_71_in_synpred178_InternalSimpleJava7116); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3353:7: otherlv_24= 'ampersand='
                                {
                                otherlv_24=(Token)match(input,72,FOLLOW_72_in_synpred178_InternalSimpleJava7134); if (state.failed) return ;

                                }
                                break;
                            case 3 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3358:7: otherlv_25= '|'
                                {
                                otherlv_25=(Token)match(input,73,FOLLOW_73_in_synpred178_InternalSimpleJava7152); if (state.failed) return ;

                                }
                                break;
                            case 4 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3363:7: otherlv_26= '|='
                                {
                                otherlv_26=(Token)match(input,74,FOLLOW_74_in_synpred178_InternalSimpleJava7170); if (state.failed) return ;

                                }
                                break;
                            case 5 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3368:7: otherlv_27= '^'
                                {
                                otherlv_27=(Token)match(input,75,FOLLOW_75_in_synpred178_InternalSimpleJava7188); if (state.failed) return ;

                                }
                                break;
                            case 6 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3373:7: otherlv_28= '^='
                                {
                                otherlv_28=(Token)match(input,76,FOLLOW_76_in_synpred178_InternalSimpleJava7206); if (state.failed) return ;

                                }
                                break;
                            case 7 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3378:6: (otherlv_29= 'ampersand' otherlv_30= 'ampersand' )
                                {
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3378:6: (otherlv_29= 'ampersand' otherlv_30= 'ampersand' )
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3378:8: otherlv_29= 'ampersand' otherlv_30= 'ampersand'
                                {
                                otherlv_29=(Token)match(input,71,FOLLOW_71_in_synpred178_InternalSimpleJava7225); if (state.failed) return ;
                                otherlv_30=(Token)match(input,71,FOLLOW_71_in_synpred178_InternalSimpleJava7237); if (state.failed) return ;

                                }


                                }
                                break;
                            case 8 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3387:7: otherlv_31= '||='
                                {
                                otherlv_31=(Token)match(input,77,FOLLOW_77_in_synpred178_InternalSimpleJava7256); if (state.failed) return ;

                                }
                                break;
                            case 9 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3392:6: ( ( '%' )=>otherlv_32= '%' )
                                {
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3392:6: ( ( '%' )=>otherlv_32= '%' )
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3392:7: ( '%' )=>otherlv_32= '%'
                                {
                                otherlv_32=(Token)match(input,69,FOLLOW_69_in_synpred178_InternalSimpleJava7282); if (state.failed) return ;

                                }


                                }
                                break;
                            case 10 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3398:7: otherlv_33= '%='
                                {
                                otherlv_33=(Token)match(input,70,FOLLOW_70_in_synpred178_InternalSimpleJava7301); if (state.failed) return ;

                                }
                                break;

                        }

                        pushFollow(FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava7327);
                        this_expression_34=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;
                    case 2 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3415:6: (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3415:6: (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3415:8: otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) )
                        {
                        otherlv_35=(Token)match(input,78,FOLLOW_78_in_synpred178_InternalSimpleJava7346); if (state.failed) return ;
                        pushFollow(FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava7371);
                        this_expression_36=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;
                        otherlv_37=(Token)match(input,38,FOLLOW_38_in_synpred178_InternalSimpleJava7382); if (state.failed) return ;
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3435:1: ( (lv_expressao_38_0= ruleexpression ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3436:1: (lv_expressao_38_0= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3436:1: (lv_expressao_38_0= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3437:3: lv_expressao_38_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressaoExpressionParserRuleCall_0_4_1_3_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava7403);
                        lv_expressao_38_0=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }


                        }
                        break;
                    case 3 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3454:6: ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3454:6: ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3454:7: ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3454:7: ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3455:1: ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3455:1: ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3456:1: (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3456:1: (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' )
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
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3457:3: lv_opedador_39_1= '>'
                                {
                                lv_opedador_39_1=(Token)match(input,79,FOLLOW_79_in_synpred178_InternalSimpleJava7431); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3469:8: lv_opedador_39_2= '<'
                                {
                                lv_opedador_39_2=(Token)match(input,80,FOLLOW_80_in_synpred178_InternalSimpleJava7460); if (state.failed) return ;

                                }
                                break;
                            case 3 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3481:8: lv_opedador_39_3= '>='
                                {
                                lv_opedador_39_3=(Token)match(input,81,FOLLOW_81_in_synpred178_InternalSimpleJava7489); if (state.failed) return ;

                                }
                                break;
                            case 4 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3493:8: lv_opedador_39_4= '<='
                                {
                                lv_opedador_39_4=(Token)match(input,82,FOLLOW_82_in_synpred178_InternalSimpleJava7518); if (state.failed) return ;

                                }
                                break;
                            case 5 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3505:8: lv_opedador_39_5= '=='
                                {
                                lv_opedador_39_5=(Token)match(input,83,FOLLOW_83_in_synpred178_InternalSimpleJava7547); if (state.failed) return ;

                                }
                                break;
                            case 6 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3517:8: lv_opedador_39_6= '!='
                                {
                                lv_opedador_39_6=(Token)match(input,84,FOLLOW_84_in_synpred178_InternalSimpleJava7576); if (state.failed) return ;

                                }
                                break;

                        }


                        }


                        }

                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3532:2: ( (lv_exp_40_0= ruleexpression ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3533:1: (lv_exp_40_0= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3533:1: (lv_exp_40_0= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3534:3: lv_exp_40_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_2_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava7613);
                        lv_exp_40_0=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }


                        }
                        break;
                    case 4 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3551:6: ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3551:6: ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3551:7: ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3551:7: ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3552:1: ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3552:1: ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3553:1: (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3553:1: (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' )
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
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3554:3: lv_operador_41_1= '>>='
                                {
                                lv_operador_41_1=(Token)match(input,85,FOLLOW_85_in_synpred178_InternalSimpleJava7641); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3566:8: lv_operador_41_2= '<<'
                                {
                                lv_operador_41_2=(Token)match(input,86,FOLLOW_86_in_synpred178_InternalSimpleJava7670); if (state.failed) return ;

                                }
                                break;
                            case 3 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3578:8: lv_operador_41_3= '>>'
                                {
                                lv_operador_41_3=(Token)match(input,87,FOLLOW_87_in_synpred178_InternalSimpleJava7699); if (state.failed) return ;

                                }
                                break;
                            case 4 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3590:8: lv_operador_41_4= '>>>'
                                {
                                lv_operador_41_4=(Token)match(input,88,FOLLOW_88_in_synpred178_InternalSimpleJava7728); if (state.failed) return ;

                                }
                                break;

                        }


                        }


                        }

                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3605:2: ( (lv_exp_42_0= ruleexpression ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3606:1: (lv_exp_42_0= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3606:1: (lv_exp_42_0= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3607:3: lv_exp_42_0= ruleexpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpExpressionParserRuleCall_0_4_3_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava7765);
                        lv_exp_42_0=ruleexpression();

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

        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3623:5: ( (lv_expressoes_43_0= ruleexpression_aux ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3624:1: (lv_expressoes_43_0= ruleexpression_aux )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3624:1: (lv_expressoes_43_0= ruleexpression_aux )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3625:3: lv_expressoes_43_0= ruleexpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressoesExpression_auxParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_aux_in_synpred178_InternalSimpleJava7789);
        lv_expressoes_43_0=ruleexpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred178_InternalSimpleJava

    // $ANTLR start synpred182_InternalSimpleJava
    public final void synpred182_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_argumentos_1_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3755:2: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3755:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3755:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3755:3: ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')'
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3755:3: ( ( '(' )=>otherlv_0= '(' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3755:4: ( '(' )=>otherlv_0= '('
        {
        otherlv_0=(Token)match(input,31,FOLLOW_31_in_synpred182_InternalSimpleJava8140); if (state.failed) return ;

        }

        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3760:2: ( (lv_argumentos_1_0= rulearglist ) )?
        int alt112=2;
        int LA112_0 = input.LA(1);

        if ( ((LA112_0>=RULE_IDENTIFIER && LA112_0<=RULE_STRING)||LA112_0==31||(LA112_0>=55 && LA112_0<=58)||(LA112_0>=61 && LA112_0<=63)||(LA112_0>=91 && LA112_0<=103)) ) {
            alt112=1;
        }
        switch (alt112) {
            case 1 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3761:1: (lv_argumentos_1_0= rulearglist )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3761:1: (lv_argumentos_1_0= rulearglist )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3762:3: lv_argumentos_1_0= rulearglist
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getCreating_auxAccess().getArgumentosArglistParserRuleCall_0_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_rulearglist_in_synpred182_InternalSimpleJava8162);
                lv_argumentos_1_0=rulearglist();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_2=(Token)match(input,32,FOLLOW_32_in_synpred182_InternalSimpleJava8175); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred182_InternalSimpleJava

    // $ANTLR start synpred183_InternalSimpleJava
    public final void synpred183_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3783:8: ( '[' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3783:10: '['
        {
        match(input,33,FOLLOW_33_in_synpred183_InternalSimpleJava8195); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred183_InternalSimpleJava

    // $ANTLR start synpred194_InternalSimpleJava
    public final void synpred194_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_expressoesArgumentos_0_0 = null;

        EObject lv_expressoesArgumentos_2_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4189:2: ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4189:2: ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4189:2: ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4189:3: ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )*
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4189:3: ( (lv_expressoesArgumentos_0_0= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4190:1: (lv_expressoesArgumentos_0_0= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4190:1: (lv_expressoesArgumentos_0_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4191:3: lv_expressoesArgumentos_0_0= ruleexpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getArglistAccess().getExpressoesArgumentosExpressionParserRuleCall_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred194_InternalSimpleJava9144);
        lv_expressoesArgumentos_0_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4207:2: (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )*
        loop113:
        do {
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==27) ) {
                alt113=1;
            }


            switch (alt113) {
        	case 1 :
        	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4207:4: otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) )
        	    {
        	    otherlv_1=(Token)match(input,27,FOLLOW_27_in_synpred194_InternalSimpleJava9157); if (state.failed) return ;
        	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4211:1: ( (lv_expressoesArgumentos_2_0= ruleexpression ) )
        	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4212:1: (lv_expressoesArgumentos_2_0= ruleexpression )
        	    {
        	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4212:1: (lv_expressoesArgumentos_2_0= ruleexpression )
        	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4213:3: lv_expressoesArgumentos_2_0= ruleexpression
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getArglistAccess().getExpressoesArgumentosExpressionParserRuleCall_0_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleexpression_in_synpred194_InternalSimpleJava9178);
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
    // $ANTLR end synpred194_InternalSimpleJava

    // $ANTLR start synpred197_InternalSimpleJava
    public final void synpred197_InternalSimpleJava_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token lv_nomePacote_1_0=null;
        EObject lv_pacote_2_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4397:3: (otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4397:3: otherlv_0= '.' ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) ) ( (lv_pacote_2_0= rulepackage_name_aux ) )
        {
        otherlv_0=(Token)match(input,59,FOLLOW_59_in_synpred197_InternalSimpleJava9529); if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4401:1: ( (lv_nomePacote_1_0= RULE_IDENTIFIER ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4402:1: (lv_nomePacote_1_0= RULE_IDENTIFIER )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4402:1: (lv_nomePacote_1_0= RULE_IDENTIFIER )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4403:3: lv_nomePacote_1_0= RULE_IDENTIFIER
        {
        lv_nomePacote_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_synpred197_InternalSimpleJava9546); if (state.failed) return ;

        }


        }

        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4419:2: ( (lv_pacote_2_0= rulepackage_name_aux ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4420:1: (lv_pacote_2_0= rulepackage_name_aux )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4420:1: (lv_pacote_2_0= rulepackage_name_aux )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:4421:3: lv_pacote_2_0= rulepackage_name_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPackage_name_auxAccess().getPacotePackage_name_auxParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_rulepackage_name_aux_in_synpred197_InternalSimpleJava9572);
        lv_pacote_2_0=rulepackage_name_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred197_InternalSimpleJava

    // Delegated rules

    public final boolean synpred178_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred178_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred183_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred183_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred194_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred194_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred197_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred197_InternalSimpleJava_fragment(); // can never throw exception
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
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA111 dfa111 = new DFA111(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA107 dfa107 = new DFA107(this);
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\13\30\2\uffff";
    static final String DFA6_maxS =
        "\13\157\2\uffff";
    static final String DFA6_acceptS =
        "\13\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\61\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\61\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\61\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\61\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\61\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\61\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\61\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\61\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\61\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\61\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
            "\1\13\5\uffff\1\14\4\uffff\1\7\22\uffff\1\4\61\uffff\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
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
            return "310:3: ( ( (lv_declaracaoClasse_1_0= ruleclass_declaration ) ) | ( (lv_declaracaoInterface_2_0= ruleinterface_declaration ) ) )";
        }
    }
    static final String DFA11_eotS =
        "\17\uffff";
    static final String DFA11_eofS =
        "\17\uffff";
    static final String DFA11_minS =
        "\1\4\2\uffff\12\4\1\uffff\1\4";
    static final String DFA11_maxS =
        "\1\157\2\uffff\12\157\1\uffff\1\157";
    static final String DFA11_acceptS =
        "\1\uffff\1\3\1\1\12\uffff\1\2\1\uffff";
    static final String DFA11_specialS =
        "\17\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\15\uffff\1\2\2\uffff\1\2\2\uffff\1\15\4\uffff\1\1\1\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\6\51\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "",
            "",
            "\1\2\23\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\51\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\23\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\51\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\23\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\51\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\23\uffff\1\15\3\uffff\1\2\2\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\51\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\23\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\51\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\23\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\51\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\23\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\51\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\23\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\51\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\23\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\51\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "\1\2\23\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\51\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14",
            "",
            "\1\2\23\uffff\1\15\6\uffff\1\2\3\uffff\1\11\5\uffff\1\2\14\uffff\1\16\51\uffff\10\2\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\14"
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
            return "()* loopback of 517:1: ( ( (lv_corpoClasse_10_0= rulefield_declaration ) ) | ( (lv_declaracaoClasse_11_0= ruleclass_declaration ) ) )*";
        }
    }
    static final String DFA17_eotS =
        "\30\uffff";
    static final String DFA17_eofS =
        "\30\uffff";
    static final String DFA17_minS =
        "\1\4\24\0\3\uffff";
    static final String DFA17_maxS =
        "\1\157\24\0\3\uffff";
    static final String DFA17_acceptS =
        "\25\uffff\1\3\1\1\1\2";
    static final String DFA17_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\3\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\23\32\uffff\1\25\3\uffff\1\7\5\uffff\1\24\14\uffff\1\4\51\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\10\1\11\1\12",
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
            return "721:3: ( ( (lv_declaracaoMetodo_1_0= rulemethod_declaration ) ) | ( (lv_declaracaoConstrutor_2_0= ruleconstructor_declaration ) ) | ( (lv_declaracaoVariavel_3_0= rulevariable_declaration ) ) )";
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
            "\1\23\4\26\11\uffff\1\60\11\uffff\1\45\2\uffff\1\25\3\uffff\1\7\1\54\1\55\1\uffff\1\56\1\57\1\1\1\uffff\1\46\1\uffff\1\47\1\50\1\51\1\52\2\uffff\1\53\2\uffff\1\1\4\26\2\uffff\3\26\33\uffff\4\26\1\uffff\20\1",
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
            return "1127:1: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )=> (lv_declaracaoVariavel_0_0= rulevariable_declaration ) ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_1_0= ruleexpression ) ) otherlv_2= ';' ) | ( (lv_bloco_3_0= rulestatement_block ) ) | ( (lv_corpoIf_4_0= ruleif_statement ) ) | ( (lv_corpoDoWhile_5_0= ruledo_statement ) ) | ( (lv_corpoWhile_6_0= rulewhile_statement ) ) | ( (lv_corpoFor_7_0= rulefor_statement ) ) | ( (lv_corpoTryCatch_8_0= ruletry_statement ) ) | ( (lv_corpoSwitchCase_9_0= ruleswitch_statement ) ) | (otherlv_10= 'synchronized' otherlv_11= '(' ( (lv_expressaoSynchronized_12_0= ruleexpression ) ) otherlv_13= ')' ( (lv_corpoSynchronize_14_0= rulestatement ) ) ) | (otherlv_15= 'return' ( (lv_return_16_0= ruleexpression ) )? otherlv_17= ';' ) | (otherlv_18= 'throw' ( (lv_exececao_19_0= ruleexpression ) ) otherlv_20= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER otherlv_22= ':' this_statement_23= rulestatement ) | (otherlv_24= 'break' ( (lv_break_25_0= RULE_IDENTIFIER ) )? otherlv_26= ';' ) | (otherlv_27= 'continue' ( (lv_continue_28_0= RULE_IDENTIFIER ) )? otherlv_29= ';' ) | otherlv_30= ';' )";
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
        "\1\4\1\uffff\1\4\2\uffff\1\42\1\4";
    static final String DFA31_maxS =
        "\1\147\1\uffff\1\73\2\uffff\1\42\1\52";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\2\uffff";
    static final String DFA31_specialS =
        "\7\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\2\32\uffff\1\4\11\uffff\1\3\66\uffff\10\1",
            "",
            "\1\1\15\uffff\1\4\10\uffff\2\4\2\uffff\1\1\1\uffff\1\5\10\uffff\1\4\20\uffff\1\1",
            "",
            "",
            "\1\6",
            "\1\1\15\uffff\1\4\10\uffff\2\4\2\uffff\1\1\1\uffff\1\5\10\uffff\1\4"
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
            return "1545:3: ( ( (lv_tipoVariavel_1_0= ruletype ) ) | otherlv_2= 'void' )?";
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
            "\1\23\4\26\11\uffff\1\45\14\uffff\1\25\3\uffff\1\1\5\uffff\1\1\14\uffff\1\1\4\26\2\uffff\3\26\33\uffff\4\26\1\uffff\20\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "2084:1: ( ( ( ( rulevariable_declaration ) )=> (lv_declaracaoVariavel_2_0= rulevariable_declaration ) ) | ( ( (lv_expressaoDeclaracao_3_0= ruleexpression ) ) otherlv_4= ';' ) | otherlv_5= ';' )";
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
        "\54\uffff";
    static final String DFA52_eofS =
        "\1\2\53\uffff";
    static final String DFA52_minS =
        "\1\22\1\0\52\uffff";
    static final String DFA52_maxS =
        "\1\132\1\0\52\uffff";
    static final String DFA52_acceptS =
        "\2\uffff\1\2\50\uffff\1\1";
    static final String DFA52_specialS =
        "\1\uffff\1\0\52\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\2\10\uffff\3\2\1\uffff\2\2\1\1\1\2\3\uffff\1\2\24\uffff\40\2",
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
            return "2685:2: ( ( '[' )=> ( (lv_parametros_4_0= ruleaux ) ) )?";
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
                        if ( (synpred103_InternalSimpleJava()) ) {s = 43;}

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
        "\54\uffff";
    static final String DFA55_eofS =
        "\1\1\53\uffff";
    static final String DFA55_minS =
        "\1\22\46\uffff\1\0\4\uffff";
    static final String DFA55_maxS =
        "\1\132\46\uffff\1\0\4\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\2\51\uffff\1\1";
    static final String DFA55_specialS =
        "\47\uffff\1\0\4\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\1\10\uffff\1\1\1\47\1\1\1\uffff\4\1\3\uffff\1\1\24\uffff\40\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 2739:3: ( (lv_novo_10_0= rulenew ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_39 = input.LA(1);

                         
                        int index55_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_InternalSimpleJava()) ) {s = 43;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_39);
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
            "\1\20\4\1\26\uffff\1\1\27\uffff\4\1\2\uffff\3\1\33\uffff\4\1\1\uffff\10\22",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "2778:1: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=> (lv_expressao_0_0= ruleexpression ) ) otherlv_1= ')' ) | (this_type_2= ruletype otherlv_3= ')' ( (lv_expressao_4_0= ruleexpression ) ) ) )";
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
            "\1\11\4\5\26\uffff\1\12\27\uffff\1\4\1\6\1\7\1\10\2\uffff\3\2\33\uffff\3\1\1\3",
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
            return "2868:2: ( ( (lv_tipoLogical_0_0= rulelogical_expression ) ) | ( (lv_tipoNumeric_1_0= rulenumeric_expression ) ) | ( (lv_tipoBit_2_0= rulebit_expression ) ) | ( (lv_new_3_0= rulecreating_expression ) ) | ( (lv_literal_4_0= ruleliteral_expression ) ) | otherlv_5= 'null' | otherlv_6= 'super' | otherlv_7= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (otherlv_9= '(' this_exp_aux_10= ruleexp_aux ) )";
        }
    }
    static final String DFA67_eotS =
        "\46\uffff";
    static final String DFA67_eofS =
        "\1\44\45\uffff";
    static final String DFA67_minS =
        "\1\22\43\0\2\uffff";
    static final String DFA67_maxS =
        "\1\132\43\0\2\uffff";
    static final String DFA67_acceptS =
        "\44\uffff\1\2\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\35\1\41\1\25\1\0\1\34\1\20\1\7\1\16\1\12\1\10\1\22\1\32\1\24\1\11\1\26\1\3\1\42\1\4\1\5\1\40\1\31\1\1\1\13\1\23\1\14\1\33\1\6\1\37\1\2\1\27\1\17\1\36\1\15\1\21\1\30\2\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\44\10\uffff\1\4\2\44\1\uffff\1\1\1\44\1\2\1\44\3\uffff\1\44\24\uffff\1\3\1\5\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\6\1\7",
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
            return "3038:1: ( ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) ) ) ( (lv_expressoes_43_0= ruleexpression_aux ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_4 = input.LA(1);

                         
                        int index67_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_22 = input.LA(1);

                         
                        int index67_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_22);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_29 = input.LA(1);

                         
                        int index67_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_29);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA67_16 = input.LA(1);

                         
                        int index67_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA67_18 = input.LA(1);

                         
                        int index67_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_18);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA67_19 = input.LA(1);

                         
                        int index67_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_19);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA67_27 = input.LA(1);

                         
                        int index67_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_27);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA67_7 = input.LA(1);

                         
                        int index67_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA67_10 = input.LA(1);

                         
                        int index67_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA67_14 = input.LA(1);

                         
                        int index67_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA67_9 = input.LA(1);

                         
                        int index67_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_9);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA67_23 = input.LA(1);

                         
                        int index67_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_23);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA67_25 = input.LA(1);

                         
                        int index67_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_25);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA67_33 = input.LA(1);

                         
                        int index67_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_33);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA67_8 = input.LA(1);

                         
                        int index67_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_8);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA67_31 = input.LA(1);

                         
                        int index67_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_31);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA67_6 = input.LA(1);

                         
                        int index67_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_6);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA67_34 = input.LA(1);

                         
                        int index67_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_34);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA67_11 = input.LA(1);

                         
                        int index67_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_11);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA67_24 = input.LA(1);

                         
                        int index67_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_24);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA67_13 = input.LA(1);

                         
                        int index67_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_13);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA67_3 = input.LA(1);

                         
                        int index67_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_3);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA67_15 = input.LA(1);

                         
                        int index67_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_15);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA67_30 = input.LA(1);

                         
                        int index67_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_30);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA67_35 = input.LA(1);

                         
                        int index67_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_35);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA67_21 = input.LA(1);

                         
                        int index67_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_21);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA67_12 = input.LA(1);

                         
                        int index67_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_12);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA67_26 = input.LA(1);

                         
                        int index67_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_26);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA67_5 = input.LA(1);

                         
                        int index67_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_5);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA67_32 = input.LA(1);

                         
                        int index67_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_32);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA67_28 = input.LA(1);

                         
                        int index67_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_28);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA67_20 = input.LA(1);

                         
                        int index67_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_20);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA67_17 = input.LA(1);

                         
                        int index67_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_17);
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
        "\45\uffff";
    static final String DFA66_eofS =
        "\45\uffff";
    static final String DFA66_minS =
        "\1\33\5\uffff\2\0\10\uffff\2\0\23\uffff";
    static final String DFA66_maxS =
        "\1\132\5\uffff\2\0\10\uffff\2\0\23\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\6\uffff\1\3\1\uffff\1\4\7\uffff\1\5\21\uffff\1\2";
    static final String DFA66_specialS =
        "\6\uffff\1\0\1\1\10\uffff\1\2\1\3\23\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\1\3\uffff\1\1\1\uffff\1\1\31\uffff\2\1\2\10\6\12\1\20\1\21\22\22\1\6\1\7",
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
            return "3038:2: ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) ) )";
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
                        if ( (synpred143_InternalSimpleJava()) ) {s = 36;}

                        else if ( (synpred156_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index66_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_7 = input.LA(1);

                         
                        int index66_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred143_InternalSimpleJava()) ) {s = 36;}

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
        "\1\77\11\uffff";
    static final String DFA61_maxS =
        "\1\132\11\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA61_specialS =
        "\12\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\22\uffff\2\1",
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
            return "3187:7: ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) )";
        }
    }
    static final String DFA62_eotS =
        "\14\uffff";
    static final String DFA62_eofS =
        "\14\uffff";
    static final String DFA62_minS =
        "\1\105\1\4\12\uffff";
    static final String DFA62_maxS =
        "\1\115\1\136\12\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\10\1\11\1\12\1\7\1\1";
    static final String DFA62_specialS =
        "\14\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\10\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\5\13\26\uffff\1\13\27\uffff\4\13\2\uffff\3\13\7\uffff\1\12\23\uffff\4\13",
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

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "3348:8: (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' )";
        }
    }
    static final String DFA72_eotS =
        "\54\uffff";
    static final String DFA72_eofS =
        "\1\2\53\uffff";
    static final String DFA72_minS =
        "\1\22\1\0\52\uffff";
    static final String DFA72_maxS =
        "\1\132\1\0\52\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\50\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\52\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\2\10\uffff\3\2\1\uffff\1\1\3\2\3\uffff\1\2\24\uffff\40\2",
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
            return "3755:1: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argumentos_1_0= rulearglist ) )? otherlv_2= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (otherlv_4= '[' otherlv_5= ']' )* ) )";
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
                        if ( (synpred182_InternalSimpleJava()) ) {s = 43;}

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
        "\54\uffff";
    static final String DFA70_eofS =
        "\1\2\53\uffff";
    static final String DFA70_minS =
        "\1\22\1\0\52\uffff";
    static final String DFA70_maxS =
        "\1\132\1\0\52\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\50\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\52\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\2\10\uffff\3\2\1\uffff\2\2\1\1\1\2\3\uffff\1\2\24\uffff\40\2",
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
            return "3783:7: ( ( '[' )=>this_aux_3= ruleaux )?";
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
                        if ( (synpred183_InternalSimpleJava()) ) {s = 43;}

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
            "\1\20\4\1\26\uffff\1\1\27\uffff\4\1\2\uffff\3\1\33\uffff\4\1\1\22\10\23",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "4189:1: ( ( ( (lv_expressoesArgumentos_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressoesArgumentos_2_0= ruleexpression ) ) )* ) | (otherlv_3= '\"' this_STRING_4= RULE_STRING otherlv_5= '\"' ) | ( ( (lv_tipoParametro_6_0= ruletype ) ) ( (lv_nomeParametro_7_0= RULE_IDENTIFIER ) ) (otherlv_8= ',' ( (lv_tipoParametro_9_0= ruletype ) ) ( (lv_nomeParametro_10_0= RULE_IDENTIFIER ) ) )* ) )";
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
                        if ( (synpred194_InternalSimpleJava()) ) {s = 1;}

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
        "\1\77\11\uffff";
    static final String DFA100_maxS =
        "\1\132\11\uffff";
    static final String DFA100_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA100_specialS =
        "\12\uffff}>";
    static final String[] DFA100_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\22\uffff\2\1",
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
            return "3187:7: ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) )";
        }
    }
    static final String DFA111_eotS =
        "\45\uffff";
    static final String DFA111_eofS =
        "\45\uffff";
    static final String DFA111_minS =
        "\1\33\5\uffff\2\0\10\uffff\2\0\23\uffff";
    static final String DFA111_maxS =
        "\1\132\5\uffff\2\0\10\uffff\2\0\23\uffff";
    static final String DFA111_acceptS =
        "\1\uffff\1\1\6\uffff\1\3\1\uffff\1\4\7\uffff\1\5\21\uffff\1\2";
    static final String DFA111_specialS =
        "\6\uffff\1\0\1\1\10\uffff\1\2\1\3\23\uffff}>";
    static final String[] DFA111_transitionS = {
            "\1\1\3\uffff\1\1\1\uffff\1\1\31\uffff\2\1\2\10\6\12\1\20\1\21\22\22\1\6\1\7",
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
            return "3038:2: ( ( (otherlv_0= '(' (this_arglist_1= rulearglist )? otherlv_2= ')' ) | this_aux_3= ruleaux | (otherlv_4= '.' this_expression_5= ruleexpression ) | (otherlv_6= ',' this_expression_7= ruleexpression ) | (otherlv_8= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) ( (lv_exp_11_0= ruleexpression ) ) ) | ( ( (lv_opedador_12_1= '++' | lv_opedador_12_2= '--' ) ) ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) ) ( (lv_exp_22_0= ruleexpression ) ) ) | ( ( (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' ) this_expression_34= ruleexpression ) | (otherlv_35= '?' this_expression_36= ruleexpression otherlv_37= ':' ( (lv_expressao_38_0= ruleexpression ) ) ) | ( ( ( (lv_opedador_39_1= '>' | lv_opedador_39_2= '<' | lv_opedador_39_3= '>=' | lv_opedador_39_4= '<=' | lv_opedador_39_5= '==' | lv_opedador_39_6= '!=' ) ) ) ( (lv_exp_40_0= ruleexpression ) ) ) | ( ( ( (lv_operador_41_1= '>>=' | lv_operador_41_2= '<<' | lv_operador_41_3= '>>' | lv_operador_41_4= '>>>' ) ) ) ( (lv_exp_42_0= ruleexpression ) ) ) ) )";
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
                        if ( (synpred143_InternalSimpleJava()) ) {s = 36;}

                        else if ( (synpred156_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index111_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA111_7 = input.LA(1);

                         
                        int index111_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred143_InternalSimpleJava()) ) {s = 36;}

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
        "\1\77\11\uffff";
    static final String DFA106_maxS =
        "\1\132\11\uffff";
    static final String DFA106_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA106_specialS =
        "\12\uffff}>";
    static final String[] DFA106_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\22\uffff\2\1",
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
            return "3187:7: ( ( ( '+' | '+=' )=>this_mais_aux_13= rulemais_aux ) | ( (lv_opedador_14_0= '-' ) ) | ( (lv_opedador_15_0= '-=' ) ) | ( (lv_opedador_16_0= '*' ) ) | ( (lv_opedador_17_0= '*=' ) ) | ( (lv_opedador_18_0= '/' ) ) | ( (lv_opedador_19_0= '/=' ) ) | ( (lv_opedador_20_0= '%' ) ) | ( (lv_opedador_21_0= '%=' ) ) )";
        }
    }
    static final String DFA107_eotS =
        "\14\uffff";
    static final String DFA107_eofS =
        "\14\uffff";
    static final String DFA107_minS =
        "\1\105\1\4\12\uffff";
    static final String DFA107_maxS =
        "\1\115\1\136\12\uffff";
    static final String DFA107_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\10\1\11\1\12\1\7\1\1";
    static final String DFA107_specialS =
        "\14\uffff}>";
    static final String[] DFA107_transitionS = {
            "\1\10\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\5\13\26\uffff\1\13\27\uffff\4\13\2\uffff\3\13\7\uffff\1\12\23\uffff\4\13",
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

    static final short[] DFA107_eot = DFA.unpackEncodedString(DFA107_eotS);
    static final short[] DFA107_eof = DFA.unpackEncodedString(DFA107_eofS);
    static final char[] DFA107_min = DFA.unpackEncodedStringToUnsignedChars(DFA107_minS);
    static final char[] DFA107_max = DFA.unpackEncodedStringToUnsignedChars(DFA107_maxS);
    static final short[] DFA107_accept = DFA.unpackEncodedString(DFA107_acceptS);
    static final short[] DFA107_special = DFA.unpackEncodedString(DFA107_specialS);
    static final short[][] DFA107_transition;

    static {
        int numStates = DFA107_transitionS.length;
        DFA107_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA107_transition[i] = DFA.unpackEncodedString(DFA107_transitionS[i]);
        }
    }

    class DFA107 extends DFA {

        public DFA107(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 107;
            this.eot = DFA107_eot;
            this.eof = DFA107_eof;
            this.min = DFA107_min;
            this.max = DFA107_max;
            this.accept = DFA107_accept;
            this.special = DFA107_special;
            this.transition = DFA107_transition;
        }
        public String getDescription() {
            return "3348:8: (otherlv_23= 'ampersand' | otherlv_24= 'ampersand=' | otherlv_25= '|' | otherlv_26= '|=' | otherlv_27= '^' | otherlv_28= '^=' | (otherlv_29= 'ampersand' otherlv_30= 'ampersand' ) | otherlv_31= '||=' | ( ( '%' )=>otherlv_32= '%' ) | otherlv_33= '%=' )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompilation_unit_in_ruleModel136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompilation_unit_in_entryRulecompilation_unit171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompilation_unit181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepackage_statement_in_rulecompilation_unit227 = new BitSet(new long[]{0x0040000841280002L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_ruleimport_statement_in_rulecompilation_unit249 = new BitSet(new long[]{0x0040000841280002L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_ruletype_declaration_in_rulecompilation_unit271 = new BitSet(new long[]{0x0040000841200002L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_rulepackage_statement_in_entryRulepackage_statement308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepackage_statement318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulepackage_statement355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_rulepackage_statement376 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulepackage_statement388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimport_statement_in_entryRuleimport_statement424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimport_statement434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleimport_statement471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleimport_statement492 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_20_in_ruleimport_statement505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleimport_statement523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_declaration_in_entryRuletype_declaration560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_declaration570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_ruletype_declaration615 = new BitSet(new long[]{0x0040000841200000L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_ruleclass_declaration_in_ruletype_declaration638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinterface_declaration_in_ruletype_declaration665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_entryRuledoc_comment703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledoc_comment714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruledoc_comment752 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruledoc_comment765 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruledoc_comment778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclass_declaration_in_entryRuleclass_declaration818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclass_declaration828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_ruleclass_declaration874 = new BitSet(new long[]{0x0040000801000000L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_24_in_ruleclass_declaration887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleclass_declaration904 = new BitSet(new long[]{0x0000000016000000L});
    public static final BitSet FOLLOW_25_in_ruleclass_declaration922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleclass_declaration943 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_26_in_ruleclass_declaration958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleclass_declaration979 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleclass_declaration992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleclass_declaration1013 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_ruleclass_declaration1029 = new BitSet(new long[]{0x00400208A1240010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulefield_declaration_in_ruleclass_declaration1051 = new BitSet(new long[]{0x00400208A1240010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleclass_declaration_in_ruleclass_declaration1078 = new BitSet(new long[]{0x00400208A1240010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_29_in_ruleclass_declaration1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinterface_declaration_in_entryRuleinterface_declaration1128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinterface_declaration1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_ruleinterface_declaration1184 = new BitSet(new long[]{0x0040000840000000L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_30_in_ruleinterface_declaration1197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleinterface_declaration1214 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_25_in_ruleinterface_declaration1232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleinterface_declaration1253 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleinterface_declaration1266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleinterface_declaration1287 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_ruleinterface_declaration1303 = new BitSet(new long[]{0x00400208A0240010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulefield_declaration_in_ruleinterface_declaration1324 = new BitSet(new long[]{0x00400208A0240010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_29_in_ruleinterface_declaration1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_declaration_in_entryRulefield_declaration1373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_declaration1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_rulefield_declaration1429 = new BitSet(new long[]{0x0040020880200010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_rulefield_declaration1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_rulefield_declaration1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulefield_declaration1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatic_initializer_in_rulefield_declaration1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulefield_declaration1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_entryRulemethod_declaration1589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemethod_declaration1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_rulemethod_declaration1645 = new BitSet(new long[]{0x0040000800000010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruletype_in_rulemethod_declaration1667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulemethod_declaration1684 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulemethod_declaration1701 = new BitSet(new long[]{0x0040000900000010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleparameter_list_in_rulemethod_declaration1722 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulemethod_declaration1735 = new BitSet(new long[]{0x0000000210040000L});
    public static final BitSet FOLLOW_33_in_rulemethod_declaration1748 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulemethod_declaration1760 = new BitSet(new long[]{0x0000000210040000L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulemethod_declaration1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulemethod_declaration1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_in_entryRuleparameter1839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleparameter1895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleparameter1912 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleparameter1930 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleparameter1942 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleparameter_list_in_entryRuleparameter_list1980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_list1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_in_ruleparameter_list2036 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleparameter_list2049 = new BitSet(new long[]{0x0040000800000010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleparameter_in_ruleparameter_list2070 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_entryRulestatement_block2108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_block2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulestatement_block2155 = new BitSet(new long[]{0xE7C9EBB8B02401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_block2176 = new BitSet(new long[]{0xE7C9EBB8B02401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_29_in_rulestatement_block2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement2225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulestatement2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement2488 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulestatement2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_rulestatement2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledo_statement_in_rulestatement2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rulestatement2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rulestatement2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletry_statement_in_rulestatement2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitch_statement_in_rulestatement2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulestatement2709 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulestatement2721 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement2742 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulestatement2754 = new BitSet(new long[]{0xE7C9EBB8902401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulestatement2795 = new BitSet(new long[]{0xE7800000800401F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement2816 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulestatement2849 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement2870 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement2901 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulestatement2912 = new BitSet(new long[]{0xE7C9EBB8902401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulestatement2956 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement2973 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulestatement3011 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement3028 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulestatement3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration3101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_rulevariable_declaration3157 = new BitSet(new long[]{0x0040020880200010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruletype_in_rulevariable_declaration3180 = new BitSet(new long[]{0x0040020880200010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_41_in_rulevariable_declaration3198 = new BitSet(new long[]{0x0040020880200010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulevariable_declarator_in_rulevariable_declaration3221 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_27_in_rulevariable_declaration3234 = new BitSet(new long[]{0x0040020880200010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulevariable_declarator_in_rulevariable_declaration3255 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_18_in_rulevariable_declaration3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulevariable_declaration3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declarator_in_entryRulevariable_declarator3334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declarator3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulevariable_declarator3382 = new BitSet(new long[]{0xE7C00009800001F0L,0x0000FFFFF8000000L});
    public static final BitSet FOLLOW_rulearglist_in_rulevariable_declarator3408 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulevariable_declarator3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariable_declarator3446 = new BitSet(new long[]{0x0000040200000002L});
    public static final BitSet FOLLOW_33_in_rulevariable_declarator3464 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulevariable_declarator3476 = new BitSet(new long[]{0x0000040200000002L});
    public static final BitSet FOLLOW_42_in_rulevariable_declarator3491 = new BitSet(new long[]{0xE7800000900001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_declarator3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_entryRulevariable_initializer3551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_initializer3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulevariable_initializer3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulevariable_initializer3626 = new BitSet(new long[]{0xE7800000B00001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_initializer3648 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_27_in_rulevariable_initializer3661 = new BitSet(new long[]{0xE7800000900001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_initializer3682 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_27_in_rulevariable_initializer3697 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulevariable_initializer3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_entryRuleif_statement3750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_statement3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleif_statement3797 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleif_statement3809 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleif_statement3830 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleif_statement3842 = new BitSet(new long[]{0xE7C9EBB8902401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement3863 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleif_statement3895 = new BitSet(new long[]{0xE7C9EBB8902401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledo_statement_in_entryRuledo_statement3955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledo_statement3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruledo_statement4002 = new BitSet(new long[]{0xE7C9EBB8902401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruledo_statement4023 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruledo_statement4035 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruledo_statement4047 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruledo_statement4068 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruledo_statement4080 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruledo_statement4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement4128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulewhile_statement4175 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulewhile_statement4187 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulewhile_statement4208 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulewhile_statement4220 = new BitSet(new long[]{0xE7C9EBB8902401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulewhile_statement4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_entryRulefor_statement4277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_statement4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulefor_statement4324 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulefor_statement4336 = new BitSet(new long[]{0xE7C00208802401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulefor_statement4368 = new BitSet(new long[]{0xE7800000800401F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4396 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulefor_statement4408 = new BitSet(new long[]{0xE7800000800401F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_18_in_rulefor_statement4427 = new BitSet(new long[]{0xE7800000800401F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4449 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulefor_statement4462 = new BitSet(new long[]{0xE7800001800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4483 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulefor_statement4496 = new BitSet(new long[]{0xE7C9EBB8902401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulefor_statement4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletry_statement_in_entryRuletry_statement4553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletry_statement4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruletry_statement4600 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruletry_statement4621 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_ruletry_statement4670 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruletry_statement4682 = new BitSet(new long[]{0x0040000800000010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleparameter_in_ruletry_statement4703 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruletry_statement4715 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruletry_statement4736 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_50_in_ruletry_statement4771 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruletry_statement4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitch_statement_in_entryRuleswitch_statement4831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleswitch_statement4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleswitch_statement4878 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleswitch_statement4890 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleswitch_statement4911 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleswitch_statement4923 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleswitch_statement4935 = new BitSet(new long[]{0xE7F9EBB8B02401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_52_in_ruleswitch_statement4949 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleswitch_statement4970 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleswitch_statement4982 = new BitSet(new long[]{0xE7F9EBB8B02401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_53_in_ruleswitch_statement5002 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleswitch_statement5014 = new BitSet(new long[]{0xE7F9EBB8B02401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleswitch_statement5042 = new BitSet(new long[]{0xE7F9EBB8B02401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_29_in_ruleswitch_statement5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_entryRuleconstructor_declaration5092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstructor_declaration5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_ruleconstructor_declaration5148 = new BitSet(new long[]{0x0040020800000010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruletype_in_ruleconstructor_declaration5171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_41_in_ruleconstructor_declaration5189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstructor_declaration5208 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleconstructor_declaration5225 = new BitSet(new long[]{0x0040000900000010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleparameter_list_in_ruleconstructor_declaration5246 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleconstructor_declaration5259 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruleconstructor_declaration5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatic_initializer_in_entryRulestatic_initializer5316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatic_initializer5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulestatic_initializer5363 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulestatic_initializer5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecreating_expression_in_entryRulecreating_expression5420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecreating_expression5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulecreating_expression5467 = new BitSet(new long[]{0x0000000080000010L,0x000000FF00000000L});
    public static final BitSet FOLLOW_rulename_in_rulecreating_expression5490 = new BitSet(new long[]{0x0000000290000000L});
    public static final BitSet FOLLOW_rulecreating_aux_in_rulecreating_expression5511 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulecreating_expression5540 = new BitSet(new long[]{0x0000000210000002L});
    public static final BitSet FOLLOW_ruleaux_in_rulecreating_expression5569 = new BitSet(new long[]{0x0000000210000002L});
    public static final BitSet FOLLOW_33_in_rulecreating_expression5584 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulecreating_expression5596 = new BitSet(new long[]{0x0000000210000002L});
    public static final BitSet FOLLOW_31_in_rulecreating_expression5618 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulecreating_expression5639 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulecreating_expression5651 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulenew_in_rulecreating_expression5674 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleexp_aux_in_entryRuleexp_aux5711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexp_aux5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexp_aux5877 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleexp_aux5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleexp_aux5922 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleexp_aux5933 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexp_aux5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression5991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogical_expression_in_ruleexpression6048 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulenumeric_expression_in_ruleexpression6075 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulebit_expression_in_ruleexpression6102 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulecreating_expression_in_ruleexpression6129 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_ruleliteral_expression_in_ruleexpression6156 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_56_in_ruleexpression6174 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_57_in_ruleexpression6192 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_58_in_ruleexpression6210 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleexpression6227 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_31_in_ruleexpression6245 = new BitSet(new long[]{0xE7C00008800001F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_ruleexp_aux_in_ruleexpression6270 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_entryRuleexpression_aux6328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_aux6338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleexpression_aux6378 = new BitSet(new long[]{0xE7C00009800001F0L,0x0000FFFFF8000000L});
    public static final BitSet FOLLOW_rulearglist_in_ruleexpression_aux6404 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleexpression_aux6417 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_ruleaux_in_ruleexpression_aux6449 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_59_in_ruleexpression_aux6467 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux6492 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_27_in_ruleexpression_aux6511 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux6536 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_60_in_ruleexpression_aux6555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleexpression_aux6586 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_ruleexpression_aux6635 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux6656 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_61_in_ruleexpression_aux6683 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_62_in_ruleexpression_aux6712 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_ruleexpression_aux6776 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_63_in_ruleexpression_aux6800 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_64_in_ruleexpression_aux6837 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_65_in_ruleexpression_aux6874 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_66_in_ruleexpression_aux6911 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_67_in_ruleexpression_aux6948 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_68_in_ruleexpression_aux6985 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_69_in_ruleexpression_aux7022 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_70_in_ruleexpression_aux7059 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7094 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_71_in_ruleexpression_aux7116 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_72_in_ruleexpression_aux7134 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_73_in_ruleexpression_aux7152 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_74_in_ruleexpression_aux7170 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_75_in_ruleexpression_aux7188 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_76_in_ruleexpression_aux7206 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_71_in_ruleexpression_aux7225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleexpression_aux7237 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_77_in_ruleexpression_aux7256 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_69_in_ruleexpression_aux7282 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_70_in_ruleexpression_aux7301 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7327 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_78_in_ruleexpression_aux7346 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7371 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleexpression_aux7382 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7403 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_79_in_ruleexpression_aux7431 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_80_in_ruleexpression_aux7460 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_81_in_ruleexpression_aux7489 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_82_in_ruleexpression_aux7518 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_83_in_ruleexpression_aux7547 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_84_in_ruleexpression_aux7576 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7613 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_85_in_ruleexpression_aux7641 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_86_in_ruleexpression_aux7670 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_87_in_ruleexpression_aux7699 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_88_in_ruleexpression_aux7728 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7765 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression_aux7789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemais_aux_in_entryRulemais_aux7826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemais_aux7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rulemais_aux7879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rulemais_aux7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_in_entryRulenew7965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenew7975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulenew8012 = new BitSet(new long[]{0x0040020800000010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_rulenew8037 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulenew8048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecreating_aux_in_entryRulecreating_aux8084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecreating_aux8094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulecreating_aux8140 = new BitSet(new long[]{0xE7C00009800001F0L,0x0000FFFFF8000000L});
    public static final BitSet FOLLOW_rulearglist_in_rulecreating_aux8162 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulecreating_aux8175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaux_in_rulecreating_aux8216 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_rulecreating_aux8230 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulecreating_aux8242 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleaux_in_entryRuleaux8281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaux8291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleaux8328 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleaux8349 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleaux8361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleliteral_expression_in_entryRuleliteral_expression8397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleliteral_expression8407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleliteral_expression8454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_LITERAL_in_ruleliteral_expression8482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_LITERAL_in_ruleliteral_expression8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleliteral_expression8538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogical_expression_in_entryRulelogical_expression8579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogical_expression8589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rulelogical_expression8633 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulelogical_expression8667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rulelogical_expression8692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rulelogical_expression8729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebit_expression_in_entryRulebit_expression8778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebit_expression8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rulebit_expression8831 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulebit_expression8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumeric_expression_in_entryRulenumeric_expression8901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumeric_expression8911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulenumeric_expression8956 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_61_in_rulenumeric_expression8985 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_62_in_rulenumeric_expression9014 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulenumeric_expression9051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearglist_in_entryRulearglist9087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearglist9097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulearglist9144 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rulearglist9157 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulearglist9178 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_95_in_rulearglist9200 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulearglist9211 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_rulearglist9222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rulearglist9251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulearglist9268 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rulearglist9286 = new BitSet(new long[]{0x0040000800000010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruletype_in_rulearglist9307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulearglist9324 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rulename_in_entryRulename9368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulename9378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulename9420 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_rulename9446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_entryRulepackage_name_aux9482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepackage_name_aux9492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulepackage_name_aux9529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulepackage_name_aux9546 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_rulepackage_name_aux9572 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_entryRuletype_specifier9609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_specifier9619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruletype_specifier9662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruletype_specifier9699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruletype_specifier9736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruletype_specifier9773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruletype_specifier9810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruletype_specifier9847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruletype_specifier9884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruletype_specifier9921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype9970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype9980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_ruletype10027 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rulename_in_ruletype10054 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruletype10068 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruletype10080 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_entryRuleMODIFIER10118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODIFIER10128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleMODIFIER10171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleMODIFIER10208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleMODIFIER10245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMODIFIER10282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleMODIFIER10319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleMODIFIER10356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMODIFIER10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleMODIFIER10430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleMODIFIER10467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleMODIFIER10504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_synpred18_InternalSimpleJava1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_synpred19_InternalSimpleJava1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_synpred39_InternalSimpleJava2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred57_InternalSimpleJava2488 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred57_InternalSimpleJava2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred65_InternalSimpleJava2709 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred65_InternalSimpleJava2721 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred65_InternalSimpleJava2742 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred65_InternalSimpleJava2754 = new BitSet(new long[]{0xE7C9EBB8902401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_synpred65_InternalSimpleJava2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_synpred69_InternalSimpleJava2901 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred69_InternalSimpleJava2912 = new BitSet(new long[]{0xE7C9EBB8902401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_synpred69_InternalSimpleJava2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred87_InternalSimpleJava3876 = new BitSet(new long[]{0xE7C9EBB8902401F0L,0x0000FFFF78000000L});
    public static final BitSet FOLLOW_rulestatement_in_synpred87_InternalSimpleJava3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_synpred89_InternalSimpleJava4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred90_InternalSimpleJava4396 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred90_InternalSimpleJava4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred93_InternalSimpleJava4634 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred93_InternalSimpleJava4638 = new BitSet(new long[]{0x0040000800000010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleparameter_in_synpred93_InternalSimpleJava4645 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred93_InternalSimpleJava4651 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_synpred93_InternalSimpleJava4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred94_InternalSimpleJava4752 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_synpred94_InternalSimpleJava4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred103_InternalSimpleJava5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_in_synpred106_InternalSimpleJava5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred124_InternalSimpleJava5877 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred124_InternalSimpleJava5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred143_InternalSimpleJava6635 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred143_InternalSimpleJava6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred156_InternalSimpleJava6776 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_63_in_synpred156_InternalSimpleJava6800 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_64_in_synpred156_InternalSimpleJava6837 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_65_in_synpred156_InternalSimpleJava6874 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_66_in_synpred156_InternalSimpleJava6911 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_67_in_synpred156_InternalSimpleJava6948 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_68_in_synpred156_InternalSimpleJava6985 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_69_in_synpred156_InternalSimpleJava7022 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_70_in_synpred156_InternalSimpleJava7059 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred156_InternalSimpleJava7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred178_InternalSimpleJava6378 = new BitSet(new long[]{0xE7C00009800001F0L,0x0000FFFFF8000000L});
    public static final BitSet FOLLOW_rulearglist_in_synpred178_InternalSimpleJava6404 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred178_InternalSimpleJava6417 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_ruleaux_in_synpred178_InternalSimpleJava6449 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_59_in_synpred178_InternalSimpleJava6467 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava6492 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_27_in_synpred178_InternalSimpleJava6511 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava6536 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_60_in_synpred178_InternalSimpleJava6555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_synpred178_InternalSimpleJava6586 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred178_InternalSimpleJava6635 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava6656 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_61_in_synpred178_InternalSimpleJava6683 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_62_in_synpred178_InternalSimpleJava6712 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred178_InternalSimpleJava6776 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_63_in_synpred178_InternalSimpleJava6800 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_64_in_synpred178_InternalSimpleJava6837 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_65_in_synpred178_InternalSimpleJava6874 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_66_in_synpred178_InternalSimpleJava6911 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_67_in_synpred178_InternalSimpleJava6948 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_68_in_synpred178_InternalSimpleJava6985 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_69_in_synpred178_InternalSimpleJava7022 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_70_in_synpred178_InternalSimpleJava7059 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava7094 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_71_in_synpred178_InternalSimpleJava7116 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_72_in_synpred178_InternalSimpleJava7134 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_73_in_synpred178_InternalSimpleJava7152 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_74_in_synpred178_InternalSimpleJava7170 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_75_in_synpred178_InternalSimpleJava7188 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_76_in_synpred178_InternalSimpleJava7206 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_71_in_synpred178_InternalSimpleJava7225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_synpred178_InternalSimpleJava7237 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_77_in_synpred178_InternalSimpleJava7256 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_69_in_synpred178_InternalSimpleJava7282 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_70_in_synpred178_InternalSimpleJava7301 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava7327 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_78_in_synpred178_InternalSimpleJava7346 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava7371 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred178_InternalSimpleJava7382 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava7403 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_79_in_synpred178_InternalSimpleJava7431 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_80_in_synpred178_InternalSimpleJava7460 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_81_in_synpred178_InternalSimpleJava7489 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_82_in_synpred178_InternalSimpleJava7518 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_83_in_synpred178_InternalSimpleJava7547 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_84_in_synpred178_InternalSimpleJava7576 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava7613 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_85_in_synpred178_InternalSimpleJava7641 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_86_in_synpred178_InternalSimpleJava7670 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_87_in_synpred178_InternalSimpleJava7699 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_88_in_synpred178_InternalSimpleJava7728 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred178_InternalSimpleJava7765 = new BitSet(new long[]{0xF800000288000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_ruleexpression_aux_in_synpred178_InternalSimpleJava7789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred182_InternalSimpleJava8140 = new BitSet(new long[]{0xE7C00009800001F0L,0x0000FFFFF8000000L});
    public static final BitSet FOLLOW_rulearglist_in_synpred182_InternalSimpleJava8162 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred182_InternalSimpleJava8175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred183_InternalSimpleJava8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred194_InternalSimpleJava9144 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_synpred194_InternalSimpleJava9157 = new BitSet(new long[]{0xE7800000800001F0L,0x0000000078000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred194_InternalSimpleJava9178 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_59_in_synpred197_InternalSimpleJava9529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_synpred197_InternalSimpleJava9546 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_synpred197_InternalSimpleJava9572 = new BitSet(new long[]{0x0000000000000002L});

}