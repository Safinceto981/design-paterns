package observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Observable {

	private List<Observer> observers = new ArrayList<Observer>();
	private String name;

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setTopic(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.name;
	}

	public void setNewTopic(String name) {
		this.name = name;
		this.notifyObservers();
	}

}
