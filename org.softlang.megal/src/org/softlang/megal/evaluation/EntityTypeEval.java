package org.softlang.megal.evaluation;

import org.softlang.megal.Declaration;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Nameds;
import org.softlang.megal.impl.EntityTypeImpl;

public class EntityTypeEval extends EntityTypeImpl {
	@Override
	public Megamodel megamodel() {
		if (getOrigin() != null) {
			if (getOrigin() instanceof Megamodel)
				return (Megamodel) getOrigin();

			if (getOrigin() instanceof Declaration)
				return ((Declaration) getOrigin()).megamodel();
		}

		return (Megamodel) eContainer();
	}

/**
	 * {@inheritDoc}
	 * <p>
	 * The representation is descriptive for
	 * {@link Nameds#match(org.softlang.megal.Named, String)}
	 * </p>
	 * <code>
	 * getName() + (getSupertype() == null ? " as entity" : "<" + getSupertype());
	 * </code>
	 */
	@Override
	public String toString() {
		return getName() + (getSupertype() == null ? " as entity" : "<" + getSupertype());
	}

}
