package plugins.jaxb;

import static com.google.common.collect.Iterables.getFirst;

import java.util.Set;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.Message;
import org.softlang.megal.mi2.api.context.Context;

public class FindBuildScriptAsElementOfProof extends EvaluatorPlugin {

	@Override
	public void evaluate(Context context, Relationship relationship) {

		Set<Object> bindings = relationship.getRight().getBinding().asSet();

		Relationship firstOf = getFirst(
				relationship.getLeft().incoming("firstOf"), null);
		Relationship secondOf = getFirst(
				relationship.getLeft().incoming("secondOf"), null);

		Entity first = firstOf.getLeft();
		Entity second = secondOf.getLeft();

		for (Object firstBinding : first.getBinding().asSet())
			for (Object secondBinding : second.getBinding().asSet())
				context.emit(Message
						.warning("TODO Find elementOf evidence for \r\nFirst: "
								+ firstBinding + "\r\nSecond: " + secondBinding));
	}
}
