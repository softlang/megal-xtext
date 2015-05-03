package org.softlang.megal.mi2.util;

import static com.google.common.base.Predicates.not;
import static com.google.common.collect.Iterables.getFirst;
import static com.google.common.collect.Multimaps.index;
import static com.google.common.collect.Multimaps.transformValues;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multimap;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;

/**
 * <p>
 * Set based operations, applied to set backed data structures.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public class SetOperations {

	public static <E> Set<E> filter(final Set<E> elements, Predicate<? super E> filter) {
		final Optional<Integer> preSize;
		final Optional<Boolean> preEmpty;

		if (elements instanceof ImmutableSet) {
			preSize = Optional.of(Iterables.size(Iterables.filter(elements, filter)));
			preEmpty = Optional.of(Iterables.all(elements, not(filter)));
		} else {
			preSize = Optional.absent();
			preEmpty = Optional.absent();
		}

		return new AbstractSet<E>() {
			@Override
			public int size() {
				if (preSize.isPresent())
					return preSize.get();

				return Iterables.size(Iterables.filter(elements, filter));
			}

			@Override
			public boolean isEmpty() {
				if (preEmpty.isPresent())
					return preEmpty.get();

				return Iterables.all(elements, not(filter));
			}

			private E asElement(final Set<E> elements, Object o) {
				@SuppressWarnings("unchecked")
				Class<E> elementClass = (Class<E>) getFirst(elements, null).getClass();
				E element = elementClass.cast(o);
				return element;
			}

			@Override
			public boolean contains(Object o) {
				if (elements.isEmpty())
					return false;

				E element = asElement(elements, o);

				if (!filter.apply(element))
					return false;

				return elements.contains(element);
			}

			@Override
			public Iterator<E> iterator() {
				return Iterators.filter(elements.iterator(), filter);
			}

			@Override
			public boolean add(E e) {
				if (filter.apply(e))
					return false;

				return elements.add(e);
			}

			@Override
			public boolean remove(Object o) {
				if (elements.isEmpty())
					return false;

				E element = asElement(elements, o);

				if (!filter.apply(element))
					return false;

				return elements.remove(element);
			}

			@Override
			public void clear() {
				for (Iterator<E> it = elements.iterator(); it.hasNext();) {
					E current = it.next();
					if (filter.apply(current))
						it.remove();
				}
			}
		};
	}

	/**
	 * <p>
	 * Translates the collection of entries to a multimap.
	 * </p>
	 * 
	 * @param entries
	 *            The entries to translate
	 * @return Returns a multimap
	 */
	public static <K, V> Multimap<K, V> translate(Collection<Entry<K, V>> entries) {
		// Index by map entry key and map the value by entry value
		return transformValues(index(entries, Entry::getKey), Entry::getValue);
	}

	/**
	 * <p>
	 * Applies the set union on the input.
	 * </p>
	 * 
	 * @param a
	 *            The left side
	 * @param b
	 *            The right side
	 * @return Returns the result
	 */
	public static <R, C, V> ImmutableTable<R, C, V> union(Table<R, C, V> a, Table<R, C, V> b) {
		ImmutableTable.Builder<R, C, V> builder = ImmutableTable.builder();

		builder.putAll(a);
		for (Cell<R, C, V> cell : b.cellSet())
			if (!a.contains(cell.getRowKey(), cell.getColumnKey()))
				builder.put(cell);

		return builder.build();
	}

	/**
	 * <p>
	 * Applies the set union on the input.
	 * </p>
	 * 
	 * @param a
	 *            The left side
	 * @param b
	 *            The right side
	 * @return Returns the result
	 */
	public static <R, C, E> Multitable<R, C, E> union(Multitable<R, C, E> a, Multitable<R, C, E> b) {
		Multitable<R, C, E> result = HashMultitable.create();
		result.putAll(a);
		result.putAll(b);
		return result;
	}

	/**
	 * <p>
	 * Applies the set union on the input.
	 * </p>
	 * 
	 * @param a
	 *            The left side
	 * @param b
	 *            The right side
	 * @return Returns the result
	 */
	public static <K, V> ImmutableMultimap<K, V> union(Multimap<K, V> a, Multimap<K, V> b) {
		ImmutableMultimap.Builder<K, V> builder = ImmutableMultimap.builder();

		builder.putAll(a);
		builder.putAll(b);

		return builder.build();
	}

	/**
	 * <p>
	 * Applies the set union on the input.
	 * </p>
	 * 
	 * @param a
	 *            The left side
	 * @param b
	 *            The right side
	 * @return Returns the result
	 */
	public static <K, V> ImmutableMap<K, V> union(Map<K, V> a, Map<K, V> b) {
		ImmutableMap.Builder<K, V> builder = ImmutableMap.builder();

		builder.putAll(a);
		for (Entry<K, V> entry : b.entrySet())
			if (!a.containsKey(entry.getKey()))
				builder.put(entry);

		return builder.build();
	}

	/**
	 * <p>
	 * Applies the set union on the input.
	 * </p>
	 * 
	 * @param a
	 *            The left side
	 * @param b
	 *            The right side
	 * @return Returns the result
	 */
	public static <K, V> ImmutableSetMultimap<K, V> union(SetMultimap<K, V> a, SetMultimap<K, V> b) {
		ImmutableSetMultimap.Builder<K, V> builder = ImmutableSetMultimap.builder();

		builder.putAll(a);
		builder.putAll(b);

		return builder.build();
	}

	public static <T, U> Set<U> transform(final Set<T> set, final Bijection<T, U> bijection) {
		return new AbstractSet<U>() {
			@Override
			public int size() {
				return set.size();
			}

			@Override
			public boolean isEmpty() {
				return set.isEmpty();
			}

			@Override
			public boolean contains(Object o) {
				if (set.isEmpty())
					return false;

				return set.contains(bijection.inverse().apply(SetOperations.ofMatchingType(this, o)));
			}

			@Override
			public Iterator<U> iterator() {
				return Iterators.transform(set.iterator(), bijection);
			}

			@Override
			public boolean add(U e) {
				return set.add(bijection.inverse().apply(e));
			}

			@Override
			public boolean remove(Object o) {
				if (set.isEmpty())
					return false;

				return set.remove(bijection.inverse().apply(SetOperations.ofMatchingType(this, o)));
			}

			@Override
			public void clear() {
				set.clear();
			}
		};
	}

	public static <E> E ofMatchingType(Iterable<E> elements, Object item) {
		for (E e : elements) {
			@SuppressWarnings("unchecked")
			Class<E> type = (Class<E>) e.getClass();

			return type.cast(item);
		}

		throw new IllegalStateException();
	}

}
