package plugins.jaxb;

import org.softlang.megal.mi2.api.Artifact;

import plugins.root.elementof.Acceptor;

import com.google.common.base.Optional;

public class AcceptJava extends Acceptor {
	@Override
	public Optional<String> accept(Artifact artifact) {
		if (artifact.getLocation().getPath().toLowerCase().endsWith(".java"))
			return Optional.absent();
		else
			return Optional.of("The artifact " + artifact.getName()
					+ " is not an element of Java.");
	}

}
