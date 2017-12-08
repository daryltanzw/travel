package sg.bizplus.views.authentification;

import com.vaadin.navigator.View;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings("serial")
public class AuthentificationView extends CssLayout implements View {
	public static String VIEW_NAME = "Login/Register";
	private TextField email;
	private PasswordField password;
	private Button login;
	private Button register;

	public AuthentificationView() {
		setSizeFull();
		buildUI();
	}

	private void buildUI() {
		VerticalLayout centeringLayout = new VerticalLayout();
		centeringLayout.addStyleName("travel-background");
		centeringLayout.setSizeFull();
		centeringLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
		centeringLayout.addComponent(buildFormLayout());
		addComponent(centeringLayout);
	}

	private FormLayout buildFormLayout() {
		FormLayout form = new FormLayout();
		form.addStyleName("general-form-view");
		form.setSizeUndefined();
		
		email = new TextField("Email");
		email.setWidth(20, Unit.EM);
		password = new PasswordField("Password");
		password.setWidth(20, Unit.EM);
		login = new Button("Login");
		login.addStyleName(ValoTheme.BUTTON_FRIENDLY);
		login.addStyleName(ValoTheme.BUTTON_LARGE);
		register = new Button("Register");
		register.addStyleName(ValoTheme.BUTTON_FRIENDLY);
		register.addStyleName(ValoTheme.BUTTON_LARGE);

		HorizontalLayout buttonContainer = new HorizontalLayout();
		buttonContainer.addComponents(login, register);
		buttonContainer.setMargin(false);
		buttonContainer.setWidth(20, Unit.EM);

		form.addComponents(email, password, buttonContainer);
		return form;
	}

}
