package org.softlang.megal.calculation

import org.softlang.megal.megaL.MegaLDefinition
import java.util.Set

class Calculation {
	def static Set<MegaLDefinition> allDefinitions(MegaLDefinition d) {
		return allDefinitions(d, newHashSet)
	}

	def static Set<MegaLDefinition> allDefinitions(MegaLDefinition d, Set<MegaLDefinition> is) {
		if (is += d)
			for (i : d.imports)
				allDefinitions(i.ref, is)

		return is
	}

	def static Set<MegaLDefinition> importedDefinitions(MegaLDefinition d) {

		return importedDefinitions(d, newHashSet)
	}

	def static Set<MegaLDefinition> importedDefinitions(MegaLDefinition d, Set<MegaLDefinition> is) {
		for (i : d.imports)
			allDefinitions(i.ref, is)

		return is
	}
}
