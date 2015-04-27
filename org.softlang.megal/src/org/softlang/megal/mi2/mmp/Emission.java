package org.softlang.megal.mi2.mmp;

import org.softlang.megal.mi2.mmp.data.Message;

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
	 * Emits a message in the current plugin call stack.
	 * </p>
	 * 
	 * @param message
	 *            The message to emit
	 */
	void emit(Message message);
}
