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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_STRING", "RULE_DECIMAL_DIGITS", "RULE_INTEGER_LITERAL", "RULE_FLOAT_LITERAL", "RULE_EXPONENT_PART", "RULE_FLOAT_TYPE_SUFFIX", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.*;'", "'/**'", "'... text ...'", "'*/'", "'class'", "'extends'", "'implements'", "','", "'{'", "'}'", "'interface'", "'('", "')'", "'['", "']'", "'synchronized'", "'return'", "'throw'", "':'", "'break'", "'continue'", "'void'", "'='", "'if'", "'else'", "'do'", "'while'", "'for'", "'try'", "'catch'", "'finally'", "'switch'", "'case'", "'default'", "'static'", "'null'", "'super'", "'this'", "'.'", "'instanceof'", "'++'", "'--'", "'-'", "'-='", "'*'", "'*='", "'/'", "'/='", "'%'", "'%='", "'ampersand'", "'ampersand='", "'|'", "'|='", "'^'", "'^='", "'||='", "'?'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'>>='", "'<<'", "'>>'", "'>>>'", "'+'", "'+='", "'new'", "'\"'", "'!'", "'true'", "'false'", "'~'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'public'", "'private'", "'protected'", "'final'", "'native'", "'abstract'", "'threadsafe'", "'transient'"
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
    public static final int RULE_STRING=5;
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

        AntlrDatatypeRuleToken lv_comp_0_0 = null;


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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:112:1: entryRulecompilation_unit returns [String current=null] : iv_rulecompilation_unit= rulecompilation_unit EOF ;
    public final String entryRulecompilation_unit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecompilation_unit = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:113:2: (iv_rulecompilation_unit= rulecompilation_unit EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:114:2: iv_rulecompilation_unit= rulecompilation_unit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompilation_unitRule()); 
            }
            pushFollow(FOLLOW_rulecompilation_unit_in_entryRulecompilation_unit172);
            iv_rulecompilation_unit=rulecompilation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompilation_unit.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecompilation_unit183); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:121:1: rulecompilation_unit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_package_statement_0= rulepackage_statement )? (this_import_statement_1= ruleimport_statement )* (this_type_declaration_2= ruletype_declaration )* ) ;
    public final AntlrDatatypeRuleToken rulecompilation_unit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_package_statement_0 = null;

        AntlrDatatypeRuleToken this_import_statement_1 = null;

        AntlrDatatypeRuleToken this_type_declaration_2 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:124:28: ( ( (this_package_statement_0= rulepackage_statement )? (this_import_statement_1= ruleimport_statement )* (this_type_declaration_2= ruletype_declaration )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:125:1: ( (this_package_statement_0= rulepackage_statement )? (this_import_statement_1= ruleimport_statement )* (this_type_declaration_2= ruletype_declaration )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:125:1: ( (this_package_statement_0= rulepackage_statement )? (this_import_statement_1= ruleimport_statement )* (this_type_declaration_2= ruletype_declaration )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:125:2: (this_package_statement_0= rulepackage_statement )? (this_import_statement_1= ruleimport_statement )* (this_type_declaration_2= ruletype_declaration )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:125:2: (this_package_statement_0= rulepackage_statement )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:126:5: this_package_statement_0= rulepackage_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompilation_unitAccess().getPackage_statementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulepackage_statement_in_rulecompilation_unit231);
                    this_package_statement_0=rulepackage_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_package_statement_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:136:3: (this_import_statement_1= ruleimport_statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:137:5: this_import_statement_1= ruleimport_statement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getCompilation_unitAccess().getImport_statementParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleimport_statement_in_rulecompilation_unit261);
            	    this_import_statement_1=ruleimport_statement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_import_statement_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:147:3: (this_type_declaration_2= ruletype_declaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21||LA3_0==24||LA3_0==30||LA3_0==35||LA3_0==54||(LA3_0>=104 && LA3_0<=111)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:148:5: this_type_declaration_2= ruletype_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getCompilation_unitAccess().getType_declarationParserRuleCall_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruletype_declaration_in_rulecompilation_unit291);
            	    this_type_declaration_2=ruletype_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_type_declaration_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:166:1: entryRulepackage_statement returns [String current=null] : iv_rulepackage_statement= rulepackage_statement EOF ;
    public final String entryRulepackage_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepackage_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:167:2: (iv_rulepackage_statement= rulepackage_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:168:2: iv_rulepackage_statement= rulepackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_rulepackage_statement_in_entryRulepackage_statement339);
            iv_rulepackage_statement=rulepackage_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepackage_statement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepackage_statement350); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:175:1: rulepackage_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' this_name_1= rulename kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulepackage_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_name_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:178:28: ( (kw= 'package' this_name_1= rulename kw= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:179:1: (kw= 'package' this_name_1= rulename kw= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:179:1: (kw= 'package' this_name_1= rulename kw= ';' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:180:2: kw= 'package' this_name_1= rulename kw= ';'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_rulepackage_statement388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPackage_statementAccess().getPackageKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackage_statementAccess().getNameParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulename_in_rulepackage_statement410);
            this_name_1=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_name_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,18,FOLLOW_18_in_rulepackage_statement428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2()); 
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:210:1: entryRuleimport_statement returns [String current=null] : iv_ruleimport_statement= ruleimport_statement EOF ;
    public final String entryRuleimport_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleimport_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:211:2: (iv_ruleimport_statement= ruleimport_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:212:2: iv_ruleimport_statement= ruleimport_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_ruleimport_statement_in_entryRuleimport_statement469);
            iv_ruleimport_statement=ruleimport_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleimport_statement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleimport_statement480); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:219:1: ruleimport_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' this_name_1= rulename (kw= '.*;' | kw= ';' ) ) ;
    public final AntlrDatatypeRuleToken ruleimport_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_name_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:222:28: ( (kw= 'import' this_name_1= rulename (kw= '.*;' | kw= ';' ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:223:1: (kw= 'import' this_name_1= rulename (kw= '.*;' | kw= ';' ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:223:1: (kw= 'import' this_name_1= rulename (kw= '.*;' | kw= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:224:2: kw= 'import' this_name_1= rulename (kw= '.*;' | kw= ';' )
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleimport_statement518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getImport_statementAccess().getImportKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImport_statementAccess().getNameParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulename_in_ruleimport_statement540);
            this_name_1=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_name_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:240:1: (kw= '.*;' | kw= ';' )
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:241:2: kw= '.*;'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleimport_statement559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_2_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:248:2: kw= ';'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleimport_statement578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getImport_statementAccess().getSemicolonKeyword_2_1()); 
                          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:261:1: entryRuletype_declaration returns [String current=null] : iv_ruletype_declaration= ruletype_declaration EOF ;
    public final String entryRuletype_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:262:2: (iv_ruletype_declaration= ruletype_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:263:2: iv_ruletype_declaration= ruletype_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_declarationRule()); 
            }
            pushFollow(FOLLOW_ruletype_declaration_in_entryRuletype_declaration620);
            iv_ruletype_declaration=ruletype_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_declaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_declaration631); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:270:1: ruletype_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_doc_comment_0= ruledoc_comment )? (this_class_declaration_1= ruleclass_declaration | this_interface_declaration_2= ruleinterface_declaration ) ) ;
    public final AntlrDatatypeRuleToken ruletype_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_doc_comment_0 = null;

        AntlrDatatypeRuleToken this_class_declaration_1 = null;

        AntlrDatatypeRuleToken this_interface_declaration_2 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:273:28: ( ( (this_doc_comment_0= ruledoc_comment )? (this_class_declaration_1= ruleclass_declaration | this_interface_declaration_2= ruleinterface_declaration ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:274:1: ( (this_doc_comment_0= ruledoc_comment )? (this_class_declaration_1= ruleclass_declaration | this_interface_declaration_2= ruleinterface_declaration ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:274:1: ( (this_doc_comment_0= ruledoc_comment )? (this_class_declaration_1= ruleclass_declaration | this_interface_declaration_2= ruleinterface_declaration ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:274:2: (this_doc_comment_0= ruledoc_comment )? (this_class_declaration_1= ruleclass_declaration | this_interface_declaration_2= ruleinterface_declaration )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:274:2: (this_doc_comment_0= ruledoc_comment )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:275:5: this_doc_comment_0= ruledoc_comment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_declarationAccess().getDoc_commentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruledoc_comment_in_ruletype_declaration679);
                    this_doc_comment_0=ruledoc_comment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_doc_comment_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:285:3: (this_class_declaration_1= ruleclass_declaration | this_interface_declaration_2= ruleinterface_declaration )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:286:5: this_class_declaration_1= ruleclass_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_declarationAccess().getClass_declarationParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleclass_declaration_in_ruletype_declaration709);
                    this_class_declaration_1=ruleclass_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_class_declaration_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:298:5: this_interface_declaration_2= ruleinterface_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_declarationAccess().getInterface_declarationParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleinterface_declaration_in_ruletype_declaration742);
                    this_interface_declaration_2=ruleinterface_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_interface_declaration_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:316:1: entryRuledoc_comment returns [String current=null] : iv_ruledoc_comment= ruledoc_comment EOF ;
    public final String entryRuledoc_comment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledoc_comment = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:317:2: (iv_ruledoc_comment= ruledoc_comment EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:318:2: iv_ruledoc_comment= ruledoc_comment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoc_commentRule()); 
            }
            pushFollow(FOLLOW_ruledoc_comment_in_entryRuledoc_comment789);
            iv_ruledoc_comment=ruledoc_comment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledoc_comment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledoc_comment800); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:325:1: ruledoc_comment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/**' kw= '... text ...' kw= '*/' ) ;
    public final AntlrDatatypeRuleToken ruledoc_comment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:328:28: ( (kw= '/**' kw= '... text ...' kw= '*/' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:329:1: (kw= '/**' kw= '... text ...' kw= '*/' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:329:1: (kw= '/**' kw= '... text ...' kw= '*/' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:330:2: kw= '/**' kw= '... text ...' kw= '*/'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruledoc_comment838); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDoc_commentAccess().getSolidusAsteriskAsteriskKeyword_0()); 
                  
            }
            kw=(Token)match(input,22,FOLLOW_22_in_ruledoc_comment851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDoc_commentAccess().getTextKeyword_1()); 
                  
            }
            kw=(Token)match(input,23,FOLLOW_23_in_ruledoc_comment864); if (state.failed) return current;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:355:1: entryRuleclass_declaration returns [String current=null] : iv_ruleclass_declaration= ruleclass_declaration EOF ;
    public final String entryRuleclass_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleclass_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:356:2: (iv_ruleclass_declaration= ruleclass_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:357:2: iv_ruleclass_declaration= ruleclass_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleclass_declaration_in_entryRuleclass_declaration905);
            iv_ruleclass_declaration=ruleclass_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleclass_declaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleclass_declaration916); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:364:1: ruleclass_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MODIFIER_0= ruleMODIFIER )* kw= 'class' this_IDENTIFIER_2= RULE_IDENTIFIER (kw= 'extends' this_name_4= rulename )? (kw= 'implements' this_name_6= rulename (kw= ',' this_name_8= rulename )* )? kw= '{' (this_field_declaration_10= rulefield_declaration | this_class_declaration_11= ruleclass_declaration )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleclass_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_2=null;
        AntlrDatatypeRuleToken this_MODIFIER_0 = null;

        AntlrDatatypeRuleToken this_name_4 = null;

        AntlrDatatypeRuleToken this_name_6 = null;

        AntlrDatatypeRuleToken this_name_8 = null;

        AntlrDatatypeRuleToken this_field_declaration_10 = null;

        AntlrDatatypeRuleToken this_class_declaration_11 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:367:28: ( ( (this_MODIFIER_0= ruleMODIFIER )* kw= 'class' this_IDENTIFIER_2= RULE_IDENTIFIER (kw= 'extends' this_name_4= rulename )? (kw= 'implements' this_name_6= rulename (kw= ',' this_name_8= rulename )* )? kw= '{' (this_field_declaration_10= rulefield_declaration | this_class_declaration_11= ruleclass_declaration )* kw= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:368:1: ( (this_MODIFIER_0= ruleMODIFIER )* kw= 'class' this_IDENTIFIER_2= RULE_IDENTIFIER (kw= 'extends' this_name_4= rulename )? (kw= 'implements' this_name_6= rulename (kw= ',' this_name_8= rulename )* )? kw= '{' (this_field_declaration_10= rulefield_declaration | this_class_declaration_11= ruleclass_declaration )* kw= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:368:1: ( (this_MODIFIER_0= ruleMODIFIER )* kw= 'class' this_IDENTIFIER_2= RULE_IDENTIFIER (kw= 'extends' this_name_4= rulename )? (kw= 'implements' this_name_6= rulename (kw= ',' this_name_8= rulename )* )? kw= '{' (this_field_declaration_10= rulefield_declaration | this_class_declaration_11= ruleclass_declaration )* kw= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:368:2: (this_MODIFIER_0= ruleMODIFIER )* kw= 'class' this_IDENTIFIER_2= RULE_IDENTIFIER (kw= 'extends' this_name_4= rulename )? (kw= 'implements' this_name_6= rulename (kw= ',' this_name_8= rulename )* )? kw= '{' (this_field_declaration_10= rulefield_declaration | this_class_declaration_11= ruleclass_declaration )* kw= '}'
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:368:2: (this_MODIFIER_0= ruleMODIFIER )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35||LA7_0==54||(LA7_0>=104 && LA7_0<=111)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:369:5: this_MODIFIER_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getClass_declarationAccess().getMODIFIERParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_ruleclass_declaration964);
            	    this_MODIFIER_0=ruleMODIFIER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MODIFIER_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            kw=(Token)match(input,24,FOLLOW_24_in_ruleclass_declaration984); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getClass_declarationAccess().getClassKeyword_1()); 
                  
            }
            this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleclass_declaration999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_2, grammarAccess.getClass_declarationAccess().getIDENTIFIERTerminalRuleCall_2()); 
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:392:1: (kw= 'extends' this_name_4= rulename )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:393:2: kw= 'extends' this_name_4= rulename
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleclass_declaration1018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClass_declarationAccess().getNameParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulename_in_ruleclass_declaration1040);
                    this_name_4=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_name_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:409:3: (kw= 'implements' this_name_6= rulename (kw= ',' this_name_8= rulename )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:410:2: kw= 'implements' this_name_6= rulename (kw= ',' this_name_8= rulename )*
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleclass_declaration1061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClass_declarationAccess().getNameParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulename_in_ruleclass_declaration1083);
                    this_name_6=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_name_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:426:1: (kw= ',' this_name_8= rulename )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==27) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:427:2: kw= ',' this_name_8= rulename
                    	    {
                    	    kw=(Token)match(input,27,FOLLOW_27_in_ruleclass_declaration1102); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0()); 
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getClass_declarationAccess().getNameParserRuleCall_4_2_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_rulename_in_ruleclass_declaration1124);
                    	    this_name_8=rulename();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_name_8);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
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

            kw=(Token)match(input,28,FOLLOW_28_in_ruleclass_declaration1146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5()); 
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:449:1: (this_field_declaration_10= rulefield_declaration | this_class_declaration_11= ruleclass_declaration )*
            loop11:
            do {
                int alt11=3;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:450:5: this_field_declaration_10= rulefield_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getClass_declarationAccess().getField_declarationParserRuleCall_6_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulefield_declaration_in_ruleclass_declaration1169);
            	    this_field_declaration_10=rulefield_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_field_declaration_10);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:462:5: this_class_declaration_11= ruleclass_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getClass_declarationAccess().getClass_declarationParserRuleCall_6_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleclass_declaration_in_ruleclass_declaration1202);
            	    this_class_declaration_11=ruleclass_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_class_declaration_11);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            kw=(Token)match(input,29,FOLLOW_29_in_ruleclass_declaration1222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7()); 
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:486:1: entryRuleinterface_declaration returns [String current=null] : iv_ruleinterface_declaration= ruleinterface_declaration EOF ;
    public final String entryRuleinterface_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinterface_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:487:2: (iv_ruleinterface_declaration= ruleinterface_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:488:2: iv_ruleinterface_declaration= ruleinterface_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleinterface_declaration_in_entryRuleinterface_declaration1263);
            iv_ruleinterface_declaration=ruleinterface_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinterface_declaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleinterface_declaration1274); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:495:1: ruleinterface_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MODIFIER_0= ruleMODIFIER )* kw= 'interface' this_IDENTIFIER_2= RULE_IDENTIFIER (kw= 'extends' this_name_4= rulename (kw= ',' this_name_6= rulename )* )? kw= '{' (this_field_declaration_8= rulefield_declaration )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleinterface_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_2=null;
        AntlrDatatypeRuleToken this_MODIFIER_0 = null;

        AntlrDatatypeRuleToken this_name_4 = null;

        AntlrDatatypeRuleToken this_name_6 = null;

        AntlrDatatypeRuleToken this_field_declaration_8 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:498:28: ( ( (this_MODIFIER_0= ruleMODIFIER )* kw= 'interface' this_IDENTIFIER_2= RULE_IDENTIFIER (kw= 'extends' this_name_4= rulename (kw= ',' this_name_6= rulename )* )? kw= '{' (this_field_declaration_8= rulefield_declaration )* kw= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:499:1: ( (this_MODIFIER_0= ruleMODIFIER )* kw= 'interface' this_IDENTIFIER_2= RULE_IDENTIFIER (kw= 'extends' this_name_4= rulename (kw= ',' this_name_6= rulename )* )? kw= '{' (this_field_declaration_8= rulefield_declaration )* kw= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:499:1: ( (this_MODIFIER_0= ruleMODIFIER )* kw= 'interface' this_IDENTIFIER_2= RULE_IDENTIFIER (kw= 'extends' this_name_4= rulename (kw= ',' this_name_6= rulename )* )? kw= '{' (this_field_declaration_8= rulefield_declaration )* kw= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:499:2: (this_MODIFIER_0= ruleMODIFIER )* kw= 'interface' this_IDENTIFIER_2= RULE_IDENTIFIER (kw= 'extends' this_name_4= rulename (kw= ',' this_name_6= rulename )* )? kw= '{' (this_field_declaration_8= rulefield_declaration )* kw= '}'
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:499:2: (this_MODIFIER_0= ruleMODIFIER )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==35||LA12_0==54||(LA12_0>=104 && LA12_0<=111)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:500:5: this_MODIFIER_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInterface_declarationAccess().getMODIFIERParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_ruleinterface_declaration1322);
            	    this_MODIFIER_0=ruleMODIFIER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MODIFIER_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            kw=(Token)match(input,30,FOLLOW_30_in_ruleinterface_declaration1342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1()); 
                  
            }
            this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleinterface_declaration1357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_2, grammarAccess.getInterface_declarationAccess().getIDENTIFIERTerminalRuleCall_2()); 
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:523:1: (kw= 'extends' this_name_4= rulename (kw= ',' this_name_6= rulename )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:524:2: kw= 'extends' this_name_4= rulename (kw= ',' this_name_6= rulename )*
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleinterface_declaration1376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterface_declarationAccess().getNameParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulename_in_ruleinterface_declaration1398);
                    this_name_4=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_name_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:540:1: (kw= ',' this_name_6= rulename )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==27) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:541:2: kw= ',' this_name_6= rulename
                    	    {
                    	    kw=(Token)match(input,27,FOLLOW_27_in_ruleinterface_declaration1417); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0()); 
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getInterface_declarationAccess().getNameParserRuleCall_3_2_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_rulename_in_ruleinterface_declaration1439);
                    	    this_name_6=rulename();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_name_6);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
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

            kw=(Token)match(input,28,FOLLOW_28_in_ruleinterface_declaration1461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4()); 
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:563:1: (this_field_declaration_8= rulefield_declaration )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_IDENTIFIER||LA15_0==18||LA15_0==21||LA15_0==31||LA15_0==35||LA15_0==41||LA15_0==54||(LA15_0>=96 && LA15_0<=111)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:564:5: this_field_declaration_8= rulefield_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInterface_declarationAccess().getField_declarationParserRuleCall_5()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulefield_declaration_in_ruleinterface_declaration1484);
            	    this_field_declaration_8=rulefield_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_field_declaration_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            kw=(Token)match(input,29,FOLLOW_29_in_ruleinterface_declaration1504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_6()); 
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:588:1: entryRulefield_declaration returns [String current=null] : iv_rulefield_declaration= rulefield_declaration EOF ;
    public final String entryRulefield_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefield_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:589:2: (iv_rulefield_declaration= rulefield_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:590:2: iv_rulefield_declaration= rulefield_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_declarationRule()); 
            }
            pushFollow(FOLLOW_rulefield_declaration_in_entryRulefield_declaration1545);
            iv_rulefield_declaration=rulefield_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefield_declaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_declaration1556); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:597:1: rulefield_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_doc_comment_0= ruledoc_comment )* (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration ) ) | this_static_initializer_4= rulestatic_initializer | kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulefield_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_doc_comment_0 = null;

        AntlrDatatypeRuleToken this_method_declaration_1 = null;

        AntlrDatatypeRuleToken this_constructor_declaration_2 = null;

        AntlrDatatypeRuleToken this_variable_declaration_3 = null;

        AntlrDatatypeRuleToken this_static_initializer_4 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:600:28: ( ( ( (this_doc_comment_0= ruledoc_comment )* (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration ) ) | this_static_initializer_4= rulestatic_initializer | kw= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:601:1: ( ( (this_doc_comment_0= ruledoc_comment )* (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration ) ) | this_static_initializer_4= rulestatic_initializer | kw= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:601:1: ( ( (this_doc_comment_0= ruledoc_comment )* (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration ) ) | this_static_initializer_4= rulestatic_initializer | kw= ';' )
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

                if ( (LA18_2==28) ) {
                    alt18=2;
                }
                else if ( (LA18_2==RULE_IDENTIFIER||LA18_2==31||LA18_2==35||LA18_2==41||LA18_2==54||(LA18_2>=96 && LA18_2<=111)) ) {
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:601:2: ( (this_doc_comment_0= ruledoc_comment )* (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:601:2: ( (this_doc_comment_0= ruledoc_comment )* (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:601:3: (this_doc_comment_0= ruledoc_comment )* (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:601:3: (this_doc_comment_0= ruledoc_comment )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==21) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:602:5: this_doc_comment_0= ruledoc_comment
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getField_declarationAccess().getDoc_commentParserRuleCall_0_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruledoc_comment_in_rulefield_declaration1605);
                    	    this_doc_comment_0=ruledoc_comment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_doc_comment_0);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:612:3: (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration )
                    int alt17=3;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:613:5: this_method_declaration_1= rulemethod_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getField_declarationAccess().getMethod_declarationParserRuleCall_0_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_rulemethod_declaration_in_rulefield_declaration1635);
                            this_method_declaration_1=rulemethod_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_method_declaration_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:625:5: this_constructor_declaration_2= ruleconstructor_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getField_declarationAccess().getConstructor_declarationParserRuleCall_0_1_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleconstructor_declaration_in_rulefield_declaration1668);
                            this_constructor_declaration_2=ruleconstructor_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_constructor_declaration_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:637:5: this_variable_declaration_3= rulevariable_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getField_declarationAccess().getVariable_declarationParserRuleCall_0_1_2()); 
                                  
                            }
                            pushFollow(FOLLOW_rulevariable_declaration_in_rulefield_declaration1701);
                            this_variable_declaration_3=rulevariable_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_variable_declaration_3);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:649:5: this_static_initializer_4= rulestatic_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getField_declarationAccess().getStatic_initializerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulestatic_initializer_in_rulefield_declaration1736);
                    this_static_initializer_4=rulestatic_initializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_static_initializer_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:661:2: kw= ';'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_rulefield_declaration1760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getField_declarationAccess().getSemicolonKeyword_2()); 
                          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:674:1: entryRulemethod_declaration returns [String current=null] : iv_rulemethod_declaration= rulemethod_declaration EOF ;
    public final String entryRulemethod_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemethod_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:675:2: (iv_rulemethod_declaration= rulemethod_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:676:2: iv_rulemethod_declaration= rulemethod_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            }
            pushFollow(FOLLOW_rulemethod_declaration_in_entryRulemethod_declaration1801);
            iv_rulemethod_declaration=rulemethod_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemethod_declaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemethod_declaration1812); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:683:1: rulemethod_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_parameter_list_1= ruleparameter_list )? kw= ')' (kw= '[' kw= ']' )* (this_statement_block_5= rulestatement_block | kw= ';' ) ) ;
    public final AntlrDatatypeRuleToken rulemethod_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_parameter_list_1 = null;

        AntlrDatatypeRuleToken this_statement_block_5 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:686:28: ( (kw= '(' (this_parameter_list_1= ruleparameter_list )? kw= ')' (kw= '[' kw= ']' )* (this_statement_block_5= rulestatement_block | kw= ';' ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:687:1: (kw= '(' (this_parameter_list_1= ruleparameter_list )? kw= ')' (kw= '[' kw= ']' )* (this_statement_block_5= rulestatement_block | kw= ';' ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:687:1: (kw= '(' (this_parameter_list_1= ruleparameter_list )? kw= ')' (kw= '[' kw= ']' )* (this_statement_block_5= rulestatement_block | kw= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:688:2: kw= '(' (this_parameter_list_1= ruleparameter_list )? kw= ')' (kw= '[' kw= ']' )* (this_statement_block_5= rulestatement_block | kw= ';' )
            {
            kw=(Token)match(input,31,FOLLOW_31_in_rulemethod_declaration1850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_0()); 
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:693:1: (this_parameter_list_1= ruleparameter_list )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_IDENTIFIER||(LA19_0>=96 && LA19_0<=103)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:694:5: this_parameter_list_1= ruleparameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethod_declarationAccess().getParameter_listParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleparameter_list_in_rulemethod_declaration1873);
                    this_parameter_list_1=ruleparameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_parameter_list_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_32_in_rulemethod_declaration1893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_2()); 
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:710:1: (kw= '[' kw= ']' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:711:2: kw= '[' kw= ']'
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_rulemethod_declaration1907); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketKeyword_3_0()); 
            	          
            	    }
            	    kw=(Token)match(input,34,FOLLOW_34_in_rulemethod_declaration1920); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getMethod_declarationAccess().getRightSquareBracketKeyword_3_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:722:3: (this_statement_block_5= rulestatement_block | kw= ';' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            else if ( (LA21_0==18) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:723:5: this_statement_block_5= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethod_declarationAccess().getStatement_blockParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_rulemethod_declaration1945);
                    this_statement_block_5=rulestatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_statement_block_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:735:2: kw= ';'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_rulemethod_declaration1969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethod_declarationAccess().getSemicolonKeyword_4_1()); 
                          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:748:1: entryRuleparameter returns [String current=null] : iv_ruleparameter= ruleparameter EOF ;
    public final String entryRuleparameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparameter = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:749:2: (iv_ruleparameter= ruleparameter EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:750:2: iv_ruleparameter= ruleparameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleparameter_in_entryRuleparameter2011);
            iv_ruleparameter=ruleparameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter2022); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:757:1: ruleparameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_type_0= ruletype this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '[' kw= ']' )* ) ;
    public final AntlrDatatypeRuleToken ruleparameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_type_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:760:28: ( (this_type_0= ruletype this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '[' kw= ']' )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:761:1: (this_type_0= ruletype this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '[' kw= ']' )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:761:1: (this_type_0= ruletype this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '[' kw= ']' )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:762:5: this_type_0= ruletype this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '[' kw= ']' )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParameterAccess().getTypeParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruletype_in_ruleparameter2069);
            this_type_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_type_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleparameter2089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_1, grammarAccess.getParameterAccess().getIDENTIFIERTerminalRuleCall_1()); 
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:779:1: (kw= '[' kw= ']' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:780:2: kw= '[' kw= ']'
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_ruleparameter2108); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_0()); 
            	          
            	    }
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleparameter2121); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:799:1: entryRuleparameter_list returns [String current=null] : iv_ruleparameter_list= ruleparameter_list EOF ;
    public final String entryRuleparameter_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparameter_list = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:800:2: (iv_ruleparameter_list= ruleparameter_list EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:801:2: iv_ruleparameter_list= ruleparameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_ruleparameter_list_in_entryRuleparameter_list2164);
            iv_ruleparameter_list=ruleparameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_list.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_list2175); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:808:1: ruleparameter_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_parameter_0= ruleparameter (kw= ',' this_parameter_2= ruleparameter )* ) ;
    public final AntlrDatatypeRuleToken ruleparameter_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_parameter_0 = null;

        AntlrDatatypeRuleToken this_parameter_2 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:811:28: ( (this_parameter_0= ruleparameter (kw= ',' this_parameter_2= ruleparameter )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:812:1: (this_parameter_0= ruleparameter (kw= ',' this_parameter_2= ruleparameter )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:812:1: (this_parameter_0= ruleparameter (kw= ',' this_parameter_2= ruleparameter )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:813:5: this_parameter_0= ruleparameter (kw= ',' this_parameter_2= ruleparameter )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParameter_listAccess().getParameterParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleparameter_in_ruleparameter_list2222);
            this_parameter_0=ruleparameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_parameter_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:823:1: (kw= ',' this_parameter_2= ruleparameter )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==27) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:824:2: kw= ',' this_parameter_2= ruleparameter
            	    {
            	    kw=(Token)match(input,27,FOLLOW_27_in_ruleparameter_list2241); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getParameter_listAccess().getParameterParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleparameter_in_ruleparameter_list2263);
            	    this_parameter_2=ruleparameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_parameter_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
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
    // $ANTLR end "ruleparameter_list"


    // $ANTLR start "entryRulestatement_block"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:848:1: entryRulestatement_block returns [String current=null] : iv_rulestatement_block= rulestatement_block EOF ;
    public final String entryRulestatement_block() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_block = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:849:2: (iv_rulestatement_block= rulestatement_block EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:850:2: iv_rulestatement_block= rulestatement_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_blockRule()); 
            }
            pushFollow(FOLLOW_rulestatement_block_in_entryRulestatement_block2311);
            iv_rulestatement_block=rulestatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement_block.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_block2322); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:857:1: rulestatement_block returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (this_statement_1= rulestatement )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulestatement_block() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:860:28: ( (kw= '{' (this_statement_1= rulestatement )* kw= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:861:1: (kw= '{' (this_statement_1= rulestatement )* kw= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:861:1: (kw= '{' (this_statement_1= rulestatement )* kw= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:862:2: kw= '{' (this_statement_1= rulestatement )* kw= '}'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_rulestatement_block2360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_0()); 
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:867:1: (this_statement_1= rulestatement )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_IDENTIFIER && LA24_0<=RULE_FLOAT_LITERAL)||LA24_0==18||LA24_0==28||LA24_0==31||(LA24_0>=35 && LA24_0<=37)||(LA24_0>=39 && LA24_0<=41)||LA24_0==43||(LA24_0>=45 && LA24_0<=48)||LA24_0==51||(LA24_0>=54 && LA24_0<=57)||(LA24_0>=60 && LA24_0<=62)||LA24_0==90||(LA24_0>=92 && LA24_0<=111)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:868:5: this_statement_1= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStatement_blockAccess().getStatementParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_block2383);
            	    this_statement_1=rulestatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_statement_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            kw=(Token)match(input,29,FOLLOW_29_in_rulestatement_block2403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_2()); 
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:892:1: entryRulestatement returns [String current=null] : iv_rulestatement= rulestatement EOF ;
    public final String entryRulestatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:893:2: (iv_rulestatement= rulestatement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:894:2: iv_rulestatement= rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement2444);
            iv_rulestatement=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement2455); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:901:1: rulestatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' | 'boolean' | 'byte' | 'char' | 'short' | 'int' | 'float' | 'long' | 'double' | 'void' | '(' | RULE_IDENTIFIER )=>this_variable_declaration_0= rulevariable_declaration ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression ) kw= ';' ) | this_statement_block_3= rulestatement_block | this_if_statement_4= ruleif_statement | this_do_statement_5= ruledo_statement | this_while_statement_6= rulewhile_statement | this_for_statement_7= rulefor_statement | this_try_statement_8= ruletry_statement | this_switch_statement_9= ruleswitch_statement | (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement ) | (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' ) | (kw= 'throw' this_expression_19= ruleexpression kw= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement ) | (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' ) | (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' ) | kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulestatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_21=null;
        Token this_IDENTIFIER_25=null;
        Token this_IDENTIFIER_28=null;
        AntlrDatatypeRuleToken this_variable_declaration_0 = null;

        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_statement_block_3 = null;

        AntlrDatatypeRuleToken this_if_statement_4 = null;

        AntlrDatatypeRuleToken this_do_statement_5 = null;

        AntlrDatatypeRuleToken this_while_statement_6 = null;

        AntlrDatatypeRuleToken this_for_statement_7 = null;

        AntlrDatatypeRuleToken this_try_statement_8 = null;

        AntlrDatatypeRuleToken this_switch_statement_9 = null;

        AntlrDatatypeRuleToken this_expression_12 = null;

        AntlrDatatypeRuleToken this_statement_14 = null;

        AntlrDatatypeRuleToken this_expression_16 = null;

        AntlrDatatypeRuleToken this_expression_19 = null;

        AntlrDatatypeRuleToken this_statement_23 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:904:28: ( ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' | 'boolean' | 'byte' | 'char' | 'short' | 'int' | 'float' | 'long' | 'double' | 'void' | '(' | RULE_IDENTIFIER )=>this_variable_declaration_0= rulevariable_declaration ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression ) kw= ';' ) | this_statement_block_3= rulestatement_block | this_if_statement_4= ruleif_statement | this_do_statement_5= ruledo_statement | this_while_statement_6= rulewhile_statement | this_for_statement_7= rulefor_statement | this_try_statement_8= ruletry_statement | this_switch_statement_9= ruleswitch_statement | (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement ) | (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' ) | (kw= 'throw' this_expression_19= ruleexpression kw= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement ) | (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' ) | (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' ) | kw= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:905:1: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' | 'boolean' | 'byte' | 'char' | 'short' | 'int' | 'float' | 'long' | 'double' | 'void' | '(' | RULE_IDENTIFIER )=>this_variable_declaration_0= rulevariable_declaration ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression ) kw= ';' ) | this_statement_block_3= rulestatement_block | this_if_statement_4= ruleif_statement | this_do_statement_5= ruledo_statement | this_while_statement_6= rulewhile_statement | this_for_statement_7= rulefor_statement | this_try_statement_8= ruletry_statement | this_switch_statement_9= ruleswitch_statement | (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement ) | (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' ) | (kw= 'throw' this_expression_19= ruleexpression kw= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement ) | (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' ) | (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' ) | kw= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:905:1: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' | 'boolean' | 'byte' | 'char' | 'short' | 'int' | 'float' | 'long' | 'double' | 'void' | '(' | RULE_IDENTIFIER )=>this_variable_declaration_0= rulevariable_declaration ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression ) kw= ';' ) | this_statement_block_3= rulestatement_block | this_if_statement_4= ruleif_statement | this_do_statement_5= ruledo_statement | this_while_statement_6= rulewhile_statement | this_for_statement_7= rulefor_statement | this_try_statement_8= ruletry_statement | this_switch_statement_9= ruleswitch_statement | (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement ) | (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' ) | (kw= 'throw' this_expression_19= ruleexpression kw= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement ) | (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' ) | (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' ) | kw= ';' )
            int alt28=16;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:905:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' | 'boolean' | 'byte' | 'char' | 'short' | 'int' | 'float' | 'long' | 'double' | 'void' | '(' | RULE_IDENTIFIER )=>this_variable_declaration_0= rulevariable_declaration )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:905:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' | 'boolean' | 'byte' | 'char' | 'short' | 'int' | 'float' | 'long' | 'double' | 'void' | '(' | RULE_IDENTIFIER )=>this_variable_declaration_0= rulevariable_declaration )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:905:3: ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' | 'boolean' | 'byte' | 'char' | 'short' | 'int' | 'float' | 'long' | 'double' | 'void' | '(' | RULE_IDENTIFIER )=>this_variable_declaration_0= rulevariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getVariable_declarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulevariable_declaration_in_rulestatement2668);
                    this_variable_declaration_0=rulevariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_variable_declaration_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:957:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression ) kw= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:957:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression ) kw= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:957:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression ) kw= ';'
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:957:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:957:8: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement2825);
                    this_expression_1=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_expression_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }

                    kw=(Token)match(input,18,FOLLOW_18_in_rulestatement2844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1000:5: this_statement_block_3= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_rulestatement2873);
                    this_statement_block_3=rulestatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_statement_block_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1012:5: this_if_statement_4= ruleif_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIf_statementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleif_statement_in_rulestatement2906);
                    this_if_statement_4=ruleif_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_if_statement_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1024:5: this_do_statement_5= ruledo_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDo_statementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruledo_statement_in_rulestatement2939);
                    this_do_statement_5=ruledo_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_do_statement_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1036:5: this_while_statement_6= rulewhile_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getWhile_statementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_rulewhile_statement_in_rulestatement2972);
                    this_while_statement_6=rulewhile_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_while_statement_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1048:5: this_for_statement_7= rulefor_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getFor_statementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_rulefor_statement_in_rulestatement3005);
                    this_for_statement_7=rulefor_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_for_statement_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1060:5: this_try_statement_8= ruletry_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getTry_statementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruletry_statement_in_rulestatement3038);
                    this_try_statement_8=ruletry_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_try_statement_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1072:5: this_switch_statement_9= ruleswitch_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getSwitch_statementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleswitch_statement_in_rulestatement3071);
                    this_switch_statement_9=ruleswitch_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_switch_statement_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1083:6: (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1083:6: (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1084:2: kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_rulestatement3096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getSynchronizedKeyword_9_0()); 
                          
                    }
                    kw=(Token)match(input,31,FOLLOW_31_in_rulestatement3109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_9_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_9_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement3131);
                    this_expression_12=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_expression_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,32,FOLLOW_32_in_rulestatement3149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getRightParenthesisKeyword_9_3()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatementParserRuleCall_9_4()); 
                          
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement3171);
                    this_statement_14=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_statement_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1124:6: (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1124:6: (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1125:2: kw= 'return' (this_expression_16= ruleexpression )? kw= ';'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_rulestatement3197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getReturnKeyword_10_0()); 
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1130:1: (this_expression_16= ruleexpression )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=RULE_IDENTIFIER && LA25_0<=RULE_FLOAT_LITERAL)||LA25_0==31||(LA25_0>=55 && LA25_0<=57)||(LA25_0>=60 && LA25_0<=62)||LA25_0==90||(LA25_0>=92 && LA25_0<=95)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1131:5: this_expression_16= ruleexpression
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_10_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleexpression_in_rulestatement3220);
                            this_expression_16=ruleexpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_expression_16);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,18,FOLLOW_18_in_rulestatement3240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_10_2()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1148:6: (kw= 'throw' this_expression_19= ruleexpression kw= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1148:6: (kw= 'throw' this_expression_19= ruleexpression kw= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1149:2: kw= 'throw' this_expression_19= ruleexpression kw= ';'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_rulestatement3261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getThrowKeyword_11_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_11_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement3283);
                    this_expression_19=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_expression_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,18,FOLLOW_18_in_rulestatement3301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_11_2()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:6: (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:6: (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:11: this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement
                    {
                    this_IDENTIFIER_21=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement3324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENTIFIER_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENTIFIER_21, grammarAccess.getStatementAccess().getIDENTIFIERTerminalRuleCall_12_0()); 
                          
                    }
                    kw=(Token)match(input,38,FOLLOW_38_in_rulestatement3342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getColonKeyword_12_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatementParserRuleCall_12_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement3364);
                    this_statement_23=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_statement_23);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1197:6: (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1197:6: (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1198:2: kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_rulestatement3390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getBreakKeyword_13_0()); 
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1203:1: (this_IDENTIFIER_25= RULE_IDENTIFIER )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_IDENTIFIER) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1203:6: this_IDENTIFIER_25= RULE_IDENTIFIER
                            {
                            this_IDENTIFIER_25=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement3406); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_IDENTIFIER_25);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_IDENTIFIER_25, grammarAccess.getStatementAccess().getIDENTIFIERTerminalRuleCall_13_1()); 
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,18,FOLLOW_18_in_rulestatement3426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_13_2()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1217:6: (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1217:6: (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1218:2: kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_rulestatement3447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getContinueKeyword_14_0()); 
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1223:1: (this_IDENTIFIER_28= RULE_IDENTIFIER )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_IDENTIFIER) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1223:6: this_IDENTIFIER_28= RULE_IDENTIFIER
                            {
                            this_IDENTIFIER_28=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement3463); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_IDENTIFIER_28);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_IDENTIFIER_28, grammarAccess.getStatementAccess().getIDENTIFIERTerminalRuleCall_14_1()); 
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,18,FOLLOW_18_in_rulestatement3483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_14_2()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1238:2: kw= ';'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_rulestatement3503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_15()); 
                          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1251:1: entryRulevariable_declaration returns [String current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final String entryRulevariable_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1252:2: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1253:2: iv_rulevariable_declaration= rulevariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration3544);
            iv_rulevariable_declaration=rulevariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_declaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration3555); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1260:1: rulevariable_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MODIFIER_0= ruleMODIFIER )* (this_type_1= ruletype | kw= 'void' )? this_variable_declarator_3= rulevariable_declarator (kw= ',' this_variable_declarator_5= rulevariable_declarator )* (kw= ';' | this_statement_block_7= rulestatement_block ) ) ;
    public final AntlrDatatypeRuleToken rulevariable_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MODIFIER_0 = null;

        AntlrDatatypeRuleToken this_type_1 = null;

        AntlrDatatypeRuleToken this_variable_declarator_3 = null;

        AntlrDatatypeRuleToken this_variable_declarator_5 = null;

        AntlrDatatypeRuleToken this_statement_block_7 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1263:28: ( ( (this_MODIFIER_0= ruleMODIFIER )* (this_type_1= ruletype | kw= 'void' )? this_variable_declarator_3= rulevariable_declarator (kw= ',' this_variable_declarator_5= rulevariable_declarator )* (kw= ';' | this_statement_block_7= rulestatement_block ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1264:1: ( (this_MODIFIER_0= ruleMODIFIER )* (this_type_1= ruletype | kw= 'void' )? this_variable_declarator_3= rulevariable_declarator (kw= ',' this_variable_declarator_5= rulevariable_declarator )* (kw= ';' | this_statement_block_7= rulestatement_block ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1264:1: ( (this_MODIFIER_0= ruleMODIFIER )* (this_type_1= ruletype | kw= 'void' )? this_variable_declarator_3= rulevariable_declarator (kw= ',' this_variable_declarator_5= rulevariable_declarator )* (kw= ';' | this_statement_block_7= rulestatement_block ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1264:2: (this_MODIFIER_0= ruleMODIFIER )* (this_type_1= ruletype | kw= 'void' )? this_variable_declarator_3= rulevariable_declarator (kw= ',' this_variable_declarator_5= rulevariable_declarator )* (kw= ';' | this_statement_block_7= rulestatement_block )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1264:2: (this_MODIFIER_0= ruleMODIFIER )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==35||LA29_0==54||(LA29_0>=104 && LA29_0<=111)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1265:5: this_MODIFIER_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getVariable_declarationAccess().getMODIFIERParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_rulevariable_declaration3603);
            	    this_MODIFIER_0=ruleMODIFIER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MODIFIER_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1275:3: (this_type_1= ruletype | kw= 'void' )?
            int alt30=3;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1276:5: this_type_1= ruletype
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruletype_in_rulevariable_declaration3633);
                    this_type_1=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_type_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1288:2: kw= 'void'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_rulevariable_declaration3657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVariable_declarationAccess().getVoidKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariable_declarationAccess().getVariable_declaratorParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_rulevariable_declarator_in_rulevariable_declaration3681);
            this_variable_declarator_3=rulevariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_variable_declarator_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1304:1: (kw= ',' this_variable_declarator_5= rulevariable_declarator )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==27) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1305:2: kw= ',' this_variable_declarator_5= rulevariable_declarator
            	    {
            	    kw=(Token)match(input,27,FOLLOW_27_in_rulevariable_declaration3700); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getVariable_declarationAccess().getVariable_declaratorParserRuleCall_3_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulevariable_declarator_in_rulevariable_declaration3722);
            	    this_variable_declarator_5=rulevariable_declarator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_variable_declarator_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1321:3: (kw= ';' | this_statement_block_7= rulestatement_block )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==18) ) {
                alt32=1;
            }
            else if ( (LA32_0==28) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1322:2: kw= ';'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_rulevariable_declaration3743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1329:5: this_statement_block_7= rulestatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariable_declarationAccess().getStatement_blockParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_rulevariable_declaration3771);
                    this_statement_block_7=rulestatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_statement_block_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1347:1: entryRulevariable_declarator returns [String current=null] : iv_rulevariable_declarator= rulevariable_declarator EOF ;
    public final String entryRulevariable_declarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_declarator = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1348:2: (iv_rulevariable_declarator= rulevariable_declarator EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1349:2: iv_rulevariable_declarator= rulevariable_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaratorRule()); 
            }
            pushFollow(FOLLOW_rulevariable_declarator_in_entryRulevariable_declarator3818);
            iv_rulevariable_declarator=rulevariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_declarator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declarator3829); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1356:1: rulevariable_declarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | (this_IDENTIFIER_3= RULE_IDENTIFIER (kw= '[' kw= ']' )* (kw= '=' this_variable_initializer_7= rulevariable_initializer )? ) ) ;
    public final AntlrDatatypeRuleToken rulevariable_declarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_3=null;
        AntlrDatatypeRuleToken this_arglist_1 = null;

        AntlrDatatypeRuleToken this_variable_initializer_7 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1359:28: ( ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | (this_IDENTIFIER_3= RULE_IDENTIFIER (kw= '[' kw= ']' )* (kw= '=' this_variable_initializer_7= rulevariable_initializer )? ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1360:1: ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | (this_IDENTIFIER_3= RULE_IDENTIFIER (kw= '[' kw= ']' )* (kw= '=' this_variable_initializer_7= rulevariable_initializer )? ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1360:1: ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | (this_IDENTIFIER_3= RULE_IDENTIFIER (kw= '[' kw= ']' )* (kw= '=' this_variable_initializer_7= rulevariable_initializer )? ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_IDENTIFIER) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1360:2: (kw= '(' (this_arglist_1= rulearglist )? kw= ')' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1360:2: (kw= '(' (this_arglist_1= rulearglist )? kw= ')' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1361:2: kw= '(' (this_arglist_1= rulearglist )? kw= ')'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_rulevariable_declarator3868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVariable_declaratorAccess().getLeftParenthesisKeyword_0_0()); 
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1366:1: (this_arglist_1= rulearglist )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=RULE_IDENTIFIER && LA33_0<=RULE_FLOAT_LITERAL)||LA33_0==31||(LA33_0>=55 && LA33_0<=57)||(LA33_0>=60 && LA33_0<=62)||(LA33_0>=90 && LA33_0<=103)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1367:5: this_arglist_1= rulearglist
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getVariable_declaratorAccess().getArglistParserRuleCall_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_rulearglist_in_rulevariable_declarator3891);
                            this_arglist_1=rulearglist();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_arglist_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,32,FOLLOW_32_in_rulevariable_declarator3911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVariable_declaratorAccess().getRightParenthesisKeyword_0_2()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1384:6: (this_IDENTIFIER_3= RULE_IDENTIFIER (kw= '[' kw= ']' )* (kw= '=' this_variable_initializer_7= rulevariable_initializer )? )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1384:6: (this_IDENTIFIER_3= RULE_IDENTIFIER (kw= '[' kw= ']' )* (kw= '=' this_variable_initializer_7= rulevariable_initializer )? )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1384:11: this_IDENTIFIER_3= RULE_IDENTIFIER (kw= '[' kw= ']' )* (kw= '=' this_variable_initializer_7= rulevariable_initializer )?
                    {
                    this_IDENTIFIER_3=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariable_declarator3934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENTIFIER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENTIFIER_3, grammarAccess.getVariable_declaratorAccess().getIDENTIFIERTerminalRuleCall_1_0()); 
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1391:1: (kw= '[' kw= ']' )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==33) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1392:2: kw= '[' kw= ']'
                    	    {
                    	    kw=(Token)match(input,33,FOLLOW_33_in_rulevariable_declarator3953); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketKeyword_1_1_0()); 
                    	          
                    	    }
                    	    kw=(Token)match(input,34,FOLLOW_34_in_rulevariable_declarator3966); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getVariable_declaratorAccess().getRightSquareBracketKeyword_1_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1403:3: (kw= '=' this_variable_initializer_7= rulevariable_initializer )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==42) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1404:2: kw= '=' this_variable_initializer_7= rulevariable_initializer
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_rulevariable_declarator3982); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getVariable_declaratorAccess().getEqualsSignKeyword_1_2_0()); 
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getVariable_declaratorAccess().getVariable_initializerParserRuleCall_1_2_1()); 
                                  
                            }
                            pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_declarator4004);
                            this_variable_initializer_7=rulevariable_initializer();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_variable_initializer_7);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1428:1: entryRulevariable_initializer returns [String current=null] : iv_rulevariable_initializer= rulevariable_initializer EOF ;
    public final String entryRulevariable_initializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_initializer = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1429:2: (iv_rulevariable_initializer= rulevariable_initializer EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1430:2: iv_rulevariable_initializer= rulevariable_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_initializerRule()); 
            }
            pushFollow(FOLLOW_rulevariable_initializer_in_entryRulevariable_initializer4053);
            iv_rulevariable_initializer=rulevariable_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_initializer.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_initializer4064); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1437:1: rulevariable_initializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression | (kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )* (kw= ',' )? )? kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken rulevariable_initializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_variable_initializer_2 = null;

        AntlrDatatypeRuleToken this_variable_initializer_4 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1440:28: ( (this_expression_0= ruleexpression | (kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )* (kw= ',' )? )? kw= '}' ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1441:1: (this_expression_0= ruleexpression | (kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )* (kw= ',' )? )? kw= '}' ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1441:1: (this_expression_0= ruleexpression | (kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )* (kw= ',' )? )? kw= '}' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_IDENTIFIER && LA40_0<=RULE_FLOAT_LITERAL)||LA40_0==31||(LA40_0>=55 && LA40_0<=57)||(LA40_0>=60 && LA40_0<=62)||LA40_0==90||(LA40_0>=92 && LA40_0<=95)) ) {
                alt40=1;
            }
            else if ( (LA40_0==28) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1442:5: this_expression_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariable_initializerAccess().getExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulevariable_initializer4111);
                    this_expression_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_expression_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1453:6: (kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )* (kw= ',' )? )? kw= '}' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1453:6: (kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )* (kw= ',' )? )? kw= '}' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1454:2: kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )* (kw= ',' )? )? kw= '}'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_rulevariable_initializer4136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVariable_initializerAccess().getLeftCurlyBracketKeyword_1_0()); 
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1459:1: (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )* (kw= ',' )? )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=RULE_IDENTIFIER && LA39_0<=RULE_FLOAT_LITERAL)||LA39_0==28||LA39_0==31||(LA39_0>=55 && LA39_0<=57)||(LA39_0>=60 && LA39_0<=62)||LA39_0==90||(LA39_0>=92 && LA39_0<=95)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1460:5: this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )* (kw= ',' )?
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getVariable_initializerAccess().getVariable_initializerParserRuleCall_1_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_initializer4159);
                            this_variable_initializer_2=rulevariable_initializer();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_variable_initializer_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1470:1: (kw= ',' this_variable_initializer_4= rulevariable_initializer )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==27) ) {
                                    int LA37_1 = input.LA(2);

                                    if ( ((LA37_1>=RULE_IDENTIFIER && LA37_1<=RULE_FLOAT_LITERAL)||LA37_1==28||LA37_1==31||(LA37_1>=55 && LA37_1<=57)||(LA37_1>=60 && LA37_1<=62)||LA37_1==90||(LA37_1>=92 && LA37_1<=95)) ) {
                                        alt37=1;
                                    }


                                }


                                switch (alt37) {
                            	case 1 :
                            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1471:2: kw= ',' this_variable_initializer_4= rulevariable_initializer
                            	    {
                            	    kw=(Token)match(input,27,FOLLOW_27_in_rulevariable_initializer4178); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getVariable_initializerAccess().getCommaKeyword_1_1_1_0()); 
                            	          
                            	    }
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              newCompositeNode(grammarAccess.getVariable_initializerAccess().getVariable_initializerParserRuleCall_1_1_1_1()); 
                            	          
                            	    }
                            	    pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_initializer4200);
                            	    this_variable_initializer_4=rulevariable_initializer();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      		current.merge(this_variable_initializer_4);
                            	          
                            	    }
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              afterParserOrEnumRuleCall();
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);

                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1487:3: (kw= ',' )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==27) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1488:2: kw= ','
                                    {
                                    kw=(Token)match(input,27,FOLLOW_27_in_rulevariable_initializer4221); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getVariable_initializerAccess().getCommaKeyword_1_1_2()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    kw=(Token)match(input,29,FOLLOW_29_in_rulevariable_initializer4238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVariable_initializerAccess().getRightCurlyBracketKeyword_1_2()); 
                          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1507:1: entryRuleif_statement returns [String current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final String entryRuleif_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleif_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1508:2: (iv_ruleif_statement= ruleif_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1509:2: iv_ruleif_statement= ruleif_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_statementRule()); 
            }
            pushFollow(FOLLOW_ruleif_statement_in_entryRuleif_statement4280);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleif_statement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_statement4291); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1516:1: ruleif_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ( ( ( 'else' rulestatement ) )=> (kw= 'else' this_statement_6= rulestatement ) )? ) ;
    public final AntlrDatatypeRuleToken ruleif_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_statement_4 = null;

        AntlrDatatypeRuleToken this_statement_6 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1519:28: ( (kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ( ( ( 'else' rulestatement ) )=> (kw= 'else' this_statement_6= rulestatement ) )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1520:1: (kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ( ( ( 'else' rulestatement ) )=> (kw= 'else' this_statement_6= rulestatement ) )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1520:1: (kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ( ( ( 'else' rulestatement ) )=> (kw= 'else' this_statement_6= rulestatement ) )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1521:2: kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ( ( ( 'else' rulestatement ) )=> (kw= 'else' this_statement_6= rulestatement ) )?
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleif_statement4329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getIf_statementAccess().getIfKeyword_0()); 
                  
            }
            kw=(Token)match(input,31,FOLLOW_31_in_ruleif_statement4342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getIf_statementAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleif_statement4364);
            this_expression_2=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_expression_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,32,FOLLOW_32_in_ruleif_statement4382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getIf_statementAccess().getRightParenthesisKeyword_3()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_4()); 
                  
            }
            pushFollow(FOLLOW_rulestatement_in_ruleif_statement4404);
            this_statement_4=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_statement_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1560:1: ( ( ( 'else' rulestatement ) )=> (kw= 'else' this_statement_6= rulestatement ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred97_InternalSimpleJava()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1560:2: ( ( 'else' rulestatement ) )=> (kw= 'else' this_statement_6= rulestatement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1562:18: (kw= 'else' this_statement_6= rulestatement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1563:2: kw= 'else' this_statement_6= rulestatement
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleif_statement4435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIf_statementAccess().getElseKeyword_5_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_5_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulestatement_in_ruleif_statement4457);
                    this_statement_6=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_statement_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1587:1: entryRuledo_statement returns [String current=null] : iv_ruledo_statement= ruledo_statement EOF ;
    public final String entryRuledo_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledo_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1588:2: (iv_ruledo_statement= ruledo_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1589:2: iv_ruledo_statement= ruledo_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDo_statementRule()); 
            }
            pushFollow(FOLLOW_ruledo_statement_in_entryRuledo_statement4506);
            iv_ruledo_statement=ruledo_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledo_statement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledo_statement4517); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1596:1: ruledo_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'do' this_statement_1= rulestatement kw= 'while' kw= '(' this_expression_4= ruleexpression kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruledo_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_1 = null;

        AntlrDatatypeRuleToken this_expression_4 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1599:28: ( (kw= 'do' this_statement_1= rulestatement kw= 'while' kw= '(' this_expression_4= ruleexpression kw= ')' kw= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1600:1: (kw= 'do' this_statement_1= rulestatement kw= 'while' kw= '(' this_expression_4= ruleexpression kw= ')' kw= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1600:1: (kw= 'do' this_statement_1= rulestatement kw= 'while' kw= '(' this_expression_4= ruleexpression kw= ')' kw= ';' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1601:2: kw= 'do' this_statement_1= rulestatement kw= 'while' kw= '(' this_expression_4= ruleexpression kw= ')' kw= ';'
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruledo_statement4555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDo_statementAccess().getDoKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDo_statementAccess().getStatementParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulestatement_in_ruledo_statement4577);
            this_statement_1=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_statement_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,46,FOLLOW_46_in_ruledo_statement4595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDo_statementAccess().getWhileKeyword_2()); 
                  
            }
            kw=(Token)match(input,31,FOLLOW_31_in_ruledo_statement4608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDo_statementAccess().getLeftParenthesisKeyword_3()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDo_statementAccess().getExpressionParserRuleCall_4()); 
                  
            }
            pushFollow(FOLLOW_ruleexpression_in_ruledo_statement4630);
            this_expression_4=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_expression_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,32,FOLLOW_32_in_ruledo_statement4648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDo_statementAccess().getRightParenthesisKeyword_5()); 
                  
            }
            kw=(Token)match(input,18,FOLLOW_18_in_ruledo_statement4661); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDo_statementAccess().getSemicolonKeyword_6()); 
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1660:1: entryRulewhile_statement returns [String current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final String entryRulewhile_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulewhile_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1661:2: (iv_rulewhile_statement= rulewhile_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1662:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_statementRule()); 
            }
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement4702);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulewhile_statement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement4713); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1669:1: rulewhile_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulewhile_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_statement_4 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1672:28: ( (kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1673:1: (kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1673:1: (kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1674:2: kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement
            {
            kw=(Token)match(input,46,FOLLOW_46_in_rulewhile_statement4751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getWhile_statementAccess().getWhileKeyword_0()); 
                  
            }
            kw=(Token)match(input,31,FOLLOW_31_in_rulewhile_statement4764); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getWhile_statementAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleexpression_in_rulewhile_statement4786);
            this_expression_2=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_expression_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,32,FOLLOW_32_in_rulewhile_statement4804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getWhile_statementAccess().getRightParenthesisKeyword_3()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementParserRuleCall_4()); 
                  
            }
            pushFollow(FOLLOW_rulestatement_in_rulewhile_statement4826);
            this_statement_4=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_statement_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1721:1: entryRulefor_statement returns [String current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final String entryRulefor_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefor_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1722:2: (iv_rulefor_statement= rulefor_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1723:2: iv_rulefor_statement= rulefor_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_statementRule()); 
            }
            pushFollow(FOLLOW_rulefor_statement_in_entryRulefor_statement4872);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefor_statement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_statement4883); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1730:1: rulefor_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'for' kw= '(' ( ( ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration ) | (this_expression_3= ruleexpression kw= ';' ) | kw= ';' ) (this_expression_6= ruleexpression )? kw= ';' (this_expression_8= ruleexpression )? kw= ')' this_statement_10= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulefor_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_variable_declaration_2 = null;

        AntlrDatatypeRuleToken this_expression_3 = null;

        AntlrDatatypeRuleToken this_expression_6 = null;

        AntlrDatatypeRuleToken this_expression_8 = null;

        AntlrDatatypeRuleToken this_statement_10 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1733:28: ( (kw= 'for' kw= '(' ( ( ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration ) | (this_expression_3= ruleexpression kw= ';' ) | kw= ';' ) (this_expression_6= ruleexpression )? kw= ';' (this_expression_8= ruleexpression )? kw= ')' this_statement_10= rulestatement ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1734:1: (kw= 'for' kw= '(' ( ( ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration ) | (this_expression_3= ruleexpression kw= ';' ) | kw= ';' ) (this_expression_6= ruleexpression )? kw= ';' (this_expression_8= ruleexpression )? kw= ')' this_statement_10= rulestatement )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1734:1: (kw= 'for' kw= '(' ( ( ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration ) | (this_expression_3= ruleexpression kw= ';' ) | kw= ';' ) (this_expression_6= ruleexpression )? kw= ';' (this_expression_8= ruleexpression )? kw= ')' this_statement_10= rulestatement )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1735:2: kw= 'for' kw= '(' ( ( ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration ) | (this_expression_3= ruleexpression kw= ';' ) | kw= ';' ) (this_expression_6= ruleexpression )? kw= ';' (this_expression_8= ruleexpression )? kw= ')' this_statement_10= rulestatement
            {
            kw=(Token)match(input,47,FOLLOW_47_in_rulefor_statement4921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFor_statementAccess().getForKeyword_0()); 
                  
            }
            kw=(Token)match(input,31,FOLLOW_31_in_rulefor_statement4934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFor_statementAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1746:1: ( ( ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration ) | (this_expression_3= ruleexpression kw= ';' ) | kw= ';' )
            int alt42=3;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1746:2: ( ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1746:2: ( ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1746:3: ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFor_statementAccess().getVariable_declarationParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulevariable_declaration_in_rulefor_statement4963);
                    this_variable_declaration_2=rulevariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_variable_declaration_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1758:6: (this_expression_3= ruleexpression kw= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1758:6: (this_expression_3= ruleexpression kw= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1759:5: this_expression_3= ruleexpression kw= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionParserRuleCall_2_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4998);
                    this_expression_3=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_expression_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,18,FOLLOW_18_in_rulefor_statement5016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFor_statementAccess().getSemicolonKeyword_2_1_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1777:2: kw= ';'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_rulefor_statement5036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFor_statementAccess().getSemicolonKeyword_2_2()); 
                          
                    }

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1782:2: (this_expression_6= ruleexpression )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_IDENTIFIER && LA43_0<=RULE_FLOAT_LITERAL)||LA43_0==31||(LA43_0>=55 && LA43_0<=57)||(LA43_0>=60 && LA43_0<=62)||LA43_0==90||(LA43_0>=92 && LA43_0<=95)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1783:5: this_expression_6= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement5060);
                    this_expression_6=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_expression_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,18,FOLLOW_18_in_rulefor_statement5080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFor_statementAccess().getSemicolonKeyword_4()); 
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1799:1: (this_expression_8= ruleexpression )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_IDENTIFIER && LA44_0<=RULE_FLOAT_LITERAL)||LA44_0==31||(LA44_0>=55 && LA44_0<=57)||(LA44_0>=60 && LA44_0<=62)||LA44_0==90||(LA44_0>=92 && LA44_0<=95)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1800:5: this_expression_8= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement5103);
                    this_expression_8=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_expression_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_32_in_rulefor_statement5123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFor_statementAccess().getRightParenthesisKeyword_6()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFor_statementAccess().getStatementParserRuleCall_7()); 
                  
            }
            pushFollow(FOLLOW_rulestatement_in_rulefor_statement5145);
            this_statement_10=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_statement_10);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1835:1: entryRuletry_statement returns [String current=null] : iv_ruletry_statement= ruletry_statement EOF ;
    public final String entryRuletry_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletry_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1836:2: (iv_ruletry_statement= ruletry_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1837:2: iv_ruletry_statement= ruletry_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruletry_statement_in_entryRuletry_statement5191);
            iv_ruletry_statement=ruletry_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletry_statement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletry_statement5202); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1844:1: ruletry_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'try' this_statement_block_1= rulestatement_block ( ( ( 'catch' '(' ruleparameter ')' rulestatement_block ) )=> (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_block_6= rulestatement_block ) )* ( ( ( 'finally' rulestatement_block ) )=> (kw= 'finally' this_statement_block_8= rulestatement_block ) )? ) ;
    public final AntlrDatatypeRuleToken ruletry_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_block_1 = null;

        AntlrDatatypeRuleToken this_parameter_4 = null;

        AntlrDatatypeRuleToken this_statement_block_6 = null;

        AntlrDatatypeRuleToken this_statement_block_8 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1847:28: ( (kw= 'try' this_statement_block_1= rulestatement_block ( ( ( 'catch' '(' ruleparameter ')' rulestatement_block ) )=> (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_block_6= rulestatement_block ) )* ( ( ( 'finally' rulestatement_block ) )=> (kw= 'finally' this_statement_block_8= rulestatement_block ) )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1848:1: (kw= 'try' this_statement_block_1= rulestatement_block ( ( ( 'catch' '(' ruleparameter ')' rulestatement_block ) )=> (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_block_6= rulestatement_block ) )* ( ( ( 'finally' rulestatement_block ) )=> (kw= 'finally' this_statement_block_8= rulestatement_block ) )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1848:1: (kw= 'try' this_statement_block_1= rulestatement_block ( ( ( 'catch' '(' ruleparameter ')' rulestatement_block ) )=> (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_block_6= rulestatement_block ) )* ( ( ( 'finally' rulestatement_block ) )=> (kw= 'finally' this_statement_block_8= rulestatement_block ) )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1849:2: kw= 'try' this_statement_block_1= rulestatement_block ( ( ( 'catch' '(' ruleparameter ')' rulestatement_block ) )=> (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_block_6= rulestatement_block ) )* ( ( ( 'finally' rulestatement_block ) )=> (kw= 'finally' this_statement_block_8= rulestatement_block ) )?
            {
            kw=(Token)match(input,48,FOLLOW_48_in_ruletry_statement5240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getTry_statementAccess().getTryKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTry_statementAccess().getStatement_blockParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulestatement_block_in_ruletry_statement5262);
            this_statement_block_1=rulestatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_statement_block_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1865:1: ( ( ( 'catch' '(' ruleparameter ')' rulestatement_block ) )=> (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_block_6= rulestatement_block ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==49) && (synpred103_InternalSimpleJava())) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1865:2: ( ( 'catch' '(' ruleparameter ')' rulestatement_block ) )=> (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_block_6= rulestatement_block )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1871:24: (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_block_6= rulestatement_block )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1872:2: kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_block_6= rulestatement_block
            	    {
            	    kw=(Token)match(input,49,FOLLOW_49_in_ruletry_statement5304); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTry_statementAccess().getCatchKeyword_2_0_0()); 
            	          
            	    }
            	    kw=(Token)match(input,31,FOLLOW_31_in_ruletry_statement5317); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_0_1()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTry_statementAccess().getParameterParserRuleCall_2_0_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleparameter_in_ruletry_statement5339);
            	    this_parameter_4=ruleparameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_parameter_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,32,FOLLOW_32_in_ruletry_statement5357); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_0_3()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTry_statementAccess().getStatement_blockParserRuleCall_2_0_4()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulestatement_block_in_ruletry_statement5379);
            	    this_statement_block_6=rulestatement_block();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_statement_block_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1911:4: ( ( ( 'finally' rulestatement_block ) )=> (kw= 'finally' this_statement_block_8= rulestatement_block ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) && (synpred104_InternalSimpleJava())) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1911:5: ( ( 'finally' rulestatement_block ) )=> (kw= 'finally' this_statement_block_8= rulestatement_block )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1913:24: (kw= 'finally' this_statement_block_8= rulestatement_block )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1914:2: kw= 'finally' this_statement_block_8= rulestatement_block
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruletry_statement5413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTry_statementAccess().getStatement_blockParserRuleCall_3_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulestatement_block_in_ruletry_statement5435);
                    this_statement_block_8=rulestatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_statement_block_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1938:1: entryRuleswitch_statement returns [String current=null] : iv_ruleswitch_statement= ruleswitch_statement EOF ;
    public final String entryRuleswitch_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleswitch_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1939:2: (iv_ruleswitch_statement= ruleswitch_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1940:2: iv_ruleswitch_statement= ruleswitch_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitch_statementRule()); 
            }
            pushFollow(FOLLOW_ruleswitch_statement_in_entryRuleswitch_statement5484);
            iv_ruleswitch_statement=ruleswitch_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleswitch_statement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleswitch_statement5495); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1947:1: ruleswitch_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'switch' kw= '(' this_expression_2= ruleexpression kw= ')' kw= '{' ( (kw= 'case' this_expression_6= ruleexpression kw= ':' ) | (kw= 'default' kw= ':' ) | this_statement_10= rulestatement )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleswitch_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_expression_6 = null;

        AntlrDatatypeRuleToken this_statement_10 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1950:28: ( (kw= 'switch' kw= '(' this_expression_2= ruleexpression kw= ')' kw= '{' ( (kw= 'case' this_expression_6= ruleexpression kw= ':' ) | (kw= 'default' kw= ':' ) | this_statement_10= rulestatement )* kw= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1951:1: (kw= 'switch' kw= '(' this_expression_2= ruleexpression kw= ')' kw= '{' ( (kw= 'case' this_expression_6= ruleexpression kw= ':' ) | (kw= 'default' kw= ':' ) | this_statement_10= rulestatement )* kw= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1951:1: (kw= 'switch' kw= '(' this_expression_2= ruleexpression kw= ')' kw= '{' ( (kw= 'case' this_expression_6= ruleexpression kw= ':' ) | (kw= 'default' kw= ':' ) | this_statement_10= rulestatement )* kw= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1952:2: kw= 'switch' kw= '(' this_expression_2= ruleexpression kw= ')' kw= '{' ( (kw= 'case' this_expression_6= ruleexpression kw= ':' ) | (kw= 'default' kw= ':' ) | this_statement_10= rulestatement )* kw= '}'
            {
            kw=(Token)match(input,51,FOLLOW_51_in_ruleswitch_statement5533); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getSwitchKeyword_0()); 
                  
            }
            kw=(Token)match(input,31,FOLLOW_31_in_ruleswitch_statement5546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpressionParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleswitch_statement5568);
            this_expression_2=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_expression_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,32,FOLLOW_32_in_ruleswitch_statement5586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getRightParenthesisKeyword_3()); 
                  
            }
            kw=(Token)match(input,28,FOLLOW_28_in_ruleswitch_statement5599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getLeftCurlyBracketKeyword_4()); 
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1986:1: ( (kw= 'case' this_expression_6= ruleexpression kw= ':' ) | (kw= 'default' kw= ':' ) | this_statement_10= rulestatement )*
            loop47:
            do {
                int alt47=4;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    alt47=1;
                    }
                    break;
                case 53:
                    {
                    alt47=2;
                    }
                    break;
                case RULE_IDENTIFIER:
                case RULE_STRING:
                case RULE_DECIMAL_DIGITS:
                case RULE_INTEGER_LITERAL:
                case RULE_FLOAT_LITERAL:
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
                case 60:
                case 61:
                case 62:
                case 90:
                case 92:
                case 93:
                case 94:
                case 95:
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
                    alt47=3;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1986:2: (kw= 'case' this_expression_6= ruleexpression kw= ':' )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1986:2: (kw= 'case' this_expression_6= ruleexpression kw= ':' )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1987:2: kw= 'case' this_expression_6= ruleexpression kw= ':'
            	    {
            	    kw=(Token)match(input,52,FOLLOW_52_in_ruleswitch_statement5614); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getCaseKeyword_5_0_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpressionParserRuleCall_5_0_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleexpression_in_ruleswitch_statement5636);
            	    this_expression_6=ruleexpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_expression_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,38,FOLLOW_38_in_ruleswitch_statement5654); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getColonKeyword_5_0_2()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2010:6: (kw= 'default' kw= ':' )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2010:6: (kw= 'default' kw= ':' )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2011:2: kw= 'default' kw= ':'
            	    {
            	    kw=(Token)match(input,53,FOLLOW_53_in_ruleswitch_statement5675); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getDefaultKeyword_5_1_0()); 
            	          
            	    }
            	    kw=(Token)match(input,38,FOLLOW_38_in_ruleswitch_statement5688); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getColonKeyword_5_1_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2024:5: this_statement_10= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSwitch_statementAccess().getStatementParserRuleCall_5_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_ruleswitch_statement5717);
            	    this_statement_10=rulestatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_statement_10);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            kw=(Token)match(input,29,FOLLOW_29_in_ruleswitch_statement5737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getRightCurlyBracketKeyword_6()); 
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2048:1: entryRuleconstructor_declaration returns [String current=null] : iv_ruleconstructor_declaration= ruleconstructor_declaration EOF ;
    public final String entryRuleconstructor_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstructor_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2049:2: (iv_ruleconstructor_declaration= ruleconstructor_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2050:2: iv_ruleconstructor_declaration= ruleconstructor_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleconstructor_declaration_in_entryRuleconstructor_declaration5778);
            iv_ruleconstructor_declaration=ruleconstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstructor_declaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstructor_declaration5789); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2057:1: ruleconstructor_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MODIFIER_0= ruleMODIFIER )* (this_type_1= ruletype | kw= 'void' )? this_IDENTIFIER_3= RULE_IDENTIFIER kw= '(' (this_parameter_list_5= ruleparameter_list )? kw= ')' this_statement_block_7= rulestatement_block ) ;
    public final AntlrDatatypeRuleToken ruleconstructor_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_3=null;
        AntlrDatatypeRuleToken this_MODIFIER_0 = null;

        AntlrDatatypeRuleToken this_type_1 = null;

        AntlrDatatypeRuleToken this_parameter_list_5 = null;

        AntlrDatatypeRuleToken this_statement_block_7 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2060:28: ( ( (this_MODIFIER_0= ruleMODIFIER )* (this_type_1= ruletype | kw= 'void' )? this_IDENTIFIER_3= RULE_IDENTIFIER kw= '(' (this_parameter_list_5= ruleparameter_list )? kw= ')' this_statement_block_7= rulestatement_block ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2061:1: ( (this_MODIFIER_0= ruleMODIFIER )* (this_type_1= ruletype | kw= 'void' )? this_IDENTIFIER_3= RULE_IDENTIFIER kw= '(' (this_parameter_list_5= ruleparameter_list )? kw= ')' this_statement_block_7= rulestatement_block )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2061:1: ( (this_MODIFIER_0= ruleMODIFIER )* (this_type_1= ruletype | kw= 'void' )? this_IDENTIFIER_3= RULE_IDENTIFIER kw= '(' (this_parameter_list_5= ruleparameter_list )? kw= ')' this_statement_block_7= rulestatement_block )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2061:2: (this_MODIFIER_0= ruleMODIFIER )* (this_type_1= ruletype | kw= 'void' )? this_IDENTIFIER_3= RULE_IDENTIFIER kw= '(' (this_parameter_list_5= ruleparameter_list )? kw= ')' this_statement_block_7= rulestatement_block
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2061:2: (this_MODIFIER_0= ruleMODIFIER )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==35||LA48_0==54||(LA48_0>=104 && LA48_0<=111)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2062:5: this_MODIFIER_0= ruleMODIFIER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getConstructor_declarationAccess().getMODIFIERParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleMODIFIER_in_ruleconstructor_declaration5837);
            	    this_MODIFIER_0=ruleMODIFIER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MODIFIER_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2072:3: (this_type_1= ruletype | kw= 'void' )?
            int alt49=3;
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
                    alt49=1;
                    }
                    break;
                case RULE_IDENTIFIER:
                    {
                    int LA49_2 = input.LA(2);

                    if ( (LA49_2==RULE_IDENTIFIER||LA49_2==33||LA49_2==58) ) {
                        alt49=1;
                    }
                    }
                    break;
                case 41:
                    {
                    alt49=2;
                    }
                    break;
            }

            switch (alt49) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2073:5: this_type_1= ruletype
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstructor_declarationAccess().getTypeParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruletype_in_ruleconstructor_declaration5867);
                    this_type_1=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_type_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2085:2: kw= 'void'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleconstructor_declaration5891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConstructor_declarationAccess().getVoidKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }

            this_IDENTIFIER_3=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstructor_declaration5908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_3, grammarAccess.getConstructor_declarationAccess().getIDENTIFIERTerminalRuleCall_2()); 
                  
            }
            kw=(Token)match(input,31,FOLLOW_31_in_ruleconstructor_declaration5926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_3()); 
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2103:1: (this_parameter_list_5= ruleparameter_list )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_IDENTIFIER||(LA50_0>=96 && LA50_0<=103)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2104:5: this_parameter_list_5= ruleparameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParameter_listParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleparameter_list_in_ruleconstructor_declaration5949);
                    this_parameter_list_5=ruleparameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_parameter_list_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_32_in_ruleconstructor_declaration5969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_5()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConstructor_declarationAccess().getStatement_blockParserRuleCall_6()); 
                  
            }
            pushFollow(FOLLOW_rulestatement_block_in_ruleconstructor_declaration5991);
            this_statement_block_7=rulestatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_statement_block_7);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2139:1: entryRulestatic_initializer returns [String current=null] : iv_rulestatic_initializer= rulestatic_initializer EOF ;
    public final String entryRulestatic_initializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatic_initializer = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2140:2: (iv_rulestatic_initializer= rulestatic_initializer EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2141:2: iv_rulestatic_initializer= rulestatic_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            }
            pushFollow(FOLLOW_rulestatic_initializer_in_entryRulestatic_initializer6037);
            iv_rulestatic_initializer=rulestatic_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatic_initializer.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatic_initializer6048); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2148:1: rulestatic_initializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'static' this_statement_block_1= rulestatement_block ) ;
    public final AntlrDatatypeRuleToken rulestatic_initializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_block_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2151:28: ( (kw= 'static' this_statement_block_1= rulestatement_block ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2152:1: (kw= 'static' this_statement_block_1= rulestatement_block )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2152:1: (kw= 'static' this_statement_block_1= rulestatement_block )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2153:2: kw= 'static' this_statement_block_1= rulestatement_block
            {
            kw=(Token)match(input,54,FOLLOW_54_in_rulestatic_initializer6086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getStatic_initializerAccess().getStaticKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStatic_initializerAccess().getStatement_blockParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulestatement_block_in_rulestatic_initializer6108);
            this_statement_block_1=rulestatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_statement_block_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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


    // $ANTLR start "entryRuleexp_aux"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2177:1: entryRuleexp_aux returns [String current=null] : iv_ruleexp_aux= ruleexp_aux EOF ;
    public final String entryRuleexp_aux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexp_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2178:2: (iv_ruleexp_aux= ruleexp_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2179:2: iv_ruleexp_aux= ruleexp_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExp_auxRule()); 
            }
            pushFollow(FOLLOW_ruleexp_aux_in_entryRuleexp_aux6154);
            iv_ruleexp_aux=ruleexp_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexp_aux.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexp_aux6165); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2186:1: ruleexp_aux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression ) kw= ')' ) | (this_type_2= ruletype kw= ')' this_expression_4= ruleexpression ) ) ;
    public final AntlrDatatypeRuleToken ruleexp_aux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_type_2 = null;

        AntlrDatatypeRuleToken this_expression_4 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2189:28: ( ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression ) kw= ')' ) | (this_type_2= ruletype kw= ')' this_expression_4= ruleexpression ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2190:1: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression ) kw= ')' ) | (this_type_2= ruletype kw= ')' this_expression_4= ruleexpression ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2190:1: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression ) kw= ')' ) | (this_type_2= ruletype kw= ')' this_expression_4= ruleexpression ) )
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2190:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression ) kw= ')' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2190:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression ) kw= ')' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2190:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression ) kw= ')'
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2190:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2190:4: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExp_auxAccess().getExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleexp_aux6335);
                    this_expression_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_expression_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }

                    kw=(Token)match(input,32,FOLLOW_32_in_ruleexp_aux6354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExp_auxAccess().getRightParenthesisKeyword_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2232:6: (this_type_2= ruletype kw= ')' this_expression_4= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2232:6: (this_type_2= ruletype kw= ')' this_expression_4= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2233:5: this_type_2= ruletype kw= ')' this_expression_4= ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExp_auxAccess().getTypeParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruletype_in_ruleexp_aux6384);
                    this_type_2=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_type_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleexp_aux6402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExp_auxAccess().getRightParenthesisKeyword_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExp_auxAccess().getExpressionParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpression_in_ruleexp_aux6424);
                    this_expression_4=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_expression_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2268:1: entryRuleexpression returns [String current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final String entryRuleexpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2269:2: (iv_ruleexpression= ruleexpression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2270:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression6471);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression6482); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2277:1: ruleexpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_logical_expression_0= rulelogical_expression | this_numeric_expression_1= rulenumeric_expression | this_bit_expression_2= rulebit_expression | this_creating_expression_3= rulecreating_expression | this_literal_expression_4= ruleliteral_expression | kw= 'null' | kw= 'super' | kw= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (kw= '(' this_exp_aux_10= ruleexp_aux ) ) this_expression_aux_11= ruleexpression_aux ) ;
    public final AntlrDatatypeRuleToken ruleexpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_8=null;
        AntlrDatatypeRuleToken this_logical_expression_0 = null;

        AntlrDatatypeRuleToken this_numeric_expression_1 = null;

        AntlrDatatypeRuleToken this_bit_expression_2 = null;

        AntlrDatatypeRuleToken this_creating_expression_3 = null;

        AntlrDatatypeRuleToken this_literal_expression_4 = null;

        AntlrDatatypeRuleToken this_exp_aux_10 = null;

        AntlrDatatypeRuleToken this_expression_aux_11 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2280:28: ( ( (this_logical_expression_0= rulelogical_expression | this_numeric_expression_1= rulenumeric_expression | this_bit_expression_2= rulebit_expression | this_creating_expression_3= rulecreating_expression | this_literal_expression_4= ruleliteral_expression | kw= 'null' | kw= 'super' | kw= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (kw= '(' this_exp_aux_10= ruleexp_aux ) ) this_expression_aux_11= ruleexpression_aux ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2281:1: ( (this_logical_expression_0= rulelogical_expression | this_numeric_expression_1= rulenumeric_expression | this_bit_expression_2= rulebit_expression | this_creating_expression_3= rulecreating_expression | this_literal_expression_4= ruleliteral_expression | kw= 'null' | kw= 'super' | kw= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (kw= '(' this_exp_aux_10= ruleexp_aux ) ) this_expression_aux_11= ruleexpression_aux )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2281:1: ( (this_logical_expression_0= rulelogical_expression | this_numeric_expression_1= rulenumeric_expression | this_bit_expression_2= rulebit_expression | this_creating_expression_3= rulecreating_expression | this_literal_expression_4= ruleliteral_expression | kw= 'null' | kw= 'super' | kw= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (kw= '(' this_exp_aux_10= ruleexp_aux ) ) this_expression_aux_11= ruleexpression_aux )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2281:2: (this_logical_expression_0= rulelogical_expression | this_numeric_expression_1= rulenumeric_expression | this_bit_expression_2= rulebit_expression | this_creating_expression_3= rulecreating_expression | this_literal_expression_4= ruleliteral_expression | kw= 'null' | kw= 'super' | kw= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (kw= '(' this_exp_aux_10= ruleexp_aux ) ) this_expression_aux_11= ruleexpression_aux
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2281:2: (this_logical_expression_0= rulelogical_expression | this_numeric_expression_1= rulenumeric_expression | this_bit_expression_2= rulebit_expression | this_creating_expression_3= rulecreating_expression | this_literal_expression_4= ruleliteral_expression | kw= 'null' | kw= 'super' | kw= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (kw= '(' this_exp_aux_10= ruleexp_aux ) )
            int alt52=10;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2282:5: this_logical_expression_0= rulelogical_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getLogical_expressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulelogical_expression_in_ruleexpression6530);
                    this_logical_expression_0=rulelogical_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_logical_expression_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2294:5: this_numeric_expression_1= rulenumeric_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getNumeric_expressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulenumeric_expression_in_ruleexpression6563);
                    this_numeric_expression_1=rulenumeric_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_numeric_expression_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2306:5: this_bit_expression_2= rulebit_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBit_expressionParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulebit_expression_in_ruleexpression6596);
                    this_bit_expression_2=rulebit_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_bit_expression_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2318:5: this_creating_expression_3= rulecreating_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getCreating_expressionParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulecreating_expression_in_ruleexpression6629);
                    this_creating_expression_3=rulecreating_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_creating_expression_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2330:5: this_literal_expression_4= ruleliteral_expression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getLiteral_expressionParserRuleCall_0_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleliteral_expression_in_ruleexpression6662);
                    this_literal_expression_4=ruleliteral_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_literal_expression_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2342:2: kw= 'null'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleexpression6686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionAccess().getNullKeyword_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2349:2: kw= 'super'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleexpression6705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionAccess().getSuperKeyword_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2356:2: kw= 'this'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleexpression6724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionAccess().getThisKeyword_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2362:10: this_IDENTIFIER_8= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_8=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleexpression6745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENTIFIER_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENTIFIER_8, grammarAccess.getExpressionAccess().getIDENTIFIERTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2370:6: (kw= '(' this_exp_aux_10= ruleexp_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2370:6: (kw= '(' this_exp_aux_10= ruleexp_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2371:2: kw= '(' this_exp_aux_10= ruleexp_aux
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleexpression6770); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_9_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getExp_auxParserRuleCall_0_9_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexp_aux_in_ruleexpression6792);
                    this_exp_aux_10=ruleexp_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_exp_aux_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getExpression_auxParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression6821);
            this_expression_aux_11=ruleexpression_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_expression_aux_11);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2406:1: entryRuleexpression_aux returns [String current=null] : iv_ruleexpression_aux= ruleexpression_aux EOF ;
    public final String entryRuleexpression_aux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2407:2: (iv_ruleexpression_aux= ruleexpression_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2408:2: iv_ruleexpression_aux= ruleexpression_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_auxRule()); 
            }
            pushFollow(FOLLOW_ruleexpression_aux_in_entryRuleexpression_aux6867);
            iv_ruleexpression_aux=ruleexpression_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression_aux.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression_aux6878); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2415:1: ruleexpression_aux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression ) | (kw= '++' | kw= '--' ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression ) | ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) ) ) this_expression_aux_52= ruleexpression_aux )? ;
    public final AntlrDatatypeRuleToken ruleexpression_aux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_arglist_1 = null;

        AntlrDatatypeRuleToken this_aux_3 = null;

        AntlrDatatypeRuleToken this_expression_5 = null;

        AntlrDatatypeRuleToken this_expression_7 = null;

        AntlrDatatypeRuleToken this_name_9 = null;

        AntlrDatatypeRuleToken this_mais_aux_10 = null;

        AntlrDatatypeRuleToken this_expression_11 = null;

        AntlrDatatypeRuleToken this_mais_aux_14 = null;

        AntlrDatatypeRuleToken this_expression_23 = null;

        AntlrDatatypeRuleToken this_expression_35 = null;

        AntlrDatatypeRuleToken this_expression_37 = null;

        AntlrDatatypeRuleToken this_expression_39 = null;

        AntlrDatatypeRuleToken this_expression_46 = null;

        AntlrDatatypeRuleToken this_expression_51 = null;

        AntlrDatatypeRuleToken this_expression_aux_52 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2418:28: ( ( ( ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression ) | (kw= '++' | kw= '--' ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression ) | ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) ) ) this_expression_aux_52= ruleexpression_aux )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:1: ( ( ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression ) | (kw= '++' | kw= '--' ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression ) | ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) ) ) this_expression_aux_52= ruleexpression_aux )?
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:1: ( ( ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression ) | (kw= '++' | kw= '--' ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression ) | ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) ) ) this_expression_aux_52= ruleexpression_aux )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:2: ( ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression ) | (kw= '++' | kw= '--' ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression ) | ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) ) ) this_expression_aux_52= ruleexpression_aux
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:2: ( ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression ) | (kw= '++' | kw= '--' ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression ) | ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) ) )
                    int alt61=5;
                    alt61 = dfa61.predict(input);
                    switch (alt61) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:3: ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:3: ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                            int alt54=5;
                            switch ( input.LA(1) ) {
                            case 31:
                                {
                                alt54=1;
                                }
                                break;
                            case 33:
                                {
                                alt54=2;
                                }
                                break;
                            case 58:
                                {
                                alt54=3;
                                }
                                break;
                            case 27:
                                {
                                alt54=4;
                                }
                                break;
                            case 59:
                                {
                                alt54=5;
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
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:4: (kw= '(' (this_arglist_1= rulearglist )? kw= ')' )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:4: (kw= '(' (this_arglist_1= rulearglist )? kw= ')' )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2420:2: kw= '(' (this_arglist_1= rulearglist )? kw= ')'
                                    {
                                    kw=(Token)match(input,31,FOLLOW_31_in_ruleexpression_aux6919); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getLeftParenthesisKeyword_0_0_0_0()); 
                                          
                                    }
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2425:1: (this_arglist_1= rulearglist )?
                                    int alt53=2;
                                    int LA53_0 = input.LA(1);

                                    if ( ((LA53_0>=RULE_IDENTIFIER && LA53_0<=RULE_FLOAT_LITERAL)||LA53_0==31||(LA53_0>=55 && LA53_0<=57)||(LA53_0>=60 && LA53_0<=62)||(LA53_0>=90 && LA53_0<=103)) ) {
                                        alt53=1;
                                    }
                                    switch (alt53) {
                                        case 1 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2426:5: this_arglist_1= rulearglist
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                                      newCompositeNode(grammarAccess.getExpression_auxAccess().getArglistParserRuleCall_0_0_0_1()); 
                                                  
                                            }
                                            pushFollow(FOLLOW_rulearglist_in_ruleexpression_aux6942);
                                            this_arglist_1=rulearglist();

                                            state._fsp--;
                                            if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              		current.merge(this_arglist_1);
                                                  
                                            }
                                            if ( state.backtracking==0 ) {
                                               
                                                      afterParserOrEnumRuleCall();
                                                  
                                            }

                                            }
                                            break;

                                    }

                                    kw=(Token)match(input,32,FOLLOW_32_in_ruleexpression_aux6962); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getRightParenthesisKeyword_0_0_0_2()); 
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2444:5: this_aux_3= ruleaux
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxParserRuleCall_0_0_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleaux_in_ruleexpression_aux6991);
                                    this_aux_3=ruleaux();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_aux_3);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }
                                    break;
                                case 3 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2455:6: (kw= '.' this_expression_5= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2455:6: (kw= '.' this_expression_5= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2456:2: kw= '.' this_expression_5= ruleexpression
                                    {
                                    kw=(Token)match(input,58,FOLLOW_58_in_ruleexpression_aux7016); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getFullStopKeyword_0_0_2_0()); 
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_0_2_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7038);
                                    this_expression_5=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_expression_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 4 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2473:6: (kw= ',' this_expression_7= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2473:6: (kw= ',' this_expression_7= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2474:2: kw= ',' this_expression_7= ruleexpression
                                    {
                                    kw=(Token)match(input,27,FOLLOW_27_in_ruleexpression_aux7064); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getCommaKeyword_0_0_3_0()); 
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_0_3_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7086);
                                    this_expression_7=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_expression_7);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 5 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2491:6: (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2491:6: (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2492:2: kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                                    {
                                    kw=(Token)match(input,59,FOLLOW_59_in_ruleexpression_aux7112); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getInstanceofKeyword_0_0_4_0()); 
                                          
                                    }
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2497:1: ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2497:2: ( RULE_IDENTIFIER )=>this_name_9= rulename
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getNameParserRuleCall_0_0_4_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_rulename_in_ruleexpression_aux7140);
                                    this_name_9=rulename();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_name_9);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
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
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:6: ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:6: ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:7: ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:7: ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:8: ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getExpression_auxAccess().getMais_auxParserRuleCall_0_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_rulemais_aux_in_ruleexpression_aux7194);
                            this_mais_aux_10=rulemais_aux();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_mais_aux_10);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }

                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_1_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7222);
                            this_expression_11=ruleexpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_expression_11);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }


                            }
                            break;
                        case 3 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2536:6: (kw= '++' | kw= '--' )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2536:6: (kw= '++' | kw= '--' )
                            int alt55=2;
                            int LA55_0 = input.LA(1);

                            if ( (LA55_0==60) ) {
                                alt55=1;
                            }
                            else if ( (LA55_0==61) ) {
                                alt55=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 55, 0, input);

                                throw nvae;
                            }
                            switch (alt55) {
                                case 1 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2537:2: kw= '++'
                                    {
                                    kw=(Token)match(input,60,FOLLOW_60_in_ruleexpression_aux7248); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getPlusSignPlusSignKeyword_0_2_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2544:2: kw= '--'
                                    {
                                    kw=(Token)match(input,61,FOLLOW_61_in_ruleexpression_aux7267); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getHyphenMinusHyphenMinusKeyword_0_2_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 4 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression )
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:7: ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:7: ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' )
                            int alt56=9;
                            alt56 = dfa56.predict(input);
                            switch (alt56) {
                                case 1 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:8: ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:8: ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:9: ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getMais_auxParserRuleCall_0_3_0_0()); 
                                          
                                    }
                                    pushFollow(FOLLOW_rulemais_aux_in_ruleexpression_aux7315);
                                    this_mais_aux_14=rulemais_aux();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_mais_aux_14);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2567:2: kw= '-'
                                    {
                                    kw=(Token)match(input,62,FOLLOW_62_in_ruleexpression_aux7340); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getHyphenMinusKeyword_0_3_0_1()); 
                                          
                                    }

                                    }
                                    break;
                                case 3 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2574:2: kw= '-='
                                    {
                                    kw=(Token)match(input,63,FOLLOW_63_in_ruleexpression_aux7359); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getHyphenMinusEqualsSignKeyword_0_3_0_2()); 
                                          
                                    }

                                    }
                                    break;
                                case 4 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2581:2: kw= '*'
                                    {
                                    kw=(Token)match(input,64,FOLLOW_64_in_ruleexpression_aux7378); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getAsteriskKeyword_0_3_0_3()); 
                                          
                                    }

                                    }
                                    break;
                                case 5 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2588:2: kw= '*='
                                    {
                                    kw=(Token)match(input,65,FOLLOW_65_in_ruleexpression_aux7397); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getAsteriskEqualsSignKeyword_0_3_0_4()); 
                                          
                                    }

                                    }
                                    break;
                                case 6 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2595:2: kw= '/'
                                    {
                                    kw=(Token)match(input,66,FOLLOW_66_in_ruleexpression_aux7416); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getSolidusKeyword_0_3_0_5()); 
                                          
                                    }

                                    }
                                    break;
                                case 7 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2602:2: kw= '/='
                                    {
                                    kw=(Token)match(input,67,FOLLOW_67_in_ruleexpression_aux7435); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getSolidusEqualsSignKeyword_0_3_0_6()); 
                                          
                                    }

                                    }
                                    break;
                                case 8 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2609:2: kw= '%'
                                    {
                                    kw=(Token)match(input,68,FOLLOW_68_in_ruleexpression_aux7454); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getPercentSignKeyword_0_3_0_7()); 
                                          
                                    }

                                    }
                                    break;
                                case 9 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2616:2: kw= '%='
                                    {
                                    kw=(Token)match(input,69,FOLLOW_69_in_ruleexpression_aux7473); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getPercentSignEqualsSignKeyword_0_3_0_8()); 
                                          
                                    }

                                    }
                                    break;

                            }

                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_3_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7496);
                            this_expression_23=ruleexpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_expression_23);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }


                            }
                            break;
                        case 5 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2633:6: ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) )
                            {
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2633:6: ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) )
                            int alt60=4;
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
                                {
                                alt60=1;
                                }
                                break;
                            case 77:
                                {
                                alt60=2;
                                }
                                break;
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                                {
                                alt60=3;
                                }
                                break;
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                                {
                                alt60=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 60, 0, input);

                                throw nvae;
                            }

                            switch (alt60) {
                                case 1 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2633:7: ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2633:7: ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2633:8: (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2633:8: (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' )
                                    int alt57=10;
                                    alt57 = dfa57.predict(input);
                                    switch (alt57) {
                                        case 1 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2634:2: kw= 'ampersand'
                                            {
                                            kw=(Token)match(input,70,FOLLOW_70_in_ruleexpression_aux7524); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getAmpersandKeyword_0_4_0_0_0()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2641:2: kw= 'ampersand='
                                            {
                                            kw=(Token)match(input,71,FOLLOW_71_in_ruleexpression_aux7543); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getAmpersandKeyword_0_4_0_0_1()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 3 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2648:2: kw= '|'
                                            {
                                            kw=(Token)match(input,72,FOLLOW_72_in_ruleexpression_aux7562); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getVerticalLineKeyword_0_4_0_0_2()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 4 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2655:2: kw= '|='
                                            {
                                            kw=(Token)match(input,73,FOLLOW_73_in_ruleexpression_aux7581); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getVerticalLineEqualsSignKeyword_0_4_0_0_3()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 5 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2662:2: kw= '^'
                                            {
                                            kw=(Token)match(input,74,FOLLOW_74_in_ruleexpression_aux7600); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getCircumflexAccentKeyword_0_4_0_0_4()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 6 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2669:2: kw= '^='
                                            {
                                            kw=(Token)match(input,75,FOLLOW_75_in_ruleexpression_aux7619); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getCircumflexAccentEqualsSignKeyword_0_4_0_0_5()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 7 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2675:6: (kw= 'ampersand' kw= 'ampersand' )
                                            {
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2675:6: (kw= 'ampersand' kw= 'ampersand' )
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2676:2: kw= 'ampersand' kw= 'ampersand'
                                            {
                                            kw=(Token)match(input,70,FOLLOW_70_in_ruleexpression_aux7639); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getAmpersandKeyword_0_4_0_0_6_0()); 
                                                  
                                            }
                                            kw=(Token)match(input,70,FOLLOW_70_in_ruleexpression_aux7652); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getAmpersandKeyword_0_4_0_0_6_1()); 
                                                  
                                            }

                                            }


                                            }
                                            break;
                                        case 8 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2689:2: kw= '||='
                                            {
                                            kw=(Token)match(input,76,FOLLOW_76_in_ruleexpression_aux7672); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getVerticalLineVerticalLineEqualsSignKeyword_0_4_0_0_7()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 9 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2695:6: ( ( '%' )=>kw= '%' )
                                            {
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2695:6: ( ( '%' )=>kw= '%' )
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2695:7: ( '%' )=>kw= '%'
                                            {
                                            kw=(Token)match(input,68,FOLLOW_68_in_ruleexpression_aux7700); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getPercentSignKeyword_0_4_0_0_8()); 
                                                  
                                            }

                                            }


                                            }
                                            break;
                                        case 10 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2705:2: kw= '%='
                                            {
                                            kw=(Token)match(input,69,FOLLOW_69_in_ruleexpression_aux7720); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getPercentSignEqualsSignKeyword_0_4_0_0_9()); 
                                                  
                                            }

                                            }
                                            break;

                                    }

                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_4_0_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7743);
                                    this_expression_35=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_expression_35);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2722:6: (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2722:6: (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2723:2: kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression
                                    {
                                    kw=(Token)match(input,77,FOLLOW_77_in_ruleexpression_aux7769); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getQuestionMarkKeyword_0_4_1_0()); 
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_4_1_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7791);
                                    this_expression_37=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_expression_37);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              afterParserOrEnumRuleCall();
                                          
                                    }
                                    kw=(Token)match(input,38,FOLLOW_38_in_ruleexpression_aux7809); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getExpression_auxAccess().getColonKeyword_0_4_1_2()); 
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_4_1_3()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7831);
                                    this_expression_39=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_expression_39);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 3 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2757:6: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2757:6: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2757:7: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2757:7: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' )
                                    int alt58=6;
                                    switch ( input.LA(1) ) {
                                    case 78:
                                        {
                                        alt58=1;
                                        }
                                        break;
                                    case 79:
                                        {
                                        alt58=2;
                                        }
                                        break;
                                    case 80:
                                        {
                                        alt58=3;
                                        }
                                        break;
                                    case 81:
                                        {
                                        alt58=4;
                                        }
                                        break;
                                    case 82:
                                        {
                                        alt58=5;
                                        }
                                        break;
                                    case 83:
                                        {
                                        alt58=6;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2758:2: kw= '>'
                                            {
                                            kw=(Token)match(input,78,FOLLOW_78_in_ruleexpression_aux7858); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getGreaterThanSignKeyword_0_4_2_0_0()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2765:2: kw= '<'
                                            {
                                            kw=(Token)match(input,79,FOLLOW_79_in_ruleexpression_aux7877); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getLessThanSignKeyword_0_4_2_0_1()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 3 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2772:2: kw= '>='
                                            {
                                            kw=(Token)match(input,80,FOLLOW_80_in_ruleexpression_aux7896); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getGreaterThanSignEqualsSignKeyword_0_4_2_0_2()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 4 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2779:2: kw= '<='
                                            {
                                            kw=(Token)match(input,81,FOLLOW_81_in_ruleexpression_aux7915); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getLessThanSignEqualsSignKeyword_0_4_2_0_3()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 5 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2786:2: kw= '=='
                                            {
                                            kw=(Token)match(input,82,FOLLOW_82_in_ruleexpression_aux7934); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getEqualsSignEqualsSignKeyword_0_4_2_0_4()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 6 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2793:2: kw= '!='
                                            {
                                            kw=(Token)match(input,83,FOLLOW_83_in_ruleexpression_aux7953); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getExclamationMarkEqualsSignKeyword_0_4_2_0_5()); 
                                                  
                                            }

                                            }
                                            break;

                                    }

                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_4_2_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux7976);
                                    this_expression_46=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_expression_46);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }


                                    }
                                    break;
                                case 4 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2810:6: ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression )
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2810:6: ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression )
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2810:7: (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression
                                    {
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2810:7: (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' )
                                    int alt59=4;
                                    switch ( input.LA(1) ) {
                                    case 84:
                                        {
                                        alt59=1;
                                        }
                                        break;
                                    case 85:
                                        {
                                        alt59=2;
                                        }
                                        break;
                                    case 86:
                                        {
                                        alt59=3;
                                        }
                                        break;
                                    case 87:
                                        {
                                        alt59=4;
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
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2811:2: kw= '>>='
                                            {
                                            kw=(Token)match(input,84,FOLLOW_84_in_ruleexpression_aux8003); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_4_3_0_0()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2818:2: kw= '<<'
                                            {
                                            kw=(Token)match(input,85,FOLLOW_85_in_ruleexpression_aux8022); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getLessThanSignLessThanSignKeyword_0_4_3_0_1()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 3 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2825:2: kw= '>>'
                                            {
                                            kw=(Token)match(input,86,FOLLOW_86_in_ruleexpression_aux8041); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getGreaterThanSignGreaterThanSignKeyword_0_4_3_0_2()); 
                                                  
                                            }

                                            }
                                            break;
                                        case 4 :
                                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2832:2: kw= '>>>'
                                            {
                                            kw=(Token)match(input,87,FOLLOW_87_in_ruleexpression_aux8060); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                      current.merge(kw);
                                                      newLeafNode(kw, grammarAccess.getExpression_auxAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_0_4_3_0_3()); 
                                                  
                                            }

                                            }
                                            break;

                                    }

                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionParserRuleCall_0_4_3_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_aux8083);
                                    this_expression_51=ruleexpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_expression_51);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression_auxParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression_aux8113);
                    this_expression_aux_52=ruleexpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_expression_aux_52);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2867:1: entryRulemais_aux returns [String current=null] : iv_rulemais_aux= rulemais_aux EOF ;
    public final String entryRulemais_aux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemais_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2868:2: (iv_rulemais_aux= rulemais_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2869:2: iv_rulemais_aux= rulemais_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMais_auxRule()); 
            }
            pushFollow(FOLLOW_rulemais_aux_in_entryRulemais_aux8160);
            iv_rulemais_aux=rulemais_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemais_aux.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemais_aux8171); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2876:1: rulemais_aux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '+=' ) ;
    public final AntlrDatatypeRuleToken rulemais_aux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2879:28: ( (kw= '+' | kw= '+=' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2880:1: (kw= '+' | kw= '+=' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2880:1: (kw= '+' | kw= '+=' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==88) ) {
                alt63=1;
            }
            else if ( (LA63_0==89) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2881:2: kw= '+'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_rulemais_aux8209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMais_auxAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2888:2: kw= '+='
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_rulemais_aux8228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMais_auxAccess().getPlusSignEqualsSignKeyword_1()); 
                          
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


    // $ANTLR start "entryRulecreating_expression"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2901:1: entryRulecreating_expression returns [String current=null] : iv_rulecreating_expression= rulecreating_expression EOF ;
    public final String entryRulecreating_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecreating_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2902:2: (iv_rulecreating_expression= rulecreating_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2903:2: iv_rulecreating_expression= rulecreating_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreating_expressionRule()); 
            }
            pushFollow(FOLLOW_rulecreating_expression_in_entryRulecreating_expression8269);
            iv_rulecreating_expression=rulecreating_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecreating_expression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecreating_expression8280); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2910:1: rulecreating_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'new' ( (this_name_1= rulename this_creating_aux_2= rulecreating_aux ) | (this_type_specifier_3= ruletype_specifier ( ( '[' )=>this_aux_4= ruleaux )? (kw= '[' kw= ']' )* ) | (kw= '(' this_expression_8= ruleexpression kw= ')' ) ) (this_new_10= rulenew )* ) ;
    public final AntlrDatatypeRuleToken rulecreating_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_name_1 = null;

        AntlrDatatypeRuleToken this_creating_aux_2 = null;

        AntlrDatatypeRuleToken this_type_specifier_3 = null;

        AntlrDatatypeRuleToken this_aux_4 = null;

        AntlrDatatypeRuleToken this_expression_8 = null;

        AntlrDatatypeRuleToken this_new_10 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2913:28: ( (kw= 'new' ( (this_name_1= rulename this_creating_aux_2= rulecreating_aux ) | (this_type_specifier_3= ruletype_specifier ( ( '[' )=>this_aux_4= ruleaux )? (kw= '[' kw= ']' )* ) | (kw= '(' this_expression_8= ruleexpression kw= ')' ) ) (this_new_10= rulenew )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2914:1: (kw= 'new' ( (this_name_1= rulename this_creating_aux_2= rulecreating_aux ) | (this_type_specifier_3= ruletype_specifier ( ( '[' )=>this_aux_4= ruleaux )? (kw= '[' kw= ']' )* ) | (kw= '(' this_expression_8= ruleexpression kw= ')' ) ) (this_new_10= rulenew )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2914:1: (kw= 'new' ( (this_name_1= rulename this_creating_aux_2= rulecreating_aux ) | (this_type_specifier_3= ruletype_specifier ( ( '[' )=>this_aux_4= ruleaux )? (kw= '[' kw= ']' )* ) | (kw= '(' this_expression_8= ruleexpression kw= ')' ) ) (this_new_10= rulenew )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2915:2: kw= 'new' ( (this_name_1= rulename this_creating_aux_2= rulecreating_aux ) | (this_type_specifier_3= ruletype_specifier ( ( '[' )=>this_aux_4= ruleaux )? (kw= '[' kw= ']' )* ) | (kw= '(' this_expression_8= ruleexpression kw= ')' ) ) (this_new_10= rulenew )*
            {
            kw=(Token)match(input,90,FOLLOW_90_in_rulecreating_expression8318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCreating_expressionAccess().getNewKeyword_0()); 
                  
            }
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2920:1: ( (this_name_1= rulename this_creating_aux_2= rulecreating_aux ) | (this_type_specifier_3= ruletype_specifier ( ( '[' )=>this_aux_4= ruleaux )? (kw= '[' kw= ']' )* ) | (kw= '(' this_expression_8= ruleexpression kw= ')' ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt66=1;
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
                alt66=2;
                }
                break;
            case 31:
                {
                alt66=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2920:2: (this_name_1= rulename this_creating_aux_2= rulecreating_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2920:2: (this_name_1= rulename this_creating_aux_2= rulecreating_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2921:5: this_name_1= rulename this_creating_aux_2= rulecreating_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCreating_expressionAccess().getNameParserRuleCall_1_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulename_in_rulecreating_expression8342);
                    this_name_1=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_name_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCreating_expressionAccess().getCreating_auxParserRuleCall_1_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulecreating_aux_in_rulecreating_expression8369);
                    this_creating_aux_2=rulecreating_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_creating_aux_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2943:6: (this_type_specifier_3= ruletype_specifier ( ( '[' )=>this_aux_4= ruleaux )? (kw= '[' kw= ']' )* )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2943:6: (this_type_specifier_3= ruletype_specifier ( ( '[' )=>this_aux_4= ruleaux )? (kw= '[' kw= ']' )* )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2944:5: this_type_specifier_3= ruletype_specifier ( ( '[' )=>this_aux_4= ruleaux )? (kw= '[' kw= ']' )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCreating_expressionAccess().getType_specifierParserRuleCall_1_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_rulecreating_expression8404);
                    this_type_specifier_3=ruletype_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_type_specifier_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2954:1: ( ( '[' )=>this_aux_4= ruleaux )?
                    int alt64=2;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2954:2: ( '[' )=>this_aux_4= ruleaux
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCreating_expressionAccess().getAuxParserRuleCall_1_1_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleaux_in_rulecreating_expression8440);
                            this_aux_4=ruleaux();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_aux_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2967:3: (kw= '[' kw= ']' )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==33) ) {
                            int LA65_2 = input.LA(2);

                            if ( (LA65_2==34) ) {
                                alt65=1;
                            }


                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2968:2: kw= '[' kw= ']'
                    	    {
                    	    kw=(Token)match(input,33,FOLLOW_33_in_rulecreating_expression8461); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getCreating_expressionAccess().getLeftSquareBracketKeyword_1_1_2_0()); 
                    	          
                    	    }
                    	    kw=(Token)match(input,34,FOLLOW_34_in_rulecreating_expression8474); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getCreating_expressionAccess().getRightSquareBracketKeyword_1_1_2_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2980:6: (kw= '(' this_expression_8= ruleexpression kw= ')' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2980:6: (kw= '(' this_expression_8= ruleexpression kw= ')' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2981:2: kw= '(' this_expression_8= ruleexpression kw= ')'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_rulecreating_expression8497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCreating_expressionAccess().getLeftParenthesisKeyword_1_2_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCreating_expressionAccess().getExpressionParserRuleCall_1_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulecreating_expression8519);
                    this_expression_8=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_expression_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,32,FOLLOW_32_in_rulecreating_expression8537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCreating_expressionAccess().getRightParenthesisKeyword_1_2_2()); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3003:3: (this_new_10= rulenew )*
            loop67:
            do {
                int alt67=2;
                alt67 = dfa67.predict(input);
                switch (alt67) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3004:5: this_new_10= rulenew
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getCreating_expressionAccess().getNewParserRuleCall_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulenew_in_rulecreating_expression8562);
            	    this_new_10=rulenew();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_new_10);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop67;
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


    // $ANTLR start "entryRulenew"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3022:1: entryRulenew returns [String current=null] : iv_rulenew= rulenew EOF ;
    public final String entryRulenew() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenew = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3023:2: (iv_rulenew= rulenew EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3024:2: iv_rulenew= rulenew EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewRule()); 
            }
            pushFollow(FOLLOW_rulenew_in_entryRulenew8610);
            iv_rulenew=rulenew();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenew.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenew8621); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3031:1: rulenew returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_constructor_declaration_1= ruleconstructor_declaration kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulenew() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constructor_declaration_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3034:28: ( (kw= '{' this_constructor_declaration_1= ruleconstructor_declaration kw= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3035:1: (kw= '{' this_constructor_declaration_1= ruleconstructor_declaration kw= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3035:1: (kw= '{' this_constructor_declaration_1= ruleconstructor_declaration kw= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3036:2: kw= '{' this_constructor_declaration_1= ruleconstructor_declaration kw= '}'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_rulenew8659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNewAccess().getLeftCurlyBracketKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNewAccess().getConstructor_declarationParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleconstructor_declaration_in_rulenew8681);
            this_constructor_declaration_1=ruleconstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_constructor_declaration_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,29,FOLLOW_29_in_rulenew8699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNewAccess().getRightCurlyBracketKeyword_2()); 
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3066:1: entryRulecreating_aux returns [String current=null] : iv_rulecreating_aux= rulecreating_aux EOF ;
    public final String entryRulecreating_aux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecreating_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3067:2: (iv_rulecreating_aux= rulecreating_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3068:2: iv_rulecreating_aux= rulecreating_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreating_auxRule()); 
            }
            pushFollow(FOLLOW_rulecreating_aux_in_entryRulecreating_aux8740);
            iv_rulecreating_aux=rulecreating_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecreating_aux.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecreating_aux8751); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3075:1: rulecreating_aux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( '(' )=>kw= '(' ) (this_arglist_1= rulearglist )? kw= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (kw= '[' kw= ']' )* ) ) ;
    public final AntlrDatatypeRuleToken rulecreating_aux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_arglist_1 = null;

        AntlrDatatypeRuleToken this_aux_3 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3078:28: ( ( ( ( ( '(' )=>kw= '(' ) (this_arglist_1= rulearglist )? kw= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (kw= '[' kw= ']' )* ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3079:1: ( ( ( ( '(' )=>kw= '(' ) (this_arglist_1= rulearglist )? kw= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (kw= '[' kw= ']' )* ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3079:1: ( ( ( ( '(' )=>kw= '(' ) (this_arglist_1= rulearglist )? kw= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (kw= '[' kw= ']' )* ) )
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3079:2: ( ( ( '(' )=>kw= '(' ) (this_arglist_1= rulearglist )? kw= ')' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3079:2: ( ( ( '(' )=>kw= '(' ) (this_arglist_1= rulearglist )? kw= ')' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3079:3: ( ( '(' )=>kw= '(' ) (this_arglist_1= rulearglist )? kw= ')'
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3079:3: ( ( '(' )=>kw= '(' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3079:4: ( '(' )=>kw= '('
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_rulecreating_aux8799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCreating_auxAccess().getLeftParenthesisKeyword_0_0()); 
                          
                    }

                    }

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3087:2: (this_arglist_1= rulearglist )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( ((LA68_0>=RULE_IDENTIFIER && LA68_0<=RULE_FLOAT_LITERAL)||LA68_0==31||(LA68_0>=55 && LA68_0<=57)||(LA68_0>=60 && LA68_0<=62)||(LA68_0>=90 && LA68_0<=103)) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3088:5: this_arglist_1= rulearglist
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCreating_auxAccess().getArglistParserRuleCall_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_rulearglist_in_rulecreating_aux8823);
                            this_arglist_1=rulearglist();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_arglist_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,32,FOLLOW_32_in_rulecreating_aux8843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCreating_auxAccess().getRightParenthesisKeyword_0_2()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3105:6: ( ( ( '[' )=>this_aux_3= ruleaux )? (kw= '[' kw= ']' )* )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3105:6: ( ( ( '[' )=>this_aux_3= ruleaux )? (kw= '[' kw= ']' )* )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3105:7: ( ( '[' )=>this_aux_3= ruleaux )? (kw= '[' kw= ']' )*
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3105:7: ( ( '[' )=>this_aux_3= ruleaux )?
                    int alt69=2;
                    alt69 = dfa69.predict(input);
                    switch (alt69) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3105:8: ( '[' )=>this_aux_3= ruleaux
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCreating_auxAccess().getAuxParserRuleCall_1_0_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleaux_in_rulecreating_aux8882);
                            this_aux_3=ruleaux();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_aux_3);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3118:3: (kw= '[' kw= ']' )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==33) ) {
                            int LA70_2 = input.LA(2);

                            if ( (LA70_2==34) ) {
                                alt70=1;
                            }


                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3119:2: kw= '[' kw= ']'
                    	    {
                    	    kw=(Token)match(input,33,FOLLOW_33_in_rulecreating_aux8903); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getCreating_auxAccess().getLeftSquareBracketKeyword_1_1_0()); 
                    	          
                    	    }
                    	    kw=(Token)match(input,34,FOLLOW_34_in_rulecreating_aux8916); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getCreating_auxAccess().getRightSquareBracketKeyword_1_1_1()); 
                    	          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3138:1: entryRuleaux returns [String current=null] : iv_ruleaux= ruleaux EOF ;
    public final String entryRuleaux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleaux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3139:2: (iv_ruleaux= ruleaux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3140:2: iv_ruleaux= ruleaux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAuxRule()); 
            }
            pushFollow(FOLLOW_ruleaux_in_entryRuleaux8960);
            iv_ruleaux=ruleaux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleaux.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleaux8971); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3147:1: ruleaux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_expression_1= ruleexpression kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleaux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3150:28: ( (kw= '[' this_expression_1= ruleexpression kw= ']' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3151:1: (kw= '[' this_expression_1= ruleexpression kw= ']' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3151:1: (kw= '[' this_expression_1= ruleexpression kw= ']' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3152:2: kw= '[' this_expression_1= ruleexpression kw= ']'
            {
            kw=(Token)match(input,33,FOLLOW_33_in_ruleaux9009); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAuxAccess().getLeftSquareBracketKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAuxAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleexpression_in_ruleaux9031);
            this_expression_1=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_expression_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,34,FOLLOW_34_in_ruleaux9049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAuxAccess().getRightSquareBracketKeyword_2()); 
                  
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


    // $ANTLR start "entryRulearglist"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3182:1: entryRulearglist returns [String current=null] : iv_rulearglist= rulearglist EOF ;
    public final String entryRulearglist() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearglist = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3183:2: (iv_rulearglist= rulearglist EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3184:2: iv_rulearglist= rulearglist EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArglistRule()); 
            }
            pushFollow(FOLLOW_rulearglist_in_entryRulearglist9090);
            iv_rulearglist=rulearglist();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearglist.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulearglist9101); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3191:1: rulearglist returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* ) | (kw= '\"' this_STRING_4= RULE_STRING kw= '\"' ) | (this_type_6= ruletype this_IDENTIFIER_7= RULE_IDENTIFIER (kw= ',' this_type_9= ruletype this_IDENTIFIER_10= RULE_IDENTIFIER )* ) ) ;
    public final AntlrDatatypeRuleToken rulearglist() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_4=null;
        Token this_IDENTIFIER_7=null;
        Token this_IDENTIFIER_10=null;
        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_type_6 = null;

        AntlrDatatypeRuleToken this_type_9 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3194:28: ( ( (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* ) | (kw= '\"' this_STRING_4= RULE_STRING kw= '\"' ) | (this_type_6= ruletype this_IDENTIFIER_7= RULE_IDENTIFIER (kw= ',' this_type_9= ruletype this_IDENTIFIER_10= RULE_IDENTIFIER )* ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3195:1: ( (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* ) | (kw= '\"' this_STRING_4= RULE_STRING kw= '\"' ) | (this_type_6= ruletype this_IDENTIFIER_7= RULE_IDENTIFIER (kw= ',' this_type_9= ruletype this_IDENTIFIER_10= RULE_IDENTIFIER )* ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3195:1: ( (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* ) | (kw= '\"' this_STRING_4= RULE_STRING kw= '\"' ) | (this_type_6= ruletype this_IDENTIFIER_7= RULE_IDENTIFIER (kw= ',' this_type_9= ruletype this_IDENTIFIER_10= RULE_IDENTIFIER )* ) )
            int alt74=3;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3195:2: (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3195:2: (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3196:5: this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArglistAccess().getExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulearglist9149);
                    this_expression_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_expression_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3206:1: (kw= ',' this_expression_2= ruleexpression )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==27) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3207:2: kw= ',' this_expression_2= ruleexpression
                    	    {
                    	    kw=(Token)match(input,27,FOLLOW_27_in_rulearglist9168); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getArglistAccess().getCommaKeyword_0_1_0()); 
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getArglistAccess().getExpressionParserRuleCall_0_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleexpression_in_rulearglist9190);
                    	    this_expression_2=ruleexpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_expression_2);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3224:6: (kw= '\"' this_STRING_4= RULE_STRING kw= '\"' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3224:6: (kw= '\"' this_STRING_4= RULE_STRING kw= '\"' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3225:2: kw= '\"' this_STRING_4= RULE_STRING kw= '\"'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_rulearglist9218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getArglistAccess().getQuotationMarkKeyword_1_0()); 
                          
                    }
                    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulearglist9233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_4, grammarAccess.getArglistAccess().getSTRINGTerminalRuleCall_1_1()); 
                          
                    }
                    kw=(Token)match(input,91,FOLLOW_91_in_rulearglist9251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getArglistAccess().getQuotationMarkKeyword_1_2()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3244:6: (this_type_6= ruletype this_IDENTIFIER_7= RULE_IDENTIFIER (kw= ',' this_type_9= ruletype this_IDENTIFIER_10= RULE_IDENTIFIER )* )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3244:6: (this_type_6= ruletype this_IDENTIFIER_7= RULE_IDENTIFIER (kw= ',' this_type_9= ruletype this_IDENTIFIER_10= RULE_IDENTIFIER )* )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3245:5: this_type_6= ruletype this_IDENTIFIER_7= RULE_IDENTIFIER (kw= ',' this_type_9= ruletype this_IDENTIFIER_10= RULE_IDENTIFIER )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArglistAccess().getTypeParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruletype_in_rulearglist9281);
                    this_type_6=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_type_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_IDENTIFIER_7=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulearglist9301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENTIFIER_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENTIFIER_7, grammarAccess.getArglistAccess().getIDENTIFIERTerminalRuleCall_2_1()); 
                          
                    }
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3262:1: (kw= ',' this_type_9= ruletype this_IDENTIFIER_10= RULE_IDENTIFIER )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==27) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3263:2: kw= ',' this_type_9= ruletype this_IDENTIFIER_10= RULE_IDENTIFIER
                    	    {
                    	    kw=(Token)match(input,27,FOLLOW_27_in_rulearglist9320); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getArglistAccess().getCommaKeyword_2_2_0()); 
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getArglistAccess().getTypeParserRuleCall_2_2_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruletype_in_rulearglist9342);
                    	    this_type_9=ruletype();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_type_9);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }
                    	    this_IDENTIFIER_10=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulearglist9362); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_IDENTIFIER_10);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_IDENTIFIER_10, grammarAccess.getArglistAccess().getIDENTIFIERTerminalRuleCall_2_2_2()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop73;
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


    // $ANTLR start "entryRulelogical_expression"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3294:1: entryRulelogical_expression returns [String current=null] : iv_rulelogical_expression= rulelogical_expression EOF ;
    public final String entryRulelogical_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelogical_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3295:2: (iv_rulelogical_expression= rulelogical_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3296:2: iv_rulelogical_expression= rulelogical_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_expressionRule()); 
            }
            pushFollow(FOLLOW_rulelogical_expression_in_entryRulelogical_expression9411);
            iv_rulelogical_expression=rulelogical_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelogical_expression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelogical_expression9422); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3303:1: rulelogical_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '!' this_expression_1= ruleexpression ) | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken rulelogical_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3306:28: ( ( (kw= '!' this_expression_1= ruleexpression ) | kw= 'true' | kw= 'false' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3307:1: ( (kw= '!' this_expression_1= ruleexpression ) | kw= 'true' | kw= 'false' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3307:1: ( (kw= '!' this_expression_1= ruleexpression ) | kw= 'true' | kw= 'false' )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt75=1;
                }
                break;
            case 93:
                {
                alt75=2;
                }
                break;
            case 94:
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3307:2: (kw= '!' this_expression_1= ruleexpression )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3307:2: (kw= '!' this_expression_1= ruleexpression )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3308:2: kw= '!' this_expression_1= ruleexpression
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_rulelogical_expression9461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogical_expressionAccess().getExclamationMarkKeyword_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogical_expressionAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpression_in_rulelogical_expression9483);
                    this_expression_1=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_expression_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3326:2: kw= 'true'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_rulelogical_expression9508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogical_expressionAccess().getTrueKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3333:2: kw= 'false'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_rulelogical_expression9527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogical_expressionAccess().getFalseKeyword_2()); 
                          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3346:1: entryRulebit_expression returns [String current=null] : iv_rulebit_expression= rulebit_expression EOF ;
    public final String entryRulebit_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebit_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3347:2: (iv_rulebit_expression= rulebit_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3348:2: iv_rulebit_expression= rulebit_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBit_expressionRule()); 
            }
            pushFollow(FOLLOW_rulebit_expression_in_entryRulebit_expression9568);
            iv_rulebit_expression=rulebit_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebit_expression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulebit_expression9579); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3355:1: rulebit_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '~' this_expression_1= ruleexpression ) ;
    public final AntlrDatatypeRuleToken rulebit_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3358:28: ( (kw= '~' this_expression_1= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3359:1: (kw= '~' this_expression_1= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3359:1: (kw= '~' this_expression_1= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3360:2: kw= '~' this_expression_1= ruleexpression
            {
            kw=(Token)match(input,95,FOLLOW_95_in_rulebit_expression9617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getBit_expressionAccess().getTildeKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBit_expressionAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleexpression_in_rulebit_expression9639);
            this_expression_1=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_expression_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3384:1: entryRulenumeric_expression returns [String current=null] : iv_rulenumeric_expression= rulenumeric_expression EOF ;
    public final String entryRulenumeric_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumeric_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3385:2: (iv_rulenumeric_expression= rulenumeric_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3386:2: iv_rulenumeric_expression= rulenumeric_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_expressionRule()); 
            }
            pushFollow(FOLLOW_rulenumeric_expression_in_entryRulenumeric_expression9685);
            iv_rulenumeric_expression=rulenumeric_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenumeric_expression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenumeric_expression9696); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3393:1: rulenumeric_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' | kw= '++' | kw= '--' ) this_expression_3= ruleexpression ) ;
    public final AntlrDatatypeRuleToken rulenumeric_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_3 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3396:28: ( ( (kw= '-' | kw= '++' | kw= '--' ) this_expression_3= ruleexpression ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3397:1: ( (kw= '-' | kw= '++' | kw= '--' ) this_expression_3= ruleexpression )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3397:1: ( (kw= '-' | kw= '++' | kw= '--' ) this_expression_3= ruleexpression )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3397:2: (kw= '-' | kw= '++' | kw= '--' ) this_expression_3= ruleexpression
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3397:2: (kw= '-' | kw= '++' | kw= '--' )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt76=1;
                }
                break;
            case 60:
                {
                alt76=2;
                }
                break;
            case 61:
                {
                alt76=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3398:2: kw= '-'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_rulenumeric_expression9735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumeric_expressionAccess().getHyphenMinusKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3405:2: kw= '++'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_rulenumeric_expression9754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumeric_expressionAccess().getPlusSignPlusSignKeyword_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3412:2: kw= '--'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_rulenumeric_expression9773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumeric_expressionAccess().getHyphenMinusHyphenMinusKeyword_0_2()); 
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumeric_expressionAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleexpression_in_rulenumeric_expression9796);
            this_expression_3=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_expression_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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


    // $ANTLR start "entryRulename"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3436:1: entryRulename returns [String current=null] : iv_rulename= rulename EOF ;
    public final String entryRulename() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulename = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3437:2: (iv_rulename= rulename EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3438:2: iv_rulename= rulename EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_rulename_in_entryRulename9842);
            iv_rulename=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulename.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulename9853); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3445:1: rulename returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_package_name_aux_1= rulepackage_name_aux ) ;
    public final AntlrDatatypeRuleToken rulename() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_package_name_aux_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3448:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_package_name_aux_1= rulepackage_name_aux ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3449:1: (this_IDENTIFIER_0= RULE_IDENTIFIER this_package_name_aux_1= rulepackage_name_aux )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3449:1: (this_IDENTIFIER_0= RULE_IDENTIFIER this_package_name_aux_1= rulepackage_name_aux )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3449:6: this_IDENTIFIER_0= RULE_IDENTIFIER this_package_name_aux_1= rulepackage_name_aux
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulename9893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_0, grammarAccess.getNameAccess().getIDENTIFIERTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNameAccess().getPackage_name_auxParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulepackage_name_aux_in_rulename9920);
            this_package_name_aux_1=rulepackage_name_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_package_name_aux_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3475:1: entryRulepackage_name_aux returns [String current=null] : iv_rulepackage_name_aux= rulepackage_name_aux EOF ;
    public final String entryRulepackage_name_aux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepackage_name_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3476:2: (iv_rulepackage_name_aux= rulepackage_name_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3477:2: iv_rulepackage_name_aux= rulepackage_name_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_name_auxRule()); 
            }
            pushFollow(FOLLOW_rulepackage_name_aux_in_entryRulepackage_name_aux9966);
            iv_rulepackage_name_aux=rulepackage_name_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepackage_name_aux.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepackage_name_aux9977); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3484:1: rulepackage_name_aux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER this_package_name_aux_2= rulepackage_name_aux )* ;
    public final AntlrDatatypeRuleToken rulepackage_name_aux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_package_name_aux_2 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3487:28: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER this_package_name_aux_2= rulepackage_name_aux )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3488:1: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER this_package_name_aux_2= rulepackage_name_aux )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3488:1: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER this_package_name_aux_2= rulepackage_name_aux )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==58) ) {
                    int LA77_2 = input.LA(2);

                    if ( (synpred203_InternalSimpleJava()) ) {
                        alt77=1;
                    }


                }


                switch (alt77) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3489:2: kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER this_package_name_aux_2= rulepackage_name_aux
            	    {
            	    kw=(Token)match(input,58,FOLLOW_58_in_rulepackage_name_aux10015); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0()); 
            	          
            	    }
            	    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulepackage_name_aux10030); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_IDENTIFIER_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_IDENTIFIER_1, grammarAccess.getPackage_name_auxAccess().getIDENTIFIERTerminalRuleCall_1()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getPackage_name_auxAccess().getPackage_name_auxParserRuleCall_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulepackage_name_aux_in_rulepackage_name_aux10057);
            	    this_package_name_aux_2=rulepackage_name_aux();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_package_name_aux_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop77;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3520:1: entryRuletype_specifier returns [String current=null] : iv_ruletype_specifier= ruletype_specifier EOF ;
    public final String entryRuletype_specifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_specifier = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3521:2: (iv_ruletype_specifier= ruletype_specifier EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3522:2: iv_ruletype_specifier= ruletype_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruletype_specifier_in_entryRuletype_specifier10104);
            iv_ruletype_specifier=ruletype_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_specifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_specifier10115); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3529:1: ruletype_specifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruletype_specifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3532:28: ( (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3533:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3533:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' )
            int alt78=8;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt78=1;
                }
                break;
            case 97:
                {
                alt78=2;
                }
                break;
            case 98:
                {
                alt78=3;
                }
                break;
            case 99:
                {
                alt78=4;
                }
                break;
            case 100:
                {
                alt78=5;
                }
                break;
            case 101:
                {
                alt78=6;
                }
                break;
            case 102:
                {
                alt78=7;
                }
                break;
            case 103:
                {
                alt78=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3534:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruletype_specifier10153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3541:2: kw= 'byte'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruletype_specifier10172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3548:2: kw= 'char'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruletype_specifier10191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3555:2: kw= 'short'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruletype_specifier10210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3562:2: kw= 'int'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruletype_specifier10229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3569:2: kw= 'float'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruletype_specifier10248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3576:2: kw= 'long'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruletype_specifier10267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3583:2: kw= 'double'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruletype_specifier10286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                          
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3596:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3597:2: (iv_ruletype= ruletype EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3598:2: iv_ruletype= ruletype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruletype_in_entryRuletype10327);
            iv_ruletype=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype10338); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3605:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_type_specifier_0= ruletype_specifier | this_name_1= rulename ) (kw= '[' kw= ']' )* ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_specifier_0 = null;

        AntlrDatatypeRuleToken this_name_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3608:28: ( ( (this_type_specifier_0= ruletype_specifier | this_name_1= rulename ) (kw= '[' kw= ']' )* ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3609:1: ( (this_type_specifier_0= ruletype_specifier | this_name_1= rulename ) (kw= '[' kw= ']' )* )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3609:1: ( (this_type_specifier_0= ruletype_specifier | this_name_1= rulename ) (kw= '[' kw= ']' )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3609:2: (this_type_specifier_0= ruletype_specifier | this_name_1= rulename ) (kw= '[' kw= ']' )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3609:2: (this_type_specifier_0= ruletype_specifier | this_name_1= rulename )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=96 && LA79_0<=103)) ) {
                alt79=1;
            }
            else if ( (LA79_0==RULE_IDENTIFIER) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3610:5: this_type_specifier_0= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getType_specifierParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruletype_specifier_in_ruletype10386);
                    this_type_specifier_0=ruletype_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_type_specifier_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3622:5: this_name_1= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getNameParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulename_in_ruletype10419);
                    this_name_1=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_name_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3632:2: (kw= '[' kw= ']' )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==33) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3633:2: kw= '[' kw= ']'
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_ruletype10439); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0()); 
            	          
            	    }
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruletype10452); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop80;
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


    // $ANTLR start "entryRuleliteral_expression"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3652:1: entryRuleliteral_expression returns [String current=null] : iv_ruleliteral_expression= ruleliteral_expression EOF ;
    public final String entryRuleliteral_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleliteral_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3653:2: (iv_ruleliteral_expression= ruleliteral_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3654:2: iv_ruleliteral_expression= ruleliteral_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteral_expressionRule()); 
            }
            pushFollow(FOLLOW_ruleliteral_expression_in_entryRuleliteral_expression10495);
            iv_ruleliteral_expression=ruleliteral_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleliteral_expression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleliteral_expression10506); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3661:1: ruleliteral_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( RULE_DECIMAL_DIGITS )=>this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS ) | this_INTEGER_LITERAL_1= RULE_INTEGER_LITERAL | this_FLOAT_LITERAL_2= RULE_FLOAT_LITERAL | this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleliteral_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_DIGITS_0=null;
        Token this_INTEGER_LITERAL_1=null;
        Token this_FLOAT_LITERAL_2=null;
        Token this_STRING_3=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3664:28: ( ( ( ( RULE_DECIMAL_DIGITS )=>this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS ) | this_INTEGER_LITERAL_1= RULE_INTEGER_LITERAL | this_FLOAT_LITERAL_2= RULE_FLOAT_LITERAL | this_STRING_3= RULE_STRING ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3665:1: ( ( ( RULE_DECIMAL_DIGITS )=>this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS ) | this_INTEGER_LITERAL_1= RULE_INTEGER_LITERAL | this_FLOAT_LITERAL_2= RULE_FLOAT_LITERAL | this_STRING_3= RULE_STRING )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3665:1: ( ( ( RULE_DECIMAL_DIGITS )=>this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS ) | this_INTEGER_LITERAL_1= RULE_INTEGER_LITERAL | this_FLOAT_LITERAL_2= RULE_FLOAT_LITERAL | this_STRING_3= RULE_STRING )
            int alt81=4;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL_DIGITS:
                {
                alt81=1;
                }
                break;
            case RULE_INTEGER_LITERAL:
                {
                alt81=2;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt81=3;
                }
                break;
            case RULE_STRING:
                {
                alt81=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3665:2: ( ( RULE_DECIMAL_DIGITS )=>this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3665:2: ( ( RULE_DECIMAL_DIGITS )=>this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3665:3: ( RULE_DECIMAL_DIGITS )=>this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS
                    {
                    this_DECIMAL_DIGITS_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleliteral_expression10552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DECIMAL_DIGITS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DECIMAL_DIGITS_0, grammarAccess.getLiteral_expressionAccess().getDECIMAL_DIGITSTerminalRuleCall_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3673:10: this_INTEGER_LITERAL_1= RULE_INTEGER_LITERAL
                    {
                    this_INTEGER_LITERAL_1=(Token)match(input,RULE_INTEGER_LITERAL,FOLLOW_RULE_INTEGER_LITERAL_in_ruleliteral_expression10579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INTEGER_LITERAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INTEGER_LITERAL_1, grammarAccess.getLiteral_expressionAccess().getINTEGER_LITERALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3681:10: this_FLOAT_LITERAL_2= RULE_FLOAT_LITERAL
                    {
                    this_FLOAT_LITERAL_2=(Token)match(input,RULE_FLOAT_LITERAL,FOLLOW_RULE_FLOAT_LITERAL_in_ruleliteral_expression10605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FLOAT_LITERAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FLOAT_LITERAL_2, grammarAccess.getLiteral_expressionAccess().getFLOAT_LITERALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3689:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleliteral_expression10631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getLiteral_expressionAccess().getSTRINGTerminalRuleCall_3()); 
                          
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


    // $ANTLR start "entryRuleMODIFIER"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3704:1: entryRuleMODIFIER returns [String current=null] : iv_ruleMODIFIER= ruleMODIFIER EOF ;
    public final String entryRuleMODIFIER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMODIFIER = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3705:2: (iv_ruleMODIFIER= ruleMODIFIER EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3706:2: iv_ruleMODIFIER= ruleMODIFIER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMODIFIERRule()); 
            }
            pushFollow(FOLLOW_ruleMODIFIER_in_entryRuleMODIFIER10677);
            iv_ruleMODIFIER=ruleMODIFIER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMODIFIER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODIFIER10688); if (state.failed) return current;

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3713:1: ruleMODIFIER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'static' | kw= 'final' | kw= 'native' | kw= 'synchronized' | kw= 'abstract' | kw= 'threadsafe' | kw= 'transient' ) ;
    public final AntlrDatatypeRuleToken ruleMODIFIER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3716:28: ( (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'static' | kw= 'final' | kw= 'native' | kw= 'synchronized' | kw= 'abstract' | kw= 'threadsafe' | kw= 'transient' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3717:1: (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'static' | kw= 'final' | kw= 'native' | kw= 'synchronized' | kw= 'abstract' | kw= 'threadsafe' | kw= 'transient' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3717:1: (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'static' | kw= 'final' | kw= 'native' | kw= 'synchronized' | kw= 'abstract' | kw= 'threadsafe' | kw= 'transient' )
            int alt82=10;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt82=1;
                }
                break;
            case 105:
                {
                alt82=2;
                }
                break;
            case 106:
                {
                alt82=3;
                }
                break;
            case 54:
                {
                alt82=4;
                }
                break;
            case 107:
                {
                alt82=5;
                }
                break;
            case 108:
                {
                alt82=6;
                }
                break;
            case 35:
                {
                alt82=7;
                }
                break;
            case 109:
                {
                alt82=8;
                }
                break;
            case 110:
                {
                alt82=9;
                }
                break;
            case 111:
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
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3718:2: kw= 'public'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleMODIFIER10726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMODIFIERAccess().getPublicKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3725:2: kw= 'private'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleMODIFIER10745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMODIFIERAccess().getPrivateKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3732:2: kw= 'protected'
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleMODIFIER10764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMODIFIERAccess().getProtectedKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3739:2: kw= 'static'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleMODIFIER10783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMODIFIERAccess().getStaticKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3746:2: kw= 'final'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleMODIFIER10802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMODIFIERAccess().getFinalKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3753:2: kw= 'native'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleMODIFIER10821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMODIFIERAccess().getNativeKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3760:2: kw= 'synchronized'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleMODIFIER10840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMODIFIERAccess().getSynchronizedKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3767:2: kw= 'abstract'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleMODIFIER10859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMODIFIERAccess().getAbstractKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3774:2: kw= 'threadsafe'
                    {
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleMODIFIER10878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMODIFIERAccess().getThreadsafeKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3781:2: kw= 'transient'
                    {
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleMODIFIER10897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMODIFIERAccess().getTransientKeyword_9()); 
                          
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
        AntlrDatatypeRuleToken this_method_declaration_1 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:613:5: (this_method_declaration_1= rulemethod_declaration )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:613:5: this_method_declaration_1= rulemethod_declaration
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getField_declarationAccess().getMethod_declarationParserRuleCall_0_1_0()); 
              
        }
        pushFollow(FOLLOW_rulemethod_declaration_in_synpred18_InternalSimpleJava1635);
        this_method_declaration_1=rulemethod_declaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalSimpleJava

    // $ANTLR start synpred19_InternalSimpleJava
    public final void synpred19_InternalSimpleJava_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_constructor_declaration_2 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:625:5: (this_constructor_declaration_2= ruleconstructor_declaration )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:625:5: this_constructor_declaration_2= ruleconstructor_declaration
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getField_declarationAccess().getConstructor_declarationParserRuleCall_0_1_1()); 
              
        }
        pushFollow(FOLLOW_ruleconstructor_declaration_in_synpred19_InternalSimpleJava1668);
        this_constructor_declaration_2=ruleconstructor_declaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalSimpleJava

    // $ANTLR start synpred49_InternalSimpleJava
    public final void synpred49_InternalSimpleJava_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_variable_declaration_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:905:2: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' | 'boolean' | 'byte' | 'char' | 'short' | 'int' | 'float' | 'long' | 'double' | 'void' | '(' | RULE_IDENTIFIER )=>this_variable_declaration_0= rulevariable_declaration ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:905:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' | 'boolean' | 'byte' | 'char' | 'short' | 'int' | 'float' | 'long' | 'double' | 'void' | '(' | RULE_IDENTIFIER )=>this_variable_declaration_0= rulevariable_declaration )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:905:2: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' | 'boolean' | 'byte' | 'char' | 'short' | 'int' | 'float' | 'long' | 'double' | 'void' | '(' | RULE_IDENTIFIER )=>this_variable_declaration_0= rulevariable_declaration )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:905:3: ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' | 'boolean' | 'byte' | 'char' | 'short' | 'int' | 'float' | 'long' | 'double' | 'void' | '(' | RULE_IDENTIFIER )=>this_variable_declaration_0= rulevariable_declaration
        {
        pushFollow(FOLLOW_rulevariable_declaration_in_synpred49_InternalSimpleJava2668);
        this_variable_declaration_0=rulevariable_declaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred49_InternalSimpleJava

    // $ANTLR start synpred67_InternalSimpleJava
    public final void synpred67_InternalSimpleJava_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:957:6: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression ) kw= ';' ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:957:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression ) kw= ';' )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:957:6: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression ) kw= ';' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:957:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression ) kw= ';'
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:957:7: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:957:8: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression
        {
        pushFollow(FOLLOW_ruleexpression_in_synpred67_InternalSimpleJava2825);
        this_expression_1=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }

        kw=(Token)match(input,18,FOLLOW_18_in_synpred67_InternalSimpleJava2844); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred67_InternalSimpleJava

    // $ANTLR start synpred75_InternalSimpleJava
    public final void synpred75_InternalSimpleJava_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_12 = null;

        AntlrDatatypeRuleToken this_statement_14 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1083:6: ( (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1083:6: (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1083:6: (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1084:2: kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement
        {
        kw=(Token)match(input,35,FOLLOW_35_in_synpred75_InternalSimpleJava3096); if (state.failed) return ;
        kw=(Token)match(input,31,FOLLOW_31_in_synpred75_InternalSimpleJava3109); if (state.failed) return ;
        pushFollow(FOLLOW_ruleexpression_in_synpred75_InternalSimpleJava3131);
        this_expression_12=ruleexpression();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,32,FOLLOW_32_in_synpred75_InternalSimpleJava3149); if (state.failed) return ;
        pushFollow(FOLLOW_rulestatement_in_synpred75_InternalSimpleJava3171);
        this_statement_14=rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred75_InternalSimpleJava

    // $ANTLR start synpred79_InternalSimpleJava
    public final void synpred79_InternalSimpleJava_fragment() throws RecognitionException {   
        Token this_IDENTIFIER_21=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_statement_23 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:6: ( (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:6: (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:6: (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1172:11: this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement
        {
        this_IDENTIFIER_21=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_synpred79_InternalSimpleJava3324); if (state.failed) return ;
        kw=(Token)match(input,38,FOLLOW_38_in_synpred79_InternalSimpleJava3342); if (state.failed) return ;
        pushFollow(FOLLOW_rulestatement_in_synpred79_InternalSimpleJava3364);
        this_statement_23=rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred79_InternalSimpleJava

    // $ANTLR start synpred97_InternalSimpleJava
    public final void synpred97_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1560:2: ( ( 'else' rulestatement ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1560:3: ( 'else' rulestatement )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1560:3: ( 'else' rulestatement )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1561:2: 'else' rulestatement
        {
        match(input,44,FOLLOW_44_in_synpred97_InternalSimpleJava4423); if (state.failed) return ;
        pushFollow(FOLLOW_rulestatement_in_synpred97_InternalSimpleJava4426);
        rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred97_InternalSimpleJava

    // $ANTLR start synpred99_InternalSimpleJava
    public final void synpred99_InternalSimpleJava_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_variable_declaration_2 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1746:2: ( ( ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1746:2: ( ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1746:2: ( ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1746:3: ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration
        {
        pushFollow(FOLLOW_rulevariable_declaration_in_synpred99_InternalSimpleJava4963);
        this_variable_declaration_2=rulevariable_declaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred99_InternalSimpleJava

    // $ANTLR start synpred100_InternalSimpleJava
    public final void synpred100_InternalSimpleJava_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_3 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1758:6: ( (this_expression_3= ruleexpression kw= ';' ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1758:6: (this_expression_3= ruleexpression kw= ';' )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1758:6: (this_expression_3= ruleexpression kw= ';' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1759:5: this_expression_3= ruleexpression kw= ';'
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionParserRuleCall_2_1_0()); 
              
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred100_InternalSimpleJava4998);
        this_expression_3=ruleexpression();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,18,FOLLOW_18_in_synpred100_InternalSimpleJava5016); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred100_InternalSimpleJava

    // $ANTLR start synpred103_InternalSimpleJava
    public final void synpred103_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1865:2: ( ( 'catch' '(' ruleparameter ')' rulestatement_block ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1865:3: ( 'catch' '(' ruleparameter ')' rulestatement_block )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1865:3: ( 'catch' '(' ruleparameter ')' rulestatement_block )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1866:2: 'catch' '(' ruleparameter ')' rulestatement_block
        {
        match(input,49,FOLLOW_49_in_synpred103_InternalSimpleJava5281); if (state.failed) return ;
        match(input,31,FOLLOW_31_in_synpred103_InternalSimpleJava5286); if (state.failed) return ;
        pushFollow(FOLLOW_ruleparameter_in_synpred103_InternalSimpleJava5289);
        ruleparameter();

        state._fsp--;
        if (state.failed) return ;
        match(input,32,FOLLOW_32_in_synpred103_InternalSimpleJava5292); if (state.failed) return ;
        pushFollow(FOLLOW_rulestatement_block_in_synpred103_InternalSimpleJava5295);
        rulestatement_block();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred103_InternalSimpleJava

    // $ANTLR start synpred104_InternalSimpleJava
    public final void synpred104_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1911:5: ( ( 'finally' rulestatement_block ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1911:6: ( 'finally' rulestatement_block )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1911:6: ( 'finally' rulestatement_block )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1912:2: 'finally' rulestatement_block
        {
        match(input,50,FOLLOW_50_in_synpred104_InternalSimpleJava5401); if (state.failed) return ;
        pushFollow(FOLLOW_rulestatement_block_in_synpred104_InternalSimpleJava5404);
        rulestatement_block();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred104_InternalSimpleJava

    // $ANTLR start synpred129_InternalSimpleJava
    public final void synpred129_InternalSimpleJava_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2190:2: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression ) kw= ')' ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2190:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression ) kw= ')' )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2190:2: ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression ) kw= ')' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2190:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression ) kw= ')'
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2190:3: ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2190:4: ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression
        {
        pushFollow(FOLLOW_ruleexpression_in_synpred129_InternalSimpleJava6335);
        this_expression_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }

        kw=(Token)match(input,32,FOLLOW_32_in_synpred129_InternalSimpleJava6354); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred129_InternalSimpleJava

    // $ANTLR start synpred148_InternalSimpleJava
    public final void synpred148_InternalSimpleJava_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_mais_aux_10 = null;

        AntlrDatatypeRuleToken this_expression_11 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:6: ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:6: ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:7: ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:7: ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:8: ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux
        {
        pushFollow(FOLLOW_rulemais_aux_in_synpred148_InternalSimpleJava7194);
        this_mais_aux_10=rulemais_aux();

        state._fsp--;
        if (state.failed) return ;

        }

        pushFollow(FOLLOW_ruleexpression_in_synpred148_InternalSimpleJava7222);
        this_expression_11=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred148_InternalSimpleJava

    // $ANTLR start synpred161_InternalSimpleJava
    public final void synpred161_InternalSimpleJava_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_mais_aux_14 = null;

        AntlrDatatypeRuleToken this_expression_23 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:6: ( ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:7: ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:7: ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' )
        int alt97=9;
        alt97 = dfa97.predict(input);
        switch (alt97) {
            case 1 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:8: ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:8: ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:9: ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux
                {
                pushFollow(FOLLOW_rulemais_aux_in_synpred161_InternalSimpleJava7315);
                this_mais_aux_14=rulemais_aux();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2567:2: kw= '-'
                {
                kw=(Token)match(input,62,FOLLOW_62_in_synpred161_InternalSimpleJava7340); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2574:2: kw= '-='
                {
                kw=(Token)match(input,63,FOLLOW_63_in_synpred161_InternalSimpleJava7359); if (state.failed) return ;

                }
                break;
            case 4 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2581:2: kw= '*'
                {
                kw=(Token)match(input,64,FOLLOW_64_in_synpred161_InternalSimpleJava7378); if (state.failed) return ;

                }
                break;
            case 5 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2588:2: kw= '*='
                {
                kw=(Token)match(input,65,FOLLOW_65_in_synpred161_InternalSimpleJava7397); if (state.failed) return ;

                }
                break;
            case 6 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2595:2: kw= '/'
                {
                kw=(Token)match(input,66,FOLLOW_66_in_synpred161_InternalSimpleJava7416); if (state.failed) return ;

                }
                break;
            case 7 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2602:2: kw= '/='
                {
                kw=(Token)match(input,67,FOLLOW_67_in_synpred161_InternalSimpleJava7435); if (state.failed) return ;

                }
                break;
            case 8 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2609:2: kw= '%'
                {
                kw=(Token)match(input,68,FOLLOW_68_in_synpred161_InternalSimpleJava7454); if (state.failed) return ;

                }
                break;
            case 9 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2616:2: kw= '%='
                {
                kw=(Token)match(input,69,FOLLOW_69_in_synpred161_InternalSimpleJava7473); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_ruleexpression_in_synpred161_InternalSimpleJava7496);
        this_expression_23=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred161_InternalSimpleJava

    // $ANTLR start synpred183_InternalSimpleJava
    public final void synpred183_InternalSimpleJava_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_arglist_1 = null;

        AntlrDatatypeRuleToken this_aux_3 = null;

        AntlrDatatypeRuleToken this_expression_5 = null;

        AntlrDatatypeRuleToken this_expression_7 = null;

        AntlrDatatypeRuleToken this_name_9 = null;

        AntlrDatatypeRuleToken this_mais_aux_10 = null;

        AntlrDatatypeRuleToken this_expression_11 = null;

        AntlrDatatypeRuleToken this_mais_aux_14 = null;

        AntlrDatatypeRuleToken this_expression_23 = null;

        AntlrDatatypeRuleToken this_expression_35 = null;

        AntlrDatatypeRuleToken this_expression_37 = null;

        AntlrDatatypeRuleToken this_expression_39 = null;

        AntlrDatatypeRuleToken this_expression_46 = null;

        AntlrDatatypeRuleToken this_expression_51 = null;

        AntlrDatatypeRuleToken this_expression_aux_52 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:2: ( ( ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression ) | (kw= '++' | kw= '--' ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression ) | ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) ) ) this_expression_aux_52= ruleexpression_aux )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:2: ( ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression ) | (kw= '++' | kw= '--' ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression ) | ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) ) ) this_expression_aux_52= ruleexpression_aux
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:2: ( ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression ) | (kw= '++' | kw= '--' ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression ) | ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) ) )
        int alt108=5;
        alt108 = dfa108.predict(input);
        switch (alt108) {
            case 1 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:3: ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:3: ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) )
                int alt101=5;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    alt101=1;
                    }
                    break;
                case 33:
                    {
                    alt101=2;
                    }
                    break;
                case 58:
                    {
                    alt101=3;
                    }
                    break;
                case 27:
                    {
                    alt101=4;
                    }
                    break;
                case 59:
                    {
                    alt101=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 0, input);

                    throw nvae;
                }

                switch (alt101) {
                    case 1 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:4: (kw= '(' (this_arglist_1= rulearglist )? kw= ')' )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2419:4: (kw= '(' (this_arglist_1= rulearglist )? kw= ')' )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2420:2: kw= '(' (this_arglist_1= rulearglist )? kw= ')'
                        {
                        kw=(Token)match(input,31,FOLLOW_31_in_synpred183_InternalSimpleJava6919); if (state.failed) return ;
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2425:1: (this_arglist_1= rulearglist )?
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( ((LA100_0>=RULE_IDENTIFIER && LA100_0<=RULE_FLOAT_LITERAL)||LA100_0==31||(LA100_0>=55 && LA100_0<=57)||(LA100_0>=60 && LA100_0<=62)||(LA100_0>=90 && LA100_0<=103)) ) {
                            alt100=1;
                        }
                        switch (alt100) {
                            case 1 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2426:5: this_arglist_1= rulearglist
                                {
                                pushFollow(FOLLOW_rulearglist_in_synpred183_InternalSimpleJava6942);
                                this_arglist_1=rulearglist();

                                state._fsp--;
                                if (state.failed) return ;

                                }
                                break;

                        }

                        kw=(Token)match(input,32,FOLLOW_32_in_synpred183_InternalSimpleJava6962); if (state.failed) return ;

                        }


                        }
                        break;
                    case 2 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2444:5: this_aux_3= ruleaux
                        {
                        pushFollow(FOLLOW_ruleaux_in_synpred183_InternalSimpleJava6991);
                        this_aux_3=ruleaux();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2455:6: (kw= '.' this_expression_5= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2455:6: (kw= '.' this_expression_5= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2456:2: kw= '.' this_expression_5= ruleexpression
                        {
                        kw=(Token)match(input,58,FOLLOW_58_in_synpred183_InternalSimpleJava7016); if (state.failed) return ;
                        pushFollow(FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7038);
                        this_expression_5=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;
                    case 4 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2473:6: (kw= ',' this_expression_7= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2473:6: (kw= ',' this_expression_7= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2474:2: kw= ',' this_expression_7= ruleexpression
                        {
                        kw=(Token)match(input,27,FOLLOW_27_in_synpred183_InternalSimpleJava7064); if (state.failed) return ;
                        pushFollow(FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7086);
                        this_expression_7=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;
                    case 5 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2491:6: (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2491:6: (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2492:2: kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                        {
                        kw=(Token)match(input,59,FOLLOW_59_in_synpred183_InternalSimpleJava7112); if (state.failed) return ;
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2497:1: ( ( RULE_IDENTIFIER )=>this_name_9= rulename )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2497:2: ( RULE_IDENTIFIER )=>this_name_9= rulename
                        {
                        pushFollow(FOLLOW_rulename_in_synpred183_InternalSimpleJava7140);
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
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:6: ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:6: ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:7: ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:7: ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2509:8: ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux
                {
                pushFollow(FOLLOW_rulemais_aux_in_synpred183_InternalSimpleJava7194);
                this_mais_aux_10=rulemais_aux();

                state._fsp--;
                if (state.failed) return ;

                }

                pushFollow(FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7222);
                this_expression_11=ruleexpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2536:6: (kw= '++' | kw= '--' )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2536:6: (kw= '++' | kw= '--' )
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==60) ) {
                    alt102=1;
                }
                else if ( (LA102_0==61) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 0, input);

                    throw nvae;
                }
                switch (alt102) {
                    case 1 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2537:2: kw= '++'
                        {
                        kw=(Token)match(input,60,FOLLOW_60_in_synpred183_InternalSimpleJava7248); if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2544:2: kw= '--'
                        {
                        kw=(Token)match(input,61,FOLLOW_61_in_synpred183_InternalSimpleJava7267); if (state.failed) return ;

                        }
                        break;

                }


                }
                break;
            case 4 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:6: ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression )
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:7: ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:7: ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' )
                int alt103=9;
                alt103 = dfa103.predict(input);
                switch (alt103) {
                    case 1 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:8: ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:8: ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2550:9: ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux
                        {
                        pushFollow(FOLLOW_rulemais_aux_in_synpred183_InternalSimpleJava7315);
                        this_mais_aux_14=rulemais_aux();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;
                    case 2 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2567:2: kw= '-'
                        {
                        kw=(Token)match(input,62,FOLLOW_62_in_synpred183_InternalSimpleJava7340); if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2574:2: kw= '-='
                        {
                        kw=(Token)match(input,63,FOLLOW_63_in_synpred183_InternalSimpleJava7359); if (state.failed) return ;

                        }
                        break;
                    case 4 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2581:2: kw= '*'
                        {
                        kw=(Token)match(input,64,FOLLOW_64_in_synpred183_InternalSimpleJava7378); if (state.failed) return ;

                        }
                        break;
                    case 5 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2588:2: kw= '*='
                        {
                        kw=(Token)match(input,65,FOLLOW_65_in_synpred183_InternalSimpleJava7397); if (state.failed) return ;

                        }
                        break;
                    case 6 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2595:2: kw= '/'
                        {
                        kw=(Token)match(input,66,FOLLOW_66_in_synpred183_InternalSimpleJava7416); if (state.failed) return ;

                        }
                        break;
                    case 7 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2602:2: kw= '/='
                        {
                        kw=(Token)match(input,67,FOLLOW_67_in_synpred183_InternalSimpleJava7435); if (state.failed) return ;

                        }
                        break;
                    case 8 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2609:2: kw= '%'
                        {
                        kw=(Token)match(input,68,FOLLOW_68_in_synpred183_InternalSimpleJava7454); if (state.failed) return ;

                        }
                        break;
                    case 9 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2616:2: kw= '%='
                        {
                        kw=(Token)match(input,69,FOLLOW_69_in_synpred183_InternalSimpleJava7473); if (state.failed) return ;

                        }
                        break;

                }

                pushFollow(FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7496);
                this_expression_23=ruleexpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;
            case 5 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2633:6: ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) )
                {
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2633:6: ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) )
                int alt107=4;
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
                    {
                    alt107=1;
                    }
                    break;
                case 77:
                    {
                    alt107=2;
                    }
                    break;
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                    {
                    alt107=3;
                    }
                    break;
                case 84:
                case 85:
                case 86:
                case 87:
                    {
                    alt107=4;
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
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2633:7: ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2633:7: ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2633:8: (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2633:8: (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' )
                        int alt104=10;
                        alt104 = dfa104.predict(input);
                        switch (alt104) {
                            case 1 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2634:2: kw= 'ampersand'
                                {
                                kw=(Token)match(input,70,FOLLOW_70_in_synpred183_InternalSimpleJava7524); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2641:2: kw= 'ampersand='
                                {
                                kw=(Token)match(input,71,FOLLOW_71_in_synpred183_InternalSimpleJava7543); if (state.failed) return ;

                                }
                                break;
                            case 3 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2648:2: kw= '|'
                                {
                                kw=(Token)match(input,72,FOLLOW_72_in_synpred183_InternalSimpleJava7562); if (state.failed) return ;

                                }
                                break;
                            case 4 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2655:2: kw= '|='
                                {
                                kw=(Token)match(input,73,FOLLOW_73_in_synpred183_InternalSimpleJava7581); if (state.failed) return ;

                                }
                                break;
                            case 5 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2662:2: kw= '^'
                                {
                                kw=(Token)match(input,74,FOLLOW_74_in_synpred183_InternalSimpleJava7600); if (state.failed) return ;

                                }
                                break;
                            case 6 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2669:2: kw= '^='
                                {
                                kw=(Token)match(input,75,FOLLOW_75_in_synpred183_InternalSimpleJava7619); if (state.failed) return ;

                                }
                                break;
                            case 7 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2675:6: (kw= 'ampersand' kw= 'ampersand' )
                                {
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2675:6: (kw= 'ampersand' kw= 'ampersand' )
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2676:2: kw= 'ampersand' kw= 'ampersand'
                                {
                                kw=(Token)match(input,70,FOLLOW_70_in_synpred183_InternalSimpleJava7639); if (state.failed) return ;
                                kw=(Token)match(input,70,FOLLOW_70_in_synpred183_InternalSimpleJava7652); if (state.failed) return ;

                                }


                                }
                                break;
                            case 8 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2689:2: kw= '||='
                                {
                                kw=(Token)match(input,76,FOLLOW_76_in_synpred183_InternalSimpleJava7672); if (state.failed) return ;

                                }
                                break;
                            case 9 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2695:6: ( ( '%' )=>kw= '%' )
                                {
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2695:6: ( ( '%' )=>kw= '%' )
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2695:7: ( '%' )=>kw= '%'
                                {
                                kw=(Token)match(input,68,FOLLOW_68_in_synpred183_InternalSimpleJava7700); if (state.failed) return ;

                                }


                                }
                                break;
                            case 10 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2705:2: kw= '%='
                                {
                                kw=(Token)match(input,69,FOLLOW_69_in_synpred183_InternalSimpleJava7720); if (state.failed) return ;

                                }
                                break;

                        }

                        pushFollow(FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7743);
                        this_expression_35=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;
                    case 2 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2722:6: (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2722:6: (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2723:2: kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression
                        {
                        kw=(Token)match(input,77,FOLLOW_77_in_synpred183_InternalSimpleJava7769); if (state.failed) return ;
                        pushFollow(FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7791);
                        this_expression_37=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;
                        kw=(Token)match(input,38,FOLLOW_38_in_synpred183_InternalSimpleJava7809); if (state.failed) return ;
                        pushFollow(FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7831);
                        this_expression_39=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;
                    case 3 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2757:6: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2757:6: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2757:7: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2757:7: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' )
                        int alt105=6;
                        switch ( input.LA(1) ) {
                        case 78:
                            {
                            alt105=1;
                            }
                            break;
                        case 79:
                            {
                            alt105=2;
                            }
                            break;
                        case 80:
                            {
                            alt105=3;
                            }
                            break;
                        case 81:
                            {
                            alt105=4;
                            }
                            break;
                        case 82:
                            {
                            alt105=5;
                            }
                            break;
                        case 83:
                            {
                            alt105=6;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 105, 0, input);

                            throw nvae;
                        }

                        switch (alt105) {
                            case 1 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2758:2: kw= '>'
                                {
                                kw=(Token)match(input,78,FOLLOW_78_in_synpred183_InternalSimpleJava7858); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2765:2: kw= '<'
                                {
                                kw=(Token)match(input,79,FOLLOW_79_in_synpred183_InternalSimpleJava7877); if (state.failed) return ;

                                }
                                break;
                            case 3 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2772:2: kw= '>='
                                {
                                kw=(Token)match(input,80,FOLLOW_80_in_synpred183_InternalSimpleJava7896); if (state.failed) return ;

                                }
                                break;
                            case 4 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2779:2: kw= '<='
                                {
                                kw=(Token)match(input,81,FOLLOW_81_in_synpred183_InternalSimpleJava7915); if (state.failed) return ;

                                }
                                break;
                            case 5 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2786:2: kw= '=='
                                {
                                kw=(Token)match(input,82,FOLLOW_82_in_synpred183_InternalSimpleJava7934); if (state.failed) return ;

                                }
                                break;
                            case 6 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2793:2: kw= '!='
                                {
                                kw=(Token)match(input,83,FOLLOW_83_in_synpred183_InternalSimpleJava7953); if (state.failed) return ;

                                }
                                break;

                        }

                        pushFollow(FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7976);
                        this_expression_46=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;
                    case 4 :
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2810:6: ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression )
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2810:6: ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression )
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2810:7: (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression
                        {
                        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2810:7: (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' )
                        int alt106=4;
                        switch ( input.LA(1) ) {
                        case 84:
                            {
                            alt106=1;
                            }
                            break;
                        case 85:
                            {
                            alt106=2;
                            }
                            break;
                        case 86:
                            {
                            alt106=3;
                            }
                            break;
                        case 87:
                            {
                            alt106=4;
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
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2811:2: kw= '>>='
                                {
                                kw=(Token)match(input,84,FOLLOW_84_in_synpred183_InternalSimpleJava8003); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2818:2: kw= '<<'
                                {
                                kw=(Token)match(input,85,FOLLOW_85_in_synpred183_InternalSimpleJava8022); if (state.failed) return ;

                                }
                                break;
                            case 3 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2825:2: kw= '>>'
                                {
                                kw=(Token)match(input,86,FOLLOW_86_in_synpred183_InternalSimpleJava8041); if (state.failed) return ;

                                }
                                break;
                            case 4 :
                                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2832:2: kw= '>>>'
                                {
                                kw=(Token)match(input,87,FOLLOW_87_in_synpred183_InternalSimpleJava8060); if (state.failed) return ;

                                }
                                break;

                        }

                        pushFollow(FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava8083);
                        this_expression_51=ruleexpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;

                }


                }
                break;

        }

        pushFollow(FOLLOW_ruleexpression_aux_in_synpred183_InternalSimpleJava8113);
        this_expression_aux_52=ruleexpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred183_InternalSimpleJava

    // $ANTLR start synpred186_InternalSimpleJava
    public final void synpred186_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2954:2: ( '[' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2955:2: '['
        {
        match(input,33,FOLLOW_33_in_synpred186_InternalSimpleJava8422); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred186_InternalSimpleJava

    // $ANTLR start synpred189_InternalSimpleJava
    public final void synpred189_InternalSimpleJava_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_new_10 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3004:5: (this_new_10= rulenew )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3004:5: this_new_10= rulenew
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getCreating_expressionAccess().getNewParserRuleCall_2()); 
              
        }
        pushFollow(FOLLOW_rulenew_in_synpred189_InternalSimpleJava8562);
        this_new_10=rulenew();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred189_InternalSimpleJava

    // $ANTLR start synpred192_InternalSimpleJava
    public final void synpred192_InternalSimpleJava_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_arglist_1 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3079:2: ( ( ( ( '(' )=>kw= '(' ) (this_arglist_1= rulearglist )? kw= ')' ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3079:2: ( ( ( '(' )=>kw= '(' ) (this_arglist_1= rulearglist )? kw= ')' )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3079:2: ( ( ( '(' )=>kw= '(' ) (this_arglist_1= rulearglist )? kw= ')' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3079:3: ( ( '(' )=>kw= '(' ) (this_arglist_1= rulearglist )? kw= ')'
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3079:3: ( ( '(' )=>kw= '(' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3079:4: ( '(' )=>kw= '('
        {
        kw=(Token)match(input,31,FOLLOW_31_in_synpred192_InternalSimpleJava8799); if (state.failed) return ;

        }

        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3087:2: (this_arglist_1= rulearglist )?
        int alt111=2;
        int LA111_0 = input.LA(1);

        if ( ((LA111_0>=RULE_IDENTIFIER && LA111_0<=RULE_FLOAT_LITERAL)||LA111_0==31||(LA111_0>=55 && LA111_0<=57)||(LA111_0>=60 && LA111_0<=62)||(LA111_0>=90 && LA111_0<=103)) ) {
            alt111=1;
        }
        switch (alt111) {
            case 1 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3088:5: this_arglist_1= rulearglist
                {
                pushFollow(FOLLOW_rulearglist_in_synpred192_InternalSimpleJava8823);
                this_arglist_1=rulearglist();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        kw=(Token)match(input,32,FOLLOW_32_in_synpred192_InternalSimpleJava8843); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred192_InternalSimpleJava

    // $ANTLR start synpred193_InternalSimpleJava
    public final void synpred193_InternalSimpleJava_fragment() throws RecognitionException {   
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3105:8: ( '[' )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3106:2: '['
        {
        match(input,33,FOLLOW_33_in_synpred193_InternalSimpleJava8864); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred193_InternalSimpleJava

    // $ANTLR start synpred196_InternalSimpleJava
    public final void synpred196_InternalSimpleJava_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3195:2: ( (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* ) )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3195:2: (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* )
        {
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3195:2: (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3196:5: this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )*
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getArglistAccess().getExpressionParserRuleCall_0_0()); 
              
        }
        pushFollow(FOLLOW_ruleexpression_in_synpred196_InternalSimpleJava9149);
        this_expression_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3206:1: (kw= ',' this_expression_2= ruleexpression )*
        loop112:
        do {
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==27) ) {
                alt112=1;
            }


            switch (alt112) {
        	case 1 :
        	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3207:2: kw= ',' this_expression_2= ruleexpression
        	    {
        	    kw=(Token)match(input,27,FOLLOW_27_in_synpred196_InternalSimpleJava9168); if (state.failed) return ;
        	    pushFollow(FOLLOW_ruleexpression_in_synpred196_InternalSimpleJava9190);
        	    this_expression_2=ruleexpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop112;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred196_InternalSimpleJava

    // $ANTLR start synpred203_InternalSimpleJava
    public final void synpred203_InternalSimpleJava_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_package_name_aux_2 = null;


        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3489:2: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER this_package_name_aux_2= rulepackage_name_aux )
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:3489:2: kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER this_package_name_aux_2= rulepackage_name_aux
        {
        kw=(Token)match(input,58,FOLLOW_58_in_synpred203_InternalSimpleJava10015); if (state.failed) return ;
        this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_synpred203_InternalSimpleJava10030); if (state.failed) return ;
        pushFollow(FOLLOW_rulepackage_name_aux_in_synpred203_InternalSimpleJava10057);
        this_package_name_aux_2=rulepackage_name_aux();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred203_InternalSimpleJava

    // Delegated rules

    public final boolean synpred67_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred148_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred148_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred79_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred161_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred161_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred189_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred189_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred203_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred203_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred129_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred186_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred186_InternalSimpleJava_fragment(); // can never throw exception
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
    public final boolean synpred99_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_InternalSimpleJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalSimpleJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalSimpleJava_fragment(); // can never throw exception
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
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA97 dfa97 = new DFA97(this);
    protected DFA108 dfa108 = new DFA108(this);
    protected DFA103 dfa103 = new DFA103(this);
    protected DFA104 dfa104 = new DFA104(this);
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
            return "285:3: (this_class_declaration_1= ruleclass_declaration | this_interface_declaration_2= ruleinterface_declaration )";
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
            return "()* loopback of 449:1: (this_field_declaration_10= rulefield_declaration | this_class_declaration_11= ruleclass_declaration )*";
        }
    }
    static final String DFA17_eotS =
        "\31\uffff";
    static final String DFA17_eofS =
        "\31\uffff";
    static final String DFA17_minS =
        "\1\4\25\0\3\uffff";
    static final String DFA17_maxS =
        "\1\157\25\0\3\uffff";
    static final String DFA17_acceptS =
        "\26\uffff\1\1\1\3\1\2";
    static final String DFA17_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\3\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\24\32\uffff\1\1\3\uffff\1\10\5\uffff\1\25\14\uffff\1\5\51\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\2\1\3\1\4\1\6\1\7\1\11\1\12\1\13",
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
            return "612:3: (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration )";
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

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_10 = input.LA(1);

                         
                        int index17_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_11 = input.LA(1);

                         
                        int index17_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_12 = input.LA(1);

                         
                        int index17_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_13 = input.LA(1);

                         
                        int index17_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_14 = input.LA(1);

                         
                        int index17_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_15 = input.LA(1);

                         
                        int index17_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_16 = input.LA(1);

                         
                        int index17_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_17 = input.LA(1);

                         
                        int index17_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_18 = input.LA(1);

                         
                        int index17_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_19 = input.LA(1);

                         
                        int index17_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA17_20 = input.LA(1);

                         
                        int index17_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA17_21 = input.LA(1);

                         
                        int index17_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSimpleJava()) ) {s = 24;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index17_21);
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
    static final String DFA28_eotS =
        "\63\uffff";
    static final String DFA28_eofS =
        "\63\uffff";
    static final String DFA28_minS =
        "\1\4\6\uffff\1\0\13\uffff\1\0\1\uffff\1\0\35\uffff";
    static final String DFA28_maxS =
        "\1\157\6\uffff\1\0\13\uffff\1\0\1\uffff\1\0\35\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\24\uffff\1\2\16\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14\1\16\1\17\1\20\1\12\1\15";
    static final String DFA28_specialS =
        "\7\uffff\1\0\13\uffff\1\1\1\uffff\1\2\35\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\23\4\26\11\uffff\1\60\11\uffff\1\45\2\uffff\1\25\3\uffff\1\7\1\54\1\55\1\uffff\1\56\1\57\1\1\1\uffff\1\46\1\uffff\1\47\1\50\1\51\1\52\2\uffff\1\53\2\uffff\1\1\3\26\2\uffff\3\26\33\uffff\1\26\1\uffff\4\26\20\1",
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "905:1: ( ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' | 'boolean' | 'byte' | 'char' | 'short' | 'int' | 'float' | 'long' | 'double' | 'void' | '(' | RULE_IDENTIFIER )=>this_variable_declaration_0= rulevariable_declaration ) | ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_1= ruleexpression ) kw= ';' ) | this_statement_block_3= rulestatement_block | this_if_statement_4= ruleif_statement | this_do_statement_5= ruledo_statement | this_while_statement_6= rulewhile_statement | this_for_statement_7= rulefor_statement | this_try_statement_8= ruletry_statement | this_switch_statement_9= ruleswitch_statement | (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement ) | (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' ) | (kw= 'throw' this_expression_19= ruleexpression kw= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement ) | (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' ) | (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' ) | kw= ';' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_7 = input.LA(1);

                         
                        int index28_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalSimpleJava()) ) {s = 1;}

                        else if ( (synpred75_InternalSimpleJava()) ) {s = 49;}

                         
                        input.seek(index28_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_19 = input.LA(1);

                         
                        int index28_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalSimpleJava()) ) {s = 1;}

                        else if ( (synpred67_InternalSimpleJava()) ) {s = 22;}

                        else if ( (synpred79_InternalSimpleJava()) ) {s = 50;}

                         
                        input.seek(index28_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_21 = input.LA(1);

                         
                        int index28_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalSimpleJava()) ) {s = 1;}

                        else if ( (synpred67_InternalSimpleJava()) ) {s = 22;}

                         
                        input.seek(index28_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\7\uffff";
    static final String DFA30_eofS =
        "\7\uffff";
    static final String DFA30_minS =
        "\1\4\1\uffff\1\4\2\uffff\1\42\1\4";
    static final String DFA30_maxS =
        "\1\147\1\uffff\1\72\2\uffff\1\42\1\52";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\2\uffff";
    static final String DFA30_specialS =
        "\7\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\2\32\uffff\1\4\11\uffff\1\3\66\uffff\10\1",
            "",
            "\1\1\15\uffff\1\4\10\uffff\2\4\2\uffff\1\1\1\uffff\1\5\10\uffff\1\4\17\uffff\1\1",
            "",
            "",
            "\1\6",
            "\1\1\15\uffff\1\4\10\uffff\2\4\2\uffff\1\1\1\uffff\1\5\10\uffff\1\4"
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1275:3: (this_type_1= ruletype | kw= 'void' )?";
        }
    }
    static final String DFA42_eotS =
        "\46\uffff";
    static final String DFA42_eofS =
        "\46\uffff";
    static final String DFA42_minS =
        "\1\4\22\uffff\1\0\1\uffff\1\0\20\uffff";
    static final String DFA42_maxS =
        "\1\157\22\uffff\1\0\1\uffff\1\0\20\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\24\uffff\1\2\16\uffff\1\3";
    static final String DFA42_specialS =
        "\23\uffff\1\0\1\uffff\1\1\20\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\23\4\26\11\uffff\1\45\14\uffff\1\25\3\uffff\1\1\5\uffff\1\1\14\uffff\1\1\3\26\2\uffff\3\26\33\uffff\1\26\1\uffff\4\26\20\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "1746:1: ( ( ( rulevariable_declaration )=>this_variable_declaration_2= rulevariable_declaration ) | (this_expression_3= ruleexpression kw= ';' ) | kw= ';' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_19 = input.LA(1);

                         
                        int index42_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalSimpleJava()) ) {s = 1;}

                        else if ( (synpred100_InternalSimpleJava()) ) {s = 22;}

                         
                        input.seek(index42_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_21 = input.LA(1);

                         
                        int index42_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalSimpleJava()) ) {s = 1;}

                        else if ( (synpred100_InternalSimpleJava()) ) {s = 22;}

                         
                        input.seek(index42_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\32\uffff";
    static final String DFA51_eofS =
        "\32\uffff";
    static final String DFA51_minS =
        "\1\4\17\uffff\1\0\11\uffff";
    static final String DFA51_maxS =
        "\1\147\17\uffff\1\0\11\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\20\uffff\1\2\7\uffff";
    static final String DFA51_specialS =
        "\20\uffff\1\0\11\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\20\4\1\26\uffff\1\1\27\uffff\3\1\2\uffff\3\1\33\uffff\1\1\1\uffff\4\1\10\22",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "2190:1: ( ( ( ( '!' | 'true' | 'false' | '-' | '++' | '--' | '~' | 'new' | 'null' | 'super' | 'this' | '(' | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING | RULE_IDENTIFIER )=>this_expression_0= ruleexpression ) kw= ')' ) | (this_type_2= ruletype kw= ')' this_expression_4= ruleexpression ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_16 = input.LA(1);

                         
                        int index51_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_InternalSimpleJava()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index51_16);
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
    static final String DFA52_eotS =
        "\13\uffff";
    static final String DFA52_eofS =
        "\13\uffff";
    static final String DFA52_minS =
        "\1\4\12\uffff";
    static final String DFA52_maxS =
        "\1\137\12\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA52_specialS =
        "\13\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\11\4\5\26\uffff\1\12\27\uffff\1\6\1\7\1\10\2\uffff\3\2\33\uffff\1\4\1\uffff\3\1\1\3",
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
            return "2281:2: (this_logical_expression_0= rulelogical_expression | this_numeric_expression_1= rulenumeric_expression | this_bit_expression_2= rulebit_expression | this_creating_expression_3= rulecreating_expression | this_literal_expression_4= ruleliteral_expression | kw= 'null' | kw= 'super' | kw= 'this' | this_IDENTIFIER_8= RULE_IDENTIFIER | (kw= '(' this_exp_aux_10= ruleexp_aux ) )";
        }
    }
    static final String DFA62_eotS =
        "\46\uffff";
    static final String DFA62_eofS =
        "\1\44\45\uffff";
    static final String DFA62_minS =
        "\1\22\43\0\2\uffff";
    static final String DFA62_maxS =
        "\1\131\43\0\2\uffff";
    static final String DFA62_acceptS =
        "\44\uffff\1\2\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\15\1\7\1\25\1\14\1\24\1\35\1\42\1\16\1\0\1\33\1\31\1\1\1\13\1\22\1\36\1\5\1\3\1\17\1\32\1\4\1\11\1\23\1\37\1\34\1\41\1\2\1\30\1\21\1\12\1\10\1\27\1\26\1\40\1\6\1\20\2\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\44\10\uffff\1\4\2\44\1\uffff\1\1\1\44\1\2\1\44\3\uffff\1\44\23\uffff\1\3\1\5\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\6\1\7",
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
            return "2419:1: ( ( ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression ) | (kw= '++' | kw= '--' ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression ) | ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) ) ) this_expression_aux_52= ruleexpression_aux )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_9 = input.LA(1);

                         
                        int index62_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_12 = input.LA(1);

                         
                        int index62_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_26 = input.LA(1);

                         
                        int index62_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_26);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA62_17 = input.LA(1);

                         
                        int index62_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_17);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA62_20 = input.LA(1);

                         
                        int index62_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_20);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA62_16 = input.LA(1);

                         
                        int index62_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA62_34 = input.LA(1);

                         
                        int index62_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_34);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA62_2 = input.LA(1);

                         
                        int index62_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_2);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA62_30 = input.LA(1);

                         
                        int index62_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_30);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA62_21 = input.LA(1);

                         
                        int index62_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_21);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA62_29 = input.LA(1);

                         
                        int index62_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_29);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA62_13 = input.LA(1);

                         
                        int index62_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA62_4 = input.LA(1);

                         
                        int index62_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_4);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA62_8 = input.LA(1);

                         
                        int index62_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_8);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA62_18 = input.LA(1);

                         
                        int index62_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_18);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA62_35 = input.LA(1);

                         
                        int index62_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_35);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA62_28 = input.LA(1);

                         
                        int index62_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_28);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA62_14 = input.LA(1);

                         
                        int index62_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_14);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA62_22 = input.LA(1);

                         
                        int index62_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_22);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA62_5 = input.LA(1);

                         
                        int index62_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_5);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA62_3 = input.LA(1);

                         
                        int index62_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_3);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA62_32 = input.LA(1);

                         
                        int index62_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_32);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA62_31 = input.LA(1);

                         
                        int index62_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_31);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA62_27 = input.LA(1);

                         
                        int index62_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_27);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA62_11 = input.LA(1);

                         
                        int index62_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_11);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA62_19 = input.LA(1);

                         
                        int index62_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_19);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA62_10 = input.LA(1);

                         
                        int index62_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_10);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA62_24 = input.LA(1);

                         
                        int index62_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_24);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA62_6 = input.LA(1);

                         
                        int index62_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_6);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA62_15 = input.LA(1);

                         
                        int index62_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_15);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA62_23 = input.LA(1);

                         
                        int index62_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_23);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA62_33 = input.LA(1);

                         
                        int index62_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA62_25 = input.LA(1);

                         
                        int index62_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_25);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA62_7 = input.LA(1);

                         
                        int index62_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalSimpleJava()) ) {s = 37;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index62_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\45\uffff";
    static final String DFA61_eofS =
        "\45\uffff";
    static final String DFA61_minS =
        "\1\33\5\uffff\2\0\10\uffff\2\0\23\uffff";
    static final String DFA61_maxS =
        "\1\131\5\uffff\2\0\10\uffff\2\0\23\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\6\uffff\1\3\1\uffff\1\4\7\uffff\1\5\21\uffff\1\2";
    static final String DFA61_specialS =
        "\6\uffff\1\0\1\1\10\uffff\1\2\1\3\23\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\1\3\uffff\1\1\1\uffff\1\1\30\uffff\2\1\2\10\6\12\1\20\1\21\22\22\1\6\1\7",
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
            return "2419:2: ( ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression ) | (kw= '++' | kw= '--' ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression ) | ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_6 = input.LA(1);

                         
                        int index61_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalSimpleJava()) ) {s = 36;}

                        else if ( (synpred161_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index61_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_7 = input.LA(1);

                         
                        int index61_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalSimpleJava()) ) {s = 36;}

                        else if ( (synpred161_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index61_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_16 = input.LA(1);

                         
                        int index61_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred161_InternalSimpleJava()) ) {s = 10;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA61_17 = input.LA(1);

                         
                        int index61_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred161_InternalSimpleJava()) ) {s = 10;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\12\uffff";
    static final String DFA56_eofS =
        "\12\uffff";
    static final String DFA56_minS =
        "\1\76\11\uffff";
    static final String DFA56_maxS =
        "\1\131\11\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA56_specialS =
        "\12\uffff}>";
    static final String[] DFA56_transitionS = {
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
            return "2550:7: ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' )";
        }
    }
    static final String DFA57_eotS =
        "\14\uffff";
    static final String DFA57_eofS =
        "\14\uffff";
    static final String DFA57_minS =
        "\1\104\1\4\12\uffff";
    static final String DFA57_maxS =
        "\1\114\1\137\12\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\10\1\11\1\12\1\7\1\1";
    static final String DFA57_specialS =
        "\14\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\10\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\5\13\26\uffff\1\13\27\uffff\3\13\2\uffff\3\13\7\uffff\1\12\23\uffff\1\13\1\uffff\4\13",
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
            return "2633:8: (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' )";
        }
    }
    static final String DFA64_eotS =
        "\54\uffff";
    static final String DFA64_eofS =
        "\1\2\53\uffff";
    static final String DFA64_minS =
        "\1\22\1\0\52\uffff";
    static final String DFA64_maxS =
        "\1\131\1\0\52\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\50\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\52\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\2\10\uffff\3\2\1\uffff\2\2\1\1\1\2\3\uffff\1\2\23\uffff\40\2",
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

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "2954:1: ( ( '[' )=>this_aux_4= ruleaux )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred186_InternalSimpleJava()) ) {s = 43;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\54\uffff";
    static final String DFA67_eofS =
        "\1\1\53\uffff";
    static final String DFA67_minS =
        "\1\22\45\uffff\1\0\5\uffff";
    static final String DFA67_maxS =
        "\1\131\45\uffff\1\0\5\uffff";
    static final String DFA67_acceptS =
        "\1\uffff\1\2\51\uffff\1\1";
    static final String DFA67_specialS =
        "\46\uffff\1\0\5\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\1\10\uffff\1\1\1\46\1\1\1\uffff\4\1\3\uffff\1\1\23\uffff\40\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 3003:3: (this_new_10= rulenew )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_38 = input.LA(1);

                         
                        int index67_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred189_InternalSimpleJava()) ) {s = 43;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_38);
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
    static final String DFA71_eotS =
        "\54\uffff";
    static final String DFA71_eofS =
        "\1\2\53\uffff";
    static final String DFA71_minS =
        "\1\22\1\0\52\uffff";
    static final String DFA71_maxS =
        "\1\131\1\0\52\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\50\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\52\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\2\10\uffff\3\2\1\uffff\1\1\3\2\3\uffff\1\2\23\uffff\40\2",
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
            return "3079:1: ( ( ( ( '(' )=>kw= '(' ) (this_arglist_1= rulearglist )? kw= ')' ) | ( ( ( '[' )=>this_aux_3= ruleaux )? (kw= '[' kw= ']' )* ) )";
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
                        if ( (synpred192_InternalSimpleJava()) ) {s = 43;}

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
        "\54\uffff";
    static final String DFA69_eofS =
        "\1\2\53\uffff";
    static final String DFA69_minS =
        "\1\22\1\0\52\uffff";
    static final String DFA69_maxS =
        "\1\131\1\0\52\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\50\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\52\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\2\10\uffff\3\2\1\uffff\2\2\1\1\1\2\3\uffff\1\2\23\uffff\40\2",
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
            return "3105:7: ( ( '[' )=>this_aux_3= ruleaux )?";
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
                        if ( (synpred193_InternalSimpleJava()) ) {s = 43;}

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
    static final String DFA74_eotS =
        "\33\uffff";
    static final String DFA74_eofS =
        "\33\uffff";
    static final String DFA74_minS =
        "\1\4\17\uffff\1\0\12\uffff";
    static final String DFA74_maxS =
        "\1\147\17\uffff\1\0\12\uffff";
    static final String DFA74_acceptS =
        "\1\uffff\1\1\20\uffff\1\2\1\3\7\uffff";
    static final String DFA74_specialS =
        "\20\uffff\1\0\12\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\20\4\1\26\uffff\1\1\27\uffff\3\1\2\uffff\3\1\33\uffff\1\1\1\22\4\1\10\23",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "3195:1: ( (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* ) | (kw= '\"' this_STRING_4= RULE_STRING kw= '\"' ) | (this_type_6= ruletype this_IDENTIFIER_7= RULE_IDENTIFIER (kw= ',' this_type_9= ruletype this_IDENTIFIER_10= RULE_IDENTIFIER )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_16 = input.LA(1);

                         
                        int index74_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred196_InternalSimpleJava()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index74_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA97_eotS =
        "\12\uffff";
    static final String DFA97_eofS =
        "\12\uffff";
    static final String DFA97_minS =
        "\1\76\11\uffff";
    static final String DFA97_maxS =
        "\1\131\11\uffff";
    static final String DFA97_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA97_specialS =
        "\12\uffff}>";
    static final String[] DFA97_transitionS = {
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

    static final short[] DFA97_eot = DFA.unpackEncodedString(DFA97_eotS);
    static final short[] DFA97_eof = DFA.unpackEncodedString(DFA97_eofS);
    static final char[] DFA97_min = DFA.unpackEncodedStringToUnsignedChars(DFA97_minS);
    static final char[] DFA97_max = DFA.unpackEncodedStringToUnsignedChars(DFA97_maxS);
    static final short[] DFA97_accept = DFA.unpackEncodedString(DFA97_acceptS);
    static final short[] DFA97_special = DFA.unpackEncodedString(DFA97_specialS);
    static final short[][] DFA97_transition;

    static {
        int numStates = DFA97_transitionS.length;
        DFA97_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA97_transition[i] = DFA.unpackEncodedString(DFA97_transitionS[i]);
        }
    }

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = DFA97_eot;
            this.eof = DFA97_eof;
            this.min = DFA97_min;
            this.max = DFA97_max;
            this.accept = DFA97_accept;
            this.special = DFA97_special;
            this.transition = DFA97_transition;
        }
        public String getDescription() {
            return "2550:7: ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' )";
        }
    }
    static final String DFA108_eotS =
        "\45\uffff";
    static final String DFA108_eofS =
        "\45\uffff";
    static final String DFA108_minS =
        "\1\33\5\uffff\2\0\10\uffff\2\0\23\uffff";
    static final String DFA108_maxS =
        "\1\131\5\uffff\2\0\10\uffff\2\0\23\uffff";
    static final String DFA108_acceptS =
        "\1\uffff\1\1\6\uffff\1\3\1\uffff\1\4\7\uffff\1\5\21\uffff\1\2";
    static final String DFA108_specialS =
        "\6\uffff\1\0\1\1\10\uffff\1\2\1\3\23\uffff}>";
    static final String[] DFA108_transitionS = {
            "\1\1\3\uffff\1\1\1\uffff\1\1\30\uffff\2\1\2\10\6\12\1\20\1\21\22\22\1\6\1\7",
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

    static final short[] DFA108_eot = DFA.unpackEncodedString(DFA108_eotS);
    static final short[] DFA108_eof = DFA.unpackEncodedString(DFA108_eofS);
    static final char[] DFA108_min = DFA.unpackEncodedStringToUnsignedChars(DFA108_minS);
    static final char[] DFA108_max = DFA.unpackEncodedStringToUnsignedChars(DFA108_maxS);
    static final short[] DFA108_accept = DFA.unpackEncodedString(DFA108_acceptS);
    static final short[] DFA108_special = DFA.unpackEncodedString(DFA108_specialS);
    static final short[][] DFA108_transition;

    static {
        int numStates = DFA108_transitionS.length;
        DFA108_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA108_transition[i] = DFA.unpackEncodedString(DFA108_transitionS[i]);
        }
    }

    class DFA108 extends DFA {

        public DFA108(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 108;
            this.eot = DFA108_eot;
            this.eof = DFA108_eof;
            this.min = DFA108_min;
            this.max = DFA108_max;
            this.accept = DFA108_accept;
            this.special = DFA108_special;
            this.transition = DFA108_transition;
        }
        public String getDescription() {
            return "2419:2: ( ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' ) | this_aux_3= ruleaux | (kw= '.' this_expression_5= ruleexpression ) | (kw= ',' this_expression_7= ruleexpression ) | (kw= 'instanceof' ( ( RULE_IDENTIFIER )=>this_name_9= rulename ) ) ) | ( ( ( '+' | '+=' )=>this_mais_aux_10= rulemais_aux ) this_expression_11= ruleexpression ) | (kw= '++' | kw= '--' ) | ( ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) this_expression_23= ruleexpression ) | ( ( (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' ) this_expression_35= ruleexpression ) | (kw= '?' this_expression_37= ruleexpression kw= ':' this_expression_39= ruleexpression ) | ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) this_expression_46= ruleexpression ) | ( (kw= '>>=' | kw= '<<' | kw= '>>' | kw= '>>>' ) this_expression_51= ruleexpression ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA108_6 = input.LA(1);

                         
                        int index108_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalSimpleJava()) ) {s = 36;}

                        else if ( (synpred161_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index108_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA108_7 = input.LA(1);

                         
                        int index108_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalSimpleJava()) ) {s = 36;}

                        else if ( (synpred161_InternalSimpleJava()) ) {s = 10;}

                         
                        input.seek(index108_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA108_16 = input.LA(1);

                         
                        int index108_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred161_InternalSimpleJava()) ) {s = 10;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index108_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA108_17 = input.LA(1);

                         
                        int index108_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred161_InternalSimpleJava()) ) {s = 10;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index108_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 108, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA103_eotS =
        "\12\uffff";
    static final String DFA103_eofS =
        "\12\uffff";
    static final String DFA103_minS =
        "\1\76\11\uffff";
    static final String DFA103_maxS =
        "\1\131\11\uffff";
    static final String DFA103_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA103_specialS =
        "\12\uffff}>";
    static final String[] DFA103_transitionS = {
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

    static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
    static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
    static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
    static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
    static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
    static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
    static final short[][] DFA103_transition;

    static {
        int numStates = DFA103_transitionS.length;
        DFA103_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
        }
    }

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = DFA103_eot;
            this.eof = DFA103_eof;
            this.min = DFA103_min;
            this.max = DFA103_max;
            this.accept = DFA103_accept;
            this.special = DFA103_special;
            this.transition = DFA103_transition;
        }
        public String getDescription() {
            return "2550:7: ( ( ( '+' | '+=' )=>this_mais_aux_14= rulemais_aux ) | kw= '-' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' )";
        }
    }
    static final String DFA104_eotS =
        "\14\uffff";
    static final String DFA104_eofS =
        "\14\uffff";
    static final String DFA104_minS =
        "\1\104\1\4\12\uffff";
    static final String DFA104_maxS =
        "\1\114\1\137\12\uffff";
    static final String DFA104_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\10\1\11\1\12\1\7\1\1";
    static final String DFA104_specialS =
        "\14\uffff}>";
    static final String[] DFA104_transitionS = {
            "\1\10\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\5\13\26\uffff\1\13\27\uffff\3\13\2\uffff\3\13\7\uffff\1\12\23\uffff\1\13\1\uffff\4\13",
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

    static final short[] DFA104_eot = DFA.unpackEncodedString(DFA104_eotS);
    static final short[] DFA104_eof = DFA.unpackEncodedString(DFA104_eofS);
    static final char[] DFA104_min = DFA.unpackEncodedStringToUnsignedChars(DFA104_minS);
    static final char[] DFA104_max = DFA.unpackEncodedStringToUnsignedChars(DFA104_maxS);
    static final short[] DFA104_accept = DFA.unpackEncodedString(DFA104_acceptS);
    static final short[] DFA104_special = DFA.unpackEncodedString(DFA104_specialS);
    static final short[][] DFA104_transition;

    static {
        int numStates = DFA104_transitionS.length;
        DFA104_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA104_transition[i] = DFA.unpackEncodedString(DFA104_transitionS[i]);
        }
    }

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = DFA104_eot;
            this.eof = DFA104_eof;
            this.min = DFA104_min;
            this.max = DFA104_max;
            this.accept = DFA104_accept;
            this.special = DFA104_special;
            this.transition = DFA104_transition;
        }
        public String getDescription() {
            return "2633:8: (kw= 'ampersand' | kw= 'ampersand=' | kw= '|' | kw= '|=' | kw= '^' | kw= '^=' | (kw= 'ampersand' kw= 'ampersand' ) | kw= '||=' | ( ( '%' )=>kw= '%' ) | kw= '%=' )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompilation_unit_in_ruleModel136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompilation_unit_in_entryRulecompilation_unit172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompilation_unit183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepackage_statement_in_rulecompilation_unit231 = new BitSet(new long[]{0x0040000841280002L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_ruleimport_statement_in_rulecompilation_unit261 = new BitSet(new long[]{0x0040000841280002L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_ruletype_declaration_in_rulecompilation_unit291 = new BitSet(new long[]{0x0040000841200002L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_rulepackage_statement_in_entryRulepackage_statement339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepackage_statement350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulepackage_statement388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_rulepackage_statement410 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulepackage_statement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimport_statement_in_entryRuleimport_statement469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimport_statement480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleimport_statement518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleimport_statement540 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_20_in_ruleimport_statement559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleimport_statement578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_declaration_in_entryRuletype_declaration620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_declaration631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_ruletype_declaration679 = new BitSet(new long[]{0x0040000841200000L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_ruleclass_declaration_in_ruletype_declaration709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinterface_declaration_in_ruletype_declaration742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_entryRuledoc_comment789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledoc_comment800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruledoc_comment838 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruledoc_comment851 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruledoc_comment864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclass_declaration_in_entryRuleclass_declaration905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclass_declaration916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_ruleclass_declaration964 = new BitSet(new long[]{0x0040000801000000L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_24_in_ruleclass_declaration984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleclass_declaration999 = new BitSet(new long[]{0x0000000016000000L});
    public static final BitSet FOLLOW_25_in_ruleclass_declaration1018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleclass_declaration1040 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_26_in_ruleclass_declaration1061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleclass_declaration1083 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleclass_declaration1102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleclass_declaration1124 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_ruleclass_declaration1146 = new BitSet(new long[]{0x00400208A1240010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulefield_declaration_in_ruleclass_declaration1169 = new BitSet(new long[]{0x00400208A1240010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleclass_declaration_in_ruleclass_declaration1202 = new BitSet(new long[]{0x00400208A1240010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_29_in_ruleclass_declaration1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinterface_declaration_in_entryRuleinterface_declaration1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinterface_declaration1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_ruleinterface_declaration1322 = new BitSet(new long[]{0x0040000840000000L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_30_in_ruleinterface_declaration1342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleinterface_declaration1357 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_25_in_ruleinterface_declaration1376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleinterface_declaration1398 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleinterface_declaration1417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleinterface_declaration1439 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_ruleinterface_declaration1461 = new BitSet(new long[]{0x00400208A0240010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulefield_declaration_in_ruleinterface_declaration1484 = new BitSet(new long[]{0x00400208A0240010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_29_in_ruleinterface_declaration1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_declaration_in_entryRulefield_declaration1545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_declaration1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_rulefield_declaration1605 = new BitSet(new long[]{0x0040020880200010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_rulefield_declaration1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_rulefield_declaration1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulefield_declaration1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatic_initializer_in_rulefield_declaration1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulefield_declaration1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_entryRulemethod_declaration1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemethod_declaration1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulemethod_declaration1850 = new BitSet(new long[]{0x0000000100000010L,0x000000FF00000000L});
    public static final BitSet FOLLOW_ruleparameter_list_in_rulemethod_declaration1873 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulemethod_declaration1893 = new BitSet(new long[]{0x0000000210040000L});
    public static final BitSet FOLLOW_33_in_rulemethod_declaration1907 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulemethod_declaration1920 = new BitSet(new long[]{0x0000000210040000L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulemethod_declaration1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulemethod_declaration1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_in_entryRuleparameter2011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleparameter2069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleparameter2089 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleparameter2108 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleparameter2121 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleparameter_list_in_entryRuleparameter_list2164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_list2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_in_ruleparameter_list2222 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleparameter_list2241 = new BitSet(new long[]{0x0000000000000010L,0x000000FF00000000L});
    public static final BitSet FOLLOW_ruleparameter_in_ruleparameter_list2263 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_entryRulestatement_block2311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_block2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulestatement_block2360 = new BitSet(new long[]{0x73C9EBB8B02401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_block2383 = new BitSet(new long[]{0x73C9EBB8B02401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_29_in_rulestatement_block2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement2444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulestatement2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement2825 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulestatement2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_rulestatement2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledo_statement_in_rulestatement2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rulestatement2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rulestatement3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletry_statement_in_rulestatement3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitch_statement_in_rulestatement3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulestatement3096 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulestatement3109 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement3131 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulestatement3149 = new BitSet(new long[]{0x73C9EBB8902401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulestatement3197 = new BitSet(new long[]{0x73800000800401F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement3220 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulestatement3261 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement3283 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement3324 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulestatement3342 = new BitSet(new long[]{0x73C9EBB8902401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulestatement3390 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement3406 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulestatement3447 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement3463 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestatement3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulestatement3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration3544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_rulevariable_declaration3603 = new BitSet(new long[]{0x0040020880200010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruletype_in_rulevariable_declaration3633 = new BitSet(new long[]{0x0040020880200010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_41_in_rulevariable_declaration3657 = new BitSet(new long[]{0x0040020880200010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulevariable_declarator_in_rulevariable_declaration3681 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_27_in_rulevariable_declaration3700 = new BitSet(new long[]{0x0040020880200010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_rulevariable_declarator_in_rulevariable_declaration3722 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_18_in_rulevariable_declaration3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulevariable_declaration3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declarator_in_entryRulevariable_declarator3818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declarator3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulevariable_declarator3868 = new BitSet(new long[]{0x73800001800001F0L,0x000000FFFC000000L});
    public static final BitSet FOLLOW_rulearglist_in_rulevariable_declarator3891 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulevariable_declarator3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariable_declarator3934 = new BitSet(new long[]{0x0000040200000002L});
    public static final BitSet FOLLOW_33_in_rulevariable_declarator3953 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulevariable_declarator3966 = new BitSet(new long[]{0x0000040200000002L});
    public static final BitSet FOLLOW_42_in_rulevariable_declarator3982 = new BitSet(new long[]{0x73800000900001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_declarator4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_entryRulevariable_initializer4053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_initializer4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulevariable_initializer4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulevariable_initializer4136 = new BitSet(new long[]{0x73800000B00001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_initializer4159 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_27_in_rulevariable_initializer4178 = new BitSet(new long[]{0x73800000900001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_initializer4200 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_27_in_rulevariable_initializer4221 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulevariable_initializer4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_entryRuleif_statement4280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_statement4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleif_statement4329 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleif_statement4342 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleif_statement4364 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleif_statement4382 = new BitSet(new long[]{0x73C9EBB8902401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement4404 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleif_statement4435 = new BitSet(new long[]{0x73C9EBB8902401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledo_statement_in_entryRuledo_statement4506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledo_statement4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruledo_statement4555 = new BitSet(new long[]{0x73C9EBB8902401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruledo_statement4577 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruledo_statement4595 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruledo_statement4608 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruledo_statement4630 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruledo_statement4648 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruledo_statement4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement4702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulewhile_statement4751 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulewhile_statement4764 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulewhile_statement4786 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulewhile_statement4804 = new BitSet(new long[]{0x73C9EBB8902401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulewhile_statement4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_entryRulefor_statement4872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_statement4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulefor_statement4921 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulefor_statement4934 = new BitSet(new long[]{0x73C00208802401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulefor_statement4963 = new BitSet(new long[]{0x73800000800401F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4998 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulefor_statement5016 = new BitSet(new long[]{0x73800000800401F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_18_in_rulefor_statement5036 = new BitSet(new long[]{0x73800000800401F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement5060 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulefor_statement5080 = new BitSet(new long[]{0x73800001800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement5103 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulefor_statement5123 = new BitSet(new long[]{0x73C9EBB8902401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulefor_statement5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletry_statement_in_entryRuletry_statement5191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletry_statement5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruletry_statement5240 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruletry_statement5262 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_ruletry_statement5304 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruletry_statement5317 = new BitSet(new long[]{0x0000000000000010L,0x000000FF00000000L});
    public static final BitSet FOLLOW_ruleparameter_in_ruletry_statement5339 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruletry_statement5357 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruletry_statement5379 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_50_in_ruletry_statement5413 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruletry_statement5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitch_statement_in_entryRuleswitch_statement5484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleswitch_statement5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleswitch_statement5533 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleswitch_statement5546 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleswitch_statement5568 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleswitch_statement5586 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleswitch_statement5599 = new BitSet(new long[]{0x73F9EBB8B02401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_52_in_ruleswitch_statement5614 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleswitch_statement5636 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleswitch_statement5654 = new BitSet(new long[]{0x73F9EBB8B02401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_53_in_ruleswitch_statement5675 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleswitch_statement5688 = new BitSet(new long[]{0x73F9EBB8B02401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleswitch_statement5717 = new BitSet(new long[]{0x73F9EBB8B02401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_29_in_ruleswitch_statement5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_entryRuleconstructor_declaration5778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstructor_declaration5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_ruleconstructor_declaration5837 = new BitSet(new long[]{0x0040020800000010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruletype_in_ruleconstructor_declaration5867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_41_in_ruleconstructor_declaration5891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstructor_declaration5908 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleconstructor_declaration5926 = new BitSet(new long[]{0x0000000100000010L,0x000000FF00000000L});
    public static final BitSet FOLLOW_ruleparameter_list_in_ruleconstructor_declaration5949 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleconstructor_declaration5969 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruleconstructor_declaration5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatic_initializer_in_entryRulestatic_initializer6037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatic_initializer6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulestatic_initializer6086 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulestatic_initializer6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexp_aux_in_entryRuleexp_aux6154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexp_aux6165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexp_aux6335 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleexp_aux6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleexp_aux6384 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleexp_aux6402 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexp_aux6424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression6471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogical_expression_in_ruleexpression6530 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_rulenumeric_expression_in_ruleexpression6563 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_rulebit_expression_in_ruleexpression6596 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_rulecreating_expression_in_ruleexpression6629 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_ruleliteral_expression_in_ruleexpression6662 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_55_in_ruleexpression6686 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_56_in_ruleexpression6705 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_57_in_ruleexpression6724 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleexpression6745 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_31_in_ruleexpression6770 = new BitSet(new long[]{0x73800000800001F0L,0x000000FFF4000000L});
    public static final BitSet FOLLOW_ruleexp_aux_in_ruleexpression6792 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression6821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_entryRuleexpression_aux6867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_aux6878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleexpression_aux6919 = new BitSet(new long[]{0x73800001800001F0L,0x000000FFFC000000L});
    public static final BitSet FOLLOW_rulearglist_in_ruleexpression_aux6942 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleexpression_aux6962 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_ruleaux_in_ruleexpression_aux6991 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_58_in_ruleexpression_aux7016 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7038 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_27_in_ruleexpression_aux7064 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7086 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_59_in_ruleexpression_aux7112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_ruleexpression_aux7140 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_ruleexpression_aux7194 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7222 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_60_in_ruleexpression_aux7248 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_61_in_ruleexpression_aux7267 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_ruleexpression_aux7315 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_62_in_ruleexpression_aux7340 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_63_in_ruleexpression_aux7359 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_64_in_ruleexpression_aux7378 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_65_in_ruleexpression_aux7397 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_66_in_ruleexpression_aux7416 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_67_in_ruleexpression_aux7435 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_68_in_ruleexpression_aux7454 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_69_in_ruleexpression_aux7473 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7496 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_70_in_ruleexpression_aux7524 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_71_in_ruleexpression_aux7543 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_72_in_ruleexpression_aux7562 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_73_in_ruleexpression_aux7581 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_74_in_ruleexpression_aux7600 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_75_in_ruleexpression_aux7619 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_70_in_ruleexpression_aux7639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleexpression_aux7652 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_76_in_ruleexpression_aux7672 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_68_in_ruleexpression_aux7700 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_69_in_ruleexpression_aux7720 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7743 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_77_in_ruleexpression_aux7769 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7791 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleexpression_aux7809 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7831 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_78_in_ruleexpression_aux7858 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_79_in_ruleexpression_aux7877 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_80_in_ruleexpression_aux7896 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_81_in_ruleexpression_aux7915 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_82_in_ruleexpression_aux7934 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_83_in_ruleexpression_aux7953 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux7976 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_84_in_ruleexpression_aux8003 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_85_in_ruleexpression_aux8022 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_86_in_ruleexpression_aux8041 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_87_in_ruleexpression_aux8060 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_aux8083 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression_aux8113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemais_aux_in_entryRulemais_aux8160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemais_aux8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rulemais_aux8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rulemais_aux8228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecreating_expression_in_entryRulecreating_expression8269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecreating_expression8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rulecreating_expression8318 = new BitSet(new long[]{0x0000000080000010L,0x000000FF00000000L});
    public static final BitSet FOLLOW_rulename_in_rulecreating_expression8342 = new BitSet(new long[]{0x0000000290000000L});
    public static final BitSet FOLLOW_rulecreating_aux_in_rulecreating_expression8369 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_rulecreating_expression8404 = new BitSet(new long[]{0x0000000210000002L});
    public static final BitSet FOLLOW_ruleaux_in_rulecreating_expression8440 = new BitSet(new long[]{0x0000000210000002L});
    public static final BitSet FOLLOW_33_in_rulecreating_expression8461 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulecreating_expression8474 = new BitSet(new long[]{0x0000000210000002L});
    public static final BitSet FOLLOW_31_in_rulecreating_expression8497 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulecreating_expression8519 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulecreating_expression8537 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulenew_in_rulecreating_expression8562 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulenew_in_entryRulenew8610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenew8621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulenew8659 = new BitSet(new long[]{0x0040020800000010L,0x0000FFFF00000000L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_rulenew8681 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulenew8699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecreating_aux_in_entryRulecreating_aux8740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecreating_aux8751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulecreating_aux8799 = new BitSet(new long[]{0x73800001800001F0L,0x000000FFFC000000L});
    public static final BitSet FOLLOW_rulearglist_in_rulecreating_aux8823 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulecreating_aux8843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaux_in_rulecreating_aux8882 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_rulecreating_aux8903 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulecreating_aux8916 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleaux_in_entryRuleaux8960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaux8971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleaux9009 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleaux9031 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleaux9049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearglist_in_entryRulearglist9090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearglist9101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulearglist9149 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rulearglist9168 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulearglist9190 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_91_in_rulearglist9218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulearglist9233 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_rulearglist9251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rulearglist9281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulearglist9301 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rulearglist9320 = new BitSet(new long[]{0x0000000000000010L,0x000000FF00000000L});
    public static final BitSet FOLLOW_ruletype_in_rulearglist9342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulearglist9362 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rulelogical_expression_in_entryRulelogical_expression9411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogical_expression9422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rulelogical_expression9461 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulelogical_expression9483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rulelogical_expression9508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rulelogical_expression9527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebit_expression_in_entryRulebit_expression9568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebit_expression9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rulebit_expression9617 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulebit_expression9639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumeric_expression_in_entryRulenumeric_expression9685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumeric_expression9696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulenumeric_expression9735 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_60_in_rulenumeric_expression9754 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_61_in_rulenumeric_expression9773 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_rulenumeric_expression9796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulename_in_entryRulename9842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulename9853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulename9893 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_rulename9920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_entryRulepackage_name_aux9966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepackage_name_aux9977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulepackage_name_aux10015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulepackage_name_aux10030 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_rulepackage_name_aux10057 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_entryRuletype_specifier10104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_specifier10115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruletype_specifier10153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruletype_specifier10172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruletype_specifier10191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruletype_specifier10210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruletype_specifier10229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruletype_specifier10248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruletype_specifier10267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruletype_specifier10286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype10327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype10338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_ruletype10386 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rulename_in_ruletype10419 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruletype10439 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruletype10452 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleliteral_expression_in_entryRuleliteral_expression10495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleliteral_expression10506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleliteral_expression10552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_LITERAL_in_ruleliteral_expression10579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_LITERAL_in_ruleliteral_expression10605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleliteral_expression10631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODIFIER_in_entryRuleMODIFIER10677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODIFIER10688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleMODIFIER10726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleMODIFIER10745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleMODIFIER10764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMODIFIER10783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleMODIFIER10802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleMODIFIER10821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMODIFIER10840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleMODIFIER10859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleMODIFIER10878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleMODIFIER10897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_synpred18_InternalSimpleJava1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_synpred19_InternalSimpleJava1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_synpred49_InternalSimpleJava2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred67_InternalSimpleJava2825 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred67_InternalSimpleJava2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred75_InternalSimpleJava3096 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred75_InternalSimpleJava3109 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred75_InternalSimpleJava3131 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred75_InternalSimpleJava3149 = new BitSet(new long[]{0x73C9EBB8902401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_rulestatement_in_synpred75_InternalSimpleJava3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_synpred79_InternalSimpleJava3324 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred79_InternalSimpleJava3342 = new BitSet(new long[]{0x73C9EBB8902401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_rulestatement_in_synpred79_InternalSimpleJava3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred97_InternalSimpleJava4423 = new BitSet(new long[]{0x73C9EBB8902401F0L,0x0000FFFFF4000000L});
    public static final BitSet FOLLOW_rulestatement_in_synpred97_InternalSimpleJava4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_synpred99_InternalSimpleJava4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred100_InternalSimpleJava4998 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred100_InternalSimpleJava5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred103_InternalSimpleJava5281 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred103_InternalSimpleJava5286 = new BitSet(new long[]{0x0000000000000010L,0x000000FF00000000L});
    public static final BitSet FOLLOW_ruleparameter_in_synpred103_InternalSimpleJava5289 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred103_InternalSimpleJava5292 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_synpred103_InternalSimpleJava5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred104_InternalSimpleJava5401 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_synpred104_InternalSimpleJava5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred129_InternalSimpleJava6335 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred129_InternalSimpleJava6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred148_InternalSimpleJava7194 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred148_InternalSimpleJava7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred161_InternalSimpleJava7315 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_62_in_synpred161_InternalSimpleJava7340 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_63_in_synpred161_InternalSimpleJava7359 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_64_in_synpred161_InternalSimpleJava7378 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_65_in_synpred161_InternalSimpleJava7397 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_66_in_synpred161_InternalSimpleJava7416 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_67_in_synpred161_InternalSimpleJava7435 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_68_in_synpred161_InternalSimpleJava7454 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_69_in_synpred161_InternalSimpleJava7473 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred161_InternalSimpleJava7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred183_InternalSimpleJava6919 = new BitSet(new long[]{0x73800001800001F0L,0x000000FFFC000000L});
    public static final BitSet FOLLOW_rulearglist_in_synpred183_InternalSimpleJava6942 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred183_InternalSimpleJava6962 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_ruleaux_in_synpred183_InternalSimpleJava6991 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_58_in_synpred183_InternalSimpleJava7016 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7038 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_27_in_synpred183_InternalSimpleJava7064 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7086 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_59_in_synpred183_InternalSimpleJava7112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulename_in_synpred183_InternalSimpleJava7140 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred183_InternalSimpleJava7194 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7222 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_60_in_synpred183_InternalSimpleJava7248 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_61_in_synpred183_InternalSimpleJava7267 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_rulemais_aux_in_synpred183_InternalSimpleJava7315 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_62_in_synpred183_InternalSimpleJava7340 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_63_in_synpred183_InternalSimpleJava7359 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_64_in_synpred183_InternalSimpleJava7378 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_65_in_synpred183_InternalSimpleJava7397 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_66_in_synpred183_InternalSimpleJava7416 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_67_in_synpred183_InternalSimpleJava7435 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_68_in_synpred183_InternalSimpleJava7454 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_69_in_synpred183_InternalSimpleJava7473 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7496 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_70_in_synpred183_InternalSimpleJava7524 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_71_in_synpred183_InternalSimpleJava7543 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_72_in_synpred183_InternalSimpleJava7562 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_73_in_synpred183_InternalSimpleJava7581 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_74_in_synpred183_InternalSimpleJava7600 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_75_in_synpred183_InternalSimpleJava7619 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_70_in_synpred183_InternalSimpleJava7639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_synpred183_InternalSimpleJava7652 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_76_in_synpred183_InternalSimpleJava7672 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_68_in_synpred183_InternalSimpleJava7700 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_69_in_synpred183_InternalSimpleJava7720 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7743 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_77_in_synpred183_InternalSimpleJava7769 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7791 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred183_InternalSimpleJava7809 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7831 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_78_in_synpred183_InternalSimpleJava7858 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_79_in_synpred183_InternalSimpleJava7877 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_80_in_synpred183_InternalSimpleJava7896 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_81_in_synpred183_InternalSimpleJava7915 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_82_in_synpred183_InternalSimpleJava7934 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_83_in_synpred183_InternalSimpleJava7953 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava7976 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_84_in_synpred183_InternalSimpleJava8003 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_85_in_synpred183_InternalSimpleJava8022 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_86_in_synpred183_InternalSimpleJava8041 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_87_in_synpred183_InternalSimpleJava8060 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred183_InternalSimpleJava8083 = new BitSet(new long[]{0xFC00000288000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_ruleexpression_aux_in_synpred183_InternalSimpleJava8113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred186_InternalSimpleJava8422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_in_synpred189_InternalSimpleJava8562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred192_InternalSimpleJava8799 = new BitSet(new long[]{0x73800001800001F0L,0x000000FFFC000000L});
    public static final BitSet FOLLOW_rulearglist_in_synpred192_InternalSimpleJava8823 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred192_InternalSimpleJava8843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred193_InternalSimpleJava8864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred196_InternalSimpleJava9149 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_synpred196_InternalSimpleJava9168 = new BitSet(new long[]{0x73800000800001F0L,0x00000000F4000000L});
    public static final BitSet FOLLOW_ruleexpression_in_synpred196_InternalSimpleJava9190 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_58_in_synpred203_InternalSimpleJava10015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_synpred203_InternalSimpleJava10030 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_synpred203_InternalSimpleJava10057 = new BitSet(new long[]{0x0000000000000002L});

}