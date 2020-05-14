package visitor;

public class VisitorMain {

	public static void main(String[] args) {

		Product apple = new Fruit("Apple", 3, 3);
		Product book = new Book("23t337e62", 70);

		ShoppingCartVisitor priceCalculator = new PriceCalculator();
		int priceforApple = apple.accept(priceCalculator);
		int priceForBook = book.accept(priceCalculator);
		
	}

}
