package interview.design_pattern.dependency_injection.setter_injection;

public class UserController {
	private INotificationService notificationService;

	/*
	 * public UserController(INotificationService notificationService) {
	 * this.notificationService = notificationService; }
	 */

	// Setter Injection
	public void setMessageService(INotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public void send(String message) {
		notificationService.sendMessage(message);
	}
}
