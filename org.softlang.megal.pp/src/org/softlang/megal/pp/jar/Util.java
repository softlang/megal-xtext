package org.softlang.megal.pp.jar;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.List;

public class Util {
	public static List<TypeVariable> wrapTypeParemeters(Class c) {
		Type d;
		return Arrays.asList(c.getTypeParameters());
	}
}
