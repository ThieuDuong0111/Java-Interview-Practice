package interview.design_pattern.dependency_injection.interface_injection;

public class UserController implements IInjectNotificationService {
	private INotificationService notificationService;

	public void send(String message) {
		notificationService.sendMessage(message);
	}

	@Override
	public void injectNotificationService(INotificationService notificationService) {
		this.notificationService = notificationService;
	}
}
