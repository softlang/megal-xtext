package plugins.root.elementof;

import static com.google.common.collect.Iterables.getFirst;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;

public class PairElementWhenComputed extends EvaluatorPlugin {
	@Override
	public void evaluate(Context context, Relationship relationship) {
		// Get pair
		Entity pair = relationship.getLeft();

		// Get relationships to the parameters
		Relationship firstOf = getFirst(pair.incoming("firstOf"), null);
		Relationship secondOf = getFirst(pair.incoming("secondOf"), null);

		// If any of them does not exist, return
		if (firstOf == null || secondOf == null)
			return;

		boolean firstComputed = firstOf.getLeft().hasAnnotation("Computed");
		boolean secondComputed = secondOf.getLeft().hasAnnotation("Computed");

		if (firstComputed != secondComputed)
			context.valid(relationship, pair, firstOf, secondOf);
		else
			context.error("Either first or second must be computed");
	}
}
