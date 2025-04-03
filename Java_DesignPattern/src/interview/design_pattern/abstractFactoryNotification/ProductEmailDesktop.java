package interview.design_pattern.abstractFactoryNotification;

public class ProductEmailDesktop implements AbstractProductDesktop {

	@Override
	public void send() {
		System.out.println("Desktop Send Email Message");
	}

}
