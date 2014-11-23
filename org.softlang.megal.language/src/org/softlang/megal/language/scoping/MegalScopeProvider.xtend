package org.softlang.megal.language.scoping

import com.google.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.softlang.megal.Entity
import org.softlang.megal.EntityType
import org.softlang.megal.Megamodel
import org.softlang.megal.Relationship
import org.softlang.megal.RelationshipType

import static org.eclipse.xtext.scoping.IScope.*
import static org.eclipse.xtext.scoping.Scopes.*

/**
 * This scope provider uses declarative mechanisms to determine local scopes for MegaL objects
 */
class MegalScopeProvider extends AbstractDeclarativeScopeProvider {

	// TODO: SimpleLocalScopeProvider is capable of the dot names, copy its behavior for import resolving
	@Inject IQualifiedNameProvider qualifiedNameProvider

	def scope_Entity(Megamodel m, EReference r) {
		scopeFor(m.visibleDeclarations.filter(Entity), qualifiedNameProvider, NULLSCOPE)
	}

	def scope_EntityType(Megamodel m, EReference r) {
		scopeFor(m.visibleDeclarations.filter(EntityType), qualifiedNameProvider, NULLSCOPE)
	}

	def scope_Relationship(Megamodel m, EReference r) {
		scopeFor(m.visibleDeclarations.filter(Relationship), qualifiedNameProvider, NULLSCOPE)
	}

	def scope_RelationshipType(Megamodel m, EReference r) {
		scopeFor(m.visibleDeclarations.filter(RelationshipType), qualifiedNameProvider, NULLSCOPE)
	}
}
