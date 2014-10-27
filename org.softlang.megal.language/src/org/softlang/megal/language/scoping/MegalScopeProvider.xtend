package org.softlang.megal.language.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.softlang.megal.Megamodel
import org.eclipse.emf.ecore.EReference
import static org.eclipse.xtext.scoping.Scopes.*
import static org.eclipse.xtext.scoping.IScope.*
import org.softlang.megal.Entity
import org.softlang.megal.EntityType
import org.softlang.megal.Relationship
import org.softlang.megal.RelationshipType
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import static extension org.softlang.megal.Graph.*

/**
 * This scope provider uses declarative mechanisms to determine local scopes for MegaL objects
 */
class MegalScopeProvider extends AbstractDeclarativeScopeProvider {

	// TODO: SimpleLocalScopeProvider is capable of the dot names, copy its behavior for import resolving
	@Inject IQualifiedNameProvider qualifiedNameProvider

	def scope_Entity(Megamodel m, EReference r) {
		scopeFor(m.extend[imports].map[declarations.filter(Entity)].flatten, qualifiedNameProvider, NULLSCOPE)
	}

	def scope_EntityType(Megamodel m, EReference r) {
		scopeFor(m.extend[imports].map[declarations.filter(EntityType)].flatten, qualifiedNameProvider, NULLSCOPE)
	}

	def scope_Relationship(Megamodel m, EReference r) {
		scopeFor(m.extend[imports].map[declarations.filter(Relationship)].flatten, qualifiedNameProvider, NULLSCOPE)
	}

	def scope_RelationshipType(Megamodel m, EReference r) {
		scopeFor(m.extend[imports].map[declarations.filter(RelationshipType)].flatten, qualifiedNameProvider, NULLSCOPE)
	}
}
