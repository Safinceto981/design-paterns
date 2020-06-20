package assignment3;

public class PlovdivPayDesk extends PayDesk {

	public  PlovdivPayDesk(int level) {

		this.level=level;
	}
	@Override
	protected void handle(String message) {
		System.out.println("Plovdiv: " + message);

	}
	@Override
	protected void setState(State state) {
		// TODO Auto-generated method stub
		
	}

}
