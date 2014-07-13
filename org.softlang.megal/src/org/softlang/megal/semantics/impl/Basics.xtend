package org.softlang.megal.semantics.impl

import com.google.common.base.Optional
import java.io.File
import org.softlang.megal.megaL.ED
import org.softlang.megal.megaL.LD
import org.softlang.megal.semantics.Diagnostic
import org.softlang.megal.semantics.EntitySemantics
import java.net.HttpURLConnection
import java.net.URL

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
		if (linking.present){
		 val url = new URL(linking.get.value)
		 val huc = url.openConnection() as HttpURLConnection;
		 val responseCode = huc.getResponseCode();

		 if (responseCode == 404) {
			diagnostic.error("Linked resource does not exist")
		 }
		}
	}
}
