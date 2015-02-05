package org.softlang.megal;

import static com.google.common.collect.FluentIterable.from;
import static com.google.common.base.Objects.*;

public class RelationshipTypes {
	public static Iterable<RelationshipType> filterOverloads(Iterable<Declaration> declarations, RelationshipType type) {
		return from(declarations).filter(RelationshipType.class).filter(r -> equal(r.getName(), type.getName()));
	}

	public static Iterable<RelationshipType> overloads(Megamodel m, RelationshipType type) {
		return filterOverloads(m.getDeclarations(), type);
	}

	public static Iterable<RelationshipType> allOverloads(Megamodel m, RelationshipType type) {
		return filterOverloads(from(m.allModels()).transformAndConcat(Megamodel::getDeclarations), type);
	}
}
