package sg.bizplus.views.home;

import com.vaadin.ui.Grid;

import sg.bizplus.backend.mock.PackageDetail;

@SuppressWarnings("serial")
public class PackageGrid extends Grid<PackageDetail> {

	public PackageGrid() {
		setSizeFull();
		setHeaderVisible(false);
		setRowHeight(400);
		addComponentColumn(packageDetail -> {
			return new PackageRow(packageDetail);
		});

	}

}
