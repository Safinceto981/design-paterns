package abstractFactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {

		AbstractFactory shapeFactory =FactoryProducer.getFactory("SHAPE");
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();

		AbstractFactory colorFactory =  FactoryProducer.getFactory("COLOR");
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
	}

}
