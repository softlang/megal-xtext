package org.softlang.megal.mi2;

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
}