package assignment2;

public class ChatUser extends User {
	public ChatUser(String name) {
		this.name = name;
	}

	@Override
	public void receive(String message, User user) {
		System.out.println(name + " received:" + message );

	}

}
