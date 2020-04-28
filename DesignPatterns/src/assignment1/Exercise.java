package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Exercise implements Observable {

	private List<Viewer> viewers = new ArrayList<Viewer>();
	private String name;

	@Override
	public void notifyViewers() {
		for (Viewer viewer : this.viewers) {
			viewer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.name;
	}

	@Override
	public void subscribe(Viewer viewer) {

		this.viewers.add(viewer);
		viewer.setExercise(this);
	}

	@Override
	public void unsubscribe(Viewer viewer) {
		this.viewers.remove(viewer);

	}

	public void setNewExercise(String name) {
		this.name = name;
		this.notifyViewers();
	}

}
