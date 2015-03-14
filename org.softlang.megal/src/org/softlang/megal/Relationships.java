package org.softlang.megal;

import static com.google.common.collect.FluentIterable.from;
import static org.softlang.megal.Elements.logicEq;

public class Relationships {

	public static Iterable<Relationship> filterInvolved(Iterable<Declaration> declarations, Entity left,
			RelationshipType type, Entity right) {
		return from(declarations).filter(Relationship.class).filter(
				r -> (left == null || logicEq(r.getLeft(), left)) && (type == null || logicEq(r.getType(), type))
						&& (right == null || logicEq(r.getRight(), right)));
	}

	public static Iterable<Relationship> involved(Megamodel m, Entity left, RelationshipType type, Entity right) {
		return filterInvolved(m.getDeclarations(), left, type, right);
	}

	public static Iterable<Relationship> allInvolved(Megamodel m, Entity left, RelationshipType type, Entity right) {
		return filterInvolved(from(m.allModels()).transformAndConcat(Megamodel::getDeclarations), left, type, right);
	}

}
