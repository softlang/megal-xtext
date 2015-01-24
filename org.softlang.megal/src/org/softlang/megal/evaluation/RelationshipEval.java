package org.softlang.megal.evaluation;

import org.softlang.megal.Declaration;
import org.softlang.megal.Megamodel;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.RelationshipTypeInstance;
import org.softlang.megal.RelationshipTypes;
import org.softlang.megal.impl.RelationshipImpl;

public class RelationshipEval extends RelationshipImpl {
	@Override
	public Megamodel megamodel() {
		if (getOrigin() != null) {
			if (getOrigin() instanceof Megamodel)
				return (Megamodel) getOrigin();

			if (getOrigin() instanceof Declaration)
				return ((Declaration) getOrigin()).megamodel();
		}

		return (Megamodel) eContainer();
	}


	@Override
	public RelationshipTypeInstance appliedInstance() {
		if (getType() == null)
			return null;

		RelationshipType mergedType = RelationshipTypes.createRelationshipTypeMerge(getType());

		RelationshipTypeInstance prv = null;
		int mc = Integer.MAX_VALUE;
		for (RelationshipTypeInstance i : mergedType.getInstances()) {
			int dl = i.getLeft().equals(getLeft().getType()) ? 0 : i.getLeft().latticeBelow(getLeft().getType()) ? 1
					: -1;
			int dr = i.getRight().equals(getRight().getType()) ? 0 : i.getRight().latticeBelow(getRight().getType()) ? 1
					: -1;

			// Prefer exact matches for both, then for one of each, then don't
			// care as long as it's applicable
			if (dl >= 0 && dr >= 0)
				if (mc > dl + dr) {
					mc = dl + dr;
					prv = i;
				}
		}

		return prv;
	}

	@Override
	public String toString() {
		return getLeft().getName() + " " + getType().getName() + " " + getRight().getName();
	}

}
