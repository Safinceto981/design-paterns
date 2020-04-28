package command;

public class RemoteController {

	private Command command;

	
	public Command getCommand() {
		return command;
	}

	
	public void setCommand(Command command) {
		this.command = command;
	}
	public void pressBtn() {
		this.command.execute();
	}
	
}
