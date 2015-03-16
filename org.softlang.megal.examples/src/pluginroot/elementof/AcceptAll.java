package pluginroot.elementof;

import org.softlang.megal.api.Evaluator;

import com.google.common.io.CharSource;

public class AcceptAll extends Evaluator implements Acceptor {

	@Override
	public boolean accept(CharSource source) {
		return true;
	}

}
