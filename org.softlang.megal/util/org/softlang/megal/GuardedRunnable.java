package org.softlang.megal;

@FunctionalInterface
public interface GuardedRunnable {
	public void run(GuardHelper helper) throws GuardException;
}
