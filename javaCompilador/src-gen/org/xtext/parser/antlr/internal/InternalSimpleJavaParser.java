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

@SuppressWarnings("all")
public class InternalSimpleJavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_IDENTIFIER", "RULE_MODIFIER", "RULE_INTEGER_LITERAL", "RULE_FLOAT_LITERAL", "RULE_STRING", "RULE_CHARACTER", "RULE_DECIMAL_DIGITS", "RULE_EXPONENT_PART", "RULE_FLOAT_TYPE_SUFFIX", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "'.'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'['", "']'", "','", "'/**'", "'... text ...'", "'*/'", "';'", "'static'", "'('", "')'", "'{'", "'}'", "'if'", "'else'", "'do'", "'while'", "'for'", "'try'", "'catch'", "'finally'", "'switch'", "'case'", "':'", "'default'", "'synchronized'", "'return'", "'throw'", "'break'", "'continue'", "'='", "'null'", "'super'", "'this'", "'instanceof'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_CHARACTER=10;
    public static final int RULE_INTEGER_LITERAL=7;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int RULE_EXPONENT_PART=12;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=14;
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
    public static final int RULE_SL_COMMENT=16;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_FLOAT_TYPE_SUFFIX=13;
    public static final int RULE_DECIMAL_DIGITS=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_MODIFIER=6;
    public static final int RULE_WS=17;
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:76:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:79:28: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:82:3: lv_greetings_0_0= ruleGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel130);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_0_0, 
            	            		"Greeting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleGreeting"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:106:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:107:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:108:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting166);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:115:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:118:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:119:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleGreeting213); 

                	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:124:1: (lv_name_1_0= RULE_ID )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGreetingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleGreeting247); 

                	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRulepackage_name"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:153:1: entryRulepackage_name returns [String current=null] : iv_rulepackage_name= rulepackage_name EOF ;
    public final String entryRulepackage_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepackage_name = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:154:2: (iv_rulepackage_name= rulepackage_name EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:155:2: iv_rulepackage_name= rulepackage_name EOF
            {
             newCompositeNode(grammarAccess.getPackage_nameRule()); 
            pushFollow(FOLLOW_rulepackage_name_in_entryRulepackage_name284);
            iv_rulepackage_name=rulepackage_name();

            state._fsp--;

             current =iv_rulepackage_name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepackage_name295); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepackage_name"


    // $ANTLR start "rulepackage_name"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:162:1: rulepackage_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_package_name_aux_1= rulepackage_name_aux ) ;
    public final AntlrDatatypeRuleToken rulepackage_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_package_name_aux_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:165:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_package_name_aux_1= rulepackage_name_aux ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:166:1: (this_IDENTIFIER_0= RULE_IDENTIFIER this_package_name_aux_1= rulepackage_name_aux )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:166:1: (this_IDENTIFIER_0= RULE_IDENTIFIER this_package_name_aux_1= rulepackage_name_aux )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:166:6: this_IDENTIFIER_0= RULE_IDENTIFIER this_package_name_aux_1= rulepackage_name_aux
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulepackage_name335); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getPackage_nameAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getPackage_nameAccess().getPackage_name_auxParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulepackage_name_aux_in_rulepackage_name362);
            this_package_name_aux_1=rulepackage_name_aux();

            state._fsp--;


            		current.merge(this_package_name_aux_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepackage_name"


    // $ANTLR start "entryRulepackage_name_aux"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:192:1: entryRulepackage_name_aux returns [String current=null] : iv_rulepackage_name_aux= rulepackage_name_aux EOF ;
    public final String entryRulepackage_name_aux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepackage_name_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:193:2: (iv_rulepackage_name_aux= rulepackage_name_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:194:2: iv_rulepackage_name_aux= rulepackage_name_aux EOF
            {
             newCompositeNode(grammarAccess.getPackage_name_auxRule()); 
            pushFollow(FOLLOW_rulepackage_name_aux_in_entryRulepackage_name_aux408);
            iv_rulepackage_name_aux=rulepackage_name_aux();

            state._fsp--;

             current =iv_rulepackage_name_aux.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepackage_name_aux419); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:201:1: rulepackage_name_aux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER this_package_name_aux_2= rulepackage_name_aux )? ;
    public final AntlrDatatypeRuleToken rulepackage_name_aux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_package_name_aux_2 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:204:28: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER this_package_name_aux_2= rulepackage_name_aux )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:205:1: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER this_package_name_aux_2= rulepackage_name_aux )?
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:205:1: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER this_package_name_aux_2= rulepackage_name_aux )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_IDENTIFIER) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==EOF) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==EOF) ) {
                            alt2=1;
                        }
                    }
                    else if ( (LA2_3==21) ) {
                        alt2=1;
                    }
                }
            }
            switch (alt2) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:206:2: kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER this_package_name_aux_2= rulepackage_name_aux
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_rulepackage_name_aux457); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0()); 
                        
                    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulepackage_name_aux472); 

                    		current.merge(this_IDENTIFIER_1);
                        
                     
                        newLeafNode(this_IDENTIFIER_1, grammarAccess.getPackage_name_auxAccess().getIDENTIFIERTerminalRuleCall_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getPackage_name_auxAccess().getPackage_name_auxParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulepackage_name_aux_in_rulepackage_name_aux499);
                    this_package_name_aux_2=rulepackage_name_aux();

                    state._fsp--;


                    		current.merge(this_package_name_aux_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleclass_interface_name"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:237:1: entryRuleclass_interface_name returns [String current=null] : iv_ruleclass_interface_name= ruleclass_interface_name EOF ;
    public final String entryRuleclass_interface_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleclass_interface_name = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:238:2: (iv_ruleclass_interface_name= ruleclass_interface_name EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:239:2: iv_ruleclass_interface_name= ruleclass_interface_name EOF
            {
             newCompositeNode(grammarAccess.getClass_interface_nameRule()); 
            pushFollow(FOLLOW_ruleclass_interface_name_in_entryRuleclass_interface_name546);
            iv_ruleclass_interface_name=ruleclass_interface_name();

            state._fsp--;

             current =iv_ruleclass_interface_name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclass_interface_name557); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleclass_interface_name"


    // $ANTLR start "ruleclass_interface_name"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:246:1: ruleclass_interface_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER | (this_package_name_1= rulepackage_name kw= '.' this_IDENTIFIER_3= RULE_IDENTIFIER ) ) ;
    public final AntlrDatatypeRuleToken ruleclass_interface_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_3=null;
        AntlrDatatypeRuleToken this_package_name_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:249:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER | (this_package_name_1= rulepackage_name kw= '.' this_IDENTIFIER_3= RULE_IDENTIFIER ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:250:1: (this_IDENTIFIER_0= RULE_IDENTIFIER | (this_package_name_1= rulepackage_name kw= '.' this_IDENTIFIER_3= RULE_IDENTIFIER ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:250:1: (this_IDENTIFIER_0= RULE_IDENTIFIER | (this_package_name_1= rulepackage_name kw= '.' this_IDENTIFIER_3= RULE_IDENTIFIER ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_IDENTIFIER) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_IDENTIFIER||(LA3_1>=30 && LA3_1<=32)||LA3_1==36||(LA3_1>=38 && LA3_1<=39)||LA3_1==41||LA3_1==52) ) {
                    alt3=1;
                }
                else if ( (LA3_1==21) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:250:6: this_IDENTIFIER_0= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleclass_interface_name597); 

                    		current.merge(this_IDENTIFIER_0);
                        
                     
                        newLeafNode(this_IDENTIFIER_0, grammarAccess.getClass_interface_nameAccess().getIDENTIFIERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:258:6: (this_package_name_1= rulepackage_name kw= '.' this_IDENTIFIER_3= RULE_IDENTIFIER )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:258:6: (this_package_name_1= rulepackage_name kw= '.' this_IDENTIFIER_3= RULE_IDENTIFIER )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:259:5: this_package_name_1= rulepackage_name kw= '.' this_IDENTIFIER_3= RULE_IDENTIFIER
                    {
                     
                            newCompositeNode(grammarAccess.getClass_interface_nameAccess().getPackage_nameParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_rulepackage_name_in_ruleclass_interface_name631);
                    this_package_name_1=rulepackage_name();

                    state._fsp--;


                    		current.merge(this_package_name_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleclass_interface_name649); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClass_interface_nameAccess().getFullStopKeyword_1_1()); 
                        
                    this_IDENTIFIER_3=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleclass_interface_name664); 

                    		current.merge(this_IDENTIFIER_3);
                        
                     
                        newLeafNode(this_IDENTIFIER_3, grammarAccess.getClass_interface_nameAccess().getIDENTIFIERTerminalRuleCall_1_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleclass_interface_name"


    // $ANTLR start "entryRuletype_specifier"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:294:1: entryRuletype_specifier returns [String current=null] : iv_ruletype_specifier= ruletype_specifier EOF ;
    public final String entryRuletype_specifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_specifier = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:295:2: (iv_ruletype_specifier= ruletype_specifier EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:296:2: iv_ruletype_specifier= ruletype_specifier EOF
            {
             newCompositeNode(grammarAccess.getType_specifierRule()); 
            pushFollow(FOLLOW_ruletype_specifier_in_entryRuletype_specifier715);
            iv_ruletype_specifier=ruletype_specifier();

            state._fsp--;

             current =iv_ruletype_specifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_specifier726); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:303:1: ruletype_specifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_class_interface_name_8= ruleclass_interface_name ) ;
    public final AntlrDatatypeRuleToken ruletype_specifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_class_interface_name_8 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:306:28: ( (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_class_interface_name_8= ruleclass_interface_name ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:307:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_class_interface_name_8= ruleclass_interface_name )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:307:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_class_interface_name_8= ruleclass_interface_name )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 26:
                {
                alt4=5;
                }
                break;
            case 27:
                {
                alt4=6;
                }
                break;
            case 28:
                {
                alt4=7;
                }
                break;
            case 29:
                {
                alt4=8;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:308:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruletype_specifier764); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:315:2: kw= 'byte'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruletype_specifier783); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:322:2: kw= 'char'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruletype_specifier802); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:329:2: kw= 'short'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruletype_specifier821); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:336:2: kw= 'int'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruletype_specifier840); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:343:2: kw= 'float'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruletype_specifier859); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:350:2: kw= 'long'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruletype_specifier878); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:357:2: kw= 'double'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruletype_specifier897); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:364:5: this_class_interface_name_8= ruleclass_interface_name
                    {
                     
                            newCompositeNode(grammarAccess.getType_specifierAccess().getClass_interface_nameParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleclass_interface_name_in_ruletype_specifier925);
                    this_class_interface_name_8=ruleclass_interface_name();

                    state._fsp--;


                    		current.merge(this_class_interface_name_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:382:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:383:2: (iv_ruletype= ruletype EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:384:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype971);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype982); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:391:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_type_specifier_0= ruletype_specifier (kw= '[' kw= ']' )? ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_specifier_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:394:28: ( (this_type_specifier_0= ruletype_specifier (kw= '[' kw= ']' )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:395:1: (this_type_specifier_0= ruletype_specifier (kw= '[' kw= ']' )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:395:1: (this_type_specifier_0= ruletype_specifier (kw= '[' kw= ']' )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:396:5: this_type_specifier_0= ruletype_specifier (kw= '[' kw= ']' )?
            {
             
                    newCompositeNode(grammarAccess.getTypeAccess().getType_specifierParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruletype_specifier_in_ruletype1029);
            this_type_specifier_0=ruletype_specifier();

            state._fsp--;


            		current.merge(this_type_specifier_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:406:1: (kw= '[' kw= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:407:2: kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruletype1048); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0()); 
                        
                    kw=(Token)match(input,31,FOLLOW_31_in_ruletype1061); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleparameter"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:426:1: entryRuleparameter returns [String current=null] : iv_ruleparameter= ruleparameter EOF ;
    public final String entryRuleparameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparameter = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:427:2: (iv_ruleparameter= ruleparameter EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:428:2: iv_ruleparameter= ruleparameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleparameter_in_entryRuleparameter1104);
            iv_ruleparameter=ruleparameter();

            state._fsp--;

             current =iv_ruleparameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter1115); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:435:1: ruleparameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_type_0= ruletype this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '[' kw= ']' )? ) ;
    public final AntlrDatatypeRuleToken ruleparameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_type_0 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:438:28: ( (this_type_0= ruletype this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '[' kw= ']' )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:439:1: (this_type_0= ruletype this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '[' kw= ']' )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:439:1: (this_type_0= ruletype this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '[' kw= ']' )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:440:5: this_type_0= ruletype this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '[' kw= ']' )?
            {
             
                    newCompositeNode(grammarAccess.getParameterAccess().getTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruletype_in_ruleparameter1162);
            this_type_0=ruletype();

            state._fsp--;


            		current.merge(this_type_0);
                
             
                    afterParserOrEnumRuleCall();
                
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleparameter1182); 

            		current.merge(this_IDENTIFIER_1);
                
             
                newLeafNode(this_IDENTIFIER_1, grammarAccess.getParameterAccess().getIDENTIFIERTerminalRuleCall_1()); 
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:457:1: (kw= '[' kw= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:458:2: kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleparameter1201); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_0()); 
                        
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleparameter1214); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:477:1: entryRuleparameter_list returns [String current=null] : iv_ruleparameter_list= ruleparameter_list EOF ;
    public final String entryRuleparameter_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparameter_list = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:478:2: (iv_ruleparameter_list= ruleparameter_list EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:479:2: iv_ruleparameter_list= ruleparameter_list EOF
            {
             newCompositeNode(grammarAccess.getParameter_listRule()); 
            pushFollow(FOLLOW_ruleparameter_list_in_entryRuleparameter_list1257);
            iv_ruleparameter_list=ruleparameter_list();

            state._fsp--;

             current =iv_ruleparameter_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_list1268); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:486:1: ruleparameter_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_parameter_0= ruleparameter (kw= ',' this_parameter_2= ruleparameter )? ) ;
    public final AntlrDatatypeRuleToken ruleparameter_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_parameter_0 = null;

        AntlrDatatypeRuleToken this_parameter_2 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:489:28: ( (this_parameter_0= ruleparameter (kw= ',' this_parameter_2= ruleparameter )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:490:1: (this_parameter_0= ruleparameter (kw= ',' this_parameter_2= ruleparameter )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:490:1: (this_parameter_0= ruleparameter (kw= ',' this_parameter_2= ruleparameter )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:491:5: this_parameter_0= ruleparameter (kw= ',' this_parameter_2= ruleparameter )?
            {
             
                    newCompositeNode(grammarAccess.getParameter_listAccess().getParameterParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleparameter_in_ruleparameter_list1315);
            this_parameter_0=ruleparameter();

            state._fsp--;


            		current.merge(this_parameter_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:501:1: (kw= ',' this_parameter_2= ruleparameter )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:502:2: kw= ',' this_parameter_2= ruleparameter
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleparameter_list1334); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getParameter_listAccess().getParameterParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleparameter_in_ruleparameter_list1356);
                    this_parameter_2=ruleparameter();

                    state._fsp--;


                    		current.merge(this_parameter_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuledoc_comment"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:526:1: entryRuledoc_comment returns [String current=null] : iv_ruledoc_comment= ruledoc_comment EOF ;
    public final String entryRuledoc_comment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledoc_comment = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:527:2: (iv_ruledoc_comment= ruledoc_comment EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:528:2: iv_ruledoc_comment= ruledoc_comment EOF
            {
             newCompositeNode(grammarAccess.getDoc_commentRule()); 
            pushFollow(FOLLOW_ruledoc_comment_in_entryRuledoc_comment1404);
            iv_ruledoc_comment=ruledoc_comment();

            state._fsp--;

             current =iv_ruledoc_comment.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledoc_comment1415); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:535:1: ruledoc_comment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/**' kw= '... text ...' kw= '*/' ) ;
    public final AntlrDatatypeRuleToken ruledoc_comment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:538:28: ( (kw= '/**' kw= '... text ...' kw= '*/' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:539:1: (kw= '/**' kw= '... text ...' kw= '*/' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:539:1: (kw= '/**' kw= '... text ...' kw= '*/' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:540:2: kw= '/**' kw= '... text ...' kw= '*/'
            {
            kw=(Token)match(input,33,FOLLOW_33_in_ruledoc_comment1453); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDoc_commentAccess().getSolidusAsteriskAsteriskKeyword_0()); 
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruledoc_comment1466); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDoc_commentAccess().getTextKeyword_1()); 
                
            kw=(Token)match(input,35,FOLLOW_35_in_ruledoc_comment1479); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDoc_commentAccess().getAsteriskSolidusKeyword_2()); 
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulefield_declaration"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:567:1: entryRulefield_declaration returns [String current=null] : iv_rulefield_declaration= rulefield_declaration EOF ;
    public final String entryRulefield_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefield_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:568:2: (iv_rulefield_declaration= rulefield_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:569:2: iv_rulefield_declaration= rulefield_declaration EOF
            {
             newCompositeNode(grammarAccess.getField_declarationRule()); 
            pushFollow(FOLLOW_rulefield_declaration_in_entryRulefield_declaration1522);
            iv_rulefield_declaration=rulefield_declaration();

            state._fsp--;

             current =iv_rulefield_declaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_declaration1533); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:576:1: rulefield_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_doc_comment_0= ruledoc_comment )? (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration ) ) | this_static_initializer_4= rulestatic_initializer | kw= ';' ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:579:28: ( ( ( (this_doc_comment_0= ruledoc_comment )? (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration ) ) | this_static_initializer_4= rulestatic_initializer | kw= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:580:1: ( ( (this_doc_comment_0= ruledoc_comment )? (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration ) ) | this_static_initializer_4= rulestatic_initializer | kw= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:580:1: ( ( (this_doc_comment_0= ruledoc_comment )? (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration ) ) | this_static_initializer_4= rulestatic_initializer | kw= ';' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_IDENTIFIER:
            case RULE_MODIFIER:
            case 30:
            case 33:
            case 38:
            case 59:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:580:2: ( (this_doc_comment_0= ruledoc_comment )? (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration ) )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:580:2: ( (this_doc_comment_0= ruledoc_comment )? (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration ) )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:580:3: (this_doc_comment_0= ruledoc_comment )? (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:580:3: (this_doc_comment_0= ruledoc_comment )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==33) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:581:5: this_doc_comment_0= ruledoc_comment
                            {
                             
                                    newCompositeNode(grammarAccess.getField_declarationAccess().getDoc_commentParserRuleCall_0_0()); 
                                
                            pushFollow(FOLLOW_ruledoc_comment_in_rulefield_declaration1582);
                            this_doc_comment_0=ruledoc_comment();

                            state._fsp--;


                            		current.merge(this_doc_comment_0);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:591:3: (this_method_declaration_1= rulemethod_declaration | this_constructor_declaration_2= ruleconstructor_declaration | this_variable_declaration_3= rulevariable_declaration )
                    int alt9=3;
                    switch ( input.LA(1) ) {
                    case 38:
                        {
                        alt9=1;
                        }
                        break;
                    case EOF:
                    case RULE_IDENTIFIER:
                    case RULE_MODIFIER:
                        {
                        alt9=2;
                        }
                        break;
                    case 30:
                    case 59:
                        {
                        alt9=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:592:5: this_method_declaration_1= rulemethod_declaration
                            {
                             
                                    newCompositeNode(grammarAccess.getField_declarationAccess().getMethod_declarationParserRuleCall_0_1_0()); 
                                
                            pushFollow(FOLLOW_rulemethod_declaration_in_rulefield_declaration1612);
                            this_method_declaration_1=rulemethod_declaration();

                            state._fsp--;


                            		current.merge(this_method_declaration_1);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:604:5: this_constructor_declaration_2= ruleconstructor_declaration
                            {
                             
                                    newCompositeNode(grammarAccess.getField_declarationAccess().getConstructor_declarationParserRuleCall_0_1_1()); 
                                
                            pushFollow(FOLLOW_ruleconstructor_declaration_in_rulefield_declaration1645);
                            this_constructor_declaration_2=ruleconstructor_declaration();

                            state._fsp--;


                            		current.merge(this_constructor_declaration_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 3 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:616:5: this_variable_declaration_3= rulevariable_declaration
                            {
                             
                                    newCompositeNode(grammarAccess.getField_declarationAccess().getVariable_declarationParserRuleCall_0_1_2()); 
                                
                            pushFollow(FOLLOW_rulevariable_declaration_in_rulefield_declaration1678);
                            this_variable_declaration_3=rulevariable_declaration();

                            state._fsp--;


                            		current.merge(this_variable_declaration_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:628:5: this_static_initializer_4= rulestatic_initializer
                    {
                     
                            newCompositeNode(grammarAccess.getField_declarationAccess().getStatic_initializerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulestatic_initializer_in_rulefield_declaration1713);
                    this_static_initializer_4=rulestatic_initializer();

                    state._fsp--;


                    		current.merge(this_static_initializer_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:640:2: kw= ';'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_rulefield_declaration1737); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getField_declarationAccess().getSemicolonKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulestatic_initializer"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:653:1: entryRulestatic_initializer returns [String current=null] : iv_rulestatic_initializer= rulestatic_initializer EOF ;
    public final String entryRulestatic_initializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatic_initializer = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:654:2: (iv_rulestatic_initializer= rulestatic_initializer EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:655:2: iv_rulestatic_initializer= rulestatic_initializer EOF
            {
             newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            pushFollow(FOLLOW_rulestatic_initializer_in_entryRulestatic_initializer1778);
            iv_rulestatic_initializer=rulestatic_initializer();

            state._fsp--;

             current =iv_rulestatic_initializer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatic_initializer1789); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:662:1: rulestatic_initializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'static' this_statement_block_1= rulestatement_block ) ;
    public final AntlrDatatypeRuleToken rulestatic_initializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_block_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:665:28: ( (kw= 'static' this_statement_block_1= rulestatement_block ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:666:1: (kw= 'static' this_statement_block_1= rulestatement_block )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:666:1: (kw= 'static' this_statement_block_1= rulestatement_block )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:667:2: kw= 'static' this_statement_block_1= rulestatement_block
            {
            kw=(Token)match(input,37,FOLLOW_37_in_rulestatic_initializer1827); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatic_initializerAccess().getStaticKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getStatic_initializerAccess().getStatement_blockParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_block_in_rulestatic_initializer1849);
            this_statement_block_1=rulestatement_block();

            state._fsp--;


            		current.merge(this_statement_block_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulemodifier_aux"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:691:1: entryRulemodifier_aux returns [String current=null] : iv_rulemodifier_aux= rulemodifier_aux EOF ;
    public final String entryRulemodifier_aux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemodifier_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:692:2: (iv_rulemodifier_aux= rulemodifier_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:693:2: iv_rulemodifier_aux= rulemodifier_aux EOF
            {
             newCompositeNode(grammarAccess.getModifier_auxRule()); 
            pushFollow(FOLLOW_rulemodifier_aux_in_entryRulemodifier_aux1895);
            iv_rulemodifier_aux=rulemodifier_aux();

            state._fsp--;

             current =iv_rulemodifier_aux.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemodifier_aux1906); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemodifier_aux"


    // $ANTLR start "rulemodifier_aux"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:700:1: rulemodifier_aux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MODIFIER_0= RULE_MODIFIER )? ;
    public final AntlrDatatypeRuleToken rulemodifier_aux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MODIFIER_0=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:703:28: ( (this_MODIFIER_0= RULE_MODIFIER )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:704:1: (this_MODIFIER_0= RULE_MODIFIER )?
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:704:1: (this_MODIFIER_0= RULE_MODIFIER )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_MODIFIER) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:704:6: this_MODIFIER_0= RULE_MODIFIER
                    {
                    this_MODIFIER_0=(Token)match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_rulemodifier_aux1946); 

                    		current.merge(this_MODIFIER_0);
                        
                     
                        newLeafNode(this_MODIFIER_0, grammarAccess.getModifier_auxAccess().getMODIFIERTerminalRuleCall()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemodifier_aux"


    // $ANTLR start "entryRuleconstructor_declaration"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:719:1: entryRuleconstructor_declaration returns [String current=null] : iv_ruleconstructor_declaration= ruleconstructor_declaration EOF ;
    public final String entryRuleconstructor_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstructor_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:720:2: (iv_ruleconstructor_declaration= ruleconstructor_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:721:2: iv_ruleconstructor_declaration= ruleconstructor_declaration EOF
            {
             newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            pushFollow(FOLLOW_ruleconstructor_declaration_in_entryRuleconstructor_declaration1993);
            iv_ruleconstructor_declaration=ruleconstructor_declaration();

            state._fsp--;

             current =iv_ruleconstructor_declaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstructor_declaration2004); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:728:1: ruleconstructor_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_modifier_aux_0= rulemodifier_aux this_IDENTIFIER_1= RULE_IDENTIFIER kw= '(' (this_parameter_list_3= ruleparameter_list )? kw= ')' this_statement_block_5= rulestatement_block ) ;
    public final AntlrDatatypeRuleToken ruleconstructor_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_modifier_aux_0 = null;

        AntlrDatatypeRuleToken this_parameter_list_3 = null;

        AntlrDatatypeRuleToken this_statement_block_5 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:731:28: ( (this_modifier_aux_0= rulemodifier_aux this_IDENTIFIER_1= RULE_IDENTIFIER kw= '(' (this_parameter_list_3= ruleparameter_list )? kw= ')' this_statement_block_5= rulestatement_block ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:732:1: (this_modifier_aux_0= rulemodifier_aux this_IDENTIFIER_1= RULE_IDENTIFIER kw= '(' (this_parameter_list_3= ruleparameter_list )? kw= ')' this_statement_block_5= rulestatement_block )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:732:1: (this_modifier_aux_0= rulemodifier_aux this_IDENTIFIER_1= RULE_IDENTIFIER kw= '(' (this_parameter_list_3= ruleparameter_list )? kw= ')' this_statement_block_5= rulestatement_block )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:733:5: this_modifier_aux_0= rulemodifier_aux this_IDENTIFIER_1= RULE_IDENTIFIER kw= '(' (this_parameter_list_3= ruleparameter_list )? kw= ')' this_statement_block_5= rulestatement_block
            {
             
                    newCompositeNode(grammarAccess.getConstructor_declarationAccess().getModifier_auxParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulemodifier_aux_in_ruleconstructor_declaration2051);
            this_modifier_aux_0=rulemodifier_aux();

            state._fsp--;


            		current.merge(this_modifier_aux_0);
                
             
                    afterParserOrEnumRuleCall();
                
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstructor_declaration2071); 

            		current.merge(this_IDENTIFIER_1);
                
             
                newLeafNode(this_IDENTIFIER_1, grammarAccess.getConstructor_declarationAccess().getIDENTIFIERTerminalRuleCall_1()); 
                
            kw=(Token)match(input,38,FOLLOW_38_in_ruleconstructor_declaration2089); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2()); 
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:756:1: (this_parameter_list_3= ruleparameter_list )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_IDENTIFIER||(LA12_0>=22 && LA12_0<=29)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:757:5: this_parameter_list_3= ruleparameter_list
                    {
                     
                            newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParameter_listParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleparameter_list_in_ruleconstructor_declaration2112);
                    this_parameter_list_3=ruleparameter_list();

                    state._fsp--;


                    		current.merge(this_parameter_list_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,39,FOLLOW_39_in_ruleconstructor_declaration2132); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4()); 
                
             
                    newCompositeNode(grammarAccess.getConstructor_declarationAccess().getStatement_blockParserRuleCall_5()); 
                
            pushFollow(FOLLOW_rulestatement_block_in_ruleconstructor_declaration2154);
            this_statement_block_5=rulestatement_block();

            state._fsp--;


            		current.merge(this_statement_block_5);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulemethod_declaration"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:794:1: entryRulemethod_declaration returns [String current=null] : iv_rulemethod_declaration= rulemethod_declaration EOF ;
    public final String entryRulemethod_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemethod_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:795:2: (iv_rulemethod_declaration= rulemethod_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:796:2: iv_rulemethod_declaration= rulemethod_declaration EOF
            {
             newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            pushFollow(FOLLOW_rulemethod_declaration_in_entryRulemethod_declaration2202);
            iv_rulemethod_declaration=rulemethod_declaration();

            state._fsp--;

             current =iv_rulemethod_declaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemethod_declaration2213); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:803:1: rulemethod_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_parameter_list_1= ruleparameter_list )? kw= ')' (kw= '[' kw= ']' )? (this_statement_block_5= rulestatement_block | kw= ';' ) ) ;
    public final AntlrDatatypeRuleToken rulemethod_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_parameter_list_1 = null;

        AntlrDatatypeRuleToken this_statement_block_5 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:806:28: ( (kw= '(' (this_parameter_list_1= ruleparameter_list )? kw= ')' (kw= '[' kw= ']' )? (this_statement_block_5= rulestatement_block | kw= ';' ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:807:1: (kw= '(' (this_parameter_list_1= ruleparameter_list )? kw= ')' (kw= '[' kw= ']' )? (this_statement_block_5= rulestatement_block | kw= ';' ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:807:1: (kw= '(' (this_parameter_list_1= ruleparameter_list )? kw= ')' (kw= '[' kw= ']' )? (this_statement_block_5= rulestatement_block | kw= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:808:2: kw= '(' (this_parameter_list_1= ruleparameter_list )? kw= ')' (kw= '[' kw= ']' )? (this_statement_block_5= rulestatement_block | kw= ';' )
            {
            kw=(Token)match(input,38,FOLLOW_38_in_rulemethod_declaration2251); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_0()); 
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:813:1: (this_parameter_list_1= ruleparameter_list )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_IDENTIFIER||(LA13_0>=22 && LA13_0<=29)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:814:5: this_parameter_list_1= ruleparameter_list
                    {
                     
                            newCompositeNode(grammarAccess.getMethod_declarationAccess().getParameter_listParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleparameter_list_in_rulemethod_declaration2274);
                    this_parameter_list_1=ruleparameter_list();

                    state._fsp--;


                    		current.merge(this_parameter_list_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,39,FOLLOW_39_in_rulemethod_declaration2294); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_2()); 
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:830:1: (kw= '[' kw= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:831:2: kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_rulemethod_declaration2308); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketKeyword_3_0()); 
                        
                    kw=(Token)match(input,31,FOLLOW_31_in_rulemethod_declaration2321); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMethod_declarationAccess().getRightSquareBracketKeyword_3_1()); 
                        

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:842:3: (this_statement_block_5= rulestatement_block | kw= ';' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            else if ( (LA15_0==36) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:843:5: this_statement_block_5= rulestatement_block
                    {
                     
                            newCompositeNode(grammarAccess.getMethod_declarationAccess().getStatement_blockParserRuleCall_4_0()); 
                        
                    pushFollow(FOLLOW_rulestatement_block_in_rulemethod_declaration2346);
                    this_statement_block_5=rulestatement_block();

                    state._fsp--;


                    		current.merge(this_statement_block_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:855:2: kw= ';'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_rulemethod_declaration2370); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMethod_declarationAccess().getSemicolonKeyword_4_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulestatement_block"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:868:1: entryRulestatement_block returns [String current=null] : iv_rulestatement_block= rulestatement_block EOF ;
    public final String entryRulestatement_block() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_block = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:869:2: (iv_rulestatement_block= rulestatement_block EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:870:2: iv_rulestatement_block= rulestatement_block EOF
            {
             newCompositeNode(grammarAccess.getStatement_blockRule()); 
            pushFollow(FOLLOW_rulestatement_block_in_entryRulestatement_block2412);
            iv_rulestatement_block=rulestatement_block();

            state._fsp--;

             current =iv_rulestatement_block.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_block2423); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:877:1: rulestatement_block returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (this_statement_1= rulestatement )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulestatement_block() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_1 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:880:28: ( (kw= '{' (this_statement_1= rulestatement )? kw= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:881:1: (kw= '{' (this_statement_1= rulestatement )? kw= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:881:1: (kw= '{' (this_statement_1= rulestatement )? kw= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:882:2: kw= '{' (this_statement_1= rulestatement )? kw= '}'
            {
            kw=(Token)match(input,40,FOLLOW_40_in_rulestatement_block2461); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_0()); 
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:887:1: (this_statement_1= rulestatement )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_IDENTIFIER||(LA16_0>=RULE_INTEGER_LITERAL && LA16_0<=RULE_CHARACTER)||LA16_0==21||LA16_0==30||LA16_0==32||LA16_0==36||LA16_0==38||LA16_0==40||LA16_0==42||(LA16_0>=44 && LA16_0<=47)||LA16_0==50||(LA16_0>=54 && LA16_0<=63)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:888:5: this_statement_1= rulestatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatement_blockAccess().getStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulestatement_in_rulestatement_block2484);
                    this_statement_1=rulestatement();

                    state._fsp--;


                    		current.merge(this_statement_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,41,FOLLOW_41_in_rulestatement_block2504); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_2()); 
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleif_statement"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:912:1: entryRuleif_statement returns [String current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final String entryRuleif_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleif_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:913:2: (iv_ruleif_statement= ruleif_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:914:2: iv_ruleif_statement= ruleif_statement EOF
            {
             newCompositeNode(grammarAccess.getIf_statementRule()); 
            pushFollow(FOLLOW_ruleif_statement_in_entryRuleif_statement2545);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;

             current =iv_ruleif_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_statement2556); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:921:1: ruleif_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement (kw= 'else' this_statement_6= rulestatement )? ) ;
    public final AntlrDatatypeRuleToken ruleif_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_statement_4 = null;

        AntlrDatatypeRuleToken this_statement_6 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:924:28: ( (kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement (kw= 'else' this_statement_6= rulestatement )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:925:1: (kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement (kw= 'else' this_statement_6= rulestatement )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:925:1: (kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement (kw= 'else' this_statement_6= rulestatement )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:926:2: kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement (kw= 'else' this_statement_6= rulestatement )?
            {
            kw=(Token)match(input,42,FOLLOW_42_in_ruleif_statement2594); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIf_statementAccess().getIfKeyword_0()); 
                
            kw=(Token)match(input,38,FOLLOW_38_in_ruleif_statement2607); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIf_statementAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruleif_statement2629);
            this_expression_2=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,39,FOLLOW_39_in_ruleif_statement2647); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIf_statementAccess().getRightParenthesisKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_4()); 
                
            pushFollow(FOLLOW_rulestatement_in_ruleif_statement2669);
            this_statement_4=rulestatement();

            state._fsp--;


            		current.merge(this_statement_4);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:965:1: (kw= 'else' this_statement_6= rulestatement )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:966:2: kw= 'else' this_statement_6= rulestatement
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleif_statement2688); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIf_statementAccess().getElseKeyword_5_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_5_1()); 
                        
                    pushFollow(FOLLOW_rulestatement_in_ruleif_statement2710);
                    this_statement_6=rulestatement();

                    state._fsp--;


                    		current.merge(this_statement_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:990:1: entryRuledo_statement returns [String current=null] : iv_ruledo_statement= ruledo_statement EOF ;
    public final String entryRuledo_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledo_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:991:2: (iv_ruledo_statement= ruledo_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:992:2: iv_ruledo_statement= ruledo_statement EOF
            {
             newCompositeNode(grammarAccess.getDo_statementRule()); 
            pushFollow(FOLLOW_ruledo_statement_in_entryRuledo_statement2758);
            iv_ruledo_statement=ruledo_statement();

            state._fsp--;

             current =iv_ruledo_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledo_statement2769); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:999:1: ruledo_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'do' this_statement_1= rulestatement kw= 'while' kw= '(' this_expression_4= ruleexpression kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruledo_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_1 = null;

        AntlrDatatypeRuleToken this_expression_4 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1002:28: ( (kw= 'do' this_statement_1= rulestatement kw= 'while' kw= '(' this_expression_4= ruleexpression kw= ')' kw= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1003:1: (kw= 'do' this_statement_1= rulestatement kw= 'while' kw= '(' this_expression_4= ruleexpression kw= ')' kw= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1003:1: (kw= 'do' this_statement_1= rulestatement kw= 'while' kw= '(' this_expression_4= ruleexpression kw= ')' kw= ';' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1004:2: kw= 'do' this_statement_1= rulestatement kw= 'while' kw= '(' this_expression_4= ruleexpression kw= ')' kw= ';'
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruledo_statement2807); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDo_statementAccess().getDoKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getDo_statementAccess().getStatementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_in_ruledo_statement2829);
            this_statement_1=rulestatement();

            state._fsp--;


            		current.merge(this_statement_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,45,FOLLOW_45_in_ruledo_statement2847); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDo_statementAccess().getWhileKeyword_2()); 
                
            kw=(Token)match(input,38,FOLLOW_38_in_ruledo_statement2860); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDo_statementAccess().getLeftParenthesisKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getDo_statementAccess().getExpressionParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruledo_statement2882);
            this_expression_4=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_4);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,39,FOLLOW_39_in_ruledo_statement2900); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDo_statementAccess().getRightParenthesisKeyword_5()); 
                
            kw=(Token)match(input,36,FOLLOW_36_in_ruledo_statement2913); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDo_statementAccess().getSemicolonKeyword_6()); 
                

            }


            }

             leaveRule(); 
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1063:1: entryRulewhile_statement returns [String current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final String entryRulewhile_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulewhile_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1064:2: (iv_rulewhile_statement= rulewhile_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1065:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
             newCompositeNode(grammarAccess.getWhile_statementRule()); 
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement2954);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;

             current =iv_rulewhile_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement2965); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1072:1: rulewhile_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulewhile_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_statement_4 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1075:28: ( (kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1076:1: (kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1076:1: (kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1077:2: kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement
            {
            kw=(Token)match(input,45,FOLLOW_45_in_rulewhile_statement3003); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getWhile_statementAccess().getWhileKeyword_0()); 
                
            kw=(Token)match(input,38,FOLLOW_38_in_rulewhile_statement3016); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getWhile_statementAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulewhile_statement3038);
            this_expression_2=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,39,FOLLOW_39_in_rulewhile_statement3056); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getWhile_statementAccess().getRightParenthesisKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementParserRuleCall_4()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulewhile_statement3078);
            this_statement_4=rulestatement();

            state._fsp--;


            		current.merge(this_statement_4);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1124:1: entryRulefor_statement returns [String current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final String entryRulefor_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefor_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1125:2: (iv_rulefor_statement= rulefor_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1126:2: iv_rulefor_statement= rulefor_statement EOF
            {
             newCompositeNode(grammarAccess.getFor_statementRule()); 
            pushFollow(FOLLOW_rulefor_statement_in_entryRulefor_statement3124);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;

             current =iv_rulefor_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_statement3135); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1133:1: rulefor_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'for' kw= '(' (this_variable_declaration_2= rulevariable_declaration | (this_expression_3= ruleexpression kw= ';' ) | kw= ';' ) (this_expression_6= ruleexpression )? kw= ';' (this_expression_8= ruleexpression )? kw= ';' kw= ')' this_statement_11= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulefor_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_variable_declaration_2 = null;

        AntlrDatatypeRuleToken this_expression_3 = null;

        AntlrDatatypeRuleToken this_expression_6 = null;

        AntlrDatatypeRuleToken this_expression_8 = null;

        AntlrDatatypeRuleToken this_statement_11 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1136:28: ( (kw= 'for' kw= '(' (this_variable_declaration_2= rulevariable_declaration | (this_expression_3= ruleexpression kw= ';' ) | kw= ';' ) (this_expression_6= ruleexpression )? kw= ';' (this_expression_8= ruleexpression )? kw= ';' kw= ')' this_statement_11= rulestatement ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1137:1: (kw= 'for' kw= '(' (this_variable_declaration_2= rulevariable_declaration | (this_expression_3= ruleexpression kw= ';' ) | kw= ';' ) (this_expression_6= ruleexpression )? kw= ';' (this_expression_8= ruleexpression )? kw= ';' kw= ')' this_statement_11= rulestatement )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1137:1: (kw= 'for' kw= '(' (this_variable_declaration_2= rulevariable_declaration | (this_expression_3= ruleexpression kw= ';' ) | kw= ';' ) (this_expression_6= ruleexpression )? kw= ';' (this_expression_8= ruleexpression )? kw= ';' kw= ')' this_statement_11= rulestatement )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1138:2: kw= 'for' kw= '(' (this_variable_declaration_2= rulevariable_declaration | (this_expression_3= ruleexpression kw= ';' ) | kw= ';' ) (this_expression_6= ruleexpression )? kw= ';' (this_expression_8= ruleexpression )? kw= ';' kw= ')' this_statement_11= rulestatement
            {
            kw=(Token)match(input,46,FOLLOW_46_in_rulefor_statement3173); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFor_statementAccess().getForKeyword_0()); 
                
            kw=(Token)match(input,38,FOLLOW_38_in_rulefor_statement3186); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFor_statementAccess().getLeftParenthesisKeyword_1()); 
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1149:1: (this_variable_declaration_2= rulevariable_declaration | (this_expression_3= ruleexpression kw= ';' ) | kw= ';' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==31) ) {
                    alt18=1;
                }
                else if ( (LA18_1==RULE_IDENTIFIER||(LA18_1>=RULE_INTEGER_LITERAL && LA18_1<=RULE_CHARACTER)||LA18_1==21||LA18_1==30||LA18_1==32||LA18_1==38||(LA18_1>=60 && LA18_1<=63)) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case 59:
                {
                alt18=1;
                }
                break;
            case RULE_IDENTIFIER:
            case RULE_INTEGER_LITERAL:
            case RULE_FLOAT_LITERAL:
            case RULE_STRING:
            case RULE_CHARACTER:
            case 21:
            case 32:
            case 38:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt18=2;
                }
                break;
            case 36:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1150:5: this_variable_declaration_2= rulevariable_declaration
                    {
                     
                            newCompositeNode(grammarAccess.getFor_statementAccess().getVariable_declarationParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_rulevariable_declaration_in_rulefor_statement3209);
                    this_variable_declaration_2=rulevariable_declaration();

                    state._fsp--;


                    		current.merge(this_variable_declaration_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1161:6: (this_expression_3= ruleexpression kw= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1161:6: (this_expression_3= ruleexpression kw= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1162:5: this_expression_3= ruleexpression kw= ';'
                    {
                     
                            newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionParserRuleCall_2_1_0()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement3243);
                    this_expression_3=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_rulefor_statement3261); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFor_statementAccess().getSemicolonKeyword_2_1_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1180:2: kw= ';'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_rulefor_statement3281); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFor_statementAccess().getSemicolonKeyword_2_2()); 
                        

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1185:2: (this_expression_6= ruleexpression )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_IDENTIFIER||(LA19_0>=RULE_INTEGER_LITERAL && LA19_0<=RULE_CHARACTER)||LA19_0==21||LA19_0==30||LA19_0==32||LA19_0==38||(LA19_0>=60 && LA19_0<=63)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1186:5: this_expression_6= ruleexpression
                    {
                     
                            newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement3305);
                    this_expression_6=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,36,FOLLOW_36_in_rulefor_statement3325); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFor_statementAccess().getSemicolonKeyword_4()); 
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1202:1: (this_expression_8= ruleexpression )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENTIFIER||(LA20_0>=RULE_INTEGER_LITERAL && LA20_0<=RULE_CHARACTER)||LA20_0==21||LA20_0==30||LA20_0==32||LA20_0==38||(LA20_0>=60 && LA20_0<=63)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1203:5: this_expression_8= ruleexpression
                    {
                     
                            newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulefor_statement3348);
                    this_expression_8=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,36,FOLLOW_36_in_rulefor_statement3368); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFor_statementAccess().getSemicolonKeyword_6()); 
                
            kw=(Token)match(input,39,FOLLOW_39_in_rulefor_statement3381); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFor_statementAccess().getRightParenthesisKeyword_7()); 
                
             
                    newCompositeNode(grammarAccess.getFor_statementAccess().getStatementParserRuleCall_8()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulefor_statement3403);
            this_statement_11=rulestatement();

            state._fsp--;


            		current.merge(this_statement_11);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1244:1: entryRuletry_statement returns [String current=null] : iv_ruletry_statement= ruletry_statement EOF ;
    public final String entryRuletry_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletry_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1245:2: (iv_ruletry_statement= ruletry_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1246:2: iv_ruletry_statement= ruletry_statement EOF
            {
             newCompositeNode(grammarAccess.getTry_statementRule()); 
            pushFollow(FOLLOW_ruletry_statement_in_entryRuletry_statement3449);
            iv_ruletry_statement=ruletry_statement();

            state._fsp--;

             current =iv_ruletry_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletry_statement3460); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1253:1: ruletry_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'try' this_statement_1= rulestatement (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_6= rulestatement )? (kw= 'finally' this_statement_8= rulestatement )? ) ;
    public final AntlrDatatypeRuleToken ruletry_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_1 = null;

        AntlrDatatypeRuleToken this_parameter_4 = null;

        AntlrDatatypeRuleToken this_statement_6 = null;

        AntlrDatatypeRuleToken this_statement_8 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1256:28: ( (kw= 'try' this_statement_1= rulestatement (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_6= rulestatement )? (kw= 'finally' this_statement_8= rulestatement )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1257:1: (kw= 'try' this_statement_1= rulestatement (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_6= rulestatement )? (kw= 'finally' this_statement_8= rulestatement )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1257:1: (kw= 'try' this_statement_1= rulestatement (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_6= rulestatement )? (kw= 'finally' this_statement_8= rulestatement )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1258:2: kw= 'try' this_statement_1= rulestatement (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_6= rulestatement )? (kw= 'finally' this_statement_8= rulestatement )?
            {
            kw=(Token)match(input,47,FOLLOW_47_in_ruletry_statement3498); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTry_statementAccess().getTryKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getTry_statementAccess().getStatementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_in_ruletry_statement3520);
            this_statement_1=rulestatement();

            state._fsp--;


            		current.merge(this_statement_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1274:1: (kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_6= rulestatement )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1275:2: kw= 'catch' kw= '(' this_parameter_4= ruleparameter kw= ')' this_statement_6= rulestatement
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruletry_statement3539); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTry_statementAccess().getCatchKeyword_2_0()); 
                        
                    kw=(Token)match(input,38,FOLLOW_38_in_ruletry_statement3552); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getTry_statementAccess().getParameterParserRuleCall_2_2()); 
                        
                    pushFollow(FOLLOW_ruleparameter_in_ruletry_statement3574);
                    this_parameter_4=ruleparameter();

                    state._fsp--;


                    		current.merge(this_parameter_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,39,FOLLOW_39_in_ruletry_statement3592); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_3()); 
                        
                     
                            newCompositeNode(grammarAccess.getTry_statementAccess().getStatementParserRuleCall_2_4()); 
                        
                    pushFollow(FOLLOW_rulestatement_in_ruletry_statement3614);
                    this_statement_6=rulestatement();

                    state._fsp--;


                    		current.merge(this_statement_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1314:3: (kw= 'finally' this_statement_8= rulestatement )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==49) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1315:2: kw= 'finally' this_statement_8= rulestatement
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruletry_statement3635); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getTry_statementAccess().getStatementParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_rulestatement_in_ruletry_statement3657);
                    this_statement_8=rulestatement();

                    state._fsp--;


                    		current.merge(this_statement_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1339:1: entryRuleswitch_statement returns [String current=null] : iv_ruleswitch_statement= ruleswitch_statement EOF ;
    public final String entryRuleswitch_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleswitch_statement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1340:2: (iv_ruleswitch_statement= ruleswitch_statement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1341:2: iv_ruleswitch_statement= ruleswitch_statement EOF
            {
             newCompositeNode(grammarAccess.getSwitch_statementRule()); 
            pushFollow(FOLLOW_ruleswitch_statement_in_entryRuleswitch_statement3705);
            iv_ruleswitch_statement=ruleswitch_statement();

            state._fsp--;

             current =iv_ruleswitch_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleswitch_statement3716); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1348:1: ruleswitch_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'switch' kw= '(' this_expression_2= ruleexpression kw= ')' kw= '{' ( (kw= 'case' this_expression_6= ruleexpression kw= ':' ) | (kw= 'default' kw= ':' ) | this_statement_10= rulestatement ) kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleswitch_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_expression_6 = null;

        AntlrDatatypeRuleToken this_statement_10 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1351:28: ( (kw= 'switch' kw= '(' this_expression_2= ruleexpression kw= ')' kw= '{' ( (kw= 'case' this_expression_6= ruleexpression kw= ':' ) | (kw= 'default' kw= ':' ) | this_statement_10= rulestatement ) kw= '}' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1352:1: (kw= 'switch' kw= '(' this_expression_2= ruleexpression kw= ')' kw= '{' ( (kw= 'case' this_expression_6= ruleexpression kw= ':' ) | (kw= 'default' kw= ':' ) | this_statement_10= rulestatement ) kw= '}' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1352:1: (kw= 'switch' kw= '(' this_expression_2= ruleexpression kw= ')' kw= '{' ( (kw= 'case' this_expression_6= ruleexpression kw= ':' ) | (kw= 'default' kw= ':' ) | this_statement_10= rulestatement ) kw= '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1353:2: kw= 'switch' kw= '(' this_expression_2= ruleexpression kw= ')' kw= '{' ( (kw= 'case' this_expression_6= ruleexpression kw= ':' ) | (kw= 'default' kw= ':' ) | this_statement_10= rulestatement ) kw= '}'
            {
            kw=(Token)match(input,50,FOLLOW_50_in_ruleswitch_statement3754); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getSwitchKeyword_0()); 
                
            kw=(Token)match(input,38,FOLLOW_38_in_ruleswitch_statement3767); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpressionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruleswitch_statement3789);
            this_expression_2=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,39,FOLLOW_39_in_ruleswitch_statement3807); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getRightParenthesisKeyword_3()); 
                
            kw=(Token)match(input,40,FOLLOW_40_in_ruleswitch_statement3820); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getLeftCurlyBracketKeyword_4()); 
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1387:1: ( (kw= 'case' this_expression_6= ruleexpression kw= ':' ) | (kw= 'default' kw= ':' ) | this_statement_10= rulestatement )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt23=1;
                }
                break;
            case 53:
                {
                alt23=2;
                }
                break;
            case RULE_IDENTIFIER:
            case RULE_INTEGER_LITERAL:
            case RULE_FLOAT_LITERAL:
            case RULE_STRING:
            case RULE_CHARACTER:
            case 21:
            case 30:
            case 32:
            case 36:
            case 38:
            case 40:
            case 42:
            case 44:
            case 45:
            case 46:
            case 47:
            case 50:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1387:2: (kw= 'case' this_expression_6= ruleexpression kw= ':' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1387:2: (kw= 'case' this_expression_6= ruleexpression kw= ':' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1388:2: kw= 'case' this_expression_6= ruleexpression kw= ':'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleswitch_statement3835); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getCaseKeyword_5_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpressionParserRuleCall_5_0_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_ruleswitch_statement3857);
                    this_expression_6=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleswitch_statement3875); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getColonKeyword_5_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1411:6: (kw= 'default' kw= ':' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1411:6: (kw= 'default' kw= ':' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1412:2: kw= 'default' kw= ':'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleswitch_statement3896); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getDefaultKeyword_5_1_0()); 
                        
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleswitch_statement3909); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getColonKeyword_5_1_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1425:5: this_statement_10= rulestatement
                    {
                     
                            newCompositeNode(grammarAccess.getSwitch_statementAccess().getStatementParserRuleCall_5_2()); 
                        
                    pushFollow(FOLLOW_rulestatement_in_ruleswitch_statement3938);
                    this_statement_10=rulestatement();

                    state._fsp--;


                    		current.merge(this_statement_10);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,41,FOLLOW_41_in_ruleswitch_statement3957); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSwitch_statementAccess().getRightCurlyBracketKeyword_6()); 
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulestatement"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1449:1: entryRulestatement returns [String current=null] : iv_rulestatement= rulestatement EOF ;
    public final String entryRulestatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1450:2: (iv_rulestatement= rulestatement EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1451:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement3998);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement4009); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1458:1: rulestatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_variable_declaration_0= rulevariable_declaration | (this_expression_1= ruleexpression kw= ';' ) | this_statement_block_3= rulestatement_block | this_if_statement_4= ruleif_statement | this_do_statement_5= ruledo_statement | this_while_statement_6= rulewhile_statement | this_for_statement_7= rulefor_statement | this_try_statement_8= ruletry_statement | this_switch_statement_9= ruleswitch_statement | (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement ) | (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' ) | (kw= 'throw' this_expression_19= ruleexpression kw= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement ) | (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' ) | (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' ) | kw= ';' ) ;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1461:28: ( (this_variable_declaration_0= rulevariable_declaration | (this_expression_1= ruleexpression kw= ';' ) | this_statement_block_3= rulestatement_block | this_if_statement_4= ruleif_statement | this_do_statement_5= ruledo_statement | this_while_statement_6= rulewhile_statement | this_for_statement_7= rulefor_statement | this_try_statement_8= ruletry_statement | this_switch_statement_9= ruleswitch_statement | (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement ) | (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' ) | (kw= 'throw' this_expression_19= ruleexpression kw= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement ) | (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' ) | (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' ) | kw= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1462:1: (this_variable_declaration_0= rulevariable_declaration | (this_expression_1= ruleexpression kw= ';' ) | this_statement_block_3= rulestatement_block | this_if_statement_4= ruleif_statement | this_do_statement_5= ruledo_statement | this_while_statement_6= rulewhile_statement | this_for_statement_7= rulefor_statement | this_try_statement_8= ruletry_statement | this_switch_statement_9= ruleswitch_statement | (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement ) | (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' ) | (kw= 'throw' this_expression_19= ruleexpression kw= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement ) | (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' ) | (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' ) | kw= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1462:1: (this_variable_declaration_0= rulevariable_declaration | (this_expression_1= ruleexpression kw= ';' ) | this_statement_block_3= rulestatement_block | this_if_statement_4= ruleif_statement | this_do_statement_5= ruledo_statement | this_while_statement_6= rulewhile_statement | this_for_statement_7= rulefor_statement | this_try_statement_8= ruletry_statement | this_switch_statement_9= ruleswitch_statement | (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement ) | (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' ) | (kw= 'throw' this_expression_19= ruleexpression kw= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement ) | (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' ) | (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' ) | kw= ';' )
            int alt27=16;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1463:5: this_variable_declaration_0= rulevariable_declaration
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getVariable_declarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulevariable_declaration_in_rulestatement4056);
                    this_variable_declaration_0=rulevariable_declaration();

                    state._fsp--;


                    		current.merge(this_variable_declaration_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1474:6: (this_expression_1= ruleexpression kw= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1474:6: (this_expression_1= ruleexpression kw= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1475:5: this_expression_1= ruleexpression kw= ';'
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement4090);
                    this_expression_1=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_rulestatement4108); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1493:5: this_statement_block_3= rulestatement_block
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulestatement_block_in_rulestatement4137);
                    this_statement_block_3=rulestatement_block();

                    state._fsp--;


                    		current.merge(this_statement_block_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1505:5: this_if_statement_4= ruleif_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getIf_statementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleif_statement_in_rulestatement4170);
                    this_if_statement_4=ruleif_statement();

                    state._fsp--;


                    		current.merge(this_if_statement_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1517:5: this_do_statement_5= ruledo_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getDo_statementParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruledo_statement_in_rulestatement4203);
                    this_do_statement_5=ruledo_statement();

                    state._fsp--;


                    		current.merge(this_do_statement_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1529:5: this_while_statement_6= rulewhile_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getWhile_statementParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulewhile_statement_in_rulestatement4236);
                    this_while_statement_6=rulewhile_statement();

                    state._fsp--;


                    		current.merge(this_while_statement_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1541:5: this_for_statement_7= rulefor_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getFor_statementParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulefor_statement_in_rulestatement4269);
                    this_for_statement_7=rulefor_statement();

                    state._fsp--;


                    		current.merge(this_for_statement_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1553:5: this_try_statement_8= ruletry_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getTry_statementParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruletry_statement_in_rulestatement4302);
                    this_try_statement_8=ruletry_statement();

                    state._fsp--;


                    		current.merge(this_try_statement_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1565:5: this_switch_statement_9= ruleswitch_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSwitch_statementParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleswitch_statement_in_rulestatement4335);
                    this_switch_statement_9=ruleswitch_statement();

                    state._fsp--;


                    		current.merge(this_switch_statement_9);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1576:6: (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1576:6: (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1577:2: kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_rulestatement4360); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getSynchronizedKeyword_9_0()); 
                        
                    kw=(Token)match(input,38,FOLLOW_38_in_rulestatement4373); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_9_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_9_2()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement4395);
                    this_expression_12=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_12);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,39,FOLLOW_39_in_rulestatement4413); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getRightParenthesisKeyword_9_3()); 
                        
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getStatementParserRuleCall_9_4()); 
                        
                    pushFollow(FOLLOW_rulestatement_in_rulestatement4435);
                    this_statement_14=rulestatement();

                    state._fsp--;


                    		current.merge(this_statement_14);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 11 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1617:6: (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1617:6: (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1618:2: kw= 'return' (this_expression_16= ruleexpression )? kw= ';'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_rulestatement4461); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getReturnKeyword_10_0()); 
                        
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1623:1: (this_expression_16= ruleexpression )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_IDENTIFIER||(LA24_0>=RULE_INTEGER_LITERAL && LA24_0<=RULE_CHARACTER)||LA24_0==21||LA24_0==30||LA24_0==32||LA24_0==38||(LA24_0>=60 && LA24_0<=63)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1624:5: this_expression_16= ruleexpression
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_10_1()); 
                                
                            pushFollow(FOLLOW_ruleexpression_in_rulestatement4484);
                            this_expression_16=ruleexpression();

                            state._fsp--;


                            		current.merge(this_expression_16);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,36,FOLLOW_36_in_rulestatement4504); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_10_2()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1641:6: (kw= 'throw' this_expression_19= ruleexpression kw= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1641:6: (kw= 'throw' this_expression_19= ruleexpression kw= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1642:2: kw= 'throw' this_expression_19= ruleexpression kw= ';'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_rulestatement4525); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getThrowKeyword_11_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_11_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulestatement4547);
                    this_expression_19=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_19);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_rulestatement4565); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_11_2()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1665:6: (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1665:6: (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1665:11: this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement
                    {
                    this_IDENTIFIER_21=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement4588); 

                    		current.merge(this_IDENTIFIER_21);
                        
                     
                        newLeafNode(this_IDENTIFIER_21, grammarAccess.getStatementAccess().getIDENTIFIERTerminalRuleCall_12_0()); 
                        
                    kw=(Token)match(input,52,FOLLOW_52_in_rulestatement4606); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getColonKeyword_12_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getStatementParserRuleCall_12_2()); 
                        
                    pushFollow(FOLLOW_rulestatement_in_rulestatement4628);
                    this_statement_23=rulestatement();

                    state._fsp--;


                    		current.merge(this_statement_23);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 14 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1690:6: (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1690:6: (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1691:2: kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_rulestatement4654); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getBreakKeyword_13_0()); 
                        
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1696:1: (this_IDENTIFIER_25= RULE_IDENTIFIER )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_IDENTIFIER) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1696:6: this_IDENTIFIER_25= RULE_IDENTIFIER
                            {
                            this_IDENTIFIER_25=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement4670); 

                            		current.merge(this_IDENTIFIER_25);
                                
                             
                                newLeafNode(this_IDENTIFIER_25, grammarAccess.getStatementAccess().getIDENTIFIERTerminalRuleCall_13_1()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,36,FOLLOW_36_in_rulestatement4690); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_13_2()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1710:6: (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1710:6: (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1711:2: kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_rulestatement4711); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getContinueKeyword_14_0()); 
                        
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1716:1: (this_IDENTIFIER_28= RULE_IDENTIFIER )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_IDENTIFIER) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1716:6: this_IDENTIFIER_28= RULE_IDENTIFIER
                            {
                            this_IDENTIFIER_28=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulestatement4727); 

                            		current.merge(this_IDENTIFIER_28);
                                
                             
                                newLeafNode(this_IDENTIFIER_28, grammarAccess.getStatementAccess().getIDENTIFIERTerminalRuleCall_14_1()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,36,FOLLOW_36_in_rulestatement4747); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_14_2()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1731:2: kw= ';'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_rulestatement4767); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_15()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1744:1: entryRulevariable_declaration returns [String current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final String entryRulevariable_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_declaration = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1745:2: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1746:2: iv_rulevariable_declaration= rulevariable_declaration EOF
            {
             newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            pushFollow(FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration4808);
            iv_rulevariable_declaration=rulevariable_declaration();

            state._fsp--;

             current =iv_rulevariable_declaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration4819); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1753:1: rulevariable_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_3= rulevariable_initializer ) ) (kw= ',' (this_IDENTIFIER_5= RULE_IDENTIFIER (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_9= rulevariable_initializer )? ) )? kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulevariable_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_5=null;
        AntlrDatatypeRuleToken this_variable_initializer_3 = null;

        AntlrDatatypeRuleToken this_variable_initializer_9 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1756:28: ( ( ( (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_3= rulevariable_initializer ) ) (kw= ',' (this_IDENTIFIER_5= RULE_IDENTIFIER (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_9= rulevariable_initializer )? ) )? kw= ';' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1757:1: ( ( (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_3= rulevariable_initializer ) ) (kw= ',' (this_IDENTIFIER_5= RULE_IDENTIFIER (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_9= rulevariable_initializer )? ) )? kw= ';' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1757:1: ( ( (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_3= rulevariable_initializer ) ) (kw= ',' (this_IDENTIFIER_5= RULE_IDENTIFIER (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_9= rulevariable_initializer )? ) )? kw= ';' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1757:2: ( (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_3= rulevariable_initializer ) ) (kw= ',' (this_IDENTIFIER_5= RULE_IDENTIFIER (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_9= rulevariable_initializer )? ) )? kw= ';'
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1757:2: ( (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_3= rulevariable_initializer ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1757:3: (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_3= rulevariable_initializer )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1757:3: (kw= '[' kw= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1758:2: kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_rulevariable_declaration4859); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariable_declarationAccess().getLeftSquareBracketKeyword_0_0_0()); 
                        
                    kw=(Token)match(input,31,FOLLOW_31_in_rulevariable_declaration4872); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariable_declarationAccess().getRightSquareBracketKeyword_0_0_1()); 
                        

                    }
                    break;

            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1769:3: (kw= '=' this_variable_initializer_3= rulevariable_initializer )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1770:2: kw= '=' this_variable_initializer_3= rulevariable_initializer
            {
            kw=(Token)match(input,59,FOLLOW_59_in_rulevariable_declaration4888); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_declarationAccess().getEqualsSignKeyword_0_1_0()); 
                
             
                    newCompositeNode(grammarAccess.getVariable_declarationAccess().getVariable_initializerParserRuleCall_0_1_1()); 
                
            pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_declaration4910);
            this_variable_initializer_3=rulevariable_initializer();

            state._fsp--;


            		current.merge(this_variable_initializer_3);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1786:3: (kw= ',' (this_IDENTIFIER_5= RULE_IDENTIFIER (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_9= rulevariable_initializer )? ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1787:2: kw= ',' (this_IDENTIFIER_5= RULE_IDENTIFIER (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_9= rulevariable_initializer )? )
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_rulevariable_declaration4931); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariable_declarationAccess().getCommaKeyword_1_0()); 
                        
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1792:1: (this_IDENTIFIER_5= RULE_IDENTIFIER (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_9= rulevariable_initializer )? )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1792:6: this_IDENTIFIER_5= RULE_IDENTIFIER (kw= '[' kw= ']' )? (kw= '=' this_variable_initializer_9= rulevariable_initializer )?
                    {
                    this_IDENTIFIER_5=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariable_declaration4947); 

                    		current.merge(this_IDENTIFIER_5);
                        
                     
                        newLeafNode(this_IDENTIFIER_5, grammarAccess.getVariable_declarationAccess().getIDENTIFIERTerminalRuleCall_1_1_0()); 
                        
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1799:1: (kw= '[' kw= ']' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==30) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1800:2: kw= '[' kw= ']'
                            {
                            kw=(Token)match(input,30,FOLLOW_30_in_rulevariable_declaration4966); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVariable_declarationAccess().getLeftSquareBracketKeyword_1_1_1_0()); 
                                
                            kw=(Token)match(input,31,FOLLOW_31_in_rulevariable_declaration4979); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVariable_declarationAccess().getRightSquareBracketKeyword_1_1_1_1()); 
                                

                            }
                            break;

                    }

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1811:3: (kw= '=' this_variable_initializer_9= rulevariable_initializer )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==59) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1812:2: kw= '=' this_variable_initializer_9= rulevariable_initializer
                            {
                            kw=(Token)match(input,59,FOLLOW_59_in_rulevariable_declaration4995); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVariable_declarationAccess().getEqualsSignKeyword_1_1_2_0()); 
                                
                             
                                    newCompositeNode(grammarAccess.getVariable_declarationAccess().getVariable_initializerParserRuleCall_1_1_2_1()); 
                                
                            pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_declaration5017);
                            this_variable_initializer_9=rulevariable_initializer();

                            state._fsp--;


                            		current.merge(this_variable_initializer_9);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            kw=(Token)match(input,36,FOLLOW_36_in_rulevariable_declaration5040); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_2()); 
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulevariable_initializer"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1842:1: entryRulevariable_initializer returns [String current=null] : iv_rulevariable_initializer= rulevariable_initializer EOF ;
    public final String entryRulevariable_initializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_initializer = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1843:2: (iv_rulevariable_initializer= rulevariable_initializer EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1844:2: iv_rulevariable_initializer= rulevariable_initializer EOF
            {
             newCompositeNode(grammarAccess.getVariable_initializerRule()); 
            pushFollow(FOLLOW_rulevariable_initializer_in_entryRulevariable_initializer5081);
            iv_rulevariable_initializer=rulevariable_initializer();

            state._fsp--;

             current =iv_rulevariable_initializer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_initializer5092); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1851:1: rulevariable_initializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression | (kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )? (kw= ',' )? )? kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken rulevariable_initializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_variable_initializer_2 = null;

        AntlrDatatypeRuleToken this_variable_initializer_4 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1854:28: ( (this_expression_0= ruleexpression | (kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )? (kw= ',' )? )? kw= '}' ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1855:1: (this_expression_0= ruleexpression | (kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )? (kw= ',' )? )? kw= '}' ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1855:1: (this_expression_0= ruleexpression | (kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )? (kw= ',' )? )? kw= '}' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_IDENTIFIER||(LA35_0>=RULE_INTEGER_LITERAL && LA35_0<=RULE_CHARACTER)||LA35_0==21||LA35_0==30||LA35_0==32||LA35_0==38||(LA35_0>=60 && LA35_0<=63)) ) {
                alt35=1;
            }
            else if ( (LA35_0==40) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1856:5: this_expression_0= ruleexpression
                    {
                     
                            newCompositeNode(grammarAccess.getVariable_initializerAccess().getExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulevariable_initializer5139);
                    this_expression_0=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1867:6: (kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )? (kw= ',' )? )? kw= '}' )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1867:6: (kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )? (kw= ',' )? )? kw= '}' )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1868:2: kw= '{' (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )? (kw= ',' )? )? kw= '}'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_rulevariable_initializer5164); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariable_initializerAccess().getLeftCurlyBracketKeyword_1_0()); 
                        
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1873:1: (this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )? (kw= ',' )? )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_IDENTIFIER||(LA34_0>=RULE_INTEGER_LITERAL && LA34_0<=RULE_CHARACTER)||LA34_0==21||LA34_0==30||LA34_0==32||LA34_0==38||LA34_0==40||(LA34_0>=60 && LA34_0<=63)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1874:5: this_variable_initializer_2= rulevariable_initializer (kw= ',' this_variable_initializer_4= rulevariable_initializer )? (kw= ',' )?
                            {
                             
                                    newCompositeNode(grammarAccess.getVariable_initializerAccess().getVariable_initializerParserRuleCall_1_1_0()); 
                                
                            pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_initializer5187);
                            this_variable_initializer_2=rulevariable_initializer();

                            state._fsp--;


                            		current.merge(this_variable_initializer_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1884:1: (kw= ',' this_variable_initializer_4= rulevariable_initializer )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==32) ) {
                                int LA32_1 = input.LA(2);

                                if ( (LA32_1==RULE_IDENTIFIER||(LA32_1>=RULE_INTEGER_LITERAL && LA32_1<=RULE_CHARACTER)||LA32_1==21||LA32_1==30||LA32_1==32||LA32_1==38||LA32_1==40||(LA32_1>=60 && LA32_1<=63)) ) {
                                    alt32=1;
                                }
                            }
                            switch (alt32) {
                                case 1 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1885:2: kw= ',' this_variable_initializer_4= rulevariable_initializer
                                    {
                                    kw=(Token)match(input,32,FOLLOW_32_in_rulevariable_initializer5206); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getVariable_initializerAccess().getCommaKeyword_1_1_1_0()); 
                                        
                                     
                                            newCompositeNode(grammarAccess.getVariable_initializerAccess().getVariable_initializerParserRuleCall_1_1_1_1()); 
                                        
                                    pushFollow(FOLLOW_rulevariable_initializer_in_rulevariable_initializer5228);
                                    this_variable_initializer_4=rulevariable_initializer();

                                    state._fsp--;


                                    		current.merge(this_variable_initializer_4);
                                        
                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }

                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1901:3: (kw= ',' )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==32) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1902:2: kw= ','
                                    {
                                    kw=(Token)match(input,32,FOLLOW_32_in_rulevariable_initializer5249); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getVariable_initializerAccess().getCommaKeyword_1_1_2()); 
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    kw=(Token)match(input,41,FOLLOW_41_in_rulevariable_initializer5266); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariable_initializerAccess().getRightCurlyBracketKeyword_1_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleexpression"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1921:1: entryRuleexpression returns [String current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final String entryRuleexpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1922:2: (iv_ruleexpression= ruleexpression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1923:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression5308);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression5319); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1930:1: ruleexpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_literal_expression_0= ruleliteral_expression this_expression_aux_1= ruleexpression_aux ) | (kw= 'null' this_expression_aux_3= ruleexpression_aux ) | (kw= 'super' this_expression_aux_5= ruleexpression_aux ) | (kw= 'this' this_expression_aux_7= ruleexpression_aux ) | (this_IDENTIFIER_8= RULE_IDENTIFIER this_expression_aux_9= ruleexpression_aux ) | (kw= '(' this_expression_11= ruleexpression kw= ')' this_expression_aux_13= ruleexpression_aux ) | (kw= '[' this_expression_15= ruleexpression kw= ']' this_expression_aux_17= ruleexpression_aux ) | (kw= '.' this_expression_19= ruleexpression this_expression_aux_20= ruleexpression_aux ) | (kw= ',' this_expression_22= ruleexpression this_expression_aux_23= ruleexpression_aux ) | (kw= 'instanceof' this_class_interface_name_25= ruleclass_interface_name this_expression_aux_26= ruleexpression_aux ) ) ;
    public final AntlrDatatypeRuleToken ruleexpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_8=null;
        AntlrDatatypeRuleToken this_literal_expression_0 = null;

        AntlrDatatypeRuleToken this_expression_aux_1 = null;

        AntlrDatatypeRuleToken this_expression_aux_3 = null;

        AntlrDatatypeRuleToken this_expression_aux_5 = null;

        AntlrDatatypeRuleToken this_expression_aux_7 = null;

        AntlrDatatypeRuleToken this_expression_aux_9 = null;

        AntlrDatatypeRuleToken this_expression_11 = null;

        AntlrDatatypeRuleToken this_expression_aux_13 = null;

        AntlrDatatypeRuleToken this_expression_15 = null;

        AntlrDatatypeRuleToken this_expression_aux_17 = null;

        AntlrDatatypeRuleToken this_expression_19 = null;

        AntlrDatatypeRuleToken this_expression_aux_20 = null;

        AntlrDatatypeRuleToken this_expression_22 = null;

        AntlrDatatypeRuleToken this_expression_aux_23 = null;

        AntlrDatatypeRuleToken this_class_interface_name_25 = null;

        AntlrDatatypeRuleToken this_expression_aux_26 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1933:28: ( ( (this_literal_expression_0= ruleliteral_expression this_expression_aux_1= ruleexpression_aux ) | (kw= 'null' this_expression_aux_3= ruleexpression_aux ) | (kw= 'super' this_expression_aux_5= ruleexpression_aux ) | (kw= 'this' this_expression_aux_7= ruleexpression_aux ) | (this_IDENTIFIER_8= RULE_IDENTIFIER this_expression_aux_9= ruleexpression_aux ) | (kw= '(' this_expression_11= ruleexpression kw= ')' this_expression_aux_13= ruleexpression_aux ) | (kw= '[' this_expression_15= ruleexpression kw= ']' this_expression_aux_17= ruleexpression_aux ) | (kw= '.' this_expression_19= ruleexpression this_expression_aux_20= ruleexpression_aux ) | (kw= ',' this_expression_22= ruleexpression this_expression_aux_23= ruleexpression_aux ) | (kw= 'instanceof' this_class_interface_name_25= ruleclass_interface_name this_expression_aux_26= ruleexpression_aux ) ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1934:1: ( (this_literal_expression_0= ruleliteral_expression this_expression_aux_1= ruleexpression_aux ) | (kw= 'null' this_expression_aux_3= ruleexpression_aux ) | (kw= 'super' this_expression_aux_5= ruleexpression_aux ) | (kw= 'this' this_expression_aux_7= ruleexpression_aux ) | (this_IDENTIFIER_8= RULE_IDENTIFIER this_expression_aux_9= ruleexpression_aux ) | (kw= '(' this_expression_11= ruleexpression kw= ')' this_expression_aux_13= ruleexpression_aux ) | (kw= '[' this_expression_15= ruleexpression kw= ']' this_expression_aux_17= ruleexpression_aux ) | (kw= '.' this_expression_19= ruleexpression this_expression_aux_20= ruleexpression_aux ) | (kw= ',' this_expression_22= ruleexpression this_expression_aux_23= ruleexpression_aux ) | (kw= 'instanceof' this_class_interface_name_25= ruleclass_interface_name this_expression_aux_26= ruleexpression_aux ) )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1934:1: ( (this_literal_expression_0= ruleliteral_expression this_expression_aux_1= ruleexpression_aux ) | (kw= 'null' this_expression_aux_3= ruleexpression_aux ) | (kw= 'super' this_expression_aux_5= ruleexpression_aux ) | (kw= 'this' this_expression_aux_7= ruleexpression_aux ) | (this_IDENTIFIER_8= RULE_IDENTIFIER this_expression_aux_9= ruleexpression_aux ) | (kw= '(' this_expression_11= ruleexpression kw= ')' this_expression_aux_13= ruleexpression_aux ) | (kw= '[' this_expression_15= ruleexpression kw= ']' this_expression_aux_17= ruleexpression_aux ) | (kw= '.' this_expression_19= ruleexpression this_expression_aux_20= ruleexpression_aux ) | (kw= ',' this_expression_22= ruleexpression this_expression_aux_23= ruleexpression_aux ) | (kw= 'instanceof' this_class_interface_name_25= ruleclass_interface_name this_expression_aux_26= ruleexpression_aux ) )
            int alt36=10;
            switch ( input.LA(1) ) {
            case RULE_INTEGER_LITERAL:
            case RULE_FLOAT_LITERAL:
            case RULE_STRING:
            case RULE_CHARACTER:
                {
                alt36=1;
                }
                break;
            case 60:
                {
                alt36=2;
                }
                break;
            case 61:
                {
                alt36=3;
                }
                break;
            case 62:
                {
                alt36=4;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt36=5;
                }
                break;
            case 38:
                {
                alt36=6;
                }
                break;
            case 30:
                {
                alt36=7;
                }
                break;
            case 21:
                {
                alt36=8;
                }
                break;
            case 32:
                {
                alt36=9;
                }
                break;
            case 63:
                {
                alt36=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1934:2: (this_literal_expression_0= ruleliteral_expression this_expression_aux_1= ruleexpression_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1934:2: (this_literal_expression_0= ruleliteral_expression this_expression_aux_1= ruleexpression_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1935:5: this_literal_expression_0= ruleliteral_expression this_expression_aux_1= ruleexpression_aux
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getLiteral_expressionParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleliteral_expression_in_ruleexpression5367);
                    this_literal_expression_0=ruleliteral_expression();

                    state._fsp--;


                    		current.merge(this_literal_expression_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpression_auxParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression5394);
                    this_expression_aux_1=ruleexpression_aux();

                    state._fsp--;


                    		current.merge(this_expression_aux_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1957:6: (kw= 'null' this_expression_aux_3= ruleexpression_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1957:6: (kw= 'null' this_expression_aux_3= ruleexpression_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1958:2: kw= 'null' this_expression_aux_3= ruleexpression_aux
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleexpression5420); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpressionAccess().getNullKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpression_auxParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression5442);
                    this_expression_aux_3=ruleexpression_aux();

                    state._fsp--;


                    		current.merge(this_expression_aux_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1975:6: (kw= 'super' this_expression_aux_5= ruleexpression_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1975:6: (kw= 'super' this_expression_aux_5= ruleexpression_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1976:2: kw= 'super' this_expression_aux_5= ruleexpression_aux
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleexpression5468); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpressionAccess().getSuperKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpression_auxParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression5490);
                    this_expression_aux_5=ruleexpression_aux();

                    state._fsp--;


                    		current.merge(this_expression_aux_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1993:6: (kw= 'this' this_expression_aux_7= ruleexpression_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1993:6: (kw= 'this' this_expression_aux_7= ruleexpression_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1994:2: kw= 'this' this_expression_aux_7= ruleexpression_aux
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleexpression5516); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpressionAccess().getThisKeyword_3_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpression_auxParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression5538);
                    this_expression_aux_7=ruleexpression_aux();

                    state._fsp--;


                    		current.merge(this_expression_aux_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 5 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2011:6: (this_IDENTIFIER_8= RULE_IDENTIFIER this_expression_aux_9= ruleexpression_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2011:6: (this_IDENTIFIER_8= RULE_IDENTIFIER this_expression_aux_9= ruleexpression_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2011:11: this_IDENTIFIER_8= RULE_IDENTIFIER this_expression_aux_9= ruleexpression_aux
                    {
                    this_IDENTIFIER_8=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleexpression5566); 

                    		current.merge(this_IDENTIFIER_8);
                        
                     
                        newLeafNode(this_IDENTIFIER_8, grammarAccess.getExpressionAccess().getIDENTIFIERTerminalRuleCall_4_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpression_auxParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression5593);
                    this_expression_aux_9=ruleexpression_aux();

                    state._fsp--;


                    		current.merge(this_expression_aux_9);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 6 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2030:6: (kw= '(' this_expression_11= ruleexpression kw= ')' this_expression_aux_13= ruleexpression_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2030:6: (kw= '(' this_expression_11= ruleexpression kw= ')' this_expression_aux_13= ruleexpression_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2031:2: kw= '(' this_expression_11= ruleexpression kw= ')' this_expression_aux_13= ruleexpression_aux
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleexpression5619); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_5_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_5_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression5641);
                    this_expression_11=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_11);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleexpression5659); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_5_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpression_auxParserRuleCall_5_3()); 
                        
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression5681);
                    this_expression_aux_13=ruleexpression_aux();

                    state._fsp--;


                    		current.merge(this_expression_aux_13);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 7 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2065:6: (kw= '[' this_expression_15= ruleexpression kw= ']' this_expression_aux_17= ruleexpression_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2065:6: (kw= '[' this_expression_15= ruleexpression kw= ']' this_expression_aux_17= ruleexpression_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2066:2: kw= '[' this_expression_15= ruleexpression kw= ']' this_expression_aux_17= ruleexpression_aux
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleexpression5707); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_6_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_6_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression5729);
                    this_expression_15=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_15);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleexpression5747); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_6_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpression_auxParserRuleCall_6_3()); 
                        
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression5769);
                    this_expression_aux_17=ruleexpression_aux();

                    state._fsp--;


                    		current.merge(this_expression_aux_17);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 8 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2100:6: (kw= '.' this_expression_19= ruleexpression this_expression_aux_20= ruleexpression_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2100:6: (kw= '.' this_expression_19= ruleexpression this_expression_aux_20= ruleexpression_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2101:2: kw= '.' this_expression_19= ruleexpression this_expression_aux_20= ruleexpression_aux
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleexpression5795); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpressionAccess().getFullStopKeyword_7_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_7_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression5817);
                    this_expression_19=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_19);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpression_auxParserRuleCall_7_2()); 
                        
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression5844);
                    this_expression_aux_20=ruleexpression_aux();

                    state._fsp--;


                    		current.merge(this_expression_aux_20);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 9 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2129:6: (kw= ',' this_expression_22= ruleexpression this_expression_aux_23= ruleexpression_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2129:6: (kw= ',' this_expression_22= ruleexpression this_expression_aux_23= ruleexpression_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2130:2: kw= ',' this_expression_22= ruleexpression this_expression_aux_23= ruleexpression_aux
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleexpression5870); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpressionAccess().getCommaKeyword_8_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_8_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_ruleexpression5892);
                    this_expression_22=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_22);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpression_auxParserRuleCall_8_2()); 
                        
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression5919);
                    this_expression_aux_23=ruleexpression_aux();

                    state._fsp--;


                    		current.merge(this_expression_aux_23);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 10 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2158:6: (kw= 'instanceof' this_class_interface_name_25= ruleclass_interface_name this_expression_aux_26= ruleexpression_aux )
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2158:6: (kw= 'instanceof' this_class_interface_name_25= ruleclass_interface_name this_expression_aux_26= ruleexpression_aux )
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2159:2: kw= 'instanceof' this_class_interface_name_25= ruleclass_interface_name this_expression_aux_26= ruleexpression_aux
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleexpression5945); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpressionAccess().getInstanceofKeyword_9_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getClass_interface_nameParserRuleCall_9_1()); 
                        
                    pushFollow(FOLLOW_ruleclass_interface_name_in_ruleexpression5967);
                    this_class_interface_name_25=ruleclass_interface_name();

                    state._fsp--;


                    		current.merge(this_class_interface_name_25);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getExpression_auxParserRuleCall_9_2()); 
                        
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression5994);
                    this_expression_aux_26=ruleexpression_aux();

                    state._fsp--;


                    		current.merge(this_expression_aux_26);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulearglist"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2196:1: entryRulearglist returns [String current=null] : iv_rulearglist= rulearglist EOF ;
    public final String entryRulearglist() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearglist = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2197:2: (iv_rulearglist= rulearglist EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2198:2: iv_rulearglist= rulearglist EOF
            {
             newCompositeNode(grammarAccess.getArglistRule()); 
            pushFollow(FOLLOW_rulearglist_in_entryRulearglist6043);
            iv_rulearglist=rulearglist();

            state._fsp--;

             current =iv_rulearglist.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulearglist6054); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2205:1: rulearglist returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )? ) ;
    public final AntlrDatatypeRuleToken rulearglist() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2208:28: ( (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2209:1: (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2209:1: (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2210:5: this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )?
            {
             
                    newCompositeNode(grammarAccess.getArglistAccess().getExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulearglist6101);
            this_expression_0=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2220:1: (kw= ',' this_expression_2= ruleexpression )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2221:2: kw= ',' this_expression_2= ruleexpression
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_rulearglist6120); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArglistAccess().getCommaKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getArglistAccess().getExpressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulearglist6142);
                    this_expression_2=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleexpression_aux"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2245:1: entryRuleexpression_aux returns [String current=null] : iv_ruleexpression_aux= ruleexpression_aux EOF ;
    public final String entryRuleexpression_aux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression_aux = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2246:2: (iv_ruleexpression_aux= ruleexpression_aux EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2247:2: iv_ruleexpression_aux= ruleexpression_aux EOF
            {
             newCompositeNode(grammarAccess.getExpression_auxRule()); 
            pushFollow(FOLLOW_ruleexpression_aux_in_entryRuleexpression_aux6190);
            iv_ruleexpression_aux=ruleexpression_aux();

            state._fsp--;

             current =iv_ruleexpression_aux.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression_aux6201); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2254:1: ruleexpression_aux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_arglist_1= rulearglist )? kw= ')' this_expression_aux_3= ruleexpression_aux )? ;
    public final AntlrDatatypeRuleToken ruleexpression_aux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_arglist_1 = null;

        AntlrDatatypeRuleToken this_expression_aux_3 = null;


         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2257:28: ( (kw= '(' (this_arglist_1= rulearglist )? kw= ')' this_expression_aux_3= ruleexpression_aux )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2258:1: (kw= '(' (this_arglist_1= rulearglist )? kw= ')' this_expression_aux_3= ruleexpression_aux )?
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2258:1: (kw= '(' (this_arglist_1= rulearglist )? kw= ')' this_expression_aux_3= ruleexpression_aux )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2259:2: kw= '(' (this_arglist_1= rulearglist )? kw= ')' this_expression_aux_3= ruleexpression_aux
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleexpression_aux6239); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpression_auxAccess().getLeftParenthesisKeyword_0()); 
                        
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2264:1: (this_arglist_1= rulearglist )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_IDENTIFIER||(LA38_0>=RULE_INTEGER_LITERAL && LA38_0<=RULE_CHARACTER)||LA38_0==21||LA38_0==30||LA38_0==32||LA38_0==38||(LA38_0>=60 && LA38_0<=63)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2265:5: this_arglist_1= rulearglist
                            {
                             
                                    newCompositeNode(grammarAccess.getExpression_auxAccess().getArglistParserRuleCall_1()); 
                                
                            pushFollow(FOLLOW_rulearglist_in_ruleexpression_aux6262);
                            this_arglist_1=rulearglist();

                            state._fsp--;


                            		current.merge(this_arglist_1);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,39,FOLLOW_39_in_ruleexpression_aux6282); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpression_auxAccess().getRightParenthesisKeyword_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression_auxParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleexpression_aux_in_ruleexpression_aux6304);
                    this_expression_aux_3=ruleexpression_aux();

                    state._fsp--;


                    		current.merge(this_expression_aux_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleliteral_expression"
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2300:1: entryRuleliteral_expression returns [String current=null] : iv_ruleliteral_expression= ruleliteral_expression EOF ;
    public final String entryRuleliteral_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleliteral_expression = null;


        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2301:2: (iv_ruleliteral_expression= ruleliteral_expression EOF )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2302:2: iv_ruleliteral_expression= ruleliteral_expression EOF
            {
             newCompositeNode(grammarAccess.getLiteral_expressionRule()); 
            pushFollow(FOLLOW_ruleliteral_expression_in_entryRuleliteral_expression6351);
            iv_ruleliteral_expression=ruleliteral_expression();

            state._fsp--;

             current =iv_ruleliteral_expression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleliteral_expression6362); 

            }

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
    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2309:1: ruleliteral_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_LITERAL_0= RULE_INTEGER_LITERAL | this_FLOAT_LITERAL_1= RULE_FLOAT_LITERAL | this_STRING_2= RULE_STRING | this_CHARACTER_3= RULE_CHARACTER ) ;
    public final AntlrDatatypeRuleToken ruleliteral_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LITERAL_0=null;
        Token this_FLOAT_LITERAL_1=null;
        Token this_STRING_2=null;
        Token this_CHARACTER_3=null;

         enterRule(); 
            
        try {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2312:28: ( (this_INTEGER_LITERAL_0= RULE_INTEGER_LITERAL | this_FLOAT_LITERAL_1= RULE_FLOAT_LITERAL | this_STRING_2= RULE_STRING | this_CHARACTER_3= RULE_CHARACTER ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2313:1: (this_INTEGER_LITERAL_0= RULE_INTEGER_LITERAL | this_FLOAT_LITERAL_1= RULE_FLOAT_LITERAL | this_STRING_2= RULE_STRING | this_CHARACTER_3= RULE_CHARACTER )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2313:1: (this_INTEGER_LITERAL_0= RULE_INTEGER_LITERAL | this_FLOAT_LITERAL_1= RULE_FLOAT_LITERAL | this_STRING_2= RULE_STRING | this_CHARACTER_3= RULE_CHARACTER )
            int alt40=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER_LITERAL:
                {
                alt40=1;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt40=2;
                }
                break;
            case RULE_STRING:
                {
                alt40=3;
                }
                break;
            case RULE_CHARACTER:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2313:6: this_INTEGER_LITERAL_0= RULE_INTEGER_LITERAL
                    {
                    this_INTEGER_LITERAL_0=(Token)match(input,RULE_INTEGER_LITERAL,FOLLOW_RULE_INTEGER_LITERAL_in_ruleliteral_expression6402); 

                    		current.merge(this_INTEGER_LITERAL_0);
                        
                     
                        newLeafNode(this_INTEGER_LITERAL_0, grammarAccess.getLiteral_expressionAccess().getINTEGER_LITERALTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2321:10: this_FLOAT_LITERAL_1= RULE_FLOAT_LITERAL
                    {
                    this_FLOAT_LITERAL_1=(Token)match(input,RULE_FLOAT_LITERAL,FOLLOW_RULE_FLOAT_LITERAL_in_ruleliteral_expression6428); 

                    		current.merge(this_FLOAT_LITERAL_1);
                        
                     
                        newLeafNode(this_FLOAT_LITERAL_1, grammarAccess.getLiteral_expressionAccess().getFLOAT_LITERALTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2329:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleliteral_expression6454); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getLiteral_expressionAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2337:10: this_CHARACTER_3= RULE_CHARACTER
                    {
                    this_CHARACTER_3=(Token)match(input,RULE_CHARACTER,FOLLOW_RULE_CHARACTER_in_ruleliteral_expression6480); 

                    		current.merge(this_CHARACTER_3);
                        
                     
                        newLeafNode(this_CHARACTER_3, grammarAccess.getLiteral_expressionAccess().getCHARACTERTerminalRuleCall_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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

    // Delegated rules


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\23\uffff";
    static final String DFA27_eofS =
        "\23\uffff";
    static final String DFA27_minS =
        "\2\5\2\uffff\1\44\16\uffff";
    static final String DFA27_maxS =
        "\2\77\2\uffff\1\64\16\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\15";
    static final String DFA27_specialS =
        "\23\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\4\1\uffff\4\3\12\uffff\1\3\10\uffff\1\1\1\uffff\1\3\3\uffff\1\21\1\uffff\1\3\1\uffff\1\5\1\uffff\1\6\1\uffff\1\7\1\10\1\11\1\12\2\uffff\1\13\3\uffff\1\14\1\15\1\16\1\17\1\20\1\2\4\3",
            "\1\3\1\uffff\4\3\12\uffff\1\3\10\uffff\1\3\1\2\1\3\5\uffff\1\3\25\uffff\4\3",
            "",
            "",
            "\1\3\1\uffff\1\3\15\uffff\1\22",
            "",
            "",
            "",
            "",
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

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1462:1: (this_variable_declaration_0= rulevariable_declaration | (this_expression_1= ruleexpression kw= ';' ) | this_statement_block_3= rulestatement_block | this_if_statement_4= ruleif_statement | this_do_statement_5= ruledo_statement | this_while_statement_6= rulewhile_statement | this_for_statement_7= rulefor_statement | this_try_statement_8= ruletry_statement | this_switch_statement_9= ruleswitch_statement | (kw= 'synchronized' kw= '(' this_expression_12= ruleexpression kw= ')' this_statement_14= rulestatement ) | (kw= 'return' (this_expression_16= ruleexpression )? kw= ';' ) | (kw= 'throw' this_expression_19= ruleexpression kw= ';' ) | (this_IDENTIFIER_21= RULE_IDENTIFIER kw= ':' this_statement_23= rulestatement ) | (kw= 'break' (this_IDENTIFIER_25= RULE_IDENTIFIER )? kw= ';' ) | (kw= 'continue' (this_IDENTIFIER_28= RULE_IDENTIFIER )? kw= ';' ) | kw= ';' )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleGreeting213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting230 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGreeting247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepackage_name_in_entryRulepackage_name284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepackage_name295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulepackage_name335 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_rulepackage_name362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_entryRulepackage_name_aux408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepackage_name_aux419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulepackage_name_aux457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulepackage_name_aux472 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rulepackage_name_aux_in_rulepackage_name_aux499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclass_interface_name_in_entryRuleclass_interface_name546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclass_interface_name557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleclass_interface_name597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepackage_name_in_ruleclass_interface_name631 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleclass_interface_name649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleclass_interface_name664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_entryRuletype_specifier715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_specifier726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruletype_specifier764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruletype_specifier783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruletype_specifier802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruletype_specifier821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruletype_specifier840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruletype_specifier859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruletype_specifier878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruletype_specifier897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclass_interface_name_in_ruletype_specifier925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_specifier_in_ruletype1029 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruletype1048 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruletype1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_in_entryRuleparameter1104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleparameter1162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleparameter1182 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleparameter1201 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleparameter1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_list_in_entryRuleparameter_list1257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_list1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_in_ruleparameter_list1315 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleparameter_list1334 = new BitSet(new long[]{0x000000003FC00020L});
    public static final BitSet FOLLOW_ruleparameter_in_ruleparameter_list1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_entryRuledoc_comment1404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledoc_comment1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruledoc_comment1453 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruledoc_comment1466 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruledoc_comment1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_declaration_in_entryRulefield_declaration1522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_declaration1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoc_comment_in_rulefield_declaration1582 = new BitSet(new long[]{0x0800004040000060L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_rulefield_declaration1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_rulefield_declaration1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulefield_declaration1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatic_initializer_in_rulefield_declaration1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulefield_declaration1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatic_initializer_in_entryRulestatic_initializer1778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatic_initializer1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulestatic_initializer1827 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulestatic_initializer1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemodifier_aux_in_entryRulemodifier_aux1895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemodifier_aux1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_rulemodifier_aux1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstructor_declaration_in_entryRuleconstructor_declaration1993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstructor_declaration2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemodifier_aux_in_ruleconstructor_declaration2051 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstructor_declaration2071 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleconstructor_declaration2089 = new BitSet(new long[]{0x000000803FC00020L});
    public static final BitSet FOLLOW_ruleparameter_list_in_ruleconstructor_declaration2112 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleconstructor_declaration2132 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_ruleconstructor_declaration2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemethod_declaration_in_entryRulemethod_declaration2202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemethod_declaration2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulemethod_declaration2251 = new BitSet(new long[]{0x000000803FC00020L});
    public static final BitSet FOLLOW_ruleparameter_list_in_rulemethod_declaration2274 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulemethod_declaration2294 = new BitSet(new long[]{0x0000011040000000L});
    public static final BitSet FOLLOW_30_in_rulemethod_declaration2308 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulemethod_declaration2321 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulemethod_declaration2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulemethod_declaration2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_entryRulestatement_block2412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_block2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulestatement_block2461 = new BitSet(new long[]{0xFFC4F751402007E0L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_block2484 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulestatement_block2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_entryRuleif_statement2545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_statement2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleif_statement2594 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleif_statement2607 = new BitSet(new long[]{0xF0000041402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleif_statement2629 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleif_statement2647 = new BitSet(new long[]{0xFFC4F551402007E0L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement2669 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleif_statement2688 = new BitSet(new long[]{0xFFC4F551402007E0L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledo_statement_in_entryRuledo_statement2758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledo_statement2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruledo_statement2807 = new BitSet(new long[]{0xFFC4F551402007E0L});
    public static final BitSet FOLLOW_rulestatement_in_ruledo_statement2829 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruledo_statement2847 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruledo_statement2860 = new BitSet(new long[]{0xF0000041402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_ruledo_statement2882 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruledo_statement2900 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruledo_statement2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement2954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulewhile_statement3003 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulewhile_statement3016 = new BitSet(new long[]{0xF0000041402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_rulewhile_statement3038 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulewhile_statement3056 = new BitSet(new long[]{0xFFC4F551402007E0L});
    public static final BitSet FOLLOW_rulestatement_in_rulewhile_statement3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_entryRulefor_statement3124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_statement3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulefor_statement3173 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulefor_statement3186 = new BitSet(new long[]{0xF8000051402007E0L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulefor_statement3209 = new BitSet(new long[]{0xF0000051402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement3243 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefor_statement3261 = new BitSet(new long[]{0xF0000051402007A0L});
    public static final BitSet FOLLOW_36_in_rulefor_statement3281 = new BitSet(new long[]{0xF0000051402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement3305 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefor_statement3325 = new BitSet(new long[]{0xF0000051402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement3348 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefor_statement3368 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulefor_statement3381 = new BitSet(new long[]{0xFFC4F551402007E0L});
    public static final BitSet FOLLOW_rulestatement_in_rulefor_statement3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletry_statement_in_entryRuletry_statement3449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletry_statement3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruletry_statement3498 = new BitSet(new long[]{0xFFC4F551402007E0L});
    public static final BitSet FOLLOW_rulestatement_in_ruletry_statement3520 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_48_in_ruletry_statement3539 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruletry_statement3552 = new BitSet(new long[]{0x000000003FC00020L});
    public static final BitSet FOLLOW_ruleparameter_in_ruletry_statement3574 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruletry_statement3592 = new BitSet(new long[]{0xFFC4F551402007E0L});
    public static final BitSet FOLLOW_rulestatement_in_ruletry_statement3614 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruletry_statement3635 = new BitSet(new long[]{0xFFC4F551402007E0L});
    public static final BitSet FOLLOW_rulestatement_in_ruletry_statement3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitch_statement_in_entryRuleswitch_statement3705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleswitch_statement3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleswitch_statement3754 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleswitch_statement3767 = new BitSet(new long[]{0xF0000041402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleswitch_statement3789 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleswitch_statement3807 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleswitch_statement3820 = new BitSet(new long[]{0xFFECF551402007E0L});
    public static final BitSet FOLLOW_51_in_ruleswitch_statement3835 = new BitSet(new long[]{0xF0000041402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleswitch_statement3857 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleswitch_statement3875 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_53_in_ruleswitch_statement3896 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleswitch_statement3909 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleswitch_statement3938 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleswitch_statement3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement3998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_rulestatement4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement4090 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulestatement4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_block_in_rulestatement4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_rulestatement4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledo_statement_in_rulestatement4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rulestatement4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rulestatement4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletry_statement_in_rulestatement4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitch_statement_in_rulestatement4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulestatement4360 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulestatement4373 = new BitSet(new long[]{0xF0000041402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement4395 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulestatement4413 = new BitSet(new long[]{0xFFC4F551402007E0L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulestatement4461 = new BitSet(new long[]{0xF0000051402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement4484 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulestatement4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulestatement4525 = new BitSet(new long[]{0xF0000041402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_rulestatement4547 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulestatement4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement4588 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_rulestatement4606 = new BitSet(new long[]{0xFFC4F551402007E0L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulestatement4654 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement4670 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulestatement4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulestatement4711 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulestatement4727 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulestatement4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulestatement4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_in_entryRulevariable_declaration4808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulevariable_declaration4859 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulevariable_declaration4872 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_rulevariable_declaration4888 = new BitSet(new long[]{0xF0000141402007A0L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_declaration4910 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_32_in_rulevariable_declaration4931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariable_declaration4947 = new BitSet(new long[]{0x0800001040000000L});
    public static final BitSet FOLLOW_30_in_rulevariable_declaration4966 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulevariable_declaration4979 = new BitSet(new long[]{0x0800001000000000L});
    public static final BitSet FOLLOW_59_in_rulevariable_declaration4995 = new BitSet(new long[]{0xF0000141402007A0L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_declaration5017 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevariable_declaration5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_entryRulevariable_initializer5081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_initializer5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulevariable_initializer5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulevariable_initializer5164 = new BitSet(new long[]{0xF0000341402007A0L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_initializer5187 = new BitSet(new long[]{0x0000020100000000L});
    public static final BitSet FOLLOW_32_in_rulevariable_initializer5206 = new BitSet(new long[]{0xF0000141402007A0L});
    public static final BitSet FOLLOW_rulevariable_initializer_in_rulevariable_initializer5228 = new BitSet(new long[]{0x0000020100000000L});
    public static final BitSet FOLLOW_32_in_rulevariable_initializer5249 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulevariable_initializer5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression5308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleliteral_expression_in_ruleexpression5367 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleexpression5420 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleexpression5468 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleexpression5516 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleexpression5566 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleexpression5619 = new BitSet(new long[]{0xF0000041402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression5641 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleexpression5659 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleexpression5707 = new BitSet(new long[]{0xF0000041402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression5729 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleexpression5747 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleexpression5795 = new BitSet(new long[]{0xF0000041402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression5817 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleexpression5870 = new BitSet(new long[]{0xF0000041402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression5892 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleexpression5945 = new BitSet(new long[]{0x000000003FC00020L});
    public static final BitSet FOLLOW_ruleclass_interface_name_in_ruleexpression5967 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearglist_in_entryRulearglist6043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearglist6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rulearglist6101 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_rulearglist6120 = new BitSet(new long[]{0xF0000041402007A0L});
    public static final BitSet FOLLOW_ruleexpression_in_rulearglist6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_entryRuleexpression_aux6190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_aux6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleexpression_aux6239 = new BitSet(new long[]{0xF00000C1402007A0L});
    public static final BitSet FOLLOW_rulearglist_in_ruleexpression_aux6262 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleexpression_aux6282 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleexpression_aux_in_ruleexpression_aux6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleliteral_expression_in_entryRuleliteral_expression6351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleliteral_expression6362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_LITERAL_in_ruleliteral_expression6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_LITERAL_in_ruleliteral_expression6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleliteral_expression6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_in_ruleliteral_expression6480 = new BitSet(new long[]{0x0000000000000002L});

}