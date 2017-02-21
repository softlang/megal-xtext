package org.softlang.megal.browsing.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.viewport.ViewportLayer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ColumnPixelData;

public class MegaLBrowserComposite extends Composite {
	private TabFolder tabsMegamodelBrowser;
	private Text textMegamodelURI;
	private Composite tbtmEntitiesComposite;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public MegaLBrowserComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));
		new Label(this, SWT.NONE);
		
		textMegamodelURI = new Text(this, SWT.BORDER);
		textMegamodelURI.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		tabsMegamodelBrowser = new TabFolder(this, SWT.NONE);
		GridData gd_tabsMegamodelBrowser = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
		gd_tabsMegamodelBrowser.heightHint = 259;
		gd_tabsMegamodelBrowser.widthHint = 436;
		tabsMegamodelBrowser.setLayoutData(gd_tabsMegamodelBrowser);
		
		TabItem tbtmEntities = new TabItem(tabsMegamodelBrowser, SWT.NONE);
		tbtmEntities.setImage(null);
		tbtmEntities.setText("Entities");
		
		tbtmEntitiesComposite = new Composite(tabsMegamodelBrowser, SWT.NONE);
		tbtmEntities.setControl(tbtmEntitiesComposite);
		
		TabItem tbtmEntityTypes = new TabItem(tabsMegamodelBrowser, SWT.NONE);
		tbtmEntityTypes.setText("EntityTypes");
		
		TabItem tbtmRelationships = new TabItem(tabsMegamodelBrowser, SWT.NONE);
		tbtmRelationships.setText("Relationships");
		
		TabItem tbtmRelationshipTypes = new TabItem(tabsMegamodelBrowser, SWT.NONE);
		tbtmRelationshipTypes.setText("RelationshipTypes");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public TabFolder getTabFolder() {
		return tabsMegamodelBrowser;
	}
	public Text getTextMegamodelURI() {
		return textMegamodelURI;
	}
	public Composite getTbtmEntitiesComposite() {
		return tbtmEntitiesComposite;
	}
}
