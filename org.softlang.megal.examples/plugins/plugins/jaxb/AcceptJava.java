package plugins.jaxb;

import java.io.IOException;

import org.softlang.megal.mi2.api.emission.Emission;

import plugins.root.elementof.Acceptor;

import com.google.common.io.CharSource;

public class AcceptJava extends Acceptor {
	@Override
	public boolean accept(Emission emission, CharSource source) {
		// TODO: HAHHAAHAHHAHAHAAAA EEHEHEHEHEHHEHE
		try {
			return source.readFirstLine().startsWith("package");
		} catch (IOException e) {
			return false;
		}
	}

}
