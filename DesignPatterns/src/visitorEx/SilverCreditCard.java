package visitorEx;

import visitorEx.order.OfferVisitor;

public class SilverCreditCard implements CreditCard {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(OfferVisitor v) {
		v.visitSilverCreditCard(this);
	}

}
