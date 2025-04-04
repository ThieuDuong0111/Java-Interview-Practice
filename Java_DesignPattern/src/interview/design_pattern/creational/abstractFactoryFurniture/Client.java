package interview.design_pattern.creational.abstractFactoryFurniture;

public class Client {

	public static void main(String[] args) {
		AbstractFactoryFurniture factoryCreatePlastic = SuperFactoryFurnitureFactory.getFactory(MaterialType.PLASTIC);

		AbstractProductChair plasticChair = factoryCreatePlastic.createChair();
		plasticChair.create(); // Create plastic chair

		AbstractProductTable plasticTable = factoryCreatePlastic.createTable();
		plasticTable.create(); // Create plastic table
		
		AbstractFactoryFurniture factoryCreateWood = SuperFactoryFurnitureFactory.getFactory(MaterialType.WOOD);

		AbstractProductChair woodChair = factoryCreateWood.createChair();
		woodChair.create(); // Create plastic chair

		AbstractProductTable woodTable = factoryCreateWood.createTable();
		woodTable.create(); // Create plastic table
	}
}
