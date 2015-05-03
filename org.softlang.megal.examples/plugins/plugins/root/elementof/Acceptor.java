package plugins.root.elementof;


import org.softlang.megal.mi2.api.Plugin;
import org.softlang.megal.mi2.api.emission.Emission;

import com.google.common.io.CharSource;

public abstract class Acceptor extends Plugin {
	public abstract boolean accept(Emission emission, CharSource source);
}
