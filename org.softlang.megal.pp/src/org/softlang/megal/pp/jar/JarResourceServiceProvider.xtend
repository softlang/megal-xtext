package org.softlang.megal.pp.jar

import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.emf.common.util.URI

class JarResourceServiceProvider implements IResourceServiceProvider {

	override canHandle(URI uri) {
		return uri.fileExtension.toLowerCase == "jar"
	}

	override <T> get(Class<T> t) {
		return t.newInstance
	}

	override getContainerManager() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getEncodingProvider() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getResourceDescriptionManager() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getResourceValidator() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}
