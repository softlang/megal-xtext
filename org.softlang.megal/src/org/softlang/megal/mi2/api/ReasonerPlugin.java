package org.softlang.megal.mi2.api;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
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
public interface ReasonerPlugin extends Plugin {

	KB derive(Context context, EntityType entityType);

	KB derive(Context context, RelationshipType relationshipType);

	KB derive(Context context, Entity entity);

	KB derive(Context context, Relationship relationship);
}
