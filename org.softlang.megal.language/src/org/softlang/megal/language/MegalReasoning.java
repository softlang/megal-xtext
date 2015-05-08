package org.softlang.megal.language;

import org.eclipse.xtext.resource.XtextResource;
import org.softlang.megal.MegalFile;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.MegamodelKB;

import com.google.inject.Provider;

public class MegalReasoning {
	public static final String KB_KEY = "org.softlang.megal.language.MegalReasoning.KB_KEY";

	public static final String REASONER_KEY = "org.softlang.megal.language.MegalReasoning.REASONER_KEY";

	/**
	 * <p>
	 * Gets the KB associated with the megamodel, may be cached in XText resources.
	 * </p>
	 * 
	 * @param megamodel
	 *            The megamodel to get the KB for
	 * @return Returns the KB for the megamodel
	 */
	public static KB getKB(final MegalFile megamodel) {
		if (megamodel.eResource() instanceof XtextResource)
			// If the megamodel resource has been loaded by XText, use the
			// resource scoped cache for KB evaluation
			return ((XtextResource) megamodel.eResource()).getCache().get(KB_KEY, megamodel.eResource(),
					new Provider<KB>() {
						@Override
						public KB get() {
							return MegamodelKB.loadAll(megamodel);
						}
					});
		else
			// Else use reevaluation
			return MegamodelKB.loadAll(megamodel);
	}
}
