package org.softlang.megal.mi;

import java.util.List;

import org.softlang.megal.mi.util.IdBuilder;

public abstract class MIEntityTypeReference extends MIElement {

	@Override
	public String getId() {
		return IdBuilder.of("entityTypeReference").add(getDefinition()).add(isMany()).add(getParameters()).toString();
	}

	public abstract MIEntityType getDefinition();

	public abstract boolean isMany();

	public abstract List<? extends MIEntity> getParameters();

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder(getDefinition().getName());

		if (isMany())
			b.append("+");

		List<? extends MIEntity> parameters = getParameters();

		if (!parameters.isEmpty()) {
			b.append("[");
			b.append(parameters.get(0).getName());

			for (int i = 1; i < parameters.size(); i++) {
				b.append(" -> ");
				b.append(parameters.get(i).getName());
			}
			b.append("]");
		}

		return b.toString();
	}
}
