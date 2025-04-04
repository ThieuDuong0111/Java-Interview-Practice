package interview.design_pattern.creational.builderProduct;

public class Product {
	private final String name;
	private final String description;
	private final double price;
	private final String category;
	private final String expirationDate;

	private Product(Builder builder) {
		this.name = builder.name;
		this.description = builder.description;
		this.price = builder.price;
		this.category = builder.category;
		this.expirationDate = builder.expirationDate;
	}

	public static class Builder {

		private final String name;
		private final double price;
		private String description = "";
		private String category = "";
		private String expirationDate = "";

		public Builder(String name, double price) { // Required fields
			this.name = name;
			this.price = price;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder category(String category) {
			this.category = category;
			return this;
		}

		public Builder expirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
			return this;
		}

		public Product build() {
			return new Product(this);
		}
	}

	@Override
	public String toString() {
		return "Product{name='" + name + "', description='" + description + "', price=" + price + ", category='"
				+ category + "', expirationDate='" + expirationDate + "'}";
	}
}
