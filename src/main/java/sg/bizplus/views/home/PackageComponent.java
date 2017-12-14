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
public class PackageComponent extends CssLayout {
	private PackageDetail packageDetail;
	// Suppose to be Bean Item

	public PackageComponent(PackageDetail packageDetail) {
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
		image.setWidth("330px");
		image.setHeight("220px");
		return image;
	}

	private HorizontalLayout getButtonsContainer() {
		HorizontalLayout buttons = new HorizontalLayout();
		buttons.setMargin(false);
		buttons.setSpacing(true);
		buttons.addComponents(getFAQButton(), getItinerariesButton(), getGalleryButton());
		return buttons;
	}

	private Button getFAQButton() {
		Button faq = new Button("Read More");
		faq.addStyleName(ValoTheme.BUTTON_FRIENDLY);
		faq.addStyleName(ValoTheme.BUTTON_SMALL);
		faq.setIcon(VaadinIcons.QUESTION);
		return faq;
	}

	private Button getItinerariesButton() {
		Button itineraries = new Button("Itineraries");
		itineraries.addStyleName(ValoTheme.BUTTON_FRIENDLY);
		itineraries.addStyleName(ValoTheme.BUTTON_SMALL);
		itineraries.setIcon(VaadinIcons.DIPLOMA_SCROLL);
		return itineraries;
	}

	private Button getGalleryButton() {
		Button gallery = new Button("Gallery");
		gallery.addStyleName(ValoTheme.BUTTON_FRIENDLY);
		gallery.addStyleName(ValoTheme.BUTTON_SMALL);
		gallery.setIcon(VaadinIcons.PICTURE);
		return gallery;
	}

}
