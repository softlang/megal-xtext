package plugins;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.api.AbstractReasonerPlugin;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.mi2.api.context.Context;

import plugins.prelude.GuidedReasonerPlugin;
import plugins.prelude.InjectedReasonerPlugin;

import com.google.common.collect.ImmutableMap;

public class LanguageResolver extends GuidedReasonerPlugin {

	@Override
	protected void guidedDerive(Entity entity) {
		String url = "http://dbpedia.org/page/" + entity.getName()
				+ "_(programming_language)";
		if (getArtifact(url).exists())
			binding(entity.getName(), url);

		url = "http://dbpedia.org/page/" + entity.getName();
		if (getArtifact(url).exists())
			binding(entity.getName(), url);
	}
}
