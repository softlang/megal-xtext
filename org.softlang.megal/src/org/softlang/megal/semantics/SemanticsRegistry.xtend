package org.softlang.megal.semantics

import java.util.Map
import java.util.Set
import org.eclipse.core.runtime.IExtension
import org.eclipse.core.runtime.IExtensionPoint
import org.eclipse.core.runtime.IRegistryEventListener
import org.eclipse.core.runtime.RegistryFactory
import java.util.List

class SemanticsRegistry {

	val static NAME = 'name'
	val static SOURCE = 'source'
	val static TARGET = 'target'
	val static SEMANTICS = 'semantics'
	val static ENTITYTYPE = 'org.softlang.entitytype'
	val static RELATIONTYPE = 'org.softlang.relationtype'

	var static public SemanticsRegistry INSTANCE = new SemanticsRegistry

	val Set<String> softEntitySemantics
	val Set<List<String>> softRelationSemantics
	val Map<String, EntitySemantics> hardEntitySemantics
	val Map<List<String>, RelationSemantics> hardRelationSemantics

	private new() {

		// Make the stores
		softEntitySemantics = newHashSet
		softRelationSemantics = newHashSet
		hardEntitySemantics = newHashMap
		hardRelationSemantics = newHashMap

		// Add all extensions from that point of time
		RegistryFactory.registry.getExtensionPoint(RELATIONTYPE).extensions.forEach[addExtension]
		RegistryFactory.registry.getExtensionPoint(ENTITYTYPE).extensions.forEach[addExtension]

		// Listen to changing extensions
		val listener = new SemanticsRegistry.Listener(this)

		RegistryFactory.registry.addListener(listener, RELATIONTYPE)
		RegistryFactory.registry.addListener(listener, ENTITYTYPE)
	}

	def getContextInstance() {
		return new Context(
			softEntitySemantics,
			softRelationSemantics,
			hardEntitySemantics,
			hardRelationSemantics
		)
	}

	/**
	 * Management class that listens for runtime change of the extension registry
	 */
	private static class Listener implements IRegistryEventListener {
		val SemanticsRegistry registry

		new(SemanticsRegistry registry) {
			this.registry = registry
		}

		override added(IExtension[] extensions) {
			extensions.forEach[e|registry.addExtension(e)]
		}

		override added(IExtensionPoint[] extensionPoints) {
		}

		override removed(IExtension[] extensions) {
			extensions.forEach[e|registry.removeExtension(e)]
		}

		override removed(IExtensionPoint[] extensionPoints) {
		}
	}

	/**
	 * Add an extension to the registry
	 */
	private def addExtension(IExtension e) {
		if (e.extensionPointUniqueIdentifier == RELATIONTYPE)
			addRelationtype(e)

		if (e.extensionPointUniqueIdentifier == ENTITYTYPE)
			addEntitytype(e)
	}

	private def addRelationtype(IExtension e) {
		for (c : e.configurationElements) {
			val s = c.getAttribute(SOURCE)
			val n = c.getAttribute(NAME)
			val t = c.getAttribute(TARGET)

			if (c.getAttribute(SEMANTICS) == null)
				softRelationSemantics.add(#[s, n, t])
			else
				hardRelationSemantics.put(#[s, n, t], c.createExecutableExtension(SEMANTICS) as RelationSemantics)
		}
	}

	private def addEntitytype(IExtension e) {
		for (c : e.configurationElements)
			if (c.getAttribute(SEMANTICS) == null)
				softEntitySemantics += c.getAttribute(NAME)
			else
				hardEntitySemantics.put(c.getAttribute(NAME),
					c.createExecutableExtension(SEMANTICS) as EntitySemantics)
	}

	/**
	 * Remove an extension from the registry
	 */
	private def removeExtension(IExtension e) {
		if (e.extensionPointUniqueIdentifier == RELATIONTYPE)
			removeRelationtype(e)

		if (e.extensionPointUniqueIdentifier == ENTITYTYPE)
			removeEntitytype(e)
	}

	private def removeRelationtype(IExtension e) {
		for (c : e.configurationElements) {
			val s = c.getAttribute(SOURCE)
			val n = c.getAttribute(NAME)
			val t = c.getAttribute(TARGET)
			if (c.getAttribute(SEMANTICS) == null)
				softRelationSemantics.remove(#[s, n, t])
			else
				hardRelationSemantics.remove(#[s, n, t])
		}
	}

	private def removeEntitytype(IExtension e) {
		for (c : e.configurationElements)
			if (c.getAttribute(SEMANTICS) == null)
				softEntitySemantics -= c.getAttribute(NAME)
			else
				hardEntitySemantics.remove(c.getAttribute(NAME))
	}
}
