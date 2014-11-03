package org.softlang.megal.language.ui.hover;

import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider.PresenterControlCreator;
import org.eclipse.xtext.ui.editor.hover.html.IXtextBrowserInformationControl;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

import com.google.common.collect.Lists;

/**
 * Extends the default presenter control creator with a list of action creators
 * 
 * @author Pazuzu
 *
 */
public class ExtenderPresentationControlCreator extends PresenterControlCreator {

	/**
	 * The list of constructors for actions
	 */
	private final List<Function1<? super IXtextBrowserInformationControl, ? extends IAction>> constructors;

	/**
	 * The list of constructors for actions
	 * 
	 * @return Returns the value of the constructor backing
	 */
	public List<Function1<? super IXtextBrowserInformationControl, ? extends IAction>> getConstructors() {
		return constructors;
	}

	/**
	 * Constructs a new extending presentation control creator
	 * 
	 * @param p
	 *            The enclosing instance
	 */
	public ExtenderPresentationControlCreator(DefaultEObjectHoverProvider p) {
		p.super();

		constructors = Lists.newArrayList();
	}

	private Shell parent;

	public Shell getParent() {
		return parent;
	}

	@Override
	public IInformationControl createInformationControl(Shell parent) {
		this.parent = parent;
		return super.createInformationControl(parent);
	}

	@Override
	protected final void configureControl(
			IXtextBrowserInformationControl control, ToolBarManager tbm,
			String font) {
		// Configure super before
		super.configureControl(control, tbm, font);

		// Add all actions then
		for (Function1<? super IXtextBrowserInformationControl, ? extends IAction> k : constructors)
			tbm.add(k.apply(control));

		// Update the tool bar again
		tbm.update(true);
	}

}
