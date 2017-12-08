package sg.bizplus.views.home;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
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
		FileResource resource = new FileResource(new File(packageDetail.getFullFilePath()));
		Image image = new Image("", resource);
		image.setWidth("500px");
		image.setHeight("300px");
		
		Button register = getRegisterButton();
		
		containerLayout.addComponent(image);
		containerLayout.addComponent(register);

		addComponent(containerLayout);
	}

	private Button getRegisterButton() {
		Button register = new Button("Register");
		register.addStyleName(ValoTheme.BUTTON_FRIENDLY);
		register.addStyleName(ValoTheme.BUTTON_SMALL);
		return register;
	}
}
