package org.softlang.megal.api;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

import org.softlang.megal.Element;

import com.google.common.collect.Sets;

public class ElementSet<E extends Element> extends AbstractSet<E> {
	private final Set<ElementKey<E>> backing = Sets.newHashSet();

	private final Class<E> type;

	public ElementSet(Class<E> type) {
		this.type = type;
	}

	@Override
	public boolean add(E e) {
		return backing.add(new ElementKey<E>(e));
	}

	@Override
	public void clear() {
		backing.clear();
	}

	@Override
	public boolean contains(Object o) {
		if (!type.isInstance(o))
			return false;

		E e = type.cast(o);

		return backing.contains(new ElementKey<Element>(e));
	}

	@Override
	public boolean isEmpty() {
		return backing.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			private Iterator<ElementKey<E>> backingIterator = backing.iterator();

			@Override
			public boolean hasNext() {
				return backingIterator.hasNext();
			}

			@Override
			public void remove() {
				backingIterator.remove();
			}

			@Override
			public E next() {
				ElementKey<E> n = backingIterator.next();

				return n.getElement();
			}
		};
	}

	@Override
	public boolean remove(Object o) {
		if (!type.isInstance(o))
			return false;

		E e = type.cast(o);

		return backing.remove(e);
	}

	@Override
	public int size() {
		return backing.size();
	}

	public static <E extends Element> ElementSet<E> newElementSet(Class<E> type) {
		return new ElementSet<E>(type);
	}
}
