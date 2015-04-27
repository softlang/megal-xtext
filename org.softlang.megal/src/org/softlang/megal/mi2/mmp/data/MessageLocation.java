package org.softlang.megal.mi2.mmp.data;

import java.util.List;

import org.softlang.megal.mi2.Annotated;

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
	private final List<Application> stackTrace;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Annotated element;

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
	 * @param element
	 *            The associated element
	 * @param message
	 *            The message value
	 */
	private MessageLocation(List<Application> stackTrace, Annotated element, Message message) {
		this.stackTrace = stackTrace;
		this.element = element;
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
	 *            The associated element
	 * @param message
	 *            The message value
	 * @return Returns a new message location
	 */
	public static MessageLocation of(List<Application> stackTrace, Annotated element, Message message) {
		return new MessageLocation(stackTrace, element, message);
	}

	/**
	 * <p>
	 * Constructs a message location on the given parameters.
	 * </p>
	 * 
	 * @param element
	 *            The associated element
	 * @param message
	 *            The message value
	 * @return Returns a new message location
	 */
	public static MessageLocation of(Annotated element, Message message) {
		return new MessageLocation(ImmutableList.of(), element, message);
	}

	/**
	 * <p>
	 * The stack trace represents the sequence plugins that have spawned the
	 * message. If this list is empty, the message is a top level message.
	 * </p>
	 * 
	 * @return Returns the sequence of plugins.
	 */
	public List<Application> getStackTrace() {
		return stackTrace;
	}

	/**
	 * <p>
	 * The element that contributed the message.
	 * </p>
	 * 
	 * @return Returns the element
	 */
	public Annotated getElement() {
		return element;
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
		result = prime * result + element.hashCode();
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
		if (!element.equals(other.element))
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
		builder.append("  at ").append(element).append("\r\n");

		if (!stackTrace.isEmpty()) {
			builder.append("  emitted by ").append(stackTrace.get(stackTrace.size() - 1)).append("\r\n");

			for (int i = stackTrace.size() - 2; i >= 0; i--)
				builder.append("  in ").append(stackTrace.get(i)).append("\r\n");
		}

		return builder.toString();
	}
}
