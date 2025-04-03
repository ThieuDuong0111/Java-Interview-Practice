package interview.design_pattern.factoryMethod;

public class BankFactory {
	private BankFactory() {
	}

	public static final Bank getBank(BankType bankType) {
		switch (bankType) {

		case TPBANK:
			return new TPBank();

		case VIETCOMBANK:
			return new VietcomBank();
			
		case TECHCOMBANK:
			return new Techcombank();

		default:
			throw new IllegalArgumentException("This bank type is unsupported");
		}
	}
}
