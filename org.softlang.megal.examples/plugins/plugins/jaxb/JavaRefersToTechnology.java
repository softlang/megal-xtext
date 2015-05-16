package plugins.jaxb;

import static com.google.common.base.Predicates.in;
import static com.google.common.base.Predicates.not;
import static com.google.common.collect.FluentIterable.from;

import java.io.IOException;
import java.util.Set;

import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableSet;

public class JavaRefersToTechnology extends EvaluatorPlugin {
	private static final Set<String> STOP_WORDS = ImmutableSet.of("Library"
			.toLowerCase());

	private static final Set<String> getIndicators(CharSequence name) {
		return from(Splitter.on(CharMatcher.anyOf("._")).split(name))
				.transform(String::toLowerCase).filter(not(in(STOP_WORDS)))
				.toSet();
	}

	@Override
	public void evaluate(Context context, Relationship relationship) {
		if (!relationship.getLeft().getBinding().isPresent())
			return;
		Artifact artifact = context.getArtifact(relationship.getLeft()
				.getBinding().get());

		Set<String> indicators = getIndicators(relationship.getRight()
				.getName());

		try {
			for (String indicator : indicators)
				for (String line : artifact.getChars().readLines())
					if (line.toLowerCase().contains(indicator)) {
						context.valid();
						return;
					}

			context.error("No indicator found suggesting the referral to the technology "
					+ relationship.getRight().getName()
					+ ", looking for the indicators " + indicators);
		} catch (IOException e) {
			context.warning(Throwables.getStackTraceAsString(e));
		}
	}
}
