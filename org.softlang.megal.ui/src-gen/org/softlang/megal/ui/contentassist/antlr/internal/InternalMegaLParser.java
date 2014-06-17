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


    // $ANTLR start "entryRuleETDR"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:116:1: entryRuleETDR : ruleETDR EOF ;
    public final void entryRuleETDR() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:117:1: ( ruleETDR EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:118:1: ruleETDR EOF
            {
             before(grammarAccess.getETDRRule()); 
            pushFollow(FOLLOW_ruleETDR_in_entryRuleETDR181);
            ruleETDR();

            state._fsp--;

             after(grammarAccess.getETDRRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDR188); 

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
    // $ANTLR end "entryRuleETDR"


    // $ANTLR start "ruleETDR"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:125:1: ruleETDR : ( ( rule__ETDR__Alternatives ) ) ;
    public final void ruleETDR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:129:2: ( ( ( rule__ETDR__Alternatives ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:130:1: ( ( rule__ETDR__Alternatives ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:130:1: ( ( rule__ETDR__Alternatives ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:131:1: ( rule__ETDR__Alternatives )
            {
             before(grammarAccess.getETDRAccess().getAlternatives()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:132:1: ( rule__ETDR__Alternatives )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:132:2: rule__ETDR__Alternatives
            {
            pushFollow(FOLLOW_rule__ETDR__Alternatives_in_ruleETDR214);
            rule__ETDR__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getETDRAccess().getAlternatives()); 

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
    // $ANTLR end "ruleETDR"


    // $ANTLR start "entryRuleETDEntity"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:144:1: entryRuleETDEntity : ruleETDEntity EOF ;
    public final void entryRuleETDEntity() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:145:1: ( ruleETDEntity EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:146:1: ruleETDEntity EOF
            {
             before(grammarAccess.getETDEntityRule()); 
            pushFollow(FOLLOW_ruleETDEntity_in_entryRuleETDEntity241);
            ruleETDEntity();

            state._fsp--;

             after(grammarAccess.getETDEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDEntity248); 

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
    // $ANTLR end "entryRuleETDEntity"


    // $ANTLR start "ruleETDEntity"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:153:1: ruleETDEntity : ( ( rule__ETDEntity__Group__0 ) ) ;
    public final void ruleETDEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:157:2: ( ( ( rule__ETDEntity__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:158:1: ( ( rule__ETDEntity__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:158:1: ( ( rule__ETDEntity__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:159:1: ( rule__ETDEntity__Group__0 )
            {
             before(grammarAccess.getETDEntityAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:160:1: ( rule__ETDEntity__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:160:2: rule__ETDEntity__Group__0
            {
            pushFollow(FOLLOW_rule__ETDEntity__Group__0_in_ruleETDEntity274);
            rule__ETDEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getETDEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleETDEntity"


    // $ANTLR start "entryRuleETDDeclared"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:172:1: entryRuleETDDeclared : ruleETDDeclared EOF ;
    public final void entryRuleETDDeclared() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:173:1: ( ruleETDDeclared EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:174:1: ruleETDDeclared EOF
            {
             before(grammarAccess.getETDDeclaredRule()); 
            pushFollow(FOLLOW_ruleETDDeclared_in_entryRuleETDDeclared301);
            ruleETDDeclared();

            state._fsp--;

             after(grammarAccess.getETDDeclaredRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDDeclared308); 

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
    // $ANTLR end "entryRuleETDDeclared"


    // $ANTLR start "ruleETDDeclared"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:181:1: ruleETDDeclared : ( ( rule__ETDDeclared__ReferenceAssignment ) ) ;
    public final void ruleETDDeclared() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:185:2: ( ( ( rule__ETDDeclared__ReferenceAssignment ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:186:1: ( ( rule__ETDDeclared__ReferenceAssignment ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:186:1: ( ( rule__ETDDeclared__ReferenceAssignment ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:187:1: ( rule__ETDDeclared__ReferenceAssignment )
            {
             before(grammarAccess.getETDDeclaredAccess().getReferenceAssignment()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:188:1: ( rule__ETDDeclared__ReferenceAssignment )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:188:2: rule__ETDDeclared__ReferenceAssignment
            {
            pushFollow(FOLLOW_rule__ETDDeclared__ReferenceAssignment_in_ruleETDDeclared334);
            rule__ETDDeclared__ReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getETDDeclaredAccess().getReferenceAssignment()); 

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
    // $ANTLR end "ruleETDDeclared"


    // $ANTLR start "entryRuleETD"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:200:1: entryRuleETD : ruleETD EOF ;
    public final void entryRuleETD() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:201:1: ( ruleETD EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:202:1: ruleETD EOF
            {
             before(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_ruleETD_in_entryRuleETD361);
            ruleETD();

            state._fsp--;

             after(grammarAccess.getETDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETD368); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:209:1: ruleETD : ( ( rule__ETD__Group__0 ) ) ;
    public final void ruleETD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:213:2: ( ( ( rule__ETD__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:214:1: ( ( rule__ETD__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:214:1: ( ( rule__ETD__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:215:1: ( rule__ETD__Group__0 )
            {
             before(grammarAccess.getETDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:216:1: ( rule__ETD__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:216:2: rule__ETD__Group__0
            {
            pushFollow(FOLLOW_rule__ETD__Group__0_in_ruleETD394);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:228:1: entryRuleRTD : ruleRTD EOF ;
    public final void entryRuleRTD() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:229:1: ( ruleRTD EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:230:1: ruleRTD EOF
            {
             before(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_ruleRTD_in_entryRuleRTD421);
            ruleRTD();

            state._fsp--;

             after(grammarAccess.getRTDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTD428); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:237:1: ruleRTD : ( ( rule__RTD__Group__0 ) ) ;
    public final void ruleRTD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:241:2: ( ( ( rule__RTD__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:242:1: ( ( rule__RTD__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:242:1: ( ( rule__RTD__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:243:1: ( rule__RTD__Group__0 )
            {
             before(grammarAccess.getRTDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:244:1: ( rule__RTD__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:244:2: rule__RTD__Group__0
            {
            pushFollow(FOLLOW_rule__RTD__Group__0_in_ruleRTD454);
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


    // $ANTLR start "entryRuleED"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:256:1: entryRuleED : ruleED EOF ;
    public final void entryRuleED() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:257:1: ( ruleED EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:258:1: ruleED EOF
            {
             before(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_ruleED_in_entryRuleED481);
            ruleED();

            state._fsp--;

             after(grammarAccess.getEDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleED488); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:265:1: ruleED : ( ( rule__ED__Group__0 ) ) ;
    public final void ruleED() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:269:2: ( ( ( rule__ED__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:270:1: ( ( rule__ED__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:270:1: ( ( rule__ED__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:271:1: ( rule__ED__Group__0 )
            {
             before(grammarAccess.getEDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:272:1: ( rule__ED__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:272:2: rule__ED__Group__0
            {
            pushFollow(FOLLOW_rule__ED__Group__0_in_ruleED514);
            rule__ED__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDAccess().getGroup()); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:284:1: entryRuleRD : ruleRD EOF ;
    public final void entryRuleRD() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:285:1: ( ruleRD EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:286:1: ruleRD EOF
            {
             before(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_ruleRD_in_entryRuleRD541);
            ruleRD();

            state._fsp--;

             after(grammarAccess.getRDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRD548); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:293:1: ruleRD : ( ( rule__RD__Group__0 ) ) ;
    public final void ruleRD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:297:2: ( ( ( rule__RD__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:298:1: ( ( rule__RD__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:298:1: ( ( rule__RD__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:299:1: ( rule__RD__Group__0 )
            {
             before(grammarAccess.getRDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:300:1: ( rule__RD__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:300:2: rule__RD__Group__0
            {
            pushFollow(FOLLOW_rule__RD__Group__0_in_ruleRD574);
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


    // $ANTLR start "entryRuleQualifiedID"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:312:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:313:1: ( ruleQualifiedID EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:314:1: ruleQualifiedID EOF
            {
             before(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID601);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getQualifiedIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedID608); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:321:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:325:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:326:1: ( ( rule__QualifiedID__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:326:1: ( ( rule__QualifiedID__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:327:1: ( rule__QualifiedID__Group__0 )
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:328:1: ( rule__QualifiedID__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:328:2: rule__QualifiedID__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID634);
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


    // $ANTLR start "entryRuleMegaLLinking"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:340:1: entryRuleMegaLLinking : ruleMegaLLinking EOF ;
    public final void entryRuleMegaLLinking() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:341:1: ( ruleMegaLLinking EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:342:1: ruleMegaLLinking EOF
            {
             before(grammarAccess.getMegaLLinkingRule()); 
            pushFollow(FOLLOW_ruleMegaLLinking_in_entryRuleMegaLLinking661);
            ruleMegaLLinking();

            state._fsp--;

             after(grammarAccess.getMegaLLinkingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMegaLLinking668); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:349:1: ruleMegaLLinking : ( ( rule__MegaLLinking__Group__0 ) ) ;
    public final void ruleMegaLLinking() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:353:2: ( ( ( rule__MegaLLinking__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:354:1: ( ( rule__MegaLLinking__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:354:1: ( ( rule__MegaLLinking__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:355:1: ( rule__MegaLLinking__Group__0 )
            {
             before(grammarAccess.getMegaLLinkingAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:356:1: ( rule__MegaLLinking__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:356:2: rule__MegaLLinking__Group__0
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__0_in_ruleMegaLLinking694);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:368:1: entryRuleLD : ruleLD EOF ;
    public final void entryRuleLD() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:369:1: ( ruleLD EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:370:1: ruleLD EOF
            {
             before(grammarAccess.getLDRule()); 
            pushFollow(FOLLOW_ruleLD_in_entryRuleLD721);
            ruleLD();

            state._fsp--;

             after(grammarAccess.getLDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLD728); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:377:1: ruleLD : ( ( rule__LD__Group__0 ) ) ;
    public final void ruleLD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:381:2: ( ( ( rule__LD__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:382:1: ( ( rule__LD__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:382:1: ( ( rule__LD__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:383:1: ( rule__LD__Group__0 )
            {
             before(grammarAccess.getLDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:384:1: ( rule__LD__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:384:2: rule__LD__Group__0
            {
            pushFollow(FOLLOW_rule__LD__Group__0_in_ruleLD754);
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


    // $ANTLR start "rule__Model__Alternatives"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:396:1: rule__Model__Alternatives : ( ( ruleMegaLDefinition ) | ( ruleMegaLLinking ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:400:1: ( ( ruleMegaLDefinition ) | ( ruleMegaLLinking ) )
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
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:401:1: ( ruleMegaLDefinition )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:401:1: ( ruleMegaLDefinition )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:402:1: ruleMegaLDefinition
                    {
                     before(grammarAccess.getModelAccess().getMegaLDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMegaLDefinition_in_rule__Model__Alternatives790);
                    ruleMegaLDefinition();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getMegaLDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:407:6: ( ruleMegaLLinking )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:407:6: ( ruleMegaLLinking )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:408:1: ruleMegaLLinking
                    {
                     before(grammarAccess.getModelAccess().getMegaLLinkingParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMegaLLinking_in_rule__Model__Alternatives807);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:418:1: rule__MegaLDefinition__Alternatives_3 : ( ( ( rule__MegaLDefinition__Group_3_0__0 ) ) | ( ( rule__MegaLDefinition__EtdAssignment_3_1 ) ) | ( ( rule__MegaLDefinition__RtdAssignment_3_2 ) ) | ( ( rule__MegaLDefinition__EdAssignment_3_3 ) ) | ( ( rule__MegaLDefinition__RdAssignment_3_4 ) ) );
    public final void rule__MegaLDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:422:1: ( ( ( rule__MegaLDefinition__Group_3_0__0 ) ) | ( ( rule__MegaLDefinition__EtdAssignment_3_1 ) ) | ( ( rule__MegaLDefinition__RtdAssignment_3_2 ) ) | ( ( rule__MegaLDefinition__EdAssignment_3_3 ) ) | ( ( rule__MegaLDefinition__RdAssignment_3_4 ) ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:423:1: ( ( rule__MegaLDefinition__Group_3_0__0 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:423:1: ( ( rule__MegaLDefinition__Group_3_0__0 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:424:1: ( rule__MegaLDefinition__Group_3_0__0 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getGroup_3_0()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:425:1: ( rule__MegaLDefinition__Group_3_0__0 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:425:2: rule__MegaLDefinition__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__Group_3_0__0_in_rule__MegaLDefinition__Alternatives_3839);
                    rule__MegaLDefinition__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:429:6: ( ( rule__MegaLDefinition__EtdAssignment_3_1 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:429:6: ( ( rule__MegaLDefinition__EtdAssignment_3_1 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:430:1: ( rule__MegaLDefinition__EtdAssignment_3_1 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getEtdAssignment_3_1()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:431:1: ( rule__MegaLDefinition__EtdAssignment_3_1 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:431:2: rule__MegaLDefinition__EtdAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__EtdAssignment_3_1_in_rule__MegaLDefinition__Alternatives_3857);
                    rule__MegaLDefinition__EtdAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getEtdAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:435:6: ( ( rule__MegaLDefinition__RtdAssignment_3_2 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:435:6: ( ( rule__MegaLDefinition__RtdAssignment_3_2 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:436:1: ( rule__MegaLDefinition__RtdAssignment_3_2 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getRtdAssignment_3_2()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:437:1: ( rule__MegaLDefinition__RtdAssignment_3_2 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:437:2: rule__MegaLDefinition__RtdAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__RtdAssignment_3_2_in_rule__MegaLDefinition__Alternatives_3875);
                    rule__MegaLDefinition__RtdAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getRtdAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:441:6: ( ( rule__MegaLDefinition__EdAssignment_3_3 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:441:6: ( ( rule__MegaLDefinition__EdAssignment_3_3 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:442:1: ( rule__MegaLDefinition__EdAssignment_3_3 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getEdAssignment_3_3()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:443:1: ( rule__MegaLDefinition__EdAssignment_3_3 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:443:2: rule__MegaLDefinition__EdAssignment_3_3
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__EdAssignment_3_3_in_rule__MegaLDefinition__Alternatives_3893);
                    rule__MegaLDefinition__EdAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getEdAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:447:6: ( ( rule__MegaLDefinition__RdAssignment_3_4 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:447:6: ( ( rule__MegaLDefinition__RdAssignment_3_4 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:448:1: ( rule__MegaLDefinition__RdAssignment_3_4 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getRdAssignment_3_4()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:449:1: ( rule__MegaLDefinition__RdAssignment_3_4 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:449:2: rule__MegaLDefinition__RdAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__RdAssignment_3_4_in_rule__MegaLDefinition__Alternatives_3911);
                    rule__MegaLDefinition__RdAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getRdAssignment_3_4()); 

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


    // $ANTLR start "rule__ETDR__Alternatives"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:458:1: rule__ETDR__Alternatives : ( ( ruleETDEntity ) | ( ruleETDDeclared ) );
    public final void rule__ETDR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:462:1: ( ( ruleETDEntity ) | ( ruleETDDeclared ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:463:1: ( ruleETDEntity )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:463:1: ( ruleETDEntity )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:464:1: ruleETDEntity
                    {
                     before(grammarAccess.getETDRAccess().getETDEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleETDEntity_in_rule__ETDR__Alternatives944);
                    ruleETDEntity();

                    state._fsp--;

                     after(grammarAccess.getETDRAccess().getETDEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:469:6: ( ruleETDDeclared )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:469:6: ( ruleETDDeclared )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:470:1: ruleETDDeclared
                    {
                     before(grammarAccess.getETDRAccess().getETDDeclaredParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleETDDeclared_in_rule__ETDR__Alternatives961);
                    ruleETDDeclared();

                    state._fsp--;

                     after(grammarAccess.getETDRAccess().getETDDeclaredParserRuleCall_1()); 

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
    // $ANTLR end "rule__ETDR__Alternatives"


    // $ANTLR start "rule__MegaLDefinition__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:482:1: rule__MegaLDefinition__Group__0 : rule__MegaLDefinition__Group__0__Impl rule__MegaLDefinition__Group__1 ;
    public final void rule__MegaLDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:486:1: ( rule__MegaLDefinition__Group__0__Impl rule__MegaLDefinition__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:487:2: rule__MegaLDefinition__Group__0__Impl rule__MegaLDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group__0__Impl_in_rule__MegaLDefinition__Group__0991);
            rule__MegaLDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group__1_in_rule__MegaLDefinition__Group__0994);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:494:1: rule__MegaLDefinition__Group__0__Impl : ( 'model' ) ;
    public final void rule__MegaLDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:498:1: ( ( 'model' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:499:1: ( 'model' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:499:1: ( 'model' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:500:1: 'model'
            {
             before(grammarAccess.getMegaLDefinitionAccess().getModelKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__MegaLDefinition__Group__0__Impl1022); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:513:1: rule__MegaLDefinition__Group__1 : rule__MegaLDefinition__Group__1__Impl rule__MegaLDefinition__Group__2 ;
    public final void rule__MegaLDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:517:1: ( rule__MegaLDefinition__Group__1__Impl rule__MegaLDefinition__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:518:2: rule__MegaLDefinition__Group__1__Impl rule__MegaLDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group__1__Impl_in_rule__MegaLDefinition__Group__11053);
            rule__MegaLDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group__2_in_rule__MegaLDefinition__Group__11056);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:525:1: rule__MegaLDefinition__Group__1__Impl : ( ( rule__MegaLDefinition__NameAssignment_1 ) ) ;
    public final void rule__MegaLDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:529:1: ( ( ( rule__MegaLDefinition__NameAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:530:1: ( ( rule__MegaLDefinition__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:530:1: ( ( rule__MegaLDefinition__NameAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:531:1: ( rule__MegaLDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getMegaLDefinitionAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:532:1: ( rule__MegaLDefinition__NameAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:532:2: rule__MegaLDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__NameAssignment_1_in_rule__MegaLDefinition__Group__1__Impl1083);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:542:1: rule__MegaLDefinition__Group__2 : rule__MegaLDefinition__Group__2__Impl rule__MegaLDefinition__Group__3 ;
    public final void rule__MegaLDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:546:1: ( rule__MegaLDefinition__Group__2__Impl rule__MegaLDefinition__Group__3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:547:2: rule__MegaLDefinition__Group__2__Impl rule__MegaLDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group__2__Impl_in_rule__MegaLDefinition__Group__21113);
            rule__MegaLDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group__3_in_rule__MegaLDefinition__Group__21116);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:554:1: rule__MegaLDefinition__Group__2__Impl : ( ( rule__MegaLDefinition__Group_2__0 )? ) ;
    public final void rule__MegaLDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:558:1: ( ( ( rule__MegaLDefinition__Group_2__0 )? ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:559:1: ( ( rule__MegaLDefinition__Group_2__0 )? )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:559:1: ( ( rule__MegaLDefinition__Group_2__0 )? )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:560:1: ( rule__MegaLDefinition__Group_2__0 )?
            {
             before(grammarAccess.getMegaLDefinitionAccess().getGroup_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:561:1: ( rule__MegaLDefinition__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:561:2: rule__MegaLDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__0_in_rule__MegaLDefinition__Group__2__Impl1143);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:571:1: rule__MegaLDefinition__Group__3 : rule__MegaLDefinition__Group__3__Impl ;
    public final void rule__MegaLDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:575:1: ( rule__MegaLDefinition__Group__3__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:576:2: rule__MegaLDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group__3__Impl_in_rule__MegaLDefinition__Group__31174);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:582:1: rule__MegaLDefinition__Group__3__Impl : ( ( rule__MegaLDefinition__Alternatives_3 )* ) ;
    public final void rule__MegaLDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:586:1: ( ( ( rule__MegaLDefinition__Alternatives_3 )* ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:587:1: ( ( rule__MegaLDefinition__Alternatives_3 )* )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:587:1: ( ( rule__MegaLDefinition__Alternatives_3 )* )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:588:1: ( rule__MegaLDefinition__Alternatives_3 )*
            {
             before(grammarAccess.getMegaLDefinitionAccess().getAlternatives_3()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:589:1: ( rule__MegaLDefinition__Alternatives_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:589:2: rule__MegaLDefinition__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__MegaLDefinition__Alternatives_3_in_rule__MegaLDefinition__Group__3__Impl1201);
            	    rule__MegaLDefinition__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:607:1: rule__MegaLDefinition__Group_2__0 : rule__MegaLDefinition__Group_2__0__Impl rule__MegaLDefinition__Group_2__1 ;
    public final void rule__MegaLDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:611:1: ( rule__MegaLDefinition__Group_2__0__Impl rule__MegaLDefinition__Group_2__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:612:2: rule__MegaLDefinition__Group_2__0__Impl rule__MegaLDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__0__Impl_in_rule__MegaLDefinition__Group_2__01240);
            rule__MegaLDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__1_in_rule__MegaLDefinition__Group_2__01243);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:619:1: rule__MegaLDefinition__Group_2__0__Impl : ( 'linked' ) ;
    public final void rule__MegaLDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:623:1: ( ( 'linked' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:624:1: ( 'linked' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:624:1: ( 'linked' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:625:1: 'linked'
            {
             before(grammarAccess.getMegaLDefinitionAccess().getLinkedKeyword_2_0()); 
            match(input,12,FOLLOW_12_in_rule__MegaLDefinition__Group_2__0__Impl1271); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:638:1: rule__MegaLDefinition__Group_2__1 : rule__MegaLDefinition__Group_2__1__Impl rule__MegaLDefinition__Group_2__2 ;
    public final void rule__MegaLDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:642:1: ( rule__MegaLDefinition__Group_2__1__Impl rule__MegaLDefinition__Group_2__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:643:2: rule__MegaLDefinition__Group_2__1__Impl rule__MegaLDefinition__Group_2__2
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__1__Impl_in_rule__MegaLDefinition__Group_2__11302);
            rule__MegaLDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__2_in_rule__MegaLDefinition__Group_2__11305);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:650:1: rule__MegaLDefinition__Group_2__1__Impl : ( 'in' ) ;
    public final void rule__MegaLDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:654:1: ( ( 'in' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:655:1: ( 'in' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:655:1: ( 'in' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:656:1: 'in'
            {
             before(grammarAccess.getMegaLDefinitionAccess().getInKeyword_2_1()); 
            match(input,13,FOLLOW_13_in_rule__MegaLDefinition__Group_2__1__Impl1333); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:669:1: rule__MegaLDefinition__Group_2__2 : rule__MegaLDefinition__Group_2__2__Impl ;
    public final void rule__MegaLDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:673:1: ( rule__MegaLDefinition__Group_2__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:674:2: rule__MegaLDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__2__Impl_in_rule__MegaLDefinition__Group_2__21364);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:680:1: rule__MegaLDefinition__Group_2__2__Impl : ( ( rule__MegaLDefinition__LinkerAssignment_2_2 ) ) ;
    public final void rule__MegaLDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:684:1: ( ( ( rule__MegaLDefinition__LinkerAssignment_2_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:685:1: ( ( rule__MegaLDefinition__LinkerAssignment_2_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:685:1: ( ( rule__MegaLDefinition__LinkerAssignment_2_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:686:1: ( rule__MegaLDefinition__LinkerAssignment_2_2 )
            {
             before(grammarAccess.getMegaLDefinitionAccess().getLinkerAssignment_2_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:687:1: ( rule__MegaLDefinition__LinkerAssignment_2_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:687:2: rule__MegaLDefinition__LinkerAssignment_2_2
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__LinkerAssignment_2_2_in_rule__MegaLDefinition__Group_2__2__Impl1391);
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


    // $ANTLR start "rule__MegaLDefinition__Group_3_0__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:703:1: rule__MegaLDefinition__Group_3_0__0 : rule__MegaLDefinition__Group_3_0__0__Impl rule__MegaLDefinition__Group_3_0__1 ;
    public final void rule__MegaLDefinition__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:707:1: ( rule__MegaLDefinition__Group_3_0__0__Impl rule__MegaLDefinition__Group_3_0__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:708:2: rule__MegaLDefinition__Group_3_0__0__Impl rule__MegaLDefinition__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group_3_0__0__Impl_in_rule__MegaLDefinition__Group_3_0__01427);
            rule__MegaLDefinition__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group_3_0__1_in_rule__MegaLDefinition__Group_3_0__01430);
            rule__MegaLDefinition__Group_3_0__1();

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
    // $ANTLR end "rule__MegaLDefinition__Group_3_0__0"


    // $ANTLR start "rule__MegaLDefinition__Group_3_0__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:715:1: rule__MegaLDefinition__Group_3_0__0__Impl : ( 'import' ) ;
    public final void rule__MegaLDefinition__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:719:1: ( ( 'import' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:720:1: ( 'import' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:720:1: ( 'import' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:721:1: 'import'
            {
             before(grammarAccess.getMegaLDefinitionAccess().getImportKeyword_3_0_0()); 
            match(input,14,FOLLOW_14_in_rule__MegaLDefinition__Group_3_0__0__Impl1458); 
             after(grammarAccess.getMegaLDefinitionAccess().getImportKeyword_3_0_0()); 

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
    // $ANTLR end "rule__MegaLDefinition__Group_3_0__0__Impl"


    // $ANTLR start "rule__MegaLDefinition__Group_3_0__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:734:1: rule__MegaLDefinition__Group_3_0__1 : rule__MegaLDefinition__Group_3_0__1__Impl ;
    public final void rule__MegaLDefinition__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:738:1: ( rule__MegaLDefinition__Group_3_0__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:739:2: rule__MegaLDefinition__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group_3_0__1__Impl_in_rule__MegaLDefinition__Group_3_0__11489);
            rule__MegaLDefinition__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__MegaLDefinition__Group_3_0__1"


    // $ANTLR start "rule__MegaLDefinition__Group_3_0__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:745:1: rule__MegaLDefinition__Group_3_0__1__Impl : ( ( rule__MegaLDefinition__ImportsAssignment_3_0_1 ) ) ;
    public final void rule__MegaLDefinition__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:749:1: ( ( ( rule__MegaLDefinition__ImportsAssignment_3_0_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:750:1: ( ( rule__MegaLDefinition__ImportsAssignment_3_0_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:750:1: ( ( rule__MegaLDefinition__ImportsAssignment_3_0_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:751:1: ( rule__MegaLDefinition__ImportsAssignment_3_0_1 )
            {
             before(grammarAccess.getMegaLDefinitionAccess().getImportsAssignment_3_0_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:752:1: ( rule__MegaLDefinition__ImportsAssignment_3_0_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:752:2: rule__MegaLDefinition__ImportsAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__ImportsAssignment_3_0_1_in_rule__MegaLDefinition__Group_3_0__1__Impl1516);
            rule__MegaLDefinition__ImportsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMegaLDefinitionAccess().getImportsAssignment_3_0_1()); 

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
    // $ANTLR end "rule__MegaLDefinition__Group_3_0__1__Impl"


    // $ANTLR start "rule__ETDEntity__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:766:1: rule__ETDEntity__Group__0 : rule__ETDEntity__Group__0__Impl rule__ETDEntity__Group__1 ;
    public final void rule__ETDEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:770:1: ( rule__ETDEntity__Group__0__Impl rule__ETDEntity__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:771:2: rule__ETDEntity__Group__0__Impl rule__ETDEntity__Group__1
            {
            pushFollow(FOLLOW_rule__ETDEntity__Group__0__Impl_in_rule__ETDEntity__Group__01550);
            rule__ETDEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETDEntity__Group__1_in_rule__ETDEntity__Group__01553);
            rule__ETDEntity__Group__1();

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
    // $ANTLR end "rule__ETDEntity__Group__0"


    // $ANTLR start "rule__ETDEntity__Group__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:778:1: rule__ETDEntity__Group__0__Impl : ( () ) ;
    public final void rule__ETDEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:782:1: ( ( () ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:783:1: ( () )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:783:1: ( () )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:784:1: ()
            {
             before(grammarAccess.getETDEntityAccess().getETDEntityAction_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:785:1: ()
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:787:1: 
            {
            }

             after(grammarAccess.getETDEntityAccess().getETDEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ETDEntity__Group__0__Impl"


    // $ANTLR start "rule__ETDEntity__Group__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:797:1: rule__ETDEntity__Group__1 : rule__ETDEntity__Group__1__Impl ;
    public final void rule__ETDEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:801:1: ( rule__ETDEntity__Group__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:802:2: rule__ETDEntity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ETDEntity__Group__1__Impl_in_rule__ETDEntity__Group__11611);
            rule__ETDEntity__Group__1__Impl();

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
    // $ANTLR end "rule__ETDEntity__Group__1"


    // $ANTLR start "rule__ETDEntity__Group__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:808:1: rule__ETDEntity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__ETDEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:812:1: ( ( 'Entity' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:813:1: ( 'Entity' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:813:1: ( 'Entity' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:814:1: 'Entity'
            {
             before(grammarAccess.getETDEntityAccess().getEntityKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__ETDEntity__Group__1__Impl1639); 
             after(grammarAccess.getETDEntityAccess().getEntityKeyword_1()); 

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
    // $ANTLR end "rule__ETDEntity__Group__1__Impl"


    // $ANTLR start "rule__ETD__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:831:1: rule__ETD__Group__0 : rule__ETD__Group__0__Impl rule__ETD__Group__1 ;
    public final void rule__ETD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:835:1: ( rule__ETD__Group__0__Impl rule__ETD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:836:2: rule__ETD__Group__0__Impl rule__ETD__Group__1
            {
            pushFollow(FOLLOW_rule__ETD__Group__0__Impl_in_rule__ETD__Group__01674);
            rule__ETD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__1_in_rule__ETD__Group__01677);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:843:1: rule__ETD__Group__0__Impl : ( ( rule__ETD__NameAssignment_0 ) ) ;
    public final void rule__ETD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:847:1: ( ( ( rule__ETD__NameAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:848:1: ( ( rule__ETD__NameAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:848:1: ( ( rule__ETD__NameAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:849:1: ( rule__ETD__NameAssignment_0 )
            {
             before(grammarAccess.getETDAccess().getNameAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:850:1: ( rule__ETD__NameAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:850:2: rule__ETD__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ETD__NameAssignment_0_in_rule__ETD__Group__0__Impl1704);
            rule__ETD__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getNameAssignment_0()); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:860:1: rule__ETD__Group__1 : rule__ETD__Group__1__Impl rule__ETD__Group__2 ;
    public final void rule__ETD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:864:1: ( rule__ETD__Group__1__Impl rule__ETD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:865:2: rule__ETD__Group__1__Impl rule__ETD__Group__2
            {
            pushFollow(FOLLOW_rule__ETD__Group__1__Impl_in_rule__ETD__Group__11734);
            rule__ETD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__2_in_rule__ETD__Group__11737);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:872:1: rule__ETD__Group__1__Impl : ( '<' ) ;
    public final void rule__ETD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:876:1: ( ( '<' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:877:1: ( '<' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:877:1: ( '<' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:878:1: '<'
            {
             before(grammarAccess.getETDAccess().getLessThanSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__ETD__Group__1__Impl1765); 
             after(grammarAccess.getETDAccess().getLessThanSignKeyword_1()); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:891:1: rule__ETD__Group__2 : rule__ETD__Group__2__Impl ;
    public final void rule__ETD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:895:1: ( rule__ETD__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:896:2: rule__ETD__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ETD__Group__2__Impl_in_rule__ETD__Group__21796);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:902:1: rule__ETD__Group__2__Impl : ( ( rule__ETD__SupertypeAssignment_2 ) ) ;
    public final void rule__ETD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:906:1: ( ( ( rule__ETD__SupertypeAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:907:1: ( ( rule__ETD__SupertypeAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:907:1: ( ( rule__ETD__SupertypeAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:908:1: ( rule__ETD__SupertypeAssignment_2 )
            {
             before(grammarAccess.getETDAccess().getSupertypeAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:909:1: ( rule__ETD__SupertypeAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:909:2: rule__ETD__SupertypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ETD__SupertypeAssignment_2_in_rule__ETD__Group__2__Impl1823);
            rule__ETD__SupertypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getSupertypeAssignment_2()); 

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


    // $ANTLR start "rule__RTD__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:925:1: rule__RTD__Group__0 : rule__RTD__Group__0__Impl rule__RTD__Group__1 ;
    public final void rule__RTD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:929:1: ( rule__RTD__Group__0__Impl rule__RTD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:930:2: rule__RTD__Group__0__Impl rule__RTD__Group__1
            {
            pushFollow(FOLLOW_rule__RTD__Group__0__Impl_in_rule__RTD__Group__01859);
            rule__RTD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__1_in_rule__RTD__Group__01862);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:937:1: rule__RTD__Group__0__Impl : ( ( rule__RTD__NameAssignment_0 ) ) ;
    public final void rule__RTD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:941:1: ( ( ( rule__RTD__NameAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:942:1: ( ( rule__RTD__NameAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:942:1: ( ( rule__RTD__NameAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:943:1: ( rule__RTD__NameAssignment_0 )
            {
             before(grammarAccess.getRTDAccess().getNameAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:944:1: ( rule__RTD__NameAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:944:2: rule__RTD__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__RTD__NameAssignment_0_in_rule__RTD__Group__0__Impl1889);
            rule__RTD__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getNameAssignment_0()); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:954:1: rule__RTD__Group__1 : rule__RTD__Group__1__Impl rule__RTD__Group__2 ;
    public final void rule__RTD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:958:1: ( rule__RTD__Group__1__Impl rule__RTD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:959:2: rule__RTD__Group__1__Impl rule__RTD__Group__2
            {
            pushFollow(FOLLOW_rule__RTD__Group__1__Impl_in_rule__RTD__Group__11919);
            rule__RTD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__2_in_rule__RTD__Group__11922);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:966:1: rule__RTD__Group__1__Impl : ( '<' ) ;
    public final void rule__RTD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:970:1: ( ( '<' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:971:1: ( '<' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:971:1: ( '<' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:972:1: '<'
            {
             before(grammarAccess.getRTDAccess().getLessThanSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__RTD__Group__1__Impl1950); 
             after(grammarAccess.getRTDAccess().getLessThanSignKeyword_1()); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:985:1: rule__RTD__Group__2 : rule__RTD__Group__2__Impl rule__RTD__Group__3 ;
    public final void rule__RTD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:989:1: ( rule__RTD__Group__2__Impl rule__RTD__Group__3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:990:2: rule__RTD__Group__2__Impl rule__RTD__Group__3
            {
            pushFollow(FOLLOW_rule__RTD__Group__2__Impl_in_rule__RTD__Group__21981);
            rule__RTD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__3_in_rule__RTD__Group__21984);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:997:1: rule__RTD__Group__2__Impl : ( ( rule__RTD__DomainAssignment_2 ) ) ;
    public final void rule__RTD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1001:1: ( ( ( rule__RTD__DomainAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1002:1: ( ( rule__RTD__DomainAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1002:1: ( ( rule__RTD__DomainAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1003:1: ( rule__RTD__DomainAssignment_2 )
            {
             before(grammarAccess.getRTDAccess().getDomainAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1004:1: ( rule__RTD__DomainAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1004:2: rule__RTD__DomainAssignment_2
            {
            pushFollow(FOLLOW_rule__RTD__DomainAssignment_2_in_rule__RTD__Group__2__Impl2011);
            rule__RTD__DomainAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getDomainAssignment_2()); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1014:1: rule__RTD__Group__3 : rule__RTD__Group__3__Impl rule__RTD__Group__4 ;
    public final void rule__RTD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1018:1: ( rule__RTD__Group__3__Impl rule__RTD__Group__4 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1019:2: rule__RTD__Group__3__Impl rule__RTD__Group__4
            {
            pushFollow(FOLLOW_rule__RTD__Group__3__Impl_in_rule__RTD__Group__32041);
            rule__RTD__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__4_in_rule__RTD__Group__32044);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1026:1: rule__RTD__Group__3__Impl : ( '*' ) ;
    public final void rule__RTD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1030:1: ( ( '*' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1031:1: ( '*' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1031:1: ( '*' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1032:1: '*'
            {
             before(grammarAccess.getRTDAccess().getAsteriskKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__RTD__Group__3__Impl2072); 
             after(grammarAccess.getRTDAccess().getAsteriskKeyword_3()); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1045:1: rule__RTD__Group__4 : rule__RTD__Group__4__Impl ;
    public final void rule__RTD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1049:1: ( rule__RTD__Group__4__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1050:2: rule__RTD__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RTD__Group__4__Impl_in_rule__RTD__Group__42103);
            rule__RTD__Group__4__Impl();

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1056:1: rule__RTD__Group__4__Impl : ( ( rule__RTD__CoDomainAssignment_4 ) ) ;
    public final void rule__RTD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1060:1: ( ( ( rule__RTD__CoDomainAssignment_4 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1061:1: ( ( rule__RTD__CoDomainAssignment_4 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1061:1: ( ( rule__RTD__CoDomainAssignment_4 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1062:1: ( rule__RTD__CoDomainAssignment_4 )
            {
             before(grammarAccess.getRTDAccess().getCoDomainAssignment_4()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1063:1: ( rule__RTD__CoDomainAssignment_4 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1063:2: rule__RTD__CoDomainAssignment_4
            {
            pushFollow(FOLLOW_rule__RTD__CoDomainAssignment_4_in_rule__RTD__Group__4__Impl2130);
            rule__RTD__CoDomainAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getCoDomainAssignment_4()); 

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


    // $ANTLR start "rule__ED__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1083:1: rule__ED__Group__0 : rule__ED__Group__0__Impl rule__ED__Group__1 ;
    public final void rule__ED__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1087:1: ( rule__ED__Group__0__Impl rule__ED__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1088:2: rule__ED__Group__0__Impl rule__ED__Group__1
            {
            pushFollow(FOLLOW_rule__ED__Group__0__Impl_in_rule__ED__Group__02170);
            rule__ED__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group__1_in_rule__ED__Group__02173);
            rule__ED__Group__1();

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
    // $ANTLR end "rule__ED__Group__0"


    // $ANTLR start "rule__ED__Group__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1095:1: rule__ED__Group__0__Impl : ( ( rule__ED__NameAssignment_0 ) ) ;
    public final void rule__ED__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1099:1: ( ( ( rule__ED__NameAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1100:1: ( ( rule__ED__NameAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1100:1: ( ( rule__ED__NameAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1101:1: ( rule__ED__NameAssignment_0 )
            {
             before(grammarAccess.getEDAccess().getNameAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1102:1: ( rule__ED__NameAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1102:2: rule__ED__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ED__NameAssignment_0_in_rule__ED__Group__0__Impl2200);
            rule__ED__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEDAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ED__Group__0__Impl"


    // $ANTLR start "rule__ED__Group__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1112:1: rule__ED__Group__1 : rule__ED__Group__1__Impl rule__ED__Group__2 ;
    public final void rule__ED__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1116:1: ( rule__ED__Group__1__Impl rule__ED__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1117:2: rule__ED__Group__1__Impl rule__ED__Group__2
            {
            pushFollow(FOLLOW_rule__ED__Group__1__Impl_in_rule__ED__Group__12230);
            rule__ED__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group__2_in_rule__ED__Group__12233);
            rule__ED__Group__2();

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
    // $ANTLR end "rule__ED__Group__1"


    // $ANTLR start "rule__ED__Group__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1124:1: rule__ED__Group__1__Impl : ( ':' ) ;
    public final void rule__ED__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1128:1: ( ( ':' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1129:1: ( ':' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1129:1: ( ':' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1130:1: ':'
            {
             before(grammarAccess.getEDAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__ED__Group__1__Impl2261); 
             after(grammarAccess.getEDAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ED__Group__1__Impl"


    // $ANTLR start "rule__ED__Group__2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1143:1: rule__ED__Group__2 : rule__ED__Group__2__Impl ;
    public final void rule__ED__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1147:1: ( rule__ED__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1148:2: rule__ED__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ED__Group__2__Impl_in_rule__ED__Group__22292);
            rule__ED__Group__2__Impl();

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
    // $ANTLR end "rule__ED__Group__2"


    // $ANTLR start "rule__ED__Group__2__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1154:1: rule__ED__Group__2__Impl : ( ( rule__ED__TypeAssignment_2 ) ) ;
    public final void rule__ED__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1158:1: ( ( ( rule__ED__TypeAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1159:1: ( ( rule__ED__TypeAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1159:1: ( ( rule__ED__TypeAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1160:1: ( rule__ED__TypeAssignment_2 )
            {
             before(grammarAccess.getEDAccess().getTypeAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1161:1: ( rule__ED__TypeAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1161:2: rule__ED__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ED__TypeAssignment_2_in_rule__ED__Group__2__Impl2319);
            rule__ED__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEDAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__ED__Group__2__Impl"


    // $ANTLR start "rule__RD__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1177:1: rule__RD__Group__0 : rule__RD__Group__0__Impl rule__RD__Group__1 ;
    public final void rule__RD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1181:1: ( rule__RD__Group__0__Impl rule__RD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1182:2: rule__RD__Group__0__Impl rule__RD__Group__1
            {
            pushFollow(FOLLOW_rule__RD__Group__0__Impl_in_rule__RD__Group__02355);
            rule__RD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__1_in_rule__RD__Group__02358);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1189:1: rule__RD__Group__0__Impl : ( ( rule__RD__SourceAssignment_0 ) ) ;
    public final void rule__RD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1193:1: ( ( ( rule__RD__SourceAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1194:1: ( ( rule__RD__SourceAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1194:1: ( ( rule__RD__SourceAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1195:1: ( rule__RD__SourceAssignment_0 )
            {
             before(grammarAccess.getRDAccess().getSourceAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1196:1: ( rule__RD__SourceAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1196:2: rule__RD__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__RD__SourceAssignment_0_in_rule__RD__Group__0__Impl2385);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1206:1: rule__RD__Group__1 : rule__RD__Group__1__Impl rule__RD__Group__2 ;
    public final void rule__RD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1210:1: ( rule__RD__Group__1__Impl rule__RD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1211:2: rule__RD__Group__1__Impl rule__RD__Group__2
            {
            pushFollow(FOLLOW_rule__RD__Group__1__Impl_in_rule__RD__Group__12415);
            rule__RD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__2_in_rule__RD__Group__12418);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1218:1: rule__RD__Group__1__Impl : ( ( rule__RD__RelAssignment_1 ) ) ;
    public final void rule__RD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1222:1: ( ( ( rule__RD__RelAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1223:1: ( ( rule__RD__RelAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1223:1: ( ( rule__RD__RelAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1224:1: ( rule__RD__RelAssignment_1 )
            {
             before(grammarAccess.getRDAccess().getRelAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1225:1: ( rule__RD__RelAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1225:2: rule__RD__RelAssignment_1
            {
            pushFollow(FOLLOW_rule__RD__RelAssignment_1_in_rule__RD__Group__1__Impl2445);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1235:1: rule__RD__Group__2 : rule__RD__Group__2__Impl ;
    public final void rule__RD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1239:1: ( rule__RD__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1240:2: rule__RD__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RD__Group__2__Impl_in_rule__RD__Group__22475);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1246:1: rule__RD__Group__2__Impl : ( ( rule__RD__TargetAssignment_2 ) ) ;
    public final void rule__RD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1250:1: ( ( ( rule__RD__TargetAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1251:1: ( ( rule__RD__TargetAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1251:1: ( ( rule__RD__TargetAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1252:1: ( rule__RD__TargetAssignment_2 )
            {
             before(grammarAccess.getRDAccess().getTargetAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1253:1: ( rule__RD__TargetAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1253:2: rule__RD__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__RD__TargetAssignment_2_in_rule__RD__Group__2__Impl2502);
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


    // $ANTLR start "rule__QualifiedID__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1269:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1273:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1274:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__02538);
            rule__QualifiedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__02541);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1281:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1285:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1286:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1286:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1287:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl2568); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1298:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1302:1: ( rule__QualifiedID__Group__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1303:2: rule__QualifiedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__12597);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1309:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1313:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1314:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1314:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1315:1: ( rule__QualifiedID__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1316:1: ( rule__QualifiedID__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1316:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl2624);
            	    rule__QualifiedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1330:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1334:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1335:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__02659);
            rule__QualifiedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__02662);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1342:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1346:1: ( ( '.' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1347:1: ( '.' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1347:1: ( '.' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1348:1: '.'
            {
             before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__QualifiedID__Group_1__0__Impl2690); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1361:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1365:1: ( rule__QualifiedID__Group_1__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1366:2: rule__QualifiedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__12721);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1372:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1376:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1377:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1377:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1378:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl2748); 
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


    // $ANTLR start "rule__MegaLLinking__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1393:1: rule__MegaLLinking__Group__0 : rule__MegaLLinking__Group__0__Impl rule__MegaLLinking__Group__1 ;
    public final void rule__MegaLLinking__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1397:1: ( rule__MegaLLinking__Group__0__Impl rule__MegaLLinking__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1398:2: rule__MegaLLinking__Group__0__Impl rule__MegaLLinking__Group__1
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__0__Impl_in_rule__MegaLLinking__Group__02781);
            rule__MegaLLinking__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLLinking__Group__1_in_rule__MegaLLinking__Group__02784);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1405:1: rule__MegaLLinking__Group__0__Impl : ( 'linking' ) ;
    public final void rule__MegaLLinking__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1409:1: ( ( 'linking' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1410:1: ( 'linking' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1410:1: ( 'linking' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1411:1: 'linking'
            {
             before(grammarAccess.getMegaLLinkingAccess().getLinkingKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__MegaLLinking__Group__0__Impl2812); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1424:1: rule__MegaLLinking__Group__1 : rule__MegaLLinking__Group__1__Impl rule__MegaLLinking__Group__2 ;
    public final void rule__MegaLLinking__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1428:1: ( rule__MegaLLinking__Group__1__Impl rule__MegaLLinking__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1429:2: rule__MegaLLinking__Group__1__Impl rule__MegaLLinking__Group__2
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__1__Impl_in_rule__MegaLLinking__Group__12843);
            rule__MegaLLinking__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLLinking__Group__2_in_rule__MegaLLinking__Group__12846);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1436:1: rule__MegaLLinking__Group__1__Impl : ( ( rule__MegaLLinking__NameAssignment_1 ) ) ;
    public final void rule__MegaLLinking__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1440:1: ( ( ( rule__MegaLLinking__NameAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1441:1: ( ( rule__MegaLLinking__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1441:1: ( ( rule__MegaLLinking__NameAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1442:1: ( rule__MegaLLinking__NameAssignment_1 )
            {
             before(grammarAccess.getMegaLLinkingAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1443:1: ( rule__MegaLLinking__NameAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1443:2: rule__MegaLLinking__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MegaLLinking__NameAssignment_1_in_rule__MegaLLinking__Group__1__Impl2873);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1453:1: rule__MegaLLinking__Group__2 : rule__MegaLLinking__Group__2__Impl rule__MegaLLinking__Group__3 ;
    public final void rule__MegaLLinking__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1457:1: ( rule__MegaLLinking__Group__2__Impl rule__MegaLLinking__Group__3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1458:2: rule__MegaLLinking__Group__2__Impl rule__MegaLLinking__Group__3
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__2__Impl_in_rule__MegaLLinking__Group__22903);
            rule__MegaLLinking__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLLinking__Group__3_in_rule__MegaLLinking__Group__22906);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1465:1: rule__MegaLLinking__Group__2__Impl : ( ( rule__MegaLLinking__Group_2__0 )? ) ;
    public final void rule__MegaLLinking__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1469:1: ( ( ( rule__MegaLLinking__Group_2__0 )? ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1470:1: ( ( rule__MegaLLinking__Group_2__0 )? )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1470:1: ( ( rule__MegaLLinking__Group_2__0 )? )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1471:1: ( rule__MegaLLinking__Group_2__0 )?
            {
             before(grammarAccess.getMegaLLinkingAccess().getGroup_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1472:1: ( rule__MegaLLinking__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1472:2: rule__MegaLLinking__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MegaLLinking__Group_2__0_in_rule__MegaLLinking__Group__2__Impl2933);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1482:1: rule__MegaLLinking__Group__3 : rule__MegaLLinking__Group__3__Impl ;
    public final void rule__MegaLLinking__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1486:1: ( rule__MegaLLinking__Group__3__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1487:2: rule__MegaLLinking__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__3__Impl_in_rule__MegaLLinking__Group__32964);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1493:1: rule__MegaLLinking__Group__3__Impl : ( ( rule__MegaLLinking__LinksAssignment_3 )* ) ;
    public final void rule__MegaLLinking__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1497:1: ( ( ( rule__MegaLLinking__LinksAssignment_3 )* ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1498:1: ( ( rule__MegaLLinking__LinksAssignment_3 )* )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1498:1: ( ( rule__MegaLLinking__LinksAssignment_3 )* )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1499:1: ( rule__MegaLLinking__LinksAssignment_3 )*
            {
             before(grammarAccess.getMegaLLinkingAccess().getLinksAssignment_3()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1500:1: ( rule__MegaLLinking__LinksAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1500:2: rule__MegaLLinking__LinksAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__MegaLLinking__LinksAssignment_3_in_rule__MegaLLinking__Group__3__Impl2991);
            	    rule__MegaLLinking__LinksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMegaLLinkingAccess().getLinksAssignment_3()); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1518:1: rule__MegaLLinking__Group_2__0 : rule__MegaLLinking__Group_2__0__Impl rule__MegaLLinking__Group_2__1 ;
    public final void rule__MegaLLinking__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1522:1: ( rule__MegaLLinking__Group_2__0__Impl rule__MegaLLinking__Group_2__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1523:2: rule__MegaLLinking__Group_2__0__Impl rule__MegaLLinking__Group_2__1
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group_2__0__Impl_in_rule__MegaLLinking__Group_2__03030);
            rule__MegaLLinking__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLLinking__Group_2__1_in_rule__MegaLLinking__Group_2__03033);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1530:1: rule__MegaLLinking__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__MegaLLinking__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1534:1: ( ( 'for' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1535:1: ( 'for' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1535:1: ( 'for' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1536:1: 'for'
            {
             before(grammarAccess.getMegaLLinkingAccess().getForKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__MegaLLinking__Group_2__0__Impl3061); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1549:1: rule__MegaLLinking__Group_2__1 : rule__MegaLLinking__Group_2__1__Impl ;
    public final void rule__MegaLLinking__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1553:1: ( rule__MegaLLinking__Group_2__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1554:2: rule__MegaLLinking__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group_2__1__Impl_in_rule__MegaLLinking__Group_2__13092);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1560:1: rule__MegaLLinking__Group_2__1__Impl : ( ( rule__MegaLLinking__TargetAssignment_2_1 ) ) ;
    public final void rule__MegaLLinking__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1564:1: ( ( ( rule__MegaLLinking__TargetAssignment_2_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1565:1: ( ( rule__MegaLLinking__TargetAssignment_2_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1565:1: ( ( rule__MegaLLinking__TargetAssignment_2_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1566:1: ( rule__MegaLLinking__TargetAssignment_2_1 )
            {
             before(grammarAccess.getMegaLLinkingAccess().getTargetAssignment_2_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1567:1: ( rule__MegaLLinking__TargetAssignment_2_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1567:2: rule__MegaLLinking__TargetAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MegaLLinking__TargetAssignment_2_1_in_rule__MegaLLinking__Group_2__1__Impl3119);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1581:1: rule__LD__Group__0 : rule__LD__Group__0__Impl rule__LD__Group__1 ;
    public final void rule__LD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1585:1: ( rule__LD__Group__0__Impl rule__LD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1586:2: rule__LD__Group__0__Impl rule__LD__Group__1
            {
            pushFollow(FOLLOW_rule__LD__Group__0__Impl_in_rule__LD__Group__03153);
            rule__LD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LD__Group__1_in_rule__LD__Group__03156);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1593:1: rule__LD__Group__0__Impl : ( ( rule__LD__TargetAssignment_0 ) ) ;
    public final void rule__LD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1597:1: ( ( ( rule__LD__TargetAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1598:1: ( ( rule__LD__TargetAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1598:1: ( ( rule__LD__TargetAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1599:1: ( rule__LD__TargetAssignment_0 )
            {
             before(grammarAccess.getLDAccess().getTargetAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1600:1: ( rule__LD__TargetAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1600:2: rule__LD__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__LD__TargetAssignment_0_in_rule__LD__Group__0__Impl3183);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1610:1: rule__LD__Group__1 : rule__LD__Group__1__Impl rule__LD__Group__2 ;
    public final void rule__LD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1614:1: ( rule__LD__Group__1__Impl rule__LD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1615:2: rule__LD__Group__1__Impl rule__LD__Group__2
            {
            pushFollow(FOLLOW_rule__LD__Group__1__Impl_in_rule__LD__Group__13213);
            rule__LD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LD__Group__2_in_rule__LD__Group__13216);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1622:1: rule__LD__Group__1__Impl : ( ( rule__LD__Group_1__0 )? ) ;
    public final void rule__LD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1626:1: ( ( ( rule__LD__Group_1__0 )? ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1627:1: ( ( rule__LD__Group_1__0 )? )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1627:1: ( ( rule__LD__Group_1__0 )? )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1628:1: ( rule__LD__Group_1__0 )?
            {
             before(grammarAccess.getLDAccess().getGroup_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1629:1: ( rule__LD__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1629:2: rule__LD__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LD__Group_1__0_in_rule__LD__Group__1__Impl3243);
                    rule__LD__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLDAccess().getGroup_1()); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1639:1: rule__LD__Group__2 : rule__LD__Group__2__Impl rule__LD__Group__3 ;
    public final void rule__LD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1643:1: ( rule__LD__Group__2__Impl rule__LD__Group__3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1644:2: rule__LD__Group__2__Impl rule__LD__Group__3
            {
            pushFollow(FOLLOW_rule__LD__Group__2__Impl_in_rule__LD__Group__23274);
            rule__LD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LD__Group__3_in_rule__LD__Group__23277);
            rule__LD__Group__3();

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1651:1: rule__LD__Group__2__Impl : ( '=' ) ;
    public final void rule__LD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1655:1: ( ( '=' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1656:1: ( '=' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1656:1: ( '=' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1657:1: '='
            {
             before(grammarAccess.getLDAccess().getEqualsSignKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__LD__Group__2__Impl3305); 
             after(grammarAccess.getLDAccess().getEqualsSignKeyword_2()); 

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


    // $ANTLR start "rule__LD__Group__3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1670:1: rule__LD__Group__3 : rule__LD__Group__3__Impl ;
    public final void rule__LD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1674:1: ( rule__LD__Group__3__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1675:2: rule__LD__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LD__Group__3__Impl_in_rule__LD__Group__33336);
            rule__LD__Group__3__Impl();

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
    // $ANTLR end "rule__LD__Group__3"


    // $ANTLR start "rule__LD__Group__3__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1681:1: rule__LD__Group__3__Impl : ( ( rule__LD__ValueAssignment_3 ) ) ;
    public final void rule__LD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1685:1: ( ( ( rule__LD__ValueAssignment_3 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1686:1: ( ( rule__LD__ValueAssignment_3 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1686:1: ( ( rule__LD__ValueAssignment_3 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1687:1: ( rule__LD__ValueAssignment_3 )
            {
             before(grammarAccess.getLDAccess().getValueAssignment_3()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1688:1: ( rule__LD__ValueAssignment_3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1688:2: rule__LD__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__LD__ValueAssignment_3_in_rule__LD__Group__3__Impl3363);
            rule__LD__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLDAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__LD__Group__3__Impl"


    // $ANTLR start "rule__LD__Group_1__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1706:1: rule__LD__Group_1__0 : rule__LD__Group_1__0__Impl rule__LD__Group_1__1 ;
    public final void rule__LD__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1710:1: ( rule__LD__Group_1__0__Impl rule__LD__Group_1__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1711:2: rule__LD__Group_1__0__Impl rule__LD__Group_1__1
            {
            pushFollow(FOLLOW_rule__LD__Group_1__0__Impl_in_rule__LD__Group_1__03401);
            rule__LD__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LD__Group_1__1_in_rule__LD__Group_1__03404);
            rule__LD__Group_1__1();

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
    // $ANTLR end "rule__LD__Group_1__0"


    // $ANTLR start "rule__LD__Group_1__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1718:1: rule__LD__Group_1__0__Impl : ( '.' ) ;
    public final void rule__LD__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1722:1: ( ( '.' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1723:1: ( '.' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1723:1: ( '.' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1724:1: '.'
            {
             before(grammarAccess.getLDAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__LD__Group_1__0__Impl3432); 
             after(grammarAccess.getLDAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__LD__Group_1__0__Impl"


    // $ANTLR start "rule__LD__Group_1__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1737:1: rule__LD__Group_1__1 : rule__LD__Group_1__1__Impl ;
    public final void rule__LD__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1741:1: ( rule__LD__Group_1__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1742:2: rule__LD__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LD__Group_1__1__Impl_in_rule__LD__Group_1__13463);
            rule__LD__Group_1__1__Impl();

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
    // $ANTLR end "rule__LD__Group_1__1"


    // $ANTLR start "rule__LD__Group_1__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1748:1: rule__LD__Group_1__1__Impl : ( ( rule__LD__KeyAssignment_1_1 ) ) ;
    public final void rule__LD__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1752:1: ( ( ( rule__LD__KeyAssignment_1_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1753:1: ( ( rule__LD__KeyAssignment_1_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1753:1: ( ( rule__LD__KeyAssignment_1_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1754:1: ( rule__LD__KeyAssignment_1_1 )
            {
             before(grammarAccess.getLDAccess().getKeyAssignment_1_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1755:1: ( rule__LD__KeyAssignment_1_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1755:2: rule__LD__KeyAssignment_1_1
            {
            pushFollow(FOLLOW_rule__LD__KeyAssignment_1_1_in_rule__LD__Group_1__1__Impl3490);
            rule__LD__KeyAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLDAccess().getKeyAssignment_1_1()); 

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
    // $ANTLR end "rule__LD__Group_1__1__Impl"


    // $ANTLR start "rule__MegaLDefinition__NameAssignment_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1770:1: rule__MegaLDefinition__NameAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__MegaLDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1774:1: ( ( ruleQualifiedID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1775:1: ( ruleQualifiedID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1775:1: ( ruleQualifiedID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1776:1: ruleQualifiedID
            {
             before(grammarAccess.getMegaLDefinitionAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__MegaLDefinition__NameAssignment_13529);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1785:1: rule__MegaLDefinition__LinkerAssignment_2_2 : ( ( ruleQualifiedID ) ) ;
    public final void rule__MegaLDefinition__LinkerAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1789:1: ( ( ( ruleQualifiedID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1790:1: ( ( ruleQualifiedID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1790:1: ( ( ruleQualifiedID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1791:1: ( ruleQualifiedID )
            {
             before(grammarAccess.getMegaLDefinitionAccess().getLinkerMegaLLinkingCrossReference_2_2_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1792:1: ( ruleQualifiedID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1793:1: ruleQualifiedID
            {
             before(grammarAccess.getMegaLDefinitionAccess().getLinkerMegaLLinkingQualifiedIDParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__MegaLDefinition__LinkerAssignment_2_23564);
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


    // $ANTLR start "rule__MegaLDefinition__ImportsAssignment_3_0_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1804:1: rule__MegaLDefinition__ImportsAssignment_3_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegaLDefinition__ImportsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1808:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1809:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1809:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1810:1: ( RULE_ID )
            {
             before(grammarAccess.getMegaLDefinitionAccess().getImportsMegaLDefinitionCrossReference_3_0_1_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1811:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1812:1: RULE_ID
            {
             before(grammarAccess.getMegaLDefinitionAccess().getImportsMegaLDefinitionIDTerminalRuleCall_3_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MegaLDefinition__ImportsAssignment_3_0_13603); 
             after(grammarAccess.getMegaLDefinitionAccess().getImportsMegaLDefinitionIDTerminalRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getMegaLDefinitionAccess().getImportsMegaLDefinitionCrossReference_3_0_1_0()); 

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
    // $ANTLR end "rule__MegaLDefinition__ImportsAssignment_3_0_1"


    // $ANTLR start "rule__MegaLDefinition__EtdAssignment_3_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1823:1: rule__MegaLDefinition__EtdAssignment_3_1 : ( ruleETD ) ;
    public final void rule__MegaLDefinition__EtdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1827:1: ( ( ruleETD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1828:1: ( ruleETD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1828:1: ( ruleETD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1829:1: ruleETD
            {
             before(grammarAccess.getMegaLDefinitionAccess().getEtdETDParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleETD_in_rule__MegaLDefinition__EtdAssignment_3_13638);
            ruleETD();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getEtdETDParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__MegaLDefinition__EtdAssignment_3_1"


    // $ANTLR start "rule__MegaLDefinition__RtdAssignment_3_2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1838:1: rule__MegaLDefinition__RtdAssignment_3_2 : ( ruleRTD ) ;
    public final void rule__MegaLDefinition__RtdAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1842:1: ( ( ruleRTD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1843:1: ( ruleRTD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1843:1: ( ruleRTD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1844:1: ruleRTD
            {
             before(grammarAccess.getMegaLDefinitionAccess().getRtdRTDParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleRTD_in_rule__MegaLDefinition__RtdAssignment_3_23669);
            ruleRTD();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getRtdRTDParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__MegaLDefinition__RtdAssignment_3_2"


    // $ANTLR start "rule__MegaLDefinition__EdAssignment_3_3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1853:1: rule__MegaLDefinition__EdAssignment_3_3 : ( ruleED ) ;
    public final void rule__MegaLDefinition__EdAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1857:1: ( ( ruleED ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1858:1: ( ruleED )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1858:1: ( ruleED )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1859:1: ruleED
            {
             before(grammarAccess.getMegaLDefinitionAccess().getEdEDParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleED_in_rule__MegaLDefinition__EdAssignment_3_33700);
            ruleED();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getEdEDParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__MegaLDefinition__EdAssignment_3_3"


    // $ANTLR start "rule__MegaLDefinition__RdAssignment_3_4"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1868:1: rule__MegaLDefinition__RdAssignment_3_4 : ( ruleRD ) ;
    public final void rule__MegaLDefinition__RdAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1872:1: ( ( ruleRD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1873:1: ( ruleRD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1873:1: ( ruleRD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1874:1: ruleRD
            {
             before(grammarAccess.getMegaLDefinitionAccess().getRdRDParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_ruleRD_in_rule__MegaLDefinition__RdAssignment_3_43731);
            ruleRD();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getRdRDParserRuleCall_3_4_0()); 

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
    // $ANTLR end "rule__MegaLDefinition__RdAssignment_3_4"


    // $ANTLR start "rule__ETDDeclared__ReferenceAssignment"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1883:1: rule__ETDDeclared__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ETDDeclared__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1887:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1888:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1888:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1889:1: ( RULE_ID )
            {
             before(grammarAccess.getETDDeclaredAccess().getReferenceETDCrossReference_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1890:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1891:1: RULE_ID
            {
             before(grammarAccess.getETDDeclaredAccess().getReferenceETDIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ETDDeclared__ReferenceAssignment3766); 
             after(grammarAccess.getETDDeclaredAccess().getReferenceETDIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getETDDeclaredAccess().getReferenceETDCrossReference_0()); 

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
    // $ANTLR end "rule__ETDDeclared__ReferenceAssignment"


    // $ANTLR start "rule__ETD__NameAssignment_0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1902:1: rule__ETD__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ETD__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1906:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1907:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1907:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1908:1: RULE_ID
            {
             before(grammarAccess.getETDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ETD__NameAssignment_03801); 
             after(grammarAccess.getETDAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ETD__NameAssignment_0"


    // $ANTLR start "rule__ETD__SupertypeAssignment_2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1917:1: rule__ETD__SupertypeAssignment_2 : ( ruleETDR ) ;
    public final void rule__ETD__SupertypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1921:1: ( ( ruleETDR ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1922:1: ( ruleETDR )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1922:1: ( ruleETDR )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1923:1: ruleETDR
            {
             before(grammarAccess.getETDAccess().getSupertypeETDRParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleETDR_in_rule__ETD__SupertypeAssignment_23832);
            ruleETDR();

            state._fsp--;

             after(grammarAccess.getETDAccess().getSupertypeETDRParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ETD__SupertypeAssignment_2"


    // $ANTLR start "rule__RTD__NameAssignment_0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1932:1: rule__RTD__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RTD__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1936:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1937:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1937:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1938:1: RULE_ID
            {
             before(grammarAccess.getRTDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RTD__NameAssignment_03863); 
             after(grammarAccess.getRTDAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__RTD__NameAssignment_0"


    // $ANTLR start "rule__RTD__DomainAssignment_2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1947:1: rule__RTD__DomainAssignment_2 : ( ruleETDR ) ;
    public final void rule__RTD__DomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1951:1: ( ( ruleETDR ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1952:1: ( ruleETDR )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1952:1: ( ruleETDR )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1953:1: ruleETDR
            {
             before(grammarAccess.getRTDAccess().getDomainETDRParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleETDR_in_rule__RTD__DomainAssignment_23894);
            ruleETDR();

            state._fsp--;

             after(grammarAccess.getRTDAccess().getDomainETDRParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RTD__DomainAssignment_2"


    // $ANTLR start "rule__RTD__CoDomainAssignment_4"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1962:1: rule__RTD__CoDomainAssignment_4 : ( ruleETDR ) ;
    public final void rule__RTD__CoDomainAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1966:1: ( ( ruleETDR ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1967:1: ( ruleETDR )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1967:1: ( ruleETDR )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1968:1: ruleETDR
            {
             before(grammarAccess.getRTDAccess().getCoDomainETDRParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleETDR_in_rule__RTD__CoDomainAssignment_43925);
            ruleETDR();

            state._fsp--;

             after(grammarAccess.getRTDAccess().getCoDomainETDRParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RTD__CoDomainAssignment_4"


    // $ANTLR start "rule__ED__NameAssignment_0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1977:1: rule__ED__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ED__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1981:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1982:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1982:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1983:1: RULE_ID
            {
             before(grammarAccess.getEDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ED__NameAssignment_03956); 
             after(grammarAccess.getEDAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ED__NameAssignment_0"


    // $ANTLR start "rule__ED__TypeAssignment_2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1992:1: rule__ED__TypeAssignment_2 : ( ruleETDR ) ;
    public final void rule__ED__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1996:1: ( ( ruleETDR ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1997:1: ( ruleETDR )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1997:1: ( ruleETDR )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1998:1: ruleETDR
            {
             before(grammarAccess.getEDAccess().getTypeETDRParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleETDR_in_rule__ED__TypeAssignment_23987);
            ruleETDR();

            state._fsp--;

             after(grammarAccess.getEDAccess().getTypeETDRParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ED__TypeAssignment_2"


    // $ANTLR start "rule__RD__SourceAssignment_0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2007:1: rule__RD__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RD__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2011:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2012:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2012:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2013:1: ( RULE_ID )
            {
             before(grammarAccess.getRDAccess().getSourceEDCrossReference_0_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2014:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2015:1: RULE_ID
            {
             before(grammarAccess.getRDAccess().getSourceEDIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RD__SourceAssignment_04022); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2026:1: rule__RD__RelAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RD__RelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2030:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2031:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2031:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2032:1: ( RULE_ID )
            {
             before(grammarAccess.getRDAccess().getRelRTDCrossReference_1_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2033:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2034:1: RULE_ID
            {
             before(grammarAccess.getRDAccess().getRelRTDIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RD__RelAssignment_14061); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2045:1: rule__RD__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RD__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2049:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2050:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2050:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2051:1: ( RULE_ID )
            {
             before(grammarAccess.getRDAccess().getTargetEDCrossReference_2_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2052:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2053:1: RULE_ID
            {
             before(grammarAccess.getRDAccess().getTargetEDIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RD__TargetAssignment_24100); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2064:1: rule__MegaLLinking__NameAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__MegaLLinking__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2068:1: ( ( ruleQualifiedID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2069:1: ( ruleQualifiedID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2069:1: ( ruleQualifiedID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2070:1: ruleQualifiedID
            {
             before(grammarAccess.getMegaLLinkingAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__MegaLLinking__NameAssignment_14135);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2079:1: rule__MegaLLinking__TargetAssignment_2_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__MegaLLinking__TargetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2083:1: ( ( ( ruleQualifiedID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2084:1: ( ( ruleQualifiedID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2084:1: ( ( ruleQualifiedID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2085:1: ( ruleQualifiedID )
            {
             before(grammarAccess.getMegaLLinkingAccess().getTargetMegaLDefinitionCrossReference_2_1_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2086:1: ( ruleQualifiedID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2087:1: ruleQualifiedID
            {
             before(grammarAccess.getMegaLLinkingAccess().getTargetMegaLDefinitionQualifiedIDParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__MegaLLinking__TargetAssignment_2_14170);
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


    // $ANTLR start "rule__MegaLLinking__LinksAssignment_3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2098:1: rule__MegaLLinking__LinksAssignment_3 : ( ruleLD ) ;
    public final void rule__MegaLLinking__LinksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2102:1: ( ( ruleLD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2103:1: ( ruleLD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2103:1: ( ruleLD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2104:1: ruleLD
            {
             before(grammarAccess.getMegaLLinkingAccess().getLinksLDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLD_in_rule__MegaLLinking__LinksAssignment_34205);
            ruleLD();

            state._fsp--;

             after(grammarAccess.getMegaLLinkingAccess().getLinksLDParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MegaLLinking__LinksAssignment_3"


    // $ANTLR start "rule__LD__TargetAssignment_0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2113:1: rule__LD__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LD__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2117:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2118:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2118:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2119:1: ( RULE_ID )
            {
             before(grammarAccess.getLDAccess().getTargetEDCrossReference_0_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2120:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2121:1: RULE_ID
            {
             before(grammarAccess.getLDAccess().getTargetEDIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LD__TargetAssignment_04240); 
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


    // $ANTLR start "rule__LD__KeyAssignment_1_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2132:1: rule__LD__KeyAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__LD__KeyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2136:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2137:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2137:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2138:1: RULE_ID
            {
             before(grammarAccess.getLDAccess().getKeyIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LD__KeyAssignment_1_14275); 
             after(grammarAccess.getLDAccess().getKeyIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LD__KeyAssignment_1_1"


    // $ANTLR start "rule__LD__ValueAssignment_3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2147:1: rule__LD__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__LD__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2151:1: ( ( RULE_STRING ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2152:1: ( RULE_STRING )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2152:1: ( RULE_STRING )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2153:1: RULE_STRING
            {
             before(grammarAccess.getLDAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LD__ValueAssignment_34306); 
             after(grammarAccess.getLDAccess().getValueSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__LD__ValueAssignment_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\6\uffff\2\11\2\uffff";
    static final String DFA2_minS =
        "\1\4\1\uffff\2\4\2\uffff\2\4\2\uffff";
    static final String DFA2_maxS =
        "\1\16\1\uffff\1\22\1\17\2\uffff\2\21\2\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\2\uffff\1\3\1\2";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\11\uffff\1\1",
            "",
            "\1\5\13\uffff\1\3\1\uffff\1\4",
            "\1\7\12\uffff\1\6",
            "",
            "",
            "\1\11\11\uffff\1\11\2\uffff\1\10",
            "\1\11\11\uffff\1\11\2\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "418:1: rule__MegaLDefinition__Alternatives_3 : ( ( ( rule__MegaLDefinition__Group_3_0__0 ) ) | ( ( rule__MegaLDefinition__EtdAssignment_3_1 ) ) | ( ( rule__MegaLDefinition__RtdAssignment_3_2 ) ) | ( ( rule__MegaLDefinition__EdAssignment_3_3 ) ) | ( ( rule__MegaLDefinition__RdAssignment_3_4 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLDefinition_in_entryRuleMegaLDefinition121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaLDefinition128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__0_in_ruleMegaLDefinition154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_entryRuleETDR181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDR188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDR__Alternatives_in_ruleETDR214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDEntity_in_entryRuleETDEntity241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDEntity248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDEntity__Group__0_in_ruleETDEntity274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDDeclared_in_entryRuleETDDeclared301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDDeclared308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDDeclared__ReferenceAssignment_in_ruleETDDeclared334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_entryRuleETD361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETD368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__0_in_ruleETD394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_entryRuleRTD421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTD428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__0_in_ruleRTD454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_entryRuleED481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleED488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__0_in_ruleED514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_entryRuleRD541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRD548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__0_in_ruleRD574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLLinking_in_entryRuleMegaLLinking661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaLLinking668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__0_in_ruleMegaLLinking694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLD_in_entryRuleLD721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLD728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group__0_in_ruleLD754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLDefinition_in_rule__Model__Alternatives790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLLinking_in_rule__Model__Alternatives807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_3_0__0_in_rule__MegaLDefinition__Alternatives_3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__EtdAssignment_3_1_in_rule__MegaLDefinition__Alternatives_3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__RtdAssignment_3_2_in_rule__MegaLDefinition__Alternatives_3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__EdAssignment_3_3_in_rule__MegaLDefinition__Alternatives_3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__RdAssignment_3_4_in_rule__MegaLDefinition__Alternatives_3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDEntity_in_rule__ETDR__Alternatives944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDDeclared_in_rule__ETDR__Alternatives961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__0__Impl_in_rule__MegaLDefinition__Group__0991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__1_in_rule__MegaLDefinition__Group__0994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__MegaLDefinition__Group__0__Impl1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__1__Impl_in_rule__MegaLDefinition__Group__11053 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__2_in_rule__MegaLDefinition__Group__11056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__NameAssignment_1_in_rule__MegaLDefinition__Group__1__Impl1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__2__Impl_in_rule__MegaLDefinition__Group__21113 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__3_in_rule__MegaLDefinition__Group__21116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__0_in_rule__MegaLDefinition__Group__2__Impl1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__3__Impl_in_rule__MegaLDefinition__Group__31174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Alternatives_3_in_rule__MegaLDefinition__Group__3__Impl1201 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__0__Impl_in_rule__MegaLDefinition__Group_2__01240 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__1_in_rule__MegaLDefinition__Group_2__01243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MegaLDefinition__Group_2__0__Impl1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__1__Impl_in_rule__MegaLDefinition__Group_2__11302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__2_in_rule__MegaLDefinition__Group_2__11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MegaLDefinition__Group_2__1__Impl1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__2__Impl_in_rule__MegaLDefinition__Group_2__21364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__LinkerAssignment_2_2_in_rule__MegaLDefinition__Group_2__2__Impl1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_3_0__0__Impl_in_rule__MegaLDefinition__Group_3_0__01427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_3_0__1_in_rule__MegaLDefinition__Group_3_0__01430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MegaLDefinition__Group_3_0__0__Impl1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_3_0__1__Impl_in_rule__MegaLDefinition__Group_3_0__11489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__ImportsAssignment_3_0_1_in_rule__MegaLDefinition__Group_3_0__1__Impl1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDEntity__Group__0__Impl_in_rule__ETDEntity__Group__01550 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ETDEntity__Group__1_in_rule__ETDEntity__Group__01553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDEntity__Group__1__Impl_in_rule__ETDEntity__Group__11611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ETDEntity__Group__1__Impl1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__0__Impl_in_rule__ETD__Group__01674 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ETD__Group__1_in_rule__ETD__Group__01677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__NameAssignment_0_in_rule__ETD__Group__0__Impl1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__1__Impl_in_rule__ETD__Group__11734 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__ETD__Group__2_in_rule__ETD__Group__11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ETD__Group__1__Impl1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__2__Impl_in_rule__ETD__Group__21796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__SupertypeAssignment_2_in_rule__ETD__Group__2__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__0__Impl_in_rule__RTD__Group__01859 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RTD__Group__1_in_rule__RTD__Group__01862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__NameAssignment_0_in_rule__RTD__Group__0__Impl1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__1__Impl_in_rule__RTD__Group__11919 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__RTD__Group__2_in_rule__RTD__Group__11922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RTD__Group__1__Impl1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__2__Impl_in_rule__RTD__Group__21981 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RTD__Group__3_in_rule__RTD__Group__21984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__DomainAssignment_2_in_rule__RTD__Group__2__Impl2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__3__Impl_in_rule__RTD__Group__32041 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__RTD__Group__4_in_rule__RTD__Group__32044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RTD__Group__3__Impl2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__4__Impl_in_rule__RTD__Group__42103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__CoDomainAssignment_4_in_rule__RTD__Group__4__Impl2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__0__Impl_in_rule__ED__Group__02170 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ED__Group__1_in_rule__ED__Group__02173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__NameAssignment_0_in_rule__ED__Group__0__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__1__Impl_in_rule__ED__Group__12230 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__ED__Group__2_in_rule__ED__Group__12233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ED__Group__1__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__2__Impl_in_rule__ED__Group__22292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__TypeAssignment_2_in_rule__ED__Group__2__Impl2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__0__Impl_in_rule__RD__Group__02355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RD__Group__1_in_rule__RD__Group__02358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__SourceAssignment_0_in_rule__RD__Group__0__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__1__Impl_in_rule__RD__Group__12415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RD__Group__2_in_rule__RD__Group__12418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__RelAssignment_1_in_rule__RD__Group__1__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__2__Impl_in_rule__RD__Group__22475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__TargetAssignment_2_in_rule__RD__Group__2__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__02538 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__02541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__12597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl2624 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__02659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__02662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedID__Group_1__0__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__12721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__0__Impl_in_rule__MegaLLinking__Group__02781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__1_in_rule__MegaLLinking__Group__02784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MegaLLinking__Group__0__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__1__Impl_in_rule__MegaLLinking__Group__12843 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__2_in_rule__MegaLLinking__Group__12846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__NameAssignment_1_in_rule__MegaLLinking__Group__1__Impl2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__2__Impl_in_rule__MegaLLinking__Group__22903 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__3_in_rule__MegaLLinking__Group__22906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group_2__0_in_rule__MegaLLinking__Group__2__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__3__Impl_in_rule__MegaLLinking__Group__32964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__LinksAssignment_3_in_rule__MegaLLinking__Group__3__Impl2991 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group_2__0__Impl_in_rule__MegaLLinking__Group_2__03030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group_2__1_in_rule__MegaLLinking__Group_2__03033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MegaLLinking__Group_2__0__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group_2__1__Impl_in_rule__MegaLLinking__Group_2__13092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__TargetAssignment_2_1_in_rule__MegaLLinking__Group_2__1__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group__0__Impl_in_rule__LD__Group__03153 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__LD__Group__1_in_rule__LD__Group__03156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__TargetAssignment_0_in_rule__LD__Group__0__Impl3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group__1__Impl_in_rule__LD__Group__13213 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__LD__Group__2_in_rule__LD__Group__13216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group_1__0_in_rule__LD__Group__1__Impl3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group__2__Impl_in_rule__LD__Group__23274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LD__Group__3_in_rule__LD__Group__23277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LD__Group__2__Impl3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group__3__Impl_in_rule__LD__Group__33336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__ValueAssignment_3_in_rule__LD__Group__3__Impl3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group_1__0__Impl_in_rule__LD__Group_1__03401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LD__Group_1__1_in_rule__LD__Group_1__03404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LD__Group_1__0__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group_1__1__Impl_in_rule__LD__Group_1__13463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__KeyAssignment_1_1_in_rule__LD__Group_1__1__Impl3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MegaLDefinition__NameAssignment_13529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MegaLDefinition__LinkerAssignment_2_23564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MegaLDefinition__ImportsAssignment_3_0_13603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_rule__MegaLDefinition__EtdAssignment_3_13638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_rule__MegaLDefinition__RtdAssignment_3_23669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_rule__MegaLDefinition__EdAssignment_3_33700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_rule__MegaLDefinition__RdAssignment_3_43731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ETDDeclared__ReferenceAssignment3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ETD__NameAssignment_03801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_rule__ETD__SupertypeAssignment_23832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RTD__NameAssignment_03863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_rule__RTD__DomainAssignment_23894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_rule__RTD__CoDomainAssignment_43925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ED__NameAssignment_03956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_rule__ED__TypeAssignment_23987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RD__SourceAssignment_04022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RD__RelAssignment_14061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RD__TargetAssignment_24100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MegaLLinking__NameAssignment_14135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MegaLLinking__TargetAssignment_2_14170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLD_in_rule__MegaLLinking__LinksAssignment_34205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LD__TargetAssignment_04240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LD__KeyAssignment_1_14275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LD__ValueAssignment_34306 = new BitSet(new long[]{0x0000000000000002L});

}