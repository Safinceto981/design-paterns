package abstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory) {
		if (factory.equals("SHAPE")) {
			return new ShapeFactory();
		}
		if (factory.equals("COLOR")) {
			return new ColorFactory();

		}
		System.out.println("Unknown factory type");
		return null;
	}
}
