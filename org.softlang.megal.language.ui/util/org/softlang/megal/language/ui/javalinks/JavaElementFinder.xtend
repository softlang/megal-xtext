package org.softlang.megal.language.ui.javalinks

import java.util.concurrent.TimeUnit
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.jdt.core.IJavaElement
import org.eclipse.jdt.core.search.IJavaSearchConstants
import org.eclipse.jdt.core.search.IJavaSearchScope
import org.eclipse.jdt.core.search.SearchEngine
import org.eclipse.jdt.core.search.SearchPattern
import org.eclipse.jdt.core.search.TypeDeclarationMatch

class JavaElementFinder {
	public static val DEFAULT_TIMEOUT = 1
	public static val DEFAULT_TIMEOUT_UNIT = TimeUnit.SECONDS

	IJavaSearchScope scope = SearchEngine.createWorkspaceScope
	SearchEngine engine = new SearchEngine

	def findDeclaration(String name) {
		findDeclarations(name).head
	}

	def findDeclarations(String name) {
		find(name, IJavaSearchConstants.TYPE, IJavaSearchConstants.DECLARATIONS, SearchPattern.R_EXACT_MATCH,
			DEFAULT_TIMEOUT, DEFAULT_TIMEOUT_UNIT).filter(TypeDeclarationMatch).map[element as IJavaElement]
	}

	def find(String name, int searchFor, int limitTo, int matchRule, long timeout, TimeUnit unit) {
		var pattern = SearchPattern.createPattern(name, searchFor, limitTo, matchRule)
		var participants = #[SearchEngine.getDefaultSearchParticipant()]
		var collector = new CollectingSearchRequestor
		val monitor = new NullProgressMonitor

		engine.search(pattern, participants, scope, collector, monitor)

		collector.awaitResults(timeout, unit)
	}
}
