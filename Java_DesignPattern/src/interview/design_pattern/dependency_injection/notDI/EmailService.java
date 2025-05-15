package interview.design_pattern.dependency_injection.notDI;

public class EmailService {
	public void sendEmail(String message) {
		System.out.println("Message: " + message);
	}
}
