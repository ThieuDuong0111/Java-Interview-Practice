package interview.design_pattern.abstractFactoryNotification;

public class Client {

	public static void main(String[] args) {
		AbstractFactoryNotification factoryEmailNotification = SuperFactoryNotification
				.getNofication(NotificationType.EMAIL);

		// Web email
		AbstractProductWeb emailWeb = factoryEmailNotification.webSendNotification();
		emailWeb.send();

		// Mobile email
		AbstractProductMobile emailMobile = factoryEmailNotification.mobileSendNotification();
		emailMobile.send();

		// Desktop email
		AbstractProductDesktop emailDesktop = factoryEmailNotification.desktopSendNotification();
		emailDesktop.send();

		AbstractFactoryNotification factorySMSNotification = SuperFactoryNotification
				.getNofication(NotificationType.SMS);

		// Web email
		AbstractProductWeb smsWeb = factorySMSNotification.webSendNotification();
		smsWeb.send();

		// Mobile email
		AbstractProductMobile smsMobile = factorySMSNotification.mobileSendNotification();
		smsMobile.send();

		// Desktop email
		AbstractProductDesktop smsDesktop = factorySMSNotification.desktopSendNotification();
		smsDesktop.send();
	}

}
