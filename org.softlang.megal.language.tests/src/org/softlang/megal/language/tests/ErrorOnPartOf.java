package org.softlang.megal.language.tests;

import static java.util.Collections.singleton;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.Ref;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.mmp.Context;
import org.softlang.megal.mi2.mmp.Plugin;
import org.softlang.megal.mi2.mmp.data.Message;
import org.softlang.megal.mi2.util.ImmutableMultitable;

import com.google.common.collect.ImmutableMap;

public class ErrorOnPartOf extends Plugin {
	private final String TRICK = "Trickytrick";

	@Override
	public KB evaluate(Context context, Relationship relationship) {

		context.emit(Message.error("I plain and simply don't like this sh*t."));

		if (TRICK.equals(relationship.getRight().getName()))
			return KBs.emptyKB();

		return KBs.builder().setEntities(ImmutableMap.of(TRICK, Ref.to("Technology", false)))
				.setRelationships(ImmutableMultitable.of(TRICK, TRICK, singleton("partOf"))).build();
	}

	@Override
	public String toString() {
		return "ErrorOnPartOf";
	}
}
