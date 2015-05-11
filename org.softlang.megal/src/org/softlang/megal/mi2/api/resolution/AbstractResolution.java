package org.softlang.megal.mi2.api.resolution;

import static com.google.common.collect.Iterables.getOnlyElement;

import java.net.URI;
import java.net.URISyntaxException;

import org.softlang.megal.mi2.api.Artifact;

/**
 * <p>
 * Abstract resolution strategy that resolves the class query using the own source support.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class AbstractResolution implements Resolution {
	@Override
	public <T> Class<? extends T> getClass(Object binding, Class<T> deriving) {
		return getClass(binding, deriving, deriving);
	}

	@Override
	public <T> Class<? extends T> getClass(Object binding, Class<T> deriving, Class<?> nextTo) {
		// If object is a class
		if (binding instanceof Class<?>) {
			// Cast as class
			Class<?> cls = (Class<?>) binding;

			// If assignable from deriving, return a subclass
			if (deriving.isAssignableFrom(cls))
				return cls.asSubclass(deriving);

			// Else, return null
			return null;
		}

		// If object is a string
		if (binding instanceof String) {
			// Cast as string
			String str = (String) binding;

			try {
				// Get an URI on the string
				URI uri = new URI(str);

				// If URI specifies a class
				if (uri.isOpaque() && "classpath".equals(uri.getScheme()))
					// Load with source support
					return getSourceSupport().loadClass(nextTo, deriving, uri.getSchemeSpecificPart());

				// Else return null
				return null;
			} catch (URISyntaxException e) {
				// Exception at URI, so we're not responsible
			}

			// Load default with class load
			return getSourceSupport().loadClass(nextTo, deriving, str);
		}

		// If object is an URI
		if (binding instanceof URI) {
			// Cast as URI
			URI uri = (URI) binding;

			// If URI specifies a class
			if (uri.isOpaque() && "classpath".equals(uri.getScheme()))
				// Load with source support
				return getSourceSupport().loadClass(nextTo, deriving, uri.getSchemeSpecificPart());

			// Else return null
			return null;
		}

		return null;
	}

	@Override
	public Artifact getArtifact(Object binding) {
		return getOnlyElement(getArtifacts(binding), null);
	}
}
