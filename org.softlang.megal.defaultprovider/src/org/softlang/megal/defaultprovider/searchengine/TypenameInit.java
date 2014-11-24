package org.softlang.megal.defaultprovider.searchengine;

public class TypenameInit {
	private final Typename typename;

	private final int skip;

	public TypenameInit(Typename typename, int skip) {
		this.typename = typename;
		this.skip = skip;
	}

	public Typename getTypename() {
		return typename;
	}

	public int getSkip() {
		return skip;
	}

	public boolean hasNext() {
		return skip < typename.size() - 1;
	}

	public String nextSegment() {
		return typename.getSegment(skip + 1);
	}

	public Object next() {
		if (skip == typename.size() - 1)
			return typename;
		else
			return new TypenameInit(typename, skip + 1);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + skip;
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
		TypenameInit other = (TypenameInit) obj;
		if (skip != other.skip)
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
		return "TypenameInit [typename=" + typename + ", skip=" + skip + "]";
	}
}
