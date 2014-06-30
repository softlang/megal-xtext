package org.softlang.megal.semantics

import com.google.common.collect.Sets
import java.util.Map
import java.util.Set
import static extension org.softlang.megal.calculation.Calculation.*
import org.softlang.megal.megaL.ETD
import org.softlang.megal.megaL.UseEntity
import org.softlang.megal.megaL.UseETDRef
import org.softlang.megal.megaL.RTD
import java.util.List

class Context {
	val static public EMPTY = new Context(emptySet, emptySet, emptyMap, emptyMap)

	val Set<String> softEntitySemantics
	val Set<List<String>> softRelationSemantics
	val Map<String, EntitySemantics> hardEntitySemantics
	val Map<List<String>, RelationSemantics> hardRelationSemantics

	new(Set<String> softEntitySemantics, Set<List<String>> softRelationSemantics,
		Map<String, EntitySemantics> hardEntitySemantics, Map<List<String>, RelationSemantics> hardRelationSemantics) {

		this.softEntitySemantics = softEntitySemantics.unmodifiableView
		this.softRelationSemantics = softRelationSemantics.unmodifiableView
		this.hardEntitySemantics = hardEntitySemantics.unmodifiableView
		this.hardRelationSemantics = hardRelationSemantics.unmodifiableView
	}

	def getSoftEntitySemantics() {
		return softEntitySemantics
	}

	def getSoftRelationSemantics() {
		return softRelationSemantics
	}

	def getHardEntitySemantics() {
		return hardEntitySemantics
	}

	def getHardRelationSemantics() {
		return hardRelationSemantics
	}

	def operator_plus(Context c) {
		return new Context(
			// Combine the soft semantics, do not care for overriding as there is nothing to override
			Sets.union(softEntitySemantics, c.softEntitySemantics),
			Sets.union(softRelationSemantics, c.softRelationSemantics),
			// Combine the hard semantics, drop from the current context the semantics that are 
			// defined in the new context to prevent double mapping for entry sets
			Sets.union(hardEntitySemantics.filter[k, v|!c.hardEntitySemantics.containsKey(k)].entrySet,
				c.hardEntitySemantics.entrySet).toMap[key].mapValues[value],
			Sets.union(hardRelationSemantics.filter[k, v|!c.hardRelationSemantics.containsKey(k)].entrySet,
				c.hardRelationSemantics.entrySet).toMap[key].mapValues[value]
		)
	}

	/**
	 * Gets the name of the first entity type that has a soft semantic implementation
	 */
	def List<String> getSoftRelationSemantics(RTD e) {

		// Test this relation
		val k = #[e.domain.name, e.name, e.coDomain.name]

		if (softRelationSemantics.contains(k))
			return k

		// Get super-types where possible
		val sd = e.domain.supertype
		val sc = e.coDomain.supertype

		// If domain supertypes present, try this one
		if (sd != null) {
			val kd = #[sd.name, e.name, e.coDomain.name]
			if (softRelationSemantics.contains(kd))
				return kd
		}

		// If codomain supertypes present, try this one
		if (sc != null) {
			val kc = #[e.domain.name, e.name, sc.name]
			if (softRelationSemantics.contains(kc))
				return kc
		}

		// If domain and codomain supertypes present, try those two
		if (sd != null && sc != null) {
			val ks = #[sd.name, e.name, sc.name]
			if (softRelationSemantics.contains(ks))
				return ks
		}

		// No possible substitution, return null
		return null
	}

	def Pair<List<String>, RelationSemantics> getHardRelationSemantics(RTD e) {

		// Test this relation
		val k = #[e.domain.name, e.name, e.coDomain.name]

		if (hardRelationSemantics.containsKey(k))
			return k -> hardRelationSemantics.get(k)

		// Get super-types where possible
		val sd = e.domain.supertype
		val sc = e.coDomain.supertype

		// If domain supertypes present, try this one
		if (sd != null) {
			val kd = #[sd.name, e.name, e.coDomain.name]

			if (hardRelationSemantics.containsKey(kd))
				return kd -> hardRelationSemantics.get(kd)
		}

		// If codomain supertypes present, try this one
		if (sc != null) {
			val kc = #[e.domain.name, e.name, sc.name]

			if (hardRelationSemantics.containsKey(kc))
				return kc -> hardRelationSemantics.get(kc)
		}

		// If domain and codomain supertypes present, try those two
		if (sd != null && sc != null) {
			val ks = #[sd.name, e.name, sc.name]

			if (hardRelationSemantics.containsKey(ks))
				return ks -> hardRelationSemantics.get(ks)
		}

		// No possible substitution, return null
		return null
	}

	/**
	 * Gets the name of the first entity type that has a soft semantic implementation
	 */
	def dispatch String getSoftEntitySemantics(ETD e) {
		if (softEntitySemantics.contains(e.name))
			return e.name

		return getSoftEntitySemantics(e.supertype)
	}

	def dispatch String getSoftEntitySemantics(UseEntity e) {
		if (softEntitySemantics.contains(e.name))
			return e.name

		return null
	}

	def dispatch String getSoftEntitySemantics(UseETDRef e) {
		return getSoftEntitySemantics(e.ref)
	}

	def dispatch Pair<String, EntitySemantics> getHardEntitySemantics(ETD e) {
		if (hardEntitySemantics.containsKey(e.name))
			return e.name -> hardEntitySemantics.get(e.name)

		return getHardEntitySemantics(e.supertype)
	}

	def dispatch Pair<String, EntitySemantics> getHardEntitySemantics(UseEntity e) {
		if (hardEntitySemantics.containsKey(e.name))
			return e.name -> hardEntitySemantics.get(e.name)

		return null
	}

	def dispatch Pair<String, EntitySemantics> getHardEntitySemantics(UseETDRef e) {
		return getHardEntitySemantics(e.ref)
	}
}
