package org.softlang.megal.mi.placeholder;

import java.util.List;

import org.softlang.megal.mi.MIEntity;
import org.softlang.megal.mi.MIEntityType;
import org.softlang.megal.mi.MIEntityTypeReference;

public abstract class ProxyEntityTypeReference extends MIEntityTypeReference {
	private final Store<MIEntityTypeReference> store;

	public ProxyEntityTypeReference() {
		store = new Store<MIEntityTypeReference>() {
			@Override
			protected MIEntityTypeReference compute() {
				return ProxyEntityTypeReference.this.compute();
			}
		};
	}

	protected abstract MIEntityTypeReference compute();

	@Override
	public MIEntityType getDefinition() {
		return store.getValue().getDefinition();
	}

	@Override
	public boolean isMany() {
		return store.getValue().isMany();
	}

	@Override
	public List<? extends MIEntity> getParameters() {
		return store.getValue().getParameters();
	}

}
