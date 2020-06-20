package assignment3;



public interface State {
	public String getStateName();
	public void applyState(PayDesk payDesk);
	
	public void resetState(Observable observable);
}
