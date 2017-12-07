package sg.bizplus.travelBooking;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.VerticalLayout;

import sg.bizplus.view.authentification.AuthentificationView;
import sg.bizplus.view.home.HomeView;

/**
 * Content of the UI when the user is logged in.
 * 
 * 
 */
@SuppressWarnings("serial")
public class MainScreen extends VerticalLayout {
    private Menu menu;

    public MainScreen(TravelBookingUI ui) {

        setSpacing(false);

        VerticalLayout viewContainer = new VerticalLayout();
        viewContainer.setSizeFull();
        viewContainer.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

        final Navigator navigator = new Navigator(ui, viewContainer);
        navigator.setErrorView(ErrorView.class);
        menu = new Menu(navigator);
        menu.addView(new HomeView(), HomeView.VIEW_NAME, HomeView.VIEW_NAME, VaadinIcons.HOME);
        menu.addView(new AuthentificationView(), AuthentificationView.VIEW_NAME, AuthentificationView.VIEW_NAME, VaadinIcons.USERS);

        navigator.addViewChangeListener(viewChangeListener);
        addComponent(menu);
        addComponent(viewContainer);
        setExpandRatio(viewContainer, 1);
        setSizeFull();
    }

    // notify the view menu about view changes so that it can display which view
    // is currently active
    ViewChangeListener viewChangeListener = new ViewChangeListener() {

        @Override
        public boolean beforeViewChange(ViewChangeEvent event) {
            return true;
        }

        @Override
        public void afterViewChange(ViewChangeEvent event) {
            menu.setActiveView(event.getViewName());
        }

    };
}
