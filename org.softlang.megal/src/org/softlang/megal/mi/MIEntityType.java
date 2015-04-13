package org.softlang.megal.mi;

import org.softlang.megal.mi.util.IdBuilder;

/**
 * <p>
 * There must be no entity type with the same {@link #getName()} in the
 * containing megamodel.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class MIEntityType extends MINamed {
	@Override
	public String getId() {
		return IdBuilder.of("entityType").add(getName()).toString();
	}

	public abstract MIEntityTypeReference getSupertype();

	@Override
	public String toString() {
		if (getSupertype() == null)
			return getName();

		return getName() + " < " + getSupertype();
	}
}
