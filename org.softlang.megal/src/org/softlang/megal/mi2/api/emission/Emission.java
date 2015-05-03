package org.softlang.megal.mi2.api.emission;

import org.softlang.megal.mi2.api.Message;

/**
 * <p>
 * Message emission context of a plugin.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public interface Emission {
	/**
	 * <p>
	 * Emits a message.
	 * </p>
	 * 
	 * @param message
	 *            The message to emit
	 */
	void emit(Message message);
}
