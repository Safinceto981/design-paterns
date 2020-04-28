package observer;

public interface Observable {

	public void notifyObservers();
	public String getUpdate();
	public void subscribe(Observer observer);
	public void unsubscribe(Observer observer);

}
