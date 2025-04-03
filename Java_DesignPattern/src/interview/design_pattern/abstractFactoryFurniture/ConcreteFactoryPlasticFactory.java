package interview.design_pattern.abstractFactoryFurniture;

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
