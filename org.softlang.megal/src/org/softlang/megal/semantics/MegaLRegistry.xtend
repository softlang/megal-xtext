package org.softlang.megal.semantics

import com.google.common.base.Optional
import java.util.Collections
import org.eclipse.core.runtime.IExtension
import org.eclipse.core.runtime.IExtensionPoint
import org.eclipse.core.runtime.IRegistryEventListener
import org.eclipse.core.runtime.RegistryFactory
import org.softlang.megal.megaL.ED
import org.softlang.megal.megaL.LD
import org.softlang.megal.megaL.RD

interface Diagnostic {
	def void info(String string)

	def void warning(String string)

	def void error(String string)
}

interface EntitySemantics {
	def void validate(Diagnostic diagnostic, ED entity, Optional<LD> linking)
}

interface RelationSemantics {
	def void validate(Diagnostic diagnostic, RD relation, Optional<LD> sourceLinking, Optional<LD> targetLinking)
}

class MegaLRegistry {
	private static class Listener implements IRegistryEventListener {
		val MegaLRegistry registry

		new(MegaLRegistry registry) {
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

	val static NAME = 'name'
	val static SEMANTICS = 'semantics'
	val static ENTITYTYPE = 'org.softlang.entitytype'
	val static RELATIONTYPE = 'org.softlang.relationtype'

	var static MegaLRegistry instance

	def static MegaLRegistry getInstance() {
		if (instance == null) {
			instance = new MegaLRegistry
		}
		return instance
	}

	val relationtypes = <String, Optional<RelationSemantics>>newHashMap

	def getRelationtypes() {
		Collections.unmodifiableMap(relationtypes)
	}

	def getSoftRelationtypes() {
		getRelationtypes().filter[k, v|!v.present].mapValues[get]
	}

	def getHardRelationtypes() {
		getRelationtypes().filter[k, v|v.present].mapValues[get]
	}

	val entitytypes = <String, Optional<EntitySemantics>>newHashMap

	def getEntitytypes() {
		Collections.unmodifiableMap(entitytypes)
	}

	def getSoftEntitytypes() {
		getEntitytypes().filter[k, v|!v.present].mapValues[get]
	}

	def getHardEntitytypes() {
		getEntitytypes().filter[k, v|v.present].mapValues[get]
	}

	private new() {
		RegistryFactory.registry.getExtensionPoint(RELATIONTYPE).extensions.forEach[addExtension]
		RegistryFactory.registry.getExtensionPoint(ENTITYTYPE).extensions.forEach[addExtension]

		val listener = new MegaLRegistry.Listener(this)

		RegistryFactory.registry.addListener(listener, RELATIONTYPE)
		RegistryFactory.registry.addListener(listener, ENTITYTYPE)
	}

	var revision = 0L

	def getRevision() {
		revision
	}

	private def addExtension(IExtension e) {
		if (e.extensionPointUniqueIdentifier == RELATIONTYPE)
			addRelationtype(e)

		if (e.extensionPointUniqueIdentifier == ENTITYTYPE)
			addEntitytype(e)
	}

	private def addRelationtype(IExtension e) {
		for (c : e.configurationElements)
			if (c.getAttribute(SEMANTICS) == null)
				relationtypes.put(c.getAttribute(NAME), Optional.absent)
			else
				relationtypes.put(c.getAttribute(NAME),
					Optional.of(c.createExecutableExtension(SEMANTICS) as RelationSemantics))

		revision = revision + 1
	}

	private def addEntitytype(IExtension e) {
		for (c : e.configurationElements)
			if (c.getAttribute(SEMANTICS) == null)
				entitytypes.put(c.getAttribute(NAME), Optional.absent)
			else
				entitytypes.put(c.getAttribute(NAME),
					Optional.of(c.createExecutableExtension(SEMANTICS) as EntitySemantics))

		revision = revision + 1
	}

	private def removeExtension(IExtension e) {
		if (e.extensionPointUniqueIdentifier == RELATIONTYPE)
			removeRelationtype(e)

		if (e.extensionPointUniqueIdentifier == ENTITYTYPE)
			removeEntitytype(e)
	}

	private def removeRelationtype(IExtension e) {
		for (c : e.configurationElements)
			relationtypes.remove(c.getAttribute(NAME))

		revision = revision + 1
	}

	private def removeEntitytype(IExtension e) {
		for (c : e.configurationElements)
			entitytypes.remove(c.getAttribute(NAME))

		revision = revision + 1
	}
}
