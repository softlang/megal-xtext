package org.softlang.megal.mi2.processing;

import static org.softlang.megal.util.Persistent.head;
import static org.softlang.megal.util.Persistent.tail;

import java.util.List;
import java.util.Set;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.reasoning.Provider;
import org.softlang.megal.mi2.reasoning.Providers;
import org.softlang.megal.mi2.reasoning.Reasoner;
import org.softlang.megal.mi2.reasoning.Reasoner.PerformanceCaps;

import com.google.common.collect.ImmutableList;

public class UnionProcessor implements Processor {
	private final Provider provider;

	private final ImmutableList<Processor> processors;

	protected UnionProcessor(Provider provider, List<Processor> processors) {
		this.provider = provider;
		this.processors = ImmutableList.copyOf(processors);
	}

	public Provider getProvider() {
		return provider;
	}

	public ImmutableList<Processor> getProcessors() {
		return processors;
	}

	public static UnionProcessor of(Provider provider, List<Processor> processors) {
		return new UnionProcessor(provider, processors);
	}

	public static UnionProcessor of(Provider provider, Processor... processors) {
		return new UnionProcessor(provider, ImmutableList.copyOf(processors));
	}

	public static UnionProcessor of(List<Processor> processors) {
		return new UnionProcessor(Providers.DEFAULT, processors);
	}

	public static UnionProcessor of(Processor... processors) {
		return new UnionProcessor(Providers.DEFAULT, ImmutableList.copyOf(processors));
	}

	@Override
	public Set<PerformanceCaps> getCaps() {
		return head(processors).getCaps();
	}

	@Override
	public KB apply(Reasoner input) {
		// If no processor, this is an identity processor
		if (processors.isEmpty())
			return input.getKB();

		// Apply the head processor on to get a carry variable
		KB current = KBs.union(input.getKB(), head(processors).apply(input));

		// Continue with the tail
		for (Processor b : tail(processors))
			// Union the current data with the input dominating
			current = KBs.union(current, b.applyWith(provider, current));

		// Return the carry variable
		return current;
	}
}
