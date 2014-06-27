package org.softlang.megal.pp.jar;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.List;

public class Util {
	@SuppressWarnings("rawtypes")
	public static List<TypeVariable> wrapTypeParemeters(Class c) {
		return Arrays.asList(c.getTypeParameters());
	}
}
