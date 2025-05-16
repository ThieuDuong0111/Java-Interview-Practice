package interview.design_pattern.dependency_injection.interface_injection;

public class Main {

	public static void main(String[] args) {
		// Tạo đối tượng phụ thuộc bên ngoài
		INotificationService smsService = new SMSService();
		UserController userController1 = new UserController();
		userController1.injectNotificationService(smsService);
		userController1.send("Hello");

		// Tạo đối tượng phụ thuộc bên ngoài
		INotificationService emailService = new EmailService();
		UserController userController2 = new UserController();
		userController2.injectNotificationService(emailService);
		userController2.send("Hello");
	}
}
