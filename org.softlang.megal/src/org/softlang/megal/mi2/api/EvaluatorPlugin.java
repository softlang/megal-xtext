package org.softlang.megal.mi2.api;

import java.util.Set;

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
	public final Set<Element> evaluate(Context context, Element element) {
		if (element instanceof EntityType)
			return evaluate(context, (EntityType) element);
		else if (element instanceof RelationshipType)
			return evaluate(context, (RelationshipType) element);
		else if (element instanceof Entity)
			return evaluate(context, (Entity) element);
		else if (element instanceof Relationship)
			return evaluate(context, (Relationship) element);
		else
			return null;
	}

	public Set<Element> evaluate(Context context, EntityType entityType) {
		return null;
	}

	public Set<Element> evaluate(Context context, RelationshipType relationshipType) {
		return null;
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
	public Set<Element> evaluate(Context context, Entity entity) {
		return null;
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
	public Set<Element> evaluate(Context context, Relationship relationship) {
		return null;
	}
}
