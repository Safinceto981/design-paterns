package assignment2;

public class ChatUser extends User {
	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);

	}

	@Override
	public void receive(String message,User user) {
		System.out.println(this.getName() + " receives:" + message+" by "+user.getName());
		 
	}

	@Override
	public void send(String msg, MessageMediator mediator) {
		System.out.println(this.getName() + " sends: " + msg);
		 mediator.sendMessage(msg, this);
		 if(msg=="getBot") {
			 User bot1=new Bot(mediator, msg);
			 super.mediator.addUser(bot1);
		 }
		

	}

	
}
