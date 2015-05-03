package org.softlang.megal.mi2.api.resolution;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.getFirst;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.softlang.megal.MegalPlugin;
import org.softlang.megal.mi2.util.ErrorByteSource;
import org.softlang.megal.mi2.util.ErrorCharSource;
import org.softlang.sourcesupport.SourceSupport;
import org.softlang.sourcesupport.SourceSupportPlugin;

import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;

public abstract class ProjectResolution extends AbstractResolution {

	protected abstract IProject getProject();

	@Override
	public SourceSupport getSourceSupport() {
		return SourceSupportPlugin.getSupport().analyze(getProject());
	}

	// TODO: also regular URIs and such

	private IFile getIFile(Object object) {
		// If object itself is an IFile
		if (object instanceof IFile) {
			// Cast the object
			IFile file = (IFile) object;

			// Return it
			return file;
		}

		// If object is an URI
		if (object instanceof URI) {
			// Cast the object
			URI uri = (URI) object;

			// Return the evaluators first IFile
			return getFirst(filter(MegalPlugin.getEvaluator().evaluate(uri), IFile.class), null);
		}

		// If object is a string
		if (object instanceof String) {
			// Cast as string
			String str = (String) object;

			try {
				// Try to convert to URI
				URI uri = new URI(str);

				// Return the evaluators first IFile
				return getFirst(filter(MegalPlugin.getEvaluator().evaluate(uri), IFile.class), null);
			} catch (URISyntaxException e) {
			}

			// If failed, let the project find the file
			return getProject().getFile(Path.fromOSString(str));
		}

		return null;
	}

	@Override
	public URI getAbsolute(Object object) {
		//TODO Fix this
		IFile file = getIFile(object);

		if (file == null)
			return null;

		return file.getFullPath().toFile().toURI();
	}

	@Override
	public ByteSource getBytes(Object object) {
		final IFile file = getIFile(object);

		if (file == null || !file.exists())
			return new ErrorByteSource(new FileNotFoundException());

		return new ByteSource() {
			@Override
			public InputStream openStream() throws IOException {
				try {
					return file.getContents();
				} catch (CoreException e) {
					throw new IOException(e);
				}
			}
		};
	}

	@Override
	public CharSource getChars(Object object) {
		final IFile file = getIFile(object);

		if (file == null || !file.exists())
			return new ErrorCharSource(new FileNotFoundException());

		return new CharSource() {
			@Override
			public Reader openStream() throws IOException {
				try {
					return new InputStreamReader(file.getContents(), file.getCharset());
				} catch (CoreException e) {
					throw new IOException(e);
				}
			}
		};
	}
}
