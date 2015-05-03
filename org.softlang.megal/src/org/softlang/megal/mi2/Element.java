package org.softlang.megal.mi2;

import static com.google.common.collect.Iterables.getFirst;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;

/**
 * <p>
 * Base class for annotated model elements.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class Element {
	/**
	 * <p>
	 * Gets origin trace
	 * </p>
	 * 
	 * @return Returns the origin, default is self
	 */
	public List<? extends Element> getOrigin() {
		return ImmutableList.of(this);
	}

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