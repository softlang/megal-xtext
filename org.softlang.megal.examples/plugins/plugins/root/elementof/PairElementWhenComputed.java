package plugins.root.elementof;

import static com.google.common.collect.ImmutableSet.of;
import static com.google.common.collect.Iterables.getFirst;

import java.util.Set;

import org.softlang.megal.mi2.Element;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.Message;
import org.softlang.megal.mi2.api.context.Context;

public class PairElementWhenComputed extends EvaluatorPlugin {
	@Override
	public Set<Element> evaluate(Context context, Relationship relationship) {
		// Get pair
		Entity pair = relationship.getLeft();

		// Get relationships to the parameters
		Relationship firstOf = getFirst(pair.incoming("firstOf"), null);
		Relationship secondOf = getFirst(pair.incoming("secondOf"), null);

		// If any of them does not exist, return
		if (firstOf == null || secondOf == null)
			return null;

		boolean firstComputed = firstOf.getLeft().hasAnnotation("Computed");
		boolean secondComputed = secondOf.getLeft().hasAnnotation("Computed");

		if (firstComputed != secondComputed)
			return of(pair, relationship, firstOf, secondOf);

		context.emit(Message.error("Either first or second must be computed"));
		return of();
	}
}
