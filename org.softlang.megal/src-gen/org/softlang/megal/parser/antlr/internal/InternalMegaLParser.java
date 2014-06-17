package org.softlang.megal.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.softlang.megal.services.MegaLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMegaLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'import'", "'Entity'", "'<'", "'*'", "':'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMegaLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMegaLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMegaLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g"; }



     	private MegaLGrammarAccess grammarAccess;
     	
        public InternalMegaLParser(TokenStream input, MegaLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MegaL";	
       	}
       	
       	@Override
       	protected MegaLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMegaL"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:67:1: entryRuleMegaL returns [EObject current=null] : iv_ruleMegaL= ruleMegaL EOF ;
    public final EObject entryRuleMegaL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegaL = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:68:2: (iv_ruleMegaL= ruleMegaL EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:69:2: iv_ruleMegaL= ruleMegaL EOF
            {
             newCompositeNode(grammarAccess.getMegaLRule()); 
            pushFollow(FOLLOW_ruleMegaL_in_entryRuleMegaL75);
            iv_ruleMegaL=ruleMegaL();

            state._fsp--;

             current =iv_ruleMegaL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMegaL85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMegaL"


    // $ANTLR start "ruleMegaL"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:76:1: ruleMegaL returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) ( (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) ) | ( (lv_etd_4_0= ruleETD ) ) | ( (lv_rtd_5_0= ruleRTD ) ) | ( (lv_ed_6_0= ruleED ) ) | ( (lv_rd_7_0= ruleRD ) ) )* ) ;
    public final EObject ruleMegaL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_etd_4_0 = null;

        EObject lv_rtd_5_0 = null;

        EObject lv_ed_6_0 = null;

        EObject lv_rd_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:79:28: ( (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) ( (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) ) | ( (lv_etd_4_0= ruleETD ) ) | ( (lv_rtd_5_0= ruleRTD ) ) | ( (lv_ed_6_0= ruleED ) ) | ( (lv_rd_7_0= ruleRD ) ) )* ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) ( (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) ) | ( (lv_etd_4_0= ruleETD ) ) | ( (lv_rtd_5_0= ruleRTD ) ) | ( (lv_ed_6_0= ruleED ) ) | ( (lv_rd_7_0= ruleRD ) ) )* )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) ( (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) ) | ( (lv_etd_4_0= ruleETD ) ) | ( (lv_rtd_5_0= ruleRTD ) ) | ( (lv_ed_6_0= ruleED ) ) | ( (lv_rd_7_0= ruleRD ) ) )* )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:80:3: otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) ( (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) ) | ( (lv_etd_4_0= ruleETD ) ) | ( (lv_rtd_5_0= ruleRTD ) ) | ( (lv_ed_6_0= ruleED ) ) | ( (lv_rd_7_0= ruleRD ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMegaL122); 

                	newLeafNode(otherlv_0, grammarAccess.getMegaLAccess().getModelKeyword_0());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:84:1: ( (lv_name_1_0= ruleQualifiedID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:85:1: (lv_name_1_0= ruleQualifiedID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:85:1: (lv_name_1_0= ruleQualifiedID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:86:3: lv_name_1_0= ruleQualifiedID
            {
             
            	        newCompositeNode(grammarAccess.getMegaLAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleMegaL143);
            lv_name_1_0=ruleQualifiedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMegaLRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:102:2: ( (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) ) | ( (lv_etd_4_0= ruleETD ) ) | ( (lv_rtd_5_0= ruleRTD ) ) | ( (lv_ed_6_0= ruleED ) ) | ( (lv_rd_7_0= ruleRD ) ) )*
            loop1:
            do {
                int alt1=6;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:102:3: (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:102:3: (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:102:5: otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMegaL157); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMegaLAccess().getImportKeyword_2_0_0());
            	        
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:106:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:107:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:107:1: (otherlv_3= RULE_ID )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:108:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMegaLRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMegaL177); 

            	    		newLeafNode(otherlv_3, grammarAccess.getMegaLAccess().getImportsMegaLCrossReference_2_0_1_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:120:6: ( (lv_etd_4_0= ruleETD ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:120:6: ( (lv_etd_4_0= ruleETD ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:121:1: (lv_etd_4_0= ruleETD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:121:1: (lv_etd_4_0= ruleETD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:122:3: lv_etd_4_0= ruleETD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLAccess().getEtdETDParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETD_in_ruleMegaL205);
            	    lv_etd_4_0=ruleETD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"etd",
            	            		lv_etd_4_0, 
            	            		"ETD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:139:6: ( (lv_rtd_5_0= ruleRTD ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:139:6: ( (lv_rtd_5_0= ruleRTD ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:140:1: (lv_rtd_5_0= ruleRTD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:140:1: (lv_rtd_5_0= ruleRTD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:141:3: lv_rtd_5_0= ruleRTD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLAccess().getRtdRTDParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRTD_in_ruleMegaL232);
            	    lv_rtd_5_0=ruleRTD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rtd",
            	            		lv_rtd_5_0, 
            	            		"RTD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:158:6: ( (lv_ed_6_0= ruleED ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:158:6: ( (lv_ed_6_0= ruleED ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:159:1: (lv_ed_6_0= ruleED )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:159:1: (lv_ed_6_0= ruleED )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:160:3: lv_ed_6_0= ruleED
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLAccess().getEdEDParserRuleCall_2_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleED_in_ruleMegaL259);
            	    lv_ed_6_0=ruleED();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ed",
            	            		lv_ed_6_0, 
            	            		"ED");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:177:6: ( (lv_rd_7_0= ruleRD ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:177:6: ( (lv_rd_7_0= ruleRD ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:178:1: (lv_rd_7_0= ruleRD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:178:1: (lv_rd_7_0= ruleRD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:179:3: lv_rd_7_0= ruleRD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLAccess().getRdRDParserRuleCall_2_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRD_in_ruleMegaL286);
            	    lv_rd_7_0=ruleRD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rd",
            	            		lv_rd_7_0, 
            	            		"RD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleMegaL"


    // $ANTLR start "entryRuleETDR"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:203:1: entryRuleETDR returns [EObject current=null] : iv_ruleETDR= ruleETDR EOF ;
    public final EObject entryRuleETDR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETDR = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:204:2: (iv_ruleETDR= ruleETDR EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:205:2: iv_ruleETDR= ruleETDR EOF
            {
             newCompositeNode(grammarAccess.getETDRRule()); 
            pushFollow(FOLLOW_ruleETDR_in_entryRuleETDR324);
            iv_ruleETDR=ruleETDR();

            state._fsp--;

             current =iv_ruleETDR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDR334); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETDR"


    // $ANTLR start "ruleETDR"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:212:1: ruleETDR returns [EObject current=null] : (this_ETDEntity_0= ruleETDEntity | this_ETDDeclared_1= ruleETDDeclared ) ;
    public final EObject ruleETDR() throws RecognitionException {
        EObject current = null;

        EObject this_ETDEntity_0 = null;

        EObject this_ETDDeclared_1 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:215:28: ( (this_ETDEntity_0= ruleETDEntity | this_ETDDeclared_1= ruleETDDeclared ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:216:1: (this_ETDEntity_0= ruleETDEntity | this_ETDDeclared_1= ruleETDDeclared )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:216:1: (this_ETDEntity_0= ruleETDEntity | this_ETDDeclared_1= ruleETDDeclared )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:217:5: this_ETDEntity_0= ruleETDEntity
                    {
                     
                            newCompositeNode(grammarAccess.getETDRAccess().getETDEntityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETDEntity_in_ruleETDR381);
                    this_ETDEntity_0=ruleETDEntity();

                    state._fsp--;

                     
                            current = this_ETDEntity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:227:5: this_ETDDeclared_1= ruleETDDeclared
                    {
                     
                            newCompositeNode(grammarAccess.getETDRAccess().getETDDeclaredParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleETDDeclared_in_ruleETDR408);
                    this_ETDDeclared_1=ruleETDDeclared();

                    state._fsp--;

                     
                            current = this_ETDDeclared_1; 
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
    // $ANTLR end "ruleETDR"


    // $ANTLR start "entryRuleETDEntity"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:243:1: entryRuleETDEntity returns [EObject current=null] : iv_ruleETDEntity= ruleETDEntity EOF ;
    public final EObject entryRuleETDEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETDEntity = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:244:2: (iv_ruleETDEntity= ruleETDEntity EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:245:2: iv_ruleETDEntity= ruleETDEntity EOF
            {
             newCompositeNode(grammarAccess.getETDEntityRule()); 
            pushFollow(FOLLOW_ruleETDEntity_in_entryRuleETDEntity443);
            iv_ruleETDEntity=ruleETDEntity();

            state._fsp--;

             current =iv_ruleETDEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDEntity453); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETDEntity"


    // $ANTLR start "ruleETDEntity"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:252:1: ruleETDEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ) ;
    public final EObject ruleETDEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:255:28: ( ( () otherlv_1= 'Entity' ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:256:1: ( () otherlv_1= 'Entity' )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:256:1: ( () otherlv_1= 'Entity' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:256:2: () otherlv_1= 'Entity'
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:256:2: ()
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:257:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETDEntityAccess().getETDEntityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleETDEntity499); 

                	newLeafNode(otherlv_1, grammarAccess.getETDEntityAccess().getEntityKeyword_1());
                

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
    // $ANTLR end "ruleETDEntity"


    // $ANTLR start "entryRuleETDDeclared"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:274:1: entryRuleETDDeclared returns [EObject current=null] : iv_ruleETDDeclared= ruleETDDeclared EOF ;
    public final EObject entryRuleETDDeclared() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETDDeclared = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:275:2: (iv_ruleETDDeclared= ruleETDDeclared EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:276:2: iv_ruleETDDeclared= ruleETDDeclared EOF
            {
             newCompositeNode(grammarAccess.getETDDeclaredRule()); 
            pushFollow(FOLLOW_ruleETDDeclared_in_entryRuleETDDeclared535);
            iv_ruleETDDeclared=ruleETDDeclared();

            state._fsp--;

             current =iv_ruleETDDeclared; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDDeclared545); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETDDeclared"


    // $ANTLR start "ruleETDDeclared"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:283:1: ruleETDDeclared returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleETDDeclared() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:286:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:287:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:287:1: ( (otherlv_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:288:1: (otherlv_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:288:1: (otherlv_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:289:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getETDDeclaredRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETDDeclared589); 

            		newLeafNode(otherlv_0, grammarAccess.getETDDeclaredAccess().getReferenceETDCrossReference_0()); 
            	

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
    // $ANTLR end "ruleETDDeclared"


    // $ANTLR start "entryRuleETD"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:308:1: entryRuleETD returns [EObject current=null] : iv_ruleETD= ruleETD EOF ;
    public final EObject entryRuleETD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:309:2: (iv_ruleETD= ruleETD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:310:2: iv_ruleETD= ruleETD EOF
            {
             newCompositeNode(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_ruleETD_in_entryRuleETD624);
            iv_ruleETD=ruleETD();

            state._fsp--;

             current =iv_ruleETD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETD634); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETD"


    // $ANTLR start "ruleETD"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:317:1: ruleETD returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) ) ) ;
    public final EObject ruleETD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_supertype_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:320:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:321:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:321:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:321:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:321:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:322:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:322:1: (lv_name_0_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:323:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETD676); 

            			newLeafNode(lv_name_0_0, grammarAccess.getETDAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getETDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleETD693); 

                	newLeafNode(otherlv_1, grammarAccess.getETDAccess().getLessThanSignKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:343:1: ( (lv_supertype_2_0= ruleETDR ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:344:1: (lv_supertype_2_0= ruleETDR )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:344:1: (lv_supertype_2_0= ruleETDR )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:345:3: lv_supertype_2_0= ruleETDR
            {
             
            	        newCompositeNode(grammarAccess.getETDAccess().getSupertypeETDRParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETDR_in_ruleETD714);
            lv_supertype_2_0=ruleETDR();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETDRule());
            	        }
                   		set(
                   			current, 
                   			"supertype",
                    		lv_supertype_2_0, 
                    		"ETDR");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleETD"


    // $ANTLR start "entryRuleRTD"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:369:1: entryRuleRTD returns [EObject current=null] : iv_ruleRTD= ruleRTD EOF ;
    public final EObject entryRuleRTD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:370:2: (iv_ruleRTD= ruleRTD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:371:2: iv_ruleRTD= ruleRTD EOF
            {
             newCompositeNode(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_ruleRTD_in_entryRuleRTD750);
            iv_ruleRTD=ruleRTD();

            state._fsp--;

             current =iv_ruleRTD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTD760); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRTD"


    // $ANTLR start "ruleRTD"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:378:1: ruleRTD returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) ) ) ;
    public final EObject ruleRTD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_domain_2_0 = null;

        EObject lv_coDomain_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:381:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:382:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:382:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:382:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:382:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:383:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:383:1: (lv_name_0_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:384:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRTD802); 

            			newLeafNode(lv_name_0_0, grammarAccess.getRTDAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRTDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleRTD819); 

                	newLeafNode(otherlv_1, grammarAccess.getRTDAccess().getLessThanSignKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:404:1: ( (lv_domain_2_0= ruleETDR ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:405:1: (lv_domain_2_0= ruleETDR )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:405:1: (lv_domain_2_0= ruleETDR )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:406:3: lv_domain_2_0= ruleETDR
            {
             
            	        newCompositeNode(grammarAccess.getRTDAccess().getDomainETDRParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETDR_in_ruleRTD840);
            lv_domain_2_0=ruleETDR();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRTDRule());
            	        }
                   		set(
                   			current, 
                   			"domain",
                    		lv_domain_2_0, 
                    		"ETDR");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleRTD852); 

                	newLeafNode(otherlv_3, grammarAccess.getRTDAccess().getAsteriskKeyword_3());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:426:1: ( (lv_coDomain_4_0= ruleETDR ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:427:1: (lv_coDomain_4_0= ruleETDR )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:427:1: (lv_coDomain_4_0= ruleETDR )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:428:3: lv_coDomain_4_0= ruleETDR
            {
             
            	        newCompositeNode(grammarAccess.getRTDAccess().getCoDomainETDRParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleETDR_in_ruleRTD873);
            lv_coDomain_4_0=ruleETDR();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRTDRule());
            	        }
                   		set(
                   			current, 
                   			"coDomain",
                    		lv_coDomain_4_0, 
                    		"ETDR");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleRTD"


    // $ANTLR start "entryRuleED"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:452:1: entryRuleED returns [EObject current=null] : iv_ruleED= ruleED EOF ;
    public final EObject entryRuleED() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleED = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:453:2: (iv_ruleED= ruleED EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:454:2: iv_ruleED= ruleED EOF
            {
             newCompositeNode(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_ruleED_in_entryRuleED909);
            iv_ruleED=ruleED();

            state._fsp--;

             current =iv_ruleED; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleED919); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleED"


    // $ANTLR start "ruleED"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:461:1: ruleED returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) ) ) ;
    public final EObject ruleED() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:464:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:465:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:465:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:465:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:465:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:466:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:466:1: (lv_name_0_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:467:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleED961); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEDAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleED978); 

                	newLeafNode(otherlv_1, grammarAccess.getEDAccess().getColonKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:487:1: ( (lv_type_2_0= ruleETDR ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:488:1: (lv_type_2_0= ruleETDR )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:488:1: (lv_type_2_0= ruleETDR )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:489:3: lv_type_2_0= ruleETDR
            {
             
            	        newCompositeNode(grammarAccess.getEDAccess().getTypeETDRParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETDR_in_ruleED999);
            lv_type_2_0=ruleETDR();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEDRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"ETDR");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleED"


    // $ANTLR start "entryRuleRD"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:513:1: entryRuleRD returns [EObject current=null] : iv_ruleRD= ruleRD EOF ;
    public final EObject entryRuleRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:514:2: (iv_ruleRD= ruleRD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:515:2: iv_ruleRD= ruleRD EOF
            {
             newCompositeNode(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_ruleRD_in_entryRuleRD1035);
            iv_ruleRD=ruleRD();

            state._fsp--;

             current =iv_ruleRD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRD1045); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRD"


    // $ANTLR start "ruleRD"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:522:1: ruleRD returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:525:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:526:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:526:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:526:2: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:526:2: ( (otherlv_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:527:1: (otherlv_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:527:1: (otherlv_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:528:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD1090); 

            		newLeafNode(otherlv_0, grammarAccess.getRDAccess().getSourceEDCrossReference_0_0()); 
            	

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:539:2: ( (otherlv_1= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:540:1: (otherlv_1= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:540:1: (otherlv_1= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:541:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD1110); 

            		newLeafNode(otherlv_1, grammarAccess.getRDAccess().getRelRTDCrossReference_1_0()); 
            	

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:552:2: ( (otherlv_2= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:553:1: (otherlv_2= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:553:1: (otherlv_2= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:554:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD1130); 

            		newLeafNode(otherlv_2, grammarAccess.getRDAccess().getTargetEDCrossReference_2_0()); 
            	

            }


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
    // $ANTLR end "ruleRD"


    // $ANTLR start "entryRuleQualifiedID"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:573:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:574:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:575:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1167);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedID1178); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:582:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:585:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:586:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:586:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:586:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID1218); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:593:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:594:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedID1237); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID1252); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedID"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\13\uffff";
    static final String DFA1_eofS =
        "\1\1\6\uffff\2\11\2\uffff";
    static final String DFA1_minS =
        "\1\4\2\uffff\1\4\1\uffff\1\4\1\uffff\2\4\2\uffff";
    static final String DFA1_maxS =
        "\1\14\2\uffff\1\20\1\uffff\1\15\1\uffff\2\17\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\6\1\1\1\uffff\1\5\1\uffff\1\4\2\uffff\1\2\1\3";
    static final String DFA1_specialS =
        "\13\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\7\uffff\1\2",
            "",
            "",
            "\1\4\11\uffff\1\5\1\uffff\1\6",
            "",
            "\1\10\10\uffff\1\7",
            "",
            "\1\11\7\uffff\1\11\2\uffff\1\12",
            "\1\11\7\uffff\1\11\2\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 102:2: ( (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) ) | ( (lv_etd_4_0= ruleETD ) ) | ( (lv_rtd_5_0= ruleRTD ) ) | ( (lv_ed_6_0= ruleED ) ) | ( (lv_rd_7_0= ruleRD ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleMegaL_in_entryRuleMegaL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMegaL122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaL143 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_12_in_ruleMegaL157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMegaL177 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleETD_in_ruleMegaL205 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleRTD_in_ruleMegaL232 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleED_in_ruleMegaL259 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleRD_in_ruleMegaL286 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleETDR_in_entryRuleETDR324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDR334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDEntity_in_ruleETDR381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDDeclared_in_ruleETDR408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDEntity_in_entryRuleETDEntity443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDEntity453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleETDEntity499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDDeclared_in_entryRuleETDDeclared535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDDeclared545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETDDeclared589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_entryRuleETD624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETD634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETD676 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleETD693 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleETDR_in_ruleETD714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_entryRuleRTD750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTD760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRTD802 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRTD819 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleETDR_in_ruleRTD840 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRTD852 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleETDR_in_ruleRTD873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_entryRuleED909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleED919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleED961 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleED978 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleETDR_in_ruleED999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_entryRuleRD1035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRD1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD1090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD1110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1218 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedID1237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1252 = new BitSet(new long[]{0x0000000000020002L});

}