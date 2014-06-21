package org.softlang.megal.operators

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil

class Operators {
	def static operator_spaceship(EObject a, EObject b) {
		return EcoreUtil.equals(a, b)
	}
	def static operator_diamond(EObject a, EObject b) {
		return !EcoreUtil.equals(a, b)
	}
}
