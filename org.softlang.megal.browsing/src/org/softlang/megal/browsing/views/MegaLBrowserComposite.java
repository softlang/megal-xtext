package org.softlang.megal.browsing.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
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
		GridData gd_tabsMegamodelBrowser = new GridData(SWT.LEFT, SWT.CENTER, true, true, 2, 1);
		gd_tabsMegamodelBrowser.heightHint = 259;
		gd_tabsMegamodelBrowser.widthHint = 436;
		tabsMegamodelBrowser.setLayoutData(gd_tabsMegamodelBrowser);
		
		TabItem tbtmEntities = new TabItem(tabsMegamodelBrowser, SWT.NONE);
		tbtmEntities.setImage(null);
		tbtmEntities.setText("Entities");
		
		Composite composite = new Composite(tabsMegamodelBrowser, SWT.NONE);
		tbtmEntities.setControl(composite);
		TreeColumnLayout tcl_composite = new TreeColumnLayout();
		composite.setLayout(tcl_composite);
		
		TreeViewer treeViewer = new TreeViewer(composite, SWT.BORDER);
		Tree tree = treeViewer.getTree();
		tree.setSortDirection(SWT.DOWN);
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		
		TreeViewerColumn treeViewerColumn_1 = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnNewColumn_1 = treeViewerColumn_1.getColumn();
		tcl_composite.setColumnData(trclmnNewColumn_1, new ColumnPixelData(150, true, true));
		trclmnNewColumn_1.setText("New Column");
		
		TreeViewerColumn treeViewerColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnNewColumn = treeViewerColumn.getColumn();
		tcl_composite.setColumnData(trclmnNewColumn, new ColumnPixelData(150, true, true));
		trclmnNewColumn.setText("New Column");
		
		
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
}
