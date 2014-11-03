package org.softlang.megal.sirius.entitydiagram;

import org.softlang.megal.Entity;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;

public class EntityDiagramServices {

	public String getLable(Entity entity) {

		String name = entity.getName();

		// Add type to entity name
		if (entity.getType() != null && entity.getType().getDefinition() != null)
			name = name + ":" + entity.getType().getDefinition().getName();

		return name;
	}

	public String getLable(Relationship relationship) {

		RelationshipType type = relationship.getType();

		if (type == null)
			return "UNDEFINED";

		return type.getName();
	}

}
