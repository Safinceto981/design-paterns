package visitor;

public class Book implements Product {

	private String isbnNumber;
	private int price;
	public Book(String isbnNumber,int price) {
		this.isbnNumber=isbnNumber;
		this.price=price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	
	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}


	public int getPrice() {
		return price;
	}

	
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		
		return visitor.visit(this);
	}

}
