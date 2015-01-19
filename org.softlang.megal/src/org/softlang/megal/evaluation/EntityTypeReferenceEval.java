package org.softlang.megal.evaluation;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.softlang.megal.EntityTypeReference;
import org.softlang.megal.TypeReference;
import org.softlang.megal.impl.EntityTypeReferenceImpl;

public class EntityTypeReferenceEval extends EntityTypeReferenceImpl {
	@Override
	public boolean latticeAbove(TypeReference other) {
		if (other == null)
			return false;

		if (getDefinition().getSupertype() == null)
			return false;

		return getDefinition().getSupertype().equals(other) || getDefinition().getSupertype().latticeAbove(other);
	}

	@Override
	public EList<TypeReference> latticeAbove() {
		// Transitive super type chasing
		EList<TypeReference> result = new BasicEList<>();
		for (TypeReference i = this; i != null; i = i.getDefinition().getSupertype())
			result.add(i);

		return result;
	}

	@Override
	public EList<TypeReference> latticeBelow() {
		// Inverted relation checking
		EList<TypeReference> result = new BasicEList<>();
		for (TreeIterator<EObject> it = getDefinition().megamodel().eAllContents(); it.hasNext();) {
			EObject c = it.next();

			if (c instanceof EntityTypeReference) {
				EntityTypeReference r = (EntityTypeReference) c;
				if (latticeBelow(r))
					result.add(r);
			}
		}
		return result;
	}

	@Override
	public boolean latticeBelow(TypeReference other) {
		if (other == null)
			return false;

		return other.latticeAbove(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		if (!(obj instanceof EntityTypeReference))
			return false;

		EntityTypeReference or = (EntityTypeReference) obj;

		return isMany() == or.isMany() && getDefinition() == or.getDefinition();
	}

	@Override
	public String toString() {
		return getDefinition().getName() + (isMany() ? "+" : "");
	}

}
