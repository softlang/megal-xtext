package org.softlang.megal.evaluation;

import java.util.Set;
import java.util.stream.Collectors;

import org.softlang.megal.Megamodel;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.impl.RelationshipTypeImpl;

public class RelationshipTypeEval extends RelationshipTypeImpl {
	@Override
	public Megamodel getMegamodel() {
		if (eContainer() == null || !(eContainer() instanceof Megamodel))
			throw new IllegalStateException("Dangeling declaration");

		return (Megamodel) eContainer();
	}

	@Override
	public Set<RelationshipType> getVariants() {
		// Get all visible declarations and filter all relationship types that
		// have the same names
		return getMegamodel()
				.getVisibleDeclarations()
				.stream()
				.filter(d -> d instanceof RelationshipType
						&& ((RelationshipType) d).getName().equals(getName()))
				.map(d -> (RelationshipType) d).collect(Collectors.toSet());
	}
}
