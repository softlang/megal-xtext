package org.softlang.megal;

import static com.google.common.base.Objects.*;

public class Annotations {
	public static String getAnnotation(Element element, String key, String defaultTo) {
		if (element == null)
			return defaultTo;

		for (Annotation a : element.allAnnotations())
			if (equal(a.getKey(), key))
				return a.getValue();

		return defaultTo;
	}

	public static String getEffectiveName(Named named) {
		return getAnnotation(named, null, named.getName());
	}
}
