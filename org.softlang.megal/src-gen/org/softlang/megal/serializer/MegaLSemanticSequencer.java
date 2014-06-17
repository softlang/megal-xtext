package org.softlang.megal.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.softlang.megal.megaL.ED;
import org.softlang.megal.megaL.ETD;
import org.softlang.megal.megaL.ETDDeclared;
import org.softlang.megal.megaL.ETDEntity;
import org.softlang.megal.megaL.LD;
import org.softlang.megal.megaL.MegaLDefinition;
import org.softlang.megal.megaL.MegaLLinking;
import org.softlang.megal.megaL.MegaLPackage;
import org.softlang.megal.megaL.RD;
import org.softlang.megal.megaL.RTD;
import org.softlang.megal.services.MegaLGrammarAccess;

@SuppressWarnings("all")
public class MegaLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MegaLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MegaLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MegaLPackage.ED:
				if(context == grammarAccess.getEDRule()) {
					sequence_ED(context, (ED) semanticObject); 
					return; 
				}
				else break;
			case MegaLPackage.ETD:
				if(context == grammarAccess.getETDRule()) {
					sequence_ETD(context, (ETD) semanticObject); 
					return; 
				}
				else break;
			case MegaLPackage.ETD_DECLARED:
				if(context == grammarAccess.getETDDeclaredRule() ||
				   context == grammarAccess.getETDRRule()) {
					sequence_ETDDeclared(context, (ETDDeclared) semanticObject); 
					return; 
				}
				else break;
			case MegaLPackage.ETD_ENTITY:
				if(context == grammarAccess.getETDEntityRule() ||
				   context == grammarAccess.getETDRRule()) {
					sequence_ETDEntity(context, (ETDEntity) semanticObject); 
					return; 
				}
				else break;
			case MegaLPackage.LD:
				if(context == grammarAccess.getLDRule()) {
					sequence_LD(context, (LD) semanticObject); 
					return; 
				}
				else break;
			case MegaLPackage.MEGA_LDEFINITION:
				if(context == grammarAccess.getMegaLDefinitionRule() ||
				   context == grammarAccess.getModelRule()) {
					sequence_MegaLDefinition(context, (MegaLDefinition) semanticObject); 
					return; 
				}
				else break;
			case MegaLPackage.MEGA_LLINKING:
				if(context == grammarAccess.getMegaLLinkingRule() ||
				   context == grammarAccess.getModelRule()) {
					sequence_MegaLLinking(context, (MegaLLinking) semanticObject); 
					return; 
				}
				else break;
			case MegaLPackage.RD:
				if(context == grammarAccess.getRDRule()) {
					sequence_RD(context, (RD) semanticObject); 
					return; 
				}
				else break;
			case MegaLPackage.RTD:
				if(context == grammarAccess.getRTDRule()) {
					sequence_RTD(context, (RTD) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID type=ETDR)
	 */
	protected void sequence_ED(EObject context, ED semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MegaLPackage.Literals.ED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegaLPackage.Literals.ED__NAME));
			if(transientValues.isValueTransient(semanticObject, MegaLPackage.Literals.ED__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegaLPackage.Literals.ED__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEDAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEDAccess().getTypeETDRParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     reference=[ETD|ID]
	 */
	protected void sequence_ETDDeclared(EObject context, ETDDeclared semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MegaLPackage.Literals.ETD_DECLARED__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegaLPackage.Literals.ETD_DECLARED__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETDDeclaredAccess().getReferenceETDIDTerminalRuleCall_0_1(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {ETDEntity}
	 */
	protected void sequence_ETDEntity(EObject context, ETDEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID supertype=ETDR)
	 */
	protected void sequence_ETD(EObject context, ETD semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MegaLPackage.Literals.ETD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegaLPackage.Literals.ETD__NAME));
			if(transientValues.isValueTransient(semanticObject, MegaLPackage.Literals.ETD__SUPERTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegaLPackage.Literals.ETD__SUPERTYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETDAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getETDAccess().getSupertypeETDRParserRuleCall_2_0(), semanticObject.getSupertype());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (target=[ED|ID] key=ID? value=STRING)
	 */
	protected void sequence_LD(EObject context, LD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedID linker=[MegaLLinking|QualifiedID]? (imports+=[MegaLDefinition|ID] | etd+=ETD | rtd+=RTD | ed+=ED | rd+=RD)*)
	 */
	protected void sequence_MegaLDefinition(EObject context, MegaLDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedID target=[MegaLDefinition|QualifiedID]? links+=LD*)
	 */
	protected void sequence_MegaLLinking(EObject context, MegaLLinking semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source=[ED|ID] rel=[RTD|ID] target=[ED|ID])
	 */
	protected void sequence_RD(EObject context, RD semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MegaLPackage.Literals.RD__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegaLPackage.Literals.RD__SOURCE));
			if(transientValues.isValueTransient(semanticObject, MegaLPackage.Literals.RD__REL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegaLPackage.Literals.RD__REL));
			if(transientValues.isValueTransient(semanticObject, MegaLPackage.Literals.RD__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegaLPackage.Literals.RD__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRDAccess().getSourceEDIDTerminalRuleCall_0_0_1(), semanticObject.getSource());
		feeder.accept(grammarAccess.getRDAccess().getRelRTDIDTerminalRuleCall_1_0_1(), semanticObject.getRel());
		feeder.accept(grammarAccess.getRDAccess().getTargetEDIDTerminalRuleCall_2_0_1(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID domain=ETDR coDomain=ETDR)
	 */
	protected void sequence_RTD(EObject context, RTD semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MegaLPackage.Literals.RTD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegaLPackage.Literals.RTD__NAME));
			if(transientValues.isValueTransient(semanticObject, MegaLPackage.Literals.RTD__DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegaLPackage.Literals.RTD__DOMAIN));
			if(transientValues.isValueTransient(semanticObject, MegaLPackage.Literals.RTD__CO_DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegaLPackage.Literals.RTD__CO_DOMAIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRTDAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRTDAccess().getDomainETDRParserRuleCall_2_0(), semanticObject.getDomain());
		feeder.accept(grammarAccess.getRTDAccess().getCoDomainETDRParserRuleCall_4_0(), semanticObject.getCoDomain());
		feeder.finish();
	}
}
