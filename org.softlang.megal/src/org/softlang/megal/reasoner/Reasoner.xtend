package org.softlang.megal.reasoner

import org.softlang.megal.Entity
import org.softlang.megal.Megamodel

import static extension org.softlang.megal.Graph.*
import org.softlang.megal.Declaration
import org.softlang.megal.Link
import org.softlang.megal.Relationship

class Reasoner {
	def static getVisibleDeclarations(Declaration d) {
		val mm = d.eContainer as Megamodel
		mm.extend[imports].map[declarations].flatten
	}

	def static getVisibleBindings(Declaration d) {
		val mm = d.eContainer as Megamodel
		mm.extend[imports].map[bindings].flatten
	}

	def static getLink(Entity entity) {
		entity.visibleBindings.filter(Link).findFirst[link == entity]
	}

	def static isDispatcher(Entity it) {
		type.definition.name == "Dispatcher"
	}

	def static isMasterDispatcher(Entity it) {
		isDispatcher && link != null
	}

	def static follow(Entity entity, String relation) {
		entity.visibleDeclarations.filter(Relationship).filter[left == entity && type.name == relation].map[right]
	}

	def static buildDisp(Entity entity) {
		entity.extend[if(masterDispatcher) #[] else follow('instanceOf')]
	}

	def static costaassa(Entity entity) {
		val chain = entity.buildDisp

		val deps = chain.map[follow('dependsOn')].flatten
		val pars = deps.filter[type.definition.name == 'Param']
		val inst = deps.filter[type.definition.name == 'Instance']

		val mapped = pars.map[p|p -> inst.findFirst[follow('instanceOf').exists[i|i == p]]].filter[value != null].toMap[
			key].mapValues[value]

		mapped
	}

}
