package org.softlang.megal.expansion

import org.softlang.megal.Counter
import org.softlang.megal.EntityType
import org.softlang.megal.FunctionApplication
import org.softlang.megal.MegalFactory
import org.softlang.megal.Megamodel
import org.softlang.megal.RelationshipType

import static extension org.softlang.megal.Graph.*
import static extension org.softlang.megal.Lists.*
import org.apache.log4j.Logger

class Desugar {
	val static logger = Logger.getLogger(Desugar);

	val static PRELUDE_NAME = 'Prelude'

	val static FUNCTION_APPLICATION_NAME = 'FunctionApplication'
	val static ELEMENT_OF_NAME = 'elementOf'
	val static INPUT_OF_NAME = 'inputOf'
	val static OUTPUT_OF_NAME = 'outputOf'

	def static desugar(Megamodel megamodel) {
		desugar(megamodel, MegalFactory.eINSTANCE)
	}

	def static desugar(Megamodel megamodel, extension MegalFactory factory) {
		val prelude = megamodel.extendBy[imports].findFirst[name == PRELUDE_NAME]

		if (prelude != null) {
			val fa = prelude.declarations.filter(EntityType).findFirst[name == FUNCTION_APPLICATION_NAME]
			val eo = prelude.declarations.filter(RelationshipType).findFirst[name == ELEMENT_OF_NAME]
			val io = prelude.declarations.filter(RelationshipType).findFirst[name == INPUT_OF_NAME]
			val oo = prelude.declarations.filter(RelationshipType).findFirst[name == OUTPUT_OF_NAME]

			if (fa != null && eo != null && io != null && oo != null) {
				desugar(megamodel, factory, fa, eo, io, oo)
			} else {

				// Get all unmapped items
				val k = #[FUNCTION_APPLICATION_NAME -> fa, ELEMENT_OF_NAME -> eo, INPUT_OF_NAME -> io,
					OUTPUT_OF_NAME -> oo].filter[value == null].map[key].join(', ')

				// Print error
				logger.error("Cannot desugar, types for function application are missing: " + k)
			}
		} else {

			// Print error
			logger.error("Cannot desugar, prelude is missing")
		}
	}

	def static desugar(Megamodel megamodel, extension MegalFactory factory, EntityType functionApplication,
		RelationshipType elementOf, RelationshipType inputOf, RelationshipType outputOf) {
		val c = new Counter

		/**
		 * I| F(A) |-> B
		 * 1| [F].App[n] : FunctionApplication
		 * 2| [F].App[n] elementOf [F]
		 * 3| [A] inputOf [F].App[n]
		 * 4| [B] outputOf [F].App[n]
		 */
		megamodel.declarations.unwind [ f |
			switch f {
				// Corresponds to I
				FunctionApplication: {

					// Obtain next index of function applications, TODO: May be unsafe
					val n = c.next

					// Corresponds to 1
					val app = createEntity => [
						name = '''«f.function.name».App«n»'''
						type = createEntityTypeReference => [
							definition = functionApplication
							many = false
						]
					]

					// Corresponds to 2
					val el = createRelationship => [
						left = app
						type = elementOf
						right = f.function
					]

					// Corresponds to 3
					val in = createRelationship => [
						left = f.input
						type = inputOf
						right = app
					]

					// Corresponds to 4
					val out = createRelationship => [
						left = f.output
						type = outputOf
						right = app
					]

					return #[app, el, in, out]
				}
				default:
					null
			}
		]
	}
}
