package plugins.jaxb;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.resolution.Resolution;

import com.google.common.io.CharSource;

public class PackageInfoNSURIExtractor extends NSURIExtractor {

	@Override
	public URI extractNSURI(Resolution resolution, Entity entity) {
		String base = entity.getBinding().get().toString();
		if (!base.endsWith("/"))
			base += "/";

		CharSource source = resolution.getChars(base + "package-info.java");

		Pattern pattern = Pattern.compile(".*namespace\\s*=\\s*\"([^\"]*)\".*",
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
