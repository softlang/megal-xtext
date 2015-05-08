package org.softlang.megal.mi2.api;

import java.util.Set;

import org.softlang.megal.mi2.Element;
import org.softlang.megal.mi2.KB;

import com.google.common.collect.SetMultimap;
import static com.google.common.collect.Sets.*;

public final class Result {
	private final KB input;

	private final KB output;

	private final Set<Element> valid;

	private final SetMultimap<Element, Message> messages;

	private Result(KB input, KB output, Set<Element> valid, SetMultimap<Element, Message> messages) {
		this.input = input;
		this.output = output;
		this.valid = valid;
		this.messages = messages;
	}

	public static Result of(KB input, KB output, Set<Element> valid, SetMultimap<Element, Message> messages) {
		return new Result(input, output, valid, messages);
	}

	public KB getInput() {
		return input;
	}

	public KB getOutput() {
		return output;
	}

	public Set<Element> getValid() {
		return valid;
	}

	public SetMultimap<Element, Message> getMessages() {
		return messages;
	}

	public Set<Element> visited() {
		return union(valid, messages.keySet());
	}

	public Set<Element> notVisited() {
		return difference(getInput().getElements(), visited());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + input.hashCode();
		result = prime * result + output.hashCode();
		result = prime * result + valid.hashCode();
		result = prime * result + messages.hashCode();

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
		if (!output.equals(other.output))
			return false;
		if (!valid.equals(other.valid))
			return false;
		if (!messages.equals(other.messages))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Result [input=" + input + ", output=" + output + ", valid=" + valid + ", messages=" + messages + "]";
	}

}
