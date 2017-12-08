package sg.bizplus.views.home;

import java.io.File;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.FileResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

import sg.bizplus.backend.mock.PackageDetail;

@SuppressWarnings("serial")
public class PackageRow extends CssLayout {
	private PackageDetail packageDetail;
	// Suppose to be Bean Item

	public PackageRow(PackageDetail packageDetail) {
		this.packageDetail = packageDetail;
		buildUI();
	}

	private void buildUI() {
		VerticalLayout containerLayout = new VerticalLayout();
		containerLayout.setSpacing(true);
		containerLayout.setMargin(false);

		Image image = getPackageImage();

		HorizontalLayout buttons = getButtonsContainer();

		containerLayout.addComponent(image);
		containerLayout.addComponent(buttons);

		addComponent(containerLayout);
	}

	private Image getPackageImage() {
		FileResource resource = new FileResource(new File(packageDetail.getFullFilePath()));
		Image image = new Image("", resource);
		image.setWidth("500px");
		image.setHeight("300px");
		return image;
	}

	private HorizontalLayout getButtonsContainer() {
		HorizontalLayout buttons = new HorizontalLayout();
		buttons.setMargin(false);
		buttons.setSpacing(true);
		buttons.addComponents(getRegisterButton(), getFAQButton());
		return buttons;
	}

	private Button getRegisterButton() {
		Button register = new Button("Register");
		register.addStyleName(ValoTheme.BUTTON_FRIENDLY);
		register.addStyleName(ValoTheme.BUTTON_SMALL);
		return register;
	}
	
	private Button getFAQButton() {
		Button faq = new Button("FAQ");
		faq.addStyleName(ValoTheme.BUTTON_FRIENDLY);
		faq.addStyleName(ValoTheme.BUTTON_SMALL);
		faq.setIcon(VaadinIcons.QUESTION);
		return faq;
	}
}
