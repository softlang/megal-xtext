package org.softlang.megal.api;

public class Result {
	public static final Result NOT_HANDLED = new Result("Not handled", false);

	private final String message;

	private final boolean valid;

	public Result(String message, boolean valid) {
		this.message = message;
		this.valid = valid;
	}

	public String getMessage() {
		return message;
	}

	public boolean isValid() {
		return valid;
	}
}