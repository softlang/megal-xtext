package org.softlang.megal.evaluation;

import java.util.Collections;
import java.util.List;

import org.softlang.megal.Megamodel;
import org.softlang.megal.RelationshipTypeInstance;
import org.softlang.megal.impl.RelationshipImpl;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;

public class RelationshipEval extends RelationshipImpl {
	@Override
	public Megamodel megamodel() {
		return (Megamodel) eContainer();
	}

	@Override
	public RelationshipTypeInstance appliedInstance() {
		if (getType() == null)
			return null;

		RelationshipTypeInstance prv = null;
		int mc = Integer.MAX_VALUE;
		for (RelationshipTypeInstance i : getType().getInstances()) {
			int dl = i.getLeft().equals(getLeft().getType()) ? 0 : i.getLeft().latticeBelow(getLeft().getType()) ? 1
					: -1;
			int dr = i.getLeft().equals(getLeft().getType()) ? 0 : i.getLeft().latticeBelow(getLeft().getType()) ? 1
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
}
