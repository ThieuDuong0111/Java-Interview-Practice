package interview.design_pattern.creational.abstractFactoryFurniture;

public class ConcreteFactoryWoodFactory extends AbstractFactoryFurniture {

	@Override
	public AbstractProductChair createChair() {
		return new ProductWoodChair();
	}

	@Override
	public AbstractProductTable createTable() {
		return new ProductWoodTable();
	}
}
