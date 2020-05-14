package visitor;

public class PriceCalculator implements ShoppingCartVisitor {

	

	@Override
	public int visit(Book book) {
		int price =book.getPrice();
		if(price>50) {
			price=price-5;
		}
		System.out.println("Book : "+book.getIsbnNumber()+ " coasts "+price);
		
		return price;
	}

	@Override
	public int visit(Fruit fruit) {
		int price=fruit.getPricePerKg()*fruit.getWeight();
		System.out.println("Fruit: "+fruit.getName()+" cost "+price);
		return price;
	}

}
