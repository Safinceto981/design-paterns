package factoryMethod;

public class FactoryMethodMain {

	public static void main(String[] args) {

		CheeseFactory cheeseFactory = new CheeseFactory();
		FarmProduct cowCheese = cheeseFactory.produceProduct("COW_CHEESE");

		MilkFactory milkFactory = new MilkFactory();
		FarmProduct goatMilk = milkFactory.produceProduct("GOAT_MILK");

	}

}
