package org.softlang.megal.evaluation;

import org.softlang.megal.Elements;
import org.softlang.megal.EntityType;
import org.softlang.megal.EntityTypeReference;
import org.softlang.megal.impl.EntityTypeReferenceImpl;

import com.google.common.base.Joiner;

public class EntityTypeReferenceEval extends EntityTypeReferenceImpl {
	// TODO: Not accounting "many" and "parameters" for now

	@Override
	public boolean isAssignableFrom(EntityTypeReference type) {
		if (this == type)
			return true;
		if (type == null)
			return false;

		return isAssignableFrom(type.getDefinition(), type.isMany());
	}

	@Override
	public boolean isAssignableFrom(EntityType type, boolean isMany) {
		if (type == null)
			return false;

		while (true) {
			if (getDefinition() == type)
				return true;

			if (type.getSupertype() != null)
				type = type.getSupertype().getDefinition();
			else
				return false;
		}
	}

	@Override
	public String toString() {
		if (getParameters().isEmpty())
			return getDefinition() + (isMany() ? "+" : "");

		return getDefinition() + "[" + Joiner.on(" -> ").join(getParameters())
				+ "]" + (isMany() ? "+" : "");
	}

	@Override
	public boolean equalBaseVia(EntityTypeReference other) {
		return other != null && isMany() == other.isMany()
				&& Elements.equalBase(getParameters(), other.getParameters())
				&& getDefinition().equalBase(other.getDefinition());
	}
}
