package assignment2;

public abstract class User {
	protected MessageMediator mediator;
	protected String name;
	public User () {
		
	}

	public User(MessageMediator med, String name) {
		this.mediator = med;
		this.name = name;
	}

	public abstract void send(String msg, MessageMediator mediator2);

	public MessageMediator getMediator() {
		return mediator;
	}

	public void setMediator(MessageMediator mediator) {
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void receive(String msg,User user);

	
}
