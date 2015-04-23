package plugins.root.elementof;

import org.softlang.megal.api.Evaluator;
import org.softlang.megal.api.Output;

public abstract class Acceptor extends Evaluator {
	public abstract Output accept(String text);
}
