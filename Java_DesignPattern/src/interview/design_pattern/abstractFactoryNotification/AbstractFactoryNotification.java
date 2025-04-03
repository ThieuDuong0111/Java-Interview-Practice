package interview.design_pattern.abstractFactoryNotification;

public abstract class AbstractFactoryNotification {
	public abstract AbstractProductWeb webSendNotification();

	public abstract AbstractProductMobile mobileSendNotification();

	public abstract AbstractProductDesktop desktopSendNotification();
}
