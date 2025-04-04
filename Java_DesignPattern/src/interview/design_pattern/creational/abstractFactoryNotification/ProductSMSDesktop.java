package interview.design_pattern.creational.abstractFactoryNotification;

public class ProductSMSDesktop implements AbstractProductDesktop {

	@Override
	public void send() {
		System.out.println("Desktop Send SMS Message");
	}

}
