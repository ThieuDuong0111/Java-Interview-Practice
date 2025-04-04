package interview.design_pattern.structural.adapter;

public class Main {
	public static void main(String[] args) {
		NotificationSender newService = new NewNotificationService();
		newService.send("Hello via New Notification Service!");

		OldNotificationService oldService = new OldNotificationService();
		NotificationSender adapter = new OldNotificationAdapter(oldService);
		adapter.send("Hello via Old Notification Service (using Adapter)!");
	}
}
