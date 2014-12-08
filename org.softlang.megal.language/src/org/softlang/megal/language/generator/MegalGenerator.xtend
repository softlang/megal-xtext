/*
 * generated by Xtext
 */
package org.softlang.megal.language.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.softlang.megal.Megamodel
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.common.util.URI
import java.io.ByteArrayOutputStream
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.softlang.megal.language.MegalRuntimeModule
import org.eclipse.xtext.resource.XtextResourceFactory
import com.google.inject.Inject
import org.softlang.megal.processing.FunAppDesugaring
import org.softlang.megal.processing.LanguageResolving

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MegalGenerator implements IGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {

		val funAppDesugaring = new FunAppDesugaring
		val languageResolving = new LanguageResolving

		for (m : resource.contents.filter(Megamodel)) {
			funAppDesugaring.apply(m)
			languageResolving.apply(m)
		}
		EcoreUtil.resolveAll(resource)

		val baos = new ByteArrayOutputStream
		resource.save(baos, emptyMap)
		val result = new String(baos.toByteArray)
		fsa.generateFile('''«resource.URI.trimFileExtension.lastSegment».processed''', result)

	//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
	//			resource.allContents
	//				.filter(typeof(Greeting))
	//				.map[name]
	//				.join(', '))
	}
}
