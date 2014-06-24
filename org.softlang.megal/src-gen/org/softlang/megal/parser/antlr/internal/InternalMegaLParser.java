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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'linked'", "'in'", "'import'", "'<'", "'*'", "':'", "'Entity'", "'linking'", "'for'", "'='", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int RULE_WS=8;

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

            if ( (LA1_0==10) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:116:1: ruleMegaLDefinition returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_etds_6_0= ruleETD ) ) | ( (lv_rtds_7_0= ruleRTD ) ) | ( (lv_eds_8_0= ruleED ) ) | ( (lv_rds_9_0= ruleRD ) ) )* ) ;
    public final EObject ruleMegaLDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_5_0 = null;

        EObject lv_etds_6_0 = null;

        EObject lv_rtds_7_0 = null;

        EObject lv_eds_8_0 = null;

        EObject lv_rds_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:119:28: ( (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_etds_6_0= ruleETD ) ) | ( (lv_rtds_7_0= ruleRTD ) ) | ( (lv_eds_8_0= ruleED ) ) | ( (lv_rds_9_0= ruleRD ) ) )* ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:120:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_etds_6_0= ruleETD ) ) | ( (lv_rtds_7_0= ruleRTD ) ) | ( (lv_eds_8_0= ruleED ) ) | ( (lv_rds_9_0= ruleRD ) ) )* )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:120:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_etds_6_0= ruleETD ) ) | ( (lv_rtds_7_0= ruleRTD ) ) | ( (lv_eds_8_0= ruleED ) ) | ( (lv_rds_9_0= ruleRD ) ) )* )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:120:3: otherlv_0= 'model' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) ) )? ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_etds_6_0= ruleETD ) ) | ( (lv_rtds_7_0= ruleRTD ) ) | ( (lv_eds_8_0= ruleED ) ) | ( (lv_rds_9_0= ruleRD ) ) )*
            {
            otherlv_0=(Token)match(input,10,FOLLOW_10_in_ruleMegaLDefinition241); 

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

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:142:4: otherlv_2= 'linked' otherlv_3= 'in' ( ( ruleQualifiedID ) )
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleMegaLDefinition275); 

                        	newLeafNode(otherlv_2, grammarAccess.getMegaLDefinitionAccess().getLinkedKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleMegaLDefinition287); 

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

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:165:4: ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_etds_6_0= ruleETD ) ) | ( (lv_rtds_7_0= ruleRTD ) ) | ( (lv_eds_8_0= ruleED ) ) | ( (lv_rds_9_0= ruleRD ) ) )*
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
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:184:6: ( (lv_etds_6_0= ruleETD ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:184:6: ( (lv_etds_6_0= ruleETD ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:185:1: (lv_etds_6_0= ruleETD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:185:1: (lv_etds_6_0= ruleETD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:186:3: lv_etds_6_0= ruleETD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getEtdsETDParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETD_in_ruleMegaLDefinition361);
            	    lv_etds_6_0=ruleETD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"etds",
            	            		lv_etds_6_0, 
            	            		"ETD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:203:6: ( (lv_rtds_7_0= ruleRTD ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:203:6: ( (lv_rtds_7_0= ruleRTD ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:204:1: (lv_rtds_7_0= ruleRTD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:204:1: (lv_rtds_7_0= ruleRTD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:205:3: lv_rtds_7_0= ruleRTD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getRtdsRTDParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRTD_in_ruleMegaLDefinition388);
            	    lv_rtds_7_0=ruleRTD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rtds",
            	            		lv_rtds_7_0, 
            	            		"RTD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:222:6: ( (lv_eds_8_0= ruleED ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:222:6: ( (lv_eds_8_0= ruleED ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:223:1: (lv_eds_8_0= ruleED )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:223:1: (lv_eds_8_0= ruleED )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:224:3: lv_eds_8_0= ruleED
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getEdsEDParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleED_in_ruleMegaLDefinition415);
            	    lv_eds_8_0=ruleED();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"eds",
            	            		lv_eds_8_0, 
            	            		"ED");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:241:6: ( (lv_rds_9_0= ruleRD ) )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:241:6: ( (lv_rds_9_0= ruleRD ) )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:242:1: (lv_rds_9_0= ruleRD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:242:1: (lv_rds_9_0= ruleRD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:243:3: lv_rds_9_0= ruleRD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLDefinitionAccess().getRdsRDParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRD_in_ruleMegaLDefinition442);
            	    lv_rds_9_0=ruleRD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegaLDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rds",
            	            		lv_rds_9_0, 
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
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport527); 

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:314:1: ruleETD returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleUseETD ) ) ) ;
    public final EObject ruleETD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_supertype_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:317:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleUseETD ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:318:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleUseETD ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:318:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleUseETD ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:318:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleUseETD ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:318:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:319:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:319:1: (lv_name_0_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:320:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETD635); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleETD652); 

                	newLeafNode(otherlv_1, grammarAccess.getETDAccess().getLessThanSignKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:340:1: ( (lv_supertype_2_0= ruleUseETD ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:341:1: (lv_supertype_2_0= ruleUseETD )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:341:1: (lv_supertype_2_0= ruleUseETD )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:342:3: lv_supertype_2_0= ruleUseETD
            {
             
            	        newCompositeNode(grammarAccess.getETDAccess().getSupertypeUseETDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUseETD_in_ruleETD673);
            lv_supertype_2_0=ruleUseETD();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETDRule());
            	        }
                   		set(
                   			current, 
                   			"supertype",
                    		lv_supertype_2_0, 
                    		"UseETD");
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:366:1: entryRuleRTD returns [EObject current=null] : iv_ruleRTD= ruleRTD EOF ;
    public final EObject entryRuleRTD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:367:2: (iv_ruleRTD= ruleRTD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:368:2: iv_ruleRTD= ruleRTD EOF
            {
             newCompositeNode(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_ruleRTD_in_entryRuleRTD709);
            iv_ruleRTD=ruleRTD();

            state._fsp--;

             current =iv_ruleRTD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTD719); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:375:1: ruleRTD returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleUseETD ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleUseETD ) ) ) ;
    public final EObject ruleRTD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_domain_2_0 = null;

        EObject lv_coDomain_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:378:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleUseETD ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleUseETD ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:379:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleUseETD ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleUseETD ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:379:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleUseETD ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleUseETD ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:379:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleUseETD ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleUseETD ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:379:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:380:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:380:1: (lv_name_0_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:381:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRTD761); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleRTD778); 

                	newLeafNode(otherlv_1, grammarAccess.getRTDAccess().getLessThanSignKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:401:1: ( (lv_domain_2_0= ruleUseETD ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:402:1: (lv_domain_2_0= ruleUseETD )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:402:1: (lv_domain_2_0= ruleUseETD )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:403:3: lv_domain_2_0= ruleUseETD
            {
             
            	        newCompositeNode(grammarAccess.getRTDAccess().getDomainUseETDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUseETD_in_ruleRTD799);
            lv_domain_2_0=ruleUseETD();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRTDRule());
            	        }
                   		set(
                   			current, 
                   			"domain",
                    		lv_domain_2_0, 
                    		"UseETD");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleRTD811); 

                	newLeafNode(otherlv_3, grammarAccess.getRTDAccess().getAsteriskKeyword_3());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:423:1: ( (lv_coDomain_4_0= ruleUseETD ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:424:1: (lv_coDomain_4_0= ruleUseETD )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:424:1: (lv_coDomain_4_0= ruleUseETD )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:425:3: lv_coDomain_4_0= ruleUseETD
            {
             
            	        newCompositeNode(grammarAccess.getRTDAccess().getCoDomainUseETDParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleUseETD_in_ruleRTD832);
            lv_coDomain_4_0=ruleUseETD();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRTDRule());
            	        }
                   		set(
                   			current, 
                   			"coDomain",
                    		lv_coDomain_4_0, 
                    		"UseETD");
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


    // $ANTLR start "entryRuleRD"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:449:1: entryRuleRD returns [EObject current=null] : iv_ruleRD= ruleRD EOF ;
    public final EObject entryRuleRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:450:2: (iv_ruleRD= ruleRD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:451:2: iv_ruleRD= ruleRD EOF
            {
             newCompositeNode(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_ruleRD_in_entryRuleRD868);
            iv_ruleRD=ruleRD();

            state._fsp--;

             current =iv_ruleRD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRD878); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:458:1: ruleRD returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:461:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:462:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:462:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:462:2: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:462:2: ( (otherlv_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:463:1: (otherlv_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:463:1: (otherlv_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:464:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD923); 

            		newLeafNode(otherlv_0, grammarAccess.getRDAccess().getSourceEDCrossReference_0_0()); 
            	

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:475:2: ( (otherlv_1= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:476:1: (otherlv_1= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:476:1: (otherlv_1= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:477:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD943); 

            		newLeafNode(otherlv_1, grammarAccess.getRDAccess().getRelRTDCrossReference_1_0()); 
            	

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:488:2: ( (otherlv_2= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:489:1: (otherlv_2= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:489:1: (otherlv_2= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:490:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD963); 

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


    // $ANTLR start "entryRuleED"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:509:1: entryRuleED returns [EObject current=null] : iv_ruleED= ruleED EOF ;
    public final EObject entryRuleED() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleED = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:510:2: (iv_ruleED= ruleED EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:511:2: iv_ruleED= ruleED EOF
            {
             newCompositeNode(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_ruleED_in_entryRuleED999);
            iv_ruleED=ruleED();

            state._fsp--;

             current =iv_ruleED; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleED1009); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:518:1: ruleED returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleUseETD ) ) ) ;
    public final EObject ruleED() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:521:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleUseETD ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:522:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleUseETD ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:522:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleUseETD ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:522:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleUseETD ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:522:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:523:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:523:1: (lv_name_0_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:524:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleED1051); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleED1068); 

                	newLeafNode(otherlv_1, grammarAccess.getEDAccess().getColonKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:544:1: ( (lv_type_2_0= ruleUseETD ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:545:1: (lv_type_2_0= ruleUseETD )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:545:1: (lv_type_2_0= ruleUseETD )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:546:3: lv_type_2_0= ruleUseETD
            {
             
            	        newCompositeNode(grammarAccess.getEDAccess().getTypeUseETDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUseETD_in_ruleED1089);
            lv_type_2_0=ruleUseETD();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEDRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"UseETD");
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


    // $ANTLR start "entryRuleUseETD"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:570:1: entryRuleUseETD returns [EObject current=null] : iv_ruleUseETD= ruleUseETD EOF ;
    public final EObject entryRuleUseETD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseETD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:571:2: (iv_ruleUseETD= ruleUseETD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:572:2: iv_ruleUseETD= ruleUseETD EOF
            {
             newCompositeNode(grammarAccess.getUseETDRule()); 
            pushFollow(FOLLOW_ruleUseETD_in_entryRuleUseETD1125);
            iv_ruleUseETD=ruleUseETD();

            state._fsp--;

             current =iv_ruleUseETD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseETD1135); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseETD"


    // $ANTLR start "ruleUseETD"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:579:1: ruleUseETD returns [EObject current=null] : (this_UseETDRef_0= ruleUseETDRef | this_UseEntity_1= ruleUseEntity ) ;
    public final EObject ruleUseETD() throws RecognitionException {
        EObject current = null;

        EObject this_UseETDRef_0 = null;

        EObject this_UseEntity_1 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:582:28: ( (this_UseETDRef_0= ruleUseETDRef | this_UseEntity_1= ruleUseEntity ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:583:1: (this_UseETDRef_0= ruleUseETDRef | this_UseEntity_1= ruleUseEntity )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:583:1: (this_UseETDRef_0= ruleUseETDRef | this_UseEntity_1= ruleUseEntity )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:584:5: this_UseETDRef_0= ruleUseETDRef
                    {
                     
                            newCompositeNode(grammarAccess.getUseETDAccess().getUseETDRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUseETDRef_in_ruleUseETD1182);
                    this_UseETDRef_0=ruleUseETDRef();

                    state._fsp--;

                     
                            current = this_UseETDRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:594:5: this_UseEntity_1= ruleUseEntity
                    {
                     
                            newCompositeNode(grammarAccess.getUseETDAccess().getUseEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUseEntity_in_ruleUseETD1209);
                    this_UseEntity_1=ruleUseEntity();

                    state._fsp--;

                     
                            current = this_UseEntity_1; 
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
    // $ANTLR end "ruleUseETD"


    // $ANTLR start "entryRuleUseETDRef"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:610:1: entryRuleUseETDRef returns [EObject current=null] : iv_ruleUseETDRef= ruleUseETDRef EOF ;
    public final EObject entryRuleUseETDRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseETDRef = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:611:2: (iv_ruleUseETDRef= ruleUseETDRef EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:612:2: iv_ruleUseETDRef= ruleUseETDRef EOF
            {
             newCompositeNode(grammarAccess.getUseETDRefRule()); 
            pushFollow(FOLLOW_ruleUseETDRef_in_entryRuleUseETDRef1244);
            iv_ruleUseETDRef=ruleUseETDRef();

            state._fsp--;

             current =iv_ruleUseETDRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseETDRef1254); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseETDRef"


    // $ANTLR start "ruleUseETDRef"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:619:1: ruleUseETDRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleUseETDRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:622:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:623:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:623:1: ( (otherlv_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:624:1: (otherlv_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:624:1: (otherlv_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:625:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseETDRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseETDRef1298); 

            		newLeafNode(otherlv_0, grammarAccess.getUseETDRefAccess().getRefETDCrossReference_0()); 
            	

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
    // $ANTLR end "ruleUseETDRef"


    // $ANTLR start "entryRuleUseEntity"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:644:1: entryRuleUseEntity returns [EObject current=null] : iv_ruleUseEntity= ruleUseEntity EOF ;
    public final EObject entryRuleUseEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseEntity = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:645:2: (iv_ruleUseEntity= ruleUseEntity EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:646:2: iv_ruleUseEntity= ruleUseEntity EOF
            {
             newCompositeNode(grammarAccess.getUseEntityRule()); 
            pushFollow(FOLLOW_ruleUseEntity_in_entryRuleUseEntity1333);
            iv_ruleUseEntity=ruleUseEntity();

            state._fsp--;

             current =iv_ruleUseEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseEntity1343); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseEntity"


    // $ANTLR start "ruleUseEntity"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:653:1: ruleUseEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ) ;
    public final EObject ruleUseEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:656:28: ( ( () otherlv_1= 'Entity' ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:657:1: ( () otherlv_1= 'Entity' )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:657:1: ( () otherlv_1= 'Entity' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:657:2: () otherlv_1= 'Entity'
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:657:2: ()
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:658:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUseEntityAccess().getUseEntityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleUseEntity1389); 

                	newLeafNode(otherlv_1, grammarAccess.getUseEntityAccess().getEntityKeyword_1());
                

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
    // $ANTLR end "ruleUseEntity"


    // $ANTLR start "entryRuleMegaLLinking"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:675:1: entryRuleMegaLLinking returns [EObject current=null] : iv_ruleMegaLLinking= ruleMegaLLinking EOF ;
    public final EObject entryRuleMegaLLinking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegaLLinking = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:676:2: (iv_ruleMegaLLinking= ruleMegaLLinking EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:677:2: iv_ruleMegaLLinking= ruleMegaLLinking EOF
            {
             newCompositeNode(grammarAccess.getMegaLLinkingRule()); 
            pushFollow(FOLLOW_ruleMegaLLinking_in_entryRuleMegaLLinking1425);
            iv_ruleMegaLLinking=ruleMegaLLinking();

            state._fsp--;

             current =iv_ruleMegaLLinking; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMegaLLinking1435); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:684:1: ruleMegaLLinking returns [EObject current=null] : (otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_lds_4_0= ruleLD ) )* ) ;
    public final EObject ruleMegaLLinking() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_lds_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:687:28: ( (otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_lds_4_0= ruleLD ) )* ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:688:1: (otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_lds_4_0= ruleLD ) )* )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:688:1: (otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_lds_4_0= ruleLD ) )* )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:688:3: otherlv_0= 'linking' ( (lv_name_1_0= ruleQualifiedID ) ) (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )? ( (lv_lds_4_0= ruleLD ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleMegaLLinking1472); 

                	newLeafNode(otherlv_0, grammarAccess.getMegaLLinkingAccess().getLinkingKeyword_0());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:692:1: ( (lv_name_1_0= ruleQualifiedID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:693:1: (lv_name_1_0= ruleQualifiedID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:693:1: (lv_name_1_0= ruleQualifiedID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:694:3: lv_name_1_0= ruleQualifiedID
            {
             
            	        newCompositeNode(grammarAccess.getMegaLLinkingAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1493);
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

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:710:2: (otherlv_2= 'for' ( ( ruleQualifiedID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:710:4: otherlv_2= 'for' ( ( ruleQualifiedID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleMegaLLinking1506); 

                        	newLeafNode(otherlv_2, grammarAccess.getMegaLLinkingAccess().getForKeyword_2_0());
                        
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:714:1: ( ( ruleQualifiedID ) )
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:715:1: ( ruleQualifiedID )
                    {
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:715:1: ( ruleQualifiedID )
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:716:3: ruleQualifiedID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegaLLinkingRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMegaLLinkingAccess().getTargetMegaLDefinitionCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1529);
                    ruleQualifiedID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:729:4: ( (lv_lds_4_0= ruleLD ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:730:1: (lv_lds_4_0= ruleLD )
            	    {
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:730:1: (lv_lds_4_0= ruleLD )
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:731:3: lv_lds_4_0= ruleLD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegaLLinkingAccess().getLdsLDParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLD_in_ruleMegaLLinking1552);
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
            	    break loop6;
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:755:1: entryRuleLD returns [EObject current=null] : iv_ruleLD= ruleLD EOF ;
    public final EObject entryRuleLD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:756:2: (iv_ruleLD= ruleLD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:757:2: iv_ruleLD= ruleLD EOF
            {
             newCompositeNode(grammarAccess.getLDRule()); 
            pushFollow(FOLLOW_ruleLD_in_entryRuleLD1589);
            iv_ruleLD=ruleLD();

            state._fsp--;

             current =iv_ruleLD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLD1599); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:764:1: ruleLD returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:767:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:768:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:768:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:768:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:768:2: ( (otherlv_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:769:1: (otherlv_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:769:1: (otherlv_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:770:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLDRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLD1644); 

            		newLeafNode(otherlv_0, grammarAccess.getLDAccess().getTargetEDCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleLD1656); 

                	newLeafNode(otherlv_1, grammarAccess.getLDAccess().getEqualsSignKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:785:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:786:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:786:1: (lv_value_2_0= RULE_STRING )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:787:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLD1673); 

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:811:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:812:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:813:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1715);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedID1726); 

            }

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:820:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:823:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:824:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:824:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:824:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID1766); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:831:1: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:832:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleQualifiedID1785); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID1800); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleQualifiedID"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\1\1\6\uffff\2\11\2\uffff";
    static final String DFA3_minS =
        "\1\4\2\uffff\2\4\2\uffff\2\4\2\uffff";
    static final String DFA3_maxS =
        "\1\15\2\uffff\1\20\1\21\2\uffff\2\17\2\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\6\1\1\2\uffff\1\5\1\4\2\uffff\1\2\1\3";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\10\uffff\1\2",
            "",
            "",
            "\1\5\11\uffff\1\4\1\uffff\1\6",
            "\1\7\14\uffff\1\10",
            "",
            "",
            "\1\11\10\uffff\1\11\1\uffff\1\12",
            "\1\11\10\uffff\1\11\1\uffff\1\12",
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
            return "()* loopback of 165:4: ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_etds_6_0= ruleETD ) ) | ( (lv_rtds_7_0= ruleRTD ) ) | ( (lv_eds_8_0= ruleED ) ) | ( (lv_rds_9_0= ruleRD ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLDefinition_in_ruleModel132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLLinking_in_ruleModel159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLDefinition_in_entryRuleMegaLDefinition194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaLDefinition204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleMegaLDefinition241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLDefinition262 = new BitSet(new long[]{0x0000000000002812L});
    public static final BitSet FOLLOW_11_in_ruleMegaLDefinition275 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMegaLDefinition287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLDefinition310 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_ruleImport_in_ruleMegaLDefinition334 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_ruleETD_in_ruleMegaLDefinition361 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_ruleRTD_in_ruleMegaLDefinition388 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_ruleED_in_ruleMegaLDefinition415 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_ruleRD_in_ruleMegaLDefinition442 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImport547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_entryRuleETD583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETD593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETD635 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleETD652 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleUseETD_in_ruleETD673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_entryRuleRTD709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTD719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRTD761 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRTD778 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleUseETD_in_ruleRTD799 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRTD811 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleUseETD_in_ruleRTD832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_entryRuleRD868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRD878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_entryRuleED999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleED1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleED1051 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleED1068 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleUseETD_in_ruleED1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseETD_in_entryRuleUseETD1125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseETD1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseETDRef_in_ruleUseETD1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseEntity_in_ruleUseETD1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseETDRef_in_entryRuleUseETDRef1244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseETDRef1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseETDRef1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseEntity_in_entryRuleUseEntity1333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseEntity1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleUseEntity1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLLinking_in_entryRuleMegaLLinking1425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaLLinking1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMegaLLinking1472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1493 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_19_in_ruleMegaLLinking1506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1529 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLD_in_ruleMegaLLinking1552 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLD_in_entryRuleLD1589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLD1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLD1644 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLD1656 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLD1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1766 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQualifiedID1785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1800 = new BitSet(new long[]{0x0000000000200002L});

}