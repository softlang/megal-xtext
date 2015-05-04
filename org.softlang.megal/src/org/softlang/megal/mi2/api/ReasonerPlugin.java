package org.softlang.megal.mi2.api;

import org.softlang.megal.mi2.Element;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.api.context.Context;

/**
 * <p>
 * Extension of the KB by derived items.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class ReasonerPlugin extends Plugin {
	public final KB derive(Context context, Element element) {
		if (element instanceof EntityType)
			return derive(context, (EntityType) element);
		else if (element instanceof RelationshipType)
			return derive(context, (RelationshipType) element);
		else if (element instanceof Entity)
			return derive(context, (Entity) element);
		else if (element instanceof Relationship)
			return derive(context, (Relationship) element);
		else
			return KBs.empty();
	}

	public KB derive(Context context, EntityType entityType) {
		return KBs.empty();
	}

	public KB derive(Context context, RelationshipType relationshipType) {
		return KBs.empty();
	}

	public KB derive(Context context, Entity entity) {
		return KBs.empty();
	}

	public KB derive(Context context, Relationship relationship) {
		return KBs.empty();
	}
}
