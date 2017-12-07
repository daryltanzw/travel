package sg.bizplus.view.home;

import com.vaadin.navigator.View;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class HomeView extends CssLayout implements View {
	public static String VIEW_NAME = "Home";

	public HomeView() {
		buildUI();
	}

	private void buildUI() {
		VerticalLayout centeringLayout = new VerticalLayout();
		centeringLayout.addComponent(new TextField("Home"));
		
		
		addComponent(centeringLayout);
	}

}
