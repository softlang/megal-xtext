package org.softlang.megal.mi.wrapped;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;

import java.util.List;

import org.softlang.megal.EntityTypeReference;
import org.softlang.megal.FunctionTypeReference;
import org.softlang.megal.TypeReference;
import org.softlang.megal.mi.MIEntity;
import org.softlang.megal.mi.MIEntityType;
import org.softlang.megal.mi.MIEntityTypeReference;
import org.softlang.megal.mi.MIMegamodel;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

public class WrappedEntityTypeReference extends MIEntityTypeReference {

	private final WrappedMegamodel container;

	private final MIEntityType definition;

	private final boolean many;

	private final List<MIEntity> parameters;

	public WrappedEntityTypeReference(WrappedMegamodel container, TypeReference source) {
		this.container = container;
		// Translate the definition
		definition = container.wrap(source.getDefinition());

		if (source instanceof EntityTypeReference) {
			// If source is an ETR, cast the input
			EntityTypeReference entityTypeReference = (EntityTypeReference) source;

			// Carry the many status and set parameters to empty
			many = entityTypeReference.isMany();
			parameters = emptyList();

		} else if (source instanceof FunctionTypeReference) {
			// If source is an FTR, cast the input
			FunctionTypeReference functionTypeReference = (FunctionTypeReference) source;

			// Set many to false and translate the domain and codomain
			many = false;
			parameters = ImmutableList.of(container.wrap(functionTypeReference.getDomain()),
					container.wrap(functionTypeReference.getCodomain()));
		} else
			throw new IllegalArgumentException();
	}

	@Override
	public MIMegamodel getMegamodel() {
		return container;
	}

	@Override
	public MIEntityType getDefinition() {
		return definition;
	}

	@Override
	public boolean isMany() {
		return many;
	}

	@Override
	public List<MIEntity> getParameters() {
		return parameters;
	}

	@Override
	public Multimap<String, String> getAnnotations() {
		return ImmutableMultimap.of();
	}

}
