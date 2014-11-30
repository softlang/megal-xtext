package org.softlang.megal.evaluation;

import org.softlang.megal.EntityType;
import org.softlang.megal.Megamodel;
import org.softlang.megal.impl.EntityTypeImpl;

public class EntityTypeEval extends EntityTypeImpl {
	@Override
	public Megamodel getMegamodel() {
		if (eContainer() == null || !(eContainer() instanceof Megamodel))
			throw new IllegalStateException("Dangeling declaration");

		return (Megamodel) eContainer();
	}

	@Override
	public boolean isAssignableFrom(EntityType type) {
		return this == type
				|| (type.getSupertype() != null && isAssignableFrom(type
						.getSupertype().getDefinition()));
	}
}
