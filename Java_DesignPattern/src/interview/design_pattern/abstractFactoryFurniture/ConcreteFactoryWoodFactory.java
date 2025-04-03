package interview.design_pattern.abstractFactoryFurniture;

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
