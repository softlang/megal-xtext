package plugins.root.elementof;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.getFirst;
import static java.util.Collections.emptySet;

import java.util.Set;

import org.softlang.megal.mi2.Element;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.Message;
import org.softlang.megal.mi2.api.context.Context;

/**
 * <p>
 * Parts for this evaluator will be seen as acceptors
 * </p>
 * 
 * @author Pazuzu
 *
 */
public class FilesElementOfLanguage extends EvaluatorPlugin {
	@Override
	public Set<Element> evaluate(Context context, Relationship relationship) {
		Entity artifacts = relationship.getLeft();
		Entity language = relationship.getRight();

		if (!artifacts.getBinding().isPresent())
			return null;

		FileElementOfLanguage acceptor = getFirst(
				filter(getParts(), FileElementOfLanguage.class), null);
		if (acceptor == null)
			return null;

		// TODO: problem with file system interface
		context.emit(Message.error("Not implemented, I have an acceptor ("
				+ acceptor + ") but no file system listing access"));

		return emptySet();

	}
}
