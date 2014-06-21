package org.softlang.megal.calculation

import org.softlang.megal.megaL.MegaLDefinition
import java.util.Set
import org.softlang.megal.megaL.RTD
import org.softlang.megal.megaL.ETD
import org.softlang.megal.megaL.ED
import org.softlang.megal.megaL.RD

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
		return d.allDefinitions.map[eds.map[items].flatten].flatten.toSet
	}

	def static Set<RD> effectiveRDs(MegaLDefinition d) {
		return d.allDefinitions.map[rds].flatten.toSet
	}
}
