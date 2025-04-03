package interview.design_pattern.abstractFactoryNotification;

public class ProductSMSWeb implements AbstractProductWeb {

	@Override
	public void send() {
		System.out.println("Web Send SMS Message");
	}

}
