package org.softlang.megal.language.ui.hover

import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider

abstract class ExtenderEObjectHoverProvider extends DefaultEObjectHoverProvider {

	var ExtenderPresentationControlCreator controlCreator = null

	override getInformationPresenterControlCreator() {
		if (controlCreator == null) {
			controlCreator = new ExtenderPresentationControlCreator(this)

			addActions(controlCreator)
		}

		return controlCreator
	}

	protected def addActions(ExtenderPresentationControlCreator p) {
	}

	override public getLabelProvider() {
		super.getLabelProvider()
	}

	override public getStyleSheet() {
		super.getStyleSheet()
	}
	
	override public getElementLinks() {
		super.getElementLinks()
	}
	
}
