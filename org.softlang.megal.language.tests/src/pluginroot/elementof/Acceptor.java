package pluginroot.elementof;

import org.softlang.megal.mi2.api.EvaluatorPlugin;

import com.google.common.io.CharSource;

public abstract class Acceptor extends EvaluatorPlugin {
	public abstract boolean accept(CharSource source);
}
