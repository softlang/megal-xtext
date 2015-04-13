package org.softlang.megal.mi;

import java.util.Collection;

public abstract class MIMegamodel extends MINamed {
	public abstract Collection<? extends MIEntityType> getEntityTypes();

	public abstract Collection<? extends MIRelationshipType> getRelationshipTypes();

	public abstract Collection<? extends MIEntity> getEntities();

	public abstract Collection<? extends MIRelationship> getRelationships();

	@Override
	public String toString() {
		return "Megamodel " + getName() + " {" + getEntityTypes() + ", " + getRelationshipTypes() + ", "
				+ getEntities() + ", " + getRelationships() + "}";
	}
}
