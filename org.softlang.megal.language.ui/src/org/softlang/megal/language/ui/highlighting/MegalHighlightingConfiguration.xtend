package org.softlang.megal.language.ui.highlighting

import org.eclipse.swt.SWT
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.softlang.megal.Annotation
import org.softlang.megal.Entity
import org.softlang.megal.EntityType
import org.softlang.megal.Relationship
import org.softlang.megal.RelationshipType
import org.softlang.megal.language.MegalEnvironment
import org.softlang.megal.language.ui.swt.SWTUtil

class MegalHighlightingConfiguration extends DefaultHighlightingConfiguration {
	// TODO: A lot of guarding here, as null pointers do occur frequently in unassigned models

	def static readStyle(String k, Iterable<? extends Annotation> xs) {

		// Find the style annotation if present
		switch x : xs.findFirst[key == k] {
			// Parse the value of it if it has a value
			case x != null && x.value != null:
				SWTUtil.parseStyle(x.value)
			// Else return default font style
			default:
				TextStyle.DEFAULT_FONT_STYLE
		}
	}

	def static readColor(String k, Iterable<? extends Annotation> xs) {

		// Find the color annotation if present
		switch x : xs.findFirst[key == k] {
			// Parse the value of it if it has a value
			case x != null && x.value != null:
				SWTUtil.parseColor(x.value)
			// Else return default font color
			default:
				null
		}
	}

	val static STYLE_ANNOTATION_KEY = 'Style'
	val static COLOR_ANNOTATION_KEY = 'Color'
	val static BACKGROUND_ANNOTATION_KEY = 'Background'

	/**
	 * Reads a text style from a list of annotations
	 * @param from The style to copy
	 * @param sKey The key of the style annotation
	 * @param cKey The key of the color annotation
	 * @param bKey The key of the background colorannotaiton
	 * @param xs The annotations
	 */
	def static readTextStyle(TextStyle from, String sKey, String cKey, String bKey, Iterable<? extends Annotation> xs) {
		from.copy => [
			style = readStyle(sKey, xs)
			backgroundColor = readColor(bKey, xs)
			color = readColor(cKey, xs)
		]
	}

	def static readTextStyle(TextStyle from, Iterable<? extends Annotation> xs) {
		readTextStyle(from, STYLE_ANNOTATION_KEY, COLOR_ANNOTATION_KEY, BACKGROUND_ANNOTATION_KEY, xs)
	}

	def static getID(EntityType it) {
		name
	}

	def static getID(RelationshipType it) {
		left.definition.name + '_' + name + '_' + right.definition.name
	}

	def static getDescription(EntityType it) {
		name
	}

	def static getDescription(RelationshipType it) {
		// TODO: This is not safe as left and right may have parameters and multiplicities, safe enough for now
		name + " between " + left.definition.name + " and " + right.definition.name
	}

	def getStyle(RelationshipType it) {
		readTextStyle(relationshipTextStyle, annotations)
	}

	def getStyle(EntityType it) {
		readTextStyle(entityTextStyle, annotations)
	}

	/**
	 * Set of all available styles
	 */
	static val available = newHashSet

	public static val ENTITY_ID = "entity";
	public static val RELATIONSHIP_ID = "relationship";
	public static val ENTITY_TYPE_ID = "entity_type";
	public static val RELATIONSHIP_TYPE_ID = "relationship_type";

	static def idFor(Entity it) {
		val pr = type.definition.ID
		if (available.contains(pr))
			return pr
		return ENTITY_ID
	}

	static def idFor(Relationship it) {
		val pr = type.ID
		if (available.contains(pr))
			return pr
		return RELATIONSHIP_ID
	}

	static def idFor(EntityType it) {
		val pr = ID
		if (available.contains(pr))
			return pr
		return ENTITY_TYPE_ID
	}

	static def idFor(RelationshipType it) {
		val pr = ID
		if (available.contains(pr))
			return pr
		return RELATIONSHIP_TYPE_ID
	}

	override configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)

		// Initialize fallback styles
		acceptor.acceptDefaultHighlighting(ENTITY_ID, "Entity", entityTextStyle)
		acceptor.acceptDefaultHighlighting(ENTITY_TYPE_ID, "Entity type", entityTypeTextStyle)
		acceptor.acceptDefaultHighlighting(RELATIONSHIP_ID, "Relationship", relationshipTextStyle)
		acceptor.acceptDefaultHighlighting(RELATIONSHIP_TYPE_ID, "Relationship type", relationshipTypeTextStyle)

		// Load the prelude, runtime relation highlighting is probably not doable as this configuration is on init
		val px = MegalEnvironment.loadPreludeMegamodel

		available.clear

		// Register all stylable entity types
		for (it : px.declarations.filter(EntityType))
			if (!available.contains(ID)) {
				available += ID
				acceptor.acceptDefaultHighlighting(ID, description, style)
			}

		// Register all stylable relationship types
		for (it : px.declarations.filter(RelationshipType))
			if (!available.contains(ID)) {
				available += ID
				acceptor.acceptDefaultHighlighting(ID, description, style)
			}
	}

	def entityTextStyle() {
		defaultTextStyle.copy => []
	}

	def relationshipTextStyle() {
		defaultTextStyle.copy => [
			style = SWT.ITALIC
		]
	}

	def entityTypeTextStyle() {
		defaultTextStyle.copy => []
	}

	def relationshipTypeTextStyle() {
		defaultTextStyle.copy => [
			style = SWT.ITALIC
		]
	}
}
