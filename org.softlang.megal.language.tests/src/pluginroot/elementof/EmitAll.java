package pluginroot.elementof;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.Message;
import org.softlang.megal.mi2.api.context.Context;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class EmitAll extends EvaluatorPlugin {
	private final Multiset<Entity> entities = HashMultiset.create();

	@Override
	public void evaluate(Context context, Entity entity) {
		System.out.println("Boop " + entity);
		entities.add(entity);

		if (entities.count(entity) > 1)
			context.emit(Message.error("I've seen the entity " + entity + " more than once, fuck!"));
	}

}
