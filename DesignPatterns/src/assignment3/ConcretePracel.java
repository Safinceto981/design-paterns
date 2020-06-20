package assignment3;

import java.util.ArrayList;
import java.util.List;

public class ConcretePracel implements Pracel {

	CollectorObs collectorObs=new CollectorObs("Ivan");
	private List<Observer> observes;
	private String message;
	private boolean changed;

	public ConcretePracel() {
		this.observes = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer observer) {
		observes.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observes.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer obj : observes) {
			getUpdate(obj);
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		// TODO Auto-generated method stub
		return this.message;
	}
	public void postMessage(String msg) {
		System.out.println("Message Posted to pracel holder:"+msg);
		this.message=msg;
		this.changed=true;
		notifyObservers();
	}

}
