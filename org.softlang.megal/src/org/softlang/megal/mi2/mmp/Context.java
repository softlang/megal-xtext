package org.softlang.megal.mi2.mmp;

import org.softlang.megal.mi2.reasoning.Reasoner;

/**
 * <p>
 * Context for plugin execution, sustains resolver input, binding resolution and
 * message emission.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public interface Context extends Resolution, Emission {
	public Reasoner getReasoner();
}
