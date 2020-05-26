package assignment2;

public class ChatFactory {
	public User getUser(String type, String name) {
		if (type.equalsIgnoreCase("Bot")) {
			return new Bot("Bot");

		} 
		return new ChatUser(name);

	}
}
