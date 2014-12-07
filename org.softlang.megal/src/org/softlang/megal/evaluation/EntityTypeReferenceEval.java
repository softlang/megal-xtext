package org.softlang.megal.evaluation;

import org.softlang.megal.EntityType;
import org.softlang.megal.EntityTypeReference;
import org.softlang.megal.impl.EntityTypeReferenceImpl;

import com.google.common.base.Joiner;

public class EntityTypeReferenceEval extends EntityTypeReferenceImpl {
	@Override
	public boolean isAssignableFrom(EntityTypeReference type) {
		if (this == type)
			return true;
		if (type == null)
			return false;

		if (isMany() != type.isMany())
			return false;

		EntityType r = type.getDefinition();

		while (true) {
			if (getDefinition() == r)
				return true;

			if (r.getSupertype() != null) {
				if (isMany() != r.getSupertype().isMany())
					return false;

				r = r.getSupertype().getDefinition();
			} else {
				return false;
			}
		}
	}

	@Override
	public String toString() {
		if (getParameters().isEmpty())
			return getDefinition() + (isMany() ? "+" : "");

		return getDefinition() + "[" + Joiner.on(" -> ").join(getParameters())
				+ "]" + (isMany() ? "+" : "");
	}
}
