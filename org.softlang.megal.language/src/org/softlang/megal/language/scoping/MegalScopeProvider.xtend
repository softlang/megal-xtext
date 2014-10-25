package org.softlang.megal.language.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

/**
 * This scope provider uses declarative mechanisms to determine local scopes for MegaL objects
 */
class MegalScopeProvider extends AbstractDeclarativeScopeProvider {
}

/**
 * This scope provider is bound as a fallback  for the above provider
 */
class MegalScopeProviderImportAspect extends ImportedNamespaceAwareLocalScopeProvider {

	/**
	 * The prelude namespace is automatically imported
	 */
	override protected getImplicitImports(boolean ignoreCase) {
		#[createImportedNamespaceResolver('Prelude.*', ignoreCase)]
	}
	
	/** 
	 * Do not use relative imports, as default suggests
	 */
	override protected isRelativeImport() {
		false
	}
	
}
