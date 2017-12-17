package sg.bizplus.views.home;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

import sg.bizplus.backend.mock.PackageDetail;
import sg.bizplus.travelBooking.TravelBookingUI;

@SuppressWarnings("serial")
public class PackageComponent extends CssLayout {
	private PackageDetail packageDetail;
	private final String WIDTH = "340px";
	private final String HEIGHT = "220px";
	// Suppose to be Bean Item

	public PackageComponent(PackageDetail packageDetail) {
		this.packageDetail = packageDetail;
		buildUI();
	}

	private void buildUI() {
		VerticalLayout containerLayout = new VerticalLayout();
		containerLayout.setSpacing(false);
		containerLayout.setMargin(false);

		Image image = getPackageImage();
		VerticalLayout description = getDescriptionLayout();

		containerLayout.addComponent(image);
		containerLayout.addComponent(description);

		addComponent(containerLayout);
	}

	private Image getPackageImage() {
		FileResource resource = new FileResource(new File(packageDetail.getFullFilePath()));
		Image image = new Image("", resource);
		image.setWidth(WIDTH);
		image.setHeight(HEIGHT);
		return image;
	}

	private VerticalLayout getDescriptionLayout() {
		VerticalLayout desc = new VerticalLayout();
		desc.setWidth(WIDTH);
		desc.setSpacing(false);
		desc.setMargin(false);
		
		Button titleBtn = new Button(packageDetail.getTitle());
		titleBtn.addStyleName(ValoTheme.BUTTON_LINK);
		titleBtn.addStyleName("package-component-title");
		titleBtn.setWidth(WIDTH);
		titleBtn.addClickListener(clickEvent -> {
			TravelBookingUI.get().addWindow(new PackageDetailsWindow(packageDetail));
		});
		
		desc.addComponents(titleBtn);

		return desc;
	}

}
