package org.softlang.megal.semantics

import org.softlang.megal.megaL.RD
import com.google.common.base.Optional
import org.softlang.megal.megaL.LD

interface RelationSemantics {
	def void validate(Diagnostic diagnostic, RD relation, Optional<LD> sourceLinking, Optional<LD> targetLinking)
}
