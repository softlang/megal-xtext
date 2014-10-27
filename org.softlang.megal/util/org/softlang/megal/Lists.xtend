package org.softlang.megal

import java.util.List

class Lists {

	/**
	 * If <code>r</code> for an element <code>e</code> of <code>k</code>
	 * returns a non <code>null</code> result, <code>e</code> is replaced by all values in the result
	 */
	def static <T> unwind(List<T> k, (T)=>Iterable<? extends T> r) {
		val i = k.listIterator
		while (i.hasNext) {
			val e = i.next
			val q = r.apply(e)
			if (q != null) {
				i.remove
				for (n : q)
					i.add(n)
			}
		}
	}

}
