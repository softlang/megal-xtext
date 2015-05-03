package plugins.root.elementof;

import static com.google.common.collect.Iterables.filter;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.Message;
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
		for (Object binding : relationship.getLeft().getBinding().asSet()) {
			CharSource s = context.getChars(binding);
			if (s == null)
				continue;

			for (Acceptor a : filter(getParts(), Acceptor.class))
				if (a.getRealization().contains(relationship.getRight()))
					if (!a.accept(context, s))
						context.emit(Message.error(relationship.getLeft()
								.getName()
								+ " is not an element of the language"
								+ relationship.getRight().getName()));
		}
	}
}
