package org.softlang.megal.mi2.processing;

import java.util.Set;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.reasoning.Reasoner;
import org.softlang.megal.mi2.reasoning.Reasoner.PerformanceCaps;
import org.softlang.megal.mi2.util.HashMultitable;
import org.softlang.megal.mi2.util.Multitable;

import com.google.common.collect.ImmutableSet;

public class PartOfProcessor implements Processor {
	public static final PartOfProcessor INSTANCE = new PartOfProcessor();

	@Override
	public Set<PerformanceCaps> getCaps() {
		return ImmutableSet.of();
	}

	public KB apply(Reasoner r) {
		Multitable<String, String, String> relationships = HashMultitable.create();

		for (Entity e : r.getEntities()) {
			int i = e.getName().lastIndexOf('.');
			if (i >= 0) {
				String container = e.getName().substring(0, i);
				relationships.put(e.getName(), container, "partOf");
			}
		}

		return KBs.builder().setTitle("PartOfs").setRelationships(relationships).build();
	}
}
