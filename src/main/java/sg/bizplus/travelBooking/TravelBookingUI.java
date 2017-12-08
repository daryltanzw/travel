package sg.bizplus.travelBooking;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.Page;
import com.vaadin.server.Responsive;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

import sg.bizplus.views.home.HomeView;

@SuppressWarnings("serial")
@Theme("travelBookingTheme")
public class TravelBookingUI extends UI {
	
	public static final String HOMESCREEN = HomeView.VIEW_NAME;
	
    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	Responsive.makeResponsive(this);
		setLocale(vaadinRequest.getLocale());
		getPage().setTitle("ConfigForCompanyName");
		showMainView();
    }
    
    public void showMainView() {
		addStyleName(ValoTheme.UI_WITH_MENU);
		setContent(new MainScreen(TravelBookingUI.this));
		Page page = TravelBookingUI.get().getPage();
		page.setUriFragment("!" + HOMESCREEN, false);
		getNavigator().navigateTo(getNavigator().getState());
	}

	public static TravelBookingUI get() {
		return (TravelBookingUI) UI.getCurrent();
	}

    @WebServlet(urlPatterns = "/*", name = "TravelBookingUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = TravelBookingUI.class, productionMode = false)
    public static class TravelBookingUIServlet extends VaadinServlet {
    }
}
