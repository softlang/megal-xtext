package plugins.root.elementof;

import static com.google.common.collect.Iterables.*;
import static java.util.Collections.emptySet;
import static java.util.Collections.singleton;

import java.util.Set;

import org.softlang.megal.mi2.Element;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.Message;
import org.softlang.megal.mi2.api.context.Context;
import static plugins.util.Prelude.*;

/**
 * <p>
 * Parts for this evaluator will be seen as acceptors
 * </p>
 * 
 * @author Pazuzu
 *
 */
public class FileElementOfLanguage extends EvaluatorPlugin {
	@Override
	public Set<Element> evaluate(Context context, Relationship relationship) {
		Entity artifact = relationship.getLeft();
		Entity language = relationship.getRight();

		if (!artifact.getBinding().isPresent())
			return null;

		boolean noRealization = true;
		for (Acceptor acceptor : filter(getParts(), Acceptor.class)) {
			if (!any(acceptor.getRealization(),
					x -> isElementOfLanguage(artifact, x)))
				continue;

			noRealization = false;

			if (acceptor.accept(context,
					context.getChars(artifact.getBinding().get())))
				return singleton(relationship);
		}

		if (noRealization)
			return null;

		context.emit(Message.error(artifact
				+ " is not an element of the language" + language));
		return emptySet();

	}
}
