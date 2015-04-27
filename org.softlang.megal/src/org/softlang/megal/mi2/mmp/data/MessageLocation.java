package org.softlang.megal.mi2.mmp.data;

import java.util.List;
import java.util.Set;

import org.softlang.megal.mi2.Annotated;
import org.softlang.megal.mi2.mmp.Plugin;

import com.google.common.collect.ImmutableList;

/**
 * <p>
 * Message produced by any evaluation step annotated with the origin.
 * </p>
 * 
 * @see Message
 * @author Pazuzu
 *
 */
public final class MessageLocation {
	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final List<? extends Plugin> stackTrace;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Set<? extends Annotated> elements;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Message message;

	/**
	 * <p>
	 * Field initializing constructor.
	 * </p>
	 * 
	 * @param stackTrace
	 *            The current stack trace of plugins
	 * @param elements
	 *            The associated elements
	 * @param message
	 *            The message value
	 */
	private MessageLocation(List<? extends Plugin> stackTrace, Set<? extends Annotated> elements, Message message) {
		this.stackTrace = stackTrace;
		this.elements = elements;
		this.message = message;
	}

	/**
	 * <p>
	 * Constructs a message location on the given parameters.
	 * </p>
	 * 
	 * @param stackTrace
	 *            The stack of plugins
	 * @param elements
	 *            The associated elements
	 * @param message
	 *            The message value
	 * @return Returns a new message location
	 */
	public static MessageLocation of(List<? extends Plugin> stackTrace, Set<? extends Annotated> elements,
			Message message) {
		return new MessageLocation(stackTrace, elements, message);
	}

	/**
	 * <p>
	 * Constructs a message location on the given parameters.
	 * </p>
	 * 
	 * @param elements
	 *            The associated elements
	 * @param message
	 *            The message value
	 * @return Returns a new message location
	 */
	public static MessageLocation of(Set<? extends Annotated> elements, Message message) {
		return new MessageLocation(ImmutableList.of(), elements, message);
	}

	/**
	 * <p>
	 * The stack trace represents the sequence plugins that have spawned the
	 * message. If this list is empty, the message is a top level message.
	 * </p>
	 * 
	 * @return Returns the sequence of plugins.
	 */
	public List<? extends Plugin> getStackTrace() {
		return stackTrace;
	}

	/**
	 * <p>
	 * The elements that contributed the message.
	 * </p>
	 * 
	 * @return Returns a set of elements
	 */
	public Set<? extends Annotated> getElements() {
		return elements;
	}

	/**
	 * <p>
	 * The message value.
	 * </p>
	 * 
	 * @return Returns the message
	 */
	public Message getMessage() {
		return message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + elements.hashCode();
		result = prime * result + message.hashCode();
		result = prime * result + stackTrace.hashCode();
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
		MessageLocation other = (MessageLocation) obj;
		if (!elements.equals(other.elements))
			return false;
		if (!message.equals(other.message))
			return false;
		if (!stackTrace.equals(other.stackTrace))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(message.toString()).append("\r\n");
		for (Annotated a : elements)
			builder.append("  at ").append(a).append("\r\n");

		if (!stackTrace.isEmpty()) {
			builder.append("  emitted by ").append(stackTrace.get(0)).append("\r\n");

			for (int i = 1; i < stackTrace.size(); i++)
				builder.append("  in ").append(stackTrace.get(0)).append("\r\n");
		}

		return builder.toString();
	}
}
