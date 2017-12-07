package sg.bizplus.travelBooking;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.VerticalLayout;

import sg.bizplus.views.authentification.AuthentificationView;
import sg.bizplus.views.home.HomeView;

@SuppressWarnings("serial")
public class MainScreen extends VerticalLayout {
    private Menu menu;

    public MainScreen(TravelBookingUI ui) {
        setSpacing(false);
        setMargin(false);

        VerticalLayout viewContainer = new VerticalLayout();
        viewContainer.setSpacing(false);
        viewContainer.setMargin(false);
        viewContainer.setSizeFull();


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
