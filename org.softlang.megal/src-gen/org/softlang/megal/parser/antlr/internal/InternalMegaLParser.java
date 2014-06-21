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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'linked'", "'in'", "'import'", "'Entity'", "'<'", "'*'", "':'", "'linking'", "'for'", "'='", "'.'"
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
            else if ( (LA1_0==19) ) {
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


    // $ANTLR start "entryRuleETDR"
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:305:1: entryRuleETDR returns [EObject current=null] : iv_ruleETDR= ruleETDR EOF ;
    public final EObject entryRuleETDR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETDR = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:306:2: (iv_ruleETDR= ruleETDR EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:307:2: iv_ruleETDR= ruleETDR EOF
            {
             newCompositeNode(grammarAccess.getETDRRule()); 
            pushFollow(FOLLOW_ruleETDR_in_entryRuleETDR583);
            iv_ruleETDR=ruleETDR();

            state._fsp--;

             current =iv_ruleETDR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDR593); 

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:314:1: ruleETDR returns [EObject current=null] : (this_ETDEntity_0= ruleETDEntity | this_ETDDeclared_1= ruleETDDeclared ) ;
    public final EObject ruleETDR() throws RecognitionException {
        EObject current = null;

        EObject this_ETDEntity_0 = null;

        EObject this_ETDDeclared_1 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:317:28: ( (this_ETDEntity_0= ruleETDEntity | this_ETDDeclared_1= ruleETDDeclared ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:318:1: (this_ETDEntity_0= ruleETDEntity | this_ETDDeclared_1= ruleETDDeclared )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:318:1: (this_ETDEntity_0= ruleETDEntity | this_ETDDeclared_1= ruleETDDeclared )
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
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:319:5: this_ETDEntity_0= ruleETDEntity
                    {
                     
                            newCompositeNode(grammarAccess.getETDRAccess().getETDEntityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETDEntity_in_ruleETDR640);
                    this_ETDEntity_0=ruleETDEntity();

                    state._fsp--;

                     
                            current = this_ETDEntity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:329:5: this_ETDDeclared_1= ruleETDDeclared
                    {
                     
                            newCompositeNode(grammarAccess.getETDRAccess().getETDDeclaredParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleETDDeclared_in_ruleETDR667);
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:345:1: entryRuleETDEntity returns [EObject current=null] : iv_ruleETDEntity= ruleETDEntity EOF ;
    public final EObject entryRuleETDEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETDEntity = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:346:2: (iv_ruleETDEntity= ruleETDEntity EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:347:2: iv_ruleETDEntity= ruleETDEntity EOF
            {
             newCompositeNode(grammarAccess.getETDEntityRule()); 
            pushFollow(FOLLOW_ruleETDEntity_in_entryRuleETDEntity702);
            iv_ruleETDEntity=ruleETDEntity();

            state._fsp--;

             current =iv_ruleETDEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDEntity712); 

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:354:1: ruleETDEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ) ;
    public final EObject ruleETDEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:357:28: ( ( () otherlv_1= 'Entity' ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:358:1: ( () otherlv_1= 'Entity' )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:358:1: ( () otherlv_1= 'Entity' )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:358:2: () otherlv_1= 'Entity'
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:358:2: ()
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:359:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETDEntityAccess().getETDEntityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleETDEntity758); 

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:376:1: entryRuleETDDeclared returns [EObject current=null] : iv_ruleETDDeclared= ruleETDDeclared EOF ;
    public final EObject entryRuleETDDeclared() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETDDeclared = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:377:2: (iv_ruleETDDeclared= ruleETDDeclared EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:378:2: iv_ruleETDDeclared= ruleETDDeclared EOF
            {
             newCompositeNode(grammarAccess.getETDDeclaredRule()); 
            pushFollow(FOLLOW_ruleETDDeclared_in_entryRuleETDDeclared794);
            iv_ruleETDDeclared=ruleETDDeclared();

            state._fsp--;

             current =iv_ruleETDDeclared; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDDeclared804); 

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:385:1: ruleETDDeclared returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleETDDeclared() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:388:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:389:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:389:1: ( (otherlv_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:390:1: (otherlv_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:390:1: (otherlv_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:391:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getETDDeclaredRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETDDeclared848); 

            		newLeafNode(otherlv_0, grammarAccess.getETDDeclaredAccess().getRefETDCrossReference_0()); 
            	

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:410:1: entryRuleETD returns [EObject current=null] : iv_ruleETD= ruleETD EOF ;
    public final EObject entryRuleETD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:411:2: (iv_ruleETD= ruleETD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:412:2: iv_ruleETD= ruleETD EOF
            {
             newCompositeNode(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_ruleETD_in_entryRuleETD883);
            iv_ruleETD=ruleETD();

            state._fsp--;

             current =iv_ruleETD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETD893); 

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:419:1: ruleETD returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) ) ) ;
    public final EObject ruleETD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_supertype_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:422:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:423:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:423:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:423:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_supertype_2_0= ruleETDR ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:423:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:424:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:424:1: (lv_name_0_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:425:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETD935); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleETD952); 

                	newLeafNode(otherlv_1, grammarAccess.getETDAccess().getLessThanSignKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:445:1: ( (lv_supertype_2_0= ruleETDR ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:446:1: (lv_supertype_2_0= ruleETDR )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:446:1: (lv_supertype_2_0= ruleETDR )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:447:3: lv_supertype_2_0= ruleETDR
            {
             
            	        newCompositeNode(grammarAccess.getETDAccess().getSupertypeETDRParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETDR_in_ruleETD973);
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:471:1: entryRuleRTD returns [EObject current=null] : iv_ruleRTD= ruleRTD EOF ;
    public final EObject entryRuleRTD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:472:2: (iv_ruleRTD= ruleRTD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:473:2: iv_ruleRTD= ruleRTD EOF
            {
             newCompositeNode(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_ruleRTD_in_entryRuleRTD1009);
            iv_ruleRTD=ruleRTD();

            state._fsp--;

             current =iv_ruleRTD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTD1019); 

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:480:1: ruleRTD returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) ) ) ;
    public final EObject ruleRTD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_domain_2_0 = null;

        EObject lv_coDomain_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:483:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:484:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:484:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:484:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_domain_2_0= ruleETDR ) ) otherlv_3= '*' ( (lv_coDomain_4_0= ruleETDR ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:484:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:485:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:485:1: (lv_name_0_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:486:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRTD1061); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleRTD1078); 

                	newLeafNode(otherlv_1, grammarAccess.getRTDAccess().getLessThanSignKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:506:1: ( (lv_domain_2_0= ruleETDR ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:507:1: (lv_domain_2_0= ruleETDR )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:507:1: (lv_domain_2_0= ruleETDR )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:508:3: lv_domain_2_0= ruleETDR
            {
             
            	        newCompositeNode(grammarAccess.getRTDAccess().getDomainETDRParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETDR_in_ruleRTD1099);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleRTD1111); 

                	newLeafNode(otherlv_3, grammarAccess.getRTDAccess().getAsteriskKeyword_3());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:528:1: ( (lv_coDomain_4_0= ruleETDR ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:529:1: (lv_coDomain_4_0= ruleETDR )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:529:1: (lv_coDomain_4_0= ruleETDR )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:530:3: lv_coDomain_4_0= ruleETDR
            {
             
            	        newCompositeNode(grammarAccess.getRTDAccess().getCoDomainETDRParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleETDR_in_ruleRTD1132);
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:554:1: entryRuleED returns [EObject current=null] : iv_ruleED= ruleED EOF ;
    public final EObject entryRuleED() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleED = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:555:2: (iv_ruleED= ruleED EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:556:2: iv_ruleED= ruleED EOF
            {
             newCompositeNode(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_ruleED_in_entryRuleED1168);
            iv_ruleED=ruleED();

            state._fsp--;

             current =iv_ruleED; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleED1178); 

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:563:1: ruleED returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) ) ) ;
    public final EObject ruleED() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:566:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:567:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:567:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:567:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETDR ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:567:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:568:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:568:1: (lv_name_0_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:569:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleED1220); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleED1237); 

                	newLeafNode(otherlv_1, grammarAccess.getEDAccess().getColonKeyword_1());
                
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:589:1: ( (lv_type_2_0= ruleETDR ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:590:1: (lv_type_2_0= ruleETDR )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:590:1: (lv_type_2_0= ruleETDR )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:591:3: lv_type_2_0= ruleETDR
            {
             
            	        newCompositeNode(grammarAccess.getEDAccess().getTypeETDRParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETDR_in_ruleED1258);
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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:615:1: entryRuleRD returns [EObject current=null] : iv_ruleRD= ruleRD EOF ;
    public final EObject entryRuleRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRD = null;


        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:616:2: (iv_ruleRD= ruleRD EOF )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:617:2: iv_ruleRD= ruleRD EOF
            {
             newCompositeNode(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_ruleRD_in_entryRuleRD1294);
            iv_ruleRD=ruleRD();

            state._fsp--;

             current =iv_ruleRD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRD1304); 

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
    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:624:1: ruleRD returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:627:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:628:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:628:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:628:2: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:628:2: ( (otherlv_0= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:629:1: (otherlv_0= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:629:1: (otherlv_0= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:630:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD1349); 

            		newLeafNode(otherlv_0, grammarAccess.getRDAccess().getSourceEDCrossReference_0_0()); 
            	

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:641:2: ( (otherlv_1= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:642:1: (otherlv_1= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:642:1: (otherlv_1= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:643:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD1369); 

            		newLeafNode(otherlv_1, grammarAccess.getRDAccess().getRelRTDCrossReference_1_0()); 
            	

            }


            }

            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:654:2: ( (otherlv_2= RULE_ID ) )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:655:1: (otherlv_2= RULE_ID )
            {
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:655:1: (otherlv_2= RULE_ID )
            // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:656:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRD1389); 

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
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleMegaLLinking1472); 

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

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:710:4: otherlv_2= 'for' ( ( ruleQualifiedID ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMegaLLinking1506); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleLD1656); 

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

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.softlang.megal/src-gen/org/softlang/megal/parser/antlr/internal/InternalMegaL.g:832:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedID1785); 

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
        "\1\1\6\uffff\2\12\2\uffff";
    static final String DFA3_minS =
        "\1\4\2\uffff\2\4\2\uffff\2\4\2\uffff";
    static final String DFA3_maxS =
        "\1\16\2\uffff\1\22\1\17\2\uffff\2\21\2\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\6\1\1\2\uffff\1\4\1\5\2\uffff\1\3\1\2";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\11\uffff\1\2",
            "",
            "",
            "\1\6\13\uffff\1\4\1\uffff\1\5",
            "\1\10\12\uffff\1\7",
            "",
            "",
            "\1\12\11\uffff\1\12\2\uffff\1\11",
            "\1\12\11\uffff\1\12\2\uffff\1\11",
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
    public static final BitSet FOLLOW_11_in_ruleMegaLDefinition241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLDefinition262 = new BitSet(new long[]{0x0000000000005012L});
    public static final BitSet FOLLOW_12_in_ruleMegaLDefinition275 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMegaLDefinition287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLDefinition310 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleImport_in_ruleMegaLDefinition334 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleETD_in_ruleMegaLDefinition361 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleRTD_in_ruleMegaLDefinition388 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleED_in_ruleMegaLDefinition415 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleRD_in_ruleMegaLDefinition442 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImport547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_entryRuleETDR583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDR593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDEntity_in_ruleETDR640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDDeclared_in_ruleETDR667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDEntity_in_entryRuleETDEntity702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDEntity712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleETDEntity758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDDeclared_in_entryRuleETDDeclared794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDDeclared804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETDDeclared848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_entryRuleETD883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETD893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETD935 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleETD952 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleETDR_in_ruleETD973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_entryRuleRTD1009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTD1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRTD1061 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRTD1078 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleETDR_in_ruleRTD1099 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRTD1111 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleETDR_in_ruleRTD1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_entryRuleED1168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleED1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleED1220 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleED1237 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleETDR_in_ruleED1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_entryRuleRD1294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRD1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD1349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD1369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRD1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLLinking_in_entryRuleMegaLLinking1425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaLLinking1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMegaLLinking1472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1493 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_20_in_ruleMegaLLinking1506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleMegaLLinking1529 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLD_in_ruleMegaLLinking1552 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLD_in_entryRuleLD1589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLD1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLD1644 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLD1656 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLD1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1766 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedID1785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1800 = new BitSet(new long[]{0x0000000000400002L});

}