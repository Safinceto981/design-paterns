package assignment2;

public class ChatMain {
	public static void main(String[] args) {
		ChatFactory factory = new ChatFactory();
		User ivan = factory.getUser("User", "Ivan");
		User georgi = factory.getUser("User", "Georgi");
		User petkan = factory.getUser("User", "Petkan");

		Chat chat = new Chat();
		ivan.add(chat);
		georgi.add(chat);
		petkan.add(chat);

		ivan.send("Hello", chat);
		ivan.send("addBot", chat);
		ivan.send("cat", chat);
		georgi.send("hi", chat);

	}
}
