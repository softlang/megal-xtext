package org.softlang.megal.language.values

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.softlang.megal.api.URI

class MegalValueConverterService extends Ecore2XtextTerminalConverters {

	@ValueConverter(rule="URI")
	def IValueConverter<URI> URI() {
		URIConverter.INSTANCE
	}
}
