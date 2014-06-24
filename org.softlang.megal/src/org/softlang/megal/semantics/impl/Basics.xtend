package org.softlang.megal.semantics.impl

import org.softlang.megal.semantics.EntitySemantics
import org.softlang.megal.megaL.ED
import org.softlang.megal.megaL.LD
import org.softlang.megal.semantics.Diagnostic
import com.google.common.base.Optional

class EntitySemanticsImpl implements EntitySemantics {

	override validate(Diagnostic diagnostic, ED entity, Optional<LD> linking) {
		if (!linking.present)
			diagnostic.error("Unlinked entity")
	}

}

class SetSemanticsImpl implements EntitySemantics {

	override validate(Diagnostic diagnostic, ED entity, Optional<LD> linking) {
		if (!linking.present)
			diagnostic.error("Unlinked set")
	}

}

class ArtifactsSemanticsImpl implements EntitySemantics {

	override validate(Diagnostic diagnostic, ED entity, Optional<LD> linking) {
		if (!linking.present)
			diagnostic.error("Unlinked artifact")
	}
}
