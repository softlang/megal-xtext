package org.softlang.megal.pp.general

import org.eclipse.emf.ecore.resource.Resource.Diagnostic

class NoClassDefFoundDiagnostic implements Diagnostic {
	val Throwable e

	new(NoClassDefFoundError e) {
		this.e = e
	}

	override getColumn() {
		return 1
	}

	override getLine() {
		return 0
	}

	override getLocation() {
		return null
	}

	override getMessage() '''Unable to resolve the class «e.message»'''
}
