package assignment1;

import assignment1.Command;

public class LieDownCommand implements Command {

	private Sportsman sportsman;
	
	public  LieDownCommand(Sportsman sportsman) {
		this.sportsman=sportsman;
	}
	@Override
	public void execute() {
		this.sportsman.lieDown();

	}

}
