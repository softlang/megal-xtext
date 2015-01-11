package org.softlang.megal;

import java.util.Iterator;

public final class Elements {
	public static boolean equalBase(Element a, Element b) {
		return a == null ? b == null : b != null && a.equalBase(b);
	}

	public static boolean equalBaseVia(EntityTypeReference a,
			EntityTypeReference b) {
		return a == null ? b == null : b != null && a.equalBaseVia(b);
	}

	public static boolean equalBase(Iterable<? extends Element> as,
			Iterable<? extends Element> bs) {
		if (as == null) {
			return bs == null;
		}

		if (bs == null)
			return false;

		Iterator<? extends Element> asi = as.iterator(), bsi = bs.iterator();

		while (asi.hasNext() && bsi.hasNext()) {
			if (!equalBase(asi.next(), bsi.next()))
				return false;
		}

		return !asi.hasNext() && !bsi.hasNext();
	}

	public static boolean equalBaseVia(
			Iterable<? extends EntityTypeReference> as,
			Iterable<? extends EntityTypeReference> bs) {
		if (as == null) {
			return bs == null;
		}

		if (bs == null)
			return false;

		Iterator<? extends EntityTypeReference> asi = as.iterator(), bsi = bs
				.iterator();

		while (asi.hasNext() && bsi.hasNext()) {
			if (!equalBaseVia(asi.next(), bsi.next()))
				return false;
		}

		return !asi.hasNext() && !bsi.hasNext();
	}
}
