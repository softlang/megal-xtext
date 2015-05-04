package org.softlang.megal.mi2.util;

import static com.google.common.base.Objects.equal;
import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Sets.newHashSet;
import static com.google.common.collect.Tables.immutableCell;
import static java.util.Collections.emptySet;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Table.Cell;

public abstract class AbstractMultitable<R, C, E> implements Multitable<R, C, E> {

	@Override
	public boolean put(R rowKey, C columnKey, E value) {
		// Get the target
		Set<E> existing = asTable().get(rowKey, columnKey);

		if (existing == null)
			asTable().put(rowKey, columnKey, existing = newHashSet());

		// Put the data
		return existing.add(value);
	}

	@Override
	public boolean putAll(R rowKey, C columnKey, Collection<? extends E> values) {
		// Get the target
		Set<E> existing = asTable().get(rowKey, columnKey);

		if (existing == null)
			asTable().put(rowKey, columnKey, existing = newHashSet());

		// Put the data
		return existing.addAll(values);
	}

	@Override
	public boolean putAll(Multitable<? extends R, ? extends C, ? extends E> table) {
		boolean modified = false;
		for (Cell<? extends R, ? extends C, ? extends E> cell : table.cells())
			modified |= put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());

		return modified;
	}

	@Override
	public boolean remove(Object rowKey, Object columnKey, Object value) {
		// Get the target
		Set<E> existing = asTable().get(rowKey, columnKey);

		if (existing == null)
			return false;

		// Remove the data
		if (existing.remove(value)) {
			if (existing.isEmpty())
				asTable().remove(rowKey, columnKey);

			return true;
		}

		return false;
	}

	@Override
	public boolean removeAll(Multitable<? extends R, ? extends C, ? extends E> table) {
		boolean modified = false;
		for (Cell<? extends R, ? extends C, ? extends E> cell : table.cells())
			modified |= remove(cell.getRowKey(), cell.getColumnKey(), cell.getValue());

		return modified;
	}

	@Override
	public boolean removeAll(Object rowKey, Object columnKey, Collection<?> values) {
		// Get the target
		Set<E> existing = asTable().get(rowKey, columnKey);

		if (existing == null)
			return false;

		// Remove the data
		if (existing.removeAll(values)) {
			if (existing.isEmpty())
				asTable().remove(rowKey, columnKey);

			return true;
		}

		return false;
	}

	@Override
	public boolean retainAll(Multitable<? extends R, ? extends C, ? extends E> table) {
		boolean modified = false;
		for (Iterator<Cell<R, C, Set<E>>> it = asTable().cellSet().iterator(); it.hasNext();) {
			Cell<R, C, Set<E>> current = it.next();

			Set<? extends E> other = table.get(current.getRowKey(), current.getColumnKey());
			modified |= current.getValue().retainAll(other);
			if (current.getValue().isEmpty())
				it.remove();
		}
		return modified;
	}

	@Override
	public boolean contains(Object rowKey, Object columnKey, Object value) {
		// Get the target
		Set<E> existing = asTable().get(rowKey, columnKey);

		if (existing == null)
			return false;

		return existing.contains(value);
	}

	@Override
	public boolean containsAll(Object rowKey, Object columnKey, Collection<?> values) {
		// Get the target
		Set<E> existing = asTable().get(rowKey, columnKey);

		if (existing == null)
			return false;

		return existing.contains(values);
	}

	@Override
	public boolean isEmpty() {
		return asTable().isEmpty();
	}

	@Override
	public Set<E> get(Object rowKey, Object columnKey) {
		Set<E> result = asTable().get(rowKey, columnKey);
		if (result == null)
			return emptySet();
		return result;
	}

	@Override
	public Set<Cell<R, C, E>> whereValue(E value) {
		// TODO: I am a horrible person
		return ImmutableSet.copyOf(from(cells()).filter(x -> equal(x.getValue(), value)));
	}

	@Override
	public Set<Cell<R, C, E>> whereRow(R rowKey) {
		// TODO: I am a horrible person
		return ImmutableSet.copyOf(from(asTable().row(rowKey).entrySet()).transformAndConcat(
				x -> transform(x.getValue(), y -> immutableCell(rowKey, x.getKey(), y))));
	}

	@Override
	public Set<Cell<R, C, E>> whereColumn(C columnKey) {
		// TODO: I am a horrible person
		return ImmutableSet.copyOf(from(asTable().column(columnKey).entrySet()).transformAndConcat(
				x -> transform(x.getValue(), y -> immutableCell(x.getKey(), columnKey, y))));
	}

	@Override
	public Set<Cell<R, C, E>> cells() {
		// TODO: I am a horrible person
		return ImmutableSet.copyOf(from(asTable().cellSet()).transformAndConcat(
				x -> transform(x.getValue(), y -> immutableCell(x.getRowKey(), x.getColumnKey(), y))));
	}

	@Override
	public int hashCode() {
		return asTable().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		if (!(obj instanceof Multitable<?, ?, ?>))
			return false;

		return asTable().equals(((Multitable<?, ?, ?>) obj).asTable());
	}

	@Override
	public String toString() {
		return asTable().toString();
	}
}