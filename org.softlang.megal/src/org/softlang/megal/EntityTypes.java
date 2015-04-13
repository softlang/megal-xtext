package org.softlang.megal;

import static com.google.common.collect.FluentIterable.from;

public class EntityTypes {
	public static Iterable<EntityType> allEntityTypes(Megamodel m) {
		return from(m.allModels()).transformAndConcat(Megamodel::getDeclarations).filter(EntityType.class);
	}

	public static Iterable<Entity> filterInstances(Iterable<Declaration> declarations, TypeReference ref) {
		return from(declarations).filter(Entity.class).filter(
				r -> r.getType().equals(ref) || r.getType().latticeAbove(ref));
	}

	public static Iterable<Entity> instances(Megamodel m, TypeReference ref) {
		return filterInstances(m.getDeclarations(), ref);
	}

	public static Iterable<Entity> allInstances(Megamodel m, TypeReference ref) {
		return filterInstances(from(m.allModels()).transformAndConcat(Megamodel::getDeclarations), ref);
	}
}
