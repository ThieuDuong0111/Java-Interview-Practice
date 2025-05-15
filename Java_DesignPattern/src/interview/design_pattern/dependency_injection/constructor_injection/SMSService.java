package interview.design_pattern.dependency_injection.constructor_injection;

public class SMSService implements INotificationService {

	@Override
	public void sendMessage(String msg) {
		System.out.println("SMS send message: " + msg);

	}

}
