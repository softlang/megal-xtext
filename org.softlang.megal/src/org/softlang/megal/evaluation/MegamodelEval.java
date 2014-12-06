package org.softlang.megal.evaluation;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.softlang.megal.Annotation;
import org.softlang.megal.Declaration;
import org.softlang.megal.EcoreCollector;
import org.softlang.megal.Element;
import org.softlang.megal.Entity;
import org.softlang.megal.Graph;
import org.softlang.megal.Link;
import org.softlang.megal.Megamodel;
import org.softlang.megal.RelationshipType;
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

	@Override
	public EList<RelationshipType> scopeRelationshipType(Entity leftOrOpen,
			Entity rightOrOpen) {

		// Decide on the four cases of input
		if (leftOrOpen == null) {
			if (rightOrOpen == null)
				return getVisibleDeclarations().stream()
				// Filter only to relationship types
						.filter(k -> k instanceof RelationshipType)
						// Cast them all
						.map(k -> (RelationshipType) k)
						// Collect to EList
						.collect(EcoreCollector.toEList());
			else
				return getVisibleDeclarations()
						.stream()
						// Filter relationship types
						.filter(k -> k instanceof RelationshipType)
						// Cast them all
						.map(k -> (RelationshipType) k)
						// Filter right assignable
						.filter(k -> k.getRight() != null
								&& k.getRight().getDefinition() != null
								&& k.getRight()
										.getDefinition()
										.isAssignableFrom(
												rightOrOpen.getType()
														.getDefinition()))
						// Collect to EList
						.collect(EcoreCollector.toEList());

		} else {
			if (rightOrOpen == null)
				return getVisibleDeclarations()
						.stream()
						// Filter relationship types
						.filter(k -> k instanceof RelationshipType)
						// Cast them all
						.map(k -> (RelationshipType) k)
						// Filter left assignable
						.filter(k -> k.getLeft() != null
								&& k.getLeft().getDefinition() != null
								&& k.getLeft()
										.getDefinition()
										.isAssignableFrom(
												leftOrOpen.getType()
														.getDefinition()))
						// Collect to EList
						.collect(EcoreCollector.toEList());
			else
				return getVisibleDeclarations()
						.stream()
						// Filter relationship types
						.filter(k -> k instanceof RelationshipType)
						// Cast them all
						.map(k -> (RelationshipType) k)
						// Filter right assignable
						.filter(k -> k.getRight() != null
								&& k.getRight().getDefinition() != null
								&& k.getRight()
										.getDefinition()
										.isAssignableFrom(
												rightOrOpen.getType()
														.getDefinition()))
						// Filter left assignable
						.filter(k -> k.getLeft() != null
								&& k.getLeft().getDefinition() != null
								&& k.getLeft()
										.getDefinition()
										.isAssignableFrom(
												leftOrOpen.getType()
														.getDefinition()))
						// Collect to EList
						.collect(EcoreCollector.toEList());
		}
		// getVisibleDeclarations().stream().filter()
	}

	@Override
	public EList<Annotation> fetchInfos(Element element) {
		// Get all equal elements and flat map to their infos
		return Stream
				.concat(getVisibleBindings().stream(),
						getVisibleDeclarations().stream())
				.filter(k -> EcoreUtil.equals(k, element))
				.flatMap(k -> k.getInfo().stream())
				.collect(EcoreCollector.toEList());
	}
}
