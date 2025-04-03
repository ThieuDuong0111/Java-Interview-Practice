package interview.design_pattern.abstractFactoryFurniture;

public class SuperFactoryFurnitureFactory {
	private SuperFactoryFurnitureFactory() {

	}

	// Returns a concrete factory object that is an instance of the
	// concrete factory class appropriate for the given architecture.
	public static AbstractFactoryFurniture getFactory(MaterialType materialType) {
		switch (materialType) {
		case PLASTIC:
			return new ConcreteFactoryPlasticFactory();
		case WOOD:
			return new ConcreteFactoryWoodFactory();
		default:
			throw new UnsupportedOperationException("This furniture is unsupported ");
		}
	}
}
