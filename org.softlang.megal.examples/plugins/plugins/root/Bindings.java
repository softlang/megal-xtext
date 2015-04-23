package plugins.root;

import static com.google.common.collect.Iterables.getOnlyElement;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.softlang.megal.MegalPlugin;
import org.softlang.megal.api.URI;

import com.google.common.io.CharStreams;
import static com.google.common.collect.Iterables.filter;

public class Bindings {
	public static String read(final IFile file) throws IOException,
			CoreException {
		try (InputStream stream = file.getContents()) {
			InputStreamReader r = new InputStreamReader(stream,
					file.getCharset());

			return CharStreams.toString(r);
		}
	}

	public static String read(Collection<Object> nr) throws IOException,
			CoreException {
		if (nr.size() != 1)
			return null;

		// Find the first IFile in the resolved items
		for (Object o : MegalPlugin.getEvaluator().evaluate(
				URI.valueOf(getOnlyElement(filter(nr, String.class))))) {

			if (o instanceof IFile)
				return read((IFile) o);
		}

		// Otherwise return null
		return null;
	}

}
