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

	public Bot(String name) {
		this.name = name;
		getInstance();
	}

	@Override
	public void receive(String msg, User user) {

		System.out.println(name + " received:" + msg);
		if (msg == "cat") {
			System.out.println(user.name);

		}
	}

}
