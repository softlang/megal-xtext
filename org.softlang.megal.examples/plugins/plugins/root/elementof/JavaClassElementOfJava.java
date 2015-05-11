package plugins.root.elementof;

import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;

import static plugins.util.Prelude.*;

public class JavaClassElementOfJava extends EvaluatorPlugin {
	@Override
	public void evaluate(Context context, Relationship relationship) {
		if (isLanguageAssignable(relationship.getRight(), "Java")) {
			Class<? extends Object> resolved = context.getClass(relationship
					.getLeft().getBinding().orNull(), Object.class);
			if (resolved != null)
				context.valid();
			else
				context.error("The bound class is not accessible");
		}
	}
}
