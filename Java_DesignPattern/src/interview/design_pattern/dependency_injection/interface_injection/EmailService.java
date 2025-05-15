package interview.design_pattern.dependency_injection.interface_injection;

public class EmailService implements INotificationService {

	@Override
	public void sendMessage(String msg) {
		System.out.println("Email send message: " + msg);

	}
}
