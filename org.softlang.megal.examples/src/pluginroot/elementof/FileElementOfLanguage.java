package pluginroot.elementof;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.softlang.megal.api.Evaluator;
import org.softlang.megal.api.Output;
import org.softlang.megal.mi2.Relationship;

import pluginroot.Bindings;

/**
 * <p>
 * Parts for this evaluator will be seen as acceptors
 * </p>
 * 
 * @author Pazuzu
 *
 */
public class FileElementOfLanguage extends Evaluator {

	@Override
	public Output evaluate(Relationship relationship) {
		if (relationship.getLeft().getBindings().isEmpty())
			return Output.notApplicable();

		// Collect all the links for the entity that to be checked for
		// containment in language
		Collection<String> nr = newArrayList();
		for (String link : relationship.getLeft().getBindings())
			nr.add(link);

		// Find a character source from these links, usually there's just one
		// link for this entity
		String text;
		try {
			text = Bindings.read(nr);
		} catch (IOException | CoreException e) {
			return Output.error(e.getLocalizedMessage());
		}

		// Get all parts of the FileElementOfLanguage evaluator, these are the
		// language acceptor plugins
		for (Acceptor a : filter(getParts(), Acceptor.class))
			// If a realizes the entity in question, use it
			if (a.getRealized().contains(relationship.getRight())) {
				// If the character source, i.e. the language artifact, is
				// accepted, return a fine result

				return a.accept(text);
			}

		return Output.error(relationship.getLeft().getName()
				+ " is not an element of " + relationship.getRight().getName());
	}
}
