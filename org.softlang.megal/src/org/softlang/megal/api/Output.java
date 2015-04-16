package org.softlang.megal.api;


public final class Output {
	private static enum Type {
		NOT_APPLICABLE, ERROR, VALID
	}

	private final Type type;

	private final String error;

	private Output(Type type, String error) {
		this.type = type;
		this.error = error;
	}

	public static Output notApplicable() {
		return new Output(Type.NOT_APPLICABLE, null);
	}

	public static Output error(String error) {
		return new Output(Type.ERROR, error);
	}

	public static Output valid() {
		return new Output(Type.VALID, null);
	}

	public boolean isNotApplicable() {
		return Type.NOT_APPLICABLE == type;
	}

	public boolean isApplicable() {
		return !isNotApplicable();
	}

	public boolean isError() {
		return Type.ERROR == type;
	}

	public boolean isValid() {
		return !isError();
	}

	public String getError() {
		return error;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((error == null) ? 0 : error.hashCode());
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
		Output other = (Output) obj;
		if (error == null) {
			if (other.error != null)
				return false;
		} else if (!error.equals(other.error))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		switch (type) {
		case NOT_APPLICABLE:
			return "<not applicable>";
		case ERROR:
			return "<error=" + error + ">";
		case VALID:
			return "<valid>";
		}
		throw new IllegalStateException();
	}

}
