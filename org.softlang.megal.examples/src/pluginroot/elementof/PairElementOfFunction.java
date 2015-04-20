package pluginroot.elementof;

import org.softlang.megal.api.Evaluator;
import org.softlang.megal.api.Output;
import org.softlang.megal.mi2.Relationship;

/**
 * <p>
 * Parts for this evaluator will be seen as acceptors
 * </p>
 * 
 * @author Pazuzu
 *
 */
public class PairElementOfFunction extends Evaluator {

	@Override
	public Output evaluate(Relationship relationship) {
		try {
			for (Relationship pairRelationship : relationship.getLeft()
					.incoming()) {
				if ("secondOf".equals(pairRelationship.getType().getName()))
					if (pairRelationship.getLeft().getAnnotations()
							.containsKey("Computed"))
						return Output.valid();
			}

			return Output.notApplicable();
		} catch (Exception e) {
			return Output.error(e.getMessage());
		}
	}

}
