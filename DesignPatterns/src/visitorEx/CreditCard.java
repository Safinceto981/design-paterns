package visitorEx;

import visitorEx.order.OfferVisitor;

public interface CreditCard {

	String getName();

	void accept(OfferVisitor v);
}
