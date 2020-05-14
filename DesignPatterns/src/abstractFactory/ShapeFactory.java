package abstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// Shape factory doesnt have getColor impl
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// Shape types can be defined in a separate file
		if (shape.equals("RECTANGLE")) {
			return new Rectangle();
		}
		if (shape.equals("CIRCLE")) {
			return new Circle();
		}
		System.out.println("Unknown shape type");
		return null;
	}

}
