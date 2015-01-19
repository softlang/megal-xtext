package org.softlang.megal;

import static com.google.common.base.Objects.*;

public class Nameds {
	/**
	 * Returns true if the item's name is equal to <code>p</code> or the item's
	 * representation is equal to <code>p</code>
	 * 
	 * @param n
	 * @param p
	 * @return
	 */
	public static boolean match(Named n, String p) {
		if (n == null || p == null)
			return false;

		if (equal(n.getName(), p))
			return true;
		if (equal(n.toString(), p))
			return true;

		return false;
	}
}
