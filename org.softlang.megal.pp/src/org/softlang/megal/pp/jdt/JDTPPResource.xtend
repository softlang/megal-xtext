package org.softlang.megal.pp.jdt

import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.util.Map
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.jdt.core.IJavaElement
import org.eclipse.jdt.core.IPackageFragmentRoot
import org.eclipse.jdt.core.IParent
import org.eclipse.jdt.core.IType
import org.eclipse.jdt.core.JavaCore
import org.softlang.megal.pp.Classifier
import org.softlang.megal.pp.Node
import org.softlang.megal.pp.PPFactory
import org.softlang.megal.pp.Package
import org.softlang.megal.pp.RootPackage
import org.softlang.megal.pp.general.ThrowableDiagnostic

class JDTPPResource extends ResourceImpl {

	/**
	 * Local instance of the factory as an extension
	 */
	val extension PPFactory factory = PPFactory.eINSTANCE

	new() {
	}

	new(URI uri) {
		super(uri)
	}

	def static private toBinaryName(IType c, String n) {
		return c.resolveType(n).map[r|'''«r.get(0)».«r.get(1).replace('\\.', '$')»'''].head
	}

	//
	//	def private resolveExtends(IType c) {
	//		return createType => [
	//			value = c.resolveTypename(c.superclassName)
	//		]
	//	}
	//
	//	def private resolveImplements(IType c) {
	//		c.superInterfaceNames.map [ i |
	//			createType => [
	//				value = c.resolveTypename(i)
	//			]
	//		]
	//	}
	def Classifier getOrCreate(RootPackage root, IType c) {

		// Store for container node
		var Node container

		// If in a nested class, get or create this one
		if (c.declaringType != null) {
			container = getOrCreate(root, c.declaringType)
		} else {

			// If not, navigate through the packages
			val path = c.packageFragment.elementName.split('\\.')

			// Start at root
			container = root

			// Go over all items in the package part of the class
			for (i : 0 ..< path.size) {

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
		val pc = container.children.filter(Classifier).findFirst[name == c.elementName]

		// If it exists, return it
		if (pc != null)
			return pc
		else {

			val nc = createClassifier => [
				// Commit name
				name = c.elementName
				// Commit interface type
				interface = c.interface
				// Commit superclass
				if (c.superclassName != null) {
					extends = createType => [
						value = c.toBinaryName(c.superclassName)
					]
				}
				// Commit interfaces
				implements += c.superInterfaceNames.map [ s |
					createType => [
						value = c.toBinaryName(s)
					]
				]
			//				
			//				implements += c.resolveImplements
			// Commit type parameters
			//					generics += Util.wrapTypeParemeters(c).map [ t |
			//						createGeneric => [
			//							name = t.name
			//							bounds += t.bounds.map[convert]
			//						]
			//					]
			]
			container.children += nc
			return nc
		}
	}

	def Iterable<IJavaElement> allChildren(IParent e) {
		return e.children + e.children.filter(IParent).map[allChildren].flatten
	}

	override protected doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		val project = ResourcesPlugin.workspace.root.getProject(uri.segment(1))
		val jdt = JavaCore.create(project)
		
		val rootPackage = createRootPackage => [
			name = jdt.elementName
			source = uri
		]

		for (pr : jdt.allPackageFragmentRoots.filter[kind == IPackageFragmentRoot.K_SOURCE]) {
			for (c : pr.allChildren.filter(IType)) {
				try {
					getOrCreate(rootPackage, c)
				} catch (Throwable t) {
					getWarnings += new ThrowableDiagnostic(t)
				}
			}
		}

		getContents += rootPackage
	}

	override protected doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
	}

}
