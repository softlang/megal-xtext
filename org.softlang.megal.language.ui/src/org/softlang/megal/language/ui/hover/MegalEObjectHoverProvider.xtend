package org.softlang.megal.language.ui.hover

import java.net.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.softlang.megal.MegalEntity
import org.softlang.megal.MegalEntityType
import org.softlang.megal.MegalLink
import org.softlang.megal.MegalPlugin
import org.softlang.megal.MegalRelationshipType
import static org.softlang.megal.language.MegalReasoning.*
import static org.softlang.megal.mi2.MegamodelKB.*
import org.softlang.megal.MegalFile
import static org.softlang.megal.mi2.MegamodelResolver.*

class MegalEObjectHoverProvider extends DefaultEObjectHoverProvider {
	def link(EObject o) {
		try {
			elementLinks.createLink(o)
		} catch (NullPointerException e) {
			labelProvider.getText(o)
		}
	}

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

	def dispatch firstLineFor(EObject it) {
		null
	}

	def dispatch documentationFor(EObject it) {
		null
	}

	def dispatch firstLineFor(MegalEntity it) {
		return '''<b>«name»</b> : «type.link»'''
	}

	/**
	 * Calculates the documentation for an EObject or null if no documentation
	 */
	def dispatch documentationFor(MegalEntity it) {
		val res = transitive(it)
		val rep = getKB(it).getEntity(name)
		val incoming = rep.incoming
		val outgoing = rep.outgoing

		return '''
			«super.getDocumentation(it)»
			«IF !incoming.empty || !outgoing.empty»
				<p>Relationships in defined document: <ul>
					«FOR in : incoming»
						<li>«res.resolve(in.left).link» «res.resolve(in.type).link» <b>«name»</b></li>
					«ENDFOR»
					«FOR out : outgoing»
						<li><b>«name»</b> «res.resolve(out.type).link» «res.resolve(out.right).link»</li>
					«ENDFOR»
					</ul></p>
			«ENDIF»
			
		'''
	}

	def dispatch firstLineFor(
		MegalEntityType it) '''<b>«name»</b> «IF supertype != null»  &lt; «supertype.link»«ENDIF»'''

	def dispatch firstLineFor(MegalRelationshipType it) {
		'''<b>«name»</b>'''
	}

	def dispatch documentationFor(MegalEntityType it) '''«super.getDocumentation(it)»'''

	def dispatch documentationFor(MegalRelationshipType relationshipType) '''xxxx'''

	def dispatch documentationFor(
		MegalLink it) '''<ul>«FOR n : MegalPlugin.evaluator.evaluate(URI.create(to))»<li>«n»</li>«ENDFOR»</ul>'''
}
