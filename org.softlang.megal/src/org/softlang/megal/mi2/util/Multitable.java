package org.softlang.megal.mi2.util;

import java.util.Collection;
import java.util.Set;

import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;

/**
 * <p>
 * Preliminary interface, only mirroring needed methods.
 * </p>
 * 
 * @author Pazuzu
 *
 * @param <R>
 * @param <C>
 * @param <E>
 */
public interface Multitable<R, C, E> {
	boolean put(R rowKey, C columnKey, E value);

	boolean putAll(R rowKey, C columnKey, Collection<? extends E> values);

	boolean putAll(Multitable<? extends R, ? extends C, ? extends E> table);

	boolean remove(Object rowKey, Object columnKey, Object value);

	boolean removeAll(Object rowKey, Object columnKey, Collection<?> values);

	boolean contains(Object rowKey, Object columnKey, Object value);

	boolean containsAll(Object rowKey, Object columnKey, Collection<?> values);

	Set<E> get(Object rowKey, Object columnKey);

	Table<R, C, Set<E>> asTable();

	Iterable<Cell<R, C, E>> whereValue(E value);

	Iterable<Cell<R, C, E>> whereRow(R rowKey);

	Iterable<Cell<R, C, E>> whereColumn(C columnKey);

	Iterable<Cell<R, C, E>> cells();

}