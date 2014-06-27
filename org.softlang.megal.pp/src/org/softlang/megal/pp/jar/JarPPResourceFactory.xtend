package org.softlang.megal.pp.jar

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl
import org.eclipse.emf.common.util.URI

class JarPPResourceFactory extends ResourceFactoryImpl {
	override createResource(URI uri) {
		return new JarPPResource(uri)
	}
}
