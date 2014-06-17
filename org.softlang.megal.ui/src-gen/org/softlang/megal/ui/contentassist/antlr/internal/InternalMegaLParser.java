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




    // $ANTLR start "entryRuleMegaL"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:60:1: entryRuleMegaL : ruleMegaL EOF ;
    public final void entryRuleMegaL() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:61:1: ( ruleMegaL EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:62:1: ruleMegaL EOF
            {
             before(grammarAccess.getMegaLRule()); 
            pushFollow(FOLLOW_ruleMegaL_in_entryRuleMegaL61);
            ruleMegaL();

            state._fsp--;

             after(grammarAccess.getMegaLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMegaL68); 

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
    // $ANTLR end "entryRuleMegaL"


    // $ANTLR start "ruleMegaL"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:69:1: ruleMegaL : ( ( rule__MegaL__Group__0 ) ) ;
    public final void ruleMegaL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:73:2: ( ( ( rule__MegaL__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:74:1: ( ( rule__MegaL__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:74:1: ( ( rule__MegaL__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:75:1: ( rule__MegaL__Group__0 )
            {
             before(grammarAccess.getMegaLAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:76:1: ( rule__MegaL__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:76:2: rule__MegaL__Group__0
            {
            pushFollow(FOLLOW_rule__MegaL__Group__0_in_ruleMegaL94);
            rule__MegaL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegaLAccess().getGroup()); 

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
    // $ANTLR end "ruleMegaL"


    // $ANTLR start "entryRuleETDR"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:88:1: entryRuleETDR : ruleETDR EOF ;
    public final void entryRuleETDR() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:89:1: ( ruleETDR EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:90:1: ruleETDR EOF
            {
             before(grammarAccess.getETDRRule()); 
            pushFollow(FOLLOW_ruleETDR_in_entryRuleETDR121);
            ruleETDR();

            state._fsp--;

             after(grammarAccess.getETDRRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDR128); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:97:1: ruleETDR : ( ( rule__ETDR__Alternatives ) ) ;
    public final void ruleETDR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:101:2: ( ( ( rule__ETDR__Alternatives ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:102:1: ( ( rule__ETDR__Alternatives ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:102:1: ( ( rule__ETDR__Alternatives ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:103:1: ( rule__ETDR__Alternatives )
            {
             before(grammarAccess.getETDRAccess().getAlternatives()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:104:1: ( rule__ETDR__Alternatives )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:104:2: rule__ETDR__Alternatives
            {
            pushFollow(FOLLOW_rule__ETDR__Alternatives_in_ruleETDR154);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:116:1: entryRuleETDEntity : ruleETDEntity EOF ;
    public final void entryRuleETDEntity() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:117:1: ( ruleETDEntity EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:118:1: ruleETDEntity EOF
            {
             before(grammarAccess.getETDEntityRule()); 
            pushFollow(FOLLOW_ruleETDEntity_in_entryRuleETDEntity181);
            ruleETDEntity();

            state._fsp--;

             after(grammarAccess.getETDEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDEntity188); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:125:1: ruleETDEntity : ( ( rule__ETDEntity__Group__0 ) ) ;
    public final void ruleETDEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:129:2: ( ( ( rule__ETDEntity__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:130:1: ( ( rule__ETDEntity__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:130:1: ( ( rule__ETDEntity__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:131:1: ( rule__ETDEntity__Group__0 )
            {
             before(grammarAccess.getETDEntityAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:132:1: ( rule__ETDEntity__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:132:2: rule__ETDEntity__Group__0
            {
            pushFollow(FOLLOW_rule__ETDEntity__Group__0_in_ruleETDEntity214);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:144:1: entryRuleETDDeclared : ruleETDDeclared EOF ;
    public final void entryRuleETDDeclared() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:145:1: ( ruleETDDeclared EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:146:1: ruleETDDeclared EOF
            {
             before(grammarAccess.getETDDeclaredRule()); 
            pushFollow(FOLLOW_ruleETDDeclared_in_entryRuleETDDeclared241);
            ruleETDDeclared();

            state._fsp--;

             after(grammarAccess.getETDDeclaredRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDDeclared248); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:153:1: ruleETDDeclared : ( ( rule__ETDDeclared__ReferenceAssignment ) ) ;
    public final void ruleETDDeclared() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:157:2: ( ( ( rule__ETDDeclared__ReferenceAssignment ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:158:1: ( ( rule__ETDDeclared__ReferenceAssignment ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:158:1: ( ( rule__ETDDeclared__ReferenceAssignment ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:159:1: ( rule__ETDDeclared__ReferenceAssignment )
            {
             before(grammarAccess.getETDDeclaredAccess().getReferenceAssignment()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:160:1: ( rule__ETDDeclared__ReferenceAssignment )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:160:2: rule__ETDDeclared__ReferenceAssignment
            {
            pushFollow(FOLLOW_rule__ETDDeclared__ReferenceAssignment_in_ruleETDDeclared274);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:172:1: entryRuleETD : ruleETD EOF ;
    public final void entryRuleETD() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:173:1: ( ruleETD EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:174:1: ruleETD EOF
            {
             before(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_ruleETD_in_entryRuleETD301);
            ruleETD();

            state._fsp--;

             after(grammarAccess.getETDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETD308); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:181:1: ruleETD : ( ( rule__ETD__Group__0 ) ) ;
    public final void ruleETD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:185:2: ( ( ( rule__ETD__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:186:1: ( ( rule__ETD__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:186:1: ( ( rule__ETD__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:187:1: ( rule__ETD__Group__0 )
            {
             before(grammarAccess.getETDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:188:1: ( rule__ETD__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:188:2: rule__ETD__Group__0
            {
            pushFollow(FOLLOW_rule__ETD__Group__0_in_ruleETD334);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:200:1: entryRuleRTD : ruleRTD EOF ;
    public final void entryRuleRTD() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:201:1: ( ruleRTD EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:202:1: ruleRTD EOF
            {
             before(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_ruleRTD_in_entryRuleRTD361);
            ruleRTD();

            state._fsp--;

             after(grammarAccess.getRTDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTD368); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:209:1: ruleRTD : ( ( rule__RTD__Group__0 ) ) ;
    public final void ruleRTD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:213:2: ( ( ( rule__RTD__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:214:1: ( ( rule__RTD__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:214:1: ( ( rule__RTD__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:215:1: ( rule__RTD__Group__0 )
            {
             before(grammarAccess.getRTDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:216:1: ( rule__RTD__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:216:2: rule__RTD__Group__0
            {
            pushFollow(FOLLOW_rule__RTD__Group__0_in_ruleRTD394);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:237:1: ruleED : ( ( rule__ED__Group__0 ) ) ;
    public final void ruleED() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:241:2: ( ( ( rule__ED__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:242:1: ( ( rule__ED__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:242:1: ( ( rule__ED__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:243:1: ( rule__ED__Group__0 )
            {
             before(grammarAccess.getEDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:244:1: ( rule__ED__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:244:2: rule__ED__Group__0
            {
            pushFollow(FOLLOW_rule__ED__Group__0_in_ruleED454);
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


    // $ANTLR start "entryRuleQualifiedID"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:284:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:285:1: ( ruleQualifiedID EOF )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:286:1: ruleQualifiedID EOF
            {
             before(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID541);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getQualifiedIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedID548); 

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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:293:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:297:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:298:1: ( ( rule__QualifiedID__Group__0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:298:1: ( ( rule__QualifiedID__Group__0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:299:1: ( rule__QualifiedID__Group__0 )
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:300:1: ( rule__QualifiedID__Group__0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:300:2: rule__QualifiedID__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID574);
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


    // $ANTLR start "rule__MegaL__Alternatives_2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:312:1: rule__MegaL__Alternatives_2 : ( ( ( rule__MegaL__Group_2_0__0 ) ) | ( ( rule__MegaL__EtdAssignment_2_1 ) ) | ( ( rule__MegaL__RtdAssignment_2_2 ) ) | ( ( rule__MegaL__EdAssignment_2_3 ) ) | ( ( rule__MegaL__RdAssignment_2_4 ) ) );
    public final void rule__MegaL__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:316:1: ( ( ( rule__MegaL__Group_2_0__0 ) ) | ( ( rule__MegaL__EtdAssignment_2_1 ) ) | ( ( rule__MegaL__RtdAssignment_2_2 ) ) | ( ( rule__MegaL__EdAssignment_2_3 ) ) | ( ( rule__MegaL__RdAssignment_2_4 ) ) )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:317:1: ( ( rule__MegaL__Group_2_0__0 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:317:1: ( ( rule__MegaL__Group_2_0__0 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:318:1: ( rule__MegaL__Group_2_0__0 )
                    {
                     before(grammarAccess.getMegaLAccess().getGroup_2_0()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:319:1: ( rule__MegaL__Group_2_0__0 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:319:2: rule__MegaL__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__MegaL__Group_2_0__0_in_rule__MegaL__Alternatives_2610);
                    rule__MegaL__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:323:6: ( ( rule__MegaL__EtdAssignment_2_1 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:323:6: ( ( rule__MegaL__EtdAssignment_2_1 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:324:1: ( rule__MegaL__EtdAssignment_2_1 )
                    {
                     before(grammarAccess.getMegaLAccess().getEtdAssignment_2_1()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:325:1: ( rule__MegaL__EtdAssignment_2_1 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:325:2: rule__MegaL__EtdAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__MegaL__EtdAssignment_2_1_in_rule__MegaL__Alternatives_2628);
                    rule__MegaL__EtdAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLAccess().getEtdAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:329:6: ( ( rule__MegaL__RtdAssignment_2_2 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:329:6: ( ( rule__MegaL__RtdAssignment_2_2 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:330:1: ( rule__MegaL__RtdAssignment_2_2 )
                    {
                     before(grammarAccess.getMegaLAccess().getRtdAssignment_2_2()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:331:1: ( rule__MegaL__RtdAssignment_2_2 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:331:2: rule__MegaL__RtdAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__MegaL__RtdAssignment_2_2_in_rule__MegaL__Alternatives_2646);
                    rule__MegaL__RtdAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLAccess().getRtdAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:335:6: ( ( rule__MegaL__EdAssignment_2_3 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:335:6: ( ( rule__MegaL__EdAssignment_2_3 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:336:1: ( rule__MegaL__EdAssignment_2_3 )
                    {
                     before(grammarAccess.getMegaLAccess().getEdAssignment_2_3()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:337:1: ( rule__MegaL__EdAssignment_2_3 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:337:2: rule__MegaL__EdAssignment_2_3
                    {
                    pushFollow(FOLLOW_rule__MegaL__EdAssignment_2_3_in_rule__MegaL__Alternatives_2664);
                    rule__MegaL__EdAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLAccess().getEdAssignment_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:341:6: ( ( rule__MegaL__RdAssignment_2_4 ) )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:341:6: ( ( rule__MegaL__RdAssignment_2_4 ) )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:342:1: ( rule__MegaL__RdAssignment_2_4 )
                    {
                     before(grammarAccess.getMegaLAccess().getRdAssignment_2_4()); 
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:343:1: ( rule__MegaL__RdAssignment_2_4 )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:343:2: rule__MegaL__RdAssignment_2_4
                    {
                    pushFollow(FOLLOW_rule__MegaL__RdAssignment_2_4_in_rule__MegaL__Alternatives_2682);
                    rule__MegaL__RdAssignment_2_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegaLAccess().getRdAssignment_2_4()); 

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
    // $ANTLR end "rule__MegaL__Alternatives_2"


    // $ANTLR start "rule__ETDR__Alternatives"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:352:1: rule__ETDR__Alternatives : ( ( ruleETDEntity ) | ( ruleETDDeclared ) );
    public final void rule__ETDR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:356:1: ( ( ruleETDEntity ) | ( ruleETDDeclared ) )
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
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:357:1: ( ruleETDEntity )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:357:1: ( ruleETDEntity )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:358:1: ruleETDEntity
                    {
                     before(grammarAccess.getETDRAccess().getETDEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleETDEntity_in_rule__ETDR__Alternatives715);
                    ruleETDEntity();

                    state._fsp--;

                     after(grammarAccess.getETDRAccess().getETDEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:363:6: ( ruleETDDeclared )
                    {
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:363:6: ( ruleETDDeclared )
                    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:364:1: ruleETDDeclared
                    {
                     before(grammarAccess.getETDRAccess().getETDDeclaredParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleETDDeclared_in_rule__ETDR__Alternatives732);
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


    // $ANTLR start "rule__MegaL__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:376:1: rule__MegaL__Group__0 : rule__MegaL__Group__0__Impl rule__MegaL__Group__1 ;
    public final void rule__MegaL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:380:1: ( rule__MegaL__Group__0__Impl rule__MegaL__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:381:2: rule__MegaL__Group__0__Impl rule__MegaL__Group__1
            {
            pushFollow(FOLLOW_rule__MegaL__Group__0__Impl_in_rule__MegaL__Group__0762);
            rule__MegaL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaL__Group__1_in_rule__MegaL__Group__0765);
            rule__MegaL__Group__1();

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
    // $ANTLR end "rule__MegaL__Group__0"


    // $ANTLR start "rule__MegaL__Group__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:388:1: rule__MegaL__Group__0__Impl : ( 'model' ) ;
    public final void rule__MegaL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:392:1: ( ( 'model' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:393:1: ( 'model' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:393:1: ( 'model' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:394:1: 'model'
            {
             before(grammarAccess.getMegaLAccess().getModelKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__MegaL__Group__0__Impl793); 
             after(grammarAccess.getMegaLAccess().getModelKeyword_0()); 

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
    // $ANTLR end "rule__MegaL__Group__0__Impl"


    // $ANTLR start "rule__MegaL__Group__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:407:1: rule__MegaL__Group__1 : rule__MegaL__Group__1__Impl rule__MegaL__Group__2 ;
    public final void rule__MegaL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:411:1: ( rule__MegaL__Group__1__Impl rule__MegaL__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:412:2: rule__MegaL__Group__1__Impl rule__MegaL__Group__2
            {
            pushFollow(FOLLOW_rule__MegaL__Group__1__Impl_in_rule__MegaL__Group__1824);
            rule__MegaL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaL__Group__2_in_rule__MegaL__Group__1827);
            rule__MegaL__Group__2();

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
    // $ANTLR end "rule__MegaL__Group__1"


    // $ANTLR start "rule__MegaL__Group__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:419:1: rule__MegaL__Group__1__Impl : ( ( rule__MegaL__NameAssignment_1 ) ) ;
    public final void rule__MegaL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:423:1: ( ( ( rule__MegaL__NameAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:424:1: ( ( rule__MegaL__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:424:1: ( ( rule__MegaL__NameAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:425:1: ( rule__MegaL__NameAssignment_1 )
            {
             before(grammarAccess.getMegaLAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:426:1: ( rule__MegaL__NameAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:426:2: rule__MegaL__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MegaL__NameAssignment_1_in_rule__MegaL__Group__1__Impl854);
            rule__MegaL__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegaLAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MegaL__Group__1__Impl"


    // $ANTLR start "rule__MegaL__Group__2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:436:1: rule__MegaL__Group__2 : rule__MegaL__Group__2__Impl ;
    public final void rule__MegaL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:440:1: ( rule__MegaL__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:441:2: rule__MegaL__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MegaL__Group__2__Impl_in_rule__MegaL__Group__2884);
            rule__MegaL__Group__2__Impl();

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
    // $ANTLR end "rule__MegaL__Group__2"


    // $ANTLR start "rule__MegaL__Group__2__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:447:1: rule__MegaL__Group__2__Impl : ( ( rule__MegaL__Alternatives_2 )* ) ;
    public final void rule__MegaL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:451:1: ( ( ( rule__MegaL__Alternatives_2 )* ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:452:1: ( ( rule__MegaL__Alternatives_2 )* )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:452:1: ( ( rule__MegaL__Alternatives_2 )* )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:453:1: ( rule__MegaL__Alternatives_2 )*
            {
             before(grammarAccess.getMegaLAccess().getAlternatives_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:454:1: ( rule__MegaL__Alternatives_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:454:2: rule__MegaL__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__MegaL__Alternatives_2_in_rule__MegaL__Group__2__Impl911);
            	    rule__MegaL__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMegaLAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__MegaL__Group__2__Impl"


    // $ANTLR start "rule__MegaL__Group_2_0__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:470:1: rule__MegaL__Group_2_0__0 : rule__MegaL__Group_2_0__0__Impl rule__MegaL__Group_2_0__1 ;
    public final void rule__MegaL__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:474:1: ( rule__MegaL__Group_2_0__0__Impl rule__MegaL__Group_2_0__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:475:2: rule__MegaL__Group_2_0__0__Impl rule__MegaL__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__MegaL__Group_2_0__0__Impl_in_rule__MegaL__Group_2_0__0948);
            rule__MegaL__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MegaL__Group_2_0__1_in_rule__MegaL__Group_2_0__0951);
            rule__MegaL__Group_2_0__1();

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
    // $ANTLR end "rule__MegaL__Group_2_0__0"


    // $ANTLR start "rule__MegaL__Group_2_0__0__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:482:1: rule__MegaL__Group_2_0__0__Impl : ( 'import' ) ;
    public final void rule__MegaL__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:486:1: ( ( 'import' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:487:1: ( 'import' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:487:1: ( 'import' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:488:1: 'import'
            {
             before(grammarAccess.getMegaLAccess().getImportKeyword_2_0_0()); 
            match(input,12,FOLLOW_12_in_rule__MegaL__Group_2_0__0__Impl979); 
             after(grammarAccess.getMegaLAccess().getImportKeyword_2_0_0()); 

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
    // $ANTLR end "rule__MegaL__Group_2_0__0__Impl"


    // $ANTLR start "rule__MegaL__Group_2_0__1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:501:1: rule__MegaL__Group_2_0__1 : rule__MegaL__Group_2_0__1__Impl ;
    public final void rule__MegaL__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:505:1: ( rule__MegaL__Group_2_0__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:506:2: rule__MegaL__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MegaL__Group_2_0__1__Impl_in_rule__MegaL__Group_2_0__11010);
            rule__MegaL__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__MegaL__Group_2_0__1"


    // $ANTLR start "rule__MegaL__Group_2_0__1__Impl"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:512:1: rule__MegaL__Group_2_0__1__Impl : ( ( rule__MegaL__ImportsAssignment_2_0_1 ) ) ;
    public final void rule__MegaL__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:516:1: ( ( ( rule__MegaL__ImportsAssignment_2_0_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:517:1: ( ( rule__MegaL__ImportsAssignment_2_0_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:517:1: ( ( rule__MegaL__ImportsAssignment_2_0_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:518:1: ( rule__MegaL__ImportsAssignment_2_0_1 )
            {
             before(grammarAccess.getMegaLAccess().getImportsAssignment_2_0_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:519:1: ( rule__MegaL__ImportsAssignment_2_0_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:519:2: rule__MegaL__ImportsAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__MegaL__ImportsAssignment_2_0_1_in_rule__MegaL__Group_2_0__1__Impl1037);
            rule__MegaL__ImportsAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMegaLAccess().getImportsAssignment_2_0_1()); 

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
    // $ANTLR end "rule__MegaL__Group_2_0__1__Impl"


    // $ANTLR start "rule__ETDEntity__Group__0"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:533:1: rule__ETDEntity__Group__0 : rule__ETDEntity__Group__0__Impl rule__ETDEntity__Group__1 ;
    public final void rule__ETDEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:537:1: ( rule__ETDEntity__Group__0__Impl rule__ETDEntity__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:538:2: rule__ETDEntity__Group__0__Impl rule__ETDEntity__Group__1
            {
            pushFollow(FOLLOW_rule__ETDEntity__Group__0__Impl_in_rule__ETDEntity__Group__01071);
            rule__ETDEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETDEntity__Group__1_in_rule__ETDEntity__Group__01074);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:545:1: rule__ETDEntity__Group__0__Impl : ( () ) ;
    public final void rule__ETDEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:549:1: ( ( () ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:550:1: ( () )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:550:1: ( () )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:551:1: ()
            {
             before(grammarAccess.getETDEntityAccess().getETDEntityAction_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:552:1: ()
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:554:1: 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:564:1: rule__ETDEntity__Group__1 : rule__ETDEntity__Group__1__Impl ;
    public final void rule__ETDEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:568:1: ( rule__ETDEntity__Group__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:569:2: rule__ETDEntity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ETDEntity__Group__1__Impl_in_rule__ETDEntity__Group__11132);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:575:1: rule__ETDEntity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__ETDEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:579:1: ( ( 'Entity' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:580:1: ( 'Entity' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:580:1: ( 'Entity' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:581:1: 'Entity'
            {
             before(grammarAccess.getETDEntityAccess().getEntityKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__ETDEntity__Group__1__Impl1160); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:598:1: rule__ETD__Group__0 : rule__ETD__Group__0__Impl rule__ETD__Group__1 ;
    public final void rule__ETD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:602:1: ( rule__ETD__Group__0__Impl rule__ETD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:603:2: rule__ETD__Group__0__Impl rule__ETD__Group__1
            {
            pushFollow(FOLLOW_rule__ETD__Group__0__Impl_in_rule__ETD__Group__01195);
            rule__ETD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__1_in_rule__ETD__Group__01198);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:610:1: rule__ETD__Group__0__Impl : ( ( rule__ETD__NameAssignment_0 ) ) ;
    public final void rule__ETD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:614:1: ( ( ( rule__ETD__NameAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:615:1: ( ( rule__ETD__NameAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:615:1: ( ( rule__ETD__NameAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:616:1: ( rule__ETD__NameAssignment_0 )
            {
             before(grammarAccess.getETDAccess().getNameAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:617:1: ( rule__ETD__NameAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:617:2: rule__ETD__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ETD__NameAssignment_0_in_rule__ETD__Group__0__Impl1225);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:627:1: rule__ETD__Group__1 : rule__ETD__Group__1__Impl rule__ETD__Group__2 ;
    public final void rule__ETD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:631:1: ( rule__ETD__Group__1__Impl rule__ETD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:632:2: rule__ETD__Group__1__Impl rule__ETD__Group__2
            {
            pushFollow(FOLLOW_rule__ETD__Group__1__Impl_in_rule__ETD__Group__11255);
            rule__ETD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__2_in_rule__ETD__Group__11258);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:639:1: rule__ETD__Group__1__Impl : ( '<' ) ;
    public final void rule__ETD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:643:1: ( ( '<' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:644:1: ( '<' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:644:1: ( '<' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:645:1: '<'
            {
             before(grammarAccess.getETDAccess().getLessThanSignKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__ETD__Group__1__Impl1286); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:658:1: rule__ETD__Group__2 : rule__ETD__Group__2__Impl ;
    public final void rule__ETD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:662:1: ( rule__ETD__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:663:2: rule__ETD__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ETD__Group__2__Impl_in_rule__ETD__Group__21317);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:669:1: rule__ETD__Group__2__Impl : ( ( rule__ETD__SupertypeAssignment_2 ) ) ;
    public final void rule__ETD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:673:1: ( ( ( rule__ETD__SupertypeAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:674:1: ( ( rule__ETD__SupertypeAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:674:1: ( ( rule__ETD__SupertypeAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:675:1: ( rule__ETD__SupertypeAssignment_2 )
            {
             before(grammarAccess.getETDAccess().getSupertypeAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:676:1: ( rule__ETD__SupertypeAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:676:2: rule__ETD__SupertypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ETD__SupertypeAssignment_2_in_rule__ETD__Group__2__Impl1344);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:692:1: rule__RTD__Group__0 : rule__RTD__Group__0__Impl rule__RTD__Group__1 ;
    public final void rule__RTD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:696:1: ( rule__RTD__Group__0__Impl rule__RTD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:697:2: rule__RTD__Group__0__Impl rule__RTD__Group__1
            {
            pushFollow(FOLLOW_rule__RTD__Group__0__Impl_in_rule__RTD__Group__01380);
            rule__RTD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__1_in_rule__RTD__Group__01383);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:704:1: rule__RTD__Group__0__Impl : ( ( rule__RTD__NameAssignment_0 ) ) ;
    public final void rule__RTD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:708:1: ( ( ( rule__RTD__NameAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:709:1: ( ( rule__RTD__NameAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:709:1: ( ( rule__RTD__NameAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:710:1: ( rule__RTD__NameAssignment_0 )
            {
             before(grammarAccess.getRTDAccess().getNameAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:711:1: ( rule__RTD__NameAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:711:2: rule__RTD__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__RTD__NameAssignment_0_in_rule__RTD__Group__0__Impl1410);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:721:1: rule__RTD__Group__1 : rule__RTD__Group__1__Impl rule__RTD__Group__2 ;
    public final void rule__RTD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:725:1: ( rule__RTD__Group__1__Impl rule__RTD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:726:2: rule__RTD__Group__1__Impl rule__RTD__Group__2
            {
            pushFollow(FOLLOW_rule__RTD__Group__1__Impl_in_rule__RTD__Group__11440);
            rule__RTD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__2_in_rule__RTD__Group__11443);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:733:1: rule__RTD__Group__1__Impl : ( '<' ) ;
    public final void rule__RTD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:737:1: ( ( '<' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:738:1: ( '<' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:738:1: ( '<' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:739:1: '<'
            {
             before(grammarAccess.getRTDAccess().getLessThanSignKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__RTD__Group__1__Impl1471); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:752:1: rule__RTD__Group__2 : rule__RTD__Group__2__Impl rule__RTD__Group__3 ;
    public final void rule__RTD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:756:1: ( rule__RTD__Group__2__Impl rule__RTD__Group__3 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:757:2: rule__RTD__Group__2__Impl rule__RTD__Group__3
            {
            pushFollow(FOLLOW_rule__RTD__Group__2__Impl_in_rule__RTD__Group__21502);
            rule__RTD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__3_in_rule__RTD__Group__21505);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:764:1: rule__RTD__Group__2__Impl : ( ( rule__RTD__DomainAssignment_2 ) ) ;
    public final void rule__RTD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:768:1: ( ( ( rule__RTD__DomainAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:769:1: ( ( rule__RTD__DomainAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:769:1: ( ( rule__RTD__DomainAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:770:1: ( rule__RTD__DomainAssignment_2 )
            {
             before(grammarAccess.getRTDAccess().getDomainAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:771:1: ( rule__RTD__DomainAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:771:2: rule__RTD__DomainAssignment_2
            {
            pushFollow(FOLLOW_rule__RTD__DomainAssignment_2_in_rule__RTD__Group__2__Impl1532);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:781:1: rule__RTD__Group__3 : rule__RTD__Group__3__Impl rule__RTD__Group__4 ;
    public final void rule__RTD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:785:1: ( rule__RTD__Group__3__Impl rule__RTD__Group__4 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:786:2: rule__RTD__Group__3__Impl rule__RTD__Group__4
            {
            pushFollow(FOLLOW_rule__RTD__Group__3__Impl_in_rule__RTD__Group__31562);
            rule__RTD__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__4_in_rule__RTD__Group__31565);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:793:1: rule__RTD__Group__3__Impl : ( '*' ) ;
    public final void rule__RTD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:797:1: ( ( '*' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:798:1: ( '*' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:798:1: ( '*' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:799:1: '*'
            {
             before(grammarAccess.getRTDAccess().getAsteriskKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__RTD__Group__3__Impl1593); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:812:1: rule__RTD__Group__4 : rule__RTD__Group__4__Impl ;
    public final void rule__RTD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:816:1: ( rule__RTD__Group__4__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:817:2: rule__RTD__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RTD__Group__4__Impl_in_rule__RTD__Group__41624);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:823:1: rule__RTD__Group__4__Impl : ( ( rule__RTD__CoDomainAssignment_4 ) ) ;
    public final void rule__RTD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:827:1: ( ( ( rule__RTD__CoDomainAssignment_4 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:828:1: ( ( rule__RTD__CoDomainAssignment_4 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:828:1: ( ( rule__RTD__CoDomainAssignment_4 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:829:1: ( rule__RTD__CoDomainAssignment_4 )
            {
             before(grammarAccess.getRTDAccess().getCoDomainAssignment_4()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:830:1: ( rule__RTD__CoDomainAssignment_4 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:830:2: rule__RTD__CoDomainAssignment_4
            {
            pushFollow(FOLLOW_rule__RTD__CoDomainAssignment_4_in_rule__RTD__Group__4__Impl1651);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:850:1: rule__ED__Group__0 : rule__ED__Group__0__Impl rule__ED__Group__1 ;
    public final void rule__ED__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:854:1: ( rule__ED__Group__0__Impl rule__ED__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:855:2: rule__ED__Group__0__Impl rule__ED__Group__1
            {
            pushFollow(FOLLOW_rule__ED__Group__0__Impl_in_rule__ED__Group__01691);
            rule__ED__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group__1_in_rule__ED__Group__01694);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:862:1: rule__ED__Group__0__Impl : ( ( rule__ED__NameAssignment_0 ) ) ;
    public final void rule__ED__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:866:1: ( ( ( rule__ED__NameAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:867:1: ( ( rule__ED__NameAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:867:1: ( ( rule__ED__NameAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:868:1: ( rule__ED__NameAssignment_0 )
            {
             before(grammarAccess.getEDAccess().getNameAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:869:1: ( rule__ED__NameAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:869:2: rule__ED__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ED__NameAssignment_0_in_rule__ED__Group__0__Impl1721);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:879:1: rule__ED__Group__1 : rule__ED__Group__1__Impl rule__ED__Group__2 ;
    public final void rule__ED__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:883:1: ( rule__ED__Group__1__Impl rule__ED__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:884:2: rule__ED__Group__1__Impl rule__ED__Group__2
            {
            pushFollow(FOLLOW_rule__ED__Group__1__Impl_in_rule__ED__Group__11751);
            rule__ED__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group__2_in_rule__ED__Group__11754);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:891:1: rule__ED__Group__1__Impl : ( ':' ) ;
    public final void rule__ED__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:895:1: ( ( ':' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:896:1: ( ':' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:896:1: ( ':' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:897:1: ':'
            {
             before(grammarAccess.getEDAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__ED__Group__1__Impl1782); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:910:1: rule__ED__Group__2 : rule__ED__Group__2__Impl ;
    public final void rule__ED__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:914:1: ( rule__ED__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:915:2: rule__ED__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ED__Group__2__Impl_in_rule__ED__Group__21813);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:921:1: rule__ED__Group__2__Impl : ( ( rule__ED__TypeAssignment_2 ) ) ;
    public final void rule__ED__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:925:1: ( ( ( rule__ED__TypeAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:926:1: ( ( rule__ED__TypeAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:926:1: ( ( rule__ED__TypeAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:927:1: ( rule__ED__TypeAssignment_2 )
            {
             before(grammarAccess.getEDAccess().getTypeAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:928:1: ( rule__ED__TypeAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:928:2: rule__ED__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ED__TypeAssignment_2_in_rule__ED__Group__2__Impl1840);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:944:1: rule__RD__Group__0 : rule__RD__Group__0__Impl rule__RD__Group__1 ;
    public final void rule__RD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:948:1: ( rule__RD__Group__0__Impl rule__RD__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:949:2: rule__RD__Group__0__Impl rule__RD__Group__1
            {
            pushFollow(FOLLOW_rule__RD__Group__0__Impl_in_rule__RD__Group__01876);
            rule__RD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__1_in_rule__RD__Group__01879);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:956:1: rule__RD__Group__0__Impl : ( ( rule__RD__SourceAssignment_0 ) ) ;
    public final void rule__RD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:960:1: ( ( ( rule__RD__SourceAssignment_0 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:961:1: ( ( rule__RD__SourceAssignment_0 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:961:1: ( ( rule__RD__SourceAssignment_0 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:962:1: ( rule__RD__SourceAssignment_0 )
            {
             before(grammarAccess.getRDAccess().getSourceAssignment_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:963:1: ( rule__RD__SourceAssignment_0 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:963:2: rule__RD__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__RD__SourceAssignment_0_in_rule__RD__Group__0__Impl1906);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:973:1: rule__RD__Group__1 : rule__RD__Group__1__Impl rule__RD__Group__2 ;
    public final void rule__RD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:977:1: ( rule__RD__Group__1__Impl rule__RD__Group__2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:978:2: rule__RD__Group__1__Impl rule__RD__Group__2
            {
            pushFollow(FOLLOW_rule__RD__Group__1__Impl_in_rule__RD__Group__11936);
            rule__RD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__2_in_rule__RD__Group__11939);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:985:1: rule__RD__Group__1__Impl : ( ( rule__RD__RelAssignment_1 ) ) ;
    public final void rule__RD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:989:1: ( ( ( rule__RD__RelAssignment_1 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:990:1: ( ( rule__RD__RelAssignment_1 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:990:1: ( ( rule__RD__RelAssignment_1 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:991:1: ( rule__RD__RelAssignment_1 )
            {
             before(grammarAccess.getRDAccess().getRelAssignment_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:992:1: ( rule__RD__RelAssignment_1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:992:2: rule__RD__RelAssignment_1
            {
            pushFollow(FOLLOW_rule__RD__RelAssignment_1_in_rule__RD__Group__1__Impl1966);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1002:1: rule__RD__Group__2 : rule__RD__Group__2__Impl ;
    public final void rule__RD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1006:1: ( rule__RD__Group__2__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1007:2: rule__RD__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RD__Group__2__Impl_in_rule__RD__Group__21996);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1013:1: rule__RD__Group__2__Impl : ( ( rule__RD__TargetAssignment_2 ) ) ;
    public final void rule__RD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1017:1: ( ( ( rule__RD__TargetAssignment_2 ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1018:1: ( ( rule__RD__TargetAssignment_2 ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1018:1: ( ( rule__RD__TargetAssignment_2 ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1019:1: ( rule__RD__TargetAssignment_2 )
            {
             before(grammarAccess.getRDAccess().getTargetAssignment_2()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1020:1: ( rule__RD__TargetAssignment_2 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1020:2: rule__RD__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__RD__TargetAssignment_2_in_rule__RD__Group__2__Impl2023);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1036:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1040:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1041:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__02059);
            rule__QualifiedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__02062);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1048:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1052:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1053:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1053:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1054:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl2089); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1065:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1069:1: ( rule__QualifiedID__Group__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1070:2: rule__QualifiedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__12118);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1076:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1080:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1081:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1081:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1082:1: ( rule__QualifiedID__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1083:1: ( rule__QualifiedID__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1083:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl2145);
            	    rule__QualifiedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1097:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1101:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1102:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__02180);
            rule__QualifiedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__02183);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1109:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1113:1: ( ( '.' ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1114:1: ( '.' )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1114:1: ( '.' )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1115:1: '.'
            {
             before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__QualifiedID__Group_1__0__Impl2211); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1128:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1132:1: ( rule__QualifiedID__Group_1__1__Impl )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1133:2: rule__QualifiedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__12242);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1139:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1143:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1144:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1144:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1145:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl2269); 
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


    // $ANTLR start "rule__MegaL__NameAssignment_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1161:1: rule__MegaL__NameAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__MegaL__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1165:1: ( ( ruleQualifiedID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1166:1: ( ruleQualifiedID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1166:1: ( ruleQualifiedID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1167:1: ruleQualifiedID
            {
             before(grammarAccess.getMegaLAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__MegaL__NameAssignment_12307);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getMegaLAccess().getNameQualifiedIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MegaL__NameAssignment_1"


    // $ANTLR start "rule__MegaL__ImportsAssignment_2_0_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1176:1: rule__MegaL__ImportsAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegaL__ImportsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1180:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1181:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1181:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1182:1: ( RULE_ID )
            {
             before(grammarAccess.getMegaLAccess().getImportsMegaLCrossReference_2_0_1_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1183:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1184:1: RULE_ID
            {
             before(grammarAccess.getMegaLAccess().getImportsMegaLIDTerminalRuleCall_2_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MegaL__ImportsAssignment_2_0_12342); 
             after(grammarAccess.getMegaLAccess().getImportsMegaLIDTerminalRuleCall_2_0_1_0_1()); 

            }

             after(grammarAccess.getMegaLAccess().getImportsMegaLCrossReference_2_0_1_0()); 

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
    // $ANTLR end "rule__MegaL__ImportsAssignment_2_0_1"


    // $ANTLR start "rule__MegaL__EtdAssignment_2_1"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1195:1: rule__MegaL__EtdAssignment_2_1 : ( ruleETD ) ;
    public final void rule__MegaL__EtdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1199:1: ( ( ruleETD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1200:1: ( ruleETD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1200:1: ( ruleETD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1201:1: ruleETD
            {
             before(grammarAccess.getMegaLAccess().getEtdETDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleETD_in_rule__MegaL__EtdAssignment_2_12377);
            ruleETD();

            state._fsp--;

             after(grammarAccess.getMegaLAccess().getEtdETDParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__MegaL__EtdAssignment_2_1"


    // $ANTLR start "rule__MegaL__RtdAssignment_2_2"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1210:1: rule__MegaL__RtdAssignment_2_2 : ( ruleRTD ) ;
    public final void rule__MegaL__RtdAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1214:1: ( ( ruleRTD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1215:1: ( ruleRTD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1215:1: ( ruleRTD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1216:1: ruleRTD
            {
             before(grammarAccess.getMegaLAccess().getRtdRTDParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleRTD_in_rule__MegaL__RtdAssignment_2_22408);
            ruleRTD();

            state._fsp--;

             after(grammarAccess.getMegaLAccess().getRtdRTDParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__MegaL__RtdAssignment_2_2"


    // $ANTLR start "rule__MegaL__EdAssignment_2_3"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1225:1: rule__MegaL__EdAssignment_2_3 : ( ruleED ) ;
    public final void rule__MegaL__EdAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1229:1: ( ( ruleED ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1230:1: ( ruleED )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1230:1: ( ruleED )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1231:1: ruleED
            {
             before(grammarAccess.getMegaLAccess().getEdEDParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleED_in_rule__MegaL__EdAssignment_2_32439);
            ruleED();

            state._fsp--;

             after(grammarAccess.getMegaLAccess().getEdEDParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__MegaL__EdAssignment_2_3"


    // $ANTLR start "rule__MegaL__RdAssignment_2_4"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1240:1: rule__MegaL__RdAssignment_2_4 : ( ruleRD ) ;
    public final void rule__MegaL__RdAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1244:1: ( ( ruleRD ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1245:1: ( ruleRD )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1245:1: ( ruleRD )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1246:1: ruleRD
            {
             before(grammarAccess.getMegaLAccess().getRdRDParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_ruleRD_in_rule__MegaL__RdAssignment_2_42470);
            ruleRD();

            state._fsp--;

             after(grammarAccess.getMegaLAccess().getRdRDParserRuleCall_2_4_0()); 

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
    // $ANTLR end "rule__MegaL__RdAssignment_2_4"


    // $ANTLR start "rule__ETDDeclared__ReferenceAssignment"
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1255:1: rule__ETDDeclared__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ETDDeclared__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1259:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1260:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1260:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1261:1: ( RULE_ID )
            {
             before(grammarAccess.getETDDeclaredAccess().getReferenceETDCrossReference_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1262:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1263:1: RULE_ID
            {
             before(grammarAccess.getETDDeclaredAccess().getReferenceETDIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ETDDeclared__ReferenceAssignment2505); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1274:1: rule__ETD__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ETD__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1278:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1279:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1279:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1280:1: RULE_ID
            {
             before(grammarAccess.getETDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ETD__NameAssignment_02540); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1289:1: rule__ETD__SupertypeAssignment_2 : ( ruleETDR ) ;
    public final void rule__ETD__SupertypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1293:1: ( ( ruleETDR ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1294:1: ( ruleETDR )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1294:1: ( ruleETDR )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1295:1: ruleETDR
            {
             before(grammarAccess.getETDAccess().getSupertypeETDRParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleETDR_in_rule__ETD__SupertypeAssignment_22571);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1304:1: rule__RTD__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RTD__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1308:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1309:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1309:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1310:1: RULE_ID
            {
             before(grammarAccess.getRTDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RTD__NameAssignment_02602); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1319:1: rule__RTD__DomainAssignment_2 : ( ruleETDR ) ;
    public final void rule__RTD__DomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1323:1: ( ( ruleETDR ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1324:1: ( ruleETDR )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1324:1: ( ruleETDR )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1325:1: ruleETDR
            {
             before(grammarAccess.getRTDAccess().getDomainETDRParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleETDR_in_rule__RTD__DomainAssignment_22633);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1334:1: rule__RTD__CoDomainAssignment_4 : ( ruleETDR ) ;
    public final void rule__RTD__CoDomainAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1338:1: ( ( ruleETDR ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1339:1: ( ruleETDR )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1339:1: ( ruleETDR )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1340:1: ruleETDR
            {
             before(grammarAccess.getRTDAccess().getCoDomainETDRParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleETDR_in_rule__RTD__CoDomainAssignment_42664);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1349:1: rule__ED__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ED__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1353:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1354:1: ( RULE_ID )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1354:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1355:1: RULE_ID
            {
             before(grammarAccess.getEDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ED__NameAssignment_02695); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1364:1: rule__ED__TypeAssignment_2 : ( ruleETDR ) ;
    public final void rule__ED__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1368:1: ( ( ruleETDR ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1369:1: ( ruleETDR )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1369:1: ( ruleETDR )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1370:1: ruleETDR
            {
             before(grammarAccess.getEDAccess().getTypeETDRParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleETDR_in_rule__ED__TypeAssignment_22726);
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1379:1: rule__RD__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RD__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1383:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1384:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1384:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1385:1: ( RULE_ID )
            {
             before(grammarAccess.getRDAccess().getSourceEDCrossReference_0_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1386:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1387:1: RULE_ID
            {
             before(grammarAccess.getRDAccess().getSourceEDIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RD__SourceAssignment_02761); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1398:1: rule__RD__RelAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RD__RelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1402:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1403:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1403:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1404:1: ( RULE_ID )
            {
             before(grammarAccess.getRDAccess().getRelRTDCrossReference_1_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1405:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1406:1: RULE_ID
            {
             before(grammarAccess.getRDAccess().getRelRTDIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RD__RelAssignment_12800); 
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
    // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1417:1: rule__RD__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RD__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1421:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1422:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1422:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1423:1: ( RULE_ID )
            {
             before(grammarAccess.getRDAccess().getTargetEDCrossReference_2_0()); 
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1424:1: ( RULE_ID )
            // ../org.softlang.megal.ui/src-gen/org/softlang/megal/ui/contentassist/antlr/internal/InternalMegaL.g:1425:1: RULE_ID
            {
             before(grammarAccess.getRDAccess().getTargetEDIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RD__TargetAssignment_22839); 
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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\6\uffff\2\10\2\uffff";
    static final String DFA1_minS =
        "\1\4\1\uffff\2\4\2\uffff\2\4\2\uffff";
    static final String DFA1_maxS =
        "\1\14\1\uffff\1\20\1\15\2\uffff\2\17\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\2\uffff\1\2\1\3";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\7\uffff\1\1",
            "",
            "\1\5\11\uffff\1\3\1\uffff\1\4",
            "\1\7\10\uffff\1\6",
            "",
            "",
            "\1\10\7\uffff\1\10\2\uffff\1\11",
            "\1\10\7\uffff\1\10\2\uffff\1\11",
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
            return "312:1: rule__MegaL__Alternatives_2 : ( ( ( rule__MegaL__Group_2_0__0 ) ) | ( ( rule__MegaL__EtdAssignment_2_1 ) ) | ( ( rule__MegaL__RtdAssignment_2_2 ) ) | ( ( rule__MegaL__EdAssignment_2_3 ) ) | ( ( rule__MegaL__RdAssignment_2_4 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleMegaL_in_entryRuleMegaL61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMegaL68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaL__Group__0_in_ruleMegaL94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_entryRuleETDR121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDR128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDR__Alternatives_in_ruleETDR154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDEntity_in_entryRuleETDEntity181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDEntity188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDEntity__Group__0_in_ruleETDEntity214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDDeclared_in_entryRuleETDDeclared241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDDeclared248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDDeclared__ReferenceAssignment_in_ruleETDDeclared274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_entryRuleETD301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETD308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__0_in_ruleETD334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_entryRuleRTD361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTD368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__0_in_ruleRTD394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_entryRuleED421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleED428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__0_in_ruleED454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_entryRuleRD481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRD488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__0_in_ruleRD514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaL__Group_2_0__0_in_rule__MegaL__Alternatives_2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaL__EtdAssignment_2_1_in_rule__MegaL__Alternatives_2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaL__RtdAssignment_2_2_in_rule__MegaL__Alternatives_2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaL__EdAssignment_2_3_in_rule__MegaL__Alternatives_2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaL__RdAssignment_2_4_in_rule__MegaL__Alternatives_2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDEntity_in_rule__ETDR__Alternatives715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDDeclared_in_rule__ETDR__Alternatives732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaL__Group__0__Impl_in_rule__MegaL__Group__0762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaL__Group__1_in_rule__MegaL__Group__0765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__MegaL__Group__0__Impl793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaL__Group__1__Impl_in_rule__MegaL__Group__1824 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__MegaL__Group__2_in_rule__MegaL__Group__1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaL__NameAssignment_1_in_rule__MegaL__Group__1__Impl854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaL__Group__2__Impl_in_rule__MegaL__Group__2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaL__Alternatives_2_in_rule__MegaL__Group__2__Impl911 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_rule__MegaL__Group_2_0__0__Impl_in_rule__MegaL__Group_2_0__0948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MegaL__Group_2_0__1_in_rule__MegaL__Group_2_0__0951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MegaL__Group_2_0__0__Impl979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaL__Group_2_0__1__Impl_in_rule__MegaL__Group_2_0__11010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MegaL__ImportsAssignment_2_0_1_in_rule__MegaL__Group_2_0__1__Impl1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDEntity__Group__0__Impl_in_rule__ETDEntity__Group__01071 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ETDEntity__Group__1_in_rule__ETDEntity__Group__01074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETDEntity__Group__1__Impl_in_rule__ETDEntity__Group__11132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ETDEntity__Group__1__Impl1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__0__Impl_in_rule__ETD__Group__01195 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ETD__Group__1_in_rule__ETD__Group__01198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__NameAssignment_0_in_rule__ETD__Group__0__Impl1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__1__Impl_in_rule__ETD__Group__11255 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ETD__Group__2_in_rule__ETD__Group__11258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ETD__Group__1__Impl1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__2__Impl_in_rule__ETD__Group__21317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__SupertypeAssignment_2_in_rule__ETD__Group__2__Impl1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__0__Impl_in_rule__RTD__Group__01380 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RTD__Group__1_in_rule__RTD__Group__01383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__NameAssignment_0_in_rule__RTD__Group__0__Impl1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__1__Impl_in_rule__RTD__Group__11440 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__RTD__Group__2_in_rule__RTD__Group__11443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RTD__Group__1__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__2__Impl_in_rule__RTD__Group__21502 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RTD__Group__3_in_rule__RTD__Group__21505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__DomainAssignment_2_in_rule__RTD__Group__2__Impl1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__3__Impl_in_rule__RTD__Group__31562 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__RTD__Group__4_in_rule__RTD__Group__31565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RTD__Group__3__Impl1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__4__Impl_in_rule__RTD__Group__41624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__CoDomainAssignment_4_in_rule__RTD__Group__4__Impl1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__0__Impl_in_rule__ED__Group__01691 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ED__Group__1_in_rule__ED__Group__01694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__NameAssignment_0_in_rule__ED__Group__0__Impl1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__1__Impl_in_rule__ED__Group__11751 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ED__Group__2_in_rule__ED__Group__11754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ED__Group__1__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__2__Impl_in_rule__ED__Group__21813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__TypeAssignment_2_in_rule__ED__Group__2__Impl1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__0__Impl_in_rule__RD__Group__01876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RD__Group__1_in_rule__RD__Group__01879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__SourceAssignment_0_in_rule__RD__Group__0__Impl1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__1__Impl_in_rule__RD__Group__11936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RD__Group__2_in_rule__RD__Group__11939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__RelAssignment_1_in_rule__RD__Group__1__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__2__Impl_in_rule__RD__Group__21996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__TargetAssignment_2_in_rule__RD__Group__2__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__02059 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__02062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__12118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl2145 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__02180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__02183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QualifiedID__Group_1__0__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__12242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MegaL__NameAssignment_12307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MegaL__ImportsAssignment_2_0_12342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_rule__MegaL__EtdAssignment_2_12377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_rule__MegaL__RtdAssignment_2_22408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_rule__MegaL__EdAssignment_2_32439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_rule__MegaL__RdAssignment_2_42470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ETDDeclared__ReferenceAssignment2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ETD__NameAssignment_02540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_rule__ETD__SupertypeAssignment_22571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RTD__NameAssignment_02602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_rule__RTD__DomainAssignment_22633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_rule__RTD__CoDomainAssignment_42664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ED__NameAssignment_02695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDR_in_rule__ED__TypeAssignment_22726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RD__SourceAssignment_02761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RD__RelAssignment_12800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RD__TargetAssignment_22839 = new BitSet(new long[]{0x0000000000000002L});

}