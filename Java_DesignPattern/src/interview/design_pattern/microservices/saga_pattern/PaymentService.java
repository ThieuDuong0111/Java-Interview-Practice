package interview.design_pattern.microservices.saga_pattern;

public class PaymentService {
	public boolean makePayment(String orderId) {
		System.out.println("Payment successful for order: " + orderId);
		// Giả sử thanh toán lỗi
		return false;
	}

	public void refund(String orderId) {
		System.out.println("Payment refunded for order: " + orderId);
	}
}
