package interview.design_pattern.abstractFactoryNotification;

public class ConcereteFactoryEmailFactory extends AbstractFactoryNotification {

	@Override
	public AbstractProductWeb webSendNotification() {
		return new ProductEmailWeb();
	}

	@Override
	public AbstractProductMobile mobileSendNotification() {
		return new ProductEmailMobile();
	}

	@Override
	public AbstractProductDesktop desktopSendNotification() {
		return new ProductEmailDesktop();
	}
}
