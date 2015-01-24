package org.softlang.megal;

import static com.google.common.base.Objects.*;

public class Declarations {
	/**
	 * Returns true if the item's representation is equal to <code>p</code>
	 * 
	 * @param d
	 * @param p
	 * @return
	 */
	public static boolean match(Declaration d, String p) {
		if (d == null || p == null)
			return false;

		if (equal(d.toString(), p))
			return true;

		return false;
	}
}
