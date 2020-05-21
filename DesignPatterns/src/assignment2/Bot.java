package assignment2;

public class Bot extends User {

	private static Bot instance;

	private Bot() {
	}

	public static Bot getInstance() {
		if (instance == null) {
			instance = new Bot();
			System.out.println("Created instance");
		}
		return instance;
	}

	public Bot(MessageMediator med, String name) {
		super(med, name);
		getInstance();
	}

	@Override
	public void send(String msg, MessageMediator mediator) {
		System.out.println(this.getName() + " sends: " + msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg, User user) {

		if (msg == "cat") {

			super.mediator.removeUser(user);
			send("The word 'cat'is forbidden", super.mediator);
		}
	}

}
