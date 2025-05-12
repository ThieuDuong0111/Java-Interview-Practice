package interview.design_pattern.microservices.saga_pattern;

public class InventoryService {
    public boolean reserveStock(String orderId) {
        System.out.println("Stock reserved for order: " + orderId);
        return true;
    }

    public void releaseStock(String orderId) {
        System.out.println("Stock released for order: " + orderId);
    }
}
