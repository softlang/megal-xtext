package org.softlang.megal.mi;

import static com.google.common.collect.Iterables.getOnlyElement;

import com.google.common.collect.Multimap;

public abstract class MIAnnotated extends MIElement {

	public abstract Multimap<String, String> getAnnotations();

	public String getAnnotation(String name) {
		return getOnlyElement(getAnnotations().get(name));
	}
}