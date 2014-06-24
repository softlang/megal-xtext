package org.softlang.megal.semantics

interface Diagnostic {
	def void info(String string)

	def void warning(String string)

	def void error(String string)
}
