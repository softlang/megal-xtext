package plugins.jaxb;

import static com.google.common.collect.Iterables.getFirst;

import java.io.IOException;
import java.util.Set;

import org.softlang.megal.api.Evaluator;
import org.softlang.megal.api.Output;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;

public class FindBuildScriptAsElementOfProof extends Evaluator {

	@Override
	public Output evaluate(Relationship relationship) throws IOException {

		Set<Object> bindings = relationship.getRight().getBindings();
		System.out.println(bindings);

		Relationship firstOf = getFirst(
				relationship.getLeft().incoming("firstOf"), null);
		Relationship secondOf = getFirst(
				relationship.getLeft().incoming("secondOf"), null);

		Entity first = firstOf.getLeft();
		Entity second = secondOf.getLeft();

		for (Object firstBinding : first.getBindings())
			for (Object secondBinding : second.getBindings())
				System.out.println("Trying to find an element of proof for "
						+ firstBinding + " * " + secondBinding);

		// TODO Auto-generated method stub
		return super.evaluate(relationship);
	}
}
