package visitorEx.order;

import visitorEx.BronzeCreditCard;
import visitorEx.GoldCreditCard;
import visitorEx.SilverCreditCard;

public class HotelOfferVisitor implements OfferVisitor {

	@Override
	public void visitBronzeCreditCard(BronzeCreditCard bronze) {
		System.out.println("We are computing the cashback for a bronze card buying hotel");

	}

	@Override
	public void visitSilverCreditCard(SilverCreditCard silver) {
		System.out.println("We are computing the cashback for a silver card buying hotel");

	}

	@Override
	public void visitGoldCreditCard(GoldCreditCard gold) {
		System.out.println("We are computing the cashback for a gold card buying hotel");

	}

}
