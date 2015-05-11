package plugins.root.elementof;

import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.mi2.api.Plugin;

import com.google.common.base.Optional;

public abstract class Acceptor extends Plugin {
	/**
	 * <p>
	 * Accepts an artifact. If the artifact is not accepted, a reason is
	 * provided
	 * </p>
	 * 
	 * @param artifact
	 * @return
	 */
	public abstract Optional<String> accept(Artifact artifact);
}
