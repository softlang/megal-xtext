package org.softlang.megal.language.ui.highlighting

import org.eclipse.swt.SWT
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.softlang.megal.MegalAnnotation
import org.softlang.megal.MegalEntity
import org.softlang.megal.MegalEntityType
import org.softlang.megal.MegalRelationshipType
import org.softlang.megal.language.ui.swt.SWTUtil

import static org.softlang.megal.util.Guard.*
import org.eclipse.swt.graphics.RGB
import org.softlang.megal.MegalRelationship
import org.softlang.megal.MegalLink

class MegalHighlightingConfiguration extends DefaultHighlightingConfiguration {

	// TODO: A lot of guarding here, as null pointers do occur frequently in unassigned models
	def static readStyle(String k, Iterable<? extends MegalAnnotation> xs) {

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

	def static readColor(String k, Iterable<? extends MegalAnnotation> xs) {

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
	def static readTextStyle(TextStyle from, String sKey, String cKey, String bKey,
		Iterable<? extends MegalAnnotation> xs) {
		from.copy => [
			style = readStyle(sKey, xs)
			backgroundColor = readColor(bKey, xs)
			color = readColor(cKey, xs)
		]
	}

	def static readTextStyle(TextStyle from, Iterable<? extends MegalAnnotation> xs) {
		readTextStyle(from, STYLE_ANNOTATION_KEY, COLOR_ANNOTATION_KEY, BACKGROUND_ANNOTATION_KEY, xs)
	}

	def static getID(MegalEntityType o) {
		guarded(null) [
			// Guards
			ifAssigned(o)
			// Value
			o.name
		]
	}

	def static getID(MegalRelationshipType o) {
		guarded(null) [
			// Guards	
			ifAssigned(o)
			ifAssigned(o.left)
			ifAssigned(o.right)
			// Value
			o.left.name + '_' + o.name + '_' + o.right.name
		]
	}

	def static getDescription(MegalEntityType o) {
		guarded(null) [
			// Guards
			ifAssigned(o)
			// Value
			o.name
		]
	}

	def static getDescription(MegalRelationshipType o) {
		guarded('''Invalid object''') [
			// Guards	
			ifAssigned(o)
			ifAssigned(o.left)
			ifAssigned(o.right)
			// Value
			o.name + " between " + o.left.name + " and " + o.right.name
		]

	}

	def getStyle(MegalRelationshipType o) {
		guarded(relationshipTextStyle) [
			// Guards	
			ifAssigned(o)
			ifAssigned(o.annotations)
			// Value
			readTextStyle(relationshipTextStyle, o.annotations)
		]
	}

	def getStyle(MegalEntityType o) {
		guarded(entityTextStyle) [
			// Guards	
			ifAssigned(o)
			ifAssigned(o.annotations)
			// Value
			readTextStyle(entityTextStyle, o.annotations)
		]
	}

	/**
	 * Set of all available styles
	 */
	static val available = newHashSet

	public static val ENTITY_ID = "entity";
	public static val RELATIONSHIP_ID = "relationship";
	public static val ENTITY_TYPE_ID = "entity_type";
	public static val RELATIONSHIP_TYPE_ID = "relationship_type";
	public static val URI_ID = "uri";

	static def idFor(MegalEntity o) {
		guarded(ENTITY_ID) [
			// Guards
			ifAssigned(o)
			ifAssigned(o.type)
			// Value and out-guard
			return ifContained(o.type.ID, available)
		]
	}

	static def idFor(MegalLink o) {
		guarded(ENTITY_ID) [
			// Guards
			ifAssigned(o)
			ifAssigned(o.link)
			ifAssigned(o.link.type)
			// Value and out-guard
			return ifContained(o.link.type.ID, available)
		]
	}

	static def idFor(MegalRelationship o) {
		guarded(RELATIONSHIP_ID) [
			// Guards
			ifAssigned(o)
			ifAssigned(o.type)
			// Value and out-guard
			return ifContained(o.type.ID, available)
		]
	}

	static def idFor(MegalEntityType o) {
		guarded(ENTITY_TYPE_ID) [
			// Guards
			ifAssigned(o)
			// Value and out-guard
			return ifContained(o.ID, available)
		]
	}

	static def idFor(MegalRelationshipType o) {
		guarded(RELATIONSHIP_TYPE_ID) [
			// Guards
			ifAssigned(o)
			// Value and out-guard
			return ifContained(o.ID, available)
		]
	}

	override configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)

		// Initialize URI 
		acceptor.acceptDefaultHighlighting(URI_ID, "URI", uriTextStyle());

		// Initialize fallback styles
		acceptor.acceptDefaultHighlighting(ENTITY_ID, "Entity", entityTextStyle)
		acceptor.acceptDefaultHighlighting(ENTITY_TYPE_ID, "Entity type", entityTypeTextStyle)
		acceptor.acceptDefaultHighlighting(RELATIONSHIP_ID, "Relationship", relationshipTextStyle)
		acceptor.acceptDefaultHighlighting(RELATIONSHIP_TYPE_ID, "Relationship type", relationshipTypeTextStyle)

		// Load the prelude, runtime relation highlighting is probably not doable as this configuration is on init
//		val px = MegalEnvironment.loadPreludeMegamodel
		available.clear

	// Register all stylable entity types
//		for (it : px.declarations.filter(EntityType))
//			if (!available.contains(ID)) {
//				available += ID
//				acceptor.acceptDefaultHighlighting(ID, description, style)
//			}
//
//		// Register all stylable relationship types
//		for (it : px.declarations.filter(RelationshipType))
//			if (!available.contains(ID)) {
//				available += ID
//				acceptor.acceptDefaultHighlighting(ID, description, style)
//			}
	}

	def uriTextStyle() {
		defaultTextStyle.copy => [
			style = SWT.ITALIC
			color = new RGB(255, 60, 30)
		]
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
