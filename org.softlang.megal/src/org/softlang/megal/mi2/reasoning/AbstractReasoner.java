package org.softlang.megal.mi2.reasoning;

import org.softlang.megal.mi2.RelationshipType;

public abstract class AbstractReasoner implements Reasoner {

	@Override
	public RelationshipType getRelationshipType(String name, String left, String right) {
		return getRelationshipType(name, left, false, right, false);
	}
}
