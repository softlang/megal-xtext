package org.softlang.megal.mi;

import static com.google.common.collect.FluentIterable.from;

import java.net.URI;
import java.util.Collection;

public abstract class MIEntity extends MINamed {
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
