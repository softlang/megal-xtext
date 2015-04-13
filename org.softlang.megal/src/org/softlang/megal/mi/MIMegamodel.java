package org.softlang.megal.mi;

import static com.google.common.collect.Iterables.concat;

import java.util.Collection;

import org.softlang.megal.mi.util.IdBuilder;

public abstract class MIMegamodel extends MIAnnotated {
	@Override
	public String getId() {
		return IdBuilder.of("megamodel").add(getTitle()).toString();
	}

	public abstract String getTitle();

	public abstract Collection<? extends MIEntityType> getEntityTypes();

	public abstract Collection<? extends MIRelationshipType> getRelationshipTypes();

	public abstract Collection<? extends MIEntity> getEntities();

	public abstract Collection<? extends MIRelationship> getRelationships();

	public MIElement getById(CharSequence id) {
		for (MIElement x : getElements())
			if (x.getId().equals(id))
				return x;

		return null;
	}

	public Iterable<? extends MIElement> getElements() {
		return concat(getEntityTypes(), getRelationshipTypes(), getEntities(), getRelationships());
	}

	@Override
	public String toString() {
		return "Megamodel " + getTitle() + " {" + getEntityTypes() + ", " + getRelationshipTypes() + ", "
				+ getEntities() + ", " + getRelationships() + "}";
	}
}
