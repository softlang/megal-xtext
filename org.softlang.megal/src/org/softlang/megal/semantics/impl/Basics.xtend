package org.softlang.megal.semantics.impl

import org.softlang.megal.semantics.EntitySemantics
import org.softlang.megal.megaL.ED
import org.softlang.megal.megaL.LD
import org.softlang.megal.semantics.Diagnostic
import com.google.common.base.Optional
import java.io.File
import java.net.URL
import java.io.IOException
import java.net.HttpURLConnection
import java.net.UnknownHostException

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
		if (!linking.present) {
			diagnostic.error("Unlinked artifact")
			return
		}
		if (!new File(linking.get.value).exists)
			diagnostic.error("File does not exist")
	}
}
