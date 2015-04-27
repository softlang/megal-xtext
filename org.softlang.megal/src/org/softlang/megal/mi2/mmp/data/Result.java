package org.softlang.megal.mi2.mmp.data;

import java.util.Set;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;

import com.google.common.base.Joiner;

/**
 * <p>
 * Result of a model evaluation, consists of the input KB, the generated residue
 * KB containing all emitted items and all emitted messages.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public final class Result {
	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final KB input;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final KB residue;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Set<MessageLocation> messageLocations;

	/**
	 * <p>
	 * Field initializing constructor.
	 * </p>
	 * 
	 * @param input
	 *            The input KB
	 * @param residue
	 *            The residue KB
	 * @param messageLocations
	 *            The message locations
	 */
	private Result(KB input, KB residue, Set<MessageLocation> messageLocations) {
		this.input = input;
		this.residue = residue;
		this.messageLocations = messageLocations;
	}

	/**
	 * <p>
	 * Constructs a result on the given parameters.
	 * </p>
	 * 
	 * @param input
	 *            The input KB
	 * @param residue
	 *            The residue KB
	 * @param messageLocations
	 *            The message locations
	 * @return Returns a new result
	 */
	public static Result of(KB input, KB residue, Set<MessageLocation> messageLocations) {
		return new Result(input, residue, messageLocations);
	}

	/**
	 * <p>
	 * Gets the input KB, which is the input of the corresponding evaluation
	 * processor.
	 * </p>
	 * 
	 * @return Returns the KB
	 */
	public KB getInput() {
		return input;
	}

	/**
	 * <p>
	 * Gets the residue KB, which is the database of all generated elements.
	 * </p>
	 * 
	 * @return Returns the KB
	 */
	public KB getResidue() {
		return residue;
	}

	/**
	 * <p>
	 * Gets the set of all message locations.
	 * </p>
	 * 
	 * @return Returns the message locations
	 */
	public Set<MessageLocation> getMessageLocations() {
		return messageLocations;
	}

	/**
	 * <p>
	 * Unifies the input and the residue KB.
	 * </p>
	 * 
	 * @return Returns the union
	 */
	public KB getKB() {
		return KBs.union(input, residue);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + input.hashCode();
		result = prime * result + messageLocations.hashCode();
		result = prime * result + residue.hashCode();
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
		if (!residue.equals(other.residue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getKB().toString() + " {" + Joiner.on(", ").join(messageLocations) + "}";
	}
}
