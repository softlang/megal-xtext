package pluginroot.elementof;

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
import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;

import static com.google.common.collect.Lists.*;
import static com.google.common.collect.Iterables.*;

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
	public Result evaluate(Relationship relationship) {
		Collection<String> nr = newArrayList();
		for (String link : getAPI().getLinks(relationship.getLeft()))
			nr.add(link);

		CharSource s = findASource(nr);

		for (Evaluator y : getParts()) {
			if (y instanceof Acceptor) {
				Acceptor a = (Acceptor) y;

				if (y.getRealized().contains(relationship.getRight()))
					if (a.accept(s)) {
						System.out.println("I WIN IT");
						return new Result("YES", true);
					}
			}
		}

		System.out.println("I LOSE IT");
		return new Result("NO", false);
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
