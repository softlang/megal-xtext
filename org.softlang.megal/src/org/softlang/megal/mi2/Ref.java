package org.softlang.megal.mi2;

import static java.util.Arrays.asList;

import java.util.List;

/**
 * <p>
 * Reference to a defined entity type.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public final class Ref {
	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final String type;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final boolean many;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final List<String> params;

	/**
	 * <p>
	 * Internal field assigning constructor.
	 * </p>
	 */
	private Ref(String type, boolean many, List<String> params) {
		this.type = type;
		this.many = many;
		this.params = params;
	}

	/**
	 * <p>
	 * Constructs a reference on the given parameters.
	 * </p>
	 * 
	 * @param type
	 *            The type to refer to
	 * @param many
	 *            True if this is a many type
	 * @param params
	 *            The parameters of the type
	 * @return Returns a new {@link Ref}
	 */
	public static Ref ref(String type, boolean many, List<String> params) {
		return new Ref(type, many, params);
	}

	/**
	 * <p>
	 * Constructs a reference on the given parameters.
	 * </p>
	 * 
	 * @param type
	 *            The type to refer to
	 * @param many
	 *            True if this is a many type
	 * @param params
	 *            The parameters of the type
	 * @return Returns a new {@link Ref}
	 */
	public static Ref ref(String type, boolean many, String... params) {
		return new Ref(type, many, asList(params));
	}

	/**
	 * <p>
	 * Gets the name of the type to referred to.
	 * </p>
	 * 
	 * @return Returns the field
	 */
	public String getType() {
		return type;
	}

	/**
	 * <p>
	 * Returns true if this is a many reference.
	 * </p>
	 * 
	 * @return Returns the field
	 */
	public boolean isMany() {
		return many;
	}

	/**
	 * <p>
	 * Gets the names of all parameter entities.
	 * </p>
	 * 
	 * @return Returns the field
	 */
	public List<String> getParams() {
		return params;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (many ? 1231 : 1237);
		result = prime * result + ((params == null) ? 0 : params.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Ref other = (Ref) obj;
		if (many != other.many)
			return false;
		if (params == null) {
			if (other.params != null)
				return false;
		} else if (!params.equals(other.params))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getType() + (isMany() ? "+" : "") + (getParams().isEmpty() ? "" : getParams());
	}
}