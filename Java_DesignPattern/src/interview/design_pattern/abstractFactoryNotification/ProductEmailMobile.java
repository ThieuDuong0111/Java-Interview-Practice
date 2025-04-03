package interview.design_pattern.abstractFactoryNotification;

public class ProductEmailMobile implements AbstractProductMobile {

	@Override
	public void send() {
		System.out.println("Mobile Send Email Message");
	}

}
