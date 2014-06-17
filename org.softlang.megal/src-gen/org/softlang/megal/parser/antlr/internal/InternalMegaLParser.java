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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'linked'", "'in'", "'import'", "'Entity'", "'<'", "'*'", "':'", "'.'", "'linking'", "'for'", "'='"
    };
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
        	return "Model";	
       	}
       	
       	@Override
       	protected MegaLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:76:1: ruleModel returns [EObject current=null] : (this_MegaLDefinition_0= ruleMegaLDefinition | this_MegaLLinking_1= ruleMegaLLinking ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_MegaLDefinition_0 = null;

        EObject this_MegaLLinking_1 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:79:28: ( (this_MegaLDefinition_0= ruleMegaLDefinition | this_MegaLLinking_1= ruleMegaLLinking ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:80:1: (this_MegaLDefinition_0= ruleMegaLDefinition | this_MegaLLinking_1= ruleMegaLLinking )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:80:1: (this_MegaLDefinition_0= ruleMegaLDefinition | this_MegaLLinking_1= ruleMegaLLinking )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:81:5: this_MegaLDefinition_0= ruleMegaLDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getMegaLDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMegaLDefinition_in_ruleModel132);
                    this_MegaLDefinition_0=ruleMegaLDefinition();

                    state._fsp--;

                     
                            current = this_MegaLDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:91:5: this_MegaLLinking_1= ruleMegaLLinking
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getMegaLLinkingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMegaLLinking_in_ruleModel159);
                    this_MegaLLinking_1=ruleMegaLLinking();

                    state._fsp--;

                     
                            current = this_MegaLLinking_1; 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMegaLDefinition"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:107:1: entryRuleMegaLDefinition returns [EObject current=null] : iv_ruleMegaLDefinition= ruleMegaLDefinition EOF ;
    public final EObject entryRuleMegaLDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegaLDefinition = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:108:2: (iv_ruleMegaLDefinition= ruleMegaLDefinition EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:109:2: iv_ruleMegaLDefinition= ruleMegaLDefinition EOF
            {
             newCompositeNode(grammarAccess.getMegaLDefinitionRule()); 
            pushFollow(FOLLOW_ruleMegaLDefinition_in_entryRuleMegaLDefinition194);
            iv_ruleMegaLDefinition=ruleMegaLDefinition();

            state._fsp--;

             current =iv_ruleMegaLDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMegaLDefinition204); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMegaLDefinition"


    // $ANTLR start "ruleMegaLDefinition"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:116:1: ruleMegaLDefinition returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( (otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) ) | ( (lv_etd_7_0= ruleETD ) ) | ( (lv_rtd_8_0= ruleRTD ) ) | ( (lv_ed_9_0= ruleED ) ) | ( (lv_rd_10_0= ruleRD ) ) )* ) ;
    public final EObject ruleMegaLDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_etd_7_0 = null;

        EObject lv_rtd_8_0 = null;

        EObject lv_ed_9_0 = null;

        EObject lv_rd_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:119:28: ( (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( (otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) ) | ( (lv_etd_7_0= ruleETD ) ) | ( (lv_rtd_8_0= ruleRTD ) ) | ( (lv_ed_9_0= ruleED ) ) | ( (lv_rd_10_0= ruleRD ) ) )* ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:120:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( (otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) ) | ( (lv_etd_7_0= ruleETD ) ) | ( (lv_rtd_8_0= ruleRTD ) ) | ( (lv_ed_9_0= ruleED ) ) | ( (lv_rd_10_0= ruleRD ) ) )* )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:120:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( (otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) ) | ( (lv_etd_7_0= ruleETD ) ) | ( (lv_rtd_8_0= ruleRTD ) ) | ( (lv_ed_9_0= ruleED ) ) | ( (lv_rd_10_0= ruleRD ) ) )* )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:120:3: otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( (otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) ) | ( (lv_etd_7_0= ruleETD ) ) | ( (lv_rtd_8_0= ruleRTD ) ) | ( (lv_ed_9_0= ruleED ) ) | ( (lv_rd_10_0= ruleRD ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMegaLDefinition241); 

                	newLeafNode(otherlv_0, grammarAccess.getMegaLDefinitionAccess().getModelKeyword_0());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:124:1: ( (lv_name_1_0= ruleQualifiedID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:125:1: (lv_name_1_0= ruleQualifiedID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:125:1: (lv_name_1_0= ruleQualifiedID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:126:3: lv_name_1_0= ruleQualifiedID
            {
             
            	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleMegaLDefinition262);
            lv_name_1_0=ruleQualifiedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:142:2: (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:142:4: otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMegaLDefinition275); 

                        	newLeafNode(otherlv_2, grammarAccess.getMegaLDefinitionAccess().getLinkedKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleMegaLDefinition287); 

                        	newLeafNode(otherlv_3, grammarAccess.getMegaLDefinitionAccess().getInKeyword_2_1());
                        
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:150:1: ( ( ruleQualifiedID ) )
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:151:1: ( ruleQualifiedID )
                    {
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:151:1: ( ruleQualifiedID )
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:152:3: ruleQualifiedID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegaLDefinitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getLinkerMegaLLinkingCrossReference_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedID_in_ruleMegaLDefinition310);
                    ruleQualifiedID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:165:4: ( (otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) ) | ( (lv_etd_7_0= ruleETD ) ) | ( (lv_rtd_8_0= ruleRTD ) ) | ( (lv_ed_9_0= ruleED ) ) | ( (lv_rd_10_0= ruleRD ) ) )*
            loop3:
            do {
                int alt3=6;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:165:5: (otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:165:5: (otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:165:7: otherlv_5= 'import' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleMegaLDefinition326); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMegaLDefinitionAccess().getImportKeyword_3_0_0());
            	        
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:169:1: ( (otherlv_6= RULE_ID ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:170:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:170:1: (otherlv_6= RULE_ID )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:171:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMegaLDefinition346); 

            	    		newLeafNode(otherlv_6, grammarAccess.getMegaLDefinitionAccess().getImportsMegaLDefinitionCrossReference_3_0_1_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:183:6: ( (lv_etd_7_0= ruleETD ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:183:6: ( (lv_etd_7_0= ruleETD ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:184:1: (lv_etd_7_0= ruleETD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:184:1: (lv_etd_7_0= ruleETD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:185:3: lv_etd_7_0= ruleETD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getEtdETDParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETD_in_ruleMegaLDefinition374);
            	    lv_etd_7_0=ruleETD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"etd",
            	            		lv_etd_7_0, 
            	            		"ETD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:202:6: ( (lv_rtd_8_0= ruleRTD ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:202:6: ( (lv_rtd_8_0= ruleRTD ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:203:1: (lv_rtd_8_0= ruleRTD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:203:1: (lv_rtd_8_0= ruleRTD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:204:3: lv_rtd_8_0= ruleRTD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getRtdRTDParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRTD_in_ruleMegaLDefinition401);
            	    lv_rtd_8_0=ruleRTD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rtd",
            	            		lv_rtd_8_0, 
            	            		"RTD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:221:6: ( (lv_ed_9_0= ruleED ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:221:6: ( (lv_ed_9_0= ruleED ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:222:1: (lv_ed_9_0= ruleED )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:222:1: (lv_ed_9_0= ruleED )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:223:3: lv_ed_9_0= ruleED
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getEdEDParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleED_in_ruleMegaLDefinition428);
            	    lv_ed_9_0=ruleED();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ed",
            	            		lv_ed_9_0, 
            	            		"ED");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:240:6: ( (lv_rd_10_0= ruleRD ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:240:6: ( (lv_rd_10_0= ruleRD ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:241:1: (lv_rd_10_0= ruleRD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:241:1: (lv_rd_10_0= ruleRD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:242:3: lv_rd_10_0= ruleRD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getRdRDParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRD_in_ruleMegaLDefinition455);
            	    lv_rd_10_0=ruleRD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rd",
            	            		lv_rd_10_0, 
            	            		"RD");
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
    // $ANTLR end "ruleMegaLDefinition"


    // $ANTLR start "entryRuleETDR"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:266:1: entryRuleETDR returns [EObject current=null] : iv_ruleETDR= ruleETDR EOF ;
    public final EObject entryRuleETDR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETDR = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:267:2: (iv_ruleETDR= ruleETDR EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:268:2: iv_ruleETDR= ruleETDR EOF
            {
             newCompositeNode(grammarAccess.getETDRRule()); 
            pushFollow(FOLLOW_ruleETDR_in_entryRuleETDR493);
            iv_ruleETDR=ruleETDR();

            state._fsp--;

             current =iv_ruleETDR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDR503); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:275:1: ruleETDR returns [EObject current=null] : (this_ETDEntity_0= ruleETDEntity | this_ETDDeclared_1= ruleETDDeclared ) ;
    public final EObject ruleETDR() throws RecognitionException {
        EObject current = null;

        EObject this_ETDEntity_0 = null;

        EObject this_ETDDeclared_1 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:278:28: ( (this_ETDEntity_0= ruleETDEntity | this_ETDDeclared_1= ruleETDDeclared ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:279:1: (this_ETDEntity_0= ruleETDEntity | this_ETDDeclared_1= ruleETDDeclared )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:279:1: (this_ETDEntity_0= ruleETDEntity | this_ETDDeclared_1= ruleETDDeclared )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:280:5: this_ETDEntity_0= ruleETDEntity
                    {
                     
                            newCompositeNode(grammarAccess.getETDRAccess().getETDEntityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETDEntity_in_ruleETDR550);
                    this_ETDEntity_0=ruleETDEntity();

                    state._fsp--;

                     
                            current = this_ETDEntity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:290:5: this_ETDDeclared_1= ruleETDDeclared
                    {
                     
                            newCompositeNode(grammarAccess.getETDRAccess().getETDDeclaredParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleETDDeclared_in_ruleETDR577);
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:306:1: entryRuleETDEntity returns [EObject current=null] : iv_ruleETDEntity= ruleETDEntity EOF ;
    public final EObject entryRuleETDEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETDEntity = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:307:2: (iv_ruleETDEntity= ruleETDEntity EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:308:2: iv_ruleETDEntity= ruleETDEntity EOF
            {
             newCompositeNode(grammarAccess.getETDEntityRule()); 
            pushFollow(FOLLOW_ruleETDEntity_in_entryRuleETDEntity612);
            iv_ruleETDEntity=ruleETDEntity();

            state._fsp--;

             current =iv_ruleETDEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDEntity622); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:315:1: ruleETDEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ) ;
    public final EObject ruleETDEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:318:28: ( ( () otherlv_1= 'Entity' ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:319:1: ( () otherlv_1= 'Entity' )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:319:1: ( () otherlv_1= 'Entity' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:319:2: () otherlv_1= 'Entity'
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:319:2: ()
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:320:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETDEntityAccess().getETDEntityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleETDEntity668); 

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:337:1: entryRuleETDDeclared returns [EObject current=null] : iv_ruleETDDeclared= ruleETDDeclared EOF ;
    public final EObject entryRuleETDDeclared() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETDDeclared = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:338:2: (iv_ruleETDDeclared= ruleETDDeclared EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:339:2: iv_ruleETDDeclared= ruleETDDeclared EOF
            {
             newCompositeNode(grammarAccess.getETDDeclaredRule()); 
            pushFollow(FOLLOW_ruleETDDeclared_in_entryRuleETDDeclared704);
            iv_ruleETDDeclared=ruleETDDeclared();

            state._fsp--;

             current =iv_ruleETDDeclared; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDDeclared714); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:346:1: ruleETDDeclared returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleETDDeclared() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:349:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:350:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:350:1: ( (otherlv_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:351:1: (otherlv_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:351:1: (otherlv_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:352:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getETDDeclaredRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETDDeclared758); 

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:371:1: entryRuleETD returns [EObject current=null] : iv_ruleETD= ruleETD EOF ;
    public final EObject entryRuleETD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:372:2: (iv_ruleETD= ruleETD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:373:2: iv_ruleETD= ruleETD EOF
            {
             newCompositeNode(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_ruleETD_in_entryRuleETD793);
            iv_ruleETD=ruleETD();

            state._fsp--;

             current =iv_ruleETD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETD803); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:380:1: ruleETD returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) ) ) ;
    public final EObject ruleETD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_supertype_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:383:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:384:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:384:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:384:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:384:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:385:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:385:1: (lv_name_0_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:386:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETD845); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleETD862); 

                	newLeafNode(otherlv_1, grammarAccess.getETDAccess().getLessThanSignKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:406:1: ( (lv_supertype_2_0= ruleETDR ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:407:1: (lv_supertype_2_0= ruleETDR )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:407:1: (lv_supertype_2_0= ruleETDR )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:408:3: lv_supertype_2_0= ruleETDR
            {
             
            	        newCompositeNode(grammarAccess.getETDAccess().getSupertypeETDRParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETDR_in_ruleETD883);
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:432:1: entryRuleRTD returns [EObject current=null] : iv_ruleRTD= ruleRTD EOF ;
    public final EObject entryRuleRTD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:433:2: (iv_ruleRTD= ruleRTD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:434:2: iv_ruleRTD= ruleRTD EOF
            {
             newCompositeNode(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_ruleRTD_in_entryRuleRTD919);
            iv_ruleRTD=ruleRTD();

            state._fsp--;

             current =iv_ruleRTD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTD929); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:441:1: ruleRTD returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) ) ) ;
    public final EObject ruleRTD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_domain_2_0 = null;

        EObject lv_coDomain_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:444:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:445:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:445:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:445:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:445:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:446:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:446:1: (lv_name_0_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:447:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRTD971); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleRTD988); 

                	newLeafNode(otherlv_1, grammarAccess.getRTDAccess().getLessThanSignKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:467:1: ( (lv_domain_2_0= ruleETDR ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:468:1: (lv_domain_2_0= ruleETDR )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:468:1: (lv_domain_2_0= ruleETDR )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:469:3: lv_domain_2_0= ruleETDR
            {
             
            	        newCompositeNode(grammarAccess.getRTDAccess().getDomainETDRParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETDR_in_ruleRTD1009);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleRTD1021); 

                	newLeafNode(otherlv_3, grammarAccess.getRTDAccess().getAsteriskKeyword_3());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:489:1: ( (lv_coDomain_4_0= ruleETDR ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:490:1: (lv_coDomain_4_0= ruleETDR )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:490:1: (lv_coDomain_4_0= ruleETDR )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:491:3: lv_coDomain_4_0= ruleETDR
            {
             
            	        newCompositeNode(grammarAccess.getRTDAccess().getCoDomainETDRParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleETDR_in_ruleRTD1042);
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:515:1: entryRuleED returns [EObject current=null] : iv_ruleED= ruleED EOF ;
    public final EObject entryRuleED() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleED = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:516:2: (iv_ruleED= ruleED EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:517:2: iv_ruleED= ruleED EOF
            {
             newCompositeNode(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_ruleED_in_entryRuleED1078);
            iv_ruleED=ruleED();

            state._fsp--;

             current =iv_ruleED; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleED1088); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:524:1: ruleED returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) ) ) ;
    public final EObject ruleED() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:527:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:528:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:528:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:528:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:528:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:529:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:529:1: (lv_name_0_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:530:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleED1130); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleED1147); 

                	newLeafNode(otherlv_1, grammarAccess.getEDAccess().getColonKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:550:1: ( (lv_type_2_0= ruleETDR ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:551:1: (lv_type_2_0= ruleETDR )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:551:1: (lv_type_2_0= ruleETDR )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:552:3: lv_type_2_0= ruleETDR
            {
             
            	        newCompositeNode(grammarAccess.getEDAccess().getTypeETDRParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETDR_in_ruleED1168);
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:576:1: entryRuleRD returns [EObject current=null] : iv_ruleRD= ruleRD EOF ;
    public final EObject entryRuleRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:577:2: (iv_ruleRD= ruleRD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:578:2: iv_ruleRD= ruleRD EOF
            {
             newCompositeNode(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_ruleRD_in_entryRuleRD1204);
            iv_ruleRD=ruleRD();

            state._fsp--;

             current =iv_ruleRD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRD1214); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:585:1: ruleRD returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:588:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:589:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:589:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:589:2: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:589:2: ( (otherlv_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:590:1: (otherlv_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:590:1: (otherlv_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:591:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD1259); 

            		newLeafNode(otherlv_0, grammarAccess.getRDAccess().getSourceEDCrossReference_0_0()); 
            	

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:602:2: ( (otherlv_1= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:603:1: (otherlv_1= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:603:1: (otherlv_1= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:604:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD1279); 

            		newLeafNode(otherlv_1, grammarAccess.getRDAccess().getRelRTDCrossReference_1_0()); 
            	

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:615:2: ( (otherlv_2= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:616:1: (otherlv_2= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:616:1: (otherlv_2= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:617:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD1299); 

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:636:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:637:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:638:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1336);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedID1347); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:645:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:648:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:649:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:649:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:649:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID1387); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:656:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:657:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedID1406); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID1421); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "entryRuleMegaLLinking"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:677:1: entryRuleMegaLLinking returns [EObject current=null] : iv_ruleMegaLLinking= ruleMegaLLinking EOF ;
    public final EObject entryRuleMegaLLinking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegaLLinking = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:678:2: (iv_ruleMegaLLinking= ruleMegaLLinking EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:679:2: iv_ruleMegaLLinking= ruleMegaLLinking EOF
            {
             newCompositeNode(grammarAccess.getMegaLLinkingRule()); 
            pushFollow(FOLLOW_ruleMegaLLinking_in_entryRuleMegaLLinking1468);
            iv_ruleMegaLLinking=ruleMegaLLinking();

            state._fsp--;

             current =iv_ruleMegaLLinking; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMegaLLinking1478); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMegaLLinking"


    // $ANTLR start "ruleMegaLLinking"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:686:1: ruleMegaLLinking returns [EObject current=null] : (otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_links_4_0= ruleLD ) )* ) ;
    public final EObject ruleMegaLLinking() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_links_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:689:28: ( (otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_links_4_0= ruleLD ) )* ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:690:1: (otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_links_4_0= ruleLD ) )* )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:690:1: (otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_links_4_0= ruleLD ) )* )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:690:3: otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_links_4_0= ruleLD ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleMegaLLinking1515); 

                	newLeafNode(otherlv_0, grammarAccess.getMegaLLinkingAccess().getLinkingKeyword_0());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:694:1: ( (lv_name_1_0= ruleQualifiedID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:695:1: (lv_name_1_0= ruleQualifiedID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:695:1: (lv_name_1_0= ruleQualifiedID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:696:3: lv_name_1_0= ruleQualifiedID
            {
             
            	        newCompositeNode(grammarAccess.getMegaLLinkingAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1536);
            lv_name_1_0=ruleQualifiedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMegaLLinkingRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:712:2: (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:712:4: otherlv_2= 'for' ( ( ruleQualifiedID ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleMegaLLinking1549); 

                        	newLeafNode(otherlv_2, grammarAccess.getMegaLLinkingAccess().getForKeyword_2_0());
                        
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:716:1: ( ( ruleQualifiedID ) )
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:717:1: ( ruleQualifiedID )
                    {
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:717:1: ( ruleQualifiedID )
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:718:3: ruleQualifiedID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegaLLinkingRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMegaLLinkingAccess().getTargetMegaLDefinitionCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1572);
                    ruleQualifiedID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:731:4: ( (lv_links_4_0= ruleLD ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:732:1: (lv_links_4_0= ruleLD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:732:1: (lv_links_4_0= ruleLD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:733:3: lv_links_4_0= ruleLD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLLinkingAccess().getLinksLDParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLD_in_ruleMegaLLinking1595);
            	    lv_links_4_0=ruleLD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLLinkingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"links",
            	            		lv_links_4_0, 
            	            		"LD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleMegaLLinking"


    // $ANTLR start "entryRuleLD"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:757:1: entryRuleLD returns [EObject current=null] : iv_ruleLD= ruleLD EOF ;
    public final EObject entryRuleLD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:758:2: (iv_ruleLD= ruleLD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:759:2: iv_ruleLD= ruleLD EOF
            {
             newCompositeNode(grammarAccess.getLDRule()); 
            pushFollow(FOLLOW_ruleLD_in_entryRuleLD1632);
            iv_ruleLD=ruleLD();

            state._fsp--;

             current =iv_ruleLD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLD1642); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLD"


    // $ANTLR start "ruleLD"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:766:1: ruleLD returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_key_2_0= RULE_ID ) ) )? otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleLD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_key_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:769:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_key_2_0= RULE_ID ) ) )? otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:770:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_key_2_0= RULE_ID ) ) )? otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:770:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_key_2_0= RULE_ID ) ) )? otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:770:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_key_2_0= RULE_ID ) ) )? otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:770:2: ( (otherlv_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:771:1: (otherlv_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:771:1: (otherlv_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:772:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLDRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLD1687); 

            		newLeafNode(otherlv_0, grammarAccess.getLDAccess().getTargetEDCrossReference_0_0()); 
            	

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:783:2: (otherlv_1= '.' ( (lv_key_2_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:783:4: otherlv_1= '.' ( (lv_key_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleLD1700); 

                        	newLeafNode(otherlv_1, grammarAccess.getLDAccess().getFullStopKeyword_1_0());
                        
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:787:1: ( (lv_key_2_0= RULE_ID ) )
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:788:1: (lv_key_2_0= RULE_ID )
                    {
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:788:1: (lv_key_2_0= RULE_ID )
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:789:3: lv_key_2_0= RULE_ID
                    {
                    lv_key_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLD1717); 

                    			newLeafNode(lv_key_2_0, grammarAccess.getLDAccess().getKeyIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLDRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"key",
                            		lv_key_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleLD1736); 

                	newLeafNode(otherlv_3, grammarAccess.getLDAccess().getEqualsSignKeyword_2());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:809:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:810:1: (lv_value_4_0= RULE_STRING )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:810:1: (lv_value_4_0= RULE_STRING )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:811:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLD1753); 

            			newLeafNode(lv_value_4_0, grammarAccess.getLDAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleLD"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\1\1\6\uffff\2\11\2\uffff";
    static final String DFA3_minS =
        "\1\4\2\uffff\2\4\2\uffff\2\4\2\uffff";
    static final String DFA3_maxS =
        "\1\16\2\uffff\1\22\1\17\2\uffff\2\21\2\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\6\1\1\2\uffff\1\5\1\4\2\uffff\1\2\1\3";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\11\uffff\1\2",
            "",
            "",
            "\1\5\13\uffff\1\4\1\uffff\1\6",
            "\1\10\12\uffff\1\7",
            "",
            "",
            "\1\11\11\uffff\1\11\2\uffff\1\12",
            "\1\11\11\uffff\1\11\2\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 165:4: ( (otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) ) | ( (lv_etd_7_0= ruleETD ) ) | ( (lv_rtd_8_0= ruleRTD ) ) | ( (lv_ed_9_0= ruleED ) ) | ( (lv_rd_10_0= ruleRD ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLDefinition_in_ruleModel132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLLinking_in_ruleModel159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLDefinition_in_entryRuleMegaLDefinition194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaLDefinition204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMegaLDefinition241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLDefinition262 = new BitSet(new long[]{0x0000000000005012L});
    public static final BitSet FOLLOW_12_in_ruleMegaLDefinition275 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMegaLDefinition287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLDefinition310 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_14_in_ruleMegaLDefinition326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMegaLDefinition346 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleETD_in_ruleMegaLDefinition374 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleRTD_in_ruleMegaLDefinition401 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleED_in_ruleMegaLDefinition428 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleRD_in_ruleMegaLDefinition455 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleETDR_in_entryRuleETDR493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDR503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDEntity_in_ruleETDR550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDDeclared_in_ruleETDR577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDEntity_in_entryRuleETDEntity612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDEntity622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleETDEntity668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDDeclared_in_entryRuleETDDeclared704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDDeclared714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETDDeclared758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_entryRuleETD793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETD803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETD845 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleETD862 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleETDR_in_ruleETD883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_entryRuleRTD919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTD929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRTD971 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRTD988 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleETDR_in_ruleRTD1009 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRTD1021 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleETDR_in_ruleRTD1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_entryRuleED1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleED1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleED1130 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleED1147 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleETDR_in_ruleED1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_entryRuleRD1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRD1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD1259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD1279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1387 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedID1406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1421 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleMegaLLinking_in_entryRuleMegaLLinking1468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaLLinking1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMegaLLinking1515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1536 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_21_in_ruleMegaLLinking1549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1572 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLD_in_ruleMegaLLinking1595 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLD_in_entryRuleLD1632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLD1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLD1687 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleLD1700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLD1717 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLD1736 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLD1753 = new BitSet(new long[]{0x0000000000000002L});

}