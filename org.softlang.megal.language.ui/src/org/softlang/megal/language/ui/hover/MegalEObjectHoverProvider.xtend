package org.softlang.megal.language.ui.hover

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.softlang.megal.Entity
import org.softlang.megal.EntityType
import org.softlang.megal.Relationship
import org.softlang.megal.RelationshipType
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks

class MegalEObjectHoverProvider extends DefaultEObjectHoverProvider {

	override protected getFirstLine(EObject object) {

		// Calculate a first line
		switch p : firstLineFor(object) {
			// If no first line, use supertypes method
			case null:
				return super.getFirstLine(object)
			// If first line exist, use it
			default:
				return p.toString
		}
	}

	override protected getDocumentation(EObject object) {

		// Calculate the documentation
		switch p : documentationFor(object) {
			// If no documentation, use supertypes method
			case null:
				return super.getDocumentation(object)
			// If documentation exist, use it
			default:
				return p.toString
		}

	}

	private def link(EObject o) {
		elementLinks.createLink(o)
	}

	/**
	 * Calculates the first line for an EObject or null if no first line
	 */
	def dispatch firstLineFor(EObject it) {
		null
	}

	def dispatch firstLineFor(Entity it) '''«type.definition.link» <b>«name»</b>'''

	def dispatch firstLineFor(EntityType it) '''<b>«name»</b> «IF supertype != null» < «supertype.definition.link»«ENDIF»'''

	def dispatch firstLineFor(Relationship it) '''«left.link» <i>«type.link»</i> «right.link»'''

	def dispatch firstLineFor(RelationshipType it) '''«left.definition.link» <i>«name»</i> «right.definition.link»'''

	/**
	 * Calculates the documentation for an EObject or null if no documentation
	 */
	def dispatch documentationFor(EObject it) {
		null
	}

	def dispatch documentationFor(Entity it) '''
		«IF dependent»<p>Entity is <a href="put a cool link to explain dependency">dependent</a></p>«ENDIF»
		«IF parameter»<p>Entity is <a href="put a cool link to explain parametricity">a parameter</a></p>«ENDIF»
		«super.getDocumentation(it)»
	'''

	def dispatch documentationFor(EntityType it) '''«super.getDocumentation(it)»'''

	def dispatch documentationFor(Relationship it) '''«super.getDocumentation(it)»'''

	def dispatch documentationFor(RelationshipType it) '''«super.getDocumentation(it)»'''
}
