package org.softlang.megal.mi;

import static com.google.common.collect.FluentIterable.from;

import java.net.URI;
import java.util.Collection;

import org.softlang.megal.mi.util.IdBuilder;

/**
 * <p>
 * There must be no entity with the same {@link #getName()} in the containing
 * megamodel.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class MIEntity extends MINamed {
	@Override
	public String getId() {
		return IdBuilder.of("entity").add(getName()).toString();
	}

	public abstract MIEntityTypeReference getType();

	public abstract Collection<URI> getLinks();

	public abstract Collection<? extends MIRelationship> getIncoming();

	public abstract Collection<? extends MIRelationship> getOutgoing();

	public Iterable<MIEntity> getIncoming(String type) {
		return from(getIncoming()).filter(x -> x.getType().getName().equals(type)).transform(MIRelationship::getLeft);
	}

	public Iterable<MIEntity> getOutgoing(String type) {
		return from(getOutgoing()).filter(x -> x.getType().getName().equals(type)).transform(MIRelationship::getRight);
	}

	@Override
	public String toString() {
		return getName() + ": " + getType();
	}
}
