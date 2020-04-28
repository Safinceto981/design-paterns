package assignment1;

public class GetUpCommand implements Command{

	private Sportsman sportsman;
	public GetUpCommand(Sportsman sportsman) {
		this.sportsman=sportsman;
	}
	@Override
	public void execute() {
		this.sportsman.getUp();
		
	}
	
}
