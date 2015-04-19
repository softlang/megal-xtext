package org.softlang.megal.mi2.reasoning;

import org.softlang.megal.mi2.RelationshipType;

import com.google.common.collect.ImmutableList;

public abstract class AbstractReasoner implements Reasoner {
	@Override
	public RelationshipType getRelationshipType(String name, String left, boolean leftMany, String right,
			boolean rightMany) {
		return getRelationshipType(name, left, leftMany, ImmutableList.of(), right, rightMany, ImmutableList.of());
	}

	@Override
	public RelationshipType getRelationshipType(String name, String left, String right) {
		return getRelationshipType(name, left, false, ImmutableList.of(), right, false, ImmutableList.of());
	}
}
