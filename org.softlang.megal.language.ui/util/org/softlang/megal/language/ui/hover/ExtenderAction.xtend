package org.softlang.megal.language.ui.hover

import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.action.Action
import org.eclipse.jface.internal.text.html.HTMLPrinter
import org.eclipse.ui.PlatformUI
import org.eclipse.xtext.ui.editor.hover.html.IXtextBrowserInformationControl
import org.eclipse.xtext.ui.editor.hover.html.XtextBrowserInformationControlInput

/**
 * An abstract action for the XText browser information control
 */
abstract class ExtenderAction extends Action {
	var ExtenderEObjectHoverProvider extender

	def getExtender() {
		extender
	}

	/**
	 * Control holding the action
	 */
	val IXtextBrowserInformationControl infoControl

	def getInfoControl() {
		infoControl
	}

	/**
	 * <p>Constructs the action</p>
	 * @param infoControl The control holding the action
	 * @param text The initial text of the action
	 * @param image The initial enabled image of the action
	 * @param imageDisabled The initial disabled image of the action
	 */
	new(ExtenderEObjectHoverProvider extender, IXtextBrowserInformationControl infoControl, String text, String image,
		String imageDisabled) {

		// Convey fields
		this.extender = extender
		this.infoControl = infoControl

		// Get shared images for button initialization
		val extension images = PlatformUI.workbench.sharedImages

		// Set properties
		this.text = text

		imageDescriptor = getImageDescriptor(image)
		disabledImageDescriptor = getImageDescriptor(imageDisabled)

		// Initial update
		update()

		// Continuous update
		infoControl.addInputChangeListener([update()])
	}

	new(ExtenderEObjectHoverProvider extender, IXtextBrowserInformationControl infoControl, String text, String image) {
		this(extender, infoControl, text, image, image + "_DISABLED")
	}

	public abstract def void update()

	protected def void navigateToHTML(EObject element, CharSequence s) {
		val buffer = new StringBuffer(s);
		HTMLPrinter.insertPageProlog(buffer, 0, extender.styleSheet);
		HTMLPrinter.addPageEpilog(buffer);
		val html = buffer.toString();

		infoControl.input = new XtextBrowserInformationControlInput(
			infoControl.input as XtextBrowserInformationControlInput, element, html, extender.labelProvider);
	}
}
