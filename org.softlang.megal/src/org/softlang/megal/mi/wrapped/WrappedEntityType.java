package org.softlang.megal.mi.wrapped;

import org.softlang.megal.Annotations;
import org.softlang.megal.EntityType;
import org.softlang.megal.mi.MIEntityType;
import org.softlang.megal.mi.MIEntityTypeReference;

import com.google.common.collect.Multimap;

class WrappedEntityType extends MIEntityType {
	private final WrappedMegamodel container;

	private final String name;

	private final Multimap<String, String> annotations;

	private final MIEntityTypeReference supertype;

	public WrappedEntityType(WrappedMegamodel container, EntityType source) {
		this.container = container;

		// Get annotation based properties
		name = Annotations.getEffectiveName(source);
		annotations = Annotations.getAnnotationMap(source);

		// Wrap the supertype reference
		supertype = container.wrap(source.getSupertype());
	}


	@Override
	public WrappedMegamodel getMegamodel() {
		return container;
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
	public MIEntityTypeReference getSupertype() {
		return supertype;
	}
}