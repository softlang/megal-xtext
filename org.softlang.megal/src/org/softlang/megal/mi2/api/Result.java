package org.softlang.megal.mi2.api;

import java.util.Set;

import org.softlang.megal.mi2.KB;

public final class Result {
	private final KB input;

	private final KB output;

	private final Set<MessageLocation> messageLocations;

	private Result(KB input, KB output, Set<MessageLocation> messageLocations) {
		this.input = input;
		this.output = output;
		this.messageLocations = messageLocations;
	}

	public static Result of(KB input, KB output, Set<MessageLocation> messageLocations) {
		return new Result(input, output, messageLocations);
	}

	public KB getInput() {
		return input;
	}

	public KB getOutput() {
		return output;
	}

	public Set<MessageLocation> getMessageLocations() {
		return messageLocations;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + input.hashCode();
		result = prime * result + messageLocations.hashCode();
		result = prime * result + output.hashCode();
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
		Result other = (Result) obj;

		if (!input.equals(other.input))
			return false;

		if (!messageLocations.equals(other.messageLocations))
			return false;

		if (!output.equals(other.output))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Result [input=" + input + ", output=" + output + ", messageLocations=" + messageLocations + "]";
	}

}
