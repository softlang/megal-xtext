package org.softlang.megal.evaluation;

import java.util.Deque;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.softlang.megal.Declaration;
import org.softlang.megal.Link;
import org.softlang.megal.Megamodel;
import org.softlang.megal.impl.MegamodelImpl;

import com.google.common.collect.Lists;

public class MegamodelEval extends MegamodelImpl {
	@Override
	public EList<Megamodel> chaseImports() {
		EList<Megamodel> result = new BasicEList<>();
		Deque<Megamodel> next = Lists.newLinkedList();

		next.addAll(getImports());
		while (!next.isEmpty()) {
			Megamodel candidate = next.removeFirst();

			if (!result.contains(candidate)) {
				result.add(candidate);

				for (Megamodel i : getImports())
					next.addAll(i.getImports());
			}
		}

		return result;
	}

	@Override
	public EList<Declaration> importedDeclarations() {
		EList<Declaration> result = new BasicEList<>();

		for (Megamodel m : chaseImports())
			result.addAll(m.getDeclarations());

		return result;
	}

	@Override
	public EList<Link> importedBindings() {
		EList<Link> result = new BasicEList<>();

		for (Megamodel m : chaseImports())
			result.addAll(m.getBindings());

		return result;
	}
}