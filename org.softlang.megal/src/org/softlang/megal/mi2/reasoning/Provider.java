package org.softlang.megal.mi2.reasoning;

import static com.google.common.base.Objects.equal;
import static com.google.common.collect.Iterables.getFirst;
import static com.google.common.collect.Sets.intersection;
import static java.lang.Integer.compare;

import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.reasoning.Reasoner.PerformanceCaps;

import com.google.common.base.Function;
import com.google.common.collect.Maps;

/**
 * <p>
 * The reasoner provider finds a reasoner implementation for capabilities.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public class Provider {

	/**
	 * <p>
	 * Registry of capabilities and productions, sorted by number of
	 * capabilities descendingly.
	 * </p>
	 */
	private final SortedMap<Set<PerformanceCaps>, Function<? super KB, ? extends Reasoner>> registry = Maps
			.newTreeMap((x, y) -> -compare(x.size(), y.size()));

	/**
	 * <p>
	 * Registers a constructor.
	 * </p>
	 * 
	 * @param caps
	 *            The capabilities of the constructed reasoners
	 * @param production
	 *            The constructor of the reasoner
	 */
	public void put(Set<PerformanceCaps> caps, Function<? super KB, ? extends Reasoner> production) {
		registry.put(caps, x -> {
			Reasoner r = production.apply(x);

			if (!equal(caps, r.getCaps()))
				throw new IllegalStateException("Mismatching capabilities of reasoner and registration.");

			return r;
		});
	}

	/**
	 * <p>
	 * Unregisters a constructor.
	 * </p>
	 * 
	 * @param caps
	 *            The capabilities of the reasoners to remove
	 */
	public void remove(Set<PerformanceCaps> caps) {
		registry.remove(caps);
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
	public Reasoner obtain(Set<PerformanceCaps> caps, KB input) {
		// Try to get a perfect match
		Function<? super KB, ? extends Reasoner> production = registry.get(caps);

		// If there is such a production, use it
		if (production != null)
			return production.apply(input);

		// Else find by most intersecting elements
		int bestScore = -1;
		for (Entry<Set<PerformanceCaps>, Function<? super KB, ? extends Reasoner>> e : registry.entrySet()) {
			int score = intersection(e.getKey(), caps).size();
			if (score > bestScore)
				production = e.getValue();
		}

		// Apply the production
		return production.apply(input);
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
	public Reasoner obtain(KB input) {
		return getFirst(registry.values(), null).apply(input);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((registry == null) ? 0 : registry.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provider other = (Provider) obj;
		if (registry == null) {
			if (other.registry != null)
				return false;
		} else if (!registry.equals(other.registry))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ReasonerProvider [registry=" + registry + "]";
	}

}
