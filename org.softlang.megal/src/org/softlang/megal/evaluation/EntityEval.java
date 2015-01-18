package org.softlang.megal.evaluation;

import static com.google.common.collect.FluentIterable.from;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.softlang.megal.Entity;
import org.softlang.megal.Megamodel;
import static org.softlang.megal.Megamodels.allDeclarations;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.RelationshipTypeInstance;
import org.softlang.megal.TypeReference;
import org.softlang.megal.impl.EntityImpl;

public class EntityEval extends EntityImpl {
	@Override
	public Megamodel megamodel() {
		return (Megamodel) eContainer();
	}

	@Override
	public EList<RelationshipTypeInstance> applicableIncoming(Entity from) {
		// Get lattices for the types
		EList<TypeReference> sl = getType().latticeAbove();
		EList<TypeReference> fl = from.getType().latticeAbove();

		// For all relationship type, check if in lattice and add if so
		EList<RelationshipTypeInstance> result = new BasicEList<>();
		for (RelationshipType r : from(allDeclarations(megamodel())).filter(RelationshipType.class))
			for (RelationshipTypeInstance i : r.getInstances())
				if (fl.contains(i.getLeft()) && sl.contains(i.getRight()))
					result.add(i);

		return result;
	}

	@Override
	public EList<RelationshipTypeInstance> applicableOutgoing(Entity to) {
		// Get lattices for the types
		EList<TypeReference> sl = getType().latticeAbove();
		EList<TypeReference> tl = to.getType().latticeAbove();

		// For all relationship type, check if in lattice and add if so
		EList<RelationshipTypeInstance> result = new BasicEList<>();
		for (RelationshipType r : from(allDeclarations(megamodel())).filter(RelationshipType.class))
			for (RelationshipTypeInstance i : r.getInstances())
				if (sl.contains(i.getLeft()) && tl.contains(i.getRight()))
					result.add(i);

		return result;
	}
}
