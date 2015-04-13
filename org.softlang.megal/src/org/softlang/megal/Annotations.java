package org.softlang.megal;

import static com.google.common.base.Objects.*;
import static com.google.common.collect.Multimaps.index;
import static com.google.common.collect.Multimaps.transformValues;

import com.google.common.collect.Multimap;

public class Annotations {
	public static String getAnnotation(Element element, String key, String defaultTo) {
		if (element == null)
			return defaultTo;

		for (Annotation a : element.allAnnotations())
			if (equal(a.getKey(), key))
				return a.getValue();

		return defaultTo;
	}

	public static String getEffectiveName(Megamodel named) {
		return getAnnotation(named, null, named.getName());
	}

	public static String getEffectiveName(Named named) {
		return getAnnotation(named, null, named.getName());
	}

	public static Multimap<String, String> getAnnotationMap(Element element) {
		return transformValues(index(element.allAnnotations(), Annotation::getKey), Annotation::getValue);
	}
}
