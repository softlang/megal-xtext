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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'linked'", "'in'", "'import'", "'define'", "'from'", "':'", "'->'", "','", "'linking'", "'for'", "'='", "'.'"
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
    public static final int T__23=23;
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:116:1: ruleMegaLDefinition returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_rds_6_0= ruleRD ) ) | ( (lv_etds_7_0= ruleETD ) ) | ( (lv_rtds_8_0= ruleRTD ) ) | ( (lv_eds_9_0= ruleEDGroup ) ) )* ) ;
    public final EObject ruleMegaLDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_5_0 = null;

        EObject lv_rds_6_0 = null;

        EObject lv_etds_7_0 = null;

        EObject lv_rtds_8_0 = null;

        EObject lv_eds_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:119:28: ( (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_rds_6_0= ruleRD ) ) | ( (lv_etds_7_0= ruleETD ) ) | ( (lv_rtds_8_0= ruleRTD ) ) | ( (lv_eds_9_0= ruleEDGroup ) ) )* ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:120:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_rds_6_0= ruleRD ) ) | ( (lv_etds_7_0= ruleETD ) ) | ( (lv_rtds_8_0= ruleRTD ) ) | ( (lv_eds_9_0= ruleEDGroup ) ) )* )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:120:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_rds_6_0= ruleRD ) ) | ( (lv_etds_7_0= ruleETD ) ) | ( (lv_rtds_8_0= ruleRTD ) ) | ( (lv_eds_9_0= ruleEDGroup ) ) )* )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:120:3: otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_rds_6_0= ruleRD ) ) | ( (lv_etds_7_0= ruleETD ) ) | ( (lv_rtds_8_0= ruleRTD ) ) | ( (lv_eds_9_0= ruleEDGroup ) ) )*
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

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:165:4: ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_rds_6_0= ruleRD ) ) | ( (lv_etds_7_0= ruleETD ) ) | ( (lv_rtds_8_0= ruleRTD ) ) | ( (lv_eds_9_0= ruleEDGroup ) ) )*
            loop3:
            do {
                int alt3=6;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:165:5: ( (lv_imports_5_0= ruleImport ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:165:5: ( (lv_imports_5_0= ruleImport ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:166:1: (lv_imports_5_0= ruleImport )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:166:1: (lv_imports_5_0= ruleImport )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:167:3: lv_imports_5_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getImportsImportParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleMegaLDefinition334);
            	    lv_imports_5_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_5_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:184:6: ( (lv_rds_6_0= ruleRD ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:184:6: ( (lv_rds_6_0= ruleRD ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:185:1: (lv_rds_6_0= ruleRD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:185:1: (lv_rds_6_0= ruleRD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:186:3: lv_rds_6_0= ruleRD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getRdsRDParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRD_in_ruleMegaLDefinition361);
            	    lv_rds_6_0=ruleRD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rds",
            	            		lv_rds_6_0, 
            	            		"RD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:203:6: ( (lv_etds_7_0= ruleETD ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:203:6: ( (lv_etds_7_0= ruleETD ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:204:1: (lv_etds_7_0= ruleETD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:204:1: (lv_etds_7_0= ruleETD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:205:3: lv_etds_7_0= ruleETD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getEtdsETDParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETD_in_ruleMegaLDefinition388);
            	    lv_etds_7_0=ruleETD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"etds",
            	            		lv_etds_7_0, 
            	            		"ETD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:222:6: ( (lv_rtds_8_0= ruleRTD ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:222:6: ( (lv_rtds_8_0= ruleRTD ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:223:1: (lv_rtds_8_0= ruleRTD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:223:1: (lv_rtds_8_0= ruleRTD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:224:3: lv_rtds_8_0= ruleRTD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getRtdsRTDParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRTD_in_ruleMegaLDefinition415);
            	    lv_rtds_8_0=ruleRTD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rtds",
            	            		lv_rtds_8_0, 
            	            		"RTD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:241:6: ( (lv_eds_9_0= ruleEDGroup ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:241:6: ( (lv_eds_9_0= ruleEDGroup ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:242:1: (lv_eds_9_0= ruleEDGroup )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:242:1: (lv_eds_9_0= ruleEDGroup )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:243:3: lv_eds_9_0= ruleEDGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getEdsEDGroupParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEDGroup_in_ruleMegaLDefinition442);
            	    lv_eds_9_0=ruleEDGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"eds",
            	            		lv_eds_9_0, 
            	            		"EDGroup");
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


    // $ANTLR start "entryRuleImport"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:267:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:268:2: (iv_ruleImport= ruleImport EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:269:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport480);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport490); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:276:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:279:28: ( (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:280:1: (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:280:1: (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:280:3: otherlv_0= 'import' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport527); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:284:1: ( (otherlv_1= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:285:1: (otherlv_1= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:285:1: (otherlv_1= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:286:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImport547); 

            		newLeafNode(otherlv_1, grammarAccess.getImportAccess().getRefMegaLDefinitionCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleETD"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:305:1: entryRuleETD returns [EObject current=null] : iv_ruleETD= ruleETD EOF ;
    public final EObject entryRuleETD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:306:2: (iv_ruleETD= ruleETD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:307:2: iv_ruleETD= ruleETD EOF
            {
             newCompositeNode(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_ruleETD_in_entryRuleETD583);
            iv_ruleETD=ruleETD();

            state._fsp--;

             current =iv_ruleETD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETD593); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:314:1: ruleETD returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleETD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:317:28: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )? ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:318:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:318:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )? )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:318:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleETD630); 

                	newLeafNode(otherlv_0, grammarAccess.getETDAccess().getDefineKeyword_0());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:322:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:323:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:323:1: (lv_name_1_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:324:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETD647); 

            			newLeafNode(lv_name_1_0, grammarAccess.getETDAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getETDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:340:2: (otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:340:4: otherlv_2= 'from' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleETD665); 

                        	newLeafNode(otherlv_2, grammarAccess.getETDAccess().getFromKeyword_2_0());
                        
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:344:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:345:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:345:1: (otherlv_3= RULE_ID )
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:346:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getETDRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETD685); 

                    		newLeafNode(otherlv_3, grammarAccess.getETDAccess().getSupertypeETDCrossReference_2_1_0()); 
                    	

                    }


                    }


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
    // $ANTLR end "ruleETD"


    // $ANTLR start "entryRuleRTD"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:365:1: entryRuleRTD returns [EObject current=null] : iv_ruleRTD= ruleRTD EOF ;
    public final EObject entryRuleRTD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:366:2: (iv_ruleRTD= ruleRTD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:367:2: iv_ruleRTD= ruleRTD EOF
            {
             newCompositeNode(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_ruleRTD_in_entryRuleRTD723);
            iv_ruleRTD=ruleRTD();

            state._fsp--;

             current =iv_ruleRTD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTD733); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:374:1: ruleRTD returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleRTD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:377:28: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:378:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:378:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:378:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleRTD770); 

                	newLeafNode(otherlv_0, grammarAccess.getRTDAccess().getDefineKeyword_0());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:382:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:383:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:383:1: (lv_name_1_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:384:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRTD787); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRTDAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRTDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleRTD804); 

                	newLeafNode(otherlv_2, grammarAccess.getRTDAccess().getColonKeyword_2());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:404:1: ( (otherlv_3= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:405:1: (otherlv_3= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:405:1: (otherlv_3= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:406:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRTDRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRTD824); 

            		newLeafNode(otherlv_3, grammarAccess.getRTDAccess().getDomainETDCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleRTD836); 

                	newLeafNode(otherlv_4, grammarAccess.getRTDAccess().getHyphenMinusGreaterThanSignKeyword_4());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:421:1: ( (otherlv_5= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:422:1: (otherlv_5= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:422:1: (otherlv_5= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:423:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRTDRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRTD856); 

            		newLeafNode(otherlv_5, grammarAccess.getRTDAccess().getCoDomainETDCrossReference_5_0()); 
            	

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


    // $ANTLR start "entryRuleEDGroup"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:442:1: entryRuleEDGroup returns [EObject current=null] : iv_ruleEDGroup= ruleEDGroup EOF ;
    public final EObject entryRuleEDGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDGroup = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:443:2: (iv_ruleEDGroup= ruleEDGroup EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:444:2: iv_ruleEDGroup= ruleEDGroup EOF
            {
             newCompositeNode(grammarAccess.getEDGroupRule()); 
            pushFollow(FOLLOW_ruleEDGroup_in_entryRuleEDGroup892);
            iv_ruleEDGroup=ruleEDGroup();

            state._fsp--;

             current =iv_ruleEDGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEDGroup902); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDGroup"


    // $ANTLR start "ruleEDGroup"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:451:1: ruleEDGroup returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleED ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleED ) ) )* ) ;
    public final EObject ruleEDGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:454:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleED ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleED ) ) )* ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:455:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleED ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleED ) ) )* )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:455:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleED ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleED ) ) )* )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:455:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleED ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleED ) ) )*
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:455:2: ( (otherlv_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:456:1: (otherlv_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:456:1: (otherlv_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:457:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEDGroupRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEDGroup947); 

            		newLeafNode(otherlv_0, grammarAccess.getEDGroupAccess().getTypeETDCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleEDGroup959); 

                	newLeafNode(otherlv_1, grammarAccess.getEDGroupAccess().getColonKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:472:1: ( (lv_items_2_0= ruleED ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:473:1: (lv_items_2_0= ruleED )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:473:1: (lv_items_2_0= ruleED )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:474:3: lv_items_2_0= ruleED
            {
             
            	        newCompositeNode(grammarAccess.getEDGroupAccess().getItemsEDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleED_in_ruleEDGroup980);
            lv_items_2_0=ruleED();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEDGroupRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_2_0, 
                    		"ED");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:490:2: (otherlv_3= ',' ( (lv_items_4_0= ruleED ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:490:4: otherlv_3= ',' ( (lv_items_4_0= ruleED ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleEDGroup993); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEDGroupAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:494:1: ( (lv_items_4_0= ruleED ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:495:1: (lv_items_4_0= ruleED )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:495:1: (lv_items_4_0= ruleED )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:496:3: lv_items_4_0= ruleED
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEDGroupAccess().getItemsEDParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleED_in_ruleEDGroup1014);
            	    lv_items_4_0=ruleED();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEDGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_4_0, 
            	            		"ED");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


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
    // $ANTLR end "ruleEDGroup"


    // $ANTLR start "entryRuleED"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:520:1: entryRuleED returns [EObject current=null] : iv_ruleED= ruleED EOF ;
    public final EObject entryRuleED() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleED = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:521:2: (iv_ruleED= ruleED EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:522:2: iv_ruleED= ruleED EOF
            {
             newCompositeNode(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_ruleED_in_entryRuleED1052);
            iv_ruleED=ruleED();

            state._fsp--;

             current =iv_ruleED; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleED1062); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:529:1: ruleED returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleED() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:532:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:533:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:533:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:534:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:534:1: (lv_name_0_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:535:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleED1103); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEDAccess().getNameIDTerminalRuleCall_0()); 
            		

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:559:1: entryRuleRD returns [EObject current=null] : iv_ruleRD= ruleRD EOF ;
    public final EObject entryRuleRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:560:2: (iv_ruleRD= ruleRD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:561:2: iv_ruleRD= ruleRD EOF
            {
             newCompositeNode(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_ruleRD_in_entryRuleRD1143);
            iv_ruleRD=ruleRD();

            state._fsp--;

             current =iv_ruleRD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRD1153); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:568:1: ruleRD returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:571:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:572:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:572:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:572:2: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:572:2: ( (otherlv_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:573:1: (otherlv_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:573:1: (otherlv_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:574:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD1198); 

            		newLeafNode(otherlv_0, grammarAccess.getRDAccess().getSourceEDCrossReference_0_0()); 
            	

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:585:2: ( (otherlv_1= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:586:1: (otherlv_1= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:586:1: (otherlv_1= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:587:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD1218); 

            		newLeafNode(otherlv_1, grammarAccess.getRDAccess().getRelRTDCrossReference_1_0()); 
            	

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:598:2: ( (otherlv_2= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:599:1: (otherlv_2= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:599:1: (otherlv_2= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:600:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD1238); 

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


    // $ANTLR start "entryRuleMegaLLinking"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:619:1: entryRuleMegaLLinking returns [EObject current=null] : iv_ruleMegaLLinking= ruleMegaLLinking EOF ;
    public final EObject entryRuleMegaLLinking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegaLLinking = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:620:2: (iv_ruleMegaLLinking= ruleMegaLLinking EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:621:2: iv_ruleMegaLLinking= ruleMegaLLinking EOF
            {
             newCompositeNode(grammarAccess.getMegaLLinkingRule()); 
            pushFollow(FOLLOW_ruleMegaLLinking_in_entryRuleMegaLLinking1274);
            iv_ruleMegaLLinking=ruleMegaLLinking();

            state._fsp--;

             current =iv_ruleMegaLLinking; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMegaLLinking1284); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:628:1: ruleMegaLLinking returns [EObject current=null] : (otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_lds_4_0= ruleLD ) )* ) ;
    public final EObject ruleMegaLLinking() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_lds_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:631:28: ( (otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_lds_4_0= ruleLD ) )* ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:632:1: (otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_lds_4_0= ruleLD ) )* )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:632:1: (otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_lds_4_0= ruleLD ) )* )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:632:3: otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_lds_4_0= ruleLD ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleMegaLLinking1321); 

                	newLeafNode(otherlv_0, grammarAccess.getMegaLLinkingAccess().getLinkingKeyword_0());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:636:1: ( (lv_name_1_0= ruleQualifiedID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:637:1: (lv_name_1_0= ruleQualifiedID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:637:1: (lv_name_1_0= ruleQualifiedID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:638:3: lv_name_1_0= ruleQualifiedID
            {
             
            	        newCompositeNode(grammarAccess.getMegaLLinkingAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1342);
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

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:654:2: (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:654:4: otherlv_2= 'for' ( ( ruleQualifiedID ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleMegaLLinking1355); 

                        	newLeafNode(otherlv_2, grammarAccess.getMegaLLinkingAccess().getForKeyword_2_0());
                        
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:658:1: ( ( ruleQualifiedID ) )
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:659:1: ( ruleQualifiedID )
                    {
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:659:1: ( ruleQualifiedID )
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:660:3: ruleQualifiedID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegaLLinkingRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMegaLLinkingAccess().getTargetMegaLDefinitionCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1378);
                    ruleQualifiedID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:673:4: ( (lv_lds_4_0= ruleLD ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:674:1: (lv_lds_4_0= ruleLD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:674:1: (lv_lds_4_0= ruleLD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:675:3: lv_lds_4_0= ruleLD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLLinkingAccess().getLdsLDParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLD_in_ruleMegaLLinking1401);
            	    lv_lds_4_0=ruleLD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLLinkingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"lds",
            	            		lv_lds_4_0, 
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:699:1: entryRuleLD returns [EObject current=null] : iv_ruleLD= ruleLD EOF ;
    public final EObject entryRuleLD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:700:2: (iv_ruleLD= ruleLD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:701:2: iv_ruleLD= ruleLD EOF
            {
             newCompositeNode(grammarAccess.getLDRule()); 
            pushFollow(FOLLOW_ruleLD_in_entryRuleLD1438);
            iv_ruleLD=ruleLD();

            state._fsp--;

             current =iv_ruleLD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLD1448); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:708:1: ruleLD returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:711:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:712:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:712:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:712:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:712:2: ( (otherlv_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:713:1: (otherlv_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:713:1: (otherlv_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:714:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLDRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLD1493); 

            		newLeafNode(otherlv_0, grammarAccess.getLDAccess().getTargetEDCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleLD1505); 

                	newLeafNode(otherlv_1, grammarAccess.getLDAccess().getEqualsSignKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:729:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:730:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:730:1: (lv_value_2_0= RULE_STRING )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:731:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLD1522); 

            			newLeafNode(lv_value_2_0, grammarAccess.getLDAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
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


    // $ANTLR start "entryRuleQualifiedID"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:755:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:756:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:757:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1564);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedID1575); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:764:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:767:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:768:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:768:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:768:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID1615); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:775:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:776:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_23_in_ruleQualifiedID1634); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID1649); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
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


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\1\1\6\uffff\1\10\2\uffff";
    static final String DFA3_minS =
        "\1\4\2\uffff\2\4\2\uffff\1\4\2\uffff";
    static final String DFA3_maxS =
        "\1\17\2\uffff\1\21\1\4\2\uffff\1\21\2\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\6\1\1\2\uffff\1\2\1\5\1\uffff\1\3\1\4";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\11\uffff\1\2\1\4",
            "",
            "",
            "\1\5\14\uffff\1\6",
            "\1\7",
            "",
            "",
            "\1\10\11\uffff\3\10\1\11",
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
            return "()* loopback of 165:4: ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_rds_6_0= ruleRD ) ) | ( (lv_etds_7_0= ruleETD ) ) | ( (lv_rtds_8_0= ruleRTD ) ) | ( (lv_eds_9_0= ruleEDGroup ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLDefinition_in_ruleModel132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLLinking_in_ruleModel159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLDefinition_in_entryRuleMegaLDefinition194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaLDefinition204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMegaLDefinition241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLDefinition262 = new BitSet(new long[]{0x000000000000D012L});
    public static final BitSet FOLLOW_12_in_ruleMegaLDefinition275 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMegaLDefinition287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLDefinition310 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_ruleImport_in_ruleMegaLDefinition334 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_ruleRD_in_ruleMegaLDefinition361 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_ruleETD_in_ruleMegaLDefinition388 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_ruleRTD_in_ruleMegaLDefinition415 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_ruleEDGroup_in_ruleMegaLDefinition442 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImport547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_entryRuleETD583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETD593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleETD630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETD647 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleETD665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETD685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_entryRuleRTD723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTD733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRTD770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRTD787 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRTD804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRTD824 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRTD836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRTD856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDGroup_in_entryRuleEDGroup892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEDGroup902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEDGroup947 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEDGroup959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleED_in_ruleEDGroup980 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleEDGroup993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleED_in_ruleEDGroup1014 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleED_in_entryRuleED1052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleED1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleED1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_entryRuleRD1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRD1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD1198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD1218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLLinking_in_entryRuleMegaLLinking1274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaLLinking1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMegaLLinking1321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1342 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_21_in_ruleMegaLLinking1355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1378 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLD_in_ruleMegaLLinking1401 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLD_in_entryRuleLD1438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLD1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLD1493 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLD1505 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLD1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1615 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleQualifiedID1634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1649 = new BitSet(new long[]{0x0000000000800002L});

}