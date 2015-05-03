package plugins.jaxb;

import static com.google.common.collect.Iterables.getFirst;

import java.util.Set;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.mmp.Context;
import org.softlang.megal.mi2.mmp.Plugin;
import org.softlang.megal.mi2.mmp.data.Message;

public class FindBuildScriptAsElementOfProof extends Plugin {

	@Override
	public KB evaluate(Context context, Relationship relationship) {

		Set<Object> bindings = relationship.getRight().getBindings();
		System.out.println(bindings);

		Relationship firstOf = getFirst(
				relationship.getLeft().incoming("firstOf"), null);
		Relationship secondOf = getFirst(
				relationship.getLeft().incoming("secondOf"), null);

		Entity first = firstOf.getLeft();
		Entity second = secondOf.getLeft();

		for (Object firstBinding : first.getBindings())
			for (Object secondBinding : second.getBindings())
				context.emit(Message
						.warning("TODO Find elementOf evidence for \r\nFirst: "
								+ firstBinding + "\r\nSecond: " + secondBinding));
		return KBs.emptyKB();
	}
}
