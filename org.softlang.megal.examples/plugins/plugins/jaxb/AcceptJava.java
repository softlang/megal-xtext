package plugins.jaxb;

import java.io.IOException;
import java.io.InputStream;

import org.softlang.megal.mi2.api.Artifact;

import plugins.root.elementof.Acceptor;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.google.common.base.Optional;
import com.google.common.base.Throwables;

public class AcceptJava extends Acceptor {
	@Override
	public Optional<String> accept(Artifact artifact) {
		try (InputStream s = artifact.getBytes().openStream()) {
			JavaParser.parse(s);
			return Optional.absent();
		} catch (ParseException e) {
			return Optional.of("The artifact " + artifact.getName()
					+ " is not an element of Java, reason: " + e.getMessage());
		} catch (IOException e) {
			return Optional.of(Throwables.getStackTraceAsString(e));
		}
	}

}
