package visitor;

public class Fruit implements Product {

	private String name;
	private int pricePerKg;
	private int weight;
	
	public Fruit(String name,int pricePerKg,int weight) {

		this.name=name;
		this.pricePerKg=pricePerKg;
		this.weight=weight;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	
	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
