package org.softlang.megal.pp.jdt

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl
import org.eclipse.emf.common.util.URI

class JDTPPResourceFactory extends ResourceFactoryImpl {
		override createResource(URI uri) {
		return new JDTPPResource(uri)
	}
}