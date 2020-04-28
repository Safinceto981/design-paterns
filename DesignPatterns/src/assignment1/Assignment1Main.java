package assignment1;


public class Assignment1Main {

	public static void main(String[] args) {
	Trainer trainer=new Trainer();
	Sportsman sportsman=new Sportsman();
	Exercise exercise=new Exercise();
	Viewer v1=new ExerciseSubscriber("viewer 1");
	Viewer v2=new ExerciseSubscriber("viewer2");
	Viewer v3=new ExerciseSubscriber("viewer3");
	exercise.subscribe(v1);
	exercise.subscribe(v2);
	exercise.subscribe(v3);
	
	Command getUpCommand = new GetUpCommand(sportsman);
	Command lieDownCommand=new LieDownCommand(sportsman);
	
	trainer.setCommand(getUpCommand);
	trainer.showLive();
	exercise.setNewExercise("getUp");
	
	trainer.setCommand(lieDownCommand);
	trainer.showLive();
	exercise.setNewExercise("lieDown");
	

	}

}
