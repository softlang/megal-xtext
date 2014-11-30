package org.softlang.megal;

@FunctionalInterface
public interface GuardedProvider<R> {
	public R provide(GuardHelper helper) throws GuardException;
}
