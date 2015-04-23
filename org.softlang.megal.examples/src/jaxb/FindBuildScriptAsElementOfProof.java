package jaxb;

import org.softlang.megal.api.Evaluator;
import org.softlang.megal.api.Output;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;

import static com.google.common.collect.Iterables.*;

public class FindBuildScriptAsElementOfProof extends Evaluator {
	@Override
	public Output evaluate(Relationship relationship) {
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
