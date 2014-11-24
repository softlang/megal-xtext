package org.softlang.megal.defaultprovider.searchengine;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class Typename {
	private final ImmutableList<String> packagePrefix;

	private final ImmutableList<String> enclosingTypes;

	private final String typename;

	private Typename(List<String> packagePrefix, List<String> enclosingTypes,
			String typename) {
		this.packagePrefix = ImmutableList.copyOf(packagePrefix);
		this.enclosingTypes = ImmutableList.copyOf(enclosingTypes);
		this.typename = typename;
	}

	public static Typename createIncomplete(List<String> packagePrefix,
			List<String> enclosingTypes) {
		return new Typename(packagePrefix, enclosingTypes, null);
	}

	public static Typename createComplete(List<String> packagePrefix,
			List<String> enclosingTypes, String typename) {
		return new Typename(packagePrefix, enclosingTypes, typename);
	}

	public ImmutableList<String> getPackagePrefix() {
		return packagePrefix;
	}

	public ImmutableList<String> getEnclosingTypes() {
		return enclosingTypes;
	}

	public String getTypename() {
		if (typename == null)
			throw new IllegalStateException();
		return typename;
	}

	public boolean isComplete() {
		return typename != null;
	}

	public String getSegment(int i) {
		if (i < 0)
			throw new IndexOutOfBoundsException();

		if (i < getPackagePrefix().size())
			return getPackagePrefix().get(i);

		i -= getPackagePrefix().size();

		if (i < getEnclosingTypes().size())
			return getEnclosingTypes().get(i);

		i -= getEnclosingTypes().size();
		if (i != 0)
			throw new IndexOutOfBoundsException();

		return getTypename();
	}

	public int size() {
		return getPackagePrefix().size() + getEnclosingTypes().size()
				+ (isComplete() ? 1 : 0);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((enclosingTypes == null) ? 0 : enclosingTypes.hashCode());
		result = prime * result
				+ ((packagePrefix == null) ? 0 : packagePrefix.hashCode());
		result = prime * result
				+ ((typename == null) ? 0 : typename.hashCode());
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
		Typename other = (Typename) obj;
		if (enclosingTypes == null) {
			if (other.enclosingTypes != null)
				return false;
		} else if (!enclosingTypes.equals(other.enclosingTypes))
			return false;
		if (packagePrefix == null) {
			if (other.packagePrefix != null)
				return false;
		} else if (!packagePrefix.equals(other.packagePrefix))
			return false;
		if (typename == null) {
			if (other.typename != null)
				return false;
		} else if (!typename.equals(other.typename))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TypenamePrefix [packagePrefix=" + packagePrefix
				+ ", enclosingTypes=" + enclosingTypes + ", typename="
				+ typename + "]";
	}

}
