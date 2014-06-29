package org.softlang.megal.semantics

import com.google.common.collect.Sets
import java.util.Map
import java.util.Set
import static org.softlang.megal.calculation.Calculation.*
import org.softlang.megal.megaL.ETD
import org.softlang.megal.megaL.UseETD
import org.softlang.megal.megaL.UseEntity
import org.softlang.megal.megaL.UseETDRef
import org.softlang.megal.megaL.RTD

class Context {
	val static public EMPTY = new Context(emptySet, emptySet, emptyMap, emptyMap)

	val Set<String> softEntitySemantics
	val Set<String> softRelationSemantics
	val Map<String, EntitySemantics> hardEntitySemantics
	val Map<String, RelationSemantics> hardRelationSemantics

	new(Set<String> softEntitySemantics, Set<String> softRelationSemantics,
		Map<String, EntitySemantics> hardEntitySemantics, Map<String, RelationSemantics> hardRelationSemantics) {

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
	def String getSoftRelationSemantics(RTD e) {
		if (softRelationSemantics.contains(e.name))
			return e.name

		return null
	}

	def Pair<String, RelationSemantics> getHardRelationSemantics(RTD e) {
		if (hardRelationSemantics.containsKey(e.name))
			return e.name -> hardRelationSemantics.get(e.name)

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
		if (softEntitySemantics.contains('Entity'))
			return 'Entity'

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
		if (hardEntitySemantics.containsKey('Entity'))
			return 'Entity' -> hardEntitySemantics.get('Entity')

		return null
	}

	def dispatch Pair<String, EntitySemantics> getHardEntitySemantics(UseETDRef e) {
		return getHardEntitySemantics(e.ref)
	}
}
