package assignment1;

public class Sportsman {

	private Boolean getUp;
	private Boolean lieDown;

	public void getUp() {
		System.out.println("sportsman got up");

		this.getUp = true;
		this.lieDown = false;

	}
	public void lieDown() {
		System.out.println("sportsman lay down");
		this.lieDown=true;
		this.getUp=false;
	}
}
