package org.softlang.megal.mi2;

import static com.google.common.collect.Iterables.getFirst;
import static com.google.common.collect.Iterables.getOnlyElement;

import java.util.Collection;

import com.google.common.collect.Multimap;

/**
 * <p>
 * Base class for annotated model elements.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class Annotated {
	/**
	 * <p>
	 * Gets all annotations of this element.
	 * </p>
	 * 
	 * @return Returns a map from the keys to their values
	 */
	public abstract Multimap<String, String> getAnnotations();

	/**
	 * <p>
	 * Gets all annotations of this element.
	 * </p>
	 * 
	 * @param name
	 *            The key to evaluate
	 * 
	 * @return Returns a collection of values
	 */
	public Collection<String> getAnnotations(String name) {
		return getAnnotations().get(name);
	}

	/**
	 * <p>
	 * Gets the only annotation of this element.
	 * </p>
	 * 
	 * @param name
	 *            The key to evaluate
	 * 
	 * @return Returns the only annotation
	 */
	public String getAnnotation(String name) {
		return getFirst(getAnnotations(name), null);
	}
}