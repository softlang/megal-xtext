package pluginroot.elementof;

import org.softlang.megal.api.Evaluator;

import com.google.common.io.CharSource;

public abstract class Acceptor extends Evaluator {
	public abstract boolean accept(CharSource source);
}
