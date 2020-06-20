package assignment3;

public class EuropePayDesk extends PayDesk {
	public EuropePayDesk(int level) {
		this.level = level;
	}

	@Override
	protected void handle(String message) {
		System.out.println("Europe: " + message);

	}

	@Override
	protected void setState(State state) {
		state.applyState(this);
		
	}

}
