package interview.design_pattern.dependency_injection.constructor_injection;

public class UserController {
	private INotificationService notificationService;

	public UserController(INotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public void send(String message) {
		notificationService.sendMessage(message);
	}
}
