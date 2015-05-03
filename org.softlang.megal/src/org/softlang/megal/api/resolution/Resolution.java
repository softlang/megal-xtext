package org.softlang.megal.api.resolution;

import java.net.URI;

import org.softlang.sourcesupport.SourceSupport;

import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;

/**
 * <p>
 * Evaluation context of a plugin.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public interface Resolution {

	/**
	 * <p>
	 * Gets the source support for this context.
	 * </p>
	 * 
	 * @return Returns the source support
	 */
	SourceSupport getSourceSupport();

	/**
	 * <p>
	 * Gets the bindings class location. This method constitutes the model
	 * relative classpath.
	 * </p>
	 * 
	 * @param object
	 *            The binding to evaluate, may be a {@link String} or an
	 *            {@link URI} or any other class specification.
	 * @return Returns a class
	 */
	<T> Class<? extends T> getClass(Object object, Class<T> deriving);

	/**
	 * <p>
	 * Gets the bindings manifested representation. This method constitutes the
	 * model relative resource locations.
	 * </p>
	 * 
	 * @param object
	 *            The binding to evaluate, may be a {@link String} or an
	 *            {@link URI} or any other resource specification.
	 * @return Returns a source of bytes
	 */
	ByteSource getBytes(Object object);

	/**
	 * <p>
	 * Gets the bindings manifested representation. This method constitutes the
	 * model relative resource locations.
	 * </p>
	 * 
	 * @param object
	 *            The binding to evaluate, may be a {@link String} or an
	 *            {@link URI} or any other resource specification.
	 * @return Returns a source of characters
	 */
	CharSource getChars(Object object);
}
