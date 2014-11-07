package org.softlang.megal.api;

import org.softlang.megal.Entity;
import org.softlang.megal.Link;

import com.google.common.base.Optional;

public interface Resolver {
	public Optional<Link> resolve(Entity e);
}
