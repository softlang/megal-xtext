package org.softlang.megal.mi2.api;

import java.util.List;

import org.softlang.megal.mi2.Element;

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
	private final Element origin;

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
	private MessageLocation(Element element, Message message) {
		this.origin = element;
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
	public static MessageLocation of(Element element, Message message) {
		return new MessageLocation(element, message);
	}

	/**
	 * <p>
	 * The element that contributed the message.
	 * </p>
	 * 
	 * @return Returns the element
	 */
	public Element getOrigin() {
		return origin;
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
		result = prime * result + origin.hashCode();
		result = prime * result + message.hashCode();
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
		if (!origin.equals(other.origin))
			return false;
		if (!message.equals(other.message))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(message.toString()).append("\r\n");
		builder.append("  caused by ").append(origin).append("\r\n");

		return builder.toString();
	}
}
