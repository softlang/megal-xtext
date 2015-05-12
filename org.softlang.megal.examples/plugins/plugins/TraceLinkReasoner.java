package plugins;

import java.util.Map;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.Ref;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.ReasonerPlugin;
import org.softlang.megal.mi2.api.context.Context;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Table;

import plugins.util.Prelude;
import static com.google.common.collect.Iterables.*;
import static com.google.common.collect.FluentIterable.*;

public class TraceLinkReasoner extends ReasonerPlugin {
	@Override
	public KB derive(Context context, Relationship relationship) {

		if (Prelude.isElementOfLanguage(relationship.getLeft(), "XML")
				&& Prelude.isElementOfLanguage(relationship.getRight(), "XSD")) {

			Multimap<String, String> ab = HashMultimap.create();
			// ...
			return KBs
					.builder()
					.setEntities(
							from(concat(ab.keys(), ab.values())).toMap(
									x -> Ref.to("Fragment", false)))
					.setRelationships(null)
					.setBindings(null)
							.build();
		}
		return super.derive(context, relationship);
	}
}
