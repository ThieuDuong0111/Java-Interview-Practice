package interview.design_pattern.structural.adapter;

public class NewNotificationService implements NotificationSender {
	@Override
	public void send(String message) {
		System.out.println("Sending notification via New Service: " + message);
	}
}
