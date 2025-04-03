package interview.design_pattern.factoryMethod;

public class Main {

	public static void main(String[] args) {
		Bank bank1 = BankFactory.getBank(BankType.TPBANK);
		System.out.println(bank1.getBankName());
		
		Bank bank2 = BankFactory.getBank(BankType.VIETCOMBANK);
		System.out.println(bank2.getBankName());
		
		Bank bank3 = BankFactory.getBank(BankType.TECHCOMBANK);
		System.out.println(bank3.getBankName());
	}
}
