package assignment2;

public class ChatRoom {
	public static void main(String[] args) {
		MessageMediator mediator = new ChatMessageMediator();
		
		User user1 = new ChatUser(mediator, "Peter");
		User user2 = new ChatUser(mediator, "Ivan");
		User user3 = new ChatUser(mediator, "Georgi");
		//User bot1=Bot.getInstance();
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		//mediator.addUser(bot1);

		user1.send("cat", mediator);
		user1.send("getBot", mediator);
		user1.send("cat", mediator);
		user2.send("getBot", mediator);
	
//		user1.send("Hi again", mediator);
		user2.send("hi",mediator);
	}
}
