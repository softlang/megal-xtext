package org.softlang.megal.language.scoping;

import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import org.softlang.megal.language.MegalEnvironment;

public class MegalImportUriScopeProvider extends ImportUriGlobalScopeProvider {
	@Override
	protected LinkedHashSet<URI> getImportedUris(Resource resource) {
		LinkedHashSet<URI> r = super.getImportedUris(resource);
		r.add(URI.createURI(MegalEnvironment.PRELUDE_LOCATION));
		return r;
	}
}
