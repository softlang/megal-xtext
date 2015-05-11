package plugins;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.ReasonerPlugin;
import org.softlang.megal.mi2.api.context.Context;

public class FilesElementOfFolder extends ReasonerPlugin {
	@Override
	public KB derive(Context context, Relationship relationship) {
		if (!relationship.getRight().getBinding().isPresent())
			return KBs.empty();

		if (relationship.getLeft().getBinding().isPresent())
			return KBs.empty();
		
		

		return KBs.builder().setBindings(null).build();
	}
}
