package org.softlang.megal.mi.placeholder;

import org.softlang.megal.mi.MIEntityTypeReference;
import org.softlang.megal.mi.MIMegamodel;
import org.softlang.megal.mi.MIRelationshipType;

import com.google.common.collect.Multimap;

public abstract class ProxyRelationshipType extends MIRelationshipType {
	private final Store<MIRelationshipType> store;

	public ProxyRelationshipType() {
		store = new Store<MIRelationshipType>() {

			@Override
			protected MIRelationshipType compute() {
				return ProxyRelationshipType.this.compute();
			}
		};
	}

	protected abstract MIRelationshipType compute();

	@Override
	public MIEntityTypeReference getLeft() {
		return store.getValue().getLeft();
	}

	@Override
	public MIEntityTypeReference getRight() {
		return store.getValue().getRight();
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
