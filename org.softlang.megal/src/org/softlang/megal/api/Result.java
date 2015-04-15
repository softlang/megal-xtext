package org.softlang.megal.api;

import static com.google.common.collect.Multimaps.unmodifiableMultimap;
import static com.google.common.collect.Sets.newHashSet;
import static java.util.Collections.unmodifiableSet;

import java.util.Set;

import org.softlang.megal.mi2.Relationship;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class Result {
	private final Set<Relationship> invalid;

	private final Set<Relationship> valid;

	private final Multimap<String, String> trace;

	public Result(Set<Relationship> invalid, Set<Relationship> valid, Multimap<String, String> trace) {
		this.invalid = invalid;
		this.valid = valid;
		this.trace = trace;
	}

	public Set<Relationship> getInvalid() {
		return unmodifiableSet(invalid);
	}

	public Set<Relationship> getValid() {
		return unmodifiableSet(valid);
	}

	public Multimap<String, String> getTrace() {
		return unmodifiableMultimap(trace);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((invalid == null) ? 0 : invalid.hashCode());
		result = prime * result + ((trace == null) ? 0 : trace.hashCode());
		result = prime * result + ((valid == null) ? 0 : valid.hashCode());
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
		if (invalid == null) {
			if (other.invalid != null)
				return false;
		} else if (!invalid.equals(other.invalid))
			return false;
		if (trace == null) {
			if (other.trace != null)
				return false;
		} else if (!trace.equals(other.trace))
			return false;
		if (valid == null) {
			if (other.valid != null)
				return false;
		} else if (!valid.equals(other.valid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Result [invalid=" + invalid + ", valid=" + valid + ", trace=" + trace + "]";
	}

	public static Result concatenate(Result... rs) {
		Set<Relationship> invalid = newHashSet();
		Set<Relationship> valid = newHashSet();
		Multimap<String, String> trace = HashMultimap.create();

		for (Result r : rs) {
			invalid.addAll(r.getInvalid());
			valid.addAll(r.getValid());
			trace.putAll(r.getTrace());
		}

		return new Result(invalid, valid, trace);
	}
}