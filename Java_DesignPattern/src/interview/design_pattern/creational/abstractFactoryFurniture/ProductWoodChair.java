package interview.design_pattern.creational.abstractFactoryFurniture;

public class ProductWoodChair implements AbstractProductChair {

	@Override
	public void create() {
		System.out.println("Create Wood Chair");
	}
}
