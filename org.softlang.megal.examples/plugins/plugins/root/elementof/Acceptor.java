package plugins.root.elementof;

import org.softlang.megal.mi2.mmp.Emission;
import org.softlang.megal.mi2.mmp.Plugin;

import com.google.common.io.CharSource;

public abstract class Acceptor extends Plugin {
	public abstract boolean accept(Emission emission, CharSource source);
}
