package pluginroot.elementof;

import static com.google.common.collect.Iterables.filter;

import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.Message;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;

import com.google.common.io.CharSource;

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
	public void evaluate(Context context, Relationship relationship) {
		if (!relationship.getRight().getBinding().isPresent())
			return;

		CharSource s = context.getChars(relationship.getRight().getBinding().get());

		for (Acceptor a : filter(getParts(), Acceptor.class))
			if (a.getRealization().contains(relationship.getRight()))
				if (!a.accept(s))
					context.emit(Message.error("The entity is not an element of " + relationship.getRight().getName()));

	}
}
