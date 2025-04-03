package interview.design_pattern.abstractFactoryFurniture;

public class ProductWoodTable implements AbstractProductTable {

	@Override
	public void create() {
		System.out.println("Create Wood Table");
	}
}
