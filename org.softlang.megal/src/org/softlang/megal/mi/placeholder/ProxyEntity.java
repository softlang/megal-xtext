package org.softlang.megal.mi.placeholder;

import java.net.URI;
import java.util.Collection;

import org.softlang.megal.mi.MIEntity;
import org.softlang.megal.mi.MIEntityTypeReference;
import org.softlang.megal.mi.MIMegamodel;
import org.softlang.megal.mi.MIRelationship;

import com.google.common.collect.Multimap;

public abstract class ProxyEntity extends MIEntity {
	private final Store<MIEntity> store;

	public ProxyEntity() {
		store = new Store<MIEntity>() {
			@Override
			protected MIEntity compute() {
				return ProxyEntity.this.compute();
			}
		};
	}

	protected abstract MIEntity compute();

	@Override
	public MIEntityTypeReference getType() {
		return store.getValue().getType();
	}

	@Override
	public Collection<URI> getLinks() {
		return store.getValue().getLinks();
	}

	@Override
	public Collection<? extends MIRelationship> getIncoming() {
		return store.getValue().getIncoming();
	}

	@Override
	public Collection<? extends MIRelationship> getOutgoing() {
		return store.getValue().getOutgoing();
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
