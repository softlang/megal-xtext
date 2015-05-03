package pluginroot.elementof;

import org.softlang.megal.api.Plugin;

import com.google.common.io.CharSource;

public abstract class Acceptor extends Plugin {
	public abstract boolean accept(CharSource source);
}
