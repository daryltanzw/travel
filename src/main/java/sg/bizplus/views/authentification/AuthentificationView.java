package sg.bizplus.views.authentification;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings("serial")
public class AuthentificationView extends CssLayout implements View {
	public static String VIEW_NAME = "Login";
	private TextField email;
	private PasswordField password;
	private Button login;
	private Button register;

	public AuthentificationView() {
		buildUI();
	}

	private void buildUI() {
		VerticalLayout centeringLayout = new VerticalLayout();
		
		this.email = new TextField("Email");
		this.password = new PasswordField("Password");
		this.login = new Button("Login");
		login.addStyleName(ValoTheme.BUTTON_FRIENDLY);
		login.addStyleName(ValoTheme.BUTTON_LARGE);
		this.register = new Button("Register");
		register.addStyleName(ValoTheme.BUTTON_FRIENDLY);
		register.addStyleName(ValoTheme.BUTTON_LARGE);

		HorizontalLayout buttonContainer = new HorizontalLayout();
		buttonContainer.addComponents(login, register);

		centeringLayout.addComponents(email, password, buttonContainer);
		
		addComponent(centeringLayout);
	}

}
