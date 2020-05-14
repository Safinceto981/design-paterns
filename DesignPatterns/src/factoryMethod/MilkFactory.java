package factoryMethod;

public class MilkFactory extends FarmFactory {

	@Override
	public FarmProduct createProduct(String name) {
		FarmProduct product = null;

		if (name.equals("COW_MILK")) {
			product = new CowMilk();
			product.setPrice(1.7);

		}
		if (name.equals("GOAT_MILK")) {
			product = new GoatMilk();
			product.setPrice(2.7);

		}
		return product;

	}
}
