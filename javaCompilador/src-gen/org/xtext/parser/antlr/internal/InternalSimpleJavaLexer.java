package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleJavaLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__20=20;
    public static final int RULE_CHARACTER=10;
    public static final int RULE_INTEGER_LITERAL=7;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_DECIMAL_DIGITS=11;
    public static final int RULE_FLOAT_TYPE_SUFFIX=13;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_MODIFIER=6;
    public static final int RULE_WS=17;
    public static final int RULE_FLOAT_LITERAL=8;

    // delegates
    // delegators

    public InternalSimpleJavaLexer() {;} 
    public InternalSimpleJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSimpleJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:11:7: ( 'Hello' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:11:9: 'Hello'
            {
            match("Hello"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:12:7: ( '!' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:12:9: '!'
            {
            match('!'); 

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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:13:7: ( '.' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:13:9: '.'
            {
            match('.'); 

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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:14:7: ( 'boolean' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:14:9: 'boolean'
            {
            match("boolean"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:15:7: ( 'byte' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:15:9: 'byte'
            {
            match("byte"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:16:7: ( 'char' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:16:9: 'char'
            {
            match("char"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:17:7: ( 'short' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:17:9: 'short'
            {
            match("short"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:18:7: ( 'int' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:18:9: 'int'
            {
            match("int"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:19:7: ( 'float' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:19:9: 'float'
            {
            match("float"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:20:7: ( 'long' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:20:9: 'long'
            {
            match("long"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:21:7: ( 'double' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:21:9: 'double'
            {
            match("double"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:22:7: ( '[' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:22:9: '['
            {
            match('['); 

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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:23:7: ( ']' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:23:9: ']'
            {
            match(']'); 

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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:24:7: ( ',' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:24:9: ','
            {
            match(','); 

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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:25:7: ( '/**' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:25:9: '/**'
            {
            match("/**"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:26:7: ( '... text ...' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:26:9: '... text ...'
            {
            match("... text ..."); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:27:7: ( '*/' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:27:9: '*/'
            {
            match("*/"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:28:7: ( ';' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:28:9: ';'
            {
            match(';'); 

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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:29:7: ( 'static' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:29:9: 'static'
            {
            match("static"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:30:7: ( '(' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:30:9: '('
            {
            match('('); 

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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:31:7: ( ')' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:31:9: ')'
            {
            match(')'); 

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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:32:7: ( '{' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:32:9: '{'
            {
            match('{'); 

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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:33:7: ( '}' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:33:9: '}'
            {
            match('}'); 

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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:34:7: ( 'if' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:34:9: 'if'
            {
            match("if"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:35:7: ( 'else' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:35:9: 'else'
            {
            match("else"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:36:7: ( 'do' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:36:9: 'do'
            {
            match("do"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:37:7: ( 'while' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:37:9: 'while'
            {
            match("while"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:38:7: ( 'for' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:38:9: 'for'
            {
            match("for"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:39:7: ( 'try' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:39:9: 'try'
            {
            match("try"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:40:7: ( 'catch' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:40:9: 'catch'
            {
            match("catch"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:41:7: ( 'finally' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:41:9: 'finally'
            {
            match("finally"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:42:7: ( 'switch' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:42:9: 'switch'
            {
            match("switch"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:43:7: ( 'case' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:43:9: 'case'
            {
            match("case"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:44:7: ( ':' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:44:9: ':'
            {
            match(':'); 

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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:45:7: ( 'default' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:45:9: 'default'
            {
            match("default"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:46:7: ( 'synchronized' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:46:9: 'synchronized'
            {
            match("synchronized"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:47:7: ( 'return' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:47:9: 'return'
            {
            match("return"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:48:7: ( 'throw' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:48:9: 'throw'
            {
            match("throw"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:49:7: ( 'break' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:49:9: 'break'
            {
            match("break"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:50:7: ( 'continue' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:50:9: 'continue'
            {
            match("continue"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:51:7: ( '=' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:51:9: '='
            {
            match('='); 

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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:52:7: ( 'null' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:52:9: 'null'
            {
            match("null"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:53:7: ( 'super' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:53:9: 'super'
            {
            match("super"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:54:7: ( 'this' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:54:9: 'this'
            {
            match("this"); 


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:55:7: ( 'instanceof' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:55:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2351:13: ( '\\'\\'' ( RULE_CHARACTER )? '\\'\\'' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2351:15: '\\'\\'' ( RULE_CHARACTER )? '\\'\\''
            {
            match("''"); 

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2351:22: ( RULE_CHARACTER )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='b') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2351:22: RULE_CHARACTER
                    {
                    mRULE_CHARACTER(); 

                    }
                    break;

            }

            match("''"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_CHARACTER"
    public final void mRULE_CHARACTER() throws RecognitionException {
        try {
            int _type = RULE_CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2353:16: ( 'based on the unicode character set' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2353:18: 'based on the unicode character set'
            {
            match("based on the unicode character set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHARACTER"

    // $ANTLR start "RULE_FLOAT_LITERAL"
    public final void mRULE_FLOAT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:20: ( ( RULE_DECIMAL_DIGITS '.' ( RULE_DECIMAL_DIGITS )? ( RULE_EXPONENT_PART )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' RULE_DECIMAL_DIGITS ( RULE_EXPONENT_PART )? ( RULE_FLOAT_TYPE_SUFFIX )? | RULE_DECIMAL_DIGITS ( RULE_EXPONENT_PART )? ( RULE_DECIMAL_DIGITS )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:22: ( RULE_DECIMAL_DIGITS '.' ( RULE_DECIMAL_DIGITS )? ( RULE_EXPONENT_PART )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' RULE_DECIMAL_DIGITS ( RULE_EXPONENT_PART )? ( RULE_FLOAT_TYPE_SUFFIX )? | RULE_DECIMAL_DIGITS ( RULE_EXPONENT_PART )? ( RULE_DECIMAL_DIGITS )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:22: ( RULE_DECIMAL_DIGITS '.' ( RULE_DECIMAL_DIGITS )? ( RULE_EXPONENT_PART )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' RULE_DECIMAL_DIGITS ( RULE_EXPONENT_PART )? ( RULE_FLOAT_TYPE_SUFFIX )? | RULE_DECIMAL_DIGITS ( RULE_EXPONENT_PART )? ( RULE_DECIMAL_DIGITS )? )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                switch ( input.LA(2) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3=='.') ) {
                        alt9=1;
                    }
                    else {
                        alt9=3;}
                    }
                    break;
                case '.':
                    {
                    alt9=1;
                    }
                    break;
                default:
                    alt9=3;}

            }
            else if ( (LA9_0=='.') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:23: RULE_DECIMAL_DIGITS '.' ( RULE_DECIMAL_DIGITS )? ( RULE_EXPONENT_PART )? ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    mRULE_DECIMAL_DIGITS(); 
                    match('.'); 
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:47: ( RULE_DECIMAL_DIGITS )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:47: RULE_DECIMAL_DIGITS
                            {
                            mRULE_DECIMAL_DIGITS(); 

                            }
                            break;

                    }

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:68: ( RULE_EXPONENT_PART )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='e') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:68: RULE_EXPONENT_PART
                            {
                            mRULE_EXPONENT_PART(); 

                            }
                            break;

                    }

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:88: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='d'||LA4_0=='f') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:88: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:112: '.' RULE_DECIMAL_DIGITS ( RULE_EXPONENT_PART )? ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    match('.'); 
                    mRULE_DECIMAL_DIGITS(); 
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:136: ( RULE_EXPONENT_PART )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:136: RULE_EXPONENT_PART
                            {
                            mRULE_EXPONENT_PART(); 

                            }
                            break;

                    }

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:156: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='d'||LA6_0=='f') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:156: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:180: RULE_DECIMAL_DIGITS ( RULE_EXPONENT_PART )? ( RULE_DECIMAL_DIGITS )?
                    {
                    mRULE_DECIMAL_DIGITS(); 
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:200: ( RULE_EXPONENT_PART )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:200: RULE_EXPONENT_PART
                            {
                            mRULE_EXPONENT_PART(); 

                            }
                            break;

                    }

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:220: ( RULE_DECIMAL_DIGITS )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2355:220: RULE_DECIMAL_DIGITS
                            {
                            mRULE_DECIMAL_DIGITS(); 

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
    // $ANTLR end "RULE_FLOAT_LITERAL"

    // $ANTLR start "RULE_DECIMAL_DIGITS"
    public final void mRULE_DECIMAL_DIGITS() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_DIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2357:21: ( '0' .. '9' ( '0' .. '9' )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2357:23: '0' .. '9' ( '0' .. '9' )?
            {
            matchRange('0','9'); 
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2357:32: ( '0' .. '9' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2357:33: '0' .. '9'
                    {
                    matchRange('0','9'); 

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
    // $ANTLR end "RULE_DECIMAL_DIGITS"

    // $ANTLR start "RULE_EXPONENT_PART"
    public final void mRULE_EXPONENT_PART() throws RecognitionException {
        try {
            int _type = RULE_EXPONENT_PART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2359:20: ( 'e' ( '+' | '-' )? RULE_DECIMAL_DIGITS )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2359:22: 'e' ( '+' | '-' )? RULE_DECIMAL_DIGITS
            {
            match('e'); 
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2359:26: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='+'||LA11_0=='-') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2361:24: ( ( 'f' | 'd' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2361:26: ( 'f' | 'd' )
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

    // $ANTLR start "RULE_INTEGER_LITERAL"
    public final void mRULE_INTEGER_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:22: ( ( '1' .. '9' ( '0' .. '9' )? ( 'l' )? | ( '0' .. '7' )? ( 'l' )? | '0' 'x' ( '0' .. '9' 'a' .. 'f' )+ ( 'l' )? ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:24: ( '1' .. '9' ( '0' .. '9' )? ( 'l' )? | ( '0' .. '7' )? ( 'l' )? | '0' 'x' ( '0' .. '9' 'a' .. 'f' )+ ( 'l' )? )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:24: ( '1' .. '9' ( '0' .. '9' )? ( 'l' )? | ( '0' .. '7' )? ( 'l' )? | '0' 'x' ( '0' .. '9' 'a' .. 'f' )+ ( 'l' )? )
            int alt18=3;
            switch ( input.LA(1) ) {
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt18=1;
                }
                break;
            case '0':
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2=='x') ) {
                    alt18=3;
                }
                else {
                    alt18=2;}
                }
                break;
            default:
                alt18=2;}

            switch (alt18) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:25: '1' .. '9' ( '0' .. '9' )? ( 'l' )?
                    {
                    matchRange('1','9'); 
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:34: ( '0' .. '9' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:35: '0' .. '9'
                            {
                            matchRange('0','9'); 

                            }
                            break;

                    }

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:46: ( 'l' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='l') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:46: 'l'
                            {
                            match('l'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:51: ( '0' .. '7' )? ( 'l' )?
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:51: ( '0' .. '7' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>='0' && LA14_0<='7')) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:52: '0' .. '7'
                            {
                            matchRange('0','7'); 

                            }
                            break;

                    }

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:63: ( 'l' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='l') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:63: 'l'
                            {
                            match('l'); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:68: '0' 'x' ( '0' .. '9' 'a' .. 'f' )+ ( 'l' )?
                    {
                    match('0'); 
                    match('x'); 
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:76: ( '0' .. '9' 'a' .. 'f' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:77: '0' .. '9' 'a' .. 'f'
                    	    {
                    	    matchRange('0','9'); 
                    	    matchRange('a','f'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:97: ( 'l' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='l') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2363:97: 'l'
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

    // $ANTLR start "RULE_MODIFIER"
    public final void mRULE_MODIFIER() throws RecognitionException {
        try {
            int _type = RULE_MODIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2365:15: ( ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' ) )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2365:17: ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2365:17: ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            int alt19=10;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2365:18: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 2 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2365:27: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 3 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2365:37: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 4 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2365:49: 'static'
                    {
                    match("static"); 


                    }
                    break;
                case 5 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2365:58: 'final'
                    {
                    match("final"); 


                    }
                    break;
                case 6 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2365:66: 'native'
                    {
                    match("native"); 


                    }
                    break;
                case 7 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2365:75: 'synchronized'
                    {
                    match("synchronized"); 


                    }
                    break;
                case 8 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2365:90: 'abstract'
                    {
                    match("abstract"); 


                    }
                    break;
                case 9 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2365:101: 'threadsafe'
                    {
                    match("threadsafe"); 


                    }
                    break;
                case 10 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2365:114: 'transient'
                    {
                    match("transient"); 


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
    // $ANTLR end "RULE_MODIFIER"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2367:17: ( ( 'a' .. 'z' | '_' | '$' ) ( 'a' .. 'z' | '_' | '$' | '0' .. '9' | 'unicode character over 00C0' )+ )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2367:19: ( 'a' .. 'z' | '_' | '$' ) ( 'a' .. 'z' | '_' | '$' | '0' .. '9' | 'unicode character over 00C0' )+
            {
            if ( input.LA(1)=='$'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2367:38: ( 'a' .. 'z' | '_' | '$' | '0' .. '9' | 'unicode character over 00C0' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=6;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2367:39: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2367:48: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2367:52: '$'
            	    {
            	    match('$'); 

            	    }
            	    break;
            	case 4 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2367:56: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 5 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2367:65: 'unicode character over 00C0'
            	    {
            	    match("unicode character over 00C0"); 


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2369:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2369:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2369:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2369:11: '^'
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

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2369:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:
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
            	    break loop22;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2371:10: ( ( '0' .. '9' )+ )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2371:12: ( '0' .. '9' )+
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2371:12: ( '0' .. '9' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2371:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2373:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2373:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2373:24: ( options {greedy=false; } : . )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='*') ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1=='/') ) {
                        alt24=2;
                    }
                    else if ( ((LA24_1>='\u0000' && LA24_1<='.')||(LA24_1>='0' && LA24_1<='\uFFFF')) ) {
                        alt24=1;
                    }


                }
                else if ( ((LA24_0>='\u0000' && LA24_0<=')')||(LA24_0>='+' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2373:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop24;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2375:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2375:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2375:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2375:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop25;
                }
            } while (true);

            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2375:40: ( ( '\\r' )? '\\n' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\n'||LA27_0=='\r') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2375:41: ( '\\r' )? '\\n'
                    {
                    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2375:41: ( '\\r' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='\r') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2375:41: '\\r'
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2377:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2377:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2377:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:
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
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2379:16: ( . )
            // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:2379:18: .
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
        // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | RULE_STRING | RULE_CHARACTER | RULE_FLOAT_LITERAL | RULE_DECIMAL_DIGITS | RULE_EXPONENT_PART | RULE_FLOAT_TYPE_SUFFIX | RULE_INTEGER_LITERAL | RULE_MODIFIER | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt29=60;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:154: T__43
                {
                mT__43(); 

                }
                break;
            case 26 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:160: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:166: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:172: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:178: T__47
                {
                mT__47(); 

                }
                break;
            case 30 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:184: T__48
                {
                mT__48(); 

                }
                break;
            case 31 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:190: T__49
                {
                mT__49(); 

                }
                break;
            case 32 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:196: T__50
                {
                mT__50(); 

                }
                break;
            case 33 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:202: T__51
                {
                mT__51(); 

                }
                break;
            case 34 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:208: T__52
                {
                mT__52(); 

                }
                break;
            case 35 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:214: T__53
                {
                mT__53(); 

                }
                break;
            case 36 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:220: T__54
                {
                mT__54(); 

                }
                break;
            case 37 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:226: T__55
                {
                mT__55(); 

                }
                break;
            case 38 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:232: T__56
                {
                mT__56(); 

                }
                break;
            case 39 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:238: T__57
                {
                mT__57(); 

                }
                break;
            case 40 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:244: T__58
                {
                mT__58(); 

                }
                break;
            case 41 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:250: T__59
                {
                mT__59(); 

                }
                break;
            case 42 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:256: T__60
                {
                mT__60(); 

                }
                break;
            case 43 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:262: T__61
                {
                mT__61(); 

                }
                break;
            case 44 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:268: T__62
                {
                mT__62(); 

                }
                break;
            case 45 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:274: T__63
                {
                mT__63(); 

                }
                break;
            case 46 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:280: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:292: RULE_CHARACTER
                {
                mRULE_CHARACTER(); 

                }
                break;
            case 48 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:307: RULE_FLOAT_LITERAL
                {
                mRULE_FLOAT_LITERAL(); 

                }
                break;
            case 49 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:326: RULE_DECIMAL_DIGITS
                {
                mRULE_DECIMAL_DIGITS(); 

                }
                break;
            case 50 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:346: RULE_EXPONENT_PART
                {
                mRULE_EXPONENT_PART(); 

                }
                break;
            case 51 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:365: RULE_FLOAT_TYPE_SUFFIX
                {
                mRULE_FLOAT_TYPE_SUFFIX(); 

                }
                break;
            case 52 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:388: RULE_INTEGER_LITERAL
                {
                mRULE_INTEGER_LITERAL(); 

                }
                break;
            case 53 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:409: RULE_MODIFIER
                {
                mRULE_MODIFIER(); 

                }
                break;
            case 54 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:423: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 55 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:439: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 56 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:447: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 57 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:456: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 58 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:472: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 59 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:488: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 60 :
                // ../javaCompilador/src-gen/org/xtext/parser/antlr/internal/InternalSimpleJava.g:1:496: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA19_eotS =
        "\17\uffff";
    static final String DFA19_eofS =
        "\17\uffff";
    static final String DFA19_minS =
        "\1\141\1\162\1\164\3\uffff\1\150\1\uffff\1\151\6\uffff";
    static final String DFA19_maxS =
        "\1\164\1\165\1\171\3\uffff\1\162\1\uffff\1\157\6\uffff";
    static final String DFA19_acceptS =
        "\3\uffff\1\5\1\6\1\10\1\uffff\1\1\1\uffff\1\4\1\7\1\11\1\12\1\2\1\3";
    static final String DFA19_specialS =
        "\17\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\5\4\uffff\1\3\7\uffff\1\4\1\uffff\1\1\2\uffff\1\2\1\6",
            "\1\10\2\uffff\1\7",
            "\1\11\4\uffff\1\12",
            "",
            "",
            "",
            "\1\13\11\uffff\1\14",
            "",
            "\1\15\5\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "2365:17: ( 'public' | 'private' | 'protected' | 'static' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )";
        }
    }
    static final String DFA20_eotS =
        "\1\1\1\uffff\1\6\4\uffff\6\6\1\uffff";
    static final String DFA20_eofS =
        "\16\uffff";
    static final String DFA20_minS =
        "\1\44\1\uffff\1\156\4\uffff\1\151\1\143\1\157\1\144\1\145\1\40\1\uffff";
    static final String DFA20_maxS =
        "\1\172\1\uffff\1\156\4\uffff\1\151\1\143\1\157\1\144\1\145\1\40\1\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\6\1\uffff\1\2\1\3\1\4\1\1\6\uffff\1\5";
    static final String DFA20_specialS =
        "\16\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\4\13\uffff\12\5\45\uffff\1\3\1\uffff\24\6\1\2\5\6",
            "",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()+ loopback of 2367:38: ( 'a' .. 'z' | '_' | '$' | '0' .. '9' | 'unicode character over 00C0' )+";
        }
    }
    static final String DFA29_eotS =
        "\1\40\1\52\1\uffff\1\55\4\52\1\105\1\40\1\105\3\uffff\2\50\5\uffff\3\52\1\uffff\1\52\1\uffff\1\52\1\50\3\56\1\uffff\3\52\2\50\3\uffff\1\52\5\uffff\7\66\1\uffff\12\66\1\167\3\66\1\uffff\1\66\1\175\1\66\13\uffff\1\66\1\uffff\1\125\3\66\1\uffff\1\66\1\uffff\2\66\1\uffff\2\56\3\66\1\uffff\1\52\16\66\1\u009f\1\66\1\uffff\1\66\1\u00a2\3\66\1\uffff\1\66\1\u00a7\1\uffff\1\66\1\125\1\66\1\u00aa\6\66\1\56\4\66\1\52\1\66\1\u00b9\3\66\1\u00bd\1\66\1\u00bf\6\66\1\uffff\2\66\1\uffff\1\66\1\u00c9\2\66\1\uffff\1\u00cc\1\66\1\uffff\3\66\1\u00d1\1\66\1\u00d3\1\66\1\56\4\66\1\u00da\1\66\1\uffff\1\u00dc\2\66\1\uffff\1\u00df\1\uffff\1\66\1\u00e1\3\66\1\u00e5\1\66\1\u00e7\1\u00e9\1\uffff\2\66\1\uffff\1\u00ec\1\66\1\u00ee\1\66\1\uffff\1\66\1\uffff\1\66\1\uffff\4\66\1\uffff\1\66\2\uffff\1\66\1\uffff\1\66\1\uffff\1\u00f9\1\u00fa\1\66\1\uffff\1\66\1\uffff\1\66\1\uffff\1\u00fe\1\66\1\uffff\1\66\1\uffff\1\66\1\u0102\2\u00e9\3\66\1\u0106\2\66\2\uffff\2\66\1\u010b\1\uffff\1\u010c\2\66\1\uffff\1\u00e9\2\66\1\uffff\1\66\1\u0111\2\66\2\uffff\3\66\1\u00e9\1\uffff\2\66\1\u00e9\1\66\1\u00e9\1\66\1\u011b\1\u00e9\1\66\1\uffff\1\u011d\1\uffff";
    static final String DFA29_eofS =
        "\u011e\uffff";
    static final String DFA29_minS =
        "\1\0\1\145\1\uffff\1\56\7\44\3\uffff\1\52\1\57\5\uffff\3\44\1\uffff\1\44\1\uffff\1\44\1\47\3\60\1\uffff\3\44\1\101\1\44\3\uffff\1\154\5\uffff\7\60\1\uffff\12\60\1\44\3\60\1\uffff\1\60\1\44\1\60\3\uffff\1\0\7\uffff\1\60\1\uffff\1\44\3\60\1\uffff\1\60\1\uffff\2\60\1\uffff\5\60\1\uffff\1\154\16\60\1\44\1\60\1\uffff\1\60\1\44\3\60\1\uffff\1\60\1\0\1\uffff\1\60\1\44\1\60\1\44\13\60\1\157\1\60\1\44\3\60\1\44\1\60\1\44\6\60\1\uffff\2\60\1\uffff\1\60\1\44\2\60\1\uffff\1\44\1\60\1\uffff\3\60\1\44\1\60\1\44\10\60\1\uffff\1\44\1\40\1\60\1\uffff\1\44\1\uffff\1\60\1\44\3\60\1\44\1\60\2\44\1\uffff\2\60\1\uffff\1\44\1\60\1\44\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\4\60\1\uffff\1\60\2\uffff\1\60\1\uffff\1\60\1\uffff\2\44\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\44\1\60\1\uffff\1\60\1\uffff\1\60\3\44\3\60\1\44\2\60\2\uffff\2\60\1\44\1\uffff\1\44\2\60\1\uffff\1\44\2\60\1\uffff\1\60\1\44\2\60\2\uffff\3\60\1\44\1\uffff\2\60\1\44\1\60\1\44\1\60\2\44\1\60\1\uffff\1\44\1\uffff";
    static final String DFA29_maxS =
        "\1\uffff\1\145\1\uffff\1\71\7\172\3\uffff\2\57\5\uffff\3\172\1\uffff\1\172\1\uffff\1\172\1\47\1\154\1\170\1\154\1\uffff\5\172\3\uffff\1\154\5\uffff\7\172\1\uffff\16\172\1\uffff\3\172\3\uffff\1\uffff\7\uffff\1\172\1\uffff\4\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\154\1\71\3\172\1\uffff\1\154\20\172\1\uffff\5\172\1\uffff\1\172\1\uffff\1\uffff\12\172\1\71\4\172\1\157\16\172\1\uffff\2\172\1\uffff\4\172\1\uffff\2\172\1\uffff\7\172\1\71\6\172\1\uffff\3\172\1\uffff\1\172\1\uffff\11\172\1\uffff\2\172\1\uffff\4\172\1\uffff\1\172\1\uffff\1\172\1\uffff\4\172\1\uffff\1\172\2\uffff\1\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\172\1\uffff\12\172\2\uffff\3\172\1\uffff\3\172\1\uffff\3\172\1\uffff\4\172\2\uffff\4\172\1\uffff\11\172\1\uffff\1\172\1\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\10\uffff\1\14\1\15\1\16\2\uffff\1\22\1\24\1\25\1\26\1\27\3\uffff\1\42\1\uffff\1\51\5\uffff\1\64\5\uffff\1\67\1\73\1\74\1\uffff\1\67\1\2\1\20\1\3\1\60\7\uffff\1\66\16\uffff\1\63\3\uffff\1\14\1\15\1\16\1\uffff\1\72\1\21\1\22\1\24\1\25\1\26\1\27\1\uffff\1\62\4\uffff\1\42\1\uffff\1\51\2\uffff\1\56\5\uffff\1\73\21\uffff\1\30\5\uffff\1\32\2\uffff\1\71\36\uffff\1\10\2\uffff\1\34\4\uffff\1\17\2\uffff\1\35\16\uffff\1\5\3\uffff\1\6\1\uffff\1\41\11\uffff\1\12\2\uffff\1\31\4\uffff\1\54\1\uffff\1\52\1\uffff\1\70\4\uffff\1\1\1\uffff\1\47\1\57\1\uffff\1\36\1\uffff\1\7\3\uffff\1\53\1\uffff\1\11\1\uffff\1\65\2\uffff\1\33\1\uffff\1\46\12\uffff\1\23\1\40\3\uffff\1\13\3\uffff\1\45\3\uffff\1\4\4\uffff\1\37\1\43\4\uffff\1\50\11\uffff\1\55\1\uffff\1\44";
    static final String DFA29_specialS =
        "\1\1\113\uffff\1\0\62\uffff\1\2\u009e\uffff}>";
    static final String[] DFA29_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\47\1\2\2\50\1\45\2\50\1\34\1\21\1\22\1\17\1\50\1\15\1\50\1\3\1\16\1\36\7\35\2\37\1\30\1\20\1\50\1\32\3\50\7\46\1\1\22\46\1\13\1\50\1\14\1\44\1\43\1\50\1\42\1\4\1\5\1\12\1\25\1\10\2\43\1\7\2\43\1\11\1\43\1\33\1\43\1\41\1\43\1\31\1\6\1\27\2\43\1\26\3\43\1\23\1\50\1\24\uff82\50",
            "\1\51",
            "",
            "\1\54\1\uffff\12\56",
            "\1\66\13\uffff\12\65\45\uffff\1\64\1\uffff\1\62\15\67\1\57\2\67\1\61\2\67\1\63\3\67\1\60\1\67",
            "\1\66\13\uffff\12\65\45\uffff\1\64\1\uffff\1\71\6\67\1\70\6\67\1\72\5\67\1\63\5\67",
            "\1\66\13\uffff\12\65\45\uffff\1\64\1\uffff\7\67\1\73\13\67\1\74\1\77\1\67\1\75\1\67\1\76\1\67",
            "\1\66\13\uffff\12\65\45\uffff\1\64\1\uffff\5\67\1\101\7\67\1\100\6\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\10\67\1\104\2\67\1\102\2\67\1\103\5\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\16\67\1\106\5\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\110\11\67\1\107\5\67\1\63\5\67",
            "",
            "",
            "",
            "\1\114\4\uffff\1\115",
            "\1\116",
            "",
            "",
            "",
            "",
            "",
            "\1\66\6\uffff\1\125\1\uffff\1\125\2\uffff\12\126\45\uffff\1\64\1\uffff\13\67\1\124\10\67\1\63\5\67",
            "\1\66\13\uffff\12\65\45\uffff\1\64\1\uffff\7\67\1\127\14\67\1\63\5\67",
            "\1\66\13\uffff\12\65\45\uffff\1\64\1\uffff\7\67\1\131\11\67\1\130\2\67\1\63\5\67",
            "",
            "\1\66\13\uffff\12\65\45\uffff\1\64\1\uffff\4\67\1\133\17\67\1\63\5\67",
            "",
            "\1\66\13\uffff\12\65\45\uffff\1\64\1\uffff\1\136\23\67\1\135\5\67",
            "\1\137",
            "\12\140\62\uffff\1\40",
            "\12\141\62\uffff\1\40\13\uffff\1\40",
            "\12\140\62\uffff\1\40",
            "",
            "\1\66\13\uffff\12\65\45\uffff\1\64\1\uffff\21\67\1\143\2\67\1\142\5\67",
            "\1\66\13\uffff\12\65\45\uffff\1\64\1\uffff\1\67\1\144\22\67\1\63\5\67",
            "\1\66\13\uffff\12\65\45\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\66\13\uffff\12\66\45\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "\1\146",
            "",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\16\67\1\147\5\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\150\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\151\17\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\22\67\1\152\1\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\153\6\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\154\23\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\22\67\1\156\1\155\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\157\6\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\16\67\1\160\5\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\161\23\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\10\67\1\162\13\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\163\6\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\153\1\67\1\164\4\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\22\67\1\166\1\165\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\16\67\1\170\5\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\21\67\1\171\2\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\172\6\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\173\6\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\174\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\5\67\1\176\16\67\1\63\5\67",
            "",
            "",
            "",
            "\52\u0080\1\177\uffd5\u0080",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\22\67\1\u0081\1\67\1\63\5\67",
            "",
            "\1\66\13\uffff\12\u0082\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\10\67\1\u0083\13\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\u0085\23\67\1\63\3\67\1\u0084\1\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\10\67\1\u0087\10\67\1\u0086\2\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u0088\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\13\67\1\u0089\1\67\1\153\6\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u008a\1\63\5\67",
            "",
            "\12\u008b\62\uffff\1\40",
            "\12\u008b",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\67\1\u008c\13\67\1\153\6\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\10\67\1\u008d\5\67\1\u008e\5\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\22\67\1\u008f\1\67\1\63\5\67",
            "",
            "\1\u0090",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\13\67\1\u0091\10\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u0092\17\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\u0093\23\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u0094\17\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\10\67\1\u0095\13\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\21\67\1\u0096\2\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\2\67\1\u0097\21\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u0098\17\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u0099\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\21\67\1\u009a\2\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u009b\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u009c\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\2\67\1\u009d\21\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u009e\17\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u00a0\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\u00a1\23\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\u00a3\23\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\6\67\1\u00a4\15\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\67\1\u00a5\13\67\1\153\6\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\u00a6\23\67\1\63\5\67",
            "\0\u0080",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u00a8\17\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\13\67\1\u00a9\10\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\u00ab\6\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u00ad\11\67\1\u00ac\5\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\22\67\1\u00ae\1\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\u00af\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\13\67\1\u00b0\10\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\10\67\1\u00b1\13\67\1\63\5\67",
            "\12\u00b2",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\13\67\1\u00b3\10\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\1\u00b4\4\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u00b5\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u00b6\1\63\5\67",
            "\1\u00b7",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u00b8\17\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\12\67\1\u00ba\11\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\3\67\1\u00bb\20\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\2\67\1\u00bc\21\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\7\67\1\u00be\14\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\10\67\1\u00c0\13\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u00c1\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\10\67\1\u00c2\13\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\2\67\1\u00c3\21\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\7\67\1\u00c4\14\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\21\67\1\u00c5\2\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\u00c6\23\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u00c7\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\13\67\1\u00c8\10\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\13\67\1\u00ca\10\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\u00cb\5\67",
            "",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u00cd\17\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\22\67\1\u00ce\1\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\1\67\1\u00cf\3\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\u00d0\23\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\153\3\67\1\u00d2\2\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\1\u00d4\4\67",
            "\12\u00d5",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\10\67\1\u00d6\13\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\u00d7\23\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u00d8\17\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\21\67\1\u00d9\2\67\1\63\5\67",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\u00db\23\67\1\63\5\67",
            "",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\1\u00dd\17\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\16\67\1\u00de\5\67\1\63\5\67",
            "",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\u00e0\6\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\2\67\1\u00e2\21\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\7\67\1\u00e3\14\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\21\67\1\u00e4\2\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\u00e6\6\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\13\67\1\u00e8\10\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u00ea\17\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\13\67\1\u00eb\1\67\1\153\6\67\1\63\5\67",
            "",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\10\67\1\u00ed\13\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\3\67\1\u00ef\20\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\u00f0\6\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u00f1\17\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\2\67\1\u00f2\21\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u00f3\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\2\67\1\u00f4\21\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\u00f5\23\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\u00f6\6\67\1\63\5\67",
            "",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\3\67\1\u00f7\20\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\u00f8\5\67",
            "",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\16\67\1\u00fb\5\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\2\67\1\u00fc\21\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\3\67\1\u00fd\1\67",
            "",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u00ff\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u0100\17\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\22\67\1\u0101\1\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u0103\17\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u0104\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\2\67\1\u0105\21\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u0107\17\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u0108\10\67\1\153\6\67\1\63\5\67",
            "",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\u0109\6\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u010a\17\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\15\67\1\u010d\6\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\1\u010e\23\67\1\63\5\67",
            "",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u010f\17\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u0110\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\10\67\1\u0112\13\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\16\67\1\u0113\5\67\1\63\5\67",
            "",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\23\67\1\u0114\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\5\67\1\u0115\16\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\3\67\1\u0116\20\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\4\67\1\u0117",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\5\67\1\u0118\16\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u0119\17\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\4\67\1\u011a\17\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
            "\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\3\67\1\u011c\20\67\1\63\5\67",
            "",
            "\1\66\13\uffff\12\65\7\uffff\32\52\4\uffff\1\64\1\uffff\24\67\1\63\5\67",
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
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | RULE_STRING | RULE_CHARACTER | RULE_FLOAT_LITERAL | RULE_DECIMAL_DIGITS | RULE_EXPONENT_PART | RULE_FLOAT_TYPE_SUFFIX | RULE_INTEGER_LITERAL | RULE_MODIFIER | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_76 = input.LA(1);

                        s = -1;
                        if ( (LA29_76=='*') ) {s = 127;}

                        else if ( ((LA29_76>='\u0000' && LA29_76<=')')||(LA29_76>='+' && LA29_76<='\uFFFF')) ) {s = 128;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_0 = input.LA(1);

                        s = -1;
                        if ( (LA29_0=='H') ) {s = 1;}

                        else if ( (LA29_0=='!') ) {s = 2;}

                        else if ( (LA29_0=='.') ) {s = 3;}

                        else if ( (LA29_0=='b') ) {s = 4;}

                        else if ( (LA29_0=='c') ) {s = 5;}

                        else if ( (LA29_0=='s') ) {s = 6;}

                        else if ( (LA29_0=='i') ) {s = 7;}

                        else if ( (LA29_0=='f') ) {s = 8;}

                        else if ( (LA29_0=='l') ) {s = 9;}

                        else if ( (LA29_0=='d') ) {s = 10;}

                        else if ( (LA29_0=='[') ) {s = 11;}

                        else if ( (LA29_0==']') ) {s = 12;}

                        else if ( (LA29_0==',') ) {s = 13;}

                        else if ( (LA29_0=='/') ) {s = 14;}

                        else if ( (LA29_0=='*') ) {s = 15;}

                        else if ( (LA29_0==';') ) {s = 16;}

                        else if ( (LA29_0=='(') ) {s = 17;}

                        else if ( (LA29_0==')') ) {s = 18;}

                        else if ( (LA29_0=='{') ) {s = 19;}

                        else if ( (LA29_0=='}') ) {s = 20;}

                        else if ( (LA29_0=='e') ) {s = 21;}

                        else if ( (LA29_0=='w') ) {s = 22;}

                        else if ( (LA29_0=='t') ) {s = 23;}

                        else if ( (LA29_0==':') ) {s = 24;}

                        else if ( (LA29_0=='r') ) {s = 25;}

                        else if ( (LA29_0=='=') ) {s = 26;}

                        else if ( (LA29_0=='n') ) {s = 27;}

                        else if ( (LA29_0=='\'') ) {s = 28;}

                        else if ( ((LA29_0>='1' && LA29_0<='7')) ) {s = 29;}

                        else if ( (LA29_0=='0') ) {s = 30;}

                        else if ( ((LA29_0>='8' && LA29_0<='9')) ) {s = 31;}

                        else if ( (LA29_0=='p') ) {s = 33;}

                        else if ( (LA29_0=='a') ) {s = 34;}

                        else if ( (LA29_0=='_'||(LA29_0>='g' && LA29_0<='h')||(LA29_0>='j' && LA29_0<='k')||LA29_0=='m'||LA29_0=='o'||LA29_0=='q'||(LA29_0>='u' && LA29_0<='v')||(LA29_0>='x' && LA29_0<='z')) ) {s = 35;}

                        else if ( (LA29_0=='^') ) {s = 36;}

                        else if ( (LA29_0=='$') ) {s = 37;}

                        else if ( ((LA29_0>='A' && LA29_0<='G')||(LA29_0>='I' && LA29_0<='Z')) ) {s = 38;}

                        else if ( ((LA29_0>='\t' && LA29_0<='\n')||LA29_0=='\r'||LA29_0==' ') ) {s = 39;}

                        else if ( ((LA29_0>='\u0000' && LA29_0<='\b')||(LA29_0>='\u000B' && LA29_0<='\f')||(LA29_0>='\u000E' && LA29_0<='\u001F')||(LA29_0>='\"' && LA29_0<='#')||(LA29_0>='%' && LA29_0<='&')||LA29_0=='+'||LA29_0=='-'||LA29_0=='<'||(LA29_0>='>' && LA29_0<='@')||LA29_0=='\\'||LA29_0=='`'||LA29_0=='|'||(LA29_0>='~' && LA29_0<='\uFFFF')) ) {s = 40;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_127 = input.LA(1);

                        s = -1;
                        if ( ((LA29_127>='\u0000' && LA29_127<='\uFFFF')) ) {s = 128;}

                        else s = 167;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}