package org.softlang.megal.pp.general

import org.eclipse.emf.ecore.resource.Resource.Diagnostic

class ThrowableDiagnostic implements Diagnostic {
	val Throwable e

	new(Throwable e) {
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

	override getMessage() '''«e.getClass().getSimpleName()»: «e.getMessage()»'''
}
