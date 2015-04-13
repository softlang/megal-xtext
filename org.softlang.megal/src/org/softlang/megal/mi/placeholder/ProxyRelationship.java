package org.softlang.megal.mi.placeholder;

import org.softlang.megal.mi.MIEntity;
import org.softlang.megal.mi.MIMegamodel;
import org.softlang.megal.mi.MIRelationship;
import org.softlang.megal.mi.MIRelationshipType;

import com.google.common.collect.Multimap;

public abstract class ProxyRelationship extends MIRelationship {
	private final Store<MIRelationship> store;

	public ProxyRelationship() {
		store = new Store<MIRelationship>() {
			@Override
			protected MIRelationship compute() {
				return ProxyRelationship.this.compute();
			}
		};
	}

	protected abstract MIRelationship compute();

	@Override
	public MIEntity getLeft() {
		return store.getValue().getLeft();
	}

	@Override
	public MIRelationshipType getType() {
		return store.getValue().getType();
	}

	@Override
	public MIEntity getRight() {
		return store.getValue().getRight();
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
