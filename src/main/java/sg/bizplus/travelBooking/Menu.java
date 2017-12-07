package sg.bizplus.travelBooking;

import java.util.HashMap;
import java.util.Map;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.Resource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings("serial")
public class Menu extends HorizontalLayout {
	private Navigator nav;
	private Map<String, Button> viewButtons = new HashMap<String, Button>();
	private HorizontalLayout menuItemsLayout;
	
	public Menu(Navigator nav) {
		this.nav = nav;
		this.menuItemsLayout = new HorizontalLayout();
		addComponent(menuItemsLayout);
	}
	
    public void addView(View view, final String name, String caption,
            Resource icon) {
        nav.addView(name, view);
        createViewButton(name, caption, icon);
    }
   
    private void createViewButton(final String name, String caption,
            Resource icon) {
        Button button = new Button(caption, new ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
                nav.navigateTo(name);

            }
        });
        button.setPrimaryStyleName(ValoTheme.MENU_ITEM);
        button.setIcon(icon);
        menuItemsLayout.addComponent(button);
        viewButtons.put(name, button);
    }

    
    public void setActiveView(String viewName) {
        for (Button button : viewButtons.values()) {
            button.removeStyleName("selected");
        }
        Button selected = viewButtons.get(viewName);
        if (selected != null) {
            selected.addStyleName("selected");
        }
    }

}
