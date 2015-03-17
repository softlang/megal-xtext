package pluginroot.elementof;

import com.google.common.io.CharSource;

public class AcceptAll extends Acceptor {

	@Override
	public boolean accept(CharSource source) {
		return true;
	}

}
