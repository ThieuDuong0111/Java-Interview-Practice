package interview.design_pattern.creational.abstractFactoryFurniture;

public class ProductPlasticChair implements AbstractProductChair {

	@Override
	public void create() {
		System.out.println("Create Plastic Chair");
	}
}
