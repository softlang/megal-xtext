package org.softlang.megal.mi;

public abstract class MIEntityType extends MINamed {
	public abstract MIEntityTypeReference getSupertype();

	@Override
	public String toString() {
		if (getSupertype() == null)
			return getName();

		return getName() + " < " + getSupertype();
	}
}
