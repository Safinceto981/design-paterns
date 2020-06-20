package assignment3;

public class FreeState implements State {

	private String name="free";
	@Override
	public String getStateName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public void applyState(PayDesk payDesk) {
		payDesk.setState(this);
		
	}
	@Override
	public void resetState(Observable observable) {
		// TODO Auto-generated method stub
		
	}

}
