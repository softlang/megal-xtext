package org.softlang.megal.mi2.api;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.Relationship;
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
	public KB derive(Context context, Entity entity) {
		return KB.empty();

	}

	public KB derive(Context context, Relationship relationship) {
		return KB.empty();
	}
}
