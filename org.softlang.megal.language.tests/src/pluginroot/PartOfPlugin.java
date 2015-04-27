package pluginroot;

import static java.util.Collections.singleton;

import java.io.IOException;
import java.util.Set;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.mmp.Context;
import org.softlang.megal.mi2.mmp.Plugin;
import org.softlang.megal.mi2.reasoning.Reasoner.PerformanceCaps;
import org.softlang.megal.mi2.util.ImmutableMultitable;

import com.google.common.collect.ImmutableSet;

public class PartOfPlugin extends Plugin {
	@Override
	public Set<PerformanceCaps> getCaps() {
		return ImmutableSet.of();
	}

	@Override
	public KB evaluate(Context context, Entity entity) throws IOException {
		int i = entity.getName().lastIndexOf('.');
		if (i >= 0) {
			String container = entity.getName().substring(0, i);

			return KBs.builder()
					.setRelationships(ImmutableMultitable.of(entity.getName(), container, singleton("partOf"))).build();
		}

		return KBs.emptyKB();
	}
}
