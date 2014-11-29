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

import static org.softlang.megal.Guard.*

/**
 * This scope provider uses declarative mechanisms to determine local scopes for MegaL objects
 */
class MegalScopeProvider extends AbstractDeclarativeScopeProvider {

	// TODO: SimpleLocalScopeProvider is capable of the dot names, copy its behavior for import resolving
	@Inject IQualifiedNameProvider qualifiedNameProvider

	def scope_Relationship_type(Relationship x, EReference r) {

		// Start with all possible relationship types
		var potential = x.megamodel.visibleDeclarations.filter(RelationshipType)

		// If left is assigned, reduce to all where type matches
		if (x.left != null)
			potential = potential.filter[p|
				guarded(false) [
					// Precondition with assignment state
					ifAssigned(p.left)
					ifAssigned(p.left.definition)
					ifAssigned(x.left.type)
					ifAssigned(x.left.type.definition)
					// Check if types are assignable
					p.left.definition.isAssignableFrom(x.left.type.definition)
				]]

		// If right is assigned, reduce to all where type matches
		if (x.right != null)
			potential = potential.filter[p|
				guarded(false) [
					// Precondition with assignment state
					ifAssigned(p.right)
					ifAssigned(p.right.definition)
					ifAssigned(x.right.type)
					ifAssigned(x.right.type.definition)
					// Check if types are assignable
					p.right.definition.isAssignableFrom(x.right.type.definition)
				]]

		//INFO: This might be the only one as the relationship type is the only polymorphic object
		// TODO: Order by specificness
		scopeFor(potential, qualifiedNameProvider, NULLSCOPE)

	}

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
