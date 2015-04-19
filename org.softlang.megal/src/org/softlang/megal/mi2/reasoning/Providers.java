package org.softlang.megal.mi2.reasoning;

import java.util.Set;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.reasoning.Reasoner.PerformanceCaps;

public class Providers {
	/**
	 * <p>
	 * The default reasoner provider.
	 * </p>
	 */
	public static final Provider DEFAULT = new Provider();

	/**
	 * <p>
	 * Puts the default reasoner productions.
	 * </p>
	 */
	static {
		DEFAULT.put(NaiveReasoner.CAPS, NaiveReasoner::new);
	}

	/**
	 * <p>
	 * Obtains a reasoner on an input that matches the desired capabilities at
	 * most.
	 * </p>
	 * 
	 * @param caps
	 *            The capabilities to match
	 * @param input
	 *            The input to translate
	 * @return Returns the production in the registry applied on the input
	 */
	public static Reasoner obtain(Set<PerformanceCaps> caps, KB input) {
		return DEFAULT.obtain(caps, input);
	}

	/**
	 * <p>
	 * Obtains a reasoner on an input with the most capabilities.
	 * </p>
	 * 
	 * @param input
	 *            The input to translate
	 * @return Returns the production in the registry applied on the input
	 */
	public static Reasoner obtain(KB input) {
		return DEFAULT.obtain(input);
	}
}
