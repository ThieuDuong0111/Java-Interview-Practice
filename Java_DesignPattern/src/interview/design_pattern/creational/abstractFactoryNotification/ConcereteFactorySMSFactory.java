package interview.design_pattern.creational.abstractFactoryNotification;

public class ConcereteFactorySMSFactory extends AbstractFactoryNotification {

	@Override
	public AbstractProductWeb webSendNotification() {
		return new ProductSMSWeb();
	}

	@Override
	public AbstractProductMobile mobileSendNotification() {
		return new ProductSMSMobile();
	}

	@Override
	public AbstractProductDesktop desktopSendNotification() {
		return new ProductSMSDesktop();
	}
}
