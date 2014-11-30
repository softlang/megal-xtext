package org.softlang.megal.processing

import java.util.List
import org.softlang.megal.Counter
import org.softlang.megal.Declaration
import org.softlang.megal.EntityType
import org.softlang.megal.FunctionApplication
import org.softlang.megal.Link
import org.softlang.megal.MegalFactory
import org.softlang.megal.RelationshipType
import org.softlang.megal.api.In
import org.softlang.megal.api.RefactoringAPI
import org.softlang.megal.api.Slot
import org.eclipse.emf.ecore.util.EcoreUtil

/** 
 * <p>
 * Removing: <b>F</b>(<b>A</b>) |-&gt; <b>B</b>
 * </p>
 * <p>
 * To:
 * <ol>
 * <li>[<b>F</b>].App[<i>n</i>] : FunctionApplication</li>
 * <li>[<b>F</b>].App[<i>n</i>] elementOf [<b>F</b>]</li>
 * <li>[<b>A</b>] inputOf [<b>F</b>].App[<i>n</i>]</li>
 * <li>[<b>B</b>] outputOf [<b>F</b>].App[<i>n</i>]</li>
 * </ol>
 * </p>
 * @author Pazuzu
 */
class FunAppDesugaring extends RefactoringAPI {
	new() {
		super("FunAppDesugaring")
	}

	/**
	 * <p>ModelAPI injected function application</p>
	 */
	@Slot @In("Prelude")
	public EntityType functionApplication

	/**
	 * <p>ModelAPI injected element of</p>
	 */
	@Slot @In("Prelude")
	public RelationshipType elementOf

	/**
	 * <p>ModelAPI injected input of</p>
	 */
	@Slot @In("Prelude")
	public RelationshipType inputOf

	/**
	 * <p>ModelAPI injected output of</p>
	 */
	@Slot @In("Prelude")
	public RelationshipType outputOf

	/**
	 * <p>Counter instantiating the <i>n</i> carrier</p>
	 */
	val counter = new Counter

	override protected boolean process(Declaration decl, extension MegalFactory factory, List<Link> newLinks,
		List<Declaration> newDecls) {

		// Transform function applications
		switch decl {
			FunctionApplication: {

				// Obtain next index of function applications
				val n = counter.next

				// Corresponds to 1
				val app = createEntity => [
					annotations += decl.annotations.map[EcoreUtil.copy(it)]
					name = '''«decl.function.name».App«n»'''
					type = createEntityTypeReference => [
						definition = functionApplication
						many = false
					]
				]
				newDecls += app

				// Corresponds to 2
				newDecls += createRelationship => [
					left = app
					type = elementOf
					right = decl.function
				]

				// Corresponds to 3
				newDecls += createRelationship => [
					left = decl.input
					type = inputOf
					right = app
				]

				// Corresponds to 4
				newDecls += createRelationship => [
					left = decl.output
					type = outputOf
					right = app
				]

				// Do not keep
				return false
			}
			default:
				return true
		}

	}

}
