package sg.bizplus.views.home;

import org.vaadin.addons.stackpanel.StackPanel;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.themes.ValoTheme;

import sg.bizplus.backend.mock.PackageDetail;

@SuppressWarnings("serial")
public class PackageDetailsWindow extends Window {
	private static final String ADMINVIEW = "ADMINVIEW";
	private static final String USERVIEW = "USERVIEW";
	private PackageDetail packageDetail;

	public PackageDetailsWindow(PackageDetail packageDetail) {
		super(packageDetail.getTitle());
		this.packageDetail = packageDetail;
		center();
		setModal(true);
		setSizeFull();
		setContent(buildUI());
	}

	private VerticalLayout buildUI() {
		VerticalLayout mainLayout = buildUserView();
		String viewType = deduceUserView();
		if (viewType.equals(ADMINVIEW)) {
			addAdminDisplays(mainLayout);
		}
		return mainLayout;
	}

	private void addAdminDisplays(VerticalLayout mainLayout) {
		mainLayout.addComponentAsFirst(getAdminButtonRow());
	}

	private HorizontalLayout getAdminButtonRow() {
		HorizontalLayout buttons = new HorizontalLayout();
		buttons.addComponents(getEditButton(), getDeleteButton());
		return buttons;
	}

	private Button getEditButton() {
		Button btn = new Button("Edit");
		btn.addStyleName(ValoTheme.BUTTON_PRIMARY);
		btn.addStyleName(ValoTheme.BUTTON_SMALL);
		btn.setIcon(VaadinIcons.EDIT);
		return btn;
	}

	private Button getDeleteButton() {
		Button btn = new Button("Delete");
		btn.addStyleName(ValoTheme.BUTTON_PRIMARY);
		btn.addStyleName(ValoTheme.BUTTON_SMALL);
		btn.setIcon(VaadinIcons.MINUS);
		return btn;
	}

	private VerticalLayout buildUserView() {
		VerticalLayout mainLayout = new VerticalLayout();
		mainLayout.setSpacing(false);
		mainLayout.setMargin(true);
		mainLayout.setSizeFull();
		mainLayout.addComponents(getPanelStacks(), getUserButtonRow());

		return mainLayout;

	}
	
	private VerticalLayout getPanelStacks() {
		VerticalLayout panelStacks = new VerticalLayout();
		
		panelStacks.addComponents(getReadMoreSection(), getItinerariesSection());
		
		return panelStacks;
	}
	
	private Panel getReadMoreSection() {
		Panel panel = new Panel("Read More");
		panel.setSizeFull();
		
		StackPanel stackPanel = StackPanel.extend(panel);
		stackPanel.setToggleDownIcon(VaadinIcons.PLUS);
		stackPanel.setToggleUpIcon(VaadinIcons.MINUS);
		
	
		TextArea readMore = new TextArea();
		readMore.setSizeFull();
		panel.setContent(readMore);
		return panel;
	}
	
	private Panel getItinerariesSection() {
		Panel panel = new Panel("Itineraries");
		panel.setSizeFull();
		
		StackPanel stackPanel = StackPanel.extend(panel);
		stackPanel.setToggleDownIcon(VaadinIcons.PLUS);
		stackPanel.setToggleUpIcon(VaadinIcons.MINUS);
		
	
		TextArea readMore = new TextArea();
		readMore.setSizeFull();
		readMore.setValue("this is a test");
		panel.setContent(readMore);
		return panel;
	}
	

	private HorizontalLayout getUserButtonRow() {
		HorizontalLayout buttons = new HorizontalLayout();
		buttons.addComponent(getCloseButton());
		return buttons;
	}
	

	private String deduceUserView() {
		// check user role
		return ADMINVIEW;
	}

	private Button getCloseButton() {
		Button close = new Button("Close");
		close.addStyleName(ValoTheme.BUTTON_SMALL);
		close.addStyleName(ValoTheme.BUTTON_DANGER);
		close.addClickListener(clickEvent -> {
			this.close();
		});
		return close;
	}

}
