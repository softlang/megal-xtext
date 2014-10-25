package org.softlang.megal.language.ui.javalinks

import org.eclipse.jdt.core.search.SearchRequestor
import org.eclipse.jdt.core.search.SearchMatch
import org.eclipse.core.runtime.CoreException
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

class CollectingSearchRequestor extends SearchRequestor {
	val result = <SearchMatch>newArrayList

	val latch = new CountDownLatch(1)

	override acceptSearchMatch(SearchMatch match) throws CoreException {
		result += match
	}

	override endReporting() {
		super.endReporting()

		latch.countDown
	}

	def awaitResults(long timeout, TimeUnit unit) {
		latch.await(timeout, unit)
		return result.unmodifiableView
	}
}
