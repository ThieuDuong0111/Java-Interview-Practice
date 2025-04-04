package interview.design_pattern.creational.abstractFactoryNotification;

public class ProductEmailDesktop implements AbstractProductDesktop {

	@Override
	public void send() {
		System.out.println("Desktop Send Email Message");
	}

}
