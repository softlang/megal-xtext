package org.softlang.megal.mi2.util;

import static com.google.common.base.Objects.equal;
import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Sets.newHashSet;
import static com.google.common.collect.Tables.immutableCell;

import java.util.Collection;
import java.util.Set;

import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;

/***
 * TODO Much needed multitable
 * 
 * @author Pazuzu
 *
 */
public class Multitables {
	public static <R, C, E> boolean multiPut(Table<R, C, Set<E>> table, R rowKey, C columnKey, E value) {
		// Get the target
		Set<E> existing = table.get(rowKey, columnKey);

		if (existing == null)
			table.put(rowKey, columnKey, existing = newHashSet());

		// Put the data
		return existing.add(value);
	}

	public static <R, C, E> boolean multiPutAll(Table<R, C, Set<E>> table, R rowKey, C columnKey,
			Collection<? extends E> values) {
		// Get the target
		Set<E> existing = table.get(rowKey, columnKey);

		if (existing == null)
			table.put(rowKey, columnKey, existing = newHashSet());

		// Put the data
		return existing.addAll(values);
	}

	public static <R, C, E> boolean multiRemove(Table<R, C, Set<E>> table, R rowKey, C columnKey, E values) {
		// Get the target
		Set<E> existing = table.get(rowKey, columnKey);

		if (existing == null)
			return false;

		// Remove the data
		if (existing.remove(values)) {
			if (existing.isEmpty())
				table.remove(rowKey, columnKey);

			return true;
		}

		return false;
	}

	public static <R, C, E> boolean multiRemoveAll(Table<R, C, Set<E>> table, R rowKey, C columnKey,
			Collection<?> values) {
		// Get the target
		Set<E> existing = table.get(rowKey, columnKey);

		if (existing == null)
			return false;

		// Remove the data
		if (existing.removeAll(values)) {
			if (existing.isEmpty())
				table.remove(rowKey, columnKey);

			return true;
		}

		return false;
	}

	public static <R, C, E> boolean multiContains(Table<R, C, Set<E>> table, R rowKey, C columnKey, Object value) {
		// Get the target
		Set<E> existing = table.get(rowKey, columnKey);

		if (existing == null)
			return false;

		return existing.contains(value);
	}

	public static <R, C, E> boolean multiContainsAll(Table<R, C, Set<E>> table, R rowKey, C columnKey,
			Collection<?> values) {
		// Get the target
		Set<E> existing = table.get(rowKey, columnKey);

		if (existing == null)
			return false;

		return existing.contains(values);
	}

	public static <R, C, E> Iterable<Cell<R, C, E>> multiFlatValue(Table<R, C, Set<E>> table, E value) {
		return from(multiFlatCells(table)).filter(x -> equal(x.getValue(), value));
	}

	public static <R, C, E> Iterable<Cell<R, C, E>> multiFlatRow(Table<R, C, Set<E>> table, R rowKey) {
		return from(table.row(rowKey).entrySet()).transformAndConcat(
				x -> transform(x.getValue(), y -> immutableCell(rowKey, x.getKey(), y)));
	}

	public static <R, C, E> Iterable<Cell<R, C, E>> multiFlatColumn(Table<R, C, Set<E>> table, C columnKey) {
		return from(table.column(columnKey).entrySet()).transformAndConcat(
				x -> transform(x.getValue(), y -> immutableCell(x.getKey(), columnKey, y)));
	}

	public static <R, C, E> Iterable<Cell<R, C, E>> multiFlatCells(Table<R, C, Set<E>> table) {
		return from(table.cellSet()).transformAndConcat(
				x -> transform(x.getValue(), y -> immutableCell(x.getRowKey(), x.getColumnKey(), y)));
	}
}
