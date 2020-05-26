package assignment2;

public class Chat extends Messages {

	Messages mediator;

	@Override
	protected void sendMessage(String msg, User sender) {
		if (msg.equals("addBot")) {
			Bot bot = new Bot("Bot");
			addUser(bot);

		}

		for (var u : this.userList) {

			// message should not be received by the user sending it
			if (u != sender) {
				u.receive(msg, sender);
			}
			if (u instanceof Bot) {
				if (msg.equalsIgnoreCase("cat")) {

					this.userList.remove(sender);
					sendMessage("Cat is not allowed", sender);

					System.out.println(userList.size());
				}

			}
		}
	}

	@Override
	protected void addUser(User user) {
		this.userList.add(user);

	}

	@Override
	protected void removeUser(User user) {
		this.userList.remove(user);
	}

}
