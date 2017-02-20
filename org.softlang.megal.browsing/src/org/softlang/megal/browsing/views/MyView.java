package org.softlang.megal.browsing.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.ToolBar;

public class MyView extends Composite {
	private Text text;
	private Table table;
	private Button btnEval;
	private ToolBar toolBar;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public MyView(Composite parent, int style) {
		super(parent, SWT.BORDER);
		setLayout(new GridLayout(2, false));
		
		toolBar = new ToolBar(this, SWT.FLAT | SWT.RIGHT);
		new Label(this, SWT.NONE);
		
		text = new Text(this, SWT.BORDER);
		GridData gd_text = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_text.widthHint = 328;
		text.setLayoutData(gd_text);
		text.setEditable(false);
		
		btnEval = new Button(this, SWT.NONE);
		btnEval.setText("Evaluate");
		
		TableViewer tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnNewColumn = tableViewerColumn.getColumn();
		tblclmnNewColumn.setWidth(212);
		tblclmnNewColumn.setText("Name");
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnNewColumn_1 = tableViewerColumn_1.getColumn();
		tblclmnNewColumn_1.setWidth(220);
		tblclmnNewColumn_1.setText("Type");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	public Text getText() {
		return text;
	}
	
	public Table getTable() {
		return table;
	}
	public Button getBtnEval() {
		return btnEval;
	}
}
