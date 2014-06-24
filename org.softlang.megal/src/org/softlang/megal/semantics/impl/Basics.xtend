package org.softlang.megal.semantics.impl

import com.google.common.base.Optional
import java.io.File
import org.softlang.megal.megaL.ED
import org.softlang.megal.megaL.LD
import org.softlang.megal.semantics.Diagnostic
import org.softlang.megal.semantics.EntitySemantics

class EntitySemanticsImpl implements EntitySemantics {
	override validate(Diagnostic diagnostic, ED entity, Optional<LD> linking) {
		// TBD
	}
}

class SetSemanticsImpl implements EntitySemantics {
	override validate(Diagnostic diagnostic, ED entity, Optional<LD> linking) {
		// TBD
	}
}

class ArtifactsSemanticsImpl implements EntitySemantics {
	override validate(Diagnostic diagnostic, ED entity, Optional<LD> linking) {
		if (linking.present)
			if (!new File(linking.get.value).exists)
				diagnostic.error("File does not exist")
	}
}
