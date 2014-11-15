package org.softlang.megal.language.values

import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter
import org.eclipse.xtext.nodemodel.INode
import org.softlang.megal.api.URI

class URIConverter extends AbstractNullSafeConverter<URI> {

	/**
	 * The value converter instance
	 */
	static public val INSTANCE = new URIConverter

	override protected internalToValue(String string, INode node) throws ValueConverterException {
		try {
			URI.valueOf(string)
		} catch (IllegalArgumentException e) {
			throw new ValueConverterException("Error converting string to URI", node, e)
		}
	}

	override protected internalToString(URI value) {
		value.toString
	}

}
