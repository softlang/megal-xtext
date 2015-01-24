package org.softlang.megal.evaluation;

import org.softlang.megal.Declaration;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Declarations;
import org.softlang.megal.TypeReference;
import org.softlang.megal.impl.RelationshipTypeImpl;

public class RelationshipTypeEval extends RelationshipTypeImpl {
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

	@Override
	public TypeReference instanceLeft() {
		if (getInstances().size() == 1)
			return getInstances().get(0).getLeft();
		return null;
	}

	@Override
	public TypeReference instanceRight() {
		if (getInstances().size() == 1)
			return getInstances().get(0).getRight();
		return null;
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The representation is descriptive for
	 * {@link Declarations#match(org.softlang.megal.Named, String)}
	 * </p>
	 * 
	 * <code>
	 * getName();
	 * </code>
	 */
	@Override
	public String toString() {
		return getName();
	}

}
