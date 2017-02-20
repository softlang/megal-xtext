package org.softlang.megal.browsing.views;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableItem;
import org.softlang.megal.MegalFile;
import org.softlang.megal.language.MegalReasoning;
import org.softlang.megal.language.Megals;
import org.softlang.megal.mi2.Element;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.MegamodelKB;
import org.softlang.megal.mi2.Named;
import org.softlang.megal.mi2.api.ModelExecutor;
import org.softlang.megal.mi2.api.resolution.LocalResolution;
import org.softlang.megal.mi2.api.resolution.ProjectResolution;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class SampleView extends AbstractMegalAwareView {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "testplugin.views.SampleView";
	
	private IFile file;
	
	private MyView view;

	/**
	 * The constructor.
	 */
	public SampleView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		view = new MyView(parent,0);
		
		view.getBtnEval().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				evaluate();
			}
		});
		
	}
	
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
//		viewer.getControl().setFocus();
	}

	private void evaluate() {
		
		File megalFile = new File(file.getRawLocationURI());
		
		try {
			KB kb =  MegamodelKB.loadAll(Megals.load(megalFile, megalFile.getParentFile().listFiles()));
			
			
			ModelExecutor ex = new ModelExecutor();
			kb = ex.evaluate(new ProjectResolution(){

				@Override
				protected IProject getProject() {
					// TODO Auto-generated method stub
					return file.getProject();
				} 

			}, kb).getOutput();
			
			view.getTable().removeAll();
			
			for(Entity e : kb.getEntities()) {
				TableItem item = new TableItem(view.getTable(),SWT.NONE);
				item.setText(0, e.getName());
				item.setText(1, e.getType().getName());
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	void megalFileChanged(IFile file) {
		
		view.getText().setText(file.getLocationURI().toString());
		
		this.file = file;
		
	}
}
