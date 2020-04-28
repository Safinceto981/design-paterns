package command;

public class Lights {

	private Boolean lightsOn;
	public void switchOn() {
		System.out.println("lights are on");
		this.lightsOn=true;
	}
	public void switchOff() {
		System.out.println("lights are off");
		this.lightsOn=false;
	}
	
}
