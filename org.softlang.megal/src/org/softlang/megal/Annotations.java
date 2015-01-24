package org.softlang.megal;

import static com.google.common.base.Objects.*;
import static org.softlang.megal.Annotations.getAnnotation;

public class Annotations {
	public static String getAnnotation(Element element, String key, String defaultTo) {
		if (element == null)
			return defaultTo;

		for (Annotation a : element.getAnnotations())
			if (equal(a.getKey(), key))
				return a.getValue();

		return defaultTo;
	}

	public static String getEffectiveName(Named named) {
		return getAnnotation(named, null, named.getName());
	}
}
