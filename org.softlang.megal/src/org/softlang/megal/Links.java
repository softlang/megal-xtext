package org.softlang.megal;

import static com.google.common.collect.FluentIterable.from;
import static org.softlang.megal.Elements.logicEq;

public class Links {

	public static Iterable<Link> filterBindings(Iterable<Link> bindings, Entity link, Entity input, Entity output) {
		return from(bindings).filter(Link.class).filter(
				r -> logicEq(r.getLink(), link) && logicEq(r.getInput(), input) && logicEq(r.getOutput(), output));
	}

	public static Iterable<Link> bindings(Megamodel m, Entity link, Entity input, Entity output) {
		return filterBindings(m.getBindings(), link, input, output);
	}

	public static Iterable<Link> allBindings(Megamodel m, Entity link, Entity input, Entity output) {
		return filterBindings(from(m.allModels()).transformAndConcat(Megamodel::getBindings), link, input, output);
	}
}
