package interview.design_pattern.builderProduct;

public class Main {

	public static void main(String[] args) {
		Product product = new Product.Builder("Milk", 15.0).description("Fresh Milk").category("Dairy")
				.expirationDate("2025-05-01").build();

		System.out.println(product);

	}

}
