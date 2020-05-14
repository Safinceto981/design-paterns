package abstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		//Color types can be defined in a seperate file
		if(color.equals("BLUE")) {
			return new Blue();
		}
		if(color.equals("RED")) {
			return new Red();
		}
		System.out.println("Unknown color type");
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// Color factory doesn have getShape implementation
		return null;
	}

}
