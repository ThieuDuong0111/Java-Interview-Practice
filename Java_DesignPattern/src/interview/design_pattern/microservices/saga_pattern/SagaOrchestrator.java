package interview.design_pattern.microservices.saga_pattern;

//✅ Ghi chú:
//Đây là Orchestration Saga vì SagaOrchestrator là trung tâm điều khiển.
//
//Trong thực tế, bạn có thể triển khai Saga qua Kafka hoặc Event Bus (Choreography).
//
//Có thể dùng frameworks như Axon, Eventuate Tram, Camunda để hỗ trợ orchestration Saga phức tạp hơn.

public class SagaOrchestrator {
	private OrderService orderService = new OrderService();
	private InventoryService inventoryService = new InventoryService();
	private PaymentService paymentService = new PaymentService();

	public void executeSaga(String orderId) {
		try {
			// Step 1: Create Order
			if (!orderService.createOrder(orderId))
				throw new RuntimeException("Order creation failed");

			// Step 2: Reserve Stock
			if (!inventoryService.reserveStock(orderId)) {
				orderService.cancelOrder(orderId);
				throw new RuntimeException("Stock reservation failed");
			}

			// Step 3: Make Payment
			if (!paymentService.makePayment(orderId)) {
				inventoryService.releaseStock(orderId);
				orderService.cancelOrder(orderId);
				throw new RuntimeException("Payment failed");
			}

			System.out.println("Saga completed successfully!");

		} catch (Exception e) {
			System.out.println("Saga failed: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		new SagaOrchestrator().executeSaga("ORDER123");
	}
}
