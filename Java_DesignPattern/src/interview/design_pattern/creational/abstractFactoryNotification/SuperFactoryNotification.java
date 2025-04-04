package interview.design_pattern.creational.abstractFactoryNotification;

public class SuperFactoryNotification {
	private SuperFactoryNotification() {

	}

	// Returns a concrete factory object that is an instance of the
	// concrete factory class appropriate for the given architecture.
	public static AbstractFactoryNotification getNofication(NotificationType notificationType) {
		switch (notificationType) {
		case EMAIL:
			return new ConcereteFactoryEmailFactory();
		case SMS:
			return new ConcereteFactorySMSFactory();
		default:
			throw new UnsupportedOperationException("This notification is unsupported ");
		}
	}
}
