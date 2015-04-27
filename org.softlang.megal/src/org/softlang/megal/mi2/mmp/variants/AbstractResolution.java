package org.softlang.megal.mi2.mmp.variants;

import java.net.URI;
import java.net.URISyntaxException;

import org.softlang.megal.mi2.mmp.Resolution;

/**
 * <p>
 * Abstract resolution strategy that resolves the class query using the own
 * source support.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class AbstractResolution implements Resolution {
	@Override
	public <T> Class<? extends T> getClass(Object object, Class<T> deriving) {
		// If object is a class
		if (object instanceof Class<?>) {
			// Cast as class
			Class<?> cls = (Class<?>) object;

			// If assignable from deriving, return a subclass
			if (deriving.isAssignableFrom(cls))
				return cls.asSubclass(deriving);

			// Else, return null
			return null;
		}

		// If object is a string
		if (object instanceof String) {
			// Cast as string
			String str = (String) object;

			try {
				// Get an URI on the string
				URI uri = new URI(str);

				// If URI specifies a class
				if (uri.isOpaque() && "classpath".equals(uri.getScheme()))
					// Load with source support
					return getSourceSupport().loadClass(deriving, uri.getSchemeSpecificPart());

				// Else return null
				return null;
			} catch (URISyntaxException e) {
				// Exception at URI, so we're not responsible
			}

			// Load default with class load
			return getSourceSupport().loadClass(deriving, str);
		}

		// If object is an URI
		if (object instanceof URI) {
			// Cast as URI
			URI uri = (URI) object;

			// If URI specifies a class
			if (uri.isOpaque() && "classpath".equals(uri.getScheme()))
				// Load with source support
				return getSourceSupport().loadClass(deriving, uri.getSchemeSpecificPart());

			// Else return null
			return null;
		}

		return null;
	}
}
