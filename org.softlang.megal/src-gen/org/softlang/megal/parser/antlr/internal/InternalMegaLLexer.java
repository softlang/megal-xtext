package org.softlang.megal.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMegaLLexer extends Lexer {
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMegaLLexer() {;} 
    public InternalMegaLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMegaLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:11:7: ( 'model' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:11:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:12:7: ( 'linked' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:12:9: 'linked'
            {
            match("linked"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:13:7: ( 'in' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:13:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:14:7: ( 'import' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:14:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:15:7: ( 'Entity' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:15:9: 'Entity'
            {
            match("Entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:16:7: ( '<' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:16:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:17:7: ( '*' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:17:9: '*'
            {
            match('*'); 

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
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:18:7: ( ':' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:18:9: ':'
            {
            match(':'); 

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
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:19:7: ( '.' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:19:9: '.'
            {
            match('.'); 

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
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:20:7: ( 'linking' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:20:9: 'linking'
            {
            match("linking"); 


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
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:21:7: ( 'for' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:21:9: 'for'
            {
            match("for"); 


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
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:22:7: ( '=' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:834:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:834:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:834:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:834:11: '^'
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

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:834:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:
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
            	    break loop2;
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
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:836:10: ( ( '0' .. '9' )+ )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:836:12: ( '0' .. '9' )+
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:836:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:836:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:838:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:838:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:838:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:838:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:838:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:838:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:838:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:838:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:838:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:838:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:838:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:840:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:840:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:840:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:840:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:842:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:842:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:842:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:842:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:842:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:842:41: ( '\\r' )? '\\n'
                    {
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:842:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:842:41: '\\r'
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
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:844:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:844:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:844:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:846:16: ( . )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:846:18: .
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
        // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=19;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:82: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:90: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 15 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:99: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:111: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:127: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:143: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:1:151: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\4\24\4\uffff\1\24\1\uffff\1\22\2\uffff\3\22\2\uffff\1"+
        "\24\1\uffff\1\24\1\46\2\24\4\uffff\1\24\6\uffff\2\24\1\uffff\2\24"+
        "\1\56\4\24\1\uffff\1\64\4\24\1\uffff\1\71\1\24\1\73\1\74\1\uffff"+
        "\1\75\3\uffff";
    static final String DFA12_eofS =
        "\76\uffff";
    static final String DFA12_minS =
        "\1\0\1\157\1\151\1\155\1\156\4\uffff\1\157\1\uffff\1\101\2\uffff"+
        "\2\0\1\52\2\uffff\1\144\1\uffff\1\156\1\60\1\160\1\164\4\uffff\1"+
        "\162\6\uffff\1\145\1\153\1\uffff\1\157\1\151\1\60\1\154\1\145\1"+
        "\162\1\164\1\uffff\1\60\1\144\1\156\1\164\1\171\1\uffff\1\60\1\147"+
        "\2\60\1\uffff\1\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\1\151\2\156\4\uffff\1\157\1\uffff\1\172\2\uffff"+
        "\2\uffff\1\57\2\uffff\1\144\1\uffff\1\156\1\172\1\160\1\164\4\uffff"+
        "\1\162\6\uffff\1\145\1\153\1\uffff\1\157\1\151\1\172\1\154\1\151"+
        "\1\162\1\164\1\uffff\1\172\1\144\1\156\1\164\1\171\1\uffff\1\172"+
        "\1\147\2\172\1\uffff\1\172\3\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\6\1\7\1\10\1\11\1\uffff\1\14\1\uffff\1\15\1\16\3\uffff"+
        "\1\22\1\23\1\uffff\1\15\4\uffff\1\6\1\7\1\10\1\11\1\uffff\1\14\1"+
        "\16\1\17\1\20\1\21\1\22\2\uffff\1\3\7\uffff\1\13\5\uffff\1\1\4\uffff"+
        "\1\2\1\uffff\1\4\1\5\1\12";
    static final String DFA12_specialS =
        "\1\2\15\uffff\1\0\1\1\56\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\16\4\22\1\17\2\22\1"+
            "\6\3\22\1\10\1\20\12\15\1\7\1\22\1\5\1\12\3\22\4\14\1\4\25\14"+
            "\3\22\1\13\1\14\1\22\5\14\1\11\2\14\1\3\2\14\1\2\1\1\15\14\uff85"+
            "\22",
            "\1\23",
            "\1\25",
            "\1\27\1\26",
            "\1\30",
            "",
            "",
            "",
            "",
            "\1\35",
            "",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\0\40",
            "\0\40",
            "\1\41\4\uffff\1\42",
            "",
            "",
            "\1\44",
            "",
            "\1\45",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\53",
            "",
            "\1\54",
            "\1\55",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\57",
            "\1\60\3\uffff\1\61",
            "\1\62",
            "\1\63",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\72",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_14 = input.LA(1);

                        s = -1;
                        if ( ((LA12_14>='\u0000' && LA12_14<='\uFFFF')) ) {s = 32;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_15 = input.LA(1);

                        s = -1;
                        if ( ((LA12_15>='\u0000' && LA12_15<='\uFFFF')) ) {s = 32;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='m') ) {s = 1;}

                        else if ( (LA12_0=='l') ) {s = 2;}

                        else if ( (LA12_0=='i') ) {s = 3;}

                        else if ( (LA12_0=='E') ) {s = 4;}

                        else if ( (LA12_0=='<') ) {s = 5;}

                        else if ( (LA12_0=='*') ) {s = 6;}

                        else if ( (LA12_0==':') ) {s = 7;}

                        else if ( (LA12_0=='.') ) {s = 8;}

                        else if ( (LA12_0=='f') ) {s = 9;}

                        else if ( (LA12_0=='=') ) {s = 10;}

                        else if ( (LA12_0=='^') ) {s = 11;}

                        else if ( ((LA12_0>='A' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='n' && LA12_0<='z')) ) {s = 12;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 13;}

                        else if ( (LA12_0=='\"') ) {s = 14;}

                        else if ( (LA12_0=='\'') ) {s = 15;}

                        else if ( (LA12_0=='/') ) {s = 16;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 17;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='-')||LA12_0==';'||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}