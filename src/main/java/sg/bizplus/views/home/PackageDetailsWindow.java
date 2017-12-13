package sg.bizplus.views.home;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings("serial")
public class PackageDetailsWindow extends Window {
	public static enum Action {
		NEW, EDIT
	};

	private VerticalLayout mainLayout;

	public PackageDetailsWindow(PackageDetailsWindow.Action action) {
		super("Manage Package Details");
		center();
		setModal(true);
		setWidth("50%");
		switch (action) {
		case EDIT: {
			setContent(doEdit());
		}
		case NEW: {
			setContent(buildUI());
		}
		default:
			// ignore
		}
	}

	private VerticalLayout doEdit() {
		mainLayout = buildUI();
		populateFromDB();
		return null;
	}

	private VerticalLayout buildUI() {
		mainLayout = new VerticalLayout();
		mainLayout.setSizeFull();
		HorizontalLayout buttons = new HorizontalLayout();

		Button addReadMore = getReadMoreButton();
		buttons.addComponent(addReadMore);
		mainLayout.addComponent(buttons);
		return mainLayout;
	}

	private Button getReadMoreButton() {
		Button btn = new Button("Read More");
		btn.addStyleName(ValoTheme.BUTTON_PRIMARY);
		btn.addStyleName(ValoTheme.BUTTON_SMALL);
		btn.setIcon(VaadinIcons.QUESTION);
		return btn;
	}

	private void populateFromDB() {
		// TODO Auto-generated method stub

	}

}
