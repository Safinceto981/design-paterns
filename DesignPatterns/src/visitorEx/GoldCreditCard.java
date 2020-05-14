package visitorEx;

import visitorEx.order.OfferVisitor;

public class GoldCreditCard implements CreditCard {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "gold";
	}

	@Override
	public void accept(OfferVisitor v) {
		v.visitGoldCreditCard(this);
	}

}
