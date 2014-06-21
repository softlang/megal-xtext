package org.softlang.megal.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.softlang.megal.services.MegaLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMegaLParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g"; }


     
     	private MegaLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MegaLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:61:1: ( ruleModel EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:69:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:73:2: ( ( ( rule__Model__Alternatives ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:74:1: ( ( rule__Model__Alternatives ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:74:1: ( ( rule__Model__Alternatives ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:75:1: ( rule__Model__Alternatives )
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:76:1: ( rule__Model__Alternatives )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:76:2: rule__Model__Alternatives
            {
            pushFollow(FOLLOW_rule__Model__Alternatives_in_ruleModel94);
            rule__Model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMegaLDefinition"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:88:1: entryRuleMegaLDefinition : ruleMegaLDefinition EOF ;
    public final void entryRuleMegaLDefinition() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:89:1: ( ruleMegaLDefinition EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:90:1: ruleMegaLDefinition EOF
            {
             before(grammarAccess.getMegaLDefinitionRule()); 
            pushFollow(FOLLOW_ruleMegaLDefinition_in_entryRuleMegaLDefinition121);
            ruleMegaLDefinition();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMegaLDefinition128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMegaLDefinition"


    // $ANTLR start "ruleMegaLDefinition"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:97:1: ruleMegaLDefinition : ( ( rule__MegaLDefinition__Group__0 ) ) ;
    public final void ruleMegaLDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:101:2: ( ( ( rule__MegaLDefinition__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:102:1: ( ( rule__MegaLDefinition__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:102:1: ( ( rule__MegaLDefinition__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:103:1: ( rule__MegaLDefinition__Group__0 )
            {
             before(grammarAccess.getMegaLDefinitionAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:104:1: ( rule__MegaLDefinition__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:104:2: rule__MegaLDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group__0_in_ruleMegaLDefinition154);
            rule__MegaLDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegaLDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegaLDefinition"


    // $ANTLR start "entryRuleImport"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:116:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:117:1: ( ruleImport EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:118:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport181);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:130:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:130:1: ( ( rule__Import__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:131:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:132:1: ( rule__Import__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:132:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport214);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleETD"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:144:1: entryRuleETD : ruleETD EOF ;
    public final void entryRuleETD() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:145:1: ( ruleETD EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:146:1: ruleETD EOF
            {
             before(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_ruleETD_in_entryRuleETD241);
            ruleETD();

            state._fsp--;

             after(grammarAccess.getETDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETD248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleETD"


    // $ANTLR start "ruleETD"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:153:1: ruleETD : ( ( rule__ETD__Group__0 ) ) ;
    public final void ruleETD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:157:2: ( ( ( rule__ETD__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:158:1: ( ( rule__ETD__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:158:1: ( ( rule__ETD__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:159:1: ( rule__ETD__Group__0 )
            {
             before(grammarAccess.getETDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:160:1: ( rule__ETD__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:160:2: rule__ETD__Group__0
            {
            pushFollow(FOLLOW_rule__ETD__Group__0_in_ruleETD274);
            rule__ETD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleETD"


    // $ANTLR start "entryRuleRTD"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:172:1: entryRuleRTD : ruleRTD EOF ;
    public final void entryRuleRTD() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:173:1: ( ruleRTD EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:174:1: ruleRTD EOF
            {
             before(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_ruleRTD_in_entryRuleRTD301);
            ruleRTD();

            state._fsp--;

             after(grammarAccess.getRTDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTD308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRTD"


    // $ANTLR start "ruleRTD"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:181:1: ruleRTD : ( ( rule__RTD__Group__0 ) ) ;
    public final void ruleRTD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:185:2: ( ( ( rule__RTD__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:186:1: ( ( rule__RTD__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:186:1: ( ( rule__RTD__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:187:1: ( rule__RTD__Group__0 )
            {
             before(grammarAccess.getRTDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:188:1: ( rule__RTD__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:188:2: rule__RTD__Group__0
            {
            pushFollow(FOLLOW_rule__RTD__Group__0_in_ruleRTD334);
            rule__RTD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRTD"


    // $ANTLR start "entryRuleEDGroup"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:200:1: entryRuleEDGroup : ruleEDGroup EOF ;
    public final void entryRuleEDGroup() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:201:1: ( ruleEDGroup EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:202:1: ruleEDGroup EOF
            {
             before(grammarAccess.getEDGroupRule()); 
            pushFollow(FOLLOW_ruleEDGroup_in_entryRuleEDGroup361);
            ruleEDGroup();

            state._fsp--;

             after(grammarAccess.getEDGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEDGroup368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDGroup"


    // $ANTLR start "ruleEDGroup"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:209:1: ruleEDGroup : ( ( rule__EDGroup__Group__0 ) ) ;
    public final void ruleEDGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:213:2: ( ( ( rule__EDGroup__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:214:1: ( ( rule__EDGroup__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:214:1: ( ( rule__EDGroup__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:215:1: ( rule__EDGroup__Group__0 )
            {
             before(grammarAccess.getEDGroupAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:216:1: ( rule__EDGroup__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:216:2: rule__EDGroup__Group__0
            {
            pushFollow(FOLLOW_rule__EDGroup__Group__0_in_ruleEDGroup394);
            rule__EDGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDGroup"


    // $ANTLR start "entryRuleED"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:228:1: entryRuleED : ruleED EOF ;
    public final void entryRuleED() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:229:1: ( ruleED EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:230:1: ruleED EOF
            {
             before(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_ruleED_in_entryRuleED421);
            ruleED();

            state._fsp--;

             after(grammarAccess.getEDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleED428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleED"


    // $ANTLR start "ruleED"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:237:1: ruleED : ( ( rule__ED__NameAssignment ) ) ;
    public final void ruleED() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:241:2: ( ( ( rule__ED__NameAssignment ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:242:1: ( ( rule__ED__NameAssignment ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:242:1: ( ( rule__ED__NameAssignment ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:243:1: ( rule__ED__NameAssignment )
            {
             before(grammarAccess.getEDAccess().getNameAssignment()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:244:1: ( rule__ED__NameAssignment )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:244:2: rule__ED__NameAssignment
            {
            pushFollow(FOLLOW_rule__ED__NameAssignment_in_ruleED454);
            rule__ED__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEDAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleED"


    // $ANTLR start "entryRuleRD"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:256:1: entryRuleRD : ruleRD EOF ;
    public final void entryRuleRD() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:257:1: ( ruleRD EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:258:1: ruleRD EOF
            {
             before(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_ruleRD_in_entryRuleRD481);
            ruleRD();

            state._fsp--;

             after(grammarAccess.getRDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRD488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRD"


    // $ANTLR start "ruleRD"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:265:1: ruleRD : ( ( rule__RD__Group__0 ) ) ;
    public final void ruleRD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:269:2: ( ( ( rule__RD__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:270:1: ( ( rule__RD__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:270:1: ( ( rule__RD__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:271:1: ( rule__RD__Group__0 )
            {
             before(grammarAccess.getRDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:272:1: ( rule__RD__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:272:2: rule__RD__Group__0
            {
            pushFollow(FOLLOW_rule__RD__Group__0_in_ruleRD514);
            rule__RD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRD"


    // $ANTLR start "entryRuleMegaLLinking"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:284:1: entryRuleMegaLLinking : ruleMegaLLinking EOF ;
    public final void entryRuleMegaLLinking() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:285:1: ( ruleMegaLLinking EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:286:1: ruleMegaLLinking EOF
            {
             before(grammarAccess.getMegaLLinkingRule()); 
            pushFollow(FOLLOW_ruleMegaLLinking_in_entryRuleMegaLLinking541);
            ruleMegaLLinking();

            state._fsp--;

             after(grammarAccess.getMegaLLinkingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMegaLLinking548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMegaLLinking"


    // $ANTLR start "ruleMegaLLinking"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:293:1: ruleMegaLLinking : ( ( rule__MegaLLinking__Group__0 ) ) ;
    public final void ruleMegaLLinking() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:297:2: ( ( ( rule__MegaLLinking__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:298:1: ( ( rule__MegaLLinking__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:298:1: ( ( rule__MegaLLinking__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:299:1: ( rule__MegaLLinking__Group__0 )
            {
             before(grammarAccess.getMegaLLinkingAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:300:1: ( rule__MegaLLinking__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:300:2: rule__MegaLLinking__Group__0
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__0_in_ruleMegaLLinking574);
            rule__MegaLLinking__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegaLLinkingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegaLLinking"


    // $ANTLR start "entryRuleLD"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:312:1: entryRuleLD : ruleLD EOF ;
    public final void entryRuleLD() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:313:1: ( ruleLD EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:314:1: ruleLD EOF
            {
             before(grammarAccess.getLDRule()); 
            pushFollow(FOLLOW_ruleLD_in_entryRuleLD601);
            ruleLD();

            state._fsp--;

             after(grammarAccess.getLDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLD608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLD"


    // $ANTLR start "ruleLD"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:321:1: ruleLD : ( ( rule__LD__Group__0 ) ) ;
    public final void ruleLD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:325:2: ( ( ( rule__LD__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:326:1: ( ( rule__LD__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:326:1: ( ( rule__LD__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:327:1: ( rule__LD__Group__0 )
            {
             before(grammarAccess.getLDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:328:1: ( rule__LD__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:328:2: rule__LD__Group__0
            {
            pushFollow(FOLLOW_rule__LD__Group__0_in_ruleLD634);
            rule__LD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLD"


    // $ANTLR start "entryRuleQualifiedID"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:340:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:341:1: ( ruleQualifiedID EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:342:1: ruleQualifiedID EOF
            {
             before(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID661);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getQualifiedIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedID668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:349:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:353:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:354:1: ( ( rule__QualifiedID__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:354:1: ( ( rule__QualifiedID__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:355:1: ( rule__QualifiedID__Group__0 )
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:356:1: ( rule__QualifiedID__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:356:2: rule__QualifiedID__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID694);
            rule__QualifiedID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "rule__Model__Alternatives"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:368:1: rule__Model__Alternatives : ( ( ruleMegaLDefinition ) | ( ruleMegaLLinking ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:372:1: ( ( ruleMegaLDefinition ) | ( ruleMegaLLinking ) )
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
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:373:1: ( ruleMegaLDefinition )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:373:1: ( ruleMegaLDefinition )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:374:1: ruleMegaLDefinition
                    {
                     before(grammarAccess.getModelAccess().getMegaLDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMegaLDefinition_in_rule__Model__Alternatives730);
                    ruleMegaLDefinition();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getMegaLDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:379:6: ( ruleMegaLLinking )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:379:6: ( ruleMegaLLinking )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:380:1: ruleMegaLLinking
                    {
                     before(grammarAccess.getModelAccess().getMegaLLinkingParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMegaLLinking_in_rule__Model__Alternatives747);
                    ruleMegaLLinking();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getMegaLLinkingParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__MegaLDefinition__Alternatives_3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:390:1: rule__MegaLDefinition__Alternatives_3 : ( ( ( rule__MegaLDefinition__ImportsAssignment_3_0 ) ) | ( ( rule__MegaLDefinition__RdsAssignment_3_1 ) ) | ( ( rule__MegaLDefinition__EtdsAssignment_3_2 ) ) | ( ( rule__MegaLDefinition__RtdsAssignment_3_3 ) ) | ( ( rule__MegaLDefinition__EdsAssignment_3_4 ) ) );
    public final void rule__MegaLDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:394:1: ( ( ( rule__MegaLDefinition__ImportsAssignment_3_0 ) ) | ( ( rule__MegaLDefinition__RdsAssignment_3_1 ) ) | ( ( rule__MegaLDefinition__EtdsAssignment_3_2 ) ) | ( ( rule__MegaLDefinition__RtdsAssignment_3_3 ) ) | ( ( rule__MegaLDefinition__EdsAssignment_3_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==17) ) {
                    alt2=5;
                }
                else if ( (LA2_2==RULE_ID) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_ID) ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6==17) ) {
                        alt2=4;
                    }
                    else if ( (LA2_6==EOF||LA2_6==RULE_ID||(LA2_6>=14 && LA2_6<=16)) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:395:1: ( ( rule__MegaLDefinition__ImportsAssignment_3_0 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:395:1: ( ( rule__MegaLDefinition__ImportsAssignment_3_0 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:396:1: ( rule__MegaLDefinition__ImportsAssignment_3_0 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getImportsAssignment_3_0()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:397:1: ( rule__MegaLDefinition__ImportsAssignment_3_0 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:397:2: rule__MegaLDefinition__ImportsAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__ImportsAssignment_3_0_in_rule__MegaLDefinition__Alternatives_3779);
                    rule__MegaLDefinition__ImportsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getImportsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:401:6: ( ( rule__MegaLDefinition__RdsAssignment_3_1 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:401:6: ( ( rule__MegaLDefinition__RdsAssignment_3_1 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:402:1: ( rule__MegaLDefinition__RdsAssignment_3_1 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getRdsAssignment_3_1()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:403:1: ( rule__MegaLDefinition__RdsAssignment_3_1 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:403:2: rule__MegaLDefinition__RdsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__RdsAssignment_3_1_in_rule__MegaLDefinition__Alternatives_3797);
                    rule__MegaLDefinition__RdsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getRdsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:407:6: ( ( rule__MegaLDefinition__EtdsAssignment_3_2 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:407:6: ( ( rule__MegaLDefinition__EtdsAssignment_3_2 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:408:1: ( rule__MegaLDefinition__EtdsAssignment_3_2 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getEtdsAssignment_3_2()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:409:1: ( rule__MegaLDefinition__EtdsAssignment_3_2 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:409:2: rule__MegaLDefinition__EtdsAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__EtdsAssignment_3_2_in_rule__MegaLDefinition__Alternatives_3815);
                    rule__MegaLDefinition__EtdsAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getEtdsAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:413:6: ( ( rule__MegaLDefinition__RtdsAssignment_3_3 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:413:6: ( ( rule__MegaLDefinition__RtdsAssignment_3_3 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:414:1: ( rule__MegaLDefinition__RtdsAssignment_3_3 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getRtdsAssignment_3_3()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:415:1: ( rule__MegaLDefinition__RtdsAssignment_3_3 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:415:2: rule__MegaLDefinition__RtdsAssignment_3_3
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__RtdsAssignment_3_3_in_rule__MegaLDefinition__Alternatives_3833);
                    rule__MegaLDefinition__RtdsAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getRtdsAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:419:6: ( ( rule__MegaLDefinition__EdsAssignment_3_4 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:419:6: ( ( rule__MegaLDefinition__EdsAssignment_3_4 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:420:1: ( rule__MegaLDefinition__EdsAssignment_3_4 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getEdsAssignment_3_4()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:421:1: ( rule__MegaLDefinition__EdsAssignment_3_4 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:421:2: rule__MegaLDefinition__EdsAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__EdsAssignment_3_4_in_rule__MegaLDefinition__Alternatives_3851);
                    rule__MegaLDefinition__EdsAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getEdsAssignment_3_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Alternatives_3"


    // $ANTLR start "rule__MegaLDefinition__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:432:1: rule__MegaLDefinition__Group__0 : rule__MegaLDefinition__Group__0__Impl rule__MegaLDefinition__Group__1 ;
    public final void rule__MegaLDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:436:1: ( rule__MegaLDefinition__Group__0__Impl rule__MegaLDefinition__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:437:2: rule__MegaLDefinition__Group__0__Impl rule__MegaLDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group__0__Impl_in_rule__MegaLDefinition__Group__0882);
            rule__MegaLDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group__1_in_rule__MegaLDefinition__Group__0885);
            rule__MegaLDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group__0"


    // $ANTLR start "rule__MegaLDefinition__Group__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:444:1: rule__MegaLDefinition__Group__0__Impl : ( 'model' ) ;
    public final void rule__MegaLDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:448:1: ( ( 'model' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:449:1: ( 'model' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:449:1: ( 'model' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:450:1: 'model'
            {
             before(grammarAccess.getMegaLDefinitionAccess().getModelKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__MegaLDefinition__Group__0__Impl913); 
             after(grammarAccess.getMegaLDefinitionAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group__0__Impl"


    // $ANTLR start "rule__MegaLDefinition__Group__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:463:1: rule__MegaLDefinition__Group__1 : rule__MegaLDefinition__Group__1__Impl rule__MegaLDefinition__Group__2 ;
    public final void rule__MegaLDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:467:1: ( rule__MegaLDefinition__Group__1__Impl rule__MegaLDefinition__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:468:2: rule__MegaLDefinition__Group__1__Impl rule__MegaLDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group__1__Impl_in_rule__MegaLDefinition__Group__1944);
            rule__MegaLDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group__2_in_rule__MegaLDefinition__Group__1947);
            rule__MegaLDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group__1"


    // $ANTLR start "rule__MegaLDefinition__Group__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:475:1: rule__MegaLDefinition__Group__1__Impl : ( ( rule__MegaLDefinition__NameAssignment_1 ) ) ;
    public final void rule__MegaLDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:479:1: ( ( ( rule__MegaLDefinition__NameAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:480:1: ( ( rule__MegaLDefinition__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:480:1: ( ( rule__MegaLDefinition__NameAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:481:1: ( rule__MegaLDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getMegaLDefinitionAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:482:1: ( rule__MegaLDefinition__NameAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:482:2: rule__MegaLDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__NameAssignment_1_in_rule__MegaLDefinition__Group__1__Impl974);
            rule__MegaLDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegaLDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group__1__Impl"


    // $ANTLR start "rule__MegaLDefinition__Group__2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:492:1: rule__MegaLDefinition__Group__2 : rule__MegaLDefinition__Group__2__Impl rule__MegaLDefinition__Group__3 ;
    public final void rule__MegaLDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:496:1: ( rule__MegaLDefinition__Group__2__Impl rule__MegaLDefinition__Group__3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:497:2: rule__MegaLDefinition__Group__2__Impl rule__MegaLDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group__2__Impl_in_rule__MegaLDefinition__Group__21004);
            rule__MegaLDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group__3_in_rule__MegaLDefinition__Group__21007);
            rule__MegaLDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group__2"


    // $ANTLR start "rule__MegaLDefinition__Group__2__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:504:1: rule__MegaLDefinition__Group__2__Impl : ( ( rule__MegaLDefinition__Group_2__0 )? ) ;
    public final void rule__MegaLDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:508:1: ( ( ( rule__MegaLDefinition__Group_2__0 )? ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:509:1: ( ( rule__MegaLDefinition__Group_2__0 )? )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:509:1: ( ( rule__MegaLDefinition__Group_2__0 )? )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:510:1: ( rule__MegaLDefinition__Group_2__0 )?
            {
             before(grammarAccess.getMegaLDefinitionAccess().getGroup_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:511:1: ( rule__MegaLDefinition__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:511:2: rule__MegaLDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__0_in_rule__MegaLDefinition__Group__2__Impl1034);
                    rule__MegaLDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegaLDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group__2__Impl"


    // $ANTLR start "rule__MegaLDefinition__Group__3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:521:1: rule__MegaLDefinition__Group__3 : rule__MegaLDefinition__Group__3__Impl ;
    public final void rule__MegaLDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:525:1: ( rule__MegaLDefinition__Group__3__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:526:2: rule__MegaLDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group__3__Impl_in_rule__MegaLDefinition__Group__31065);
            rule__MegaLDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group__3"


    // $ANTLR start "rule__MegaLDefinition__Group__3__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:532:1: rule__MegaLDefinition__Group__3__Impl : ( ( rule__MegaLDefinition__Alternatives_3 )* ) ;
    public final void rule__MegaLDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:536:1: ( ( ( rule__MegaLDefinition__Alternatives_3 )* ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:537:1: ( ( rule__MegaLDefinition__Alternatives_3 )* )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:537:1: ( ( rule__MegaLDefinition__Alternatives_3 )* )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:538:1: ( rule__MegaLDefinition__Alternatives_3 )*
            {
             before(grammarAccess.getMegaLDefinitionAccess().getAlternatives_3()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:539:1: ( rule__MegaLDefinition__Alternatives_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=14 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:539:2: rule__MegaLDefinition__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__MegaLDefinition__Alternatives_3_in_rule__MegaLDefinition__Group__3__Impl1092);
            	    rule__MegaLDefinition__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMegaLDefinitionAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group__3__Impl"


    // $ANTLR start "rule__MegaLDefinition__Group_2__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:557:1: rule__MegaLDefinition__Group_2__0 : rule__MegaLDefinition__Group_2__0__Impl rule__MegaLDefinition__Group_2__1 ;
    public final void rule__MegaLDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:561:1: ( rule__MegaLDefinition__Group_2__0__Impl rule__MegaLDefinition__Group_2__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:562:2: rule__MegaLDefinition__Group_2__0__Impl rule__MegaLDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__0__Impl_in_rule__MegaLDefinition__Group_2__01131);
            rule__MegaLDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__1_in_rule__MegaLDefinition__Group_2__01134);
            rule__MegaLDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group_2__0"


    // $ANTLR start "rule__MegaLDefinition__Group_2__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:569:1: rule__MegaLDefinition__Group_2__0__Impl : ( 'linked' ) ;
    public final void rule__MegaLDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:573:1: ( ( 'linked' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:574:1: ( 'linked' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:574:1: ( 'linked' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:575:1: 'linked'
            {
             before(grammarAccess.getMegaLDefinitionAccess().getLinkedKeyword_2_0()); 
            match(input,12,FOLLOW_12_in_rule__MegaLDefinition__Group_2__0__Impl1162); 
             after(grammarAccess.getMegaLDefinitionAccess().getLinkedKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__MegaLDefinition__Group_2__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:588:1: rule__MegaLDefinition__Group_2__1 : rule__MegaLDefinition__Group_2__1__Impl rule__MegaLDefinition__Group_2__2 ;
    public final void rule__MegaLDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:592:1: ( rule__MegaLDefinition__Group_2__1__Impl rule__MegaLDefinition__Group_2__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:593:2: rule__MegaLDefinition__Group_2__1__Impl rule__MegaLDefinition__Group_2__2
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__1__Impl_in_rule__MegaLDefinition__Group_2__11193);
            rule__MegaLDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__2_in_rule__MegaLDefinition__Group_2__11196);
            rule__MegaLDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group_2__1"


    // $ANTLR start "rule__MegaLDefinition__Group_2__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:600:1: rule__MegaLDefinition__Group_2__1__Impl : ( 'in' ) ;
    public final void rule__MegaLDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:604:1: ( ( 'in' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:605:1: ( 'in' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:605:1: ( 'in' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:606:1: 'in'
            {
             before(grammarAccess.getMegaLDefinitionAccess().getInKeyword_2_1()); 
            match(input,13,FOLLOW_13_in_rule__MegaLDefinition__Group_2__1__Impl1224); 
             after(grammarAccess.getMegaLDefinitionAccess().getInKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__MegaLDefinition__Group_2__2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:619:1: rule__MegaLDefinition__Group_2__2 : rule__MegaLDefinition__Group_2__2__Impl ;
    public final void rule__MegaLDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:623:1: ( rule__MegaLDefinition__Group_2__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:624:2: rule__MegaLDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__2__Impl_in_rule__MegaLDefinition__Group_2__21255);
            rule__MegaLDefinition__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group_2__2"


    // $ANTLR start "rule__MegaLDefinition__Group_2__2__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:630:1: rule__MegaLDefinition__Group_2__2__Impl : ( ( rule__MegaLDefinition__LinkerAssignment_2_2 ) ) ;
    public final void rule__MegaLDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:634:1: ( ( ( rule__MegaLDefinition__LinkerAssignment_2_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:635:1: ( ( rule__MegaLDefinition__LinkerAssignment_2_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:635:1: ( ( rule__MegaLDefinition__LinkerAssignment_2_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:636:1: ( rule__MegaLDefinition__LinkerAssignment_2_2 )
            {
             before(grammarAccess.getMegaLDefinitionAccess().getLinkerAssignment_2_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:637:1: ( rule__MegaLDefinition__LinkerAssignment_2_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:637:2: rule__MegaLDefinition__LinkerAssignment_2_2
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__LinkerAssignment_2_2_in_rule__MegaLDefinition__Group_2__2__Impl1282);
            rule__MegaLDefinition__LinkerAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMegaLDefinitionAccess().getLinkerAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:653:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:657:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:658:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01318);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01321);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:665:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:669:1: ( ( 'import' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:670:1: ( 'import' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:670:1: ( 'import' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:671:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Import__Group__0__Impl1349); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:684:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:688:1: ( rule__Import__Group__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:689:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11380);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:695:1: rule__Import__Group__1__Impl : ( ( rule__Import__RefAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:699:1: ( ( ( rule__Import__RefAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:700:1: ( ( rule__Import__RefAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:700:1: ( ( rule__Import__RefAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:701:1: ( rule__Import__RefAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getRefAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:702:1: ( rule__Import__RefAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:702:2: rule__Import__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__RefAssignment_1_in_rule__Import__Group__1__Impl1407);
            rule__Import__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__ETD__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:716:1: rule__ETD__Group__0 : rule__ETD__Group__0__Impl rule__ETD__Group__1 ;
    public final void rule__ETD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:720:1: ( rule__ETD__Group__0__Impl rule__ETD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:721:2: rule__ETD__Group__0__Impl rule__ETD__Group__1
            {
            pushFollow(FOLLOW_rule__ETD__Group__0__Impl_in_rule__ETD__Group__01441);
            rule__ETD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__1_in_rule__ETD__Group__01444);
            rule__ETD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ETD__Group__0"


    // $ANTLR start "rule__ETD__Group__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:728:1: rule__ETD__Group__0__Impl : ( 'define' ) ;
    public final void rule__ETD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:732:1: ( ( 'define' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:733:1: ( 'define' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:733:1: ( 'define' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:734:1: 'define'
            {
             before(grammarAccess.getETDAccess().getDefineKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__ETD__Group__0__Impl1472); 
             after(grammarAccess.getETDAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ETD__Group__0__Impl"


    // $ANTLR start "rule__ETD__Group__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:747:1: rule__ETD__Group__1 : rule__ETD__Group__1__Impl rule__ETD__Group__2 ;
    public final void rule__ETD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:751:1: ( rule__ETD__Group__1__Impl rule__ETD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:752:2: rule__ETD__Group__1__Impl rule__ETD__Group__2
            {
            pushFollow(FOLLOW_rule__ETD__Group__1__Impl_in_rule__ETD__Group__11503);
            rule__ETD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__2_in_rule__ETD__Group__11506);
            rule__ETD__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ETD__Group__1"


    // $ANTLR start "rule__ETD__Group__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:759:1: rule__ETD__Group__1__Impl : ( ( rule__ETD__NameAssignment_1 ) ) ;
    public final void rule__ETD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:763:1: ( ( ( rule__ETD__NameAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:764:1: ( ( rule__ETD__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:764:1: ( ( rule__ETD__NameAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:765:1: ( rule__ETD__NameAssignment_1 )
            {
             before(grammarAccess.getETDAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:766:1: ( rule__ETD__NameAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:766:2: rule__ETD__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ETD__NameAssignment_1_in_rule__ETD__Group__1__Impl1533);
            rule__ETD__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ETD__Group__1__Impl"


    // $ANTLR start "rule__ETD__Group__2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:776:1: rule__ETD__Group__2 : rule__ETD__Group__2__Impl ;
    public final void rule__ETD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:780:1: ( rule__ETD__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:781:2: rule__ETD__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ETD__Group__2__Impl_in_rule__ETD__Group__21563);
            rule__ETD__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ETD__Group__2"


    // $ANTLR start "rule__ETD__Group__2__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:787:1: rule__ETD__Group__2__Impl : ( ( rule__ETD__Group_2__0 )? ) ;
    public final void rule__ETD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:791:1: ( ( ( rule__ETD__Group_2__0 )? ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:792:1: ( ( rule__ETD__Group_2__0 )? )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:792:1: ( ( rule__ETD__Group_2__0 )? )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:793:1: ( rule__ETD__Group_2__0 )?
            {
             before(grammarAccess.getETDAccess().getGroup_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:794:1: ( rule__ETD__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:794:2: rule__ETD__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ETD__Group_2__0_in_rule__ETD__Group__2__Impl1590);
                    rule__ETD__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getETDAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ETD__Group__2__Impl"


    // $ANTLR start "rule__ETD__Group_2__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:810:1: rule__ETD__Group_2__0 : rule__ETD__Group_2__0__Impl rule__ETD__Group_2__1 ;
    public final void rule__ETD__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:814:1: ( rule__ETD__Group_2__0__Impl rule__ETD__Group_2__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:815:2: rule__ETD__Group_2__0__Impl rule__ETD__Group_2__1
            {
            pushFollow(FOLLOW_rule__ETD__Group_2__0__Impl_in_rule__ETD__Group_2__01627);
            rule__ETD__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group_2__1_in_rule__ETD__Group_2__01630);
            rule__ETD__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ETD__Group_2__0"


    // $ANTLR start "rule__ETD__Group_2__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:822:1: rule__ETD__Group_2__0__Impl : ( 'from' ) ;
    public final void rule__ETD__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:826:1: ( ( 'from' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:827:1: ( 'from' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:827:1: ( 'from' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:828:1: 'from'
            {
             before(grammarAccess.getETDAccess().getFromKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__ETD__Group_2__0__Impl1658); 
             after(grammarAccess.getETDAccess().getFromKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ETD__Group_2__0__Impl"


    // $ANTLR start "rule__ETD__Group_2__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:841:1: rule__ETD__Group_2__1 : rule__ETD__Group_2__1__Impl ;
    public final void rule__ETD__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:845:1: ( rule__ETD__Group_2__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:846:2: rule__ETD__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ETD__Group_2__1__Impl_in_rule__ETD__Group_2__11689);
            rule__ETD__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ETD__Group_2__1"


    // $ANTLR start "rule__ETD__Group_2__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:852:1: rule__ETD__Group_2__1__Impl : ( ( rule__ETD__SupertypeAssignment_2_1 ) ) ;
    public final void rule__ETD__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:856:1: ( ( ( rule__ETD__SupertypeAssignment_2_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:857:1: ( ( rule__ETD__SupertypeAssignment_2_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:857:1: ( ( rule__ETD__SupertypeAssignment_2_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:858:1: ( rule__ETD__SupertypeAssignment_2_1 )
            {
             before(grammarAccess.getETDAccess().getSupertypeAssignment_2_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:859:1: ( rule__ETD__SupertypeAssignment_2_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:859:2: rule__ETD__SupertypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ETD__SupertypeAssignment_2_1_in_rule__ETD__Group_2__1__Impl1716);
            rule__ETD__SupertypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getSupertypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ETD__Group_2__1__Impl"


    // $ANTLR start "rule__RTD__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:873:1: rule__RTD__Group__0 : rule__RTD__Group__0__Impl rule__RTD__Group__1 ;
    public final void rule__RTD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:877:1: ( rule__RTD__Group__0__Impl rule__RTD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:878:2: rule__RTD__Group__0__Impl rule__RTD__Group__1
            {
            pushFollow(FOLLOW_rule__RTD__Group__0__Impl_in_rule__RTD__Group__01750);
            rule__RTD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__1_in_rule__RTD__Group__01753);
            rule__RTD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__Group__0"


    // $ANTLR start "rule__RTD__Group__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:885:1: rule__RTD__Group__0__Impl : ( 'define' ) ;
    public final void rule__RTD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:889:1: ( ( 'define' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:890:1: ( 'define' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:890:1: ( 'define' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:891:1: 'define'
            {
             before(grammarAccess.getRTDAccess().getDefineKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__RTD__Group__0__Impl1781); 
             after(grammarAccess.getRTDAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__Group__0__Impl"


    // $ANTLR start "rule__RTD__Group__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:904:1: rule__RTD__Group__1 : rule__RTD__Group__1__Impl rule__RTD__Group__2 ;
    public final void rule__RTD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:908:1: ( rule__RTD__Group__1__Impl rule__RTD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:909:2: rule__RTD__Group__1__Impl rule__RTD__Group__2
            {
            pushFollow(FOLLOW_rule__RTD__Group__1__Impl_in_rule__RTD__Group__11812);
            rule__RTD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__2_in_rule__RTD__Group__11815);
            rule__RTD__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__Group__1"


    // $ANTLR start "rule__RTD__Group__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:916:1: rule__RTD__Group__1__Impl : ( ( rule__RTD__NameAssignment_1 ) ) ;
    public final void rule__RTD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:920:1: ( ( ( rule__RTD__NameAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:921:1: ( ( rule__RTD__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:921:1: ( ( rule__RTD__NameAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:922:1: ( rule__RTD__NameAssignment_1 )
            {
             before(grammarAccess.getRTDAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:923:1: ( rule__RTD__NameAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:923:2: rule__RTD__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RTD__NameAssignment_1_in_rule__RTD__Group__1__Impl1842);
            rule__RTD__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__Group__1__Impl"


    // $ANTLR start "rule__RTD__Group__2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:933:1: rule__RTD__Group__2 : rule__RTD__Group__2__Impl rule__RTD__Group__3 ;
    public final void rule__RTD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:937:1: ( rule__RTD__Group__2__Impl rule__RTD__Group__3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:938:2: rule__RTD__Group__2__Impl rule__RTD__Group__3
            {
            pushFollow(FOLLOW_rule__RTD__Group__2__Impl_in_rule__RTD__Group__21872);
            rule__RTD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__3_in_rule__RTD__Group__21875);
            rule__RTD__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__Group__2"


    // $ANTLR start "rule__RTD__Group__2__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:945:1: rule__RTD__Group__2__Impl : ( ':' ) ;
    public final void rule__RTD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:949:1: ( ( ':' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:950:1: ( ':' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:950:1: ( ':' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:951:1: ':'
            {
             before(grammarAccess.getRTDAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__RTD__Group__2__Impl1903); 
             after(grammarAccess.getRTDAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__Group__2__Impl"


    // $ANTLR start "rule__RTD__Group__3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:964:1: rule__RTD__Group__3 : rule__RTD__Group__3__Impl rule__RTD__Group__4 ;
    public final void rule__RTD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:968:1: ( rule__RTD__Group__3__Impl rule__RTD__Group__4 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:969:2: rule__RTD__Group__3__Impl rule__RTD__Group__4
            {
            pushFollow(FOLLOW_rule__RTD__Group__3__Impl_in_rule__RTD__Group__31934);
            rule__RTD__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__4_in_rule__RTD__Group__31937);
            rule__RTD__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__Group__3"


    // $ANTLR start "rule__RTD__Group__3__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:976:1: rule__RTD__Group__3__Impl : ( ( rule__RTD__DomainAssignment_3 ) ) ;
    public final void rule__RTD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:980:1: ( ( ( rule__RTD__DomainAssignment_3 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:981:1: ( ( rule__RTD__DomainAssignment_3 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:981:1: ( ( rule__RTD__DomainAssignment_3 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:982:1: ( rule__RTD__DomainAssignment_3 )
            {
             before(grammarAccess.getRTDAccess().getDomainAssignment_3()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:983:1: ( rule__RTD__DomainAssignment_3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:983:2: rule__RTD__DomainAssignment_3
            {
            pushFollow(FOLLOW_rule__RTD__DomainAssignment_3_in_rule__RTD__Group__3__Impl1964);
            rule__RTD__DomainAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getDomainAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__Group__3__Impl"


    // $ANTLR start "rule__RTD__Group__4"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:993:1: rule__RTD__Group__4 : rule__RTD__Group__4__Impl rule__RTD__Group__5 ;
    public final void rule__RTD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:997:1: ( rule__RTD__Group__4__Impl rule__RTD__Group__5 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:998:2: rule__RTD__Group__4__Impl rule__RTD__Group__5
            {
            pushFollow(FOLLOW_rule__RTD__Group__4__Impl_in_rule__RTD__Group__41994);
            rule__RTD__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__5_in_rule__RTD__Group__41997);
            rule__RTD__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__Group__4"


    // $ANTLR start "rule__RTD__Group__4__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1005:1: rule__RTD__Group__4__Impl : ( '->' ) ;
    public final void rule__RTD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1009:1: ( ( '->' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1010:1: ( '->' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1010:1: ( '->' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1011:1: '->'
            {
             before(grammarAccess.getRTDAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__RTD__Group__4__Impl2025); 
             after(grammarAccess.getRTDAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__Group__4__Impl"


    // $ANTLR start "rule__RTD__Group__5"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1024:1: rule__RTD__Group__5 : rule__RTD__Group__5__Impl ;
    public final void rule__RTD__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1028:1: ( rule__RTD__Group__5__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1029:2: rule__RTD__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RTD__Group__5__Impl_in_rule__RTD__Group__52056);
            rule__RTD__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__Group__5"


    // $ANTLR start "rule__RTD__Group__5__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1035:1: rule__RTD__Group__5__Impl : ( ( rule__RTD__CoDomainAssignment_5 ) ) ;
    public final void rule__RTD__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1039:1: ( ( ( rule__RTD__CoDomainAssignment_5 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1040:1: ( ( rule__RTD__CoDomainAssignment_5 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1040:1: ( ( rule__RTD__CoDomainAssignment_5 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1041:1: ( rule__RTD__CoDomainAssignment_5 )
            {
             before(grammarAccess.getRTDAccess().getCoDomainAssignment_5()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1042:1: ( rule__RTD__CoDomainAssignment_5 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1042:2: rule__RTD__CoDomainAssignment_5
            {
            pushFollow(FOLLOW_rule__RTD__CoDomainAssignment_5_in_rule__RTD__Group__5__Impl2083);
            rule__RTD__CoDomainAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getCoDomainAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__Group__5__Impl"


    // $ANTLR start "rule__EDGroup__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1064:1: rule__EDGroup__Group__0 : rule__EDGroup__Group__0__Impl rule__EDGroup__Group__1 ;
    public final void rule__EDGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1068:1: ( rule__EDGroup__Group__0__Impl rule__EDGroup__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1069:2: rule__EDGroup__Group__0__Impl rule__EDGroup__Group__1
            {
            pushFollow(FOLLOW_rule__EDGroup__Group__0__Impl_in_rule__EDGroup__Group__02125);
            rule__EDGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EDGroup__Group__1_in_rule__EDGroup__Group__02128);
            rule__EDGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__Group__0"


    // $ANTLR start "rule__EDGroup__Group__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1076:1: rule__EDGroup__Group__0__Impl : ( ( rule__EDGroup__TypeAssignment_0 ) ) ;
    public final void rule__EDGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1080:1: ( ( ( rule__EDGroup__TypeAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1081:1: ( ( rule__EDGroup__TypeAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1081:1: ( ( rule__EDGroup__TypeAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1082:1: ( rule__EDGroup__TypeAssignment_0 )
            {
             before(grammarAccess.getEDGroupAccess().getTypeAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1083:1: ( rule__EDGroup__TypeAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1083:2: rule__EDGroup__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EDGroup__TypeAssignment_0_in_rule__EDGroup__Group__0__Impl2155);
            rule__EDGroup__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEDGroupAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__Group__0__Impl"


    // $ANTLR start "rule__EDGroup__Group__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1093:1: rule__EDGroup__Group__1 : rule__EDGroup__Group__1__Impl rule__EDGroup__Group__2 ;
    public final void rule__EDGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1097:1: ( rule__EDGroup__Group__1__Impl rule__EDGroup__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1098:2: rule__EDGroup__Group__1__Impl rule__EDGroup__Group__2
            {
            pushFollow(FOLLOW_rule__EDGroup__Group__1__Impl_in_rule__EDGroup__Group__12185);
            rule__EDGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EDGroup__Group__2_in_rule__EDGroup__Group__12188);
            rule__EDGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__Group__1"


    // $ANTLR start "rule__EDGroup__Group__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1105:1: rule__EDGroup__Group__1__Impl : ( ':' ) ;
    public final void rule__EDGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1109:1: ( ( ':' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1110:1: ( ':' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1110:1: ( ':' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1111:1: ':'
            {
             before(grammarAccess.getEDGroupAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__EDGroup__Group__1__Impl2216); 
             after(grammarAccess.getEDGroupAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__Group__1__Impl"


    // $ANTLR start "rule__EDGroup__Group__2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1124:1: rule__EDGroup__Group__2 : rule__EDGroup__Group__2__Impl rule__EDGroup__Group__3 ;
    public final void rule__EDGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1128:1: ( rule__EDGroup__Group__2__Impl rule__EDGroup__Group__3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1129:2: rule__EDGroup__Group__2__Impl rule__EDGroup__Group__3
            {
            pushFollow(FOLLOW_rule__EDGroup__Group__2__Impl_in_rule__EDGroup__Group__22247);
            rule__EDGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EDGroup__Group__3_in_rule__EDGroup__Group__22250);
            rule__EDGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__Group__2"


    // $ANTLR start "rule__EDGroup__Group__2__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1136:1: rule__EDGroup__Group__2__Impl : ( ( rule__EDGroup__ItemsAssignment_2 ) ) ;
    public final void rule__EDGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1140:1: ( ( ( rule__EDGroup__ItemsAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1141:1: ( ( rule__EDGroup__ItemsAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1141:1: ( ( rule__EDGroup__ItemsAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1142:1: ( rule__EDGroup__ItemsAssignment_2 )
            {
             before(grammarAccess.getEDGroupAccess().getItemsAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1143:1: ( rule__EDGroup__ItemsAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1143:2: rule__EDGroup__ItemsAssignment_2
            {
            pushFollow(FOLLOW_rule__EDGroup__ItemsAssignment_2_in_rule__EDGroup__Group__2__Impl2277);
            rule__EDGroup__ItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEDGroupAccess().getItemsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__Group__2__Impl"


    // $ANTLR start "rule__EDGroup__Group__3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1153:1: rule__EDGroup__Group__3 : rule__EDGroup__Group__3__Impl ;
    public final void rule__EDGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1157:1: ( rule__EDGroup__Group__3__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1158:2: rule__EDGroup__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EDGroup__Group__3__Impl_in_rule__EDGroup__Group__32307);
            rule__EDGroup__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__Group__3"


    // $ANTLR start "rule__EDGroup__Group__3__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1164:1: rule__EDGroup__Group__3__Impl : ( ( rule__EDGroup__Group_3__0 )* ) ;
    public final void rule__EDGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1168:1: ( ( ( rule__EDGroup__Group_3__0 )* ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1169:1: ( ( rule__EDGroup__Group_3__0 )* )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1169:1: ( ( rule__EDGroup__Group_3__0 )* )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1170:1: ( rule__EDGroup__Group_3__0 )*
            {
             before(grammarAccess.getEDGroupAccess().getGroup_3()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1171:1: ( rule__EDGroup__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1171:2: rule__EDGroup__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__EDGroup__Group_3__0_in_rule__EDGroup__Group__3__Impl2334);
            	    rule__EDGroup__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEDGroupAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__Group__3__Impl"


    // $ANTLR start "rule__EDGroup__Group_3__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1189:1: rule__EDGroup__Group_3__0 : rule__EDGroup__Group_3__0__Impl rule__EDGroup__Group_3__1 ;
    public final void rule__EDGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1193:1: ( rule__EDGroup__Group_3__0__Impl rule__EDGroup__Group_3__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1194:2: rule__EDGroup__Group_3__0__Impl rule__EDGroup__Group_3__1
            {
            pushFollow(FOLLOW_rule__EDGroup__Group_3__0__Impl_in_rule__EDGroup__Group_3__02373);
            rule__EDGroup__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EDGroup__Group_3__1_in_rule__EDGroup__Group_3__02376);
            rule__EDGroup__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__Group_3__0"


    // $ANTLR start "rule__EDGroup__Group_3__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1201:1: rule__EDGroup__Group_3__0__Impl : ( ',' ) ;
    public final void rule__EDGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1205:1: ( ( ',' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1206:1: ( ',' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1206:1: ( ',' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1207:1: ','
            {
             before(grammarAccess.getEDGroupAccess().getCommaKeyword_3_0()); 
            match(input,19,FOLLOW_19_in_rule__EDGroup__Group_3__0__Impl2404); 
             after(grammarAccess.getEDGroupAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__Group_3__0__Impl"


    // $ANTLR start "rule__EDGroup__Group_3__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1220:1: rule__EDGroup__Group_3__1 : rule__EDGroup__Group_3__1__Impl ;
    public final void rule__EDGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1224:1: ( rule__EDGroup__Group_3__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1225:2: rule__EDGroup__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EDGroup__Group_3__1__Impl_in_rule__EDGroup__Group_3__12435);
            rule__EDGroup__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__Group_3__1"


    // $ANTLR start "rule__EDGroup__Group_3__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1231:1: rule__EDGroup__Group_3__1__Impl : ( ( rule__EDGroup__ItemsAssignment_3_1 ) ) ;
    public final void rule__EDGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1235:1: ( ( ( rule__EDGroup__ItemsAssignment_3_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1236:1: ( ( rule__EDGroup__ItemsAssignment_3_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1236:1: ( ( rule__EDGroup__ItemsAssignment_3_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1237:1: ( rule__EDGroup__ItemsAssignment_3_1 )
            {
             before(grammarAccess.getEDGroupAccess().getItemsAssignment_3_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1238:1: ( rule__EDGroup__ItemsAssignment_3_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1238:2: rule__EDGroup__ItemsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EDGroup__ItemsAssignment_3_1_in_rule__EDGroup__Group_3__1__Impl2462);
            rule__EDGroup__ItemsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEDGroupAccess().getItemsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__Group_3__1__Impl"


    // $ANTLR start "rule__RD__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1252:1: rule__RD__Group__0 : rule__RD__Group__0__Impl rule__RD__Group__1 ;
    public final void rule__RD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1256:1: ( rule__RD__Group__0__Impl rule__RD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1257:2: rule__RD__Group__0__Impl rule__RD__Group__1
            {
            pushFollow(FOLLOW_rule__RD__Group__0__Impl_in_rule__RD__Group__02496);
            rule__RD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__1_in_rule__RD__Group__02499);
            rule__RD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RD__Group__0"


    // $ANTLR start "rule__RD__Group__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1264:1: rule__RD__Group__0__Impl : ( ( rule__RD__SourceAssignment_0 ) ) ;
    public final void rule__RD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1268:1: ( ( ( rule__RD__SourceAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1269:1: ( ( rule__RD__SourceAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1269:1: ( ( rule__RD__SourceAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1270:1: ( rule__RD__SourceAssignment_0 )
            {
             before(grammarAccess.getRDAccess().getSourceAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1271:1: ( rule__RD__SourceAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1271:2: rule__RD__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__RD__SourceAssignment_0_in_rule__RD__Group__0__Impl2526);
            rule__RD__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RD__Group__0__Impl"


    // $ANTLR start "rule__RD__Group__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1281:1: rule__RD__Group__1 : rule__RD__Group__1__Impl rule__RD__Group__2 ;
    public final void rule__RD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1285:1: ( rule__RD__Group__1__Impl rule__RD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1286:2: rule__RD__Group__1__Impl rule__RD__Group__2
            {
            pushFollow(FOLLOW_rule__RD__Group__1__Impl_in_rule__RD__Group__12556);
            rule__RD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__2_in_rule__RD__Group__12559);
            rule__RD__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RD__Group__1"


    // $ANTLR start "rule__RD__Group__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1293:1: rule__RD__Group__1__Impl : ( ( rule__RD__RelAssignment_1 ) ) ;
    public final void rule__RD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1297:1: ( ( ( rule__RD__RelAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1298:1: ( ( rule__RD__RelAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1298:1: ( ( rule__RD__RelAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1299:1: ( rule__RD__RelAssignment_1 )
            {
             before(grammarAccess.getRDAccess().getRelAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1300:1: ( rule__RD__RelAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1300:2: rule__RD__RelAssignment_1
            {
            pushFollow(FOLLOW_rule__RD__RelAssignment_1_in_rule__RD__Group__1__Impl2586);
            rule__RD__RelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getRelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RD__Group__1__Impl"


    // $ANTLR start "rule__RD__Group__2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1310:1: rule__RD__Group__2 : rule__RD__Group__2__Impl ;
    public final void rule__RD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1314:1: ( rule__RD__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1315:2: rule__RD__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RD__Group__2__Impl_in_rule__RD__Group__22616);
            rule__RD__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RD__Group__2"


    // $ANTLR start "rule__RD__Group__2__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1321:1: rule__RD__Group__2__Impl : ( ( rule__RD__TargetAssignment_2 ) ) ;
    public final void rule__RD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1325:1: ( ( ( rule__RD__TargetAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1326:1: ( ( rule__RD__TargetAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1326:1: ( ( rule__RD__TargetAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1327:1: ( rule__RD__TargetAssignment_2 )
            {
             before(grammarAccess.getRDAccess().getTargetAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1328:1: ( rule__RD__TargetAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1328:2: rule__RD__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__RD__TargetAssignment_2_in_rule__RD__Group__2__Impl2643);
            rule__RD__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RD__Group__2__Impl"


    // $ANTLR start "rule__MegaLLinking__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1344:1: rule__MegaLLinking__Group__0 : rule__MegaLLinking__Group__0__Impl rule__MegaLLinking__Group__1 ;
    public final void rule__MegaLLinking__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1348:1: ( rule__MegaLLinking__Group__0__Impl rule__MegaLLinking__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1349:2: rule__MegaLLinking__Group__0__Impl rule__MegaLLinking__Group__1
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__0__Impl_in_rule__MegaLLinking__Group__02679);
            rule__MegaLLinking__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLLinking__Group__1_in_rule__MegaLLinking__Group__02682);
            rule__MegaLLinking__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__Group__0"


    // $ANTLR start "rule__MegaLLinking__Group__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1356:1: rule__MegaLLinking__Group__0__Impl : ( 'linking' ) ;
    public final void rule__MegaLLinking__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1360:1: ( ( 'linking' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1361:1: ( 'linking' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1361:1: ( 'linking' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1362:1: 'linking'
            {
             before(grammarAccess.getMegaLLinkingAccess().getLinkingKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__MegaLLinking__Group__0__Impl2710); 
             after(grammarAccess.getMegaLLinkingAccess().getLinkingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__Group__0__Impl"


    // $ANTLR start "rule__MegaLLinking__Group__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1375:1: rule__MegaLLinking__Group__1 : rule__MegaLLinking__Group__1__Impl rule__MegaLLinking__Group__2 ;
    public final void rule__MegaLLinking__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1379:1: ( rule__MegaLLinking__Group__1__Impl rule__MegaLLinking__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1380:2: rule__MegaLLinking__Group__1__Impl rule__MegaLLinking__Group__2
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__1__Impl_in_rule__MegaLLinking__Group__12741);
            rule__MegaLLinking__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLLinking__Group__2_in_rule__MegaLLinking__Group__12744);
            rule__MegaLLinking__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__Group__1"


    // $ANTLR start "rule__MegaLLinking__Group__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1387:1: rule__MegaLLinking__Group__1__Impl : ( ( rule__MegaLLinking__NameAssignment_1 ) ) ;
    public final void rule__MegaLLinking__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1391:1: ( ( ( rule__MegaLLinking__NameAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1392:1: ( ( rule__MegaLLinking__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1392:1: ( ( rule__MegaLLinking__NameAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1393:1: ( rule__MegaLLinking__NameAssignment_1 )
            {
             before(grammarAccess.getMegaLLinkingAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1394:1: ( rule__MegaLLinking__NameAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1394:2: rule__MegaLLinking__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MegaLLinking__NameAssignment_1_in_rule__MegaLLinking__Group__1__Impl2771);
            rule__MegaLLinking__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegaLLinkingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__Group__1__Impl"


    // $ANTLR start "rule__MegaLLinking__Group__2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1404:1: rule__MegaLLinking__Group__2 : rule__MegaLLinking__Group__2__Impl rule__MegaLLinking__Group__3 ;
    public final void rule__MegaLLinking__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1408:1: ( rule__MegaLLinking__Group__2__Impl rule__MegaLLinking__Group__3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1409:2: rule__MegaLLinking__Group__2__Impl rule__MegaLLinking__Group__3
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__2__Impl_in_rule__MegaLLinking__Group__22801);
            rule__MegaLLinking__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLLinking__Group__3_in_rule__MegaLLinking__Group__22804);
            rule__MegaLLinking__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__Group__2"


    // $ANTLR start "rule__MegaLLinking__Group__2__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1416:1: rule__MegaLLinking__Group__2__Impl : ( ( rule__MegaLLinking__Group_2__0 )? ) ;
    public final void rule__MegaLLinking__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1420:1: ( ( ( rule__MegaLLinking__Group_2__0 )? ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1421:1: ( ( rule__MegaLLinking__Group_2__0 )? )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1421:1: ( ( rule__MegaLLinking__Group_2__0 )? )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1422:1: ( rule__MegaLLinking__Group_2__0 )?
            {
             before(grammarAccess.getMegaLLinkingAccess().getGroup_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1423:1: ( rule__MegaLLinking__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1423:2: rule__MegaLLinking__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MegaLLinking__Group_2__0_in_rule__MegaLLinking__Group__2__Impl2831);
                    rule__MegaLLinking__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegaLLinkingAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__Group__2__Impl"


    // $ANTLR start "rule__MegaLLinking__Group__3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1433:1: rule__MegaLLinking__Group__3 : rule__MegaLLinking__Group__3__Impl ;
    public final void rule__MegaLLinking__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1437:1: ( rule__MegaLLinking__Group__3__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1438:2: rule__MegaLLinking__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__3__Impl_in_rule__MegaLLinking__Group__32862);
            rule__MegaLLinking__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__Group__3"


    // $ANTLR start "rule__MegaLLinking__Group__3__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1444:1: rule__MegaLLinking__Group__3__Impl : ( ( rule__MegaLLinking__LdsAssignment_3 )* ) ;
    public final void rule__MegaLLinking__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1448:1: ( ( ( rule__MegaLLinking__LdsAssignment_3 )* ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1449:1: ( ( rule__MegaLLinking__LdsAssignment_3 )* )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1449:1: ( ( rule__MegaLLinking__LdsAssignment_3 )* )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1450:1: ( rule__MegaLLinking__LdsAssignment_3 )*
            {
             before(grammarAccess.getMegaLLinkingAccess().getLdsAssignment_3()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1451:1: ( rule__MegaLLinking__LdsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1451:2: rule__MegaLLinking__LdsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__MegaLLinking__LdsAssignment_3_in_rule__MegaLLinking__Group__3__Impl2889);
            	    rule__MegaLLinking__LdsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMegaLLinkingAccess().getLdsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__Group__3__Impl"


    // $ANTLR start "rule__MegaLLinking__Group_2__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1469:1: rule__MegaLLinking__Group_2__0 : rule__MegaLLinking__Group_2__0__Impl rule__MegaLLinking__Group_2__1 ;
    public final void rule__MegaLLinking__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1473:1: ( rule__MegaLLinking__Group_2__0__Impl rule__MegaLLinking__Group_2__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1474:2: rule__MegaLLinking__Group_2__0__Impl rule__MegaLLinking__Group_2__1
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group_2__0__Impl_in_rule__MegaLLinking__Group_2__02928);
            rule__MegaLLinking__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLLinking__Group_2__1_in_rule__MegaLLinking__Group_2__02931);
            rule__MegaLLinking__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__Group_2__0"


    // $ANTLR start "rule__MegaLLinking__Group_2__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1481:1: rule__MegaLLinking__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__MegaLLinking__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1485:1: ( ( 'for' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1486:1: ( 'for' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1486:1: ( 'for' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1487:1: 'for'
            {
             before(grammarAccess.getMegaLLinkingAccess().getForKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__MegaLLinking__Group_2__0__Impl2959); 
             after(grammarAccess.getMegaLLinkingAccess().getForKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__Group_2__0__Impl"


    // $ANTLR start "rule__MegaLLinking__Group_2__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1500:1: rule__MegaLLinking__Group_2__1 : rule__MegaLLinking__Group_2__1__Impl ;
    public final void rule__MegaLLinking__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1504:1: ( rule__MegaLLinking__Group_2__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1505:2: rule__MegaLLinking__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group_2__1__Impl_in_rule__MegaLLinking__Group_2__12990);
            rule__MegaLLinking__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__Group_2__1"


    // $ANTLR start "rule__MegaLLinking__Group_2__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1511:1: rule__MegaLLinking__Group_2__1__Impl : ( ( rule__MegaLLinking__TargetAssignment_2_1 ) ) ;
    public final void rule__MegaLLinking__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1515:1: ( ( ( rule__MegaLLinking__TargetAssignment_2_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1516:1: ( ( rule__MegaLLinking__TargetAssignment_2_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1516:1: ( ( rule__MegaLLinking__TargetAssignment_2_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1517:1: ( rule__MegaLLinking__TargetAssignment_2_1 )
            {
             before(grammarAccess.getMegaLLinkingAccess().getTargetAssignment_2_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1518:1: ( rule__MegaLLinking__TargetAssignment_2_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1518:2: rule__MegaLLinking__TargetAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MegaLLinking__TargetAssignment_2_1_in_rule__MegaLLinking__Group_2__1__Impl3017);
            rule__MegaLLinking__TargetAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMegaLLinkingAccess().getTargetAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__Group_2__1__Impl"


    // $ANTLR start "rule__LD__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1532:1: rule__LD__Group__0 : rule__LD__Group__0__Impl rule__LD__Group__1 ;
    public final void rule__LD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1536:1: ( rule__LD__Group__0__Impl rule__LD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1537:2: rule__LD__Group__0__Impl rule__LD__Group__1
            {
            pushFollow(FOLLOW_rule__LD__Group__0__Impl_in_rule__LD__Group__03051);
            rule__LD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LD__Group__1_in_rule__LD__Group__03054);
            rule__LD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LD__Group__0"


    // $ANTLR start "rule__LD__Group__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1544:1: rule__LD__Group__0__Impl : ( ( rule__LD__TargetAssignment_0 ) ) ;
    public final void rule__LD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1548:1: ( ( ( rule__LD__TargetAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1549:1: ( ( rule__LD__TargetAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1549:1: ( ( rule__LD__TargetAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1550:1: ( rule__LD__TargetAssignment_0 )
            {
             before(grammarAccess.getLDAccess().getTargetAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1551:1: ( rule__LD__TargetAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1551:2: rule__LD__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__LD__TargetAssignment_0_in_rule__LD__Group__0__Impl3081);
            rule__LD__TargetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLDAccess().getTargetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LD__Group__0__Impl"


    // $ANTLR start "rule__LD__Group__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1561:1: rule__LD__Group__1 : rule__LD__Group__1__Impl rule__LD__Group__2 ;
    public final void rule__LD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1565:1: ( rule__LD__Group__1__Impl rule__LD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1566:2: rule__LD__Group__1__Impl rule__LD__Group__2
            {
            pushFollow(FOLLOW_rule__LD__Group__1__Impl_in_rule__LD__Group__13111);
            rule__LD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LD__Group__2_in_rule__LD__Group__13114);
            rule__LD__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LD__Group__1"


    // $ANTLR start "rule__LD__Group__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1573:1: rule__LD__Group__1__Impl : ( '=' ) ;
    public final void rule__LD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1577:1: ( ( '=' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1578:1: ( '=' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1578:1: ( '=' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1579:1: '='
            {
             before(grammarAccess.getLDAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__LD__Group__1__Impl3142); 
             after(grammarAccess.getLDAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LD__Group__1__Impl"


    // $ANTLR start "rule__LD__Group__2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1592:1: rule__LD__Group__2 : rule__LD__Group__2__Impl ;
    public final void rule__LD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1596:1: ( rule__LD__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1597:2: rule__LD__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LD__Group__2__Impl_in_rule__LD__Group__23173);
            rule__LD__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LD__Group__2"


    // $ANTLR start "rule__LD__Group__2__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1603:1: rule__LD__Group__2__Impl : ( ( rule__LD__ValueAssignment_2 ) ) ;
    public final void rule__LD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1607:1: ( ( ( rule__LD__ValueAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1608:1: ( ( rule__LD__ValueAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1608:1: ( ( rule__LD__ValueAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1609:1: ( rule__LD__ValueAssignment_2 )
            {
             before(grammarAccess.getLDAccess().getValueAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1610:1: ( rule__LD__ValueAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1610:2: rule__LD__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__LD__ValueAssignment_2_in_rule__LD__Group__2__Impl3200);
            rule__LD__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLDAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LD__Group__2__Impl"


    // $ANTLR start "rule__QualifiedID__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1626:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1630:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1631:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__03236);
            rule__QualifiedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__03239);
            rule__QualifiedID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group__0"


    // $ANTLR start "rule__QualifiedID__Group__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1638:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1642:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1643:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1643:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1644:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl3266); 
             after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group__0__Impl"


    // $ANTLR start "rule__QualifiedID__Group__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1655:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1659:1: ( rule__QualifiedID__Group__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1660:2: rule__QualifiedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__13295);
            rule__QualifiedID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group__1"


    // $ANTLR start "rule__QualifiedID__Group__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1666:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1670:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1671:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1671:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1672:1: ( rule__QualifiedID__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1673:1: ( rule__QualifiedID__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1673:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl3322);
            	    rule__QualifiedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQualifiedIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group__1__Impl"


    // $ANTLR start "rule__QualifiedID__Group_1__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1687:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1691:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1692:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__03357);
            rule__QualifiedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__03360);
            rule__QualifiedID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group_1__0"


    // $ANTLR start "rule__QualifiedID__Group_1__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1699:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1703:1: ( ( '.' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1704:1: ( '.' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1704:1: ( '.' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1705:1: '.'
            {
             before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__QualifiedID__Group_1__0__Impl3388); 
             after(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedID__Group_1__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1718:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1722:1: ( rule__QualifiedID__Group_1__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1723:2: rule__QualifiedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__13419);
            rule__QualifiedID__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group_1__1"


    // $ANTLR start "rule__QualifiedID__Group_1__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1729:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1733:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1734:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1734:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1735:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl3446); 
             after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group_1__1__Impl"


    // $ANTLR start "rule__MegaLDefinition__NameAssignment_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1751:1: rule__MegaLDefinition__NameAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__MegaLDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1755:1: ( ( ruleQualifiedID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1756:1: ( ruleQualifiedID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1756:1: ( ruleQualifiedID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1757:1: ruleQualifiedID
            {
             before(grammarAccess.getMegaLDefinitionAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__MegaLDefinition__NameAssignment_13484);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getNameQualifiedIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__NameAssignment_1"


    // $ANTLR start "rule__MegaLDefinition__LinkerAssignment_2_2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1766:1: rule__MegaLDefinition__LinkerAssignment_2_2 : ( ( ruleQualifiedID ) ) ;
    public final void rule__MegaLDefinition__LinkerAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1770:1: ( ( ( ruleQualifiedID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1771:1: ( ( ruleQualifiedID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1771:1: ( ( ruleQualifiedID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1772:1: ( ruleQualifiedID )
            {
             before(grammarAccess.getMegaLDefinitionAccess().getLinkerMegaLLinkingCrossReference_2_2_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1773:1: ( ruleQualifiedID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1774:1: ruleQualifiedID
            {
             before(grammarAccess.getMegaLDefinitionAccess().getLinkerMegaLLinkingQualifiedIDParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__MegaLDefinition__LinkerAssignment_2_23519);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getLinkerMegaLLinkingQualifiedIDParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getMegaLDefinitionAccess().getLinkerMegaLLinkingCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__LinkerAssignment_2_2"


    // $ANTLR start "rule__MegaLDefinition__ImportsAssignment_3_0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1785:1: rule__MegaLDefinition__ImportsAssignment_3_0 : ( ruleImport ) ;
    public final void rule__MegaLDefinition__ImportsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1789:1: ( ( ruleImport ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1790:1: ( ruleImport )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1790:1: ( ruleImport )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1791:1: ruleImport
            {
             before(grammarAccess.getMegaLDefinitionAccess().getImportsImportParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__MegaLDefinition__ImportsAssignment_3_03554);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getImportsImportParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__ImportsAssignment_3_0"


    // $ANTLR start "rule__MegaLDefinition__RdsAssignment_3_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1800:1: rule__MegaLDefinition__RdsAssignment_3_1 : ( ruleRD ) ;
    public final void rule__MegaLDefinition__RdsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1804:1: ( ( ruleRD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1805:1: ( ruleRD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1805:1: ( ruleRD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1806:1: ruleRD
            {
             before(grammarAccess.getMegaLDefinitionAccess().getRdsRDParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleRD_in_rule__MegaLDefinition__RdsAssignment_3_13585);
            ruleRD();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getRdsRDParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__RdsAssignment_3_1"


    // $ANTLR start "rule__MegaLDefinition__EtdsAssignment_3_2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1815:1: rule__MegaLDefinition__EtdsAssignment_3_2 : ( ruleETD ) ;
    public final void rule__MegaLDefinition__EtdsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1819:1: ( ( ruleETD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1820:1: ( ruleETD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1820:1: ( ruleETD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1821:1: ruleETD
            {
             before(grammarAccess.getMegaLDefinitionAccess().getEtdsETDParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleETD_in_rule__MegaLDefinition__EtdsAssignment_3_23616);
            ruleETD();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getEtdsETDParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__EtdsAssignment_3_2"


    // $ANTLR start "rule__MegaLDefinition__RtdsAssignment_3_3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1830:1: rule__MegaLDefinition__RtdsAssignment_3_3 : ( ruleRTD ) ;
    public final void rule__MegaLDefinition__RtdsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1834:1: ( ( ruleRTD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1835:1: ( ruleRTD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1835:1: ( ruleRTD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1836:1: ruleRTD
            {
             before(grammarAccess.getMegaLDefinitionAccess().getRtdsRTDParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleRTD_in_rule__MegaLDefinition__RtdsAssignment_3_33647);
            ruleRTD();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getRtdsRTDParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__RtdsAssignment_3_3"


    // $ANTLR start "rule__MegaLDefinition__EdsAssignment_3_4"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1845:1: rule__MegaLDefinition__EdsAssignment_3_4 : ( ruleEDGroup ) ;
    public final void rule__MegaLDefinition__EdsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1849:1: ( ( ruleEDGroup ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1850:1: ( ruleEDGroup )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1850:1: ( ruleEDGroup )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1851:1: ruleEDGroup
            {
             before(grammarAccess.getMegaLDefinitionAccess().getEdsEDGroupParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_ruleEDGroup_in_rule__MegaLDefinition__EdsAssignment_3_43678);
            ruleEDGroup();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getEdsEDGroupParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLDefinition__EdsAssignment_3_4"


    // $ANTLR start "rule__Import__RefAssignment_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1860:1: rule__Import__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Import__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1864:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1865:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1865:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1866:1: ( RULE_ID )
            {
             before(grammarAccess.getImportAccess().getRefMegaLDefinitionCrossReference_1_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1867:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1868:1: RULE_ID
            {
             before(grammarAccess.getImportAccess().getRefMegaLDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Import__RefAssignment_13713); 
             after(grammarAccess.getImportAccess().getRefMegaLDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getImportAccess().getRefMegaLDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__RefAssignment_1"


    // $ANTLR start "rule__ETD__NameAssignment_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1879:1: rule__ETD__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ETD__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1883:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1884:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1884:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1885:1: RULE_ID
            {
             before(grammarAccess.getETDAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ETD__NameAssignment_13748); 
             after(grammarAccess.getETDAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ETD__NameAssignment_1"


    // $ANTLR start "rule__ETD__SupertypeAssignment_2_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1894:1: rule__ETD__SupertypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ETD__SupertypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1898:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1899:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1899:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1900:1: ( RULE_ID )
            {
             before(grammarAccess.getETDAccess().getSupertypeETDCrossReference_2_1_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1901:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1902:1: RULE_ID
            {
             before(grammarAccess.getETDAccess().getSupertypeETDIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ETD__SupertypeAssignment_2_13783); 
             after(grammarAccess.getETDAccess().getSupertypeETDIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getETDAccess().getSupertypeETDCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ETD__SupertypeAssignment_2_1"


    // $ANTLR start "rule__RTD__NameAssignment_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1913:1: rule__RTD__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RTD__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1917:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1918:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1918:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1919:1: RULE_ID
            {
             before(grammarAccess.getRTDAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RTD__NameAssignment_13818); 
             after(grammarAccess.getRTDAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__NameAssignment_1"


    // $ANTLR start "rule__RTD__DomainAssignment_3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1928:1: rule__RTD__DomainAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RTD__DomainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1932:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1933:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1933:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1934:1: ( RULE_ID )
            {
             before(grammarAccess.getRTDAccess().getDomainETDCrossReference_3_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1935:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1936:1: RULE_ID
            {
             before(grammarAccess.getRTDAccess().getDomainETDIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RTD__DomainAssignment_33853); 
             after(grammarAccess.getRTDAccess().getDomainETDIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRTDAccess().getDomainETDCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__DomainAssignment_3"


    // $ANTLR start "rule__RTD__CoDomainAssignment_5"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1947:1: rule__RTD__CoDomainAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RTD__CoDomainAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1951:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1952:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1952:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1953:1: ( RULE_ID )
            {
             before(grammarAccess.getRTDAccess().getCoDomainETDCrossReference_5_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1954:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1955:1: RULE_ID
            {
             before(grammarAccess.getRTDAccess().getCoDomainETDIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RTD__CoDomainAssignment_53892); 
             after(grammarAccess.getRTDAccess().getCoDomainETDIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRTDAccess().getCoDomainETDCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTD__CoDomainAssignment_5"


    // $ANTLR start "rule__EDGroup__TypeAssignment_0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1966:1: rule__EDGroup__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EDGroup__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1970:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1971:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1971:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1972:1: ( RULE_ID )
            {
             before(grammarAccess.getEDGroupAccess().getTypeETDCrossReference_0_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1973:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1974:1: RULE_ID
            {
             before(grammarAccess.getEDGroupAccess().getTypeETDIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EDGroup__TypeAssignment_03931); 
             after(grammarAccess.getEDGroupAccess().getTypeETDIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEDGroupAccess().getTypeETDCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__TypeAssignment_0"


    // $ANTLR start "rule__EDGroup__ItemsAssignment_2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1985:1: rule__EDGroup__ItemsAssignment_2 : ( ruleED ) ;
    public final void rule__EDGroup__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1989:1: ( ( ruleED ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1990:1: ( ruleED )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1990:1: ( ruleED )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1991:1: ruleED
            {
             before(grammarAccess.getEDGroupAccess().getItemsEDParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleED_in_rule__EDGroup__ItemsAssignment_23966);
            ruleED();

            state._fsp--;

             after(grammarAccess.getEDGroupAccess().getItemsEDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__ItemsAssignment_2"


    // $ANTLR start "rule__EDGroup__ItemsAssignment_3_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2000:1: rule__EDGroup__ItemsAssignment_3_1 : ( ruleED ) ;
    public final void rule__EDGroup__ItemsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2004:1: ( ( ruleED ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2005:1: ( ruleED )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2005:1: ( ruleED )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2006:1: ruleED
            {
             before(grammarAccess.getEDGroupAccess().getItemsEDParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleED_in_rule__EDGroup__ItemsAssignment_3_13997);
            ruleED();

            state._fsp--;

             after(grammarAccess.getEDGroupAccess().getItemsEDParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGroup__ItemsAssignment_3_1"


    // $ANTLR start "rule__ED__NameAssignment"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2015:1: rule__ED__NameAssignment : ( RULE_ID ) ;
    public final void rule__ED__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2019:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2020:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2020:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2021:1: RULE_ID
            {
             before(grammarAccess.getEDAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ED__NameAssignment4028); 
             after(grammarAccess.getEDAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ED__NameAssignment"


    // $ANTLR start "rule__RD__SourceAssignment_0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2030:1: rule__RD__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RD__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2034:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2035:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2035:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2036:1: ( RULE_ID )
            {
             before(grammarAccess.getRDAccess().getSourceEDCrossReference_0_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2037:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2038:1: RULE_ID
            {
             before(grammarAccess.getRDAccess().getSourceEDIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RD__SourceAssignment_04063); 
             after(grammarAccess.getRDAccess().getSourceEDIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRDAccess().getSourceEDCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RD__SourceAssignment_0"


    // $ANTLR start "rule__RD__RelAssignment_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2049:1: rule__RD__RelAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RD__RelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2053:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2054:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2054:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2055:1: ( RULE_ID )
            {
             before(grammarAccess.getRDAccess().getRelRTDCrossReference_1_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2056:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2057:1: RULE_ID
            {
             before(grammarAccess.getRDAccess().getRelRTDIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RD__RelAssignment_14102); 
             after(grammarAccess.getRDAccess().getRelRTDIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRDAccess().getRelRTDCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RD__RelAssignment_1"


    // $ANTLR start "rule__RD__TargetAssignment_2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2068:1: rule__RD__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RD__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2072:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2073:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2073:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2074:1: ( RULE_ID )
            {
             before(grammarAccess.getRDAccess().getTargetEDCrossReference_2_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2075:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2076:1: RULE_ID
            {
             before(grammarAccess.getRDAccess().getTargetEDIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RD__TargetAssignment_24141); 
             after(grammarAccess.getRDAccess().getTargetEDIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRDAccess().getTargetEDCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RD__TargetAssignment_2"


    // $ANTLR start "rule__MegaLLinking__NameAssignment_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2087:1: rule__MegaLLinking__NameAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__MegaLLinking__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2091:1: ( ( ruleQualifiedID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2092:1: ( ruleQualifiedID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2092:1: ( ruleQualifiedID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2093:1: ruleQualifiedID
            {
             before(grammarAccess.getMegaLLinkingAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__MegaLLinking__NameAssignment_14176);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getMegaLLinkingAccess().getNameQualifiedIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__NameAssignment_1"


    // $ANTLR start "rule__MegaLLinking__TargetAssignment_2_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2102:1: rule__MegaLLinking__TargetAssignment_2_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__MegaLLinking__TargetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2106:1: ( ( ( ruleQualifiedID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2107:1: ( ( ruleQualifiedID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2107:1: ( ( ruleQualifiedID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2108:1: ( ruleQualifiedID )
            {
             before(grammarAccess.getMegaLLinkingAccess().getTargetMegaLDefinitionCrossReference_2_1_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2109:1: ( ruleQualifiedID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2110:1: ruleQualifiedID
            {
             before(grammarAccess.getMegaLLinkingAccess().getTargetMegaLDefinitionQualifiedIDParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__MegaLLinking__TargetAssignment_2_14211);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getMegaLLinkingAccess().getTargetMegaLDefinitionQualifiedIDParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMegaLLinkingAccess().getTargetMegaLDefinitionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__TargetAssignment_2_1"


    // $ANTLR start "rule__MegaLLinking__LdsAssignment_3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2121:1: rule__MegaLLinking__LdsAssignment_3 : ( ruleLD ) ;
    public final void rule__MegaLLinking__LdsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2125:1: ( ( ruleLD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2126:1: ( ruleLD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2126:1: ( ruleLD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2127:1: ruleLD
            {
             before(grammarAccess.getMegaLLinkingAccess().getLdsLDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLD_in_rule__MegaLLinking__LdsAssignment_34246);
            ruleLD();

            state._fsp--;

             after(grammarAccess.getMegaLLinkingAccess().getLdsLDParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegaLLinking__LdsAssignment_3"


    // $ANTLR start "rule__LD__TargetAssignment_0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2136:1: rule__LD__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LD__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2140:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2141:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2141:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2142:1: ( RULE_ID )
            {
             before(grammarAccess.getLDAccess().getTargetEDCrossReference_0_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2143:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2144:1: RULE_ID
            {
             before(grammarAccess.getLDAccess().getTargetEDIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LD__TargetAssignment_04281); 
             after(grammarAccess.getLDAccess().getTargetEDIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLDAccess().getTargetEDCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LD__TargetAssignment_0"


    // $ANTLR start "rule__LD__ValueAssignment_2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2155:1: rule__LD__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LD__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2159:1: ( ( RULE_STRING ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2160:1: ( RULE_STRING )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2160:1: ( RULE_STRING )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2161:1: RULE_STRING
            {
             before(grammarAccess.getLDAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LD__ValueAssignment_24316); 
             after(grammarAccess.getLDAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LD__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLDefinition_in_entryRuleMegaLDefinition121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaLDefinition128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__0_in_ruleMegaLDefinition154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_entryRuleETD241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETD248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__0_in_ruleETD274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_entryRuleRTD301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTD308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__0_in_ruleRTD334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDGroup_in_entryRuleEDGroup361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEDGroup368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDGroup__Group__0_in_ruleEDGroup394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_entryRuleED421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleED428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__NameAssignment_in_ruleED454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_entryRuleRD481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRD488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__0_in_ruleRD514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLLinking_in_entryRuleMegaLLinking541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaLLinking548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__0_in_ruleMegaLLinking574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLD_in_entryRuleLD601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLD608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group__0_in_ruleLD634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLDefinition_in_rule__Model__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLLinking_in_rule__Model__Alternatives747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__ImportsAssignment_3_0_in_rule__MegaLDefinition__Alternatives_3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__RdsAssignment_3_1_in_rule__MegaLDefinition__Alternatives_3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__EtdsAssignment_3_2_in_rule__MegaLDefinition__Alternatives_3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__RtdsAssignment_3_3_in_rule__MegaLDefinition__Alternatives_3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__EdsAssignment_3_4_in_rule__MegaLDefinition__Alternatives_3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__0__Impl_in_rule__MegaLDefinition__Group__0882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__1_in_rule__MegaLDefinition__Group__0885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__MegaLDefinition__Group__0__Impl913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__1__Impl_in_rule__MegaLDefinition__Group__1944 = new BitSet(new long[]{0x000000000000D010L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__2_in_rule__MegaLDefinition__Group__1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__NameAssignment_1_in_rule__MegaLDefinition__Group__1__Impl974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__2__Impl_in_rule__MegaLDefinition__Group__21004 = new BitSet(new long[]{0x000000000000D010L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__3_in_rule__MegaLDefinition__Group__21007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__0_in_rule__MegaLDefinition__Group__2__Impl1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__3__Impl_in_rule__MegaLDefinition__Group__31065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Alternatives_3_in_rule__MegaLDefinition__Group__3__Impl1092 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__0__Impl_in_rule__MegaLDefinition__Group_2__01131 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__1_in_rule__MegaLDefinition__Group_2__01134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MegaLDefinition__Group_2__0__Impl1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__1__Impl_in_rule__MegaLDefinition__Group_2__11193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__2_in_rule__MegaLDefinition__Group_2__11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MegaLDefinition__Group_2__1__Impl1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__2__Impl_in_rule__MegaLDefinition__Group_2__21255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__LinkerAssignment_2_2_in_rule__MegaLDefinition__Group_2__2__Impl1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Import__Group__0__Impl1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__RefAssignment_1_in_rule__Import__Group__1__Impl1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__0__Impl_in_rule__ETD__Group__01441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ETD__Group__1_in_rule__ETD__Group__01444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ETD__Group__0__Impl1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__1__Impl_in_rule__ETD__Group__11503 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ETD__Group__2_in_rule__ETD__Group__11506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__NameAssignment_1_in_rule__ETD__Group__1__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__2__Impl_in_rule__ETD__Group__21563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__0_in_rule__ETD__Group__2__Impl1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__0__Impl_in_rule__ETD__Group_2__01627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__1_in_rule__ETD__Group_2__01630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ETD__Group_2__0__Impl1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__1__Impl_in_rule__ETD__Group_2__11689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__SupertypeAssignment_2_1_in_rule__ETD__Group_2__1__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__0__Impl_in_rule__RTD__Group__01750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RTD__Group__1_in_rule__RTD__Group__01753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RTD__Group__0__Impl1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__1__Impl_in_rule__RTD__Group__11812 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RTD__Group__2_in_rule__RTD__Group__11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__NameAssignment_1_in_rule__RTD__Group__1__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__2__Impl_in_rule__RTD__Group__21872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RTD__Group__3_in_rule__RTD__Group__21875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RTD__Group__2__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__3__Impl_in_rule__RTD__Group__31934 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__RTD__Group__4_in_rule__RTD__Group__31937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__DomainAssignment_3_in_rule__RTD__Group__3__Impl1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__4__Impl_in_rule__RTD__Group__41994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RTD__Group__5_in_rule__RTD__Group__41997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RTD__Group__4__Impl2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__5__Impl_in_rule__RTD__Group__52056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__CoDomainAssignment_5_in_rule__RTD__Group__5__Impl2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDGroup__Group__0__Impl_in_rule__EDGroup__Group__02125 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EDGroup__Group__1_in_rule__EDGroup__Group__02128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDGroup__TypeAssignment_0_in_rule__EDGroup__Group__0__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDGroup__Group__1__Impl_in_rule__EDGroup__Group__12185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EDGroup__Group__2_in_rule__EDGroup__Group__12188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EDGroup__Group__1__Impl2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDGroup__Group__2__Impl_in_rule__EDGroup__Group__22247 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EDGroup__Group__3_in_rule__EDGroup__Group__22250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDGroup__ItemsAssignment_2_in_rule__EDGroup__Group__2__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDGroup__Group__3__Impl_in_rule__EDGroup__Group__32307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDGroup__Group_3__0_in_rule__EDGroup__Group__3__Impl2334 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EDGroup__Group_3__0__Impl_in_rule__EDGroup__Group_3__02373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EDGroup__Group_3__1_in_rule__EDGroup__Group_3__02376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EDGroup__Group_3__0__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDGroup__Group_3__1__Impl_in_rule__EDGroup__Group_3__12435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDGroup__ItemsAssignment_3_1_in_rule__EDGroup__Group_3__1__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__0__Impl_in_rule__RD__Group__02496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RD__Group__1_in_rule__RD__Group__02499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__SourceAssignment_0_in_rule__RD__Group__0__Impl2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__1__Impl_in_rule__RD__Group__12556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RD__Group__2_in_rule__RD__Group__12559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__RelAssignment_1_in_rule__RD__Group__1__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__2__Impl_in_rule__RD__Group__22616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__TargetAssignment_2_in_rule__RD__Group__2__Impl2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__0__Impl_in_rule__MegaLLinking__Group__02679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__1_in_rule__MegaLLinking__Group__02682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MegaLLinking__Group__0__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__1__Impl_in_rule__MegaLLinking__Group__12741 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__2_in_rule__MegaLLinking__Group__12744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__NameAssignment_1_in_rule__MegaLLinking__Group__1__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__2__Impl_in_rule__MegaLLinking__Group__22801 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__3_in_rule__MegaLLinking__Group__22804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group_2__0_in_rule__MegaLLinking__Group__2__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__3__Impl_in_rule__MegaLLinking__Group__32862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__LdsAssignment_3_in_rule__MegaLLinking__Group__3__Impl2889 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group_2__0__Impl_in_rule__MegaLLinking__Group_2__02928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group_2__1_in_rule__MegaLLinking__Group_2__02931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MegaLLinking__Group_2__0__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group_2__1__Impl_in_rule__MegaLLinking__Group_2__12990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__TargetAssignment_2_1_in_rule__MegaLLinking__Group_2__1__Impl3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group__0__Impl_in_rule__LD__Group__03051 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__LD__Group__1_in_rule__LD__Group__03054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__TargetAssignment_0_in_rule__LD__Group__0__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group__1__Impl_in_rule__LD__Group__13111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LD__Group__2_in_rule__LD__Group__13114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LD__Group__1__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group__2__Impl_in_rule__LD__Group__23173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__ValueAssignment_2_in_rule__LD__Group__2__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__03236 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__03239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__13295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl3322 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__03357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__03360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__QualifiedID__Group_1__0__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__13419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MegaLDefinition__NameAssignment_13484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MegaLDefinition__LinkerAssignment_2_23519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__MegaLDefinition__ImportsAssignment_3_03554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_rule__MegaLDefinition__RdsAssignment_3_13585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_rule__MegaLDefinition__EtdsAssignment_3_23616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_rule__MegaLDefinition__RtdsAssignment_3_33647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDGroup_in_rule__MegaLDefinition__EdsAssignment_3_43678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Import__RefAssignment_13713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ETD__NameAssignment_13748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ETD__SupertypeAssignment_2_13783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RTD__NameAssignment_13818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RTD__DomainAssignment_33853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RTD__CoDomainAssignment_53892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EDGroup__TypeAssignment_03931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_rule__EDGroup__ItemsAssignment_23966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_rule__EDGroup__ItemsAssignment_3_13997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ED__NameAssignment4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RD__SourceAssignment_04063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RD__RelAssignment_14102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RD__TargetAssignment_24141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MegaLLinking__NameAssignment_14176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MegaLLinking__TargetAssignment_2_14211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLD_in_rule__MegaLLinking__LdsAssignment_34246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LD__TargetAssignment_04281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LD__ValueAssignment_24316 = new BitSet(new long[]{0x0000000000000002L});

}