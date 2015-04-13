package org.softlang.megal.mi.wrapped;

import static java.util.Collections.emptyList;

import java.util.List;

import org.softlang.megal.EntityTypeReference;
import org.softlang.megal.FunctionTypeReference;
import org.softlang.megal.TypeReference;
import org.softlang.megal.mi.MIEntity;
import org.softlang.megal.mi.MIEntityType;
import org.softlang.megal.mi.MIEntityTypeReference;

import com.google.common.collect.ImmutableList;

public class WrappedEntityTypeReference extends MIEntityTypeReference {

	private final MIEntityType definition;

	private final boolean many;

	private final List<MIEntity> parameters;

	public WrappedEntityTypeReference(WrappedMegamodel container, TypeReference source) {
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

}
