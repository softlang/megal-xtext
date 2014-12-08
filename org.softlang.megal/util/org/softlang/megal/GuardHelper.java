package org.softlang.megal;

import java.util.Collection;
import java.util.Objects;
import java.util.UUID;

public final class GuardHelper {
	private final UUID uuid;

	public GuardHelper(UUID uuid) {
		this.uuid = uuid;
	}

	public UUID getUUID() {
		return uuid;
	}

	public void check(boolean expectTrue) {
		if (!expectTrue)
			throw new GuardException("Check failed", getUUID());
	}

	public void checkNot(boolean expectFalse) {
		if (expectFalse)
			throw new GuardException("Inverted check failed", getUUID());
	}

	public <T> T ifAssigned(T expectNotNull) {
		if (expectNotNull == null)
			throw new GuardException("Value was not expected to be null",
					getUUID());
		return expectNotNull;
	}

	public <T> T ifUnassigned(T expectNull) {
		if (expectNull != null)
			throw new GuardException("Value was expected to be null, was "
					+ expectNull, getUUID());
		return expectNull;
	}

	public <T> T ifEqual(T actual, T expected) {
		if (!Objects.equals(actual, expected))
			throw new GuardException("Value was expected to be " + expected
					+ ", was " + actual, getUUID());
		return actual;
	}

	public <T> Iterable<T> ifEmpty(Iterable<T> items) {
		if (items.iterator().hasNext())
			throw new GuardException("Value was expected to be empty, was"
					+ items, getUUID());

		return items;
	}

	public <T> Iterable<T> ifNotEmpty(Iterable<T> items) {
		if (!items.iterator().hasNext())
			throw new GuardException(
					"Value was expected to be non-empty but were", getUUID());

		return items;
	}

	public <T> T ifContained(T item, Collection<?> items) {
		if (!items.contains(item))
			throw new GuardException("The collection " + items
					+ " did not contain the expected value " + item, getUUID());
		return item;
	}

	public <T> T ifNotContained(T item, Collection<?> items) {
		if (items.contains(item))
			throw new GuardException("The collection " + items
					+ " did contain the non-expected value " + item, getUUID());
		return item;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GuardHelper other = (GuardHelper) obj;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}

}
