/*
 * generated by Xtext
 */
package org.softlang.megal.language.validation

import org.eclipse.xtext.validation.Check
import org.softlang.megal.RelationshipTypeInstance
import org.softlang.megal.Relationship
import org.softlang.megal.MegalPackage
import org.softlang.megal.Relationships

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
	@Check
	def checkRelationshipTypeApplicable(Relationship it) {
		if (appliedInstance == null)
			error('''No instance applicable for «type?.name»''', MegalPackage.Literals.RELATIONSHIP__TYPE)
	}
}
