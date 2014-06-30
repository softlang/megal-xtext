package org.softlang.megal.pp.jar

import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.lang.reflect.GenericArrayType
import java.lang.reflect.ParameterizedType
import java.lang.reflect.TypeVariable
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.softlang.megal.pp.Classifier
import org.softlang.megal.pp.Node
import org.softlang.megal.pp.PPFactory
import org.softlang.megal.pp.Package
import org.softlang.megal.pp.RootPackage
import org.softlang.megal.pp.Type
import org.softlang.megal.pp.general.ThrowableDiagnostic
import org.xeustechnologies.jcl.JarClassLoader

class JarPPResource extends ResourceImpl {

	/**
	 * Local instance of the factory as an extension
	 */
	val extension PPFactory factory = PPFactory.eINSTANCE

	new() {
	}

	new(URI uri) {
		super(uri)
	}

	def private Type convert(java.lang.reflect.Type t) {
		return switch (t) {
			Class<?>:
				createType => [
					value = t.name
				]
			ParameterizedType:
				createType => [
					value = t.rawType.convert.value
					arguments += t.actualTypeArguments.map[convert]
				]
			TypeVariable<?>:
				createType => [
					value = '''<«t.name»>'''
					arguments += t.bounds.map[convert]
				]
			GenericArrayType:
				createType => [
					value = '''[]'''
					arguments += t.genericComponentType.convert
				]
		}
	}

	def Classifier getOrCreate(RootPackage root, Class<?> c) {

		// Store for container node
		var Node container

		// If in a nested class, get or create this one
		if (c.enclosingClass != null) {
			container = getOrCreate(root, c.enclosingClass)
		} else {

			// If not, navigate through the packages
			val path = c.name.split('\\.')

			// Start at root
			container = root

			// Go over all items in the package part of the class
			for (i : 0 ..< path.size - 1) {

				// Get the level name
				val l = path.get(i)

				// Get a potential candidate
				val pc = container.children.filter(Package).findFirst[name == l]

				// If this one exists, take it, else create it
				if (pc != null)
					container = pc
				else {
					val nc = createPackage => [name = l]
					container.children += nc
					container = nc
				}
			}
		}

		// Find a classifier candidate
		val pc = container.children.filter(Classifier).findFirst[name == c.simpleName]

		// If it exists, return it
		if (pc != null)
			return pc
		else {
			val nc = createClassifier => [
				// Commit name
				name = c.simpleName
				// Commit interface type
				interface = c.interface
				// Commit superclass
				extends = c.genericSuperclass.convert
				// Commit interfaces
				implements += c.genericInterfaces.map[convert]
				// Commit type parameters
				generics += Util.wrapTypeParemeters(c).map [ t |
					createGeneric => [
						name = t.name
						bounds += t.bounds.map[convert]
					]
				]
			]
			container.children += nc
			return nc
		}
	}

	override protected doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {

		// Load Jar
		val jc = new JarClassLoader
		jc.add(inputStream)

		// Get all binary names
		val names = jc.loadedResources.keySet.filter[n|n.toLowerCase.endsWith('.class')].map[
			replace('.class', '').replace('/', '.')]

		// Create the root package
		val rootPackage = createRootPackage => [
			name = uri.segmentsList.last
			source = uri
		]

		// Create the set of classes that could not be found
		val unfoundClasses = newHashSet
		for (n : names) {
			try {

				// Get or create the class
				getOrCreate(rootPackage, jc.loadClass(n, true))
			} catch (NoClassDefFoundError x) {

				// If not found and not already reported, add to warnings
				if (unfoundClasses += x.message)
					rootPackage.noClassDefs += x.message
			} catch (Throwable t) {
				getWarnings += new ThrowableDiagnostic(t)
			}
		}

		getContents += rootPackage
	}

	override protected doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
	}

}
