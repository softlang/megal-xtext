package plugins;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.api.AbstractReasonerPlugin;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.mi2.api.context.Context;

import com.google.common.collect.ImmutableMap;

public class LanguageResolver extends AbstractReasonerPlugin {
	@Override
	public KB derive(Context context, Entity entity) {
		if (entity.hasBinding())
			return KBs.empty();

		String progLang = "http://dbpedia.org/page/" + entity.getName()
				+ "_(programming_language)";

		Artifact artifact = context.getArtifact(progLang);
		if (artifact.exists()) {
			return KBs.builder()
					.setBindings(ImmutableMap.of(entity.getName(), progLang))
					.build();
		}

		String page = "http://dbpedia.org/page/" + entity.getName();

		artifact = context.getArtifact(page);
		if (artifact.exists()) {
			return KBs.builder()
					.setBindings(ImmutableMap.of(entity.getName(), page))
					.build();
		}

		return KBs.empty();
	}
}
