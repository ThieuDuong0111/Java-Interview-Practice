package interview.design_pattern.structural.adapter;

public class OldNotificationService {
	public void sendOldNotification(String message) {
		System.out.println("Sending notification via Old Service: " + message);
	}
}
