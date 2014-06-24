package org.softlang.megal.resources

import org.eclipse.xtext.resource.XtextResource
import org.eclipse.emf.common.util.URI
import org.softlang.megal.semantics.Context

class MegaLResource extends XtextResource {
	new() {
	}

	new(URI uri) {
		super(uri)
	}

	var URI contextURI = null
	var Context context = null

	def getContext() {
		if (context == null || contextURI != URI) {
			contextURI = URI
		}

		return context
	}

}
