package org.softlang.megal.defaultprovider;

import java.util.List;
import java.util.Set;

import org.softlang.megal.fragmentprovider.FragmentProvider;

public abstract class TypeFragmentProvider<T> implements
		FragmentProvider {
	private final Class<T> type;

	public Class<T> getType() {
		return type;
	}

	public TypeFragmentProvider(Class<T> type) {
		this.type = type;
	}

	protected abstract List<? extends Object> navigateTyped(T t, String segment);

	protected abstract Set<String> nextTyped(T t);

	@Override
	public boolean accept(Object node) {
		return type.isInstance(node);
	}

	@Override
	public List<? extends Object> navigate(Object node, String segment) {
		return navigateTyped(type.cast(node), segment);
	}

	@Override
	public Set<String> next(Object node) {
		return nextTyped(type.cast(node));
	}

}
