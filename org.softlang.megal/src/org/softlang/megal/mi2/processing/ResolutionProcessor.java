package org.softlang.megal.mi2.processing;

import java.util.Set;

import org.softlang.megal.api.Resolver;
import org.softlang.megal.api.Resolvers;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.reasoning.Reasoner;
import org.softlang.megal.mi2.reasoning.Reasoner.PerformanceCaps;
import org.softlang.sourcesupport.LocalSourceSupport;
import org.softlang.sourcesupport.SourceSupport;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.common.collect.SetMultimap;

public class ResolutionProcessor implements Processor {
	private final SourceSupport sourceSupport;

	public ResolutionProcessor(SourceSupport sourceSupport) {
		this.sourceSupport = sourceSupport;
	}

	public SourceSupport getSourceSupport() {
		return sourceSupport;
	}

	@Override
	public Set<PerformanceCaps> getCaps() {
		// Resolution processor needs to find all instances of resolvers
		return ImmutableSet.of(PerformanceCaps.INSTANCE_FINDING);
	}

	@Override
	public KB apply(Reasoner input) {

		Multimap<Entity, Resolver> resolvers = Resolvers.loadResolvers(sourceSupport, input);

		SetMultimap<String, String> bindings = HashMultimap.create();

		for (Entity entity : input.getEntities())
			for (Resolver resolver : resolvers.values())
				if (resolver.resolves(entity))
					bindings.put(entity.getName(), resolver.resolve(entity));

		return KBs.builder().setBindings(bindings).build();
	}

}
