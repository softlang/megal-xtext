package org.softlang.megal.mi.placeholder;

import org.softlang.megal.mi.MIEntityType;
import org.softlang.megal.mi.MIEntityTypeReference;
import org.softlang.megal.mi.MIMegamodel;

import com.google.common.collect.Multimap;

public abstract class ProxyEntityType extends MIEntityType {
	private final Store<MIEntityType> store;

	public ProxyEntityType() {
		store = new Store<MIEntityType>() {
			@Override
			protected MIEntityType compute() {
				return ProxyEntityType.this.compute();
			}
		};
	}

	protected abstract MIEntityType compute();

	@Override
	public MIEntityTypeReference getSupertype() {
		return store.getValue().getSupertype();
	}

	@Override
	public String getDefinedName() {
		return store.getValue().getDefinedName();
	}

	@Override
	public MIMegamodel getMegamodel() {
		return store.getValue().getMegamodel();
	}

	@Override
	public Multimap<String, String> getAnnotations() {
		return store.getValue().getAnnotations();
	}

}
