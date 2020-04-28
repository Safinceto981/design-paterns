package assignment1;

public interface Observable {

	public void notifyViewers();
	public String getUpdate();
	public void subscribe(Viewer viewer);
	public void unsubscribe(Viewer viewer);
}
