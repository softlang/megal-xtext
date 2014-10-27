package org.softlang.megal;

import java.util.UUID;

public class GuardException extends Exception {
	private static final long serialVersionUID = 8489902200561966312L;

	private final UUID uuid;

	public UUID getUUID() {
		return uuid;
	}

	public GuardException(UUID uuid) {
		super();
		this.uuid = uuid;
	}

	public GuardException(String message, UUID uuid) {
		super(message);
		this.uuid = uuid;
	}

	public GuardException(String message, Throwable cause, UUID uuid) {
		super(message, cause);
		this.uuid = uuid;
	}

	protected GuardException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace, UUID uuid) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.uuid = uuid;
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
		GuardException other = (GuardException) obj;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GuardException [uuid=" + uuid + "]";
	}
}
