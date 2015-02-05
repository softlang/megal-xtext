package org.softlang.megal.evaluation;

import static com.google.common.base.Objects.equal;
import static com.google.common.collect.FluentIterable.from;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.softlang.megal.Annotation;
import org.softlang.megal.Declaration;
import org.softlang.megal.Element;
import org.softlang.megal.Entity;
import org.softlang.megal.Megamodel;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.TypeReference;
import org.softlang.megal.impl.EntityImpl;

import com.google.common.collect.FluentIterable;

public class EntityEval extends EntityImpl {
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
	public Iterable<Annotation> allAnnotations() {
		return FluentIterable.from(megamodel().allModels()).transformAndConcat(Megamodel::getDeclarations)
				.filter(this::logicEq).transformAndConcat(Element::getAnnotations);
	}

	@Override
	public Iterable<RelationshipType> applicableIncoming(Entity from) {
		// Get lattices for the types
		Set<TypeReference> tl = from(from.getType().latticeAbove()).toSet();
		Set<TypeReference> tr = from(getType().latticeAbove()).toSet();

		// For all relationship type, check if in lattice and add if so return
		// it
		return from(megamodel().allModels()).transformAndConcat(Megamodel::getDeclarations)
				.filter(RelationshipType.class).filter(i -> tl.contains(i.getLeft()))
				.filter(i -> tr.contains(i.getRight()));
	}

	@Override
	public Iterable<RelationshipType> applicableOutgoing(Entity to) {
		// Get lattices for the types
		Set<TypeReference> tl = from(getType().latticeAbove()).toSet();
		Set<TypeReference> tr = from(to.getType().latticeAbove()).toSet();

		// For all relationship type, check if in lattice and add if so return
		// it
		return from(megamodel().allModels()).transformAndConcat(Megamodel::getDeclarations)
				.filter(RelationshipType.class).filter(i -> tl.contains(i.getLeft()))
				.filter(i -> tr.contains(i.getRight()));
	}

	@Override
	public boolean logicEq(EObject o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Entity))
			return false;

		Entity e = (Entity) o;
		return equal(getName(), e.getName()) && equal(getType(), e.getType());
	}

	@Override
	public String identity() {
		// Name is fully representative
		return getName();
	}

	@Override
	public String toString() {
		return identity();
	}
}
