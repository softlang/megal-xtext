package org.softlang.megal.util;

import java.util.Collections;
import java.util.Deque;
import java.util.Set;
import java.util.function.Function;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class Graph {
	/**
	 * <p>
	 * Expands a start symbol by an expansion function that returns the
	 * connected elements.
	 * </p>
	 * 
	 * @param start
	 *            The start symbol
	 * @param more
	 *            The edge function
	 * @return Returns a set of all seen symbols
	 */
	public static <T> Set<T> extendBy(T start, Function<T, ? extends Iterable<? extends T>> more) {
		Set<T> result = Sets.newLinkedHashSet();
		Deque<T> next = Lists.newLinkedList(Collections.singleton(start));

		while (!next.isEmpty()) {
			T candidate = next.poll();

			if (result.add(candidate))
				for (T expansion : more.apply(candidate))
					next.offer(expansion);
		}

		return result;
	}
}
