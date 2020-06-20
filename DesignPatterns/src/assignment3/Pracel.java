package assignment3;

public interface Pracel {

	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
	public Object getUpdate(Observer obj);
}
