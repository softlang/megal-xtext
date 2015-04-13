package org.softlang.megal.util;

@FunctionalInterface
public interface GuardedRunnable {
	public void run(GuardHelper helper) throws GuardException;
}
