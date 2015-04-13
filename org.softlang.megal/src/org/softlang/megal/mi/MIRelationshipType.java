package org.softlang.megal.mi;

public abstract class MIRelationshipType extends MINamed {
	public abstract MIEntityTypeReference getLeft();

	public abstract MIEntityTypeReference getRight();

	@Override
	public String toString() {
		return getName() + " < " + getLeft().getDefinition().getName() + " * " + getRight().getDefinition().getName();
	}
}
