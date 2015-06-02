package plugins.jaxb;

import java.net.URI;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.resolution.Resolution;

public abstract class NSURIExtractor extends EvaluatorPlugin {
	public abstract URI extractNSURI(Resolution resolution, Entity entity);
}
