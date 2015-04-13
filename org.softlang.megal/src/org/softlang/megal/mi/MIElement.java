package org.softlang.megal.mi;

import static com.google.common.collect.Iterables.getOnlyElement;

import com.google.common.collect.Multimap;

public abstract class MIElement {
	/**
	 * <p>
	 * The Id is unique for an element, if
	 * {@link MIMegamodel#getById(CharSequence)} is called on {@link #getId()},
	 * the element returned is identity equal to this object.
	 * </p>
	 * 
	 * @return
	 */
	public abstract String getId();

	public abstract MIMegamodel getMegamodel();

	public abstract Multimap<String, String> getAnnotations();

	public String getAnnotation(String name) {
		return getOnlyElement(getAnnotations().get(name));
	}
}