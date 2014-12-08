package org.softlang.megal.evaluation;

import java.util.Set;
import java.util.stream.Collectors;

import org.softlang.megal.Entity;
import org.softlang.megal.Link;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.impl.EntityImpl;

public class EntityEval extends EntityImpl {
	@Override
	public Megamodel getMegamodel() {
		if (eContainer() == null || !(eContainer() instanceof Megamodel))
			throw new IllegalStateException("Dangeling declaration");

		return (Megamodel) eContainer();
	}

	@Override
	public Set<Link> getLinks() {
		// Filter the visible bindings that point to the containing entity
		return getMegamodel().getVisibleBindings().stream()
				.filter(l -> l.getLink() == this).collect(Collectors.toSet());
	}

	@Override
	public Set<Entity> followOutgoing(RelationshipType type) {
		// From all visible declarations filter those that are relationships and
		// have this entity as left hand side
		return getMegamodel()
				.getVisibleDeclarations()
				.stream()
				.filter(d -> d instanceof Relationship
						&& ((Relationship) d).getLeft() == this)
				.map(r -> ((Relationship) r).getRight())
				.collect(Collectors.toSet());
	}

	@Override
	public Set<Entity> followIncoming(RelationshipType type) {
		// From all visible declarations filter those that are relationships and
		// have this entity as right hand side
		return getMegamodel()
				.getVisibleDeclarations()
				.stream()
				.filter(d -> d instanceof Relationship
						&& ((Relationship) d).getRight() == this)
				.map(r -> ((Relationship) r).getLeft())
				.collect(Collectors.toSet());
	}

	@Override
	public boolean isAssigned() {
		return getName() != null && getType() != null;
	}

	@Override
	public String toString() {
		return getName() + ":" + getType();
	}
}
