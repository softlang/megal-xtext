package org.softlang.megal.util;

@FunctionalInterface
public interface GuardedProvider<R> {
	public R provide(GuardHelper helper) throws GuardException;
}
