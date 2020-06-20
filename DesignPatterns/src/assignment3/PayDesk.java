package assignment3;

public abstract class PayDesk {

	public static int Plovdiv = 1;
	public static int Bulgaria = 2;
	public static int Europe = 3;

	// protected List<Observer> observers = new ArrayList<Observer>();
	protected int level;
	protected PayDesk nextPayDesk;

	public void setNextDesk(PayDesk nextPayDesk) {
		this.nextPayDesk = nextPayDesk;

	}

	public void takeOrder(ConcretePracel pracel,int level, String message) {
		if (this.level <= level) {
			handle(message);
			
			pracel.notifyObservers();
		}
		if (nextPayDesk != null) {
			nextPayDesk.takeOrder(pracel,level, message);
		}
	}
	abstract protected void handle(String message);

	protected abstract void setState(State state);

	
}
