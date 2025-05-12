package interview.design_pattern.microservices.saga_pattern;

public class OrderService {
	public boolean createOrder(String orderId) {
		System.out.println("Order created: " + orderId);
		return true;
	}

	public void cancelOrder(String orderId) {
		System.out.println("Order cancelled: " + orderId);
	}
}
