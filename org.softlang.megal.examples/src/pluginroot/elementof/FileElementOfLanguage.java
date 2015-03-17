package pluginroot.elementof;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.getOnlyElement;
import static com.google.common.collect.Lists.newArrayList;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.softlang.megal.MegalPlugin;
import org.softlang.megal.Relationship;
import org.softlang.megal.api.Evaluator;
import org.softlang.megal.api.Result;
import org.softlang.megal.api.URI;

import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;

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
	public Optional<Boolean> evaluate(Relationship relationship) {
		// Collect all the links for the entity that to be checked for
		// containment in language
		Collection<String> nr = newArrayList();
		for (String link : getAPI().getLinks(relationship.getLeft()))
			nr.add(link);

		// Find a character source from these links, usually there's just one
		// link for this entity
		CharSource s = findASource(nr);

		// Get all parts of the FileElementOfLanguage evaluator, these are the
		// language acceptor plugins
		for (Acceptor a : filter(getParts(), Acceptor.class))
			// If a realizes the entity in question, use it
			if (a.getRealized().contains(relationship.getRight())) {
				// If the character source, i.e. the language artifact, is
				// accepted, return a fine result
				if (a.accept(s))
					return Optional.of(true);

			}

		return Optional.of(false);
	}

	private static CharSource wrap(final IFile file) {
		// The charset used to read
		Charset charset;

		try {
			// Try reading from file,
			charset = Charset.forName(file.getCharset());
		} catch (CoreException e) {
			// Charset defaults to UTF-8
			charset = Charsets.UTF_8;
		}

		// Wrap the file as a byte source
		return new ByteSource() {
			@Override
			public InputStream openStream() throws IOException {
				try {
					return file.getContents();
				} catch (CoreException e) {
					throw new IOException(
							"Wrapped exception from Eclipse core.", e);
				}
			}
		}.asCharSource(charset);
	}

	private CharSource findASource(Collection<String> nr) {
		if (nr.size() != 1)
			return null;

		// Find the first IFile in the resolved items
		for (Object o : MegalPlugin.getEvaluator().evaluate(
				URI.valueOf(getOnlyElement(nr))))
			if (o instanceof IFile)
				return wrap((IFile) o);

		// Otherwise return null
		return null;
	}
}
