package sg.bizplus.views.home;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

import sg.bizplus.backend.mock.MockPackageDS;
import sg.bizplus.components.common.UserActionsBar;

@SuppressWarnings("serial")
public class HomeView extends CssLayout implements View {
	public static String VIEW_NAME = "Home";
	VerticalLayout mainContentLayout = new VerticalLayout();

	public HomeView() {
		setSizeFull();
		buildUI();
	}

	private void buildUI() {
		HorizontalLayout userActionsBar = getUserActionBar();
		mainContentLayout.setSizeFull();
		mainContentLayout.setSpacing(false);
		mainContentLayout.setMargin(false);

		PackageGrid pkgGrid = new PackageGrid();
		pkgGrid.setItems(MockPackageDS.getPackages());
		
		mainContentLayout.addComponent(userActionsBar);
		mainContentLayout.addComponent(pkgGrid);
		mainContentLayout.setExpandRatio(userActionsBar, 1);
		mainContentLayout.setExpandRatio(pkgGrid, 4);
		
		addComponent(mainContentLayout);
	}

	private HorizontalLayout getUserActionBar() {
		Button uploadTravelPackage = new Button("New Package");
		uploadTravelPackage.setIcon(VaadinIcons.PLUS);
		uploadTravelPackage.addClickListener(clickEvent -> {
			//SpinOff upload Window
		});
		List<Button> btnList = new ArrayList<>(1);
		btnList.add(uploadTravelPackage);
		return new UserActionsBar(btnList);
	}

}
