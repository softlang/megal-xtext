package pluginroot.elementof;

import org.softlang.megal.api.Evaluator;
import org.softlang.megal.api.Output;

import com.google.common.io.CharSource;

public abstract class Acceptor extends Evaluator {
	public abstract Output accept(String text);
}
