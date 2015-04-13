package org.softlang.megal.mi.wrapped;

import org.softlang.megal.Annotations;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.mi.MIEntityTypeReference;
import org.softlang.megal.mi.MIRelationshipType;

import com.google.common.collect.Multimap;

class WrappedRelationshipType extends MIRelationshipType {
	private final WrappedMegamodel container;

	private final String name;

	private final Multimap<String, String> annotations;

	private final MIEntityTypeReference left;

	private final MIEntityTypeReference right;

	public WrappedRelationshipType(WrappedMegamodel container, RelationshipType source) {
		this.container = container;

		// Get annotation based properties
		name = source.getName();
		annotations = Annotations.getAnnotationMap(source);

		left = container.wrap(source.getLeft());
		right = container.wrap(source.getRight());
	}

	@Override
	public WrappedMegamodel getMegamodel() {
		return this.container;
	}

	@Override
	public String getDefinedName() {
		return name;
	}

	@Override
	public Multimap<String, String> getAnnotations() {
		return annotations;
	}

	@Override
	public MIEntityTypeReference getLeft() {
		return left;
	}

	@Override
	public MIEntityTypeReference getRight() {
		return right;
	}
}