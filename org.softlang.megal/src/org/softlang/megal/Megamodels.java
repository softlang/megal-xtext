package org.softlang.megal;

import org.eclipse.emf.common.util.EList;

public class Megamodels {
	public static EList<Declaration> allDeclarations(Megamodel m) {
		EList<Declaration> result = m.importedDeclarations();
		result.addAll(m.getDeclarations());
		return result;
	}

	public static EList<Link> allBinding(Megamodel m) {
		EList<Link> result = m.importedBindings();
		result.addAll(m.getBindings());
		return result;
	}
}
