package org.softlang.megal.mi2.util;

import static org.softlang.megal.mi2.util.Multitables.multiPutAll;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableTable;
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
	public static <R, C, E> Table<R, C, Set<E>> unionInner(Table<R, C, Set<E>> a, Table<R, C, Set<E>> b) {
		Table<R, C, Set<E>> result = HashBasedTable.create(a);

		// Put all from left
		for (Cell<R, C, Set<E>> cell : a.cellSet())
			multiPutAll(result, cell.getRowKey(), cell.getColumnKey(), cell.getValue());

		// Put all from right
		for (Cell<R, C, Set<E>> cell : b.cellSet())
			multiPutAll(result, cell.getRowKey(), cell.getColumnKey(), cell.getValue());

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

}
