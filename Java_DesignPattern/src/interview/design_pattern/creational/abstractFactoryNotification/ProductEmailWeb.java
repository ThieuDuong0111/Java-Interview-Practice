package interview.design_pattern.creational.abstractFactoryNotification;

public class ProductEmailWeb implements AbstractProductWeb {

	@Override
	public void send() {
		System.out.println("Web Send Email Message");
	}

}
