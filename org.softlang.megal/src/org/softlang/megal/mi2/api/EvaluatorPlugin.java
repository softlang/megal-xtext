package org.softlang.megal.mi2.api;

import org.softlang.megal.mi2.Element;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.api.context.Context;

/**
 * <p>
 * Plugins evaluate relationships or entities to new KBs and may emit errors they recognize during evaluation.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class EvaluatorPlugin extends Plugin {
	public final void evaluate(Context context, Element element) {
		if (element instanceof EntityType)
			evaluate(context, (EntityType) element);
		else if (element instanceof RelationshipType)
			evaluate(context, (RelationshipType) element);
		else if (element instanceof Entity)
			evaluate(context, (Entity) element);
		else if (element instanceof Relationship)
			evaluate(context, (Relationship) element);
		else
			return;
	}

	public void evaluate(Context context, EntityType entityType) {
	}

	public void evaluate(Context context, RelationshipType relationshipType) {
	}

	/**
	 * <p>
	 * Tries to evaluate the entity, may spawn new KBs that are considered as residue additions and are in turn
	 * evaluated again.
	 * </p>
	 * 
	 * @param context
	 *            The evaluation context
	 * @param entity
	 *            The evaluation item
	 */
	public void evaluate(Context context, Entity entity) {
	}

	/**
	 * <p>
	 * Tries to evaluate the relationship, may spawn new KBs that are considered as residue additions and are in turn
	 * evaluated again.
	 * </p>
	 * 
	 * @param context
	 *            The evaluation context
	 * @param relationship
	 *            The evaluation item
	 */
	public void evaluate(Context context, Relationship relationship) {
	}
}
