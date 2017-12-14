package sg.bizplus.views.home;

import com.vaadin.ui.Grid;

import sg.bizplus.backend.mock.PackageDetail;

@SuppressWarnings("serial")
public class PackageGrid extends Grid<PackageDetail> {

	public PackageGrid() {
		addStyleName("package-grid");
		setSizeFull();
		setHeaderVisible(false);
		setRowHeight(320);
		setWidth("390px");
		addComponentColumn(packageDetail -> {
			return new PackageComponent(packageDetail);
		});

	}

}
