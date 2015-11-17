package org.xtext.example.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleJavaLexer extends Lexer {
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
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=5;
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

    public InternalSimpleJavaLexer() {;} 
    public InternalSimpleJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSimpleJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:11:7: ( '.*;' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:11:9: '.*;'
            {
            match(".*;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:12:7: ( ';' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13:7: ( 'void' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:14:7: ( 'null' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:14:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:15:7: ( 'super' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:15:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:16:7: ( 'this' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:16:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:17:7: ( '++' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:17:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:18:7: ( '--' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:18:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:19:7: ( '&' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:19:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:20:7: ( '&=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:20:9: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:21:7: ( '|' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:21:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:22:7: ( '|=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:22:9: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:23:7: ( '^' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:23:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:24:7: ( '^=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:24:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:25:7: ( '&&' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:25:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:26:7: ( '||' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:26:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:27:7: ( '||=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:27:9: '||='
            {
            match("||="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:28:7: ( '%' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:28:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:29:7: ( '%=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:29:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:30:7: ( '>' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:30:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:31:7: ( '<' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:31:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:32:7: ( '>=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:32:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:33:7: ( '<=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:33:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:34:7: ( '==' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:34:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:35:7: ( '!=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:35:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:36:7: ( '>>=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:36:9: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:37:7: ( '<<' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:37:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:38:7: ( '>>' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:38:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:39:7: ( '>>>' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:39:9: '>>>'
            {
            match(">>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:40:7: ( '-' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:40:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:41:7: ( 'package' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:41:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:42:7: ( 'import' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:42:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:43:7: ( '/**' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:43:9: '/**'
            {
            match("/**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:44:7: ( '*/' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:44:9: '*/'
            {
            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:45:7: ( 'class' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:45:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:46:7: ( '{' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:46:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:47:7: ( '}' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:47:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:48:7: ( 'extends' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:48:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:49:7: ( 'implements' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:49:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:50:7: ( ',' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:50:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:51:7: ( 'interface' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:51:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:52:7: ( '(' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:52:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:53:7: ( ')' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:53:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:54:7: ( '[' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:54:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:55:7: ( ']' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:55:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:56:7: ( 'synchronized' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:56:9: 'synchronized'
            {
            match("synchronized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:57:7: ( 'return' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:57:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:58:7: ( 'throw' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:58:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:59:7: ( ':' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:59:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:60:7: ( 'break' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:60:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:61:7: ( 'continue' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:61:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:62:7: ( 'if' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:62:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:63:7: ( 'else' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:63:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:64:7: ( 'do' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:64:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:65:7: ( 'while' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:65:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:66:7: ( 'for' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:66:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:67:7: ( 'try' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:67:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:68:7: ( 'catch' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:68:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:69:7: ( 'finally' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:69:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:70:7: ( 'switch' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:70:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:71:7: ( 'case' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:71:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:72:7: ( 'default' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:72:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:73:7: ( 'static' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:73:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:74:7: ( 'new' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:74:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:75:7: ( '.' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:75:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:76:7: ( 'instanceof' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:76:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:77:7: ( '\"' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:77:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:78:7: ( '=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:78:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:79:7: ( '-=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:79:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:80:7: ( '*' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:80:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:81:7: ( '*=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:81:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:82:7: ( '/' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:82:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:83:7: ( '/=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:83:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:84:7: ( '?' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:84:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:85:7: ( '+' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:85:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:86:7: ( '+=' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:86:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:87:7: ( '!' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:87:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:88:7: ( 'true' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:88:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:89:7: ( 'false' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:89:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:90:7: ( '~' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:90:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:91:7: ( 'boolean' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:91:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:92:7: ( 'byte' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:92:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:93:7: ( 'char' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:93:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:94:8: ( 'short' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:94:10: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:95:8: ( 'int' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:95:10: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:96:8: ( 'float' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:96:10: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:97:8: ( 'long' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:97:10: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:98:8: ( 'double' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:98:10: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:99:8: ( 'public' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:99:10: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:100:8: ( 'private' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:100:10: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:101:8: ( 'protected' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:101:10: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:102:8: ( 'final' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:102:10: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:103:8: ( 'native' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:103:10: 'native'
            {
            match("native"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:104:8: ( 'abstract' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:104:10: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:105:8: ( 'threadsafe' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:105:10: 'threadsafe'
            {
            match("threadsafe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:106:8: ( 'transient' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:106:10: 'transient'
            {
            match("transient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "RULE_FLOAT_LITERAL"
    public final void mRULE_FLOAT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13762:20: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13762:22: ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            {
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13762:22: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13762:23: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('.'); 
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13762:38: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13762:39: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13762:50: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='E'||LA5_0=='e') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13762:51: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13762:61: ( '+' | '-' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='+'||LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13762:72: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13762:73: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_LITERAL"

    // $ANTLR start "RULE_EXPONENT_PART"
    public final void mRULE_EXPONENT_PART() throws RecognitionException {
        try {
            int _type = RULE_EXPONENT_PART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13764:20: ( 'e' ( '+' | '-' )? RULE_DECIMAL_DIGITS )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13764:22: 'e' ( '+' | '-' )? RULE_DECIMAL_DIGITS
            {
            match('e'); 
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13764:26: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_DECIMAL_DIGITS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT_PART"

    // $ANTLR start "RULE_FLOAT_TYPE_SUFFIX"
    public final void mRULE_FLOAT_TYPE_SUFFIX() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_TYPE_SUFFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13766:24: ( ( 'f' | 'd' ) )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13766:26: ( 'f' | 'd' )
            {
            if ( input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_TYPE_SUFFIX"

    // $ANTLR start "RULE_DECIMAL_DIGITS"
    public final void mRULE_DECIMAL_DIGITS() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_DIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13768:21: ( RULE_INT )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13768:23: RULE_INT
            {
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_DIGITS"

    // $ANTLR start "RULE_INTEGER_LITERAL"
    public final void mRULE_INTEGER_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13770:22: ( ( RULE_DECIMAL_DIGITS ( 'l' )? | '0x' ( '0' .. '9' | 'a' .. 'f' )+ ( 'l' )? ) )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13770:24: ( RULE_DECIMAL_DIGITS ( 'l' )? | '0x' ( '0' .. '9' | 'a' .. 'f' )+ ( 'l' )? )
            {
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13770:24: ( RULE_DECIMAL_DIGITS ( 'l' )? | '0x' ( '0' .. '9' | 'a' .. 'f' )+ ( 'l' )? )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='0') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='x') ) {
                    alt10=2;
                }
                else {
                    alt10=1;}
            }
            else if ( ((LA10_0>='1' && LA10_0<='9')) ) {
                alt10=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13770:25: RULE_DECIMAL_DIGITS ( 'l' )?
                    {
                    mRULE_DECIMAL_DIGITS(); 
                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13770:45: ( 'l' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='l') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13770:45: 'l'
                            {
                            match('l'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13770:50: '0x' ( '0' .. '9' | 'a' .. 'f' )+ ( 'l' )?
                    {
                    match("0x"); 

                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13770:55: ( '0' .. '9' | 'a' .. 'f' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='a' && LA8_0<='f')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13770:76: ( 'l' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='l') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13770:76: 'l'
                            {
                            match('l'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_LITERAL"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13772:17: ( RULE_ID )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13772:19: RULE_ID
            {
            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13774:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13774:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13774:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13774:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13774:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13776:10: ( ( '0' .. '9' )+ )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13776:12: ( '0' .. '9' )+
            {
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13776:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13776:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13778:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13778:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13778:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13778:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13778:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13778:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13778:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13778:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13778:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13778:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13778:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13780:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13780:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13780:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13780:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13782:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13782:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13782:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13782:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13782:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13782:41: ( '\\r' )? '\\n'
                    {
                    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13782:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13782:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13784:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13784:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13784:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13786:16: ( . )
            // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:13786:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | RULE_FLOAT_LITERAL | RULE_EXPONENT_PART | RULE_FLOAT_TYPE_SUFFIX | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=109;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:436: T__88
                {
                mT__88(); 

                }
                break;
            case 73 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:442: T__89
                {
                mT__89(); 

                }
                break;
            case 74 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:448: T__90
                {
                mT__90(); 

                }
                break;
            case 75 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:454: T__91
                {
                mT__91(); 

                }
                break;
            case 76 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:460: T__92
                {
                mT__92(); 

                }
                break;
            case 77 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:466: T__93
                {
                mT__93(); 

                }
                break;
            case 78 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:472: T__94
                {
                mT__94(); 

                }
                break;
            case 79 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:478: T__95
                {
                mT__95(); 

                }
                break;
            case 80 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:484: T__96
                {
                mT__96(); 

                }
                break;
            case 81 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:490: T__97
                {
                mT__97(); 

                }
                break;
            case 82 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:496: T__98
                {
                mT__98(); 

                }
                break;
            case 83 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:502: T__99
                {
                mT__99(); 

                }
                break;
            case 84 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:508: T__100
                {
                mT__100(); 

                }
                break;
            case 85 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:515: T__101
                {
                mT__101(); 

                }
                break;
            case 86 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:522: T__102
                {
                mT__102(); 

                }
                break;
            case 87 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:529: T__103
                {
                mT__103(); 

                }
                break;
            case 88 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:536: T__104
                {
                mT__104(); 

                }
                break;
            case 89 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:543: T__105
                {
                mT__105(); 

                }
                break;
            case 90 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:550: T__106
                {
                mT__106(); 

                }
                break;
            case 91 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:557: T__107
                {
                mT__107(); 

                }
                break;
            case 92 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:564: T__108
                {
                mT__108(); 

                }
                break;
            case 93 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:571: T__109
                {
                mT__109(); 

                }
                break;
            case 94 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:578: T__110
                {
                mT__110(); 

                }
                break;
            case 95 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:585: T__111
                {
                mT__111(); 

                }
                break;
            case 96 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:592: T__112
                {
                mT__112(); 

                }
                break;
            case 97 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:599: RULE_FLOAT_LITERAL
                {
                mRULE_FLOAT_LITERAL(); 

                }
                break;
            case 98 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:618: RULE_EXPONENT_PART
                {
                mRULE_EXPONENT_PART(); 

                }
                break;
            case 99 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:637: RULE_FLOAT_TYPE_SUFFIX
                {
                mRULE_FLOAT_TYPE_SUFFIX(); 

                }
                break;
            case 100 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:660: RULE_DECIMAL_DIGITS
                {
                mRULE_DECIMAL_DIGITS(); 

                }
                break;
            case 101 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:680: RULE_INTEGER_LITERAL
                {
                mRULE_INTEGER_LITERAL(); 

                }
                break;
            case 102 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:701: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 103 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:717: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 104 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:725: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 105 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:734: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 106 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:746: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 107 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:762: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 108 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:778: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 109 :
                // ../compiladores.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSimpleJava.g:1:786: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\1\60\1\uffff\4\64\1\101\1\104\1\107\1\112\1\115\1\117\1\122\1\125\1\127\1\131\2\64\1\143\1\146\1\64\2\uffff\1\64\5\uffff\1\64\1\uffff\1\64\1\175\1\64\1\175\1\u0083\2\uffff\2\64\2\u008a\1\64\1\56\5\uffff\2\64\1\uffff\12\64\12\uffff\1\u009d\2\uffff\1\64\4\uffff\1\u00a0\10\uffff\5\64\1\u00a8\7\uffff\4\64\2\uffff\2\64\1\160\6\uffff\1\64\1\uffff\3\64\1\u00b7\1\64\1\uffff\5\64\4\uffff\2\64\2\uffff\1\u008a\2\uffff\2\64\1\u00c2\10\64\1\u00cc\2\64\5\uffff\5\64\1\u00d6\1\64\1\uffff\1\u00d8\1\uffff\14\64\1\uffff\2\64\1\u00e7\5\64\1\u00ed\1\u00ee\1\uffff\6\64\1\u00f5\2\64\1\uffff\1\u00f8\10\64\1\uffff\1\64\1\uffff\3\64\1\u0105\1\u0106\1\64\1\u0108\3\64\1\u010c\3\64\1\uffff\3\64\1\u0113\1\64\2\uffff\1\64\1\u0116\3\64\1\u011a\1\uffff\1\u011b\1\64\1\uffff\11\64\1\u0126\1\64\1\u0128\2\uffff\1\64\1\uffff\1\64\1\u012b\1\64\1\uffff\2\64\1\u012f\1\u0131\1\u0132\1\u0133\1\uffff\1\64\1\u0135\1\uffff\1\64\1\u0137\1\u0138\2\uffff\3\64\1\u013c\2\64\1\u013f\3\64\1\uffff\1\64\1\uffff\1\64\1\u0145\1\uffff\1\64\1\u0147\1\64\1\uffff\1\64\3\uffff\1\64\1\uffff\1\64\2\uffff\2\64\1\u014e\1\uffff\1\u014f\1\64\1\uffff\4\64\1\u0155\1\uffff\1\u0156\1\uffff\1\u0157\1\u0158\4\64\2\uffff\4\64\1\u0161\4\uffff\1\u0162\2\64\1\u0165\1\u0166\1\64\1\u0168\1\64\2\uffff\1\64\1\u016b\2\uffff\1\u016c\1\uffff\1\u016d\1\64\3\uffff\1\u016f\1\uffff";
    static final String DFA22_eofS =
        "\u0170\uffff";
    static final String DFA22_minS =
        "\1\0\1\52\1\uffff\4\60\1\53\1\55\1\46\4\75\1\74\2\75\2\60\1\52\1\57\1\60\2\uffff\1\53\5\uffff\1\60\1\uffff\4\60\1\0\2\uffff\2\60\2\56\1\60\1\0\5\uffff\2\60\1\uffff\12\60\12\uffff\1\75\2\uffff\1\60\4\uffff\1\75\10\uffff\6\60\1\0\6\uffff\4\60\2\uffff\3\60\6\uffff\1\60\1\uffff\5\60\1\uffff\5\60\4\uffff\2\60\2\uffff\1\56\2\uffff\16\60\5\uffff\7\60\1\uffff\1\0\1\uffff\14\60\1\uffff\12\60\1\uffff\11\60\1\uffff\11\60\1\uffff\1\60\1\uffff\16\60\1\uffff\5\60\2\uffff\6\60\1\uffff\2\60\1\uffff\14\60\2\uffff\1\60\1\uffff\3\60\1\uffff\6\60\1\uffff\2\60\1\uffff\3\60\2\uffff\12\60\1\uffff\1\60\1\uffff\2\60\1\uffff\3\60\1\uffff\1\60\3\uffff\1\60\1\uffff\1\60\2\uffff\3\60\1\uffff\2\60\1\uffff\5\60\1\uffff\1\60\1\uffff\6\60\2\uffff\5\60\4\uffff\10\60\2\uffff\2\60\2\uffff\1\60\1\uffff\2\60\3\uffff\1\60\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\52\1\uffff\4\172\3\75\1\174\1\172\1\75\1\76\3\75\2\172\2\75\1\172\2\uffff\1\172\5\uffff\1\172\1\uffff\4\172\1\uffff\2\uffff\2\172\1\170\1\154\1\172\1\uffff\5\uffff\2\172\1\uffff\12\172\12\uffff\1\75\2\uffff\1\172\4\uffff\1\76\10\uffff\6\172\1\uffff\6\uffff\4\172\2\uffff\3\172\6\uffff\1\172\1\uffff\5\172\1\uffff\5\172\4\uffff\2\172\2\uffff\1\154\2\uffff\16\172\5\uffff\7\172\1\uffff\1\uffff\1\uffff\14\172\1\uffff\12\172\1\uffff\11\172\1\uffff\11\172\1\uffff\1\172\1\uffff\16\172\1\uffff\5\172\2\uffff\6\172\1\uffff\2\172\1\uffff\14\172\2\uffff\1\172\1\uffff\3\172\1\uffff\6\172\1\uffff\2\172\1\uffff\3\172\2\uffff\12\172\1\uffff\1\172\1\uffff\2\172\1\uffff\3\172\1\uffff\1\172\3\uffff\1\172\1\uffff\1\172\2\uffff\3\172\1\uffff\2\172\1\uffff\5\172\1\uffff\1\172\1\uffff\6\172\2\uffff\5\172\4\uffff\10\172\2\uffff\2\172\2\uffff\1\172\1\uffff\2\172\3\uffff\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\23\uffff\1\44\1\45\1\uffff\1\50\1\52\1\53\1\54\1\55\1\uffff\1\61\5\uffff\1\112\1\120\6\uffff\1\154\1\155\1\1\1\101\1\2\2\uffff\1\146\12\uffff\1\7\1\114\1\113\1\10\1\105\1\36\1\12\1\17\1\11\1\14\1\uffff\1\13\1\16\1\uffff\1\15\1\23\1\22\1\26\1\uffff\1\24\1\27\1\33\1\25\1\30\1\104\1\31\1\115\7\uffff\1\111\1\153\1\110\1\42\1\107\1\106\4\uffff\1\44\1\45\3\uffff\1\142\1\50\1\52\1\53\1\54\1\55\1\uffff\1\61\5\uffff\1\143\5\uffff\1\103\1\151\1\112\1\120\2\uffff\1\145\1\144\1\uffff\1\141\1\154\16\uffff\1\21\1\20\1\32\1\35\1\34\7\uffff\1\64\1\uffff\1\152\14\uffff\1\66\12\uffff\1\100\11\uffff\1\71\11\uffff\1\125\1\uffff\1\41\16\uffff\1\70\5\uffff\1\3\1\4\6\uffff\1\6\2\uffff\1\116\14\uffff\1\75\1\123\1\uffff\1\65\3\uffff\1\122\6\uffff\1\127\2\uffff\1\5\3\uffff\1\124\1\60\12\uffff\1\43\1\uffff\1\72\2\uffff\1\62\3\uffff\1\67\1\uffff\1\134\1\117\1\126\1\uffff\1\135\1\uffff\1\74\1\77\3\uffff\1\131\2\uffff\1\40\5\uffff\1\57\1\uffff\1\130\6\uffff\1\37\1\132\5\uffff\1\46\1\121\1\76\1\73\10\uffff\1\63\1\136\2\uffff\1\140\1\133\1\uffff\1\51\2\uffff\1\137\1\47\1\102\1\uffff\1\56";
    static final String DFA22_specialS =
        "\1\0\43\uffff\1\1\7\uffff\1\4\63\uffff\1\2\110\uffff\1\3\u00c6\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\20\1\44\2\56\1\14\1\11\1\54\1\32\1\33\1\24\1\7\1\31\1\10\1\1\1\23\1\51\11\52\1\37\1\2\1\16\1\17\1\15\1\45\1\56\32\53\1\34\1\56\1\35\1\13\1\53\1\56\1\50\1\40\1\25\1\41\1\30\1\43\2\53\1\22\2\53\1\47\1\53\1\4\1\53\1\21\1\53\1\36\1\5\1\6\1\53\1\3\1\42\3\53\1\26\1\12\1\27\1\46\uff81\56",
            "\1\57",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\62\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\67\3\63\1\66\17\63\1\65\5\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\7\63\1\74\13\63\1\73\1\70\1\63\1\72\1\63\1\71\1\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\7\63\1\75\11\63\1\76\10\63",
            "\1\77\21\uffff\1\100",
            "\1\102\17\uffff\1\103",
            "\1\106\26\uffff\1\105",
            "\1\110\76\uffff\1\111",
            "\1\113\3\uffff\32\114\4\uffff\1\114\1\uffff\32\114",
            "\1\116",
            "\1\120\1\121",
            "\1\124\1\123",
            "\1\126",
            "\1\130",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\132\20\63\1\134\2\63\1\133\5\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\5\63\1\137\6\63\1\135\1\136\14\63",
            "\1\140\4\uffff\1\142\15\uffff\1\141",
            "\1\144\15\uffff\1\145",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\151\6\63\1\152\3\63\1\147\2\63\1\150\13\63",
            "",
            "",
            "\1\160\1\uffff\1\160\2\uffff\12\157\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\156\13\63\1\155\2\63",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\166\25\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\171\2\63\1\170\6\63\1\172\1\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\174\11\63\1\173\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\7\63\1\176\22\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u0081\7\63\1\u0080\2\63\1\u0082\2\63\1\177\13\63",
            "\0\u0084",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\u0087\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\63\1\u0088\30\63",
            "\1\u008c\1\uffff\12\u008b\62\uffff\1\u0089\13\uffff\1\u0089",
            "\1\u008c\1\uffff\12\u008b\62\uffff\1\u0089",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\0\u0084",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u008e\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u008f\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\26\63\1\u0090\3\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0091\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\17\63\1\u0092\12\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u0093\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u0094\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u0095\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\u0096\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u0097\10\63\1\u0098\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u009b\23\63\1\u009a\3\63\1\u0099\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009c",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "\1\u009e\1\u009f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u00a1\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\63\1\u00a2\30\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u00a3\5\63\1\u00a4\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\17\63\1\u00a5\12\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u00a7\1\u00a6\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\52\u00aa\1\u00a9\uffd5\u00aa",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00ab\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u00ac\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u00ae\1\u00ad\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00af\31\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00b0\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u00b1\7\63",
            "\12\157\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00b2\6\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00b3\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\u00b4\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00b5\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u00b6\5\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\5\63\1\u00b8\24\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u00b9\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u00ba\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u00bb\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u00bc\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\u00bd\13\63",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u00be\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u00bf\7\63",
            "",
            "",
            "\1\u008c\1\uffff\12\u008b\62\uffff\1\u0089",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\3\63\1\u00c0\26\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u00c1\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u00c3\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00c4\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u00c5\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00c6\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00c7\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u00c8\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u00c9\7\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00cb\11\63\1\u00ca\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00cd\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u00ce\14\63",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\12\63\1\u00cf\17\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u00d0\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\25\63\1\u00d1\4\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00d2\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u00d4\2\63\1\u00d3\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00d5\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00d7\6\63",
            "",
            "\0\u00aa",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u00d9\7\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00da\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u00db\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00dc\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u00dd\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00de\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00df\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u00e0\5\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00e1\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u00e2\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00e3\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\63\1\u00e4\30\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00e5\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u00e6\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00e8\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u00e9\7\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00ea\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\6\63\1\u00eb\23\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00ec\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\25\63\1\u00ef\4\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u00f0\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\7\63\1\u00f1\22\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u00f2\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u00f3\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00f4\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\26\63\1\u00f6\3\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00f7\31\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u00f9\7\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00fa\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u00fb\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00fc\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00fd\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u00fe\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00ff\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u0100\10\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u0101\31\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u0102\7\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u0103\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\7\63\1\u0104\22\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u0107\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u0109\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\12\63\1\u010a\17\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u010b\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u010d\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u010e\5\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u010f\25\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u0110\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u0111\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0112\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u0114\10\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u0115\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u0117\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\7\63\1\u0118\22\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u0119\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\3\63\1\u011c\26\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u011d\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\6\63\1\u011e\23\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u011f\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0120\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u0121\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0122\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\14\63\1\u0123\15\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\5\63\1\u0124\24\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u0125\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u0127\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\3\63\1\u0129\26\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u012a\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u012c\31\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u012d\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u012e\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u0130\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u0134\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\u0136\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u0139\7\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u013a\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u013b\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u013d\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u013e\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u0140\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u0141\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u0142\27\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u0143\5\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u0144\7\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u0146\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0148\6\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\30\63\1\u0149\1\63",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u014a\27\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u014b\14\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u014c\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u014d\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u0150\25\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u0151\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u0152\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u0153\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u0154\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0159\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u015a\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\5\63\1\u015b\24\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u015c\6\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\3\63\1\u015d\26\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u015e\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u015f\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\u0160\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\31\63\1\u0163",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u0164\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u0167\7\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\5\63\1\u0169\24\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u016a\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\3\63\1\u016e\26\63",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | RULE_FLOAT_LITERAL | RULE_EXPONENT_PART | RULE_FLOAT_TYPE_SUFFIX | RULE_DECIMAL_DIGITS | RULE_INTEGER_LITERAL | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='.') ) {s = 1;}

                        else if ( (LA22_0==';') ) {s = 2;}

                        else if ( (LA22_0=='v') ) {s = 3;}

                        else if ( (LA22_0=='n') ) {s = 4;}

                        else if ( (LA22_0=='s') ) {s = 5;}

                        else if ( (LA22_0=='t') ) {s = 6;}

                        else if ( (LA22_0=='+') ) {s = 7;}

                        else if ( (LA22_0=='-') ) {s = 8;}

                        else if ( (LA22_0=='&') ) {s = 9;}

                        else if ( (LA22_0=='|') ) {s = 10;}

                        else if ( (LA22_0=='^') ) {s = 11;}

                        else if ( (LA22_0=='%') ) {s = 12;}

                        else if ( (LA22_0=='>') ) {s = 13;}

                        else if ( (LA22_0=='<') ) {s = 14;}

                        else if ( (LA22_0=='=') ) {s = 15;}

                        else if ( (LA22_0=='!') ) {s = 16;}

                        else if ( (LA22_0=='p') ) {s = 17;}

                        else if ( (LA22_0=='i') ) {s = 18;}

                        else if ( (LA22_0=='/') ) {s = 19;}

                        else if ( (LA22_0=='*') ) {s = 20;}

                        else if ( (LA22_0=='c') ) {s = 21;}

                        else if ( (LA22_0=='{') ) {s = 22;}

                        else if ( (LA22_0=='}') ) {s = 23;}

                        else if ( (LA22_0=='e') ) {s = 24;}

                        else if ( (LA22_0==',') ) {s = 25;}

                        else if ( (LA22_0=='(') ) {s = 26;}

                        else if ( (LA22_0==')') ) {s = 27;}

                        else if ( (LA22_0=='[') ) {s = 28;}

                        else if ( (LA22_0==']') ) {s = 29;}

                        else if ( (LA22_0=='r') ) {s = 30;}

                        else if ( (LA22_0==':') ) {s = 31;}

                        else if ( (LA22_0=='b') ) {s = 32;}

                        else if ( (LA22_0=='d') ) {s = 33;}

                        else if ( (LA22_0=='w') ) {s = 34;}

                        else if ( (LA22_0=='f') ) {s = 35;}

                        else if ( (LA22_0=='\"') ) {s = 36;}

                        else if ( (LA22_0=='?') ) {s = 37;}

                        else if ( (LA22_0=='~') ) {s = 38;}

                        else if ( (LA22_0=='l') ) {s = 39;}

                        else if ( (LA22_0=='a') ) {s = 40;}

                        else if ( (LA22_0=='0') ) {s = 41;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 42;}

                        else if ( ((LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='g' && LA22_0<='h')||(LA22_0>='j' && LA22_0<='k')||LA22_0=='m'||LA22_0=='o'||LA22_0=='q'||LA22_0=='u'||(LA22_0>='x' && LA22_0<='z')) ) {s = 43;}

                        else if ( (LA22_0=='\'') ) {s = 44;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 45;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||(LA22_0>='#' && LA22_0<='$')||LA22_0=='@'||LA22_0=='\\'||LA22_0=='`'||(LA22_0>='\u007F' && LA22_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_36 = input.LA(1);

                        s = -1;
                        if ( ((LA22_36>='\u0000' && LA22_36<='\uFFFF')) ) {s = 132;}

                        else s = 131;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_96 = input.LA(1);

                        s = -1;
                        if ( (LA22_96=='*') ) {s = 169;}

                        else if ( ((LA22_96>='\u0000' && LA22_96<=')')||(LA22_96>='+' && LA22_96<='\uFFFF')) ) {s = 170;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_169 = input.LA(1);

                        s = -1;
                        if ( ((LA22_169>='\u0000' && LA22_169<='\uFFFF')) ) {s = 170;}

                        else s = 216;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_44 = input.LA(1);

                        s = -1;
                        if ( ((LA22_44>='\u0000' && LA22_44<='\uFFFF')) ) {s = 132;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}