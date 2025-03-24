/*Dependency Inversion Principle*/

/*In the dependency inversion principle, high-level modules 
 * should not depend on low-level modules. In other words, 
 * you must follow abstraction and ensure loose coupling
*/
//interface Notification {
//	void notify();
//}
//
//class EmailNotification implements Notification {
//	public void notify() {
//		System.out.println("Sending notification via email");
//	}
//}
//
//class Employee {
//	private EmailNotification emailNotification;
//
//	public Employee(EmailNotification emailNotification) {
//		this.emailNotification = emailNotification;
//	}
//
//	public void notifyUser() {
//		emailNotification.notify();
//	}
//}
