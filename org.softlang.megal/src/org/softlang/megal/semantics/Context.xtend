package org.softlang.megal.semantics

import com.google.common.collect.Sets
import java.util.Map
import java.util.Set

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
}
