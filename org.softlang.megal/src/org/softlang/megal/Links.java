package org.softlang.megal;

import static com.google.common.base.Objects.equal;
import static org.softlang.megal.Megamodels.transitiveBindings;

import org.eclipse.emf.ecore.util.EcoreUtil;

public class Links {
	/**
	 * Returns true if the links specify the same objects in a different
	 * location
	 * 
	 * @param a
	 *            The first link
	 * @param b
	 *            The second link
	 * @return Returns true if merge is possible
	 */
	public static boolean isLinkMergable(Link a, Link b) {
		return a == null ? b == null : b != null && equal(a.getLink(), b.getLink());
	}

	/**
	 * Creates a merged link
	 * 
	 * @param a
	 *            The link to merge with it's group
	 * @return Returns a newly created link
	 */
	public static Link createLinkMerge(Link a) {
		// Copy the base
		Link r = EcoreUtil.copy(a);
		r.setOrigin(a);

		// Iterate all possible merge targets
		for (Link b : transitiveBindings(a.megamodel())) {
			// If not the source and equal, do the merge
			if (a != b && isLinkMergable(a, b)) {
				// Merge the annotations
				r.getAnnotations().addAll(EcoreUtil.copyAll(b.getAnnotations()));
			}
		}
		return r;
	}
}
