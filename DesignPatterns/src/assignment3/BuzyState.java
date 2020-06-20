package assignment3;

public class BuzyState implements State {

	private String name="buzy";
	@Override
	public String getStateName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	

	@Override
	public void resetState(Observable observable) {
		FreeState freeState=new FreeState();
		observable.setState(freeState);
	}

	@Override
	public void applyState(PayDesk payDesk) {
		payDesk.setState(this);
		
	}

}
