package visitorEx;

import visitorEx.order.GasOfferVisitor;
import visitorEx.order.HotelOfferVisitor;

public class VisitorMain {
	public static void main(String[] args) {

		var visitor=new HotelOfferVisitor();
		var visitor1=new GasOfferVisitor();
		
		var bronze=new BronzeCreditCard();
		var silver=new SilverCreditCard();
		var gold=new GoldCreditCard();
		
		bronze.accept(visitor);
		silver.accept(visitor1);
		gold.accept(visitor1);
	}
}
