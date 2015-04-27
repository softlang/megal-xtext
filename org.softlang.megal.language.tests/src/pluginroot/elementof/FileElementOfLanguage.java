package pluginroot.elementof;

import static com.google.common.collect.Iterables.filter;

import java.io.IOException;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.mmp.Context;
import org.softlang.megal.mi2.mmp.Plugin;
import org.softlang.megal.mi2.mmp.data.Message;

import com.google.common.io.CharSource;

/**
 * <p>
 * Parts for this evaluator will be seen as acceptors
 * </p>
 * 
 * @author Pazuzu
 *
 */
public class FileElementOfLanguage extends Plugin {
	@Override
	public KB evaluate(Context context, Relationship relationship) throws IOException {
		for (Object binding : relationship.getLeft().getBindings()) {
			CharSource s = context.getChars(binding);

			for (Acceptor a : filter(getParts(), Acceptor.class))
				if (a.getRealization().contains(relationship.getRight()))
					if (!a.accept(s))
						context.emit(Message.error("The entity is not an element of "
								+ relationship.getRight().getName()));
		}

		return KBs.emptyKB();
	}
}
