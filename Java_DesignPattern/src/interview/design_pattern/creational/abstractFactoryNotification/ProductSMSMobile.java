package interview.design_pattern.creational.abstractFactoryNotification;

public class ProductSMSMobile implements AbstractProductMobile {

	@Override
	public void send() {
		System.out.println("Mobile Send SMS Message");
	}

}
