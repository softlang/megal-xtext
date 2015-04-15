/*
 * generated by Xtext
 */
package org.softlang.megal.language.validation

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType
import org.softlang.megal.Entity
import org.softlang.megal.EntityType
import org.softlang.megal.Megamodel
import org.softlang.megal.Relationship

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class MegalValidator extends AbstractMegalValidator {

	//  public static val INVALID_NAME = 'invalidName'
	//
	//	@Check
	//	def checkGreetingStartsWithCapital(Greeting greeting) {
	//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
	//			warning('Name should start with a capital', 
	//					MyDslPackage.Literals.GREETING__NAME,
	//					INVALID_NAME)
	//		}
	//	}
	public static val NO_APPLICABLE_INSTANCE = 'noApplicableInstance'
	public static val ENTITY_MISOVERLOAD = 'entityMisoverload'
	public static val ENTITY_TYPE_MISOVERLOAD = 'entityTypeMisoverload'

	@Check
	def checkRelationshipTypeApplicable(Relationship x) {
		//TODO MI2
		//		if (x.appliedInstance == null)
		//			error('''No instance applicable for «x.type?.name» from «x.left.type» to «x.right.type»''',
		//				MegalPackage.Literals.RELATIONSHIP__TYPE, NO_APPLICABLE_INSTANCE)
	}

	@Check
	def checkUniqueName(Entity x) {
		//TODO MI2
		//		if (x.megamodel.allModels.map[declarations].flatten.filter(Entity).exists[name == x.name && type != x.type])
		//			error('''The entity '«x.name»' does not overload it's correspondent entities''',
		//				MegalPackage.Literals.NAMED__NAME, ENTITY_MISOVERLOAD)
	}

	@Check
	def checkUniqueName(EntityType x) {
		//TODO MI2
		//		if (x.megamodel.allModels.map[declarations].flatten.filter(EntityType).exists[
		//			name == x.name && supertype != x.supertype])
		//			error('''The entity type '«x.name»' does not overload it's correspondent entity types''',
		//				MegalPackage.Literals.NAMED__NAME, ENTITY_TYPE_MISOVERLOAD)
	}

	/**
	 * This check requires expensive megamodel evaluation
	 */
	@Check(CheckType.EXPENSIVE)
	def checkValidate(Megamodel m) {
//TODO MI2
		
//		// Evaluate parallel, join immediately
//		val r = Evaluators.evaluate(m)
//
//		// Look the relations in this model up, if they are invalid, mark them 
//		for (e : m.declarations.filter(Relationship))
//			if (r.invalid.contains(e))
//				error('''The relationship '«e»' is invalid in this place''', e, MegalPackage.Literals.RELATIONSHIP__TYPE)
	}
}
