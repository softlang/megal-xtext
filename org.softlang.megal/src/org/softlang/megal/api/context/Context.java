package org.softlang.megal.api.context;

import org.softlang.megal.api.emission.Emission;
import org.softlang.megal.api.resolution.Resolution;
import org.softlang.megal.mi2.kb.KB;

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
	public KB getKB();
}
