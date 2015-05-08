package plugins.jaxb;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.resolution.Resolution;

import com.google.common.io.CharSource;

public class XSDNSURIExtractor extends NSURIExtractor {

	@Override
	public URI extractNSURI(Resolution resolution, Entity entity) {
		CharSource source = resolution.getChars(entity.getBinding().get());

		Pattern pattern = Pattern.compile(".*schema xmlns\\s*=\\s*\"([^\"]*)\".*",
				Pattern.DOTALL);

		try {
			Matcher matcher = pattern.matcher(source.read());
			if (!matcher.matches()) 
				return null;
			
			String nsuri = matcher.group(1);
			return new URI(nsuri);
		} catch (IOException | URISyntaxException e) {
			return null;
		}
	}

}
