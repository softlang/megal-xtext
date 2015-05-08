package org.softlang.megal.mi2.util;

import static com.google.common.base.Predicates.not;
import static com.google.common.collect.Multimaps.index;
import static com.google.common.collect.Multimaps.transformValues;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;

/**
 * <p>
 * Set based operations, applied to set backed data structures.
 * </p>
 * TODO: Many of these may be implemented in a fast and persistent way, are not yet.
 * 
 * @author Pazuzu
 *
 */
public class SetOperations {
	private static class MutableFilterSet<E> extends AbstractSet<E> {
		private final Set<E> set;

		private final Class<E> type;

		private final Predicate<? super E> filter;

		public MutableFilterSet(Set<E> set, Class<E> type, Predicate<? super E> filter) {
			this.set = set;
			this.type = type;
			this.filter = filter;
		}

		@Override
		public int size() {
			return Iterables.size(Iterables.filter(set, filter));
		}

		@Override
		public boolean isEmpty() {
			return Iterables.all(set, not(filter));
		}

		@Override
		public boolean contains(Object o) {
			if (set.isEmpty())
				return false;

			if (!type.isInstance(o))
				return false;

			E element = type.cast(o);

			if (!filter.apply(element))
				return false;

			return set.contains(element);
		}

		@Override
		public Iterator<E> iterator() {
			return Iterators.filter(set.iterator(), filter);
		}

		@Override
		public boolean add(E e) {
			if (filter.apply(e))
				return false;

			return set.add(e);
		}

		@Override
		public boolean remove(Object o) {
			if (set.isEmpty())
				return false;

			if (!type.isInstance(o))
				return false;

			E element = type.cast(o);

			if (!filter.apply(element))
				return false;

			return set.remove(element);
		}

		@Override
		public void clear() {
			for (Iterator<E> it = set.iterator(); it.hasNext();) {
				E current = it.next();
				if (filter.apply(current))
					it.remove();
			}
		}
	}

	private static class ImmutableFilterSet<E> extends MutableFilterSet<E> {
		private boolean sizeCalculated;
		private boolean emptyCalculated;

		private int size;
		private boolean empty;

		public ImmutableFilterSet(Set<E> set, Class<E> type, Predicate<? super E> filter) {
			super(set, type, filter);
		}

		@Override
		public int size() {
			if (sizeCalculated)
				return size;

			sizeCalculated = true;
			return size = super.size();
		}

		@Override
		public boolean isEmpty() {
			if (emptyCalculated)
				return empty;

			if (sizeCalculated)
				return size == 0;

			emptyCalculated = true;
			return emptyCalculated = super.isEmpty();
		}
	}

	/**
	 * <p>
	 * Filters the entries of the set on demand. If the input set is an ImmutableSet, iterating operations will be
	 * calculated on demand.
	 * </p>
	 * 
	 * @param set
	 *            The input set
	 * @param filter
	 *            The filter to apply
	 * @return Returns a set where all elements contain filter, only modifications not matching the filter will be
	 *         channeled
	 */
	public static <E> Set<E> filter(Set<E> set, Class<E> type, Predicate<? super E> filter) {
		if (set instanceof ImmutableSet)
			return new ImmutableFilterSet<E>(set, type, filter);
		else
			return new MutableFilterSet<E>(set, type, filter);
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
	public static <R, C, V> Table<R, C, V> union(Table<R, C, V> a, Table<R, C, V> b) {
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
	public static <E> Set<E> union(Set<E> a, Set<E> b) {
		return Sets.union(a, b);
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

	public static <T, U> Set<U> transform(final Set<T> set, final Class<U> type, final Bijection<T, U> bijection) {
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

				if (!type.isInstance(o))
					return false;

				return set.contains(bijection.inverse().apply(type.cast(o)));
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

				return set.remove(bijection.inverse().apply(type.cast(o)));
			}

			@Override
			public void clear() {
				set.clear();
			}
		};
	}

	public static <R, C, E> Multitable<R, C, E> intersection(Multitable<R, C, E> a, Multitable<R, C, E> b) {
		Multitable<R, C, E> result = HashMultitable.create();
		result.putAll(a);
		result.retainAll(b);
		return result;
	}

	public static <K, V> SetMultimap<K, V> intersection(SetMultimap<K, V> a, SetMultimap<K, V> b) {
		ImmutableSetMultimap.Builder<K, V> builder = ImmutableSetMultimap.builder();
		for (Entry<K, V> e : Sets.intersection(a.entries(), b.entries()))
			builder.put(e);
		return builder.build();
	}

	public static <K, V> Map<K, V> intersection(Map<K, V> a, Map<K, V> b) {
		ImmutableMap.Builder<K, V> builder = ImmutableMap.builder();
		for (Entry<K, V> e : Sets.intersection(a.entrySet(), b.entrySet()))
			builder.put(e);
		return builder.build();
	}

	public static <R, C, E> Multitable<R, C, E> difference(Multitable<R, C, E> a, Multitable<R, C, E> b) {
		Multitable<R, C, E> result = HashMultitable.create();
		result.putAll(a);
		result.removeAll(b);
		return result;
	}

	public static <K, V> SetMultimap<K, V> difference(SetMultimap<K, V> a, SetMultimap<K, V> b) {
		ImmutableSetMultimap.Builder<K, V> builder = ImmutableSetMultimap.builder();
		for (Entry<K, V> e : Sets.difference(a.entries(), b.entries()))
			builder.put(e);
		return builder.build();
	}

	public static <K, V> Map<K, V> difference(Map<K, V> a, Map<K, V> b) {
		ImmutableMap.Builder<K, V> builder = ImmutableMap.builder();
		for (Entry<K, V> e : Sets.difference(a.entrySet(), b.entrySet()))
			builder.put(e);
		return builder.build();
	}
}
