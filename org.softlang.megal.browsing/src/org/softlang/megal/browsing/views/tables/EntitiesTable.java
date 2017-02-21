package org.softlang.megal.browsing.views.tables;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.DefaultNatTableStyleConfiguration;
import org.eclipse.nebula.widgets.nattable.data.IColumnAccessor;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.data.ListDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.grid.layer.ColumnHeaderLayer;
import org.eclipse.nebula.widgets.nattable.layer.CompositeLayer;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.style.HorizontalAlignmentEnum;
import org.eclipse.nebula.widgets.nattable.viewport.ViewportLayer;
import org.eclipse.swt.widgets.Composite;
import org.softlang.megal.mi2.Entity;

public class EntitiesTable extends AbstractTable {

	static private final String[] HEADERS = { "Name", "Type", "Binding" };
	
	static private final IDataProvider headerDataProvider = new ArrayHeaderDataProvider<String>(HEADERS);
	
	static private final IColumnAccessor<Entity> columnAccessor = new IColumnAccessor<Entity> () {

		@Override
		public Object getDataValue(Entity rowObject, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return rowObject.getName();
			case 1:
				return rowObject.getType().getName();
			case 2:
				return rowObject.hasBinding() ? rowObject.getBinding().toString() : "";
			}
			return null;
		}

		@Override
		public void setDataValue(Entity rowObject, int columnIndex, Object newValue) {
			// do nothing
		}

		@Override
		public int getColumnCount() {
			return 3;
		}
		
	};
	
	private List<Entity> entities = new LinkedList<Entity>();
	
	private ListDataProvider<Entity> bodyDataProvider;
	
	private DataLayer headerDataLayer;
	private DataLayer bodyDataLayer;
	private SelectionLayer selectionLayer;
	private ViewportLayer viewportLayer;
	private ColumnHeaderLayer columnHeaderLayer;
	private CompositeLayer compositeLayer;
	
	private NatTable natTable;
	
	public EntitiesTable (Composite parent) {
		
		bodyDataProvider = new ListDataProvider<Entity>(entities,columnAccessor);
		

        headerDataLayer = new DataLayer(headerDataProvider);
        headerDataLayer.setColumnPercentageSizing(true);
        for (int i=0; i<HEADERS.length; i++) {
        	System.out.println(100/HEADERS.length);
        	headerDataLayer.setColumnWidthPercentageByPosition(i, 100/HEADERS.length);
        }
		
		bodyDataLayer = new DataLayer(bodyDataProvider);
		bodyDataLayer.setColumnPercentageSizing(true);
		       
		
		selectionLayer = new SelectionLayer(bodyDataLayer);
        
		viewportLayer = new ViewportLayer(selectionLayer);
        viewportLayer.setRegionName(GridRegion.BODY);
        
        
        columnHeaderLayer = new ColumnHeaderLayer(headerDataLayer, viewportLayer, selectionLayer);
        
        compositeLayer = new CompositeLayer(1, 2);
        compositeLayer.setChildLayer(GridRegion.COLUMN_HEADER, columnHeaderLayer, 0, 0);
        compositeLayer.setChildLayer(GridRegion.BODY, viewportLayer, 0, 1);
        
		natTable = new NatTable(parent, compositeLayer, false);
		
		DefaultNatTableStyleConfiguration config = new DefaultNatTableStyleConfiguration();
		config.hAlign = HorizontalAlignmentEnum.LEFT;
		
		natTable.addConfiguration(config);
		natTable.configure();
		
		GridLayoutFactory.swtDefaults().numColumns(2).margins(0, 0).spacing(0, 0).applyTo(parent);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(natTable);
	}
	
	public EntitiesTable setEntities(Collection<Entity> entities) {
		this.entities.clear();
		this.entities.addAll(entities);
		natTable.refresh();
		return this;
	}
	
}
