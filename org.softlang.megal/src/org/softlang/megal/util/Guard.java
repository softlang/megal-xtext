package org.softlang.megal.util;

import java.util.UUID;

public class Guard {
	public static <T> T guarded(T otherwise, GuardedProvider<T> expression) throws GuardException {
		// Keep track of self
		UUID identity = UUID.randomUUID();

		// Make the guard helper for the ID
		GuardHelper helper = new GuardHelper(identity);
		try {

			// Apply expression with it
			return expression.provide(helper);
		} catch (GuardException e) {

			// Check track, if other track, throw
			if (e.getUUID().equals(identity))
				return otherwise;
			else
				throw e;
		}
	}

	public static void guarded(GuardedRunnable expression) throws GuardException {
		// Keep track of self
		UUID identity = UUID.randomUUID();

		// Make the guard helper for the ID
		GuardHelper helper = new GuardHelper(identity);
		try {

			// Apply expression with it
			expression.run(helper);
		} catch (GuardException e) {

			// Check track, if other track, throw
			if (!e.getUUID().equals(identity))
				throw e;
		}
	}
}
