package interview.design_pattern.abstractFactoryFurniture;

public class ProductWoodChair implements AbstractProductChair {

	@Override
	public void create() {
		System.out.println("Create Wood Chair");
	}
}
