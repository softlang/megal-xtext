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
		Entity pair = relationship.getLeft();

		if (!pair.getBinding().isPresent())
			return;

		Relationship firstOf = getFirst(pair.incoming("firstOf"), null);
		Relationship secondOf = getFirst(pair.incoming("secondOf"), null);

		Entity first = firstOf.getLeft();
		Entity second = secondOf.getLeft();

		if (!first.getBinding().isPresent())
			return;
		if (!second.getBinding().isPresent())
			return;

		Object buildScript = pair.getBinding().get();
		Object xsd = first.getBinding().get();
		Object javaPackage = second.getBinding().get();

		System.out.println(context.getAddress(xsd));
		System.out.println(context.getAddress(javaPackage));

		context.emit(Message.warning("TODO Find elementOf evidence for " + xsd
				+ " -> " + javaPackage + " in " + buildScript));
	}
}
