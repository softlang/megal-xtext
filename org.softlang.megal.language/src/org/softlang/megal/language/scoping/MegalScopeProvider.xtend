package org.softlang.megal.language.scoping

import com.google.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.softlang.megal.MegalFile
import org.softlang.megal.MegalNamed

import static org.eclipse.xtext.scoping.IScope.NULLSCOPE
import static org.eclipse.xtext.scoping.Scopes.*

/**
 * This scope provider uses declarative mechanisms to determine local scopes for MegaL objects
 */
class MegalScopeProvider extends AbstractDeclarativeScopeProvider {

	@Inject IQualifiedNameProvider qualifiedNameProvider

	private def Iterable<MegalFile> allImports(MegalFile m) {
		m.imports + m.imports.map[allImports].flatten
	}

	private def scope_Named(MegalFile m, EReference r) {

		// Declaration scope only for items that are declarations
		if (!MegalNamed.isAssignableFrom(r.EType.instanceClass))
			return delegateGetScope(m, r)

		// 'Cast' the instance class to match
		val instanceClass = r.EType.instanceClass.asSubclass(MegalNamed)

		// Scope own elements first, then the imported
		scopeFor(m.declarations.filter(instanceClass), qualifiedNameProvider, scopeFor(
			m.allImports.map[declarations].flatten.filter(instanceClass),
			qualifiedNameProvider,
			NULLSCOPE
		))
	}

	// private static def <T, U> distinctBy(Iterable<T> source, (T)=>U by) {
	// source.groupBy(by).mapValues[head].values
	// }
	def scope_Entity(MegalFile m, EReference r) {
		return scope_Named(m, r)
	}

	def scope_EntityType(MegalFile m, EReference r) {
		return scope_Named(m, r)
	}

	def scope_RelationshipType(MegalFile m, EReference r) {
		return scope_Named(m, r)
	}
}
