package visitorEx.order;

import visitorEx.BronzeCreditCard;
import visitorEx.GoldCreditCard;
import visitorEx.SilverCreditCard;

public interface OfferVisitor {

	void visitBronzeCreditCard(BronzeCreditCard bronze);
	void visitSilverCreditCard(SilverCreditCard silver);
	void visitGoldCreditCard(GoldCreditCard gold);
	
}
