package sg.bizplus.views.home;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

import sg.bizplus.backend.mock.MockPackageDS;
import sg.bizplus.backend.mock.PackageDetail;

@SuppressWarnings("serial")
public class HomeView2 extends CssLayout implements View {
	public static String VIEW_NAME = "Home2";
	VerticalLayout mainLayout;
	GridLayout grid;
	
	public HomeView2() {
		setSizeFull();
		buildUI();
	}

	private void buildUI() {
		mainLayout = new VerticalLayout();
		mainLayout.setSizeFull();
		mainLayout.setDefaultComponentAlignment(Alignment.TOP_CENTER);
		
		Panel wrapper = new Panel();
		wrapper.setSizeFull();
		
		grid = new GridLayout(3,3);
		grid.setSpacing(true);
		grid.setWidth("100%");
		
		List<PackageDetail> packages = MockPackageDS.getPackages();
		packages.stream().forEach(detail -> grid.addComponent(new PackageComponent(detail)));
		
		wrapper.setContent(grid);
		mainLayout.addComponent(wrapper);
		
		addComponent(wrapper);
	}
	
}
