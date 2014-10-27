package org.softlang.megal

import java.util.UUID

class Guard {

	/**
	 * Provides a guard function that may abort subsequent execution
	 */
	def static <T> guarded(T otherwise, (GuardHelper)=>T expression) {

		// Keep track of self
		val i = UUID.randomUUID

		// Make the guard helper for the ID
		val h = new GuardHelper(i)
		try {

			// Apply expression with it
			return expression.apply(h)
		} catch (GuardException e) {

			// Check track, if other track, throw
			if (e.UUID == i)
				return otherwise
			else
				throw e
		}
	}

	/**
	 * Provides a guard function that may abort subsequent execution
	 */
	def static guarded((GuardHelper)=>void expression) {

		// Keep track of self
		val i = UUID.randomUUID

		// Make the guard helper for the ID
		val h = new GuardHelper(i)
		try {

			// Apply expression with it
			expression.apply(h)
		} catch (GuardException e) {

			// Check track, if other track, throw
			if (e.UUID != i)
				throw e
		}
	}

	def static void main(String[] args) {
		guarded[
			check(true)
			notEmpty(#["ad"])
			println("Hello")
		]
		guarded[
			check(true)
			notEmpty(#[])
			println("You should not see me")
		]
		
		println(guarded(1)[
			check(1 < 2)
			return 2
		]) // Should output 2
		
		println(guarded(1)[
			check(1 < 2)
			checkNot(1 < 2)
			return 2
		]) // Should output 1
	}

}
