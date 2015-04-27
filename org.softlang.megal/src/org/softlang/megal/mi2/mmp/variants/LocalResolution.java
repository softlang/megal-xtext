package org.softlang.megal.mi2.mmp.variants;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

import org.softlang.sourcesupport.LocalSourceSupport;
import org.softlang.sourcesupport.SourceSupport;

import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;
import com.google.common.io.Files;
import com.google.common.io.Resources;

public class LocalResolution extends AbstractResolution {
	private final String charsetName;

	public LocalResolution(String charsetName) {
		this.charsetName = charsetName;
	}

	public LocalResolution() {
		this(null);
	}

	public String getCharsetName() {
		return charsetName;
	}

	@Override
	public SourceSupport getSourceSupport() {
		return LocalSourceSupport.INSTANCE;
	}

	@Override
	public ByteSource getBytes(Object object) {
		// If object itself is a file
		if (object instanceof File) {
			// Cast the object
			File file = (File) object;

			// Wrap it
			return Files.asByteSource(file);
		}

		// If object is an URI
		if (object instanceof URI) {
			// Cast the object
			URI uri = (URI) object;

			try {
				// Return the evaluators first IFile
				return Resources.asByteSource(uri.toURL());
			} catch (MalformedURLException | IllegalArgumentException e) {
				return ByteSource.empty();
			}
		}

		// If object is a string
		if (object instanceof String) {
			// Cast as string
			String str = (String) object;

			try {
				// Try to convert to URI
				URI uri = new URI(str);

				// Return the evaluators first IFile
				return Resources.asByteSource(uri.toURL());
			} catch (URISyntaxException | IllegalArgumentException e) {
			} catch (MalformedURLException e) {
				return ByteSource.empty();
			}

			// If failed, let the project find the file
			return Files.asByteSource(new File(str));
		}

		return ByteSource.empty();
	}

	@Override
	public CharSource getChars(Object object) {
		return getBytes(object).asCharSource(
				getCharsetName() == null ? Charset.defaultCharset() : Charset.forName(getCharsetName()));
	}

}
