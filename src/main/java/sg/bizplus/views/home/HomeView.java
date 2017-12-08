package sg.bizplus.views.home;

import com.vaadin.navigator.View;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class HomeView extends CssLayout implements View {
	public static String VIEW_NAME = "Home";
	VerticalLayout mainHomeLayout;

	public HomeView() {
		setSizeFull();
		buildUI();
	}

	private void buildUI() {
		mainHomeLayout = new VerticalLayout();
		mainHomeLayout.setSizeFull();
		mainHomeLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
		mainHomeLayout.addComponent(new TextField("Home"));
		
		addComponent(mainHomeLayout);
	}

}
