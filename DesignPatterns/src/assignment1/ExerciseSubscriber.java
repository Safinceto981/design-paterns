package assignment1;

public class ExerciseSubscriber implements Viewer {

	private String name;
	private Observable exercise;

	public ExerciseSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {

		if (exercise == null) {
			System.out.println(this.name + "has no exercise set");
		}
		String latestExercise = this.exercise.getUpdate();
		System.out.println(this.name + " got update for exercise " + latestExercise);
	}

	@Override
	public void setExercise(Observable exercise) {
		this.exercise = exercise;
	}

}
