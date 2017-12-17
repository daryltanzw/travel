package sg.bizplus.components.common;

import com.vaadin.server.Page;
import com.vaadin.ui.Notification;

public class Utils {
	public static void showNotification(Notification notification, Page page) {
		notification.setDelayMsec(3000);
		notification.show(page);
	}
}
