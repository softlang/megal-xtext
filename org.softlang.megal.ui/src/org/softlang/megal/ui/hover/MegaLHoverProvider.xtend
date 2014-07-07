package org.softlang.megal.ui.hover

import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.eclipse.emf.ecore.EObject
import org.softlang.megal.megaL.ED
import org.softlang.megal.megaL.MegaLDefinition
import org.eclipse.emf.ecore.util.EcoreUtil

class MegaLHoverProvider extends DefaultEObjectHoverProvider {
	override getFirstLine(EObject o) {
		val l = o.dispatchFirstLine

		if(l == null) super.getFirstLine(o) else l

	}

	override getDocumentation(EObject o) {
		val d = o.dispatchDocumentation

		if(d == null) super.getDocumentation(o) else d

	}

	def dispatch String dispatchFirstLine(EObject it) {
		null
	}

	def dispatch String dispatchDocumentation(EObject it) {
		null
	}

	/**
	* Copy the semantic string if present
	*/
	def dispatch String dispatchDocumentation(ED e) {
		val m = e.eContainer as MegaLDefinition

		val ls = m.linker.lds.filter[l|EcoreUtil.equals(l.target, e)]
		
		return '''«FOR l :ls»<p><a href="«l.value»">«l.value»</a></p>«ENDFOR»'''
	}

}
