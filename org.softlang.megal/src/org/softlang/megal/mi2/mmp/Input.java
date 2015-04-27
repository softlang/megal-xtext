package org.softlang.megal.mi2.mmp;

import org.softlang.megal.mi2.reasoning.Reasoner;

/**
 * <p>
 * Message input context of a plugin.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public interface Input {
	/**
	 * <p>
	 * Gets the reasoner a plugin is currently evaluating.
	 * </p>
	 * 
	 * @return Returns the reasoner
	 */
	Reasoner getReasoner();
}
