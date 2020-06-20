package assignment3;

public class BulgariaPayDesk extends PayDesk {

	public BulgariaPayDesk(int level) {

		this.level = level;
	}

	@Override
	protected void handle(String message) {
		System.out.println("Bulgaria: " + message);

	}

	@Override
	protected void setState(State state) {
		state.applyState(this);
		
	}

}
