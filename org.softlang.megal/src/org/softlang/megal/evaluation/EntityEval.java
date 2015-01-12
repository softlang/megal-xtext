package org.softlang.megal.evaluation;

import java.util.Set;
import java.util.stream.Collectors;

import org.softlang.megal.Element;
import org.softlang.megal.Elements;
import org.softlang.megal.Entity;
import org.softlang.megal.Link;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.impl.EntityImpl;

import com.google.common.base.Objects;
import com.google.common.collect.FluentIterable;

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
	public String getShowName() {
		return FluentIterable.from(getInfo())
				.firstMatch(k -> k.getKey() == null)
				.transform(k -> k.getValue()).or(() -> getName());
	}

	@Override
	public boolean isAssigned() {
		return getName() != null && getType() != null;
	}

	@Override
	public String toString() {
		return getName() + ":" + getType();
	}

	@Override
	public boolean equalBase(Element other) {
		if (this == other)
			return true;
		if (other == null)
			return false;
		
		if (!(other instanceof Entity))
			return false;
		Entity eother = (Entity) other;

		if (!Objects.equal(getName(), eother.getName()))
			return false;

		if (!Elements.equalBaseVia(getType(), eother.getType()))
			return false;

		return true;
	}
}
