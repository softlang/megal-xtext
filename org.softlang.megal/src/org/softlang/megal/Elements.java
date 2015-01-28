package org.softlang.megal;

import static com.google.common.collect.FluentIterable.from;

import com.google.common.base.Optional;

public class Elements {
	public static boolean logicEq(Element a, Element b) {
		return a == null ? b == null : b != null && a.logicEq(b);
	}

	public static boolean logicEqAssigned(Element a, Element b) {
		return a != null && b != null && a.logicEq(b);
	}

	/**
	 * Resolve the element by to string equivalence
	 * 
	 * @param m
	 *            The model to consider
	 * @param c
	 *            The type of the class to resolve
	 * @param string
	 *            The string representation of the object
	 * @return Returns the element of the given type
	 */
	public static <T extends Element> T resolve(Megamodel m, Class<T> c, String string) {
		if (string == null)
			return null;

		if (Declaration.class.isAssignableFrom(c))
			return from(m.allModels()).transformAndConcat(Megamodel::getDeclarations).filter(c)
					.firstMatch(p -> string.equals(p.identity())).orNull();
		else if (Link.class.isAssignableFrom(c))
			return from(m.allModels()).transformAndConcat(Megamodel::getBindings).filter(c)
					.firstMatch(p -> string.equals(p.identity())).orNull();
		else
			throw new IllegalArgumentException("The item " + string + " of class " + c.getSimpleName()
					+ " is not resolvable in megamodel");
	}

	/**
	 * Resolve the element by to string equivalence
	 * 
	 * @param m
	 *            The model to consider
	 * @param string
	 *            The string representation of the object
	 * @return Returns the element, casts are unchecked
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Element> T resolve(Megamodel m, String string) {
		if (string == null)
			return null;

		Optional<Declaration> d = from(m.allModels()).transformAndConcat(Megamodel::getDeclarations).firstMatch(
				p -> string.equals(p.identity()));

		if (d.isPresent())
			return (T) d.get();

		Optional<Link> b = from(m.allModels()).transformAndConcat(Megamodel::getBindings).firstMatch(
				p -> string.equals(p.identity()));

		if (b.isPresent())
			return (T) b.get();

		throw new IllegalArgumentException("The item " + string + " is not resolvable in megamodel");
	}
}
