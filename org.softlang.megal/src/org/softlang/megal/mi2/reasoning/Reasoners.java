package org.softlang.megal.mi2.reasoning;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.reasoning.variants.NaiveReasoner;

public class Reasoners {
	public static Reasoner create(KB input) {
		return new NaiveReasoner(input);
	}
}
