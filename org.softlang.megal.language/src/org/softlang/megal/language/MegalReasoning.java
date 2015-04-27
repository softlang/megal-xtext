package org.softlang.megal.language;

import org.eclipse.xtext.resource.XtextResource;
import org.softlang.megal.Megamodel;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.MegamodelKB;
import org.softlang.megal.mi2.reasoning.Providers;
import org.softlang.megal.mi2.reasoning.Reasoner;

import com.google.inject.Provider;

public class MegalReasoning {
	public static final String KB_KEY = "org.softlang.megal.language.MegalReasoning.KB_KEY";

	public static final String REASONER_KEY = "org.softlang.megal.language.MegalReasoning.REASONER_KEY";

	/**
	 * <p>
	 * Gets the KB associated with the megamodel, may be cached in XText
	 * resources.
	 * </p>
	 * 
	 * @param megamodel
	 *            The megamodel to get the KB for
	 * @return Returns the KB for the megamodel
	 */
	public static KB getKB(final Megamodel megamodel) {
		if (megamodel.eResource() instanceof XtextResource)
			// If the megamodel resource has been loaded by XText, use the
			// resource scoped cache for KB evaluation
			return ((XtextResource) megamodel.eResource()).getCache().get(KB_KEY, megamodel.eResource(),
					new Provider<KB>() {
						@Override
						public KB get() {
							return new MegamodelKB(megamodel);
						}
					});
		else
			// Else use reevaluation
			return new MegamodelKB(megamodel);
	}

	/**
	 * <p>
	 * Gets the reasoner associated with the megamodel, may be cached in XText
	 * resources.
	 * </p>
	 * 
	 * @param megamodel
	 *            The megamodel to get the reasoner for
	 * @return Returns the reasoner on the KB for the megamodel
	 */
	public static Reasoner getReasoner(final Megamodel megamodel) {
		if (megamodel.eResource() instanceof XtextResource)
			// If the megamodel resource has been loaded by XText, use the
			// resource scoped cache for reasoner evaluation
			return ((XtextResource) megamodel.eResource()).getCache().get(REASONER_KEY, megamodel.eResource(),
					new Provider<Reasoner>() {
						@Override
						public Reasoner get() {
							return Providers.obtain(getKB(megamodel));
						}
					});
		else
			// Else use reevaluation and reasoner generation
			return Providers.obtain(getKB(megamodel));
	}
}
