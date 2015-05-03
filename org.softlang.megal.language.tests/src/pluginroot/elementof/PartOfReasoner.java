package pluginroot.elementof;

import static java.util.Collections.singleton;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.api.ReasonerPlugin;
import org.softlang.megal.mi2.api.context.Context;
import org.softlang.megal.mi2.util.ImmutableMultitable;

public class PartOfReasoner extends ReasonerPlugin {
	@Override
	public KB derive(Context context, Entity entity) {
		int i = entity.getName().lastIndexOf('.');
		if (i >= 0) {
			String container = entity.getName().substring(0, i);

			return KB.builder()
					.setRelationships(ImmutableMultitable.of(entity.getName(), container, singleton("partOf"))).build();
		}

		return KB.empty();
	}
}
