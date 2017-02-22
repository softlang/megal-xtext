package org.softlang.megal.browsing.views;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.TableItem;
import org.softlang.megal.MegalFile;
import org.softlang.megal.browsing.views.tables.EntityTable;
import org.softlang.megal.browsing.views.tables.EntityTypeTable;
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
	
	private MegaLBrowserComposite browser;
	private EntityTable entityTable;
	private EntityTypeTable entityTypeTable;

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
		
		browser = new MegaLBrowserComposite(parent,SWT.NONE);
		entityTable = new EntityTable(browser.getTbtmEntitiesComposite());
		entityTypeTable = new EntityTypeTable(browser.getTbtmEnctityTypesComposite());
		
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
					return file.getProject();
				} 

			}, kb).getOutput();
			
			List<Entity> entities = kb.getEntities().stream()
					.sorted( (a,b) -> a.getName().compareToIgnoreCase(b.getName()) )
					.collect(Collectors.toList());
			
			List<EntityType> entityTypes = kb.getEntityTypes().stream()
					.sorted( (a,b) -> a.getName().compareToIgnoreCase(b.getName()) )
					.collect(Collectors.toList());
			
			
			
			entityTable.setData(entities);
			entityTypeTable.setData(entityTypes);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	@Override
	void megalFileChanged(IFile file) {
		
		browser.getTextMegamodelURI().setText(file.getLocationURI().toString());
//		browser.getProgressBar().
		this.file = file;
		evaluate();
		
	}
}
