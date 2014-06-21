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


    // $ANTLR start "entryRuleETDR"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:144:1: entryRuleETDR : ruleETDR EOF ;
    public final void entryRuleETDR() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:145:1: ( ruleETDR EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:146:1: ruleETDR EOF
            {
             before(grammarAccess.getETDRRule()); 
            pushFollow(FOLLOW_ruleETDR_in_entryRuleETDR241);
            ruleETDR();

            state._fsp--;

             after(grammarAccess.getETDRRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDR248); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:153:1: ruleETDR : ( ( rule__ETDR__Alternatives ) ) ;
    public final void ruleETDR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:157:2: ( ( ( rule__ETDR__Alternatives ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:158:1: ( ( rule__ETDR__Alternatives ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:158:1: ( ( rule__ETDR__Alternatives ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:159:1: ( rule__ETDR__Alternatives )
            {
             before(grammarAccess.getETDRAccess().getAlternatives()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:160:1: ( rule__ETDR__Alternatives )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:160:2: rule__ETDR__Alternatives
            {
            pushFollow(FOLLOW_rule__ETDR__Alternatives_in_ruleETDR274);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:172:1: entryRuleETDEntity : ruleETDEntity EOF ;
    public final void entryRuleETDEntity() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:173:1: ( ruleETDEntity EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:174:1: ruleETDEntity EOF
            {
             before(grammarAccess.getETDEntityRule()); 
            pushFollow(FOLLOW_ruleETDEntity_in_entryRuleETDEntity301);
            ruleETDEntity();

            state._fsp--;

             after(grammarAccess.getETDEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDEntity308); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:181:1: ruleETDEntity : ( ( rule__ETDEntity__Group__0 ) ) ;
    public final void ruleETDEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:185:2: ( ( ( rule__ETDEntity__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:186:1: ( ( rule__ETDEntity__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:186:1: ( ( rule__ETDEntity__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:187:1: ( rule__ETDEntity__Group__0 )
            {
             before(grammarAccess.getETDEntityAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:188:1: ( rule__ETDEntity__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:188:2: rule__ETDEntity__Group__0
            {
            pushFollow(FOLLOW_rule__ETDEntity__Group__0_in_ruleETDEntity334);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:200:1: entryRuleETDDeclared : ruleETDDeclared EOF ;
    public final void entryRuleETDDeclared() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:201:1: ( ruleETDDeclared EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:202:1: ruleETDDeclared EOF
            {
             before(grammarAccess.getETDDeclaredRule()); 
            pushFollow(FOLLOW_ruleETDDeclared_in_entryRuleETDDeclared361);
            ruleETDDeclared();

            state._fsp--;

             after(grammarAccess.getETDDeclaredRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDDeclared368); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:209:1: ruleETDDeclared : ( ( rule__ETDDeclared__RefAssignment ) ) ;
    public final void ruleETDDeclared() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:213:2: ( ( ( rule__ETDDeclared__RefAssignment ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:214:1: ( ( rule__ETDDeclared__RefAssignment ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:214:1: ( ( rule__ETDDeclared__RefAssignment ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:215:1: ( rule__ETDDeclared__RefAssignment )
            {
             before(grammarAccess.getETDDeclaredAccess().getRefAssignment()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:216:1: ( rule__ETDDeclared__RefAssignment )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:216:2: rule__ETDDeclared__RefAssignment
            {
            pushFollow(FOLLOW_rule__ETDDeclared__RefAssignment_in_ruleETDDeclared394);
            rule__ETDDeclared__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getETDDeclaredAccess().getRefAssignment()); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:228:1: entryRuleETD : ruleETD EOF ;
    public final void entryRuleETD() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:229:1: ( ruleETD EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:230:1: ruleETD EOF
            {
             before(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_ruleETD_in_entryRuleETD421);
            ruleETD();

            state._fsp--;

             after(grammarAccess.getETDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETD428); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:237:1: ruleETD : ( ( rule__ETD__Group__0 ) ) ;
    public final void ruleETD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:241:2: ( ( ( rule__ETD__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:242:1: ( ( rule__ETD__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:242:1: ( ( rule__ETD__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:243:1: ( rule__ETD__Group__0 )
            {
             before(grammarAccess.getETDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:244:1: ( rule__ETD__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:244:2: rule__ETD__Group__0
            {
            pushFollow(FOLLOW_rule__ETD__Group__0_in_ruleETD454);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:256:1: entryRuleRTD : ruleRTD EOF ;
    public final void entryRuleRTD() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:257:1: ( ruleRTD EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:258:1: ruleRTD EOF
            {
             before(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_ruleRTD_in_entryRuleRTD481);
            ruleRTD();

            state._fsp--;

             after(grammarAccess.getRTDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTD488); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:265:1: ruleRTD : ( ( rule__RTD__Group__0 ) ) ;
    public final void ruleRTD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:269:2: ( ( ( rule__RTD__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:270:1: ( ( rule__RTD__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:270:1: ( ( rule__RTD__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:271:1: ( rule__RTD__Group__0 )
            {
             before(grammarAccess.getRTDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:272:1: ( rule__RTD__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:272:2: rule__RTD__Group__0
            {
            pushFollow(FOLLOW_rule__RTD__Group__0_in_ruleRTD514);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:284:1: entryRuleED : ruleED EOF ;
    public final void entryRuleED() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:285:1: ( ruleED EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:286:1: ruleED EOF
            {
             before(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_ruleED_in_entryRuleED541);
            ruleED();

            state._fsp--;

             after(grammarAccess.getEDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleED548); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:293:1: ruleED : ( ( rule__ED__Group__0 ) ) ;
    public final void ruleED() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:297:2: ( ( ( rule__ED__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:298:1: ( ( rule__ED__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:298:1: ( ( rule__ED__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:299:1: ( rule__ED__Group__0 )
            {
             before(grammarAccess.getEDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:300:1: ( rule__ED__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:300:2: rule__ED__Group__0
            {
            pushFollow(FOLLOW_rule__ED__Group__0_in_ruleED574);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:312:1: entryRuleRD : ruleRD EOF ;
    public final void entryRuleRD() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:313:1: ( ruleRD EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:314:1: ruleRD EOF
            {
             before(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_ruleRD_in_entryRuleRD601);
            ruleRD();

            state._fsp--;

             after(grammarAccess.getRDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRD608); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:321:1: ruleRD : ( ( rule__RD__Group__0 ) ) ;
    public final void ruleRD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:325:2: ( ( ( rule__RD__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:326:1: ( ( rule__RD__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:326:1: ( ( rule__RD__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:327:1: ( rule__RD__Group__0 )
            {
             before(grammarAccess.getRDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:328:1: ( rule__RD__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:328:2: rule__RD__Group__0
            {
            pushFollow(FOLLOW_rule__RD__Group__0_in_ruleRD634);
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


    // $ANTLR start "entryRuleQualifiedID"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:396:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:397:1: ( ruleQualifiedID EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:398:1: ruleQualifiedID EOF
            {
             before(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID781);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getQualifiedIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedID788); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:405:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:409:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:410:1: ( ( rule__QualifiedID__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:410:1: ( ( rule__QualifiedID__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:411:1: ( rule__QualifiedID__Group__0 )
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:412:1: ( rule__QualifiedID__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:412:2: rule__QualifiedID__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID814);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:424:1: rule__Model__Alternatives : ( ( ruleMegaLDefinition ) | ( ruleMegaLLinking ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:428:1: ( ( ruleMegaLDefinition ) | ( ruleMegaLLinking ) )
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
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:429:1: ( ruleMegaLDefinition )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:429:1: ( ruleMegaLDefinition )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:430:1: ruleMegaLDefinition
                    {
                     before(grammarAccess.getModelAccess().getMegaLDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMegaLDefinition_in_rule__Model__Alternatives850);
                    ruleMegaLDefinition();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getMegaLDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:435:6: ( ruleMegaLLinking )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:435:6: ( ruleMegaLLinking )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:436:1: ruleMegaLLinking
                    {
                     before(grammarAccess.getModelAccess().getMegaLLinkingParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMegaLLinking_in_rule__Model__Alternatives867);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:446:1: rule__MegaLDefinition__Alternatives_3 : ( ( ( rule__MegaLDefinition__ImportsAssignment_3_0 ) ) | ( ( rule__MegaLDefinition__EtdsAssignment_3_1 ) ) | ( ( rule__MegaLDefinition__RtdsAssignment_3_2 ) ) | ( ( rule__MegaLDefinition__EdsAssignment_3_3 ) ) | ( ( rule__MegaLDefinition__RdsAssignment_3_4 ) ) );
    public final void rule__MegaLDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:450:1: ( ( ( rule__MegaLDefinition__ImportsAssignment_3_0 ) ) | ( ( rule__MegaLDefinition__EtdsAssignment_3_1 ) ) | ( ( rule__MegaLDefinition__RtdsAssignment_3_2 ) ) | ( ( rule__MegaLDefinition__EdsAssignment_3_3 ) ) | ( ( rule__MegaLDefinition__RdsAssignment_3_4 ) ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:451:1: ( ( rule__MegaLDefinition__ImportsAssignment_3_0 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:451:1: ( ( rule__MegaLDefinition__ImportsAssignment_3_0 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:452:1: ( rule__MegaLDefinition__ImportsAssignment_3_0 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getImportsAssignment_3_0()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:453:1: ( rule__MegaLDefinition__ImportsAssignment_3_0 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:453:2: rule__MegaLDefinition__ImportsAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__ImportsAssignment_3_0_in_rule__MegaLDefinition__Alternatives_3899);
                    rule__MegaLDefinition__ImportsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getImportsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:457:6: ( ( rule__MegaLDefinition__EtdsAssignment_3_1 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:457:6: ( ( rule__MegaLDefinition__EtdsAssignment_3_1 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:458:1: ( rule__MegaLDefinition__EtdsAssignment_3_1 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getEtdsAssignment_3_1()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:459:1: ( rule__MegaLDefinition__EtdsAssignment_3_1 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:459:2: rule__MegaLDefinition__EtdsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__EtdsAssignment_3_1_in_rule__MegaLDefinition__Alternatives_3917);
                    rule__MegaLDefinition__EtdsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getEtdsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:463:6: ( ( rule__MegaLDefinition__RtdsAssignment_3_2 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:463:6: ( ( rule__MegaLDefinition__RtdsAssignment_3_2 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:464:1: ( rule__MegaLDefinition__RtdsAssignment_3_2 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getRtdsAssignment_3_2()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:465:1: ( rule__MegaLDefinition__RtdsAssignment_3_2 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:465:2: rule__MegaLDefinition__RtdsAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__RtdsAssignment_3_2_in_rule__MegaLDefinition__Alternatives_3935);
                    rule__MegaLDefinition__RtdsAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getRtdsAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:469:6: ( ( rule__MegaLDefinition__EdsAssignment_3_3 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:469:6: ( ( rule__MegaLDefinition__EdsAssignment_3_3 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:470:1: ( rule__MegaLDefinition__EdsAssignment_3_3 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getEdsAssignment_3_3()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:471:1: ( rule__MegaLDefinition__EdsAssignment_3_3 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:471:2: rule__MegaLDefinition__EdsAssignment_3_3
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__EdsAssignment_3_3_in_rule__MegaLDefinition__Alternatives_3953);
                    rule__MegaLDefinition__EdsAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getEdsAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:475:6: ( ( rule__MegaLDefinition__RdsAssignment_3_4 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:475:6: ( ( rule__MegaLDefinition__RdsAssignment_3_4 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:476:1: ( rule__MegaLDefinition__RdsAssignment_3_4 )
                    {
                     before(grammarAccess.getMegaLDefinitionAccess().getRdsAssignment_3_4()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:477:1: ( rule__MegaLDefinition__RdsAssignment_3_4 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:477:2: rule__MegaLDefinition__RdsAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__RdsAssignment_3_4_in_rule__MegaLDefinition__Alternatives_3971);
                    rule__MegaLDefinition__RdsAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLDefinitionAccess().getRdsAssignment_3_4()); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:486:1: rule__ETDR__Alternatives : ( ( ruleETDEntity ) | ( ruleETDDeclared ) );
    public final void rule__ETDR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:490:1: ( ( ruleETDEntity ) | ( ruleETDDeclared ) )
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
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:491:1: ( ruleETDEntity )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:491:1: ( ruleETDEntity )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:492:1: ruleETDEntity
                    {
                     before(grammarAccess.getETDRAccess().getETDEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleETDEntity_in_rule__ETDR__Alternatives1004);
                    ruleETDEntity();

                    state._fsp--;

                     after(grammarAccess.getETDRAccess().getETDEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:497:6: ( ruleETDDeclared )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:497:6: ( ruleETDDeclared )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:498:1: ruleETDDeclared
                    {
                     before(grammarAccess.getETDRAccess().getETDDeclaredParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleETDDeclared_in_rule__ETDR__Alternatives1021);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:510:1: rule__MegaLDefinition__Group__0 : rule__MegaLDefinition__Group__0__Impl rule__MegaLDefinition__Group__1 ;
    public final void rule__MegaLDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:514:1: ( rule__MegaLDefinition__Group__0__Impl rule__MegaLDefinition__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:515:2: rule__MegaLDefinition__Group__0__Impl rule__MegaLDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group__0__Impl_in_rule__MegaLDefinition__Group__01051);
            rule__MegaLDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group__1_in_rule__MegaLDefinition__Group__01054);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:522:1: rule__MegaLDefinition__Group__0__Impl : ( 'model' ) ;
    public final void rule__MegaLDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:526:1: ( ( 'model' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:527:1: ( 'model' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:527:1: ( 'model' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:528:1: 'model'
            {
             before(grammarAccess.getMegaLDefinitionAccess().getModelKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__MegaLDefinition__Group__0__Impl1082); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:541:1: rule__MegaLDefinition__Group__1 : rule__MegaLDefinition__Group__1__Impl rule__MegaLDefinition__Group__2 ;
    public final void rule__MegaLDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:545:1: ( rule__MegaLDefinition__Group__1__Impl rule__MegaLDefinition__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:546:2: rule__MegaLDefinition__Group__1__Impl rule__MegaLDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group__1__Impl_in_rule__MegaLDefinition__Group__11113);
            rule__MegaLDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group__2_in_rule__MegaLDefinition__Group__11116);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:553:1: rule__MegaLDefinition__Group__1__Impl : ( ( rule__MegaLDefinition__NameAssignment_1 ) ) ;
    public final void rule__MegaLDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:557:1: ( ( ( rule__MegaLDefinition__NameAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:558:1: ( ( rule__MegaLDefinition__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:558:1: ( ( rule__MegaLDefinition__NameAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:559:1: ( rule__MegaLDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getMegaLDefinitionAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:560:1: ( rule__MegaLDefinition__NameAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:560:2: rule__MegaLDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__NameAssignment_1_in_rule__MegaLDefinition__Group__1__Impl1143);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:570:1: rule__MegaLDefinition__Group__2 : rule__MegaLDefinition__Group__2__Impl rule__MegaLDefinition__Group__3 ;
    public final void rule__MegaLDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:574:1: ( rule__MegaLDefinition__Group__2__Impl rule__MegaLDefinition__Group__3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:575:2: rule__MegaLDefinition__Group__2__Impl rule__MegaLDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group__2__Impl_in_rule__MegaLDefinition__Group__21173);
            rule__MegaLDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group__3_in_rule__MegaLDefinition__Group__21176);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:582:1: rule__MegaLDefinition__Group__2__Impl : ( ( rule__MegaLDefinition__Group_2__0 )? ) ;
    public final void rule__MegaLDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:586:1: ( ( ( rule__MegaLDefinition__Group_2__0 )? ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:587:1: ( ( rule__MegaLDefinition__Group_2__0 )? )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:587:1: ( ( rule__MegaLDefinition__Group_2__0 )? )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:588:1: ( rule__MegaLDefinition__Group_2__0 )?
            {
             before(grammarAccess.getMegaLDefinitionAccess().getGroup_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:589:1: ( rule__MegaLDefinition__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:589:2: rule__MegaLDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__0_in_rule__MegaLDefinition__Group__2__Impl1203);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:599:1: rule__MegaLDefinition__Group__3 : rule__MegaLDefinition__Group__3__Impl ;
    public final void rule__MegaLDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:603:1: ( rule__MegaLDefinition__Group__3__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:604:2: rule__MegaLDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group__3__Impl_in_rule__MegaLDefinition__Group__31234);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:610:1: rule__MegaLDefinition__Group__3__Impl : ( ( rule__MegaLDefinition__Alternatives_3 )* ) ;
    public final void rule__MegaLDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:614:1: ( ( ( rule__MegaLDefinition__Alternatives_3 )* ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:615:1: ( ( rule__MegaLDefinition__Alternatives_3 )* )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:615:1: ( ( rule__MegaLDefinition__Alternatives_3 )* )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:616:1: ( rule__MegaLDefinition__Alternatives_3 )*
            {
             before(grammarAccess.getMegaLDefinitionAccess().getAlternatives_3()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:617:1: ( rule__MegaLDefinition__Alternatives_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:617:2: rule__MegaLDefinition__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__MegaLDefinition__Alternatives_3_in_rule__MegaLDefinition__Group__3__Impl1261);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:635:1: rule__MegaLDefinition__Group_2__0 : rule__MegaLDefinition__Group_2__0__Impl rule__MegaLDefinition__Group_2__1 ;
    public final void rule__MegaLDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:639:1: ( rule__MegaLDefinition__Group_2__0__Impl rule__MegaLDefinition__Group_2__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:640:2: rule__MegaLDefinition__Group_2__0__Impl rule__MegaLDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__0__Impl_in_rule__MegaLDefinition__Group_2__01300);
            rule__MegaLDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__1_in_rule__MegaLDefinition__Group_2__01303);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:647:1: rule__MegaLDefinition__Group_2__0__Impl : ( 'linked' ) ;
    public final void rule__MegaLDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:651:1: ( ( 'linked' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:652:1: ( 'linked' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:652:1: ( 'linked' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:653:1: 'linked'
            {
             before(grammarAccess.getMegaLDefinitionAccess().getLinkedKeyword_2_0()); 
            match(input,12,FOLLOW_12_in_rule__MegaLDefinition__Group_2__0__Impl1331); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:666:1: rule__MegaLDefinition__Group_2__1 : rule__MegaLDefinition__Group_2__1__Impl rule__MegaLDefinition__Group_2__2 ;
    public final void rule__MegaLDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:670:1: ( rule__MegaLDefinition__Group_2__1__Impl rule__MegaLDefinition__Group_2__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:671:2: rule__MegaLDefinition__Group_2__1__Impl rule__MegaLDefinition__Group_2__2
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__1__Impl_in_rule__MegaLDefinition__Group_2__11362);
            rule__MegaLDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__2_in_rule__MegaLDefinition__Group_2__11365);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:678:1: rule__MegaLDefinition__Group_2__1__Impl : ( 'in' ) ;
    public final void rule__MegaLDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:682:1: ( ( 'in' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:683:1: ( 'in' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:683:1: ( 'in' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:684:1: 'in'
            {
             before(grammarAccess.getMegaLDefinitionAccess().getInKeyword_2_1()); 
            match(input,13,FOLLOW_13_in_rule__MegaLDefinition__Group_2__1__Impl1393); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:697:1: rule__MegaLDefinition__Group_2__2 : rule__MegaLDefinition__Group_2__2__Impl ;
    public final void rule__MegaLDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:701:1: ( rule__MegaLDefinition__Group_2__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:702:2: rule__MegaLDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__Group_2__2__Impl_in_rule__MegaLDefinition__Group_2__21424);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:708:1: rule__MegaLDefinition__Group_2__2__Impl : ( ( rule__MegaLDefinition__LinkerAssignment_2_2 ) ) ;
    public final void rule__MegaLDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:712:1: ( ( ( rule__MegaLDefinition__LinkerAssignment_2_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:713:1: ( ( rule__MegaLDefinition__LinkerAssignment_2_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:713:1: ( ( rule__MegaLDefinition__LinkerAssignment_2_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:714:1: ( rule__MegaLDefinition__LinkerAssignment_2_2 )
            {
             before(grammarAccess.getMegaLDefinitionAccess().getLinkerAssignment_2_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:715:1: ( rule__MegaLDefinition__LinkerAssignment_2_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:715:2: rule__MegaLDefinition__LinkerAssignment_2_2
            {
            pushFollow(FOLLOW_rule__MegaLDefinition__LinkerAssignment_2_2_in_rule__MegaLDefinition__Group_2__2__Impl1451);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:731:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:735:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:736:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01487);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01490);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:743:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:747:1: ( ( 'import' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:748:1: ( 'import' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:748:1: ( 'import' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:749:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Import__Group__0__Impl1518); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:762:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:766:1: ( rule__Import__Group__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:767:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11549);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:773:1: rule__Import__Group__1__Impl : ( ( rule__Import__RefAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:777:1: ( ( ( rule__Import__RefAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:778:1: ( ( rule__Import__RefAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:778:1: ( ( rule__Import__RefAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:779:1: ( rule__Import__RefAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getRefAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:780:1: ( rule__Import__RefAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:780:2: rule__Import__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__RefAssignment_1_in_rule__Import__Group__1__Impl1576);
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


    // $ANTLR start "rule__ETDEntity__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:794:1: rule__ETDEntity__Group__0 : rule__ETDEntity__Group__0__Impl rule__ETDEntity__Group__1 ;
    public final void rule__ETDEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:798:1: ( rule__ETDEntity__Group__0__Impl rule__ETDEntity__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:799:2: rule__ETDEntity__Group__0__Impl rule__ETDEntity__Group__1
            {
            pushFollow(FOLLOW_rule__ETDEntity__Group__0__Impl_in_rule__ETDEntity__Group__01610);
            rule__ETDEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETDEntity__Group__1_in_rule__ETDEntity__Group__01613);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:806:1: rule__ETDEntity__Group__0__Impl : ( () ) ;
    public final void rule__ETDEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:810:1: ( ( () ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:811:1: ( () )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:811:1: ( () )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:812:1: ()
            {
             before(grammarAccess.getETDEntityAccess().getETDEntityAction_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:813:1: ()
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:815:1: 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:825:1: rule__ETDEntity__Group__1 : rule__ETDEntity__Group__1__Impl ;
    public final void rule__ETDEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:829:1: ( rule__ETDEntity__Group__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:830:2: rule__ETDEntity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ETDEntity__Group__1__Impl_in_rule__ETDEntity__Group__11671);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:836:1: rule__ETDEntity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__ETDEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:840:1: ( ( 'Entity' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:841:1: ( 'Entity' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:841:1: ( 'Entity' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:842:1: 'Entity'
            {
             before(grammarAccess.getETDEntityAccess().getEntityKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__ETDEntity__Group__1__Impl1699); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:859:1: rule__ETD__Group__0 : rule__ETD__Group__0__Impl rule__ETD__Group__1 ;
    public final void rule__ETD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:863:1: ( rule__ETD__Group__0__Impl rule__ETD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:864:2: rule__ETD__Group__0__Impl rule__ETD__Group__1
            {
            pushFollow(FOLLOW_rule__ETD__Group__0__Impl_in_rule__ETD__Group__01734);
            rule__ETD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__1_in_rule__ETD__Group__01737);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:871:1: rule__ETD__Group__0__Impl : ( ( rule__ETD__NameAssignment_0 ) ) ;
    public final void rule__ETD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:875:1: ( ( ( rule__ETD__NameAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:876:1: ( ( rule__ETD__NameAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:876:1: ( ( rule__ETD__NameAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:877:1: ( rule__ETD__NameAssignment_0 )
            {
             before(grammarAccess.getETDAccess().getNameAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:878:1: ( rule__ETD__NameAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:878:2: rule__ETD__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ETD__NameAssignment_0_in_rule__ETD__Group__0__Impl1764);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:888:1: rule__ETD__Group__1 : rule__ETD__Group__1__Impl rule__ETD__Group__2 ;
    public final void rule__ETD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:892:1: ( rule__ETD__Group__1__Impl rule__ETD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:893:2: rule__ETD__Group__1__Impl rule__ETD__Group__2
            {
            pushFollow(FOLLOW_rule__ETD__Group__1__Impl_in_rule__ETD__Group__11794);
            rule__ETD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__2_in_rule__ETD__Group__11797);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:900:1: rule__ETD__Group__1__Impl : ( '<' ) ;
    public final void rule__ETD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:904:1: ( ( '<' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:905:1: ( '<' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:905:1: ( '<' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:906:1: '<'
            {
             before(grammarAccess.getETDAccess().getLessThanSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__ETD__Group__1__Impl1825); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:919:1: rule__ETD__Group__2 : rule__ETD__Group__2__Impl ;
    public final void rule__ETD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:923:1: ( rule__ETD__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:924:2: rule__ETD__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ETD__Group__2__Impl_in_rule__ETD__Group__21856);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:930:1: rule__ETD__Group__2__Impl : ( ( rule__ETD__SupertypeAssignment_2 ) ) ;
    public final void rule__ETD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:934:1: ( ( ( rule__ETD__SupertypeAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:935:1: ( ( rule__ETD__SupertypeAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:935:1: ( ( rule__ETD__SupertypeAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:936:1: ( rule__ETD__SupertypeAssignment_2 )
            {
             before(grammarAccess.getETDAccess().getSupertypeAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:937:1: ( rule__ETD__SupertypeAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:937:2: rule__ETD__SupertypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ETD__SupertypeAssignment_2_in_rule__ETD__Group__2__Impl1883);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:953:1: rule__RTD__Group__0 : rule__RTD__Group__0__Impl rule__RTD__Group__1 ;
    public final void rule__RTD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:957:1: ( rule__RTD__Group__0__Impl rule__RTD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:958:2: rule__RTD__Group__0__Impl rule__RTD__Group__1
            {
            pushFollow(FOLLOW_rule__RTD__Group__0__Impl_in_rule__RTD__Group__01919);
            rule__RTD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__1_in_rule__RTD__Group__01922);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:965:1: rule__RTD__Group__0__Impl : ( ( rule__RTD__NameAssignment_0 ) ) ;
    public final void rule__RTD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:969:1: ( ( ( rule__RTD__NameAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:970:1: ( ( rule__RTD__NameAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:970:1: ( ( rule__RTD__NameAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:971:1: ( rule__RTD__NameAssignment_0 )
            {
             before(grammarAccess.getRTDAccess().getNameAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:972:1: ( rule__RTD__NameAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:972:2: rule__RTD__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__RTD__NameAssignment_0_in_rule__RTD__Group__0__Impl1949);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:982:1: rule__RTD__Group__1 : rule__RTD__Group__1__Impl rule__RTD__Group__2 ;
    public final void rule__RTD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:986:1: ( rule__RTD__Group__1__Impl rule__RTD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:987:2: rule__RTD__Group__1__Impl rule__RTD__Group__2
            {
            pushFollow(FOLLOW_rule__RTD__Group__1__Impl_in_rule__RTD__Group__11979);
            rule__RTD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__2_in_rule__RTD__Group__11982);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:994:1: rule__RTD__Group__1__Impl : ( '<' ) ;
    public final void rule__RTD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:998:1: ( ( '<' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:999:1: ( '<' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:999:1: ( '<' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1000:1: '<'
            {
             before(grammarAccess.getRTDAccess().getLessThanSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__RTD__Group__1__Impl2010); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1013:1: rule__RTD__Group__2 : rule__RTD__Group__2__Impl rule__RTD__Group__3 ;
    public final void rule__RTD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1017:1: ( rule__RTD__Group__2__Impl rule__RTD__Group__3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1018:2: rule__RTD__Group__2__Impl rule__RTD__Group__3
            {
            pushFollow(FOLLOW_rule__RTD__Group__2__Impl_in_rule__RTD__Group__22041);
            rule__RTD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__3_in_rule__RTD__Group__22044);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1025:1: rule__RTD__Group__2__Impl : ( ( rule__RTD__DomainAssignment_2 ) ) ;
    public final void rule__RTD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1029:1: ( ( ( rule__RTD__DomainAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1030:1: ( ( rule__RTD__DomainAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1030:1: ( ( rule__RTD__DomainAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1031:1: ( rule__RTD__DomainAssignment_2 )
            {
             before(grammarAccess.getRTDAccess().getDomainAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1032:1: ( rule__RTD__DomainAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1032:2: rule__RTD__DomainAssignment_2
            {
            pushFollow(FOLLOW_rule__RTD__DomainAssignment_2_in_rule__RTD__Group__2__Impl2071);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1042:1: rule__RTD__Group__3 : rule__RTD__Group__3__Impl rule__RTD__Group__4 ;
    public final void rule__RTD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1046:1: ( rule__RTD__Group__3__Impl rule__RTD__Group__4 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1047:2: rule__RTD__Group__3__Impl rule__RTD__Group__4
            {
            pushFollow(FOLLOW_rule__RTD__Group__3__Impl_in_rule__RTD__Group__32101);
            rule__RTD__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__4_in_rule__RTD__Group__32104);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1054:1: rule__RTD__Group__3__Impl : ( '*' ) ;
    public final void rule__RTD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1058:1: ( ( '*' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1059:1: ( '*' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1059:1: ( '*' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1060:1: '*'
            {
             before(grammarAccess.getRTDAccess().getAsteriskKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__RTD__Group__3__Impl2132); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1073:1: rule__RTD__Group__4 : rule__RTD__Group__4__Impl ;
    public final void rule__RTD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1077:1: ( rule__RTD__Group__4__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1078:2: rule__RTD__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RTD__Group__4__Impl_in_rule__RTD__Group__42163);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1084:1: rule__RTD__Group__4__Impl : ( ( rule__RTD__CoDomainAssignment_4 ) ) ;
    public final void rule__RTD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1088:1: ( ( ( rule__RTD__CoDomainAssignment_4 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1089:1: ( ( rule__RTD__CoDomainAssignment_4 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1089:1: ( ( rule__RTD__CoDomainAssignment_4 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1090:1: ( rule__RTD__CoDomainAssignment_4 )
            {
             before(grammarAccess.getRTDAccess().getCoDomainAssignment_4()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1091:1: ( rule__RTD__CoDomainAssignment_4 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1091:2: rule__RTD__CoDomainAssignment_4
            {
            pushFollow(FOLLOW_rule__RTD__CoDomainAssignment_4_in_rule__RTD__Group__4__Impl2190);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1111:1: rule__ED__Group__0 : rule__ED__Group__0__Impl rule__ED__Group__1 ;
    public final void rule__ED__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1115:1: ( rule__ED__Group__0__Impl rule__ED__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1116:2: rule__ED__Group__0__Impl rule__ED__Group__1
            {
            pushFollow(FOLLOW_rule__ED__Group__0__Impl_in_rule__ED__Group__02230);
            rule__ED__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group__1_in_rule__ED__Group__02233);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1123:1: rule__ED__Group__0__Impl : ( ( rule__ED__NameAssignment_0 ) ) ;
    public final void rule__ED__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1127:1: ( ( ( rule__ED__NameAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1128:1: ( ( rule__ED__NameAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1128:1: ( ( rule__ED__NameAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1129:1: ( rule__ED__NameAssignment_0 )
            {
             before(grammarAccess.getEDAccess().getNameAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1130:1: ( rule__ED__NameAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1130:2: rule__ED__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ED__NameAssignment_0_in_rule__ED__Group__0__Impl2260);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1140:1: rule__ED__Group__1 : rule__ED__Group__1__Impl rule__ED__Group__2 ;
    public final void rule__ED__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1144:1: ( rule__ED__Group__1__Impl rule__ED__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1145:2: rule__ED__Group__1__Impl rule__ED__Group__2
            {
            pushFollow(FOLLOW_rule__ED__Group__1__Impl_in_rule__ED__Group__12290);
            rule__ED__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group__2_in_rule__ED__Group__12293);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1152:1: rule__ED__Group__1__Impl : ( ':' ) ;
    public final void rule__ED__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1156:1: ( ( ':' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1157:1: ( ':' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1157:1: ( ':' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1158:1: ':'
            {
             before(grammarAccess.getEDAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__ED__Group__1__Impl2321); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1171:1: rule__ED__Group__2 : rule__ED__Group__2__Impl ;
    public final void rule__ED__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1175:1: ( rule__ED__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1176:2: rule__ED__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ED__Group__2__Impl_in_rule__ED__Group__22352);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1182:1: rule__ED__Group__2__Impl : ( ( rule__ED__TypeAssignment_2 ) ) ;
    public final void rule__ED__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1186:1: ( ( ( rule__ED__TypeAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1187:1: ( ( rule__ED__TypeAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1187:1: ( ( rule__ED__TypeAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1188:1: ( rule__ED__TypeAssignment_2 )
            {
             before(grammarAccess.getEDAccess().getTypeAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1189:1: ( rule__ED__TypeAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1189:2: rule__ED__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ED__TypeAssignment_2_in_rule__ED__Group__2__Impl2379);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1205:1: rule__RD__Group__0 : rule__RD__Group__0__Impl rule__RD__Group__1 ;
    public final void rule__RD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1209:1: ( rule__RD__Group__0__Impl rule__RD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1210:2: rule__RD__Group__0__Impl rule__RD__Group__1
            {
            pushFollow(FOLLOW_rule__RD__Group__0__Impl_in_rule__RD__Group__02415);
            rule__RD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__1_in_rule__RD__Group__02418);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1217:1: rule__RD__Group__0__Impl : ( ( rule__RD__SourceAssignment_0 ) ) ;
    public final void rule__RD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1221:1: ( ( ( rule__RD__SourceAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1222:1: ( ( rule__RD__SourceAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1222:1: ( ( rule__RD__SourceAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1223:1: ( rule__RD__SourceAssignment_0 )
            {
             before(grammarAccess.getRDAccess().getSourceAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1224:1: ( rule__RD__SourceAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1224:2: rule__RD__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__RD__SourceAssignment_0_in_rule__RD__Group__0__Impl2445);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1234:1: rule__RD__Group__1 : rule__RD__Group__1__Impl rule__RD__Group__2 ;
    public final void rule__RD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1238:1: ( rule__RD__Group__1__Impl rule__RD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1239:2: rule__RD__Group__1__Impl rule__RD__Group__2
            {
            pushFollow(FOLLOW_rule__RD__Group__1__Impl_in_rule__RD__Group__12475);
            rule__RD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__2_in_rule__RD__Group__12478);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1246:1: rule__RD__Group__1__Impl : ( ( rule__RD__RelAssignment_1 ) ) ;
    public final void rule__RD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1250:1: ( ( ( rule__RD__RelAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1251:1: ( ( rule__RD__RelAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1251:1: ( ( rule__RD__RelAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1252:1: ( rule__RD__RelAssignment_1 )
            {
             before(grammarAccess.getRDAccess().getRelAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1253:1: ( rule__RD__RelAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1253:2: rule__RD__RelAssignment_1
            {
            pushFollow(FOLLOW_rule__RD__RelAssignment_1_in_rule__RD__Group__1__Impl2505);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1263:1: rule__RD__Group__2 : rule__RD__Group__2__Impl ;
    public final void rule__RD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1267:1: ( rule__RD__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1268:2: rule__RD__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RD__Group__2__Impl_in_rule__RD__Group__22535);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1274:1: rule__RD__Group__2__Impl : ( ( rule__RD__TargetAssignment_2 ) ) ;
    public final void rule__RD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1278:1: ( ( ( rule__RD__TargetAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1279:1: ( ( rule__RD__TargetAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1279:1: ( ( rule__RD__TargetAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1280:1: ( rule__RD__TargetAssignment_2 )
            {
             before(grammarAccess.getRDAccess().getTargetAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1281:1: ( rule__RD__TargetAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1281:2: rule__RD__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__RD__TargetAssignment_2_in_rule__RD__Group__2__Impl2562);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1297:1: rule__MegaLLinking__Group__0 : rule__MegaLLinking__Group__0__Impl rule__MegaLLinking__Group__1 ;
    public final void rule__MegaLLinking__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1301:1: ( rule__MegaLLinking__Group__0__Impl rule__MegaLLinking__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1302:2: rule__MegaLLinking__Group__0__Impl rule__MegaLLinking__Group__1
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__0__Impl_in_rule__MegaLLinking__Group__02598);
            rule__MegaLLinking__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLLinking__Group__1_in_rule__MegaLLinking__Group__02601);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1309:1: rule__MegaLLinking__Group__0__Impl : ( 'linking' ) ;
    public final void rule__MegaLLinking__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1313:1: ( ( 'linking' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1314:1: ( 'linking' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1314:1: ( 'linking' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1315:1: 'linking'
            {
             before(grammarAccess.getMegaLLinkingAccess().getLinkingKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__MegaLLinking__Group__0__Impl2629); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1328:1: rule__MegaLLinking__Group__1 : rule__MegaLLinking__Group__1__Impl rule__MegaLLinking__Group__2 ;
    public final void rule__MegaLLinking__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1332:1: ( rule__MegaLLinking__Group__1__Impl rule__MegaLLinking__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1333:2: rule__MegaLLinking__Group__1__Impl rule__MegaLLinking__Group__2
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__1__Impl_in_rule__MegaLLinking__Group__12660);
            rule__MegaLLinking__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLLinking__Group__2_in_rule__MegaLLinking__Group__12663);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1340:1: rule__MegaLLinking__Group__1__Impl : ( ( rule__MegaLLinking__NameAssignment_1 ) ) ;
    public final void rule__MegaLLinking__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1344:1: ( ( ( rule__MegaLLinking__NameAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1345:1: ( ( rule__MegaLLinking__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1345:1: ( ( rule__MegaLLinking__NameAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1346:1: ( rule__MegaLLinking__NameAssignment_1 )
            {
             before(grammarAccess.getMegaLLinkingAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1347:1: ( rule__MegaLLinking__NameAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1347:2: rule__MegaLLinking__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MegaLLinking__NameAssignment_1_in_rule__MegaLLinking__Group__1__Impl2690);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1357:1: rule__MegaLLinking__Group__2 : rule__MegaLLinking__Group__2__Impl rule__MegaLLinking__Group__3 ;
    public final void rule__MegaLLinking__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1361:1: ( rule__MegaLLinking__Group__2__Impl rule__MegaLLinking__Group__3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1362:2: rule__MegaLLinking__Group__2__Impl rule__MegaLLinking__Group__3
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__2__Impl_in_rule__MegaLLinking__Group__22720);
            rule__MegaLLinking__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLLinking__Group__3_in_rule__MegaLLinking__Group__22723);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1369:1: rule__MegaLLinking__Group__2__Impl : ( ( rule__MegaLLinking__Group_2__0 )? ) ;
    public final void rule__MegaLLinking__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1373:1: ( ( ( rule__MegaLLinking__Group_2__0 )? ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1374:1: ( ( rule__MegaLLinking__Group_2__0 )? )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1374:1: ( ( rule__MegaLLinking__Group_2__0 )? )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1375:1: ( rule__MegaLLinking__Group_2__0 )?
            {
             before(grammarAccess.getMegaLLinkingAccess().getGroup_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1376:1: ( rule__MegaLLinking__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1376:2: rule__MegaLLinking__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MegaLLinking__Group_2__0_in_rule__MegaLLinking__Group__2__Impl2750);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1386:1: rule__MegaLLinking__Group__3 : rule__MegaLLinking__Group__3__Impl ;
    public final void rule__MegaLLinking__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1390:1: ( rule__MegaLLinking__Group__3__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1391:2: rule__MegaLLinking__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group__3__Impl_in_rule__MegaLLinking__Group__32781);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1397:1: rule__MegaLLinking__Group__3__Impl : ( ( rule__MegaLLinking__LdsAssignment_3 )* ) ;
    public final void rule__MegaLLinking__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1401:1: ( ( ( rule__MegaLLinking__LdsAssignment_3 )* ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1402:1: ( ( rule__MegaLLinking__LdsAssignment_3 )* )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1402:1: ( ( rule__MegaLLinking__LdsAssignment_3 )* )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1403:1: ( rule__MegaLLinking__LdsAssignment_3 )*
            {
             before(grammarAccess.getMegaLLinkingAccess().getLdsAssignment_3()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1404:1: ( rule__MegaLLinking__LdsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1404:2: rule__MegaLLinking__LdsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__MegaLLinking__LdsAssignment_3_in_rule__MegaLLinking__Group__3__Impl2808);
            	    rule__MegaLLinking__LdsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1422:1: rule__MegaLLinking__Group_2__0 : rule__MegaLLinking__Group_2__0__Impl rule__MegaLLinking__Group_2__1 ;
    public final void rule__MegaLLinking__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1426:1: ( rule__MegaLLinking__Group_2__0__Impl rule__MegaLLinking__Group_2__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1427:2: rule__MegaLLinking__Group_2__0__Impl rule__MegaLLinking__Group_2__1
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group_2__0__Impl_in_rule__MegaLLinking__Group_2__02847);
            rule__MegaLLinking__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaLLinking__Group_2__1_in_rule__MegaLLinking__Group_2__02850);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1434:1: rule__MegaLLinking__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__MegaLLinking__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1438:1: ( ( 'for' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1439:1: ( 'for' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1439:1: ( 'for' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1440:1: 'for'
            {
             before(grammarAccess.getMegaLLinkingAccess().getForKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__MegaLLinking__Group_2__0__Impl2878); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1453:1: rule__MegaLLinking__Group_2__1 : rule__MegaLLinking__Group_2__1__Impl ;
    public final void rule__MegaLLinking__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1457:1: ( rule__MegaLLinking__Group_2__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1458:2: rule__MegaLLinking__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MegaLLinking__Group_2__1__Impl_in_rule__MegaLLinking__Group_2__12909);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1464:1: rule__MegaLLinking__Group_2__1__Impl : ( ( rule__MegaLLinking__TargetAssignment_2_1 ) ) ;
    public final void rule__MegaLLinking__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1468:1: ( ( ( rule__MegaLLinking__TargetAssignment_2_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1469:1: ( ( rule__MegaLLinking__TargetAssignment_2_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1469:1: ( ( rule__MegaLLinking__TargetAssignment_2_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1470:1: ( rule__MegaLLinking__TargetAssignment_2_1 )
            {
             before(grammarAccess.getMegaLLinkingAccess().getTargetAssignment_2_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1471:1: ( rule__MegaLLinking__TargetAssignment_2_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1471:2: rule__MegaLLinking__TargetAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MegaLLinking__TargetAssignment_2_1_in_rule__MegaLLinking__Group_2__1__Impl2936);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1485:1: rule__LD__Group__0 : rule__LD__Group__0__Impl rule__LD__Group__1 ;
    public final void rule__LD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1489:1: ( rule__LD__Group__0__Impl rule__LD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1490:2: rule__LD__Group__0__Impl rule__LD__Group__1
            {
            pushFollow(FOLLOW_rule__LD__Group__0__Impl_in_rule__LD__Group__02970);
            rule__LD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LD__Group__1_in_rule__LD__Group__02973);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1497:1: rule__LD__Group__0__Impl : ( ( rule__LD__TargetAssignment_0 ) ) ;
    public final void rule__LD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1501:1: ( ( ( rule__LD__TargetAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1502:1: ( ( rule__LD__TargetAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1502:1: ( ( rule__LD__TargetAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1503:1: ( rule__LD__TargetAssignment_0 )
            {
             before(grammarAccess.getLDAccess().getTargetAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1504:1: ( rule__LD__TargetAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1504:2: rule__LD__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__LD__TargetAssignment_0_in_rule__LD__Group__0__Impl3000);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1514:1: rule__LD__Group__1 : rule__LD__Group__1__Impl rule__LD__Group__2 ;
    public final void rule__LD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1518:1: ( rule__LD__Group__1__Impl rule__LD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1519:2: rule__LD__Group__1__Impl rule__LD__Group__2
            {
            pushFollow(FOLLOW_rule__LD__Group__1__Impl_in_rule__LD__Group__13030);
            rule__LD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LD__Group__2_in_rule__LD__Group__13033);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1526:1: rule__LD__Group__1__Impl : ( '=' ) ;
    public final void rule__LD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1530:1: ( ( '=' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1531:1: ( '=' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1531:1: ( '=' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1532:1: '='
            {
             before(grammarAccess.getLDAccess().getEqualsSignKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__LD__Group__1__Impl3061); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1545:1: rule__LD__Group__2 : rule__LD__Group__2__Impl ;
    public final void rule__LD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1549:1: ( rule__LD__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1550:2: rule__LD__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LD__Group__2__Impl_in_rule__LD__Group__23092);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1556:1: rule__LD__Group__2__Impl : ( ( rule__LD__ValueAssignment_2 ) ) ;
    public final void rule__LD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1560:1: ( ( ( rule__LD__ValueAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1561:1: ( ( rule__LD__ValueAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1561:1: ( ( rule__LD__ValueAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1562:1: ( rule__LD__ValueAssignment_2 )
            {
             before(grammarAccess.getLDAccess().getValueAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1563:1: ( rule__LD__ValueAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1563:2: rule__LD__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__LD__ValueAssignment_2_in_rule__LD__Group__2__Impl3119);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1579:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1583:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1584:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__03155);
            rule__QualifiedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__03158);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1591:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1595:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1596:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1596:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1597:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl3185); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1608:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1612:1: ( rule__QualifiedID__Group__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1613:2: rule__QualifiedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__13214);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1619:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1623:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1624:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1624:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1625:1: ( rule__QualifiedID__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1626:1: ( rule__QualifiedID__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1626:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl3241);
            	    rule__QualifiedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1640:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1644:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1645:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__03276);
            rule__QualifiedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__03279);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1652:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1656:1: ( ( '.' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1657:1: ( '.' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1657:1: ( '.' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1658:1: '.'
            {
             before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__QualifiedID__Group_1__0__Impl3307); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1671:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1675:1: ( rule__QualifiedID__Group_1__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1676:2: rule__QualifiedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__13338);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1682:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1686:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1687:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1687:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1688:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl3365); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1704:1: rule__MegaLDefinition__NameAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__MegaLDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1708:1: ( ( ruleQualifiedID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1709:1: ( ruleQualifiedID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1709:1: ( ruleQualifiedID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1710:1: ruleQualifiedID
            {
             before(grammarAccess.getMegaLDefinitionAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__MegaLDefinition__NameAssignment_13403);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1719:1: rule__MegaLDefinition__LinkerAssignment_2_2 : ( ( ruleQualifiedID ) ) ;
    public final void rule__MegaLDefinition__LinkerAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1723:1: ( ( ( ruleQualifiedID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1724:1: ( ( ruleQualifiedID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1724:1: ( ( ruleQualifiedID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1725:1: ( ruleQualifiedID )
            {
             before(grammarAccess.getMegaLDefinitionAccess().getLinkerMegaLLinkingCrossReference_2_2_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1726:1: ( ruleQualifiedID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1727:1: ruleQualifiedID
            {
             before(grammarAccess.getMegaLDefinitionAccess().getLinkerMegaLLinkingQualifiedIDParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__MegaLDefinition__LinkerAssignment_2_23438);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1738:1: rule__MegaLDefinition__ImportsAssignment_3_0 : ( ruleImport ) ;
    public final void rule__MegaLDefinition__ImportsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1742:1: ( ( ruleImport ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1743:1: ( ruleImport )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1743:1: ( ruleImport )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1744:1: ruleImport
            {
             before(grammarAccess.getMegaLDefinitionAccess().getImportsImportParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__MegaLDefinition__ImportsAssignment_3_03473);
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


    // $ANTLR start "rule__MegaLDefinition__EtdsAssignment_3_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1753:1: rule__MegaLDefinition__EtdsAssignment_3_1 : ( ruleETD ) ;
    public final void rule__MegaLDefinition__EtdsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1757:1: ( ( ruleETD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1758:1: ( ruleETD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1758:1: ( ruleETD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1759:1: ruleETD
            {
             before(grammarAccess.getMegaLDefinitionAccess().getEtdsETDParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleETD_in_rule__MegaLDefinition__EtdsAssignment_3_13504);
            ruleETD();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getEtdsETDParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__MegaLDefinition__EtdsAssignment_3_1"


    // $ANTLR start "rule__MegaLDefinition__RtdsAssignment_3_2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1768:1: rule__MegaLDefinition__RtdsAssignment_3_2 : ( ruleRTD ) ;
    public final void rule__MegaLDefinition__RtdsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1772:1: ( ( ruleRTD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1773:1: ( ruleRTD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1773:1: ( ruleRTD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1774:1: ruleRTD
            {
             before(grammarAccess.getMegaLDefinitionAccess().getRtdsRTDParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleRTD_in_rule__MegaLDefinition__RtdsAssignment_3_23535);
            ruleRTD();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getRtdsRTDParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__MegaLDefinition__RtdsAssignment_3_2"


    // $ANTLR start "rule__MegaLDefinition__EdsAssignment_3_3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1783:1: rule__MegaLDefinition__EdsAssignment_3_3 : ( ruleED ) ;
    public final void rule__MegaLDefinition__EdsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1787:1: ( ( ruleED ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1788:1: ( ruleED )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1788:1: ( ruleED )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1789:1: ruleED
            {
             before(grammarAccess.getMegaLDefinitionAccess().getEdsEDParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleED_in_rule__MegaLDefinition__EdsAssignment_3_33566);
            ruleED();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getEdsEDParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__MegaLDefinition__EdsAssignment_3_3"


    // $ANTLR start "rule__MegaLDefinition__RdsAssignment_3_4"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1798:1: rule__MegaLDefinition__RdsAssignment_3_4 : ( ruleRD ) ;
    public final void rule__MegaLDefinition__RdsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1802:1: ( ( ruleRD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1803:1: ( ruleRD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1803:1: ( ruleRD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1804:1: ruleRD
            {
             before(grammarAccess.getMegaLDefinitionAccess().getRdsRDParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_ruleRD_in_rule__MegaLDefinition__RdsAssignment_3_43597);
            ruleRD();

            state._fsp--;

             after(grammarAccess.getMegaLDefinitionAccess().getRdsRDParserRuleCall_3_4_0()); 

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
    // $ANTLR end "rule__MegaLDefinition__RdsAssignment_3_4"


    // $ANTLR start "rule__Import__RefAssignment_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1813:1: rule__Import__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Import__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1817:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1818:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1818:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1819:1: ( RULE_ID )
            {
             before(grammarAccess.getImportAccess().getRefMegaLDefinitionCrossReference_1_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1820:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1821:1: RULE_ID
            {
             before(grammarAccess.getImportAccess().getRefMegaLDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Import__RefAssignment_13632); 
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


    // $ANTLR start "rule__ETDDeclared__RefAssignment"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1832:1: rule__ETDDeclared__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ETDDeclared__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1836:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1837:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1837:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1838:1: ( RULE_ID )
            {
             before(grammarAccess.getETDDeclaredAccess().getRefETDCrossReference_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1839:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1840:1: RULE_ID
            {
             before(grammarAccess.getETDDeclaredAccess().getRefETDIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ETDDeclared__RefAssignment3671); 
             after(grammarAccess.getETDDeclaredAccess().getRefETDIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getETDDeclaredAccess().getRefETDCrossReference_0()); 

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
    // $ANTLR end "rule__ETDDeclared__RefAssignment"


    // $ANTLR start "rule__ETD__NameAssignment_0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1851:1: rule__ETD__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ETD__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1855:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1856:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1856:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1857:1: RULE_ID
            {
             before(grammarAccess.getETDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ETD__NameAssignment_03706); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1866:1: rule__ETD__SupertypeAssignment_2 : ( ruleETDR ) ;
    public final void rule__ETD__SupertypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1870:1: ( ( ruleETDR ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1871:1: ( ruleETDR )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1871:1: ( ruleETDR )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1872:1: ruleETDR
            {
             before(grammarAccess.getETDAccess().getSupertypeETDRParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleETDR_in_rule__ETD__SupertypeAssignment_23737);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1881:1: rule__RTD__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RTD__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1885:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1886:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1886:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1887:1: RULE_ID
            {
             before(grammarAccess.getRTDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RTD__NameAssignment_03768); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1896:1: rule__RTD__DomainAssignment_2 : ( ruleETDR ) ;
    public final void rule__RTD__DomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1900:1: ( ( ruleETDR ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1901:1: ( ruleETDR )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1901:1: ( ruleETDR )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1902:1: ruleETDR
            {
             before(grammarAccess.getRTDAccess().getDomainETDRParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleETDR_in_rule__RTD__DomainAssignment_23799);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1911:1: rule__RTD__CoDomainAssignment_4 : ( ruleETDR ) ;
    public final void rule__RTD__CoDomainAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1915:1: ( ( ruleETDR ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1916:1: ( ruleETDR )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1916:1: ( ruleETDR )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1917:1: ruleETDR
            {
             before(grammarAccess.getRTDAccess().getCoDomainETDRParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleETDR_in_rule__RTD__CoDomainAssignment_43830);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1926:1: rule__ED__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ED__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1930:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1931:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1931:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1932:1: RULE_ID
            {
             before(grammarAccess.getEDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ED__NameAssignment_03861); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1941:1: rule__ED__TypeAssignment_2 : ( ruleETDR ) ;
    public final void rule__ED__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1945:1: ( ( ruleETDR ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1946:1: ( ruleETDR )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1946:1: ( ruleETDR )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1947:1: ruleETDR
            {
             before(grammarAccess.getEDAccess().getTypeETDRParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleETDR_in_rule__ED__TypeAssignment_23892);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1956:1: rule__RD__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RD__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1960:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1961:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1961:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1962:1: ( RULE_ID )
            {
             before(grammarAccess.getRDAccess().getSourceEDCrossReference_0_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1963:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1964:1: RULE_ID
            {
             before(grammarAccess.getRDAccess().getSourceEDIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RD__SourceAssignment_03927); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1975:1: rule__RD__RelAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RD__RelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1979:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1980:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1980:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1981:1: ( RULE_ID )
            {
             before(grammarAccess.getRDAccess().getRelRTDCrossReference_1_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1982:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1983:1: RULE_ID
            {
             before(grammarAccess.getRDAccess().getRelRTDIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RD__RelAssignment_13966); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1994:1: rule__RD__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RD__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1998:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1999:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1999:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2000:1: ( RULE_ID )
            {
             before(grammarAccess.getRDAccess().getTargetEDCrossReference_2_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2001:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2002:1: RULE_ID
            {
             before(grammarAccess.getRDAccess().getTargetEDIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RD__TargetAssignment_24005); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2013:1: rule__MegaLLinking__NameAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__MegaLLinking__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2017:1: ( ( ruleQualifiedID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2018:1: ( ruleQualifiedID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2018:1: ( ruleQualifiedID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2019:1: ruleQualifiedID
            {
             before(grammarAccess.getMegaLLinkingAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__MegaLLinking__NameAssignment_14040);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2028:1: rule__MegaLLinking__TargetAssignment_2_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__MegaLLinking__TargetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2032:1: ( ( ( ruleQualifiedID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2033:1: ( ( ruleQualifiedID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2033:1: ( ( ruleQualifiedID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2034:1: ( ruleQualifiedID )
            {
             before(grammarAccess.getMegaLLinkingAccess().getTargetMegaLDefinitionCrossReference_2_1_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2035:1: ( ruleQualifiedID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2036:1: ruleQualifiedID
            {
             before(grammarAccess.getMegaLLinkingAccess().getTargetMegaLDefinitionQualifiedIDParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__MegaLLinking__TargetAssignment_2_14075);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2047:1: rule__MegaLLinking__LdsAssignment_3 : ( ruleLD ) ;
    public final void rule__MegaLLinking__LdsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2051:1: ( ( ruleLD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2052:1: ( ruleLD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2052:1: ( ruleLD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2053:1: ruleLD
            {
             before(grammarAccess.getMegaLLinkingAccess().getLdsLDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLD_in_rule__MegaLLinking__LdsAssignment_34110);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2062:1: rule__LD__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LD__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2066:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2067:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2067:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2068:1: ( RULE_ID )
            {
             before(grammarAccess.getLDAccess().getTargetEDCrossReference_0_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2069:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2070:1: RULE_ID
            {
             before(grammarAccess.getLDAccess().getTargetEDIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LD__TargetAssignment_04145); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2081:1: rule__LD__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LD__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2085:1: ( ( RULE_STRING ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2086:1: ( RULE_STRING )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2086:1: ( RULE_STRING )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:2087:1: RULE_STRING
            {
             before(grammarAccess.getLDAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LD__ValueAssignment_24180); 
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
            return "446:1: rule__MegaLDefinition__Alternatives_3 : ( ( ( rule__MegaLDefinition__ImportsAssignment_3_0 ) ) | ( ( rule__MegaLDefinition__EtdsAssignment_3_1 ) ) | ( ( rule__MegaLDefinition__RtdsAssignment_3_2 ) ) | ( ( rule__MegaLDefinition__EdsAssignment_3_3 ) ) | ( ( rule__MegaLDefinition__RdsAssignment_3_4 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLDefinition_in_entryRuleMegaLDefinition121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaLDefinition128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__0_in_ruleMegaLDefinition154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_entryRuleETDR241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDR248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDR__Alternatives_in_ruleETDR274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDEntity_in_entryRuleETDEntity301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDEntity308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDEntity__Group__0_in_ruleETDEntity334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDDeclared_in_entryRuleETDDeclared361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDDeclared368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDDeclared__RefAssignment_in_ruleETDDeclared394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_entryRuleETD421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETD428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__0_in_ruleETD454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_entryRuleRTD481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTD488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__0_in_ruleRTD514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_entryRuleED541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleED548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__0_in_ruleED574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_entryRuleRD601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRD608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__0_in_ruleRD634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLLinking_in_entryRuleMegaLLinking661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaLLinking668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__0_in_ruleMegaLLinking694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLD_in_entryRuleLD721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLD728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group__0_in_ruleLD754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLDefinition_in_rule__Model__Alternatives850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMegaLLinking_in_rule__Model__Alternatives867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__ImportsAssignment_3_0_in_rule__MegaLDefinition__Alternatives_3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__EtdsAssignment_3_1_in_rule__MegaLDefinition__Alternatives_3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__RtdsAssignment_3_2_in_rule__MegaLDefinition__Alternatives_3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__EdsAssignment_3_3_in_rule__MegaLDefinition__Alternatives_3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__RdsAssignment_3_4_in_rule__MegaLDefinition__Alternatives_3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDEntity_in_rule__ETDR__Alternatives1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDDeclared_in_rule__ETDR__Alternatives1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__0__Impl_in_rule__MegaLDefinition__Group__01051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__1_in_rule__MegaLDefinition__Group__01054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__MegaLDefinition__Group__0__Impl1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__1__Impl_in_rule__MegaLDefinition__Group__11113 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__2_in_rule__MegaLDefinition__Group__11116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__NameAssignment_1_in_rule__MegaLDefinition__Group__1__Impl1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__2__Impl_in_rule__MegaLDefinition__Group__21173 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__3_in_rule__MegaLDefinition__Group__21176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__0_in_rule__MegaLDefinition__Group__2__Impl1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group__3__Impl_in_rule__MegaLDefinition__Group__31234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Alternatives_3_in_rule__MegaLDefinition__Group__3__Impl1261 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__0__Impl_in_rule__MegaLDefinition__Group_2__01300 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__1_in_rule__MegaLDefinition__Group_2__01303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MegaLDefinition__Group_2__0__Impl1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__1__Impl_in_rule__MegaLDefinition__Group_2__11362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__2_in_rule__MegaLDefinition__Group_2__11365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MegaLDefinition__Group_2__1__Impl1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__Group_2__2__Impl_in_rule__MegaLDefinition__Group_2__21424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLDefinition__LinkerAssignment_2_2_in_rule__MegaLDefinition__Group_2__2__Impl1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Import__Group__0__Impl1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__RefAssignment_1_in_rule__Import__Group__1__Impl1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDEntity__Group__0__Impl_in_rule__ETDEntity__Group__01610 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ETDEntity__Group__1_in_rule__ETDEntity__Group__01613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDEntity__Group__1__Impl_in_rule__ETDEntity__Group__11671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ETDEntity__Group__1__Impl1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__0__Impl_in_rule__ETD__Group__01734 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ETD__Group__1_in_rule__ETD__Group__01737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__NameAssignment_0_in_rule__ETD__Group__0__Impl1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__1__Impl_in_rule__ETD__Group__11794 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__ETD__Group__2_in_rule__ETD__Group__11797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ETD__Group__1__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__2__Impl_in_rule__ETD__Group__21856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__SupertypeAssignment_2_in_rule__ETD__Group__2__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__0__Impl_in_rule__RTD__Group__01919 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RTD__Group__1_in_rule__RTD__Group__01922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__NameAssignment_0_in_rule__RTD__Group__0__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__1__Impl_in_rule__RTD__Group__11979 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__RTD__Group__2_in_rule__RTD__Group__11982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RTD__Group__1__Impl2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__2__Impl_in_rule__RTD__Group__22041 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RTD__Group__3_in_rule__RTD__Group__22044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__DomainAssignment_2_in_rule__RTD__Group__2__Impl2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__3__Impl_in_rule__RTD__Group__32101 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__RTD__Group__4_in_rule__RTD__Group__32104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RTD__Group__3__Impl2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__4__Impl_in_rule__RTD__Group__42163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__CoDomainAssignment_4_in_rule__RTD__Group__4__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__0__Impl_in_rule__ED__Group__02230 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ED__Group__1_in_rule__ED__Group__02233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__NameAssignment_0_in_rule__ED__Group__0__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__1__Impl_in_rule__ED__Group__12290 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__ED__Group__2_in_rule__ED__Group__12293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ED__Group__1__Impl2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__2__Impl_in_rule__ED__Group__22352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__TypeAssignment_2_in_rule__ED__Group__2__Impl2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__0__Impl_in_rule__RD__Group__02415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RD__Group__1_in_rule__RD__Group__02418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__SourceAssignment_0_in_rule__RD__Group__0__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__1__Impl_in_rule__RD__Group__12475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RD__Group__2_in_rule__RD__Group__12478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__RelAssignment_1_in_rule__RD__Group__1__Impl2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__2__Impl_in_rule__RD__Group__22535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__TargetAssignment_2_in_rule__RD__Group__2__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__0__Impl_in_rule__MegaLLinking__Group__02598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__1_in_rule__MegaLLinking__Group__02601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MegaLLinking__Group__0__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__1__Impl_in_rule__MegaLLinking__Group__12660 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__2_in_rule__MegaLLinking__Group__12663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__NameAssignment_1_in_rule__MegaLLinking__Group__1__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__2__Impl_in_rule__MegaLLinking__Group__22720 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__3_in_rule__MegaLLinking__Group__22723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group_2__0_in_rule__MegaLLinking__Group__2__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group__3__Impl_in_rule__MegaLLinking__Group__32781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__LdsAssignment_3_in_rule__MegaLLinking__Group__3__Impl2808 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group_2__0__Impl_in_rule__MegaLLinking__Group_2__02847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group_2__1_in_rule__MegaLLinking__Group_2__02850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MegaLLinking__Group_2__0__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__Group_2__1__Impl_in_rule__MegaLLinking__Group_2__12909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaLLinking__TargetAssignment_2_1_in_rule__MegaLLinking__Group_2__1__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group__0__Impl_in_rule__LD__Group__02970 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__LD__Group__1_in_rule__LD__Group__02973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__TargetAssignment_0_in_rule__LD__Group__0__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group__1__Impl_in_rule__LD__Group__13030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LD__Group__2_in_rule__LD__Group__13033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LD__Group__1__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__Group__2__Impl_in_rule__LD__Group__23092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LD__ValueAssignment_2_in_rule__LD__Group__2__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__03155 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__03158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__13214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl3241 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__03276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__03279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__QualifiedID__Group_1__0__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__13338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MegaLDefinition__NameAssignment_13403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MegaLDefinition__LinkerAssignment_2_23438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__MegaLDefinition__ImportsAssignment_3_03473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_rule__MegaLDefinition__EtdsAssignment_3_13504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_rule__MegaLDefinition__RtdsAssignment_3_23535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_rule__MegaLDefinition__EdsAssignment_3_33566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_rule__MegaLDefinition__RdsAssignment_3_43597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Import__RefAssignment_13632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ETDDeclared__RefAssignment3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ETD__NameAssignment_03706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_rule__ETD__SupertypeAssignment_23737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RTD__NameAssignment_03768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_rule__RTD__DomainAssignment_23799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_rule__RTD__CoDomainAssignment_43830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ED__NameAssignment_03861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_rule__ED__TypeAssignment_23892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RD__SourceAssignment_03927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RD__RelAssignment_13966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RD__TargetAssignment_24005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MegaLLinking__NameAssignment_14040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MegaLLinking__TargetAssignment_2_14075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLD_in_rule__MegaLLinking__LdsAssignment_34110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LD__TargetAssignment_04145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LD__ValueAssignment_24180 = new BitSet(new long[]{0x0000000000000002L});

}