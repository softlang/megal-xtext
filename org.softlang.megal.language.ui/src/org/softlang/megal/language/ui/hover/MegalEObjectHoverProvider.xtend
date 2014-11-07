package org.softlang.megal.language.ui.hover

import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.internal.text.html.BrowserInformationControl
import org.eclipse.swt.widgets.MessageBox
import org.eclipse.ui.ISharedImages
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.eclipse.xtext.ui.editor.hover.html.IXtextBrowserInformationControl
import org.softlang.megal.Entity
import org.softlang.megal.EntityType
import org.softlang.megal.Relationship
import org.softlang.megal.RelationshipType
import org.softlang.megal.Graph
import org.softlang.megal.Megamodel
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.EcoreUtil2
import static extension org.softlang.megal.reasoner.Reasoner.*

class ListAnnotationsAction extends ExtenderAction {

	new(ExtenderEObjectHoverProvider p, IXtextBrowserInformationControl c) {
		super(p, c, "List annotations", ISharedImages.IMG_ELCL_SYNCED)
	}

	override update() {
		enabled = infoControl.input?.inputElement instanceof EntityType
	}

	override run() {
		val e = infoControl.input?.inputElement as EntityType

		navigateToHTML(e, '''<ul>«FOR a : e.annotations»<li>«a.key» := «a.value»</li>«ENDFOR»</ul>''')
	}
}

class ListSubtypesAction extends ExtenderAction {
	def static boolean isSubType(EntityType a, EntityType of) {
		a.supertype != null && (a.supertype.definition == of || isSubType(a.supertype.definition, of))
	}

	new(ExtenderEObjectHoverProvider p, IXtextBrowserInformationControl c) {
		super(p, c, "List subtypes", ISharedImages.IMG_ELCL_COLLAPSEALL)
	}

	override update() {
		enabled = infoControl.input?.inputElement instanceof EntityType
	}

	override run() {
		val e = infoControl.input?.inputElement as EntityType

		// Resolve all megamodels
		val resolved = e.eResource.resourceSet.resources.map[contents.filter(Megamodel)].flatten

		// Find all direct subtypes
		val subtypes = resolved.map[declarations.filter(EntityType).filter[isSubType(e)]].flatten

		navigateToHTML(e,
			'''List of subtypes of «extender.elementLinks.createLink(e)»: <ul>«FOR a : subtypes»<li>«extender.
				elementLinks.createLink(a)»«IF a.supertype.definition != e» <a title="Transitive subtype">...</a>«ENDIF»</li>«ENDFOR»</ul>''')
	}
}

class ListInstancesAction extends ExtenderAction {
	def static boolean isSubType(EntityType a, EntityType of) {
		a.supertype != null && (a.supertype.definition == of || isSubType(a.supertype.definition, of))
	}

	def static boolean isInstance(Entity a, EntityType of) {
		a.type.definition == of || a.type.definition.isSubType(of)
	}

	new(ExtenderEObjectHoverProvider p, IXtextBrowserInformationControl c) {
		super(p, c, "List instances", ISharedImages.IMG_ELCL_REMOVEALL)
	}

	override update() {
		enabled = infoControl.input?.inputElement instanceof EntityType
	}

	override run() {
		val e = infoControl.input?.inputElement as EntityType

		// Resolve all megamodels
		val resolved = e.eResource.resourceSet.resources.map[contents.filter(Megamodel)].flatten

		// Find all direct subtypes
		val subtypes = resolved.map[declarations.filter(Entity).filter[isInstance(e)]].flatten

		navigateToHTML(e,
			'''List of instances of «extender.elementLinks.createLink(e)»: <ul>«FOR a : subtypes»<li>«extender.
				elementLinks.createLink(a)»«IF a.type.definition != e» <a title="Transitive instance">...</a>«ENDIF»</li>«ENDFOR»</ul>''')
	}
}

class MegalEObjectHoverProvider extends ExtenderEObjectHoverProvider {

	override protected addActions(ExtenderPresentationControlCreator p) {
		p.constructors += [new ListAnnotationsAction(MegalEObjectHoverProvider.this, it)]
		p.constructors += [new ListSubtypesAction(MegalEObjectHoverProvider.this, it)]
		p.constructors += [new ListInstancesAction(MegalEObjectHoverProvider.this, it)]
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

	def link(EObject o) {
		elementLinks.createLink(o)
	}

	/**
	 * Calculates the first line for an EObject or null if no first line
	 */
	def dispatch firstLineFor(EObject it) {
		null
	}

	def dispatch firstLineFor(Entity it) '''<b>«name»</b> : «type.definition.link»'''

	def dispatch firstLineFor(EntityType it) '''<b>«name»</b> «IF supertype != null»  &lt; «supertype.definition.link»«ENDIF»'''

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
		«IF dispatcher»
			«IF masterDispatcher»Dispatcher is <a href="put a cool link to explain master dispatchers">master</a>«ENDIF»
			<p>Dispatchers involved: <ul>«FOR c : buildDisp»<li>«c.link»</li>«ENDFOR»</ul></p>
			<p>Parameters bound: <ul> «FOR c : costaassa.entrySet»<li>«c.key.link»&larr;«c.value.link»</li>«ENDFOR»</ul></p>
		«ENDIF»
		«super.getDocumentation(it)»
	'''

	def dispatch documentationFor(EntityType it) '''«super.getDocumentation(it)»'''

	def dispatch documentationFor(Relationship it) '''«super.getDocumentation(it)»'''

	def dispatch documentationFor(RelationshipType it) '''«super.getDocumentation(it)»'''
}
