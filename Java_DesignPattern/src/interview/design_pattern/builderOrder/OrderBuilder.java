package interview.design_pattern.builderOrder;

public interface OrderBuilder {
	OrderBuilder orderType(OrderType orderType);

	OrderBuilder orderBread(BreadType breadType);

	OrderBuilder orderSauce(SauceType sauceType);

	OrderBuilder orderVegetable(VegetableType vegetableType);

	Order build();
}
