package org.softlang.megal.language.scoping

import com.google.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.softlang.megal.Declaration
import org.softlang.megal.Megamodel

import static org.eclipse.xtext.scoping.Scopes.*
import static org.eclipse.xtext.scoping.IScope.NULLSCOPE
import org.softlang.megal.Named

/**
 * This scope provider uses declarative mechanisms to determine local scopes for MegaL objects
 */
class MegalScopeProvider extends AbstractDeclarativeScopeProvider {

	// TODO: SimpleLocalScopeProvider is capable of the dot names, copy its behavior for import resolving
	@Inject IQualifiedNameProvider qualifiedNameProvider

	private def scope_Named(Megamodel m, EReference r) {

		// Declaration scope only for items that are declarations
		if (!Named.isAssignableFrom(r.EType.instanceClass))
			return delegateGetScope(m, r)

		// 'Cast' the instance class to match
		val instanceClass = r.EType.instanceClass.asSubclass(Named)

		// Scope own elements first, then the imported
		scopeFor(m.declarations.filter(instanceClass), qualifiedNameProvider,
			scopeFor(
				m.allImports.map[declarations].flatten.filter(instanceClass),
				qualifiedNameProvider,
				NULLSCOPE
			))
	}

//	private static def <T, U> distinctBy(Iterable<T> source, (T)=>U by) {
//		source.groupBy(by).mapValues[head].values
//	}

	def scope_Entity(Megamodel m, EReference r) {
		return scope_Named(m, r)
	}

	def scope_EntityType(Megamodel m, EReference r) {
		return scope_Named(m, r)
	}

	def scope_RelationshipType(Megamodel m, EReference r) {
		return scope_Named(m, r)
	}
}
