package org.softlang.megal.calculation

import com.google.common.collect.Sets
import java.util.Set
import org.softlang.megal.megaL.ED
import org.softlang.megal.megaL.ETD
import org.softlang.megal.megaL.MegaLDefinition
import org.softlang.megal.megaL.RD
import org.softlang.megal.megaL.RTD
import com.google.common.base.Optional
import org.softlang.megal.megaL.UseETD
import org.softlang.megal.megaL.UseEntity
import org.softlang.megal.megaL.UseETDRef

import static extension org.softlang.megal.operators.Operators.*

class Calculation {

	/**
	 * Searches the definition and their respective imports
	 * @param d The definition for which to search
	 * @return Returns a set of the search definition and their imports
	 */
	def static Set<MegaLDefinition> allDefinitions(MegaLDefinition d) {
		return allDefinitions(d, newHashSet)
	}

	def static Set<MegaLDefinition> allDefinitions(MegaLDefinition d, Set<MegaLDefinition> is) {
		if (is += d)
			for (i : d.imports)
				allDefinitions(i.ref, is)

		return is
	}

	/**
	 * Searches the definition and their respective imports
	 * @param d The definition for which to search
	 * @return Returns a set of the search definitions imports
	 */
	def static Set<MegaLDefinition> importedDefinitions(MegaLDefinition d) {

		return importedDefinitions(d, newHashSet)
	}

	def static Set<MegaLDefinition> importedDefinitions(MegaLDefinition d, Set<MegaLDefinition> is) {
		for (i : d.imports)
			allDefinitions(i.ref, is)

		return is
	}

	def static Set<ETD> effectiveETDs(MegaLDefinition d) {
		return d.allDefinitions.map[etds].flatten.toSet
	}

	def static Set<RTD> effectiveRTDs(MegaLDefinition d) {
		return d.allDefinitions.map[rtds].flatten.toSet
	}

	def static Set<ED> effectiveEDs(MegaLDefinition d) {
		return d.allDefinitions.map[eds].flatten.toSet
	}

	def static Set<RD> effectiveRDs(MegaLDefinition d) {
		return d.allDefinitions.map[rds].flatten.toSet
	}

	/**
	 * Something may not be a supertype of an entity
	 */
	def static dispatch boolean isSupertypeOf(UseETD a, UseEntity b) {
		false
	}

	/**
	 * Entity is always the supertype of something
	 */
	def static dispatch boolean isSupertypeOf(UseEntity a, UseETDRef b) {
		true
	}

	/**
	 * A reference a is the supertype of the reference b if the direct 
	 * supertype of b is a or a is the supertype of the direct supertype of b
	 */
	def static dispatch boolean isSupertypeOf(UseETDRef a, UseETDRef b) {
		return b.ref.supertype <=> a || a.isSupertypeOf(b.ref.supertype)
	}

	def static dispatch String getName(UseETD a) {
		throw new UnsupportedOperationException
	}

	def static dispatch String getName(UseEntity a) {
		'Entity'
	}

	def static dispatch String getName(UseETDRef a) {
		a.ref.name
	}

	def static getHierarchy(UseETD e) {
		val h = newArrayList
		var x = e
		while (x != null) {
			h += x
			if (x instanceof UseETDRef)
				x = x.ref.supertype
			else
				x = null
		}

		return h
	}

	def static getApplicableRTDs(RD it) {
		val m = eContainer as MegaLDefinition

		val r = m.effectiveRTDs.filter[r|r.name == rel.name]
		val hl = source.type.hierarchy
		val hr = target.type.hierarchy

		// Pair them all
		var carp = Sets.cartesianProduct(hl.toSet, hr.toSet)

		return carp.map [ p |
			// Get pairings
			val letd = p.head as UseETD
			val retd = p.last as UseETD
			// Map to their items
			return r.filter[domain <=> letd && coDomain <=> retd]
		].flatten.toList.sort [ a, b |
			val ds = a.domain.isSupertypeOf(b.domain)
			val cs = a.coDomain.isSupertypeOf(b.coDomain)
			if (ds && cs)
				return 1
			if (!ds && !cs)
				return -1
			return 0
		]
	}

	def static getAppliedRTD(RD it) {
		Optional.fromNullable(applicableRTDs.head)
	}
}
