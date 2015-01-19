package org.softlang.megal.language.scoping

import com.google.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.softlang.megal.Declaration
import org.softlang.megal.Megamodel

import static org.eclipse.xtext.scoping.Scopes.*
import static org.eclipse.xtext.scoping.IScope.NULLSCOPE

/**
 * This scope provider uses declarative mechanisms to determine local scopes for MegaL objects
 */
class MegalScopeProvider extends AbstractDeclarativeScopeProvider {

	// TODO: SimpleLocalScopeProvider is capable of the dot names, copy its behavior for import resolving
	@Inject IQualifiedNameProvider qualifiedNameProvider

	private def scope_Declaration(Megamodel m, EReference r) {

		// Declaration scope only for items that are declarations
		if (!Declaration.isAssignableFrom(r.EType.instanceClass))
			return delegateGetScope(m, r)

		// 'Cast' the instance class to match
		val instanceClass = r.EType.instanceClass.asSubclass(Declaration)

		// Scope own elements first, then the imported
		scopeFor(m.declarations.filter(instanceClass), qualifiedNameProvider,
			scopeFor(
				m.importedDeclarations.filter(instanceClass),
				qualifiedNameProvider,
				NULLSCOPE
			))
	}

	def scope_Entity(Megamodel m, EReference r) {
		return scope_Declaration(m, r)
	}

	def scope_EntityType(Megamodel m, EReference r) {
		return scope_Declaration(m, r)
	}

	def scope_RelationshipType(Megamodel m, EReference r) {
		return scope_Declaration(m, r)
	}
}
