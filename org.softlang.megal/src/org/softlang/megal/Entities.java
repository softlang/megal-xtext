package org.softlang.megal;

import static com.google.common.collect.FluentIterable.from;

public class Entities {
	public static Iterable<Entity> allEntities(Megamodel m) {
		return from(m.allModels()).transformAndConcat(Megamodel::getDeclarations).filter(Entity.class);
	}
}
