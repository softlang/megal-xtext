package plugins.jaxb;

import java.util.Set;

import org.softlang.megal.api.Evaluator;
import org.softlang.megal.api.Output;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.reasoning.Reasoner;

import static com.google.common.collect.Iterables.*;
import static plugins.root.Debugging.*;

public class FindBuildScriptAsElementOfProof extends Evaluator {

	@Override
	public Output evaluate(Relationship relationship) {

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
