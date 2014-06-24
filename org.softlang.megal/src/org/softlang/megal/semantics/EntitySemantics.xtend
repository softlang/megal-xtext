package org.softlang.megal.semantics

import org.softlang.megal.megaL.ED
import com.google.common.base.Optional
import org.softlang.megal.megaL.LD

interface EntitySemantics {
	def void validate(Diagnostic diagnostic, ED entity, Optional<LD> linking)
}
