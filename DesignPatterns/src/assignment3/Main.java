package assignment3;

public class Main {

	public static void main(String[] args) {
		Observer obs = new CollectorObs("Ivan");
		
		ConcretePracel pracel = new ConcretePracel();

		pracel.addObserver(obs);
		PayDesk desk=getChain();
		desk.takeOrder(pracel,3, "for Europe");
		
		
		//pracel.addObserver(obs);
		obs.setPracel(pracel);
		
		
		pracel.postMessage("done");
	}

	private static PayDesk getChain() {
		
		PayDesk plovdivPayDesk=new PlovdivPayDesk(PayDesk.Plovdiv);
		
		PayDesk bulgariaPayDesk=new BulgariaPayDesk(PayDesk.Bulgaria);
		PayDesk europePayDesk=new EuropePayDesk(PayDesk.Europe);
		plovdivPayDesk.setNextDesk(bulgariaPayDesk);
		bulgariaPayDesk.setNextDesk(europePayDesk);
		
		return plovdivPayDesk;
	}
}
