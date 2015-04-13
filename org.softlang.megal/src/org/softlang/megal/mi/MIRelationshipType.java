package org.softlang.megal.mi;

import org.softlang.megal.mi.util.IdBuilder;

/**
 * <p>
 * There must be no relationship with the same {@link #getName()} and the same
 * {@link #getLeft()} and {@link #getRight()} in the containing megamodel.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class MIRelationshipType extends MINamed {
	@Override
	public String getId() {
		return IdBuilder.of("relationship").add(getLeft()).add(getName()).add(getRight()).toString();
	}

	public abstract MIEntityTypeReference getLeft();

	public abstract MIEntityTypeReference getRight();

	@Override
	public String toString() {
		return getName() + " < " + getLeft().getDefinition().getName() + " * " + getRight().getDefinition().getName();
	}
}
