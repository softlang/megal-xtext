package org.softlang.megal

class Graph {
	def static <T> extend(T start, (T)=>Iterable<T> more) {
		val r = newHashSet
		val n = newLinkedList(start)

		while (!n.empty) {
			val q = n.pop

			if (r += q)
				n += more.apply(q)
		}

		return r
	}
}
