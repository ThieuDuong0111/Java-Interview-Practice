package interview.design_pattern.creational.abstractFactoryFurniture;

public class ProductPlasticTable implements AbstractProductTable {

	@Override
	public void create() {
		System.out.println("Create Plastic Table");
	}
}
