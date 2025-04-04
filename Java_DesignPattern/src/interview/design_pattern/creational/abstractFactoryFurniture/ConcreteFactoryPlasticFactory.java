package interview.design_pattern.creational.abstractFactoryFurniture;

public class ConcreteFactoryPlasticFactory extends AbstractFactoryFurniture {

	@Override
	public AbstractProductChair createChair() {
		return new ProductPlasticChair();
	}

	@Override
	public AbstractProductTable createTable() {
		return new ProductPlasticTable();
	}
}
