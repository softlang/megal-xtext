package org.softlang.megal.api;

import org.softlang.megal.mi2.Element;

import com.google.common.base.Throwables;

/**
 * <p>
 * Message with level.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public final class Message {
	/**
	 * <p>
	 * </p>
	 * 
	 * @author Pazuzu
	 *
	 */
	public static enum Level {
		/**
		 * <p>
		 * Message level representing messages that are non-trivial information
		 * but that do not revoke model consistency.
		 * </p>
		 */
		INFO,

		/**
		 * <p>
		 * Message level for errors in model consistency that do not prevent
		 * model execution.
		 * </p>
		 */
		WARNING,

		/**
		 * <p>
		 * Errors that prevent model execution and invalidate consistency.
		 * </p>
		 */
		ERROR
	}

	/**
	 * <p>
	 * Creates a message for an exception.
	 * </p>
	 * 
	 * @param t
	 *            The throwable
	 * @return Returns a message
	 */
	public static Message createInfoFor(Element element, Throwable t) {
		return Message.info(element, t.getMessage() + "\r\n" + Throwables.getStackTraceAsString(t));
	}

	/**
	 * <p>
	 * Creates a message for an exception.
	 * </p>
	 * 
	 * @param t
	 *            The throwable
	 * @return Returns a message
	 */
	public static Message createWarningFor(Element element, Throwable t) {
		return Message.warning(element, t.getMessage() + "\r\n" + Throwables.getStackTraceAsString(t));
	}

	/**
	 * <p>
	 * Creates a message for an exception.
	 * </p>
	 * 
	 * @param t
	 *            The throwable
	 * @return Returns a message
	 */
	public static Message createErrorFor(Element element, Throwable t) {
		return Message.error(element, t.getMessage() + "\r\n" + Throwables.getStackTraceAsString(t));
	}

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Element element;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Level level;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final String message;

	/**
	 * <p>
	 * Field initializing constructor.
	 * </p>
	 * 
	 * @param element
	 *            The associated element
	 * @param level
	 *            The level to construct on
	 * @param message
	 *            The message to construct with
	 */
	private Message(Element element, Level level, String message) {
		this.element = element;
		this.level = level;
		this.message = message;
	}

	/**
	 * <p>
	 * Constructs an message on the given level and the message.
	 * </p>
	 * 
	 * @param element
	 *            The associated element
	 * @param level
	 *            The level to use
	 * @param message
	 *            The message to provide
	 * @return Returns a new message
	 */
	public static Message of(Element element, Level level, String message) {
		return new Message(element, level, message);
	}

	/**
	 * <p>
	 * Constructs an information on the message.
	 * </p>
	 * 
	 * @param element
	 *            The associated element
	 * @param message
	 *            The message to provide
	 * @return Returns a new message
	 */
	public static Message info(Element element, String message) {
		return new Message(element, Level.INFO, message);
	}

	/**
	 * <p>
	 * Constructs a warning on the message.
	 * </p>
	 * 
	 * @param element
	 *            The associated element
	 * @param message
	 *            The message to provide
	 * @return Returns a new message
	 */
	public static Message warning(Element element, String message) {
		return new Message(element, Level.WARNING, message);
	}

	/**
	 * <p>
	 * Constructs an error on the message.
	 * </p>
	 * 
	 * @param element
	 *            The associated element
	 * @param message
	 *            The message to provide
	 * @return Returns a new message
	 */
	public static Message error(Element element, String message) {
		return new Message(element, Level.ERROR, message);
	}

	/**
	 * <p>
	 * Gets the associated element.
	 * </p>
	 * 
	 * @return Returns the element
	 */
	public Element getElement() {
		return element;
	}

	/**
	 * <p>
	 * Gets the message level.
	 * </p>
	 * 
	 * @return Returns the level
	 */
	public Level getLevel() {
		return level;
	}

	/**
	 * <p>
	 * Gets the message value.
	 * </p>
	 * 
	 * @return Returns a message string
	 */
	public String getMessage() {
		return message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + level.hashCode();
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
		Message other = (Message) obj;
		if (level != other.level)
			return false;
		if (!message.equals(other.message))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return level + ": " + message;
	}
}
