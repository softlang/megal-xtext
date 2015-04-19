package org.softlang.megal.mi2.processing;

import java.util.Set;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.reasoning.Provider;
import org.softlang.megal.mi2.reasoning.Providers;
import org.softlang.megal.mi2.reasoning.Reasoner;
import org.softlang.megal.mi2.reasoning.Reasoner.PerformanceCaps;

import com.google.common.base.Function;

@FunctionalInterface
public interface Processor extends Function<Reasoner, KB> {
	/**
	 * <p>
	 * Gets the performance caps this processor desires for good performance.
	 * </p>
	 * 
	 * @return Returns a set of caps
	 */
	default Set<PerformanceCaps> getCaps() {
		return PerformanceCaps.ALL;
	}

	/**
	 * <p>
	 * Applies this processor using a reasoner provided by the provider.
	 * </p>
	 * 
	 * @param provider
	 *            The provider for the reasoners
	 * @param kb
	 *            The knowledge base to handle
	 * @return The output knowledge base
	 */
	default KB applyWith(Provider provider, KB kb) {
		return apply(provider.obtain(getCaps(), kb));
	}

	/**
	 * <p>
	 * Applies this processor using a reasoner provided by a provider.
	 * </p>
	 * 
	 * @param kb
	 *            The knowledge base to handle
	 * @return The output knowledge base
	 */
	default KB applyWith(KB kb) {
		return apply(Providers.obtain(getCaps(), kb));
	}
}
