package org.softlang.megal.evaluation;

import org.softlang.megal.Megamodel;
import org.softlang.megal.impl.EntityTypeImpl;

import com.google.common.collect.FluentIterable;

public class EntityTypeEval extends EntityTypeImpl {
	@Override
	public Megamodel getMegamodel() {
		if (eContainer() == null || !(eContainer() instanceof Megamodel))
			throw new IllegalStateException("Dangeling declaration");

		return (Megamodel) eContainer();
	}

	@Override
	public String getShowName() {
		return FluentIterable.from(getInfo())
				.firstMatch(k -> k.getKey() == null)
				.transform(k -> k.getValue()).or(() -> getName());
	}

	@Override
	public boolean isAssigned() {
		return getName() != null;
	}

	@Override
	public String toString() {
		if (getSupertype() == null)
			return getName();
		return getName() + " < " + getSupertype();
	}
}
