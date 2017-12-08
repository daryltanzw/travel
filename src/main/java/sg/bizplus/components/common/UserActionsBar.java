package sg.bizplus.components.common;

import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;

@SuppressWarnings("serial")
public class UserActionsBar extends HorizontalLayout {
	
	public UserActionsBar(List<Button> actionButtons) {
		setSizeFull();
		setSpacing(true);
		setMargin(true);
		actionButtons.stream().forEach(action -> addComponent(action));
	}

}
