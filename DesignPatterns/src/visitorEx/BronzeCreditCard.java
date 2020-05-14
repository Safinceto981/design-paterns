package visitorEx;

import visitorEx.order.OfferVisitor;

public class BronzeCreditCard implements CreditCard {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Bronze";
	}

	@Override
	public void accept(OfferVisitor v) {
		v.visitBronzeCreditCard(this);
	}

}
