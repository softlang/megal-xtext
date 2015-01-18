package org.softlang.megal.language.ui.highlighting

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.softlang.megal.Entity
import org.softlang.megal.MegalPackage
import org.softlang.megal.EntityType
import org.softlang.megal.RelationshipType
import org.softlang.megal.RelationshipTypeInstance
import org.softlang.megal.Relationship

class MegalSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {

	override protected highlightElement(EObject object, IHighlightedPositionAcceptor acceptor) {

		// Calculate a mapping from feature to highlight style
		switch p : stylesFor(object) {
			// If no mapping, use supertypes method
			case null: {
				return super.highlightElement(object, acceptor)
			}
			// If mappings exist, apply and prune
			default: {
				for (k : p)
					acceptor.highlightFeature(object, k.key, k.value)
				return true
			}
		}
	}

	/**
	 * Calculates the style mapping for an EObject or null if no style mapping
	 */
	def dispatch stylesFor(EObject object) {
		null
	}

	def dispatch stylesFor(Entity object) {
		#[MegalPackage.Literals.NAMED__NAME -> MegalHighlightingConfiguration.idFor(object)]
	}

	def dispatch stylesFor(EntityType object) {
		#[MegalPackage.Literals.NAMED__NAME -> MegalHighlightingConfiguration.idFor(object)]
	}

	def dispatch stylesFor(Relationship object) {
		#[MegalPackage.Literals.RELATIONSHIP__TYPE -> MegalHighlightingConfiguration.idFor(object)]
	}

	def dispatch stylesFor(RelationshipType object) {
		#[MegalPackage.Literals.NAMED__NAME -> MegalHighlightingConfiguration.idFor(object)]
	}

}
