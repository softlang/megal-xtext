package org.softlang.megal.mi.wrapped;

import org.softlang.megal.Annotations;
import org.softlang.megal.Relationship;
import org.softlang.megal.mi.MIEntity;
import org.softlang.megal.mi.MIRelationship;
import org.softlang.megal.mi.MIRelationshipType;

import com.google.common.collect.Multimap;

public class WrappedRelationship extends MIRelationship {
	private final WrappedMegamodel container;
	private final Multimap<String, String> annotations;
	private final MIEntity left;
	private final MIRelationshipType type;
	private final MIEntity right;

	public WrappedRelationship(WrappedMegamodel container, Relationship source) {
		this.container = container;

		// Get annotation based property
		annotations = Annotations.getAnnotationMap(source);

		left = container.wrap(source.getLeft());
		type = container.wrap(source.appliedInstance());
		right = container.wrap(source.getRight());
	}

	@Override
	public WrappedMegamodel getMegamodel() {
		return container;
	}

	@Override
	public Multimap<String, String> getAnnotations() {
		return annotations;
	}

	@Override
	public MIEntity getLeft() {
		return left;
	}

	@Override
	public MIRelationshipType getType() {
		return type;
	}

	@Override
	public MIEntity getRight() {
		return right;
	}

}
