package pluginroot.elementof;

import com.google.common.io.CharSource;

public interface Acceptor {
	boolean accept(CharSource source);
}
