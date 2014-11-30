package org.softlang.megal.evaluation;

import java.util.Set;
import java.util.stream.Collectors;

import org.softlang.megal.Declaration;
import org.softlang.megal.Graph;
import org.softlang.megal.Link;
import org.softlang.megal.Megamodel;
import org.softlang.megal.impl.MegamodelImpl;

public class MegamodelEval extends MegamodelImpl {
	@Override
	public Set<Link> getVisibleBindings() {
		// Extend by imports and then collect all bindings
		return Graph.<Megamodel> extendBy(this, m -> m.getImports()).stream()
				.flatMap(m -> m.getBindings().stream())
				.collect(Collectors.toSet());
	}

	@Override
	public Set<Declaration> getVisibleDeclarations() {
		
		// Extend by imports and then collect all declarations
		return Graph.<Megamodel> extendBy(this, m -> m.getImports()).stream()
				.flatMap(m -> m.getDeclarations().stream())
				.collect(Collectors.toSet());
	}
}
